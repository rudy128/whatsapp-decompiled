package X;

/* renamed from: X.Dlr  reason: case insensitive filesystem */
public final class C27815Dlr extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Throwable $throwable;
    public final /* synthetic */ BXN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27815Dlr(BXN bxn, Throwable th) {
        super(0);
        this.this$0 = bxn;
        this.$throwable = th;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C24712CGy.A01.A06("sup:SNAppManagerStateDelegate", "[SN_APP_MANAGER] SNAM shutdown with exception", this.$throwable);
        this.this$0.A01.A0C(new C22951BWx("SNAM_SHUTDOWN_ERROR"), this.$throwable, false);
        return C27621Wu.A00;
    }
}
