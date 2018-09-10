package app.factories;

import app.waste_disposal.contracts.Waste;

import java.lang.reflect.Constructor;

public class WasteFactory {

//    private String wastePath = "app.models.wastes.";
//
//    public Waste create (String... args) throws ClassNotFoundException, NoSuchMethodException {
//
//        String type = args[args.length -1];
//        String className = wastePath + type + "Garbage";
//        Class<?> wasteClass = Class.forName(className);
//
//        Constructor<?> constructor = wasteClass.getConstructors()[0];
//        Class<?>[] parameterTypes = constructor.getParameterTypes();
//
//        Object[] arguments = new Object[parameterTypes.length];
//
//        for (int i = 0; i <parameterTypes.length ; i++) {
//
//            Class<?> parameterType = parameterTypes[i];
//            Constructor<?> paramConstructor = parameterType.getConstructor(String.class);
//
//
//        }
//
//
//    }
}
