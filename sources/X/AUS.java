package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

public final class AUS implements C22511BAs {
    public /* synthetic */ void C1B(C193069pU r1, C166388co r2, AnonymousClass206 r3) {
    }

    public void C1A(C195629te r5, AnonymousClass8X1 r6, AnonymousClass206 r7) {
        C42691ya r0;
        AnonymousClass9K7 r02;
        boolean A16 = C18070vi.A16(r7, r6);
        if (r7.A11(4096) && (r0 = r7.A0O) != null) {
            int A00 = AnonymousClass2US.A00(r0.hostStorage, r0.actualActors);
            if (A00 == A16) {
                r02 = AnonymousClass9K7.E2EE;
            } else if (A00 != 2) {
                r02 = AnonymousClass9K7.FB;
            } else {
                r02 = AnonymousClass9K7.BSP;
            }
            C166388co A0X = C17880vN.A0X(r6);
            A0X.bizPrivacyStatus_ = r02.value;
            A0X.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
            String str = r7.A0Z;
            if (str != null) {
                C166388co A0P = AnonymousClass8BS.A0P(r6);
                A0P.bitField0_ |= 33554432;
                A0P.verifiedBizName_ = str;
            }
        }
    }
}
