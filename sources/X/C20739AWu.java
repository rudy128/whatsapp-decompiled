package X;

import android.os.Bundle;
import com.whatsapp.biz.catalog.view.CatalogMediaCard;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;

/* renamed from: X.AWu  reason: case insensitive filesystem */
public class C20739AWu implements C23691Hg {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C20739AWu(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = obj;
    }

    public static void A00(AnonymousClass10T r1, Object obj, int i, int i2) {
        r1.notifyAllObservers(new C20739AWu(obj, i, i2));
    }

    public final void CGE(Object obj) {
        switch (this.A00) {
            case 0:
                ((BCN) obj).BvA((DeviceJid) this.A02);
                return;
            case 1:
                ((C36851oZ) obj).BtJ(this.A01);
                return;
            case 2:
                ((C36851oZ) obj).BtL(this.A01, (Bundle) this.A02);
                return;
            case 3:
                ((C36851oZ) obj).BtK(this.A01, (Bundle) this.A02);
                return;
            case 4:
                int i = this.A01;
                BAG bag = (BAG) obj;
                C18070vi.A0d(bag, 2);
                bag.BuB((UserJid) this.A02, i);
                return;
            case 5:
                ((AnonymousClass1WR) obj).ByH((AnonymousClass206) this.A02, this.A01);
                return;
            case 6:
                ((AnonymousClass1WR) obj).BmY((AnonymousClass206) this.A02, this.A01);
                return;
            case 7:
                ((AnonymousClass1WR) obj).ByY((Collection) this.A02, this.A01);
                return;
            case 8:
                ((AnonymousClass1WR) obj).ByK((AnonymousClass206) this.A02, this.A01);
                return;
            default:
                Object obj2 = this.A02;
                int i2 = this.A01;
                C20507ANs aNs = (C20507ANs) obj;
                C18070vi.A0d(aNs, 2);
                CatalogMediaCard catalogMediaCard = aNs.A04;
                if (C42171xk.A00(catalogMediaCard.A06, obj2)) {
                    BDO bdo = aNs.A03;
                    UserJid userJid = catalogMediaCard.A06;
                    if (!ANI.A00((ANI) bdo, userJid).A0P(userJid)) {
                        int i3 = 2131887975;
                        if (i2 != -1) {
                            i3 = 2131887974;
                            if (i2 != 404) {
                                i3 = 2131888010;
                            }
                        }
                        catalogMediaCard.setError(i3);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
