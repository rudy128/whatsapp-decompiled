package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class ANZ implements B7H {
    public final int A00;
    public final Object A01;

    public ANZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bx5(Bitmap bitmap, C20467AMe aMe, boolean z) {
        ImageView imageView;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
            case 1:
                imageView = (ImageView) obj;
                imageView.setBackgroundColor(0);
                break;
            case 4:
                C18070vi.A0d(bitmap, 2);
                ((C22821Di) obj).invoke(bitmap);
                return;
            default:
                imageView = (ImageView) obj;
                break;
        }
        imageView.setImageBitmap(bitmap);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
