package X;

import android.view.View;
import com.whatsapp.bot.home.AIHomeActivity;
import com.whatsapp.mediacomposer.VideoComposerFragment;
import com.whatsapp.wds.components.search.WDSSearchBar;

/* renamed from: X.77x  reason: invalid class name and case insensitive filesystem */
public class C1420377x implements View.OnAttachStateChangeListener {
    public final int A00;
    public final Object A01;

    public C1420377x(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onViewAttachedToWindow(View view) {
        if (this.A00 == 0) {
            C18070vi.A0d(view, 0);
            view.removeOnAttachStateChangeListener(this);
            AIHomeActivity aIHomeActivity = (AIHomeActivity) this.A01;
            if (C72463Mc.A1O(C108945cZ.A0b(aIHomeActivity.A07).A0B)) {
                WDSSearchBar wDSSearchBar = aIHomeActivity.A03;
                if (wDSSearchBar != null) {
                    if (!AnonymousClass000.A1P(wDSSearchBar.A08.getVisibility())) {
                        WDSSearchBar wDSSearchBar2 = aIHomeActivity.A03;
                        if (wDSSearchBar2 != null) {
                            WDSSearchBar.A01(wDSSearchBar2, true, true);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C18070vi.A11("wdsSearchBar");
                throw null;
            }
        }
    }

    public void onViewDetachedFromWindow(View view) {
        if (this.A00 != 0) {
            C18070vi.A0d(view, 0);
            view.removeCallbacks(((VideoComposerFragment) this.A01).A0p);
        } else {
            C18070vi.A0d(view, 0);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
