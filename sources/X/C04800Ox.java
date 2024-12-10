package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0Ox  reason: invalid class name and case insensitive filesystem */
public abstract class C04800Ox {
    public static final C015408x A01(C015408x r9) {
        C015408x r4;
        int A00;
        AnonymousClass0XW r1 = r9.A03;
        if (!r1.A07) {
            return null;
        }
        C06970a9 A02 = C06970a9.A02(new AnonymousClass0XW[16]);
        AnonymousClass0XW r0 = r1.A02;
        if (r0 == null) {
            AnonymousClass0QV.A06(A02, r1);
        } else {
            A02.A0F(r0);
        }
        loop0:
        while (true) {
            int i = A02.A00;
            if (i != 0) {
                AnonymousClass0XW A03 = C06970a9.A03(A02, i);
                if ((A03.A00 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                    while (true) {
                        if ((A03.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) == 0) {
                            A03 = A03.A02;
                            if (A03 == null) {
                                break;
                            }
                        } else {
                            C06970a9 r3 = null;
                            do {
                                if (A03 instanceof C015408x) {
                                    r4 = (C015408x) A03;
                                    if (r4.A03.A07 && ((A00 = C015408x.A00(r4)) == 0 || A00 == 1 || A00 == 2)) {
                                        return r4;
                                    }
                                } else if ((A03.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 && (A03 instanceof C014308l)) {
                                    int i2 = 0;
                                    for (AnonymousClass0XW r2 = ((C014308l) A03).A00; r2 != null; r2 = r2.A02) {
                                        if ((r2.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                A03 = r2;
                                            } else {
                                                r3 = AnonymousClass001.A10(r3);
                                                A03 = AnonymousClass000.A0d(r3, A03);
                                                r3.A0F(r2);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                        continue;
                                    }
                                }
                                A03 = AnonymousClass0QV.A00(r3);
                                continue;
                            } while (A03 != null);
                        }
                    }
                } else {
                    AnonymousClass0QV.A06(A02, A03);
                }
            } else {
                return null;
            }
        }
        return r4;
    }

    public static final C015408x A00(C015408x r9) {
        int A00 = C015408x.A00(r9);
        if (A00 != 0) {
            if (A00 == 1) {
                AnonymousClass0XW r2 = r9.A03;
                if (r2.A07) {
                    C06970a9 A01 = C06970a9.A01();
                    AnonymousClass0XW r0 = r2.A02;
                    if (r0 == null) {
                        AnonymousClass0QV.A06(A01, r2);
                    } else {
                        A01.A0F(r0);
                    }
                    loop3:
                    while (true) {
                        int i = A01.A00;
                        if (i != 0) {
                            AnonymousClass0XW A03 = C06970a9.A03(A01, i);
                            if ((A03.A00 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                while (true) {
                                    if ((A03.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) == 0) {
                                        A03 = A03.A02;
                                        if (A03 == null) {
                                            break;
                                        }
                                    } else {
                                        C06970a9 r7 = null;
                                        do {
                                            if (A03 instanceof C015408x) {
                                                r9 = A00((C015408x) A03);
                                                if (r9 != null) {
                                                    break loop3;
                                                }
                                            } else if ((A03.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 && (A03 instanceof C014308l)) {
                                                int i2 = 0;
                                                for (AnonymousClass0XW r5 = ((C014308l) A03).A00; r5 != null; r5 = r5.A02) {
                                                    if ((r5.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                                        i2++;
                                                        if (i2 == 1) {
                                                            A03 = r5;
                                                        } else {
                                                            r7 = AnonymousClass001.A10(r7);
                                                            A03 = AnonymousClass000.A0d(r7, A03);
                                                            r7.A0F(r5);
                                                        }
                                                    }
                                                }
                                                if (i2 == 1) {
                                                    continue;
                                                }
                                            }
                                            A03 = AnonymousClass0QV.A00(r7);
                                            continue;
                                        } while (A03 != null);
                                    }
                                }
                            } else {
                                AnonymousClass0QV.A06(A01, A03);
                            }
                        } else {
                            return null;
                        }
                    }
                } else {
                    throw AnonymousClass000.A0n("visitChildren called on an unattached node");
                }
            } else if (A00 != 2) {
                if (A00 == 3) {
                    return null;
                }
                throw new AnonymousClass3EW();
            }
        }
        return r9;
    }

    public static final AnonymousClass0NU A02(C015408x r2) {
        C01850Ad A0A = r2.A0A();
        if (A0A != null) {
            return AnonymousClass0LN.A01(A0A).Bhs(A0A, false);
        }
        return AnonymousClass0NU.A04;
    }

    public static final boolean A03(C015408x r2) {
        AnonymousClass0XV A0t;
        C01850Ad A0A = r2.A0A();
        if (A0A == null || (A0t = A0A.A0t()) == null || !A0t.A0Q.A0G.A08 || A0t.A08 == null) {
            return false;
        }
        return true;
    }
}
