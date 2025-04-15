package oving4;

public class Partner {

    private String name;
    private Partner partner;

    public Partner(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Partner getPartner() {
        return this.partner;
    }

    public void setPartner(Partner partner) {

        // Kan ikke være partner med seg selv.
        if (partner == this.partner) {
            return;
        }
        // Lager gammel partner.
        Partner oldPartner = this.partner;
        this.partner = partner;

        if (oldPartner != null && oldPartner.getPartner() == this) {
            oldPartner.setPartner(null);
        }

        if (this.partner != null) {
            this.partner.setPartner(this);
        }
    }

    @Override
    public String toString() {
        return String.format("[Partner %s is partner with %s]", this.name,
                partner != null ? partner.name : null);
    }
}
