package X;

/* renamed from: X.82L  reason: invalid class name */
public final class AnonymousClass82L extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C30391dr $continuation;
    public final /* synthetic */ C22821Di $continueOnError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82L(C30391dr r2, C22821Di r3) {
        super(1);
        this.$continuation = r2;
        this.$continueOnError = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1193567u A0S = C108955ca.A0S(obj);
        C30391dr r2 = this.$continuation;
        A0S.A00 = new AnonymousClass803(r2);
        A0S.A01 = new AnonymousClass82K(r2, this.$continueOnError);
        return C27621Wu.A00;
    }
}
