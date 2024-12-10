package X;

/* renamed from: X.0jr  reason: invalid class name and case insensitive filesystem */
public final class C11330jr extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C27061DRh $lastValue;
    public final /* synthetic */ C16100ri $this_performFling;
    public final /* synthetic */ C27061DRh $velocityLeft;
    public final /* synthetic */ AnonymousClass0US this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11330jr(AnonymousClass0US r2, C16100ri r3, C27061DRh dRh, C27061DRh dRh2) {
        super(1);
        this.$lastValue = dRh;
        this.$this_performFling = r3;
        this.$velocityLeft = dRh2;
        this.this$0 = r2;
    }

    public final void A00(AnonymousClass0J2 r6) {
        C17330uU r4 = r6.A05;
        float A05 = AnonymousClass001.A05(r4) - this.$lastValue.element;
        float CH1 = this.$this_performFling.CH1(A05);
        this.$lastValue.element = AnonymousClass001.A05(r4);
        this.$velocityLeft.element = AnonymousClass000.A04(r6.A00());
        if (Math.abs(A05 - CH1) > 0.5f) {
            r6.A01();
        }
        this.this$0.A00++;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((AnonymousClass0J2) obj);
        return C27621Wu.A00;
    }
}
