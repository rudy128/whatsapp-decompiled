package X;

import android.content.SharedPreferences;

/* renamed from: X.1No  reason: invalid class name and case insensitive filesystem */
public final class C25271No {
    public final AnonymousClass18K A00;
    public final C25251Nm A01;

    public C25271No(AnonymousClass18K r2, C25251Nm r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A00() {
        C25251Nm r1 = this.A01;
        synchronized (r1.A02) {
            C25251Nm.A00(r1).putInt("sticker_pack_delete_count", r1.A02() + 1).apply();
        }
    }

    public final void A01() {
        C25251Nm r4 = this.A01;
        synchronized (r4.A03) {
            C25251Nm.A00(r4).putInt("sticker_search_opened_count", ((SharedPreferences) r4.A05.getValue()).getInt("sticker_search_opened_count", 0) + 1).apply();
        }
    }
}
