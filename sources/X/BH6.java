package X;

import android.content.Context;
import android.view.OrientationEventListener;
import java.lang.ref.WeakReference;
import java.util.List;

public final class BH6 extends OrientationEventListener {
    public final WeakReference A00;

    public void onOrientationChanged(int i) {
        BUF buf = (BUF) this.A00.get();
        if (buf != null) {
            int i2 = ((((i + 45) + 360) / 90) % 4) * 90;
            int i3 = buf.A01;
            if (buf.A00 != i2) {
                buf.A00 = i2;
                buf.A01 = i3;
                List list = buf.A04.A00;
                int A08 = BE7.A08(list);
                for (int i4 = 0; i4 < A08; i4++) {
                    ((E4B) list.get(i4)).Bzk(buf.A01, buf.A00);
                }
            }
        }
    }

    public BH6(Context context, WeakReference weakReference) {
        super(context);
        this.A00 = weakReference;
    }
}
