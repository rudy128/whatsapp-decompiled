package X;

import android.os.Handler;
import android.os.Looper;

public class BG7 extends Handler {
    public final Looper A00 = Looper.getMainLooper();

    public BG7(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    public BG7(Looper looper) {
        super(looper);
    }

    public BG7() {
    }
}
