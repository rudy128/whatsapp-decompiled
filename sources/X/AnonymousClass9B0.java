package X;

import android.util.Pair;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9B0  reason: invalid class name */
public class AnonymousClass9B0 extends A34 {
    public WeakReference A00;
    public final AnonymousClass1QR A01;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        List<AW0> list = (List) obj;
        WeakReference weakReference = this.A00;
        if (weakReference.get() != null) {
            AnonymousClass8Ff r5 = (AnonymousClass8Ff) weakReference.get();
            AnonymousClass3MY.A1L(r5.A00, false);
            AnonymousClass3MY.A1L(r5.A01, true);
            C193179pf r3 = r5.A07;
            ArrayList A13 = AnonymousClass000.A13();
            C1764894k r6 = null;
            for (AW0 aw0 : list) {
                C1764894k A002 = r3.A00(aw0.A05);
                if (r6 != null) {
                    if (r6.get(2) == A002.get(2) && r6.get(1) == A002.get(1)) {
                        r6.count++;
                    } else {
                        A13.add(r6);
                    }
                }
                A002.count = 0;
                r6 = A002;
                r6.count++;
            }
            if (r6 != null) {
                A13.add(r6);
            }
            ArrayList A132 = AnonymousClass000.A13();
            for (int i = 0; i < list.size(); i++) {
                AW0 aw02 = (AW0) list.get(i);
                C1766995f r7 = new C1766995f();
                r7.A01 = AnonymousClass11X.A00.A0B(r5.A05, r5.A04.A09(aw02.A05));
                r7.A00 = r5.A08.A0T(aw02);
                boolean z = true;
                if (i < list.size() - 1) {
                    C1764894k A003 = r3.A00(aw02.A05);
                    C1764894k A004 = r3.A00(((AW0) list.get(i + 1)).A05);
                    if (A003.get(2) != A004.get(2) || A003.get(1) != A004.get(1)) {
                        z = false;
                    }
                }
                r7.A02 = z;
                A132.add(r7);
            }
            r5.A02.A0F(Pair.create(A132, A13));
        }
    }

    public AnonymousClass9B0(AnonymousClass1QR r2, AnonymousClass8Ff r3) {
        this.A01 = r2;
        this.A00 = AnonymousClass3MW.A0z(r3);
    }
}
