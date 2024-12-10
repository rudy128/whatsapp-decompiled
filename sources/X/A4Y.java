package X;

public class A4Y {
    public final int A00;
    public final int A01;
    public final long A02;
    public final byte[] A03;

    public A4Y(byte[] bArr, int i, long j) {
        this.A01 = i;
        this.A02 = bArr != null ? j + 16 + 16 : j;
        this.A00 = 0;
        this.A03 = bArr;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FpmMessage{type=");
        A10.append(this.A01);
        A10.append(", length=");
        A10.append(this.A02);
        A10.append(", errorCode=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }

    public A4Y(int i, long j, int i2) {
        this.A01 = i;
        this.A02 = j;
        this.A00 = i2;
        this.A03 = null;
    }

    public A4Y(int i) {
        this.A01 = i;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = null;
    }
}
