package X;

/* renamed from: X.0pq  reason: invalid class name and case insensitive filesystem */
public final class C14950pq extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ int $$dirty1;
    public final /* synthetic */ int $$dirty2;
    public final /* synthetic */ AnonymousClass0NY $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ boolean $isError;
    public final /* synthetic */ AnonymousClass1OS $label;
    public final /* synthetic */ AnonymousClass1OS $leadingIcon;
    public final /* synthetic */ AnonymousClass1OS $placeholder;
    public final /* synthetic */ AnonymousClass1OS $prefix;
    public final /* synthetic */ C16370s9 $shape;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ AnonymousClass1OS $suffix;
    public final /* synthetic */ AnonymousClass1OS $supportingText;
    public final /* synthetic */ AnonymousClass1OS $trailingIcon;
    public final /* synthetic */ C26224CvE $value;
    public final /* synthetic */ EBO $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14950pq(C17210uI r2, AnonymousClass0NY r3, C16370s9 r4, C26224CvE cvE, EBO ebo, AnonymousClass1OS r7, AnonymousClass1OS r8, AnonymousClass1OS r9, AnonymousClass1OS r10, AnonymousClass1OS r11, AnonymousClass1OS r12, AnonymousClass1OS r13, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(3);
        this.$value = cvE;
        this.$enabled = z;
        this.$singleLine = z2;
        this.$visualTransformation = ebo;
        this.$interactionSource = r2;
        this.$isError = z3;
        this.$label = r7;
        this.$placeholder = r8;
        this.$leadingIcon = r9;
        this.$trailingIcon = r10;
        this.$prefix = r11;
        this.$suffix = r12;
        this.$supportingText = r13;
        this.$colors = r3;
        this.$$dirty = i;
        this.$$dirty1 = i2;
        this.$$dirty2 = i3;
        this.$shape = r4;
    }

    public final void A00(C17130tn r40, AnonymousClass1OS r41, int i) {
        AnonymousClass1OS r6 = r41;
        C18070vi.A0d(r6, 0);
        C17130tn r7 = r40;
        if ((i & 14) == 0) {
            i |= AnonymousClass001.A0a(r7, r6);
        }
        if ((i & 91) != 18 || !r7.BZO()) {
            AnonymousClass0PR r16 = AnonymousClass0PR.A00;
            String A04 = this.$value.A04();
            boolean z = this.$enabled;
            boolean z2 = this.$singleLine;
            EBO ebo = this.$visualTransformation;
            C17210uI r38 = this.$interactionSource;
            boolean z3 = this.$isError;
            AnonymousClass1OS r15 = this.$label;
            AnonymousClass1OS r14 = this.$placeholder;
            AnonymousClass1OS r13 = this.$leadingIcon;
            AnonymousClass1OS r5 = this.$trailingIcon;
            AnonymousClass1OS r4 = this.$prefix;
            AnonymousClass1OS r3 = this.$suffix;
            AnonymousClass1OS r2 = this.$supportingText;
            AnonymousClass0NY r1 = this.$colors;
            AnonymousClass04D A00 = AnonymousClass0LC.A00(r7, new C12950ma(r38, r1, this.$shape, this.$$dirty, this.$$dirty1, this.$$dirty2, z, z3), 255570733);
            int i2 = this.$$dirty;
            int i3 = this.$$dirty1;
            int i4 = this.$$dirty2;
            int i5 = i2 << 3;
            AnonymousClass1OS r26 = r13;
            AnonymousClass1OS r27 = r5;
            AnonymousClass1OS r28 = r4;
            AnonymousClass1OS r29 = r3;
            AnonymousClass1OS r30 = r2;
            boolean z4 = z;
            boolean z5 = z2;
            boolean z6 = z3;
            AnonymousClass0NY r19 = r1;
            C17130tn r20 = r7;
            AnonymousClass1OS r23 = r6;
            AnonymousClass1OS r24 = r15;
            AnonymousClass1OS r25 = r14;
            C17210uI r17 = r38;
            r16.A02(r17, (AnonymousClass0tB) null, r19, r20, ebo, A04, r23, r24, r25, r26, r27, r28, r29, r30, A00, ((i << 3) & 112) | ((i2 >> 3) & 896) | ((i3 >> 12) & 7168) | (i3 & 57344) | ((i4 << 15) & 458752) | ((i3 << 9) & 3670016) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), AnonymousClass001.A0F(i3 << 3, ((i2 >> 27) & 14) | 14155776) | ((i4 << 6) & 57344), 32768, z4, z5, z6);
            return;
        }
        r7.CNR();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        A00((C17130tn) obj2, (AnonymousClass1OS) obj, AnonymousClass000.A0M(obj3));
        return C27621Wu.A00;
    }
}
