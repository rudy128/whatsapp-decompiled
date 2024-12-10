package X;

import com.google.android.gms.tasks.OnFailureListener;
import com.whatsapp.util.Log;

/* renamed from: X.DKi  reason: case insensitive filesystem */
public class C26949DKi implements OnFailureListener {
    public final int A00;

    public C26949DKi(int i) {
        this.A00 = i;
    }

    public final void onFailure(Exception exc) {
        switch (this.A00) {
            case 0:
                Log.e("SMSRetrieverReceiver/onReceive/failure registering sms retriever client after receiving code", exc);
                return;
            case 1:
                C17900vP.A0X(exc, "sendResponse/onFailure ", C18070vi.A0K(exc));
                return;
            default:
                return;
        }
    }
}
