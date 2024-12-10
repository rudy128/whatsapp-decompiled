package X;

import android.content.SharedPreferences;

/* renamed from: X.6sw  reason: invalid class name and case insensitive filesystem */
public final class C135896sw {
    public final AnonymousClass11E A00;
    public final AnonymousClass11P A01;
    public final C19830z4 A02;
    public final C127936fB A03;

    public final void A00() {
        C19830z4 r8 = this.A02;
        int A002 = C17890vO.A00(C17890vO.A0B(r8), "sticker_store_backoff_attempt") + 1;
        C24451Kj r4 = new C24451Kj(1, 720);
        r4.A03((long) A002);
        long A012 = r4.A01();
        C17900vP.A0M(r8, "sticker_store_backoff_attempt", A002);
        C17880vN.A1D(C19830z4.A00(r8), "sticker_store_backoff_time", (60 * A012 * 1000) + System.currentTimeMillis());
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerRequestBackoffManager/incrementAttempt/Backing off for ");
        A10.append(A012);
        C17890vO.A19(A10, " minutes.");
    }

    public final void A01(boolean z) {
        long currentTimeMillis;
        SharedPreferences.Editor A002;
        String str;
        C19830z4 r4 = this.A02;
        C17880vN.A1C(C19830z4.A00(r4), "sticker_store_backoff_attempt", 0);
        C17880vN.A1D(C19830z4.A00(r4), "sticker_store_backoff_time", 0);
        if (z) {
            C127936fB r0 = this.A03;
            currentTimeMillis = System.currentTimeMillis();
            A002 = C17890vO.A0A(r0.A01);
            str = "discovery_pack_last_fetch_time";
        } else {
            currentTimeMillis = System.currentTimeMillis();
            A002 = C19830z4.A00(r4);
            str = "sticker_store_last_fetch_time";
        }
        C17880vN.A1D(A002, str, currentTimeMillis);
        C17900vP.A0n("StickerRequestBackoffManager/clearAttempts is discovery pack attempt: ", AnonymousClass000.A10(), z);
    }

    public final boolean A02() {
        if (C17890vO.A05(C17890vO.A0B(this.A02), "sticker_store_backoff_time") >= System.currentTimeMillis() || !this.A00.A09()) {
            return false;
        }
        return true;
    }

    public C135896sw(AnonymousClass11E r1, AnonymousClass11P r2, C19830z4 r3, C127936fB r4) {
        C18070vi.A0s(r2, r3, r4, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }
}
