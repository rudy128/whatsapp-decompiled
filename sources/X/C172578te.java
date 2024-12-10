package X;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8te  reason: invalid class name and case insensitive filesystem */
public abstract class C172578te extends AnonymousClass7IA {
    public final C18030ve A00;
    public final AnonymousClass11W A01;
    public final String A02;
    public final String A03;
    public final C18000vb A04;
    public final String A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C172578te(X.AnonymousClass181 r13, X.C19830z4 r14, X.C18000vb r15, X.C18030ve r16, X.C31611fq r17, X.AnonymousClass11W r18, X.AnonymousClass00H r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, X.C18140vp r23, X.C18140vp r24, long r25) {
        /*
            r12 = this;
            r1 = r12
            r10 = r25
            r2 = r13
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r19
            r7 = r20
            r8 = r23
            r9 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r18
            r12.A01 = r0
            r12.A04 = r15
            r12.A00 = r4
            r0 = r21
            r12.A03 = r0
            r0 = r22
            r12.A02 = r0
            r12.A05 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172578te.<init>(X.181, X.0z4, X.0vb, X.0ve, X.1fq, X.11W, X.00H, java.lang.String, java.lang.String, java.lang.String, X.0vp, X.0vp, long):void");
    }

    public String A05() {
        if ((this instanceof C168988k5) || (this instanceof C168958jy)) {
            return "";
        }
        if (this instanceof C168948jx) {
            return this.A01.A03();
        }
        return this.A01.A04(A08());
    }

    public String A06() {
        return this.A04.A0I(A08());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if (r0 != null) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(org.json.JSONObject r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C168988k5
            if (r0 == 0) goto L_0x005f
            r1 = r6
            X.8k5 r1 = (X.C168988k5) r1
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.util.Map r4 = r1.A00
            java.lang.String r0 = "flow_message_version"
            java.lang.Object r5 = r4.get(r0)
            org.json.JSONObject r3 = X.C17880vN.A15()
            java.lang.String r1 = "bloks_version"
            java.lang.String r0 = "4a8a6a30659ce032132e4419bd9a779d6c626ff94a5d708eb753e8e100bbd3eb"
            r3.put(r1, r0)
            java.lang.String r0 = "3"
            boolean r0 = X.C18070vi.A18(r5, r0)
            java.lang.String r1 = "extension_id"
            java.lang.String r2 = "screen_id"
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "2"
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 != 0) goto L_0x0046
            java.lang.Object r0 = r4.get(r1)
            r3.put(r1, r0)
            java.lang.Object r0 = r4.get(r2)
        L_0x003d:
            r3.put(r2, r0)
        L_0x0040:
            java.lang.String r0 = "variables"
            X.AnonymousClass8BS.A1C(r3, r0, r7)
            return
        L_0x0046:
            java.lang.String r0 = "flow_id"
            java.lang.Object r0 = r4.get(r0)
            r3.put(r1, r0)
            java.lang.String r1 = "business_jid"
            java.lang.Object r0 = r4.get(r1)
            r3.put(r1, r0)
            java.lang.Object r0 = r4.get(r2)
            if (r0 == 0) goto L_0x0040
            goto L_0x003d
        L_0x005f:
            java.lang.String r1 = "variables"
            org.json.JSONObject r0 = X.C17880vN.A15()
            r6.A0D(r0)
            X.AnonymousClass8BS.A1C(r0, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172578te.A0A(org.json.JSONObject):void");
    }

    public boolean A0C() {
        if ((this instanceof C168988k5) || (this instanceof C168948jx)) {
            return true;
        }
        return C18020vd.A05(C18040vf.A02, this.A00, 10881);
    }

    public void A0D(JSONObject jSONObject) {
        String str;
        JSONObject A16;
        jSONObject.put("app_id", this.A03);
        if (this instanceof C168988k5) {
            str = "bloks_version";
        } else if ((this instanceof AnonymousClass8k1) || (this instanceof AnonymousClass8k2) || (this instanceof C168958jy) || (this instanceof C168978k4) || (this instanceof AnonymousClass8k0) || (this instanceof C168968jz) || (this instanceof AnonymousClass8k3)) {
            str = "version";
        } else {
            str = "versioning_id";
        }
        jSONObject.put(str, "4a8a6a30659ce032132e4419bd9a779d6c626ff94a5d708eb753e8e100bbd3eb");
        String str2 = this.A02;
        if (TextUtils.isEmpty(str2)) {
            str2 = "{}";
        }
        C18030ve r8 = this.A00;
        C18070vi.A0h(str2, r8);
        if (C22891Dp.A00 || C18020vd.A05(C18040vf.A02, r8, 8202)) {
            try {
                if (str2.length() == 0) {
                    A16 = C17880vN.A15();
                } else {
                    A16 = C17880vN.A16(str2);
                }
                JSONObject A0w = AnonymousClass8BW.A0w("params", A16);
                if (A0w.length() == 0) {
                    JSONObject A0w2 = AnonymousClass8BW.A0w("server_params", A16);
                    if (A0w2.length() != 0) {
                        if (C22891Dp.A00) {
                            A0w2.accumulate("use_new_colors", Boolean.valueOf(C22891Dp.A02));
                        }
                        if (C18020vd.A05(C18040vf.A02, r8, 8202)) {
                            A0w2.accumulate("use_vito_image_span", AnonymousClass000.A0i());
                        }
                        str2 = AnonymousClass8BV.A0r(A0w2, "server_params", A16);
                    }
                }
                JSONObject A0w3 = AnonymousClass8BW.A0w("server_params", A0w);
                if (A0w3.length() == 0 && A0w.length() != 0 && !A0w.has("server_params")) {
                    Iterator A0s = AnonymousClass8BS.A0s(A0w);
                    while (A0s.hasNext()) {
                        String A0v = C17880vN.A0v(A0s);
                        A0w3.accumulate(A0v, A0w.get(A0v));
                    }
                }
                if (C22891Dp.A00) {
                    A0w3.accumulate("use_new_colors", Boolean.valueOf(C22891Dp.A02));
                }
                if (C18020vd.A05(C18040vf.A02, r8, 8202)) {
                    A0w3.accumulate("use_vito_image_span", AnonymousClass000.A0i());
                }
                A0w.put("server_params", A0w3);
                String A0k = AnonymousClass8BS.A0k(A0w, "params", A16);
                C18070vi.A0b(A0k);
                str2 = A0k;
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("params", str2);
    }
}
