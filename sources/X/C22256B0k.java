package X;

/* renamed from: X.B0k  reason: case insensitive filesystem */
public final class C22256B0k extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C33781jN $callback;
    public final /* synthetic */ C179329Hn $requestType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22256B0k(C179329Hn r2, C33781jN r3) {
        super(1);
        this.$requestType = r2;
        this.$callback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1193567u A0S = C108955ca.A0S(obj);
        C179329Hn r2 = this.$requestType;
        C33781jN r1 = this.$callback;
        A0S.A00 = new C22254B0i(r2, r1);
        A0S.A01 = new C22255B0j(r2, r1);
        return C27621Wu.A00;
    }
}
