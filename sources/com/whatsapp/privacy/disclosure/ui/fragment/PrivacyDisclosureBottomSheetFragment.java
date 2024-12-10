package com.whatsapp.privacy.disclosure.ui.fragment;

import X.AnonymousClass00R;
import X.AnonymousClass11C;
import X.AnonymousClass1FL;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass6XC;
import X.AnonymousClass6XD;
import X.AnonymousClass6XE;
import X.C108965cb;
import X.C114275qR;
import X.C120236Cx;
import X.C135416sA;
import X.C18070vi;
import X.C87344Vf;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.util.Log;

public final class PrivacyDisclosureBottomSheetFragment extends RoundedBottomSheetDialogFragment {
    public C135416sA A00;
    public C120236Cx A01;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        C135416sA r0 = this.A00;
        if (r0 == null) {
            C18070vi.A11("args");
            throw null;
        }
        C120236Cx r3 = this.A01;
        if (r3 != null) {
            r3.A00(r0.A02, r0.A00, r0.A01);
        }
    }

    public void A2K(View view) {
        C18070vi.A0d(view, 0);
        super.A2K(view);
        C135416sA r0 = this.A00;
        if (r0 != null) {
            if (C18070vi.A18(r0.A02.A0B, "xmds_notice_1")) {
                AnonymousClass3MY.A0v(A14(), view, 2131233693);
            }
            C135416sA r02 = this.A00;
            if (r02 != null) {
                boolean z = false;
                if (r02.A02.A05 == AnonymousClass00R.A00) {
                    z = true;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.height = C108965cb.A07().heightPixels - C87344Vf.A01(view.getContext(), AnonymousClass11C.A01(A14()));
                    view.setLayoutParams(layoutParams);
                }
                BottomSheetBehavior A02 = BottomSheetBehavior.A02(view);
                A02.A0d(true);
                A02.A0a(new C114275qR(A02, this, z));
                A02.A0W(3);
                return;
            }
        }
        C18070vi.A11("args");
        throw null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C135416sA r0 = this.A00;
        if (r0 == null) {
            C18070vi.A11("args");
            throw null;
        }
        String str = r0.A02.A0B;
        AnonymousClass1FL A1B = A1B();
        if (A1B == null) {
            return null;
        }
        C120236Cx A002 = AnonymousClass6XE.A00(A1B, AnonymousClass3MX.A0O(A1B), str);
        this.A01 = A002;
        return A002;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        C135416sA A002 = AnonymousClass6XC.A00(this);
        if (A002 != null) {
            this.A00 = A002;
            return;
        }
        Log.e("PrivacyDisclosureBottomSheetFragment: parseAndValidateArguments(): invalid disclosure arguments");
        AnonymousClass6XD.A00(A1F(), AnonymousClass00R.A0u);
        A29();
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            AnonymousClass6XD.A00(AnonymousClass3MX.A0O(A1B), AnonymousClass00R.A0N);
        }
    }
}
