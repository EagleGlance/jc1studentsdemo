package com.noirix.reflection;

import com.noirix.data.Data;
import com.noirix.domain.Computer;
import com.noirix.domain.CustomOperation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Computer> computerClass = Computer.class;
        //Class<? extends Computer> aClass = new Computer().getClass();

        String computerClassSimpleName = computerClass.getSimpleName();
        System.out.println(computerClass.getName());
        System.out.println(computerClass.getSimpleName());
        System.out.println(computerClass.getCanonicalName());

        System.out.println(computerClass.getClassLoader());
        System.out.println("String.class".getClass().getClassLoader());
        System.out.println(new Integer(10).getClass().getClassLoader());

        System.out.println(computerClass.getModifiers());

        int modifiers = computerClass.getModifiers();

        if (Modifier.isPublic(modifiers)) {
            System.out.println(computerClassSimpleName + " Class is public!");
        }

        if (Modifier.isInterface(CustomOperation.class.getModifiers())) {
            System.out.println(CustomOperation.class.getSimpleName() + " is Interface");
        }

        System.out.println("CustomOperation information");
        System.out.println(Modifier.toString(CustomOperation.class.getModifiers()));

        Annotation[] declaredAnnotations = Data.class.getDeclaredAnnotations();

        System.out.println(declaredAnnotations.length);

        for (Annotation declaredAnnotation : declaredAnnotations) {
            if (declaredAnnotation.annotationType().equals(CustomAnnotation.class)) {
                System.out.println("Print some string!");
            }

            System.out.println(declaredAnnotation.annotationType());
            System.out.println(declaredAnnotation);
        }

        System.out.println("Computer Class fields info: ");
        Field[] declaredFields = computerClass.getDeclaredFields();

        Computer reflectionTestComputer = new Computer();

        System.out.println(reflectionTestComputer);

        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);

            Annotation[] annotations = declaredField.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }

            if (declaredField.getType().equals(int.class) &&
                    !Modifier.isFinal(declaredField.getModifiers())) {
                System.out.println("we are changing private field value");

                declaredField.setAccessible(true);
                declaredField.set(reflectionTestComputer, 99999);
            }

            //declaredField.get(reflectionTestComputer);
        }

        Field[] declaredFieldsAfterChanges = computerClass.getDeclaredFields();
        for (Field declaredFieldsAfterChange : declaredFieldsAfterChanges) {
            System.out.println(declaredFieldsAfterChange);
        }

        System.out.println(reflectionTestComputer);


        Method[] declaredMethods = computerClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
            System.out.println(declaredMethod.getReturnType());
//            System.out.println(declaredMethod.getDeclaredAnnotations());
//            System.out.println(declaredMethod.getExceptionTypes());
            System.out.println(declaredMethod.getParameterCount());

            String declaredMethodName = declaredMethod.getName();

            if (declaredMethodName.contains("set") && declaredMethodName.contains("Ram")) {
                System.out.println("Invocation method through reflection");

                declaredMethod.setAccessible(true);
                System.out.println(declaredMethod.invoke(reflectionTestComputer, 66666));
            }
        }

        System.out.println(reflectionTestComputer);


        new Computer();
        new Computer(20d, "", 77);

        Constructor<?>[] declaredConstructors = computerClass.getDeclaredConstructors();
        Computer constructorReflectionInvocationObject = null;
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            declaredConstructor.setAccessible(true);
            if (declaredConstructor.getParameterCount() == 0) {
                constructorReflectionInvocationObject = (Computer) declaredConstructor.newInstance();
            } else {
                constructorReflectionInvocationObject = (Computer) declaredConstructor.newInstance(20d, "test reflection", 777);
            }
        }

        System.out.println(constructorReflectionInvocationObject);

    }
}
