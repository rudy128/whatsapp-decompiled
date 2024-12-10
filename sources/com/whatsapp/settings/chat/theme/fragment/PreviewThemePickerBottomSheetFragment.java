package com.whatsapp.settings.chat.theme.fragment;

import X.AnonymousClass01E;
import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3XS;
import X.AnonymousClass4AI;
import X.AnonymousClass5UF;
import X.C139436yq;
import X.C18070vi;
import X.C72473Md;
import X.C91634g0;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public final class PreviewThemePickerBottomSheetFragment extends WDSBottomSheetDialogFragment {
    public RecyclerView A00;
    public ChatThemeViewModel A01;

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            A1B.setTitle(2131896847);
        }
        AnonymousClass01E r0 = (AnonymousClass01E) A1B();
        if (r0 != null) {
            C72473Md.A18(r0);
        }
        ChatThemeViewModel chatThemeViewModel = (ChatThemeViewModel) AnonymousClass3Ma.A0I(this).A00(ChatThemeViewModel.class);
        C18070vi.A0d(chatThemeViewModel, 0);
        this.A01 = chatThemeViewModel;
        RecyclerView recyclerView = (RecyclerView) AnonymousClass3MX.A0C(view, 2131434428);
        C18070vi.A0d(recyclerView, 0);
        this.A00 = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(A14(), 4, 1, false));
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.A0r(new AnonymousClass3XS(AnonymousClass3MW.A01(AnonymousClass3MZ.A09(this), 2131169546)));
            ChatThemeViewModel chatThemeViewModel2 = this.A01;
            if (chatThemeViewModel2 != null) {
                C91634g0.A00(A1G(), chatThemeViewModel2.A0A, new AnonymousClass5UF(this), 30);
                return;
            }
            str = "viewModel";
        } else {
            str = "colorsRecyclerView";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2I(C139436yq r2) {
        C18070vi.A0d(r2, 0);
        r2.A00(AnonymousClass4AI.A00);
    }

    public int A2F() {
        return 2131625358;
    }
}
