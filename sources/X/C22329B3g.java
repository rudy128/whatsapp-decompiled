package X;

/* renamed from: X.B3g  reason: case insensitive filesystem */
public final class C22329B3g extends AnonymousClass11G implements AnonymousClass1OS {
    public static final C22329B3g A00 = new C22329B3g();

    public C22329B3g() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Integer num;
        AE8 ae8 = (AE8) obj;
        AE8 ae82 = (AE8) obj2;
        Integer num2 = null;
        if (ae8 != null) {
            num = ae8.A03;
        } else {
            num = null;
        }
        C17960vV.A07(num);
        int intValue = num.intValue();
        if (ae82 != null) {
            num2 = ae82.A03;
        }
        return Integer.valueOf(intValue - AnonymousClass8BV.A03(num2));
    }
}
