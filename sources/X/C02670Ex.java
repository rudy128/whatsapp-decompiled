package X;

/* renamed from: X.0Ex  reason: invalid class name and case insensitive filesystem */
public abstract /* synthetic */ class C02670Ex {
    public static Object A00(C17540up r8, AnonymousClass0OJ r9) {
        AnonymousClass0XW r1 = ((AnonymousClass0XW) r8).A03;
        if (r1.A07) {
            AnonymousClass0XW r5 = r1.A04;
            AnonymousClass0XV A03 = AnonymousClass0QV.A03(r8);
            if (A03 != null) {
                while (true) {
                    if ((A03.A0S.A01.A00 & 32) != 0) {
                        while (r5 != null) {
                            if ((r5.A01 & 32) != 0) {
                                AnonymousClass0XW r7 = r5;
                                C06970a9 r6 = null;
                                do {
                                    if (r7 instanceof C17540up) {
                                        C02080Cq BXh = ((C17540up) r7).BXh();
                                        if (BXh.A01(r9)) {
                                            return BXh.A00(r9);
                                        }
                                    } else if ((r7.A01 & 32) != 0 && (r7 instanceof C014308l)) {
                                        int i = 0;
                                        for (AnonymousClass0XW r3 = ((C014308l) r7).A00; r3 != null; r3 = r3.A02) {
                                            if ((r3.A01 & 32) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    r7 = r3;
                                                } else {
                                                    r6 = AnonymousClass001.A0z(r6);
                                                    r7 = AnonymousClass000.A0d(r6, r7);
                                                    r6.A0F(r3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                            continue;
                                        }
                                    }
                                    r7 = AnonymousClass0QV.A00(r6);
                                    continue;
                                } while (r7 != null);
                            }
                            r5 = r5.A04;
                        }
                    }
                    A03 = A03.A0I();
                    if (A03 == null) {
                        break;
                    }
                    AnonymousClass0QR r0 = A03.A0S;
                    if (r0 != null) {
                        r5 = r0.A05;
                    } else {
                        r5 = null;
                    }
                }
            }
            return r9.A00().invoke();
        }
        throw AnonymousClass000.A0k("ModifierLocal accessed from an unattached node");
    }
}
