package X;

/* renamed from: X.7wT  reason: invalid class name */
public final class AnonymousClass7wT extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C1606789m $fbUserEntityOperationCallback;
    public final /* synthetic */ C122936Sm $iqResponseErrorException;
    public final /* synthetic */ AnonymousClass705 $operationRetryState;
    public final /* synthetic */ Runnable $retryRunnable;
    public final /* synthetic */ C129576i1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wT(C129576i1 r2, C1606789m r3, AnonymousClass705 r4, C122936Sm r5, Runnable runnable) {
        super(0);
        this.this$0 = r2;
        this.$retryRunnable = runnable;
        this.$iqResponseErrorException = r5;
        this.$fbUserEntityOperationCallback = r3;
        this.$operationRetryState = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Runnable runnable = this.$retryRunnable;
        C122936Sm r2 = this.$iqResponseErrorException;
        C1606789m r1 = this.$fbUserEntityOperationCallback;
        if (this.$operationRetryState.A04()) {
            runnable.run();
        } else {
            r1.Bsw(r2);
        }
        return C27621Wu.A00;
    }
}
