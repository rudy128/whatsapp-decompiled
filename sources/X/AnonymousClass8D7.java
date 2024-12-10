package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.QrImageView;
import java.util.ArrayList;

/* renamed from: X.8D7  reason: invalid class name */
public class AnonymousClass8D7 extends Animation {
    public final /* synthetic */ QrImageView A00;

    public AnonymousClass8D7(QrImageView qrImageView) {
        this.A00 = qrImageView;
    }

    public void applyTransformation(float f, Transformation transformation) {
        float f2;
        QrImageView qrImageView = this.A00;
        C25088CWz cWz = qrImageView.A00;
        if (cWz != null) {
            if (f != 1.0f) {
                if (f > 0.25f) {
                    f2 = (f - 0.25f) / 0.75f;
                } else {
                    f2 = 0.0f;
                }
                CWH cwh = cWz.A03;
                int i = (int) (((float) (cwh.A01 * cwh.A00)) * (1.0f - f2));
                while (true) {
                    ArrayList arrayList = qrImageView.A01;
                    if (arrayList.size() <= i) {
                        break;
                    }
                    arrayList.remove(QrImageView.A07.nextInt(arrayList.size()));
                }
            } else {
                qrImageView.A01.clear();
            }
            qrImageView.invalidate();
        }
    }
}
