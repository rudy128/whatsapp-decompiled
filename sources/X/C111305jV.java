package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5jV  reason: invalid class name and case insensitive filesystem */
public class C111305jV extends AnonymousClass1J2 implements AnonymousClass8AI {
    public final AnonymousClass1DT A00 = C108945cZ.A0S();
    public final AnonymousClass1DT A01 = C108945cZ.A0S();
    public final AnonymousClass1DT A02 = C108945cZ.A0S();
    public final Map A03 = C17880vN.A13();

    public boolean A0T(int i) {
        Number A1C = C108945cZ.A1C(this.A02);
        if (A1C == null || A1C.intValue() != i) {
            return false;
        }
        return true;
    }

    public void Bzq(AnonymousClass725 r4) {
        Map map = this.A03;
        String str = r4.A0H;
        AnonymousClass1DS r1 = (AnonymousClass1DS) map.get(str);
        if (r1 != null && r1.A06() != null) {
            r1.A0F(new C127486eR(r4, str));
        }
    }

    public void Bzr(List list) {
        Map map = this.A03;
        map.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass725 A0y = C108945cZ.A0y(it);
            String str = A0y.A0H;
            map.put(str, AnonymousClass3MW.A0M(new C127486eR(A0y, str)));
        }
        AnonymousClass3MX.A1J(this.A02, 2);
    }

    public void Bzs() {
        AnonymousClass3MX.A1J(this.A02, 3);
    }

    public void Bzt(String str) {
        AnonymousClass1DS r2 = (AnonymousClass1DS) this.A03.get(str);
        if (r2 != null && r2.A06() != null) {
            r2.A0F(new C127486eR((AnonymousClass725) null, str));
        }
    }
}
