package com.whatsapp.settings.chat.theme.fragment;

import X.AnonymousClass01E;
import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3XS;
import X.AnonymousClass5UC;
import X.C18070vi;
import X.C72473Md;
import X.C91304fT;
import X.C91634g0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.base.WaFragment;
import com.whatsapp.collections.AutoFitGridLayoutManager;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;

public final class ChatThemeMessageColorFragment extends WaFragment {
    public RecyclerView A00;
    public ChatThemeViewModel A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625358, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
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
        int A012 = AnonymousClass3MW.A01(AnonymousClass3MZ.A09(this), 2131165868);
        float dimension = AnonymousClass3MZ.A09(this).getDimension(2131169546);
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new AutoFitGridLayoutManager(A1D(), (int) (((float) A012) + dimension)));
            RecyclerView recyclerView3 = this.A00;
            if (recyclerView3 != null) {
                recyclerView3.A0r(new AnonymousClass3XS(((int) dimension) / 2));
                ChatThemeViewModel chatThemeViewModel2 = this.A01;
                if (chatThemeViewModel2 != null) {
                    C91634g0.A00(A1G(), chatThemeViewModel2.A0A, new AnonymousClass5UC(this), 28);
                    A1D().A2Q(new C91304fT(this, 0), A1G());
                    return;
                }
                str = "viewModel";
                C18070vi.A11(str);
                throw null;
            }
        }
        str = "colorsRecyclerView";
        C18070vi.A11(str);
        throw null;
    }
}
