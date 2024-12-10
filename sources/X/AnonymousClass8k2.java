package X;

import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.8k2  reason: invalid class name */
public final class AnonymousClass8k2 extends C172578te {
    public final C18000vb A00;

    public void A0D(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        super.A0D(jSONObject);
        jSONObject.put("tos_version", "1");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8k2(X.AnonymousClass181 r16, X.C19830z4 r17, X.C18000vb r18, X.C18030ve r19, X.C31611fq r20, X.AnonymousClass11W r21, X.AnonymousClass00H r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26) {
        /*
            r15 = this;
            r1 = r16
            r2 = r17
            r5 = r20
            r6 = r21
            r7 = r22
            X.C18070vi.A0w(r6, r1, r5, r2, r7)
            r0 = 7
            r9 = r23
            X.C18070vi.A0d(r9, r0)
            r3 = r18
            r4 = r19
            X.C72473Md.A1L(r4, r3)
            r0 = 36
            X.AlQ r11 = X.C21517AlQ.A00(r0)
            r0 = 37
            X.AlQ r12 = X.C21517AlQ.A00(r0)
            r0 = r15
            r10 = r24
            r8 = r25
            r13 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8k2.<init>(X.181, X.0z4, X.0vb, X.0ve, X.1fq, X.11W, X.00H, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    public String A06() {
        boolean A05 = C18020vd.A05(C18040vf.A02, this.A03, 2827);
        if (A05) {
            Locale A0N = this.A00.A0N();
            String[] strArr = AnonymousClass1X0.A04;
            String languageTag = A0N.toLanguageTag();
            C18070vi.A0X(languageTag);
            HashMap A08 = A08();
            if (!A08.containsKey(languageTag)) {
                return languageTag;
            }
            String A1G = C108945cZ.A1G(languageTag, A08);
            if (A1G == null) {
                return "en_US";
            }
            return A1G;
        } else if (!A05) {
            String A06 = super.A06();
            C18070vi.A0X(A06);
            return A06;
        } else {
            throw AnonymousClass3MW.A14();
        }
    }
}
