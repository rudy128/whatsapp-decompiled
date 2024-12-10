package X;

/* renamed from: X.0jP  reason: invalid class name and case insensitive filesystem */
public final class C11050jP extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $parentObserver;
    public final /* synthetic */ C22821Di $readObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11050jP(C22821Di r2, C22821Di r3) {
        super(1);
        this.$readObserver = r2;
        this.$parentObserver = r3;
    }

    public final void A00(Object obj) {
        this.$readObserver.invoke(obj);
        this.$parentObserver.invoke(obj);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(obj);
        return C27621Wu.A00;
    }
}
