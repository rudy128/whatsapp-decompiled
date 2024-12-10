package com.whatsapp.ptt;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1F9;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass5PU;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import X.C73203Rj;
import X.C91614fy;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

public final class TranscriptionNetworkDialogFragment extends Hilt_TranscriptionNetworkDialogFragment {
    public TranscriptionOnboardingBottomSheetFragment A00;
    public final AnonymousClass1F9 A01;

    public TranscriptionNetworkDialogFragment(AnonymousClass1F9 r1) {
        this.A01 = r1;
    }

    public Dialog A27(Bundle bundle) {
        super.A27(bundle);
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5PU(this, "file_size_in_mbs"));
        Context A14 = A14();
        String A0n = AnonymousClass3MY.A0n(this, 2131897104);
        String A16 = AnonymousClass3MX.A16(this, Long.valueOf(C72453Mb.A0K(A002)), new Object[1], 0, 2131897103);
        C18070vi.A0X(A16);
        C73203Rj A003 = AnonymousClass4a6.A00(A14);
        A003.A0k(A0n);
        A003.A0S(A16);
        A003.A0T(true);
        String A1H = A1H(2131897102);
        AnonymousClass1F9 r3 = this.A01;
        A003.A0i(r3, new C91614fy(this, 4), A1H);
        A003.A0h(r3, new C91614fy(this, 5), A1H(2131897101));
        return AnonymousClass3MY.A0L(A003);
    }
}
