package X;

/* renamed from: X.0o4  reason: invalid class name and case insensitive filesystem */
public final class C13850o4 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ float $animationProgress;
    public final /* synthetic */ AnonymousClass1OS $container;
    public final /* synthetic */ AnonymousClass1OS $label;
    public final /* synthetic */ AnonymousClass1OS $leading;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ AnonymousClass0tB $paddingValues;
    public final /* synthetic */ C36001nB $placeholder;
    public final /* synthetic */ AnonymousClass1OS $prefix;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ AnonymousClass1OS $suffix;
    public final /* synthetic */ AnonymousClass1OS $supporting;
    public final /* synthetic */ AnonymousClass1OS $textField;
    public final /* synthetic */ AnonymousClass1OS $trailing;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13850o4(AnonymousClass0tB r2, C17090tj r3, AnonymousClass1OS r4, AnonymousClass1OS r5, AnonymousClass1OS r6, AnonymousClass1OS r7, AnonymousClass1OS r8, AnonymousClass1OS r9, AnonymousClass1OS r10, AnonymousClass1OS r11, C36001nB r12, float f, int i, int i2, boolean z) {
        super(2);
        this.$modifier = r3;
        this.$textField = r4;
        this.$label = r5;
        this.$placeholder = r12;
        this.$leading = r6;
        this.$trailing = r7;
        this.$prefix = r8;
        this.$suffix = r9;
        this.$singleLine = z;
        this.$animationProgress = f;
        this.$container = r10;
        this.$supporting = r11;
        this.$paddingValues = r2;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public final void A00(C17130tn r20) {
        C17090tj r5 = this.$modifier;
        AnonymousClass1OS r6 = this.$textField;
        AnonymousClass1OS r7 = this.$label;
        C36001nB r14 = this.$placeholder;
        AnonymousClass1OS r8 = this.$leading;
        AnonymousClass1OS r9 = this.$trailing;
        AnonymousClass1OS r10 = this.$prefix;
        AnonymousClass1OS r11 = this.$suffix;
        boolean z = this.$singleLine;
        float f = this.$animationProgress;
        C17130tn r4 = r20;
        AnonymousClass0EG.A00(this.$paddingValues, r4, r5, r6, r7, r8, r9, r10, r11, this.$container, this.$supporting, r14, f, AnonymousClass0L8.A00(this.$$changed), AnonymousClass0L8.A01(this.$$changed1), z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
