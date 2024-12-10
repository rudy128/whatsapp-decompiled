package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass00H;
import X.AnonymousClass1BI;
import X.AnonymousClass3MX;
import X.AnonymousClass4DG;
import X.AnonymousClass4VV;
import X.C17880vN;
import X.C18070vi;
import X.C73193Ri;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class ChatLockPrivacySettingsUnlockClearDialog extends Hilt_ChatLockPrivacySettingsUnlockClearDialog {
    public DialogInterface.OnClickListener A00;
    public AnonymousClass00H A01;

    public Dialog A27(Bundle bundle) {
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            AnonymousClass4VV A0a = AnonymousClass3MX.A0a(r0);
            Integer A0l = C17880vN.A0l();
            Integer A0h = C17880vN.A0h();
            A0a.A04((AnonymousClass1BI) null, A0l, A0h, 7);
            AnonymousClass00H r02 = this.A01;
            if (r02 != null) {
                AnonymousClass3MX.A0a(r02).A04((AnonymousClass1BI) null, A0l, A0h, 16);
                this.A07 = AnonymousClass4DG.DESTRUCTIVE;
                C73193Ri A002 = C73193Ri.A00(A14());
                A002.A0V(2131888185);
                A002.A0d(A1H(2131888184));
                A002.A0X(this.A00, 2131888182);
                A002.A0W((DialogInterface.OnClickListener) null, 2131898766);
                return A002.create();
            }
            C18070vi.A11("chatLockLogger");
            throw null;
        }
        C18070vi.A11("chatLockLogger");
        throw null;
    }
}
