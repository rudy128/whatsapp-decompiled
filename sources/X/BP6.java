package X;

public class BP6 extends CPF {
    public final long A00;
    public final long A01;

    public BP6(C25200Car car, long j, long j2, long j3, long j4) {
        super(car, j, j2);
        this.A01 = j3;
        this.A00 = j4;
    }

    public BP6() {
        this((C25200Car) null, 1, 0, 0, 0);
    }
}
