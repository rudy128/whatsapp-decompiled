package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.widget.Button;
import com.whatsapp.biz.cart.view.fragment.PromotionApplicationFragment;
import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.newsletter.ui.NewsletterEditActivity;
import com.whatsapp.payments.ui.IndiaUpiSavingsOfferActivity;

public class AF3 implements NoCopySpan, TextWatcher {
    public final int A00;
    public final Object A01;

    public AF3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void afterTextChanged(Editable editable) {
        String str;
        String str2;
        String A0I;
        String str3;
        String substring;
        Button button;
        Resources resources;
        int i;
        switch (this.A00) {
            case 1:
                PromotionApplicationFragment.A00((C167978i5) null, (PromotionApplicationFragment) this.A01);
                return;
            case 2:
                AnonymousClass8GP r4 = ((PostcodeChangeBottomSheet) this.A01).A08;
                String obj = editable.toString();
                if (obj == null || (A0I = AnonymousClass1YF.A0I(obj)) == null) {
                    str = null;
                } else {
                    str = AnonymousClass8BV.A0s(A0I, "-");
                }
                r4.A02 = str;
                if (C18070vi.A18(r4.A03, "cep") && (str2 = r4.A02) != null && str2.length() > 5) {
                    StringBuilder sb = new StringBuilder(str2);
                    sb.insert(5, '-');
                    r4.A02 = sb.toString();
                }
                AnonymousClass8GP.A03(r4);
                return;
            case 3:
                NewsletterEditActivity.A03((NewsletterEditActivity) this.A01);
                return;
            case 5:
                C18070vi.A0d(editable, 0);
                if (editable.toString().length() > 0) {
                    C161708Hk r2 = ((IndiaUpiSavingsOfferActivity) this.A01).A05;
                    if (r2 == null) {
                        str3 = "indiaUpiSavingsOfferAdapter";
                        C18070vi.A11(str3);
                        throw null;
                    } else if (r2.A00 != -1) {
                        r2.A00 = -1;
                        r2.notifyDataSetChanged();
                    }
                }
                IndiaUpiSavingsOfferActivity indiaUpiSavingsOfferActivity = (IndiaUpiSavingsOfferActivity) this.A01;
                String obj2 = editable.toString();
                String A0e = C108975cc.A0e(AnonymousClass1YF.A0I(obj2));
                indiaUpiSavingsOfferActivity.A04 = new C20263ADv(A0e, A0e, "");
                Button button2 = indiaUpiSavingsOfferActivity.A00;
                if (button2 == null) {
                    str3 = "applySavingsOfferButton";
                    C18070vi.A11(str3);
                    throw null;
                }
                button2.setEnabled(AnonymousClass000.A1R(obj2.length()));
                return;
            case 6:
                AnonymousClass8Do r3 = (AnonymousClass8Do) this.A01;
                r3.A02 = editable.length();
                if (r3.A0I) {
                    if (editable.length() != 0) {
                        button = r3.A04;
                        button.setEnabled(true);
                        resources = r3.getResources();
                        i = 2131101983;
                    }
                    substring = editable.toString();
                    r3.A0E = substring;
                    return;
                }
                boolean z = r3.A0J;
                int length = editable.length();
                if (z) {
                    boolean z2 = r3.A0N;
                    if (length == 0) {
                        if (z2) {
                            r3.A04.setCompoundDrawablesWithIntrinsicBounds(r3.getResources().getDrawable(2131232417), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        button = r3.A04;
                        button.setEnabled(false);
                        resources = r3.getResources();
                        i = 2131101984;
                    } else {
                        if (z2) {
                            r3.A04.setCompoundDrawablesWithIntrinsicBounds(r3.getResources().getDrawable(2131232416), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        Button button3 = r3.A04;
                        AnonymousClass8BS.A14(r3.getResources(), button3, 2131101983);
                        button3.setEnabled(true);
                        substring = editable.toString();
                        r3.A0E = substring;
                        return;
                    }
                } else {
                    boolean z3 = r3.A0N;
                    if (length == 0) {
                        if (z3) {
                            r3.A04.setCompoundDrawablesWithIntrinsicBounds(r3.getResources().getDrawable(2131232415), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        Button button4 = r3.A04;
                        button4.setEnabled(false);
                        AnonymousClass8BS.A14(r3.getResources(), button4, 2131101984);
                        r3.A0E = "";
                        return;
                    }
                    if (z3) {
                        r3.A04.setCompoundDrawablesWithIntrinsicBounds(r3.getResources().getDrawable(2131232418), (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    Button button5 = r3.A04;
                    AnonymousClass8BS.A14(r3.getResources(), button5, 2131101983);
                    button5.setEnabled(true);
                    if (r3.A0E.length() > editable.length()) {
                        String str4 = r3.A0E;
                        substring = str4.substring(0, str4.length() - 1);
                        r3.A0E = substring;
                        return;
                    }
                    char charAt = editable.toString().charAt(editable.length() - 1);
                    if (charAt != 9679) {
                        String concat = r3.A0E.concat(AnonymousClass8BW.A0l("", AnonymousClass000.A10(), charAt));
                        r3.A0E = concat;
                        r3.A0G.setText(concat.replaceAll(".", "●"));
                        return;
                    }
                    r3.A0G.setSelection(editable.length());
                    return;
                }
                AnonymousClass8BS.A14(resources, button, i);
                substring = editable.toString();
                r3.A0E = substring;
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        if (r1.matches("^[a-zA-Z0-9\\s]*$") == false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0065;
                case 5: goto L_0x0005;
                case 6: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0020
            java.lang.Object r2 = r6.A01
            X.8Do r2 = (X.AnonymousClass8Do) r2
            java.lang.String r1 = r2.A0F
            java.lang.String r0 = "CARDDETAILS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0020
            android.widget.Button r1 = r2.A04
            r0 = 0
            r1.setVisibility(r0)
        L_0x0020:
            java.lang.Object r3 = r6.A01
            X.8Do r3 = (X.AnonymousClass8Do) r3
            X.B6S r0 = r3.A0H
            if (r0 == 0) goto L_0x0005
            org.npci.upi.security.pinactivitycomponent.widget.FormItemEditText r2 = r3.A0G
            android.text.Editable r0 = r2.getText()
            if (r0 == 0) goto L_0x0005
            int r1 = X.AnonymousClass3Ma.A03(r2)
            int r0 = r3.A00
            if (r1 < r0) goto L_0x0005
            X.B6S r4 = r3.A0H
            int r1 = r3.A01
            android.text.Editable r0 = r2.getText()
            r0.toString()
            org.npci.upi.security.pinactivitycomponent.w r4 = (org.npci.upi.security.pinactivitycomponent.w) r4
            int r2 = r4.A00
            r0 = -1
            if (r2 == r0) goto L_0x004c
            if (r2 == r1) goto L_0x0050
        L_0x004c:
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x0005
        L_0x0050:
            java.util.ArrayList r1 = r4.A04
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x0058
            int r2 = r2 + -1
        L_0x0058:
            int r0 = X.AnonymousClass8BY.A04(r1, r4, r2)
            X.8Do r3 = X.AnonymousClass8BR.A1C(r1, r0)
            android.os.CountDownTimer r0 = r4.A03
            if (r0 == 0) goto L_0x00ac
            goto L_0x00a9
        L_0x0065:
            java.lang.String r1 = r7.toString()
            java.lang.Object r5 = r6.A01
            com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment r5 = (com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment) r5
            java.lang.String r0 = r5.A0C
            boolean r0 = r0.equals(r1)
            r4 = 1
            r3 = r0 ^ 1
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = "^[a-zA-Z0-9\\s]*$"
            boolean r0 = r1.matches(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0082
        L_0x0081:
            r2 = 0
        L_0x0082:
            com.whatsapp.WaTextView r1 = r5.A02
            r0 = 0
            if (r2 == 0) goto L_0x0088
            r0 = 4
        L_0x0088:
            r1.setVisibility(r0)
            if (r2 != 0) goto L_0x0095
            com.whatsapp.WaTextView r1 = r5.A02
            r0 = 2131893627(0x7f121d7b, float:1.9422036E38)
            r1.setText(r0)
        L_0x0095:
            com.whatsapp.wds.components.button.WDSButton r0 = r5.A0B
            if (r3 == 0) goto L_0x009f
            if (r2 == 0) goto L_0x009f
        L_0x009b:
            r0.setEnabled(r4)
            return
        L_0x009f:
            r4 = 0
            goto L_0x009b
        L_0x00a1:
            java.lang.Object r0 = r6.A01
            com.whatsapp.backup.encryptedbackup.PasswordInputFragment r0 = (com.whatsapp.backup.encryptedbackup.PasswordInputFragment) r0
            r0.A28()
            return
        L_0x00a9:
            r0.cancel()     // Catch:{ Exception -> 0x00ac }
        L_0x00ac:
            r1 = 0
            r3.A01()
            java.lang.String r0 = ""
            r3.A02(r0, r1)
            X.1FL r1 = r4.A1B()
            r0 = 2131232353(0x7f080661, float:1.8080813E38)
            android.graphics.drawable.Drawable r2 = X.C24261Jm.A00(r1, r0)
            r1 = 1
            if (r2 == 0) goto L_0x00c8
            android.widget.ImageView r0 = r3.A05
            r0.setImageDrawable(r2)
        L_0x00c8:
            android.widget.ImageView r0 = r3.A05
            r3.A00(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r4.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AF3.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
