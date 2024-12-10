package X;

/* renamed from: X.0oB  reason: invalid class name and case insensitive filesystem */
public final class C13920oB extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C24693CGf $fontFamily;
    public final /* synthetic */ long $fontSize;
    public final /* synthetic */ C25823Cma $fontStyle;
    public final /* synthetic */ DSF $fontWeight;
    public final /* synthetic */ long $letterSpacing;
    public final /* synthetic */ long $lineHeight;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C22821Di $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ C26251Cvq $style;
    public final /* synthetic */ String $text;
    public final /* synthetic */ C26018CqZ $textAlign;
    public final /* synthetic */ C25827Cme $textDecoration;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13920oB(C17090tj r3, C26251Cvq cvq, C24693CGf cGf, C25823Cma cma, DSF dsf, C26018CqZ cqZ, C25827Cme cme, String str, C22821Di r11, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, long j3, long j4, boolean z) {
        super(2);
        this.$text = str;
        this.$modifier = r3;
        this.$color = j;
        this.$fontSize = j2;
        this.$fontStyle = cma;
        this.$fontWeight = dsf;
        this.$fontFamily = cGf;
        this.$letterSpacing = j3;
        this.$textDecoration = cme;
        this.$textAlign = cqZ;
        this.$lineHeight = j4;
        this.$overflow = i;
        this.$softWrap = z;
        this.$maxLines = i2;
        this.$minLines = i3;
        this.$onTextLayout = r11;
        this.$style = cvq;
        this.$$changed = i4;
        this.$$changed1 = i5;
        this.$$default = i6;
    }

    public final void A00(C17130tn r42) {
        String str = this.$text;
        C17090tj r40 = this.$modifier;
        long j = this.$color;
        long j2 = this.$fontSize;
        C25823Cma cma = this.$fontStyle;
        DSF dsf = this.$fontWeight;
        C24693CGf cGf = this.$fontFamily;
        long j3 = this.$letterSpacing;
        C25827Cme cme = this.$textDecoration;
        C26018CqZ cqZ = this.$textAlign;
        long j4 = this.$lineHeight;
        int i = this.$overflow;
        boolean z = this.$softWrap;
        int i2 = this.$maxLines;
        int i3 = this.$minLines;
        C22821Di r10 = this.$onTextLayout;
        C26251Cvq cvq = this.$style;
        C26018CqZ cqZ2 = cqZ;
        C25827Cme cme2 = cme;
        C22821Di r23 = r10;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        C17090tj r15 = r40;
        C26251Cvq cvq2 = cvq;
        C24693CGf cGf2 = cGf;
        C25823Cma cma2 = cma;
        AnonymousClass0PA.A01(r42, r15, cvq2, cGf2, cma2, dsf, cqZ2, cme2, str, r23, i4, i5, i6, AnonymousClass0L8.A00(this.$$changed), AnonymousClass0L8.A01(this.$$changed1), this.$$default, j, j2, j3, j4, z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
