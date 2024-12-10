package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.Bea  reason: case insensitive filesystem */
public class C23286Bea extends BG6 {
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                throw AnonymousClass000.A0s("onResult");
            } catch (RuntimeException e) {
                throw e;
            }
        } else if (i != 2) {
            Log.wtf("BasePendingResult", AnonymousClass001.A1I("Don't know how to handle message: ", AnonymousClass000.A10(), i), new Exception());
        } else {
            ((BasePendingResult) message.obj).A07(Status.A0A);
        }
    }

    public C23286Bea() {
        super(Looper.getMainLooper());
    }
}
