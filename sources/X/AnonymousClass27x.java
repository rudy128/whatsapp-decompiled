package X;

import java.util.Map;

/* renamed from: X.27x  reason: invalid class name */
public final class AnonymousClass27x extends AnonymousClass1DT {
    public C37361pP A00;
    public String A01;

    public void A0F(Object obj) {
        C37361pP r2 = this.A00;
        if (r2 != null) {
            Map map = r2.A03;
            String str = this.A01;
            map.put(str, obj);
            AnonymousClass1G4 r0 = (AnonymousClass1G4) r2.A01.get(str);
            if (r0 != null) {
                r0.setValue(obj);
            }
        }
        super.A0F(obj);
    }
}
