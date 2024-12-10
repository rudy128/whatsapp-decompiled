package X;

/* renamed from: X.Bs3  reason: case insensitive filesystem */
public final class C23907Bs3 extends C4L {
    public final C25806CmJ A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23907Bs3) && C18070vi.A18(this.A00, ((C23907Bs3) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C23907Bs3(C25806CmJ cmJ) {
        this.A00 = cmJ;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Inline(header=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
