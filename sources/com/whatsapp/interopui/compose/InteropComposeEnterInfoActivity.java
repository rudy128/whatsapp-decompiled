package com.whatsapp.interopui.compose;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1K3;
import X.AnonymousClass1KB;
import X.AnonymousClass1LA;
import X.AnonymousClass1LU;
import X.AnonymousClass1VU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass4SJ;
import X.AnonymousClass4qP;
import X.AnonymousClass70Q;
import X.C000200d;
import X.C137506vZ;
import X.C1599386l;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C77583qd;
import X.C89514ca;
import X.C89954dI;
import X.C91014f0;
import X.C91644g1;
import X.C99154sM;
import X.C99234sU;
import X.C99244sV;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.util.Locale;

public final class InteropComposeEnterInfoActivity extends AnonymousClass1FY implements C1599386l {
    public ProgressDialog A00;
    public ViewStub A01;
    public TextInputLayout A02;
    public TextInputLayout A03;
    public AnonymousClass1LA A04;
    public WaEditText A05;
    public WaEditText A06;
    public WaEditText A07;
    public WaEditText A08;
    public C89514ca A09;
    public AnonymousClass1VU A0A;
    public C77583qd A0B;
    public AnonymousClass1K3 A0C;
    public WDSButton A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public boolean A0G;
    public final C18100vl A0H;

    public InteropComposeEnterInfoActivity() {
        this(0);
        this.A0H = C99154sM.A01(this, 27);
    }

