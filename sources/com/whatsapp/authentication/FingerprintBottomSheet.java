package com.whatsapp.authentication;

import X.AA0;
import X.AYZ;
import X.AnonymousClass000;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass1KN;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass8RC;
import X.BCP;
import X.C108965cb;
import X.C161178Cc;
import X.C161418Dd;
import X.C162138Jc;
import X.C167268fj;
import X.C167278fk;
import X.C167288fl;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C188999iL;
import X.C20284AEs;
import X.C42621yT;
import X.C454028v;
import X.C87344Vf;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;

public final class FingerprintBottomSheet extends Hilt_FingerprintBottomSheet implements BCP {
    public static final C188999iL A0A = new Object();
    public TextView A00;
    public TextView A01;
    public C167288fl A02;
    public C161418Dd A03;
    public AnonymousClass11P A04;
    public C18000vb A05;
    public boolean A06;
    public long A07;
    public CountDownTimer A08;
    public C42621yT A09;

    public static /* synthetic */ void A02(DialogInterface dialogInterface, Bundle bundle, FingerprintBottomSheet fingerprintBottomSheet) {
        C18070vi.A0d(dialogInterface, 2);
        View findViewById = ((Dialog) dialogInterface).findViewById(2131429948);
        if (findViewById != null) {
            BottomSheetBehavior A022 = BottomSheetBehavior.A02(findViewById);
            C18070vi.A0X(A022);
            if (bundle.getBoolean("full_screen")) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = C108965cb.A07().heightPixels - C87344Vf.A01(fingerprintBottomSheet.A14(), AnonymousClass11C.A01(fingerprintBottomSheet.A14()));
                findViewById.setLayoutParams(layoutParams);
            }
            A022.A0W(3);
            A022.A0Z(new AnonymousClass8RC(fingerprintBottomSheet, 0));
            return;
        }
        throw C17880vN.A0g();
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Window window;
        C18070vi.A0d(layoutInflater, 0);
        Bundle A15 = A15();
        int i = A15.getInt("custom_layout_id");
        if (i == 0) {
            i = 2131625325;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        int i2 = A15.getInt("header_layout_id");
        if (i2 != 0) {
            ViewGroup A0D = AnonymousClass3MW.A0D(inflate, 2131431367);
            layoutInflater.inflate(i2, A0D);
            A0D.setVisibility(0);
        }
        C17880vN.A0E(inflate, 2131430868).setText(A15.getInt("title", 2131890411));
        if (A15.getInt("positive_button_text") != 0) {
            TextView A0E = C17880vN.A0E(inflate, 2131430867);
            this.A01 = A0E;
            if (A0E != null) {
                A0E.setText(A15.getInt("positive_button_text"));
            }
            TextView textView = this.A01;
            if (textView != null) {
                AnonymousClass3MZ.A1J(textView, this, 4);
            }
        }
        if (A15.getInt("negative_button_text") != 0) {
            TextView A0E2 = C17880vN.A0E(inflate, 2131430866);
            this.A00 = A0E2;
            if (A0E2 != null) {
                AnonymousClass1Y5.A07(A0E2, "Button");
            }
            TextView textView2 = this.A00;
            if (textView2 != null) {
                textView2.setText(A15.getInt("negative_button_text"));
            }
            TextView textView3 = this.A00;
            if (textView3 != null) {
                AnonymousClass3MZ.A1J(textView3, this, 5);
            }
        }
        ViewGroup A0D2 = AnonymousClass3MW.A0D(inflate, 2131430876);
        C161418Dd r0 = new C161418Dd(AnonymousClass3MY.A04(inflate), A15.getInt("fingerprint_view_style_id"));
        this.A03 = r0;
        A0D2.addView(r0);
        C161418Dd r1 = this.A03;
        if (r1 != null) {
            r1.A00 = this.A02;
        }
        Dialog dialog = this.A03;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            throw C17880vN.A0g();
        }
        window.getDecorView().setSystemUiVisibility(VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH);
        window.setStatusBarColor(0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 48;
        window.setAttributes(attributes);
        Dialog dialog2 = this.A03;
        if (dialog2 != null) {
            dialog2.setOnShowListener(new AA0(A15, this, 0));
        }
        return inflate;
    }

