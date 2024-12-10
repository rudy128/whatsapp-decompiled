package X;

import java.util.Map;

/* renamed from: X.043  reason: invalid class name */
public final class AnonymousClass043 {
    public final AnonymousClass042 A00;
    public final Map A01;

    private AnonymousClass044 A00(C24051Ir r4) {
        Map map = this.A01;
        if (r4 != null) {
            return new AnonymousClass044(r4, this.A00, map);
        }
        throw new NullPointerException();
    }

    public AnonymousClass043(AnonymousClass042 r1, Map map) {
        this.A01 = map;
        this.A00 = r1;
    }

    public AnonymousClass044 A01(C24051Ir r2) {
        return A00(r2);
    }

    public AnonymousClass044 A02(C24051Ir r2) {
        return A00(r2);
    }
}
