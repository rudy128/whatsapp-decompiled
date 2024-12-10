package X;

import android.content.SharedPreferences;

/* renamed from: X.1gr  reason: invalid class name and case insensitive filesystem */
public final class C32231gr {
    public final C32221gq A00;

    public C32231gr(C32221gq r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final synchronized void A00(String str) {
        C32221gq r0 = this.A00;
        Object value = r0.A01.getValue();
        C18070vi.A0X(value);
        SharedPreferences.Editor edit = ((SharedPreferences) value).edit();
        StringBuilder sb = new StringBuilder();
        sb.append("KeepInChatNotif");
        sb.append("::");
        sb.append(str);
        edit.putLong(sb.toString(), r0.A00(str) + 1).apply();
    }
}
