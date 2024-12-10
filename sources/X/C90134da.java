package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.whatsapp.conversation.ConversationSearchFragment;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.wds.components.search.WDSConversationSearchView;
import com.whatsapp.wds.components.search.WDSSearchView;

/* renamed from: X.4da  reason: invalid class name and case insensitive filesystem */
public class C90134da implements View.OnFocusChangeListener {
    public final int A00;
    public final Object A01;

    public C90134da(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFocusChange(View view, boolean z) {
        int i;
        switch (this.A00) {
            case 0:
                Fragment fragment = (Fragment) this.A01;
                if (!z) {
                    ((InputMethodManager) fragment.A14().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                    return;
                }
                return;
            case 1:
                if (z) {
                    C77063pI r1 = (C77063pI) this.A01;
                    if (view.equals(r1.A08)) {
                        i = 1;
                    } else if (view.equals(r1.A07)) {
                        i = 0;
                    } else {
                        return;
                    }
                    r1.A00 = i;
                    return;
                }
                return;
            case 2:
                AnonymousClass3UY r0 = ((ConversationSearchFragment) this.A01).A02;
                if (r0 != null) {
                    AnonymousClass3MY.A1L(r0.A08, z);
                    return;
                }
                return;
            case 3:
                C91094f8 r02 = (C91094f8) this.A01;
                if (z) {
                    AnonymousClass4aY.A1w((AnonymousClass4aY) r02.A01);
                    return;
                }
                return;
            case 4:
                View view2 = (View) this.A01;
                if (z) {
                    view2.requestLayout();
                    return;
                }
                return;
            case 5:
                C108625c1 r03 = ((TokenizedSearchInput) this.A01).A0F;
                if (r03 != null) {
                    r03.C2N(z);
                    return;
                }
                return;
            case 6:
                WDSConversationSearchView wDSConversationSearchView = (WDSConversationSearchView) this.A01;
                if (z) {
                    wDSConversationSearchView.A02();
                    return;
                }
                return;
            default:
                WDSSearchView wDSSearchView = (WDSSearchView) this.A01;
                if (z) {
                    wDSSearchView.A01();
                    return;
                }
                return;
        }
    }
}
