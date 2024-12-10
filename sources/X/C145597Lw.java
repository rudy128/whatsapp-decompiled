package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel;
import com.whatsapp.gallery.viewmodel.MediaGalleryFragmentViewModel$fillBubble$1;

/* renamed from: X.7Lw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C145597Lw implements C28538E6m {
    public final /* synthetic */ MediaGalleryFragmentBase A00;

    public final void CQX() {
        int i;
        AnonymousClass8B2 BUY;
        C1602587t r1;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A00;
        RecyclerView recyclerView = mediaGalleryFragmentBase.A07;
        C38251qy r12 = null;
        if (recyclerView != null) {
            r12 = recyclerView.getLayoutManager();
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r12;
        if (linearLayoutManager != null && mediaGalleryFragmentBase.A0G != null) {
            int A1O = linearLayoutManager.A1O();
            RecyclerView recyclerView2 = mediaGalleryFragmentBase.A07;
            if (!(recyclerView2 instanceof C1602587t) || (r1 = (C1602587t) recyclerView2) == null) {
                i = 0;
            } else {
                i = r1.BQE(A1O);
            }
            C160878Ah r0 = mediaGalleryFragmentBase.A0G;
            if (r0 == null || (BUY = r0.BUY(i)) == null) {
                MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel = (MediaGalleryFragmentViewModel) mediaGalleryFragmentBase.A0i.getValue();
                C160878Ah r4 = mediaGalleryFragmentBase.A0G;
                C30391dr A0j = C108975cc.A0j(mediaGalleryFragmentViewModel.A00);
                AnonymousClass1OX A002 = C41561wd.A00(mediaGalleryFragmentViewModel);
                mediaGalleryFragmentViewModel.A00 = C30451dy.A02(AnonymousClass00R.A00, mediaGalleryFragmentViewModel.A08, new MediaGalleryFragmentViewModel$fillBubble$1(r4, mediaGalleryFragmentViewModel, A0j, i), A002);
                return;
            }
            MediaGalleryFragmentBase.A05(BUY, mediaGalleryFragmentBase);
        }
    }

    public /* synthetic */ C145597Lw(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        this.A00 = mediaGalleryFragmentBase;
    }
}
