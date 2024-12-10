package X;

import android.widget.CompoundButton;

/* renamed from: X.6uL  reason: invalid class name and case insensitive filesystem */
public final class C136756uL {
    public final C28931bI A00;
    public final C30191dX A01;
    public final C127086dm A02;
    public final C219217x A03;

    public final void A01(Long l, boolean z, boolean z2, boolean z3) {
        if (!z3) {
            boolean A07 = AnonymousClass743.A07(this.A01, this.A03);
            boolean z4 = false;
            if (z) {
                if (l != null && l.longValue() == 0) {
                    z4 = true;
                }
            } else if (A07) {
                z4 = C17880vN.A0C(this.A02.A01).getBoolean("sync_to_device_sticky_toggle_setting", false);
            }
            A02(z4);
            if (!z2 && !z) {
                A02(true);
            }
        }
    }

    public final void A02(boolean z) {
        ((CompoundButton) this.A00.A02()).setChecked(z);
    }

    public final boolean A03() {
        C28931bI r1 = this.A00;
        if (r1.A00 == null || r1.A01() != 0) {
            return false;
        }
        return ((CompoundButton) r1.A02()).isChecked();
    }

    public C136756uL(C30191dX r1, C127086dm r2, C219217x r3, C28931bI r4) {
        this.A02 = r2;
        this.A00 = r4;
        this.A03 = r3;
        this.A01 = r1;
    }

    public final void A00() {
        boolean A032 = A03();
        C18100vl r6 = this.A02.A01;
        if (A032 == C17880vN.A0C(r6).getBoolean("sync_to_device_sticky_toggle_setting", false)) {
            C17880vN.A1C(C17890vO.A0A(r6), "sync_to_device_toggle_streak", 0);
            return;
        }
        int i = C17880vN.A0C(r6).getInt("sync_to_device_toggle_streak", 0) + 1;
        C17880vN.A1C(C17890vO.A0A(r6), "sync_to_device_toggle_streak", i);
        if (i >= 1) {
            C17880vN.A1C(C17890vO.A0A(r6), "sync_to_device_toggle_streak", 0);
            C17880vN.A1F(C17890vO.A0A(r6), "sync_to_device_sticky_toggle_setting", A03());
        }
    }
}
