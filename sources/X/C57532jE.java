package X;

/* renamed from: X.2jE  reason: invalid class name and case insensitive filesystem */
public class C57532jE {
    public final long A00;
    public final long A01;
    public final long A02;

    public C57532jE(long j, long j2, long j3) {
        this.A02 = j;
        this.A00 = j2;
        this.A01 = j3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StageStats{duration=");
        A10.append(this.A02);
        A10.append(", dbReadsCount=");
        A10.append(this.A00);
        A10.append(", dbWritesCount=");
        A10.append(this.A01);
        return C17890vO.A0b(A10);
    }
}
