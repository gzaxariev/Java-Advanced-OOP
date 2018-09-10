package pr02PrivateClassFiddling;

import pr02PrivateClassFiddling.com.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Class blackBoxClass = BlackBoxInt.class;

		Constructor declaredConstructor = blackBoxClass.getDeclaredConstructor();
		declaredConstructor.setAccessible(true);

		BlackBoxInt blackBoxInt = (BlackBoxInt) declaredConstructor.newInstance();

		String line;

		while (!"END".equals(line=reader.readLine())){

			String[] tokens = line.split("_");
			String nameByMethod = tokens[0];
			int valueByMethod = Integer.parseInt(tokens[1]);

			Method getDeclaredMethod = blackBoxInt.getClass().getDeclaredMethod(nameByMethod, int.class);
			getDeclaredMethod.setAccessible(true);
			getDeclaredMethod.invoke(blackBoxInt, valueByMethod);

			Field field = blackBoxInt.getClass().getDeclaredField("innerValue");
			field.setAccessible(true);
			System.out.println(field.get(blackBoxInt));



		}

	}
}
