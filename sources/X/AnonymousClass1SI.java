package X;

/* renamed from: X.1SI  reason: invalid class name */
public class AnonymousClass1SI {
    public final AnonymousClass18O A00;
    public final C18030ve A01;

    public long A00(C62142qr r6, int i, boolean z) {
        int A04;
        Integer num;
        Integer num2;
        int intValue;
        int A042;
        Integer num3;
        if (i != 2) {
            if (r6 == null || (num3 = r6.A00) == null) {
                intValue = this.A00.A04(AnonymousClass18O.A0s);
            } else {
                intValue = num3.intValue();
            }
            A042 = C18020vd.A00(C18040vf.A02, this.A01, 2266);
        } else if (r6 == null || (num2 = r6.A02) == null || (intValue = num2.intValue()) <= 0) {
            C18030ve r4 = this.A01;
            C18040vf r3 = C18040vf.A02;
            int A002 = C18020vd.A00(r3, r4, 2645);
            if (z || r6 == null || (num = r6.A03) == null || A002 == -1 || num.intValue() <= A002) {
                A04 = this.A00.A04(AnonymousClass18O.A0v);
            } else {
                A04 = C18020vd.A00(r3, r4, 2646);
            }
            return (long) A04;
        } else {
            A042 = this.A00.A04(AnonymousClass18O.A0v);
        }
        A04 = Math.min(intValue, A042);
        return (long) A04;
    }

    public AnonymousClass1SI(AnonymousClass18O r1, C18030ve r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
