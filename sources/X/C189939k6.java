package X;

import android.util.Log;
import java.util.Queue;

/* renamed from: X.9k6  reason: invalid class name and case insensitive filesystem */
public class C189939k6 {
    public boolean A00 = true;
    public final Queue A01 = AnonymousClass8BR.A14();

    public void A00(Runnable runnable) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BloksCallbackQueue/run/active=");
        Log.d("Whatsapp", AnonymousClass3MY.A0r(A10, this.A00));
        if (this.A00) {
            runnable.run();
        } else {
            this.A01.add(runnable);
        }
    }
}
