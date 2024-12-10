package X;

import android.content.Context;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9yb  reason: invalid class name and case insensitive filesystem */
public class C198599yb {
    public String A00;
    public final Context A01;
    public final AnonymousClass1KB A02;
    public final C33711jG A03;
    public final C31061ex A04;
    public final A54 A05;
    public final C30931ek A06;

    public C198599yb(Context context, AnonymousClass1KB r8, C33711jG r9, C31061ex r10, A54 a54, C30931ek r12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String str11 = str5;
        String str12 = str6;
        this.A01 = context;
        this.A02 = r8;
        this.A06 = r12;
        this.A04 = r10;
        this.A03 = r9;
        this.A05 = a54;
        if (str3.length() == 12) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(str3.substring(0, 4));
            A10.append("9");
            str3 = AnonymousClass000.A0y(str3.substring(4), A10);
        }
        try {
            JSONObject A15 = C17880vN.A15();
            A15.put("fullName", str);
            A15.put("personalID", str2);
            JSONObject A0x = C108965cb.A0x(str3, "phone", A15);
            A0x.put("street", str4);
            String str13 = "";
            A0x.put("addressNumber", str5 == null ? str13 : str11);
            A0x.put("extraLine", str6 == null ? str13 : str12);
            A0x.put("neighborhood", str7 != null ? str7 : str13);
            A0x.put("city", str8);
            A0x.put("state", str9);
            A0x.put("addressCode", str10);
            A0x.put("country", "BR");
            this.A00 = AnonymousClass8BS.A0k(A0x, "address", A15);
        } catch (JSONException e) {
            C17900vP.A0X(e, "PAY: BrazilSendKYCAction Exception: ", AnonymousClass000.A10());
        }
    }

    public static void A00(C198599yb r15, BBE bbe, AZ2 az2, String str) {
        Context context = r15.A01;
        AnonymousClass1KB r10 = r15.A02;
        C30931ek r14 = r15.A06;
        C188049gn r8 = new C188049gn(context, r10, r15.A03, r15.A04, r15.A05, r14);
        try {
            C29621ca[] r3 = new C29621ca[1];
            AZ2 az22 = az2;
            byte[] A002 = AZ2.A00(az22, AnonymousClass8BR.A1Z(r15.A00));
            AnonymousClass1QE r2 = r8.A05;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("sendKyc Text Blob : ");
            AnonymousClass8BV.A1E(r2, Base64.encodeToString(A002, 2), A10);
            AnonymousClass1MD[] r22 = new AnonymousClass1MD[1];
            int A1W = C17890vO.A1W("key-type", az22.A03, r22);
            r3[A1W] = new C29621ca("text", A002, r22);
            ArrayList A13 = AnonymousClass000.A13();
            C17890vO.A11("action", "send-kyc-data", A13);
            String str2 = az22.A05;
            C17890vO.A11("provider", str2, A13);
            C17890vO.A11("key-version", az22.A04, A13);
            String str3 = str;
            if (str != null) {
                C17890vO.A11("kyc-action-type", str3, A13);
            }
            C17890vO.A11("device-id", r8.A06.A01(), A13);
            C29621ca A0l = AnonymousClass8BR.A0l("account", AnonymousClass8BT.A1b(A13, A1W), r3);
            r8.A03.A0I(new C175458yk(r8.A00, r8.A02, bbe, r8, r8.A01, "send-kyc-data", str2), A0l, "set", 0);
        } catch (UnsupportedEncodingException e) {
            throw new Error(e);
        }
    }
}
