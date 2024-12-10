package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C34001jj;
import X.C72453Mb;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public final class ConfirmEncryptionKeyFragment extends Hilt_ConfirmEncryptionKeyFragment {
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625222, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C34001jj A0Y = C72453Mb.A0Y(this);
        A0Y.A09(new Hilt_EncryptionKeyFragment(), 2131430451);
        A0Y.A01();
        TextView A0J = AnonymousClass3MW.A0J(view, 2131430452);
        AnonymousClass3MX.A1E(AnonymousClass3MZ.A09(this), A0J, new Object[]{64}, 2131755107, 64);
        TextView A0J2 = AnonymousClass3MW.A0J(view, 2131430450);
        AnonymousClass3MX.A1E(A0J2.getResources(), A0J2, new Object[]{64}, 2131755106, 64);
        AnonymousClass3MZ.A1J(A0J2, this, 22);
        AnonymousClass3MZ.A1J(AnonymousClass1HF.A06(view, 2131430449), this, 23);
        RelativeLayout relativeLayout = this.A00;
        if (relativeLayout != null) {
            relativeLayout.setOnCreateContextMenuListener(this);
        }
    }
}
