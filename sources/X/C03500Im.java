package X;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Im  reason: invalid class name and case insensitive filesystem */
public final class C03500Im {
    public final C05060Qg A00;
    public final Set A01 = new LinkedHashSet();
    public final C06370Yb A02;

    public final boolean A01() {
        return this.A02.A0B(C03150Gu.A0G);
    }

    public C03500Im(C05060Qg r7, Map map) {
        this.A00 = r7;
        this.A02 = r7.A0H();
        List A03 = C05060Qg.A03(r7, false, true);
        int size = A03.size();
        for (int i = 0; i < size; i++) {
            C05060Qg r2 = (C05060Qg) A03.get(i);
            if (C05060Qg.A08(r2, map)) {
                this.A01.add(Integer.valueOf(r2.A02));
            }
        }
    }

    public final C06370Yb A00() {
        return this.A02;
    }
}
