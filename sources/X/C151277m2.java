package X;

import com.whatsapp.gallery.google.GoogleGalleryActivity;

/* renamed from: X.7m2  reason: invalid class name and case insensitive filesystem */
public final class C151277m2 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ GoogleGalleryActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151277m2(GoogleGalleryActivity googleGalleryActivity) {
        super(0);
        this.this$0 = googleGalleryActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Boolean.valueOf(this.this$0.getIntent().getBooleanExtra("extra_include_all_media", true));
    }
}
