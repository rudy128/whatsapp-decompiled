package X;

/* renamed from: X.8Qz  reason: invalid class name and case insensitive filesystem */
public final class C162528Qz extends C180229Lq {
    public final Integer A00;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C180229Lq)) {
            return false;
        }
        Integer num = this.A00;
        Integer num2 = ((C162528Qz) ((C180229Lq) obj)).A00;
        if (num == null) {
            return num2 == null;
        }
        return num.equals(num2);
    }

    public C162528Qz(Integer num) {
        this.A00 = num;
    }

    public int hashCode() {
        return 1000003 ^ AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProductData{productId=");
        return AnonymousClass8BX.A0d(this.A00, A10);
    }
}
