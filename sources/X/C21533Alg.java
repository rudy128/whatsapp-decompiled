package X;

import android.view.MenuItem;
import java.util.ArrayList;

/* renamed from: X.Alg  reason: case insensitive filesystem */
public class C21533Alg implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C21533Alg(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj4;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
    }

    public final Object invoke(Object obj) {
        boolean z;
        ArrayList A13;
        C23736Boh boh;
        E8A e8a;
        switch (this.A00) {
            case 0:
                C168648jP r6 = (C168648jP) this.A01;
                MenuItem menuItem = (MenuItem) this.A02;
                MenuItem menuItem2 = (MenuItem) this.A03;
                MenuItem menuItem3 = (MenuItem) this.A04;
                if (!AnonymousClass000.A1Y(obj) || r6.A0y == null) {
                    z = false;
                    menuItem.setShowAsAction(1);
                    menuItem2.setShowAsAction(1);
                } else {
                    z = true;
                    menuItem.setShowAsAction(0);
                    menuItem2.setShowAsAction(0);
                }
                menuItem3.setVisible(z);
                break;
            case 1:
                C32691hb r3 = (C32691hb) this.A01;
                Object obj2 = this.A02;
                Object obj3 = this.A03;
                Object obj4 = this.A04;
                Boolean bool = (Boolean) obj;
                if (!C18020vd.A05(C18040vf.A02, r3.A0Q, 7941)) {
                    if (bool.booleanValue()) {
                        r3.A0U.CGF(new C70833Cr((Object) r3, obj2, obj3, obj4, 24));
                        break;
                    }
                } else {
                    r3.A0U.CGF(new AnonymousClass3C4(r3, obj2, bool, 19));
                    break;
                }
                break;
            default:
                A6L a6l = (A6L) this.A01;
                A45 a45 = (A45) this.A02;
                A45 a452 = (A45) this.A03;
                A45 a453 = (A45) this.A04;
                C180349Me r9 = (C180349Me) obj;
                if (r9 instanceof AnonymousClass97B) {
                    A13 = AnonymousClass000.A13();
                    A13.add(((C20049A4s) a6l.A0F.get()).A01(((AnonymousClass97B) r9).A00));
                    boh = a45.A00;
                    e8a = a45.A01;
                } else if (r9 instanceof AnonymousClass97C) {
                    C23736Boh boh2 = a452.A00;
                    C25974Cph.A00(ALS.A06(boh2), C199029zJ.A01, a452.A01);
                    break;
                } else if (r9 instanceof AnonymousClass97A) {
                    A13 = AnonymousClass000.A13();
                    A13.add(((AnonymousClass97A) r9).A00);
                    boh = a453.A00;
                    e8a = a453.A01;
                }
                new C21455AkM(boh, e8a, A13, 46).run();
                break;
        }
        return C27621Wu.A00;
    }
}
