package X;

import android.graphics.Bitmap;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.7Je  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C144917Je implements C1600787a {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ CatalogMediaViewFragment A01;
    public final /* synthetic */ PhotoView A02;

    public final void C9F(boolean z) {
        CatalogMediaViewFragment catalogMediaViewFragment = this.A01;
        PhotoView photoView = this.A02;
        Bitmap bitmap = this.A00;
        C18070vi.A0d(photoView, 1);
        if (z && !catalogMediaViewFragment.A1D().isFinishing()) {
            photoView.A0A(bitmap);
        }
    }

    public /* synthetic */ C144917Je(Bitmap bitmap, CatalogMediaViewFragment catalogMediaViewFragment, PhotoView photoView) {
        this.A01 = catalogMediaViewFragment;
        this.A02 = photoView;
        this.A00 = bitmap;
    }
}
