package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.8Ci  reason: invalid class name */
public final class AnonymousClass8Ci extends Handler {
    public final AnonymousClass1CM A00;
    public final WeakReference A01;

    public void handleMessage(Message message) {
        C18070vi.A0d(message, 0);
        Activity activity = (Activity) this.A01.get();
        if (activity == null) {
            Log.w("DeleteAccountConfirmation/delete account confirmation was garbage collected with messages still enqueued");
        } else if (message.what == 0) {
            Log.i("DeleteAccountConfirmation/timeout/expired");
            AnonymousClass4Yv.A00(activity, 1);
            if (this.A00.A00(false) != 0) {
                Log.w("DeleteAccountConfirmation/dialog-delete-failed");
                AnonymousClass4Yv.A01(activity, 3);
            }
        }
    }

    public AnonymousClass8Ci(DeleteAccountConfirmation deleteAccountConfirmation, AnonymousClass1CM r3) {
        super(Looper.getMainLooper());
        this.A00 = r3;
        this.A01 = AnonymousClass3MW.A0z(deleteAccountConfirmation);
    }
}
