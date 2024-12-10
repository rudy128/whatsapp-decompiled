package X;

/* renamed from: X.0nd  reason: invalid class name and case insensitive filesystem */
public final class C13580nd extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C03540Ir $colors;
    public final /* synthetic */ AnonymousClass1OS $content;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C18090vk $onClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13580nd(C17210uI r2, C03540Ir r3, C17090tj r4, C18090vk r5, AnonymousClass1OS r6, int i, int i2, boolean z) {
        super(2);
        this.$onClick = r5;
        this.$modifier = r4;
        this.$enabled = z;
        this.$colors = r3;
        this.$interactionSource = r2;
        this.$content = r6;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void A00(C17130tn r11) {
        C18090vk r5 = this.$onClick;
        C17090tj r4 = this.$modifier;
        boolean z = this.$enabled;
        AnonymousClass0L6.A01(this.$interactionSource, this.$colors, r11, r4, r5, this.$content, AnonymousClass0L8.A00(this.$$changed), this.$$default, z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
