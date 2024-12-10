package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass1BI;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass48E;
import X.AnonymousClass4VV;
import X.C18070vi;
import X.C19740yt;
import X.C85494Np;
import X.C89894dC;
import X.C90964ev;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.wds.components.button.WDSButton;

public final class SecretCodeAuthenticationBottomSheet extends Hilt_SecretCodeAuthenticationBottomSheet {
    public TextInputEditText A00;
    public C85494Np A01;
    public AnonymousClass4VV A02;
    public WDSButton A03;
    public String A04;
    public TextInputLayout A05;
    public WDSButton A06;
    public final boolean A07;

    public SecretCodeAuthenticationBottomSheet() {
        this(false);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131626839, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass4VV r4 = this.A02;
        if (r4 != null) {
            int i = 0;
            r4.A04((AnonymousClass1BI) null, (Integer) null, 0, 17);
            TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(2131435012);
            this.A05 = textInputLayout;
            if (textInputLayout != null) {
                textInputLayout.setHint(2131889894);
            }
            TextInputLayout textInputLayout2 = this.A05;
            if (textInputLayout2 != null) {
                textInputLayout2.setEndIconMode(1);
            }
            View findViewById = view.findViewById(2131436066);
            if (findViewById != null) {
                findViewById.performClick();
            }
            ColorStateList valueOf = ColorStateList.valueOf(C19740yt.A00(view.getContext(), 2131099690));
            C18070vi.A0X(valueOf);
            TextInputLayout textInputLayout3 = this.A05;
            if (textInputLayout3 != null) {
                textInputLayout3.setHintTextColor(valueOf);
            }
            TextInputLayout textInputLayout4 = this.A05;
            if (textInputLayout4 != null) {
                textInputLayout4.setBoxStrokeColorStateList(valueOf);
            }
            TextInputEditText textInputEditText = (TextInputEditText) view.findViewById(2131435010);
            this.A00 = textInputEditText;
            if (textInputEditText != null) {
                AnonymousClass48E.A00(textInputEditText, this, 2);
                textInputEditText.setImeOptions(2);
                textInputEditText.setOnEditorActionListener(new C90964ev(textInputEditText, this, 0));
            }
            TextInputLayout textInputLayout5 = this.A05;
            if (textInputLayout5 != null) {
                textInputLayout5.requestFocus();
            }
            WDSButton A0r = AnonymousClass3MW.A0r(view, 2131435008);
            this.A03 = A0r;
            if (A0r != null) {
                C89894dC.A00(A0r, this, 4);
            }
            WDSButton A0r2 = AnonymousClass3MW.A0r(view, 2131435011);
            this.A06 = A0r2;
            if (A0r2 != null) {
                C89894dC.A00(A0r2, this, 5);
            }
            WDSButton wDSButton = this.A06;
            if (wDSButton != null) {
                if (!(!this.A07)) {
                    i = 8;
                }
                wDSButton.setVisibility(i);
                return;
            }
            return;
        }
        C18070vi.A11("chatLockLogger");
        throw null;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        C85494Np r3 = this.A01;
        if (r3 != null) {
            r3.A02.A00("PasscodeChatLockAuthenticator/onCanceled User canceled passcode authentication", 5, 0, 0);
            r3.A03.BEO();
        }
    }

    public int A25() {
        return 2132084407;
    }

    public SecretCodeAuthenticationBottomSheet(boolean z) {
        this.A07 = z;
        this.A04 = "";
    }
}
