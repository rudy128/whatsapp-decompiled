package X;

/* renamed from: X.08l  reason: invalid class name and case insensitive filesystem */
public abstract class C014308l extends AnonymousClass0XW {
    public AnonymousClass0XW A00;
    public final int A01 = C04970Ps.A00(this);

    public final void A0N(C15830rH r9) {
        int i;
        AnonymousClass0XW r1 = (AnonymousClass0XW) r9;
        AnonymousClass0XW r2 = r1.A03;
        AnonymousClass0XW r4 = null;
        if (r2 != r9) {
            if (r9 instanceof AnonymousClass0XW) {
                r4 = r1.A04;
            }
            if (r2 != this.A03 || !C18070vi.A18(r4, this)) {
                throw AnonymousClass000.A0n("Cannot delegate to an already delegated node");
            }
        } else if (!r2.A07) {
            r2.A03 = this.A03;
            int i2 = this.A01;
            int A012 = C04970Ps.A01(r2);
            r2.A01 = A012;
            int i3 = this.A01;
            int i4 = A012 & 2;
            if (i4 == 0 || (2 & i3) == 0 || (this instanceof C17670v2)) {
                r2.A02 = this.A00;
                this.A00 = r2;
                r2.A04 = this;
                int i5 = i3 | A012;
                this.A01 = i5;
                if (i3 != i5) {
                    AnonymousClass0XW r3 = this.A03;
                    if (r3 == this) {
                        this.A00 = i5;
                    }
                    if (this.A07) {
                        AnonymousClass0XW r12 = this;
                        while (true) {
                            i5 |= r12.A01;
                            r12.A01 = i5;
                            if (r12 != r3) {
                                r12 = r12.A04;
                                if (r12 == null) {
                                    break;
                                }
                            } else {
                                AnonymousClass0XW r0 = r12.A02;
                                if (r0 != null) {
                                    i = r0.A00;
                                } else {
                                    i = 0;
                                }
                                int i6 = i5 | i;
                                do {
                                    i6 |= r12.A01;
                                    r12.A00 = i6;
                                    r12 = r12.A04;
                                } while (r12 != null);
                            }
                        }
                    }
                }
                if (this.A07) {
                    if (i4 == 0 || (i2 & 2) != 0) {
                        A0H(A0A());
                    } else {
                        AnonymousClass0QR r13 = AnonymousClass0QV.A03(this).A0S;
                        this.A03.A0H((C01850Ad) null);
                        r13.A0A();
                    }
                    r2.A0C();
                    r2.A0F();
                    C04970Ps.A02(r2);
                    return;
                }
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ");
            A10.append(this);
            throw AnonymousClass000.A0n(AnonymousClass001.A1E(r2, "\nDelegate Node: ", A10));
        } else {
            throw AnonymousClass000.A0n("Cannot delegate to an already attached node");
        }
    }

    public void A0D() {
        for (AnonymousClass0XW r0 = this.A00; r0 != null; r0 = r0.A02) {
            r0.A0D();
        }
        super.A0D();
    }

    public void A0F() {
        for (AnonymousClass0XW r0 = this.A00; r0 != null; r0 = r0.A02) {
            r0.A0F();
        }
        super.A0F();
    }

    public void A0C() {
        super.A0C();
        for (AnonymousClass0XW r1 = this.A00; r1 != null; r1 = r1.A02) {
            r1.A0H(A0A());
            if (!r1.A07) {
                r1.A0C();
            }
        }
    }

    public void A0E() {
        super.A0E();
        for (AnonymousClass0XW r0 = this.A00; r0 != null; r0 = r0.A02) {
            r0.A0E();
        }
    }

    public void A0G() {
        super.A0G();
        for (AnonymousClass0XW r0 = this.A00; r0 != null; r0 = r0.A02) {
            r0.A0G();
        }
    }

    public void A0H(C01850Ad r2) {
        super.A0H(r2);
        for (AnonymousClass0XW r0 = this.A00; r0 != null; r0 = r0.A02) {
            r0.A0H(r2);
        }
    }
}
