package X;

/* renamed from: X.0k2  reason: invalid class name and case insensitive filesystem */
public final class C11440k2 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0XJ $placeable;
    public final /* synthetic */ C17530uo $this_measure;
    public final /* synthetic */ int $wrapperHeight;
    public final /* synthetic */ int $wrapperWidth;
    public final /* synthetic */ AnonymousClass09A this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11440k2(AnonymousClass09A r2, C17530uo r3, AnonymousClass0XJ r4, int i, int i2) {
        super(1);
        this.this$0 = r2;
        this.$wrapperWidth = i;
        this.$placeable = r4;
        this.$wrapperHeight = i2;
        this.$this_measure = r3;
    }

    public final void A00() {
        AnonymousClass1OS A0N = this.this$0.A0N();
        int i = this.$wrapperWidth;
        AnonymousClass0XJ r2 = this.$placeable;
        AnonymousClass0QZ.A04(this.$placeable, 0.0f, ((C26143Ct6) A0N.invoke(C26142Ct5.A00(C25293Ccv.A00(i - r2.A01, this.$wrapperHeight - r2.A00)), this.$this_measure.getLayoutDirection())).A02());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00();
        return C27621Wu.A00;
    }
}
