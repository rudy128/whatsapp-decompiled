package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4VN;
import X.C18070vi;
import X.C191299mM;
import X.C89914dE;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;

public final class NativeFlowMessageButtonBottomSheet extends Hilt_NativeFlowMessageButtonBottomSheet {
    public LinearLayout A00;
    public TextEmojiLabel A01;
    public AnonymousClass4VN A02;
    public C191299mM A03;
    public WaImageButton A04;

    public void A21(Bundle bundle, View view) {
        Resources.Theme theme;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WaImageButton waImageButton = (WaImageButton) AnonymousClass1HF.A06(view, 2131428584);
        this.A04 = waImageButton;
        if (waImageButton != null) {
            C89914dE.A00(waImageButton, this, 9);
        }
        this.A01 = AnonymousClass3MX.A0V(view, 2131433125);
        this.A00 = AnonymousClass3MX.A0K(view, 2131433124);
        TextEmojiLabel textEmojiLabel = this.A01;
        if (textEmojiLabel != null) {
            AnonymousClass4VN r2 = this.A02;
            if (r2 != null) {
                Resources A09 = AnonymousClass3MZ.A09(this);
                AnonymousClass1FL A1B = A1B();
                if (A1B != null) {
                    theme = A1B.getTheme();
                } else {
                    theme = null;
                }
                textEmojiLabel.setTextSize(r2.A01(theme, A09));
            } else {
                C18070vi.A11("conversationFont");
                throw null;
            }
        }
        C191299mM r22 = this.A03;
        if (r22 != null) {
            r22.A00(this.A00, this.A01);
        }
    }

    public void A1s() {
        super.A1s();
        this.A04 = null;
        this.A01 = null;
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.A00 = null;
    }

    public int A2F() {
        return 2131626143;
    }
}
