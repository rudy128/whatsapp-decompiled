package X;

import android.content.SharedPreferences;

/* renamed from: X.18D  reason: invalid class name */
public final class AnonymousClass18D implements C201511a {
    public AnonymousClass18E A00;

    public AnonymousClass18D(AnonymousClass18E r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public Integer A00(C18180vt r10, int i, boolean z) {
        SharedPreferences sharedPreferences;
        C18180vt r3 = r10;
        C18070vi.A0d(r10, 1);
        AnonymousClass18E r2 = this.A00;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A05("field-stats-events-sampling");
                r2.A00 = sharedPreferences;
            }
        }
        int i2 = sharedPreferences.getInt(String.valueOf(i), 0);
        if (i2 != 0) {
            int abs = Math.abs(i2);
            r3 = new C18180vt(abs, abs, abs, abs, false);
        } else {
            i2 = r10.A03;
            if (z) {
                i2 = -i2;
            }
        }
        if (r3.A00()) {
            return Integer.valueOf(i2);
        }
        return null;
    }
}
