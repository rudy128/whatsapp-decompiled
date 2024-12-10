package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.6Lb  reason: invalid class name and case insensitive filesystem */
public class C121676Lb extends A34 {
    public final int A00;
    public final C125706bY A01;
    public final C139176yM A02;

    public C121676Lb(AnonymousClass1F9 r2, C125706bY r3, C139176yM r4, int i) {
        super(r2, true);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C160878Ah A012 = this.A02.A01(C139176yM.A00((String) null, this.A00, false), false);
        if (!C108945cZ.A1T(this)) {
            return A012;
        }
        A012.close();
        return null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C1606389i r1;
        C160878Ah r7 = (C160878Ah) obj;
        AnonymousClass7DY r5 = this.A01.A00;
        r5.A15.A02 = r7;
        if (r5.A0g) {
            if (r7 != null) {
                AnonymousClass701 r4 = r5.A0P;
                if (r4 == null) {
                    C18070vi.A11("cameraBottomSheetController");
                    throw null;
                }
                C112255lB r3 = r4.A01;
                if (r3 != null) {
                    r3.A07.execute(new AnonymousClass7RL(r3, r7, 19));
                }
                View view = r4.A07;
                if (view != null) {
                    view.setVisibility(C72453Mb.A07(r4.A0G ? 1 : 0));
                }
            }
            Fragment fragment = r5.A0v;
            if ((fragment instanceof C1606389i) && (r1 = (C1606389i) fragment) != null) {
                r1.CDn();
            }
        }
    }
}
