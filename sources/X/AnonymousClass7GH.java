package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

/* renamed from: X.7GH  reason: invalid class name */
public class AnonymousClass7GH implements AnonymousClass875 {
    public final int A00;
    public final Object A01;

    public AnonymousClass7GH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void CNG(DialogFragment dialogFragment) {
        AnonymousClass1FU r0;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                AnonymousClass1FL r1 = ((AnonymousClass7JF) obj).A0A;
                if (!AnonymousClass4Yv.A02(r1)) {
                    C20098A7b.A01(dialogFragment, r1.getSupportFragmentManager());
                    return;
                }
                return;
            case 1:
                r0 = (AnonymousClass1FU) obj;
                break;
            default:
                r0 = C108985cd.A0M((Fragment) obj);
                break;
        }
        r0.CMl(dialogFragment);
    }
}
