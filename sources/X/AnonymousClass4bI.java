package X;

import android.content.SharedPreferences;

/* renamed from: X.4bI  reason: invalid class name */
public final class AnonymousClass4bI implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final C18010vc A00;
    public final C18100vl A01 = C99164sN.A01(this, 40);
    public final C18100vl A02 = C99164sN.A01(this, 41);
    public final C18100vl A03 = C99164sN.A01(this, 42);
    public final C18100vl A04 = C99164sN.A01(this, 39);
    public final C18100vl A05 = C99164sN.A01(this, 43);
    public final C18100vl A06 = C99164sN.A01(this, 44);
    public final C18100vl A07 = C99164sN.A01(this, 45);

    public AnonymousClass4bI(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A01(C82804Cd r4) {
        C18070vi.A0d(r4, 0);
        C17880vN.A1C(C18070vi.A03(this.A04).edit(), "username_privacy_mode", r4.ordinal());
    }

    public final C82804Cd A00() {
        SharedPreferences A032 = C18070vi.A03(this.A04);
        Object obj = C82804Cd.USERNAME;
        int i = A032.getInt("username_privacy_mode", 0);
        C19810z2 r1 = C82804Cd.A00;
        if (i >= 0 && i < r1.size()) {
            obj = r1.get(i);
        }
        return (C82804Cd) obj;
    }

    public final void A02(String str) {
        C17880vN.A1E(C18070vi.A03(this.A04).edit(), "username_pin", str);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        AnonymousClass1G4 A17;
        Object A0r;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 1008340652) {
                if (hashCode != 1511469251) {
                    if (hashCode == 2146017781 && str.equals("username_share_include_pin")) {
                        A17 = AnonymousClass3MW.A17(this.A03);
                        A0r = Boolean.valueOf(AnonymousClass3MX.A1T(C18070vi.A03(this.A04), "username_share_include_pin"));
                    } else {
                        return;
                    }
                } else if (str.equals("username_privacy_mode")) {
                    A17 = AnonymousClass3MW.A17(this.A02);
                    A0r = A00();
                } else {
                    return;
                }
            } else if (str.equals("username_pin")) {
                A17 = AnonymousClass3MW.A17(this.A01);
                A0r = C17880vN.A0r(C18070vi.A03(this.A04), "username_pin");
                if (A0r == null) {
                    A0r = "";
                }
            } else {
                return;
            }
            A17.setValue(A0r);
        }
    }
}
