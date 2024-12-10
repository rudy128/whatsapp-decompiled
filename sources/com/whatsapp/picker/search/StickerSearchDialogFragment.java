package com.whatsapp.picker.search;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass18K;
import X.AnonymousClass1BI;
import X.AnonymousClass1GP;
import X.AnonymousClass1b8;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass629;
import X.AnonymousClass6If;
import X.AnonymousClass715;
import X.AnonymousClass737;
import X.AnonymousClass73B;
import X.AnonymousClass7AS;
import X.AnonymousClass7AV;
import X.AnonymousClass7BQ;
import X.AnonymousClass7MX;
import X.AnonymousClass7SB;
import X.AnonymousClass88B;
import X.C108945cZ;
import X.C110595gJ;
import X.C111005hn;
import X.C111275jQ;
import X.C112185l4;
import X.C112715lv;
import X.C112735lx;
import X.C117015z4;
import X.C130726ju;
import X.C134166q9;
import X.C136836uU;
import X.C1418377d;
import X.C1423178z;
import X.C142747Aq;
import X.C17880vN;
import X.C18070vi;
import X.C24071It;
import X.C25271No;
import X.C26631Sw;
import X.C28861b9;
import X.C38391rD;
import X.C72463Mc;
import X.C89964dJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StickerSearchDialogFragment extends Hilt_StickerSearchDialogFragment implements AnonymousClass88B {
    public View A00;
    public ViewTreeObserver.OnGlobalLayoutListener A01;
    public RecyclerView A02;
    public ViewPager A03;
    public TabLayout A04;
    public WaEditText A05;
    public AnonymousClass18K A06;
    public C1423178z A07;
    public C111275jQ A08;
    public C112185l4 A09;
    public C25271No A0A;
    public AnonymousClass00H A0B;
    public Runnable A0C;
    public String A0D = "";
    public final AnonymousClass715 A0E = new AnonymousClass715();

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        String str2;
        C117015z4 r0;
        C134166q9 r02;
        C26631Sw r9;
        List list;
        ViewTreeObserver viewTreeObserver;
        C18070vi.A0d(layoutInflater, 0);
        super.A1q(bundle, layoutInflater, viewGroup);
        if (bundle == null || (str = bundle.getString("search_term")) == null) {
            str = "";
        }
        this.A0D = str;
        View inflate = layoutInflater.inflate(2131627112, viewGroup, false);
        this.A00 = inflate.findViewById(2131433163);
        View findViewById = inflate.findViewById(2131431110);
        AnonymousClass7MX r4 = this.A00;
        if (r4 != null) {
            C89964dJ.A00(findViewById, r4, 3);
        }
        this.A05 = (WaEditText) inflate.findViewById(2131434853);
        this.A02 = AnonymousClass3MX.A0Q(inflate, 2131434954);
        this.A04 = (TabLayout) inflate.findViewById(2131435725);
        C130726ju r7 = new C130726ju(A14(), viewGroup, this.A02, this.A09);
        this.A01 = r7.A05;
        RecyclerView recyclerView = this.A02;
        if (!(recyclerView == null || (viewTreeObserver = recyclerView.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A01);
        }
        RecyclerView recyclerView2 = this.A02;
        if (recyclerView2 != null) {
            recyclerView2.A0t(new C112735lx(this, 12));
        }
        C112715lv r5 = new C112715lv(AnonymousClass3MZ.A09(this), r7.A06, this.A02);
        RecyclerView recyclerView3 = this.A02;
        if (recyclerView3 != null) {
            recyclerView3.A0t(r5);
        }
        RecyclerView recyclerView4 = this.A02;
        if (recyclerView4 != null) {
            this.A07 = new C1423178z(recyclerView4, r5);
            ViewTreeObserver viewTreeObserver2 = recyclerView4.getViewTreeObserver();
            if (viewTreeObserver2 != null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.A07);
            }
        }
        AnonymousClass00H r03 = this.A0B;
        if (r03 != null) {
            this.A08 = (C111275jQ) new C24071It(new AnonymousClass7AV((EmojiSearchProvider) C18070vi.A0E(r03)), this).A00(C111275jQ.class);
            AnonymousClass7AS.A00(A1G(), A2H().A01, AnonymousClass7SB.A00(this, 42), 7);
            AnonymousClass7AS.A00(A1G(), A2H().A02, AnonymousClass7SB.A00(this, 43), 7);
            if (this.A09 == null) {
                AnonymousClass7MX r04 = this.A00;
                if (!(r04 == null || (list = r04.A05) == null)) {
                    A2H().A01.A0F(list);
                }
                AnonymousClass7MX r05 = this.A00;
                if (!(r05 == null || (r0 = r05.A00) == null || (r02 = r0.A0A) == null || (r9 = r02.A0A) == null)) {
                    C112185l4 r72 = new C112185l4(A14(), r9, this, AnonymousClass3MW.A10(A2H().A02), 1);
                    this.A09 = r72;
                    RecyclerView recyclerView5 = this.A02;
                    if (recyclerView5 != null) {
                        recyclerView5.setAdapter(r72);
                    }
                }
            }
            View findViewById2 = inflate.findViewById(2131429122);
            AnonymousClass3Ma.A1D(findViewById2, this, 45);
            WaEditText waEditText = this.A05;
            if (waEditText != null) {
                waEditText.addTextChangedListener(new AnonymousClass6If(findViewById2, this, 1));
            }
            ImageView A0H = AnonymousClass3MW.A0H(inflate, 2131428012);
            AnonymousClass3Ma.A1D(A0H, this, 44);
            AnonymousClass3NL.A01(A14(), A0H, this.A01, 2131231675);
            TabLayout tabLayout = this.A04;
            if (tabLayout != null) {
                tabLayout.setTabTextColors(TabLayout.A01(AnonymousClass3MZ.A02(A14(), A14(), 2130970479, 2131101839), AnonymousClass3MZ.A02(A14(), A14(), 2130970478, 2131101838)));
            }
            TabLayout tabLayout2 = this.A04;
            if (tabLayout2 != null) {
                C72463Mc.A0v(A14(), A14(), tabLayout2, 2130969430, 2131100411);
            }
            View findViewById3 = inflate.findViewById(2131434854);
            C72463Mc.A0v(A14(), A14(), findViewById3, 2130969430, 2131100411);
            A00(2131896487, 0);
            A00(2131896493, 1);
            A00(2131896491, 2);
            A00(2131896492, 3);
            A00(2131896494, 4);
            A00(2131896488, 5);
            A00(2131896489, 6);
            TabLayout tabLayout3 = this.A04;
            if (tabLayout3 != null) {
                tabLayout3.setTabMode(0);
            }
            this.A03 = (ViewPager) inflate.findViewById(2131435726);
            AnonymousClass1GP A1E = A1E();
            C18070vi.A0X(A1E);
            C28861b9 r52 = new C28861b9(A1E, 1);
            ViewPager viewPager = this.A03;
            if (viewPager != null) {
                viewPager.setAdapter(r52);
            }
            ViewPager viewPager2 = this.A03;
            if (viewPager2 != null) {
                viewPager2.setOffscreenPageLimit(7);
            }
            ViewPager viewPager3 = this.A03;
            if (viewPager3 != null) {
                viewPager3.A0K(new C142747Aq(this.A04));
            }
            TabLayout tabLayout4 = this.A04;
            if (tabLayout4 != null) {
                tabLayout4.A0E(new AnonymousClass7BQ(this, 0));
            }
            WaEditText waEditText2 = this.A05;
            if (waEditText2 != null) {
                waEditText2.setText("");
            }
            WaEditText waEditText3 = this.A05;
            if (waEditText3 != null) {
                waEditText3.requestFocus();
            }
            WaEditText waEditText4 = this.A05;
            if (waEditText4 != null) {
                waEditText4.A0I(false);
            }
            AnonymousClass629 r1 = new AnonymousClass629();
            r1.A00 = 1;
            AnonymousClass18K r06 = this.A06;
            if (r06 != null) {
                r06.CC7(r1);
                C25271No r07 = this.A0A;
                if (r07 != null) {
                    r07.A01();
                    return inflate;
                }
                str2 = "stickerAggregatedLogger";
            } else {
                str2 = "wamRuntime";
            }
        } else {
            str2 = "emojiSearchProvider";
        }
        C18070vi.A11(str2);
        throw null;
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.A20(bundle);
        String str = this.A0D;
        if (str != null && str.length() != 0) {
            bundle.putString("search_term", str);
        }
    }

    private final void A00(int i, int i2) {
        TabLayout tabLayout = this.A04;
        if (tabLayout != null) {
            C136836uU A072 = tabLayout.A07();
            A072.A01(i);
            A072.A06 = Integer.valueOf(i2);
            A072.A04 = AnonymousClass3MX.A16(this, A1H(i), AnonymousClass3MW.A1a(), 0, 2131896490);
            C110595gJ r0 = A072.A02;
            if (r0 != null) {
                r0.A04();
            }
            TabLayout tabLayout2 = this.A04;
            if (tabLayout2 != null) {
                tabLayout2.A0F(A072);
            }
        }
    }

    public static final void A02(StickerSearchDialogFragment stickerSearchDialogFragment, boolean z) {
        AnonymousClass1b8 r1;
        StickerSearchTabFragment stickerSearchTabFragment;
        C112185l4 r2;
        ViewPager viewPager = stickerSearchDialogFragment.A03;
        if (viewPager != null) {
            r1 = viewPager.getAdapter();
        } else {
            r1 = null;
        }
        if ((r1 instanceof C111005hn) && (stickerSearchTabFragment = ((C111005hn) r1).A00) != null && (r2 = stickerSearchTabFragment.A03) != null) {
            r2.A04 = z;
            RecyclerView recyclerView = stickerSearchTabFragment.A01;
            if (recyclerView != null) {
                recyclerView.setAdapter((C38391rD) null);
            }
            RecyclerView recyclerView2 = stickerSearchTabFragment.A01;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(r2);
            }
        }
    }

    public void A1s() {
        List list;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        RecyclerView recyclerView = this.A02;
        if (!(recyclerView == null || (viewTreeObserver2 = recyclerView.getViewTreeObserver()) == null)) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.A01);
        }
        RecyclerView recyclerView2 = this.A02;
        if (!(recyclerView2 == null || (viewTreeObserver = recyclerView2.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.A07);
        }
        RecyclerView recyclerView3 = this.A02;
        if (!(recyclerView3 == null || (list = recyclerView3.A0L) == null)) {
            list.clear();
        }
        Runnable runnable = this.A0C;
        if (runnable != null) {
            WaEditText waEditText = this.A05;
            if (waEditText != null) {
                waEditText.removeCallbacks(runnable);
            }
            this.A0C = null;
        }
        super.A1s();
        this.A04 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A03 = null;
    }

    public final C111275jQ A2H() {
        C111275jQ r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("stickerSearchViewModel");
        throw null;
    }

    public void C6w(AnonymousClass1BI r2, C1418377d r3, Integer num, int i) {
        AnonymousClass7MX r0 = this.A00;
        if (r0 != null && r3 != null) {
            r0.C6w(r2, r3, num, i);
        }
    }

    public static final void A01(StickerSearchDialogFragment stickerSearchDialogFragment) {
        View view;
        List A10 = AnonymousClass3MW.A10(stickerSearchDialogFragment.A2H().A02);
        List A102 = AnonymousClass3MW.A10(stickerSearchDialogFragment.A2H().A01);
        String str = stickerSearchDialogFragment.A0D;
        int i = 0;
        if (str == null || str.length() != 0) {
            TabLayout tabLayout = stickerSearchDialogFragment.A04;
            if (tabLayout != null) {
                tabLayout.setVisibility(8);
            }
            ViewPager viewPager = stickerSearchDialogFragment.A03;
            if (viewPager == null || viewPager.getVisibility() != 8) {
                A02(stickerSearchDialogFragment, false);
                ViewPager viewPager2 = stickerSearchDialogFragment.A03;
                if (viewPager2 != null) {
                    viewPager2.setVisibility(8);
                }
            }
            if (A10 == null || A10.isEmpty()) {
                view = stickerSearchDialogFragment.A00;
                if (view == null) {
                    return;
                }
            } else {
                View view2 = stickerSearchDialogFragment.A00;
                if (view2 != null) {
                    view2.setVisibility(8);
                    return;
                }
                return;
            }
        } else {
            TabLayout tabLayout2 = stickerSearchDialogFragment.A04;
            if (tabLayout2 != null) {
                tabLayout2.setVisibility(0);
            }
            ViewPager viewPager3 = stickerSearchDialogFragment.A03;
            if (viewPager3 == null || viewPager3.getVisibility() != 0) {
                ViewPager viewPager4 = stickerSearchDialogFragment.A03;
                if (viewPager4 != null) {
                    viewPager4.setVisibility(0);
                }
                A02(stickerSearchDialogFragment, true);
            }
            view = stickerSearchDialogFragment.A00;
            if (view == null) {
                return;
            }
            if (A102 != null && !A102.isEmpty()) {
                i = 8;
            }
        }
        view.setVisibility(i);
    }

    public void A1v() {
        super.A1v();
        WaEditText waEditText = this.A05;
        if (waEditText != null) {
            waEditText.A0I(false);
        }
    }

    public final List A2I(int i) {
        AnonymousClass737[] r3;
        List A10 = AnonymousClass3MW.A10(A2H().A01);
        if (A10 == null) {
            return C17880vN.A0z(0);
        }
        AnonymousClass715 r0 = this.A0E;
        if (i == 0) {
            return A10;
        }
        ArrayList A13 = AnonymousClass000.A13();
        Set set = (Set) AnonymousClass000.A0w(r0.A00, i);
        if (set != null) {
            Iterator it = A10.iterator();
            while (it.hasNext()) {
                C1418377d A0x = C108945cZ.A0x(it);
                AnonymousClass73B r02 = A0x.A04;
                if (r02 != null && (r3 = r02.A0H) != null) {
                    int length = r3.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (set.contains(r3[i2])) {
                            A13.add(A0x);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        return A13;
    }
}
