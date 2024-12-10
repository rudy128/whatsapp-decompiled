package X;

/* renamed from: X.0ms  reason: invalid class name and case insensitive filesystem */
public final class C13130ms extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C36001nB $actions;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13130ms(C36001nB r2, int i) {
        super(2);
        this.$actions = r2;
        this.$$dirty = i;
    }

    public final void A00(C17130tn r12, int i) {
        if ((i & 11) != 2 || !r12.BZO()) {
            C16120rk r2 = AnonymousClass0OB.A00;
            C16340s6 r1 = AnonymousClass0MX.A03;
            C36001nB r3 = this.$actions;
            int i2 = ((this.$$dirty >> 6) & 7168) | 432;
            r12.COB(693286680);
            AnonymousClass0WC r4 = C17090tj.A00;
            C16870tM A00 = C03930Le.A00(r2, r12, r1);
            Object A1B = AnonymousClass001.A1B(r12);
            Object A0t = AnonymousClass000.A0t(r12);
            Object BFh = r12.BFh(AnonymousClass0OD.A0B);
            C18090vk A002 = C05030Qc.A00();
            AnonymousClass04D A003 = AnonymousClass0LO.A00(r4);
            int A0O = AnonymousClass001.A0O(r12, (i2 << 3) & 112);
            AnonymousClass0VR r22 = (AnonymousClass0VR) r12;
            if (r22.A0K) {
                r12.BHe(A002);
            } else {
                r12.CRc();
            }
            r22.A0O = false;
            AnonymousClass0EM.A00(r12, A00, C05030Qc.A04());
            AnonymousClass0EM.A00(r12, A1B, C05030Qc.A02());
            AnonymousClass0EM.A00(r12, A0t, C05030Qc.A03());
            AnonymousClass0EM.A00(r12, BFh, C05030Qc.A07());
            A003.invoke(AnonymousClass0OT.A00(r12), r12, AnonymousClass000.A0q(A0O));
            r12.COB(2058660585);
            r3.invoke(C03940Lf.A00, r12, Integer.valueOf(((i2 >> 6) & 112) | 6));
            AnonymousClass0VR.A0K(r22);
            return;
        }
        r12.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
