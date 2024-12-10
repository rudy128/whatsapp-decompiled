package X;

import com.whatsapp.calling.callrating.CallRatingFragment;
import com.whatsapp.calling.callrating.viewmodel.CallRatingViewModel;

/* renamed from: X.4gu  reason: invalid class name and case insensitive filesystem */
public class C92194gu implements C107015Yb {
    public final int A00;
    public final Object A01;

    public C92194gu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C2T(int i, boolean z) {
        int i2;
        if (this.A00 != 0) {
            AnonymousClass465 r1 = (AnonymousClass465) this.A01;
            if (z) {
                r1.A00 = new AnonymousClass466(i);
                return;
            }
            return;
        }
        CallRatingFragment callRatingFragment = (CallRatingFragment) this.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallRatingFragment/setOnRatingBarChangeListener rating: ");
        A10.append(i);
        C17900vP.A0n(", fromUser: ", A10, z);
        if (z) {
            CallRatingViewModel A0Z = AnonymousClass3MX.A0Z(callRatingFragment.A01);
            if (A0Z.A00 != null) {
                C41111vp r3 = A0Z.A0C;
                if (i > 0) {
                    int[] iArr = CallRatingViewModel.A0F;
                    if (i <= 5) {
                        AnonymousClass3MY.A1L(A0Z.A06, true);
                        i2 = iArr[i - 1];
                        AnonymousClass3MX.A1J(r3, i2);
                    }
                }
                i2 = -1;
                AnonymousClass3MX.A1J(r3, i2);
            }
        }
    }
}
