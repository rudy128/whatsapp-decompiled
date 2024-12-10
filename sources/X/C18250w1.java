package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0w1  reason: invalid class name and case insensitive filesystem */
public class C18250w1 implements C18240w0 {
    public static AtomicReference A00 = new AtomicReference();

    public void BmA(boolean z) {
        synchronized (C18220vy.A0A) {
            Iterator it = new ArrayList(C18220vy.A0B.values()).iterator();
            while (it.hasNext()) {
                C18220vy r2 = (C18220vy) it.next();
                if (r2.A07.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    for (C18740x5 r0 : r2.A06) {
                        C18220vy r02 = r0.A00;
                        if (!z) {
                            ((C18500wX) r02.A04.get()).A01();
                        }
                    }
                }
            }
        }
    }
}
