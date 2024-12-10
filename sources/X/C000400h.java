package X;

/* renamed from: X.00h  reason: invalid class name and case insensitive filesystem */
public abstract class C000400h {
    public static Object A00(Class cls, Object obj) {
        if (obj instanceof AnonymousClass00b) {
            return cls.cast(obj);
        }
        if (obj instanceof AnonymousClass009) {
            return A00(cls, ((AnonymousClass009) obj).generatedComponent());
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", new Object[]{obj.getClass(), AnonymousClass00b.class, AnonymousClass009.class}));
    }
}
