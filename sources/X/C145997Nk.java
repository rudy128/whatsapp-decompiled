package X;

import android.os.Message;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7Nk  reason: invalid class name and case insensitive filesystem */
public class C145997Nk implements AnonymousClass1TI {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    public C145997Nk(DeepLinkActivity deepLinkActivity, UserJid userJid, int i, int i2, boolean z, boolean z2) {
        this.A00 = i2;
        this.A02 = deepLinkActivity;
        this.A03 = userJid;
        this.A01 = i;
        if (i2 != 0) {
            this.A04 = z;
            this.A05 = z2;
            return;
        }
        this.A05 = z;
        this.A04 = z2;
    }

    public final void accept(Object obj) {
        String str;
        String str2;
        if (this.A00 != 0) {
            DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.A02;
            UserJid userJid = (UserJid) this.A03;
            int i = this.A01;
            boolean z = this.A04;
            boolean z2 = this.A05;
            String str3 = (String) obj;
            switch (str3.hashCode()) {
                case -839883634:
                    str2 = "PERMANENT";
                    break;
                case 181990675:
                    if (str3.equals("UNBLOCKED")) {
                        deepLinkActivity.A0H.A01(userJid).A09(new C145997Nk(deepLinkActivity, userJid, i, 0, z, z2));
                        return;
                    }
                    return;
                case 476614193:
                    str2 = "TEMPORARY";
                    break;
                default:
                    return;
            }
            if (str3.equals(str2)) {
                ((C19957A0o) deepLinkActivity.A0q.get()).A01(deepLinkActivity, new AOE(deepLinkActivity, 3), str3);
                return;
            }
            return;
        }
        DeepLinkActivity deepLinkActivity2 = (DeepLinkActivity) this.A02;
        UserJid userJid2 = (UserJid) this.A03;
        int i2 = this.A01;
        boolean z3 = this.A05;
        boolean z4 = this.A04;
        if (AnonymousClass000.A1Y(obj)) {
            ((C190289kg) deepLinkActivity2.A0t.get()).A00();
            C21132Af0 A002 = deepLinkActivity2.A0H.A00(deepLinkActivity2, userJid2, i2, 11);
            C108985cd.A0y(Message.obtain(deepLinkActivity2.A00, 1), deepLinkActivity2, 2131893164);
            A002.A09(new C145927Nd(deepLinkActivity2, 2131887982, 0));
            if (z3) {
                str = "wa_pages";
            } else {
                str = "catalog_link";
            }
            DeepLinkActivity.A0x(deepLinkActivity2, userJid2, str, z4);
            return;
        }
        C73203Rj A003 = AnonymousClass4a6.A00(deepLinkActivity2);
        A003.A0D(2131887004);
        A003.A0E(2131887005);
        A003.A0g(deepLinkActivity2, new AnonymousClass7AO(deepLinkActivity2, 15), 2131893145);
        A003.A0d(deepLinkActivity2, new AnonymousClass7AO(deepLinkActivity2, 16));
        AnonymousClass3MY.A1G(A003);
    }
}
