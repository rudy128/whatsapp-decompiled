package X;

/* renamed from: X.1DF  reason: invalid class name */
public abstract class AnonymousClass1DF {
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, X.1DI] */
    public static final C18100vl A00(Integer num, C18090vk r4) {
        Object obj;
        int intValue = num.intValue();
        if (intValue == 0) {
            obj = new C18110vm(r4);
        } else if (intValue == 1) {
            obj = new AnonymousClass1DG(r4);
        } else if (intValue == 2) {
            ? obj2 = new Object();
            obj2.initializer = r4;
            obj2._value = C18120vn.A00;
            obj = obj2;
        } else {
            throw new AnonymousClass3EW();
        }
        return (C18100vl) obj;
    }

    public static final C18110vm A01(C18090vk r1) {
        return new C18110vm(r1);
    }
}
