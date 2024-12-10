package com.whatsapp.identity;

import X.AnonymousClass3MX;
import X.C18070vi;
import X.C29261bv;
import X.C72453Mb;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class CompareNumberBottomSheet extends Hilt_CompareNumberBottomSheet {
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624611, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        TextView A0W = C72453Mb.A0W(view, 2131431515);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            str = bundle2.getString("number");
        } else {
            str = null;
        }
        A0W.setText(str);
        C29261bv.A04(A0W, 1);
        A0W.setTextDirection(3);
    }
}
