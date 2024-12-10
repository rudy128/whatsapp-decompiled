package X;

/* renamed from: X.ASc  reason: case insensitive filesystem */
public final class C20618ASc implements B83, B85, C436820m {
    public final C18030ve A00;

    public C20618ASc(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.22v, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        boolean z;
        C18070vi.A0d(a6d, 0);
        if (C181609Rd.A00(a6d) != C179839Kc.EPHEMERAL_SETTING) {
            return null;
        }
        C166368cm A002 = C20077A6d.A00(a6d);
        ? r5 = new AnonymousClass206(a6d.A0A, 36, a6d.A03);
        int i = A002.ephemeralExpiration_;
        r5.A17(Integer.valueOf(i));
        C166328ci r0 = A002.disappearingMode_;
        if (r0 == null) {
            r0 = C166328ci.DEFAULT_INSTANCE;
        }
        AnonymousClass9KQ A003 = AnonymousClass9KQ.A00(r0.trigger_);
        if (A003 == null) {
            A003 = AnonymousClass9KQ.UNKNOWN;
        }
        int A004 = C196849vk.A00(A003);
        if (C18020vd.A05(C18040vf.A02, this.A00, 5309)) {
            if (i > 0) {
                r5.A04 = A004;
                C166328ci r02 = A002.disappearingMode_;
                C166328ci r3 = r02;
                if (r02 == null) {
                    r02 = C166328ci.DEFAULT_INSTANCE;
                }
                boolean z2 = r02.initiatedByMe_;
                boolean z3 = r5.A0v.A02;
                r5.A0Q = Boolean.valueOf(AnonymousClass000.A1T(z3 ? 1 : 0, z2 ? 1 : 0));
                if (r3 == null) {
                    r3 = C166328ci.DEFAULT_INSTANCE;
                }
                int i2 = r3.A0R().value;
                if (A004 == 0) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            r5.A04 = 2;
                            z = true;
                        } else if (i2 == 2) {
                            r5.A04 = 2;
                            z = false;
                        }
                        r5.A0Q = z;
                    } else {
                        r5.A04 = 1;
                        r5.A0Q = null;
                        return r5;
                    }
                }
                return r5;
            }
            r5.A04 = 0;
            r5.A0Q = null;
        }
        if (i == 0 && A004 == 4) {
            r5.A04 = 4;
            return r5;
        }
        return r5;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        C18070vi.A0h(r8, a2m);
        if (r8 instanceof C442822v) {
            AnonymousClass205 r5 = r8.A0v;
            C18070vi.A0X(r5);
            C442822v r82 = (C442822v) r8;
            int i = r82.A00;
            AnonymousClass8X8 r3 = a2m.A00;
            C163898Wt A01 = AnonymousClass8X8.A01(r3);
            C166408cq r0 = ((C166368cm) A01.A00).key_;
            if (r0 == null) {
                r0 = C166408cq.DEFAULT_INSTANCE;
            }
            AnonymousClass8X7 A0f = AnonymousClass8BR.A0f(r0);
            AnonymousClass8X7.A02(r5.A00, A0f, r5);
            A01.A0H(A0f);
            C166368cm A0H = AnonymousClass8BS.A0H(A01);
            A0H.bitField0_ |= 4;
            A0H.ephemeralExpiration_ = i;
            A01.A0G(C179839Kc.EPHEMERAL_SETTING);
            if (C18020vd.A05(C18040vf.A02, this.A00, 5309)) {
                C163958Wz r1 = (C163958Wz) C166328ci.DEFAULT_INSTANCE.A0N();
                r1.A0H(C196849vk.A01(r82.A04));
                Boolean bool = r82.A0Q;
                if (bool != null) {
                    r1.A0I(bool.booleanValue());
                }
                C166328ci r02 = (C166328ci) r1.A0C();
                C166368cm A0H2 = AnonymousClass8BS.A0H(A01);
                r02.getClass();
                A0H2.disappearingMode_ = r02;
                A0H2.bitField0_ |= 512;
            }
            r3.A0N(A01);
            return;
        }
        throw AnonymousClass000.A0k("FMessageEphemeralSettingChangeProtobuf not supported message");
    }
}
