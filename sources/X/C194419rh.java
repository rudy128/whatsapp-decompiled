package X;

/* renamed from: X.9rh  reason: invalid class name and case insensitive filesystem */
public final class C194419rh {
    public int A00;
    public final Integer A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194419rh) {
                C194419rh r5 = (C194419rh) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C108955ca.A06(this.A02);
    }

    public C194419rh(Integer num, String str, int i) {
        this.A00 = i;
        this.A01 = num;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsEntrypointMetadata(flowEntryPoint=");
        A10.append(this.A00);
        A10.append(", clickSequenceNumber=");
        A10.append(this.A01);
        A10.append(", adContext=");
        return C17900vP.A0B(this.A02, A10);
    }
}
