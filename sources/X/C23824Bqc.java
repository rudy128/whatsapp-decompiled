package X;

/* renamed from: X.Bqc  reason: case insensitive filesystem */
public final class C23824Bqc extends C4I {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23824Bqc) && this.A00 == ((C23824Bqc) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C23824Bqc(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DownloadInProgress(mbRemaining=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
