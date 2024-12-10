package X;

import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.82p  reason: invalid class name and case insensitive filesystem */
public final class C1589382p extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1DS $result;
    public final /* synthetic */ List $uris;
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1589382p(AnonymousClass1DS r2, GalleryTabHostFragment galleryTabHostFragment, List list) {
        super(1);
        this.this$0 = galleryTabHostFragment;
        this.$uris = list;
        this.$result = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.this$0.A0l.addAll(C29431cG.A0q(((C128536gH) obj).A00));
        ((MediaQualityViewModel) this.this$0.A0x.getValue()).A0W(this.this$0.A1n(), this.this$0.A0k.A04(), false);
        AnonymousClass00H r0 = this.this$0.A0S;
        if (r0 != null) {
            List list = this.$uris;
            int A00 = MediaQualityViewModel.A00(this.this$0);
            HashSet A0U = ((MediaQualityViewModel) this.this$0.A0x.getValue()).A0U();
            GalleryTabHostFragment galleryTabHostFragment = this.this$0;
            ((C134146q7) r0.get()).A00(galleryTabHostFragment.A0k, MediaJidViewModel.A00(galleryTabHostFragment), AnonymousClass00R.A01, 0, list, A0U, A00, GalleryTabHostFragment.A02(this.this$0));
            this.$result.A09(this.this$0.A1G());
            return C27621Wu.A00;
        }
        C18070vi.A11("optimisticUploadController");
        throw null;
    }
}
