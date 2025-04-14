package app.demo;

import app.utils.ArrayUtils;
import app.annotations.MethodInfo;
import app.annotations.Author;

import java.lang.reflect.Method;

public class AnnotationDemo {
    public static void main(String[] args) {
        Class<ArrayUtils> clazz = ArrayUtils.class;

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MethodInfo.class) && method.isAnnotationPresent(Author.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                Author author = method.getAnnotation(Author.class);

                System.out.println("Метод: " + methodInfo.name());
                System.out.println("Повертає: " + methodInfo.returnType());
                System.out.println("Опис: " + methodInfo.description());
                System.out.println("Автор: " + author.firstName() + " " + author.lastName());
                System.out.println("----------------------------------------");
            }
        }

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Сума: " + ArrayUtils.sum(array));
        System.out.println("Максимум: " + ArrayUtils.max(array));
    }
}
