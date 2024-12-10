package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass3Ma;
import X.AnonymousClass4GZ;
import X.AnonymousClass5NQ;
import X.C107315Zf;
import X.C108045b2;
import X.C18070vi;
import X.C28281Zt;
import X.C34001jj;
import X.C72453Mb;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.base.WaDialogFragment;

public final class ConsumerMarketingDisclosureFullscreenFragment extends WaDialogFragment implements C107315Zf {
    public C108045b2 A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625365, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        ConsumerMarketingDisclosureFragment A002 = AnonymousClass4GZ.A00((AnonymousClass1BI) AnonymousClass3Ma.A0y(AnonymousClass00R.A0C, new AnonymousClass5NQ(this)), AnonymousClass00R.A01);
        C108045b2 r0 = this.A00;
        if (r0 != null) {
            A002.A08 = r0;
        }
        C34001jj A0Y = C72453Mb.A0Y(this);
        A0Y.A09(A002, 2131431033);
        A0Y.A03();
        Dialog dialog = this.A03;
        if (dialog != null) {
            C28281Zt.A03(2131102245, dialog);
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A2A(0, 2132083443);
    }

    public void CIB(C108045b2 r1) {
        this.A00 = r1;
    }
}
