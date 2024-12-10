package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.UserJid;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8sh  reason: invalid class name and case insensitive filesystem */
public final class C172048sh extends C20081A6h {
    public static final AtomicInteger A00 = new AtomicInteger(SearchActionVerificationClientService.NOTIFICATION_ID);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C172048sh(X.AnonymousClass11P r15, X.AnonymousClass118 r16, X.C196109uT r17, X.C19830z4 r18, X.C18030ve r19, X.AnonymousClass18K r20, X.C189399jB r21, X.AnonymousClass19V r22, X.AnonymousClass19Y r23, X.AnonymousClass19T r24, X.AnonymousClass198 r25, X.AnonymousClass10I r26) {
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
            r13 = 200743350(0xbf719b6, float:9.5179625E-32)
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172048sh.<init>(X.11P, X.118, X.9uT, X.0z4, X.0ve, X.18K, X.9jB, X.19V, X.19Y, X.19T, X.198, X.10I):void");
    }

    public final int A0E(UserJid userJid, String str) {
        C18070vi.A0d(userJid, 0);
        int andIncrement = A00.getAndIncrement();
        A04(andIncrement, "extensionMetadataPerfTracker");
        A06(andIncrement, "biz_jid", this.A03.A00(userJid));
        A06(andIncrement, "fetch_context", str);
        A0B(Integer.valueOf(andIncrement), "fetch_start");
        return andIncrement;
    }

    public final void A0G(Integer num, Short sh) {
        if (num != null) {
            A0B(num, "fetch_end");
            A08(num.intValue(), sh.shortValue());
        }
    }

    public final void A0H(Integer num, String str, String str2) {
        if (num != null) {
            if (str.length() != 0) {
                A06(num.intValue(), "metadata_error_key", str);
            }
            if (str2 != null && str2.length() != 0) {
                A06(num.intValue(), "metadata_error_message", str2);
            }
        }
    }

    public final void A0F(int i, String str) {
        if (str.length() != 0) {
            A06(i, "metadata_network_fetch_reason", str);
        }
    }
}
