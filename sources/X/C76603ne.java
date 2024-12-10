package X;

import android.view.View;

/* renamed from: X.3ne  reason: invalid class name and case insensitive filesystem */
public final class C76603ne extends C87294Va {
    public final AnonymousClass1VE A00;
    public final AnonymousClass6RC A01 = AnonymousClass6RC.VC_MINIPLAYER_WAVE_ALL;
    public final AnonymousClass11P A02;
    public final Integer A03 = AnonymousClass00R.A0Y;

    public boolean A0B(View view, AnonymousClass72C r5) {
        View view2;
        if (view != null) {
            view2 = view.findViewById(2131437018);
        } else {
            view2 = null;
        }
        boolean z = false;
        if (view2 != null && view.getVisibility() == 0 && view2.getVisibility() == 0 && view2.isEnabled()) {
            z = true;
        }
        return !z;
    }

    public boolean A0C(View view, AnonymousClass72C r8) {
        long j = AnonymousClass1VE.A00(this.A00).getLong("vc_mini_player_wave_all_education_last_seen", 0);
        if (j < 0 || AnonymousClass11P.A01(this.A02) - j <= 3600000) {
            return false;
        }
        return true;
    }

    public C76603ne(AnonymousClass1VE r2, AnonymousClass11P r3) {
        this.A02 = r3;
        this.A00 = r2;
    }
}
