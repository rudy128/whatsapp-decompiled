package X;

import android.util.Base64;
import org.json.JSONObject;

/* renamed from: X.8tc  reason: invalid class name and case insensitive filesystem */
public final class C172558tc extends AnonymousClass7IA {
    public final String A00;
    public final String A01;
    public final String A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C172558tc(X.AnonymousClass181 r14, X.C19830z4 r15, X.C18030ve r16, X.C31611fq r17, X.AnonymousClass00H r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r13 = this;
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            X.C18070vi.A0s(r4, r14, r15, r6)
            r0 = 8
            r5 = r17
            X.C18070vi.A0d(r5, r0)
            r0 = 17
            X.AlQ r9 = X.C21517AlQ.A00(r0)
            r0 = 18
            X.AlQ r10 = X.C21517AlQ.A00(r0)
            r8 = 0
            java.lang.String r7 = "WA|471011608249857|4b543e9203c0b420cb5617b71ff0b80a"
            r11 = 6295637663798499(0x165dd95e95d4e3, double:3.110458288347082E-308)
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r19
            r13.A02 = r0
            r0 = r20
            r13.A01 = r0
            r0 = r21
            r13.A00 = r0
            java.lang.String r0 = "extensions"
            r13.A09(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172558tc.<init>(X.181, X.0z4, X.0ve, X.1fq, X.00H, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void A0A(JSONObject jSONObject) {
        int A0F;
        int A0F2;
        C18070vi.A0d(jSONObject, 0);
        JSONObject A15 = C17880vN.A15();
        String str = this.A00;
        if (AnonymousClass1YE.A0A(str, "AesKey=", false) && (A0F = AnonymousClass1YF.A0F(str, ";IV=", 0, false)) > 0 && (A0F2 = AnonymousClass1YF.A0F(str, ";Data=", 0, false)) > 0) {
            String A0q = C108955ca.A0q(7, A0F, str);
            String A0q2 = C108955ca.A0q(A0F + 4, A0F2, str);
            String A0z = C108955ca.A0z(str, A0F2 + 6);
            byte[] decode = Base64.decode(A0q, 2);
            byte[] decode2 = Base64.decode(A0q2, 2);
            byte[] decode3 = Base64.decode(A0z, 2);
            if (!(decode == null || decode2 == null || decode3 == null)) {
                C185889dJ r2 = new C185889dJ(decode, decode3, decode2);
                A15.put("encrypted_flow_data", Base64.encodeToString(r2.A00, 2));
                A15.put("encrypted_aes_key", Base64.encodeToString(r2.A01, 2));
                A15.put("initial_vector", Base64.encodeToString(r2.A02, 2));
            }
        }
        String str2 = this.A02;
        if (C18070vi.A18(str2, "2") || C18070vi.A18(str2, "3")) {
            try {
                String str3 = this.A01;
                C17960vV.A07(str3);
                C18070vi.A0X(str3);
                A15.put("extension_id", Long.parseLong(str3));
            } catch (NumberFormatException e) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("FlowsLogger/FlowsDataExchangeGraphqlRequest/addVersionSpecificVariables: Exception when parsing flowId:");
                C17890vO.A13(this.A01, A10, e);
            }
        }
        jSONObject.put("variables", C18070vi.A0H(A15));
    }

    public void CBv(C1606989o r4) {
        C18070vi.A0d(r4, 0);
        C18030ve r2 = this.A03;
        if (!C18020vd.A05(C18040vf.A02, r2, 5333) || !AnonymousClass8BS.A1N(r2)) {
            super.CBv(r4);
        } else {
            r4.Bsw(AnonymousClass8BR.A0w("extensions-business-endpoint-response-error"));
        }
    }

    public String A05() {
        return "";
    }
}
