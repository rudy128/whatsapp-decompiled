package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity;

public final class AF4 implements TextWatcher {
    public final int A00;
    public final EditText A01;
    public final /* synthetic */ IndiaUpiAadhaarCardVerificationActivity A02;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r2 != 2) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity r2 = r4.A02
            com.whatsapp.wds.components.button.WDSButton r3 = r2.A05
            if (r3 != 0) goto L_0x0011
            java.lang.String r0 = "confirmButton"
        L_0x000c:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0011:
            android.widget.EditText r0 = r2.A00
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "aadhaarNumber1"
            goto L_0x000c
        L_0x0018:
            int r1 = X.AnonymousClass3Ma.A03(r0)
            r0 = 4
            if (r1 != r0) goto L_0x002e
            android.widget.EditText r0 = r2.A01
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = "aadhaarNumber2"
            goto L_0x000c
        L_0x0026:
            int r2 = X.AnonymousClass3Ma.A03(r0)
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r3.setEnabled(r0)
            int r1 = r5.length()
            int r0 = r4.A00
            if (r1 < r0) goto L_0x003f
            android.widget.EditText r0 = r4.A01
            r0.requestFocus()
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AF4.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public AF4(EditText editText, IndiaUpiAadhaarCardVerificationActivity indiaUpiAadhaarCardVerificationActivity, int i) {
        this.A02 = indiaUpiAadhaarCardVerificationActivity;
        this.A00 = i;
        this.A01 = editText;
    }
}
