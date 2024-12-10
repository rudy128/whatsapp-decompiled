package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.9BK  reason: invalid class name */
public class AnonymousClass9BK extends A34 {
    public final AnonymousClass190 A00;
    public final C175718zA A01;
    public final BCB A02;
    public final AZC A03;
    public final C30931ek A04;
    public final String A05 = "initial";
    public final boolean A06;
    public final AnonymousClass1KG A07;
    public final AnonymousClass1QH A08;

    public AnonymousClass9BK(AnonymousClass190 r2, C175718zA r3, BCB bcb, AnonymousClass1KG r5, AnonymousClass1QH r6, AZC azc, C30931ek r8, boolean z) {
        this.A04 = r8;
        this.A03 = azc;
        this.A00 = r2;
        this.A06 = z;
        this.A02 = bcb;
        this.A01 = r3;
        this.A08 = r6;
        this.A07 = r5;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            Log.i("PAY: IndiaUpiSetupCoordinator/challenge got");
            C175718zA r11 = this.A01;
            String str2 = this.A05;
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                Log.i("PAY: IndiaUpiSetupCoordinator/getToken called with invalid type/challenge");
            } else {
                Log.i("PAY: IndiaUpiSetupCoordinator/getToken called");
                if (!TextUtils.isEmpty(str)) {
                    AZ6 az6 = r11.A06;
                    az6.COK();
                    AnonymousClass1OZ r26 = r11.A02;
                    String A0B = r26.A0B();
                    String A012 = r11.A09.A01();
                    String A0G = r11.A03.A0G();
                    String A013 = r11.A08.A01();
                    String A0n = AnonymousClass8BS.A0n(str2);
                    C18070vi.A0d(str, 2);
                    C108965cb.A1O(A012, 3, A0n);
                    String[] strArr = new String[3];
                    strArr[0] = "initial";
                    strArr[1] = "reset";
                    List A0O = C18070vi.A0O("rotate", strArr, 2);
                    String[] strArr2 = new String[2];
                    strArr2[0] = "1";
                    C18070vi.A0X(AnonymousClass8BR.A15("2", strArr2, 1));
                    C29591cX A0Y = C108955ca.A0Y();
                    AnonymousClass8BY.A13(A0Y);
                    AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, AnonymousClass8BU.A1Z(A0B, 0, false) ? 1 : 0);
                    C29591cX A0R = AnonymousClass8BS.A0R();
                    C29591cX.A01(A0R, "action", "upi-get-token");
                    if (C29601cY.A04(str, 0, 1000, false)) {
                        C29591cX.A01(A0R, PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, str);
                    }
                    if (C29601cY.A04(A012, 1, 1000, false)) {
                        C29591cX.A01(A0R, "device-id", A012);
                    }
                    if (A0G != null && AnonymousClass8BV.A1V(A0G, 1, true)) {
                        C29591cX.A01(A0R, "provider-type", A0G);
                    }
                    if (A013 != null) {
                        AnonymousClass8BY.A14(A0R, A013);
                    }
                    A0R.A09(A0n, "token-type", A0O);
                    C29621ca A002 = C29591cX.A00(A0R, A0Y);
                    C196259ui r4 = r11.A00;
                    r4.A02("upi-get-token");
                    Context context = r11.A00;
                    AnonymousClass1OZ r0 = r26;
                    AnonymousClass8BW.A1B(r0, new C175958zY(context, r11.A01, r11, r11.A05, r4, az6), A002, A0B);
                }
            }
        } else {
            BCB bcb = this.A02;
            if (bcb != null) {
                bcb.Bv8();
            }
            this.A00.A0G("payments/indiaupi", "Failed to get Challenge", true);
        }
        C191789nB.A09 = null;
    }
}
