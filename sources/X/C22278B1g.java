package X;

/* renamed from: X.B1g  reason: case insensitive filesystem */
public final class C22278B1g extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26981Ug $callbackFuture;
    public final /* synthetic */ C194459rl $processingParameters;
    public final /* synthetic */ String $queryContext;
    public final /* synthetic */ C186769ej this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22278B1g(C194459rl r2, C186769ej r3, C26981Ug r4, String str) {
        super(1);
        this.this$0 = r3;
        this.$queryContext = str;
        this.$processingParameters = r2;
        this.$callbackFuture = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1193567u A0S = C108955ca.A0S(obj);
        C186769ej r2 = this.this$0;
        String str = this.$queryContext;
        C194459rl r1 = this.$processingParameters;
        C26981Ug r4 = this.$callbackFuture;
        A0S.A00 = new C22283B1l(r1, r2, A0S, r4, str);
        A0S.A01 = new C22196AzC(r4);
        return C27621Wu.A00;
    }
}
