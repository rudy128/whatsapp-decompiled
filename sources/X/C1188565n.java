package X;

import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.65n  reason: invalid class name and case insensitive filesystem */
public class C1188565n extends VerticalSwipeDismissBehavior {
    public final /* synthetic */ MediaViewBaseFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1188565n(Context context, MediaViewBaseFragment mediaViewBaseFragment) {
        super(context);
        this.A00 = mediaViewBaseFragment;
    }

    public void A0H(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        boolean z;
        MediaViewBaseFragment mediaViewBaseFragment = this.A00;
        if (mediaViewBaseFragment instanceof MediaViewFragment) {
            z = ((MediaViewFragment) mediaViewBaseFragment).A1e;
        } else {
            if (mediaViewBaseFragment instanceof LinkedAccountMediaViewFragment) {
                z = ((LinkedAccountMediaViewFragment) mediaViewBaseFragment).A0I;
            }
            super.A0H(view, view2, coordinatorLayout, iArr, i, i2, i3);
        }
        if (z) {
            return;
        }
        super.A0H(view, view2, coordinatorLayout, iArr, i, i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r0 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(android.view.MotionEvent r3, android.view.View r4, androidx.coordinatorlayout.widget.CoordinatorLayout r5) {
        /*
            r2 = this;
            int r1 = r3.getPointerCount()
            r0 = 1
            if (r1 > r0) goto L_0x001f
            com.whatsapp.mediaview.MediaViewBaseFragment r1 = r2.A00
            X.65h r0 = r1.A09
            int r0 = r0.getCurrentItem()
            java.lang.Object r0 = r1.A2B(r0)
            com.whatsapp.mediaview.PhotoView r0 = r1.A28(r0)
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x0028
        L_0x001f:
            X.Cwc r0 = r2.A03
            if (r0 == 0) goto L_0x0026
            r0.A0B()
        L_0x0026:
            r0 = 0
            return r0
        L_0x0028:
            boolean r0 = r1 instanceof com.whatsapp.mediaview.MediaViewFragment
            if (r0 == 0) goto L_0x0033
            com.whatsapp.mediaview.MediaViewFragment r1 = (com.whatsapp.mediaview.MediaViewFragment) r1
            boolean r0 = r1.A1e
        L_0x0030:
            if (r0 == 0) goto L_0x003c
            goto L_0x001f
        L_0x0033:
            boolean r0 = r1 instanceof com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment
            if (r0 == 0) goto L_0x003c
            com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment r1 = (com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment) r1
            boolean r0 = r1.A0I
            goto L_0x0030
        L_0x003c:
            boolean r0 = super.A0K(r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1188565n.A0K(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }
}
