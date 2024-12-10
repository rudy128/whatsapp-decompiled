package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1iK  reason: invalid class name and case insensitive filesystem */
public final class C33131iK {
    public final C18030ve A00;
    public final C33011i7 A01;
    public final C33101iH A02;
    public final C33111iI A03;
    public final AnonymousClass10I A04;

    public C33131iK(C18030ve r2, C33011i7 r3, C33101iH r4, C33111iI r5, AnonymousClass10I r6) {
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r2, 5);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = r2;
    }

    public final Boolean A00(UserJid userJid) {
        C18100vl r4 = this.A03.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(userJid.getRawString());
        sb.append("_biz_intent");
        if (!((SharedPreferences) r4.getValue()).contains(sb.toString())) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(userJid.getRawString());
        sb2.append("_biz_intent");
        return Boolean.valueOf(((SharedPreferences) r4.getValue()).getBoolean(sb2.toString(), false));
    }
}
