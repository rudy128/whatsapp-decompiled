package com.whatsapp.authentication;

import X.A3H;
import X.AnonymousClass11C;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NU;
import X.AnonymousClass4bH;
import X.AnonymousClass7RP;
import X.AnonymousClass89R;
import X.C17880vN;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C30901eh;
import X.C34001jj;
import X.C70613Bu;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C91964gX;
import X.C91974gY;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.CodeInputField;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

public class VerifyTwoFactorAuthCodeDialogFragment extends Hilt_VerifyTwoFactorAuthCodeDialogFragment implements AnonymousClass89R {
    public int A00;
    public TextView A01;
    public CodeInputField A02;
    public AnonymousClass1KB A03;
    public AnonymousClass11C A04;
    public C30901eh A05;
    public ProgressBar A06;
    public final Handler A07 = new AnonymousClass3NU(Looper.getMainLooper(), this, 1);
    public final Runnable A08 = new C70613Bu(this, 47);

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        int i = this.A00;
        if (i != 2 && i != 4) {
            C72463Mc.A1A(this);
        }
    }

    public static final void A01(VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment, boolean z) {
        ProgressBar progressBar;
        CodeInputField codeInputField = verifyTwoFactorAuthCodeDialogFragment.A02;
        if (codeInputField != null) {
            codeInputField.setEnabled(z);
        }
        C18030ve r2 = verifyTwoFactorAuthCodeDialogFragment.A02;
        if ((r2 == null || !C18020vd.A05(C18040vf.A01, r2, 11695)) && (progressBar = verifyTwoFactorAuthCodeDialogFragment.A06) != null) {
            int i = 0;
            if (z) {
                i = 100;
            }
            progressBar.setProgress(i);
        }
    }

    public final AnonymousClass1KB A2H() {
        AnonymousClass1KB r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public void C9N(int i) {
        if (this.A00 == 1) {
            this.A00 = 0;
            A2H().A0I(this.A08);
            A2H().A0K(new AnonymousClass7RP(this, i, 21), 500);
        }
    }

    public void C9O() {
        if (this.A00 == 1) {
            this.A00 = 3;
            A2H().A0I(this.A08);
            A2H().A0K(new C70613Bu(this, 49), 500);
        }
    }

    public static final void A00(VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment) {
        AnonymousClass1GP supportFragmentManager;
        AnonymousClass1FL A1B = verifyTwoFactorAuthCodeDialogFragment.A1B();
        if (A1B != null && (supportFragmentManager = A1B.getSupportFragmentManager()) != null) {
            C34001jj r1 = new C34001jj(supportFragmentManager);
            r1.A07(verifyTwoFactorAuthCodeDialogFragment);
            r1.A06 = 8194;
            r1.A02();
        }
    }

    public void A1t() {
        super.A1t();
        C30901eh r0 = this.A05;
        if (r0 != null) {
            List list = r0.A0A;
            C17960vV.A0D(list.contains(this));
            list.remove(this);
            return;
        }
        C18070vi.A11("twoFactorAuthManager");
        throw null;
    }

    public void A1u() {
        super.A1u();
        C30901eh r0 = this.A05;
        if (r0 != null) {
            List list = r0.A0A;
            C17960vV.A0D(!list.contains(this));
            list.add(this);
            return;
        }
        C18070vi.A11("twoFactorAuthManager");
        throw null;
    }

    public Dialog A27(Bundle bundle) {
        Dialog dialog = new Dialog(A1D());
        dialog.requestWindowFeature(1);
        Window window = dialog.getWindow();
        if (window != null) {
            AnonymousClass3Ma.A1H(window, 0);
        }
        dialog.setContentView(2131625393);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) dialog.findViewById(2131432902);
        AnonymousClass3Ma.A1L(textEmojiLabel.getAbProps(), textEmojiLabel);
        C72473Md.A1C(textEmojiLabel);
        textEmojiLabel.setText(A3H.A02(A14(), new C70613Bu(this, 48), AnonymousClass3MY.A0n(this, 2131897169), "forgot-pin"));
        this.A01 = (TextView) dialog.findViewById(2131430516);
        this.A02 = (CodeInputField) dialog.findViewById(2131429150);
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, 6, 0);
        String A1I = A1I(2131886292, objArr);
        C18070vi.A0X(A1I);
        CodeInputField codeInputField = this.A02;
        if (codeInputField != null) {
            codeInputField.A0N(new C91964gX(this, 0), new C91974gY(codeInputField.getContext(), 1), (String) null, A1I, '*', '*', 6);
        }
        CodeInputField codeInputField2 = this.A02;
        if (codeInputField2 != null) {
            codeInputField2.setPasswordTransformationEnabled(true);
        }
        this.A06 = (ProgressBar) dialog.findViewById(2131434182);
        C18030ve r3 = this.A02;
        if (r3 != null && C18020vd.A05(C18040vf.A01, r3, 11695)) {
            C72453Mb.A1D(this.A06);
        }
        A01(this, true);
        dialog.setOnShowListener(new AnonymousClass4bH(this, 0));
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.addFlags(DefaultCrypto.BUFFER_SIZE);
        }
        return dialog;
    }
}
