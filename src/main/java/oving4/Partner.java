package oving4;

public class Partner {

    private String name;
    private Partner partner;

    public static void main(String[] args) {

        Partner Mia = new Partner("Mia");
        Partner Markus = new Partner("Markus");

        Mia.setPartner(Markus);

        System.out.println(Mia.getPartner());
    }

    @Override
    public String toString() {
        return String.format("[Partner %s is partner with %s]", this.name,
				partner != null ? partner.name : null);
	}

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

    public void setPartner(Partner partner){
        //Sjekker at man ikke kan være partner med seg selv.
        if(partner == this.partner){
            return;
        }
        
        Partner oldPartner = this.partner;
        this.partner = partner;

        if (this.partner != oldPartner) {
            
        }

    }
}
