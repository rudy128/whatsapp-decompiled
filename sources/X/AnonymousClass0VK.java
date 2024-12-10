package X;

/* renamed from: X.0VK  reason: invalid class name */
public final class AnonymousClass0VK implements C16630sk {
    public final /* synthetic */ C05120Qm A00;

    public AnonymousClass0VK(C05120Qm r1) {
        this.A00 = r1;
    }

    public boolean BsI(C17020tb r9, long j) {
        C04940Pp r0;
        C05120Qm r1 = this.A00;
        if (r1.A0E().A04().length() == 0 || (r0 = r1.A03) == null || r0.A0A.getValue() == null) {
            return false;
        }
        long unused = r1.A02(r9, r1.A0E(), j, false, false, false);
        return true;
    }

    public boolean C6G(C17020tb r9, long j) {
        C04940Pp r0;
        C05120Qm r1 = this.A00;
        if (r1.A0E().A04().length() == 0 || (r0 = r1.A03) == null || r0.A0A.getValue() == null) {
            return false;
        }
        C04310Mr r02 = r1.A04;
        if (r02 != null) {
            r02.A00();
        }
        r1.A01 = j;
        r1.A00 = -1;
        r1.A0Q(true);
        long unused = r1.A02(r9, r1.A0E(), r1.A01, true, false, false);
        return true;
    }
}
