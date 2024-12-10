package X;

/* renamed from: X.0JX  reason: invalid class name */
public final class AnonymousClass0JX {
    public final long A00;
    public final C17190uG A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0JX) {
                AnonymousClass0JX r9 = (AnonymousClass0JX) obj;
                if (Float.compare(0.92f, 0.92f) == 0) {
                    long j = this.A00;
                    long j2 = r9.A00;
                    long j3 = AnonymousClass0NB.A01;
                    if (j != j2 || !C18070vi.A18(this.A01, r9.A01)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass0JX(C17190uG r1, long j) {
        this.A00 = j;
        this.A01 = r1;
    }

    public int hashCode() {
        int A05 = AnonymousClass000.A05(0.92f);
        long j = this.A00;
        long j2 = AnonymousClass0NB.A01;
        return AnonymousClass000.A0O(this.A01, AnonymousClass001.A0K(j, A05));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Scale(scale=");
        A10.append(0.92f);
        A10.append(", transformOrigin=");
        long j = this.A00;
        long j2 = AnonymousClass0NB.A01;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("TransformOrigin(packedValue=");
        A102.append(j);
        A10.append(AnonymousClass001.A1J(A102));
        A10.append(", animationSpec=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
