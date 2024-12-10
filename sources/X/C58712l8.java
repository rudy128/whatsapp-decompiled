package X;

import android.app.ProgressDialog;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.2l8  reason: invalid class name and case insensitive filesystem */
public final class C58712l8 {
    public AnonymousClass6MI A00;
    public final AnonymousClass181 A01;
    public final C18000vb A02;
    public final C134036pu A03;
    public final AnonymousClass1D9 A04;
    public final AnonymousClass1LU A05;
    public final AnonymousClass129 A06;
    public final AnonymousClass10I A07;

    public final void A01(AnonymousClass1FU r15, C33641j9 r16, String str) {
        String str2;
        String obj;
        C33641j9 r6 = r16;
        String str3 = str;
        C18070vi.A0e(r6, 1, str3);
        AnonymousClass6MI r0 = this.A00;
        if (r0 != null) {
            r0.A0B(true);
        }
        Uri.Builder appendPath = this.A06.A02().appendPath("verification.php");
        C18000vb r02 = this.A02;
        String A042 = r02.A04();
        String A052 = r02.A05();
        C33641j9.A00(r6);
        AnonymousClass11C r9 = r6.A09;
        TelephonyManager A0K = r9.A0K();
        if (A0K != null) {
            str2 = A6P.A01(A0K.getNetworkOperator(), "000-000");
        } else {
            str2 = "none";
        }
        HashMap A11 = C17880vN.A11();
        if (r6.A00 != null) {
            A11.put("platform", "android");
            A11.put("network", str2);
            A11.put("lc", A042);
            A11.put("lg", A052);
            A11.put("context", r6.A00);
            C33641j9.A00(r6);
            StringBuilder A10 = AnonymousClass000.A10();
            if (C17970vW.A0G(r9)) {
                A10.append("rted ");
            }
            try {
                Class.forName("org.acra.ACRA");
                A10.append("nw-wap ");
            } catch (ClassNotFoundException unused) {
            }
            if (A10.length() == 0) {
                obj = null;
            } else {
                obj = A10.toString();
            }
            A11.put("diagnostic", obj);
            String str4 = "true";
            String str5 = "false";
            if (r6.A01) {
                str5 = str4;
            }
            A11.put("fail_too_many", str5);
            String str6 = "false";
            if (r6.A02) {
                str6 = str4;
            }
            A11.put("no_route_sms", str6);
            String str7 = "false";
            if (r6.A03) {
                str7 = str4;
            }
            A11.put("no_route_voice", str7);
            String str8 = "false";
            if (r6.A05) {
                str8 = str4;
            }
            A11.put("valid_number", str8);
            if (!r6.A04) {
                str4 = "false";
            }
            A11.put("no_number", str4);
            A11.put("debug-context", r6.A01(r6.A00));
            String str9 = r6.A00;
            if (str9 != null && !str9.equals("eula") && !str9.equals("register-phone") && !str9.equals("chat-transfer")) {
                String A012 = C18020vd.A01(C18040vf.A02, r6.A0A, 8790);
                if (!TextUtils.isEmpty(A012)) {
                    A11.put("e", A012);
                }
            }
        }
        Iterator A0k = C17890vO.A0k(A11);
        while (A0k.hasNext()) {
            String A0v = C17880vN.A0v(A0k);
            String str10 = (String) A11.get(A0v);
            if (str10 == null) {
                str10 = "";
            }
            appendPath.appendQueryParameter(A0v, str10);
        }
        AnonymousClass1FU r7 = r15;
        AnonymousClass6MI r62 = new AnonymousClass6MI(r7, this.A01, this.A03, this.A04, this.A05, appendPath.toString(), r6.A01(str3));
        this.A00 = r62;
        this.A07.CGD(r62, new String[0]);
    }

    public final void A00() {
        ProgressDialog progressDialog;
        AnonymousClass6MI r1 = this.A00;
        if (r1 != null && (progressDialog = r1.A00) != null && progressDialog.isShowing()) {
            r1.A00.cancel();
        }
    }

    public C58712l8(AnonymousClass181 r1, C18000vb r2, C134036pu r3, AnonymousClass1D9 r4, AnonymousClass1LU r5, AnonymousClass129 r6, AnonymousClass10I r7) {
        C18070vi.A0w(r5, r7, r1, r6, r2);
        C18070vi.A0l(r3, r4);
        this.A05 = r5;
        this.A07 = r7;
        this.A01 = r1;
        this.A06 = r6;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
    }
}
