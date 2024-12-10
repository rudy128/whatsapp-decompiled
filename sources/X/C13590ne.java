package X;

/* renamed from: X.0ne  reason: invalid class name and case insensitive filesystem */
public final class C13590ne extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C03550Is $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C18090vk $onClick;
    public final /* synthetic */ boolean $selected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13590ne(C17210uI r2, C03550Is r3, C17090tj r4, C18090vk r5, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.$selected = z;
        this.$onClick = r5;
        this.$modifier = r4;
        this.$enabled = z2;
        this.$colors = r3;
        this.$interactionSource = r2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void A00(C17130tn r11) {
        boolean z = this.$selected;
        C18090vk r5 = this.$onClick;
        C17090tj r4 = this.$modifier;
        boolean z2 = this.$enabled;
        AnonymousClass0EE.A00(this.$interactionSource, this.$colors, r11, r4, r5, AnonymousClass0L8.A00(this.$$changed), this.$$default, z, z2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
