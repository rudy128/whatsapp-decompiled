package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.08x  reason: invalid class name and case insensitive filesystem */
public final class C015408x extends AnonymousClass0XW implements C17540up, C17610uw, C17560ur, C15830rH {
    public AnonymousClass0CW A00 = AnonymousClass0CW.Inactive;
    public boolean A01;
    public boolean A02;

    public /* synthetic */ Object BPr(AnonymousClass0OJ r2) {
        return C02670Ex.A00(this, r2);
    }

    public final AnonymousClass0WL A0N() {
        AnonymousClass0WL r9 = new AnonymousClass0WL();
        AnonymousClass0XW r8 = this.A03;
        if (r8.A07) {
            AnonymousClass0XW r10 = r8;
            AnonymousClass0XV A03 = AnonymousClass0QV.A03(this);
            if (A03 != null) {
                loop0:
                while (true) {
                    if (AnonymousClass0QR.A01(A03, 3072) != 0) {
                        while (true) {
                            if (r10 == null) {
                                break;
                            }
                            int i = r10.A01;
                            if ((i & 3072) != 0) {
                                if (r10 != r8 && (i & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                    break loop0;
                                } else if ((i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                                    AnonymousClass0XW r5 = r10;
                                    C06970a9 r4 = null;
                                    do {
                                        if (r5 instanceof C17580ut) {
                                            ((C17580ut) r5).BCR(r9);
                                        } else if ((r5.A01 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0 && (r5 instanceof C014308l)) {
                                            int i2 = 0;
                                            for (AnonymousClass0XW r3 = ((C014308l) r5).A00; r3 != null; r3 = r3.A02) {
                                                if ((r3.A01 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
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
                            r10 = r10.A04;
                        }
                    }
                    A03 = A03.A0I();
                    if (A03 == null) {
                        break;
                    }
                    AnonymousClass0QR r0 = A03.A0S;
                    if (r0 != null) {
                        r10 = r0.A05;
                    } else {
                        r10 = null;
                    }
                }
            }
            return r9;
        }
        throw AnonymousClass000.A0n("visitAncestors called on an unattached node");
    }

    public AnonymousClass0CW A0O() {
        AnonymousClass0XV A0t;
        C17140to r0;
        C17470ui focusOwner;
        AnonymousClass0CW r02;
        C01850Ad A0A = this.A03.A0A();
        if (A0A == null || (A0t = A0A.A0t()) == null || (r0 = A0t.A08) == null || (focusOwner = r0.getFocusOwner()) == null || (r02 = (AnonymousClass0CW) ((AnonymousClass0WK) focusOwner).A05.A02.get(this)) == null) {
            return this.A00;
        }
        return r02;
    }

    public final void A0Q() {
        AnonymousClass0XW r4 = this.A03;
        C06970a9 r3 = null;
        while (r4 != null) {
            if (r4 instanceof C17570us) {
                C04500Nq.A01((C17570us) r4);
            } else if ((r4.A01 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0 && (r4 instanceof C014308l)) {
                int i = 0;
                for (AnonymousClass0XW r2 = ((C014308l) r4).A00; r2 != null; r2 = r2.A02) {
                    if ((r2.A01 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
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
        AnonymousClass0XW r1 = this.A03;
        if (r1.A07) {
            AnonymousClass0XW r8 = r1.A04;
            AnonymousClass0XV A03 = AnonymousClass0QV.A03(this);
            if (A03 != null) {
                while (true) {
                    if (AnonymousClass0QR.A01(A03, 5120) != 0) {
                        while (r8 != null) {
                            int i2 = r8.A01;
                            if ((i2 & 5120) == 0 || (1024 & i2) != 0 || !r8.A07) {
                                r8 = r8.A04;
                            } else {
                                C06970a9 r42 = null;
                                AnonymousClass0XW r32 = r8;
                                do {
                                    if (r32 instanceof C17570us) {
                                        C04500Nq.A01((C17570us) r32);
                                    } else if ((r32.A01 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0 && (r32 instanceof C014308l)) {
                                        int i3 = 0;
                                        for (AnonymousClass0XW r22 = ((C014308l) r32).A00; r22 != null; r22 = r22.A02) {
                                            if ((r22.A01 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    r32 = r22;
                                                } else {
                                                    r42 = AnonymousClass001.A10(r42);
                                                    r32 = AnonymousClass000.A0d(r42, r32);
                                                    r42.A0F(r22);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                            continue;
                                        }
                                    }
                                    r32 = AnonymousClass0QV.A00(r42);
                                    continue;
                                } while (r32 != null);
                                r8 = r8.A04;
                            }
                        }
                    }
                    A03 = A03.A0I();
                    if (A03 != null) {
                        AnonymousClass0QR r0 = A03.A0S;
                        if (r0 != null) {
                            r8 = r0.A05;
                        } else {
                            r8 = null;
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

    public static int A00(C015408x r0) {
        return r0.A0O().ordinal();
    }

    public void A0J() {
        int A002 = A00(this);
        if (A002 == 0 || A002 == 2) {
            AnonymousClass0QV.A01(this).BEt(true, true);
        } else if (A002 == 1) {
            A0Q();
            AnonymousClass0OF r1 = AnonymousClass0QV.A01(this).A05;
            try {
                if (r1.A00) {
                    AnonymousClass0OF.A00(r1);
                }
                r1.A00 = true;
                A0R(AnonymousClass0CW.Inactive);
            } finally {
                AnonymousClass0OF.A01(r1);
            }
        } else if (A002 == 3) {
            A0Q();
        }
    }

    public final void A0P() {
        int A002 = A00(this);
        if (A002 == 0 || A002 == 2) {
            C98494rF r1 = new C98494rF();
            AnonymousClass0F7.A00(this, new C08670fT(this, r1));
            Object obj = r1.element;
            if (obj == null) {
                C18070vi.A11("focusProperties");
                throw null;
            } else if (!((C16700sr) obj).BOD()) {
                ((AnonymousClass0WK) AnonymousClass0QV.A05(this).getFocusOwner()).BEt(true, true);
            }
        }
    }

    public void A0R(AnonymousClass0CW r2) {
        ((AnonymousClass0WK) AnonymousClass0QV.A05(this).getFocusOwner()).A05.A02.put(this, r2);
    }

    public /* synthetic */ C02080Cq BXh() {
        return AnonymousClass0AP.A00;
    }

    public void BzO() {
        AnonymousClass0CW A0O = A0O();
        A0P();
        if (A0O != A0O()) {
            C04500Nq.A02(this);
        }
    }
}
