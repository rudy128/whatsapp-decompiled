package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.components.InsetsDrawingView;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity;
import java.util.Iterator;

/* renamed from: X.79z  reason: invalid class name and case insensitive filesystem */
public class C1425779z implements AnonymousClass1HE {
    public final int A00;
    public final Object A01;

    public C1425779z(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public AnonymousClass1HO BlX(View view, AnonymousClass1HO r10) {
        ViewGroup viewGroup;
        switch (this.A00) {
            case 0:
                C110745gz r2 = (C110745gz) this.A01;
                C114325qW r1 = r2.A02;
                if (r1 != null) {
                    r2.A01.A0s.remove(r1);
                }
                if (r10 == null) {
                    return r10;
                }
                C114325qW r12 = new C114325qW(r2.A00, r10);
                r2.A02 = r12;
                r12.A04(r2.getWindow());
                r2.A01.A0Z(r2.A02);
                return r10;
            case 1:
                MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) this.A01;
                C18070vi.A0d(r10, 0);
                C33321id A08 = r10.A08(7);
                C18070vi.A0X(A08);
                C33321id A082 = r10.A08(128);
                C18070vi.A0X(A082);
                C132146mH r7 = new C132146mH(A08, A082);
                mediaViewBaseFragment.A0D = r7;
                ViewGroup viewGroup2 = mediaViewBaseFragment.A03;
                if (viewGroup2 != null) {
                    C33321id r6 = r7.A01;
                    C33321id A002 = C33321id.A00(r6.A01, 0, r6.A02, 0);
                    C33321id A003 = r7.A00();
                    C33321id A004 = C33321id.A00(A003.A01, 0, A003.A02, 0);
                    C33321id A005 = C33321id.A00(0, C33321id.A02(r7.A00, r6).A03, 0, 0);
                    ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(viewGroup2);
                    A0P.leftMargin = A002.A01;
                    A0P.topMargin = A002.A03;
                    A0P.rightMargin = A002.A02;
                    A0P.bottomMargin = A002.A00;
                    viewGroup2.setLayoutParams(A0P);
                    ViewGroup viewGroup3 = mediaViewBaseFragment.A03;
                    C33321id A006 = C33321id.A00(A004.A01 + A005.A01, A004.A03 + A005.A03, A004.A02 + A005.A02, A004.A00 + A005.A00);
                    C18070vi.A0d(viewGroup3, 0);
                    viewGroup3.setPadding(A006.A01, A006.A03, A006.A02, A006.A00);
                }
                InsetsDrawingView insetsDrawingView = mediaViewBaseFragment.A07;
                if (!(insetsDrawingView == null || mediaViewBaseFragment.A0D == null)) {
                    insetsDrawingView.setColor(2131101854);
                    InsetsDrawingView insetsDrawingView2 = mediaViewBaseFragment.A07;
                    C33321id r0 = mediaViewBaseFragment.A0D.A01;
                    C33321id A007 = C33321id.A00(r0.A01, 0, r0.A02, 0);
                    C18070vi.A0d(insetsDrawingView2, 0);
                    insetsDrawingView2.setPadding(A007.A01, A007.A03, A007.A02, A007.A00);
                }
                if (mediaViewBaseFragment.A09 == null) {
                    return r10;
                }
                for (int i = 0; i < mediaViewBaseFragment.A09.getChildCount(); i++) {
                    MediaViewBaseFragment.A01(mediaViewBaseFragment.A09.getChildAt(i), mediaViewBaseFragment);
                }
                return r10;
            case 2:
                StatusPlaybackActivity statusPlaybackActivity = (StatusPlaybackActivity) this.A01;
                C18070vi.A0d(r10, 2);
                Rect rect = statusPlaybackActivity.A0g;
                rect.set(r10.A03(), r10.A05(), r10.A04(), r10.A02());
                if (statusPlaybackActivity.A0T && statusPlaybackActivity.A0S && statusPlaybackActivity.A0V && (viewGroup = statusPlaybackActivity.A04) != null) {
                    viewGroup.setTranslationY((float) rect.top);
                }
                StatusPlaybackActivity.A0V(rect, statusPlaybackActivity);
                Iterator A0u = C108965cb.A0u(statusPlaybackActivity);
                while (A0u.hasNext()) {
                    Fragment fragment = (Fragment) A0u.next();
                    if (fragment instanceof StatusPlaybackFragment) {
                        ((StatusPlaybackFragment) fragment).A2B(rect);
                    }
                }
                return r10;
            case 3:
                C18070vi.A0j(view, r10);
                View view2 = ((ConsolidatedStatusComposerActivity) this.A01).A00;
                if (view2 == null) {
                    C18070vi.A11("rootView");
                    throw null;
                }
                C43531zx.A01(view2);
                C33321id A07 = r10.A07(7);
                C18070vi.A0X(A07);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = A07.A03;
                    marginLayoutParams.leftMargin = A07.A01;
                    marginLayoutParams.rightMargin = A07.A02;
                    marginLayoutParams.bottomMargin = A07.A00;
                    view.setLayoutParams(marginLayoutParams);
                    return r10;
                }
                throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            default:
                C109955eT r13 = (C109955eT) this.A01;
                C109955eT.A00(r13.A03, r13);
                return AnonymousClass1HO.A01;
        }
    }
}
