package annotations;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

class AnnotationProcessor {

    public static void invokeWithValidation(
            Class<?> clazz,
            String methodName,
            Object... args) throws Exception {

        Method method = clazz.getMethod(methodName, String.class);
        Annotation[][] paramAnnotations = method.getParameterAnnotations();

        for (int i = 0; i < paramAnnotations.length; i++) {
            for (Annotation annotation : paramAnnotations[i]) {

                if (annotation instanceof ValidString) {
                    String value = (String) args[i];

                    if (value == null || value.isEmpty()) {
                        throw new IllegalArgumentException(
                                "Invalid string parameter at index " + i);
                    }
                }
            }
        }

        method.invoke(null, args);
    }
}
