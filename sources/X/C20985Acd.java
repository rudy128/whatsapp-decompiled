package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.Acd  reason: case insensitive filesystem */
public final class C20985Acd implements AnonymousClass1O5 {
    public final AnonymousClass1BI A00;
    public final AnonymousClass1OZ A01;
    public final C54452eA A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final long A06 = SystemClock.elapsedRealtime();
    public final C18030ve A07;
    public final C22510BAr A08;

    public C20985Acd(C18030ve r3, C22510BAr bAr, AnonymousClass1BI r5, AnonymousClass1OZ r6, C54452eA r7, String str, String str2) {
        boolean z;
        C18070vi.A0f(r6, 2, r5);
        this.A07 = r3;
        this.A01 = r6;
        this.A04 = str;
        this.A00 = r5;
        this.A03 = str2;
        this.A02 = r7;
        this.A08 = bAr;
        if ((!str.equals("preview") || !C18020vd.A05(C18040vf.A02, r3, 101)) && (!str.equals("image") || !C18020vd.A05(C18040vf.A02, r3, 102))) {
            z = false;
        } else {
            z = true;
        }
        this.A05 = z;
    }

    public void BrD(String str) {
    }

    public void C7Z(C29621ca r13, String str) {
        byte[] bArr;
        String str2;
        String str3;
        int i;
        C18070vi.A0d(r13, 1);
        C29621ca A0K = r13.A0K("picture");
        String str4 = this.A03;
        URL url = null;
        if (A0K != null) {
            bArr = A0K.A01;
            if (this.A05) {
                str3 = A0K.A0Q("direct_path", (String) null);
                if (C18020vd.A05(C18040vf.A02, this.A07, 4406)) {
                    str2 = A0K.A0Q("hash", (String) null);
                } else {
                    str2 = null;
                }
            } else {
                str3 = null;
                str2 = null;
            }
            String A0Q = A0K.A0Q("url", (String) null);
            if (A0Q != null) {
                try {
                    url = new URL(A0Q);
                } catch (MalformedURLException unused) {
                    throw AnonymousClass1UI.A01("Malformed picture url");
                }
            }
            str4 = A0K.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null);
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
        this.A08.C1y(new C55782gM(this.A00, str3, str2, url, bArr, i, C72453Mb.A03("preview".equals(this.A04) ? 1 : 0)), this.A06);
    }

    public void Bt9(C29621ca r12, String str) {
        int A012 = AnonymousClass8BW.A01(r12);
        if (A012 == 404 || A012 == 410) {
            this.A08.C1y(new C55782gM(this.A00, (String) null, (String) null, (URL) null, (byte[]) null, -1, C72453Mb.A03("preview".equals(this.A04) ? 1 : 0)), this.A06);
        } else {
            this.A08.C1x(this.A00, this.A04, A012, this.A06);
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
