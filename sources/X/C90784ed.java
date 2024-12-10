package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.conversation.ConversationListView;

/* renamed from: X.4ed  reason: invalid class name and case insensitive filesystem */
public class C90784ed implements AbsListView.OnScrollListener {
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final /* synthetic */ AnonymousClass4aY A05;

    public C90784ed(AnonymousClass4aY r1) {
        this.A05 = r1;
    }

    public static void A00(C90784ed r7, int i, int i2) {
        AnonymousClass206 r2;
        C108415bf r0;
        AnonymousClass4aY r4 = r7.A05;
        ConversationListView conversationListView = r4.A2B;
        C73103Oz conversationCursorAdapter = conversationListView.getConversationCursorAdapter();
        int count = conversationCursorAdapter.getCount();
        while (true) {
            if (i > i2) {
                r2 = null;
                break;
            }
            int headerViewsCount = i - conversationListView.getHeaderViewsCount();
            if (headerViewsCount >= 0 && headerViewsCount <= count - 1) {
                r2 = conversationCursorAdapter.getItem(headerViewsCount);
                if ((r2 instanceof C436420i) && ((C436420i) r2).A00 == 129) {
                    break;
                }
            }
            i++;
        }
        boolean A1W = AnonymousClass000.A1W(r2);
        View findViewById = r4.A2Q.findViewById(2131430951);
        if (A1W) {
            C108415bf r02 = r4.A2R.A06;
            if (!(r02 == null || !r02.isVisible() || (r0 = r4.A2R.A06) == null)) {
                r0.Bd0();
            }
            C72453Mb.A1B(findViewById);
            return;
        }
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        C108415bf r03 = r4.A2R.A06;
        if (r03 == null || !r03.isVisible()) {
            AnonymousClass3MX.A0U(r4).A0J(new C98794rj((Object) r7, 35));
        }
    }

