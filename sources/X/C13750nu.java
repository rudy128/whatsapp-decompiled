package X;

/* renamed from: X.0nu  reason: invalid class name and case insensitive filesystem */
public final class C13750nu extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C15780rC $color = null;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C22821Di $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ C26251Cvq $style;
    public final /* synthetic */ String $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13750nu(C17090tj r2, C26251Cvq cvq, String str, C22821Di r5, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(2);
        this.$text = str;
        this.$modifier = r2;
        this.$style = cvq;
        this.$onTextLayout = r5;
        this.$overflow = i;
        this.$softWrap = z;
        this.$maxLines = i2;
        this.$minLines = i3;
        this.$$changed = i4;
        this.$$default = i5;
    }

    public final void A00(C17130tn r12) {
        String str = this.$text;
        C17130tn r0 = r12;
        AnonymousClass0PY.A03(r0, this.$modifier, this.$style, str, this.$onTextLayout, this.$overflow, this.$maxLines, this.$minLines, AnonymousClass0L8.A00(this.$$changed), this.$$default, this.$softWrap);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
