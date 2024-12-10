package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.List;

/* renamed from: X.0SI  reason: invalid class name */
public class AnonymousClass0SI implements C16550sc {
    public final /* synthetic */ AnonymousClass06A A00;

    public AnonymousClass0SI(AnonymousClass06A r1) {
        this.A00 = r1;
    }

    public void BwH(MenuItem menuItem, C003301m r9) {
        AnonymousClass06A r1 = this.A00;
        Handler handler = r1.A0I;
        AnonymousClass0HZ r0 = null;
        handler.removeCallbacksAndMessages((Object) null);
        List list = r1.A0L;
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (r9 != ((AnonymousClass0HZ) list.get(i)).A01) {
                i++;
            } else if (i != -1) {
                int i2 = i + 1;
                if (i2 < list.size()) {
                    r0 = (AnonymousClass0HZ) list.get(i2);
                }
                handler.postAtTime(new AnonymousClass0ZT(menuItem, this, r0, r9), r9, SystemClock.uptimeMillis() + 200);
                return;
            } else {
                return;
            }
        }
    }

    public void BwI(MenuItem menuItem, C003301m r3) {
        this.A00.A0I.removeCallbacksAndMessages(r3);
    }
}
