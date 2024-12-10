package X;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.microg.safeparcel.SafeParcelable;

/* renamed from: X.CeL  reason: case insensitive filesystem */
public abstract class C25361CeL {
    public static Class A00(Field field) {
        Class<SafeParcelable> subClass;
        SafeParcelable.Field field2 = (SafeParcelable.Field) field.getAnnotation(SafeParcelable.Field.class);
        if (field2 != null && (subClass = field2.subClass()) != SafeParcelable.class && subClass != null) {
            return subClass;
        }
        Type genericType = field.getGenericType();
        if (!(genericType instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) genericType;
        if (parameterizedType.getActualTypeArguments().length < 1) {
            return null;
        }
        Type type = parameterizedType.getActualTypeArguments()[0];
        if (type instanceof Class) {
            return (Class) type;
        }
        return null;
    }

    public static boolean A01(Field field) {
        SafeParcelable.Field field2 = (SafeParcelable.Field) field.getAnnotation(SafeParcelable.Field.class);
        if (field2 != null) {
            return field2.useValueParcel();
        }
        throw BE6.A0k();
    }
}
