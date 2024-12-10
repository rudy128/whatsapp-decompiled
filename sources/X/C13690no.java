package X;

/* renamed from: X.0no  reason: invalid class name and case insensitive filesystem */
public final class C13690no extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ AnonymousClass0J3 $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C17210uI $interactionSource;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C22821Di $onCheckedChange;
    public final /* synthetic */ AnonymousClass1OS $thumbContent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13690no(C17210uI r2, AnonymousClass0J3 r3, C17090tj r4, C22821Di r5, AnonymousClass1OS r6, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.$checked = z;
        this.$onCheckedChange = r5;
        this.$modifier = r4;
        this.$thumbContent = r6;
        this.$enabled = z2;
        this.$colors = r3;
        this.$interactionSource = r2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void A00(C17130tn r12) {
        boolean z = this.$checked;
        C22821Di r5 = this.$onCheckedChange;
        C17090tj r4 = this.$modifier;
        AnonymousClass1OS r6 = this.$thumbContent;
        boolean z2 = this.$enabled;
        AnonymousClass0QL.A06(this.$interactionSource, this.$colors, r12, r4, r5, r6, AnonymousClass0L8.A00(this.$$changed), this.$$default, z, z2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
