package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.8sg  reason: invalid class name and case insensitive filesystem */
public final class C172038sg extends C20081A6h {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C172038sg(X.AnonymousClass11P r15, X.AnonymousClass118 r16, X.C196109uT r17, X.C19830z4 r18, X.C18030ve r19, X.AnonymousClass18K r20, X.C189399jB r21, X.AnonymousClass19V r22, X.AnonymousClass19Y r23, X.AnonymousClass19T r24, X.AnonymousClass198 r25, X.AnonymousClass10I r26) {
        /*
            r14 = this;
            r1 = r15
            r2 = r16
            r6 = r20
            r11 = r25
            r12 = r26
            X.C18070vi.A0w(r15, r2, r12, r6, r11)
            r4 = r18
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            X.C18070vi.A0x(r4, r10, r8, r9, r7)
            r3 = r17
            r5 = r19
            X.C72473Md.A1L(r5, r3)
            r13 = 200740397(0xbf70e2d, float:9.516227E-32)
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172038sg.<init>(X.11P, X.118, X.9uT, X.0z4, X.0ve, X.18K, X.9jB, X.19V, X.19Y, X.19T, X.198, X.10I):void");
    }

    public final void A0F(Jid jid, Boolean bool, Integer num, String str, String str2, String str3, int i) {
        String str4;
        String str5 = str;
        int i2 = i;
        A04(i, str);
        if (bool != null) {
            A07(i, "psl_is_draft", bool.booleanValue());
        }
        switch (num.intValue()) {
            case 0:
                str4 = "prefetch_conversation";
                break;
            case 1:
                str4 = "prefetch_message";
                break;
            default:
                str4 = "user_interaction";
                break;
        }
        A06(i, "fetch_context", str4);
        A09(jid, str2, str3, str5, i2);
    }

    public final void A0E(int i, String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            A06(i, "error_code", str);
        }
        if (str2 != null && str2.length() != 0) {
            A06(i, "error_message", str2);
        }
    }
}
