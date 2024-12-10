package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.whatsapp.statuscomposer.ConsolidatedStatusComposerActivity;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;

/* renamed from: X.77o  reason: invalid class name and case insensitive filesystem */
public class C1419477o implements GestureDetector.OnGestureListener {
    public final int A00;
    public final Object A01;

    public C1419477o(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (this.A00 != 0) {
            return false;
        }
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            AnonymousClass886 A002 = TextStatusComposerFragment.A00((TextStatusComposerFragment) obj);
            if (A002 == null) {
                return true;
            }
            ((ConsolidatedStatusComposerActivity) A002).Buj(f);
            return true;
        }
        ((AnonymousClass17O) obj).A00 = f;
        return true;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float A03;
        if (this.A00 != 0) {
            return false;
        }
        AnonymousClass17O r1 = (AnonymousClass17O) this.A01;
        C43191zP r4 = r1.A05;
        if (r4 == null) {
            return true;
        }
        double d = r4.A07.A00;
        ImageView imageView = r1.A03;
        if (imageView == null) {
            A03 = 0.0f;
        } else {
            A03 = f / (C108945cZ.A03(imageView) * 3.0f);
        }
        r4.A00(d - ((double) A03));
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.A00 != 0) {
            return false;
        }
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }
}
