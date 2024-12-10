package X;

/* renamed from: X.1aD  reason: invalid class name and case insensitive filesystem */
public final class C28431aD implements C28411aB {
    public final C19830z4 A00;
    public final C18030ve A01;

    public void BkZ(boolean z) {
        C19830z4 r2 = this.A00;
        C19830z4.A00(r2).putBoolean("create_community_nux_threshold_reached", z).apply();
        if (!z) {
            C19830z4.A00(r2).remove("pref_create_community_nux_times_displayed").apply();
        }
    }

    public /* bridge */ /* synthetic */ void CJc(Object obj) {
        if (obj != null) {
            C19830z4.A00(this.A00).putBoolean("create_community_nux_threshold_reached", true).apply();
        }
    }

    public C28431aD(C19830z4 r1, C18030ve r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String BVY() {
        return "community";
    }

    public /* bridge */ /* synthetic */ boolean Bck(Object obj) {
        return false;
    }
}
