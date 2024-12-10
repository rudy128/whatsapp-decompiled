package X;

public final class D9X implements EA2 {
    public final int A00;

    public EA2 BF4() {
        return new D9X(0);
    }

    public int BXY(int i) {
        int i2 = i - 1;
        if (i2 >= 0) {
            return i2;
        }
        return -1;
    }

    public EA2 BF5(int i, int i2) {
        return new D9X(this.A00 + i2);
    }

    public EA2 BF6(int i, int i2) {
        return new D9X((this.A00 - i2) + i);
    }

    public int BRm() {
        if (this.A00 > 0) {
            return 0;
        }
        return -1;
    }

    public int BTp() {
        int i = this.A00;
        int i2 = i - 1;
        if (i <= 0) {
            return -1;
        }
        return i2;
    }

    public int BVN(int i) {
        int i2 = i + 1;
        if (i2 >= this.A00) {
            return -1;
        }
        return i2;
    }

    public int getLength() {
        return this.A00;
    }

    public D9X(int i) {
        this.A00 = i;
    }
}
