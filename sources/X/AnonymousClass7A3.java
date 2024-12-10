package X;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.metaai.voice.ui.MetaAiVoiceInputBottomSheet;

/* renamed from: X.7A3  reason: invalid class name */
public final class AnonymousClass7A3 implements E3d {
    public final /* synthetic */ MetaAiVoiceInputBottomSheet A00;

    public AnonymousClass7A3(MetaAiVoiceInputBottomSheet metaAiVoiceInputBottomSheet) {
        this.A00 = metaAiVoiceInputBottomSheet;
    }

    public void C4a(NestedScrollView nestedScrollView, int i) {
        NestedScrollView nestedScrollView2;
        float f;
        MetaAiVoiceInputBottomSheet metaAiVoiceInputBottomSheet = this.A00;
        C136786uO r0 = metaAiVoiceInputBottomSheet.A06;
        if (r0 != null) {
            nestedScrollView2 = r0.A01;
        } else {
            nestedScrollView2 = null;
        }
        if (C18070vi.A18(nestedScrollView2, nestedScrollView)) {
            boolean canScrollVertically = nestedScrollView.canScrollVertically(1);
            C130706js r2 = metaAiVoiceInputBottomSheet.A04;
            if (canScrollVertically) {
                if (r2 == null) {
                    C18070vi.A11("metaAiVoiceBottomBar");
                    throw null;
                }
                f = C72453Mb.A00(metaAiVoiceInputBottomSheet.A0R);
            } else if (r2 == null) {
                C18070vi.A11("metaAiVoiceBottomBar");
                throw null;
            } else {
                f = 0.0f;
            }
            View view = r2.A00;
            if (view != null) {
                view.setElevation(f);
            }
        }
    }
}
