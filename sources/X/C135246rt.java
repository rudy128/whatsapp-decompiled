package X;

/* renamed from: X.6rt  reason: invalid class name and case insensitive filesystem */
public final class C135246rt {
    public final int A00;
    public final int A01;
    public final C0L A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135246rt) {
                C135246rt r5 = (C135246rt) obj;
                if (!(this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, ((this.A00 * 31) + this.A01) * 31);
    }

    public C135246rt(C0L c0l, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = c0l;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SampleSearchData(image=");
        A10.append(this.A00);
        A10.append(", prompt=");
        A10.append(this.A01);
        A10.append(", downloadableResourceId=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
