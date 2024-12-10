package X;

import com.whatsapp.gallery.google.GoogleGalleryActivity;

/* renamed from: X.7m3  reason: invalid class name and case insensitive filesystem */
public final class C151287m3 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ GoogleGalleryActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151287m3(GoogleGalleryActivity googleGalleryActivity) {
        super(0);
        this.this$0 = googleGalleryActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(this.this$0.getIntent().getIntExtra("extra_max_items_to_select", 1));
    }
}
