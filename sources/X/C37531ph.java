package X;

import android.content.SharedPreferences;

/* renamed from: X.1ph  reason: invalid class name and case insensitive filesystem */
public final class C37531ph {
    public final C18010vc A00;
    public final C18100vl A01 = new C18110vm(new C71023Dm(this, 9));

    public C37531ph(C18010vc r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = r3;
    }

    public static final SharedPreferences A00(C37531ph r0) {
        Object value = r0.A01.getValue();
        C18070vi.A0X(value);
        return (SharedPreferences) value;
    }

    public final void A01(int i) {
        A00(this).edit().putInt("biz_block_reasons_api_back_off_days", i).apply();
    }
}
