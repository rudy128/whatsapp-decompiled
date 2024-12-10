package com.whatsapp.status.playback;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4JZ;
import X.AnonymousClass689;
import X.AnonymousClass736;
import X.AnonymousClass793;
import X.AnonymousClass7FO;
import X.AnonymousClass7RH;
import X.BDO;
import X.C000200d;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C114955sg;
import X.C1423279a;
import X.C17880vN;
import X.C18070vi;
import X.C18180vt;
import X.C19620yd;
import X.C200410p;
import X.C222219b;
import X.C24681Lg;
import X.C31131f4;
import X.C32741hg;
import X.C33001i6;
import X.C72483Me;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Set;

public final class StatusReplyActivity extends MessageReplyActivity {
    public C33001i6 A00;
    public C24681Lg A01;
    public C32741hg A02;
    public boolean A03;
    public final Runnable A04;
    public final Set A05;
    public final Rect A06;
    public final ViewTreeObserver.OnGlobalLayoutListener A07;
    public final AnonymousClass7FO A08;

    public int A31() {
        return 78318969;
    }

    public boolean A4X() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0r(com.whatsapp.status.playback.StatusReplyActivity r5) {
        /*
            android.view.View r0 = r5.A04
            android.graphics.Rect r1 = r5.A06
            r0.getWindowVisibleDisplayFrame(r1)
            int[] r2 = X.C108945cZ.A1W()
            android.view.View r0 = r5.A04
            r0.getLocationOnScreen(r2)
            int r1 = r1.bottom
            android.view.View r0 = r5.A02
            int r0 = r0.getMeasuredHeight()
            int r1 = r1 - r0
            android.view.View r0 = r5.A04
            boolean r0 = X.AnonymousClass1L4.A00(r0)
            if (r0 != 0) goto L_0x007b
            X.5z4 r0 = r5.A0b
            if (r0 == 0) goto L_0x007b
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x007b
            X.5z4 r0 = r5.A0b
        L_0x002d:
            int r0 = r0.A01
        L_0x002f:
            int r1 = r1 - r0
            r0 = 1
            r0 = r2[r0]
            int r1 = r1 - r0
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Essential Products"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r0 = "PH-1"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x005d
            android.content.res.Resources r4 = r5.getResources()
            java.lang.String r3 = "dimen"
            java.lang.String r2 = "android"
            java.lang.String r0 = "status_bar_height"
            int r0 = r4.getIdentifier(r0, r3, r2)
            if (r0 <= 0) goto L_0x005d
            int r0 = X.AnonymousClass3MZ.A01(r5, r0)
            int r1 = r1 - r0
        L_0x005d:
            android.view.View r0 = r5.A02
            int r0 = r0.getTop()
            int r1 = r1 - r0
            android.view.View r0 = r5.A02
            X.AnonymousClass1HF.A0a(r0, r1)
            X.1bI r0 = r5.A10
            int r0 = r0.A01()
            if (r0 != 0) goto L_0x007a
            X.1bI r0 = r5.A10
            android.view.View r0 = r0.A02()
            X.AnonymousClass1HF.A0a(r0, r1)
        L_0x007a:
            return
        L_0x007b:
            android.view.View r0 = r5.A04
            boolean r0 = X.AnonymousClass1L4.A00(r0)
            if (r0 != 0) goto L_0x0094
            X.5tO r0 = r5.A0R
            X.3d2 r0 = r0.A02
            if (r0 == 0) goto L_0x0094
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0094
            X.5tO r0 = r5.A0R
            X.3d2 r0 = r0.A02
            goto L_0x002d
        L_0x0094:
            r0 = 0
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.StatusReplyActivity.A0r(com.whatsapp.status.playback.StatusReplyActivity):void");
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r3 = A0A.A00;
            C109005cf.A0d(A0A, r3, this);
            C109005cf.A0e(A0A, r3, this, r3.A5A);
            this.A0d = (AnonymousClass736) A0A.AUc.get();
            this.A0v = AnonymousClass3MY.A0e(r3);
            this.A0E = AnonymousClass3MZ.A0R(A0A);
            this.A0g = AnonymousClass3MY.A0Z(A0A);
            this.A0Y = AnonymousClass3Ma.A0g(A0A);
            this.A0J = (BDO) A0A.A9v.get();
            C114955sg.A03(A0K, A0A, r3, AnonymousClass3MZ.A0U(A0A), this);
            this.A0q = C108965cb.A0X(A0A);
            this.A0Q = AnonymousClass3MZ.A0i(A0A);
            this.A0i = (AnonymousClass689) A0A.A5q.get();
            this.A0M = AnonymousClass10E.A4z(A0A);
            this.A0L = AnonymousClass3MZ.A0V(A0K);
            C114955sg.A0d(A0A, r3, this, AnonymousClass3MZ.A13(A0A));
            this.A0O = AnonymousClass3MZ.A0g(A0A);
            C114955sg.A0c(A0K, A0A, r3, this, A0A.A0x);
            this.A0N = AnonymousClass3MZ.A0f(A0A);
            C114955sg.A0Q(A0K, A0A, r3, AnonymousClass3Ma.A0b(A0A), this);
            this.A0o = AnonymousClass3Ma.A0r(A0A);
            this.A0T = (C31131f4) A0A.A6M.get();
            this.A1V = C000200d.A00(A0K.A66);
            C114955sg.A0V(A0K, A0A, r3, this);
            this.A16 = C000200d.A00(A0K.A4b);
            this.A0D = (AnonymousClass4JZ) A0K.A2k.get();
            this.A01 = AnonymousClass3MZ.A0o(A0A);
            this.A00 = (C33001i6) A0A.AZa.get();
            this.A02 = C108965cb.A0Z(A0A);
        }
    }

    public StatusReplyActivity(int i) {
        this.A03 = false;
        C1423279a.A00(this, 47);
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        C72483Me.A10(A33, this);
        return A33;
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }

    public void onCreate(Bundle bundle) {
        Window window = getWindow();
        window.setFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        window.setFlags(134217728, 134217728);
        window.setFlags(67108864, 67108864);
        super.onCreate(bundle);
        View view = this.A04;
        if (view != null) {
            view.setSystemUiVisibility(4);
            this.A04.getViewTreeObserver().addOnGlobalLayoutListener(this.A07);
            C24681Lg r1 = this.A01;
            if (r1 != null) {
                r1.registerObserver(this.A08);
                A39(this.A00, this.A05);
                return;
            }
            C18070vi.A11("messageObservers");
            throw null;
        }
    }

    public void onDestroy() {
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        C24681Lg r1 = this.A01;
        if (r1 != null) {
            r1.unregisterObserver(this.A08);
            View view = this.A04;
            if (!(view == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.A07);
            }
            View view2 = this.A04;
            if (view2 != null) {
                view2.removeCallbacks(this.A04);
                return;
            }
            return;
        }
        C18070vi.A11("messageObservers");
        throw null;
    }

    public StatusReplyActivity() {
        this(0);
        Integer[] numArr = new Integer[2];
        C17880vN.A1T(numArr, 8, 0);
        AnonymousClass000.A1M(numArr, 7);
        this.A05 = C200410p.A0S(numArr);
        this.A06 = AnonymousClass3MW.A07();
        this.A04 = new AnonymousClass7RH((Object) this, 25);
        this.A08 = new AnonymousClass7FO(this, 2);
        this.A07 = new AnonymousClass793(this, 19);
    }
}
