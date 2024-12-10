package com.whatsapp.settings.chat.theme.fragment;

import X.AnonymousClass01E;
import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3WF;
import X.AnonymousClass5Af;
import X.AnonymousClass5UG;
import X.AnonymousClass5UH;
import X.C18070vi;
import X.C18600wl;
import X.C22712BLy;
import X.C23401Fx;
import X.C23671He;
import X.C30391dr;
import X.C37581pm;
import X.C37961qT;
import X.C41561wd;
import X.C72473Md;
import X.C91304fT;
import X.C91634g0;
import android.content.Context;
import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$fetchWallpaperThumbnailBundle$1;
import com.whatsapp.settings.chat.theme.adapter.ThemesWallpaperCategoryLayoutManager;

public final class ThemesWallpaperCategoryFragment extends Hilt_ThemesWallpaperCategoryFragment {
    public RecyclerView A00;
    public ChatThemeViewModel A01;
    public C18600wl A02;
    public C18600wl A03;

    public void A21(Bundle bundle, View view) {
        String str;
        int i;
        DisplayManager displayManager;
        Display display;
        C18070vi.A0d(view, 0);
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            A1B.setTitle(2131898398);
        }
        AnonymousClass01E r0 = (AnonymousClass01E) A1B();
        if (r0 != null) {
            C72473Md.A18(r0);
        }
        ChatThemeViewModel chatThemeViewModel = (ChatThemeViewModel) AnonymousClass3Ma.A0I(this).A00(ChatThemeViewModel.class);
        C18070vi.A0d(chatThemeViewModel, 0);
        this.A01 = chatThemeViewModel;
        Context A14 = A14();
        C37581pm A0G = AnonymousClass3MZ.A0G(this);
        C18600wl r12 = this.A02;
        if (r12 != null) {
            C18600wl r13 = this.A03;
            if (r13 != null) {
                AnonymousClass3WF r6 = new AnonymousClass3WF(A14, A0G, new AnonymousClass5Af(this, 42), new AnonymousClass5Af(this, 43), new AnonymousClass5UH(this), r12, r13);
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    recyclerView.setItemAnimator((C37961qT) null);
                    RecyclerView recyclerView2 = this.A00;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(r6);
                        int A012 = AnonymousClass3MW.A01(AnonymousClass3MZ.A09(this), 2131169533);
                        int A013 = AnonymousClass3MW.A01(AnonymousClass3MZ.A09(this), 2131165892);
                        ThemesWallpaperCategoryLayoutManager themesWallpaperCategoryLayoutManager = new ThemesWallpaperCategoryLayoutManager(A1D(), r6, A013 + A012);
                        RecyclerView recyclerView3 = this.A00;
                        if (recyclerView3 != null) {
                            recyclerView3.setLayoutManager(themesWallpaperCategoryLayoutManager);
                            Context A1n = A1n();
                            Object obj = null;
                            if (A1n != null) {
                                obj = C23671He.A00(A1n).getSystemService("display");
                            }
                            if (!(obj instanceof DisplayManager) || (displayManager = (DisplayManager) obj) == null || (display = displayManager.getDisplay(0)) == null) {
                                i = 1;
                            } else {
                                i = display.getRotation();
                            }
                            C22712BLy bLy = new C22712BLy(themesWallpaperCategoryLayoutManager, A012, A013, i);
                            RecyclerView recyclerView4 = this.A00;
                            if (recyclerView4 != null) {
                                recyclerView4.A0r(bLy);
                                ChatThemeViewModel chatThemeViewModel2 = this.A01;
                                if (chatThemeViewModel2 != null) {
                                    Context A142 = A14();
                                    if (chatThemeViewModel2.A0I.A06() == null) {
                                        AnonymousClass3MW.A1X(chatThemeViewModel2.A0Y, new ChatThemeViewModel$fetchWallpaperThumbnailBundle$1(A142, chatThemeViewModel2, (C30391dr) null), C41561wd.A00(chatThemeViewModel2));
                                    }
                                    ChatThemeViewModel chatThemeViewModel3 = this.A01;
                                    if (chatThemeViewModel3 != null) {
                                        C91634g0.A00(A1G(), chatThemeViewModel3.A0E, new AnonymousClass5UG(r6), 31);
                                        A1D().A2P(new C91304fT(this, 2), C23401Fx.RESUMED, A1G());
                                        return;
                                    }
                                }
                                str = "viewModel";
                            }
                        }
                    } else {
                        C18070vi.A11("recyclerView");
                        throw null;
                    }
                }
                str = "recyclerView";
            } else {
                str = "mainDispatcher";
            }
        } else {
            str = "ioDispatcher";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.A0Y();
        } else {
            C18070vi.A11("recyclerView");
            throw null;
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(A14(), (AttributeSet) null);
        this.A00 = recyclerView;
        return recyclerView;
    }
}
