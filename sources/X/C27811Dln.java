package X;

/* renamed from: X.Dln  reason: case insensitive filesystem */
public final class C27811Dln extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24202BxE $protocolException;
    public final /* synthetic */ BXO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27811Dln(C24202BxE bxE, BXO bxo) {
        super(0);
        this.this$0 = bxo;
        this.$protocolException = bxE;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C24712CGy.A01.A07("sup:MediaStreamServiceAtcStateDelegate", "[MEDIA_STREAM_SERVICE]: handleChannelError", this.$protocolException);
        C25838Cms cms = this.this$0.A00.A0J;
        if (cms != null) {
            cms.A04("failure_reason", "media_stream_service_connection_request_failure");
        }
        C25838Cms cms2 = this.this$0.A00.A0J;
        if (cms2 != null) {
            cms2.A01(3);
        }
        this.this$0.A00.A0C(new C22951BWx("MEDIA_STREAM_SERVICE_CONNECTION_FAIL"), this.$protocolException, true);
        return C27621Wu.A00;
    }
}
