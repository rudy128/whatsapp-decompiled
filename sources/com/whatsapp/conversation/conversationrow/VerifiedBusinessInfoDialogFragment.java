package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00H;
import X.AnonymousClass129;
import X.AnonymousClass18K;
import X.AnonymousClass1KW;
import X.AnonymousClass1L9;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4at;
import X.AnonymousClass4bA;
import X.C18070vi;
import X.C43251zV;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

public final class VerifiedBusinessInfoDialogFragment extends Hilt_VerifiedBusinessInfoDialogFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KW A01;
    public AnonymousClass18K A02;
    public AnonymousClass129 A03;
    public AnonymousClass00H A04;

    public Dialog A27(Bundle bundle) {
        Bundle A15 = A15();
        String string = A15.getString("message");
        int i = A15.getInt("system_action");
        C73203Rj A042 = AnonymousClass4a6.A04(this);
        Context A14 = A14();
        AnonymousClass1KW r0 = this.A01;
        if (r0 != null) {
            A042.A0S(C43251zV.A05(A14, r0, string));
            A042.A0T(true);
            A042.A0Y(new AnonymousClass4at(this, i, 3), 2131899101);
            A042.A0X(new AnonymousClass4bA(this, 19), 2131899286);
            return AnonymousClass3MY.A0L(A042);
        }
        C18070vi.A11("emojiLoader");
        throw null;
    }
}
