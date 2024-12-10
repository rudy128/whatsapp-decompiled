package X;

/* renamed from: X.0je  reason: invalid class name and case insensitive filesystem */
public final class C11200je extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ EBT $offsetMapping;
    public final /* synthetic */ C04940Pp $state;
    public final /* synthetic */ C26224CvE $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11200je(C04940Pp r2, EBT ebt, C26224CvE cvE) {
        super(1);
        this.$state = r2;
        this.$value = cvE;
        this.$offsetMapping = ebt;
    }

    public final void A00(C17770vC r7) {
        AnonymousClass0NM A02 = C04940Pp.A02(this.$state);
        if (A02 != null) {
            C26224CvE cvE = this.$value;
            EBT ebt = this.$offsetMapping;
            C04940Pp r3 = this.$state;
            C05090Qj.A06(r7.BQs().BOJ(), r3.A0G, A02.A03(), ebt, cvE);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((C17770vC) obj);
        return C27621Wu.A00;
    }
}
