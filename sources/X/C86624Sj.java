package X;

/* renamed from: X.4Sj  reason: invalid class name and case insensitive filesystem */
public final class C86624Sj {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86624Sj) && this.A00 == ((C86624Sj) obj).A00);
    }

    public int hashCode() {
        return 0 + this.A00;
    }

    public C86624Sj(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SubtitleUiState(groupType=");
        A10.append(0);
        A10.append(", membersCount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
