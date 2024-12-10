package X;

import java.util.Map;

/* renamed from: X.044  reason: invalid class name */
public final class AnonymousClass044 implements C24051Ir {
    public static final AnonymousClass1GH A03 = new AnonymousClass045();
    public final C24051Ir A00;
    public final C24051Ir A01;
    public final Map A02;

    public AnonymousClass1J2 BG9(Class cls) {
        C24051Ir r0;
        if (this.A02.containsKey(cls)) {
            r0 = this.A01;
        } else {
            r0 = this.A00;
        }
        return r0.BG9(cls);
    }

    public AnonymousClass1J2 BGl(C24091Iv r2, Class cls) {
        C24051Ir r0;
        if (this.A02.containsKey(cls)) {
            r0 = this.A01;
        } else {
            r0 = this.A00;
        }
        return r0.BGl(r2, cls);
    }

    public AnonymousClass044(C24051Ir r3, AnonymousClass042 r4, Map map) {
        this.A02 = map;
        this.A00 = r3;
        this.A01 = new AnonymousClass04G(r4, this, 0);
    }
}
