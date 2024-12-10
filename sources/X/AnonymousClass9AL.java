package X;

import android.widget.TextView;
import com.whatsapp.payments.ui.compliance.ConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.payments.ui.compliance.ConfirmLegalNameBottomSheetFragment;

/* renamed from: X.9AL  reason: invalid class name */
public class AnonymousClass9AL extends C89564cf {
    public final int A00;
    public final Object A01;

    public AnonymousClass9AL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(TextView textView, Object obj, int i) {
        textView.addTextChangedListener(new AnonymousClass9AL(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r3.equalsIgnoreCase(r0) != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0180, code lost:
        if (r1 == null) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0182, code lost:
        r1.A0X(r13.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0189, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0194, code lost:
        if (r1 == null) goto L_0x019e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0196, code lost:
        r1.A0Y(r13.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019e, code lost:
        X.C18070vi.A11("brazilAddPixKeyViewModel");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a4, code lost:
        throw null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r13) {
        /*
            r12 = this;
            int r0 = r12.A00
            r3 = r13
            switch(r0) {
                case 0: goto L_0x0036;
                case 1: goto L_0x018a;
                case 2: goto L_0x0176;
                case 3: goto L_0x0006;
                case 4: goto L_0x016b;
                case 5: goto L_0x0160;
                case 6: goto L_0x0127;
                case 7: goto L_0x0006;
                case 8: goto L_0x0006;
                case 9: goto L_0x00d2;
                case 10: goto L_0x00a2;
                case 11: goto L_0x000a;
                case 12: goto L_0x01a5;
                default: goto L_0x0006;
            }
        L_0x0006:
            super.afterTextChanged(r13)
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r1 = r12.A01
            com.whatsapp.payments.ui.widget.PaymentView r1 = (com.whatsapp.payments.ui.widget.PaymentView) r1
            X.00H r0 = r1.A16
            java.lang.Object r0 = r0.get()
            X.6pA r0 = (X.AnonymousClass6pA) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0009
            X.6nN r0 = r1.A0w
            if (r0 == 0) goto L_0x0009
            X.00H r0 = r1.A11
            java.lang.Object r0 = r0.get()
            X.6pK r0 = (X.C133686pK) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0009
            X.6nN r1 = r1.A0w
            java.lang.String r0 = r13.toString()
            r1.A00(r0)
            return
        L_0x0036:
            java.lang.String r3 = r13.toString()
            java.lang.Object r4 = r12.A01
            com.whatsapp.components.PhoneNumberEntry r4 = (com.whatsapp.components.PhoneNumberEntry) r4
            java.lang.String r1 = r4.A06
            if (r1 == 0) goto L_0x0093
            X.1LA r0 = r4.A00
            X.1yp r0 = r0.A02(r1)
            if (r0 != 0) goto L_0x008c
            r0 = 0
        L_0x004b:
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0093
        L_0x0051:
            java.lang.String r5 = r4.A06
        L_0x0053:
            if (r5 == 0) goto L_0x0084
            com.whatsapp.WaEditText r0 = r4.A01
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0084
            r4.A03(r5)
            com.whatsapp.WaEditText r0 = r4.A02
            java.lang.String r2 = X.AnonymousClass3Ma.A12(r0)
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r1 = r2.replaceAll(r1, r0)
            com.whatsapp.WaEditText r0 = r4.A02
            r0.setText(r1)
            com.whatsapp.WaEditText r0 = r4.A01
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x0084
            com.whatsapp.WaEditText r0 = r4.A02
            r0.requestFocus()
        L_0x0084:
            X.9Ne r0 = r4.A03
            if (r0 == 0) goto L_0x0009
            r0.A00(r3, r5)
            return
        L_0x008c:
            int r0 = r0.A00
            java.lang.String r0 = java.lang.Integer.toString(r0)
            goto L_0x004b
        L_0x0093:
            java.lang.String r0 = r4.A06
            if (r0 == 0) goto L_0x009d
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0051
        L_0x009d:
            java.lang.String r5 = X.AnonymousClass1K3.A00(r3)
            goto L_0x0053
        L_0x00a2:
            java.lang.Object r0 = r12.A01
            X.AQ4 r0 = (X.AQ4) r0
            X.0ve r7 = r0.A0K
            android.content.Context r2 = r0.A0G
            X.1KW r6 = r0.A0J
            X.11C r5 = r0.A0H
            X.0vc r8 = r0.A0L
            com.whatsapp.mentions.MentionableEntry r0 = r0.A0B
            X.C17960vV.A05(r0)
            android.text.TextPaint r4 = r0.getPaint()
            r1 = 2130970892(0x7f04090c, float:1.7550507E38)
            r0 = 2131102330(0x7f060a7a, float:1.7817095E38)
            int r9 = X.AnonymousClass1YL.A00(r2, r1, r0)
            r1 = 2130970132(0x7f040614, float:1.7548965E38)
            r0 = 2131101250(0x7f060642, float:1.7814904E38)
            int r10 = X.AnonymousClass1YL.A00(r2, r1, r0)
            r11 = 1
            X.C26302CxJ.A0L(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x00d2:
            r6 = 0
            X.C18070vi.A0d(r13, r6)
            java.lang.String r1 = r13.toString()
            java.lang.String r0 = "0"
            r5 = 0
            boolean r0 = X.AnonymousClass1YE.A0A(r1, r0, r6)
            java.lang.String r4 = "customNumberBulletRulesContainer"
            java.lang.String r3 = "enterCustomNumberTextInputLayout"
            java.lang.Object r2 = r12.A01
            com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity r2 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity) r2
            if (r0 == 0) goto L_0x0110
            android.widget.LinearLayout r1 = r2.A00
            if (r1 == 0) goto L_0x011f
            r0 = 8
            r1.setVisibility(r0)
            com.google.android.material.textfield.TextInputLayout r1 = r2.A01
            if (r1 == 0) goto L_0x0123
            r0 = 2131897444(0x7f122c64, float:1.9429778E38)
            java.lang.String r0 = r2.getString(r0)
            r1.setError(r0)
            com.whatsapp.WaEditText r0 = r2.A03
            if (r0 != 0) goto L_0x010c
            java.lang.String r0 = "customNumberEditText"
            X.C18070vi.A11(r0)
            throw r5
        L_0x010c:
            r0.requestFocus()
            return
        L_0x0110:
            com.google.android.material.textfield.TextInputLayout r0 = r2.A01
            if (r0 == 0) goto L_0x0123
            r0.setErrorEnabled(r6)
            android.widget.LinearLayout r0 = r2.A00
            if (r0 == 0) goto L_0x011f
            r0.setVisibility(r6)
            return
        L_0x011f:
            X.C18070vi.A11(r4)
            throw r5
        L_0x0123:
            X.C18070vi.A11(r3)
            throw r5
        L_0x0127:
            java.lang.Object r2 = r12.A01
            com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment r2 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment) r2
            android.widget.TextView r1 = r2.A02
            r0 = 4
            r1.setVisibility(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r2.A0M
            java.lang.String r0 = r13.toString()
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r1.setEnabled(r0)
            android.widget.EditText r4 = r2.A00
            android.content.Context r3 = r4.getContext()
            android.widget.EditText r0 = r2.A00
            android.content.Context r2 = r0.getContext()
            r1 = 2130970817(0x7f0408c1, float:1.7550355E38)
            r0 = 2131102224(0x7f060a10, float:1.781688E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            android.content.res.ColorStateList r0 = X.C19740yt.A03(r3, r0)
            X.AnonymousClass1HF.A0L(r0, r4)
            return
        L_0x0160:
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            java.lang.Object r0 = r12.A01
            com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet r0 = (com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet) r0
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r1 = r0.A05
            goto L_0x0180
        L_0x016b:
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            java.lang.Object r0 = r12.A01
            com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet r0 = (com.whatsapp.payments.ui.BrazilPaymentMethodAddPixBottomSheet) r0
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r1 = r0.A05
            goto L_0x0194
        L_0x0176:
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            java.lang.Object r0 = r12.A01
            com.whatsapp.payments.ui.BrazilAddPixFragment r0 = (com.whatsapp.payments.ui.BrazilAddPixFragment) r0
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r1 = r0.A05
        L_0x0180:
            if (r1 == 0) goto L_0x019e
            java.lang.String r0 = r13.toString()
            r1.A0X(r0)
            return
        L_0x018a:
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            java.lang.Object r0 = r12.A01
            com.whatsapp.payments.ui.BrazilAddPixFragment r0 = (com.whatsapp.payments.ui.BrazilAddPixFragment) r0
            com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel r1 = r0.A05
        L_0x0194:
            if (r1 == 0) goto L_0x019e
            java.lang.String r0 = r13.toString()
            r1.A0Y(r0)
            return
        L_0x019e:
            java.lang.String r0 = "brazilAddPixKeyViewModel"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x01a5:
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            java.lang.Object r0 = r12.A01
            com.whatsapp.registration.RegisterName r0 = (com.whatsapp.registration.RegisterName) r0
            X.0zA r0 = r0.A4g()
            r0.A03()
            r13.toString()
            java.lang.String r0 = "recordFieldAddedAction"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9AL.afterTextChanged(android.text.Editable):void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.A00) {
            case 3:
                AnonymousClass8G3 r1 = ((C166718dr) this.A01).A05;
                int length = charSequence.length();
                AnonymousClass1DT r2 = r1.A01;
                int i4 = 1;
                if (length > 0) {
                    i4 = 3;
                }
                r2.A0F(new C184969bo(i4));
                return;
            case 7:
                C18070vi.A0d(charSequence, 0);
                ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment = (ConfirmDateOfBirthBottomSheetFragment) this.A01;
                confirmDateOfBirthBottomSheetFragment.A27(ConfirmDateOfBirthBottomSheetFragment.A00(confirmDateOfBirthBottomSheetFragment, charSequence.toString()));
                return;
            case 8:
                C18070vi.A0d(charSequence, 0);
                ((ConfirmLegalNameBottomSheetFragment) this.A01).A28(AnonymousClass000.A1R(charSequence.length()));
                return;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                return;
        }
    }
}
