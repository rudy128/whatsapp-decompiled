package X;

import com.whatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.7lS  reason: invalid class name and case insensitive filesystem */
public final class C150917lS extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150917lS(GalleryTabHostFragment galleryTabHostFragment) {
        super(0);
        this.this$0 = galleryTabHostFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        GalleryTabHostFragment galleryTabHostFragment = this.this$0;
        C24771Lp r4 = galleryTabHostFragment.A07;
        if (r4 != null) {
            AnonymousClass11C r3 = galleryTabHostFragment.A09;
            if (r3 != null) {
                return new C136166tN(galleryTabHostFragment.A0i, r4, r3, "image-loader-tabbed-gallery-ui");
            }
            str = "systemServices";
        } else {
            str = "caches";
        }
        C18070vi.A11(str);
        throw null;
    }
}
