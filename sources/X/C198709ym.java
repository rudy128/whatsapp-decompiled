package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9ym  reason: invalid class name and case insensitive filesystem */
public class C198709ym {
    public final Context A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass1KI A02;
    public final C33711jG A03;
    public final C31061ex A04;
    public final AnonymousClass1QS A05;
    public final A54 A06;
    public final AnonymousClass1QE A07 = AnonymousClass1QE.A00("BrazilAddCredentialAction", "network", "BR");
    public final C20037A4g A08;
    public final AnonymousClass11S A09;
    public final AnonymousClass11P A0A;
    public final AnonymousClass1OZ A0B;

    public C198709ym(Context context, AnonymousClass1KB r5, AnonymousClass11S r6, AnonymousClass11P r7, AnonymousClass1KI r8, AnonymousClass1OZ r9, C33711jG r10, C31061ex r11, AnonymousClass1QS r12, A54 a54, C20037A4g a4g) {
        this.A0A = r7;
        this.A00 = context;
        this.A01 = r5;
        this.A09 = r6;
        this.A0B = r9;
        this.A05 = r12;
        this.A08 = a4g;
        this.A04 = r11;
        this.A02 = r8;
        this.A03 = r10;
        this.A06 = a54;
    }

    public static void A00(C198709ym r32, AZ2 az2, C184839bb r34, Boolean bool, String str, String str2, String str3, String str4) {
        String str5;
        try {
            JSONObject A15 = C17880vN.A15();
            A15.put("pushAccountData", str);
            A15.put("phone", str3);
            String str6 = str2;
            if (TextUtils.isEmpty(str6) || str6.equals("MASTERCARD")) {
                A15.put("issuer", "M");
            } else if (str6.equals("VISA")) {
                A15.put("issuer", "V");
            }
            AZ2 az22 = az2;
            byte[] A002 = AZ2.A00(az22, AnonymousClass8BR.A1Z(A15.toString()));
            C198709ym r2 = r32;
            String A003 = AnonymousClass1PP.A00(r2.A09, r2.A0A, false);
            AnonymousClass1OZ r33 = r2.A0B;
            String A0B2 = r33.A0B();
            String str7 = az22.A05;
            long parseLong = Long.parseLong(az22.A04);
            if (bool == null || bool.booleanValue()) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            String str8 = az22.A03;
            int A0G = C72453Mb.A0G(str8, A002, 1);
            List A0N = C18070vi.A0N("BANK", "CARD", new String[A0G], 0, 1);
            C29591cX A0t = C108945cZ.A0t("credential");
            if (C29601cY.A04(str8, 1, 100, false)) {
                C29591cX.A01(A0t, "key_type", str8);
            }
            C29601cY.A02(A002, 1, 32786);
            A0t.A01 = A002;
            A0t.A09("CARD", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0N);
            C29621ca A032 = A0t.A03();
            String str9 = str4;
            C18070vi.A0f(str9, A0G, str7);
            String[] strArr = new String[A0G];
            strArr[0] = "0";
            List A0O = C18070vi.A0O("1", strArr, 1);
            C29591cX A0O2 = AnonymousClass8BY.A0O();
            C29591cX.A01(A0O2, "xmlns", "w:pay");
            C29591cX.A01(A0O2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
            AnonymousClass8BW.A1F(A0O2, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2, C29601cY.A04(A0B2, 0, 9007199254740991L, false) ? 1 : 0);
            C29591cX A0R = AnonymousClass8BS.A0R();
            C29591cX.A01(A0R, "action", "br-add-credential");
            if (AnonymousClass8BV.A1X(str9, 1, false)) {
                C29591cX.A01(A0R, "device_id", str9);
            }
            if (AnonymousClass8BV.A1Y(A003, 1, false)) {
                C29591cX.A01(A0R, "nonce", A003);
            }
            if (AnonymousClass8BV.A1W(str7, 1, false)) {
                C29591cX.A01(A0R, "provider", str7);
            }
            if (C29601cY.A03(Long.valueOf(parseLong), -9007199254740991L, 9007199254740991L, false)) {
                C108965cb.A1I(A0R, "key_version", parseLong);
            }
            A0R.A09(str5, "is_first_card", A0O);
            A0R.A05(A032);
            C29621ca A004 = C29591cX.A00(A0R, A0O2);
            Context context = r2.A00;
            AnonymousClass1KB r1 = r2.A01;
            r33.A0I(new C175428yh(context, r2.A03, r1, r34, r2, 5), A004, A0B2, 204, 0);
        } catch (UnsupportedEncodingException | JSONException e) {
            throw new Error(e);
        }
    }
}
