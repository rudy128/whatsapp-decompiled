package X;

import android.content.SharedPreferences;

/* renamed from: X.1gq  reason: invalid class name and case insensitive filesystem */
public final class C32221gq {
    public static final String A02;
    public final C18010vc A00;
    public final C18100vl A01 = new C18110vm(new C71023Dm(this, 40));

    public C32221gq(C18010vc r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C19620yd.A09);
        sb.append("_daily_events");
        A02 = sb.toString();
    }

    public final long A00(String str) {
        Object value = this.A01.getValue();
        C18070vi.A0X(value);
        StringBuilder sb = new StringBuilder();
        sb.append("KeepInChatNotif");
        sb.append("::");
        sb.append(str);
        return ((SharedPreferences) value).getLong(sb.toString(), 0);
    }
}
