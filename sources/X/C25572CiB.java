package X;

/* renamed from: X.CiB  reason: case insensitive filesystem */
public final class C25572CiB {
    public int A00;
    public long A01;
    public Object A02;
    public final C25943Cp9 A03;

    public C25572CiB(C25943Cp9 cp9) {
        if (cp9 != null) {
            this.A03 = cp9;
            return;
        }
        throw BE6.A0m();
    }

    public C25572CiB() {
        C25943Cp9 cp9 = C25943Cp9.A02;
        if (cp9 == null) {
            synchronized (C25943Cp9.class) {
                cp9 = C25943Cp9.A02;
                if (cp9 == null) {
                    cp9 = C25943Cp9.A01;
                    C25943Cp9.A02 = cp9;
                }
            }
        }
        this.A03 = cp9;
    }
}
