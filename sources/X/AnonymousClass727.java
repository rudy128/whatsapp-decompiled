package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.727  reason: invalid class name */
public final class AnonymousClass727 {
    public AnonymousClass77K A00;
    public final C18030ve A01;

    public AnonymousClass727(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    private final boolean A01(AnonymousClass77K r5) {
        if (r5 == null) {
            return true;
        }
        C18030ve r2 = this.A01;
        C18040vf r1 = C18040vf.A01;
        if (!C18020vd.A05(r1, r2, 2469)) {
            return true;
        }
        return C108945cZ.A0A(r5.A02, r5.A01.size()) <= C18020vd.A00(r1, r2, 2467);
    }

    public final AnonymousClass77K A02(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        if (bundle.getBoolean("persisted_status_distribution_key", false)) {
            return this.A00;
        }
        return (AnonymousClass77K) bundle.getParcelable("status_distribution");
    }

    public final void A04(Bundle bundle, AnonymousClass77K r4) {
        C18070vi.A0d(bundle, 0);
        if (A01(r4)) {
            bundle.putParcelable("status_distribution", r4);
            return;
        }
        this.A00 = r4;
        bundle.putBoolean("persisted_status_distribution_key", true);
    }

    public static AnonymousClass77K A00(Bundle bundle, AnonymousClass00H r2) {
        return ((AnonymousClass727) r2.get()).A02(bundle);
    }

    public final void A03(Intent intent, AnonymousClass77K r4) {
        if (A01(r4)) {
            intent.putExtra("status_distribution", r4);
            return;
        }
        this.A00 = r4;
        intent.putExtra("persisted_status_distribution_key", true);
    }
}
