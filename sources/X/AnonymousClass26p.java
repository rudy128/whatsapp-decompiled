package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: X.26p  reason: invalid class name */
public class AnonymousClass26p extends Drawable {
    public Rect A00 = new Rect();
    public final int A01;
    public final Paint A02;
    public final Path A03;
    public final Path A04;
    public final Path A05;
    public final Path A06;

    public int getOpacity() {
        return -2;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public static Path A00(Path path, Region region, float f) {
        path.addCircle(f, f, f, Path.Direction.CW);
        Region region2 = new Region();
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region.getBoundaryPath();
    }

    public AnonymousClass26p(int i, int i2) {
        this.A01 = i;
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setColor(i2);
        int i3 = 0 * i;
        int i4 = 1 * i;
        float f = (float) i;
        this.A05 = A00(new Path(), new Region(i3, i3, i4, i4), f);
        int i5 = 2 * i;
        this.A06 = A00(new Path(), new Region(i4, i3, i5, i4), f);
        this.A03 = A00(new Path(), new Region(i3, i4, i4, i5), f);
        this.A04 = A00(new Path(), new Region(i4, i4, i5, i5), f);
    }

    public void draw(Canvas canvas) {
        int width = getBounds().width();
        int i = this.A01 * 2;
        Rect rect = this.A00;
        float f = (float) (((width - i) - rect.left) - rect.right);
        int height = getBounds().height() - i;
        Rect rect2 = this.A00;
        int i2 = rect2.top;
        canvas.translate((float) rect2.left, (float) i2);
        Path path = this.A05;
        Paint paint = this.A02;
        canvas.drawPath(path, paint);
        path.close();
        canvas.translate(f, 0.0f);
        Path path2 = this.A06;
        canvas.drawPath(path2, paint);
        path2.close();
        canvas.translate(0.0f, (float) ((height - i2) - rect2.bottom));
        Path path3 = this.A04;
        canvas.drawPath(path3, paint);
        path3.close();
        canvas.translate(-f, 0.0f);
        Path path4 = this.A03;
        canvas.drawPath(path4, paint);
        path4.close();
    }
}
