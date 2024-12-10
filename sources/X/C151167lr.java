package X;

import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.7lr  reason: invalid class name and case insensitive filesystem */
public final class C151167lr extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ MediaGalleryFragmentBase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151167lr(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        super(0);
        this.this$0 = mediaGalleryFragmentBase;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass00H r0 = this.this$0.A0M;
        if (r0 != null) {
            C86504Rw r1 = (C86504Rw) r0.get();
            if (AnonymousClass112.A0A() && r1.A00 != null) {
                r1.A01 = true;
            }
            return C27621Wu.A00;
        }
        C18070vi.A11("galleryPartialPermissionProvider");
        throw null;
    }
}
