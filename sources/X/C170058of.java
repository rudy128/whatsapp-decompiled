package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.8of  reason: invalid class name and case insensitive filesystem */
public final class C170058of extends AnonymousClass8oS {
    public static final long A03;
    public static final long A04;
    public final long A00;
    public final AnonymousClass8oR A01;
    public final C196189ub A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C170058of(AnonymousClass8oR r2, C196189ub r3, long j) {
        super(r2, r3);
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C170058of) {
                C170058of r8 = (C170058of) obj;
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
        A04 = timeUnit.toMillis(7);
        A03 = timeUnit.toMillis(7);
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A01)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CtwaAdsConversionInfo(data=");
        A10.append(this.A01);
        A10.append(", loggingTracker=");
        A10.append(this.A02);
        A10.append(", lastInteractionTsMs=");
        return C17900vP.A0E(A10, this.A00);
    }
}
