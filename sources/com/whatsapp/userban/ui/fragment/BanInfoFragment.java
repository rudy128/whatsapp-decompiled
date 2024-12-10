package com.whatsapp.userban.ui.fragment;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass11C;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass78L;
import X.C108955ca;
import X.C124286Xt;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C21423Ajq;
import X.C29491cN;
import X.C36401np;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.userban.ui.viewmodel.BanAppealViewModel;

public class BanInfoFragment extends Hilt_BanInfoFragment {
    public Button A00;
    public AnonymousClass11C A01;
    public C18030ve A02;
    public BanAppealViewModel A03;
    public C36401np A04;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        A1Z(true);
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131624262);
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        if (!((C29491cN) this.A05.get()).A0F()) {
            C108955ca.A1G(menu, 0, 1, 2131894997);
        }
        super.A22(menu, menuInflater);
    }

    public void A21(Bundle bundle, View view) {
        Integer num;
        int i;
        super.A21(bundle, view);
        this.A03 = (BanAppealViewModel) AnonymousClass3Ma.A0I(this).A00(BanAppealViewModel.class);
        BanAppealViewModel.A03(A1D(), false);
        AnonymousClass3MW.A0G(view, 2131428043).setImageDrawable(AnonymousClass3MZ.A09(this).getDrawable(2131233670));
        TextView A0J = AnonymousClass3MW.A0J(view, 2131431392);
        int i2 = 0;
        int i3 = C17890vO.A0B(this.A03.A08.A06).getInt("support_ban_appeal_violation_type", 0);
        C17900vP.A0j("BanAppealRepository/getBanViolationType ", AnonymousClass000.A10(), i3);
        Integer[] A002 = AnonymousClass00R.A00(22);
        int length = A002.length;
        while (true) {
            if (i2 < length) {
                num = A002[i2];
                switch (num.intValue()) {
                    case 1:
                        i = 21;
                        break;
                    case 2:
                        i = 1032;
                        break;
                    case 3:
                        i = 69;
                        break;
                    case 4:
                        i = 1066;
                        break;
                    case 5:
                        i = 126;
                        break;
                    case 6:
                        i = 1067;
                        break;
                    case 7:
                        i = 1069;
                        break;
                    case 8:
                        i = 125;
                        break;
                    case 9:
                        i = 54;
                        break;
                    case 10:
                        i = 1028;
                        break;
                    case 11:
                        i = 1027;
                        break;
                    case 12:
                        i = 1085;
                        break;
                    case 13:
                        i = 1081;
                        break;
                    case 14:
                        i = 1059;
                        break;
                    case 15:
                        i = 1012;
                        break;
                    case 16:
                        i = 1041;
                        break;
                    case 17:
                        i = 65;
                        break;
                    case 18:
                        i = 34;
                        break;
                    case 19:
                        i = 1135;
                        break;
                    case 20:
                        i = 0;
                        break;
                    case 21:
                        i = -1;
                        break;
                    default:
                        i = 15;
                        break;
                }
                if (i != i3) {
                    i2++;
                }
            } else {
                num = AnonymousClass00R.A0D;
            }
        }
        int i4 = 2131888734;
        if (num == AnonymousClass00R.A00) {
            i4 = 2131888735;
        }
        A0J.setText(i4);
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(view, 2131435859);
        TextView A0J2 = AnonymousClass3MW.A0J(view, 2131435860);
        if (!C18020vd.A05(C18040vf.A02, this.A02, 12841) || num != AnonymousClass00R.A0B) {
            A0V.setText(2131886933);
        } else {
            String A1H = A1H(2131898721);
            String[] strArr = {this.A02.A0J(12840).optString("ban_policy_link", "https://faq.whatsapp.com/5957850900902049")};
            AnonymousClass3Ma.A1L(this.A02, A0V);
            AnonymousClass3Ma.A1K(A0V, this.A01);
            C36401np r5 = this.A04;
            Context A1n = A1n();
            Runnable[] runnableArr = {new C21423Ajq(24), new C21423Ajq(25)};
            A0V.setText(r5.A04(A1n, A1H, runnableArr, new String[]{"violation-policy-link"}, strArr));
            A0V.setVisibility(0);
            A0J2.setVisibility(0);
            A0J2.setText(2131886933);
        }
        this.A00 = (Button) AnonymousClass1HF.A06(view, 2131427483);
        boolean equals = C124286Xt.A00(C17880vN.A0r(C17890vO.A0B(this.A03.A08.A06), "support_ban_appeal_state")).equals("IN_REVIEW");
        Button button = this.A00;
        int i5 = 2131886934;
        if (equals) {
            i5 = 2131886935;
        }
        button.setText(i5);
        AnonymousClass78L.A00(this.A00, this, 12);
    }

    public boolean A24(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return super.A24(menuItem);
        }
        this.A03.A0W(A1D(), false);
        return true;
    }
}
