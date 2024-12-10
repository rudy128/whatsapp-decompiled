package X;

import java.io.IOException;
import java.util.Map;

/* renamed from: X.3EN  reason: invalid class name */
public class AnonymousClass3EN implements AnonymousClass1PF {
    public Map A00 = C17880vN.A11();

    public synchronized boolean BFm(C59482mN r2) {
        return this.A00.containsKey(r2);
    }

    public synchronized C19964A0z Bhr(C59482mN r3) {
        C19964A0z a0z;
        try {
            if (BFm(r3)) {
                a0z = new C19964A0z((byte[]) this.A00.get(r3));
            } else {
                a0z = new C19964A0z();
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
        return a0z;
    }

    public synchronized void COh(C59482mN r3, C19964A0z a0z) {
        this.A00.put(r3, a0z.A01());
    }
}
