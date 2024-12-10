package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

@Deprecated
public final class CIZ {
    public final GestureDetector A00;

    public CIZ(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.A00 = new GestureDetector(context, onGestureListener, handler);
    }
}
