package X;

public final class B1B extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22526BBj $callback;
    public final /* synthetic */ AnonymousClass9C2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1B(C22526BBj bBj, AnonymousClass9C2 r3) {
        super(1);
        this.$callback = bBj;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C18070vi.A0d(th, 0);
        C22526BBj bBj = this.$callback;
        if (bBj != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "extensions-data-exchange-graphql-response-error";
            }
            String message2 = th.getMessage();
            this.this$0.A03.get();
            bBj.BAh(message, message2, C20052A4y.A00(((C20052A4y) this.this$0.A03.get()).A02(), (String) null));
        }
        return C27621Wu.A00;
    }
}
