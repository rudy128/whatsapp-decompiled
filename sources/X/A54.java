package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONException;
import org.json.JSONObject;

public class A54 {
    public static final byte[] A04 = Base64.decode("l6AjIyMhJYdTCB0+urtee7k2HmerRdr4c6seZyY2Pmw=", 2);
    public static final byte[] A05 = Base64.decode("oHsO+vVXYHOZXitgkZS2DI9N4+L+klLpMby3+JOPVGo=", 2);
    public final AnonymousClass11P A00;
    public final A0t A01;
    public final AnonymousClass1QE A02 = AnonymousClass1QE.A00("PaymentsProviderKeyManager", "infra", "COMMON");
    public final AnonymousClass00H A03;

    public static AZ2 A00(C29621ca r14) {
        Long valueOf;
        byte[] bytes;
        String A0P = r14.A0P("key-type");
        String A0P2 = r14.A0P("provider");
        String A0P3 = r14.A0P("key-version");
        String A0P4 = r14.A0P("key-scope");
        byte[] bArr = null;
        String A0Q = r14.A0Q("expiry-ts", (String) null);
        if (!"none".equals(A0P)) {
            bArr = r14.A0L("data").A01;
        }
        if (TextUtils.isEmpty(A0Q)) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(C20099A7c.A03(A0Q));
        }
        AZ2 az2 = new AZ2(valueOf, A0P2, A0P4, A0P, A0P3, bArr);
        if (!"DOC-UPLOAD".equals(A0P4) && !"DYI-REPORT".equals(A0P4)) {
            byte[] bArr2 = r14.A0L(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE).A01;
            C17960vV.A07(bArr2);
            Boolean bool = C17970vW.A01;
            C21521AlU alU = new C21521AlU(A04);
            byte[][] bArr3 = new byte[6][];
            bArr3[0] = az2.A05.getBytes();
            bArr3[1] = az2.A03.getBytes();
            bArr3[2] = az2.A04.getBytes();
            byte[] bArr4 = az2.A06;
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            bArr3[3] = bArr4;
            bArr3[4] = az2.A02.getBytes();
            Long l = az2.A01;
            if (l == null) {
                bytes = new byte[0];
            } else {
                bytes = String.valueOf(l).getBytes();
            }
            bArr3[5] = bytes;
            if (!C19945A0c.A00().A01(alU.A01, A8G.A05(bArr3), bArr2)) {
                return null;
            }
        }
        return az2;
    }

    public AZ2 A01(String str, String str2) {
        Long l;
        A0t a0t = this.A01;
        AZ2 A012 = a0t.A01(str, str2);
        if (A012 == null || (l = A012.A01) == null || l.longValue() * 1000 >= AnonymousClass11P.A01(this.A00)) {
            return A012;
        }
        a0t.A02(str, str2);
        return null;
    }

    public void A02(A7B a7b, String str, String str2) {
        this.A01.A02(str, str2);
        C29621ca r0 = a7b.A03;
        if (r0 != null) {
            try {
                AZ2 A002 = A00(r0);
                if (A002 != null) {
                    A03(A002);
                }
            } catch (AnonymousClass1UI e) {
                AnonymousClass8BX.A1C(this.A02, e, "handleStaleKey/failed to parse key node/exception: ", AnonymousClass000.A10());
            }
        }
    }

    public void A03(AZ2 az2) {
        A0t a0t = this.A01;
        String str = az2.A02;
        SharedPreferences.Editor edit = A0t.A00(a0t).edit();
        JSONObject A15 = C17880vN.A15();
        try {
            A15.put("key_type", az2.A03).put("key_version", az2.A04);
            byte[] bArr = az2.A06;
            if (bArr != null) {
                A15.put("key_data", C108955ca.A14(bArr));
            }
            Long l = az2.A01;
            if (l != null) {
                A15.put("key_expiry", AnonymousClass001.A1E(l, "", AnonymousClass000.A10()));
            }
            edit.putString(AnonymousClass001.A1H("::", str, AnonymousClass000.A11(az2.A05)), A15.toString());
            edit.apply();
        } catch (JSONException e) {
            AnonymousClass8BX.A1C(a0t.A01, e, "storeProviderKey threw ", AnonymousClass000.A10());
        }
    }

    public A54(AnonymousClass11P r4, A0t a0t, AnonymousClass00H r6) {
        this.A00 = r4;
        this.A03 = r6;
        this.A01 = a0t;
    }
}
