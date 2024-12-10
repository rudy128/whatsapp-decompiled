package X;

import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel;

/* renamed from: X.7lV  reason: invalid class name and case insensitive filesystem */
public final class C150947lV extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150947lV(GalleryTabHostFragment galleryTabHostFragment) {
        super(0);
        this.this$0 = galleryTabHostFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass00H r0 = this.this$0.A0T;
        if (r0 != null) {
            return ((C26431Sc) r0.get()).A0C(C72453Mb.A1a(MediaJidViewModel.A00(this.this$0).A0D), false, C72453Mb.A1a(MediaJidViewModel.A00(this.this$0).A09));
        }
        C18070vi.A11("transcodeUtils");
        throw null;
    }
}
