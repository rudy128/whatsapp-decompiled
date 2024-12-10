package X;

/* renamed from: X.0jX  reason: invalid class name and case insensitive filesystem */
public final class C11130jX extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C108495bn $channel;
    public final /* synthetic */ boolean $reverseDirection = false;
    public final /* synthetic */ AnonymousClass0K4 $velocityTracker;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11130jX(AnonymousClass0K4 r2, C108495bn r3) {
        super(1);
        this.$velocityTracker = r2;
        this.$channel = r3;
    }

    public final void A00(AnonymousClass0KX r5) {
        AnonymousClass0M5.A00(r5, this.$velocityTracker);
        if (!AnonymousClass0Oz.A01(r5)) {
            long A04 = AnonymousClass0QY.A04(r5.A06, r5.A07);
            if (r5.A02()) {
                A04 = AnonymousClass0QY.A03;
            }
            r5.A01();
            C108495bn r3 = this.$channel;
            if (this.$reverseDirection) {
                A04 = AnonymousClass0QY.A03(-1.0f, A04);
            }
            r3.CQ0(new AnonymousClass07D(A04));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((AnonymousClass0KX) obj);
        return C27621Wu.A00;
    }
}
