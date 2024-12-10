package X;

public final class B1Q extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $callback = null;
    public final /* synthetic */ String $token;
    public final /* synthetic */ C62312rC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1Q(C62312rC r2, String str) {
        super(1);
        this.this$0 = r2;
        this.$token = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C62312rC r2 = this.this$0;
        String str = this.$token;
        synchronized (r2) {
            r2.A04.remove(str);
        }
        C22821Di r1 = this.$callback;
        if (r1 != null) {
            r1.invoke(this.$token);
        }
        return C27621Wu.A00;
    }
}
