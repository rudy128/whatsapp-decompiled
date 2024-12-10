package X;

public class DAL implements C28573E8e {
    public final int A00;
    public final C28573E8e A01;

    public String Bb4() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof DAL)) {
                return false;
            }
            DAL dal = (DAL) obj;
            if (this.A00 != dal.A00 || !this.A01.equals(dal.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 1013) + this.A00;
    }

    public DAL(C28573E8e e8e, int i) {
        this.A01 = e8e;
        this.A00 = i;
    }

    public String toString() {
        C26004CqL cqL = new C26004CqL(C108955ca.A0x(this));
        C26004CqL.A00(cqL, this.A01, "imageCacheKey");
        C26004CqL.A01(cqL, "frameIndex", this.A00);
        return cqL.toString();
    }
}
