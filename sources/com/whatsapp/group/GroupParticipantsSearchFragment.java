package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass1L4;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NG;
import X.AnonymousClass3TD;
import X.AnonymousClass3VF;
import X.AnonymousClass4aX;
import X.C111255jJ;
import X.C146797Qq;
import X.C17880vN;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C24071It;
import X.C24261Jm;
import X.C29261bv;
import X.C34771l3;
import X.C37801q9;
import X.C43421zm;
import X.C65062vm;
import X.C72463Mc;
import X.C73083Ox;
import X.C74603c1;
import X.C74613c2;
import X.C74803cp;
import X.C76783oH;
import X.C825148g;
import X.C84944Ll;
import X.C90774ec;
import X.C90814eg;
import X.C91184fH;
import X.C91604fx;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.TextEmojiLabel;

public class GroupParticipantsSearchFragment extends Hilt_GroupParticipantsSearchFragment {
    public int A00 = 0;
    public C76783oH A01;
    public AnonymousClass11C A02;
    public C18000vb A03;
    public C18030ve A04;
    public C73083Ox A05;
    public AnonymousClass3VF A06;
    public C34771l3 A07;
    public AnonymousClass1L4 A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public void A1y(Bundle bundle) {
        AnonymousClass3TD r5;
        View view;
        String string;
        this.A0X = true;
        Bundle bundle2 = bundle;
        if (bundle != null) {
            this.A00 = bundle2.getInt("search_view_startup_mode");
            this.A09 = bundle2.getBoolean("enter_animated");
            this.A0B = bundle2.getBoolean("exit_animated");
            this.A0A = bundle2.getBoolean("enter_ime");
        }
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) A1D();
        View A17 = A17();
        ListView listView = (ListView) AnonymousClass1HF.A06(A17, 16908298);
        if (this.A05 == null) {
            this.A05 = new C73083Ox(new C84944Ll(groupChatInfoActivity), groupChatInfoActivity);
        }
        AnonymousClass3VF r2 = (AnonymousClass3VF) AnonymousClass3MW.A0N(groupChatInfoActivity).A00(AnonymousClass3VF.class);
        this.A06 = r2;
        int i = this.A00;
        if (i == 0) {
            r5 = r2.A08;
        } else if (i == 1) {
            r5 = r2.A09;
        } else {
            throw new AssertionError("Unreachable");
        }
        C37801q9 A1G = A1G();
        C73083Ox r22 = this.A05;
        r22.getClass();
        r5.A0A(A1G, new C91604fx(r22, 37));
        C34771l3 r0 = this.A07;
        C18070vi.A0d(r0, 0);
        ((C111255jJ) new C24071It(new C65062vm(r0, true), A1D()).A00(C111255jJ.class)).A04.A0A(A1G(), new C91604fx(this, 38));
        groupChatInfoActivity.registerForContextMenu(listView);
        C90814eg.A00(listView, groupChatInfoActivity, 5);
        listView.setOnScrollListener(new C90774ec(this));
        View findViewById = A17.findViewById(2131434898);
        findViewById.setBackgroundResource(2131232920);
        SearchView searchView = (SearchView) findViewById.findViewById(2131434976);
        C72463Mc.A0w(A1n(), A1n(), C17880vN.A0E(searchView, 2131434969), 2130971105, 2131102431);
        searchView.setIconifiedByDefault(false);
        if (this.A09) {
            view = A00();
        } else {
            view = null;
        }
        if (view != null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (view.getTop() - listView.getPaddingTop()), 0.0f);
            translateAnimation.setDuration(240);
            C74603c1.A00(translateAnimation, this, searchView, 8);
            listView.startAnimation(translateAnimation);
        } else if (this.A0A) {
            searchView.A0H();
            this.A0A = false;
        } else {
            this.A08.A01(searchView);
        }
        searchView.setQueryHint(A1H(2131895489));
        C91184fH.A00(searchView, this, 7);
        AnonymousClass3MW.A0H(searchView, 2131434914).setImageDrawable(new AnonymousClass3NG(C24261Jm.A00(A1n(), 2131231675), this));
        if (this.A09) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
            translateAnimation2.setDuration(240);
            findViewById.startAnimation(translateAnimation2);
        }
        this.A09 = false;
        ImageView A0H = AnonymousClass3MW.A0H(findViewById, 2131434851);
        C18000vb r3 = this.A03;
        A0H.setImageDrawable(AnonymousClass4aX.A0A(A1n(), AnonymousClass3MZ.A09(this), AnonymousClass3MZ.A09(this).getDrawable(2131231675), r3));
        C825148g.A00(A0H, this, 30);
        Context A14 = A14();
        if (this.A00 == 1 && (string = A14.getString(2131893585)) != null) {
            View inflate = View.inflate(A1n(), 2131625534, (ViewGroup) null);
            TextView A0J = AnonymousClass3MW.A0J(inflate, 2131436044);
            C43421zm.A04(A0J);
            A0J.setText(string);
            listView.addHeaderView(inflate, (Object) null, false);
        }
        AnonymousClass3VF r4 = this.A06;
        if (this.A00 == 1) {
            Resources resources = groupChatInfoActivity.getResources();
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, 60, 0);
            SpannableStringBuilder A052 = r4.A0C.A05(groupChatInfoActivity, new C146797Qq(r4, groupChatInfoActivity, 34), resources.getQuantityString(2131755315, 60, objArr), "learn-more");
            if (A052 != null) {
                View inflate2 = View.inflate(A1n(), 2131625533, (ViewGroup) null);
                TextEmojiLabel A0V = AnonymousClass3MX.A0V(inflate2, 2131436044);
                AnonymousClass3Ma.A1K(A0V, this.A02);
                AnonymousClass3Ma.A1L(this.A04, A0V);
                A0V.setText(A052);
                listView.addFooterView(inflate2, (Object) null, false);
            }
        }
        if (this.A00 == 0) {
            AnonymousClass3VF r02 = this.A06;
            if (r02.A04.A06(r02.A06) == 3) {
                AnonymousClass3VF r03 = this.A06;
                if (!r03.A05.A0K(r03.A06)) {
                    View inflate3 = View.inflate(A1n(), 2131625533, (ViewGroup) null);
                    TextEmojiLabel A0V2 = AnonymousClass3MX.A0V(inflate3, 2131436044);
                    AnonymousClass3Ma.A1K(A0V2, this.A02);
                    AnonymousClass3Ma.A1L(this.A04, A0V2);
                    A0V2.setText(2131886666);
                    C29261bv.A08(A0V2, 2132084868);
                    listView.addFooterView(inflate3, (Object) null, false);
                }
            }
        }
        listView.setAdapter(this.A05);
    }

    public void A20(Bundle bundle) {
        bundle.putInt("search_view_startup_mode", this.A00);
        bundle.putBoolean("enter_animated", this.A09);
        bundle.putBoolean("exit_animated", this.A0B);
        bundle.putBoolean("enter_ime", this.A0A);
    }

    public void A26() {
        View view;
        View view2 = this.A0B;
        if (view2 != null) {
            boolean A1T = AnonymousClass000.A1T(A1F().A0K(), 1);
            if (this.A0B) {
                view = A00();
            } else {
                view = null;
            }
            View findViewById = view2.findViewById(2131434898);
            findViewById.setVisibility(8);
            this.A08.A01(AnonymousClass1HF.A06(findViewById, 2131434976));
            if (view != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(240);
                findViewById.startAnimation(alphaAnimation);
                View findViewById2 = view2.findViewById(16908298);
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (view.getTop() - findViewById2.getPaddingTop()));
                translateAnimation.setDuration(240);
                C74613c2.A00(translateAnimation, this, 11);
                findViewById2.startAnimation(translateAnimation);
            } else {
                A1F().A0c();
            }
            C76783oH r0 = this.A01;
            if (r0 != null && A1T) {
                r0.setImportantForAccessibility(1);
            }
        }
    }

    private View A00() {
        C74803cp r5 = (C74803cp) A1B();
        View view = null;
        if (r5 != null) {
            int childCount = r5.getListView().getChildCount();
            for (int i = 0; i < childCount && view == null; i++) {
                View childAt = r5.getListView().getChildAt(i);
                if (childAt.getTag() != null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625510);
    }
}
