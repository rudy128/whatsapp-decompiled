package X;

import java.util.UUID;

/* renamed from: X.9ps  reason: invalid class name and case insensitive filesystem */
public final class C193309ps {
    public final Runnable A00;
    public final UUID A01;

    public C193309ps(Runnable runnable, UUID uuid) {
        C18070vi.A0d(uuid, 1);
        this.A01 = uuid;
        this.A00 = runnable;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193309ps) {
                C193309ps r5 = (C193309ps) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArdJob(id=");
        A10.append(this.A01);
        A10.append(", job=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
