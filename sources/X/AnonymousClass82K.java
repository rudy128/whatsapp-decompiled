package X;

/* renamed from: X.82K  reason: invalid class name */
public final class AnonymousClass82K extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C30391dr $continuation;
    public final /* synthetic */ C22821Di $continueOnError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82K(C30391dr r2, C22821Di r3) {
        super(1);
        this.$continueOnError = r3;
        this.$continuation = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A6Z a6z = (A6Z) obj;
        C18070vi.A0d(a6z, 0);
        Boolean bool = (Boolean) this.$continueOnError.invoke(a6z);
        if (!bool.booleanValue()) {
            this.$continuation.resumeWith(C30691eM.A00(new C26941Uc(a6z)));
        }
        return bool;
    }
}
