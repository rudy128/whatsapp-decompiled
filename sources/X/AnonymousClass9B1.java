package X;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9B1  reason: invalid class name */
public class AnonymousClass9B1 extends A34 {
    public final int A00;
    public final AnonymousClass1QR A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String A0I;
        C1418477e A0E;
        Object obj2;
        List<AW0> list = (List) obj;
        WeakReference weakReference = this.A02;
        if (weakReference.get() != null) {
            HashMap hashMap = ((C161578Ga) weakReference.get()).A06;
            hashMap.clear();
            for (AW0 aw0 : list) {
                AnonymousClass8pG r3 = aw0.A0A;
                if (r3 != null) {
                    int i = aw0.A02;
                    if (i == 405) {
                        A0I = r3.A0G();
                        A0E = r3.A0D();
                    } else if (i == 106 || i == 12) {
                        A0I = r3.A0I();
                        A0E = r3.A0E();
                    }
                    if (!TextUtils.isEmpty(A0I)) {
                        if (!C20061A5k.A02(A0E)) {
                            obj2 = AnonymousClass8BT.A0q(A0E);
                        } else {
                            obj2 = A0I;
                        }
                        hashMap.put(A0I, obj2);
                    }
                }
            }
        }
    }

    public AnonymousClass9B1(AnonymousClass1QR r2, C161578Ga r3, int i) {
        this.A01 = r2;
        this.A02 = AnonymousClass3MW.A0z(r3);
        this.A00 = i;
    }
}
