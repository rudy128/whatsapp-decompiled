package X;

/* renamed from: X.8q4  reason: invalid class name */
public final class AnonymousClass8q4 extends C20126A8l {
    public final C194399rf A00;
    public final String[] A01;
    public final AnonymousClass11S A02;
    public final C178119Bw A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8q4(AnonymousClass11S r13, C194399rf r14, C62382rJ r15, C19999A2n a2n, C178119Bw r17, String str, long j) {
        super(r15, a2n, str, "regular", 7, j, false);
        C18070vi.A0d(r15, 4);
        this.A00 = r14;
        this.A03 = r17;
        this.A02 = r13;
        this.A01 = new String[]{"call_log", r14.A00.getRawString(), r14.A01, AnonymousClass8BS.A0b(r14.A02 ? 1 : 0)};
    }

    public C163398Uv A08() {
        C178119Bw r1 = this.A03;
        if (r1 == null) {
            return super.A08();
        }
        C166128cO A022 = A77.A02(this.A02, r1);
        C163398Uv A08 = super.A08();
        C23624Bmt A082 = AnonymousClass8BS.A08(C164208Xy.DEFAULT_INSTANCE);
        C164208Xy r12 = (C164208Xy) A082.A00;
        A022.getClass();
        r12.callLogRecord_ = A022;
        r12.bitField0_ |= 1;
        C164208Xy r0 = (C164208Xy) A082.A0C();
        C166378cn A0O = AnonymousClass8BW.A0O(A08, r0);
        A0O.callLogAction_ = r0;
        A0O.bitField1_ |= 16;
        return A08;
    }
}
