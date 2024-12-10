package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.smartcapture.ui.PhotoRequirementsView;

public final class BH4 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ PhotoRequirementsView A00;

    public boolean onContextClick(MotionEvent motionEvent) {
        return true;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        C18070vi.A0d(motionEvent2, 1);
        float y = motionEvent2.getY();
        if (motionEvent != null) {
            f3 = motionEvent.getY();
        } else {
            f3 = 0.0f;
        }
        float f4 = y - f3;
        if (Math.abs(f4) <= 100.0f || Math.abs(f2) <= 100.0f) {
            return false;
        }
        if (f4 <= 0.0f) {
            return true;
        }
        PhotoRequirementsView photoRequirementsView = this.A00;
        AnonymousClass8DG r0 = photoRequirementsView.A01;
        if (r0 != null) {
            r0.A00();
            photoRequirementsView.A01 = null;
        }
        photoRequirementsView.A02 = false;
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    public BH4(PhotoRequirementsView photoRequirementsView) {
        this.A00 = photoRequirementsView;
    }
}
