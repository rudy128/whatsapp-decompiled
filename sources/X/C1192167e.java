package X;

import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.67e  reason: invalid class name and case insensitive filesystem */
public class C1192167e extends AnonymousClass7IA {
    public AnonymousClass11W A00;
    public AnonymousClass118 A01;
    public C18140vp A02;
    public C18140vp A03;
    public final C136376ti A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1192167e(X.AnonymousClass181 r13, X.AnonymousClass118 r14, X.C19830z4 r15, X.C18030ve r16, X.C136376ti r17, X.C31611fq r18, X.AnonymousClass11W r19, X.AnonymousClass00H r20, X.C18140vp r21, X.C18140vp r22) {
        /*
            r12 = this;
            java.lang.String r7 = "WA|1204736340391413|27a2ec0243956dfa5ad1fa8caad0b2d4"
            r10 = 6011435782294262(0x155b5e7664caf6, double:2.9700439022123937E-308)
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r16
            r5 = r18
            r6 = r20
            r8 = r21
            r9 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = "biz_linked_account_posts"
            r12.A09(r0)
            r0 = r17
            r12.A04 = r0
            r12.A01 = r14
            r0 = r19
            r12.A00 = r0
            r12.A02 = r8
            r12.A03 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1192167e.<init>(X.181, X.118, X.0z4, X.0ve, X.6ti, X.1fq, X.11W, X.00H, X.0vp, X.0vp):void");
    }

    public String A06() {
        String A0H = C18070vi.A0H(Locale.getDefault());
        HashMap A08 = A08();
        if (!A08.containsKey(A0H)) {
            return A0H;
        }
        String A1G = C108945cZ.A1G(A0H, A08);
        if (A1G == null) {
            return "en_US";
        }
        return A1G;
    }
}
