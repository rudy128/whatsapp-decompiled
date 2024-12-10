package X;

/* renamed from: X.5Ai  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100945Ai extends AnonymousClass1JJ implements C22821Di {
    public final /* synthetic */ C30391dr $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100945Ai(C30391dr r7) {
        super(1, AnonymousClass4I1.class, "errorHandler", "invoke$errorHandler(Lkotlin/coroutines/Continuation;Lcom/whatsapp/infra/graphql/error/MexErrorSummary;)Z", 0);
        this.$continuation = r7;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A6Z a6z = (A6Z) obj;
        C18070vi.A0d(a6z, 0);
        this.$continuation.resumeWith(C30691eM.A00(new C99714tL(a6z)));
        return false;
    }
}
