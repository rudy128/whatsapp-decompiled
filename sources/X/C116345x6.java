package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.mediacomposer.GifComposerFragment;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.PtvComposerFragment;
import com.whatsapp.mediacomposer.StickerComposerFragment;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;
import com.whatsapp.mediaview.PhotoView;
import java.util.Iterator;

/* renamed from: X.5x6  reason: invalid class name and case insensitive filesystem */
public class C116345x6 extends C45702Bd {
    public final /* synthetic */ MediaComposerActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116345x6(AnonymousClass1GP r1, MediaComposerActivity mediaComposerActivity) {
        super(r1);
        this.A00 = mediaComposerActivity;
    }

    public static int A00(C116345x6 r1, int i) {
        MediaComposerActivity mediaComposerActivity = r1.A00;
        if (!AnonymousClass3MY.A1b(mediaComposerActivity.A0K)) {
            return (AnonymousClass7JS.A01(mediaComposerActivity) - i) - 1;
        }
        return i;
    }

    public Parcelable A0B() {
        boolean A05 = C18020vd.A05(C18040vf.A02, this.A00.A0E, 10748);
        Parcelable A0B = super.A0B();
        Bundle bundle = A0B;
        if (A05) {
            Bundle bundle2 = (Bundle) A0B;
            bundle = bundle2;
            if (bundle2 != null) {
                bundle2.putParcelableArray("states", (Parcelable[]) null);
                bundle = bundle2;
            }
        }
        return bundle;
    }

    public int A0E() {
        return AnonymousClass7JS.A01(this.A00);
    }

    public /* bridge */ /* synthetic */ int A0I(Object obj) {
        int indexOf = AnonymousClass7JS.A03(this.A00).indexOf(((MediaComposerFragment) ((Fragment) obj)).A01);
        if (indexOf < 0) {
            return -2;
        }
        return A00(this, indexOf);
    }

    public long A0M(int i) {
        MediaComposerActivity mediaComposerActivity = this.A00;
        Object obj = mediaComposerActivity.A1w.get(AnonymousClass7JS.A03(mediaComposerActivity).get(A00(this, i)));
        C17960vV.A07(obj);
        return C17880vN.A05(obj);
    }

    public Fragment A0N(int i) {
        Bundle bundle;
        Fragment fragment;
        MediaComposerActivity mediaComposerActivity = this.A00;
        Uri uri = (Uri) AnonymousClass7JS.A03(mediaComposerActivity).get(A00(this, i));
        int A002 = AnonymousClass72S.A00(mediaComposerActivity.A1q.A02(uri), mediaComposerActivity.A0T);
        if (A002 != 1) {
            if (A002 == 3) {
                AnonymousClass7JS r1 = mediaComposerActivity.A0X;
                if (r1.A0I) {
                    boolean z = r1.A0G;
                    Bundle A0J = C72463Mc.A0J(uri);
                    A0J.putParcelable("uri", uri);
                    A0J.putBoolean("is_ptv", true);
                    A0J.putBoolean("captured_with_old_camera_controller", z);
                    PtvComposerFragment ptvComposerFragment = new PtvComposerFragment();
                    ptvComposerFragment.A1R(A0J);
                    return ptvComposerFragment;
                }
                Bundle A0J2 = C72463Mc.A0J(uri);
                A0J2.putParcelable("uri", uri);
                VideoComposerFragment videoComposerFragment = new VideoComposerFragment();
                videoComposerFragment.A1R(A0J2);
                return videoComposerFragment;
            } else if (A002 != 13) {
                return null;
            } else {
                bundle = C72463Mc.A0J(uri);
                bundle.putParcelable("uri", uri);
                fragment = new GifComposerFragment();
            }
        } else if (C138766xe.A00(mediaComposerActivity.A0h)) {
            int A003 = A00(this, i);
            bundle = C72463Mc.A0J(uri);
            bundle.putParcelable("uri", uri);
            bundle.putInt("position", A003);
            fragment = new StickerComposerFragment();
        } else {
            bundle = C72463Mc.A0J(uri);
            bundle.putParcelable("uri", uri);
            fragment = new ImageComposerFragment();
        }
        fragment.A1R(bundle);
        return fragment;
    }

    public void A0O(ViewGroup viewGroup, Fragment fragment, int i) {
        PhotoView photoView;
        if (fragment instanceof ImageComposerFragment) {
            ((ImagePreviewContentLayout) AnonymousClass3MX.A14(((ImageComposerFragment) fragment).A0G)).A01();
        } else {
            View view = fragment.A0B;
            if (!(view == null || (photoView = (PhotoView) view.findViewById(2131433800)) == null)) {
                photoView.A09();
            }
        }
        super.A0O(viewGroup, fragment, i);
    }

    public void A0D(ViewGroup viewGroup) {
        Uri uri;
        super.A0D(viewGroup);
        MediaComposerActivity mediaComposerActivity = this.A00;
        if (mediaComposerActivity.A08 == null) {
            C142697Al r1 = new C142697Al(mediaComposerActivity);
            mediaComposerActivity.A08 = r1;
            mediaComposerActivity.A0S.A0C = r1;
        }
        if (mediaComposerActivity.A0X.A07() < 0 && !AnonymousClass7JS.A03(mediaComposerActivity).isEmpty()) {
            MediaComposerActivity.A18(mediaComposerActivity, mediaComposerActivity.A4b());
        }
        Iterator A0u = C108965cb.A0u(mediaComposerActivity);
        while (A0u.hasNext()) {
            Fragment fragment = (Fragment) A0u.next();
            if (fragment instanceof MediaComposerFragment) {
                MediaComposerFragment mediaComposerFragment = (MediaComposerFragment) fragment;
                mediaComposerFragment.A2N(mediaComposerActivity.A1n);
                if (mediaComposerActivity.A1P && (uri = mediaComposerFragment.A01) != null && uri.equals(mediaComposerActivity.BN2())) {
                    mediaComposerFragment.A2E();
                    mediaComposerFragment.A2D();
                }
            }
        }
    }
}
