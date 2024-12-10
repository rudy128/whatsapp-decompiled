package X;

import android.view.inputmethod.CursorAnchorInfo;

public abstract class C72 {
    public static final void A00(CursorAnchorInfo.Builder builder, AnonymousClass0NU r7, C26227CvJ cvJ) {
        int A0C;
        int A0C2;
        if (r7.A01 < r7.A02) {
            float f = r7.A03;
            float f2 = r7.A00;
            if (f < f2 && (A0C = cvJ.A0C(f)) <= (A0C2 = cvJ.A0C(f2))) {
                while (true) {
                    builder.addVisibleLineBounds(cvJ.A07(A0C), cvJ.A09(A0C), cvJ.A08(A0C), cvJ.A06(A0C));
                    if (A0C != A0C2) {
                        A0C++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
