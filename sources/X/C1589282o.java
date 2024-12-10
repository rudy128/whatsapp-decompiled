package X;

import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel;
import java.util.List;
import java.util.Set;

/* renamed from: X.82o  reason: invalid class name and case insensitive filesystem */
public final class C1589282o extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ List $uris;
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1589282o(GalleryTabHostFragment galleryTabHostFragment, AnonymousClass1BI r3, List list) {
        super(1);
        this.this$0 = galleryTabHostFragment;
        this.$chatJid = r3;
        this.$uris = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C128536gH r15 = (C128536gH) obj;
        this.this$0.A0l.addAll(C29431cG.A0q(r15.A00));
        Set A12 = C29431cG.A12(r15.A01);
        AnonymousClass00H r0 = this.this$0.A0V;
        if (r0 != null) {
            GalleryTabHostFragment galleryTabHostFragment = this.this$0;
            ((C139276yZ) r0.get()).A01(galleryTabHostFragment.A0k, new AnonymousClass7wL(this.this$0, this.$chatJid, this.$uris, A12), AnonymousClass000.A1T(MediaQualityViewModel.A00(galleryTabHostFragment), 3), C72453Mb.A1a(MediaJidViewModel.A00(this.this$0).A09), C72453Mb.A1a(MediaJidViewModel.A00(this.this$0).A0B), C72453Mb.A1a(MediaJidViewModel.A00(this.this$0).A0D), false, AnonymousClass000.A1T(GalleryTabHostFragment.A02(this.this$0), 54), AnonymousClass000.A1T(((C138086wV) this.this$0.A0u.getValue()).A00, 35));
            return C27621Wu.A00;
        }
        C18070vi.A11("videoMaxDurationEnforcer");
        throw null;
    }
}
