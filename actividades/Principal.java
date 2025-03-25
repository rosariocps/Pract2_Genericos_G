package actividades;

public class Principal {
    public static void main(String[] args) {
        Bolsa < Chocolatina > bolsaCho = new Bolsa < Chocolatina > (3);
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);
        for (Chocolatina chocolatina: bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }

        Bolsa < Golosina > bolsagol = new Bolsa <Golosina>(5);
        Golosina g= new Golosina("chicle", 0.1);
        Golosina g1= new Golosina("caramelo", 0.2);
        bolsagol.add(g);
        bolsagol.add(g1);
        for (Golosina golosina: bolsagol) {
            System.out.println(golosina.getNombre()+"-"+ golosina.getPeso());
        }
    }
}
