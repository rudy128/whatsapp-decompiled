package com.whatsapp.payments.pin.ui;

import X.AnonymousClass11P;
import X.AnonymousClass1FL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BT;
import X.AnonymousClass8BV;
import X.AnonymousClass90X;
import X.BBP;
import X.C114255qP;
import X.C161168Cb;
import X.C17880vN;
import X.C18000vb;
import X.C195929uA;
import X.C196779vd;
import X.C20157A9t;
import X.C20444ALh;
import X.C72453Mb;
import X.C72463Mc;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.CodeInputField;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.wds.components.button.WDSButton;

public class PinBottomSheetDialogFragment extends Hilt_PinBottomSheetDialogFragment {
    public long A00;
    public CountDownTimer A01;
    public View A02;
    public TextView A03;
    public CodeInputField A04;
    public AnonymousClass11P A05;
    public C18000vb A06;
    public C195929uA A07;
    public C196779vd A08;
    public BBP A09;
    public WDSButton A0A;
    public boolean A0B;
    public View A0C;
    public ProgressBar A0D;
    public final C20157A9t A0E = new Object();

    public void A2M() {
        A2D(true);
        this.A0C.setVisibility(0);
        this.A0D.setVisibility(8);
        this.A04.setEnabled(true);
    }

    public void A2N() {
        A2D(false);
        this.A0C.setVisibility(4);
        this.A03.setVisibility(4);
        this.A0D.setVisibility(0);
        this.A04.setEnabled(false);
    }

    public static void A00(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, long j, boolean z) {
        CountDownTimer countDownTimer = pinBottomSheetDialogFragment.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            pinBottomSheetDialogFragment.A01 = null;
        }
        pinBottomSheetDialogFragment.A00 = j;
        TextView textView = pinBottomSheetDialogFragment.A03;
        C72463Mc.A0w(pinBottomSheetDialogFragment.A03.getContext(), textView.getContext(), textView, 2130971113, 2131102439);
        pinBottomSheetDialogFragment.A03.setVisibility(0);
        pinBottomSheetDialogFragment.A04.setErrorState(true);
        pinBottomSheetDialogFragment.A04.setEnabled(false);
        if (z) {
            pinBottomSheetDialogFragment.A04.A0K();
        }
        pinBottomSheetDialogFragment.A01 = new C161168Cb(pinBottomSheetDialogFragment, j - AnonymousClass11P.A01(pinBottomSheetDialogFragment.A05)).start();
    }

    public void A2O(int i, int i2) {
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        this.A04.setErrorState(true);
        this.A04.A0K();
        TextView textView = this.A03;
        Object[] objArr = new Object[1];
        boolean A1b = C72453Mb.A1b(objArr, i);
        textView.setText(this.A06.A0K(objArr, i2, (long) i));
        TextView textView2 = this.A03;
        C72463Mc.A0w(A1n(), textView2.getContext(), textView2, 2130969090, 2131100132);
        this.A03.setVisibility(A1b ? 1 : 0);
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.A0E.onDismiss(dialogInterface);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z;
        int i;
        Window window;
        View A092 = AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131626462);
        Dialog dialog = this.A03;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setSoftInputMode(3);
        }
        View findViewById = A092.findViewById(2131435885);
        this.A02 = findViewById;
        C196779vd r0 = this.A08;
        if (r0 == null || !(r0 instanceof AnonymousClass90X)) {
            z = false;
        } else {
            z = true;
        }
        if (findViewById != null) {
            if (z) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
        }
        this.A0C = A092.findViewById(2131433851);
        this.A0D = (ProgressBar) A092.findViewById(2131434181);
        this.A03 = C17880vN.A0E(A092, 2131430532);
        WDSButton A0q = AnonymousClass3MW.A0q(A092, 2131430972);
        this.A0A = A0q;
        String A1H = A1H(2131893687);
        if (this.A08 != null) {
            String string = A14().getString(2131893687);
            if (!TextUtils.isEmpty(string)) {
                A1H = string;
            }
        }
        AnonymousClass8BT.A18(A0q, this, AnonymousClass8BV.A1b(A1H), 2131893631);
        AnonymousClass3Ma.A19(this.A0A, this, 34);
        boolean z2 = this.A0B;
        this.A0B = z2;
        WDSButton wDSButton = this.A0A;
        if (wDSButton != null) {
            wDSButton.setVisibility(C72453Mb.A01(z2 ? 1 : 0));
        }
        CodeInputField codeInputField = (CodeInputField) A092.findViewById(2131429150);
        this.A04 = codeInputField;
        codeInputField.A0M(new C20444ALh(this, 0), 6, AnonymousClass3MZ.A09(this).getColor(2131100603));
        ((NumberEntryKeyboard) A092.findViewById(2131433226)).A04 = this.A04;
        if (this.A08 != null) {
            layoutInflater.inflate(2131626312, AnonymousClass3MW.A0D(A092, 2131436254), true);
            TextView A0E2 = C17880vN.A0E(A092, 2131431385);
            if (this.A08 instanceof AnonymousClass90X) {
                i = 2131886354;
            } else {
                i = 2131893686;
            }
            A0E2.setText(i);
        }
        return A092;
    }

    public void A1t() {
        super.A1t();
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            A1B.setRequestedOrientation(10);
        }
    }

    public void A1u() {
        super.A1u();
        long A002 = this.A07.A00() * 1000;
        if (A002 > AnonymousClass11P.A01(this.A05) || this.A01 != null) {
            A00(this, A002, false);
        }
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            A1B.setRequestedOrientation(1);
        }
    }

    public void A2K(View view) {
        super.A2K(view);
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(view);
        A022.A0a(new C114255qP(this, A022, 2));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.A0E.onDismiss(dialogInterface);
    }
}
