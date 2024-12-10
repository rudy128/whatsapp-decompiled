package com.whatsapp.payments.ui;

import X.A3V;
import X.AFO;
import X.AFX;
import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass129;
import X.AnonymousClass1FD;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BR;
import X.AnonymousClass8BX;
import X.AnonymousClass9AL;
import X.B13;
import X.B14;
import X.B15;
import X.B16;
import X.C177659Ab;
import X.C18030ve;
import X.C18070vi;
import X.C195299t7;
import X.C20315AFx;
import X.C20339AGv;
import X.C21422Ajp;
import X.C21426Ajt;
import X.C36401np;
import X.C39401t1;
import X.C72453Mb;
import X.C89614ck;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableString;
import android.view.View;
import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaEditText;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import java.util.List;

public final class BrazilPaymentMethodAddPixBottomSheet extends Hilt_BrazilPaymentMethodAddPixBottomSheet {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public AnonymousClass11C A02;
    public C18030ve A03;
    public AnonymousClass1LU A04;
    public BrazilAddPixKeyViewModel A05;
    public AnonymousClass129 A06;
    public C36401np A07;
    public AnonymousClass00H A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;

    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Object, X.4rF] */
    public void A21(Bundle bundle, View view) {
        String str;
        int i;
        C89614ck r2;
        String str2;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A0E = AnonymousClass8BR.A0y(bundle2);
            bundle2.getString("previous_screen");
            this.A09 = bundle2.getString("campaign_id");
            this.A0A = bundle2.getString("extra_pix_info_key_credential_id");
            this.A0F = bundle2.getBoolean("extra_is_edit_mode_enabled");
            this.A0C = bundle2.getString("pix_info_key_type");
            this.A0D = bundle2.getString("pix_info_key_value");
            this.A0B = bundle2.getString("pix_info_display_name");
        }
        AFO.A00(AnonymousClass1HF.A06(view2, 2131429138), this, 0);
        TextView A0E2 = AnonymousClass3Ma.A0E(view2, 2131428379);
        if (this.A0F) {
            A0E2.setText(2131887358);
        }
        AnonymousClass3Ma.A19(AnonymousClass1HF.A06(view2, 2131431965), this, 49);
        TextEmojiLabel A0c = C72453Mb.A0c(view2, 2131428377);
        BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = this.A05;
        if (brazilAddPixKeyViewModel == null) {
            str = "brazilAddPixKeyViewModel";
        } else {
            if (brazilAddPixKeyViewModel.A07.A02("custom_payment_method_linking").A0G("custom_payment_method_tos")) {
                A0c.setText(2131887355);
            } else {
                C36401np r12 = this.A07;
                if (r12 != null) {
                    Runnable[] runnableArr = new Runnable[5];
                    runnableArr[0] = new C21426Ajt(this, 30);
                    runnableArr[1] = new C21426Ajt(this, 31);
                    runnableArr[2] = new C21426Ajt(this, 32);
                    C21422Ajp.A00(runnableArr, 28, 3);
                    runnableArr[4] = new C21426Ajt(this, 33);
                    SpannableString A042 = r12.A04(A0c.getContext(), A1H(2131887354), runnableArr, new String[]{"fb-tos", "wa-tos", "fb-privacy-policy", "wa-privacy-policy"}, new String[]{"https://transparency.fb.com/es-la/policies/other-policies/terms-of-service", "https://www.whatsapp.com/legal/merchant-terms/", "https://www.facebook.com/privacy/policy/", "https://www.whatsapp.com/legal/payments/privacy-policy"});
                    Rect rect = C39401t1.A0A;
                    AnonymousClass11C r22 = this.A02;
                    if (r22 != null) {
                        AnonymousClass3Ma.A1K(A0c, r22);
                        C18030ve r23 = this.A03;
                        if (r23 != null) {
                            AnonymousClass3Ma.A1L(r23, A0c);
                            A0c.setText(A042);
                        } else {
                            str = "abProps";
                        }
                    } else {
                        str = "systemServices";
                    }
                } else {
                    str = "linkifier";
                }
            }
            WaEditText waEditText = (WaEditText) C18070vi.A05(view2, 2131428384);
            AbsSpinner absSpinner = (AbsSpinner) C18070vi.A05(view2, 2131428382);
            TextInputLayout textInputLayout = (TextInputLayout) C18070vi.A05(view2, 2131428385);
            WaEditText waEditText2 = (WaEditText) C18070vi.A05(view2, 2131428381);
            waEditText2.setText("+55");
            ? obj = new Object();
            C195299t7[] r24 = new C195299t7[5];
            r24[0] = new C195299t7("CPF", AnonymousClass3MY.A0n(this, 2131887376), "###.###.###-##", 2, 14);
            r24[1] = new C195299t7("CNPJ", AnonymousClass3MY.A0n(this, 2131887375), "##.###.###/####-##", 2, 18);
            r24[2] = new C195299t7("EMAIL", AnonymousClass3MY.A0n(this, 2131887377), (String) null, 32, 77);
            r24[3] = new C195299t7("EVP", AnonymousClass3MY.A0n(this, 2131887378), (String) null, 1, 36);
            List A0O = C18070vi.A0O(new C195299t7("PHONE", AnonymousClass3MY.A0n(this, 2131887379), "## ####-######", 2, 14), r24, 4);
            String str3 = this.A0C;
            if (str3 != null) {
                int size = A0O.size();
                i = 0;
                while (true) {
                    if (i < size) {
                        if (C18070vi.A18(((C195299t7) A0O.get(i)).A03, str3)) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            i = AnonymousClass3MX.A01(A0O);
            absSpinner.setAdapter(new ArrayAdapter(A14(), 17367049, A0O));
            absSpinner.setOnItemSelectedListener(new C20315AFx(waEditText, waEditText2, this, A0O, obj, i));
            waEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(((C195299t7) A0O.get(i)).A01)});
            AnonymousClass9AL.A00(waEditText, this, 4);
            String str4 = ((C195299t7) A0O.get(i)).A02;
            if (str4 == null) {
                r2 = null;
            } else {
                r2 = new C89614ck(waEditText, str4);
            }
            obj.element = r2;
            if (r2 != null) {
                waEditText.addTextChangedListener(r2);
            }
            AFX.A00(waEditText, this, 7);
            if (this.A0F && this.A0D != null) {
                String str5 = this.A0C;
                if (str5 != null) {
                    BrazilAddPixKeyViewModel brazilAddPixKeyViewModel2 = this.A05;
                    if (brazilAddPixKeyViewModel2 != null) {
                        brazilAddPixKeyViewModel2.A0W(str5);
                    }
                    C18070vi.A11("brazilAddPixKeyViewModel");
                    throw null;
                }
                String str6 = this.A0C;
                C18070vi.A0z(str6, "null cannot be cast to non-null type kotlin.String");
                String str7 = this.A0D;
                C18070vi.A0z(str7, "null cannot be cast to non-null type kotlin.String");
                waEditText.setText(A3V.A01(str6, str7));
            }
            absSpinner.setSelection(i);
            BrazilAddPixKeyViewModel brazilAddPixKeyViewModel3 = this.A05;
            if (brazilAddPixKeyViewModel3 != null) {
                C20339AGv.A00(A1G(), brazilAddPixKeyViewModel3.A03, new B15(textInputLayout, this), 34);
                TextInputLayout textInputLayout2 = (TextInputLayout) C18070vi.A05(view2, 2131428387);
                TextView A0E3 = AnonymousClass3Ma.A0E(view2, 2131428386);
                BrazilAddPixKeyViewModel brazilAddPixKeyViewModel4 = this.A05;
                if (brazilAddPixKeyViewModel4 == null) {
                    C18070vi.A11("brazilAddPixKeyViewModel");
                    throw null;
                }
                C20339AGv.A00(A1G(), brazilAddPixKeyViewModel4.A02, new B16(textInputLayout2, this), 34);
                AnonymousClass9AL.A00(A0E3, this, 5);
                AFX.A00(A0E3, this, 8);
                if (this.A0F && (str2 = this.A0B) != null) {
                    A0E3.setText(str2);
                }
                WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) C18070vi.A05(view2, 2131428375);
                int i2 = 2131898748;
                if (this.A0F) {
                    i2 = 2131887371;
                }
                waButtonWithLoader.setButtonText(i2);
                waButtonWithLoader.setEnabled(false);
                BrazilAddPixKeyViewModel brazilAddPixKeyViewModel5 = this.A05;
                if (brazilAddPixKeyViewModel5 != null) {
                    C20339AGv.A00(A1G(), brazilAddPixKeyViewModel5.A01, new B13(waButtonWithLoader, this), 34);
                    BrazilAddPixKeyViewModel brazilAddPixKeyViewModel6 = this.A05;
                    if (brazilAddPixKeyViewModel6 != null) {
                        C20339AGv.A00(A1G(), brazilAddPixKeyViewModel6.A00, new B14(waButtonWithLoader, this), 34);
                        waButtonWithLoader.A00 = new C177659Ab(this, 26);
                        BrazilAddPixKeyViewModel brazilAddPixKeyViewModel7 = this.A05;
                        if (brazilAddPixKeyViewModel7 == null) {
                            C18070vi.A11("brazilAddPixKeyViewModel");
                            throw null;
                        }
                        brazilAddPixKeyViewModel7.A0U((Integer) null, (String) null, this.A0E, this.A09, 0);
                        return;
                    }
                }
                C18070vi.A11("brazilAddPixKeyViewModel");
                throw null;
            }
            C18070vi.A11("brazilAddPixKeyViewModel");
            throw null;
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        AnonymousClass1FL A1B = A1B();
        AnonymousClass1FD r0 = this;
        if (A1B instanceof BrazilPaymentPixOnboardingActivity) {
            C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivity");
            r0 = (BrazilPaymentPixOnboardingActivity) A1B;
        }
        this.A05 = AnonymousClass8BX.A0L(r0);
    }

    public int A2F() {
        return 2131626379;
    }
}
