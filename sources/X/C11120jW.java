package X;

/* renamed from: X.0jW  reason: invalid class name and case insensitive filesystem */
public final class C11120jW extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C16100ri $$this$scroll;
    public final /* synthetic */ AnonymousClass1OB $animationJob;
    public final /* synthetic */ AnonymousClass092 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11120jW(AnonymousClass092 r2, C16100ri r3, AnonymousClass1OB r4) {
        super(1);
        this.this$0 = r2;
        this.$$this$scroll = r3;
        this.$animationJob = r4;
    }

    public final void A00(float f) {
        float f2 = -1.0f;
        if (this.this$0.A06) {
            f2 = 1.0f;
        }
        float CH1 = f2 * this.$$this$scroll.CH1(f2 * f);
        if (Math.abs(CH1) < Math.abs(f)) {
            AnonymousClass1OB r2 = this.$animationJob;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Scroll animation cancelled because scroll was not consumed (");
            A10.append(CH1);
            A10.append(" < ");
            C62892sA.A02(AnonymousClass001.A1K(A10, f), r2);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(AnonymousClass000.A04(obj));
        return C27621Wu.A00;
    }
}
