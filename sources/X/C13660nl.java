package X;

/* renamed from: X.0nl  reason: invalid class name and case insensitive filesystem */
public final class C13660nl extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C28644ECa $density;
    public final /* synthetic */ C05120Qm $manager;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ EBT $offsetMapping;
    public final /* synthetic */ C22821Di $onTextLayout;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ boolean $showHandleAndMagnifier;
    public final /* synthetic */ C04940Pp $state;
    public final /* synthetic */ C26224CvE $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13660nl(C04940Pp r2, C05120Qm r3, EBT ebt, C26224CvE cvE, C28644ECa eCa, C22821Di r7, int i, boolean z, boolean z2) {
        super(2);
        this.$manager = r3;
        this.$state = r2;
        this.$showHandleAndMagnifier = z;
        this.$readOnly = z2;
        this.$onTextLayout = r7;
        this.$value = cvE;
        this.$offsetMapping = ebt;
        this.$density = eCa;
        this.$maxLines = i;
    }

    public final void A00(C17130tn r15, int i) {
        C16910tQ A05;
        if ((i & 11) != 2 || !r15.BZO()) {
            C04940Pp r8 = this.$state;
            C22821Di r12 = this.$onTextLayout;
            AnonymousClass0X0 r7 = new AnonymousClass0X0(r8, this.$offsetMapping, this.$value, this.$density, r12, this.$maxLines);
            r15.COB(-1323940314);
            AnonymousClass0WC r0 = C17090tj.A00;
            boolean z = false;
            AnonymousClass0VR r3 = (AnonymousClass0VR) r15;
            int i2 = r3.A01;
            C17350uW BPs = r15.BPs();
            C18090vk A00 = C05030Qc.A00();
            AnonymousClass04D A01 = AnonymousClass0LO.A01(r0);
            r15.COE();
            if (r3.A0K) {
                r15.BHe(A00);
            } else {
                r15.CRc();
            }
            AnonymousClass0EM.A00(r15, r7, C05030Qc.A04());
            AnonymousClass0EM.A00(r15, BPs, C05030Qc.A06());
            AnonymousClass1OS A012 = C05030Qc.A01();
            if (r3.A0K || !C18070vi.A18(r15.CER(), Integer.valueOf(i2))) {
                r15.BCJ(AnonymousClass000.A0r(r15, i2), A012);
            }
            A01.invoke(new AnonymousClass0OT(r15), r15, 0);
            r15.COB(2058660585);
            AnonymousClass0VR.A0R(r3, false);
            AnonymousClass0VR.A0J(r3);
            C05120Qm r32 = this.$manager;
            if (!(this.$state.A07.getValue() == AnonymousClass0CN.None || (A05 = this.$state.A05()) == null)) {
                C18070vi.A0b(A05);
                if (A05.Be8() && this.$showHandleAndMagnifier) {
                    z = true;
                }
            }
            C05070Qh.A08(r32, r15, 8, z);
            if (this.$state.A07.getValue() == AnonymousClass0CN.Cursor && !this.$readOnly && this.$showHandleAndMagnifier) {
                C05070Qh.A07(this.$manager, r15, 8);
                return;
            }
            return;
        }
        r15.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((C17130tn) obj, AnonymousClass000.A0M(obj2));
        return C27621Wu.A00;
    }
}
