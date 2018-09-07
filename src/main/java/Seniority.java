public enum Seniority {

    JUNIOR(100),
    SEMISENIOR(200),
    SENIOR(300);

    //Atributo de cada elemento de una anumeracion
    private final int points;

    //Constructor de cada elemento de la enumeracion
    Seniority(int points){
        this.points = points;
    }

    public int getPoints(){
        return points;
    }

}
