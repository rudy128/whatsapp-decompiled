package X;

import com.whatsapp.gallery.GalleryRecentsFragment;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.82J  reason: invalid class name */
public final class AnonymousClass82J extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C135256ru $action;
    public final /* synthetic */ MediaGalleryFragmentBase $fragment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82J(MediaGalleryFragmentBase mediaGalleryFragmentBase, C135256ru r3) {
        super(1);
        this.$fragment = mediaGalleryFragmentBase;
        this.$action = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GalleryTabHostFragment galleryTabHostFragment;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.$fragment;
        if ((mediaGalleryFragmentBase instanceof GalleryRecentsFragment) && (galleryTabHostFragment = ((GalleryRecentsFragment) mediaGalleryFragmentBase).A02) != null) {
            this.$action.A02.invoke(galleryTabHostFragment.A26());
        }
        return C27621Wu.A00;
    }
}
