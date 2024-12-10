package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import com.whatsapp.WaImageButton;
import com.whatsapp.conversation.ConversationSearchFragment;
import com.whatsapp.search.home.HomeSearchFragment;
import com.whatsapp.wds.components.search.WDSConversationSearchView;

/* renamed from: X.4cg  reason: invalid class name and case insensitive filesystem */
public abstract class C89574cg implements TextWatcher {
    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        WaImageButton waImageButton;
        AnonymousClass4CA r1 = (AnonymousClass4CA) this;
        if (r1.A00 != 0) {
            AnonymousClass3TN r2 = ((HomeSearchFragment) r1.A01).A02;
            if (r2 == null) {
                AnonymousClass3MW.A1H();
                throw null;
            }
            String valueOf = String.valueOf(charSequence);
            C18070vi.A0d(valueOf, 0);
            r2.A00.A0F(valueOf);
            return;
        }
        ConversationSearchFragment conversationSearchFragment = (ConversationSearchFragment) r1.A01;
        AnonymousClass3UY r12 = conversationSearchFragment.A02;
        if (r12 != null) {
            r12.A0U(String.valueOf(charSequence));
        }
        if (!C72453Mb.A1a(conversationSearchFragment.A09)) {
            return;
        }
        if (!conversationSearchFragment.A06 && (charSequence == null || AnonymousClass1YF.A0T(charSequence))) {
            WDSConversationSearchView wDSConversationSearchView = conversationSearchFragment.A05;
            if (wDSConversationSearchView != null) {
                Menu menu = wDSConversationSearchView.A03.getMenu();
                C18070vi.A0X(menu);
                int size = menu.size();
                for (int i4 = 0; i4 < size; i4++) {
                    menu.getItem(i4).setVisible(false);
                }
            }
            WDSConversationSearchView wDSConversationSearchView2 = conversationSearchFragment.A05;
            if (!(wDSConversationSearchView2 == null || (waImageButton = wDSConversationSearchView2.A04) == null)) {
                waImageButton.setVisibility(0);
            }
            conversationSearchFragment.A06 = true;
        } else if (conversationSearchFragment.A06 && charSequence != null && !AnonymousClass1YF.A0T(charSequence)) {
            WDSConversationSearchView wDSConversationSearchView3 = conversationSearchFragment.A05;
            if (wDSConversationSearchView3 != null) {
                Menu menu2 = wDSConversationSearchView3.A03.getMenu();
                C18070vi.A0X(menu2);
                int size2 = menu2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    menu2.getItem(i5).setVisible(true);
                }
            }
            WDSConversationSearchView wDSConversationSearchView4 = conversationSearchFragment.A05;
            if (wDSConversationSearchView4 != null) {
                C72453Mb.A1D(wDSConversationSearchView4.A04);
            }
            conversationSearchFragment.A06 = false;
        }
    }
}
