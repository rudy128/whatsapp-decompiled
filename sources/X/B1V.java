package X;

import com.whatsapp.util.Log;

public final class B1V extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ boolean $shouldKeepUseSmsRetrieverValue;
    public final /* synthetic */ C22524BBh $startSmsRetrieverListener;
    public final /* synthetic */ C19830z4 $waSharedPreferences;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1V(C19830z4 r2, C22524BBh bBh, boolean z) {
        super(1);
        this.$shouldKeepUseSmsRetrieverValue = z;
        this.$waSharedPreferences = r2;
        this.$startSmsRetrieverListener = bBh;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Log.i("SmsRetrieverUtils/maybeUseSmsRetriever/onsuccess");
        if (this.$shouldKeepUseSmsRetrieverValue) {
            C17880vN.A1F(C19830z4.A00(this.$waSharedPreferences), "registration_use_sms_retriever", true);
        }
        this.$startSmsRetrieverListener.COI();
        return C27621Wu.A00;
    }
}
