package com.whatsapp.newsletter;

import X.AnonymousClass11C;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1L4;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NC;
import X.AnonymousClass3VS;
import X.AnonymousClass4aX;
import X.AnonymousClass5O9;
import X.AnonymousClass5TX;
import X.AnonymousClass9IV;
import X.C107545aC;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C24261Jm;
import X.C72453Mb;
import X.C72463Mc;
import X.C73073Ow;
import X.C74743cP;
import X.C76823oU;
import X.C87514Vw;
import X.C88414Zp;
import X.C90054dS;
import X.C90774ec;
import X.C91184fH;
import X.C91634g0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.WaTextView;

public final class NewsletterInfoMembersSearchFragment extends Hilt_NewsletterInfoMembersSearchFragment implements C107545aC {
    public ListView A00;
    public WaTextView A01;
    public AnonymousClass11C A02;
    public C18000vb A03;
    public C18030ve A04;
    public AnonymousClass3VS A05;
    public C76823oU A06;
    public C73073Ow A07;
    public AnonymousClass1L4 A08;
    public boolean A09;
    public final int A0A = 2131626198;
    public final C18100vl A0B = C88414Zp.A00(this, "enter_animated");
    public final C18100vl A0C = C88414Zp.A00(this, "exit_animated");
    public final C18100vl A0D = C88414Zp.A00(this, "is_over_max");
    public final C18100vl A0E = C88414Zp.A01(this, "footer_text");

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626191, viewGroup, false);
    }

    public void A1s() {
        this.A01 = null;
        this.A00 = null;
        super.A1s();
    }

    public void A21(Bundle bundle, View view) {
        String str;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        this.A00 = (ListView) AnonymousClass1HF.A06(view2, 16908298);
        this.A09 = A15().getBoolean("enter_ime");
        AnonymousClass1FL A1D = A1D();
        C18070vi.A0z(A1D, "null cannot be cast to non-null type com.whatsapp.newsletter.NewsletterInfoActivity");
        NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) A1D;
        View A052 = C18070vi.A05(A17(), 2131434898);
        A052.setBackgroundResource(2131232920);
        this.A07 = newsletterInfoActivity.A4n();
        this.A06 = (C76823oU) AnonymousClass3MW.A0N(newsletterInfoActivity).A00(C76823oU.class);
        AnonymousClass3VS r0 = (AnonymousClass3VS) AnonymousClass3MW.A0N(newsletterInfoActivity).A00(AnonymousClass3VS.class);
        this.A05 = r0;
        if (r0 != null) {
            C91634g0.A00(A1G(), r0.A01, new AnonymousClass5TX(this), 1);
            AnonymousClass3VS r1 = this.A05;
            if (r1 != null) {
                r1.A0T(AnonymousClass9IV.FULL);
                newsletterInfoActivity.registerForContextMenu(this.A00);
                ListView listView = this.A00;
                if (listView != null) {
                    listView.setOnScrollListener(new C90774ec(this, 3));
                }
                ListView listView2 = this.A00;
                SearchView searchView = (SearchView) A052.findViewById(2131434976);
                TextView A0E2 = C17880vN.A0E(searchView, 2131434969);
                C72463Mc.A0w(A1n(), A14(), A0E2, 2130971105, 2131102431);
                searchView.setIconifiedByDefault(false);
                if (listView2 != null) {
                    C87514Vw.A01(listView2, this, new AnonymousClass5O9(searchView, this), C72453Mb.A1a(this.A0B));
                }
                searchView.setQueryHint(A1H(2131895489));
                C91184fH.A00(searchView, this, 9);
                View findViewById = searchView.findViewById(2131434914);
                C18070vi.A0z(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                ((ImageView) findViewById).setImageDrawable(new AnonymousClass3NC(C24261Jm.A00(A14(), 2131231675)));
                if (C72453Mb.A1a(this.A0B)) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
                    translateAnimation.setDuration(240);
                    A052.startAnimation(translateAnimation);
                }
                ImageView A0H = AnonymousClass3MW.A0H(A052, 2131434851);
                C18000vb r7 = this.A03;
                if (r7 != null) {
                    C74743cP.A03(AnonymousClass4aX.A04(A1n(), A14(), 2130970284, 2131101275, 2131231675), A0H, r7);
                    C90054dS.A00(A0H, this, 47);
                    ListView listView3 = this.A00;
                    if (listView3 != null) {
                        C73073Ow r02 = this.A07;
                        if (r02 != null) {
                            listView3.setAdapter(r02);
                            View inflate = A16().inflate(this.A0A, listView3, false);
                            C18070vi.A05(inflate, 2131436499).setVisibility(8);
                            C18070vi.A05(inflate, 2131432072).setVisibility(8);
                            FrameLayout A0B2 = AnonymousClass3Ma.A0B(inflate);
                            A0B2.addView(inflate);
                            A0B2.setImportantForAccessibility(2);
                            listView3.addFooterView(A0B2, (Object) null, false);
                            this.A01 = AnonymousClass3MW.A0T(inflate, 2131433014);
                            A00(this, (String) null);
                            return;
                        }
                        str = "adapter";
                    } else {
                        return;
                    }
                } else {
                    str = "whatsAppLocale";
                }
                C18070vi.A11(str);
                throw null;
            }
        }
        C18070vi.A11("newsletterInfoMembersListViewModel");
        throw null;
    }

    public static final void A00(NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment, String str) {
        WaTextView waTextView;
        int i;
        if (C72453Mb.A1a(newsletterInfoMembersSearchFragment.A0D)) {
            if (str == null || str.length() == 0) {
                waTextView = newsletterInfoMembersSearchFragment.A01;
                if (waTextView != null) {
                    i = 2131892629;
                } else {
                    return;
                }
            } else {
                waTextView = newsletterInfoMembersSearchFragment.A01;
                if (waTextView != null) {
                    i = 2131892628;
                } else {
                    return;
                }
            }
        } else if (str == null || str.length() == 0) {
            C18100vl r1 = newsletterInfoMembersSearchFragment.A0E;
            Object value = r1.getValue();
            waTextView = newsletterInfoMembersSearchFragment.A01;
            if (value != null) {
                if (waTextView != null) {
                    C72453Mb.A1G(waTextView, r1);
                    return;
                }
                return;
            } else if (waTextView != null) {
                i = 2131892626;
            } else {
                return;
            }
        } else {
            waTextView = newsletterInfoMembersSearchFragment.A01;
            if (waTextView != null) {
                i = 2131892627;
            } else {
                return;
            }
        }
        waTextView.setText(i);
    }

    public void BKr() {
        ListView listView = this.A00;
        AnonymousClass1L4 r1 = this.A08;
        if (r1 != null) {
            C87514Vw.A00(listView, this, r1, C72453Mb.A1a(this.A0C));
        } else {
            C18070vi.A11("imeUtils");
            throw null;
        }
    }
}
