package X;

/* renamed from: X.4WX  reason: invalid class name */
public class AnonymousClass4WX {
    public final C18100vl A00 = C99164sN.A01(this, 36);

    public static final int A00(AnonymousClass4WX r1, int i) {
        Number number = (Number) AnonymousClass000.A0w(AnonymousClass3MW.A12(r1.A00), i);
        if (number != null) {
            return number.intValue();
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Unknown actionId ");
        A10.append(i);
        throw AnonymousClass001.A12(". Add it to getSortList().", A10);
    }

    public AnonymousClass4WX() {
        Boolean bool = C17960vV.A01;
    }
}
