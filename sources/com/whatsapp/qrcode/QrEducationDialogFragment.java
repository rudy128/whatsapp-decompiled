package com.whatsapp.qrcode;

import X.AnonymousClass3Ma;
import X.C17880vN;
import X.C19830z4;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;

public class QrEducationDialogFragment extends Hilt_QrEducationDialogFragment {
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(A1D()).inflate(2131626654, viewGroup, false);
        ((QrEducationView) inflate.findViewById(2131430270)).A0B = false;
        AnonymousClass3Ma.A1A(inflate.findViewById(2131433257), this, 22);
        return inflate;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A2A(2, 2132083976);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Fragment fragment = this.A0E;
        if (fragment instanceof QrScanCodeFragment) {
            QrScanCodeFragment qrScanCodeFragment = (QrScanCodeFragment) fragment;
            if (qrScanCodeFragment.A08) {
                qrScanCodeFragment.A08 = false;
                C17880vN.A1F(C19830z4.A00(qrScanCodeFragment.A03), "contact_qr_education", false);
                qrScanCodeFragment.A01.A0K(qrScanCodeFragment.A0D, 15000);
            }
            qrScanCodeFragment.A07 = false;
            qrScanCodeFragment.A04.CFY();
        }
    }
}
