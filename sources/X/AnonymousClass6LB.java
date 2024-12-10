package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6LB  reason: invalid class name */
public class AnonymousClass6LB extends C38471rL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass6LB(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A00 = i2;
        this.A04 = obj;
        this.A01 = i;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public void A04(View view) {
        C110655gg r3;
        switch (this.A00) {
            case 0:
                r3 = (C110655gg) this.A04;
                r3.A00 = this.A01;
                Iterator it = ((List) this.A03).iterator();
                while (it.hasNext()) {
                    AnonymousClass3MX.A0E(it).setSelected(false);
                }
                break;
            case 1:
                r3 = (C110655gg) this.A04;
                r3.A01 = this.A01;
                Iterator it2 = ((List) this.A03).iterator();
                while (it2.hasNext()) {
                    AnonymousClass3MX.A0E(it2).setSelected(false);
                }
                break;
            default:
                C113435n5 r1 = (C113435n5) this.A02;
                List list = C42011xT.A0I;
                Integer num = r1.A08;
                int i = this.A01;
                r1.A06.C6w((AnonymousClass1BI) this.A03, (C1418377d) this.A04, num, i);
                return;
        }
        ((View) this.A02).setSelected(true);
        C110655gg.A03(r3);
    }
}
