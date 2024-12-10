package X;

/* renamed from: X.Cbs  reason: case insensitive filesystem */
public final class C25253Cbs {
    public final C26141Qz A00;
    public final C18030ve A01;
    public final AnonymousClass18K A02;
    public final C25241Nl A03;

    public final void A02(AnonymousClass1BI r9, Integer num) {
        C18070vi.A0d(r9, 0);
        A01(r9, (C59162lr) null, (C59162lr) null, (C29721cl) null, (C29721cl) null, num, 2);
    }

    public final void A03(AnonymousClass1BI r11, Integer num) {
        A00(r11, (C59162lr) null, (C59162lr) null, (C59162lr) null, (C29721cl) null, (C29721cl) null, (C29721cl) null, num, 2);
    }

    public final void A00(AnonymousClass1BI r9, C59162lr r10, C59162lr r11, C59162lr r12, C29721cl r13, C29721cl r14, C29721cl r15, Integer num, int i) {
        C18030ve r4 = this.A01;
        C18040vf r3 = C18040vf.A02;
        if (C18020vd.A05(r3, r4, 5580)) {
            C23849Br6 br6 = new C23849Br6();
            int i2 = i;
            br6.A08 = Integer.valueOf(i2);
            br6.A0G = Long.valueOf(((long) this.A00.A03(r9.getRawString())) + 1);
            br6.A0J = this.A03.A05(r9.getRawString());
            br6.A00 = Boolean.valueOf(C22971Dz.A0e(r9));
            if (i2 != 1) {
                Integer num2 = num;
                if (num != null) {
                    br6.A07 = num2;
                }
            } else {
                if (r13 != null) {
                    br6.A0C = C17880vN.A0n(r13.expiration);
                    int i3 = r13.disappearingMessagesInitiator;
                    int i4 = 1;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            i4 = 3;
                            if (i3 != 2) {
                                i4 = 4;
                            }
                        } else {
                            i4 = 2;
                        }
                    }
                    br6.A01 = Integer.valueOf(i4);
                    br6.A0D = Long.valueOf(r13.ephemeralSettingTimestamp);
                }
                if (r14 != null) {
                    br6.A0H = C17880vN.A0n(r14.expiration);
                    int i5 = r14.disappearingMessagesInitiator;
                    int i6 = 1;
                    if (i5 != 0) {
                        if (i5 != 1) {
                            i6 = 3;
                            if (i5 != 2) {
                                i6 = 4;
                            }
                        } else {
                            i6 = 2;
                        }
                    }
                    br6.A09 = Integer.valueOf(i6);
                    br6.A0I = Long.valueOf(r14.ephemeralSettingTimestamp);
                }
                if (r15 != null) {
                    br6.A0E = C17880vN.A0n(r15.expiration);
                    int i7 = r15.disappearingMessagesInitiator;
                    int i8 = 1;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            i8 = 3;
                            if (i7 != 2) {
                                i8 = 4;
                            }
                        } else {
                            i8 = 2;
                        }
                    }
                    br6.A04 = Integer.valueOf(i8);
                    br6.A0F = Long.valueOf(r15.ephemeralSettingTimestamp);
                }
                if (C18020vd.A05(r3, r4, 5309)) {
                    if (r10 != null) {
                        br6.A03 = Integer.valueOf(C64002u3.A01(r10.A00));
                        Boolean bool = r10.A01;
                        if (bool != null) {
                            br6.A02 = Integer.valueOf(C72453Mb.A04(bool.booleanValue() ? 1 : 0));
                        }
                    }
                    if (r11 != null) {
                        br6.A0B = Integer.valueOf(C64002u3.A01(r11.A00));
                        Boolean bool2 = r11.A01;
                        if (bool2 != null) {
                            br6.A0A = Integer.valueOf(C72453Mb.A04(bool2.booleanValue() ? 1 : 0));
                        }
                    }
                    if (r12 != null) {
                        br6.A06 = Integer.valueOf(C64002u3.A01(r12.A00));
                        Boolean bool3 = r12.A01;
                        if (bool3 != null) {
                            br6.A05 = Integer.valueOf(C72453Mb.A04(bool3.booleanValue() ? 1 : 0));
                        }
                    }
                }
            }
            this.A02.CC7(br6);
        }
    }

    public final void A01(AnonymousClass1BI r7, C59162lr r8, C59162lr r9, C29721cl r10, C29721cl r11, Integer num, int i) {
        C18030ve r5 = this.A01;
        C18040vf r4 = C18040vf.A02;
        if (C18020vd.A05(r4, r5, 5580)) {
            C23842Bqz bqz = new C23842Bqz();
            bqz.A08 = Integer.valueOf(i);
            bqz.A0D = this.A03.A05(r7.getRawString());
            bqz.A00 = Boolean.valueOf(C22971Dz.A0e(r7));
            if (i == 1) {
                if (r10 != null) {
                    bqz.A09 = C17880vN.A0n(r10.expiration);
                    int i2 = r10.disappearingMessagesInitiator;
                    int i3 = 1;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            i3 = 3;
                            if (i2 != 2) {
                                i3 = 4;
                            }
                        } else {
                            i3 = 2;
                        }
                    }
                    bqz.A01 = Integer.valueOf(i3);
                    bqz.A0A = Long.valueOf(r10.ephemeralSettingTimestamp);
                }
                if (r11 != null) {
                    bqz.A0B = C17880vN.A0n(r11.expiration);
                    int i4 = r11.disappearingMessagesInitiator;
                    int i5 = 1;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            i5 = 3;
                            if (i4 != 2) {
                                i5 = 4;
                            }
                        } else {
                            i5 = 2;
                        }
                    }
                    bqz.A04 = Integer.valueOf(i5);
                    bqz.A0C = Long.valueOf(r11.ephemeralSettingTimestamp);
                }
                if (C18020vd.A05(r4, r5, 5309)) {
                    if (r8 != null) {
                        bqz.A03 = Integer.valueOf(C64002u3.A01(r8.A00));
                        Boolean bool = r8.A01;
                        if (bool != null) {
                            bqz.A02 = Integer.valueOf(C72453Mb.A04(bool.booleanValue() ? 1 : 0));
                        }
                    }
                    if (r9 != null) {
                        bqz.A06 = Integer.valueOf(C64002u3.A01(r9.A00));
                        Boolean bool2 = r9.A01;
                        if (bool2 != null) {
                            bqz.A05 = Integer.valueOf(C72453Mb.A04(bool2.booleanValue() ? 1 : 0));
                        }
                    }
                }
            } else if (num != null) {
                bqz.A07 = num;
            }
            this.A02.CC7(bqz);
        }
    }

    public C25253Cbs(C26141Qz r1, C18030ve r2, AnonymousClass18K r3, C25241Nl r4) {
        C18070vi.A0s(r2, r3, r4, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }
}
