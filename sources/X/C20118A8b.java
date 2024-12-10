package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.HashMap;

/* renamed from: X.A8b  reason: case insensitive filesystem */
public class C20118A8b {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0P;

    public C20118A8b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.A09 = A05(str, false);
        this.A0A = A04(str2);
        this.A0K = A05(str3, false);
        this.A06 = A05(str4, false);
        this.A0J = A05(str5, false);
        this.A0F = A05(str6, false);
        this.A04 = A05(str7, false);
        this.A0C = A05(str8, false);
        this.A0B = A04(str9);
        this.A0O = A05(str10, true);
        this.A07 = A05((String) null, false);
        this.A0I = A05(str11, false);
        this.A02 = str12;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.9ia, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.A8b, java.lang.Object] */
    public static C20118A8b A00(Uri uri, String str) {
        Uri uri2 = uri;
        if (uri == null) {
            return null;
        }
        if (AnonymousClass8BS.A0n(uri2.toString()).startsWith("upi://mandate")) {
            String A022 = A02(uri2, "pn");
            String A023 = A02(uri2, "am");
            String A024 = A02(uri2, "tr");
            String A025 = A02(uri2, "mc");
            String A032 = A03(uri2, str);
            String A026 = A02(uri2, "purpose");
            String A027 = A02(uri2, "pa");
            String A028 = A02(uri2, "sign");
            String A029 = A02(uri2, "amrule");
            String A0210 = A02(uri2, "tn");
            String A0211 = A02(uri2, "mn");
            String A0212 = A02(uri2, "validitystart");
            String A0213 = A02(uri2, "validityend");
            String A0214 = A02(uri2, "recur");
            String A0215 = A02(uri2, "recurvalue");
            String A0216 = A02(uri2, "recurtype");
            String A0217 = A02(uri2, "rev");
            String A0218 = A02(uri2, "share");
            String A0219 = A02(uri2, "block");
            String A0220 = A02(uri2, "umn");
            ? obj = new Object();
            obj.A09 = A05(A022, false);
            obj.A0A = obj.A04(A023);
            obj.A0K = A05(A024, false);
            obj.A06 = A05(A025, false);
            obj.A04 = A05(A032, false);
            obj.A0C = A05(A026, false);
            obj.A0O = A05(A027, true);
            obj.A0I = A05(A028, false);
            obj.A02 = str;
            obj.A00 = A05(A029, false);
            obj.A07 = A05(A0210, false);
            obj.A05 = A05(A0211, false);
            obj.A0N = A05(A0212, false);
            obj.A0M = A05(A0213, false);
            obj.A03 = A05(A0214, false);
            obj.A0D = A05(A0215, false);
            obj.A0E = A05(A0216, false);
            obj.A0G = A05(A0217, false);
            obj.A0H = A05(A0218, false);
            obj.A01 = A05(A0219, false);
            obj.A0L = A05(A0220, false);
            return obj;
        } else if ("upi".equalsIgnoreCase(uri2.getScheme())) {
            String A0221 = A02(uri2, "am");
            String A0222 = A02(uri2, "mam");
            String A0223 = A02(uri2, "pn");
            String A0224 = A02(uri2, "tr");
            String A0225 = A02(uri2, "mc");
            String A0226 = A02(uri2, "tid");
            String queryParameter = uri2.getQueryParameter("url");
            String A033 = A03(uri2, str);
            String A0227 = A02(uri2, "purpose");
            if (!TextUtils.isEmpty(A0221) && A0221.equals(A0222)) {
                A0222 = null;
            }
            return new C20118A8b(A0223, A0221, A0224, A0225, A0226, queryParameter, A033, A0227, A0222, A02(uri2, "pa"), A02(uri2, "sign"), str);
        } else {
            try {
                String obj2 = uri2.toString();
                ? obj3 = new Object();
                HashMap A002 = obj3.A00(obj2.trim());
                HashMap A003 = obj3.A00(C108945cZ.A1G("26", A002));
                HashMap A004 = obj3.A00(C108945cZ.A1G("27", A002));
                return new C20118A8b(C108945cZ.A1G("59", A002), C108945cZ.A1G("54", A002), C108945cZ.A1G("01", A004), C108945cZ.A1G("52", A002), (String) null, C108945cZ.A1G("02", A004), "03", (String) null, C108945cZ.A1G("02", A003), C108945cZ.A1G("01", A003), (String) null, str);
            } catch (Exception unused) {
                Log.e("PAY: unknown uri");
                return null;
            }
        }
    }

    public static C20118A8b A01(String str, String str2) {
        C20118A8b A002;
        if (str == null || (A002 = A00(Uri.parse(str), str2)) == null) {
            return null;
        }
        A002.A08 = str;
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r9.equals("GALLERY_QR_CODE") != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(android.net.Uri r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "am"
            java.lang.String r0 = r8.getQueryParameter(r0)
            boolean r7 = X.AnonymousClass8BR.A1S(r0)
            java.lang.String r0 = "mode"
            java.lang.String r6 = A02(r8, r0)
            java.lang.String r0 = "SCANNED_QR_CODE"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "GALLERY_QR_CODE"
            boolean r0 = r9.equals(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            r5 = 1
        L_0x0022:
            java.lang.String r0 = "DEEP_LINK"
            boolean r4 = r9.equals(r0)
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ Exception -> 0x003c }
            java.lang.String r2 = "%02d"
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()     // Catch:{ Exception -> 0x003c }
            int r0 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x003c }
            X.AnonymousClass000.A1L(r1, r0)     // Catch:{ Exception -> 0x003c }
            java.lang.String r1 = java.lang.String.format(r3, r2, r1)     // Catch:{ Exception -> 0x003c }
            goto L_0x0047
        L_0x003c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: IndiaUpiInitiationModeUtil/getInitiationMode"
            X.C17900vP.A0X(r2, r0, r1)
            r1 = 0
        L_0x0047:
            if (r5 == 0) goto L_0x0061
            if (r7 == 0) goto L_0x0056
            java.util.HashSet r0 = X.C50922Wh.A00
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "15"
        L_0x0055:
            return r1
        L_0x0056:
            java.util.HashSet r0 = X.C50922Wh.A03
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "01"
            return r1
        L_0x0061:
            if (r4 == 0) goto L_0x006e
            java.util.HashSet r0 = X.C50922Wh.A01
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0055
            java.lang.String r1 = "04"
            return r1
        L_0x006e:
            java.lang.String r1 = "00"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20118A8b.A03(android.net.Uri, java.lang.String):java.lang.String");
    }

    public String A07() {
        String A1H;
        StringBuffer stringBuffer = new StringBuffer();
        A06("pn", this.A09, stringBuffer);
        A06("am", this.A0A, stringBuffer);
        A06("tr", this.A0K, stringBuffer);
        A06("mc", this.A06, stringBuffer);
        A06("tid", this.A0J, stringBuffer);
        A06("url", this.A0F, stringBuffer);
        A06("mode", this.A04, stringBuffer);
        A06("purpose", this.A0C, stringBuffer);
        A06("mam", this.A0B, stringBuffer);
        A06("pa", this.A0O, stringBuffer);
        A06("sign", this.A0I, stringBuffer);
        A06("tn", this.A07, stringBuffer);
        String obj = stringBuffer.toString();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("upi://pay");
        if (TextUtils.isEmpty(obj)) {
            A1H = "";
        } else {
            A1H = AnonymousClass001.A1H("?", obj, AnonymousClass000.A10());
        }
        return AnonymousClass000.A0y(A1H, A10);
    }

    public static String A02(Uri uri, String str) {
        String str2;
        try {
            str2 = uri.getQueryParameter(str);
            if (str2 != null) {
                try {
                    int indexOf = str2.indexOf(63);
                    if (indexOf > 0) {
                        return str2.replace(str2.substring(indexOf), "");
                    }
                } catch (Exception unused) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("PAY: Unsupported URI or parameter does not exist: ");
                    A10.append(uri.getScheme());
                    C17900vP.A0e(":", str, A10);
                    return str2;
                }
            }
        } catch (Exception unused2) {
            str2 = null;
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("PAY: Unsupported URI or parameter does not exist: ");
            A102.append(uri.getScheme());
            C17900vP.A0e(":", str, A102);
            return str2;
        }
        return str2;
    }

    private String A04(String str) {
        boolean z;
        if (TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str) || "0".equals(str) || "0.0".equals(str) || "0.00".equals(str)) {
            return null;
        }
        try {
            new BigDecimal(str.trim());
            z = true;
        } catch (NumberFormatException unused) {
            Log.w("PAY: IndiaUpiDeeplinkMetadata - Unable to parse amount field");
            z = false;
        }
        if (z) {
            return str.trim();
        }
        return null;
    }

    public static String A05(String str, boolean z) {
        if (TextUtils.isEmpty(str) || "null".equalsIgnoreCase(str) || "na".equalsIgnoreCase(str)) {
            return null;
        }
        String trim = str.trim();
        if (z) {
            return AnonymousClass8BS.A0n(trim);
        }
        return trim;
    }

    public static void A06(String str, String str2, StringBuffer stringBuffer) {
        if (!TextUtils.isEmpty(str2)) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append("&");
            }
            stringBuffer.append(str);
            stringBuffer.append("=");
            stringBuffer.append(Uri.encode(str2, "@"));
        }
    }

    public C20118A8b() {
    }
}
