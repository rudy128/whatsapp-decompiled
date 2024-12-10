package com.whatsapp.calling.dialogs;

import X.AnonymousClass129;
import X.AnonymousClass1L9;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.C18070vi;
import X.C18100vl;
import X.C36421nr;
import X.C36531o3;
import X.C72453Mb;
import X.C73203Rj;
import X.C88414Zp;
import android.app.Dialog;
import android.os.Bundle;

public final class E2EEInfoDialogFragment extends Hilt_E2EEInfoDialogFragment {
    public int A00 = 11;
    public AnonymousClass1L9 A01;
    public C36531o3 A02;
    public C36421nr A03;
    public AnonymousClass129 A04;

    public Dialog A27(Bundle bundle) {
        if (this.A06 != null) {
            C18100vl A032 = C88414Zp.A03(this, "entry_point", -1);
            if (C72453Mb.A0I(A032) != -1) {
                this.A00 = C72453Mb.A0I(A032);
                int A0I = C72453Mb.A0I(A032);
                C36421nr r1 = this.A03;
                if (r1 != null) {
                    r1.A00(A0I, 1);
                } else {
                    C18070vi.A11("privacyHighlightDailyLogger");
                    throw null;
                }
            }
        }
        C73203Rj A033 = AnonymousClass4a6.A03(this);
        A033.A0D(2131887479);
        A033.A0X(new AnonymousClass4aq(this, 25), 2131899286);
        A033.A0Y(new AnonymousClass4aq(this, 26), 2131899101);
        return AnonymousClass3MY.A0L(A033);
    }
}
