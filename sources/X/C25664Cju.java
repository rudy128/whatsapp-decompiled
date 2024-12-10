package X;

import android.os.Looper;
import android.util.SparseArray;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: X.Cju  reason: case insensitive filesystem */
public class C25664Cju {
    public final Map A00 = C17880vN.A11();
    public final Map A01 = C17880vN.A11();
    public final Looper A02 = Looper.myLooper();

    public static void A00(C25664Cju cju) {
        if (Looper.myLooper() != cju.A02) {
            throw new RuntimeException();
        }
    }

    public Future A01(C24322BzJ bzJ, int i) {
        A00(this);
        Object obj = this.A00.get(bzJ);
        C199610h.A04(obj);
        return (Future) ((SparseArray) obj).get(i);
    }
}
