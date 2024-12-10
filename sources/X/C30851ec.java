package X;

import android.content.SharedPreferences;

/* renamed from: X.1ec  reason: invalid class name and case insensitive filesystem */
public final class C30851ec {
    public final C19830z4 A00;

    public C30851ec(C19830z4 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final C59242lz A00() {
        AnonymousClass00H r8 = this.A00.A00;
        long j = ((SharedPreferences) r8.get()).getLong("account_logout_request_attempt_timestamp", -1);
        String string = ((SharedPreferences) r8.get()).getString("account_logout_request_server_token", (String) null);
        if (j < 0 || string == null) {
            return null;
        }
        return new C59242lz(j, ((SharedPreferences) r8.get()).getString("account_logout_request_new_device_name", (String) null), string);
    }

    public final void A01(C59242lz r8) {
        long j;
        String str;
        String str2;
        if (r8 != null) {
            j = r8.A00;
            str2 = r8.A02;
            str = r8.A01;
        } else {
            j = -1;
            str = null;
            str2 = null;
        }
        C19830z4 r4 = this.A00;
        C19830z4.A00(r4).putLong("account_logout_request_attempt_timestamp", j).apply();
        SharedPreferences.Editor A002 = C19830z4.A00(r4);
        if (str2 != null) {
            A002.putString("account_logout_request_server_token", str2);
        } else {
            A002.remove("account_logout_request_server_token");
        }
        A002.apply();
        SharedPreferences.Editor A003 = C19830z4.A00(r4);
        if (str != null) {
            A003.putString("account_logout_request_new_device_name", str);
        } else {
            A003.remove("account_logout_request_new_device_name");
        }
        A003.apply();
    }
}
