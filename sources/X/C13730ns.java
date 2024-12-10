package X;

/* renamed from: X.0ns  reason: invalid class name and case insensitive filesystem */
public final class C13730ns extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass0JY $border;
    public final /* synthetic */ C03540Ir $colors;
    public final /* synthetic */ AnonymousClass1OS $content;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C18090vk $onClick;
    public final /* synthetic */ C16370s9 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13730ns(AnonymousClass0JY r2, C17210uI r3, C03540Ir r4, C17090tj r5, C16370s9 r6, C18090vk r7, AnonymousClass1OS r8, int i, int i2, boolean z) {
        super(2);
        this.$onClick = r7;
        this.$modifier = r5;
        this.$enabled = z;
        this.$shape = r6;
        this.$colors = r4;
        this.$border = r2;
        this.$interactionSource = r3;
        this.$content = r8;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void A00(C17130tn r13) {
        C18090vk r7 = this.$onClick;
        C17090tj r5 = this.$modifier;
        boolean z = this.$enabled;
        C16370s9 r6 = this.$shape;
        AnonymousClass0L6.A00(this.$border, this.$interactionSource, this.$colors, r13, r5, r6, r7, this.$content, AnonymousClass0L8.A00(this.$$changed), this.$$default, z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
