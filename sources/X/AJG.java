package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.util.Log;

public final /* synthetic */ class AJG implements OnFailureListener {
    public final /* synthetic */ C19830z4 A00;
    public final /* synthetic */ C22524BBh A01;
    public final /* synthetic */ boolean A02;

    public final void onFailure(Exception exc) {
        boolean z = this.A02;
        C19830z4 r1 = this.A00;
        C22524BBh bBh = this.A01;
        Log.e("SmsRetrieverUtils/maybeUseSmsRetriever/onfailure/ ", exc);
        if (z) {
            C17880vN.A1F(C19830z4.A00(r1), "registration_use_sms_retriever", false);
        }
        bBh.CCW();
    }

    public /* synthetic */ AJG(C19830z4 r1, C22524BBh bBh, boolean z) {
        this.A02 = z;
        this.A00 = r1;
        this.A01 = bBh;
    }
}
