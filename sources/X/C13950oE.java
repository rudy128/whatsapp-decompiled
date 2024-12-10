package X;

import java.util.Map;

/* renamed from: X.0oE  reason: invalid class name and case insensitive filesystem */
public final class C13950oE extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C24693CGf $fontFamily;
    public final /* synthetic */ long $fontSize;
    public final /* synthetic */ C25823Cma $fontStyle;
    public final /* synthetic */ DSF $fontWeight;
    public final /* synthetic */ Map $inlineContent;
    public final /* synthetic */ long $letterSpacing;
    public final /* synthetic */ long $lineHeight;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C22821Di $onTextLayout;
    public final /* synthetic */ int $overflow;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ C26251Cvq $style;
    public final /* synthetic */ C27069DRu $text;
    public final /* synthetic */ C26018CqZ $textAlign;
    public final /* synthetic */ C25827Cme $textDecoration;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13950oE(C17090tj r3, C27069DRu dRu, C26251Cvq cvq, C24693CGf cGf, C25823Cma cma, DSF dsf, C26018CqZ cqZ, C25827Cme cme, Map map, C22821Di r12, int i, int i2, int i3, int i4, int i5, int i6, long j, long j2, long j3, long j4, boolean z) {
        super(2);
        this.$text = dRu;
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
        this.$inlineContent = map;
        this.$onTextLayout = r12;
        this.$style = cvq;
        this.$$changed = i4;
        this.$$changed1 = i5;
        this.$$default = i6;
    }

    public final void A00(C17130tn r44) {
        C27069DRu dRu = this.$text;
        C17090tj r41 = this.$modifier;
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
        Map map = this.$inlineContent;
        C22821Di r10 = this.$onTextLayout;
        C26251Cvq cvq = this.$style;
        boolean z2 = z;
        C26018CqZ cqZ2 = cqZ;
        C25827Cme cme2 = cme;
        Map map2 = map;
        C22821Di r24 = r10;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        C17090tj r15 = r41;
        C27069DRu dRu2 = dRu;
        C26251Cvq cvq2 = cvq;
        C24693CGf cGf2 = cGf;
        AnonymousClass0PA.A00(r44, r15, dRu2, cvq2, cGf2, cma, dsf, cqZ2, cme2, map2, r24, i4, i5, i6, AnonymousClass0L8.A00(this.$$changed), AnonymousClass0L8.A01(this.$$changed1), this.$$default, j, j2, j3, j4, z2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
