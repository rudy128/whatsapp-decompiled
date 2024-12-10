package X;

/* renamed from: X.2oQ  reason: invalid class name and case insensitive filesystem */
public class C60672oQ {
    public static String A00(AnonymousClass11F r1) {
        String obj = r1.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
