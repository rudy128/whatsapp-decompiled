package X;

import android.content.Intent;
import android.net.Uri;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.deeplink.DeepLinkActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.7Pv  reason: invalid class name and case insensitive filesystem */
public class C146587Pv implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    public C146587Pv(Object obj, Object obj2, String str, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = z;
    }

    public final void run() {
        String str;
        Intent action;
        AnonymousClass1KB r2;
        int i;
        switch (this.A00) {
            case 0:
                String str2 = this.A03;
                AnonymousClass72R r6 = (AnonymousClass72R) this.A01;
                boolean z = this.A04;
                Jid A022 = Jid.Companion.A02(str2);
                AnonymousClass64B r22 = new AnonymousClass64B();
                A8Q a8q = r6.A00;
                r22.A09 = C17880vN.A0n(a8q.A0E.getAndIncrement());
                r22.A06 = 18;
                r22.A08 = (Long) this.A02;
                r22.A0C = a8q.A03;
                r22.A01 = Boolean.valueOf(z);
                r22.A0B = r6.A02.A00(A022);
                r6.A01.CC7(r22);
                return;
            case 1:
                boolean z2 = this.A04;
                C195849u0 r62 = (C195849u0) this.A01;
                Iterable iterable = (Iterable) this.A02;
                String str3 = this.A03;
                C37551pj r4 = r62.A04;
                if (z2) {
                    r4.A0L((C57732jY) null);
                } else {
                    Set A11 = C29431cG.A11(iterable);
                    synchronized (r4) {
                        r4.A0G.CGF(new C21459AkQ(r4, A11, str3, 39));
                    }
                }
                r62.A0C.run();
                return;
            case 2:
                DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this.A01;
                String str4 = this.A03;
                boolean z3 = this.A04;
                Uri uri = (Uri) this.A02;
                if (str4 != null) {
                    action = DeepLinkActivity.A0r(deepLinkActivity, str4);
                } else if (z3) {
                    boolean A05 = C18020vd.A05(C18040vf.A02, deepLinkActivity.A0E, 7558);
                    C29671cg r0 = C29671cg.A00;
                    if (A05) {
                        action = AnonymousClass1LU.A0S(deepLinkActivity, new AnonymousClass77K(deepLinkActivity.A0V.A0A(), deepLinkActivity.A0V.A0B(), deepLinkActivity.A0V.A05(), false, false, false, false), (Integer) null, (Integer) null, C108955ca.A0i(), r0.getRawString(), (String) null, 1, 16, 68);
                    } else {
                        action = AnonymousClass1LU.A1I(deepLinkActivity, (Integer) null, r0.getRawString(), (String) null, 8, 16, 68, false);
                    }
                } else {
                    action = AnonymousClass1LU.A02(deepLinkActivity).setAction(C28901bF.A05);
                    action.setAction("android.intent.action.VIEW");
                    action.setData(uri);
                    r2 = deepLinkActivity.A05;
                    i = 30;
                    r2.A0J(new C70733Ch(deepLinkActivity, action, i));
                    return;
                }
                r2 = deepLinkActivity.A05;
                i = 31;
                r2.A0J(new C70733Ch(deepLinkActivity, action, i));
                return;
            case 3:
                UserJid userJid = (UserJid) this.A02;
                String str5 = this.A03;
                boolean z4 = this.A04;
                C30801eX r23 = ((DeepLinkActivity) this.A01).A0S;
                if (z4) {
                    str = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
                } else {
                    str = null;
                }
                r23.A05(userJid, str5, str, System.currentTimeMillis(), System.currentTimeMillis());
                return;
            default:
                C30151dT r9 = (C30151dT) this.A01;
                String str6 = this.A03;
                boolean z5 = this.A04;
                Object obj = this.A02;
                C30351dn r5 = r9.A00;
                if (r5 != null) {
                    Integer num = r5.A04;
                    if (num == null) {
                        C30151dT.A03(r9, "log_invalid_no_conn_sequence_end");
                        return;
                    }
                    AnonymousClass19Y A002 = C30151dT.A00(r9);
                    int intValue = num.intValue();
                    A002.markerPoint(125908665, AnonymousClass2U8.A00(intValue, "chatd_connection_end"), str6);
                    if (z5 && obj != null) {
                        C30151dT.A00(r9).markerPoint(125908665, AnonymousClass2U8.A00(intValue, "chatd_session_start"));
                        r5.A07.put(obj, num);
                    }
                    r5.A04 = null;
                    return;
                }
                return;
        }
    }
}
