package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0jx  reason: invalid class name and case insensitive filesystem */
public final class C11390jx extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $focusDirection;
    public final /* synthetic */ C22811Dh $isCancelled;
    public final /* synthetic */ C015408x $source;
    public final /* synthetic */ AnonymousClass0WK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11390jx(AnonymousClass0WK r2, C015408x r3, C22811Dh r4, int i) {
        super(1);
        this.$source = r3;
        this.this$0 = r2;
        this.$focusDirection = i;
        this.$isCancelled = r4;
    }

    /* renamed from: A00 */
    public final Boolean invoke(C015408x r13) {
        AnonymousClass0XW r11;
        boolean z;
        AnonymousClass0QR r0;
        if (C18070vi.A18(r13, this.$source)) {
            return false;
        }
        AnonymousClass0XW r1 = r13.A03;
        if (r1.A07) {
            AnonymousClass0XW r10 = r1.A04;
            AnonymousClass0XV A03 = AnonymousClass0QV.A03(r13);
            loop0:
            while (true) {
                r11 = null;
                z = true;
                if (A03 == null) {
                    break;
                }
                if (AnonymousClass0QR.A01(A03, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                    while (r10 != null) {
                        if ((r10.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                            AnonymousClass0XW r7 = r10;
                            C06970a9 r6 = null;
                            while (r7 != null) {
                                if (r7 instanceof C015408x) {
                                    r11 = r7;
                                    break loop0;
                                }
                                if ((r7.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 && (r7 instanceof C014308l)) {
                                    int i = 0;
                                    for (AnonymousClass0XW r2 = ((C014308l) r7).A00; r2 != null; r2 = r2.A02) {
                                        if ((r2.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                            i++;
                                            if (i == 1) {
                                                r7 = r2;
                                            } else {
                                                r6 = AnonymousClass001.A0z(r6);
                                                r7 = AnonymousClass000.A0d(r6, r7);
                                                r6.A0F(r2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                r7 = AnonymousClass0QV.A00(r6);
                            }
                            continue;
                        }
                        r10 = r10.A04;
                    }
                }
                A03 = A03.A0I();
                if (A03 == null || (r0 = A03.A0S) == null) {
                    r10 = null;
                } else {
                    r10 = r0.A05;
                }
            }
            if (r11 != null) {
                AnonymousClass0OF r62 = this.this$0.A05;
                int i2 = this.$focusDirection;
                C22811Dh r22 = this.$isCancelled;
                try {
                    if (r62.A00) {
                        AnonymousClass0OF.A00(r62);
                    }
                    r62.A00 = true;
                    int intValue = AnonymousClass0Qa.A01(r13, i2).intValue();
                    if (intValue != 2) {
                        if (intValue == 1 || intValue == 3) {
                            r22.element = true;
                        } else if (intValue == 0) {
                            z = AnonymousClass0Qa.A04(r13);
                        } else {
                            throw new AnonymousClass3EW();
                        }
                    }
                    return Boolean.valueOf(z);
                } finally {
                    AnonymousClass0OF.A01(r62);
                }
            } else {
                throw AnonymousClass000.A0n("Focus search landed at the root.");
            }
        } else {
            throw AnonymousClass000.A0n("visitAncestors called on an unattached node");
        }
    }
}
