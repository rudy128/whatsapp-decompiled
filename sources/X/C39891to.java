package X;

/* renamed from: X.1to  reason: invalid class name and case insensitive filesystem */
public final class C39891to implements C39841tj {
    public int A00;
    public long A01;
    public C39911tq A02;
    public boolean A03;
    public final C39881tn A04;
    public final C39861tl A05;

    public void close() {
        this.A03 = true;
    }

    public long CDN(C39881tn r15) {
        C39911tq r2;
        C39911tq r22;
        C18070vi.A0c(r15, 0);
        if (!this.A03) {
            C39911tq r3 = this.A02;
            if (r3 == null || (r3 == (r22 = this.A04.A01) && this.A00 == r22.A01)) {
                this.A05.CFQ(this.A01 + 8192);
                if (this.A02 == null && (r2 = this.A04.A01) != null) {
                    this.A02 = r2;
                    this.A00 = r2.A01;
                }
                C39881tn r4 = this.A04;
                long j = r4.A00;
                long j2 = this.A01;
                long min = Math.min(8192, j - j2);
                if (min <= 0) {
                    return -1;
                }
                long j3 = min;
                C39921tr.A00(j, j2, min);
                if (min != 0) {
                    r15.A00 += min;
                    C39911tq r42 = r4.A01;
                    while (true) {
                        if (r42 == null) {
                            break;
                        } else if (j2 >= ((long) (r42.A00 - r42.A01))) {
                            j2 -= (long) (r42.A00 - r42.A01);
                            r42 = r42.A02;
                        } else {
                            while (j3 > 0) {
                                if (r42 != null) {
                                    C39911tq A012 = r42.A01();
                                    int i = A012.A01 + ((int) j2);
                                    A012.A01 = i;
                                    A012.A00 = Math.min(i + ((int) j3), A012.A00);
                                    C39911tq r23 = r15.A01;
                                    if (r23 == null) {
                                        A012.A03 = A012;
                                        A012.A02 = A012;
                                        r15.A01 = A012;
                                    } else {
                                        C39911tq r24 = r23.A03;
                                        if (r24 != null) {
                                            r24.A02(A012);
                                        }
                                    }
                                    j3 -= (long) (A012.A00 - A012.A01);
                                    r42 = r42.A02;
                                    j2 = 0;
                                }
                            }
                        }
                    }
                    C18070vi.A0R();
                    throw null;
                }
                this.A01 += min;
                return min;
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        throw new IllegalStateException("closed");
    }

    public C39891to(C39861tl r2) {
        int i;
        this.A05 = r2;
        C39881tn r0 = ((C39871tm) r2).A01;
        this.A04 = r0;
        C39911tq r02 = r0.A01;
        this.A02 = r02;
        if (r02 != null) {
            i = r02.A01;
        } else {
            i = -1;
        }
        this.A00 = i;
    }
}
