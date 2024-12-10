package X;

/* renamed from: X.2SV  reason: invalid class name */
public abstract class AnonymousClass2SV {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "x86";
            case 2:
                return "armeabi-v7a";
            case 3:
                return "x86_64";
            default:
                return "arm64-v8a";
        }
    }
}
