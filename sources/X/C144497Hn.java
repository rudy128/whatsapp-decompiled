package X;

import android.widget.ImageView;
import com.whatsapp.gifvideopreview.GifVideoPreviewActivity;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.7Hn  reason: invalid class name and case insensitive filesystem */
public final class C144497Hn implements AnonymousClass892 {
    public final WeakReference A00;

    public void onFailure(Exception exc) {
        throw AnonymousClass04E.createAndThrow();
    }

    public void BuY(File file, String str, byte[] bArr) {
        ImageView imageView;
        C114645rS r1 = (C114645rS) this.A00.get();
        if (file == null) {
            if (r1 != null) {
                C72453Mb.A1D(r1.A02);
            }
        } else if (r1 != null && (imageView = r1.A04) != null) {
            imageView.postDelayed(new C146797Qq(r1, file, 23), 50);
        }
    }

    public C144497Hn(GifVideoPreviewActivity gifVideoPreviewActivity) {
        this.A00 = AnonymousClass3MW.A0z(gifVideoPreviewActivity);
    }
}
