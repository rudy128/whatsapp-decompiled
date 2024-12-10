package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: X.6Or  reason: invalid class name and case insensitive filesystem */
public class C122286Or extends C19951A0i {
    public final /* synthetic */ C52742bP A00;
    public final /* synthetic */ C20100A7d A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;
    public final /* synthetic */ byte[] A07;

    public void A01() {
        C122276Oq r10 = new C122276Oq(this, 3);
        String str = this.A03;
        String str2 = this.A04;
        byte[] bArr = this.A07;
        byte[] bArr2 = this.A06;
        String str3 = this.A05;
        String str4 = this.A02;
        HashMap A11 = C17880vN.A11();
        try {
            String str5 = C19620yd.A0A;
            C108955ca.A1T("context", "consent", str5, A11);
            C108955ca.A1T("consent_id", Integer.toString(20240708), str5, A11);
            C108955ca.A1T("consent_decision", Integer.toString(5), str5, A11);
            C108955ca.A1T("consent_version", Integer.toString(1), str5, A11);
            if (str3 != null && str3.length() > 0) {
                C108955ca.A1T("security_code", str3, str5, A11);
            }
            if (str4 != null && str4.length() > 0) {
                C108955ca.A1T("advertising_id", str4, str5, A11);
            }
        } catch (UnsupportedEncodingException unused) {
            Log.e("RegistrationProvider/sendConsentResult saw UnsupportedEncodingException");
        }
        JniBridge.jvidispatchIOOOOOO(1, str, str2, r10, bArr, bArr2, A11);
    }

    public C122286Or(C52742bP r1, C20100A7d a7d, String str, String str2, String str3, String str4, byte[] bArr, byte[] bArr2) {
        this.A01 = a7d;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = str2;
        this.A07 = bArr;
        this.A06 = bArr2;
        this.A05 = str3;
        this.A02 = str4;
    }
}
