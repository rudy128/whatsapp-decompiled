package com.whatsapp.payments.ui;

import X.A5F;
import X.AZX;
import X.AnonymousClass11C;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8eB;
import X.BBP;
import X.BD4;
import X.C17880vN;
import X.C17960vV;
import X.C18030ve;
import X.C20444ALh;
import X.C26302CxJ;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.CodeInputField;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class BrazilAccountRecoveryPinActivity extends AnonymousClass8eB {
    public TextView A00;
    public CodeInputField A01;
    public BD4 A02;
    public BBP A03;
    public A5F A04;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131623972);
        C18030ve r12 = this.A0E;
        AnonymousClass1KB r9 = this.A05;
        AnonymousClass1L9 r8 = this.A01;
        AnonymousClass11C r11 = this.A08;
        C26302CxJ.A0K(this, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), r8, r9, AnonymousClass8BR.A0H(this, 2131435885), r11, r12, C17880vN.A0q(this, "learn-more", new Object[1], 0, 2131886356), "learn-more");
        this.A00 = AnonymousClass3MX.A0L(this, 2131433846);
        CodeInputField codeInputField = (CodeInputField) findViewById(2131429150);
        this.A01 = codeInputField;
        codeInputField.A0M(new C20444ALh(this, 1), 6, getResources().getColor(2131100603));
        ((NumberEntryKeyboard) findViewById(2131433226)).A04 = this.A01;
        AnonymousClass3Ma.A19(findViewById(2131427439), this, 40);
        this.A03 = new AZX(this, (PinBottomSheetDialogFragment) null, this.A04, true, false);
        C17880vN.A1F(AnonymousClass8BR.A08(this), "payments_account_recovery_screen_shown", true);
        BD4 bd4 = this.A02;
        C17960vV.A07(bd4);
        bd4.BiL((Integer) null, "recover_payments_registration", "wa_registration", 0);
    }
}
