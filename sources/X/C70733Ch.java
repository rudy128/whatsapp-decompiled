package X;

/* renamed from: X.3Ch  reason: invalid class name and case insensitive filesystem */
public class C70733Ch implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70733Ch(C33231iU r2, AnonymousClass212 r3) {
        this.A00 = 11;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05eb, code lost:
        if (r0.intValue() != 403) goto L_0x05ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x060e, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0612, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x06fc, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x06fd, code lost:
        X.CDX.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0700, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0831, code lost:
        r1.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0834, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0938, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0939, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r6.A05.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0941, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0958, code lost:
        r0 = new X.AnonymousClass35V(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x095d, code lost:
        r2.notifyAllObservers(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0960, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x09a2, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x09a3, code lost:
        com.whatsapp.util.Log.e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x09f3, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x09f6, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r5 = r20
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0986;
                case 1: goto L_0x0970;
                case 2: goto L_0x0961;
                case 3: goto L_0x094e;
                case 4: goto L_0x0942;
                case 5: goto L_0x0942;
                case 6: goto L_0x0919;
                case 7: goto L_0x041b;
                case 8: goto L_0x030e;
                case 9: goto L_0x08ff;
                case 10: goto L_0x02b2;
                case 11: goto L_0x0848;
                case 12: goto L_0x0800;
                case 13: goto L_0x07cb;
                case 14: goto L_0x0475;
                case 15: goto L_0x07b6;
                case 16: goto L_0x07a8;
                case 17: goto L_0x079c;
                case 18: goto L_0x0790;
                case 19: goto L_0x0469;
                case 20: goto L_0x0284;
                case 21: goto L_0x0284;
                case 22: goto L_0x077d;
                case 23: goto L_0x072f;
                case 24: goto L_0x0716;
                case 25: goto L_0x026b;
                case 26: goto L_0x070a;
                case 27: goto L_0x066b;
                case 28: goto L_0x0227;
                case 29: goto L_0x064c;
                case 30: goto L_0x0640;
                case 31: goto L_0x0613;
                case 32: goto L_0x0211;
                case 33: goto L_0x01ea;
                case 34: goto L_0x05f2;
                case 35: goto L_0x018b;
                case 36: goto L_0x05d7;
                case 37: goto L_0x05bb;
                case 38: goto L_0x0171;
                case 39: goto L_0x0148;
                case 40: goto L_0x05ad;
                case 41: goto L_0x059e;
                case 42: goto L_0x005c;
                case 43: goto L_0x0590;
                case 44: goto L_0x0007;
                case 45: goto L_0x0007;
                case 46: goto L_0x0528;
                case 47: goto L_0x051b;
                case 48: goto L_0x04e2;
                case 49: goto L_0x0016;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A01
            X.35Y r0 = (X.AnonymousClass35Y) r0
            java.lang.Object r2 = r5.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.1Lg r1 = r0.A00
            r0 = -1
            r1.A02(r2, r0)
        L_0x0015:
            return
        L_0x0016:
            java.lang.Object r4 = r5.A01
            X.74J r4 = (X.AnonymousClass74J) r4
            java.lang.Object r5 = r5.A02
            android.app.Activity r5 = (android.app.Activity) r5
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r4.A06
            if (r1 == 0) goto L_0x0026
            r0 = 5
            r1.A0W(r0)
        L_0x0026:
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r3 = r4.A0A
            if (r3 == 0) goto L_0x003a
            X.67r r2 = r4.A0Q
            r0 = 2
            X.7GF r1 = new X.7GF
            r1.<init>(r4, r0)
            X.7GC r0 = new X.7GC
            r0.<init>(r4)
            r3.A04(r5, r2, r0, r1)
        L_0x003a:
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r4.A0A
            if (r0 == 0) goto L_0x0048
            com.whatsapp.InterceptingEditText r2 = r0.A04
            if (r2 == 0) goto L_0x0048
            r1 = 0
            r0 = 64
            r2.performAccessibilityAction(r0, r1)
        L_0x0048:
            com.whatsapp.KeyboardPopupLayout r3 = r4.A08
            if (r3 == 0) goto L_0x0015
            r0 = 1
            X.7Ql r2 = new X.7Ql
            r2.<init>(r4, r0)
            r0 = 100
            long r0 = X.AnonymousClass74J.A02(r4, r0)
            r3.postDelayed(r2, r0)
            return
        L_0x005c:
            java.lang.Object r0 = r5.A01
            X.12I r0 = (X.AnonymousClass12I) r0
            java.lang.Object r5 = r5.A02
            X.206 r5 = (X.AnonymousClass206) r5
            X.1Qz r3 = r0.A00
            r7 = 0
            r0 = 512(0x200, double:2.53E-321)
            boolean r0 = r5.A11(r0)
            X.0ve r2 = r3.A09
            if (r0 != 0) goto L_0x0097
            r1 = 2714(0xa9a, float:3.803E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0015
            X.205 r0 = r5.A0v
            X.1BI r6 = r0.A00
            if (r6 == 0) goto L_0x0015
            java.lang.String r0 = r6.getRawString()
            long r4 = r3.A04(r0)
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0015
            java.lang.String r0 = r6.getRawString()
            r3.A0A(r0, r1, r7)
            return
        L_0x0097:
            r1 = 2561(0xa01, float:3.589E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0015
            X.205 r2 = r5.A0v
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0015
            int[] r1 = X.C26141Qz.A0E
            int r0 = r5.A0u
            boolean r0 = X.C200410p.A0V(r1, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0015
            X.1BI r4 = r2.A00
            if (r4 == 0) goto L_0x0015
            X.1CJ r0 = r3.A02
            X.1ci r6 = X.AnonymousClass1CJ.A00(r0, r4)
            if (r6 == 0) goto L_0x0015
            X.2Gf r2 = new X.2Gf
            r2.<init>()
            X.0vt r0 = r2.samplingRate
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0015
            X.1Nl r1 = r3.A0B
            java.lang.String r0 = r4.getRawString()
            java.lang.String r0 = r1.A05(r0)
            r2.A07 = r0
            X.1cl r0 = r6.A0e
            int r0 = r0.expiration
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r2.A05 = r0
            int r0 = r5.A05
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r2.A03 = r0
            boolean r1 = X.C22971Dz.A0e(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A00 = r0
            if (r1 == 0) goto L_0x0141
            X.1MZ r0 = r3.A03
            r1 = r4
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            X.1MW r0 = r0.A08
            int r0 = r0.A09(r1)
            int r0 = X.C64002u3.A03(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            X.1BI r1 = r5.A0H()
            if (r1 == 0) goto L_0x0121
            X.1M9 r0 = r3.A00
            X.1E7 r0 = r0.A0E(r1)
        L_0x0117:
            if (r0 == 0) goto L_0x0121
            int r0 = r0.A02
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r2.A04 = r0
        L_0x0121:
            X.1PS r0 = r3.A07
            int r0 = r0.A00()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r2.A06 = r0
            X.1NK r0 = r3.A05
            boolean r0 = r0.A09(r4)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            X.18K r0 = r3.A0A
            r0.CC7(r2)
            return
        L_0x0141:
            X.1M9 r0 = r3.A00
            X.1E7 r0 = r0.A0E(r4)
            goto L_0x0117
        L_0x0148:
            java.lang.Object r1 = r5.A01
            X.6Ii r1 = (X.AnonymousClass6Ii) r1
            java.lang.Object r3 = r5.A02
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0 = 0
            r1.A00 = r0
            java.lang.String r2 = r3.toString()
            java.lang.Object r1 = r1.A01
            com.whatsapp.emoji.search.EmojiSearchContainer r1 = (com.whatsapp.emoji.search.EmojiSearchContainer) r1
            java.lang.String r0 = r1.A0G
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0015
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = r3.toString()
            com.whatsapp.emoji.search.EmojiSearchContainer.A00(r1, r0)
            return
        L_0x0171:
            java.lang.Object r0 = r5.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            java.lang.Object r2 = r5.A02
            X.4UI r2 = (X.AnonymousClass4UI) r2
            android.view.Window r0 = r0.getWindow()
            r1 = 1
            r0.setSoftInputMode(r1)
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x0015
            r2.A00(r1)
            return
        L_0x018b:
            java.lang.Object r6 = r5.A01
            X.371 r6 = (X.AnonymousClass371) r6
            java.lang.Object r4 = r5.A02
            X.1Rn r4 = (X.C26281Rn) r4
            X.2Fm r2 = new X.2Fm
            r2.<init>()
            int r3 = r6.A00
            java.lang.Long r0 = X.C17880vN.A0n(r3)
            r2.A02 = r0
            X.1Rn r5 = r6.A02
            X.1PS r1 = r5.A04
            int r0 = r1.A00()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r2.A03 = r0
            X.1PR r0 = r1.A03
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C18070vi.A03(r0)
            java.lang.String r0 = "disappearing_mode_timestamp"
            long r0 = X.C17890vO.A05(r1, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A01 = r0
            int r0 = r6.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            X.18K r0 = r5.A05
            r0.CC7(r2)
            X.1PS r2 = r4.A04
            int r0 = r2.A00()
            if (r3 == r0) goto L_0x0015
            X.11P r0 = r4.A03
            long r0 = X.AnonymousClass11P.A01(r0)
            r2.A05(r3, r0)
            X.1DT r1 = r4.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A0F(r0)
            return
        L_0x01ea:
            java.lang.Object r2 = r5.A01
            com.whatsapp.deeplink.DeepLinkActivity r2 = (com.whatsapp.deeplink.DeepLinkActivity) r2
            java.lang.Object r1 = r5.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.00H r0 = r2.A1C
            java.lang.Object r0 = r0.get()
            X.2nQ r0 = (X.C60122nQ) r0
            int r3 = r0.A00(r1)
            if (r3 == 0) goto L_0x0015
            X.00H r0 = r2.A0n
            java.lang.Object r2 = r0.get()
            X.6mK r2 = (X.C132176mK) r2
            java.lang.Integer r1 = X.C17880vN.A0i()
            r0 = 4
            r2.A00(r1, r0, r3)
            return
        L_0x0211:
            java.lang.Object r0 = r5.A01
            com.whatsapp.deeplink.DeepLinkActivity r0 = (com.whatsapp.deeplink.DeepLinkActivity) r0
            X.0zA r1 = r0.A0A
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0015
            X.C19880zA.A02(r1)
            java.lang.String r0 = "isPremiumSubscriptionActive"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0227:
            java.lang.Object r6 = r5.A01
            X.21K r6 = (X.AnonymousClass21K) r6
            java.lang.Object r4 = r5.A02
            X.121 r4 = (X.AnonymousClass121) r4
            boolean r0 = r6 instanceof X.AnonymousClass206
            if (r0 == 0) goto L_0x0015
            X.AEt r0 = r6.BPK()
            if (r0 == 0) goto L_0x0015
            X.AEn r3 = r0.A02
            if (r3 == 0) goto L_0x0015
            X.AEU r1 = r3.A0D
            java.lang.String r0 = "canceled"
            r1.A01 = r0
            X.ADi r2 = r1.A02
            if (r2 == 0) goto L_0x0255
            java.lang.String r0 = r2.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0255
            X.AEU r1 = r3.A0D
            java.lang.String r0 = r2.A01
            r1.A00 = r0
        L_0x0255:
            r1 = r6
            X.206 r1 = (X.AnonymousClass206) r1
            X.205 r0 = r1.A0v
            boolean r0 = r0 instanceof X.AnonymousClass2M2
            if (r0 == 0) goto L_0x0992
            X.21Z r6 = (X.AnonymousClass21Z) r6
            X.21L r0 = r6.BOM()
            X.C17960vV.A07(r0)
            r4.CQw(r0)
            return
        L_0x026b:
            java.lang.Object r2 = r5.A01
            X.1g5 r2 = (X.C31761g5) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            boolean r0 = r2.Be2()
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = "Request timed out"
            X.6S1 r0 = new X.6S1
            r0.<init>(r1)
            com.whatsapp.data.repository.MetaAiTypeaheadRepository.A00(r0, r2)
            return
        L_0x0284:
            java.lang.Object r4 = r5.A01
            X.2qE r4 = (X.C61772qE) r4
            java.lang.Object r0 = r5.A02
            X.10e r0 = (X.C199310e) r0
            X.1IZ r3 = r0.iterator()
        L_0x0290:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0015
            com.whatsapp.jid.DeviceJid r2 = X.C17880vN.A0R(r3)
            X.2nE r1 = X.C63962tz.A02(r2)
            X.1Os r0 = r4.A05
            X.3Ez r2 = r0.A08(r2)
            X.1P3 r0 = r4.A04     // Catch:{ all -> 0x0996 }
            r0.A0G(r1)     // Catch:{ all -> 0x0996 }
            r0.A0S(r1)     // Catch:{ all -> 0x0996 }
            if (r2 == 0) goto L_0x0290
            r2.close()
            goto L_0x0290
        L_0x02b2:
            java.lang.Object r7 = r5.A01
            X.1iU r7 = (X.C33231iU) r7
            java.lang.Object r8 = r5.A02
            X.212 r8 = (X.AnonymousClass212) r8
            X.1h0 r6 = r7.A08
            X.205 r5 = r8.A0v
            java.util.ArrayList r1 = r6.A00(r5)
            int r0 = r1.size()
            if (r0 == 0) goto L_0x0015
            X.205 r0 = r8.A18()
            if (r0 == 0) goto L_0x030a
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x030a
            java.util.Iterator r2 = r1.iterator()
        L_0x02d6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x030a
            java.lang.Object r0 = r2.next()
            X.2mT r0 = (X.C59542mT) r0
            int r1 = r0.A00
            r0 = 17
            if (r1 != r0) goto L_0x02d6
            long r2 = r8.A0x
            java.util.HashMap r4 = X.C17880vN.A11()
            int r0 = r8.A0u
            java.util.List r1 = X.C63792th.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0301
            X.1BI r0 = r5.A00
            X.C17880vN.A1N(r0, r4, r2)
        L_0x0301:
            X.1WM r1 = r7.A0A
            java.util.Set r0 = java.util.Collections.singleton(r5)
            r1.A0K(r4, r0)
        L_0x030a:
            r6.A01(r5)
            return
        L_0x030e:
            java.lang.Object r3 = r5.A01
            X.1iU r3 = (X.C33231iU) r3
            java.lang.Object r4 = r5.A02
            X.212 r4 = (X.AnonymousClass212) r4
            X.205 r6 = r4.A0v
            X.00H r0 = r3.A0I
            java.lang.Object r1 = r0.get()
            X.2mE r1 = (X.C59392mE) r1
            X.205 r0 = r4.A18()
            X.205 r1 = r1.A01(r0)
            X.00H r0 = r3.A0H
            X.206 r0 = X.AnonymousClass1W2.A01(r1, r0)
            if (r0 == 0) goto L_0x033d
            X.205 r2 = r0.A0v
            X.1BI r1 = r0.A0H()
            X.A51 r0 = new X.A51
            r0.<init>(r1, r2)
            r4.A05 = r0
        L_0x033d:
            X.1WM r1 = r3.A0A
            r0 = 0
            int r5 = X.AnonymousClass1WM.A00(r1, r4, r0)
            boolean r0 = X.C63792th.A02(r5)
            r7 = 5
            if (r0 == 0) goto L_0x09a7
            r0 = 8
            if (r5 == r0) goto L_0x040d
            r0 = 9
            if (r5 == r0) goto L_0x040d
        L_0x0353:
            X.1N7 r2 = r3.A0D
            long r0 = r4.A10
            X.2tQ r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0360
            r0.A05(r7)
        L_0x0360:
            X.00H r0 = r3.A0G
            X.1gM r2 = X.C17880vN.A0L(r0)
            r0 = 10
            X.3Ch r1 = new X.3Ch
            r1.<init>(r3, r4, r0)
            r0 = 54
            r2.A02(r1, r0)
            X.C33231iU.A00(r3, r4, r5)
            X.205 r0 = r4.A18()
            if (r0 == 0) goto L_0x03ba
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x03ba
            X.11S r0 = r3.A01
            boolean r0 = X.AnonymousClass25A.A0P(r0, r4)
            if (r0 != 0) goto L_0x03ba
            boolean r7 = X.C63792th.A04(r4)
            boolean r2 = r4 instanceof X.AnonymousClass227
            if (r2 == 0) goto L_0x039a
            X.1BI r0 = r6.A00
            boolean r0 = X.C22971Dz.A0a(r0)
            if (r0 == 0) goto L_0x03ec
            r0 = 3
            if (r5 != r0) goto L_0x03ec
        L_0x039a:
            boolean r1 = r4 instanceof X.AnonymousClass22E
            if (r1 != 0) goto L_0x03f5
            boolean r0 = r4 instanceof X.AnonymousClass24H
            if (r0 != 0) goto L_0x03f5
            boolean r0 = r4 instanceof X.AnonymousClass22A
            if (r0 == 0) goto L_0x03ba
            X.1gx r5 = r3.A0F
            android.os.Handler r2 = r5.A03()
            r1 = 11
            X.3Bz r0 = new X.3Bz
            r0.<init>(r5, r4, r1)
            r2.post(r0)
            r7 = 0
        L_0x03b7:
            r5.A0C(r4, r7, r7)
        L_0x03ba:
            X.1N9 r0 = r3.A0C
            r0.A08(r4)
            boolean r0 = r4 instanceof X.AnonymousClass227
            if (r0 == 0) goto L_0x0015
            X.1BI r0 = r6.A00
            boolean r0 = X.C22971Dz.A0a(r0)
            if (r0 == 0) goto L_0x0015
            boolean r0 = X.C63792th.A04(r4)
            if (r0 != 0) goto L_0x0015
            X.00H r0 = r3.A0K
            java.lang.Object r0 = r0.get()
            X.1Lc r0 = (X.C24641Lc) r0
            X.0ve r2 = r0.A01
            r1 = 8728(0x2218, float:1.223E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0015
            X.1i1 r1 = r3.A02
            r0 = 0
            r1.A0H(r0)
            return
        L_0x03ec:
            X.1gx r5 = r3.A0F
            android.os.Handler r2 = r5.A03()
            r1 = 8
            goto L_0x0401
        L_0x03f5:
            if (r2 != 0) goto L_0x03ec
            X.1gx r5 = r3.A0F
            android.os.Handler r2 = r5.A03()
            if (r1 == 0) goto L_0x040a
            r1 = 13
        L_0x0401:
            X.3Bz r0 = new X.3Bz
            r0.<init>(r5, r4, r1)
            r2.post(r0)
            goto L_0x03b7
        L_0x040a:
            r1 = 14
            goto L_0x0401
        L_0x040d:
            boolean r0 = r4 instanceof X.AnonymousClass22C
            if (r0 == 0) goto L_0x0353
            X.1WF r1 = r1.A0B
            r0 = r4
            X.22C r0 = (X.AnonymousClass22C) r0
            r1.A03(r0)
            goto L_0x0353
        L_0x041b:
            java.lang.Object r1 = r5.A01
            X.1WM r1 = (X.AnonymousClass1WM) r1
            java.lang.Object r4 = r5.A02
            X.206 r4 = (X.AnonymousClass206) r4
            X.11S r0 = r1.A00
            boolean r0 = X.AnonymousClass25A.A0P(r0, r4)
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = r4.A0e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x044d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageAddonManager/updateWAContactName/from_name is empty  jid:"
            r1.append(r0)
            X.1BI r0 = r4.A0H()
            r1.append(r0)
            java.lang.String r0 = " message:"
            java.lang.String r0 = X.AnonymousClass206.A03(r4, r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x044d:
            com.whatsapp.jid.UserJid r0 = r4.A0I()
            if (r0 == 0) goto L_0x0015
            X.1M9 r3 = r1.A02
            X.1E7 r2 = r3.A0H(r0)
            java.lang.String r1 = r4.A0e
            java.lang.String r0 = r2.A0c
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0015
            r2.A0c = r1
            r3.A0W(r2)
            return
        L_0x0469:
            java.lang.Object r0 = r5.A01
            X.30x r0 = (X.C678030x) r0
            java.lang.Object r3 = r5.A02
            X.1RK r2 = r0.A01
            r1 = 43
            goto L_0x0958
        L_0x0475:
            java.lang.Object r2 = r5.A01
            X.1RK r2 = (X.AnonymousClass1RK) r2
            java.lang.Object r5 = r5.A02
            X.2m6 r5 = (X.C59312m6) r5
            r0 = 39
            X.AnonymousClass35V.A00(r2, r5, r0)
            X.1RE r6 = r2.A0G
            X.1RD r1 = r6.A04
            X.30x r0 = new X.30x
            r0.<init>(r5, r2)
            r1.registerObserver(r0)
            X.11S r0 = r6.A02
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x049a
            java.lang.String r0 = "CriticalDataUploadManager/startCriticalDataBootstrap this device is a companion, it should not be able to upload bootstrap data"
            goto L_0x09f3
        L_0x049a:
            monitor-enter(r6)
            X.1RF r2 = r6.A00     // Catch:{ all -> 0x04df }
            boolean r1 = X.AnonymousClass1RF.A01(r2)     // Catch:{ all -> 0x04df }
            java.lang.String r0 = "Critical data bootstrap already in progress"
            X.C17960vV.A0H(r1, r0)     // Catch:{ all -> 0x04df }
            X.11U r0 = r2.A01     // Catch:{ all -> 0x04df }
            r0.A03()     // Catch:{ all -> 0x04df }
            X.11U r0 = r2.A00     // Catch:{ all -> 0x04df }
            r0.A03()     // Catch:{ all -> 0x04df }
            java.lang.String r0 = "CriticalDataUploadManager/startCriticalDataBootstrap"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04df }
            X.10I r4 = r6.A06     // Catch:{ all -> 0x04df }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x04df }
            X.18O r1 = r6.A03     // Catch:{ all -> 0x04df }
            X.18Q r0 = X.AnonymousClass18O.A16     // Catch:{ all -> 0x04df }
            int r0 = r1.A04(r0)     // Catch:{ all -> 0x04df }
            long r0 = (long) r0     // Catch:{ all -> 0x04df }
            long r2 = r2.toMillis(r0)     // Catch:{ all -> 0x04df }
            r1 = 43
            X.3Bq r0 = new X.3Bq     // Catch:{ all -> 0x04df }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x04df }
            X.25d r0 = r4.CGv(r0, r2)     // Catch:{ all -> 0x04df }
            r6.A01 = r0     // Catch:{ all -> 0x04df }
            monitor-exit(r6)     // Catch:{ all -> 0x04df }
            X.1RC r2 = r6.A05
            r1 = 44
            X.35V r0 = new X.35V
            r0.<init>(r5, r1)
            goto L_0x095d
        L_0x04df:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x04df }
            throw r1
        L_0x04e2:
            java.lang.Object r3 = r5.A01
            X.6TC r3 = (X.AnonymousClass6TC) r3
            java.lang.Object r4 = r5.A02
            com.whatsapp.expressionstray.ExpressionsTrayView r4 = (com.whatsapp.expressionstray.ExpressionsTrayView) r4
            boolean r0 = r3 instanceof X.AnonymousClass605
            if (r0 == 0) goto L_0x0517
            X.605 r3 = (X.AnonymousClass605) r3
            java.util.List r0 = r3.A04
            r2 = 0
            if (r0 == 0) goto L_0x0515
            int r1 = r0.size()
        L_0x04f9:
            java.util.List r0 = r3.A05
            if (r0 == 0) goto L_0x0501
            int r2 = r0.size()
        L_0x0501:
            int r1 = r1 + r2
            r0 = 6
            if (r1 <= r0) goto L_0x0517
            X.7jt r3 = new X.7jt
            r3.<init>(r4)
            r2 = 0
            r1 = 2131231878(0x7f080486, float:1.807985E38)
            r0 = 2131896462(0x7f12288e, float:1.9427786E38)
            com.whatsapp.expressionstray.ExpressionsTrayView.A03(r2, r4, r3, r1, r0)
            return
        L_0x0515:
            r1 = 0
            goto L_0x04f9
        L_0x0517:
            com.whatsapp.expressionstray.ExpressionsTrayView.A05(r4)
            return
        L_0x051b:
            java.lang.Object r2 = r5.A01
            X.6t1 r2 = (X.C135946t1) r2
            java.lang.Object r1 = r5.A02
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x0528:
            java.lang.Object r6 = r5.A01
            X.2eo r6 = (X.C54852eo) r6
            java.lang.Object r0 = r5.A02
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            r4 = 0
            com.whatsapp.infra.graphql.generated.textstatus.calls.XWA2TextStatusInput r2 = new com.whatsapp.infra.graphql.generated.textstatus.calls.XWA2TextStatusInput
            r2.<init>()
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "jid"
            X.C18070vi.A0d(r1, r4)
            r2.A05(r0, r1)
            X.1IX r2 = X.AnonymousClass1IX.of(r2)
            X.A7K r3 = new X.A7K
            r3.<init>()
            X.C18070vi.A0b(r2)
            X.C18070vi.A0d(r2, r4)
            java.lang.String r1 = "input"
            X.29S r0 = r3.A00
            r0.A06(r1, r2)
            java.lang.Class<com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl> r2 = com.whatsapp.infra.graphql.generated.textstatus.GetTextStatusListResponseImpl.class
            java.lang.String r0 = "GetTextStatusList"
            X.AIj r1 = new X.AIj
            r1.<init>(r3, r2, r0)
            X.00H r0 = r6.A00
            java.lang.Object r0 = r0.get()
            X.1PY r0 = (X.AnonymousClass1PY) r0
            X.A2g r1 = r0.A01(r1)
            X.AzD r0 = new X.AzD
            r0.<init>(r1)
            X.8ty r5 = new X.8ty
            r5.<init>(r0)
            r0 = 9
            X.7SB r4 = new X.7SB
            r4.<init>((java.lang.Object) r6, (int) r0)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 32000(0x7d00, double:1.581E-319)
            X.67u r0 = new X.67u
            r0.<init>()
            r5.A00 = r0
            r4.invoke(r0)
            r5.A06(r1, r3)
            return
        L_0x0590:
            java.lang.Object r0 = r5.A01
            X.2r4 r0 = (X.C62232r4) r0
            java.lang.Object r1 = r5.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1Q6 r0 = r0.A01
            r0.A0A(r1)
            return
        L_0x059e:
            java.lang.Object r4 = r5.A01
            X.1iW r4 = (X.C33251iW) r4
            java.lang.Object r3 = r5.A02
            X.206 r3 = (X.AnonymousClass206) r3
            r2 = 0
            r1 = 1
            r0 = 3
            r4.A0d(r3, r0, r2, r1)
            return
        L_0x05ad:
            java.lang.Object r3 = r5.A01
            X.1iW r3 = (X.C33251iW) r3
            java.lang.Object r2 = r5.A02
            X.206 r2 = (X.AnonymousClass206) r2
            r1 = 0
            r0 = 3
            r3.A0d(r2, r0, r1, r1)
            return
        L_0x05bb:
            java.lang.Object r4 = r5.A01
            com.whatsapp.email.EmailVerificationActivity r4 = (com.whatsapp.email.EmailVerificationActivity) r4
            java.lang.Object r3 = r5.A02
            X.00H r0 = r4.A09
            if (r0 == 0) goto L_0x05d4
            X.11A r2 = X.C17880vN.A0d(r0)
            r1 = 36
            X.3Ch r0 = new X.3Ch
            r0.<init>(r4, r3, r1)
            r2.CGP(r0)
            return
        L_0x05d4:
            java.lang.String r0 = "mainThreadHandler"
            goto L_0x060e
        L_0x05d7:
            java.lang.Object r3 = r5.A01
            com.whatsapp.email.EmailVerificationActivity r3 = (com.whatsapp.email.EmailVerificationActivity) r3
            java.lang.Object r0 = r5.A02
            java.lang.Number r0 = (java.lang.Number) r0
            com.whatsapp.email.EmailVerificationActivity.A0q(r3)
            if (r0 == 0) goto L_0x05ed
            int r1 = r0.intValue()
            r0 = 403(0x193, float:5.65E-43)
            r2 = 2
            if (r1 == r0) goto L_0x05ee
        L_0x05ed:
            r2 = 1
        L_0x05ee:
            X.AnonymousClass4Yv.A01(r3, r2)
            return
        L_0x05f2:
            java.lang.Object r1 = r5.A01
            java.lang.Object r0 = r5.A02
            com.whatsapp.dialogs.DeleteOrArchiveChatDialog r0 = (com.whatsapp.dialogs.DeleteOrArchiveChatDialog) r0
            java.util.List r3 = X.C18070vi.A0M(r1)
            X.1Co r2 = r0.A02
            if (r2 == 0) goto L_0x060c
            java.lang.Integer r1 = X.C17880vN.A0j()
            r0 = 1
            r2.A0A(r1, r3, r0)
            r2.A04(r3)
            return
        L_0x060c:
            java.lang.String r0 = "chatManager"
        L_0x060e:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0613:
            java.lang.Object r1 = r5.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r3 = r5.A02
            android.content.Intent r3 = (android.content.Intent) r3
            boolean r0 = r1.isTaskRoot()
            if (r0 == 0) goto L_0x063c
            X.3Bl r2 = new X.3Bl
            r2.<init>(r1)
            android.content.Intent r1 = X.AnonymousClass1LU.A02(r1)
            java.lang.String r0 = X.C28901bF.A05
            android.content.Intent r1 = r1.setAction(r0)
            java.util.ArrayList r0 = r2.A01
            r0.add(r1)
            r0.add(r3)
            r2.A01()
            return
        L_0x063c:
            r1.startActivity(r3)
            return
        L_0x0640:
            java.lang.Object r1 = r5.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r5.A02
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            return
        L_0x064c:
            java.lang.Object r6 = r5.A01
            X.9ox r6 = (X.C192769ox) r6
            java.lang.Object r4 = r5.A02
            X.1BI r4 = (X.AnonymousClass1BI) r4
            X.1PQ r3 = r6.A02
            X.11P r0 = r6.A00
            long r1 = X.AnonymousClass11P.A01(r0)
            r0 = 158(0x9e, float:2.21E-43)
            X.20i r1 = r3.A02(r4, r0, r1)
            X.C18070vi.A0X(r1)
            X.121 r0 = r6.A01
            r0.BBY(r1)
            return
        L_0x066b:
            java.lang.Object r4 = r5.A01
            X.1gQ r4 = (X.C31971gQ) r4
            java.lang.Object r5 = r5.A02
            X.2nR r5 = (X.C60132nR) r5
            X.1N7 r3 = r4.A01
            long r1 = r5.A00
            r0 = 1
            X.2tQ r1 = X.AnonymousClass1N7.A00(r3, r0, r1)
            if (r1 == 0) goto L_0x0682
            r0 = 3
            r1.A05(r0)
        L_0x0682:
            X.1gN r4 = r4.A00
            com.whatsapp.jid.Jid r0 = r5.A02
            com.whatsapp.jid.DeviceJid r3 = X.AnonymousClass1E0.A00(r0)
            X.C17960vV.A07(r3)
            java.lang.String r2 = r5.A08
            X.10s r0 = r4.A03
            r0.A02()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PeerMessageReceiptHandler/handleDeliveryReceipt peerDevice="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; msgId="
            X.C17900vP.A0f(r0, r2, r1)
            X.1Ry r6 = r4.A02
            X.231 r7 = r6.A03(r3, r2)
            if (r7 != 0) goto L_0x06b3
            java.lang.String r0 = "PeerMessageReceiptHandler/handleDeliveryReceipt/no such message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x06b3:
            boolean r0 = r7 instanceof X.AnonymousClass23J
            if (r0 == 0) goto L_0x06c3
            java.lang.String r0 = "PeerMessageReceiptHandler/handleDeliveryReceipt/skipping history sync notification message"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Rw r1 = r4.A00
            r0 = -1
            r1.A0G(r7, r0)
            return
        L_0x06c3:
            boolean r0 = r7 instanceof X.AnonymousClass23B
            if (r0 == 0) goto L_0x0704
            X.00H r0 = r4.A04
            java.lang.Object r3 = r0.get()
            X.2aJ r3 = (X.C52062aJ) r3
            long r1 = r7.A0x
            X.11P r0 = r4.A01
            long r4 = X.AnonymousClass11P.A01(r0)
            X.1Oq r0 = r3.A00
            X.1au r3 = r0.A06()
            android.content.ContentValues r9 = X.C17880vN.A08()     // Catch:{ all -> 0x06fa }
            java.lang.String r0 = "timestamp"
            X.C17880vN.A19(r9, r0, r4)     // Catch:{ all -> 0x06fa }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x06fa }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x06fa }
            java.lang.String r10 = "placeholder_retry_message"
            java.lang.String r11 = "message_row_id = ?"
            java.lang.String[] r13 = X.C17900vP.A0t(r1)     // Catch:{ all -> 0x06fa }
            java.lang.String r12 = "PlaceholderRetryMessageStore/updateTimestampForMessageRowId"
            r8.A02(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x06fa }
            goto L_0x0701
        L_0x06fa:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x06fc }
        L_0x06fc:
            r1 = move-exception
            X.CDX.A00(r3, r0)
            throw r1
        L_0x0701:
            r3.close()
        L_0x0704:
            long r0 = r7.A0x
            r6.A05(r0)
            return
        L_0x070a:
            java.lang.Object r1 = r5.A01
            X.1TH r1 = (X.AnonymousClass1TH) r1
            java.lang.Object r0 = r5.A02
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            X.AnonymousClass1TH.A01(r1, r0)
            return
        L_0x0716:
            java.lang.Object r0 = r5.A01
            X.123 r0 = (X.AnonymousClass123) r0
            java.lang.Object r1 = r5.A02
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            X.00H r0 = r0.A01
            X.10T r2 = X.C17880vN.A0V(r0)
            com.whatsapp.jid.UserJid r1 = r1.userJid
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 6
            X.C17890vO.A0s(r2, r1, r0)
            return
        L_0x072f:
            java.lang.Object r3 = r5.A01
            X.123 r3 = (X.AnonymousClass123) r3
            java.lang.Object r4 = r5.A02
            java.util.List r4 = (java.util.List) r4
            X.00H r0 = r3.A04
            java.lang.Object r5 = r0.get()
            X.2jj r5 = (X.C57842jj) r5
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.00H r0 = r5.A00
            X.0vd r2 = X.C17880vN.A0P(r0)
            r1 = 10180(0x27c4, float:1.4265E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0779
            java.util.ArrayList r2 = X.C29351c6.A0D(r4)
            java.util.Iterator r1 = r4.iterator()
        L_0x075b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x076b
            com.whatsapp.jid.DeviceJid r0 = X.C17880vN.A0R(r1)
            com.whatsapp.jid.UserJid r0 = r0.userJid
            r2.add(r0)
            goto L_0x075b
        L_0x076b:
            java.util.Set r0 = X.C29431cG.A12(r2)
            r5.A00(r0)     // Catch:{ Exception -> 0x0773 }
            goto L_0x0779
        L_0x0773:
            r1 = move-exception
            java.lang.String r0 = "ConversationDelegate/requestMissingLidsOnGetIdentities"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0779:
            X.AnonymousClass123.A01(r3, r4)
            return
        L_0x077d:
            java.lang.Object r2 = r5.A01
            X.1ML r2 = (X.AnonymousClass1ML) r2
            java.lang.Object r1 = r5.A02
            monitor-enter(r2)
            X.1MM r0 = r2.A04     // Catch:{ all -> 0x078d }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x078d }
            r0.remove(r1)     // Catch:{ all -> 0x078d }
            monitor-exit(r2)     // Catch:{ all -> 0x078d }
            return
        L_0x078d:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x078d }
            throw r1
        L_0x0790:
            java.lang.Object r0 = r5.A01
            X.30x r0 = (X.C678030x) r0
            java.lang.Object r3 = r5.A02
            X.1RK r2 = r0.A01
            r1 = 41
            goto L_0x0958
        L_0x079c:
            java.lang.Object r0 = r5.A01
            X.30x r0 = (X.C678030x) r0
            java.lang.Object r3 = r5.A02
            X.1RK r2 = r0.A01
            r1 = 36
            goto L_0x0958
        L_0x07a8:
            java.lang.Object r0 = r5.A01
            X.1RK r0 = (X.AnonymousClass1RK) r0
            java.lang.Object r1 = r5.A02
            android.location.LocationListener r1 = (android.location.LocationListener) r1
            X.1RB r0 = r0.A08
            r0.A05(r1)
            return
        L_0x07b6:
            java.lang.Object r0 = r5.A01
            X.1RK r0 = (X.AnonymousClass1RK) r0
            java.lang.Object r1 = r5.A02
            android.location.LocationListener r1 = (android.location.LocationListener) r1
            X.1RB r0 = r0.A08
            r3 = 0
            java.lang.String r2 = "CompanionDevice"
            r4 = 2
            r5 = 0
            r7 = r5
            r0.A06(r1, r2, r3, r4, r5, r7)
            return
        L_0x07cb:
            java.lang.Object r3 = r5.A01
            X.1RK r3 = (X.AnonymousClass1RK) r3
            java.lang.Object r2 = r5.A02
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            X.1MQ r1 = r3.A0H
            java.lang.Object r6 = r2.getKey()
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            java.lang.Object r0 = r2.getValue()
            int r12 = X.AnonymousClass000.A0M(r0)
            X.2RG r7 = X.AnonymousClass2RG.UNKNOWN
            r5 = 0
            r13 = 0
            r19 = 0
            r9 = r5
            r10 = r5
            r11 = r5
            r17 = r13
            X.4Zh r4 = new X.4Zh
            r8 = r5
            r15 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r19)
            r1.A0B(r4)
            java.util.Set r1 = r3.A0N
            java.lang.Object r0 = r2.getKey()
            goto L_0x0831
        L_0x0800:
            java.lang.Object r2 = r5.A01
            X.1RK r2 = (X.AnonymousClass1RK) r2
            java.lang.Object r4 = r5.A02
            X.2m6 r4 = (X.C59312m6) r4
            X.2cS r5 = new X.2cS
            r5.<init>(r4, r2)
            java.lang.String r0 = "companion-device-manager/addDevice"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4Zh r3 = r4.A02
            X.1MQ r0 = r2.A0H
            r0.A0B(r3)
            X.1P3 r0 = r2.A0F
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x0835
            X.10I r0 = r2.A0J
            r6 = 30
            X.3Cr r1 = new X.3Cr
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (int) r6)
            r0.CGF(r1)
        L_0x082d:
            java.util.Set r1 = r2.A0N
            com.whatsapp.jid.DeviceJid r0 = r3.A08
        L_0x0831:
            r1.add(r0)
            return
        L_0x0835:
            X.00H r0 = r2.A0L
            java.lang.Object r0 = r0.get()
            X.1Ot r0 = (X.C25581Ot) r0
            r6 = 31
            X.3Cr r1 = new X.3Cr
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (int) r6)
            r0.A02(r1)
            goto L_0x082d
        L_0x0848:
            java.lang.Object r6 = r5.A01
            X.1iU r6 = (X.C33231iU) r6
            java.lang.Object r4 = r5.A02
            X.212 r4 = (X.AnonymousClass212) r4
            X.1RP r5 = r6.A07
            java.util.HashSet r3 = r5.A06(r4)
            X.205 r0 = r4.A0v
            X.1BI r7 = r0.A00
            X.0ve r2 = r6.A0B
            r1 = 2844(0xb1c, float:3.985E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0894
            boolean r0 = r4 instanceof X.AnonymousClass22A
            if (r0 == 0) goto L_0x0894
            r0 = r4
            X.22A r0 = (X.AnonymousClass22A) r0
            int r0 = r0.A01
            if (r0 != 0) goto L_0x0894
            X.1CJ r0 = r6.A04
            boolean r0 = r0.A0R(r7)
            if (r0 == 0) goto L_0x0894
            X.1MZ r1 = r6.A06
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r0 = X.C36321nh.A00(r7)
            boolean r0 = r1.A0K(r0)
            if (r0 != 0) goto L_0x0894
            X.1Qw r1 = r6.A09
            X.205 r0 = r4.A18()
            java.util.Set r0 = r1.A03(r0)
            r3.addAll(r0)
        L_0x0894:
            int r0 = r4.A17()
            if (r0 <= 0) goto L_0x08bc
            int r1 = r4.A00
            r0 = 1
            if (r1 != r0) goto L_0x08bc
            if (r3 == 0) goto L_0x08a7
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x08bc
        L_0x08a7:
            int r0 = r4.A17()
            long r0 = X.C17890vO.A03(r0)
            X.11P r2 = r6.A03
            long r8 = X.AnonymousClass11P.A01(r2)
            long r0 = r0 + r8
            boolean r2 = r4 instanceof X.AnonymousClass22C
            if (r2 == 0) goto L_0x08bc
            r4.A01 = r0
        L_0x08bc:
            X.1WM r1 = r6.A0A
            r0 = 1
            int r2 = X.AnonymousClass1WM.A00(r1, r4, r0)
            boolean r0 = X.C63792th.A02(r2)
            if (r0 == 0) goto L_0x08fb
            r0 = 8
            if (r2 == r0) goto L_0x08ee
            r0 = 9
            if (r2 == r0) goto L_0x08ee
        L_0x08d1:
            if (r7 == 0) goto L_0x09af
            boolean r0 = r4.A0w()
            if (r0 == 0) goto L_0x09af
            X.00H r0 = r6.A0J
            java.lang.Object r3 = r0.get()
            X.11y r3 = (X.C203911y) r3
            X.10s r2 = r3.A0M
            r1 = 46
            X.3By r0 = new X.3By
            r0.<init>(r3, r4, r1)
            r2.execute(r0)
            return
        L_0x08ee:
            boolean r0 = r4 instanceof X.AnonymousClass22C
            if (r0 == 0) goto L_0x08d1
            X.1WF r1 = r1.A0B
            r0 = r4
            X.22C r0 = (X.AnonymousClass22C) r0
            r1.A03(r0)
            goto L_0x08d1
        L_0x08fb:
            java.lang.String r0 = "MessageAddOnSendRecvManager/storeMessageAddOnAndSendAsync failed to store messageAddOn"
            goto L_0x09f3
        L_0x08ff:
            java.lang.Object r0 = r5.A01
            X.1iU r0 = (X.C33231iU) r0
            java.lang.Object r4 = r5.A02
            X.212 r4 = (X.AnonymousClass212) r4
            X.1WM r3 = r0.A0A
            X.11m r2 = r3.A0E
            X.205 r0 = r4.A0v
            java.util.Set r1 = java.util.Collections.singleton(r0)
            r0 = 7
            r2.A0A(r1, r0)
            X.AnonymousClass1WM.A06(r3, r4)
            return
        L_0x0919:
            java.lang.Object r6 = r5.A01
            X.1QY r6 = (X.AnonymousClass1QY) r6
            java.lang.Object r4 = r5.A02
            X.1ci r4 = (X.C29691ci) r4
            X.1LW r3 = r6.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0938, Error | RuntimeException -> 0x09a2 }
            monitor-enter(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0938, Error | RuntimeException -> 0x09a2 }
            android.content.ContentValues r2 = X.C17890vO.A08()     // Catch:{ all -> 0x0935 }
            java.lang.String r1 = "vcard_ui_dismissed"
            int r0 = r4.A0D     // Catch:{ all -> 0x0935 }
            X.C17880vN.A18(r2, r1, r0)     // Catch:{ all -> 0x0935 }
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0938, Error | RuntimeException -> 0x09a2 }
            r3.A05(r2, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0938, Error | RuntimeException -> 0x09a2 }
            return
        L_0x0935:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0938, Error | RuntimeException -> 0x09a2 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0938, Error | RuntimeException -> 0x09a2 }
        L_0x0938:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r6.A05
            r0.A03()
            return
        L_0x0942:
            java.lang.Object r0 = r5.A01
            X.1MN r0 = (X.AnonymousClass1MN) r0
            java.lang.Object r1 = r5.A02
            java.util.Map r0 = r0.A04
            r0.remove(r1)
            return
        L_0x094e:
            java.lang.Object r0 = r5.A01
            X.1TG r0 = (X.AnonymousClass1TG) r0
            java.lang.Object r3 = r5.A02
            X.1Lg r2 = r0.A0A
            r1 = 33
        L_0x0958:
            X.35V r0 = new X.35V
            r0.<init>(r3, r1)
        L_0x095d:
            r2.notifyAllObservers(r0)
            return
        L_0x0961:
            java.lang.Object r0 = r5.A01
            X.1TG r0 = (X.AnonymousClass1TG) r0
            java.lang.Object r2 = r5.A02
            java.util.Collection r2 = (java.util.Collection) r2
            X.1Lg r1 = r0.A0A
            r0 = 0
            r1.A05(r2, r0)
            return
        L_0x0970:
            java.lang.Object r0 = r5.A01
            X.1aN r0 = (X.C28521aN) r0
            java.lang.Object r5 = r5.A02
            X.1BI r5 = (X.AnonymousClass1BI) r5
            X.1Lg r4 = r0.A07
            r3 = 0
            r2 = 0
            r1 = 1
            X.35T r0 = new X.35T
            r0.<init>(r5, r3, r1, r2)
            r4.notifyAllObservers(r0)
            return
        L_0x0986:
            java.lang.Object r1 = r5.A01
            X.1LX r1 = (X.AnonymousClass1LX) r1
            java.lang.Object r0 = r5.A02
            X.1ci r0 = (X.C29691ci) r0
            r1.A00(r0)
            return
        L_0x0992:
            r4.CQw(r1)
            return
        L_0x0996:
            r1 = move-exception
            if (r2 == 0) goto L_0x09a6
            r2.close()     // Catch:{ all -> 0x099d }
            throw r1
        L_0x099d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x09a2:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
        L_0x09a6:
            throw r1
        L_0x09a7:
            r0 = 7
            if (r5 == r0) goto L_0x0a14
            if (r5 == r7) goto L_0x0a14
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOnAndSendReadReceiptAsync failed to store messageAddOn"
            goto L_0x09f3
        L_0x09af:
            if (r3 == 0) goto L_0x09c3
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x09c3
            r5.A08(r4, r3)
            X.1Qw r0 = r6.A09
            X.1Qt r0 = X.C26111Qw.A00(r0, r4)
            r0.A0B(r4, r3)
        L_0x09c3:
            X.C33231iU.A00(r6, r4, r2)
            X.00H r0 = r6.A0I
            java.lang.Object r3 = r0.get()
            X.2mE r3 = (X.C59392mE) r3
            long r1 = r4.A02
            X.00H r0 = r3.A00
            X.206 r0 = X.AnonymousClass1W2.A02(r0, r1)
            if (r0 == 0) goto L_0x09f7
            X.205 r0 = r0.A0v
            X.C18070vi.A0W(r0)
            X.205 r3 = r3.A02(r0)
        L_0x09e1:
            X.00H r0 = r6.A0H
            X.1W6 r0 = X.C17880vN.A0c(r0)
            long r1 = r4.A02
            X.1W2 r0 = r0.A01
            X.206 r0 = r0.A03(r1)
            if (r3 != 0) goto L_0x09f9
            java.lang.String r0 = "MessageAddOnSendRecvManager/storeMessageAddOnAndSendAsync failed to send as the parent key was not found"
        L_0x09f3:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x09f7:
            r3 = 0
            goto L_0x09e1
        L_0x09f9:
            if (r0 != 0) goto L_0x0a0f
            r1 = 0
        L_0x09fc:
            X.A51 r0 = new X.A51
            r0.<init>(r1, r3)
            r4.A05 = r0
            X.00H r0 = r6.A0J
            java.lang.Object r0 = r0.get()
            X.11y r0 = (X.C203911y) r0
            r0.A01(r4)
            return
        L_0x0a0f:
            com.whatsapp.jid.UserJid r1 = r0.A0I()
            goto L_0x09fc
        L_0x0a14:
            X.1N9 r0 = r3.A0C
            r0.A08(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70733Ch.run():void");
    }

    public C70733Ch(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
