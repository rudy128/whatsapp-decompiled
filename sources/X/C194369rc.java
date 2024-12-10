package X;

/* renamed from: X.9rc  reason: invalid class name and case insensitive filesystem */
public final class C194369rc {
    public int A00 = 0;
    public int A01 = 0;
    public C59712ml A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194369rc) {
                C194369rc r5 = (C194369rc) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && C18070vi.A18(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2ml, java.lang.Object] */
    public C194369rc() {
        ? obj = new Object();
        obj.A01 = 0;
        obj.A02 = 0;
        obj.A03 = "";
        obj.A04 = false;
        obj.A05 = false;
        obj.A00 = 0;
        this.A02 = obj;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, ((this.A00 * 31) + this.A01) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupTrustSignalData(commonGroupSize=");
        A10.append(this.A00);
        A10.append(", highlightGroupType=");
        A10.append(this.A01);
        A10.append(", info=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
