package X;

import android.content.SharedPreferences;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7Oe  reason: invalid class name and case insensitive filesystem */
public final class C146197Oe implements C1603688e {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public final void A00() {
        AnonymousClass00H r3 = this.A01;
        int A002 = C17890vO.A00(C25611Cir.A00((C25611Cir) r3.get()), "pref_waffle_sharing_to_fb_tooltip");
        SharedPreferences.Editor A02 = C108965cb.A02((C25611Cir) r3.get());
        C18070vi.A0X(A02);
        C17880vN.A1C(A02, "pref_waffle_sharing_to_fb_tooltip", A002 + 1);
    }

    public void C9X(List list) {
        C25611Cir cir = (C25611Cir) this.A01.get();
        SharedPreferences.Editor A02 = C108965cb.A02(cir);
        C18070vi.A0X(A02);
        C17880vN.A1B(A02, "pref_waffle_sharing_to_fb_tooltip");
        SharedPreferences.Editor A022 = C108965cb.A02(cir);
        C18070vi.A0X(A022);
        C17880vN.A1B(A022, "pref_waffle_sharing_to_ig_tooltip");
        C17880vN.A1B(C108965cb.A02(cir), "unlinked_banner_shown_count");
        C17880vN.A1B(C108965cb.A02(cir), "unlinked_banner_last_seen_time_ms");
        ((AtomicInteger) cir.A02.getValue()).set(0);
        ((AtomicInteger) cir.A04.getValue()).set(0);
        ((AtomicInteger) cir.A01.getValue()).set(0);
        ((AtomicInteger) cir.A03.getValue()).set(0);
    }

    public C146197Oe(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
