package com.whatsapp.messaging;

import X.AnonymousClass1FL;
import X.AnonymousClass206;
import X.AnonymousClass210;
import X.AnonymousClass3uO;
import X.C18070vi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class ViewOnceTextFragment extends Hilt_ViewOnceTextFragment {
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131627373, viewGroup, false);
        A1Z(true);
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        ViewGroup viewGroup = (ViewGroup) C18070vi.A05(view, 2131436059);
        AnonymousClass1FL A1D = A1D();
        AnonymousClass206 r0 = this.A02;
        if (r0 == null) {
            C18070vi.A11("fMessage");
            throw null;
        }
        AnonymousClass3uO r1 = new AnonymousClass3uO(A1D, this, (AnonymousClass210) r0);
        r1.A2W(true);
        r1.setEnabled(false);
        r1.setClickable(false);
        r1.setLongClickable(false);
        r1.A2i = false;
        viewGroup.removeAllViews();
        viewGroup.addView(r1);
    }
}
