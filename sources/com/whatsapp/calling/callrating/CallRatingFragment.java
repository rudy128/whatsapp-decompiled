package com.whatsapp.calling.callrating;

import X.AnonymousClass1DF;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.C101485Cu;
import X.C105085Qq;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C92194gu;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.StarRatingBar;
import com.whatsapp.base.WaFragment;

public final class CallRatingFragment extends WaFragment {
    public TextView A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C101485Cu(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131624447, viewGroup, false);
        C18070vi.A0b(inflate);
        this.A00 = C17880vN.A0E(inflate, 2131434317);
        ((StarRatingBar) inflate.findViewById(2131434316)).A01 = new C92194gu(this, 0);
        C18100vl r2 = this.A01;
        AnonymousClass3MX.A1J(AnonymousClass3MX.A0Z(r2).A05, 2131889887);
        AnonymousClass3MY.A1K(A1G(), AnonymousClass3MX.A0Z(r2).A0C, new C105085Qq(this), 21);
        return inflate;
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
    }
}
