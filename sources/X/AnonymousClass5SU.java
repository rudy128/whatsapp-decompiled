package X;

import androidx.fragment.app.Fragment;
import com.whatsapp.gallery.selectedmedia.SelectedMediaCaptionFragment;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;
import com.whatsapp.mediacomposer.ui.caption.CaptionFragment;
import com.whatsapp.mediacomposer.ui.caption.CaptionView;
import java.util.List;

/* renamed from: X.5SU  reason: invalid class name */
public final class AnonymousClass5SU extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SelectedMediaCaptionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SU(SelectedMediaCaptionFragment selectedMediaCaptionFragment) {
        super(1);
        this.this$0 = selectedMediaCaptionFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CaptionFragment captionFragment;
        List list;
        this.this$0.A26();
        Fragment A0O = this.this$0.A1E().A0O(2131428837);
        if ((A0O instanceof CaptionFragment) && (captionFragment = (CaptionFragment) A0O) != null) {
            CaptionView A26 = captionFragment.A26();
            SelectedMediaCaptionFragment selectedMediaCaptionFragment = this.this$0;
            Integer A0c = C72473Md.A0c(selectedMediaCaptionFragment);
            if (A0c != null) {
                C72463Mc.A1F((C20050A4v) A26.getMediaSharingUserJourneyLogger().get(), 46, A0c.intValue());
            }
            GalleryTabsViewModel galleryTabsViewModel = (GalleryTabsViewModel) selectedMediaCaptionFragment.A06.getValue();
            String captionStringText = A26.getCaptionStringText();
            List mentions = A26.A0B.getMentions();
            AnonymousClass1DT r2 = galleryTabsViewModel.A05;
            Iterable iterable = (Iterable) galleryTabsViewModel.A06.A06();
            if (iterable != null) {
                list = C29431cG.A0t(iterable);
            } else {
                list = C18460wS.A00;
            }
            r2.A0F(new AnonymousClass7HK(captionStringText, list, mentions));
        }
        return C27621Wu.A00;
    }
}
