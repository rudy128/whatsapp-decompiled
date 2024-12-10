package X;

import android.content.SharedPreferences;

/* renamed from: X.2zV  reason: invalid class name and case insensitive filesystem */
public final class C67262zV implements AnonymousClass1L0 {
    public final AnonymousClass1PR A00;

    public C67262zV(AnonymousClass1PR r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        SharedPreferences.Editor edit = C18070vi.A03(this.A00.A01).edit();
        edit.remove("disappearing_mode_duration");
        edit.apply();
    }
}
