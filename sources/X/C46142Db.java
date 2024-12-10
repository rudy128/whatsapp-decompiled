package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.2Db  reason: invalid class name and case insensitive filesystem */
public final class C46142Db extends AnonymousClass8oS {
    public final long A00;
    public final AnonymousClass2DX A01;
    public final C196189ub A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46142Db) {
                C46142Db r8 = (C46142Db) obj;
                if (!C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A02, r8.A02) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(7);
        timeUnit.toMillis(7);
    }

    public AnonymousClass8oS A00(C196189ub r5) {
        return new C46142Db(this.A01, r5, this.A00);
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A01)));
    }

    public C46142Db(AnonymousClass2DX r1, C196189ub r2, long j) {
        super(r1, r2);
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OrganicConversionInfo(data=");
        A10.append(this.A01);
        A10.append(", loggingTracker=");
        A10.append(this.A02);
        A10.append(", lastInteractionTsMs=");
        return C17900vP.A0E(A10, this.A00);
    }
}
