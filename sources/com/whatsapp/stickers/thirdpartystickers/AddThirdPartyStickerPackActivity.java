package com.whatsapp.stickers.thirdpartystickers;

import X.AGE;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass009;
import X.AnonymousClass040;
import X.AnonymousClass10I;
import X.AnonymousClass18K;
import X.AnonymousClass1FL;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass6H5;
import X.AnonymousClass6MH;
import X.AnonymousClass78P;
import X.AnonymousClass8BT;
import X.AnonymousClass8BW;
import X.C006002q;
import X.C006302u;
import X.C108945cZ;
import X.C108965cb;
import X.C123576Uz;
import X.C129306ha;
import X.C134226qF;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C24051Ir;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.util.Log;

public class AddThirdPartyStickerPackActivity extends AnonymousClass1FL implements AnonymousClass009 {
    public AnonymousClass18K A00;
    public C129306ha A01;
    public AnonymousClass10I A02;
    public C006302u A03;
    public boolean A04;
    public AnonymousClass6MH A05;
    public final Object A06;
    public volatile C006002q A07;

    public class AddStickerPackDialogFragment extends Hilt_AddThirdPartyStickerPackActivity_AddStickerPackDialogFragment {
        public AnonymousClass1KB A00;
        public C129306ha A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public final View.OnClickListener A06 = new AnonymousClass78P(this, 34);
        public final View.OnClickListener A07 = new AnonymousClass78P(this, 33);
        public final View.OnClickListener A08 = new AnonymousClass78P(this, 32);
        public final C134226qF A09 = new AnonymousClass6H5(this, 8);

        public static void A00(AddStickerPackDialogFragment addStickerPackDialogFragment, String str, int i, int i2, int i3) {
            Dialog dialog = addStickerPackDialogFragment.A03;
            if (dialog != null) {
                View findViewById = dialog.findViewById(2131432685);
                C17960vV.A05(findViewById);
                AnonymousClass3MY.A1X(str, (TextView) findViewById);
                C123576Uz.A00(dialog, 2131434181).setVisibility(i);
                C123576Uz.A00(dialog, 2131433260).setVisibility(i2);
                C123576Uz.A00(dialog, 2131428815).setVisibility(i3);
                C123576Uz.A00(dialog, 2131427582).setVisibility(i3);
            }
        }

        public void A1r() {
            super.A1r();
            C129306ha r0 = this.A01;
            r0.A01.unregisterObserver(this.A09);
        }

        public void A1z(Bundle bundle) {
            super.A1z(bundle);
            C129306ha r0 = this.A01;
            r0.A01.registerObserver(this.A09);
        }

        public Dialog A27(Bundle bundle) {
            super.A27(bundle);
            Bundle bundle2 = this.A06;
            if (bundle2 != null) {
                this.A03 = bundle2.getString("sticker_pack_id");
                this.A02 = bundle2.getString("sticker_pack_authority");
                String string = bundle2.getString("sticker_pack_name");
                this.A04 = string;
                if (string != null) {
                    this.A05 = Html.escapeHtml(string);
                }
            }
            View A0D = AnonymousClass3MY.A0D(LayoutInflater.from(A1n()), 2131624139);
            C17880vN.A0E(A0D, 2131432685).setText(AnonymousClass3MX.A16(this, A1H(2131899103), AnonymousClass3MW.A1a(), 0, 2131897723));
            View findViewById = A0D.findViewById(2131433260);
            findViewById.setVisibility(8);
            findViewById.setOnClickListener(this.A08);
            View findViewById2 = A0D.findViewById(2131428815);
            findViewById2.setVisibility(8);
            findViewById2.setOnClickListener(this.A07);
            View findViewById3 = A0D.findViewById(2131427582);
            findViewById3.setOnClickListener(this.A06);
            findViewById3.setVisibility(8);
            C73203Rj A032 = AnonymousClass4a6.A03(this);
            A032.setView(A0D);
            return A032.create();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
            AnonymousClass1FL A1B = A1B();
            if (A1B != null) {
                C108965cb.A0y(A1B);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String packageName;
        StringBuilder A10;
        String str;
        super.onCreate(bundle);
        if (getApplication() instanceof AnonymousClass009) {
            C006302u A002 = A2m().A00();
            this.A03 = A002;
            AnonymousClass8BW.A14(this, A002);
        }
        String stringExtra = getIntent().getStringExtra("sticker_pack_id");
        String stringExtra2 = getIntent().getStringExtra("sticker_pack_authority");
        String stringExtra3 = getIntent().getStringExtra("sticker_pack_name");
        if (!(getCallingActivity() == null || (packageName = getCallingActivity().getPackageName()) == null)) {
            ProviderInfo resolveContentProvider = this.A01.A00.resolveContentProvider(stringExtra2, 128);
            if (resolveContentProvider == null) {
                A10 = AnonymousClass000.A10();
                str = "cannot find the provider for authority: ";
            } else if (!packageName.equals(resolveContentProvider.packageName)) {
                A10 = AnonymousClass000.A10();
                A10.append("the calling activity: ");
                A10.append(packageName);
                str = " does not own authority: ";
            }
            String A1H = AnonymousClass001.A1H(str, stringExtra2, A10);
            Intent A0A = C17880vN.A0A();
            A0A.putExtra("validation_error", A1H);
            setResult(0, A0A);
            Log.e(A1H);
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        AnonymousClass6MH r2 = new AnonymousClass6MH(this, this.A00, this.A01, stringExtra, stringExtra2, stringExtra3);
        this.A05 = r2;
        C17890vO.A0u(r2, this.A02);
    }

    public final C006002q A2m() {
        if (this.A07 == null) {
            synchronized (this.A06) {
                if (this.A07 == null) {
                    this.A07 = new C006002q(this);
                }
            }
        }
        return this.A07;
    }

    public AddThirdPartyStickerPackActivity(int i) {
        this.A06 = C17880vN.A0p();
        this.A04 = false;
        AGE.A00(this, 37);
    }

    public C24051Ir BQR() {
        return AnonymousClass040.A00(this, super.BQR());
    }

    public final Object generatedComponent() {
        return A2m().generatedComponent();
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass8BT.A1L(this.A03);
        AnonymousClass6MH r0 = this.A05;
        if (r0 != null && !C108945cZ.A1T(r0)) {
            this.A05.A0B(true);
        }
    }

    public AddThirdPartyStickerPackActivity() {
        this(0);
    }
}
