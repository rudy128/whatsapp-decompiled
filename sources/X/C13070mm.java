package X;

/* renamed from: X.0mm  reason: invalid class name and case insensitive filesystem */
public final class C13070mm extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C16100ri $$this$scroll;
    public final /* synthetic */ C27061DRh $previousValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13070mm(C16100ri r2, C27061DRh dRh) {
        super(2);
        this.$previousValue = dRh;
        this.$$this$scroll = r2;
    }

    public final void A00(float f) {
        C27061DRh dRh = this.$previousValue;
        float f2 = dRh.element;
        dRh.element = f2 + this.$$this$scroll.CH1(f - f2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        float A04 = AnonymousClass000.A04(obj);
        ((Number) obj2).floatValue();
        A00(A04);
        return C27621Wu.A00;
    }
}
