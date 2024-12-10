package X;

/* renamed from: X.0jv  reason: invalid class name and case insensitive filesystem */
public final class C11370jv extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $height;
    public final /* synthetic */ AnonymousClass0XJ $placeable;
    public final /* synthetic */ C17530uo $this_measure;
    public final /* synthetic */ C06010Wp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11370jv(C06010Wp r2, C17530uo r3, AnonymousClass0XJ r4, int i) {
        super(1);
        this.$this_measure = r3;
        this.this$0 = r2;
        this.$placeable = r4;
        this.$height = i;
    }

    public final void A00(AnonymousClass0QZ r8) {
        C26227CvJ cvJ;
        C17530uo r3 = this.$this_measure;
        C06010Wp r0 = this.this$0;
        int i = r0.A00;
        C25262Cc3 A00 = r0.A00();
        AnonymousClass0NM r02 = (AnonymousClass0NM) r0.A01().invoke();
        if (r02 != null) {
            cvJ = r02.A03();
        } else {
            cvJ = null;
        }
        this.this$0.A01.A01(AnonymousClass0CI.Vertical, C04420Ni.A01(cvJ, A00, r3, i, this.$placeable.A01, false), this.$height, this.$placeable.A00);
        r8.A0B(this.$placeable, 0, C22339B3q.A01(-this.this$0.A01.A03.BRr()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((AnonymousClass0QZ) obj);
        return C27621Wu.A00;
    }
}
