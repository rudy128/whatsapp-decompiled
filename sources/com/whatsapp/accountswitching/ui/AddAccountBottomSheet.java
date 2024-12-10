package com.whatsapp.accountswitching.ui;

import X.AnonymousClass00H;
import X.AnonymousClass3MX;
import X.AnonymousClass739;
import X.C17880vN;
import X.C18070vi;
import X.C89984dL;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;

public final class AddAccountBottomSheet extends Hilt_AddAccountBottomSheet {
    public int A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public String A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624129, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Log.i("AddAccountBottomSheet/onViewCreated");
        Bundle bundle2 = this.A06;
        if (bundle2 == null) {
            bundle2 = C17880vN.A0D();
        }
        this.A00 = bundle2.getInt("source", 0);
        Bundle bundle3 = this.A06;
        if (bundle3 == null) {
            bundle3 = C17880vN.A0D();
        }
        this.A03 = bundle3.getString("landing_screen");
        C89984dL.A00(C18070vi.A05(view, 2131427573), this, 0, true);
        C18070vi.A05(view, 2131427574).setOnClickListener(new C89984dL(0, this, false));
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            ((AnonymousClass739) C18070vi.A0E(r0)).A04((Boolean) null, this.A00, 27);
        } else {
            C18070vi.A11("accountSwitchingLogger");
            throw null;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        Log.i("AddAccountBottomSheet/onDismiss");
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            ((AnonymousClass739) C18070vi.A0E(r0)).A04((Boolean) null, this.A00, 28);
        } else {
            C18070vi.A11("accountSwitchingLogger");
            throw null;
        }
    }
}
