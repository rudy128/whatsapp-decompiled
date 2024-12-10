package X;

/* renamed from: X.DtC  reason: case insensitive filesystem */
public final class C28194DtC extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $hasPermission;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C18090vk $onOpenPermissionClick;
    public final /* synthetic */ C18090vk $onShareLinkClick;
    public final /* synthetic */ boolean $shouldHideShareLink;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28194DtC(C17090tj r2, C18090vk r3, C18090vk r4, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.$hasPermission = z;
        this.$onShareLinkClick = r3;
        this.$onOpenPermissionClick = r4;
        this.$modifier = r2;
        this.$shouldHideShareLink = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C17130tn A0b = AnonymousClass000.A0b(obj, obj2);
        boolean z = this.$hasPermission;
        C18090vk r3 = this.$onShareLinkClick;
        C18090vk r4 = this.$onOpenPermissionClick;
        C24639CCz.A00(A0b, this.$modifier, r3, r4, AnonymousClass0L8.A00(this.$$changed), this.$$default, z, this.$shouldHideShareLink);
        return C27621Wu.A00;
    }
}
