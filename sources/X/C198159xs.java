package X;

import androidx.fragment.app.Fragment;
import com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import java.util.List;

/* renamed from: X.9xs  reason: invalid class name and case insensitive filesystem */
public final class C198159xs {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01 = C217517g.A00(49488);
    public final AnonymousClass00H A02;

    public static final BkFcsPreloadingScreenFragment A00(AnonymousClass1GP r1, C198159xs r2) {
        List A04 = r1.A0U.A04();
        C18070vi.A0X(A04);
        Fragment fragment = (Fragment) C29431cG.A0e(A04);
        if (fragment instanceof BkFcsPreloadingScreenFragment) {
            return (BkFcsPreloadingScreenFragment) fragment;
        }
        if (fragment == null) {
            return null;
        }
        AnonymousClass1GP A1E = fragment.A1E();
        C18070vi.A0X(A1E);
        return A00(A1E, r2);
    }

    public C198159xs(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0j(r2, r3);
        this.A00 = r2;
        this.A02 = r3;
    }
}
