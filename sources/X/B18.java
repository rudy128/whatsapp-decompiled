package X;

import com.whatsapp.registration.verifyphone.SMSRetrieverAppInactiveReceiver;
import com.whatsapp.util.Log;

public final class B18 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $retryAttempts;
    public final /* synthetic */ SMSRetrieverAppInactiveReceiver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B18(SMSRetrieverAppInactiveReceiver sMSRetrieverAppInactiveReceiver, int i) {
        super(1);
        this.this$0 = sMSRetrieverAppInactiveReceiver;
        this.$retryAttempts = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Log.i("SMSRetrieverAppInactiveReceiver/onReceive/re-registered sms retriever client");
        C19830z4 r1 = this.this$0.A01;
        if (r1 != null) {
            C17880vN.A1C(C19830z4.A00(r1), "sms_retriever_app_inactive_retry_count", this.$retryAttempts + 1);
            return C27621Wu.A00;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }
}
