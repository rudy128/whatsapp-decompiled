package X;

import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel;

/* renamed from: X.845  reason: invalid class name */
public final class AnonymousClass845 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass845(GalleryTabHostFragment galleryTabHostFragment) {
        super(2);
        this.this$0 = galleryTabHostFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass8B2 r4 = (AnonymousClass8B2) obj;
        ((Number) obj2).intValue();
        C18070vi.A0d(r4, 0);
        Integer A00 = GalleryPickerViewModel.A00(this.this$0.A0n);
        if (A00 != null) {
            GalleryTabHostFragment galleryTabHostFragment = this.this$0;
            C72463Mc.A1F(C108985cd.A0b(galleryTabHostFragment), 86, A00.intValue());
        }
        C108965cb.A0P(this.this$0).A0V(r4);
        return C27621Wu.A00;
    }
}
