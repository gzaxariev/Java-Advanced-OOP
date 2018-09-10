package reflection_web;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Arrays.stream(Reflection.class.getDeclaredFields())
                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f -> System.out.println
                        (String.format("%s must be private!", f.getName())));

        Arrays.stream(Reflection.class.getDeclaredMethods())
                .filter(m->m.getName().startsWith("get"))
                .filter(m -> !Modifier.isPublic(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m-> System.out.println
                        (String.format("%s have to be public!", m.getName())));

        Arrays.stream(Reflection.class.getDeclaredMethods())
                .filter(m -> m.getName().startsWith("set"))
                .filter(m -> !Modifier.isPrivate(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(m -> System.out.println
                        (String.format("%s have to be private!", m.getName())));

    }
}
