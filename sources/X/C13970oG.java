package X;

/* renamed from: X.0oG  reason: invalid class name and case insensitive filesystem */
public final class C13970oG extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass0NY $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ AnonymousClass0PT $keyboardActions;
    public final /* synthetic */ C04610Ob $keyboardOptions;
    public final /* synthetic */ AnonymousClass1OS $label;
    public final /* synthetic */ AnonymousClass1OS $leadingIcon;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ int $minLines;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C22821Di $onValueChange;
    public final /* synthetic */ AnonymousClass1OS $placeholder;
    public final /* synthetic */ AnonymousClass1OS $prefix;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ C16370s9 $shape;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ AnonymousClass1OS $suffix;
    public final /* synthetic */ AnonymousClass1OS $supportingText;
    public final /* synthetic */ C26251Cvq $textStyle;
    public final /* synthetic */ AnonymousClass1OS $trailingIcon;
    public final /* synthetic */ C26224CvE $value;
    public final /* synthetic */ EBO $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13970oG(C17210uI r2, AnonymousClass0PT r3, C04610Ob r4, AnonymousClass0NY r5, C17090tj r6, C16370s9 r7, C26251Cvq cvq, C26224CvE cvE, EBO ebo, C22821Di r11, AnonymousClass1OS r12, AnonymousClass1OS r13, AnonymousClass1OS r14, AnonymousClass1OS r15, AnonymousClass1OS r16, AnonymousClass1OS r17, AnonymousClass1OS r18, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.$value = cvE;
        this.$onValueChange = r11;
        this.$modifier = r6;
        this.$enabled = z;
        this.$readOnly = z2;
        this.$textStyle = cvq;
        this.$label = r12;
        this.$placeholder = r13;
        this.$leadingIcon = r14;
        this.$trailingIcon = r15;
        this.$prefix = r16;
        this.$suffix = r17;
        this.$supportingText = r18;
        this.$isError = z3;
        this.$visualTransformation = ebo;
        this.$keyboardOptions = r4;
        this.$keyboardActions = r3;
        this.$singleLine = z4;
        this.$maxLines = i;
        this.$minLines = i2;
        this.$interactionSource = r2;
        this.$shape = r7;
        this.$colors = r5;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$changed2 = i5;
        this.$$default = i6;
    }

    public final void A00(C17130tn r40) {
        C26224CvE cvE = this.$value;
        C22821Di r37 = this.$onValueChange;
        C17090tj r19 = this.$modifier;
        boolean z = this.$enabled;
        boolean z2 = this.$readOnly;
        C26251Cvq cvq = this.$textStyle;
        AnonymousClass1OS r20 = this.$label;
        AnonymousClass1OS r21 = this.$placeholder;
        AnonymousClass1OS r22 = this.$leadingIcon;
        AnonymousClass1OS r15 = this.$trailingIcon;
        AnonymousClass1OS r14 = this.$prefix;
        AnonymousClass1OS r12 = this.$suffix;
        AnonymousClass1OS r11 = this.$supportingText;
        boolean z3 = this.$isError;
        EBO ebo = this.$visualTransformation;
        C04610Ob r8 = this.$keyboardOptions;
        AnonymousClass0PT r7 = this.$keyboardActions;
        boolean z4 = this.$singleLine;
        int i = this.$maxLines;
        int i2 = this.$minLines;
        C17210uI r3 = this.$interactionSource;
        C16370s9 r2 = this.$shape;
        AnonymousClass0NY r1 = this.$colors;
        C17090tj r142 = r19;
        C16370s9 r152 = r2;
        C26224CvE cvE2 = cvE;
        EBO ebo2 = ebo;
        C22821Di r192 = r37;
        C17210uI r9 = r3;
        AnonymousClass0PT r10 = r7;
        C04610Ob r112 = r8;
        AnonymousClass0NY r122 = r1;
        AnonymousClass0L7.A00(r9, r10, r112, r122, r40, r142, r152, cvq, cvE2, ebo2, r192, r20, r21, r22, r15, r14, r12, r11, i, i2, AnonymousClass0L8.A00(this.$$changed), AnonymousClass0L8.A01(this.$$changed1), AnonymousClass0L8.A01(this.$$changed2), this.$$default, z, z2, z3, z4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
