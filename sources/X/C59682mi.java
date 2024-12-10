package X;

/* renamed from: X.2mi  reason: invalid class name and case insensitive filesystem */
public final class C59682mi {
    public final Object A00;
    public final Object A01;
    public final Throwable A02;
    public final C22821Di A03;
    public final AnonymousClass3MV A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C59682mi) {
                C59682mi r5 = (C59682mi) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((AnonymousClass001.A0k(this.A01) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A02);
    }

    public C59682mi(Object obj, Object obj2, Throwable th, C22821Di r4, AnonymousClass3MV r5) {
        this.A01 = obj;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = obj2;
        this.A02 = th;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CompletedContinuation(result=");
        A10.append(this.A01);
        A10.append(", cancelHandler=");
        A10.append(this.A04);
        A10.append(", onCancellation=");
        A10.append(this.A03);
        A10.append(", idempotentResume=");
        A10.append(this.A00);
        A10.append(", cancelCause=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
