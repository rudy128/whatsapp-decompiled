package X;

/* renamed from: X.9kp  reason: invalid class name and case insensitive filesystem */
public class C190369kp {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public boolean A00() {
        AnonymousClass00H r6 = this.A01;
        int i = C17900vP.A02(r6).getInt("shops_privacy_notice", -1);
        AnonymousClass00H r2 = this.A00;
        AnonymousClass18O r0 = ((AnonymousClass9Z9) r2.get()).A00;
        AnonymousClass18Q r1 = AnonymousClass18O.A1Q;
        if (i >= r0.A04(r1)) {
            return true;
        }
        C17900vP.A02(r6).getInt("shops_privacy_notice", -1);
        ((AnonymousClass9Z9) r2.get()).A00.A04(r1);
        return false;
    }

    public C190369kp(AnonymousClass00H r1, AnonymousClass00H r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
