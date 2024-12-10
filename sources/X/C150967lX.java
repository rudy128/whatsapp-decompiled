package X;

import android.view.LayoutInflater;
import com.whatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.7lX  reason: invalid class name and case insensitive filesystem */
public final class C150967lX extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150967lX(GalleryTabHostFragment galleryTabHostFragment) {
        super(0);
        this.this$0 = galleryTabHostFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LayoutInflater from = LayoutInflater.from(this.this$0.A14());
        C18070vi.A0X(from);
        return new C112225l8(from, (C136166tN) this.this$0.A0z.getValue(), new AnonymousClass845(this.this$0));
    }
}
