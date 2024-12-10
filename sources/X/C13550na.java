package X;

/* renamed from: X.0na  reason: invalid class name and case insensitive filesystem */
public final class C13550na extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C24245By3 $direction;
    public final /* synthetic */ boolean $handlesCrossed;
    public final /* synthetic */ boolean $isStartHandle;
    public final /* synthetic */ C17090tj $modifier;
    public final /* synthetic */ C16250rx $offsetProvider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13550na(C16250rx r2, C17090tj r3, C24245By3 by3, int i, boolean z, boolean z2) {
        super(2);
        this.$offsetProvider = r2;
        this.$isStartHandle = z;
        this.$direction = by3;
        this.$handlesCrossed = z2;
        this.$modifier = r3;
        this.$$changed = i;
    }

    public final void A00(C17130tn r9) {
        C16250rx r1 = this.$offsetProvider;
        boolean z = this.$isStartHandle;
        C17130tn r2 = r9;
        AnonymousClass0Q8.A03(r1, r2, this.$modifier, this.$direction, AnonymousClass0L8.A00(this.$$changed), z, this.$handlesCrossed);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
