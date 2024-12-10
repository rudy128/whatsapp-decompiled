package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9nM  reason: invalid class name and case insensitive filesystem */
public class C191889nM {
    public final Context A00;
    public final AnonymousClass1KB A01;
    public final C20074A6a A02;
    public final C33711jG A03;
    public final C31061ex A04;
    public final A54 A05;
    public final C189519jN A06;
    public final AnonymousClass11S A07;
    public final AnonymousClass11P A08;
    public final AnonymousClass1OZ A09;
    public final AnonymousClass1QD A0A;
    public final C191389mW A0B;

    public void A00(A7B a7b, AZ2 az2) {
        if (a7b == null) {
            AZ2 az22 = az2;
            if (az2 != null) {
                Log.i("PAY: BrazilDeviceRegistrationAction starts to bind device");
                AZ0 az0 = (AZ0) az22.A00;
                String A002 = this.A0B.A00(5);
                String A072 = this.A0A.A07();
                C20074A6a a6a = this.A02;
                String A003 = C20074A6a.A00(a6a, 5);
                String str = null;
                if (!TextUtils.isEmpty(A003)) {
                    byte[] bArr = new byte[0];
                    try {
                        byte[] bArr2 = (byte[]) JniBridge.jvidispatchOO(32, AnonymousClass8BR.A1Z(A003));
                        bArr = bArr2;
                        if (bArr2 == null) {
                        }
                    } catch (UnsupportedEncodingException e) {
                        Log.e("PAY: BrazilTokenizationHelper/generateDevicePublicKeyPem failed generating public pem key: ", e);
                    }
                    str = new String(bArr).split("\u0000")[0];
                }
                JSONObject A15 = C17880vN.A15();
                try {
                    A15.put("deviceId", A002).put("devicePublicKey", str).put("walletId", A072);
                } catch (JSONException e2) {
                    C17900vP.A0Y(e2, "PAY: BrazilDeviceRegistrationAction payload generation failed :", AnonymousClass000.A10());
                    e2.printStackTrace();
                }
                String A032 = a6a.A03(az0, A15.toString());
                String A004 = AnonymousClass1PP.A00(this.A07, this.A08, false);
                AnonymousClass1OZ r2 = this.A09;
                String A0B2 = r2.A0B();
                C108985cd.A1D(A032, A002);
                C29591cX A0Y = C108955ca.A0Y();
                AnonymousClass8BY.A13(A0Y);
                AnonymousClass8BY.A15(A0Y, A0B2);
                C29591cX A0R = AnonymousClass8BS.A0R();
                C29591cX.A01(A0R, "action", "br-device-registration");
                if (AnonymousClass8BV.A1Y(A004, 1, false)) {
                    C29591cX.A01(A0R, "nonce", A004);
                }
                C29591cX A0t = C108945cZ.A0t("elo");
                if (C29601cY.A04(A032, 1, 10000, false)) {
                    C29591cX.A01(A0t, "ciphered_binding_info", A032);
                }
                if (AnonymousClass8BV.A1X(A002, 1, false)) {
                    C29591cX.A01(A0t, "network_device_id", A002);
                }
                AnonymousClass8BX.A1I(A0t, A0R, A0Y);
                AnonymousClass8BW.A1B(r2, new C175408yf(this.A00, this.A03, this.A01, this, 2), A0Y.A03(), A0B2);
                return;
            }
        }
        Log.i("PAY: BrazilDeviceRegistrationAction missing key");
        C189519jN r1 = this.A06;
        new A7B();
        r1.A00((C188059go) null);
    }

    public C191889nM(Context context, AnonymousClass1KB r2, AnonymousClass11S r3, AnonymousClass11P r4, AnonymousClass1OZ r5, C20074A6a a6a, C33711jG r7, AnonymousClass1QD r8, C31061ex r9, A54 a54, C189519jN r11, C191389mW r12) {
        this.A08 = r4;
        this.A00 = context;
        this.A01 = r2;
        this.A07 = r3;
        this.A09 = r5;
        this.A0A = r8;
        this.A04 = r9;
        this.A0B = r12;
        this.A02 = a6a;
        this.A03 = r7;
        this.A05 = a54;
        this.A06 = r11;
    }
}
