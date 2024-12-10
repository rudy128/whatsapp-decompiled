package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.6AB  reason: invalid class name */
public class AnonymousClass6AB extends PhotoView {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6AB(Context context, Object obj, int i) {
        super(context);
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        MediaViewBaseFragment mediaViewBaseFragment;
        boolean z;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(motionEvent, 0);
                mediaViewBaseFragment = (MediaViewBaseFragment) this.A01;
                z = !AnonymousClass000.A1P((this.A00 > this.A04 ? 1 : (this.A00 == this.A04 ? 0 : -1)));
                break;
            case 1:
                mediaViewBaseFragment = ((AnonymousClass7JX) this.A01).A00;
                break;
            default:
                mediaViewBaseFragment = (MediaViewBaseFragment) this.A01;
                break;
        }
        z = AnonymousClass000.A1O((this.A00 > this.A04 ? 1 : (this.A00 == this.A04 ? 0 : -1)));
        mediaViewBaseFragment.A2L(z, true);
        return super.onDoubleTap(motionEvent);
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        MediaViewBaseFragment mediaViewBaseFragment;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(scaleGestureDetector, 0);
                ((MediaViewBaseFragment) this.A01).A2L(false, true);
                break;
            case 1:
                mediaViewBaseFragment = ((AnonymousClass7JX) this.A01).A00;
                break;
            default:
                mediaViewBaseFragment = (MediaViewBaseFragment) this.A01;
                break;
        }
        mediaViewBaseFragment.A2L(false, true);
        return super.onScaleBegin(scaleGestureDetector);
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        MediaViewBaseFragment mediaViewBaseFragment;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(scaleGestureDetector, 0);
                break;
            case 1:
                super.onScaleEnd(scaleGestureDetector);
                mediaViewBaseFragment = ((AnonymousClass7JX) this.A01).A00;
                break;
        }
        super.onScaleEnd(scaleGestureDetector);
        mediaViewBaseFragment = (MediaViewBaseFragment) this.A01;
        mediaViewBaseFragment.A2L(C108975cc.A1A((this.A00 > this.A04 ? 1 : (this.A00 == this.A04 ? 0 : -1))), true);
    }
}
