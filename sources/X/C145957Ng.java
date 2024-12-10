package X;

import android.os.Message;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7Ng  reason: invalid class name and case insensitive filesystem */
public class C145957Ng implements AnonymousClass1TI {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    public C145957Ng(DeepLinkActivity deepLinkActivity, UserJid userJid, String str, int i, boolean z) {
        this.A00 = i;
        this.A01 = deepLinkActivity;
        if (i != 0) {
            this.A04 = z;
            this.A02 = userJid;
            this.A03 = str;
            return;
        }
        this.A02 = userJid;
        this.A03 = str;
        this.A04 = z;
    }

    public final void accept(Object obj) {
        String str;
        String str2;
        Object obj2 = obj;
        if (this.A00 != 0) {
            DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.A01;
            boolean z = this.A04;
            UserJid userJid = (UserJid) this.A02;
            String str3 = this.A03;
            if (AnonymousClass000.A1Y(obj2)) {
                A8Q a8q = deepLinkActivity.A0I;
                if (z) {
                    str2 = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                } else {
                    str2 = null;
                }
                a8q.A08(6, "product_link", str2);
                boolean A0O = deepLinkActivity.A02.A0O(userJid);
                C21132Af0 A002 = C20057A5g.A00(deepLinkActivity, AnonymousClass1LU.A1n(deepLinkActivity, false, false), deepLinkActivity.A05, (C20114A7x) deepLinkActivity.A0s.get(), deepLinkActivity.A0I, (CatalogManager) deepLinkActivity.A0u.get(), userJid, str3, A0O);
                C108985cd.A0y(Message.obtain(deepLinkActivity.A00, 1), deepLinkActivity, 2131893166);
                A002.A09(new C145927Nd(deepLinkActivity, 2131894789, 0));
                DeepLinkActivity.A0x(deepLinkActivity, userJid, "product_link", z);
                return;
            }
            C73203Rj A003 = AnonymousClass4a6.A00(deepLinkActivity);
            A003.A0D(2131887004);
            A003.A0E(2131887005);
            A003.A0g(deepLinkActivity, new AnonymousClass7AO(deepLinkActivity, 17), 2131893145);
            A003.A0d(deepLinkActivity, new AnonymousClass7AO(deepLinkActivity, 18));
            AnonymousClass3MY.A1G(A003);
            return;
        }
        DeepLinkActivity deepLinkActivity2 = (DeepLinkActivity) this.A01;
        UserJid userJid2 = (UserJid) this.A02;
        String str4 = this.A03;
        boolean z2 = this.A04;
        String str5 = (String) obj2;
        switch (str5.hashCode()) {
            case -839883634:
                str = "PERMANENT";
                break;
            case 181990675:
                if (str5.equals("UNBLOCKED")) {
                    deepLinkActivity2.A0H.A01(userJid2).A09(new C145957Ng(deepLinkActivity2, userJid2, str4, 1, z2));
                    return;
                }
                return;
            case 476614193:
                str = "TEMPORARY";
                break;
            default:
                return;
        }
        if (str5.equals(str)) {
            ((C19957A0o) deepLinkActivity2.A0q.get()).A01(deepLinkActivity2, new AOE(deepLinkActivity2, 2), str5);
        }
    }
}
