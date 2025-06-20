package oving4.testing;

public class Partner {
    private final String name;
    private Partner partner;

    public Partner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Partner getPartner() {
        return this.partner;
    }

    public void setPartner(Partner partner){
        if (this.partner == partner) {
            return;
        }

        if (this.partner != null) {
            Partner oldPartner = this.partner;
            this.partner = null;
            oldPartner.setPartner(null);
        }
        if (partner != null && partner.getPartner() != this) {
            partner.setPartner(this);
        }
            this.partner = partner;
        }

    @Override
    public String toString() {
        return "Partner [name=" + name + ", partner=" + partner + "]";
    }

    public static void main(String[] args) {
        Partner p1 = new Partner("Mia");
        Partner p2 = new Partner("Markus");

        p1.setPartner(p2);
        System.out.println(p1.getPartner());
    }
    
}
