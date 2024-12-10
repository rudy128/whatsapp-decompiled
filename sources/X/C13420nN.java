package X;

/* renamed from: X.0nN  reason: invalid class name and case insensitive filesystem */
public final class C13420nN extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C24245By3 $direction;
    public final /* synthetic */ boolean $isStartHandle;
    public final /* synthetic */ C05120Qm $manager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13420nN(C05120Qm r2, C24245By3 by3, int i, boolean z) {
        super(2);
        this.$isStartHandle = z;
        this.$direction = by3;
        this.$manager = r2;
        this.$$changed = i;
    }

    public final void A00(C17130tn r5) {
        boolean z = this.$isStartHandle;
        AnonymousClass0L5.A00(this.$manager, r5, this.$direction, AnonymousClass0L8.A00(this.$$changed), z);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
