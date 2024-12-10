package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0WK  reason: invalid class name */
public final class AnonymousClass0WK implements C17470ui {
    public AnonymousClass06y A00;
    public C015408x A01 = new C015408x();
    public C24246By4 A02;
    public final C17090tj A03;
    public final C04230Mj A04;
    public final AnonymousClass0OF A05;

    public static final boolean A01(C015408x r10, C24246By4 by4, C22821Di r12, int i) {
        Boolean bool;
        if (i == 1 || i == 2) {
            return AnonymousClass0QK.A07(r10, r12, i);
        }
        if (!(i == 3 || i == 4 || i == 5 || i == 6)) {
            if (i == 7) {
                int ordinal = by4.ordinal();
                if (ordinal == 0) {
                    i = 4;
                } else if (ordinal == 1) {
                    i = 3;
                } else {
                    throw new AnonymousClass3EW();
                }
                r10 = C04800Ox.A00(r10);
                if (r10 == null) {
                    return false;
                }
            } else if (i == 8) {
                C015408x A002 = C04800Ox.A00(r10);
                if (A002 == null) {
                    return false;
                }
                AnonymousClass0XW r1 = A002.A03;
                if (r1.A07) {
                    AnonymousClass0XW r8 = r1.A04;
                    AnonymousClass0XV A032 = AnonymousClass0QV.A03(A002);
                    while (A032 != null) {
                        if (AnonymousClass0QR.A01(A032, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                            while (r8 != null) {
                                if ((r8.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                    AnonymousClass0XW r5 = r8;
                                    C06970a9 r4 = null;
                                    do {
                                        if (r5 instanceof C015408x) {
                                            C015408x r52 = (C015408x) r5;
                                            if (r52.A0N().A08) {
                                                if (r52.equals(r10)) {
                                                    return false;
                                                }
                                                bool = (Boolean) r12.invoke(r52);
                                                return bool.booleanValue();
                                            }
                                        } else if ((r5.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 && (r5 instanceof C014308l)) {
                                            int i2 = 0;
                                            for (AnonymousClass0XW r3 = ((C014308l) r5).A00; r3 != null; r3 = r3.A02) {
                                                if ((r3.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        r5 = r3;
                                                    } else {
                                                        r4 = AnonymousClass001.A0z(r4);
                                                        r5 = AnonymousClass000.A0d(r4, r5);
                                                        r4.A0F(r3);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                                continue;
                                            }
                                        }
                                        r5 = AnonymousClass0QV.A00(r4);
                                        continue;
                                    } while (r5 != null);
                                }
                                r8 = r8.A04;
                            }
                        }
                        A032 = A032.A0I();
                        if (A032 == null) {
                            return false;
                        }
                        AnonymousClass0QR r0 = A032.A0S;
                        if (r0 != null) {
                            r8 = r0.A05;
                        } else {
                            r8 = null;
                        }
                    }
                    return false;
                }
                throw AnonymousClass000.A0n("visitAncestors called on an unattached node");
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Focus search invoked with invalid FocusDirection ");
                A10.append(AnonymousClass0N9.A00(i));
                throw AnonymousClass000.A0m(A10);
            }
        }
        bool = C05080Qi.A02(r10, r12, i);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public C24246By4 A02() {
        C24246By4 by4 = this.A02;
        if (by4 != null) {
            return by4;
        }
        C18070vi.A11("layoutDirection");
        throw null;
    }

    public void BEt(boolean z, boolean z2) {
        AnonymousClass0CW r0;
        int intValue;
        AnonymousClass0OF r4 = this.A05;
        try {
            if (r4.A00) {
                AnonymousClass0OF.A00(r4);
            }
            r4.A00 = true;
            if (z || !((intValue = AnonymousClass0Qa.A00(this.A01, 8).intValue()) == 2 || intValue == 1 || intValue == 3)) {
                C015408x r2 = this.A01;
                AnonymousClass0CW A0O = r2.A0O();
                if (AnonymousClass0Qa.A08(r2, z, z2)) {
                    int ordinal = A0O.ordinal();
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                        r0 = AnonymousClass0CW.Active;
                    } else if (ordinal == 3) {
                        r0 = AnonymousClass0CW.Inactive;
                    } else {
                        throw new AnonymousClass3EW();
                    }
                    r2.A0R(r0);
                }
            }
        } finally {
            AnonymousClass0OF.A01(r4);
        }
    }

    public boolean Bk5(int i) {
        boolean Bk5;
        C015408x r4 = this.A01;
        C015408x A002 = C04800Ox.A00(r4);
        if (A002 == null) {
            return false;
        }
        C04310Mr A003 = A00(A002, A02(), i);
        if (A003 == C04310Mr.A02) {
            C22811Dh r3 = new C22811Dh();
            boolean A012 = A01(r4, A02(), new C11390jx(this, A002, r3, i), i);
            if (r3.element) {
                return false;
            }
            if (!A012) {
                if (!r4.A0O().A00() || r4.A0O().Ber()) {
                    return false;
                }
                if (i != 1 && i != 2) {
                    return false;
                }
                BEt(false, true);
                if (!r4.A0O().Ber()) {
                    return false;
                }
                Bk5 = Bk5(i);
            }
            return true;
        } else if (A003 == C04310Mr.A01) {
            return false;
        } else {
            Bk5 = A003.A00();
        }
        if (Bk5) {
            return true;
        }
        return false;
    }

    public AnonymousClass0WK(C22821Di r3) {
        this.A04 = new C04230Mj(r3);
        this.A05 = new AnonymousClass0OF();
        this.A03 = new C01890As(this, 0);
    }

    public static final C04310Mr A00(C015408x r3, C24246By4 by4, int i) {
        C22821Di A012;
        C04310Mr r0;
        C04310Mr r02;
        AnonymousClass0WL A0N = r3.A0N();
        if (i == 1) {
            return A0N.A03;
        }
        if (i == 2) {
            return A0N.A04;
        }
        if (i == 5) {
            return A0N.A07;
        }
        if (i == 6) {
            return A0N.A00;
        }
        if (AnonymousClass000.A1T(i, 3)) {
            int ordinal = by4.ordinal();
            if (ordinal == 0) {
                r02 = A0N.A06;
            } else if (ordinal == 1) {
                r02 = A0N.A01;
            } else {
                throw new AnonymousClass3EW();
            }
            if (r02 == C04310Mr.A02) {
                return A0N.A02;
            }
            return r02;
        } else if (i == 4) {
            int ordinal2 = by4.ordinal();
            if (ordinal2 == 0) {
                r0 = A0N.A01;
            } else if (ordinal2 == 1) {
                r0 = A0N.A06;
            } else {
                throw new AnonymousClass3EW();
            }
            if (r0 == C04310Mr.A02) {
                return A0N.A05;
            }
            return r0;
        } else {
            if (i == 7) {
                A012 = A0N.A00();
            } else if (i == 8) {
                A012 = A0N.A01();
            } else {
                throw AnonymousClass000.A0n("invalid FocusDirection");
            }
            return (C04310Mr) A012.invoke(new AnonymousClass0N9(i));
        }
    }

    public void CJJ(C24246By4 by4) {
        this.A02 = by4;
    }
}
