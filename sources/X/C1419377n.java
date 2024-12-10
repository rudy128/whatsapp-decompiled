package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.ImageComposerFragment$updateCrop$1;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.77n  reason: invalid class name and case insensitive filesystem */
public final class C1419377n implements GestureDetector.OnDoubleTapListener {
    public final /* synthetic */ ImageComposerFragment A00;
    public final /* synthetic */ MediaComposerFragment A01;

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C18070vi.A0d(motionEvent, 0);
        ImageComposerFragment imageComposerFragment = this.A00;
        boolean onDoubleTap = ((ImagePreviewContentLayout) AnonymousClass3MX.A14(imageComposerFragment.A0G)).A02.onDoubleTap(motionEvent);
        if (onDoubleTap) {
            ImageComposerFragment.A0B(imageComposerFragment, false, true);
        }
        return onDoubleTap;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public C1419377n(ImageComposerFragment imageComposerFragment) {
        this.A00 = imageComposerFragment;
        this.A01 = imageComposerFragment;
    }

    public void A00() {
        Bitmap bitmap;
        Bitmap bitmap2;
        C160888Ai A29;
        AnonymousClass1FL A1B;
        C160888Ai A292;
        int i;
        ImageComposerFragment imageComposerFragment = this.A00;
        Uri uri = imageComposerFragment.A01;
        if (!(uri == null || (A292 = imageComposerFragment.A29()) == null)) {
            AnonymousClass740 r0 = imageComposerFragment.A05;
            if (r0 != null) {
                i = r0.A01;
            } else {
                i = 0;
            }
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A292;
            mediaComposerActivity.A1q.A02(uri).A0J(i);
            if (mediaComposerActivity.A0X.A0G()) {
                MediaComposerActivity.A0v(uri, mediaComposerActivity);
                AnonymousClass7JN r02 = mediaComposerActivity.A0a;
                if (r02 != null) {
                    r02.A0B.A09.notifyDataSetChanged();
                }
            }
        }
        if (imageComposerFragment.A1b()) {
            PhotoView photoView = imageComposerFragment.A06;
            Bitmap bitmap3 = null;
            if (!(photoView == null || photoView.getDrawable() != null || (A1B = imageComposerFragment.A1B()) == null)) {
                A1B.A2Z();
            }
            AnonymousClass740 r03 = imageComposerFragment.A05;
            if (r03 != null) {
                bitmap = r03.A05;
            } else {
                bitmap = null;
            }
            ImageComposerFragment.A06(bitmap, imageComposerFragment);
            ImageView imageView = imageComposerFragment.A03;
            if (imageView != null) {
                AnonymousClass740 r04 = imageComposerFragment.A05;
                if (r04 != null) {
                    bitmap3 = r04.A04;
                }
                imageView.setImageBitmap(bitmap3);
            }
            AnonymousClass7JF r05 = imageComposerFragment.A0J;
            if (r05 != null) {
                r05.A0B();
            }
            if (imageComposerFragment.A0C) {
                imageComposerFragment.A0C = false;
                AnonymousClass740 r06 = imageComposerFragment.A05;
                if (r06 != null) {
                    bitmap2 = r06.A05;
                } else {
                    bitmap2 = null;
                }
                Uri uri2 = imageComposerFragment.A01;
                if (imageComposerFragment.A0J != null && bitmap2 != null && uri2 != null && (A29 = imageComposerFragment.A29()) != null) {
                    Rect A05 = AnonymousClass73D.A00(uri2, A29).A05();
                    RectF A04 = C108965cb.A04((float) bitmap2.getWidth(), (float) bitmap2.getHeight());
                    if (A05 != null) {
                        if (C18020vd.A05(C18040vf.A02, imageComposerFragment.A28(), 8041)) {
                            C37581pm A0H = AnonymousClass3MZ.A0H(imageComposerFragment);
                            C18600wl r1 = imageComposerFragment.A09;
                            if (r1 != null) {
                                AnonymousClass3MW.A1X(r1, new ImageComposerFragment$updateCrop$1(A05, A04, imageComposerFragment, (C30391dr) null), A0H);
                            } else {
                                C18070vi.A11("ioDispatcher");
                                throw null;
                            }
                        } else {
                            ImageComposerFragment.A07(A05, A04, imageComposerFragment, (Integer) null, 0, -1);
                        }
                    }
                }
            }
        }
    }
}
