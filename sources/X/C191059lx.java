package X;

/* renamed from: X.9lx  reason: invalid class name and case insensitive filesystem */
public final class C191059lx {
    public long A00;
    public long A01;
    public String A02;
    public String A03;

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ action: ");
        C20088A6q.A03(A10, this.A02);
        A10.append(" status: ");
        C20088A6q.A03(A10, this.A03);
        StringBuilder A0y = AnonymousClass8BT.A0y(" pauseStartDate: ", A10);
        A0y.append(this.A01);
        C20088A6q.A04(A0y, A10);
        StringBuilder A0y2 = AnonymousClass8BT.A0y(" pauseEndDate: ", A10);
        A0y2.append(this.A00);
        C20088A6q.A04(A0y2, A10);
        return AnonymousClass000.A0z(A10);
    }
}
