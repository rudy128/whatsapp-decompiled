package X;

import android.view.View;

/* renamed from: X.4rh  reason: invalid class name and case insensitive filesystem */
public class C98774rh implements Runnable {
    public final int A00;
    public final Object A01;

    public C98774rh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i) {
        view.post(new C98774rh(view, i));
    }

    public static void A01(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C98774rh(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r4.A0B.A0O(r2.A0E) == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03b9, code lost:
        r0 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03bb, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:?, code lost:
        r6 = X.C32951i1.A00(r7);
        r5 = X.AnonymousClass72V.A03(r0.getRawString());
        r4 = X.AnonymousClass72V.A01(r6.getString(r5, X.AnonymousClass72V.A02()));
        r0 = r4.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03d8, code lost:
        if (r0 != null) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03da, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03dd, code lost:
        r0 = r0.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03e1, code lost:
        r4.A07 = java.lang.Long.valueOf(r0 + 1);
        X.C17880vN.A1E(r6.edit(), r5, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03f3, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03f4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0529, code lost:
        if (X.C72453Mb.A0I(r9.A09) != 1) goto L_0x052b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0583, code lost:
        if (X.AnonymousClass25A.A0x(r10) != false) goto L_0x0585;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x058e, code lost:
        if (X.AnonymousClass25A.A0m(r10) != false) goto L_0x0590;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x069f, code lost:
        if (((X.C1179361n) r0.get()).A05(r8) == false) goto L_0x05e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06d8, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x06dc, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r1 = r23
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x035e;
                case 1: goto L_0x0015;
                case 2: goto L_0x0371;
                case 3: goto L_0x0379;
                case 4: goto L_0x0381;
                case 5: goto L_0x004b;
                case 6: goto L_0x0389;
                case 7: goto L_0x0066;
                case 8: goto L_0x0095;
                case 9: goto L_0x0391;
                case 10: goto L_0x00b0;
                case 11: goto L_0x00d3;
                case 12: goto L_0x039d;
                case 13: goto L_0x03ac;
                case 14: goto L_0x06b3;
                case 15: goto L_0x010b;
                case 16: goto L_0x03b3;
                case 17: goto L_0x03f8;
                case 18: goto L_0x0400;
                case 19: goto L_0x040b;
                case 20: goto L_0x0415;
                case 21: goto L_0x041d;
                case 22: goto L_0x0442;
                case 23: goto L_0x044d;
                case 24: goto L_0x0148;
                case 25: goto L_0x0455;
                case 26: goto L_0x017e;
                case 27: goto L_0x045d;
                case 28: goto L_0x0465;
                case 29: goto L_0x046d;
                case 30: goto L_0x047d;
                case 31: goto L_0x0486;
                case 32: goto L_0x01e5;
                case 33: goto L_0x0494;
                case 34: goto L_0x06c4;
                case 35: goto L_0x0313;
                case 36: goto L_0x04a1;
                case 37: goto L_0x04bb;
                case 38: goto L_0x0323;
                case 39: goto L_0x0336;
                case 40: goto L_0x034c;
                case 41: goto L_0x0007;
                case 42: goto L_0x0336;
                case 43: goto L_0x034c;
                case 44: goto L_0x0007;
                case 45: goto L_0x04d1;
                case 46: goto L_0x04d9;
                case 47: goto L_0x04e1;
                case 48: goto L_0x04ec;
                case 49: goto L_0x0505;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r1.A01
            X.3uP r1 = (X.AnonymousClass3uP) r1
            X.1BI r0 = X.C79103uS.A1C(r1)
            if (r0 == 0) goto L_0x0014
            r1.A1s()
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r4 = r1.A01
            X.5tO r4 = (X.C115095tO) r4
            X.8A7 r3 = r4.A0I
            X.206 r0 = r3.getQuotedMessage()
            if (r0 == 0) goto L_0x0038
            X.AW0 r2 = X.AnonymousClass25B.A00(r0)
            if (r2 == 0) goto L_0x0038
            boolean r0 = r2.A0J()
            if (r0 == 0) goto L_0x0038
            X.11S r1 = r4.A0B
            com.whatsapp.jid.UserJid r0 = r2.A0E
            boolean r0 = r1.A0O(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            com.whatsapp.mentions.MentionableEntry r0 = r4.A0T
            java.lang.String r0 = r0.getStringText()
            if (r1 != 0) goto L_0x0047
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0014
        L_0x0047:
            r3.CFj()
            return
        L_0x004b:
            java.lang.Object r4 = r1.A01
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r3 = r4.getChildCount()
            r2 = 0
        L_0x0054:
            if (r2 >= r3) goto L_0x0014
            android.view.View r1 = r4.getChildAt(r2)
            boolean r0 = r1 instanceof X.AnonymousClass3uD
            if (r0 == 0) goto L_0x0063
            X.3uP r1 = (X.AnonymousClass3uP) r1
            r1.A1t()
        L_0x0063:
            int r2 = r2 + 1
            goto L_0x0054
        L_0x0066:
            java.lang.Object r5 = r1.A01
            com.whatsapp.conversation.ConversationListView r5 = (com.whatsapp.conversation.ConversationListView) r5
            int r4 = r5.getChildCount()
            r3 = 0
        L_0x006f:
            if (r3 >= r4) goto L_0x0014
            android.view.View r2 = r5.getChildAt(r3)
            boolean r0 = r2 instanceof X.C78923tv
            if (r0 == 0) goto L_0x0092
            X.4Zd r1 = r5.getGroupContextCardHelper()
            r0 = r2
            X.3uR r0 = (X.C79093uR) r0
            X.206 r0 = r0.getFMessage()
            X.C18070vi.A0X(r0)
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0092
            X.3uP r2 = (X.AnonymousClass3uP) r2
            r2.A1t()
        L_0x0092:
            int r3 = r3 + 1
            goto L_0x006f
        L_0x0095:
            java.lang.Object r4 = r1.A01
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r3 = r4.getChildCount()
            r2 = 0
        L_0x009e:
            if (r2 >= r3) goto L_0x0014
            android.view.View r1 = r4.getChildAt(r2)
            boolean r0 = r1 instanceof X.AnonymousClass8nY
            if (r0 == 0) goto L_0x00ad
            X.3uP r1 = (X.AnonymousClass3uP) r1
            r1.A1t()
        L_0x00ad:
            int r2 = r2 + 1
            goto L_0x009e
        L_0x00b0:
            java.lang.Object r4 = r1.A01
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r3 = r4.getChildCount()
            r2 = 0
        L_0x00b9:
            if (r2 >= r3) goto L_0x0014
            android.view.View r1 = r4.getChildAt(r2)
            boolean r0 = r1 instanceof X.AnonymousClass3uF
            if (r0 != 0) goto L_0x00cb
            boolean r0 = r1 instanceof X.AnonymousClass8nY
            if (r0 != 0) goto L_0x00cb
            boolean r0 = r1 instanceof X.AnonymousClass8nQ
            if (r0 == 0) goto L_0x00d0
        L_0x00cb:
            X.3uP r1 = (X.AnonymousClass3uP) r1
            r1.A1t()
        L_0x00d0:
            int r2 = r2 + 1
            goto L_0x00b9
        L_0x00d3:
            java.lang.Object r5 = r1.A01
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r4 = r5.getChildCount()
            r3 = 0
        L_0x00dc:
            if (r3 >= r4) goto L_0x0014
            android.view.View r2 = r5.getChildAt(r3)
            boolean r0 = r2 instanceof X.AnonymousClass3uP
            if (r0 == 0) goto L_0x0108
            r0 = r2
            X.3uR r0 = (X.C79093uR) r0
            X.206 r0 = r0.getFMessage()
            X.206 r1 = r0.A0K()
            boolean r0 = r2 instanceof X.AnonymousClass8nY
            if (r0 != 0) goto L_0x0103
            if (r1 == 0) goto L_0x0108
            X.AW0 r0 = X.AnonymousClass25B.A00(r1)
            if (r0 == 0) goto L_0x0108
            X.AEX r0 = r0.A04()
            if (r0 == 0) goto L_0x0108
        L_0x0103:
            X.3uP r2 = (X.AnonymousClass3uP) r2
            r2.A1t()
        L_0x0108:
            int r3 = r3 + 1
            goto L_0x00dc
        L_0x010b:
            java.lang.Object r9 = r1.A01
            com.whatsapp.conversation.ForwardMessagesRouter r9 = (com.whatsapp.conversation.ForwardMessagesRouter) r9
            X.0vl r0 = r9.A0B
            java.util.List r0 = X.AnonymousClass3MW.A11(r0)
            X.C18070vi.A0X(r0)
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0120:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x013a
            java.lang.Object r1 = r2.next()
            X.205 r1 = (X.AnonymousClass205) r1
            X.00H r0 = r9.A07
            if (r0 == 0) goto L_0x050d
            X.206 r0 = X.AnonymousClass1W2.A01(r1, r0)
            if (r0 == 0) goto L_0x0120
            r8.add(r0)
            goto L_0x0120
        L_0x013a:
            boolean r0 = X.AnonymousClass000.A1a(r8)
            if (r0 == 0) goto L_0x0014
            X.4PB r6 = r9.A04
            if (r6 != 0) goto L_0x0511
            java.lang.String r0 = "forwardMessagesResultHandler"
            goto L_0x06d8
        L_0x0148:
            java.lang.Object r3 = r1.A01
            X.3rX r3 = (X.C77813rX) r3
            com.whatsapp.TextEmojiLabel r1 = r3.A0A()
            java.lang.String r0 = X.C77813rX.A03(r3)
            r1.setText(r0)
            com.whatsapp.TextEmojiLabel r0 = r3.A0A()
            android.view.ViewPropertyAnimator r2 = r0.animate()
            if (r2 == 0) goto L_0x0014
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.alpha(r0)
            r0 = 0
            r2.setStartDelay(r0)
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            r1 = 25
            X.4rh r0 = new X.4rh
            r0.<init>(r3, r1)
            r2.withEndAction(r0)
            r2.start()
            return
        L_0x017e:
            java.lang.Object r8 = r1.A01
            X.1nL r8 = (X.C36101nL) r8
            java.lang.String r0 = "PresortingChatsManager/resetConversationTimestamps"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Nd r0 = r8.A00
            X.1Ne r7 = r0.A01
            monitor-enter(r7)
            boolean r1 = r7.A00     // Catch:{ all -> 0x06b0 }
            r0 = 0
            if (r1 == 0) goto L_0x01db
            r7.A00 = r0     // Catch:{ all -> 0x06b0 }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x06b0 }
            java.util.HashMap r5 = r7.A02     // Catch:{ all -> 0x06b0 }
            java.util.Iterator r4 = X.C17890vO.A0i(r5)     // Catch:{ all -> 0x06b0 }
        L_0x019d:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x06b0 }
            if (r0 == 0) goto L_0x01c0
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r4)     // Catch:{ all -> 0x06b0 }
            java.lang.Object r3 = r0.getKey()     // Catch:{ all -> 0x06b0 }
            X.1BI r3 = (X.AnonymousClass1BI) r3     // Catch:{ all -> 0x06b0 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06b0 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x06b0 }
            long r1 = r0.longValue()     // Catch:{ all -> 0x06b0 }
            X.1ng r0 = new X.1ng     // Catch:{ all -> 0x06b0 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x06b0 }
            r6.add(r0)     // Catch:{ all -> 0x06b0 }
            goto L_0x019d
        L_0x01c0:
            r5.clear()     // Catch:{ all -> 0x06b0 }
            java.util.Collections.sort(r6)     // Catch:{ all -> 0x06b0 }
            java.util.ArrayList r1 = r7.A01     // Catch:{ all -> 0x06b0 }
            boolean r0 = r1.equals(r6)     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x01db
            java.lang.String r0 = "SortedConversationsList/resetThreadMetadata restoring the real timestamps"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06b0 }
            r1.clear()     // Catch:{ all -> 0x06b0 }
            r1.addAll(r6)     // Catch:{ all -> 0x06b0 }
            r0 = 1
            goto L_0x01dc
        L_0x01db:
            r0 = 0
        L_0x01dc:
            monitor-exit(r7)     // Catch:{ all -> 0x06b0 }
            if (r0 == 0) goto L_0x0014
            X.1NN r0 = r8.A01
            r0.A00()
            return
        L_0x01e5:
            java.lang.Object r0 = r1.A01
            X.3s0 r0 = (X.AnonymousClass3s0) r0
            X.9Bw r5 = r0.A08
            android.view.View r1 = r0.A01
            if (r5 != 0) goto L_0x0200
            if (r1 == 0) goto L_0x0014
            X.2mw r3 = r0.A07
            if (r3 == 0) goto L_0x0014
            r2 = 21
            X.3Cl r6 = new X.3Cl
            r6.<init>(r0, r1, r3, r2)
        L_0x01fc:
            r1.post(r6)
            return
        L_0x0200:
            if (r1 == 0) goto L_0x0014
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.ArrayList r2 = r5.A0B()
            java.util.Iterator r7 = r2.iterator()
        L_0x020e:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0223
            java.lang.Object r6 = r7.next()
            X.9Bv r6 = (X.C178109Bv) r6
            int r3 = r6.A01
            r2 = 5
            if (r3 != r2) goto L_0x020e
            r4.add(r6)
            goto L_0x020e
        L_0x0223:
            int r2 = r4.size()
            r3 = 1
            r6 = 0
            r10 = 8
            r13 = 0
            if (r2 <= r10) goto L_0x022f
            r13 = 1
        L_0x022f:
            r12 = 5
            if (r13 == 0) goto L_0x0233
            r10 = 5
        L_0x0233:
            X.0ve r8 = r0.A0J
            r7 = 10911(0x2a9f, float:1.529E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r2, r8, r7)
            if (r2 == 0) goto L_0x02a3
            java.util.ArrayList r9 = X.C29351c6.A0E(r4)
            java.util.Iterator r8 = r4.iterator()
        L_0x0247:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x025b
            java.lang.Object r2 = r8.next()
            X.9Bv r2 = (X.C178109Bv) r2
            X.1M9 r7 = r0.A0G
            com.whatsapp.jid.UserJid r2 = r2.A00
            X.AnonymousClass3MY.A1O(r7, r2, r9)
            goto L_0x0247
        L_0x025b:
            r2 = 8
            java.util.List r2 = X.C98974s1.A00(r9, r0, r2)
            java.util.List r7 = X.C29431cG.A0v(r2, r10)
            java.util.ArrayList r2 = X.C29351c6.A0E(r7)
            java.util.Iterator r11 = r7.iterator()
        L_0x026d:
            boolean r7 = r11.hasNext()
            if (r7 == 0) goto L_0x02d7
            X.1E7 r15 = X.C17880vN.A0O(r11)
            X.C18070vi.A0b(r15)
            com.whatsapp.jid.GroupJid r10 = r5.A0C
            r9 = -1
            if (r10 == 0) goto L_0x028f
            com.whatsapp.jid.UserJid r8 = X.AnonymousClass3MZ.A0x(r15)
            if (r8 == 0) goto L_0x028f
            X.1MZ r7 = r0.A0H
            X.2sr r7 = r7.A06(r10, r8)
            if (r7 == 0) goto L_0x028f
            int r9 = r7.A00
        L_0x028f:
            java.lang.Integer r16 = X.AnonymousClass00R.A00
            r17 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            X.4iR r14 = new X.4iR
            r19 = r9
            r20 = r3
            r14.<init>(r15, r16, r17, r19, r20)
            r2.add(r14)
            goto L_0x026d
        L_0x02a3:
            java.util.List r7 = X.C29431cG.A0v(r4, r10)
            java.util.ArrayList r2 = X.C29351c6.A0E(r7)
            java.util.Iterator r9 = r7.iterator()
        L_0x02af:
            boolean r7 = r9.hasNext()
            if (r7 == 0) goto L_0x02d7
            java.lang.Object r7 = r9.next()
            X.9Bv r7 = (X.C178109Bv) r7
            X.1M9 r8 = r0.A0G
            com.whatsapp.jid.UserJid r7 = r7.A00
            X.1E7 r15 = r8.A0H(r7)
            r19 = -1
            java.lang.Integer r16 = X.AnonymousClass00R.A00
            r17 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            X.4iR r14 = new X.4iR
            r20 = r3
            r14.<init>(r15, r16, r17, r19, r20)
            r2.add(r14)
            goto L_0x02af
        L_0x02d7:
            X.DcQ r7 = X.AnonymousClass1ZT.A01()
            r7.addAll(r2)
            if (r13 == 0) goto L_0x0304
            r8 = 2131894262(0x7f121ff6, float:1.9423324E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r2 = r4.size()
            int r2 = r2 - r12
            X.C17880vN.A1T(r3, r2, r6)
            X.6IR r9 = X.C1402670q.A02(r3, r8)
            r14 = 2131103234(0x7f060e02, float:1.7818928E38)
            r10 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            r12 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            X.4iS r8 = new X.4iS
            r15 = r6
            r8.<init>(r9, r10, r12, r14, r15)
            r7.add(r8)
        L_0x0304:
            X.DcQ r8 = X.AnonymousClass1ZT.A02(r7)
            r11 = 7
            X.3Cr r6 = new X.3Cr
            r7 = r0
            r9 = r1
            r10 = r5
            r6.<init>((java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.Object) r10, (int) r11)
            goto L_0x01fc
        L_0x0313:
            java.lang.Object r0 = r1.A01
            X.3WO r0 = (X.AnonymousClass3WO) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            if (r0 == 0) goto L_0x0014
            r0.A0g(r1)
            return
        L_0x0323:
            java.lang.Object r1 = r1.A01
            X.3uP r1 = (X.AnonymousClass3uP) r1
            X.3OA r0 = r1.A0o
            if (r0 == 0) goto L_0x0014
            r0 = 0
            r1.A2h = r0
            android.view.View r1 = r1.A05
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0336:
            java.lang.Object r2 = r1.A01
            X.3uP r2 = (X.AnonymousClass3uP) r2
            X.1BI r0 = X.C79103uS.A1C(r2)
            if (r0 == 0) goto L_0x0014
            X.1BI r1 = X.C79103uS.A1C(r2)
            X.8BG r0 = r2.getMessageReactions()
            r2.A2H(r0, r1)
            return
        L_0x034c:
            java.lang.Object r1 = r1.A01
            X.3uP r1 = (X.AnonymousClass3uP) r1
            X.1BI r0 = X.C79103uS.A1C(r1)
            if (r0 == 0) goto L_0x0014
            X.206 r0 = r1.getFMessage()
            r1.A2M(r0)
            return
        L_0x035e:
            java.lang.Object r1 = r1.A01
            X.3rW r1 = (X.AnonymousClass3rW) r1
            X.1bI r0 = r1.A04
            r2 = 0
            r0.A04(r2)
            android.view.ViewGroup r1 = r1.A03
            r0 = 2131429783(0x7f0b0997, float:1.8481248E38)
            X.C72463Mc.A16(r1, r0, r2)
            return
        L_0x0371:
            java.lang.Object r0 = r1.A01
            X.5br r0 = (X.C108535br) r0
            r0.C2D()
            return
        L_0x0379:
            java.lang.Object r0 = r1.A01
            X.5br r0 = (X.C108535br) r0
            r0.CAL()
            return
        L_0x0381:
            java.lang.Object r0 = r1.A01
            com.whatsapp.conversation.ConversationListView r0 = (com.whatsapp.conversation.ConversationListView) r0
            r0.A07()
            return
        L_0x0389:
            java.lang.Object r0 = r1.A01
            com.whatsapp.conversation.ConversationListView r0 = (com.whatsapp.conversation.ConversationListView) r0
            r0.A04()
            return
        L_0x0391:
            java.lang.Object r1 = r1.A01
            com.whatsapp.conversation.ConversationListView r1 = (com.whatsapp.conversation.ConversationListView) r1
            r0 = 2
            r1.setTranscriptMode(r0)
            r1.A05()
            return
        L_0x039d:
            java.lang.Object r0 = r1.A01
            X.3hT r0 = (X.C75423hT) r0
            X.1pz r3 = r0.A0H
            X.1BI r2 = r0.A0G
            X.1i2 r1 = X.C32961i2.CONVERSATION_SCREEN
            r0 = 0
            r3.A01(r2, r1, r0)
            return
        L_0x03ac:
            java.lang.Object r0 = r1.A01
            X.3hT r0 = (X.C75423hT) r0
            X.1i1 r7 = r0.A0A
            goto L_0x03b9
        L_0x03b3:
            java.lang.Object r0 = r1.A01
            X.3ra r0 = (X.C77843ra) r0
            X.1i1 r7 = r0.A0C
        L_0x03b9:
            X.1BI r0 = r0.A0G
            monitor-enter(r7)
            android.content.SharedPreferences r6 = X.C32951i1.A00(r7)     // Catch:{ all -> 0x03f5 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x03f5 }
            java.lang.String r5 = X.AnonymousClass72V.A03(r0)     // Catch:{ all -> 0x03f5 }
            java.lang.String r0 = X.AnonymousClass72V.A02()     // Catch:{ all -> 0x03f5 }
            java.lang.String r0 = r6.getString(r5, r0)     // Catch:{ all -> 0x03f5 }
            X.6Uc r4 = X.AnonymousClass72V.A01(r0)     // Catch:{ all -> 0x03f5 }
            java.lang.Long r0 = r4.A07     // Catch:{ all -> 0x03f5 }
            r2 = 1
            if (r0 != 0) goto L_0x03dd
            r0 = 0
            goto L_0x03e1
        L_0x03dd:
            long r0 = r0.longValue()     // Catch:{ all -> 0x03f5 }
        L_0x03e1:
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x03f5 }
            r4.A07 = r0     // Catch:{ all -> 0x03f5 }
            android.content.SharedPreferences$Editor r1 = r6.edit()     // Catch:{ all -> 0x03f5 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x03f5 }
            X.C17880vN.A1E(r1, r5, r0)     // Catch:{ all -> 0x03f5 }
            monitor-exit(r7)
            return
        L_0x03f5:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x03f8:
            java.lang.Object r0 = r1.A01
            X.3hU r0 = (X.C75433hU) r0
            r0.A0C()
            return
        L_0x0400:
            java.lang.Object r0 = r1.A01
            X.2EL r0 = (X.AnonymousClass2EL) r0
            X.0z4 r1 = r0.A02
            r0 = 1
            r1.A21(r0)
            return
        L_0x040b:
            java.lang.Object r0 = r1.A01
            X.3hT r0 = (X.C75423hT) r0
            X.01E r0 = r0.A01
            r0.finish()
            return
        L_0x0415:
            java.lang.Object r0 = r1.A01
            X.0vk r0 = (X.C18090vk) r0
            X.AnonymousClass3Ma.A1Q(r0)
            return
        L_0x041d:
            java.lang.Object r3 = r1.A01
            X.3rb r3 = (X.C77853rb) r3
            X.00H r0 = r3.A0B
            java.lang.Object r2 = r0.get()
            X.9lv r2 = (X.C191039lv) r2
            X.1BI r1 = r3.A0G
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C18070vi.A0z(r1, r0)
            X.1ch r1 = (X.C29681ch) r1
            r2.A00(r1)
            X.1KB r2 = r3.A04
            r1 = 22
            X.4rh r0 = new X.4rh
            r0.<init>(r3, r1)
            r2.A0J(r0)
            return
        L_0x0442:
            java.lang.Object r0 = r1.A01
            X.3hT r0 = (X.C75423hT) r0
            X.5cS r1 = r0.A09
            r0 = 1
            r1.BjP(r0)
            return
        L_0x044d:
            java.lang.Object r1 = r1.A01
            X.3rb r1 = (X.C77853rb) r1
            r0 = 0
            r1.A03 = r0
            return
        L_0x0455:
            java.lang.Object r1 = r1.A01
            X.3rX r1 = (X.C77813rX) r1
            r0 = 0
            r1.A02 = r0
            return
        L_0x045d:
            java.lang.Object r0 = r1.A01
            X.0vk r0 = (X.C18090vk) r0
            X.AnonymousClass3Ma.A1Q(r0)
            return
        L_0x0465:
            java.lang.Object r0 = r1.A01
            X.0vk r0 = (X.C18090vk) r0
            X.AnonymousClass3Ma.A1Q(r0)
            return
        L_0x046d:
            java.lang.Object r0 = r1.A01
            X.3rz r0 = (X.C78023rz) r0
            X.1bI r0 = r0.A01
            android.view.View r0 = X.AnonymousClass3MX.A0D(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.requestLayout()
            return
        L_0x047d:
            java.lang.Object r1 = r1.A01
            X.4rI r1 = (X.C98524rI) r1
            r0 = 0
            r1.A07(r0)
            return
        L_0x0486:
            java.lang.Object r0 = r1.A01
            X.3rq r0 = (X.C77933rq) r0
            X.1M9 r2 = r0.A05
            X.1EC r1 = r0.A02
            boolean r0 = r0.A03
            r2.A0g(r1, r0)
            return
        L_0x0494:
            java.lang.Object r0 = r1.A01
            X.3rx r0 = (X.C78003rx) r0
            r2 = 1
            X.1M9 r1 = r0.A05
            X.1EC r0 = r0.A02
            r1.A0h(r0, r2)
            return
        L_0x04a1:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversation.comments.ui.CommentDecryptionFailureTextView r3 = (com.whatsapp.conversation.comments.ui.CommentDecryptionFailureTextView) r3
            X.129 r1 = r3.getFaqLinkFactory()
            java.lang.String r0 = "26000015"
            android.content.Intent r2 = X.C72473Md.A0C(r1, r0)
            X.1L9 r1 = r3.getActivityUtils()
            android.content.Context r0 = r3.getContext()
            r1.A08(r0, r2)
            return
        L_0x04bb:
            java.lang.Object r2 = r1.A01
            android.view.View r2 = (android.view.View) r2
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L_0x04c9
            r0 = 1
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x04c9:
            r2.cancelLongPress()
            r0 = 0
            r2.setPressed(r0)
            return
        L_0x04d1:
            java.lang.Object r0 = r1.A01
            X.3uP r0 = (X.AnonymousClass3uP) r0
            r0.A21()
            return
        L_0x04d9:
            java.lang.Object r0 = r1.A01
            X.3uP r0 = (X.AnonymousClass3uP) r0
            r0.A22()
            return
        L_0x04e1:
            java.lang.Object r0 = r1.A01
            X.8G7 r0 = (X.AnonymousClass8G7) r0
            X.1DT r1 = r0.A04
            r0 = 1
            X.AnonymousClass3MY.A1L(r1, r0)
            return
        L_0x04ec:
            java.lang.Object r3 = r1.A01
            X.3uP r3 = (X.AnonymousClass3uP) r3
            boolean r0 = r3.A1V()
            X.1KB r2 = r3.A0S
            r1 = 46
            if (r0 == 0) goto L_0x04fc
            r1 = 45
        L_0x04fc:
            X.4rh r0 = new X.4rh
            r0.<init>(r3, r1)
            r2.CGP(r0)
            return
        L_0x0505:
            java.lang.Object r0 = r1.A01
            X.3uP r0 = (X.AnonymousClass3uP) r0
            r0.A1u()
            return
        L_0x050d:
            java.lang.String r0 = "fMessageDatabase"
            goto L_0x06d8
        L_0x0511:
            java.util.HashSet r7 = X.C17880vN.A12()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.0vl r11 = r9.A0A
            java.lang.Object r0 = r11.getValue()
            if (r0 == 0) goto L_0x052b
            X.0vl r0 = r9.A09
            int r1 = X.C72453Mb.A0I(r0)
            r0 = 1
            r4 = 1
            if (r1 == r0) goto L_0x052c
        L_0x052b:
            r4 = 0
        L_0x052c:
            java.util.Iterator r15 = r8.iterator()
            r21 = 0
            r3 = 0
            r20 = 0
            r19 = 0
            r14 = 0
            r2 = 0
            r18 = 1
        L_0x053b:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x05d2
            X.206 r10 = X.C17880vN.A0Y(r15)
            int r1 = r10.A0u
            X.C17890vO.A1D(r7, r1)
            X.205 r12 = r10.A0v
            X.C18070vi.A0W(r12)
            r5.add(r12)
            if (r4 == 0) goto L_0x05cb
            X.1EC r13 = X.AnonymousClass3MX.A0p(r11)
            if (r13 == 0) goto L_0x05c9
            X.1kb r0 = r9.A03
            if (r0 == 0) goto L_0x05ce
            X.1EC r0 = r0.A04(r13)
        L_0x0562:
            java.lang.String r0 = X.C22971Dz.A06(r0)
            if (r3 != 0) goto L_0x05c0
            r3 = r0
        L_0x0569:
            r0 = 3
            if (r1 != r0) goto L_0x05a0
            r0 = r10
            X.21V r0 = (X.AnonymousClass21V) r0
            int r0 = r0.A0D
            long r12 = X.C17890vO.A03(r0)
            int r0 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x057b
            r21 = r12
        L_0x057b:
            if (r20 != 0) goto L_0x0585
            boolean r0 = X.AnonymousClass25A.A0x(r10)
            r20 = 0
            if (r0 == 0) goto L_0x0587
        L_0x0585:
            r20 = 1
        L_0x0587:
            if (r14 != 0) goto L_0x0590
            boolean r0 = X.AnonymousClass25A.A0m(r10)
            r14 = 0
            if (r0 == 0) goto L_0x0591
        L_0x0590:
            r14 = 1
        L_0x0591:
            if (r19 != 0) goto L_0x059d
            r0 = 1
            boolean r0 = r10.A11(r0)
            r19 = 0
            if (r0 == 0) goto L_0x053b
        L_0x059d:
            r19 = 1
            goto L_0x053b
        L_0x05a0:
            r0 = 2
            if (r1 != r0) goto L_0x05b0
            int r1 = r10.A09
            r0 = 1
            if (r1 != r0) goto L_0x05ad
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x05ad
            goto L_0x057b
        L_0x05ad:
            r18 = 0
            goto L_0x057b
        L_0x05b0:
            if (r1 != 0) goto L_0x057b
            java.lang.String r0 = r10.A0P()
            if (r0 == 0) goto L_0x057b
            int r0 = r0.length()
            if (r0 <= r2) goto L_0x057b
            r2 = r0
            goto L_0x057b
        L_0x05c0:
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0569
            java.lang.String r3 = ""
            goto L_0x0569
        L_0x05c9:
            r0 = 0
            goto L_0x0562
        L_0x05cb:
            X.1BI r0 = r12.A00
            goto L_0x0562
        L_0x05ce:
            java.lang.String r0 = "communityChatManager"
            goto L_0x06d8
        L_0x05d2:
            X.0zA r0 = r9.A00
            if (r0 == 0) goto L_0x06ad
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L_0x067c
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x067c
        L_0x05e0:
            r15 = 0
        L_0x05e1:
            X.1LU r0 = r9.A05
            if (r0 == 0) goto L_0x06a7
            android.content.Context r1 = r9.A14()
            r17 = 1
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r17)
            r0 = 0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
            if (r20 == 0) goto L_0x05fa
            int r0 = r8.size()
        L_0x05fa:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r19)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r14)
            java.util.ArrayList r14 = X.C17880vN.A10(r7)
            java.lang.Long r13 = java.lang.Long.valueOf(r21)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r18)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r15)
            java.lang.String r15 = "com.whatsapp.contact.picker.ContactPicker"
            r0 = r17
            android.content.Intent r1 = X.C72483Me.A0B(r1, r15, r0)
            java.lang.String r0 = "message_types"
            r1.putExtra(r0, r14)
            java.lang.String r14 = "forward"
            r0 = r16
            r1.putExtra(r14, r0)
            if (r3 == 0) goto L_0x0635
            java.lang.String r0 = "forward_jid"
            r1.putExtra(r0, r3)
        L_0x0635:
            if (r13 == 0) goto L_0x063c
            java.lang.String r0 = "forward_video_duration"
            r1.putExtra(r0, r13)
        L_0x063c:
            if (r8 == 0) goto L_0x0643
            java.lang.String r0 = "forward_text_length"
            r1.putExtra(r0, r8)
        L_0x0643:
            if (r12 == 0) goto L_0x064a
            java.lang.String r0 = "forward_messages_becoming_frequently_forwarded"
            r1.putExtra(r0, r12)
        L_0x064a:
            if (r10 == 0) goto L_0x0651
            java.lang.String r0 = "is_forwarded"
            r1.putExtra(r0, r10)
        L_0x0651:
            if (r9 == 0) goto L_0x0658
            java.lang.String r0 = "forward_highly_forwarded"
            r1.putExtra(r0, r9)
        L_0x0658:
            if (r7 == 0) goto L_0x065f
            java.lang.String r0 = "is_voice_status_forward_allowed"
            r1.putExtra(r0, r7)
        L_0x065f:
            X.AnonymousClass4aU.A08(r1, r5)
            java.lang.String r0 = "show_ad_creation"
            r1.putExtra(r0, r11)
            if (r2 == 0) goto L_0x066e
            java.lang.String r0 = "disable_text_size_limit_message"
            r1.putExtra(r0, r2)
        L_0x066e:
            if (r4 == 0) goto L_0x0675
            java.lang.String r0 = "community_media"
            r1.putExtra(r0, r4)
        L_0x0675:
            X.02n r0 = r6.A00
            if (r0 != 0) goto L_0x06a3
            java.lang.String r0 = "resultLauncher"
            goto L_0x06d8
        L_0x067c:
            java.util.Iterator r1 = r8.iterator()
        L_0x0680:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05e0
            X.206 r0 = X.C17880vN.A0Y(r1)
            boolean r0 = r0.A0w()
            if (r0 == 0) goto L_0x0680
            X.00H r0 = r9.A08
            if (r0 == 0) goto L_0x06aa
            java.lang.Object r0 = r0.get()
            X.61n r0 = (X.C1179361n) r0
            boolean r0 = r0.A05(r8)
            r15 = 1
            if (r0 != 0) goto L_0x05e1
            goto L_0x05e0
        L_0x06a3:
            r0.A03(r1)
            return
        L_0x06a7:
            java.lang.String r0 = "waIntents"
            goto L_0x06d8
        L_0x06aa:
            java.lang.String r0 = "newsletterMessageFutureProofing"
            goto L_0x06d8
        L_0x06ad:
            java.lang.String r0 = "advertiseForwardMediaHelper"
            goto L_0x06d8
        L_0x06b0:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x06b0 }
            throw r0
        L_0x06b3:
            java.lang.Object r0 = r1.A01
            com.whatsapp.conversation.EditMessageActivity r0 = (com.whatsapp.conversation.EditMessageActivity) r0
            android.widget.ScrollView r1 = r0.A05
            if (r1 != 0) goto L_0x06be
            java.lang.String r0 = "messageBubbleContainer"
            goto L_0x06d8
        L_0x06be:
            r0 = 130(0x82, float:1.82E-43)
            r1.fullScroll(r0)
            return
        L_0x06c4:
            java.lang.Object r1 = r1.A01
            com.whatsapp.conversation.comments.CommentActionsBottomSheet r1 = (com.whatsapp.conversation.comments.CommentActionsBottomSheet) r1
            X.00H r0 = r1.A0V
            if (r0 == 0) goto L_0x06dd
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.A5M r3 = (X.A5M) r3
            X.206 r0 = r1.A0T
            if (r0 != 0) goto L_0x06e0
            java.lang.String r0 = "message"
        L_0x06d8:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x06dd:
            java.lang.String r0 = "bizIntegrityLogger"
            goto L_0x06d8
        L_0x06e0:
            java.util.List r2 = X.C18070vi.A0M(r0)
            r1 = 0
            r0 = 2
            r3.A05(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98774rh.run():void");
    }
}
