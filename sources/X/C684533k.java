package X;

/* renamed from: X.33k  reason: invalid class name and case insensitive filesystem */
public final class C684533k implements C22511BAs {
    public /* synthetic */ void C1B(C193069pU r1, C166388co r2, AnonymousClass206 r3) {
    }

    public void C1A(C195629te r9, AnonymousClass8X1 r10, AnonymousClass206 r11) {
        C18070vi.A0h(r11, r10);
        if (r11.A0v.A02 && r11.A0D() != 0) {
            long j = r11.A0I / 1000;
            long j2 = r11.A0H / 1000;
            if (j2 > 0 && j2 != j) {
                C166388co A0X = C17880vN.A0X(r10);
                A0X.bitField0_ |= 32;
                A0X.messageC2STimestamp_ = j2;
            }
        }
    }
}
