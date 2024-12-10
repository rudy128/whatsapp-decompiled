package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.7P7  reason: invalid class name */
public final class AnonymousClass7P7 implements C22486B9s {
    public final AnonymousClass11P A00;
    public final C19830z4 A01;

    public boolean BCL(C186309dz r8, C22484B9q b9q, AnonymousClass5YR r10) {
        long j;
        C136546tz r2;
        Boolean bool;
        String A0s;
        boolean A17 = C18070vi.A17(r10, r8);
        if ((b9q instanceof AnonymousClass7P5) && (r2 = ((AnonymousClass7P5) b9q).A00) != null) {
            AnonymousClass9ZF r0 = ((C21319Ai4) r10).A06;
            if (r0 == null || (A0s = C17880vN.A0s("wa_push_psa_remove_old_message_notifications", r0.A00)) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(Boolean.parseBoolean(A0s));
            }
            r2.A00 = bool;
        }
        long A012 = AnonymousClass11P.A01(this.A00) - C17890vO.A05(C17890vO.A0B(this.A01), "last_notif_posted_timestamp");
        TimeUnit timeUnit = TimeUnit.MINUTES;
        String A0s2 = C17880vN.A0s("first", r8.A01);
        if (A0s2 != null) {
            j = Long.parseLong(A0s2);
        } else {
            j = 0;
        }
        if (A012 < timeUnit.toMillis(j)) {
            return false;
        }
        return A17;
    }

    public AnonymousClass7P7(AnonymousClass11P r1, C19830z4 r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
