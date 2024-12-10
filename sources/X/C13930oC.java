package X;

/* renamed from: X.0oC  reason: invalid class name and case insensitive filesystem */
public final class C13930oC extends AnonymousClass11G implements AnonymousClass1OS {
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
    public final /* synthetic */ AnonymousClass0PR $tmp0_rcvr;
    public final /* synthetic */ AnonymousClass1OS $trailingIcon;
    public final /* synthetic */ String $value;
    public final /* synthetic */ EBO $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13930oC(C16110rj r2, AnonymousClass0tB r3, AnonymousClass0PR r4, AnonymousClass0NY r5, EBO ebo, String str, AnonymousClass1OS r8, AnonymousClass1OS r9, AnonymousClass1OS r10, AnonymousClass1OS r11, AnonymousClass1OS r12, AnonymousClass1OS r13, AnonymousClass1OS r14, AnonymousClass1OS r15, AnonymousClass1OS r16, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2);
        this.$tmp0_rcvr = r4;
        this.$value = str;
        this.$innerTextField = r8;
        this.$enabled = z;
        this.$singleLine = z2;
        this.$visualTransformation = ebo;
        this.$interactionSource = r2;
        this.$isError = z3;
        this.$label = r9;
        this.$placeholder = r10;
        this.$leadingIcon = r11;
        this.$trailingIcon = r12;
        this.$prefix = r13;
        this.$suffix = r14;
        this.$supportingText = r15;
        this.$colors = r5;
        this.$contentPadding = r3;
        this.$container = r16;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public final void A00(C17130tn r34) {
        AnonymousClass0PR r32 = this.$tmp0_rcvr;
        String str = this.$value;
        AnonymousClass1OS r17 = this.$innerTextField;
        boolean z = this.$enabled;
        boolean z2 = this.$singleLine;
        EBO ebo = this.$visualTransformation;
        C16110rj r12 = this.$interactionSource;
        boolean z3 = this.$isError;
        AnonymousClass1OS r10 = this.$label;
        AnonymousClass1OS r9 = this.$placeholder;
        AnonymousClass1OS r8 = this.$leadingIcon;
        AnonymousClass1OS r7 = this.$trailingIcon;
        AnonymousClass1OS r6 = this.$prefix;
        AnonymousClass1OS r5 = this.$suffix;
        AnonymousClass1OS r4 = this.$supportingText;
        AnonymousClass0NY r3 = this.$colors;
        AnonymousClass0tB r2 = this.$contentPadding;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        AnonymousClass1OS r19 = r9;
        AnonymousClass1OS r20 = r8;
        AnonymousClass1OS r21 = r7;
        AnonymousClass1OS r22 = r6;
        AnonymousClass1OS r23 = r5;
        EBO ebo2 = ebo;
        String str2 = str;
        AnonymousClass1OS r18 = r10;
        AnonymousClass0PR r102 = r32;
        C16110rj r11 = r12;
        AnonymousClass0tB r122 = r2;
        AnonymousClass0NY r13 = r3;
        r102.A02(r11, r122, r13, r34, ebo2, str2, r17, r18, r19, r20, r21, r22, r23, r4, this.$container, AnonymousClass0L8.A00(this.$$changed), AnonymousClass0L8.A01(this.$$changed1), this.$$default, z4, z5, z6);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
