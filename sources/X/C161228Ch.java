package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.8Ch  reason: invalid class name and case insensitive filesystem */
public final class C161228Ch extends Handler {
    public final C22881Do A00;
    public final WeakReference A01;

    public void handleMessage(Message message) {
        Activity activity = (Activity) this.A01.get();
        if (activity == null) {
            removeMessages(1);
        } else if (message.what == 1) {
            Log.e("restore>VerifyMessageStoreHelper/timeout");
            removeMessages(1);
            if (this.A00.A01) {
                C20098A7b.A02(new DisplayExceptionDialogFactory$LoginFailedDialogFragment(), ((AnonymousClass1FL) activity).getSupportFragmentManager());
                return;
            }
            AnonymousClass4Yv.A01(activity, 200);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161228Ch(Looper looper, C22881Do r2, WeakReference weakReference) {
        super(looper);
        C17960vV.A07(looper);
        this.A00 = r2;
        this.A01 = weakReference;
    }
}
