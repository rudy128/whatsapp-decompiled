package X;

import java.util.Map;

/* renamed from: X.CVy  reason: case insensitive filesystem */
public final class C25066CVy {
    public C25654Cjk A00;
    public final Map A01;

    public final Object A00(String str) {
        C18070vi.A0d(str, 0);
        C25654Cjk cjk = this.A00;
        if (cjk == null) {
            Map map = this.A01;
            C25670Ck0 A002 = C25670Ck0.A00();
            if (map != null) {
                cjk = new C25654Cjk(A002, map);
                this.A00 = cjk;
            } else {
                throw AnonymousClass000.A0k("json object can not be null");
            }
        }
        try {
            return cjk.A01(str, new E6J[0]);
        } catch (C23737Boi unused) {
            return null;
        }
    }

    public C25066CVy(Map map) {
        this.A01 = map;
    }
}
