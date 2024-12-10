package X;

import com.whatsapp.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.4pj  reason: invalid class name and case insensitive filesystem */
public class C97594pj implements AnonymousClass1O5 {
    public C26181Rd A00;
    public ConcurrentMap A01 = new ConcurrentHashMap();
    public boolean A02 = false;
    public boolean A03 = true;
    public final AnonymousClass1KB A04;
    public final C23651Hc A05;
    public final C822444b A06;
    public final C72363Lq A07;
    public final AnonymousClass1OZ A08;
    public final AnonymousClass10I A09;

    public void A01(C85834Ox r4) {
        this.A09.CGF(new C70633Bw(this, r4, 39));
    }

    public void BrD(String str) {
        this.A01.remove(str);
        if (!this.A02) {
            this.A04.CGP(new C70573Bq(this.A07, 26));
        }
    }

    public void Bt9(C29621ca r5, String str) {
        this.A01.remove(str);
        if (!this.A02) {
            Log.e("GetCTWAContextIQ/response-error");
            C29621ca A0K = r5.A0K("error");
            if (A0K != null) {
                this.A04.CGP(new AnonymousClass7RM((Object) this, A0K.A0A("code", 0), 0));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.4TY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r1v9, types: [X.4FP, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v3 */
    /* JADX WARNING: type inference failed for: r14v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r24, java.lang.String r25) {
        /*
            r23 = this;
            r2 = r23
            boolean r0 = r2.A02
            r3 = r25
            if (r0 == 0) goto L_0x000e
            java.util.concurrent.ConcurrentMap r0 = r2.A01
            r0.remove(r3)
            return
        L_0x000e:
            java.lang.String r0 = "context"
            r1 = r24
            X.1ca r5 = r1.A0K(r0)
            if (r5 == 0) goto L_0x01a1
            java.lang.String r0 = "headline"
            java.lang.String r16 = A00(r5, r0)
            java.lang.String r0 = "body"
            java.lang.String r17 = A00(r5, r0)
            java.lang.String r0 = "click_id"
            java.lang.String r19 = A00(r5, r0)
            java.lang.String r0 = "referral_parameter"
            java.lang.String r20 = A00(r5, r0)
            java.lang.String r0 = "source"
            X.1ca r1 = r5.A0K(r0)
            if (r1 == 0) goto L_0x01a1
            java.lang.String r0 = "id"
            java.lang.String r7 = A00(r1, r0)
            java.lang.String r0 = "type"
            java.lang.String r6 = A00(r1, r0)
            java.lang.String r4 = "url"
            java.lang.String r1 = A00(r1, r4)
            if (r7 == 0) goto L_0x01a1
            int r0 = r7.length()
            if (r0 == 0) goto L_0x01a1
            if (r6 == 0) goto L_0x01a1
            int r0 = r6.length()
            if (r0 == 0) goto L_0x01a1
            if (r1 == 0) goto L_0x01a1
            int r0 = r1.length()
            if (r0 == 0) goto L_0x01a1
            X.4UF r12 = new X.4UF
            r12.<init>(r7, r6, r1)
            java.lang.String r0 = "thumbnail"
            X.1ca r6 = r5.A0K(r0)
            r14 = 0
            if (r6 == 0) goto L_0x008c
            java.lang.String r1 = A00(r6, r4)
            if (r1 == 0) goto L_0x008c
            int r0 = r1.length()
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "bytes"
            X.1ca r0 = r6.A0K(r0)
            if (r0 == 0) goto L_0x0086
            byte[] r14 = r0.A01
        L_0x0086:
            X.4TY r0 = new X.4TY
            r0.<init>(r1, r14)
            r14 = r0
        L_0x008c:
            java.lang.String r0 = "welcome_message"
            X.1ca r0 = r5.A0K(r0)
            if (r0 == 0) goto L_0x00d9
            java.lang.String r18 = r0.A0M()
        L_0x0098:
            java.lang.String r0 = "icebreaker"
            java.util.List r0 = r5.A0R(r0)
            X.DcQ r7 = X.AnonymousClass1ZT.A01()
            if (r0 == 0) goto L_0x00dc
            java.util.Iterator r8 = r0.iterator()
        L_0x00a8:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r1 = r8.next()
            X.1ca r1 = (X.C29621ca) r1
            java.lang.String r0 = "question"
            X.1ca r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x00a8
            java.lang.String r6 = r0.A0M()
            if (r6 == 0) goto L_0x00a8
            java.lang.String r0 = "response"
            X.1ca r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x00d7
            java.lang.String r1 = r0.A0M()
        L_0x00ce:
            X.4cE r0 = new X.4cE
            r0.<init>(r6, r1)
            r7.add(r0)
            goto L_0x00a8
        L_0x00d7:
            r1 = 0
            goto L_0x00ce
        L_0x00d9:
            r18 = 0
            goto L_0x0098
        L_0x00dc:
            X.DcQ r22 = X.AnonymousClass1ZT.A02(r7)
            java.lang.String r0 = "flow"
            X.1ca r6 = r5.A0K(r0)
            r13 = 0
            if (r6 == 0) goto L_0x0118
            java.lang.String r0 = "flow_id"
            java.lang.String r1 = A00(r6, r0)
            java.lang.String r0 = "flow_cta"
            java.lang.String r0 = A00(r6, r0)
            java.lang.String r7 = "flow_first_screen"
            java.lang.String r6 = A00(r6, r7)
            if (r1 == 0) goto L_0x0118
            int r7 = r1.length()
            if (r7 == 0) goto L_0x0118
            if (r0 == 0) goto L_0x0118
            int r7 = r0.length()
            if (r7 == 0) goto L_0x0118
            if (r6 == 0) goto L_0x0118
            int r7 = r6.length()
            if (r7 == 0) goto L_0x0118
            X.4UG r13 = new X.4UG
            r13.<init>(r1, r0, r6)
        L_0x0118:
            java.lang.String r0 = "original_image"
            X.1ca r0 = r5.A0K(r0)
            r21 = 0
            if (r0 == 0) goto L_0x0130
            java.lang.String r1 = A00(r0, r4)
            if (r1 == 0) goto L_0x0130
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0130
            r21 = r1
        L_0x0130:
            java.lang.String r0 = "video"
            X.1ca r0 = r5.A0K(r0)
            r15 = 0
            if (r0 == 0) goto L_0x014a
            java.lang.String r1 = A00(r0, r4)
            if (r1 == 0) goto L_0x014a
            int r0 = r1.length()
            if (r0 == 0) goto L_0x014a
            X.4Sl r15 = new X.4Sl
            r15.<init>(r1)
        L_0x014a:
            X.4VG r11 = new X.4VG
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.util.concurrent.ConcurrentMap r0 = r2.A01
            java.lang.Object r1 = r0.get(r3)
            X.4Ox r1 = (X.C85834Ox) r1
            X.4UG r0 = r11.A01
            if (r0 == 0) goto L_0x0197
            if (r1 == 0) goto L_0x0197
            com.whatsapp.jid.UserJid r10 = r1.A00
            if (r10 == 0) goto L_0x0197
            java.lang.String r9 = r1.A02
            java.lang.String r8 = r0.A00
            java.lang.String r7 = r0.A02
            java.lang.String r6 = r0.A01
            r5 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r3 = 0
            r0 = 2
            X.C18070vi.A0d(r9, r0)
            X.4FP r1 = new X.4FP
            r1.<init>()
            r1.A01 = r10
            r1.A06 = r9
            r1.A07 = r8
            r1.A08 = r7
            r1.A09 = r6
            r1.A05 = r3
            r1.A0A = r3
            r1.A02 = r3
            r1.A03 = r3
            r1.A0B = r5
            r1.A0C = r5
            r1.A00 = r3
            r1.A04 = r4
            X.44b r0 = r2.A06
            r0.A09(r1)
        L_0x0197:
            X.1KB r3 = r2.A04
            r0 = 38
            X.3Bw r1 = new X.3Bw
            r1.<init>(r2, r11, r0)
            goto L_0x01c0
        L_0x01a1:
            java.util.concurrent.ConcurrentMap r0 = r2.A01
            r0.remove(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetCTWAContextIQ/onSuccess corrupted-response context iq="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ""
            X.C17890vO.A19(r1, r0)
            X.1KB r3 = r2.A04
            r0 = 25
            X.3Bq r1 = new X.3Bq
            r1.<init>(r2, r0)
        L_0x01c0:
            r3.CGP(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97594pj.C7Z(X.1ca, java.lang.String):void");
    }

    public C97594pj(AnonymousClass1KB r2, C23651Hc r3, C822444b r4, C72363Lq r5, AnonymousClass1OZ r6, AnonymousClass10I r7) {
        this.A04 = r2;
        this.A09 = r7;
        this.A08 = r6;
        this.A05 = r3;
        this.A07 = r5;
        this.A06 = r4;
    }

    public static final String A00(C29621ca r0, String str) {
        C29621ca A0K = r0.A0K(str);
        if (A0K != null) {
            return A0K.A0M();
        }
        return null;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
