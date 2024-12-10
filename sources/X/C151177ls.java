package X;

import com.whatsapp.gallery.GalleryRecentsFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import java.util.Map;

/* renamed from: X.7ls  reason: invalid class name and case insensitive filesystem */
public final class C151177ls extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ MediaGalleryFragmentBase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151177ls(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        super(0);
        this.this$0 = mediaGalleryFragmentBase;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int intValue;
        Integer A29 = this.this$0.A29();
        if (A29 == null || (intValue = A29.intValue()) == -1) {
            return null;
        }
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.this$0;
        if (!(mediaGalleryFragmentBase instanceof GalleryRecentsFragment)) {
            return null;
        }
        AnonymousClass00H r0 = ((GalleryRecentsFragment) mediaGalleryFragmentBase).A09;
        if (r0 != null) {
            Map map = (Map) r0.get();
            if (map != null) {
                return AnonymousClass000.A0w(map, intValue);
            }
            return null;
        }
        C18070vi.A11("pickerActionsProviderMap");
        throw null;
    }
}
