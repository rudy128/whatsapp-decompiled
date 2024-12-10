package X;

import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.37F  reason: invalid class name */
public class AnonymousClass37F implements AnonymousClass1O5 {
    public C199410f A00;
    public final C72223Lc A01;
    public final AnonymousClass1OZ A02;
    public final String A03;
    public final C198589ya A04;

    public void A00(DeviceJid deviceJid) {
        DeviceJid deviceJid2 = deviceJid;
        this.A00 = C199410f.of(deviceJid2);
        AnonymousClass1OZ r9 = this.A02;
        String A0B = r9.A0B();
        String str = this.A03;
        C17960vV.A07(deviceJid2);
        C29621ca r5 = new C29621ca("remove-companion-device", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) deviceJid2, "jid"), new AnonymousClass1MD("reason", str)});
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[4];
        C17880vN.A1I(C173438v4.A00, "to", r2, 0);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, r2, 1);
        C17880vN.A1Q("xmlns", "md", r2, 2);
        boolean A0N = r9.A0N(this, C29621ca.A01(r5, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r2), A0B, 237, 32000);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DeviceRemoveRequestProtocolHelper/sendRemoveDeviceRequest success: ");
        A10.append(A0N);
        A10.append("; reason=");
        A10.append(str);
        C17900vP.A0Y(deviceJid2, "; jid=", A10);
        if (!A0N) {
            this.A01.BtB(this.A00, (String) null, -1);
        }
    }

    public void BrD(String str) {
        this.A01.BtB(this.A00, (String) null, -1);
    }

    public void C7Z(C29621ca r3, String str) {
        this.A01.C7G(this.A00);
    }

    public AnonymousClass37F(C198589ya r1, C72223Lc r2, AnonymousClass1OZ r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A01 = r2;
        this.A04 = r1;
    }

    public void Bt9(C29621ca r6, String str) {
        int i;
        String str2;
        Pair A012 = C60482o6.A01(r6);
        if (A012 != null) {
            i = AnonymousClass000.A0M(A012.first);
        } else {
            i = 0;
        }
        C72223Lc r2 = this.A01;
        C199410f r1 = this.A00;
        if (A012 != null) {
            str2 = (String) A012.second;
        } else {
            str2 = null;
        }
        r2.BtB(r1, str2, i);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
