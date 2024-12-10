package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;

/* renamed from: X.4du  reason: invalid class name and case insensitive filesystem */
public class C90334du implements View.OnTouchListener {
    public final int A00;
    public final Object A01;

    public C90334du(Context context, C78943ty r4) {
        this.A00 = 13;
        this.A01 = new GestureDetector(context, new C72883Nw(r4, new C94654ky(r4, 1)));
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnTouchListener(new C90334du(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x024f, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0253, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0260, code lost:
        r1.performHapticFeedback(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        return ((android.view.GestureDetector) r0).onTouchEvent(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0154, code lost:
        if (r4.A0E.A00 == r1) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0162, code lost:
        if (r4.A0a.A0J(r1) != false) goto L_0x0164;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0275;
                case 1: goto L_0x0275;
                case 2: goto L_0x0265;
                case 3: goto L_0x023d;
                case 4: goto L_0x0254;
                case 5: goto L_0x0254;
                case 6: goto L_0x0224;
                case 7: goto L_0x0209;
                case 8: goto L_0x01fd;
                case 9: goto L_0x013a;
                case 10: goto L_0x01c2;
                case 11: goto L_0x0005;
                case 12: goto L_0x0128;
                case 13: goto L_0x0021;
                case 14: goto L_0x0005;
                case 15: goto L_0x0014;
                case 16: goto L_0x010b;
                case 17: goto L_0x0005;
                case 18: goto L_0x004f;
                case 19: goto L_0x0028;
                case 20: goto L_0x0265;
                case 21: goto L_0x003c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            X.00H r0 = (X.AnonymousClass00H) r0
            java.lang.Object r0 = r0.get()
        L_0x000d:
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
            boolean r0 = r0.onTouchEvent(r15)
            return r0
        L_0x0014:
            r0 = 1
            X.C18070vi.A0d(r15, r0)
            java.lang.Object r0 = r13.A01
            X.0vl r0 = (X.C18100vl) r0
            java.lang.Object r0 = r0.getValue()
            goto L_0x000d
        L_0x0021:
            r0 = 1
            X.C18070vi.A0d(r15, r0)
            java.lang.Object r0 = r13.A01
            goto L_0x000d
        L_0x0028:
            java.lang.Object r1 = r13.A01
            X.3yN r1 = (X.C80923yN) r1
            X.AnonymousClass3MX.A1O(r1)
            int r0 = r15.getActionMasked()
            if (r0 != 0) goto L_0x0282
            X.5bo r0 = r1.A02
            r0.Bu1(r1)
            goto L_0x0282
        L_0x003c:
            boolean r1 = X.C18070vi.A16(r14, r15)
            int r0 = r15.getAction()
            if (r0 != r1) goto L_0x0282
            java.lang.Object r0 = r13.A01
            X.5bp r0 = (X.C108515bp) r0
            r0.onCaptionLayoutClicked(r14)
            goto L_0x0207
        L_0x004f:
            java.lang.Object r3 = r13.A01
            X.3d3 r3 = (X.C74873d3) r3
            int r1 = r15.getActionMasked()
            r0 = 2
            if (r1 == r0) goto L_0x008b
            int r1 = r15.getActionMasked()
            r0 = 1
            if (r1 == r0) goto L_0x008b
            android.graphics.Point r2 = X.C72483Me.A0E(r15, r14)
            com.whatsapp.WaEditText r1 = r3.A0M
            if (r1 == 0) goto L_0x0080
            boolean r0 = r1.isShown()
            if (r0 == 0) goto L_0x0080
            boolean r0 = X.AnonymousClass3RR.A01(r2, r1)
            if (r0 == 0) goto L_0x0080
            boolean r0 = r1.A0J(r2)
            if (r0 == 0) goto L_0x0080
            r3.A08(r1)
            goto L_0x0207
        L_0x0080:
            float r1 = r15.getY()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x008b
            goto L_0x0207
        L_0x008b:
            X.4aN r1 = r3.A06
            X.3RO r0 = r1.A04
            if (r0 == 0) goto L_0x0282
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0282
            X.3RO r4 = r1.A04
            float r0 = r15.getX()
            int r10 = (int) r0
            float r0 = r15.getY()
            int r9 = (int) r0
            android.view.View r8 = r4.getContentView()
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            int[] r7 = r4.A01
            r14.getLocationOnScreen(r7)
            r6 = 0
            r0 = r7[r6]
            int r10 = r10 + r0
            r5 = 1
            r0 = r7[r5]
            int r9 = r9 + r0
            int r11 = r8.getChildCount()
            android.view.View r3 = r4.A00
            r0 = 0
            r4.A00 = r0
            r2 = 0
        L_0x00c0:
            if (r2 >= r11) goto L_0x0109
            android.view.View r1 = r8.getChildAt(r2)
            r1.getLocationOnScreen(r7)
            r12 = r7[r6]
            if (r10 <= r12) goto L_0x0106
            int r0 = r1.getWidth()
            int r12 = r12 + r0
            if (r10 >= r12) goto L_0x0106
            r0 = r7[r5]
            if (r9 <= r0) goto L_0x0106
            int r0 = X.AnonymousClass3MW.A02(r1, r0)
            if (r9 >= r0) goto L_0x0106
            r1.setPressed(r5)
            r4.A00 = r1
        L_0x00e3:
            if (r3 == 0) goto L_0x00ec
            android.view.View r0 = r4.A00
            if (r3 == r0) goto L_0x00ec
            r3.setPressed(r6)
        L_0x00ec:
            int r0 = r15.getAction()
            if (r0 != r5) goto L_0x0282
            android.view.View r0 = r4.A00
            if (r0 == 0) goto L_0x0282
            int[][] r0 = r4.A04
            r1 = r0[r2]
            X.5Zl r0 = r4.A03
            if (r0 == 0) goto L_0x0101
            r0.C5m(r1)
        L_0x0101:
            r4.dismiss()
            goto L_0x0282
        L_0x0106:
            int r2 = r2 + 1
            goto L_0x00c0
        L_0x0109:
            r2 = 0
            goto L_0x00e3
        L_0x010b:
            java.lang.Object r3 = r13.A01
            X.3uH r3 = (X.C79053uH) r3
            int r2 = r15.getAction()
            r1 = 0
            r0 = 1
            if (r2 == 0) goto L_0x011e
            if (r2 == r0) goto L_0x0121
            r0 = 3
            if (r2 == r0) goto L_0x0121
            goto L_0x0282
        L_0x011e:
            r3.A09 = r0
            goto L_0x0123
        L_0x0121:
            r3.A09 = r1
        L_0x0123:
            X.C79053uH.A03(r3)
            goto L_0x0282
        L_0x0128:
            java.lang.Object r2 = r13.A01
            X.5cR r2 = (X.C108875cR) r2
            int r1 = r15.getAction()
            r0 = 1
            if (r1 != r0) goto L_0x0282
            if (r2 == 0) goto L_0x0282
            r2.BId()
            goto L_0x0282
        L_0x013a:
            java.lang.Object r4 = r13.A01
            com.whatsapp.community.CommunityHomeActivity r4 = (com.whatsapp.community.CommunityHomeActivity) r4
            X.5gJ r14 = (X.C110595gJ) r14
            X.6uU r0 = r14.A07
            if (r0 == 0) goto L_0x018e
            int r1 = r0.A00
        L_0x0146:
            int r0 = r15.getAction()
            r3 = 1
            if (r0 != 0) goto L_0x0156
            if (r1 != r3) goto L_0x0156
            androidx.viewpager2.widget.ViewPager2 r0 = r4.A0E
            int r0 = r0.A00
            r2 = 1
            if (r0 != r1) goto L_0x0157
        L_0x0156:
            r2 = 0
        L_0x0157:
            X.1EC r1 = r4.A0i
            if (r1 == 0) goto L_0x0164
            X.1MZ r0 = r4.A0a
            boolean r1 = r0.A0J(r1)
            r0 = 1
            if (r1 == 0) goto L_0x0165
        L_0x0164:
            r0 = 0
        L_0x0165:
            if (r2 == 0) goto L_0x0282
            if (r0 == 0) goto L_0x0282
            X.00H r0 = r4.A0s
            X.1gf r8 = X.AnonymousClass3MX.A0b(r0)
            X.1EC r0 = r4.A0i
            r6 = 0
            r9 = 3
            r2 = 0
            X.C18070vi.A0d(r0, r3)
            X.1EC r7 = X.AnonymousClass3MW.A0i(r0)
            if (r7 == 0) goto L_0x0207
            X.00H r5 = r8.A0A
            X.1EC r3 = X.C72453Mb.A0n(r7, r5)
            if (r3 != 0) goto L_0x0190
            X.1KB r1 = r8.A02
            r0 = 2131896579(0x7f122903, float:1.9428023E38)
            r1.A06(r0, r2)
            goto L_0x0207
        L_0x018e:
            r1 = -1
            goto L_0x0146
        L_0x0190:
            X.10I r2 = r8.A09
            r1 = 29
            X.Akb r0 = new X.Akb
            r0.<init>((java.lang.Object) r8, (int) r9, (int) r1, (java.lang.Object) r7)
            r2.CGF(r0)
            X.1kb r0 = X.AnonymousClass3MW.A0Z(r5)
            boolean r0 = r0.A0S(r7, r3)
            if (r0 == 0) goto L_0x01b5
            r1 = 3
        L_0x01a7:
            X.00H r0 = r8.A0B
            r0.get()
            r0 = 4
            com.whatsapp.community.JoinGroupBottomSheetFragment r0 = com.whatsapp.community.JoinGroupBottomSheetFragment.A00(r3, r7, r0, r1)
            r4.CMk(r0, r6)
            goto L_0x0207
        L_0x01b5:
            X.1kb r0 = X.AnonymousClass3MW.A0Z(r5)
            boolean r0 = r0.A0T(r7, r3)
            r1 = 2
            if (r0 == 0) goto L_0x01a7
            r1 = 6
            goto L_0x01a7
        L_0x01c2:
            java.lang.Object r5 = r13.A01
            X.4RQ r5 = (X.AnonymousClass4RQ) r5
            r2 = 0
            int r0 = X.C72453Mb.A0G(r5, r15, r2)
            int[] r1 = new int[r0]
            android.view.View r4 = r5.A06
            r4.getLocationOnScreen(r1)
            r3 = r1[r2]
            r0 = 1
            r2 = r1[r0]
            int r1 = r4.getWidth()
            int r1 = r1 + r3
            float r0 = r15.getX()
            int r0 = (int) r0
            if (r3 > r0) goto L_0x01f5
            if (r0 > r1) goto L_0x01f5
            int r1 = r4.getHeight()
            int r1 = r1 + r2
            float r0 = r15.getY()
            int r0 = (int) r0
            if (r2 > r0) goto L_0x01f5
            if (r0 > r1) goto L_0x01f5
            goto L_0x0282
        L_0x01f5:
            X.0SF r0 = r5.A00
            if (r0 == 0) goto L_0x0207
            r0.dismiss()
            goto L_0x0207
        L_0x01fd:
            java.lang.Object r0 = r13.A01
            X.4ZV r0 = (X.AnonymousClass4ZV) r0
            r14.performClick()
            r0.A02()
        L_0x0207:
            r0 = 1
            return r0
        L_0x0209:
            java.lang.Object r1 = r13.A01
            X.3my r1 = (X.C76253my) r1
            java.util.List r0 = X.C42011xT.A0I
            int r0 = r15.getActionMasked()
            if (r0 != 0) goto L_0x0282
            X.5Yt r0 = r1.A00
            com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity r0 = (com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity) r0
            X.BM5 r0 = r0.A00
            if (r0 != 0) goto L_0x0220
            java.lang.String r0 = "favoriteListItemTouchHelper"
            goto L_0x024f
        L_0x0220:
            r0.A0A(r1)
            goto L_0x0282
        L_0x0224:
            java.lang.Object r2 = r13.A01
            com.whatsapp.calling.dialer.DialerActivity r2 = (com.whatsapp.calling.dialer.DialerActivity) r2
            java.util.ArrayList r0 = com.whatsapp.calling.dialer.DialerActivity.A0I
            int r0 = r15.getAction()
            if (r0 != 0) goto L_0x0282
            android.widget.ImageView r1 = r2.A03
            if (r1 != 0) goto L_0x0237
            java.lang.String r0 = "callButton"
            goto L_0x024f
        L_0x0237:
            X.11C r0 = r2.A08
            X.AnonymousClass4a5.A01(r1, r0)
            goto L_0x0282
        L_0x023d:
            java.lang.Object r1 = r13.A01
            com.whatsapp.calling.dialer.DialerActivity r1 = (com.whatsapp.calling.dialer.DialerActivity) r1
            java.util.ArrayList r0 = com.whatsapp.calling.dialer.DialerActivity.A0I
            int r0 = r15.getAction()
            if (r0 != 0) goto L_0x0282
            android.widget.ImageView r1 = r1.A05
            if (r1 != 0) goto L_0x0260
            java.lang.String r0 = "messageNumberButton"
        L_0x024f:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0254:
            java.lang.Object r1 = r13.A01
            android.view.View r1 = (android.view.View) r1
            java.util.ArrayList r0 = com.whatsapp.calling.dialer.DialerActivity.A0I
            int r0 = r15.getAction()
            if (r0 != 0) goto L_0x0282
        L_0x0260:
            r0 = 3
            r1.performHapticFeedback(r0)
            goto L_0x0282
        L_0x0265:
            java.lang.Object r2 = r13.A01
            android.graphics.PointF r2 = (android.graphics.PointF) r2
            float r1 = r15.getX()
            float r0 = r15.getY()
            r2.set(r1, r0)
            goto L_0x0282
        L_0x0275:
            java.lang.Object r1 = r13.A01
            X.5wX r1 = (X.C116185wX) r1
            java.util.List r0 = X.C42011xT.A0I
            X.5bq r0 = r1.A03
            if (r0 == 0) goto L_0x0282
            r0.CPc()
        L_0x0282:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90334du.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C90334du(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C90334du(Context context, AnonymousClass3uE r3) {
        this.A00 = 15;
        this.A01 = AnonymousClass1DF.A01(new AnonymousClass5NG(context, r3));
    }
}
