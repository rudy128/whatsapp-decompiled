package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.MediaViewCurrentMessageViewModel;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.reactions.ReactionsTrayViewModel;

/* renamed from: X.78q  reason: invalid class name and case insensitive filesystem */
public abstract class C1422278q implements View.OnTouchListener {
    public long A00;
    public final Matrix A01 = C108945cZ.A0J();
    public final AnonymousClass11P A02;
    public final C18030ve A03;
    public final PhotoView A04;
    public final AnonymousClass21V A05;

    public boolean onTouch(View view, MotionEvent motionEvent) {
        MediaViewFragment mediaViewFragment;
        View view2;
        C135816so r1;
        ReactionsTrayViewModel reactionsTrayViewModel;
        MediaViewFragment mediaViewFragment2;
        PhotoView photoView;
        Object obj;
        C18070vi.A0d(motionEvent, 1);
        if (motionEvent.getActionMasked() == 0) {
            this.A00 = System.currentTimeMillis();
        } else if (motionEvent.getActionMasked() == 1) {
            PhotoView photoView2 = this.A04;
            Bitmap photo = photoView2.getPhoto();
            if (photo != null) {
                Matrix imageMatrix = photoView2.getImageMatrix();
                Matrix matrix = this.A01;
                imageMatrix.invert(matrix);
                float[] fArr = {motionEvent.getRawX() - ((float) photoView2.getLeft()), motionEvent.getRawY() - ((float) photoView2.getTop())};
                float[] fArr2 = {(float) photo.getWidth(), (float) photo.getHeight()};
                matrix.mapPoints(fArr);
                InteractiveAnnotation A002 = C1406872o.A00(this.A03, this.A05, fArr, fArr2, false);
                if (A002 != null) {
                    if (this instanceof AnonymousClass6AE) {
                        AnonymousClass6AE r2 = (AnonymousClass6AE) this;
                        int i = r2.A00;
                        mediaViewFragment2 = (MediaViewFragment) r2.A01;
                        if (i != 0) {
                            obj = r2.A03;
                        } else {
                            obj = r2.A02;
                        }
                        photoView = (PhotoView) obj;
                    } else {
                        AnonymousClass6AD r22 = (AnonymousClass6AD) this;
                        mediaViewFragment2 = r22.A01;
                        photoView = r22.A02;
                    }
                    MediaViewFragment.A0A(A002, mediaViewFragment2, photoView);
                    return true;
                }
            }
            long currentTimeMillis = System.currentTimeMillis() - this.A00;
            if (currentTimeMillis < 200) {
                if (this instanceof AnonymousClass6AE) {
                    AnonymousClass6AE r3 = (AnonymousClass6AE) this;
                    if (r3.A00 != 0) {
                        C121996Mj r12 = (C121996Mj) r3.A02;
                        if (C108995ce.A1U(r12.A0F)) {
                            r12.A04();
                        } else {
                            r12.A05();
                            r12.A0A(3000);
                        }
                        reactionsTrayViewModel = ((MediaViewFragment) r3.A01).A13;
                    } else {
                        MediaViewBaseFragment mediaViewBaseFragment = (MediaViewBaseFragment) r3.A01;
                        mediaViewBaseFragment.A2L(!mediaViewBaseFragment.A0I, true);
                        return true;
                    }
                } else {
                    AnonymousClass6AD r32 = (AnonymousClass6AD) this;
                    MediaViewFragment mediaViewFragment3 = r32.A01;
                    if (mediaViewFragment3.A1n) {
                        C121996Mj r13 = r32.A03;
                        r13.A09 = true;
                        r13.setPlayControlVisibility(0);
                        mediaViewFragment3.A1n = false;
                    }
                    C121996Mj r14 = r32.A03;
                    if (C108995ce.A1U(r14.A0F)) {
                        r14.A04();
                    } else {
                        r14.A05();
                        r14.A0A(3000);
                    }
                    reactionsTrayViewModel = mediaViewFragment3.A13;
                }
                if (reactionsTrayViewModel != null) {
                    reactionsTrayViewModel.A0T(0);
                    return true;
                }
            } else if (currentTimeMillis > ((long) ViewConfiguration.getLongPressTimeout())) {
                if (this instanceof AnonymousClass6AE) {
                    AnonymousClass6AE r15 = (AnonymousClass6AE) this;
                    mediaViewFragment = (MediaViewFragment) r15.A01;
                    view2 = (View) r15.A03;
                } else {
                    AnonymousClass6AD r16 = (AnonymousClass6AD) this;
                    mediaViewFragment = r16.A01;
                    view2 = r16.A00;
                }
                int y = (int) motionEvent.getY();
                MediaViewCurrentMessageViewModel mediaViewCurrentMessageViewModel = mediaViewFragment.A0n;
                if (!(mediaViewCurrentMessageViewModel == null || mediaViewFragment.A13 == null || (r1 = (C135816so) mediaViewCurrentMessageViewModel.A00.A06()) == null || !r1.A03)) {
                    MediaViewFragment.A09(view2, mediaViewFragment, r1.A01, y);
                    return true;
                }
            }
        }
        return true;
    }

    public C1422278q(AnonymousClass11P r2, C18030ve r3, PhotoView photoView, AnonymousClass21V r5) {
        C18070vi.A0j(r3, r2);
        this.A03 = r3;
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = photoView;
    }
}
