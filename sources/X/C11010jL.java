package X;

/* renamed from: X.0jL  reason: invalid class name and case insensitive filesystem */
public final class C11010jL extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C31761g5 $co;
    public final /* synthetic */ C03560It this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11010jL(C03560It r2, C31761g5 r3) {
        super(1);
        this.this$0 = r2;
        this.$co = r3;
    }

    public final void A00() {
        C03560It r0 = this.this$0;
        Object obj = r0.A03;
        C31761g5 r1 = this.$co;
        synchronized (obj) {
            r0.A00.remove(r1);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00();
        return C27621Wu.A00;
    }
}
