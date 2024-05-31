package caja2;
import caja1.bicicleta;

public class codigoEjecutable {
    public static void main(String[] args) {
        bicicleta bici=new bicicleta(
                "tesla",
                10
        );
        bicicleta bicip=new bicicleta(
                "surly",
                30
        );

        System.out.println("la marca de la bici es "+ bicip.getMarca());
        System.out.println("la marca de la bici es "+ bici.getMarca());

        System.out.println("el tamaño de la bici "+bici.getMarca()+" es " + bici.getTamaño());
        System.out.println("el tamaño de la bici "+bicip.getMarca()+" es " + bicip.getTamaño());

    }

}
