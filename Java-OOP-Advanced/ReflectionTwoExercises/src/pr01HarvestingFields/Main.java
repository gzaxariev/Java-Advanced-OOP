package pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String line;
		Class richSoilLand = RichSoilLand.class;
		Field[] declaredFields = richSoilLand.getDeclaredFields();

		while (!"HARVEST".equals(line= reader.readLine())){

			commandsMethod(line, declaredFields);

		}

	}

	private static void commandsMethod(String line, Field[] declaredFields) {
		switch (line){
			case"private" :
				Arrays.stream(declaredFields)
						.filter(f -> Modifier.isPrivate(f.getModifiers()))
						.forEach(f -> System.out.println
								(String.format("%s %s %s", Modifier.toString(f.getModifiers()),
										f.getType().getSimpleName(),
										f.getName())));
				break;
			case"protected" :
				Arrays.stream(declaredFields)
						.filter(f -> Modifier.isProtected(f.getModifiers()))
						.forEach(f -> System.out.println
								(String.format("%s %s %s", Modifier.toString(f.getModifiers()),
										f.getType().getSimpleName(), f.getName())));
				break;
			case"public" :
				Arrays.stream(declaredFields)
						.filter(f -> Modifier.isPublic(f.getModifiers()))
						.forEach(f -> System.out.println
								(String.format("%s %s %s", Modifier.toString(f.getModifiers()),
										f.getType().getSimpleName(), f.getName())));
				break;
			case"all" :
				Arrays.stream(declaredFields)
						.forEach(f -> System.out.println
								(String.format("%s %s %s", Modifier.toString(f.getModifiers()),
										f.getType().getSimpleName(), f.getName())));
				break;

		}
	}
}
