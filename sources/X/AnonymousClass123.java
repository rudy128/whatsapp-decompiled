package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.123  reason: invalid class name */
public class AnonymousClass123 implements C201511a {
    public final AnonymousClass10I A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass190 A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    public static void A00(AnonymousClass123 r3, DeviceJid deviceJid, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("recvmessagelistener/on-get-identity-error/jid = ");
        sb.append(deviceJid);
        sb.append(" errorCode = ");
        sb.append(i);
        Log.w(sb.toString());
        ((AnonymousClass10T) r3.A0A.get()).notifyAllObservers(new C20739AWu(deviceJid, i, 0));
        if (deviceJid.getDevice() == 0) {
            return;
        }
        if (((AnonymousClass1P3) r3.A05.get()).A0Y()) {
            r3.A00.CGF(new C70863Cu(r3, i, 7, deviceJid));
        } else {
            ((C25581Ot) r3.A06.get()).A02(new C70863Cu(r3, i, 8, deviceJid));
        }
    }

    public static void A01(AnonymousClass123 r13, List list) {
        AnonymousClass00H r1 = r13.A0B;
        String A0B2 = ((AnonymousClass1OZ) r1.get()).A0B();
        AnonymousClass1OZ r8 = (AnonymousClass1OZ) r1.get();
        C29621ca[] r4 = new C29621ca[list.size()];
        for (int i = 0; i < list.size(); i++) {
            r4[i] = new C29621ca(PublicKeyCredentialControllerUtility.JSON_KEY_USER, new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) list.get(i), "jid")});
        }
        r8.A0N(new C20996Aco(list, r13, 3), new C29621ca(new C29621ca("identity", (AnonymousClass1MD[]) null, r4), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "encrypt"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1MD((Jid) C173438v4.A00, "to")}), A0B2, 153, 32000);
    }

    public void A02(List list) {
        if (C18020vd.A05(C18040vf.A02, (C18020vd) this.A09.get(), 10180)) {
            this.A00.CGF(new C70733Ch(this, list, 23));
        } else {
            A01(this, list);
        }
    }

    public AnonymousClass123(AnonymousClass190 r1, AnonymousClass10I r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        this.A08 = r1;
        this.A00 = r2;
        this.A09 = r3;
        this.A0B = r4;
        this.A03 = r5;
        this.A07 = r6;
        this.A06 = r7;
        this.A0A = r8;
        this.A04 = r9;
        this.A05 = r10;
        this.A02 = r11;
        this.A01 = r12;
    }
}
