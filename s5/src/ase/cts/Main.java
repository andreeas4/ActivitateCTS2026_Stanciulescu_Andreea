package ase.cts;

import ase.cts.builder.Internare;
import ase.cts.builder.InternareBuilder;
import ase.cts.builder.InternareBuilderV2;

public class Main {
    public static void main(String[] args) {
        Internare internare=new Internare(true,true,false,false,"Mihai Popescu");
        Internare internare2=new Internare(false,false,false,false,"Ana Maria Zamfir");

        System.out.println(internare);
        System.out.println(internare2);
        //facem alt builder
        InternareBuilder builder=new InternareBuilder("Anastasia Gabriela");
        Internare internare3= builder.build();

        System.out.println(internare3);

        InternareBuilder builder2=new InternareBuilder("Anastasia Gabriela");
        Internare internare4= builder2.setNume("Andrei pop").setPat(true).setMicDejun(true).build();

        System.out.println(internare4);
        //refolosim builderul si am folosit numele in metoda build nu in constructor
        InternareBuilderV2 builderV2=new InternareBuilderV2();
        Internare internare101V2=builderV2.build("Ion Stefanescu");
        Internare internare102V2=builderV2.build("Mariana Galusca");
        

        System.out.println(internare101V2);
        System.out.println(internare102V2);



    }
}
