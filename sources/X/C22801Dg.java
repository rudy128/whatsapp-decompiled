package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1Dg  reason: invalid class name and case insensitive filesystem */
public class C22801Dg extends AnonymousClass1DT {
    public C001200q A00 = new C001200q();

    public void A07() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C22861Dm r1 = (C22861Dm) ((Map.Entry) it.next()).getValue();
            r1.A01.A0C(r1);
        }
    }

    public void A08() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C22861Dm r1 = (C22861Dm) ((Map.Entry) it.next()).getValue();
            r1.A01.A0D(r1);
        }
    }

    public void A0G(AnonymousClass1DS r3) {
        C22861Dm r1 = (C22861Dm) this.A00.A01(r3);
        if (r1 != null) {
            r1.A01.A0D(r1);
        }
    }

    public void A0H(AnonymousClass1DS r3, C22851Dl r4) {
        if (r3 != null) {
            C22861Dm r1 = new C22861Dm(r3, r4);
            C22861Dm r0 = (C22861Dm) this.A00.A02(r3, r1);
            if (r0 != null) {
                if (r0.A02 != r4) {
                    throw new IllegalArgumentException("This source was already added with the different observer");
                }
            } else if (this.A00 > 0) {
                r1.A01.A0C(r1);
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }
}