    public void BqP(String str) {
        AnonymousClass00H r0 = this.A0F;
        if (r0 != null) {
            r0.get();
            startActivityForResult(AnonymousClass1LU.A1S(this, str, (String) null), 0);
            return;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public void A2y() {
        if (!this.A0G) {
            this.A0G = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A04 = C72453Mb.A0b(A0L);
            this.A0C = AnonymousClass3Ma.A0v(A0L);
            this.A0E = C000200d.A00(r1.A2q);
            this.A0A = AnonymousClass3MZ.A0s(A0L);
            this.A0F = AnonymousClass3MW.A0s(A0L);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        InputMethodManager inputMethodManager;
        if (i == 0) {
            C77583qd r4 = this.A0B;
            if (r4 == null) {
                C18070vi.A11("interopPhoneNumberController");
                throw null;
            }
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("iso");
                String stringExtra2 = intent.getStringExtra("cc");
                if (!(stringExtra == null || stringExtra2 == null)) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    String upperCase = stringExtra.toUpperCase(Locale.ROOT);
                    C18070vi.A0X(upperCase);
                    A10.append(upperCase);
                    r4.A00.setText(AnonymousClass001.A1H(" +", stringExtra2, A10));
                    r4.A07(stringExtra);
                }
            }
            WaEditText waEditText = r4.A03;
            waEditText.requestFocus();
            Editable text = waEditText.getText();
            if (text != null) {
                waEditText.setSelection(text.length());
            }
            Object systemService = r4.A06.getSystemService("input_method");
            if ((systemService instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) systemService) != null && !inputMethodManager.isAcceptingText()) {
                inputMethodManager.toggleSoftInput(1, 1);
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.3qd, X.70Q] */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("integratorInfo");
        if (parcelableExtra != null) {
            this.A09 = (C89514ca) parcelableExtra;
            setContentView(2131624061);
            this.A01 = AnonymousClass3MX.A0H(this, 2131436615);
            WDSButton wDSButton = (WDSButton) findViewById(2131429322);
            this.A0D = wDSButton;
            if (wDSButton != null) {
                wDSButton.setEnabled(false);
                this.A00 = new ProgressDialog(this);
                C89514ca r0 = this.A09;
                if (r0 != null) {
                    int intValue = r0.A01.intValue();
                    if (intValue == 0) {
                        ViewStub viewStub = this.A01;
                        if (viewStub != null) {
                            viewStub.setLayoutResource(2131625731);
                            ViewStub viewStub2 = this.A01;
                            if (viewStub2 != null) {
                                View inflate = viewStub2.inflate();
                                TextInputLayout textInputLayout = (TextInputLayout) AnonymousClass1HF.A06(inflate, 2131429325);
                                this.A03 = textInputLayout;
                                if (textInputLayout == null) {
                                    str = "userNameEditTextLayout";
                                    C18070vi.A11(str);
                                    throw null;
                                }
                                textInputLayout.setHint(2131888687);
                                this.A07 = (WaEditText) AnonymousClass1HF.A06(inflate, 2131429324);
                            }
                        }
                        C18070vi.A11("userIdViewStub");
                        throw null;
                    } else if (intValue == 1) {
                        ViewStub viewStub3 = this.A01;
                        if (viewStub3 != null) {
                            viewStub3.setLayoutResource(2131625732);
                            ViewStub viewStub4 = this.A01;
                            if (viewStub4 != null) {
                                View inflate2 = viewStub4.inflate();
                                C18070vi.A0b(inflate2);
                                AnonymousClass1KB r11 = this.A05;
                                C18070vi.A0W(r11);
                                AnonymousClass10I r1 = this.A05;
                                C18070vi.A0W(r1);
                                AnonymousClass1K3 r15 = this.A0C;
                                if (r15 != null) {
                                    AnonymousClass11C r13 = this.A08;
                                    C18070vi.A0W(r13);
                                    C18000vb r14 = this.A00;
                                    C18070vi.A0W(r14);
                                    AnonymousClass1LA r10 = this.A04;
                                    if (r10 != null) {
                                        C18070vi.A0d(inflate2, 1);
                                        ? r7 = new AnonymousClass70Q(this, inflate2, r10, r11, this, r13, r14, r15, r1);
                                        r7.A03 = (WaEditText) AnonymousClass1HF.A06(inflate2, 2131433781);
                                        r7.A02 = (TextInputLayout) AnonymousClass1HF.A06(inflate2, 2131433786);
                                        r7.A00 = (EditText) AnonymousClass1HF.A06(inflate2, 2131429684);
                                        LinearLayout linearLayout = (LinearLayout) inflate2.findViewById(2131428939);
                                        r7.A01 = linearLayout;
                                        WaEditText waEditText = r7.A03;
                                        TextInputLayout textInputLayout2 = r7.A02;
                                        EditText editText = r7.A00;
                                        C18070vi.A0d(waEditText, 0);
                                        C18070vi.A0p(textInputLayout2, editText, linearLayout);
                                        r7.A04 = waEditText;
                                        r7.A05 = null;
                                        r7.A01 = editText;
                                        r7.A03 = textInputLayout2;
                                        r7.A02 = linearLayout;
                                        r7.A06();
                                        this.A0B = r7;
                                        this.A08 = (WaEditText) AnonymousClass1HF.A06(inflate2, 2131433781);
                                        this.A05 = (WaEditText) AnonymousClass1HF.A06(inflate2, 2131429684);
                                    } else {
                                        str = "countryPhoneInfo";
                                    }
                                } else {
                                    str = "countryUtils";
                                }
                                C18070vi.A11(str);
                                throw null;
                            }
                        }
                        C18070vi.A11("userIdViewStub");
                        throw null;
                    } else if (intValue == 2) {
                        ViewStub viewStub5 = this.A01;
                        if (viewStub5 != null) {
                            viewStub5.setLayoutResource(2131625730);
                            ViewStub viewStub6 = this.A01;
                            if (viewStub6 != null) {
                                View inflate3 = viewStub6.inflate();
                                TextInputLayout textInputLayout3 = (TextInputLayout) AnonymousClass1HF.A06(inflate3, 2131429325);
                                this.A02 = textInputLayout3;
                                if (textInputLayout3 == null) {
                                    str = "userEmailEditTextLayout";
                                    C18070vi.A11(str);
                                    throw null;
                                }
                                textInputLayout3.setHint(2131888685);
                                this.A06 = (WaEditText) AnonymousClass1HF.A06(inflate3, 2131429324);
                            }
                        }
                        C18070vi.A11("userIdViewStub");
                        throw null;
                    } else {
                        throw AnonymousClass3MW.A14();
                    }
                    Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0H(this, 2131429323);
                    super.setSupportActionBar(toolbar);
                    C72473Md.A16(getSupportActionBar());
                    AnonymousClass3NL.A02(toolbar.getContext(), toolbar, this.A00, 2131231675);
                    toolbar.A0Q(toolbar.getContext(), 2132083960);
                    C137506vZ.A00(toolbar);
                    WDSTextLayout wDSTextLayout = (WDSTextLayout) findViewById(2131431834);
                    C89514ca r02 = this.A09;
                    if (r02 != null) {
                        wDSTextLayout.setHeadlineText(r02.A03);
                        int A012 = AnonymousClass3MW.A01(getResources(), 2131166050);
                        AnonymousClass00H r03 = this.A0E;
                        if (r03 != null) {
                            AnonymousClass4SJ r2 = (AnonymousClass4SJ) r03.get();
                            C89514ca r04 = this.A09;
                            if (r04 != null) {
                                r2.A01(new AnonymousClass4qP(this, wDSTextLayout, A012), r04.A04);
                                C99234sU.A00(this.A07, this, 20);
                                C99234sU.A00(this.A06, this, 21);
                                C99234sU.A00(this.A08, this, 22);
                                WDSButton wDSButton2 = this.A0D;
                                if (wDSButton2 != null) {
                                    C89954dI.A00(wDSButton2, this, 24);
                                    C91644g1.A00(this, ((InteropComposeEnterInfoViewModel) this.A0H.getValue()).A00, C99244sV.A00(this, 33), 39);
                                    return;
                                }
                            }
                        } else {
                            str = "imageLoader";
                            C18070vi.A11(str);
                            throw null;
                        }
                    }
                }
                C18070vi.A11("integratorInfo");
                throw null;
            }
            str = "createChatButton";
            C18070vi.A11(str);
            throw null;
        }
        throw C17880vN.A0g();
    }

    public InteropComposeEnterInfoActivity(int i) {
        this.A0G = false;
        C91014f0.A00(this, 29);
    }
}
