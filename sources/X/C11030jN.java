package X;

/* renamed from: X.0jN  reason: invalid class name and case insensitive filesystem */
public final class C11030jN extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $readObserver;
    public final /* synthetic */ C22821Di $writeObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11030jN(C22821Di r2, C22821Di r3) {
        super(1);
        this.$readObserver = r2;
        this.$writeObserver = r3;
    }

    /* renamed from: A00 */
    public final AnonymousClass08M invoke(C06400Ye r5) {
        int i;
        synchronized (C05200Qx.A08) {
            i = C05200Qx.A00;
            C05200Qx.A00 = i + 1;
        }
        return new AnonymousClass08M(r5, this.$readObserver, this.$writeObserver, i);
    }
}
