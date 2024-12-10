package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.7NH  reason: invalid class name */
public class AnonymousClass7NH implements AnonymousClass3M2 {
    public final int A00;
    public final ImageView A01;
    public final C32021gV A02;

    public /* synthetic */ void BuW() {
    }

    public int BZK() {
        return this.A02.A0A(this.A01.getContext());
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r5) {
        ImageView imageView = this.A01;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(this.A00);
        }
    }

    public void CN4(View view) {
        C108955ca.A1L(this.A01, -7829368);
    }

    public AnonymousClass7NH(ImageView imageView, C32021gV r2, int i) {
        this.A02 = r2;
        this.A01 = imageView;
        this.A00 = i;
    }

    public static void A00(ThumbnailButton thumbnailButton, PopupNotification popupNotification, AnonymousClass206 r5) {
        thumbnailButton.A01 = popupNotification.getResources().getDimension(2131169019);
        thumbnailButton.A00 = 1.0f;
        thumbnailButton.A02 = 1711276032;
        C32021gV r2 = popupNotification.A13;
        r2.A0E(thumbnailButton, r5, new AnonymousClass7NH(thumbnailButton, r2, 2131232615));
        thumbnailButton.setOnClickListener(popupNotification.A05);
    }
}
