package X;

/* renamed from: X.Abz  reason: case insensitive filesystem */
public final class C20945Abz implements AnonymousClass25D {
    public final Integer A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20945Abz) {
                C20945Abz abz = (C20945Abz) obj;
                if (!C18070vi.A18(this.A01, abz.A01) || this.A00 != abz.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A03 = C17880vN.A03(this.A01);
        Integer num = this.A00;
        return A03 + C72453Mb.A0E(num, C196839vj.A01(num));
    }

    public C20945Abz(String str, Integer num) {
        this.A01 = str;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BotMetricsMetadata(destinationId=");
        A10.append(this.A01);
        A10.append(", destinationEntryPoint=");
        return C17900vP.A0B(C196839vj.A01(this.A00), A10);
    }
}
