package X;

/* renamed from: X.0ju  reason: invalid class name and case insensitive filesystem */
public final class C11360ju extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0XJ $placeable;
    public final /* synthetic */ C17530uo $this_measure;
    public final /* synthetic */ int $width;
    public final /* synthetic */ C06000Wo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11360ju(C06000Wo r2, C17530uo r3, AnonymousClass0XJ r4, int i) {
        super(1);
        this.$this_measure = r3;
        this.this$0 = r2;
        this.$placeable = r4;
        this.$width = i;
    }

    public final void A00(AnonymousClass0QZ r9) {
        C26227CvJ cvJ;
        C17530uo r4 = this.$this_measure;
        C06000Wo r0 = this.this$0;
        int i = r0.A00;
        C25262Cc3 A00 = r0.A00();
        AnonymousClass0NM r02 = (AnonymousClass0NM) r0.A01().invoke();
        if (r02 != null) {
            cvJ = r02.A03();
        } else {
            cvJ = null;
        }
        this.this$0.A01.A01(AnonymousClass0CI.Horizontal, C04420Ni.A01(cvJ, A00, r4, i, this.$placeable.A01, AnonymousClass000.A1Z(this.$this_measure.getLayoutDirection(), C24246By4.Rtl)), this.$width, this.$placeable.A01);
        r9.A0B(this.$placeable, C22339B3q.A01(-this.this$0.A01.A03.BRr()), 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((AnonymousClass0QZ) obj);
        return C27621Wu.A00;
    }
}
