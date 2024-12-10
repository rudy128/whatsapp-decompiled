package com.whatsapp.payments.ui.compliance;

import X.A2C;
import X.AFT;
import X.AZ6;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass1L4;
import X.AnonymousClass1LC;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Z9;
import X.AnonymousClass8BV;
import X.AnonymousClass9AL;
import X.BBU;
import X.BD4;
import X.C171858sO;
import X.C18030ve;
import X.C18070vi;
import X.C196449v5;
import X.C20112A7u;
import X.C20298AFg;
import X.C21426Ajt;
import X.C21427Aju;
import X.C36401np;
import X.C39401t1;
import X.C72453Mb;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaEditText;
import com.whatsapp.base.WaFragment;
import com.whatsapp.payments.ui.BrazilHostedPaymentPageLegalNameBottomSheetFragment;
import com.whatsapp.payments.ui.P2mLiteConfirmLegalNameBottomSheetFragment;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class ConfirmLegalNameBottomSheetFragment extends WaFragment {
    public View A00;
    public LinearLayout A01;
    public ProgressBar A02;
    public ScrollView A03;
    public TextEmojiLabel A04;
    public WaEditText A05;
    public AnonymousClass1LC A06;
    public AnonymousClass11C A07;
    public C18030ve A08;
    public A2C A09;
    public BBU A0A;
    public AnonymousClass1L4 A0B;
    public C36401np A0C;
    public AnonymousClass10I A0D;
    public WDSButton A0E;
    public final ViewTreeObserver.OnGlobalLayoutListener A0F = new C20298AFg(this);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        Context A1n;
        String A1H;
        int A002;
        Runnable ajt;
        String str2;
        CharSequence A062;
        String str3;
        C18070vi.A0d(layoutInflater, 0);
        boolean z = false;
        this.A00 = AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131624618, false);
        TextEmojiLabel A0c = C72453Mb.A0c(A26(), 2131429348);
        C18070vi.A0d(A0c, 0);
        this.A04 = A0c;
        WaEditText waEditText = (WaEditText) C18070vi.A05(A26(), 2131431028);
        C18070vi.A0d(waEditText, 0);
        this.A05 = waEditText;
        ProgressBar progressBar = (ProgressBar) C18070vi.A05(A26(), 2131432166);
        C18070vi.A0d(progressBar, 0);
        this.A02 = progressBar;
        LinearLayout linearLayout = (LinearLayout) C18070vi.A05(A26(), 2131429349);
        C18070vi.A0d(linearLayout, 0);
        this.A01 = linearLayout;
        TextEmojiLabel textEmojiLabel = this.A04;
        if (textEmojiLabel != null) {
            Rect rect = C39401t1.A0A;
            AnonymousClass11C r1 = this.A07;
            if (r1 != null) {
                AnonymousClass3Ma.A1K(textEmojiLabel, r1);
                TextEmojiLabel textEmojiLabel2 = this.A04;
                if (textEmojiLabel2 != null) {
                    C18030ve r12 = this.A08;
                    if (r12 != null) {
                        AnonymousClass3Ma.A1L(r12, textEmojiLabel2);
                        TextEmojiLabel textEmojiLabel3 = this.A04;
                        if (textEmojiLabel3 != null) {
                            if (this instanceof IndiaConfirmLegalNameBottomSheetFragment) {
                                C18030ve r3 = this.A08;
                                if (r3 != null) {
                                    String optString = r3.A0J(9561).optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                                    if (optString == null || optString.length() == 0) {
                                        str3 = "";
                                    } else {
                                        AnonymousClass1LC r13 = this.A06;
                                        if (r13 != null) {
                                            str3 = C18070vi.A0H(r13.A00(optString));
                                        } else {
                                            str = "waLinkFactory";
                                        }
                                    }
                                    C36401np r5 = this.A0C;
                                    if (r5 != null) {
                                        Runnable[] runnableArr = {new C21427Aju(this, 26)};
                                        A062 = r5.A04(A1n(), A1H(2131893470), runnableArr, new String[]{"p2m-compliance-learn-more"}, new String[]{str3});
                                    }
                                    str = "linkifier";
                                }
                            } else {
                                boolean z2 = this instanceof P2mLiteConfirmLegalNameBottomSheetFragment;
                                C36401np r4 = this.A0C;
                                if (z2) {
                                    if (r4 != null) {
                                        A1n = A1n();
                                        A1H = A1H(2131899295);
                                        A002 = AnonymousClass4Z9.A00(A1n(), 2130971981);
                                        ajt = new C21427Aju(this, 12);
                                        str2 = "p2m-lite-desc-link";
                                    }
                                    str = "linkifier";
                                } else {
                                    if (r4 != null) {
                                        A1n = A1n();
                                        A1H = A1H(2131887367);
                                        A002 = AnonymousClass4Z9.A00(A1n(), 2130971981);
                                        ajt = new C21426Ajt(this, 11);
                                        str2 = "br-hpp-legal-name-link";
                                    }
                                    str = "linkifier";
                                }
                                A062 = r4.A06(A1n, ajt, A1H, str2, A002);
                            }
                            textEmojiLabel3.setText(A062);
                            WDSButton wDSButton = (WDSButton) C18070vi.A05(A26(), 2131429534);
                            C18070vi.A0d(wDSButton, 0);
                            this.A0E = wDSButton;
                            ScrollView scrollView = (ScrollView) C18070vi.A05(A26(), 2131429317);
                            C18070vi.A0d(scrollView, 0);
                            this.A03 = scrollView;
                            ViewTreeObserver viewTreeObserver = scrollView.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.addOnGlobalLayoutListener(this.A0F);
                            }
                            Fragment fragment = this.A0E;
                            C18070vi.A0z(fragment, "null cannot be cast to non-null type com.whatsapp.payments.ui.PaymentBottomSheet");
                            WaEditText waEditText2 = this.A05;
                            if (waEditText2 != null) {
                                AnonymousClass9AL.A00(waEditText2, this, 8);
                                WaEditText waEditText3 = this.A05;
                                if (waEditText3 != null) {
                                    if (AnonymousClass3MZ.A17(waEditText3).length() > 0) {
                                        z = true;
                                    }
                                    A28(z);
                                    WDSButton wDSButton2 = this.A0E;
                                    if (wDSButton2 != null) {
                                        AFT.A00(wDSButton2, this, fragment, 25);
                                        AFT.A00(C18070vi.A05(A26(), 2131429136), this, fragment, 26);
                                        return A26();
                                    }
                                    str = "continueButton";
                                }
                            }
                            str = "nameEditText";
                        }
                    }
                    str = "abProps";
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

    public void A1s() {
        ScrollView scrollView = this.A03;
        if (scrollView != null) {
            ViewTreeObserver viewTreeObserver = scrollView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this.A0F);
            }
            super.A1s();
            return;
        }
        C18070vi.A11("scrollView");
        throw null;
    }

    public final View A26() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        C18070vi.A11("rootView");
        throw null;
    }

    public void A27(Integer num, String str, String str2, int i) {
        String str3;
        Integer num2 = num;
        String str4 = str;
        int i2 = i;
        if (this instanceof IndiaConfirmLegalNameBottomSheetFragment) {
            IndiaConfirmLegalNameBottomSheetFragment indiaConfirmLegalNameBottomSheetFragment = (IndiaConfirmLegalNameBottomSheetFragment) this;
            AZ6 az6 = indiaConfirmLegalNameBottomSheetFragment.A00;
            if (az6 != null) {
                az6.A0C(Integer.valueOf(i2), num2, str4, indiaConfirmLegalNameBottomSheetFragment.A03, indiaConfirmLegalNameBottomSheetFragment.A02, indiaConfirmLegalNameBottomSheetFragment.A01, true);
                return;
            }
            str3 = "indiaUpiFieldStatsLogger";
        } else {
            String str5 = str2;
            if (this instanceof P2mLiteConfirmLegalNameBottomSheetFragment) {
                P2mLiteConfirmLegalNameBottomSheetFragment p2mLiteConfirmLegalNameBottomSheetFragment = (P2mLiteConfirmLegalNameBottomSheetFragment) this;
                AnonymousClass00H r0 = p2mLiteConfirmLegalNameBottomSheetFragment.A01;
                if (r0 != null) {
                    ((BD4) r0.get()).BiJ(C196449v5.A00(), num2, str4, str5, p2mLiteConfirmLegalNameBottomSheetFragment.A03, p2mLiteConfirmLegalNameBottomSheetFragment.A02, i2, true, true, false);
                    return;
                }
                str3 = "p2mLiteEventLogger";
            } else {
                BrazilHostedPaymentPageLegalNameBottomSheetFragment brazilHostedPaymentPageLegalNameBottomSheetFragment = (BrazilHostedPaymentPageLegalNameBottomSheetFragment) this;
                C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
                A032.A07("payment_method", "hpp");
                String A0H = C18070vi.A0H(A032);
                BD4 bd4 = brazilHostedPaymentPageLegalNameBottomSheetFragment.A00;
                if (bd4 != null) {
                    C171858sO A0D2 = AnonymousClass8BV.A0D(bd4, i2);
                    A0D2.A07 = num;
                    A0D2.A0b = str4;
                    A0D2.A0a = str5;
                    A0D2.A0Z = A0H;
                    BD4 bd42 = brazilHostedPaymentPageLegalNameBottomSheetFragment.A00;
                    if (bd42 != null) {
                        bd42.BiH(A0D2);
                        return;
                    }
                }
                C18070vi.A11("paymentFieldStatsLogger");
                throw null;
            }
        }
        C18070vi.A11(str3);
        throw null;
    }

    public final void A28(boolean z) {
        WDSButton wDSButton = this.A0E;
        if (wDSButton != null) {
            wDSButton.setEnabled(z);
        } else {
            C18070vi.A11("continueButton");
            throw null;
        }
    }
}
