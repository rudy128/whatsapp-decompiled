package X;

/* renamed from: X.9sU  reason: invalid class name and case insensitive filesystem */
public final class C194909sU {
    public final double A00;
    public final long A01;
    public final long A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194909sU) {
                C194909sU r8 = (C194909sU) obj;
                if (!(this.A01 == r8.A01 && C18070vi.A18(this.A03, r8.A03) && Double.compare(this.A00, r8.A00) == 0 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A02, AnonymousClass8BT.A00((AnonymousClass8BV.A00(this.A01) + C17900vP.A00(this.A03)) * 31, this.A00));
    }

    public C194909sU(String str, double d, long j, long j2) {
        this.A01 = j;
        this.A03 = str;
        this.A00 = d;
        this.A02 = j2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FeedbackPromptViewProps(messageRowId=");
        A10.append(this.A01);
        A10.append(", transcriptionId=");
        A10.append(this.A03);
        A10.append(", averageConfidence=");
        A10.append(this.A00);
        A10.append(", pttLengthValue=");
        return C17900vP.A0E(A10, this.A02);
    }
}
