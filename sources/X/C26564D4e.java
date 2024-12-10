package X;

import android.graphics.Bitmap;
import android.view.PixelCopy;

/* renamed from: X.D4e  reason: case insensitive filesystem */
public final /* synthetic */ class C26564D4e implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ DAW A01;

    public final void onPixelCopyFinished(int i) {
        Bitmap bitmap = this.A00;
        DAW daw = this.A01;
        if (i != 0) {
            bitmap.eraseColor(-12303292);
        }
        daw.A00(bitmap, (C24851CMu) null);
    }

    public /* synthetic */ C26564D4e(Bitmap bitmap, DAW daw) {
        this.A00 = bitmap;
        this.A01 = daw;
    }
}
