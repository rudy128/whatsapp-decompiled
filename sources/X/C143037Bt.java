package X;

import com.whatsapp.ShareCatalogLinkActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7Bt  reason: invalid class name and case insensitive filesystem */
public class C143037Bt implements AnonymousClass86R {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C143037Bt(ShareCatalogLinkActivity shareCatalogLinkActivity, UserJid userJid, int i) {
        this.A00 = i;
        this.A01 = shareCatalogLinkActivity;
        this.A02 = userJid;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.A7D, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.A7D, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.A7D, java.lang.Object] */
    public final void Bhy() {
        UserJid userJid;
        A8Q A4i;
        int i;
        A7D a7d;
        switch (this.A00) {
            case 0:
                C114615rM r0 = (C114615rM) this.A01;
                userJid = (UserJid) this.A02;
                A4i = r0.A4i();
                ? obj = new Object();
                C109005cf.A0V(r0, obj);
                obj.A06 = 22;
                i = 39;
                a7d = obj;
                break;
            case 1:
                ShareCatalogLinkActivity.A0Q((ShareCatalogLinkActivity) this.A01, (UserJid) this.A02, 96);
                return;
            case 2:
                C114615rM r02 = (C114615rM) this.A01;
                userJid = (UserJid) this.A02;
                A4i = r02.A4i();
                ? obj2 = new Object();
                C109005cf.A0V(r02, obj2);
                obj2.A06 = 24;
                i = 41;
                a7d = obj2;
                break;
            default:
                C114615rM r03 = (C114615rM) this.A01;
                userJid = (UserJid) this.A02;
                A4i = r03.A4i();
                ? obj3 = new Object();
                C109005cf.A0V(r03, obj3);
                obj3.A06 = 19;
                i = 36;
                a7d = obj3;
                break;
        }
        a7d.A04 = Integer.valueOf(i);
        a7d.A00 = userJid;
        A4i.A09(a7d);
    }
}
