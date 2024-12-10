package X;

/* renamed from: X.0k3  reason: invalid class name and case insensitive filesystem */
public final class C11450k3 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C04310Mr $focusRequester;
    public final /* synthetic */ C05120Qm $manager;
    public final /* synthetic */ EBT $offsetMapping;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ C04940Pp $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11450k3(C04940Pp r2, C05120Qm r3, C04310Mr r4, EBT ebt, boolean z) {
        super(1);
        this.$state = r2;
        this.$focusRequester = r4;
        this.$readOnly = z;
        this.$manager = r3;
        this.$offsetMapping = ebt;
    }

    public final void A00(long j) {
        C16750sx r0;
        C04940Pp r3 = this.$state;
        C04310Mr r2 = this.$focusRequester;
        boolean z = !this.$readOnly;
        if (!AnonymousClass001.A1b(r3.A08)) {
            r2.A00();
        } else if (z && (r0 = r3.A0H) != null) {
            r0.CMX();
        }
        if (AnonymousClass001.A1b(this.$state.A08)) {
            long j2 = j;
            if (this.$state.A07.getValue() != AnonymousClass0CN.Selection) {
                AnonymousClass0NM A02 = C04940Pp.A02(this.$state);
                if (A02 != null) {
                    C04940Pp r22 = this.$state;
                    C05090Qj.A04(A02, r22.A07(), this.$offsetMapping, r22.A0A(), j2);
                    if (r22.A00.A04().length() > 0) {
                        r22.A07.setValue(AnonymousClass0CN.Cursor);
                        return;
                    }
                    return;
                }
                return;
            }
            this.$manager.A0L(AnonymousClass000.A0e(j));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(((AnonymousClass0QY) obj).A00);
        return C27621Wu.A00;
    }
}
