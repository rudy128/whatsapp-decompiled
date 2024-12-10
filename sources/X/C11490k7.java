package X;

/* renamed from: X.0k7  reason: invalid class name and case insensitive filesystem */
public final class C11490k7 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $boxHeight;
    public final /* synthetic */ int $boxWidth;
    public final /* synthetic */ C17500ul $measurable;
    public final /* synthetic */ AnonymousClass0XJ $placeable;
    public final /* synthetic */ C17530uo $this_measure;
    public final /* synthetic */ AnonymousClass0X1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11490k7(AnonymousClass0X1 r2, C17500ul r3, C17530uo r4, AnonymousClass0XJ r5, int i, int i2) {
        super(1);
        this.$placeable = r5;
        this.$measurable = r3;
        this.$this_measure = r4;
        this.$boxWidth = i;
        this.$boxHeight = i2;
        this.this$0 = r2;
    }

    public final void A00() {
        AnonymousClass0XJ r2 = this.$placeable;
        C04870Pg.A02(this.this$0.A00, this.$measurable, r2, this.$this_measure.getLayoutDirection(), this.$boxWidth, this.$boxHeight);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00();
        return C27621Wu.A00;
    }
}
