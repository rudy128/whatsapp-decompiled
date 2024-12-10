package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.381  reason: invalid class name */
public final class AnonymousClass381 implements AnonymousClass16H {
    public Set BUj(AnonymousClass206 r2) {
        if (r2.A0q) {
            return Collections.singleton("s");
        }
        return null;
    }

    public C54532eI BVF(C34141jz r5) {
        if (r5.A08 == null) {
            return null;
        }
        boolean booleanValue = r5.A01().booleanValue();
        C54532eI r2 = new C54532eI();
        Set singleton = Collections.singleton("s");
        if (booleanValue) {
            C18070vi.A0d(singleton, 0);
            r2.A00 = singleton;
            return r2;
        }
        C18070vi.A0d(singleton, 0);
        r2.A01 = singleton;
        return r2;
    }

    public String BVE() {
        return "m";
    }
}
