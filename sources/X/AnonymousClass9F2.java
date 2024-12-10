package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.9F2  reason: invalid class name */
public class AnonymousClass9F2 extends AnonymousClass9EV {
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass9F2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        String str10 = str3;
        C18070vi.A0d(str10, 4);
        String str11 = str5;
        C18070vi.A0d(str11, 6);
        String[] strArr = new String[2];
        strArr[0] = "mobile_number";
        List A0O = C18070vi.A0O("numeric_id", strArr, 1);
        this.A01 = A0O;
        String[] strArr2 = new String[13];
        strArr2[0] = "active";
        strArr2[1] = "active_pending";
        strArr2[2] = "active_status_pending";
        strArr2[3] = "available";
        strArr2[4] = "available_pending";
        strArr2[5] = "available_status_pending";
        strArr2[6] = "blocked";
        strArr2[7] = "deregistered";
        strArr2[8] = "deregistered_pending";
        strArr2[9] = "inactive";
        strArr2[10] = "inactive_pending";
        strArr2[11] = "inactive_status_pending";
        List A0O2 = C18070vi.A0O("unknown", strArr2, 12);
        this.A00 = A0O2;
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C29591cX.A01(A0Y, "xmlns", "w:pay");
        AnonymousClass8BY.A15(A0Y, str);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "update-alias");
        String str12 = str2;
        if (str2 != null && AnonymousClass8BV.A1X(str12, 1, true)) {
            C29591cX.A01(A0R, "device_id", str12);
        }
        C29591cX A0t = C108945cZ.A0t("alias");
        if (C29601cY.A04(str10, 8, 10, false)) {
            C29591cX.A01(A0t, "alias_value", str10);
        }
        String str13 = str4;
        if (C29601cY.A04(str13, 1, 20, false)) {
            C29591cX.A01(A0t, "alias_id", str13);
        }
        if (C29601cY.A04(str11, 1, 1000, false)) {
            C29591cX.A01(A0t, "vpa", str11);
        }
        String str14 = str6;
        if (str6 != null && C29601cY.A04(str14, 1, 1000, true)) {
            C29591cX.A01(A0t, "vpa_id", str14);
        }
        String str15 = str7;
        if (C29601cY.A04(str15, 1, 1000, true)) {
            C29591cX.A01(A0t, "vpa_name", str15);
        }
        A0t.A09(str8, "alias_type", A0O);
        A0t.A08(str9, "alias_status", A0O2);
        AnonymousClass8BX.A1I(A0t, A0R, A0Y);
        this.A02 = A0Y.A03();
    }

    public AnonymousClass9F2(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str2;
        C18070vi.A0d(str8, 2);
        String str9 = str3;
        String str10 = str4;
        C108985cd.A1D(str9, str10);
        List A0N = C18070vi.A0N("1", "2", new String[2], 0, 1);
        this.A01 = A0N;
        List A0N2 = C18070vi.A0N("0", "1", new String[2], 0, 1);
        this.A00 = A0N2;
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A13(A0Y);
        AnonymousClass8BY.A15(A0Y, str);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-bind-device");
        if (C29601cY.A04(str8, 1, 1000, false)) {
            C29591cX.A01(A0R, "device-id", str8);
        }
        if (AnonymousClass8BV.A1U(str9, 1)) {
            C29591cX.A01(A0R, "verification-data", str9);
        }
        if (AnonymousClass8BV.A1V(str10, 1, false)) {
            C29591cX.A01(A0R, "provider-type", str10);
        }
        String str11 = str5;
        if (str5 != null && AnonymousClass8BV.A1W(str11, 1, true)) {
            C29591cX.A01(A0R, "sms-phone-number", str11);
        }
        if (l != null && AnonymousClass8BX.A1T(l)) {
            C108965cb.A1I(A0R, "delay", l.longValue());
        }
        if (l2 != null && AnonymousClass8BX.A1T(l2)) {
            C108965cb.A1I(A0R, "counter", l2.longValue());
        }
        String str12 = str6;
        if (str6 != null && C29601cY.A04(str12, 1, 1000, true)) {
            C29591cX.A01(A0R, "device_ssid", str12);
        }
        A0R.A09("2", "version", A0N);
        A0R.A08(str7, "existing-account", A0N2);
        this.A02 = C29591cX.A00(A0R, A0Y);
    }
}
