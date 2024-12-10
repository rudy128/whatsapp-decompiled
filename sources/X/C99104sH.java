package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.whatsapp.areffects.viewmodel.viewstate.ArEffectsEffectButtonViewState$isSliderShown$2$1;

/* renamed from: X.4sH  reason: invalid class name and case insensitive filesystem */
public class C99104sH implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public C99104sH(Object obj, Object obj2, int i, boolean z) {
        this.A00 = i;
        this.A03 = z;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final Object invoke() {
        if (this.A00 != 0) {
            boolean z = this.A03;
            Fragment fragment = (Fragment) this.A01;
            Activity activity = (Activity) this.A02;
            C18070vi.A0d(activity, 2);
            if (z && fragment.A1b()) {
                Intent addFlags = AnonymousClass1LU.A02(fragment.A14()).addFlags(603979776);
                C18070vi.A0X(addFlags);
                fragment.A1k(addFlags);
            }
            activity.finish();
            return C27621Wu.A00;
        }
        C85404Ng r1 = (C85404Ng) this.A01;
        AnonymousClass1OX r6 = (AnonymousClass1OX) this.A02;
        boolean z2 = this.A03;
        boolean A15 = C18070vi.A15(r1, r6);
        return AnonymousClass4Z7.A01(Boolean.valueOf(A15), r6, AnonymousClass4Z8.A00(new ArEffectsEffectButtonViewState$isSliderShown$2$1((C30391dr) null, z2), AnonymousClass3MX.A18(r1.A02), AnonymousClass3MX.A18(r1.A03)), C99654tF.A00());
    }
}
