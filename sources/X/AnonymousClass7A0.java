package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView;
import java.util.Iterator;

/* renamed from: X.7A0  reason: invalid class name */
public class AnonymousClass7A0 implements AnonymousClass1HE {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7A0(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final AnonymousClass1HO BlX(View view, AnonymousClass1HO r11) {
        int A04;
        int i;
        int i2 = this.A00;
        Object obj = this.A01;
        if (i2 != 0) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) obj;
            View view2 = (View) this.A02;
            Cn4 A09 = r11.A09();
            int i3 = r11.A07(7).A03;
            if (A09 != null) {
                i3 = Math.max(i3, A09.A04());
            }
            Rect rect = mediaComposerActivity.A1n;
            int i4 = r11.A07(7).A01;
            int i5 = mediaComposerActivity.A02;
            int i6 = 0;
            if (i3 > i5) {
                i6 = i3 - i5;
            }
            rect.set(i4, i6, r11.A07(7).A02, 0);
            Iterator A0u = C108965cb.A0u(mediaComposerActivity);
            while (A0u.hasNext()) {
                Fragment fragment = (Fragment) A0u.next();
                if (fragment instanceof MediaComposerFragment) {
                    ((MediaComposerFragment) fragment).A2N(rect);
                }
            }
            ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(view2);
            A0B.bottomMargin = r11.A07(7).A00;
            view2.setLayoutParams(A0B);
            if (i3 > mediaComposerActivity.A02) {
                i = i3;
            } else {
                i = AnonymousClass3MW.A0B(mediaComposerActivity.A05).topMargin;
            }
            mediaComposerActivity.A03.setPadding(rect.left, i, rect.right, rect.bottom);
            if (C72453Mb.A1a(mediaComposerActivity.A0X.A0E)) {
                mediaComposerActivity.A05.setPadding(rect.left, i, rect.right, rect.bottom);
            }
            C136986uj A0U = C108955ca.A0U(mediaComposerActivity);
            int i7 = rect.left;
            int i8 = mediaComposerActivity.A02;
            if (i8 != -1) {
                i8 = Math.max(i3, i8);
            }
            A0U.A03 = new Rect(i7, i8, rect.right, rect.bottom);
            if (!C72453Mb.A1a(mediaComposerActivity.A0X.A0E)) {
                AnonymousClass7JN r1 = mediaComposerActivity.A0a;
                int i9 = -rect.left;
                int i10 = -rect.right;
                FilterSwipeView filterSwipeView = r1.A08.A01;
                filterSwipeView.setPadding(i9, filterSwipeView.getPaddingTop(), i10, filterSwipeView.getPaddingBottom());
            }
        } else {
            CameraActivity cameraActivity = (CameraActivity) obj;
            View view3 = (View) this.A02;
            C18070vi.A0d(r11, 3);
            Cn4 A092 = r11.A09();
            int i11 = r11.A07(7).A03;
            if (A092 != null && i11 < (A04 = A092.A04())) {
                i11 = A04;
            }
            Rect rect2 = cameraActivity.A0L;
            rect2.set(r11.A07(7).A01, i11, r11.A07(7).A02, 0);
            cameraActivity.BO9().A05 = rect2;
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = r11.A07(7).A00;
            view3.setLayoutParams(marginLayoutParams);
        }
        return AnonymousClass1HO.A01;
    }
}
