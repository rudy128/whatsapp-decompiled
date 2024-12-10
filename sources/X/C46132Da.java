package X;

/* renamed from: X.2Da  reason: invalid class name and case insensitive filesystem */
public final class C46132Da extends AnonymousClass8oS {
    public final long A00;
    public final C196189ub A01;
    public final AnonymousClass8oP A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46132Da) {
                C46132Da r8 = (C46132Da) obj;
                if (!C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass8oS A00(C196189ub r5) {
        return new C46132Da(r5, this.A02, this.A00);
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A02)));
    }

    public C46132Da(C196189ub r1, AnonymousClass8oP r2, long j) {
        super(r2, r1);
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OptimisedDeliveryConversionInfo(data=");
        A10.append(this.A02);
        A10.append(", loggingTracker=");
        A10.append(this.A01);
        A10.append(", lastInteractionTsMs=");
        return C17900vP.A0E(A10, this.A00);
    }
}
