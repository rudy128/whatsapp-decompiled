package X;

import com.whatsapp.stickers.recent.RecentStickerFlowImpl$stickerCallbackFlow$1$stickerObserver$1$onStickerMoveToTop$1;
import com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateStickerList$1;

/* renamed from: X.7KT  reason: invalid class name */
public class AnonymousClass7KT implements C23691Hg {
    public final int A00;
    public final int A01;
    public final Object A02;

    public AnonymousClass7KT(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    public final void CGE(Object obj) {
        if (this.A00 != 0) {
            C122606Ra r6 = (C122606Ra) this.A02;
            int i = this.A01;
            C134226qF r8 = (C134226qF) obj;
            C18070vi.A0d(r8, 2);
            if (r8 instanceof AnonymousClass6H6) {
                AnonymousClass6H6 r82 = (AnonymousClass6H6) r8;
                if (3 - r82.A00 == 0) {
                    C131016kN r4 = (C131016kN) r82.A02;
                    C108475bl r3 = (C108475bl) r82.A01;
                    C18600wl r2 = r4.A04;
                    AnonymousClass3MW.A1X(r2, new RecentStickerFlowImpl$updateStickerList$1(r4, (C30391dr) null, r3), r3);
                    AnonymousClass3MW.A1X(r2, new RecentStickerFlowImpl$stickerCallbackFlow$1$stickerObserver$1$onStickerMoveToTop$1(r6, r4, (C30391dr) null, i), r3);
                    return;
                }
                return;
            }
            return;
        }
        int i2 = this.A01;
        C160938Ar r83 = (C160938Ar) obj;
        C18070vi.A0d(r83, 3);
        r83.Brz(i2);
    }
}
