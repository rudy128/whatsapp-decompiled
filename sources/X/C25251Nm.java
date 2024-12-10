package X;

import android.content.SharedPreferences;

/* renamed from: X.1Nm  reason: invalid class name and case insensitive filesystem */
public final class C25251Nm {
    public final C18010vc A00;
    public final Object A01 = new Object();
    public final Object A02 = new Object();
    public final Object A03 = new Object();
    public final Object A04 = new Object();
    public final C18100vl A05 = new C18110vm(new C25261Nn(this));

    public C25251Nm(C18010vc r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public static final SharedPreferences.Editor A00(C25251Nm r0) {
        SharedPreferences.Editor edit = ((SharedPreferences) r0.A05.getValue()).edit();
        C18070vi.A0X(edit);
        return edit;
    }

    public final int A01() {
        int i;
        synchronized (this.A01) {
            i = ((SharedPreferences) this.A05.getValue()).getInt("sticker_add_to_favorites_count", 0);
        }
        return i;
    }

    public final int A02() {
        int i;
        synchronized (this.A02) {
            i = ((SharedPreferences) this.A05.getValue()).getInt("sticker_pack_delete_count", 0);
        }
        return i;
    }
}
