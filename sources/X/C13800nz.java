package X;

/* renamed from: X.0nz  reason: invalid class name and case insensitive filesystem */
public final class C13800nz extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AnonymousClass0JY $border;
    public final /* synthetic */ AnonymousClass0Ip $colors;
    public final /* synthetic */ C36001nB $content;
    public final /* synthetic */ AnonymousClass0tB $contentPadding;
    public final /* synthetic */ AnonymousClass0NL $elevation;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C18090vk $onClick;
    public final /* synthetic */ C16370s9 $shape;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13800nz(AnonymousClass0JY r2, C17210uI r3, AnonymousClass0tB r4, AnonymousClass0Ip r5, AnonymousClass0NL r6, C17090tj r7, C16370s9 r8, C18090vk r9, C36001nB r10, int i, int i2, boolean z) {
        super(2);
        this.$onClick = r9;
        this.$modifier = r7;
        this.$enabled = z;
        this.$shape = r8;
        this.$colors = r5;
        this.$elevation = r6;
        this.$border = r2;
        this.$contentPadding = r4;
        this.$interactionSource = r3;
        this.$content = r10;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void A00(C17130tn r15) {
        C18090vk r9 = this.$onClick;
        C17090tj r7 = this.$modifier;
        boolean z = this.$enabled;
        C16370s9 r8 = this.$shape;
        AnonymousClass0Ip r4 = this.$colors;
        AnonymousClass0NL r5 = this.$elevation;
        C04440Nk.A01(this.$border, this.$interactionSource, this.$contentPadding, r4, r5, r15, r7, r8, r9, this.$content, AnonymousClass0L8.A00(this.$$changed), this.$$default, z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
