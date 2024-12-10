package X;

/* renamed from: X.1JW  reason: invalid class name */
public abstract class AnonymousClass1JW {
    public static final Integer A00;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
            if ((obj instanceof Integer) && (num = (Integer) obj) != null && num.intValue() > 0) {
                num2 = num;
            }
        } catch (Throwable unused) {
        }
        A00 = num2;
    }
}
