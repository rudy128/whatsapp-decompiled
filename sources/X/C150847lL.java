package X;

import android.content.Intent;
import com.whatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.7lL  reason: invalid class name and case insensitive filesystem */
public final class C150847lL extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150847lL(GalleryTabHostFragment galleryTabHostFragment) {
        super(0);
        this.this$0 = galleryTabHostFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Intent intent;
        AnonymousClass1FL A1B = this.this$0.A1B();
        boolean z = false;
        if (!(A1B == null || (intent = A1B.getIntent()) == null)) {
            z = intent.getBooleanExtra("is_coming_from_chat", false);
        }
        return Boolean.valueOf(z);
    }
}
