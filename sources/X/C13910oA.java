package X;

/* renamed from: X.0oA  reason: invalid class name and case insensitive filesystem */
public final class C13910oA extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C03380Hv $cursorBrush;
    public final /* synthetic */ C36001nB $decorationBox;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C26041Cr5 $imeOptions;
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ AnonymousClass0PT $keyboardActions;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C22821Di $onTextLayout;
    public final /* synthetic */ C22821Di $onValueChange;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ boolean $softWrap;
    public final /* synthetic */ C26251Cvq $textStyle;
    public final /* synthetic */ C26224CvE $value;
    public final /* synthetic */ EBO $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13910oA(C17210uI r2, AnonymousClass0PT r3, C17090tj r4, C03380Hv r5, C26251Cvq cvq, C26041Cr5 cr5, C26224CvE cvE, EBO ebo, C22821Di r10, C22821Di r11, C36001nB r12, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        super(2);
        this.$value = cvE;
        this.$onValueChange = r10;
        this.$modifier = r4;
        this.$textStyle = cvq;
        this.$visualTransformation = ebo;
        this.$onTextLayout = r11;
        this.$interactionSource = r2;
        this.$cursorBrush = r5;
        this.$softWrap = z;
        this.$maxLines = i;
        this.$minLines = i2;
        this.$imeOptions = cr5;
        this.$keyboardActions = r3;
        this.$enabled = z2;
        this.$readOnly = z3;
        this.$decorationBox = r12;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    public final void A00(C17130tn r33) {
        C26224CvE cvE = this.$value;
        C22821Di r16 = this.$onValueChange;
        C17090tj r15 = this.$modifier;
        C26251Cvq cvq = this.$textStyle;
        EBO ebo = this.$visualTransformation;
        C22821Di r11 = this.$onTextLayout;
        C17210uI r10 = this.$interactionSource;
        C03380Hv r9 = this.$cursorBrush;
        boolean z = this.$softWrap;
        int i = this.$maxLines;
        int i2 = this.$minLines;
        C26041Cr5 cr5 = this.$imeOptions;
        AnonymousClass0PT r4 = this.$keyboardActions;
        boolean z2 = this.$enabled;
        boolean z3 = this.$readOnly;
        C36001nB r1 = this.$decorationBox;
        C36001nB r23 = r1;
        int i3 = i;
        int i4 = i2;
        EBO ebo2 = ebo;
        C22821Di r21 = r16;
        C22821Di r22 = r11;
        C26251Cvq cvq2 = cvq;
        C26041Cr5 cr52 = cr5;
        C03380Hv r162 = r9;
        C17210uI r12 = r10;
        AnonymousClass0PT r13 = r4;
        C05070Qh.A01(r12, r13, r33, r15, r162, cvq2, cr52, cvE, ebo2, r21, r22, r23, i3, i4, AnonymousClass0L8.A00(this.$$changed), AnonymousClass0L8.A01(this.$$changed1), this.$$default, z, z2, z3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
