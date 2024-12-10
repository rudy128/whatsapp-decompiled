package X;

public final class Dm3 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Throwable $cause;
    public final /* synthetic */ C26127Csp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dm3(C26127Csp csp, Throwable th) {
        super(0);
        this.this$0 = csp;
        this.$cause = th;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        if (AnonymousClass8BV.A1Z(this.this$0.A0D)) {
            Throwable th = this.$cause;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Device link failed ");
            C26294Cx6.A0A("lam:LinkedDevice", C17890vO.A0V(this.this$0.A0B, A10), th);
            Throwable th2 = this.$cause;
            if (th2 instanceof C24202BxE) {
                C26127Csp csp = this.this$0;
                csp.A0G.invoke(csp.A0C, th2);
            }
        }
        return C27621Wu.A00;
    }
}
