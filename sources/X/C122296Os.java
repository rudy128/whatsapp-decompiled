package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: X.6Os  reason: invalid class name and case insensitive filesystem */
public class C122296Os extends C19951A0i {
    public final /* synthetic */ C52742bP A00;
    public final /* synthetic */ C20100A7d A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ byte[] A08;
    public final /* synthetic */ byte[] A09;

    public void A01() {
        C122276Oq r8 = new C122276Oq(this, 2);
        String str = this.A04;
        String str2 = this.A06;
        byte[] bArr = this.A09;
        byte[] bArr2 = this.A08;
        String str3 = this.A05;
        String str4 = this.A07;
        String str5 = this.A02;
        String str6 = this.A03;
        HashMap A11 = C17880vN.A11();
        try {
            if (str3.length() > 0) {
                C108955ca.A1T("dob", str3, C19620yd.A0A, A11);
            }
            if (str4 != null && str4.length() > 0) {
                C108955ca.A1T("security_code", str4, C19620yd.A0A, A11);
            }
            if (str5 != null && str5.length() > 0) {
                C108955ca.A1T("advertising_id", str5, C19620yd.A0A, A11);
            }
            C108955ca.A1T("context", str6, C19620yd.A0A, A11);
        } catch (UnsupportedEncodingException unused) {
            Log.e("RegistrationProvider/makeConsentRequest saw UnsupportedEncodingException");
        }
        JniBridge.jvidispatchIOOOOOO(1, str, str2, r8, bArr, bArr2, A11);
    }

    public C122296Os(C52742bP r1, C20100A7d a7d, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr, byte[] bArr2) {
        this.A01 = a7d;
        this.A00 = r1;
        this.A04 = str;
        this.A06 = str2;
        this.A09 = bArr;
        this.A08 = bArr2;
        this.A05 = str3;
        this.A07 = str4;
        this.A02 = str5;
        this.A03 = str6;
    }
}
