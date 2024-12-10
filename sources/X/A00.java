package X;

public class A00 {
    public final int A00;
    public final Integer A01;
    public final Long A02;
    public final Long A03;
    public final boolean A04;

    public A00(Integer num, Long l, boolean z) {
        this(num, (Long) null, l, 1, z);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[success=");
        StringBuilder sb = new StringBuilder(AnonymousClass3MY.A0r(A10, this.A04));
        Long l = this.A03;
        if (l != null) {
            sb.append(" refresh=");
            sb.append(l);
        }
        Long l2 = this.A02;
        if (l2 != null) {
            sb.append(" backoff=");
            sb.append(l2);
        }
        Integer num = this.A01;
        if (num != null) {
            sb.append(" errorCode=");
            sb.append(num);
        }
        return AnonymousClass000.A0z(sb);
    }

    public A00(Integer num, Long l, Long l2, int i, boolean z) {
        this.A04 = z;
        this.A03 = l;
        this.A02 = l2;
        this.A01 = num;
        this.A00 = i;
    }
}
