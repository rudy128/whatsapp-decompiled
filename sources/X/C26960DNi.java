package X;

import java.util.Map;

/* renamed from: X.DNi  reason: case insensitive filesystem */
public class C26960DNi implements E89 {
    public final C25653Cjj A00;

    public /* bridge */ /* synthetic */ E88 BSv(C28464E2f e2f, C25681CkC ckC, Object obj) {
        Object obj2;
        Map map = (Map) obj;
        C26953DNb dNb = (C26953DNb) e2f;
        Map map2 = dNb.A02;
        String A0s = C17880vN.A0s("key", map2);
        if (A0s != null) {
            Object obj3 = map2.get("mode");
            if (map != null) {
                obj2 = map.get(A0s);
            } else {
                C25653Cjj cjj = this.A00;
                synchronized (cjj) {
                    obj2 = cjj.A00.get(A0s);
                }
            }
            boolean equals = "p".equals(obj3);
            if (equals || obj2 == null) {
                obj2 = CCC.A00(ckC, map2);
            }
            return new C26957DNf(this.A00, obj2, A0s, dNb.A00, (Map) map2.get("debug_metadata"), equals);
        }
        throw AnonymousClass000.A0n("Key not defined in data manifest");
    }

    public COB BZR(E6H e6h) {
        COB cob;
        C25653Cjj cjj = this.A00;
        synchronized (cjj) {
            CQL A002 = C25653Cjj.A00(e6h, cjj);
            cob = new COB(A002.A00, cjj.A00);
        }
        return cob;
    }

    public C26960DNi(C25653Cjj cjj) {
        this.A00 = cjj;
    }
}
