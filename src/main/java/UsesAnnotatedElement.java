import java.lang.reflect.Method;

import org.checkerframework.checker.nullness.qual.Nullable;

public class UsesAnnotatedElement {
	public static void main(String[] args) throws Exception {
		Method method = UsesAnnotatedElement.class.getMethod("main", String[].class);
		if (method.isAnnotationPresent(Nullable.class)) {
			System.out.println(method.getAnnotation(Nullable.class).toString());
		}
	}
}
