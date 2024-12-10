package X;

import com.facebook.wearable.datax.LocalChannel;

/* renamed from: X.Dh2  reason: case insensitive filesystem */
public final class C27535Dh2 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BXO this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27535Dh2(BXO bxo) {
        super(0);
        this.this$0 = bxo;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C26127Csp csp;
        C24810CLd cLd;
        C27535Dh2.super.A07();
        BXO bxo = this.this$0;
        BQm bQm = bxo.A00;
        C25258Cbx cbx = bQm.A00;
        C25838Cms cms = bQm.A0J;
        if (cms != null) {
            cms.A03("media_stream_service_connection_request");
        }
        C22871BTf bTf = cbx.A04;
        if (bTf == null || (csp = bTf.A00) == null || (cLd = csp.A09) == null) {
            C24712CGy.A01.A06("sup:MediaStreamServiceAtcStateDelegate", "[MEDIA_STREAM_SERVICE]: Unable to create local channel for media streaming", (Throwable) null);
            bxo.A00.A0C(new C22951BWx("MEDIA_STREAM_SERVICE_CHANNEL_NOT_CREATED"), (Throwable) null, true);
        } else {
            LocalChannel localChannel = new LocalChannel(cLd.A00.A07, 51350);
            localChannel.onReceived = new C27954Doq(bxo);
            localChannel.onClosed = new C27534Dh1(bxo);
            localChannel.onError = new C27955Dor(bxo);
            cbx.A02 = localChannel;
            BQm bQm2 = bxo.A00;
            C25838Cms cms2 = bQm2.A0J;
            if (cms2 != null) {
                cms2.A03("media_stream_service_connected");
            }
            bQm2.A04(new BXR(bQm2.A07()));
        }
        return C27621Wu.A00;
    }
}
