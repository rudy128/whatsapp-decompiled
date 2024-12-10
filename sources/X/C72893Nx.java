package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import com.whatsapp.crop.CropImage;

/* renamed from: X.3Nx  reason: invalid class name and case insensitive filesystem */
public class C72893Nx extends TouchDelegate {
    public final /* synthetic */ CropImage A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72893Nx(Rect rect, View view, CropImage cropImage) {
        super(rect, view);
        this.A00 = cropImage;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        CropImage cropImage = this.A00;
        float f = 0.0f;
        if (x < ((float) cropImage.A0K.getLeft())) {
            x = 0.0f;
        } else if (x > ((float) cropImage.A0K.getRight())) {
            x = (float) cropImage.A0K.getWidth();
        }
        float y = motionEvent.getY();
        if (y >= ((float) cropImage.A0K.getTop())) {
            if (y > ((float) cropImage.A0K.getBottom())) {
                f = (float) cropImage.A0K.getHeight();
            } else {
                f = y;
            }
        }
        motionEvent.setLocation(x, f);
        cropImage.A0K.dispatchTouchEvent(motionEvent);
        return true;
    }
}
