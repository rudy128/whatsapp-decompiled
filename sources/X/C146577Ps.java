package X;

import android.graphics.Matrix;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.7Ps  reason: invalid class name and case insensitive filesystem */
public class C146577Ps implements Runnable {
    public boolean A00;
    public float A01;
    public long A02;
    public final PhotoView A03;

    public void run() {
        long j;
        if (!this.A00) {
            float f = this.A01;
            if (f != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = this.A02;
                if (j2 != -1) {
                    j = currentTimeMillis - j2;
                } else {
                    j = 0;
                }
                float f2 = 0.0f * ((float) j);
                if ((f < 0.0f && f + f2 > 0.0f) || (f > 0.0f && f + f2 < 0.0f)) {
                    f2 = 0.0f - f;
                }
                PhotoView photoView = this.A03;
                photoView.A07 += f2;
                Matrix matrix = photoView.A0A;
                matrix.postRotate(f2, C108955ca.A00(photoView), (float) C108945cZ.A06(photoView));
                photoView.setImageMatrix(matrix);
                float f3 = this.A01 + f2;
                this.A01 = f3;
                if (f3 == 0.0f) {
                    this.A00 = true;
                    photoView.A07 = (float) Math.round(photoView.A07);
                    PhotoView.A05(photoView, true);
                    photoView.requestLayout();
                    photoView.invalidate();
                }
                this.A02 = currentTimeMillis;
            }
            if (!this.A00) {
                this.A03.post(this);
            }
        }
    }

    public C146577Ps(PhotoView photoView) {
        this.A03 = photoView;
    }
}
