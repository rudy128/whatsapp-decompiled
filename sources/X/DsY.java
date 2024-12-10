package X;

public final class DsY extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C16300s2 $currentContent$delegate;
    public final /* synthetic */ BJD $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DsY(C16300s2 r2, BJD bjd) {
        super(2);
        this.$this_apply = bjd;
        this.$currentContent$delegate = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C17130tn r8 = (C17130tn) obj;
        if ((AnonymousClass000.A0M(obj2) & 11) != 2 || !r8.BZO()) {
            C17090tj A02 = AnonymousClass0PD.A02(C17090tj.A00, C28123Drh.A00, false);
            BJD bjd = this.$this_apply;
            C17090tj A00 = C02650Ev.A00(A02, new C27921DoJ(bjd));
            float f = 0.0f;
            if (bjd.getCanCalculatePosition()) {
                f = 1.0f;
            }
            C17090tj A002 = AnonymousClass0EZ.A00(A00, f);
            AnonymousClass04D A003 = AnonymousClass0LC.A00(r8, new DsL(this.$currentContent$delegate), 606497925);
            r8.COB(1406149896);
            C26592D5g d5g = C26592D5g.A00;
            r8.COB(-1323940314);
            AnonymousClass0VR r4 = (AnonymousClass0VR) r8;
            int i = r4.A01;
            C17350uW BPs = r8.BPs();
            C18090vk r0 = C05030Qc.A00;
            AnonymousClass04D A01 = AnonymousClass0LO.A01(A002);
            BEA.A19(r8, r4, r0);
            BE9.A18(r8, d5g, BPs);
            AnonymousClass1OS r1 = C05030Qc.A01;
            if (r4.A0K || !BE9.A1R(r8, i)) {
                BE9.A19(r8, r1, i);
            }
            BE8.A0y(r8, A01, new AnonymousClass0OT(r8), AnonymousClass3MY.A0f());
            A003.invoke(r8, 6);
            BEA.A18(r8, r4);
        } else {
            r8.CNR();
        }
        return C27621Wu.A00;
    }
}
