package X;

/* renamed from: X.0it  reason: invalid class name and case insensitive filesystem */
public final class C10780it extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $readObserver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10780it(C22821Di r2) {
        super(1);
        this.$readObserver = r2;
    }

    /* renamed from: A00 */
    public final AnonymousClass08J invoke(C06400Ye r4) {
        int i;
        synchronized (C05200Qx.A08) {
            i = C05200Qx.A00;
            C05200Qx.A00 = i + 1;
        }
        return new AnonymousClass08J(r4, this.$readObserver, i);
    }
}
