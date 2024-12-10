package X;

import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;

/* renamed from: X.Ae6  reason: case insensitive filesystem */
public class C21076Ae6 implements C107715aT {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C21076Ae6(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void BuS(C77523qH r11, int i) {
        int i2;
        ANZ anz;
        ANP anp;
        AEI aei;
        C196089uR r4;
        C77523qH r5 = r11;
        switch (this.A00) {
            case 0:
                CatalogMediaCard catalogMediaCard = (CatalogMediaCard) this.A01;
                C20287AEv aEv = (C20287AEv) this.A02;
                if (!aEv.A02()) {
                    r11.setTag(aEv.A0H);
                    catalogMediaCard.A02.A04(r5, (AEI) aEv.A0A.get(0), new ANP(r11, 0), new ANZ(r11, 0), 2);
                    return;
                }
                AnonymousClass9PP.A00(r11);
                return;
            case 1:
                aei = (AEI) this.A02;
                r11.setTag(aei.A04);
                r4 = ((LinkedAccountsMediaCard) this.A01).A04;
                i2 = 2;
                anz = new ANZ(r11, 2);
                anp = new ANP(r11, 2);
                break;
            case 2:
                aei = (AEI) this.A01;
                r11.setTag(aei.A04);
                r4 = ((C161508Fg) this.A02).A03;
                anz = new ANZ(r11, 3);
                anp = new ANP(r11, 3);
                i2 = 2;
                break;
            default:
                AnonymousClass4SU r42 = (AnonymousClass4SU) this.A02;
                r42.A0B.A0D(r11, (AnonymousClass206) this.A01, new AnonymousClass7NC(r42, i, 0));
                return;
        }
        r4.A01(r5, aei, anp, anz, i2);
    }
}
