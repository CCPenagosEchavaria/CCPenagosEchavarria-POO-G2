public class familia {
    persona juan;
    persona alberto;
    persona ana;
    persona mamá;
    public familia(int edjuan){
        int edalberto = (2 * edjuan) / 3;
        int edana = (4 * edjuan) / 3;
        int edmamá = edjuan + edalberto + edana;
        juan = new persona("Juan", edjuan);
        alberto = new persona("Alberto", edalberto);
        ana = new persona("Ana", edana);
        mamá = new persona("Mama", edmamá);
    }
    public void edades() {
        System.out.println("Las edades son: ");
        System.out.println("Juan tiene " + juan.getedad() + "años");
        System.out.println("Alberto tiene " + alberto.getedad() + "años");
        System.out.println("ANA tiene " + ana.getedad() + "años");
        System.out.println("MAMA tiene " + mamá.getedad() + "años");
    }
}
