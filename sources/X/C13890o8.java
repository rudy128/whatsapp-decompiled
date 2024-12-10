package X;

/* renamed from: X.0o8  reason: invalid class name and case insensitive filesystem */
public final class C13890o8 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C03380Hv $cursorBrush;
    public final /* synthetic */ C36001nB $decorationBox;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ AnonymousClass0PT $keyboardActions;
    public final /* synthetic */ C04610Ob $keyboardOptions;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C22821Di $onTextLayout;
    public final /* synthetic */ C22821Di $onValueChange;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ C26251Cvq $textStyle;
    public final /* synthetic */ C26224CvE $value;
    public final /* synthetic */ EBO $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13890o8(C17210uI r2, AnonymousClass0PT r3, C04610Ob r4, C17090tj r5, C03380Hv r6, C26251Cvq cvq, C26224CvE cvE, EBO ebo, C22821Di r10, C22821Di r11, C36001nB r12, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        super(2);
        this.$value = cvE;
        this.$onValueChange = r10;
        this.$modifier = r5;
        this.$enabled = z;
        this.$readOnly = z2;
        this.$textStyle = cvq;
        this.$keyboardOptions = r4;
        this.$keyboardActions = r3;
        this.$singleLine = z3;
        this.$maxLines = i;
        this.$minLines = i2;
        this.$visualTransformation = ebo;
        this.$onTextLayout = r11;
        this.$interactionSource = r2;
        this.$cursorBrush = r6;
        this.$decorationBox = r12;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    public final void A00(C17130tn r32) {
        C26224CvE cvE = this.$value;
        C22821Di r16 = this.$onValueChange;
        C17090tj r15 = this.$modifier;
        boolean z = this.$enabled;
        boolean z2 = this.$readOnly;
        C26251Cvq cvq = this.$textStyle;
        C04610Ob r10 = this.$keyboardOptions;
        AnonymousClass0PT r9 = this.$keyboardActions;
        boolean z3 = this.$singleLine;
        int i = this.$maxLines;
        int i2 = this.$minLines;
        EBO ebo = this.$visualTransformation;
        C22821Di r4 = this.$onTextLayout;
        C17210uI r3 = this.$interactionSource;
        C03380Hv r2 = this.$cursorBrush;
        C36001nB r1 = this.$decorationBox;
        C36001nB r22 = r1;
        int i3 = i;
        int i4 = i2;
        EBO ebo2 = ebo;
        C22821Di r20 = r16;
        C22821Di r21 = r4;
        C03380Hv r162 = r2;
        C26251Cvq cvq2 = cvq;
        C04610Ob r13 = r10;
        C17210uI r11 = r3;
        AnonymousClass0PT r12 = r9;
        C02400Dw.A00(r11, r12, r13, r32, r15, r162, cvq2, cvE, ebo2, r20, r21, r22, i3, i4, AnonymousClass0L8.A00(this.$$changed), AnonymousClass0L8.A01(this.$$changed1), this.$$default, z, z2, z3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
