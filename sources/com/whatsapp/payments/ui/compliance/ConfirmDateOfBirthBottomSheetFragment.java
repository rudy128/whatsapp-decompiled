package com.whatsapp.payments.ui.compliance;

import X.A9H;
import X.AFQ;
import X.AFT;
import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass1LC;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Z9;
import X.AnonymousClass8BT;
import X.AnonymousClass8BV;
import X.AnonymousClass8Dv;
import X.AnonymousClass9AL;
import X.B97;
import X.BD4;
import X.C171858sO;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C196449v5;
import X.C20112A7u;
import X.C21426Ajt;
import X.C21427Aju;
import X.C36401np;
import X.C39401t1;
import X.C72453Mb;
import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.base.WaFragment;
import com.whatsapp.payments.ui.BrazilHostedPaymentPageDateOfBirthBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteConfirmDateOfBirthBottomSheetFragment;
import com.whatsapp.wds.components.button.WDSButton;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class ConfirmDateOfBirthBottomSheetFragment extends WaFragment {
    public ProgressBar A00;
    public TextEmojiLabel A01;
    public WaEditText A02;
    public AnonymousClass1LC A03;
    public AnonymousClass11C A04;
    public C18000vb A05;
    public C18030ve A06;
    public B97 A07;
    public C36401np A08;
    public WDSButton A09;
    public Calendar A0A;
    public final DatePickerDialog.OnDateSetListener A0B = new A9H(this, 1);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        String A0n;
        C36401np r4;
        Context A1n;
        int A002;
        Runnable ajt;
        String str2;
        C18070vi.A0d(layoutInflater, 0);
        View A0B2 = AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624614, false);
        TextEmojiLabel A0c = C72453Mb.A0c(A0B2, 2131429343);
        C18070vi.A0d(A0c, 0);
        this.A01 = A0c;
        ProgressBar progressBar = (ProgressBar) C18070vi.A05(A0B2, 2131432166);
        C18070vi.A0d(progressBar, 0);
        this.A00 = progressBar;
        WaEditText waEditText = (WaEditText) C18070vi.A05(A0B2, 2131430103);
        C18070vi.A0d(waEditText, 0);
        this.A02 = waEditText;
        WDSButton wDSButton = (WDSButton) C18070vi.A05(A0B2, 2131429534);
        C18070vi.A0d(wDSButton, 0);
        this.A09 = wDSButton;
        WaEditText waEditText2 = this.A02;
        if (waEditText2 != null) {
            waEditText2.setInputType(0);
            WaEditText waEditText3 = this.A02;
            if (waEditText3 != null) {
                waEditText3.setFocusable(false);
                TextEmojiLabel textEmojiLabel = this.A01;
                if (textEmojiLabel != null) {
                    Rect rect = C39401t1.A0A;
                    AnonymousClass11C r1 = this.A04;
                    if (r1 != null) {
                        AnonymousClass3Ma.A1K(textEmojiLabel, r1);
                        TextEmojiLabel textEmojiLabel2 = this.A01;
                        if (textEmojiLabel2 != null) {
                            C18030ve r12 = this.A06;
                            if (r12 != null) {
                                AnonymousClass3Ma.A1L(r12, textEmojiLabel2);
                                TextEmojiLabel textEmojiLabel3 = this.A01;
                                if (textEmojiLabel3 != null) {
                                    if (this instanceof P2mLiteConfirmDateOfBirthBottomSheetFragment) {
                                        r4 = this.A08;
                                        if (r4 != null) {
                                            A1n = A1n();
                                            A0n = A1H(2131899294);
                                            A002 = AnonymousClass4Z9.A00(A1n(), 2130971981);
                                            ajt = new C21427Aju(this, 11);
                                            str2 = "p2m-lite-desc-link";
                                        }
                                        C18070vi.A11("linkifier");
                                        throw null;
                                    }
                                    A0n = AnonymousClass3MY.A0n(this, 2131887357);
                                    r4 = this.A08;
                                    if (r4 != null) {
                                        A1n = A1n();
                                        A002 = AnonymousClass4Z9.A00(A1n(), 2130971981);
                                        ajt = new C21426Ajt(this, 10);
                                        str2 = "br-hpp-legal-dob-link";
                                    }
                                    C18070vi.A11("linkifier");
                                    throw null;
                                    textEmojiLabel3.setText(r4.A06(A1n, ajt, A0n, str2, A002));
                                    Fragment fragment = this.A0E;
                                    Calendar calendar = this.A0A;
                                    calendar.set(1, calendar.get(1) - 18);
                                    AnonymousClass8Dv r5 = new AnonymousClass8Dv(this.A0B, A14(), (Calendar) null, 2132083202, calendar.get(1), calendar.get(2), AnonymousClass8BT.A02(calendar));
                                    r5.A01.setMaxDate(calendar.getTimeInMillis());
                                    WaEditText waEditText4 = this.A02;
                                    if (waEditText4 != null) {
                                        AFQ.A00(waEditText4, r5, 40);
                                        WaEditText waEditText5 = this.A02;
                                        if (waEditText5 != null) {
                                            AnonymousClass9AL.A00(waEditText5, this, 7);
                                            WaEditText waEditText6 = this.A02;
                                            if (waEditText6 != null) {
                                                A27(A00(this, AnonymousClass3MZ.A17(waEditText6)));
                                                WDSButton wDSButton2 = this.A09;
                                                if (wDSButton2 != null) {
                                                    AFQ.A00(wDSButton2, this, 41);
                                                    AFT.A00(C18070vi.A05(A0B2, 2131429136), this, fragment, 24);
                                                    return A0B2;
                                                }
                                                C18070vi.A11("continueButton");
                                                throw null;
                                            }
                                            C18070vi.A11("dobEditText");
                                            throw null;
                                        }
                                        C18070vi.A11("dobEditText");
                                        throw null;
                                    }
                                    C18070vi.A11("dobEditText");
                                    throw null;
                                }
                            } else {
                                str = "abProps";
                            }
                        }
                    } else {
                        str = "systemServices";
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                str = "descText";
                C18070vi.A11(str);
                throw null;
            }
        }
        str = "dobEditText";
        C18070vi.A11(str);
        throw null;
    }

    public void A26(Integer num, String str, String str2, int i) {
        Integer num2 = num;
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        if (this instanceof P2mLiteConfirmDateOfBirthBottomSheetFragment) {
            P2mLiteConfirmDateOfBirthBottomSheetFragment p2mLiteConfirmDateOfBirthBottomSheetFragment = (P2mLiteConfirmDateOfBirthBottomSheetFragment) this;
            AnonymousClass00H r0 = p2mLiteConfirmDateOfBirthBottomSheetFragment.A01;
            if (r0 != null) {
                ((BD4) r0.get()).BiJ(C196449v5.A00(), num2, str3, str4, p2mLiteConfirmDateOfBirthBottomSheetFragment.A03, p2mLiteConfirmDateOfBirthBottomSheetFragment.A02, i2, true, true, false);
                return;
            }
            C18070vi.A11("p2mLiteEventLogger");
            throw null;
        }
        BrazilHostedPaymentPageDateOfBirthBottomSheetFragment brazilHostedPaymentPageDateOfBirthBottomSheetFragment = (BrazilHostedPaymentPageDateOfBirthBottomSheetFragment) this;
        C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
        A032.A07("payment_method", "hpp");
        String A0H = C18070vi.A0H(A032);
        BD4 bd4 = brazilHostedPaymentPageDateOfBirthBottomSheetFragment.A00;
        if (bd4 != null) {
            C171858sO A0D = AnonymousClass8BV.A0D(bd4, i2);
            A0D.A07 = num;
            A0D.A0b = str3;
            A0D.A0a = str4;
            A0D.A0Z = A0H;
            BD4 bd42 = brazilHostedPaymentPageDateOfBirthBottomSheetFragment.A00;
            if (bd42 != null) {
                bd42.BiH(A0D);
                return;
            }
        }
        C18070vi.A11("paymentFieldStatsLogger");
        throw null;
    }

    public final void A27(boolean z) {
        WDSButton wDSButton = this.A09;
        if (wDSButton != null) {
            wDSButton.setEnabled(z);
        } else {
            C18070vi.A11("continueButton");
            throw null;
        }
    }

    public ConfirmDateOfBirthBottomSheetFragment() {
        Calendar instance = Calendar.getInstance();
        C18070vi.A0X(instance);
        this.A0A = instance;
    }

    public static final boolean A00(ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment, String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        if (length <= 0) {
            return true;
        }
        C18000vb r0 = confirmDateOfBirthBottomSheetFragment.A05;
        if (r0 != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", r0.A0N());
            simpleDateFormat.setLenient(false);
            try {
                simpleDateFormat.parse(str);
                return true;
            } catch (ParseException unused) {
                return false;
            }
        } else {
            AnonymousClass3MW.A1M();
            throw null;
        }
    }
}