    public final void A2H(long j) {
        CountDownTimer countDownTimer = this.A08;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.A08 = null;
        A2E();
        long j2 = j;
        if (j > AnonymousClass11P.A01(A2E())) {
            this.A07 = j;
            A01();
            this.A08 = new C161178Cc(this, 0, j2, j - AnonymousClass11P.A01(A2E())).start();
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        A01();
    }

    private final void A01() {
        C42621yT r0 = this.A09;
        if (r0 != null) {
            r0.A01();
        }
        this.A09 = null;
    }

    public static final /* synthetic */ void A06(FingerprintBottomSheet fingerprintBottomSheet) {
        if (!fingerprintBottomSheet.A06) {
            C161418Dd r1 = fingerprintBottomSheet.A03;
            if (r1 != null) {
                C161418Dd.A00(r1.A06, r1);
            }
            fingerprintBottomSheet.A2G();
        }
    }

    public final AnonymousClass11P A2E() {
        AnonymousClass11P r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public final C18000vb A2F() {
        C18000vb r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.1yT] */
    public final void A2G() {
        ? obj = new Object();
        this.A09 = obj;
        C167288fl r0 = this.A02;
        if (r0 != null) {
            r0.A02(obj, this);
        }
    }

    public void Blr(int i, CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        C167288fl r0 = this.A02;
        if (r0 != null) {
            r0.A01();
        }
        if (i == 7) {
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, 30);
            charSequence = A1I(2131886675, A1a);
        }
        C161418Dd r02 = this.A03;
        if (r02 != null) {
            r02.A01(charSequence);
        }
        A01();
    }

    public void Bls() {
        C161418Dd r2 = this.A03;
        if (r2 != null) {
            r2.A02(r2.getContext().getString(2131890415));
        }
    }

    public void Blu(int i, CharSequence charSequence) {
        C161418Dd r1 = this.A03;
        if (r1 != null) {
            r1.A02(String.valueOf(charSequence));
        }
    }

    public void Blv(byte[] bArr) {
        C167288fl r0 = this.A02;
        if (r0 != null) {
            r0.A03(bArr);
        }
        C161418Dd r3 = this.A03;
        if (r3 != null) {
            AnonymousClass3MW.A1S(r3.A04);
            ImageView imageView = r3.A03;
            imageView.removeCallbacks(r3.A08);
            C454028v r2 = r3.A07;
            imageView.setImageDrawable(r2);
            r2.start();
            r2.A08(new C162138Jc(r3, 1));
        }
    }

    public static /* synthetic */ void A03(FingerprintBottomSheet fingerprintBottomSheet) {
        fingerprintBottomSheet.A29();
        C167288fl r1 = fingerprintBottomSheet.A02;
        if (r1 == null) {
            return;
        }
        if (r1 instanceof C167278fk) {
            ((C167278fk) r1).A05.C5b();
        } else if (r1 instanceof C167268fj) {
            AYZ ayz = ((C167268fj) r1).A05;
            BrazilPaymentActivity brazilPaymentActivity = ayz.A05;
            C20284AEs aEs = ayz.A03;
            AnonymousClass1KN r12 = ayz.A02;
            String str = ayz.A06;
            String str2 = ayz.A07;
            BrazilPaymentActivity.A0w(ayz.A01, r12, aEs, ayz.A04, brazilPaymentActivity, str, str2);
        }
    }

    public void A1K() {
        super.A1K();
        this.A02 = null;
    }

    public void A1s() {
        super.A1s();
        C161418Dd r1 = this.A03;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
    }

    public void A1t() {
        super.A1t();
        A01();
    }

    public void A1u() {
        super.A1u();
        if (this.A07 <= AnonymousClass11P.A01(A2E()) && !this.A06) {
            C161418Dd r1 = this.A03;
            if (r1 != null) {
                C161418Dd.A00(r1.A06, r1);
            }
            A2G();
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A2A(0, 2132083971);
    }

    public void A28() {
        A01();
        super.A28();
    }
}
