package com.whatsapp.status.playback.fragment;

import X.AnonymousClass11C;
import X.AnonymousClass129;
import X.AnonymousClass1KB;
import X.AnonymousClass89L;
import X.C18070vi;
import X.C32741hg;
import X.C36361nl;
import android.content.DialogInterface;

public abstract class OpenLinkDialogFragment extends Hilt_OpenLinkDialogFragment {
    public AnonymousClass1KB A00;
    public C36361nl A01;
    public AnonymousClass11C A02;
    public C32741hg A03;
    public AnonymousClass89L A04;
    public AnonymousClass129 A05;

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass89L r0 = this.A04;
        if (r0 != null) {
            r0.BrX();
        }
    }
}
