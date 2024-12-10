package X;

import android.widget.AbsListView;
import com.whatsapp.HomeActivity;
import com.whatsapp.collections.observablelistview.ObservableListView;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.2vK  reason: invalid class name and case insensitive filesystem */
public class C64782vK implements AbsListView.OnScrollListener {
    public final int A00;
    public final Object A01;

    public C64782vK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if (r5 <= 1.0f) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.widget.AbsListView r9) {
        /*
            r8 = this;
            java.lang.Object r4 = r8.A01
            X.4aN r4 = (X.AnonymousClass4aN) r4
            int r0 = X.AnonymousClass4aN.A0X
            android.view.ViewGroup r3 = r4.A0E
            if (r3 == 0) goto L_0x005f
            android.content.res.Resources r0 = X.AnonymousClass000.A0Y(r9)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = r0.density
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r1 = r9.getFirstVisiblePosition()
            r0 = 0
            android.view.View r0 = r9.getChildAt(r0)
            r7 = 0
            if (r0 != 0) goto L_0x0060
            r0 = 0
        L_0x0028:
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L_0x0048
            float r5 = -r0
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r9)
            r0 = 2131166635(0x7f0705ab, float:1.794752E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            float r5 = r5 / r0
            float r5 = java.lang.Math.min(r5, r6)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0049
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0049
        L_0x0048:
            float r2 = r2 * r5
        L_0x0049:
            int r1 = r4.A08
            r0 = 1095761920(0x41500000, float:13.0)
            float r5 = r5 * r0
            int r0 = (int) r5
            int r1 = X.AnonymousClass1Z2.A06(r1, r0)
            int r0 = r4.A06
            int r0 = X.AnonymousClass1Z2.A05(r1, r0)
            r3.setBackgroundColor(r0)
            X.AnonymousClass1HF.A0X(r3, r2)
        L_0x005f:
            return
        L_0x0060:
            int r0 = r0.getTop()
            float r0 = (float) r0
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64782vK.A00(android.widget.AbsListView):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0118, code lost:
        if (r4 == 0) goto L_0x0123;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x00d6;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00bf;
                case 5: goto L_0x0032;
                case 6: goto L_0x0005;
                case 7: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r3 = r9.A01
            X.3d3 r3 = (X.C74873d3) r3
            com.whatsapp.emoji.EmojiPopupFooter r0 = r3.A07
            int r2 = r0.getHeight()
            int r0 = r3.A01
            if (r0 < r11) goto L_0x0018
            r2 = -1
            if (r0 <= r11) goto L_0x0018
            r2 = 0
        L_0x0018:
            r3.A01 = r11
            if (r2 < 0) goto L_0x0005
            com.whatsapp.emoji.EmojiPopupFooter r1 = r3.A07
            int r0 = r1.A00
            if (r2 == r0) goto L_0x0005
            android.view.animation.Animation r1 = r1.getAnimation()
            boolean r0 = r1 instanceof X.AnonymousClass3OS
            if (r0 == 0) goto L_0x00de
            r0 = r1
            X.3OS r0 = (X.AnonymousClass3OS) r0
            int r0 = r0.A00
            if (r0 != r2) goto L_0x00de
            return
        L_0x0032:
            java.lang.Object r2 = r9.A01
            com.whatsapp.collections.observablelistview.ObservableListView r2 = (com.whatsapp.collections.observablelistview.ObservableListView) r2
            android.widget.AbsListView$OnScrollListener r0 = r2.A06
            if (r0 == 0) goto L_0x003d
            r0.onScroll(r10, r11, r12, r13)
        L_0x003d:
            X.1Gs r0 = r2.A07
            if (r0 == 0) goto L_0x0005
            int r0 = r2.getChildCount()
            if (r0 <= 0) goto L_0x0005
            int r4 = r2.getFirstVisiblePosition()
            int r6 = r2.getFirstVisiblePosition()
            r3 = 0
            r5 = 0
        L_0x0051:
            int r0 = r2.getLastVisiblePosition()
            if (r6 > r0) goto L_0x0081
            android.util.SparseIntArray r0 = r2.A05
            int r0 = r0.indexOfKey(r6)
            if (r0 < 0) goto L_0x006f
            android.view.View r0 = r2.getChildAt(r5)
            int r1 = r0.getHeight()
            android.util.SparseIntArray r0 = r2.A05
            int r0 = r0.get(r6)
            if (r1 == r0) goto L_0x007c
        L_0x006f:
            android.util.SparseIntArray r1 = r2.A05
            android.view.View r0 = r2.getChildAt(r5)
            int r0 = r0.getHeight()
            r1.put(r6, r0)
        L_0x007c:
            int r6 = r6 + 1
            int r5 = r5 + 1
            goto L_0x0051
        L_0x0081:
            android.view.View r8 = r2.getChildAt(r3)
            if (r8 == 0) goto L_0x0005
            int r6 = r2.A01
            r5 = 1
            if (r6 >= r4) goto L_0x00ee
            int r0 = r4 - r6
            r6 = 0
            if (r0 == r5) goto L_0x011b
            int r1 = r4 + -1
        L_0x0093:
            int r0 = r2.A01
            if (r1 <= r0) goto L_0x011b
            android.util.SparseIntArray r0 = r2.A05
            int r0 = r0.indexOfKey(r1)
            if (r0 <= 0) goto L_0x00a9
            android.util.SparseIntArray r0 = r2.A05
            int r0 = r0.get(r1)
        L_0x00a5:
            int r6 = r6 + r0
            int r1 = r1 + -1
            goto L_0x0093
        L_0x00a9:
            int r0 = r8.getHeight()
            goto L_0x00a5
        L_0x00ae:
            r9.A00(r10)
            java.lang.Object r1 = r9.A01
            X.4aN r1 = (X.AnonymousClass4aN) r1
            int r0 = X.AnonymousClass4aN.A0X
            android.widget.AbsListView$OnScrollListener r0 = r1.A0G
            if (r0 == 0) goto L_0x0005
            r0.onScroll(r10, r11, r12, r13)
            return
        L_0x00bf:
            java.lang.Object r0 = r9.A01
            X.7R9 r0 = (X.AnonymousClass7R9) r0
            java.lang.Object r0 = r0.A01
            goto L_0x00c8
        L_0x00c6:
            java.lang.Object r0 = r9.A01
        L_0x00c8:
            X.3oH r0 = (X.C76783oH) r0
            r0.A0C()
            return
        L_0x00ce:
            java.lang.Object r0 = r9.A01
            com.whatsapp.chatinfo.ListChatInfoActivity r0 = (com.whatsapp.chatinfo.ListChatInfoActivity) r0
            com.whatsapp.chatinfo.ListChatInfoActivity.A0z(r0)
            return
        L_0x00d6:
            java.lang.Object r0 = r9.A01
            com.whatsapp.calling.callhistory.CallLogActivity r0 = (com.whatsapp.calling.callhistory.CallLogActivity) r0
            com.whatsapp.calling.callhistory.CallLogActivity.A0V(r0)
            return
        L_0x00de:
            if (r1 == 0) goto L_0x00e3
            r1.cancel()
        L_0x00e3:
            com.whatsapp.emoji.EmojiPopupFooter r1 = r3.A07
            X.3OS r0 = new X.3OS
            r0.<init>(r3, r2)
            r1.startAnimation(r0)
            return
        L_0x00ee:
            if (r4 >= r6) goto L_0x0118
            int r0 = r6 - r4
            r1 = 0
            if (r0 == r5) goto L_0x010f
            int r6 = r6 - r5
        L_0x00f6:
            if (r6 <= r4) goto L_0x010f
            android.util.SparseIntArray r0 = r2.A05
            int r0 = r0.indexOfKey(r6)
            if (r0 <= 0) goto L_0x010a
            android.util.SparseIntArray r0 = r2.A05
            int r0 = r0.get(r6)
        L_0x0106:
            int r1 = r1 + r0
            int r6 = r6 + -1
            goto L_0x00f6
        L_0x010a:
            int r0 = r8.getHeight()
            goto L_0x0106
        L_0x010f:
            int r5 = r2.A03
            int r0 = r8.getHeight()
            int r0 = r0 + r1
            int r5 = r5 - r0
            goto L_0x0121
        L_0x0118:
            if (r4 != 0) goto L_0x0129
            goto L_0x0123
        L_0x011b:
            int r5 = r2.A03
            int r0 = r2.A00
            int r0 = r0 + r6
            int r5 = r5 + r0
        L_0x0121:
            r2.A03 = r5
        L_0x0123:
            int r0 = r8.getHeight()
            r2.A00 = r0
        L_0x0129:
            int r0 = r2.A00
            if (r0 >= 0) goto L_0x012f
            r2.A00 = r3
        L_0x012f:
            int r7 = r2.A03
            int r0 = r8.getTop()
            int r7 = r7 - r0
            r2.A04 = r7
            r2.A01 = r4
            X.1Gs r4 = r2.A07
            boolean r8 = r2.A0C
            boolean r6 = r2.A0B
            X.1Gt r4 = (X.C23561Gt) r4
            com.whatsapp.HomeActivity r5 = r4.A04
            androidx.fragment.app.Fragment r0 = com.whatsapp.HomeActivity.A0r(r5)
            if (r0 == 0) goto L_0x01ad
            android.view.View r1 = r0.A0B
            boolean r0 = r1 instanceof com.whatsapp.collections.observablelistview.ObservableListView
            if (r0 == 0) goto L_0x01ad
            r0 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r0 = r1.findViewById(r0)
            if (r2 != r0) goto L_0x01ad
            boolean r0 = r5.A4v()
            r1 = 1
            if (r0 == 0) goto L_0x01b8
            android.view.View r1 = r5.getCurrentFocus()
            X.11C r0 = r5.A08
            android.view.inputmethod.InputMethodManager r4 = r0.A0N()
            if (r8 != 0) goto L_0x01ad
            if (r6 == 0) goto L_0x01ad
            if (r1 == 0) goto L_0x017a
            if (r4 == 0) goto L_0x017a
            android.os.IBinder r1 = r1.getWindowToken()
            r0 = 2
            r4.hideSoftInputFromWindow(r1, r0)
        L_0x017a:
            boolean r0 = r5.A4u()
            if (r0 == 0) goto L_0x01ad
            X.1Gb r0 = r5.A03
            X.1GO r0 = r0.A00
            X.1GP r1 = r0.A03
            java.lang.String r0 = "search_fragment"
            androidx.fragment.app.Fragment r0 = r1.A0Q(r0)
            if (r0 == 0) goto L_0x01ad
            X.00H r0 = r5.A1b
            java.lang.Object r0 = r0.get()
            X.1rX r0 = (X.C38581rX) r0
            boolean r0 = r0.A02()
            r0 = r0 ^ 1
            r5.A4s(r0)
            X.00H r0 = r5.A1f
            java.lang.Object r4 = r0.get()
            X.1do r4 = (X.C30361do) r4
            r1 = 6
            r0 = 0
            r4.A02(r0, r1)
        L_0x01ad:
            boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x01b3
            r2.A0C = r3
        L_0x01b3:
            int r0 = r2.A04
            r2.A02 = r0
            return
        L_0x01b8:
            androidx.appcompat.widget.Toolbar r0 = r5.A0G
            int r6 = r0.getHeight()
            int r0 = r4.A02
            if (r0 < r7) goto L_0x01c3
            r1 = 0
        L_0x01c3:
            r4.A02 = r7
            if (r8 != 0) goto L_0x01cb
            boolean r0 = r4.A03
            if (r0 == r1) goto L_0x01e9
        L_0x01cb:
            r4.A03 = r1
            int r0 = r4.A01
            int r0 = r0 + r7
            r4.A00 = r0
            int r1 = r5.A00
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x01e9
            android.view.View r0 = r5.A07
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.view.View r1 = r5.A07
            int r0 = r4.A01
            float r0 = (float) r0
            r1.setTranslationY(r0)
        L_0x01e9:
            int r1 = r5.A00
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x01ad
            int r0 = r4.A00
            int r7 = r7 - r0
            int r0 = -r7
            int r1 = -r6
            int r0 = java.lang.Math.min(r0, r3)
            int r1 = java.lang.Math.max(r1, r0)
            int r0 = r4.A01
            if (r1 == r0) goto L_0x01ad
            r4.A01 = r1
            android.view.View r0 = r5.A07
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
            android.view.View r1 = r5.A07
            int r0 = r4.A01
            float r0 = (float) r0
            r1.setTranslationY(r0)
            goto L_0x01ad
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64782vK.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        Object obj;
        switch (this.A00) {
            case 0:
                A00(absListView);
                int i2 = AnonymousClass4aN.A0X;
                AbsListView.OnScrollListener onScrollListener = ((AnonymousClass4aN) this.A01).A0G;
                if (onScrollListener != null) {
                    onScrollListener.onScrollStateChanged(absListView, i);
                    return;
                }
                return;
            case 3:
                obj = this.A01;
                break;
            case 4:
                obj = ((AnonymousClass7R9) this.A01).A01;
                break;
            case 5:
                ObservableListView observableListView = (ObservableListView) this.A01;
                AbsListView.OnScrollListener onScrollListener2 = observableListView.A06;
                if (onScrollListener2 != null) {
                    onScrollListener2.onScrollStateChanged(absListView, i);
                }
                C23551Gs r3 = observableListView.A07;
                if (r3 != null && i == 0) {
                    int i3 = observableListView.A04;
                    C23561Gt r32 = (C23561Gt) r3;
                    int i4 = -r32.A01;
                    HomeActivity homeActivity = r32.A04;
                    if (i4 <= homeActivity.A0G.getHeight() / 2 || i3 < homeActivity.A0G.getHeight()) {
                        homeActivity.A4p();
                        return;
                    }
                    int height = homeActivity.A0G.getHeight();
                    if (homeActivity.A00 == 200) {
                        int i5 = -height;
                        float f = (float) i5;
                        if (homeActivity.A07.getTranslationY() != f) {
                            homeActivity.A07.animate().cancel();
                            homeActivity.A07.animate().translationY(f).setDuration(250).start();
                            homeActivity.A2M.A01 = i5;
                        }
                    }
                    if (homeActivity.A00 == 200) {
                        homeActivity.A4t(false);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                if (i == 0) {
                    C36711oL r0 = ((InviteNonWhatsAppContactPickerActivity) this.A01).A0E;
                    if (r0 != null) {
                        r0.A01();
                        return;
                    }
                } else if (i == 1) {
                    InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = (InviteNonWhatsAppContactPickerActivity) this.A01;
                    C36711oL r2 = inviteNonWhatsAppContactPickerActivity.A0E;
                    if (r2 != null) {
                        r2.A03(inviteNonWhatsAppContactPickerActivity.getWindow(), 12);
                        return;
                    }
                } else {
                    return;
                }
                C18070vi.A11("scrollPerfLoggerManager");
                throw null;
            default:
                return;
        }
        ((C76783oH) obj).A0C();
    }
}
