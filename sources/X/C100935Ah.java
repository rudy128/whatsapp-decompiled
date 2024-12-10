package X;

/* renamed from: X.5Ah  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100935Ah extends AnonymousClass1JJ implements C22821Di {
    public final /* synthetic */ C30391dr $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100935Ah(C30391dr r7) {
        super(1, AnonymousClass4I1.class, "dataHandler", "invoke$dataHandler(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 0);
        this.$continuation = r7;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.$continuation.resumeWith(obj);
        return C27621Wu.A00;
    }
}
