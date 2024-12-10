package X;

public final class AUY implements C22511BAs {
    public static final Integer A00(C166388co r6) {
        int i;
        AnonymousClass9KS A00 = AnonymousClass9KS.A00(r6.status_);
        if (A00 == null) {
            A00 = AnonymousClass9KS.PENDING;
        }
        C166408cq r0 = r6.key_;
        if (r0 == null) {
            r0 = C166408cq.DEFAULT_INSTANCE;
        }
        if (r0.fromMe_) {
            int ordinal = A00.ordinal();
            if (ordinal != 5) {
                i = 7;
                if (ordinal != 0) {
                    if (ordinal == 2) {
                        return 4;
                    }
                    if (ordinal == 3) {
                        return 5;
                    }
                    if (ordinal != 4) {
                        return 0;
                    }
                    i = 13;
                }
            } else {
                i = 8;
            }
        } else if (A00.ordinal() != 5) {
            return null;
        } else {
            i = 9;
        }
        return Integer.valueOf(i);
    }

    public void C1A(C195629te r3, AnonymousClass8X1 r4, AnonymousClass206 r5) {
        AnonymousClass9KS r0;
        C18070vi.A0h(r5, r4);
        int A0D = r5.A0D();
        if (!r5.A0v.A02) {
            if (!(A0D == 9 || A0D == 10)) {
                return;
            }
            r0 = AnonymousClass9KS.PLAYED;
        } else {
            if (A0D != 0) {
                if (A0D == 13) {
                    r0 = AnonymousClass9KS.READ;
                } else if (A0D != 21) {
                    if (A0D == 4) {
                        r0 = AnonymousClass9KS.SERVER_ACK;
                    } else if (A0D == 5) {
                        r0 = AnonymousClass9KS.DELIVERY_ACK;
                    } else if (A0D != 7) {
                        if (A0D != 8) {
                            r0 = AnonymousClass9KS.PENDING;
                        }
                        r0 = AnonymousClass9KS.PLAYED;
                    }
                }
            }
            r0 = AnonymousClass9KS.ERROR;
        }
        C166388co A0X = C17880vN.A0X(r4);
        A0X.status_ = r0.value;
        A0X.bitField0_ |= 8;
    }

    public void C1B(C193069pU r2, C166388co r3, AnonymousClass206 r4) {
        Integer A00;
        C18070vi.A0h(r3, r4);
        if (r4.A0D() == 0 && (A00 = A00(r3)) != null) {
            r4.A0a(A00.intValue());
        }
    }
}
