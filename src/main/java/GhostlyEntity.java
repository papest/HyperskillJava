class GhostlyEntity {

    protected String name;

    GhostlyEntity(String name) {
        this.name = name;
    }

    String haunt() {
        return name + " haunts!";
    }

}

class Vampire extends GhostlyEntity {
    Vampire(String name) {
        super(name);
    }

    String suckBlood() {
        return name + " sucks blood!";
    }

    public static void main(String[] args) {
        GhostlyEntity spookyCreature = new Vampire("Dracula");
        System.out.println(spookyCreature.haunt());
    }
}


