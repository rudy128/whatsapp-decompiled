package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C34001jj;
import X.C72453Mb;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public final class EncryptionKeyInfoFragment extends Hilt_EncryptionKeyInfoFragment {
    public Button A00;
    public Button A01;
    public FrameLayout A02;
    public TextView A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625223, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C34001jj A0Y = C72453Mb.A0Y(this);
        A0Y.A09(new Hilt_EncryptionKeyFragment(), 2131430454);
        A0Y.A01();
        FrameLayout frameLayout = (FrameLayout) AnonymousClass1HF.A06(view, 2131430454);
        frameLayout.setVisibility(4);
        this.A02 = frameLayout;
        Button button = (Button) AnonymousClass1HF.A06(view, 2131430456);
        Resources A09 = AnonymousClass3MZ.A09(this);
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = 64;
        String quantityString = A09.getQuantityString(2131755108, 64, A1a);
        C18070vi.A0X(quantityString);
        button.setText(quantityString);
        AnonymousClass3MZ.A1J(button, this, 31);
        this.A01 = button;
        Button button2 = (Button) AnonymousClass1HF.A06(view, 2131430453);
        Resources A092 = AnonymousClass3MZ.A09(this);
        Object[] A1a2 = AnonymousClass3MW.A1a();
        A1a2[0] = 64;
        String quantityString2 = A092.getQuantityString(2131755108, 64, A1a2);
        C18070vi.A0X(quantityString2);
        button2.setText(quantityString2);
        AnonymousClass3MZ.A1J(button2, this, 32);
        this.A00 = button2;
        this.A03 = AnonymousClass3MW.A0J(view, 2131430455);
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
    }
}
