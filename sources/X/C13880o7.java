package X;

/* renamed from: X.0o7  reason: invalid class name and case insensitive filesystem */
public final class C13880o7 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ float $animationProgress;
    public final /* synthetic */ AnonymousClass1OS $container;
    public final /* synthetic */ AnonymousClass1OS $label;
    public final /* synthetic */ AnonymousClass1OS $leading;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C22821Di $onLabelMeasured;
    public final /* synthetic */ AnonymousClass0tB $paddingValues;
    public final /* synthetic */ C36001nB $placeholder;
    public final /* synthetic */ AnonymousClass1OS $prefix;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ AnonymousClass1OS $suffix;
    public final /* synthetic */ AnonymousClass1OS $supporting;
    public final /* synthetic */ AnonymousClass1OS $textField;
    public final /* synthetic */ AnonymousClass1OS $trailing;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13880o7(AnonymousClass0tB r2, C17090tj r3, C22821Di r4, AnonymousClass1OS r5, AnonymousClass1OS r6, AnonymousClass1OS r7, AnonymousClass1OS r8, AnonymousClass1OS r9, AnonymousClass1OS r10, AnonymousClass1OS r11, AnonymousClass1OS r12, C36001nB r13, float f, int i, int i2, boolean z) {
        super(2);
        this.$modifier = r3;
        this.$textField = r5;
        this.$placeholder = r13;
        this.$label = r6;
        this.$leading = r7;
        this.$trailing = r8;
        this.$prefix = r9;
        this.$suffix = r10;
        this.$singleLine = z;
        this.$animationProgress = f;
        this.$onLabelMeasured = r4;
        this.$container = r11;
        this.$supporting = r12;
        this.$paddingValues = r2;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public final void A00(C17130tn r33) {
        C17090tj r12 = this.$modifier;
        AnonymousClass1OS r11 = this.$textField;
        C36001nB r10 = this.$placeholder;
        AnonymousClass1OS r9 = this.$label;
        AnonymousClass1OS r8 = this.$leading;
        AnonymousClass1OS r7 = this.$trailing;
        AnonymousClass1OS r6 = this.$prefix;
        AnonymousClass1OS r5 = this.$suffix;
        boolean z = this.$singleLine;
        float f = this.$animationProgress;
        C22821Di r2 = this.$onLabelMeasured;
        AnonymousClass1OS r1 = this.$container;
        C36001nB r27 = r10;
        AnonymousClass1OS r26 = this.$supporting;
        AnonymousClass1OS r25 = r1;
        AnonymousClass1OS r24 = r5;
        AnonymousClass1OS r23 = r6;
        AnonymousClass1OS r22 = r7;
        AnonymousClass1OS r21 = r8;
        AnonymousClass1OS r20 = r9;
        AnonymousClass1OS r19 = r11;
        C22821Di r18 = r2;
        C17090tj r17 = r12;
        AnonymousClass0L7.A01(this.$paddingValues, r33, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, f, AnonymousClass0L8.A00(this.$$changed), AnonymousClass0L8.A01(this.$$changed1), z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
