package X;

/* renamed from: X.0Vr  reason: invalid class name and case insensitive filesystem */
public final class C05780Vr implements C16300s2 {
    public long A00;
    public long A01;
    public AnonymousClass0D0 A02;
    public boolean A03;
    public final C16590sg A04;
    public final C17330uU A05;

    public final Object A00() {
        return this.A04.BPR().invoke(this.A02);
    }

    public Object getValue() {
        return this.A05.getValue();
    }

    public C05780Vr(AnonymousClass0D0 r2, C16590sg r3, Object obj, long j, long j2, boolean z) {
        AnonymousClass0D0 A002;
        this.A04 = r3;
        this.A05 = AnonymousClass0Q9.A02(obj);
        if (r2 != null) {
            A002 = C03860Kx.A00(r2);
        } else {
            A002 = AnonymousClass0DX.A00(r3, obj);
        }
        this.A02 = A002;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AnimationState(value=");
        A10.append(this.A05.getValue());
        A10.append(", velocity=");
        A10.append(A00());
        A10.append(", isRunning=");
        A10.append(this.A03);
        A10.append(", lastFrameTimeNanos=");
        A10.append(this.A01);
        A10.append(", finishedTimeNanos=");
        A10.append(this.A00);
        return AnonymousClass001.A1J(A10);
    }
}
