package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.GroupJid;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.AcZ  reason: case insensitive filesystem */
public final class C20981AcZ implements AnonymousClass1O5 {
    public GroupJid A00;
    public final long A01 = SystemClock.elapsedRealtime();
    public final C22510BAr A02;
    public final String A03;
    public final String A04;

    public void BrD(String str) {
    }

    public void C7Z(C29621ca r14, String str) {
        byte[] bArr;
        String str2;
        String str3;
        int i;
        C18070vi.A0d(r14, 1);
        C29621ca A0K = r14.A0K("picture");
        String str4 = this.A03;
        AnonymousClass1BI r6 = this.A00;
        String str5 = this.A04;
        URL url = null;
        if (A0K != null) {
            str4 = A0K.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
            str5 = A0K.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
            String A0Q = A0K.A0Q("linked_group_jid", (String) null);
            String A0Q2 = A0K.A0Q("url", (String) null);
            str3 = A0K.A0Q("direct_path", (String) null);
            str2 = A0K.A0Q("hash", (String) null);
            if (A0Q2 != null) {
                try {
                    url = new URL(A0Q2);
                } catch (MalformedURLException unused) {
                    throw AnonymousClass1UI.A01("Malformed picture url");
                }
            }
            bArr = A0K.A01;
            if (A0Q != null) {
                r6 = AnonymousClass1EC.A01.A02(A0Q);
            }
        } else {
            bArr = null;
            str3 = null;
            str2 = null;
        }
        if (str4 != null) {
            try {
                i = Integer.parseInt(str4);
            } catch (NumberFormatException unused2) {
                throw AnonymousClass1UI.A01(AnonymousClass001.A1H("Malformed photo id=", str4, AnonymousClass000.A10()));
            }
        } else {
            i = -1;
        }
        if (str5 != null && r6 != null) {
            this.A02.C1y(new C55782gM(r6, str3, str2, url, bArr, i, C72453Mb.A03("preview".equals(str5) ? 1 : 0)), this.A01);
        }
    }

    public C20981AcZ(C22510BAr bAr, GroupJid groupJid, GroupJid groupJid2, String str, String str2) {
        this.A02 = bAr;
        this.A00 = groupJid == null ? groupJid2 : groupJid;
        this.A04 = str;
        this.A03 = str2;
    }

    public void Bt9(C29621ca r12, String str) {
        int A012 = AnonymousClass8BW.A01(r12);
        if (A012 == 404) {
            GroupJid groupJid = this.A00;
            if (groupJid != null) {
                this.A02.C1y(new C55782gM(groupJid, (String) null, (String) null, (URL) null, (byte[]) null, -1, C72453Mb.A03("preview".equals(this.A04) ? 1 : 0)), this.A01);
                return;
            }
            return;
        }
        this.A02.C1x(this.A00, this.A04, A012, this.A01);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
