package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass00H;
import X.AnonymousClass1BI;
import X.AnonymousClass3MX;
import X.AnonymousClass4DG;
import X.AnonymousClass4aq;
import X.C17880vN;
import X.C18070vi;
import X.C73193Ri;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class ChatLockForgotSecretCodeUnlockClearDialog extends Hilt_ChatLockForgotSecretCodeUnlockClearDialog {
    public int A00;
    public DialogInterface.OnClickListener A01;
    public AnonymousClass00H A02;

    public Dialog A27(Bundle bundle) {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            AnonymousClass3MX.A0a(r0).A04((AnonymousClass1BI) null, Integer.valueOf(this.A00), C17880vN.A0h(), 7);
            this.A07 = AnonymousClass4DG.DESTRUCTIVE;
            C73193Ri A002 = C73193Ri.A00(A14());
            A002.A0V(2131888185);
            A002.A0U(2131888184);
            A002.A0X(new AnonymousClass4aq(this, 44), 2131887451);
            A002.A0W((DialogInterface.OnClickListener) null, 2131898766);
            return A002.create();
        }
        C18070vi.A11("chatLockLogger");
        throw null;
    }
}
