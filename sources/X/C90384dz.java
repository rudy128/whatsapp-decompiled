package X;

import android.graphics.Path;
import android.view.ViewTreeObserver;
import com.whatsapp.WaRoundCornerImageView;

/* renamed from: X.4dz  reason: invalid class name and case insensitive filesystem */
public class C90384dz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ WaRoundCornerImageView A00;

    public C90384dz(WaRoundCornerImageView waRoundCornerImageView) {
        this.A00 = waRoundCornerImageView;
    }

    public void onGlobalLayout() {
        WaRoundCornerImageView waRoundCornerImageView = this.A00;
        Path path = new Path();
        waRoundCornerImageView.A01 = path;
        float f = waRoundCornerImageView.A00;
        path.addRoundRect((float) (waRoundCornerImageView.getLeft() + waRoundCornerImageView.getPaddingLeft()), (float) (waRoundCornerImageView.getTop() + waRoundCornerImageView.getPaddingTop()), (float) (waRoundCornerImageView.getRight() - waRoundCornerImageView.getPaddingRight()), (float) (waRoundCornerImageView.getBottom() - waRoundCornerImageView.getPaddingBottom()), f, f, Path.Direction.CCW);
    }
}
