package X;

/* renamed from: X.0pn  reason: invalid class name and case insensitive filesystem */
public final class C14920pn extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C05120Qm $manager;
    public final /* synthetic */ EBT $offsetMapping;
    public final /* synthetic */ C04940Pp $state;
    public final /* synthetic */ C26224CvE $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14920pn(C04940Pp r2, C05120Qm r3, EBT ebt, C26224CvE cvE, boolean z) {
        super(3);
        this.$offsetMapping = ebt;
        this.$enabled = z;
        this.$value = cvE;
        this.$manager = r3;
        this.$state = r2;
    }

    public final Boolean A00(int i, int i2, boolean z) {
        if (!z) {
            EBT ebt = this.$offsetMapping;
            i = ebt.CPo(i);
            i2 = ebt.CPo(i2);
        }
        boolean z2 = false;
        if (this.$enabled) {
            C26224CvE cvE = this.$value;
            long A01 = cvE.A01();
            if (!(i == AnonymousClass000.A0G(A01) && i2 == AnonymousClass000.A0H(A01))) {
                if (Math.min(i, i2) < 0 || Math.max(i, i2) > cvE.A02().length()) {
                    C05120Qm r1 = this.$manager;
                    C05120Qm.A09(r1, false);
                    C05120Qm.A07(AnonymousClass0CN.None, r1);
                } else {
                    if (z || i == i2) {
                        C05120Qm r12 = this.$manager;
                        C05120Qm.A09(r12, false);
                        C05120Qm.A07(AnonymousClass0CN.None, r12);
                    } else {
                        this.$manager.A0Q(true);
                    }
                    this.$state.A0A().invoke(new C26224CvE(this.$value.A02(), C25858CnM.A01(i, i2)));
                    z2 = true;
                }
            }
        }
        return Boolean.valueOf(z2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00(AnonymousClass000.A0M(obj), AnonymousClass000.A0M(obj2), AnonymousClass000.A1Y(obj3));
    }
}
