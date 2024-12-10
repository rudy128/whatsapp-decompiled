package X;

/* renamed from: X.9Az  reason: invalid class name and case insensitive filesystem */
public class C177889Az extends A34 {
    public final String A00;
    public final /* synthetic */ AnonymousClass8GL A01;

    public C177889Az(AnonymousClass8GL r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AW0 aw0;
        AW0 aw02 = (AW0) obj;
        AnonymousClass8GL r4 = this.A01;
        AnonymousClass1QE r2 = r4.A0L;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("onTransactionDetailData loaded: ");
        AnonymousClass8BW.A1D(r2, A10, AnonymousClass000.A1W(aw02));
        if (aw02 != null) {
            r4.A06 = aw02;
        }
        AW0 aw03 = r4.A07;
        String str = aw03.A0H;
        if ((str == null || str.equals("0")) && (aw0 = r4.A06) != null) {
            aw03.A0H = aw0.A0H;
        }
        r4.A0M.CGF(new C21461AkS(r4, 2131897523, 11));
    }
}
