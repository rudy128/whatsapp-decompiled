package X;

import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import com.whatsapp.chatlock.ChatLockCreateSecretCodeActivity;

/* renamed from: X.4sP  reason: invalid class name and case insensitive filesystem */
public class C99184sP implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C99184sP(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final Object invoke(Object obj) {
        if (this.A00 == 0) {
            return BlockReasonListFragment.A00((BlockReasonListFragment) this.A01, this.A02);
        }
        ChatLockCreateSecretCodeActivity chatLockCreateSecretCodeActivity = (ChatLockCreateSecretCodeActivity) this.A01;
        boolean z = this.A02;
        if (AnonymousClass000.A1Y(obj)) {
            chatLockCreateSecretCodeActivity.setResult(2);
            if (z) {
                AnonymousClass00H r0 = chatLockCreateSecretCodeActivity.A01;
                if (r0 != null) {
                    AnonymousClass3MX.A0a(r0).A05(C17880vN.A0l(), 1);
                } else {
                    C18070vi.A11("chatLockLogger");
                    throw null;
                }
            }
            chatLockCreateSecretCodeActivity.finish();
        } else {
            chatLockCreateSecretCodeActivity.A4f(2131896261);
        }
        return C27621Wu.A00;
    }
}
