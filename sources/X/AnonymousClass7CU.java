package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.mediaview.PhotoView;
import java.util.List;

/* renamed from: X.7CU  reason: invalid class name */
public class AnonymousClass7CU implements B7H {
    public final int A00;
    public final Object A01;

    public AnonymousClass7CU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bx5(Bitmap bitmap, C20467AMe aMe, boolean z) {
        if (2 - this.A00 != 0) {
            C113315mt r2 = (C113315mt) this.A01;
            List list = C42011xT.A0I;
            C18070vi.A0d(bitmap, 2);
            ImageView imageView = r2.A01;
            imageView.setImageBitmap(bitmap);
            if (r2.A00) {
                r2.A00 = false;
                imageView.post(new C21424Ajr(r2.A04, 39));
                return;
            }
            return;
        }
        ((PhotoView) this.A01).A0A(bitmap);
    }
}
