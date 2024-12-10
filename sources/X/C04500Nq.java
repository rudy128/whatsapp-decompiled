package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.0Nq  reason: invalid class name and case insensitive filesystem */
public abstract class C04500Nq {
    public static final AnonymousClass0CW A00(C17570us r11) {
        AnonymousClass0XW r112 = (AnonymousClass0XW) r11;
        AnonymousClass0XW r4 = r112.A03;
        C06970a9 r3 = null;
        while (r4 != null) {
            if (r4 instanceof C015408x) {
                AnonymousClass0CW A0O = ((C015408x) r4).A0O();
                int ordinal = A0O.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    return A0O;
                }
            } else if ((r4.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 && (r4 instanceof C014308l)) {
                int i = 0;
                for (AnonymousClass0XW r2 = ((C014308l) r4).A00; r2 != null; r2 = r2.A02) {
                    if ((r2.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                        i++;
                        if (i == 1) {
                            r4 = r2;
                        } else {
                            r3 = AnonymousClass001.A10(r3);
                            r4 = AnonymousClass000.A0d(r3, r4);
                            r3.A0F(r2);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            r4 = AnonymousClass0QV.A00(r3);
        }
        AnonymousClass0XW r1 = r112.A03;
        if (r1.A07) {
            C06970a9 A01 = C06970a9.A01();
            AnonymousClass0XW r0 = r1.A02;
            if (r0 == null) {
                AnonymousClass0QV.A06(A01, r1);
            } else {
                A01.A0F(r0);
            }
            while (true) {
                int i2 = A01.A00;
                if (i2 != 0) {
                    AnonymousClass0XW A03 = C06970a9.A03(A01, i2);
                    if ((A03.A00 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                        while (true) {
                            if ((A03.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) == 0) {
                                A03 = A03.A02;
                                if (A03 == null) {
                                    break;
                                }
                            } else {
                                C06970a9 r32 = null;
                                do {
                                    if (A03 instanceof C015408x) {
                                        AnonymousClass0CW A0O2 = ((C015408x) A03).A0O();
                                        int ordinal2 = A0O2.ordinal();
                                        if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
                                            return A0O2;
                                        }
                                    } else if ((A03.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 && (A03 instanceof C014308l)) {
                                        int i3 = 0;
                                        for (AnonymousClass0XW r22 = ((C014308l) A03).A00; r22 != null; r22 = r22.A02) {
                                            if ((r22.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    A03 = r22;
                                                } else {
                                                    r32 = AnonymousClass001.A10(r32);
                                                    A03 = AnonymousClass000.A0d(r32, A03);
                                                    r32.A0F(r22);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                            continue;
                                        }
                                    }
                                    A03 = AnonymousClass0QV.A00(r32);
                                    continue;
                                } while (A03 != null);
                            }
                        }
                    } else {
                        AnonymousClass0QV.A06(A01, A03);
                    }
                } else {
                    return AnonymousClass0CW.Inactive;
                }
            }
        } else {
            throw AnonymousClass000.A0n("visitChildren called on an unattached node");
        }
    }

    public static final void A02(C015408x r13) {
        AnonymousClass0XW r8 = r13.A03;
        if (r8.A07) {
            AnonymousClass0XW r9 = r8;
            AnonymousClass0XV A03 = AnonymousClass0QV.A03(r13);
            if (A03 != null) {
                while (true) {
                    if (AnonymousClass0QR.A01(A03, 5120) != 0) {
                        while (r9 != null) {
                            int i = r9.A01;
                            if ((i & 5120) != 0) {
                                if (r9 != r8 && (i & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                    return;
                                }
                                if ((i & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                                    AnonymousClass0XW r5 = r9;
                                    C06970a9 r4 = null;
                                    do {
                                        if (r5 instanceof C17570us) {
                                            C17570us r52 = (C17570us) r5;
                                            r52.Buq(A00(r52));
                                        } else if ((r5.A01 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0 && (r5 instanceof C014308l)) {
                                            int i2 = 0;
                                            for (AnonymousClass0XW r3 = ((C014308l) r5).A00; r3 != null; r3 = r3.A02) {
                                                if ((r3.A01 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
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
                            }
                            r9 = r9.A04;
                        }
                    }
                    A03 = A03.A0I();
                    if (A03 != null) {
                        AnonymousClass0QR r0 = A03.A0S;
                        if (r0 != null) {
                            r9 = r0.A05;
                        } else {
                            r9 = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw AnonymousClass000.A0n("visitAncestors called on an unattached node");
        }
    }

    public static final void A01(C17570us r2) {
        C04230Mj r1 = ((AnonymousClass0WK) AnonymousClass0QV.A05(r2).getFocusOwner()).A04;
        C04230Mj.A00(r1, r2, r1.A00);
    }
}
