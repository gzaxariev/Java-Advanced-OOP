package custam_annottation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String OUTPUT = "Type = %s, Description = %s";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        if ("Rank".equals(input)) {
            Class<RankType> rankTypeClass = RankType.class;
            if (rankTypeClass.isAnnotationPresent(CustamEnumAnnottation.class)) {
                CustamEnumAnnottation annotation = rankTypeClass.getAnnotation(CustamEnumAnnottation.class);
                System.out.println(String.format(OUTPUT, annotation.type(), annotation.description()));

            }
        } else if("Suit".equals(input)) {
            Class<SuitType> suitTypeClass = SuitType.class;
            if (suitTypeClass.isAnnotationPresent(CustamEnumAnnottation.class)) {
                CustamEnumAnnottation annotation = suitTypeClass.getAnnotation(CustamEnumAnnottation.class);
                System.out.println(String.format(OUTPUT, annotation.type(), annotation.description()));

            }
        }
    }
}
