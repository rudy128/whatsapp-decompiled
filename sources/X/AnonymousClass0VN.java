package X;

/* renamed from: X.0VN  reason: invalid class name */
public class AnonymousClass0VN implements C17020tb {
    public final int A00;

    public AnonymousClass0VN(int i) {
        this.A00 = i;
    }

    public final AnonymousClass0Jq BBt(C16260ry r9) {
        C16240rw r7;
        long j;
        long j2;
        switch (this.A00) {
            case 0:
                C04620Oc r1 = ((AnonymousClass0VO) r9).A00;
                return new AnonymousClass0Jq(r1.A02(r1.A02), r1.A02(r1.A00), AnonymousClass000.A1Z(r9.BPk(), AnonymousClass00R.A00));
            case 1:
                r7 = AnonymousClass0VI.A00;
                break;
            case 2:
                r7 = AnonymousClass0VJ.A00;
                break;
            default:
                return AnonymousClass0PJ.A01(r9);
        }
        boolean A1Z = AnonymousClass000.A1Z(r9.BPk(), AnonymousClass00R.A00);
        C04620Oc r6 = ((AnonymousClass0VO) r9).A00;
        long BNf = r7.BNf(r6, r6.A02);
        if (!A1Z) {
            j = BNf >> 32;
        } else {
            j = BNf & 4294967295L;
        }
        AnonymousClass0OV A02 = r6.A02((int) j);
        long BNf2 = r7.BNf(r6, r6.A00);
        if (A1Z) {
            j2 = BNf2 >> 32;
        } else {
            j2 = BNf2 & 4294967295L;
        }
        return new AnonymousClass0Jq(A02, r6.A02((int) j2), A1Z);
    }
}
