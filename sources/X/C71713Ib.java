package X;

/* renamed from: X.3Ib  reason: invalid class name and case insensitive filesystem */
public final class C71713Ib extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Runnable $block;
    public final /* synthetic */ AnonymousClass1IT this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71713Ib(Runnable runnable, AnonymousClass1IT r3) {
        super(1);
        this.this$0 = r3;
        this.$block = runnable;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A00.removeCallbacks(this.$block);
        return C27621Wu.A00;
    }
}
