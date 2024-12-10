package X;

import android.os.Bundle;
import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;

/* renamed from: X.1j6  reason: invalid class name and case insensitive filesystem */
public class C33611j6 implements AnonymousClass1RJ {
    public final AnonymousClass1P3 A00;
    public final C27131Uv A01;
    public final C27101Us A02;
    public final AnonymousClass190 A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;

    public int[] BSG() {
        return new int[]{117, 206};
    }

    public void A00(UserJid userJid, C194059r6 r10, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("LiveLocationXmppMessageHandler/on-location-update; jid=");
        UserJid userJid2 = userJid;
        sb.append(userJid);
        sb.append("; elapsed=");
        long j2 = j;
        sb.append(j);
        Log.i(sb.toString());
        C194059r6 r4 = r10;
        int i = r10.A00;
        if (i != 3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("LiveLocationXmppMessageHandler/invalid ciphertext type; ciphertextType=");
            sb2.append(i);
            Log.w(sb2.toString());
            return;
        }
        if (this.A00.A0Y()) {
            this.A04.CGF(new AnonymousClass3C8(this, userJid2, r4, 8, j2));
        } else {
            ((C25581Ot) this.A05.get()).A02(new AnonymousClass3C8(this, userJid2, r4, 9, j2));
        }
    }

    public boolean BcT(Message message, int i) {
        long j;
        if (i == 117) {
            Bundle data = message.getData();
            String string = data.getString("jid");
            A00((UserJid) Jid.Companion.A02(string), (C194059r6) message.obj, data.getLong("elapsed"));
            return true;
        } else if (i != 206) {
            return false;
        } else {
            C29621ca r2 = (C29621ca) message.obj;
            String A0Q = r2.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
            int i2 = 0;
            C29621ca A0J = r2.A0J(0);
            Jid A0F = r2.A0F(Jid.class, "from");
            C17960vV.A07(A0F);
            if (C29621ca.A07(A0J, "start")) {
                String A0Q2 = A0J.A0Q("duration", (String) null);
                if (A0Q2 != null) {
                    j = Long.parseLong(A0Q2);
                } else {
                    j = 0;
                }
                C27131Uv r5 = this.A01;
                C22931Dv r0 = AnonymousClass1BI.A00;
                AnonymousClass1BI A002 = C22931Dv.A00(A0F);
                C17960vV.A07(A002);
                long j2 = j * 1000;
                StringBuilder sb = new StringBuilder();
                sb.append("LocationSharingManager/onStartLocationReporting; jid=");
                sb.append(A002);
                sb.append("; duration=");
                sb.append(j2);
                Log.i(sb.toString());
                if (r5.A0d(A002)) {
                    LocationSharingService.A02(r5.A0E.A00, r5.A07, r5.A0F, j2, true);
                    synchronized (r5.A0S) {
                        r5.A00 = 2 | r5.A00;
                    }
                    i2 = 0;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("LocationSharingManager/onStartLocationReporting/sharing not enabled; jid=");
                    sb2.append(A002);
                    Log.w(sb2.toString());
                    i2 = 401;
                }
            } else if (C29621ca.A07(A0J, "stop")) {
                this.A01.A0R();
            } else if (!C29621ca.A07(A0J, "enable")) {
                this.A02.A01(A0F, A0Q, 501);
                return true;
            }
            this.A02.A01(A0F, A0Q, i2);
            return true;
        }
    }

    public C33611j6(AnonymousClass190 r1, AnonymousClass1P3 r2, C27131Uv r3, C27101Us r4, AnonymousClass10I r5, AnonymousClass00H r6) {
        this.A03 = r1;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }
}