    public static void A01(C90784ed r6, int i, int i2) {
        AnonymousClass206 r2;
        AnonymousClass4aY r62 = r6.A05;
        ConversationListView conversationListView = r62.A2B;
        C73103Oz conversationCursorAdapter = conversationListView.getConversationCursorAdapter();
        int count = conversationCursorAdapter.getCount();
        while (true) {
            if (i > i2) {
                r2 = null;
                break;
            }
            int headerViewsCount = i - conversationListView.getHeaderViewsCount();
            if (headerViewsCount >= 0 && headerViewsCount <= count - 1) {
                r2 = conversationCursorAdapter.getItem(headerViewsCount);
                if ((r2 instanceof C48392Mh) && ((C436420i) r2).A00 == 12) {
                    break;
                }
            }
            i++;
        }
        boolean A1W = AnonymousClass000.A1W(r2);
        View findViewById = r62.A2Q.findViewById(2131430951);
        if (A1W) {
            C72453Mb.A1B(findViewById);
        } else if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (X.AnonymousClass73J.A00 == false) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(android.widget.AbsListView r10, int r11) {
        /*
            r9 = this;
            X.4aY r7 = r9.A05
            com.whatsapp.conversation.ConversationListView r0 = r7.A2B
            r0.A01 = r11
            r2 = 1
            if (r11 == 0) goto L_0x005b
            if (r11 != r2) goto L_0x003e
            int r0 = r7.A04
            if (r0 != 0) goto L_0x001c
            X.1oL r1 = r7.A3u
            X.1FY r0 = X.AnonymousClass3MW.A0P(r7)
            android.view.Window r0 = r0.getWindow()
            r1.A03(r0, r2)
        L_0x001c:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r7.A0i
            if (r0 == 0) goto L_0x003e
            int r1 = r0.A0J
            r0 = 3
            if (r1 != r0) goto L_0x003e
            X.0ve r1 = r7.A3F
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 11370(0x2c6a, float:1.5933E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 == 0) goto L_0x003e
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r7.A0i
            r0 = 4
            r1.A0W(r0)
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r7.A3D
            r0.A0B()
        L_0x003e:
            android.os.Handler r1 = r7.A7Y
            java.lang.Runnable r0 = r7.A7n
            r1.removeCallbacks(r0)
        L_0x0045:
            r7.A04 = r11
            if (r11 == 0) goto L_0x0058
            long r0 = java.lang.System.currentTimeMillis()
        L_0x004d:
            X.AnonymousClass6UB.A00 = r0
            X.1FY r0 = X.AnonymousClass3MW.A0P(r7)
            X.1K9 r0 = r0.A01
            r0.A00 = r11
            return
        L_0x0058:
            r0 = 0
            goto L_0x004d
        L_0x005b:
            X.1oL r0 = r7.A3u
            r0.A01()
            com.whatsapp.conversation.ConversationListView r6 = r7.A2B
            X.5cQ r0 = r7.A2Q
            java.util.HashSet r8 = r0.getSeenMessages()
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.3Oz r0 = r6.getConversationCursorAdapter()
            android.database.Cursor r0 = r0.getCursor()
            if (r0 == 0) goto L_0x00b9
            int r5 = r6.getChildCount()
            r4 = 0
        L_0x007b:
            if (r4 >= r5) goto L_0x00b6
            android.view.View r1 = r6.getChildAt(r4)
            boolean r0 = r1 instanceof X.C108405be
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r1 instanceof X.AnonymousClass3uP
            if (r0 == 0) goto L_0x00e7
            X.5be r1 = (X.C108405be) r1
            X.3uR r1 = (X.C79093uR) r1
            X.206 r3 = r1.getFMessage()
            X.C18070vi.A0X(r3)
            X.205 r0 = r3.A0v
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x00e7
            X.3Oz r2 = r6.getConversationCursorAdapter()
            int r1 = r2.A05(r3)
            int r0 = r2.A04()
            if (r1 > r0) goto L_0x00b2
            X.1IX r0 = r2.A07
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x00e7
        L_0x00b2:
            boolean r0 = X.AnonymousClass73J.A00
            if (r0 == 0) goto L_0x00b9
        L_0x00b6:
            r6.A03()
        L_0x00b9:
            boolean r0 = X.AnonymousClass3MZ.A1W(r7)
            if (r0 == 0) goto L_0x00dc
            com.whatsapp.conversation.ConversationListView r0 = r7.A2B
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x00cc
            com.whatsapp.conversation.ConversationListView r0 = r7.A2B
            r0.A04()
        L_0x00cc:
            X.1c4 r1 = X.AnonymousClass4X5.A00(r7)
            r0 = 2
            boolean r0 = X.AnonymousClass1c4.A00(r1, r0)
            if (r0 == 0) goto L_0x00dc
            com.whatsapp.conversation.ConversationListView r0 = r7.A2B
            r0.A04()
        L_0x00dc:
            android.os.Handler r3 = r7.A7Y
            java.lang.Runnable r2 = r7.A7n
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            goto L_0x0045
        L_0x00e7:
            int r4 = r4 + 1
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90784ed.onScrollStateChanged(android.widget.AbsListView, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x023e, code lost:
        if (r32 == 0) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0240, code lost:
        r0 = r31 - r5.A2B.getHeaderViewsCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0248, code lost:
        if (r0 < 0) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x024a, code lost:
        r8 = r8.getItem(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x024e, code lost:
        if (r8 == null) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0250, code lost:
        r2 = r8.A0I;
        r5.A2Q.getTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x025f, code lost:
        if (X.A87.A04(r2, java.lang.System.currentTimeMillis()) != false) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0261, code lost:
        r3 = X.AnonymousClass3MX.A0M(r5.A4Q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x026d, code lost:
        if (r5.A2B.getClipToPadding() == false) goto L_0x0279;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x026f, code lost:
        r3.setY((float) r5.A2B.getPaddingTop());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0279, code lost:
        r5.A2Q.getTime();
        r3.setText(X.C64052u8.A0B(r5.A2k, r8.A0I));
        r3.setTextSize(r5.A28.A03(X.AnonymousClass3MW.A04(r5)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x029a, code lost:
        if (r3.getVisibility() == 0) goto L_0x02be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x029c, code lost:
        r3.setVisibility(0);
        r20 = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        r20.setDuration(200);
        r3.startAnimation(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02be, code lost:
        r12 = r6.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c0, code lost:
        if (r12 == 0) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02c2, code lost:
        r8 = r6.A02;
        r0 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02c6, code lost:
        if (r0 != 0) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02c8, code lost:
        r6.A01 = r10;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02cb, code lost:
        if (r0 >= r10) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02cd, code lost:
        r8 = r8 + (r10 - r0);
        r6.A01 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02d2, code lost:
        r4 = r4 - 1;
        r12 = (r12 + r8) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02d7, code lost:
        if (r8 >= r7) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d9, code lost:
        if (r7 > r12) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02db, code lost:
        r12 = r31 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02dd, code lost:
        r3 = X.AnonymousClass3MX.A0c(r5);
        r13 = r3.getCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02e5, code lost:
        if (r8 > r12) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02e7, code lost:
        r1 = r8 - r5.A2B.getHeaderViewsCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ef, code lost:
        if (r1 < 0) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02f3, code lost:
        if (r1 > (r13 - 1)) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02f5, code lost:
        r2 = r3.getItem(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02f9, code lost:
        if (r2 == null) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02ff, code lost:
        if (r2.A0u != 13) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0301, code lost:
        r5.A2Q.BIi(r2.A0v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0308, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x030b, code lost:
        if (r4 >= r12) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x030d, code lost:
        if (r8 > r4) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x030f, code lost:
        r8 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0312, code lost:
        if (r4 < r8) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0314, code lost:
        if (r7 <= r12) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0317, code lost:
        r5.A4Q.A04(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x031f, code lost:
        if (r32 == 0) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0322, code lost:
        r12.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0329, code lost:
        if (r5.A8J != null) goto L_0x0365;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x032d, code lost:
        if (r6.A00 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x032f, code lost:
        r6.A00 = true;
        X.AnonymousClass3MX.A0w(r5).CGF(new X.AnonymousClass7RE(r6, r4, r7, 5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0342, code lost:
        if (r6.A02 == r7) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0346, code lost:
        if (r5.A04 == 0) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0348, code lost:
        X.AnonymousClass6UB.A00 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x034e, code lost:
        r6.A02 = r7;
        r6.A04 = r11;
        r2 = r5.A2b;
        r2.A08 = (long) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x035f, code lost:
        if (r7 >= (java.lang.Math.min(100, r10) / 2)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0361, code lost:
        r2.A0c(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0364, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x036b, code lost:
        if (r5.A8J.booleanValue() == false) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0373, code lost:
        if (X.C22971Dz.A0e(r5.A3R) == false) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0375, code lost:
        A01(r6, r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0379, code lost:
        A00(r6, r7, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a9, code lost:
        if (r0.A0D(r1) != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        if (r5.A6q != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00af, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        r3 = r5.A4W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ba, code lost:
        if (r12 == false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c0, code lost:
        if (r3.A01() != 0) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        r3 = X.C72473Md.A0J(new android.view.animation.ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, 1, 0.5f, 1, 0.5f), 1.0f, 0.0f);
        r3.setDuration(100);
        r5.A4W.A02().startAnimation(r3);
        r5.A2B.post(new X.C98794rj((java.lang.Object) r6, 34));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ee, code lost:
        r5.A2b.A04 = 0;
        r1 = r5.A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f4, code lost:
        if (r1 == null) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f6, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ff, code lost:
        if (r5.A6r == false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0101, code lost:
        r1 = r5.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0105, code lost:
        if (r1 == 2) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        if (r1 != 0) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0109, code lost:
        r1 = (X.C84694Km) r5.A6C.get();
        r3 = false;
        r0 = r5.A2B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0114, code lost:
        if (r0 == null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0116, code lost:
        r3 = r0.A0D(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011a, code lost:
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011c, code lost:
        if (r0 == null) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011e, code lost:
        r1 = r0.getStateHolder();
        r1.A0C = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012a, code lost:
        if (X.AnonymousClass4G2.A00(r1.A08) == false) goto L_0x012f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012c, code lost:
        com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder.A00(r1, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0137, code lost:
        if (X.C17880vN.A1X(r5.A2b.A1G) == false) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0139, code lost:
        r1 = ((r31 - r5.A2B.getHeaderViewsCount()) + r32) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0147, code lost:
        if (r6.A03 == r1) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0149, code lost:
        if (r1 < 0) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014b, code lost:
        r6.A03 = r1;
        r12 = r5.A2b;
        r14 = r8.getItem(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0153, code lost:
        if (r14 == null) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0155, code lost:
        r13 = X.AnonymousClass000.A13();
        r20 = r12.A1G;
        r17 = r20.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0165, code lost:
        if (r17.hasNext() == false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0167, code lost:
        r15 = X.C17880vN.A0Y(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0171, code lost:
        if (r15.A0y > r14.A0y) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0173, code lost:
        r13.add(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017d, code lost:
        if (r3.A01() != 8) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017f, code lost:
        r5.A4W.A04(0);
        r5.A2b.A03 = 0;
        X.AnonymousClass4aY.A1j(r5, false);
        r3 = X.C72473Md.A0J(new android.view.animation.ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f), 0.0f, 1.0f);
        r3.setDuration(100);
        r5.A4W.A02().startAnimation(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ae, code lost:
        X.C72453Mb.A1M(r5.A4Z);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01be, code lost:
        if ((r31 + r1) < (r5.A2B.getHeaderViewsCount() + r10)) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c2, code lost:
        r12.A1G.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01cc, code lost:
        if (r13.isEmpty() != false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ce, code lost:
        r20.removeAll(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d3, code lost:
        r12.A0V.A0E(X.C87844Xh.A00(r12, r12.A1G));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e0, code lost:
        if (r5.A04 != 0) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e2, code lost:
        r12 = r5.A7r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e8, code lost:
        if (r12.isEmpty() != false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ea, code lost:
        r13 = ((X.AnonymousClass4NG) r12.peek()).A01;
        r1 = ((r31 - r5.A2B.getHeaderViewsCount()) + r32) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0202, code lost:
        if (r1 != r8.A04()) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0204, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0206, code lost:
        if (r1 < 0) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0208, code lost:
        r0 = r8.getItem(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x020c, code lost:
        if (r0 == null) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0214, code lost:
        if (r13.A0y > r0.A0y) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0216, code lost:
        r1 = r31 - r5.A2B.getHeaderViewsCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0222, code lost:
        if (r1 != r8.A04()) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0224, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0226, code lost:
        if (r1 < 0) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0228, code lost:
        r0 = r8.getItem(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022c, code lost:
        if (r0 == null) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0234, code lost:
        if (r13.A0y < r0.A0y) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0238, code lost:
        if (r5.A04 == 0) goto L_0x031f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023c, code lost:
        if (r6.A02 == r7) goto L_0x031f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r30, int r31, int r32, int r33) {
        /*
            r29 = this;
            r6 = r29
            X.4aY r5 = r6.A05
            boolean r0 = r5.A6p
            if (r0 == 0) goto L_0x002a
            com.whatsapp.KeyboardPopupLayout r0 = r5.A1M
            if (r0 == 0) goto L_0x002a
            X.2gp r0 = X.AnonymousClass3Ma.A0X(r5)
            X.00H r0 = r0.A01
            java.lang.Object r4 = r0.get()
            X.4X0 r4 = (X.AnonymousClass4X0) r4
            com.whatsapp.KeyboardPopupLayout r3 = r5.A1M
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.1KB r2 = r4.A00
            r1 = 47
            X.4rl r0 = new X.4rl
            r0.<init>(r4, r3, r1)
            r2.A0J(r0)
        L_0x002a:
            X.3Oz r8 = X.AnonymousClass3MX.A0c(r5)
            if (r8 == 0) goto L_0x037d
            boolean r0 = r8.A0E
            if (r0 == 0) goto L_0x037d
            com.whatsapp.conversation.ConversationListView r2 = r5.A2B
            r7 = r31
            r2.A00 = r7
            r11 = r32
            int r4 = r31 + r32
            X.3Oz r0 = r2.getConversationCursorAdapter()
            int r3 = r0.getCount()
            int r0 = r2.getHeaderViewsCount()
            int r3 = r3 + r0
            r1 = 0
            r0 = 0
            if (r4 < r3) goto L_0x0050
            r0 = 1
        L_0x0050:
            r2.A0M = r0
            X.0zA r0 = r2.getBonsaiUtilOptional()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0072
            X.0zA r0 = r2.getBonsaiUtilOptional()
            java.lang.Object r0 = r0.A03()
            X.1PW r0 = (X.AnonymousClass1PW) r0
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x0072
            boolean r0 = r2.A0D(r1)
            r2.A0M = r0
        L_0x0072:
            boolean r0 = r2.A0M
            if (r0 != 0) goto L_0x007f
            boolean r0 = r2.isInLayout()
            if (r0 != 0) goto L_0x007f
            r2.setTranscriptMode(r1)
        L_0x007f:
            int r10 = r8.getCount()
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            int r1 = r0.getAdjustedVisibleItemCount()
            int r1 = r1 + r32
            X.1UD r0 = X.C72473Md.A0R(r5)
            boolean r0 = r0.A06()
            r12 = 0
            if (r0 == 0) goto L_0x01b5
            android.content.res.Resources r1 = X.C72463Mc.A0I(r5)
            r0 = 2131168784(0x7f070e10, float:1.795188E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r0.A0D(r1)
            if (r0 != 0) goto L_0x00af
        L_0x00ab:
            boolean r0 = r5.A6q
            if (r0 == 0) goto L_0x00b0
        L_0x00af:
            r12 = 1
        L_0x00b0:
            r0 = 100
            r2 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r19 = 1
            X.1bI r3 = r5.A4W
            if (r12 == 0) goto L_0x0177
            int r3 = r3.A01()
            if (r3 != 0) goto L_0x00ee
            r14 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r12 = new android.view.animation.ScaleAnimation
            r17 = r19
            r18 = r14
            r20 = r14
            r15 = r13
            r16 = r14
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            android.view.animation.AnimationSet r3 = X.C72473Md.A0J(r12, r13, r2)
            r3.setDuration(r0)
            X.1bI r0 = r5.A4W
            android.view.View r0 = r0.A02()
            r0.startAnimation(r3)
            com.whatsapp.conversation.ConversationListView r3 = r5.A2B
            r1 = 34
            X.4rj r0 = new X.4rj
            r0.<init>((java.lang.Object) r6, (int) r1)
            r3.post(r0)
        L_0x00ee:
            X.3VQ r0 = r5.A2b
            r0.A04 = r9
            android.widget.TextView r1 = r5.A0b
            if (r1 == 0) goto L_0x00fb
            r0 = 8
            r1.setVisibility(r0)
        L_0x00fb:
            boolean r0 = r5.A6r
            r18 = 2
            if (r0 == 0) goto L_0x012f
            int r1 = r5.A04
            r0 = r18
            if (r1 == r0) goto L_0x0109
            if (r1 != 0) goto L_0x012f
        L_0x0109:
            X.00H r0 = r5.A6C
            java.lang.Object r1 = r0.get()
            X.4Km r1 = (X.C84694Km) r1
            r3 = 0
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            if (r0 == 0) goto L_0x011a
            boolean r3 = r0.A0D(r9)
        L_0x011a:
            com.whatsapp.calling.vcoverscroll.view.VCOverscrollEntryPointView r0 = r1.A00
            if (r0 == 0) goto L_0x012f
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder r1 = r0.getStateHolder()
            r1.A0C = r3
            java.lang.Integer r0 = r1.A08
            boolean r0 = X.AnonymousClass4G2.A00(r0)
            if (r0 == 0) goto L_0x012f
            com.whatsapp.calling.vcoverscroll.vm.VCOverscrollEntryPointStateHolder.A00(r1, r2)
        L_0x012f:
            X.3VQ r0 = r5.A2b
            java.util.ArrayList r0 = r0.A1G
            boolean r0 = X.C17880vN.A1X(r0)
            if (r0 == 0) goto L_0x01de
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            int r0 = r0.getHeaderViewsCount()
            int r1 = r31 - r0
            int r1 = r1 + r32
            int r1 = r1 - r19
            int r0 = r6.A03
            if (r0 == r1) goto L_0x01de
            if (r1 < 0) goto L_0x01de
            r6.A03 = r1
            X.3VQ r12 = r5.A2b
            X.206 r14 = r8.getItem(r1)
            if (r14 == 0) goto L_0x01c2
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            java.util.ArrayList r0 = r12.A1G
            r20 = r0
            java.util.Iterator r17 = r20.iterator()
        L_0x0161:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01c8
            X.206 r15 = X.C17880vN.A0Y(r17)
            long r2 = r15.A0y
            long r0 = r14.A0y
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 > 0) goto L_0x0161
            r13.add(r15)
            goto L_0x0161
        L_0x0177:
            int r12 = r3.A01()
            r3 = 8
            if (r12 != r3) goto L_0x01ae
            X.1bI r3 = r5.A4W
            r3.A04(r9)
            X.3VQ r3 = r5.A2b
            r3.A03 = r9
            X.AnonymousClass4aY.A1j(r5, r9)
            r15 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r14 = new android.view.animation.ScaleAnimation
            r18 = r13
            r20 = r15
            r22 = r15
            r16 = r13
            r17 = r15
            r21 = r19
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            android.view.animation.AnimationSet r3 = X.C72473Md.A0J(r14, r2, r13)
            r3.setDuration(r0)
            X.1bI r0 = r5.A4W
            android.view.View r0 = r0.A02()
            r0.startAnimation(r3)
        L_0x01ae:
            X.1bI r0 = r5.A4Z
            X.C72453Mb.A1M(r0)
            goto L_0x00fb
        L_0x01b5:
            int r1 = r31 + r1
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            int r0 = r0.getHeaderViewsCount()
            int r0 = r0 + r10
            if (r1 >= r0) goto L_0x00af
            goto L_0x00ab
        L_0x01c2:
            java.util.ArrayList r0 = r12.A1G
            r0.clear()
            goto L_0x01d3
        L_0x01c8:
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x01d3
            r0 = r20
            r0.removeAll(r13)
        L_0x01d3:
            java.util.ArrayList r0 = r12.A1G
            X.4Xh r1 = X.C87844Xh.A00(r12, r0)
            X.1DT r0 = r12.A0V
            r0.A0E(r1)
        L_0x01de:
            int r0 = r5.A04
            if (r0 != 0) goto L_0x0236
            java.util.Stack r12 = r5.A7r
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0236
            java.lang.Object r0 = r12.peek()
            X.4NG r0 = (X.AnonymousClass4NG) r0
            X.206 r13 = r0.A01
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            int r0 = r0.getHeaderViewsCount()
            int r1 = r31 - r0
            int r1 = r1 + r32
            int r1 = r1 - r19
            int r0 = r8.A04()
            if (r1 != r0) goto L_0x0206
            int r1 = r1 + -1
        L_0x0206:
            if (r1 < 0) goto L_0x0322
            X.206 r0 = r8.getItem(r1)
            if (r0 == 0) goto L_0x0322
            long r2 = r13.A0y
            long r0 = r0.A0y
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 > 0) goto L_0x0322
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            int r0 = r0.getHeaderViewsCount()
            int r1 = r31 - r0
            int r0 = r8.A04()
            if (r1 != r0) goto L_0x0226
            int r1 = r1 + 1
        L_0x0226:
            if (r1 < 0) goto L_0x0236
            X.206 r0 = r8.getItem(r1)
            if (r0 == 0) goto L_0x0322
            long r2 = r13.A0y
            long r0 = r0.A0y
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 < 0) goto L_0x0322
        L_0x0236:
            int r0 = r5.A04
            if (r0 == 0) goto L_0x031f
            int r0 = r6.A02
            if (r0 == r7) goto L_0x031f
            if (r32 == 0) goto L_0x0340
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            int r0 = r0.getHeaderViewsCount()
            int r0 = r31 - r0
            if (r0 < 0) goto L_0x0317
            X.206 r8 = r8.getItem(r0)
            if (r8 == 0) goto L_0x0317
            long r2 = r8.A0I
            X.5cQ r0 = r5.A2Q
            r0.getTime()
            long r0 = java.lang.System.currentTimeMillis()
            boolean r0 = X.A87.A04(r2, r0)
            if (r0 != 0) goto L_0x0317
            X.1bI r0 = r5.A4Q
            android.widget.TextView r3 = X.AnonymousClass3MX.A0M(r0)
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            boolean r0 = r0.getClipToPadding()
            if (r0 == 0) goto L_0x0279
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            int r0 = r0.getPaddingTop()
            float r0 = (float) r0
            r3.setY(r0)
        L_0x0279:
            X.5cQ r0 = r5.A2Q
            r0.getTime()
            X.0vb r2 = r5.A2k
            long r0 = r8.A0I
            java.lang.String r0 = X.C64052u8.A0B(r2, r0)
            r3.setText(r0)
            X.4VN r1 = r5.A28
            android.content.res.Resources r0 = X.AnonymousClass3MW.A04(r5)
            float r0 = r1.A03(r0)
            r3.setTextSize(r0)
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L_0x02be
            r3.setVisibility(r9)
            r22 = 0
            r26 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation
            r23 = r19
            r25 = r19
            r27 = r19
            r28 = r22
            r20 = r2
            r21 = r19
            r24 = r22
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            r3.startAnimation(r2)
        L_0x02be:
            int r12 = r6.A04
            if (r12 == 0) goto L_0x0340
            int r8 = r6.A02
            int r0 = r6.A01
            if (r0 != 0) goto L_0x02cb
            r6.A01 = r10
            r0 = r10
        L_0x02cb:
            if (r0 >= r10) goto L_0x02d2
            int r0 = r10 - r0
            int r8 = r8 + r0
            r6.A01 = r10
        L_0x02d2:
            int r4 = r4 - r19
            int r12 = r12 + r8
            int r12 = r12 - r19
            if (r8 >= r7) goto L_0x030b
            if (r7 > r12) goto L_0x030b
            int r12 = r31 + -1
        L_0x02dd:
            X.3Oz r3 = X.AnonymousClass3MX.A0c(r5)
            int r13 = r3.getCount()
        L_0x02e5:
            if (r8 > r12) goto L_0x0327
            com.whatsapp.conversation.ConversationListView r0 = r5.A2B
            int r0 = r0.getHeaderViewsCount()
            int r1 = r8 - r0
            if (r1 < 0) goto L_0x0308
            int r0 = r13 + -1
            if (r1 > r0) goto L_0x0308
            X.206 r2 = r3.getItem(r1)
            if (r2 == 0) goto L_0x0308
            int r1 = r2.A0u
            r0 = 13
            if (r1 != r0) goto L_0x0308
            X.5cQ r1 = r5.A2Q
            X.205 r0 = r2.A0v
            r1.BIi(r0)
        L_0x0308:
            int r8 = r8 + 1
            goto L_0x02e5
        L_0x030b:
            if (r4 >= r12) goto L_0x0312
            if (r8 > r4) goto L_0x0312
            int r8 = r4 + 1
            goto L_0x02dd
        L_0x0312:
            if (r4 < r8) goto L_0x02dd
            if (r7 <= r12) goto L_0x0327
            goto L_0x02dd
        L_0x0317:
            X.1bI r1 = r5.A4Q
            r0 = 8
            r1.A04(r0)
            goto L_0x02be
        L_0x031f:
            if (r32 == 0) goto L_0x0340
            goto L_0x02be
        L_0x0322:
            r12.clear()
            goto L_0x0236
        L_0x0327:
            java.lang.Boolean r0 = r5.A8J
            if (r0 != 0) goto L_0x0365
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x037d
            r0 = r19
            r6.A00 = r0
            X.10I r2 = X.AnonymousClass3MX.A0w(r5)
            r1 = 5
            X.7RE r0 = new X.7RE
            r0.<init>(r6, r4, r7, r1)
            r2.CGF(r0)
        L_0x0340:
            int r0 = r6.A02
            if (r0 == r7) goto L_0x034e
            int r0 = r5.A04
            if (r0 == 0) goto L_0x034e
            long r0 = java.lang.System.currentTimeMillis()
            X.AnonymousClass6UB.A00 = r0
        L_0x034e:
            r6.A02 = r7
            r6.A04 = r11
            X.3VQ r2 = r5.A2b
            long r0 = (long) r7
            r2.A08 = r0
            r0 = 100
            int r0 = java.lang.Math.min(r0, r10)
            int r0 = r0 / r18
            if (r7 >= r0) goto L_0x037d
            r2.A0c(r9)
            return
        L_0x0365:
            java.lang.Boolean r0 = r5.A8J
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0340
            X.1BI r0 = r5.A3R
            boolean r0 = X.C22971Dz.A0e(r0)
            if (r0 == 0) goto L_0x0379
            A01(r6, r7, r4)
            goto L_0x0340
        L_0x0379:
            A00(r6, r7, r4)
            goto L_0x0340
        L_0x037d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90784ed.onScroll(android.widget.AbsListView, int, int, int):void");
    }
}
