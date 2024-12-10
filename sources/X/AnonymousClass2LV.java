package X;

import android.content.Context;

/* renamed from: X.2LV  reason: invalid class name */
public class AnonymousClass2LV extends C20992Ack {
    public final /* synthetic */ C33661jB A00;
    public final /* synthetic */ C31061ex A01;
    public final /* synthetic */ BD1 A02;
    public final /* synthetic */ C53692cw A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2LV(Context context, C33661jB r2, C33711jG r3, C31061ex r4, BD1 bd1, C53692cw r6, AnonymousClass119 r7, String str) {
        super(context, r3, r7);
        this.A01 = r4;
        this.A02 = bd1;
        this.A00 = r2;
        this.A04 = str;
        this.A03 = r6;
    }

    public void A04(A7B a7b) {
        this.A01.A0D.A05(AnonymousClass001.A1E(a7b, "get-methods: on-request-error=", AnonymousClass000.A10()));
        BD4 BRb = this.A02.BRb();
        if (BRb != null) {
            BRb.Bi4(a7b, 12);
        }
        C33661jB r0 = this.A00;
        if (r0 != null) {
            r0.C3L(a7b);
        }
    }

    public void A05(A7B a7b) {
        this.A01.A0D.A05(AnonymousClass001.A1E(a7b, "get-methods: on-response-error=", AnonymousClass000.A10()));
        BD4 BRb = this.A02.BRb();
        if (BRb != null) {
            BRb.Bi4(a7b, 12);
        }
        C33661jB r0 = this.A00;
        if (r0 != null) {
            r0.C3X(a7b);
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, X.87L] */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014e, code lost:
        if (r2 > 1) goto L_0x0150;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C29621ca r21) {
        /*
            r20 = this;
            r18 = r20
            r0 = r18
            X.1ex r4 = r0.A01
            X.1QE r1 = r4.A0D
            java.lang.String r0 = "get-methods: on-response-success"
            r7 = 0
            X.AnonymousClass1QE.A02(r1, r7, r0)
            r0 = r18
            X.BD1 r0 = r0.A02
            r17 = r0
            X.BD4 r1 = r17.BRb()
            r6 = 0
            if (r1 == 0) goto L_0x0020
            r0 = 12
            r1.Bi4(r7, r0)
        L_0x0020:
            java.lang.String r1 = "account"
            r19 = r21
            r0 = r19
            X.1ca r8 = r0.A0K(r1)
            r8.getClass()
            java.lang.String r0 = "instance-id"
            java.lang.String r5 = r8.A0Q(r0, r7)
            if (r5 == 0) goto L_0x008c
            r0 = r18
            java.lang.String r0 = r0.A04
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = "wa-support-phone-number"
            java.lang.String r2 = r8.A0Q(r0, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x005b
            X.1QD r0 = r4.A08
            android.content.SharedPreferences r0 = r0.A03()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "payments_support_phone_number"
            X.C17880vN.A1E(r1, r0, r2)
        L_0x005b:
            r0 = r18
            X.1jB r6 = r0.A00
            if (r6 == 0) goto L_0x008b
            X.8ze r5 = new X.8ze
            r5.<init>()
            X.1QS r0 = r4.A0B
            X.AnonymousClass1QS.A00(r0)
            X.A5I r4 = r0.A00
            X.C17960vV.A07(r4)
            X.Af0 r3 = new X.Af0
            r3.<init>()
            X.10I r2 = r4.A03
            r1 = 44
            X.3Bx r0 = new X.3Bx
            r0.<init>(r4, r3, r1)
            r2.CGF(r0)
            r1 = 10
            X.Af1 r0 = new X.Af1
            r0.<init>(r6, r5, r1)
            r3.A09(r0)
        L_0x008b:
            return
        L_0x008c:
            X.1em r0 = r4.A0G
            java.util.ArrayList r1 = r0.A05(r8)
            X.AnonymousClass1KH.A05(r1)
            X.1QO r0 = r4.A0A
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00b6
            if (r1 == 0) goto L_0x0139
            java.util.Iterator r2 = r1.iterator()
        L_0x00a3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0139
            java.lang.Object r0 = r2.next()
            X.AEs r0 = (X.C20284AEs) r0
            int r1 = r0.A05()
            r0 = 5
            if (r1 != r0) goto L_0x00a3
        L_0x00b6:
            java.util.HashSet r9 = X.C17880vN.A12()
            X.1ca[] r0 = r8.A02
            if (r0 == 0) goto L_0x0146
            int r12 = r0.length
            if (r12 <= 0) goto L_0x0146
            r11 = 0
        L_0x00c2:
            X.1ca r3 = r8.A0J(r11)
            X.C17960vV.A07(r3)
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "alias"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0134
            r14 = 0
            r10 = r7
            r16 = r7
            r13 = r7
            r2 = 0
        L_0x00d9:
            X.1MD[] r1 = r3.A0S()
            int r0 = r1.length
            if (r2 >= r0) goto L_0x011b
            r0 = r1[r2]
            java.lang.String r15 = r0.A02
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "alias_value"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00f2
            r14 = r1
        L_0x00ef:
            int r2 = r2 + 1
            goto L_0x00d9
        L_0x00f2:
            java.lang.String r0 = "alias_id"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00fd
            r16 = r1
            goto L_0x00ef
        L_0x00fd:
            java.lang.String r0 = "alias_type"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x010c
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r10 = r1.toLowerCase(r0)
            goto L_0x00ef
        L_0x010c:
            java.lang.String r0 = "alias_status"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x00ef
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r13 = r1.toLowerCase(r0)
            goto L_0x00ef
        L_0x011b:
            X.7Ik r3 = new X.7Ik
            r3.<init>()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "upiAlias"
            X.77e r2 = new X.77e
            r2.<init>(r3, r1, r14, r0)
            X.AEC r1 = new X.AEC
            r0 = r16
            r1.<init>(r2, r10, r0, r13)
            r9.add(r1)
        L_0x0134:
            int r11 = r11 + 1
            if (r11 >= r12) goto L_0x0146
            goto L_0x00c2
        L_0x0139:
            X.1QS r1 = r4.A0B
            java.lang.String r0 = "merchant_account_linking_context"
            X.1QK r0 = r1.A02(r0)
            r0.A08()
            goto L_0x00b6
        L_0x0146:
            X.A2y r8 = r17.BWS()
            if (r8 == 0) goto L_0x0151
            monitor-enter(r8)
            goto L_0x0171
        L_0x014e:
            if (r2 <= r10) goto L_0x018e
        L_0x0150:
            monitor-exit(r8)
        L_0x0151:
            r0 = r18
            X.1jB r1 = r0.A00
            if (r1 == 0) goto L_0x015d
            r0 = 0
            X.ARF r6 = new X.ARF
            r6.<init>(r1, r0)
        L_0x015d:
            r1 = 0
            r0 = r19
            r4.A08(r6, r0, r1)
            X.1el r1 = r4.A0E
            r0 = r18
            X.2cw r0 = r0.A03
            if (r5 != 0) goto L_0x016d
            java.lang.String r5 = ""
        L_0x016d:
            r1.A00(r0, r5)
            return
        L_0x0171:
            int r3 = r9.size()     // Catch:{ all -> 0x01c0 }
            X.0ve r2 = r8.A01     // Catch:{ all -> 0x01c0 }
            r1 = 3114(0xc2a, float:4.364E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x01c0 }
            int r0 = X.C18020vd.A00(r0, r2, r1)     // Catch:{ all -> 0x01c0 }
            int r0 = r0 + 1
            if (r3 > r0) goto L_0x0150
            boolean r0 = r9 instanceof java.util.Collection     // Catch:{ all -> 0x01c0 }
            r10 = 1
            if (r0 == 0) goto L_0x019d
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x019d
        L_0x018e:
            boolean r0 = X.C20008A2y.A00(r8, r9)     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x0150
            java.util.Set r0 = r8.A00     // Catch:{ all -> 0x01c0 }
            r0.clear()     // Catch:{ all -> 0x01c0 }
            r0.addAll(r9)     // Catch:{ all -> 0x01c0 }
            goto L_0x0150
        L_0x019d:
            java.util.Iterator r3 = r9.iterator()     // Catch:{ all -> 0x01c0 }
            r2 = 0
        L_0x01a2:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x014e
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x01c0 }
            X.AEC r0 = (X.AEC) r0     // Catch:{ all -> 0x01c0 }
            java.lang.String r1 = r0.A03     // Catch:{ all -> 0x01c0 }
            java.lang.String r0 = "mobile_number"
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x01c0 }
            if (r0 == 0) goto L_0x01a2
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x01a2
            X.AnonymousClass1ZU.A0A()     // Catch:{ all -> 0x01c0 }
            throw r7     // Catch:{ all -> 0x01c0 }
        L_0x01c0:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2LV.A06(X.1ca):void");
    }
}
