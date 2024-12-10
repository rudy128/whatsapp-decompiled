package com.whatsapp.lists;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass3MW;
import X.AnonymousClass4AH;
import X.C139436yq;
import X.C18070vi;
import X.C28391a8;
import X.C72453Mb;
import X.C89954dI;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public final class ListsEducationalBottomSheetFragment extends Hilt_ListsEducationalBottomSheetFragment {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625868, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C89954dI.A00(view.findViewById(2131429535), this, 45);
        int i = 2131891719;
        if (A00()) {
            i = 2131891720;
        }
        CharSequence text = A14().getResources().getText(i);
        C18070vi.A0X(text);
        int i2 = 2131891723;
        if (A00()) {
            i2 = 2131891725;
        }
        CharSequence text2 = A14().getResources().getText(i2);
        C18070vi.A0X(text2);
        int i3 = 2131891724;
        if (A00()) {
            i3 = 2131891727;
        }
        CharSequence text3 = A14().getResources().getText(i3);
        C18070vi.A0X(text3);
        C72453Mb.A1F(view, text, 2131430880);
        C72453Mb.A1F(view, text2, 2131434995);
        C72453Mb.A1F(view, text3, 2131436114);
        view.findViewById(2131430881).setContentDescription(text);
        ImageView A0H = AnonymousClass3MW.A0H(view, 2131434996);
        A0H.setContentDescription(text2);
        int i4 = 2131232371;
        if (A00()) {
            i4 = 2131233355;
        }
        A0H.setImageResource(i4);
        ImageView A0H2 = AnonymousClass3MW.A0H(view, 2131436115);
        A0H2.setContentDescription(text3);
        int i5 = 2131233304;
        if (A00()) {
            i5 = 2131233434;
        }
        A0H2.setImageResource(i5);
    }

    public void A2I(C139436yq r2) {
        C18070vi.A0d(r2, 0);
        r2.A00(AnonymousClass4AH.A00);
    }

    private final boolean A00() {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            return AnonymousClass000.A1O(C72453Mb.A1W(r0) ? 1 : 0);
        }
        C18070vi.A11("listsUtil");
        throw null;
    }

    public void A1u() {
        super.A1u();
        AnonymousClass00H r0 = this.A00;
        if (r0 != null) {
            ((C28391a8) r0.get()).A01();
        } else {
            C18070vi.A11("inboxFilterHelper");
            throw null;
        }
    }
}
