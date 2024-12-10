package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.gallery.selectedmedia.SelectedMediaCaptionFragment;
import com.whatsapp.mediacomposer.ui.caption.CaptionFragment;
import com.whatsapp.mediacomposer.ui.caption.CaptionView;
import com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel;
import java.util.Set;

/* renamed from: X.4oR  reason: invalid class name and case insensitive filesystem */
public final class C96804oR implements C108515bp {
    public final /* synthetic */ SelectedMediaCaptionFragment A00;
    public final /* synthetic */ CaptionFragment A01;

    public void Bkz() {
    }

    public void Bns() {
    }

    public void C6h() {
    }

    public C96804oR(SelectedMediaCaptionFragment selectedMediaCaptionFragment, CaptionFragment captionFragment) {
        this.A00 = selectedMediaCaptionFragment;
        this.A01 = captionFragment;
    }

    public void CAB() {
        ((MediaViewOnceViewModel) this.A00.A0B.getValue()).A0U();
    }

    public void onCaptionLayoutClicked(View view) {
        SelectedMediaCaptionFragment selectedMediaCaptionFragment = this.A00;
        Integer A0c = C72473Md.A0c(selectedMediaCaptionFragment);
        if (A0c != null) {
            int intValue = A0c.intValue();
            AnonymousClass00H r0 = selectedMediaCaptionFragment.A03;
            if (r0 != null) {
                ((C20050A4v) r0.get()).A02(10, 1, intValue);
            } else {
                C18070vi.A11("mediaSharingUserJourneyLogger");
                throw null;
            }
        }
        C72453Mb.A1D(selectedMediaCaptionFragment.A00);
        CaptionFragment captionFragment = this.A01;
        CaptionView A26 = captionFragment.A26();
        A26.A00((Set) null, new C102655Hh(selectedMediaCaptionFragment), false);
        A26.A0A.setVisibility(0);
        A26.A0E.A04(8);
        C72463Mc.A0d(selectedMediaCaptionFragment).A0I();
        SelectedMediaCaptionFragment.A00(selectedMediaCaptionFragment);
        captionFragment.A26().A0B.A0I(true);
        captionFragment.A26().A0B.requestFocus();
    }

    public void onDismiss() {
        RecyclerView recyclerView = this.A00.A00;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        CaptionFragment captionFragment = this.A01;
        captionFragment.A2A(false);
        captionFragment.A28();
        captionFragment.A26().A0B.A0H();
    }
}
