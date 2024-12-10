package X;

import android.content.SharedPreferences;

/* renamed from: X.1Pe  reason: invalid class name and case insensitive filesystem */
public abstract class C25681Pe implements C25671Pd {
    public final AnonymousClass11P A00;
    public final AnonymousClass1PZ A01;
    public final C18010vc A02;
    public final C18600wl A03;
    public final C18100vl A04 = new C18110vm(new C71023Dm(this, 37));

    public final void A03(C143947Fk r4) {
        C18070vi.A0d(r4, 0);
        A02().edit().putString("url", r4.A00).apply();
    }

    public void A05(String str) {
        SharedPreferences.Editor putString;
        C18070vi.A0d(str, 0);
        if (str.length() == 0) {
            putString = A02().edit().remove("idv_token");
        } else {
            putString = A02().edit().putString("idv_token", str);
        }
        putString.apply();
    }

    public final SharedPreferences A02() {
        Object value = this.A04.getValue();
        C18070vi.A0X(value);
        return (SharedPreferences) value;
    }

    public C25681Pe(AnonymousClass11P r3, AnonymousClass1PZ r4, C18010vc r5, C18600wl r6) {
        this.A02 = r5;
        this.A00 = r3;
        this.A03 = r6;
        this.A01 = r4;
    }

    public final void A04(Long l) {
        long currentTimeMillis;
        SharedPreferences.Editor edit = A02().edit();
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        edit.putLong("registration_ban_timestamp", currentTimeMillis).apply();
    }

    public void A06() {
    }

    public Object COM(C30391dr r3, int i, int i2, int i3, int i4) {
        A02().edit().putInt("dob_year", i).putInt("dob_month", i2).putInt("dob_day", i3).apply();
        return C27621Wu.A00;
    }
}
