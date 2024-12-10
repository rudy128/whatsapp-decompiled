package X;

/* renamed from: X.0oD  reason: invalid class name and case insensitive filesystem */
public final class C13940oD extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass0NY $colors;
    public final /* synthetic */ AnonymousClass1OS $container;
    public final /* synthetic */ AnonymousClass0tB $contentPadding;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ AnonymousClass1OS $innerTextField;
    public final /* synthetic */ C16110rj $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ AnonymousClass1OS $label;
    public final /* synthetic */ AnonymousClass1OS $leadingIcon;
    public final /* synthetic */ AnonymousClass1OS $placeholder;
    public final /* synthetic */ AnonymousClass1OS $prefix;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ AnonymousClass1OS $suffix;
    public final /* synthetic */ AnonymousClass1OS $supportingText;
    public final /* synthetic */ AnonymousClass1OS $trailingIcon;
    public final /* synthetic */ AnonymousClass0CJ $type;
    public final /* synthetic */ String $value;
    public final /* synthetic */ EBO $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13940oD(C16110rj r2, AnonymousClass0tB r3, AnonymousClass0NY r4, AnonymousClass0CJ r5, EBO ebo, String str, AnonymousClass1OS r8, AnonymousClass1OS r9, AnonymousClass1OS r10, AnonymousClass1OS r11, AnonymousClass1OS r12, AnonymousClass1OS r13, AnonymousClass1OS r14, AnonymousClass1OS r15, AnonymousClass1OS r16, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2);
        this.$type = r5;
        this.$value = str;
        this.$innerTextField = r8;
        this.$visualTransformation = ebo;
        this.$label = r9;
        this.$placeholder = r10;
        this.$leadingIcon = r11;
        this.$trailingIcon = r12;
        this.$prefix = r13;
        this.$suffix = r14;
        this.$supportingText = r15;
        this.$singleLine = z;
        this.$enabled = z2;
        this.$isError = z3;
        this.$interactionSource = r2;
        this.$contentPadding = r3;
        this.$colors = r4;
        this.$container = r16;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public final void A00(C17130tn r36) {
        AnonymousClass0CJ r34 = this.$type;
        String str = this.$value;
        AnonymousClass1OS r19 = this.$innerTextField;
        EBO ebo = this.$visualTransformation;
        AnonymousClass1OS r15 = this.$label;
        AnonymousClass1OS r13 = this.$placeholder;
        AnonymousClass1OS r12 = this.$leadingIcon;
        AnonymousClass1OS r11 = this.$trailingIcon;
        AnonymousClass1OS r10 = this.$prefix;
        AnonymousClass1OS r9 = this.$suffix;
        AnonymousClass1OS r8 = this.$supportingText;
        boolean z = this.$singleLine;
        boolean z2 = this.$enabled;
        boolean z3 = this.$isError;
        C16110rj r4 = this.$interactionSource;
        AnonymousClass0tB r3 = this.$contentPadding;
        AnonymousClass0NY r2 = this.$colors;
        AnonymousClass1OS r21 = r13;
        AnonymousClass1OS r22 = r12;
        AnonymousClass1OS r23 = r11;
        AnonymousClass1OS r24 = r10;
        AnonymousClass1OS r25 = r9;
        AnonymousClass1OS r20 = r15;
        C16110rj r122 = r4;
        AnonymousClass0tB r132 = r3;
        AnonymousClass0NY r14 = r2;
        AnonymousClass0CJ r152 = r34;
        AnonymousClass0PE.A01(r122, r132, r14, r152, r36, ebo, str, r19, r20, r21, r22, r23, r24, r25, r8, this.$container, AnonymousClass0L8.A00(this.$$changed), AnonymousClass0L8.A01(this.$$changed1), this.$$default, z, z2, z3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
