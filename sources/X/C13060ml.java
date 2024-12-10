package X;

/* renamed from: X.0ml  reason: invalid class name and case insensitive filesystem */
public final class C13060ml extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C98484rE $initialDelta;
    public final /* synthetic */ AnonymousClass0K4 $velocityTracker;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13060ml(AnonymousClass0K4 r2, C98484rE r3) {
        super(2);
        this.$velocityTracker = r2;
        this.$initialDelta = r3;
    }

    public final void A00(AnonymousClass0KX r2, long j) {
        AnonymousClass0M5.A00(r2, this.$velocityTracker);
        r2.A01();
        this.$initialDelta.element = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00((AnonymousClass0KX) obj, ((AnonymousClass0QY) obj2).A00);
        return C27621Wu.A00;
    }
}
