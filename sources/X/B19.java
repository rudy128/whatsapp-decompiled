package X;

import com.whatsapp.util.Log;

public final class B19 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $retryAttempts;
    public final /* synthetic */ AnonymousClass8C5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B19(AnonymousClass8C5 r2, int i) {
        super(1);
        this.this$0 = r2;
        this.$retryAttempts = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Log.i("SMSRetrieverReceiver/onReceive/re-registered sms retriever client after timeout");
        C17880vN.A1C(C19830z4.A00(this.this$0.A01), "sms_retriever_retry_count", this.$retryAttempts + 1);
        return C27621Wu.A00;
    }
}
