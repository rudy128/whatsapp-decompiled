package com.whatsapp.payments.ui;

import X.A3V;
import X.AnonymousClass1FD;
import X.AnonymousClass1FL;
import X.AnonymousClass1QS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BR;
import X.C18070vi;
import X.C194929sW;
import X.C19740yt;
import X.C20339AGv;
import X.C22235Azp;
import X.C39351sv;
import X.C43531zx;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.components.PixPaymentInfoView;
import com.whatsapp.payments.ui.viewmodel.BrazilSendPixKeyViewModel;
import com.whatsapp.wds.components.button.WDSButton;

public final class BrazilPixSendKeyBottomSheet extends Hilt_BrazilPixSendKeyBottomSheet {
    public WaTextView A00;
    public UserJid A01;
    public AnonymousClass1QS A02;
    public PixPaymentInfoView A03;
    public BrazilSendPixKeyViewModel A04;
    public WDSButton A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        this.A07 = A15().getString("extra_payment_name");
        this.A01 = UserJid.Companion.A04(A15().getString("extra_receiver_jid"));
        String A0y = AnonymousClass8BR.A0y(A15());
        String str2 = "";
        if (A0y == null) {
            A0y = str2;
        }
        this.A08 = A0y;
        String string = A15().getString("previous_screen");
        if (string == null) {
            string = str2;
        }
        this.A06 = string;
        String string2 = A15().getString("extra_pix_info_key_credential_id");
        if (string2 == null) {
            string2 = str2;
        }
        this.A09 = string2;
        String string3 = A15().getString("pix_info_key_type");
        if (string3 == null) {
            string3 = str2;
        }
        this.A0B = string3;
        String string4 = A15().getString("pix_info_display_name");
        if (string4 == null) {
            string4 = str2;
        }
        this.A0A = string4;
        String string5 = A15().getString("pix_info_key_value");
        if (string5 != null) {
            str2 = string5;
        }
        String str3 = this.A0B;
        if (str3 == null) {
            str = "pixKeyType";
        } else {
            String str4 = this.A0A;
            if (str4 == null) {
                str = "pixKeyDisplayName";
            } else {
                String str5 = this.A09;
                if (str5 == null) {
                    str = "pixKeyCredentialId";
                } else {
                    C194929sW r3 = new C194929sW(str3, str2, str4, str5);
                    this.A03 = (PixPaymentInfoView) view.findViewById(2131433869);
                    A01(r3, this);
                    WaTextView waTextView = (WaTextView) view.findViewById(2131431714);
                    this.A00 = waTextView;
                    String str6 = this.A07;
                    if (!(str6 == null || waTextView == null)) {
                        waTextView.setText(AnonymousClass3MY.A0o(this, str6, 0, 2131894615));
                    }
                    WDSButton A0r = AnonymousClass3MW.A0r(view, 2131435170);
                    this.A05 = A0r;
                    if (A0r != null) {
                        AnonymousClass3MY.A1E(A0r, r3, this, 18);
                    }
                    A00(r3, this);
                    BrazilSendPixKeyViewModel brazilSendPixKeyViewModel = this.A04;
                    if (brazilSendPixKeyViewModel == null) {
                        str = "brazilSendPixKeyViewModel";
                    } else {
                        String str7 = this.A08;
                        if (str7 == null) {
                            str = "referralScreen";
                        } else {
                            String str8 = this.A06;
                            if (str8 == null) {
                                str = "previousScreen";
                            } else {
                                brazilSendPixKeyViewModel.A0T((Integer) null, str7, str8, 0);
                                super.A21(bundle, view);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        C18070vi.A0d(dialogInterface, 0);
        BrazilSendPixKeyViewModel brazilSendPixKeyViewModel = this.A04;
        if (brazilSendPixKeyViewModel != null) {
            String str2 = this.A08;
            if (str2 == null) {
                str = "referralScreen";
            } else {
                String str3 = this.A06;
                if (str3 == null) {
                    str = "previousScreen";
                } else {
                    brazilSendPixKeyViewModel.A0T(1, str2, str3, 1);
                    BrazilSendPixKeyViewModel brazilSendPixKeyViewModel2 = this.A04;
                    if (brazilSendPixKeyViewModel2 != null) {
                        brazilSendPixKeyViewModel2.A00.A0E("dismissed");
                        super.onDismiss(dialogInterface);
                        return;
                    }
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        C18070vi.A11("brazilSendPixKeyViewModel");
        throw null;
    }

    public static final void A01(C194929sW r7, BrazilPixSendKeyBottomSheet brazilPixSendKeyBottomSheet) {
        TextEmojiLabel textEmojiLabel;
        TextEmojiLabel textEmojiLabel2;
        PixPaymentInfoView pixPaymentInfoView = brazilPixSendKeyBottomSheet.A03;
        if (!(pixPaymentInfoView == null || (textEmojiLabel2 = pixPaymentInfoView.A04) == null)) {
            textEmojiLabel2.setText(r7.A01);
        }
        PixPaymentInfoView pixPaymentInfoView2 = brazilPixSendKeyBottomSheet.A03;
        if (pixPaymentInfoView2 != null && (textEmojiLabel = pixPaymentInfoView2.A05) != null) {
            Context A14 = brazilPixSendKeyBottomSheet.A14();
            Object[] A1b = AnonymousClass3MW.A1b();
            Context A142 = brazilPixSendKeyBottomSheet.A14();
            String str = r7.A02;
            A1b[0] = A142.getString(A3V.A00(str));
            String str2 = r7.A03;
            AnonymousClass8BR.A1I(str2);
            A1b[1] = A3V.A01(str, str2);
            AnonymousClass3MY.A0y(A14, textEmojiLabel, A1b, 2131888299);
        }
    }

    public static final void A00(C194929sW r6, BrazilPixSendKeyBottomSheet brazilPixSendKeyBottomSheet) {
        WaTextView waTextView;
        int applyDimension = (int) TypedValue.applyDimension(1, 2.0f, AnonymousClass3MZ.A09(brazilPixSendKeyBottomSheet).getDisplayMetrics());
        int A002 = C19740yt.A00(brazilPixSendKeyBottomSheet.A14(), 2131103410);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(A002);
        PixPaymentInfoView pixPaymentInfoView = brazilPixSendKeyBottomSheet.A03;
        if (pixPaymentInfoView != null) {
            pixPaymentInfoView.A01.setBackground(gradientDrawable);
        }
        int A003 = C19740yt.A00(brazilPixSendKeyBottomSheet.A14(), 2131103233);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(TypedValue.applyDimension(1, 10.0f, AnonymousClass3MZ.A09(brazilPixSendKeyBottomSheet).getDisplayMetrics()));
        gradientDrawable2.setColor(A003);
        PixPaymentInfoView pixPaymentInfoView2 = brazilPixSendKeyBottomSheet.A03;
        if (pixPaymentInfoView2 != null) {
            pixPaymentInfoView2.A02.setBackground(gradientDrawable2);
        }
        int i = applyDimension * 4;
        PixPaymentInfoView pixPaymentInfoView3 = brazilPixSendKeyBottomSheet.A03;
        if (pixPaymentInfoView3 != null) {
            pixPaymentInfoView3.A02.setPadding(i, i, i, i);
        }
        PixPaymentInfoView pixPaymentInfoView4 = brazilPixSendKeyBottomSheet.A03;
        if (pixPaymentInfoView4 != null) {
            C43531zx.A03(pixPaymentInfoView4.A03, new C39351sv(applyDimension * 3, 0, 0, 0));
        }
        PixPaymentInfoView pixPaymentInfoView5 = brazilPixSendKeyBottomSheet.A03;
        if (pixPaymentInfoView5 != null) {
            pixPaymentInfoView5.setShowEditIcon(true);
        }
        PixPaymentInfoView pixPaymentInfoView6 = brazilPixSendKeyBottomSheet.A03;
        if (pixPaymentInfoView6 != null && (waTextView = pixPaymentInfoView6.A06) != null) {
            AnonymousClass3MY.A1E(waTextView, new C194929sW(r6.A02, r6.A03, r6.A01, r6.A00), brazilPixSendKeyBottomSheet, 19);
        }
    }

    public void A1z(Bundle bundle) {
        AnonymousClass1FD r1;
        super.A1z(bundle);
        AnonymousClass1FL A1B = A1B();
        if (A1B instanceof BrazilPaymentPixSendKeyActivity) {
            C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilPaymentPixSendKeyActivity");
            r1 = (BrazilPaymentPixSendKeyActivity) A1B;
        } else if (A1B instanceof BrazilPaymentPixOnboardingActivity) {
            C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivity");
            r1 = (BrazilPaymentPixOnboardingActivity) A1B;
        } else if (A1B instanceof BrazilPaymentPixOnboardingActivityV2) {
            C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivityV2");
            r1 = (BrazilPaymentPixOnboardingActivityV2) A1B;
        } else {
            r1 = this;
        }
        BrazilSendPixKeyViewModel brazilSendPixKeyViewModel = (BrazilSendPixKeyViewModel) AnonymousClass3MW.A0N(r1).A00(BrazilSendPixKeyViewModel.class);
        this.A04 = brazilSendPixKeyViewModel;
        if (brazilSendPixKeyViewModel != null) {
            brazilSendPixKeyViewModel.A05.registerObserver(brazilSendPixKeyViewModel.A04);
            BrazilSendPixKeyViewModel brazilSendPixKeyViewModel2 = this.A04;
            if (brazilSendPixKeyViewModel2 != null) {
                C20339AGv.A00(this, brazilSendPixKeyViewModel2.A00, new C22235Azp(this), 38);
                return;
            }
        }
        C18070vi.A11("brazilSendPixKeyViewModel");
        throw null;
    }

    public int A2F() {
        return 2131626392;
    }
}
