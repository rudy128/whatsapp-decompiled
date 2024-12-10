package X;

import android.content.Context;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cvf  reason: case insensitive filesystem */
public final class C26242Cvf {
    public static final C26242Cvf A00 = new Object();

    public static final int A00(DFL dfl) {
        C18070vi.A0d(dfl, 0);
        DFL A0P = BE7.A0P(dfl);
        if (A0P == null || A0P.A05 != 16372) {
            return 1;
        }
        return A0P.A04(35, 1);
    }

    public static final ArrayList A01(List list, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        int A002;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i7;
        int i8;
        int i9;
        int i10;
        Rect rect;
        List list2 = list;
        C18070vi.A0d(list2, 0);
        ArrayList A14 = AnonymousClass000.A14(list2);
        Iterator it = list2.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            DFL A0d = BE6.A0d(it);
            int i12 = i5;
            if (A03(A0d)) {
                A002 = i12;
            } else {
                A002 = A00(A0d);
            }
            int i13 = (A002 + i11) - 1;
            int i14 = i6;
            int i15 = i;
            if (i15 != 1 ? i11 != 0 : i6 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i15 != 1 ? i6 != 0 : i11 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i15 != 1 ? i14 != i4 - 1 : i13 != i5 - 1) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i15 != 1 ? i13 != i5 - 1 : i14 != i4 - 1) {
                z5 = false;
            } else {
                z5 = true;
            }
            double d = (double) i12;
            double d2 = ((double) i2) / d;
            double d3 = ((double) i3) / d;
            if (z3) {
                i7 = 0;
            } else if (i15 == 1) {
                i7 = C22339B3q.A00(((double) i11) * d2);
            } else {
                i7 = i2 / 2;
            }
            if (z2) {
                i8 = 0;
            } else if (i == 0) {
                i8 = C22339B3q.A00(((double) i11) * d3);
            } else {
                i8 = i3 / 2;
            }
            if (z4) {
                i9 = 0;
            } else if (i15 == 1) {
                i9 = i2 - C22339B3q.A00(((double) (i13 + 1)) * d2);
            } else {
                i9 = i2 / 2;
            }
            if (z5) {
                i10 = 0;
            } else if (i == 0) {
                i10 = i3 - C22339B3q.A00(((double) (i13 + 1)) * d3);
            } else {
                i10 = i3 / 2;
            }
            if (z) {
                rect = new Rect(i9, i8, i7, i10);
            }
            A14.add(rect);
            i11 = i13 + 1;
        }
        return A14;
    }

    public static final AnonymousClass1D6 A02(Rect rect, Float f, int[] iArr, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6;
        int A06;
        C18070vi.A0d(rect, 6);
        int i7 = i3 + i2;
        int i8 = 0;
        while (i2 < i7) {
            i8 += iArr[i2];
            i2++;
        }
        if (i == 1) {
            i4 = rect.left;
            i5 = rect.right;
        } else {
            i4 = rect.top;
            i5 = rect.bottom;
        }
        int i9 = i8 - (i4 + i5);
        if (f == null || z) {
            i6 = C24676CEq.A00;
        } else {
            int i10 = C24676CEq.A00;
            i6 = BE7.A06((int) (((float) i9) * f.floatValue()));
        }
        if (i == 0) {
            A06 = i6;
            i6 = BE7.A06(i9);
        } else {
            A06 = BE7.A06(i9);
        }
        return AnonymousClass1D6.A00(Integer.valueOf(A06), i6);
    }

    public static final boolean A03(DFL dfl) {
        C18070vi.A0d(dfl, 0);
        DFL A0P = BE7.A0P(dfl);
        if (A0P == null || A0P.A05 != 16372) {
            return false;
        }
        return A0P.A0I(36, false);
    }

    public static final int[] A04(int i, int i2) {
        int i3;
        int[] iArr = new int[i2];
        int i4 = i / i2;
        int i5 = i % i2;
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            i6 += i5;
            if (i6 <= 0 || i2 - i6 >= i5) {
                i3 = i4;
            } else {
                i3 = i4 + 1;
                i6 -= i2;
            }
            iArr[i7] = i3;
        }
        return iArr;
    }

    public final CT8 A05(Context context, DFL dfl) {
        Integer num;
        int i;
        int i2;
        int i3;
        float A01;
        int i4;
        float A012;
        Integer valueOf;
        Integer valueOf2;
        Rect rect;
        Integer num2;
        DFL dfl2 = dfl;
        DFL A09 = dfl2.A09(94);
        if (A09 != null) {
            int A002 = C24520C7o.A00(dfl2);
            int i5 = A09.A05;
            if (i5 == 16373) {
                num = AnonymousClass00R.A00;
            } else if (i5 == 16483) {
                num = AnonymousClass00R.A01;
            } else {
                throw AnonymousClass001.A13("GridCommonUtils: Grid type is unknown for style ", AnonymousClass000.A10(), i5);
            }
            int intValue = num.intValue();
            int i6 = 41;
            if (intValue != 0) {
                i6 = 40;
            }
            int A04 = A09.A04(i6, -1);
            if (A04 != -1) {
                if (intValue != 0) {
                    i = 36;
                    i2 = 35;
                } else {
                    i = 38;
                    i2 = 36;
                }
                AnonymousClass1D6 A013 = AnonymousClass1D6.A01(i, i2);
                int A042 = AnonymousClass3MZ.A04(A013);
                int A092 = C108955ca.A09(A013);
                String A0D = A09.A0D(A042);
                if (A0D == null) {
                    A01 = 0.0f;
                } else {
                    try {
                        A01 = A90.A01(A0D);
                    } catch (AnonymousClass9HX unused) {
                        C25913CoX.A01("GridCommonUtils", AnonymousClass001.A1H("Invalid pixel format for grid spacing ", A0D, AnonymousClass000.A10()));
                        i3 = 0;
                    }
                }
                i3 = (int) A01;
                String A0D2 = A09.A0D(A092);
                if (A0D2 == null) {
                    A012 = 0.0f;
                } else {
                    try {
                        A012 = A90.A01(A0D2);
                    } catch (AnonymousClass9HX unused2) {
                        C25913CoX.A01("GridCommonUtils", AnonymousClass001.A1H("Invalid pixel format for grid spacing ", A0D2, AnonymousClass000.A10()));
                        i4 = 0;
                    }
                }
                i4 = (int) A012;
                if (A002 == 1) {
                    valueOf = Integer.valueOf(i4);
                    valueOf2 = Integer.valueOf(i3);
                } else {
                    valueOf = Integer.valueOf(i3);
                    valueOf2 = Integer.valueOf(i4);
                }
                AnonymousClass1D6 A014 = AnonymousClass1D6.A01(valueOf, valueOf2);
                int A043 = AnonymousClass3MZ.A04(A014);
                int A093 = C108955ca.A09(A014);
                int i7 = 40;
                if (intValue != 0) {
                    i7 = 38;
                }
                DFL A094 = A09.A09(i7);
                if (A094 == null) {
                    rect = AnonymousClass3MW.A07();
                } else {
                    int A003 = (int) CC7.A00(A094, 42);
                    int A004 = (int) CC7.A00(A094, 40);
                    int A005 = (int) CC7.A00(A094, 41);
                    int A006 = (int) CC7.A00(A094, 35);
                    int A007 = (int) CC7.A00(A094, 36);
                    int A008 = (int) CC7.A00(A094, 38);
                    if (CC8.A00(context)) {
                        if (A005 == 0) {
                            A005 = A007;
                        }
                        if (A003 == 0) {
                            A003 = A008;
                        }
                        rect = new Rect(A005, A004, A003, A006);
                    } else {
                        if (A003 == 0) {
                            A003 = A007;
                        }
                        if (A005 == 0) {
                            A005 = A008;
                        }
                        rect = new Rect(A003, A004, A005, A006);
                    }
                }
                if (C18070vi.A18(A09.A0D(49), "match_largest")) {
                    num2 = AnonymousClass00R.A01;
                } else {
                    num2 = AnonymousClass00R.A00;
                }
                return new CT8(rect, A09, num2, A002, A04, A043, A093);
            }
            throw AnonymousClass000.A0k("GridCommonUtils: span-count is required for grids");
        }
        throw AnonymousClass000.A0k("GridCommonUtils: grid layout config should be defined");
    }

    public final ArrayList A06(List list, int i) {
        int A002;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            DFL A0G = AnonymousClass8BR.A0G(list, i3);
            if (A03(A0G)) {
                A002 = i;
            } else {
                A002 = A00(A0G);
            }
            if (i2 + A002 > i) {
                A13.add(C29431cG.A0t(A132));
                A132.clear();
                A132.add(A0G);
                i2 = A002;
            } else {
                A132.add(A0G);
                i2 += A002;
            }
            if (i3 == AnonymousClass3MX.A01(list)) {
                A13.add(C29431cG.A0t(A132));
            }
        }
        return A13;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00ae: MOVE  (r0v10 int) = (r19v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final X.AnonymousClass1D6 A07(android.graphics.Rect r22, java.util.List r23, int r24, int r25, int r26) {
        /*
            r21 = this;
            int r8 = android.view.View.MeasureSpec.getMode(r24)
            int r6 = android.view.View.MeasureSpec.getMode(r25)
            r1 = 1
            r7 = r26
            if (r7 != r1) goto L_0x0016
            if (r8 != 0) goto L_0x001f
            java.lang.String r0 = "GridCommonUtils: Width should be specified for vertical grid collection"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0016:
            if (r6 != 0) goto L_0x001f
            java.lang.String r0 = "TAG: Height should be specified for horizontal grid collection"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x001f:
            int r19 = android.view.View.MeasureSpec.getSize(r24)
            r0 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            if (r8 == r0) goto L_0x002b
            r4 = -1
            if (r7 != r1) goto L_0x002d
        L_0x002b:
            r4 = r19
        L_0x002d:
            int r18 = android.view.View.MeasureSpec.getSize(r25)
            if (r6 == r0) goto L_0x0035
            if (r26 != 0) goto L_0x0037
        L_0x0035:
            r5 = r18
        L_0x0037:
            r9 = -1
            if (r4 == r9) goto L_0x0045
            if (r5 == r9) goto L_0x0045
        L_0x003c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
        L_0x0040:
            X.1D6 r0 = X.AnonymousClass1D6.A00(r0, r5)
            return r0
        L_0x0045:
            r1 = r22
            int r3 = r1.left
            int r0 = r1.right
            int r3 = r3 + r0
            int r2 = r1.top
            int r0 = r1.bottom
            int r2 = r2 + r0
            r20 = r23
            int r17 = r20.size()
            r1 = 0
        L_0x0058:
            r0 = r17
            if (r1 >= r0) goto L_0x00c4
            r0 = r20
            java.lang.Object r13 = r0.get(r1)
            java.util.List r13 = (java.util.List) r13
            int r16 = r13.size()
            r12 = 0
            r11 = 0
            r10 = 0
        L_0x006b:
            r0 = r16
            if (r10 >= r0) goto L_0x00a6
            java.lang.Object r0 = r13.get(r10)
            X.CMa r0 = (X.C24832CMa) r0
            android.graphics.Rect r15 = r0.A00
            X.DFE r0 = r0.A01
            X.0CC r0 = r0.A00
            java.lang.Object r0 = r0.A00()
            X.0Mi r0 = (X.C04220Mi) r0
            X.0Mk r0 = r0.A01
            com.facebook.rendercore.RenderTreeNode r0 = r0.A03
            android.graphics.Rect r9 = r0.A03
            int r14 = r9.width()
            int r0 = r15.left
            int r14 = r14 + r0
            int r0 = r15.right
            int r14 = r14 + r0
            int r9 = r9.height()
            int r0 = r15.top
            int r9 = r9 + r0
            int r0 = r15.bottom
            int r9 = r9 + r0
            int r12 = java.lang.Math.max(r12, r14)
            int r11 = java.lang.Math.max(r11, r9)
            int r10 = r10 + 1
            goto L_0x006b
        L_0x00a6:
            int r3 = r3 + r12
            int r2 = r2 + r11
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r26 != 0) goto L_0x00b9
            if (r8 != r0) goto L_0x00b3
            r0 = r19
            if (r3 < r0) goto L_0x00b3
            r4 = r0
        L_0x00b3:
            r9 = -1
            if (r4 == r9) goto L_0x00c1
            if (r5 == r9) goto L_0x00c1
            goto L_0x003c
        L_0x00b9:
            if (r6 != r0) goto L_0x00b3
            r0 = r18
            if (r2 < r0) goto L_0x00b3
            r5 = r0
            goto L_0x00b3
        L_0x00c1:
            int r1 = r1 + 1
            goto L_0x0058
        L_0x00c4:
            r0 = 1
            if (r7 != r0) goto L_0x00d1
            if (r5 != r9) goto L_0x00ca
            r5 = r2
        L_0x00ca:
            r3 = r4
        L_0x00cb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x0040
        L_0x00d1:
            if (r4 == r9) goto L_0x00cb
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26242Cvf.A07(android.graphics.Rect, java.util.List, int, int, int):X.1D6");
    }
}
