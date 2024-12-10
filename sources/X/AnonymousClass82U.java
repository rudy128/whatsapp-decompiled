package X;

/* renamed from: X.82U  reason: invalid class name */
public final class AnonymousClass82U extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass7K8 $observer;
    public final /* synthetic */ C132876nm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82U(AnonymousClass7K8 r2, C132876nm r3) {
        super(1);
        this.this$0 = r3;
        this.$observer = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A00.unregisterObserver(this.$observer);
        return C27621Wu.A00;
    }
}
