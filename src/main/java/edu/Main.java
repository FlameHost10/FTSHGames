package edu;

import edu.project1.Project1;
import edu.project2.Maze;
import edu.project2.Solver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String s = "аэропОрты, им. п. мн. ч. сущ. аэропОрт\nбАнты, им. п. мн. ч. сущ. бант\nбОроду, вин. п. ед. ч. сущ. бородА\nбухгАлтеров, род. п. мн. ч. сущ. бухгАлтер\nвероисповЕдание1\nводопровОд\nгазопровОд\nграждАнство\nдефИс\nдешевИзна\nдиспансЕр\nдоговорЁнность\nдокумЕнт\nдосУг\nеретИк\nжалюзИ\nзнАчимость\nИксы, им. п. мн. ч. сущ. икс\nкаталОг\nквартАл (во всех значениях)\nкиломЕтр\nкОнусов, род. п. мн. ч. сущ. кОнус\nкорЫсть\nкрАны, им. п. мн. ч. сущ. кран\nкремЕнь; кремнЯ, род. п. ед. ч.\nлЕкторов, род. п. мн. ч. сущ. лЕктор\nлОктя, род. п. ед. ч. сущ. лОкоть; локтЕй, род. п. мн. ч.\nлыжнЯ\nмЕстностей, род. п. мн. ч. сущ. мЕстность\nнамЕрение\nнарОст\nнЕдруг";
        for(char elem: s.toCharArray()) {
            if (Character.isLetter(elem)){
                System.out.print(Character.toLowerCase(elem));
            }
            else{
                System.out.print(elem);
            }
        }
    }
}
