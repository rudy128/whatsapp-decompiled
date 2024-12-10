package X;

import android.app.Activity;

public class D6J implements AnonymousClass1GV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public D6J(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [X.CRl, java.lang.Object] */
    public final void accept(Object obj) {
        DFL dfl;
        DOZ doz;
        int i;
        switch (this.A00) {
            case 0:
                D7U d7u = (D7U) this.A01;
                Activity activity = (Activity) this.A02;
                D7T d7t = d7u.A00;
                if (d7t != null) {
                    d7t.CAc(activity, d7u.A00(activity));
                    return;
                }
                return;
            case 1:
                dfl = (DFL) this.A01;
                doz = (DOZ) this.A02;
                i = 40;
                break;
            case 2:
                DFL dfl2 = (DFL) this.A01;
                DOZ doz2 = (DOZ) this.A02;
                String str = (String) obj;
                E8A A0A = dfl2.A0A(46);
                if (A0A != null && str.length() == dfl2.A04(36, 0)) {
                    C25681CkC.A03(doz2, dfl2, C108985cd.A0K(str), A0A);
                    return;
                }
                return;
            case 3:
                dfl = (DFL) this.A01;
                doz = (DOZ) this.A02;
                dfl.A0H(40, obj);
                i = 46;
                break;
            default:
                Object obj2 = this.A01;
                C25168CaK caK = (C25168CaK) this.A02;
                AnonymousClass4P8 r7 = (AnonymousClass4P8) obj;
                Integer valueOf = Integer.valueOf(caK.A01);
                int i2 = caK.A00;
                C27140DWb dWb = new C27140DWb(new D6I(obj2, 2), 0);
                r7.A00 = 9;
                ? obj3 = new Object();
                dWb.invoke(obj3);
                r7.A05 = valueOf;
                r7.A06 = Integer.valueOf(i2);
                r7.A02 = obj3.A01;
                r7.A04 = obj3.A03;
                r7.A03 = obj3.A02;
                r7.A01 = obj3.A00;
                return;
        }
        E8A A0A2 = dfl.A0A(i);
        if (A0A2 != null) {
            C26209Cul.A03(doz, dfl, C108985cd.A0J(obj), A0A2);
        }
    }
}
