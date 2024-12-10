package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.Aj8  reason: case insensitive filesystem */
public class C21379Aj8 implements Runnable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public C21379Aj8(Object obj, Object obj2, Object obj3, String str, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A06 = str;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = obj2;
        this.A05 = obj3;
    }

    public final void run() {
        AnonymousClass1MD[] r4;
        StringBuilder A10;
        if (this.A00 != 0) {
            C36141nP r6 = (C36141nP) this.A03;
            int i = this.A01;
            int i2 = this.A02;
            AnonymousClass1BI r3 = (AnonymousClass1BI) this.A04;
            DeviceJid deviceJid = (DeviceJid) this.A05;
            String str = this.A06;
            Log.i("LocationNotificationHandler/onFinalLocationNotification/need to send retry receipt;");
            if (i > 1) {
                r6.A01.A06();
            }
            C17900vP.A0j("LocationNotificationHandler/onFinalLocationNotification/axolotl sending retry receipt; localRegistrationId=", AnonymousClass000.A10(), i2);
            C27131Uv r62 = r6.A05;
            UserJid userJid = deviceJid.userJid;
            byte[] A032 = A8G.A03(i2);
            int i3 = i + 1;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("LocationSharingManager/sendFinalLocationRetryRequest/jid=");
            A102.append(r3);
            A102.append("; participant=");
            A102.append(userJid);
            A102.append("; msgId=");
            A102.append(str);
            C17900vP.A0j("; retryCount=", A102, i3);
            if (i3 > 4) {
                A10 = AnonymousClass000.A10();
                A10.append("LocationSharingManager/sendFinalLocationRetryRequest/reached max retry; remote_resource=");
                A10.append(userJid);
            } else if (C27131Uv.A03(r62, AnonymousClass205.A01(r3, str, false)) == null) {
                A10 = AnonymousClass000.A10();
                A10.append("LocationSharingManager/sendFinalLocationRetryRequest/can't find the live location message; jid=");
                A10.append(r3);
                A10.append("; senderJid=");
                A10.append(userJid);
                A10.append("; msgId=");
                A10.append(str);
            } else {
                AnonymousClass00H r63 = r62.A0L.A02;
                AnonymousClass1MD[] r5 = new AnonymousClass1MD[3];
                C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, C17890vO.A0T(r63), r5, 0);
                r5[1] = new AnonymousClass1MD((Jid) userJid, "to");
                r5[2] = AnonymousClass8BR.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "location");
                if (C22971Dz.A0e(r3)) {
                    r4 = new AnonymousClass1MD[2];
                    C17880vN.A1Q("final", str, r4, 0);
                    C17880vN.A1I(r3, "context", r4, 1);
                } else {
                    r4 = new AnonymousClass1MD[1];
                    C17880vN.A1Q("final", str, r4, 0);
                }
                C29621ca[] r32 = new C29621ca[2];
                AnonymousClass1MD[] r2 = new AnonymousClass1MD[1];
                C17880vN.A1Q("retry", String.valueOf(i3), r2, 0);
                AnonymousClass8BS.A1H("request", r2, r32, 0);
                r32[1] = new C29621ca("registration", A032, (AnonymousClass1MD[]) null);
                C17880vN.A0U(r63).A0O(new C29621ca(AnonymousClass8BR.A0l("location", r4, r32), "notification", r5), 191);
                return;
            }
            C17900vP.A0k("; retryCount=", A10, i3);
            return;
        }
        C20135A8w a8w = (C20135A8w) this.A03;
        String str2 = this.A06;
        int i4 = this.A01;
        int i5 = this.A02;
        List list = (List) this.A04;
        Object obj = this.A05;
        C18070vi.A0d(a8w, 0);
        AM6 A0G = AnonymousClass8BT.A0G(a8w);
        C34141jz r22 = a8w.A0F;
        boolean A1T = AnonymousClass000.A1T(r22.A02, 98);
        int A033 = C108955ca.A03(r22);
        if (C20045A4o.A01(A0G.A00)) {
            C171228rN r10 = new C171228rN();
            AnonymousClass8BT.A1C(r10, C17880vN.A0k(), A1T ? 1 : 0);
            AM6.A01(A0G, r10);
            AM6.A02(A0G, r10, (Boolean) null, Integer.valueOf(A033), (Integer) null, Integer.valueOf(i4), (Integer) null, Integer.valueOf(i5), (Integer) null, (Integer) null, (Long) null, (String) null, list);
            A0G.A01.CC7(r10);
        }
        AnonymousClass1D6[] r23 = new AnonymousClass1D6[3];
        C72463Mc.A1H("error_type", Integer.valueOf(i5), r23);
        C108985cd.A1G("error_code", list, r23);
        C72463Mc.A1I("error_message", obj, r23);
        A0G.A04((Boolean) null, (Integer) null, str2, (String) null, (String) null, AnonymousClass1D7.A0C(r23), 3, A1T ? 1 : 0);
    }
}
