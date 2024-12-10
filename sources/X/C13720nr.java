package X;

/* renamed from: X.0nr  reason: invalid class name and case insensitive filesystem */
public final class C13720nr extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C22821Di $onClick;
    public final /* synthetic */ C22821Di $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ C26251Cvq $style;
    public final /* synthetic */ C27069DRu $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13720nr(C17090tj r2, C27069DRu dRu, C26251Cvq cvq, C22821Di r5, C22821Di r6, int i, int i2, int i3, int i4, boolean z) {
        super(2);
        this.$text = dRu;
        this.$modifier = r2;
        this.$style = cvq;
        this.$softWrap = z;
        this.$overflow = i;
        this.$maxLines = i2;
        this.$onTextLayout = r5;
        this.$onClick = r6;
        this.$$changed = i3;
        this.$$default = i4;
    }

    public final void A00(C17130tn r12) {
        C27069DRu dRu = this.$text;
        C17090tj r1 = this.$modifier;
        C26251Cvq cvq = this.$style;
        boolean z = this.$softWrap;
        C17130tn r0 = r12;
        C02410Dx.A00(r0, r1, dRu, cvq, this.$onTextLayout, this.$onClick, this.$overflow, this.$maxLines, AnonymousClass0L8.A00(this.$$changed), this.$$default, z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
