package X;

import com.whatsapp.gallery.selectedmedia.SelectedMediaFragmentBase;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;

/* renamed from: X.5WA  reason: invalid class name */
public final class AnonymousClass5WA extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ SelectedMediaFragmentBase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5WA(SelectedMediaFragmentBase selectedMediaFragmentBase) {
        super(2);
        this.this$0 = selectedMediaFragmentBase;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass8B2 r4 = (AnonymousClass8B2) obj;
        ((Number) obj2).intValue();
        C18070vi.A0d(r4, 0);
        Integer A0c = C72473Md.A0c(this.this$0);
        if (A0c != null) {
            SelectedMediaFragmentBase selectedMediaFragmentBase = this.this$0;
            int intValue = A0c.intValue();
            AnonymousClass00H r0 = selectedMediaFragmentBase.A03;
            if (r0 != null) {
                C72463Mc.A1F((C20050A4v) r0.get(), 86, intValue);
            } else {
                C18070vi.A11("mediaSharingUserJourneyLogger");
                throw null;
            }
        }
        ((GalleryTabsViewModel) this.this$0.A06.getValue()).A0V(r4);
        return C27621Wu.A00;
    }
}
