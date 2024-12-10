package X;

/* renamed from: X.2tc  reason: invalid class name and case insensitive filesystem */
public final class C63742tc {
    public Long A00;
    public final AnonymousClass18K A01;
    public final C127816ey A02 = new Object();
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public static final Integer A01(Integer num) {
        int i = 4;
        int i2 = 5;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (!(intValue == 5 || intValue == 22)) {
            if (intValue != 4) {
                i = 11;
                if (intValue != 11) {
                    int i3 = 2;
                    if (intValue != 3) {
                        if (intValue != 13) {
                            i2 = 1;
                            if (!(intValue == 7 || intValue == 9 || intValue == 12 || intValue == 6 || intValue == 2 || intValue == 1)) {
                                i3 = 8;
                                if (intValue != 8) {
                                    if (intValue == 20) {
                                        return 14;
                                    }
                                    if (intValue == 21) {
                                        return 15;
                                    }
                                    if (intValue == 24) {
                                        return 12;
                                    }
                                    if (intValue != 25) {
                                        if (intValue == 27) {
                                            return 13;
                                        }
                                        if (intValue == 26) {
                                            return 9;
                                        }
                                        i = 10;
                                        if (intValue != 10) {
                                            if (intValue != 28) {
                                                if (!(intValue == 29 || intValue == 31 || intValue == 30)) {
                                                    if (intValue == 32) {
                                                        return 18;
                                                    }
                                                    if (intValue == 33) {
                                                        return 19;
                                                    }
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return Integer.valueOf(i2);
                    }
                    return Integer.valueOf(i3);
                }
            }
            return 3;
        }
        return Integer.valueOf(i);
    }

    public static final Integer A02(Integer num, boolean z) {
        int i = 3;
        if (!z) {
            if (num == null) {
                return null;
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                return 2;
            }
            if (intValue == 3) {
                i = 4;
            } else if (intValue == 13) {
                i = 5;
            } else {
                i = 1;
                if (intValue != 1) {
                    i = 6;
                    if (intValue != 2) {
                        return null;
                    }
                }
            }
        }
        return Integer.valueOf(i);
    }

    public static final AnonymousClass2HA A00(C63742tc r3) {
        AnonymousClass2HA r2 = new AnonymousClass2HA();
        if (r3.A00 == null) {
            AnonymousClass00H r1 = r3.A03;
            if (((C138896xs) r1.get()).A00 == null) {
                ((C138896xs) r1.get()).A01();
            }
        }
        Long l = ((C138896xs) r3.A03.get()).A00;
        if (l == null) {
            l = r3.A00;
        }
        r2.A09 = l;
        r3.A00 = l;
        return r2;
    }

    public static final boolean A03(C63742tc r0) {
        return ((C56972iK) r0.A05.get()).A00();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.6ey, java.lang.Object] */
    public C63742tc(AnonymousClass18K r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0s(r2, r3, r4, r5);
        this.A01 = r2;
        this.A05 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public final void A04(AnonymousClass206 r12, Long l, String str, int i) {
        Integer num;
        boolean z;
        String obj;
        String obj2;
        String obj3;
        String str2;
        Long l2;
        C692236j A022;
        AnonymousClass77N r1;
        AnonymousClass23N r0;
        AnonymousClass77K A002 = C63672tV.A00(r12);
        Long l3 = null;
        if (A002 != null) {
            int i2 = A002.A00;
            int i3 = 1;
            if (i2 != 0) {
                i3 = 3;
                if (i2 != 1) {
                    i3 = 2;
                    if (i2 != 2) {
                        num = null;
                        z = A002.A05;
                    }
                }
            }
            num = Integer.valueOf(i3);
            z = A002.A05;
        } else {
            num = null;
            z = false;
        }
        Integer A023 = A02(Integer.valueOf(r12.A0u), false);
        if (A03(this)) {
            AnonymousClass2HA A003 = A00(this);
            A003.A03 = Integer.valueOf(i);
            if (!(r12 instanceof AnonymousClass23N) || (r0 = (AnonymousClass23N) r12) == null || (str2 = r0.A01) == null) {
                str2 = r12.A0v.A01;
            }
            A003.A0C = str2;
            A003.A02 = A01(Integer.valueOf(r12.A09));
            A003.A01 = A023;
            A003.A0D = str;
            A003.A06 = l;
            int i4 = r12.A0A;
            if (i4 != 0) {
                l2 = C17880vN.A0n(i4);
            } else {
                l2 = null;
            }
            A003.A07 = l2;
            A003.A04 = num;
            if (r12 instanceof AnonymousClass21X) {
                l3 = C17880vN.A0n(((AnonymousClass21V) r12).A0D);
            }
            A003.A08 = l3;
            if (!(!C18020vd.A05(C18040vf.A02, ((C56972iK) this.A05.get()).A00, 11871) || (A022 = C63672tV.A02(r12)) == null || (r1 = A022.A01) == null)) {
                A003.A0A = r1.A05;
                A003.A05 = C17880vN.A0n(r1.A01);
                A003.A0B = r1.A06;
            }
            this.A01.CC7(A003);
        }
        if (C18020vd.A05(C18040vf.A02, ((C56972iK) this.A05.get()).A00, 6708)) {
            C58082k7 r5 = (C58082k7) this.A04.get();
            String str3 = r12.A0v.A01;
            C18070vi.A0X(str3);
            Integer valueOf = Integer.valueOf(i);
            Long l4 = r5.A00;
            if (l4 != null) {
                long longValue = l4.longValue();
                try {
                    C30071dL r6 = r5.A01;
                    r6.flowAnnotate(longValue, "status_id", str3);
                    if (!(A023 == null || (obj3 = A023.toString()) == null)) {
                        r6.flowAnnotate(longValue, "content_type", obj3);
                    }
                    if (!(valueOf == null || (obj2 = valueOf.toString()) == null)) {
                        r6.flowMarkPoint(longValue, obj2);
                    }
                    r6.flowAnnotate(longValue, "is_fb_auto_crossposting_enabled_end", C18070vi.A18(r5.A02.A01(AnonymousClass00R.A0L), AnonymousClass000.A0i()));
                    if (!(num == null || (obj = num.toString()) == null)) {
                        r6.flowAnnotate(longValue, "status_privacy_type", obj);
                    }
                    r6.flowAnnotate(longValue, "is_fb_crosspost", z);
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        if (intValue == 14) {
                            r6.flowEndSuccess(longValue);
                            r5.A00 = null;
                        } else if (intValue == 12) {
                            r6.flowEndFail(longValue, str, (String) null);
                            r5.A00 = null;
                        }
                    }
                } catch (IllegalArgumentException e) {
                    r5.A01.flowEndFail(longValue, e.getMessage(), (String) null);
                }
            }
        }
    }
}
