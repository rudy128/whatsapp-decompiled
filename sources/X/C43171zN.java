package X;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1zN  reason: invalid class name and case insensitive filesystem */
public class C43171zN {
    public boolean A00 = true;
    public final C43181zO A01;
    public final Map A02 = new HashMap();
    public final Set A03 = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();

    public C43191zP A01() {
        C43191zP r3 = new C43191zP(this);
        Map map = this.A02;
        String str = r3.A0B;
        if (!map.containsKey(str)) {
            map.put(str, r3);
            return r3;
        }
        throw new IllegalArgumentException("spring is already registered");
    }

    public void A02(String str) {
        Object obj = this.A02.get(str);
        if (obj != null) {
            this.A03.add(obj);
            if (this.A00) {
                this.A00 = false;
                C43181zO r2 = this.A01;
                if (!r2.A02) {
                    r2.A02 = true;
                    r2.A00 = SystemClock.uptimeMillis();
                    Choreographer choreographer = r2.A04;
                    Choreographer.FrameCallback frameCallback = r2.A03;
                    choreographer.removeFrameCallback(frameCallback);
                    choreographer.postFrameCallback(frameCallback);
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("springId ");
        sb.append(str);
        sb.append(" does not reference a registered spring");
        throw new IllegalArgumentException(sb.toString());
    }

    public C43171zN(C43181zO r2) {
        this.A01 = r2;
        r2.A01 = this;
    }

    public static C43171zN A00() {
        return new C43171zN(new C43181zO(Choreographer.getInstance()));
    }
}
