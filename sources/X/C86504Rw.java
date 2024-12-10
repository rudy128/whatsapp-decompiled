package X;

import android.view.View;
import android.view.ViewStub;
import com.whatsapp.gallery.views.GalleryPartialPermissionBanner;

/* renamed from: X.4Rw  reason: invalid class name and case insensitive filesystem */
public final class C86504Rw {
    public GalleryPartialPermissionBanner A00;
    public boolean A01;
    public final C219217x A02;

    public C86504Rw(C219217x r2) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
    }

    public final void A00(View view, AnonymousClass1FL r6) {
        ViewStub A0F;
        GalleryPartialPermissionBanner galleryPartialPermissionBanner;
        if (AnonymousClass112.A0A() && this.A02.A05() == AnonymousClass00R.A0C && (A0F = AnonymousClass3MW.A0F(view, 2131433428)) != null) {
            View inflate = A0F.inflate();
            if ((inflate instanceof GalleryPartialPermissionBanner) && (galleryPartialPermissionBanner = (GalleryPartialPermissionBanner) inflate) != null) {
                this.A00 = galleryPartialPermissionBanner;
                galleryPartialPermissionBanner.A00 = new C104285No(r6, this);
                galleryPartialPermissionBanner.setVisibility(0);
                A0F.requestLayout();
            }
        }
    }

    public final void A01(C18090vk r7) {
        GalleryPartialPermissionBanner galleryPartialPermissionBanner;
        if (AnonymousClass112.A0A() && (galleryPartialPermissionBanner = this.A00) != null) {
            C219217x r3 = this.A02;
            int i = 0;
            if (r3.A05() != AnonymousClass00R.A0C) {
                i = 8;
            }
            galleryPartialPermissionBanner.setVisibility(i);
            if (this.A01 && r3.A05() != AnonymousClass00R.A01) {
                r7.invoke();
            }
            this.A01 = false;
        }
    }
}
