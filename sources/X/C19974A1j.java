package X;

import android.util.Log;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/* renamed from: X.A1j  reason: case insensitive filesystem */
public class C19974A1j {
    public final C189939k6 A00 = new C189939k6();
    public final HashMap A01 = C17880vN.A11();
    public final Stack A02 = new Stack();

    public C194839sN A01(C23736Boh boh, E8A e8a, String str) {
        C194839sN r1 = new C194839sN(boh, e8a, this.A00);
        this.A01.put(str, r1);
        return r1;
    }

    public void A03(boolean z) {
        C189939k6 r3 = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BloksCallbackQueue/setActive(");
        A10.append(z);
        A10.append(")/queue size=");
        Queue queue = r3.A01;
        Log.d("Whatsapp", C17880vN.A0t(A10, queue.size()));
        r3.A00 = z;
        if (z) {
            while (!queue.isEmpty()) {
                Runnable runnable = (Runnable) queue.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    throw AnonymousClass000.A0s("");
                }
            }
        }
    }

    public static void A00(HashMap hashMap) {
        Iterator A0i = C17890vO.A0i(hashMap);
        while (A0i.hasNext()) {
            ((C194839sN) C17890vO.A0P(A0i)).A00 = false;
        }
        hashMap.clear();
    }

    public void A02(Map map) {
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Stack stack = this.A02;
            if (stack.peek() != null) {
                C108985cd.A1R((AbstractMap) stack.peek(), A16);
            }
        }
    }
}
