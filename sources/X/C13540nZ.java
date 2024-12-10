package X;

/* renamed from: X.0nZ  reason: invalid class name and case insensitive filesystem */
public final class C13540nZ extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C18090vk $itemProvider;
    public final /* synthetic */ AnonymousClass1OS $measurePolicy;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ AnonymousClass0H3 $prefetchState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13540nZ(AnonymousClass0H3 r2, C17090tj r3, C18090vk r4, AnonymousClass1OS r5, int i, int i2) {
        super(2);
        this.$itemProvider = r4;
        this.$modifier = r3;
        this.$prefetchState = r2;
        this.$measurePolicy = r5;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void A00(C17130tn r9) {
        C18090vk r4 = this.$itemProvider;
        C17130tn r2 = r9;
        C02330Dp.A00(this.$prefetchState, r2, this.$modifier, r4, this.$measurePolicy, AnonymousClass0L8.A00(this.$$changed), this.$$default);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
