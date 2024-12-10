package X;

import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: X.8k4  reason: invalid class name and case insensitive filesystem */
public final class C168978k4 extends C172578te {
    public final C18000vb A00;
    public final Set A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C168978k4(X.AnonymousClass181 r21, X.C19830z4 r22, X.C18000vb r23, X.C18030ve r24, X.C31611fq r25, X.AnonymousClass11W r26, X.AnonymousClass00H r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, long r31) {
        /*
            r20 = this;
            r3 = 1
            r8 = r23
            r9 = r24
            int r4 = X.C72453Mb.A0G(r9, r8, r3)
            r1 = 3
            r6 = r21
            r10 = r25
            r11 = r26
            X.C72473Md.A1M(r11, r6, r10, r1)
            r7 = r22
            r12 = r27
            X.C18070vi.A0l(r7, r12)
            r0 = 9
            r14 = r28
            X.C18070vi.A0d(r14, r0)
            r0 = 24
            X.AlQ r16 = X.C21517AlQ.A00(r0)
            r0 = 25
            X.AlQ r17 = X.C21517AlQ.A00(r0)
            r5 = r20
            r15 = r29
            r13 = r30
            r18 = r31
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r5.A00 = r8
            java.lang.String[] r2 = new java.lang.String[r1]
            r1 = 0
            java.lang.String r0 = "en"
            r2[r1] = r0
            java.lang.String r0 = "fr"
            r2[r3] = r0
            java.lang.String r0 = "ar"
            r2[r4] = r0
            java.util.Set r0 = X.AnonymousClass1AP.A03(r2)
            r5.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168978k4.<init>(X.181, X.0z4, X.0vb, X.0ve, X.1fq, X.11W, X.00H, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    public void A0D(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        super.A0D(jSONObject);
        jSONObject.put("tos_version", 1);
    }

    public String A06() {
        if (this.A05 == null) {
            String A06 = super.A06();
            C18070vi.A0X(A06);
            return A06;
        }
        C18000vb r2 = this.A00;
        Locale A0N = r2.A0N();
        String[] strArr = AnonymousClass1X0.A04;
        String languageTag = A0N.toLanguageTag();
        C18070vi.A0X(languageTag);
        if (!this.A01.contains(AnonymousClass1X0.A04(r2.A0N()))) {
            return "en-US";
        }
        return languageTag;
    }
}
