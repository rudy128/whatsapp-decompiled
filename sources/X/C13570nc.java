package X;

/* renamed from: X.0nc  reason: invalid class name and case insensitive filesystem */
public final class C13570nc extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass0JY $border;
    public final /* synthetic */ C03530Iq $colors;
    public final /* synthetic */ C36001nB $content;
    public final /* synthetic */ AnonymousClass0KM $elevation;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C16370s9 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13570nc(AnonymousClass0JY r2, C03530Iq r3, AnonymousClass0KM r4, C17090tj r5, C16370s9 r6, C36001nB r7, int i, int i2) {
        super(2);
        this.$modifier = r5;
        this.$shape = r6;
        this.$colors = r3;
        this.$elevation = r4;
        this.$border = r2;
        this.$content = r7;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void A00(C17130tn r11) {
        C17090tj r5 = this.$modifier;
        C16370s9 r6 = this.$shape;
        AnonymousClass0EC.A00(this.$border, this.$colors, this.$elevation, r11, r5, r6, this.$content, AnonymousClass0L8.A00(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
