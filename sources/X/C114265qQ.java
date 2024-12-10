package X;

import android.graphics.Rect;
import android.view.View;
import com.whatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.5qQ  reason: invalid class name and case insensitive filesystem */
public final class C114265qQ extends C6X {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ GalleryTabHostFragment A02;

    public void A03(View view, int i) {
    }

    public C114265qQ(Rect rect, View view, GalleryTabHostFragment galleryTabHostFragment) {
        this.A02 = galleryTabHostFragment;
        this.A01 = view;
        this.A00 = rect;
    }

    public void A02(View view, float f) {
        GalleryTabHostFragment galleryTabHostFragment = this.A02;
        GalleryTabHostFragment.A0E(this.A00, this.A01, galleryTabHostFragment);
    }
}
