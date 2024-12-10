package X;

import androidx.compose.ui.unit.Constraints;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.0XV  reason: invalid class name */
public final class AnonymousClass0XV implements C17120tm, C16450sH, AnonymousClass0t2, C16480sK, C16490sL {
    public static final Comparator A0V = new C06690Zh(2);
    public static final C06070Wv A0W = new C01820Aa();
    public static final C16880tN A0X = new C06250Xo();
    public static final C18090vk A0Y = C09060g6.A00;
    public int A00;
    public int A01;
    public C17030tc A02;
    public C06970a9 A03;
    public C17090tj A04;
    public AnonymousClass0VQ A05;
    public C16870tM A06;
    public AnonymousClass0XV A07;
    public C17140to A08;
    public C16880tN A09;
    public Integer A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public int A0H;
    public AnonymousClass0XV A0I;
    public C01850Ad A0J;
    public C06370Yb A0K;
    public C28644ECa A0L;
    public C24246By4 A0M;
    public Integer A0N;
    public boolean A0O;
    public final AnonymousClass0NW A0P;
    public final C04700Ok A0Q;
    public final C03660Jf A0R;
    public final AnonymousClass0QR A0S;
    public final boolean A0T;
    public final C06970a9 A0U;

    public final void A0W() {
        this.A0K = null;
        AnonymousClass0O0.A00(this).C51();
    }

    public static final int A00(AnonymousClass0XV r4, AnonymousClass0XV r5) {
        AnonymousClass0AK r42 = r4.A0Q.A0G;
        float f = r42.A01;
        AnonymousClass0AK r2 = r5.A0Q.A0G;
        float f2 = r2.A01;
        if (f == f2) {
            return C18070vi.A00(r42.A02, r2.A02);
        }
        return Float.compare(f, f2);
    }

    private final C01850Ad A01() {
        if (this.A0D) {
            AnonymousClass0QR r0 = this.A0S;
            C01850Ad A072 = r0.A07();
            C01850Ad A0x = r0.A08().A0x();
            this.A0J = null;
            while (true) {
                if (C18070vi.A18(A072, A0x)) {
                    break;
                } else if (A072 == null) {
                    A072 = null;
                } else if (A072.A0z() != null) {
                    this.A0J = A072;
                    break;
                } else {
                    A072 = A072.A0x();
                }
            }
        }
        C01850Ad r1 = this.A0J;
        if (r1 == null || r1.A0z() != null) {
            return r1;
        }
        throw AnonymousClass000.A0n("layer was not set");
    }

    private final void A04() {
        AnonymousClass0XV r0;
        if (this.A0H > 0) {
            this.A0G = true;
        }
        if (this.A0T && (r0 = this.A0I) != null) {
            r0.A04();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A05() {
        /*
            r6 = this;
            X.0QR r2 = r6.A0S
            X.0XW r1 = r2.A05
            r5 = r1
        L_0x0005:
            if (r1 == 0) goto L_0x0011
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x000e
            r1.A0E()
        L_0x000e:
            X.0XW r1 = r1.A04
            goto L_0x0005
        L_0x0011:
            X.0a9 r0 = r2.A00
            if (r0 == 0) goto L_0x0031
            int r4 = r0.A00
            if (r4 <= 0) goto L_0x0031
            java.lang.Object[] r3 = r0.A01
            r2 = 0
        L_0x001c:
            r1 = r3[r2]
            X.0ug r1 = (X.C17450ug) r1
            boolean r0 = r1 instanceof androidx.compose.ui.input.pointer.SuspendPointerInputElement
            if (r0 == 0) goto L_0x002d
            X.0WA r1 = (X.AnonymousClass0WA) r1
            androidx.compose.ui.node.ForceUpdateElement r0 = new androidx.compose.ui.node.ForceUpdateElement
            r0.<init>(r1)
            r3[r2] = r0
        L_0x002d:
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x001c
        L_0x0031:
            r1 = r5
        L_0x0032:
            if (r1 == 0) goto L_0x003e
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x003b
            r1.A0G()
        L_0x003b:
            X.0XW r1 = r1.A04
            goto L_0x0032
        L_0x003e:
            if (r5 == 0) goto L_0x004a
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0047
            r5.A0D()
        L_0x0047:
            X.0XW r5 = r5.A04
            goto L_0x003e
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XV.A05():void");
    }

    private final void A08(AnonymousClass0XV r4) {
        if (!C18070vi.A18(r4, this.A07)) {
            this.A07 = r4;
            if (r4 != null) {
                C04700Ok r1 = this.A0Q;
                if (r1.A04 == null) {
                    r1.A04 = new AnonymousClass0AL(r1);
                }
                AnonymousClass0QR r0 = this.A0S;
                C01850Ad A082 = r0.A08();
                C01850Ad A0w = r0.A07().A0w();
                while (!C18070vi.A18(A082, A0w) && A082 != null) {
                    A082.A17();
                    A082 = A082.A0w();
                }
            }
            A0V();
        }
    }

    public static final void A09(AnonymousClass0XV r5) {
        r5.A0N = r5.A0A;
        r5.A0A = AnonymousClass00R.A0C;
        C06970a9 A0F2 = r5.A0F();
        int i = A0F2.A00;
        if (i > 0) {
            Object[] objArr = A0F2.A01;
            int i2 = 0;
            do {
                AnonymousClass0XV r2 = (AnonymousClass0XV) objArr[i2];
                if (r2.A0A == AnonymousClass00R.A01) {
                    A09(r2);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public static final void A0A(AnonymousClass0XV r5) {
        C04700Ok r4 = r5.A0Q;
        Integer num = r4.A05;
        if (num.intValue() != 4) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unexpected state ");
            throw AnonymousClass000.A0o(AnonymousClass0F4.A00(num), A10);
        } else if (r4.A0D) {
            r5.A0l(true, true);
        } else {
            if (r4.A0B) {
                r5.A0j(true);
            }
            if (r4.A0E) {
                r5.A0m(true, true);
            } else if (r4.A09) {
                r5.A0k(true);
            }
        }
    }

    public static final void A0B(AnonymousClass0XV r5, AnonymousClass0XV r6) {
        if (r6.A0Q.A00 > 0) {
            C04700Ok r1 = r5.A0Q;
            r1.A06(r1.A00 - 1);
        }
        if (r5.A08 != null) {
            r6.A0R();
        }
        r6.A0I = null;
        r6.A0S.A08().A1H((C01850Ad) null);
        if (r6.A0T) {
            r5.A0H--;
            C06970a9 r0 = r6.A0R.A00;
            int i = r0.A00;
            if (i > 0) {
                Object[] objArr = r0.A01;
                int i2 = 0;
                do {
                    ((AnonymousClass0XV) objArr[i2]).A0S.A08().A1H((C01850Ad) null);
                    i2++;
                } while (i2 < i);
            }
        }
        r5.A04();
        r5.A0Y();
    }

    public final C06970a9 A0E() {
        if (this.A0O) {
            C06970a9 r2 = this.A0U;
            r2.A08();
            r2.A0C(A0F(), r2.A00);
            r2.A0D(A0V);
            this.A0O = false;
        }
        return this.A0U;
    }

    public AnonymousClass0BQ A0G() {
        return this.A0S.A07();
    }

    public final AnonymousClass0BQ A0H() {
        return this.A0S.A07();
    }

    public final AnonymousClass0XV A0I() {
        AnonymousClass0XV r2 = this.A0I;
        while (r2 != null && r2.A0T) {
            r2 = r2.A0I;
        }
        return r2;
    }

    public final C01850Ad A0K() {
        return this.A0S.A08();
    }

    public final C06370Yb A0L() {
        if (!AnonymousClass000.A1O(8 & this.A0S.A01.A00) || this.A0K != null) {
            return this.A0K;
        }
        C98494rF r2 = new C98494rF();
        r2.element = new C06370Yb();
        AnonymousClass0O0.A00(this).getSnapshotObserver().A04(this, new C08680fU(this, r2));
        C06370Yb r0 = (C06370Yb) r2.element;
        this.A0K = r0;
        return r0;
    }

    public final Boolean A0O() {
        AnonymousClass0AL r0 = this.A0Q.A04;
        if (r0 != null) {
            return Boolean.valueOf(r0.A05);
        }
        return null;
    }

    public final List A0P() {
        AnonymousClass0AL r0 = this.A0Q.A04;
        C18070vi.A0b(r0);
        return r0.A0b();
    }

    public final void A0Q() {
        this.A0N = this.A0A;
        Integer num = AnonymousClass00R.A0C;
        this.A0A = num;
        C06970a9 A0F2 = A0F();
        int i = A0F2.A00;
        if (i > 0) {
            Object[] objArr = A0F2.A01;
            int i2 = 0;
            do {
                AnonymousClass0XV r1 = (AnonymousClass0XV) objArr[i2];
                if (r1.A0A != num) {
                    r1.A0Q();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void A0R() {
        C04670Oh r1;
        C17140to r9 = this.A08;
        String str = null;
        if (r9 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Cannot detach node that is already detached!  Tree: ");
            AnonymousClass0XV A0I2 = A0I();
            if (A0I2 != null) {
                str = A0I2.A02(0);
            }
            throw AnonymousClass000.A0o(str, A10);
        }
        AnonymousClass0QR r2 = this.A0S;
        if ((r2.A01.A00 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            for (AnonymousClass0XW r10 = r2.A05; r10 != null; r10 = r10.A04) {
                if ((r10.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                    AnonymousClass0XW r6 = r10;
                    C06970a9 r5 = null;
                    do {
                        if (r6 instanceof C015408x) {
                            C015408x r62 = (C015408x) r6;
                            if (r62.A0O().Ber()) {
                                AnonymousClass0O0.A00(this).getFocusOwner().BEt(true, false);
                                r62.A0Q();
                            }
                        } else if ((r6.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0 && (r6 instanceof C014308l)) {
                            int i = 0;
                            for (AnonymousClass0XW r3 = ((C014308l) r6).A00; r3 != null; r3 = r3.A02) {
                                if ((r3.A01 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                                    i++;
                                    if (i == 1) {
                                        r6 = r3;
                                    } else {
                                        r5 = AnonymousClass001.A0z(r5);
                                        r6 = AnonymousClass000.A0d(r5, r6);
                                        r5.A0F(r3);
                                    }
                                }
                            }
                            if (i == 1) {
                                continue;
                            }
                        }
                        r6 = AnonymousClass0QV.A00(r5);
                        continue;
                    } while (r6 != null);
                }
            }
        }
        AnonymousClass0XV A0I3 = A0I();
        if (A0I3 != null) {
            A0I3.A0T();
            A0I3.A0V();
            C04700Ok r32 = this.A0Q;
            AnonymousClass0AK r0 = r32.A0G;
            Integer num = AnonymousClass00R.A0C;
            r0.A05 = num;
            AnonymousClass0AL r02 = r32.A04;
            if (r02 != null) {
                r02.A02 = num;
            }
        }
        C04700Ok r63 = this.A0Q;
        AnonymousClass0AK r52 = r63.A0G;
        C04670Oh r12 = r52.A0L;
        r12.A01 = true;
        r12.A06 = false;
        r12.A02 = false;
        r12.A05 = false;
        r12.A04 = false;
        r12.A03 = false;
        r12.A00 = null;
        AnonymousClass0AL r03 = r63.A04;
        if (!(r03 == null || (r1 = r03.A0G) == null)) {
            r1.A01 = true;
            r1.A06 = false;
            r1.A02 = false;
            r1.A05 = false;
            r1.A04 = false;
            r1.A03 = false;
            r1.A00 = null;
        }
        if (AnonymousClass000.A1O(8 & r2.A01.A00)) {
            A0W();
        }
        AnonymousClass0XW r13 = r2.A05;
        while (r13 != null) {
            if (r13.A07) {
                r13.A0G();
            }
            r13 = r13.A04;
        }
        this.A0C = true;
        C06970a9 r04 = this.A0R.A00;
        int i2 = r04.A00;
        if (i2 > 0) {
            Object[] objArr = r04.A01;
            int i3 = 0;
            do {
                ((AnonymousClass0XV) objArr[i3]).A0R();
                i3++;
            } while (i3 < i2);
        }
        this.A0C = false;
        for (AnonymousClass0XW r4 = r13; r4 != null; r4 = r4.A04) {
            if (r4.A07) {
                r4.A0D();
            }
        }
        r9.BrK(this);
        this.A08 = null;
        A08((AnonymousClass0XV) null);
        this.A00 = 0;
        r52.A02 = Integer.MAX_VALUE;
        r52.A03 = Integer.MAX_VALUE;
        r52.A08 = false;
        AnonymousClass0AL r05 = r63.A04;
        if (r05 != null) {
            r05.A00 = Integer.MAX_VALUE;
            r05.A01 = Integer.MAX_VALUE;
            r05.A05 = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S() {
        /*
            r8 = this;
            X.0Ok r2 = r8.A0Q
            java.lang.Integer r1 = r2.A05
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            if (r1 != r0) goto L_0x0078
            boolean r0 = r2.A09
            if (r0 != 0) goto L_0x0078
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x0078
            boolean r0 = r8.A0E
            if (r0 != 0) goto L_0x0078
            X.0AK r0 = r2.A0G
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0078
            X.0QR r0 = r8.A0S
            r7 = 256(0x100, float:3.59E-43)
            X.0XW r6 = r0.A01
            int r0 = r6.A00
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0078
        L_0x0025:
            int r0 = r6.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x006e
            r5 = 0
            r4 = r6
        L_0x002c:
            boolean r0 = r4 instanceof X.C17600uv
            if (r0 == 0) goto L_0x0040
            X.0uv r4 = (X.C17600uv) r4
            X.0Ad r0 = X.AnonymousClass0QV.A04(r4, r7)
            r4.BvI(r0)
        L_0x0039:
            X.0XW r4 = X.AnonymousClass0QV.A00(r5)
        L_0x003d:
            if (r4 == 0) goto L_0x006e
            goto L_0x002c
        L_0x0040:
            int r0 = r4.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0039
            boolean r0 = r4 instanceof X.C014308l
            if (r0 == 0) goto L_0x0039
            r0 = r4
            X.08l r0 = (X.C014308l) r0
            X.0XW r3 = r0.A00
            r2 = 0
        L_0x004f:
            r1 = 1
            if (r3 == 0) goto L_0x006b
            int r0 = r3.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x005c
            int r2 = r2 + 1
            if (r2 != r1) goto L_0x005f
            r4 = r3
        L_0x005c:
            X.0XW r3 = r3.A02
            goto L_0x004f
        L_0x005f:
            X.0a9 r5 = X.AnonymousClass001.A0z(r5)
            X.0XW r4 = X.AnonymousClass000.A0d(r5, r4)
            r5.A0F(r3)
            goto L_0x005c
        L_0x006b:
            if (r2 != r1) goto L_0x0039
            goto L_0x003d
        L_0x006e:
            int r0 = r6.A00
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0078
            X.0XW r6 = r6.A02
            if (r6 == 0) goto L_0x0078
            goto L_0x0025
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XV.A0S():void");
    }

    public final void A0U() {
        AnonymousClass0QR r0 = this.A0S;
        AnonymousClass0BQ A072 = r0.A07();
        for (C01850Ad A082 = r0.A08(); A082 != A072; A082 = A082.A0w()) {
            C18070vi.A0z(A082, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C16950tU A0z = A082.A0z();
            if (A0z != null) {
                A0z.invalidate();
            }
        }
        C16950tU A0z2 = A072.A0z();
        if (A0z2 != null) {
            A0z2.invalidate();
        }
    }

    public final void A0V() {
        if (this.A07 != null) {
            A0l(false, true);
        } else {
            AnonymousClass000.A1D(this);
        }
    }

    public final void A0X() {
        if (this.A0A == AnonymousClass00R.A0C) {
            A09(this);
        }
        AnonymousClass0AL r0 = this.A0Q.A04;
        C18070vi.A0b(r0);
        r0.A0f();
    }

    public final void A0Y() {
        if (this.A0T) {
            AnonymousClass0XV A0I2 = A0I();
            if (A0I2 != null) {
                A0I2.A0Y();
                return;
            }
            return;
        }
        this.A0O = true;
    }

    public final void A0Z() {
        AnonymousClass0QZ r2;
        if (this.A0A == AnonymousClass00R.A0C) {
            A09(this);
        }
        AnonymousClass0XV A0I2 = A0I();
        if (A0I2 == null || (r2 = A0I2.A0S.A07().A0d()) == null) {
            r2 = new AnonymousClass0AG(AnonymousClass0O0.A00(this));
        }
        r2.A0B(this.A0Q.A0G, 0, 0);
    }

    public final void A0a() {
        C03660Jf r3 = this.A0R;
        C06970a9 r2 = r3.A00;
        int i = r2.A00;
        while (true) {
            i--;
            if (-1 < i) {
                A0B(this, (AnonymousClass0XV) r2.A01[i]);
            } else {
                r3.A01();
                return;
            }
        }
    }

    public final void A0c() {
        if (this.A0H > 0 && this.A0G) {
            int i = 0;
            this.A0G = false;
            C06970a9 r4 = this.A03;
            if (r4 == null) {
                r4 = C06970a9.A02(new AnonymousClass0XV[16]);
                this.A03 = r4;
            }
            r4.A08();
            C06970a9 r0 = this.A0R.A00;
            int i2 = r0.A00;
            if (i2 > 0) {
                Object[] objArr = r0.A01;
                do {
                    AnonymousClass0XV r1 = (AnonymousClass0XV) objArr[i];
                    if (r1.A0T) {
                        r4.A0C(r1.A0F(), r4.A00);
                    } else {
                        r4.A0F(r1);
                    }
                    i++;
                } while (i < i2);
            }
            C04700Ok r2 = this.A0Q;
            r2.A0G.A07 = true;
            AnonymousClass0AL r02 = r2.A04;
            if (r02 != null) {
                r02.A04 = true;
            }
        }
    }

    public final void A0d(int i, int i2, int i3) {
        if (i != i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i;
                if (i > i2) {
                    i5 = i + i4;
                }
                int i6 = i2 + i4;
                if (i <= i2) {
                    i6 = (i2 + i3) - 2;
                }
                C03660Jf r1 = this.A0R;
                r1.A02(i6, r1.A00(i5));
            }
            A0Y();
            A04();
            A0V();
        }
    }

    public final void A0e(C16960tV r2) {
        this.A0S.A08().A1A(r2);
    }

    public final void A0f(C06850Zx r8, long j, boolean z) {
        AnonymousClass0QR r1 = this.A0S;
        long A0o = r1.A08().A0o(j);
        r1.A08().A1F(r8, C01850Ad.A0M, A0o, true, z);
    }

    public final void A0g(C06850Zx r8, long j, boolean z, boolean z2) {
        AnonymousClass0QR r1 = this.A0S;
        long A0o = r1.A08().A0o(j);
        r1.A08().A1F(r8, C01850Ad.A0L, A0o, z, z2);
    }

    public final void A0h(AnonymousClass0XV r6, int i) {
        String str = null;
        if (r6.A0I != null) {
            StringBuilder A11 = AnonymousClass000.A11("Cannot insert ");
            A11.append(r6);
            A11.append(" because it already has a parent. This tree: ");
            A11.append(A02(0));
            A11.append(" Other tree: ");
            AnonymousClass0XV r1 = r6.A0I;
            if (r1 != null) {
                str = r1.A02(0);
            }
            throw AnonymousClass000.A0o(str, A11);
        } else if (r6.A08 == null) {
            r6.A0I = this;
            this.A0R.A02(i, r6);
            A0Y();
            if (r6.A0T) {
                this.A0H++;
            }
            A04();
            C17140to r0 = this.A08;
            if (r0 != null) {
                r6.A0i(r0);
            }
            if (r6.A0Q.A00 > 0) {
                C04700Ok r12 = this.A0Q;
                r12.A06(r12.A00 + 1);
            }
        } else {
            StringBuilder A112 = AnonymousClass000.A11("Cannot insert ");
            A112.append(r6);
            A112.append(" because it already has an owner. This tree: ");
            A112.append(A02(0));
            A112.append(" Other tree: ");
            throw AnonymousClass000.A0o(r6.A02(0), A112);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.0Ad] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0i(X.C17140to r7) {
        /*
            r6 = this;
            X.0to r0 = r6.A08
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x0123
            X.0XV r0 = r6.A0I
            if (r0 == 0) goto L_0x004e
            X.0to r0 = r0.A08
            boolean r0 = X.C18070vi.A18(r0, r7)
            if (r0 != 0) goto L_0x004e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Attaching to a different owner("
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ") than the parent's owner("
            r1.append(r0)
            X.0XV r0 = r6.A0I()
            if (r0 == 0) goto L_0x004c
            X.0to r0 = r0.A08
        L_0x002b:
            r1.append(r0)
            java.lang.String r0 = "). This tree: "
            r1.append(r0)
            java.lang.String r0 = r6.A02(r2)
            r1.append(r0)
            java.lang.String r0 = " Parent tree: "
            r1.append(r0)
            X.0XV r0 = r6.A0I
            if (r0 == 0) goto L_0x0047
            java.lang.String r3 = r0.A02(r2)
        L_0x0047:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r3, r1)
            throw r0
        L_0x004c:
            r0 = r3
            goto L_0x002b
        L_0x004e:
            X.0XV r5 = r6.A0I()
            if (r5 != 0) goto L_0x0061
            X.0Ok r4 = r6.A0Q
            X.0AK r0 = r4.A0G
            r1 = 1
            r0.A08 = r1
            X.0AL r0 = r4.A04
            if (r0 == 0) goto L_0x0061
            r0.A05 = r1
        L_0x0061:
            X.0QR r4 = r6.A0S
            X.0Ad r1 = r4.A08()
            if (r5 == 0) goto L_0x006f
            X.0QR r0 = r5.A0S
            X.0BQ r3 = r0.A07()
        L_0x006f:
            r1.A1H(r3)
            r6.A08 = r7
            if (r5 == 0) goto L_0x00a7
            int r0 = r5.A00
        L_0x0078:
            int r0 = r0 + 1
            r6.A00 = r0
            r1 = 8
            X.0XW r0 = r4.A01
            int r0 = r0.A00
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            if (r0 == 0) goto L_0x008c
            r6.A0W()
        L_0x008c:
            X.0XV r0 = r6.A0I
            if (r0 == 0) goto L_0x0094
            X.0XV r0 = r0.A07
            if (r0 != 0) goto L_0x0096
        L_0x0094:
            X.0XV r0 = r6.A07
        L_0x0096:
            r6.A08(r0)
            boolean r0 = r6.A0E
            if (r0 != 0) goto L_0x00a9
            X.0XW r0 = r4.A01
        L_0x009f:
            if (r0 == 0) goto L_0x00a9
            r0.A0C()
            X.0XW r0 = r0.A02
            goto L_0x009f
        L_0x00a7:
            r0 = -1
            goto L_0x0078
        L_0x00a9:
            X.0Jf r0 = r6.A0R
            X.0a9 r0 = r0.A00
            int r3 = r0.A00
            if (r3 <= 0) goto L_0x00be
            java.lang.Object[] r1 = r0.A01
        L_0x00b3:
            r0 = r1[r2]
            X.0XV r0 = (X.AnonymousClass0XV) r0
            r0.A0i(r7)
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x00b3
        L_0x00be:
            boolean r0 = r6.A0E
            if (r0 != 0) goto L_0x00c5
            r4.A09()
        L_0x00c5:
            r6.A0V()
            if (r5 == 0) goto L_0x00cd
            r5.A0V()
        L_0x00cd:
            X.0Ad r2 = r4.A08()
            X.0BQ r0 = r4.A07()
            X.0Ad r1 = r0.A0w()
        L_0x00d9:
            boolean r0 = X.C18070vi.A18(r2, r1)
            if (r0 != 0) goto L_0x00e9
            if (r2 == 0) goto L_0x00e9
            r2.A13()
            X.0Ad r2 = r2.A0w()
            goto L_0x00d9
        L_0x00e9:
            X.0Ok r0 = r6.A0Q
            r0.A05()
            boolean r0 = r6.A0E
            if (r0 != 0) goto L_0x0122
            r1 = 7168(0x1c00, float:1.0045E-41)
            X.0XW r4 = r4.A01
            int r0 = r4.A00
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0122
        L_0x00fb:
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = r4.A01
            r1 = r1 & r0
            r3 = 1
            boolean r2 = X.AnonymousClass000.A1O(r1)
            r1 = 2048(0x800, float:2.87E-42)
            int r0 = r4.A01
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1O(r1)
            r2 = r2 | r0
            r1 = 4096(0x1000, float:5.74E-42)
            int r0 = r4.A01
            r1 = r1 & r0
            if (r1 != 0) goto L_0x0117
            r3 = 0
        L_0x0117:
            r2 = r2 | r3
            if (r2 == 0) goto L_0x011d
            X.C04970Ps.A02(r4)
        L_0x011d:
            X.0XW r4 = r4.A02
            if (r4 == 0) goto L_0x0122
            goto L_0x00fb
        L_0x0122:
            return
        L_0x0123:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Cannot attach "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " as it already is attached.  Tree: "
            r1.append(r0)
            java.lang.String r0 = r6.A02(r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XV.A0i(X.0to):void");
    }

    public final void A0j(boolean z) {
        C17140to r1;
        if (!this.A0T && (r1 = this.A08) != null) {
            r1.C3P(this, true, z);
        }
    }

    public final void A0k(boolean z) {
        C17140to r1;
        if (!this.A0T && (r1 = this.A08) != null) {
            r1.C3P(this, false, z);
        }
    }

    public final void A0l(boolean z, boolean z2) {
        AnonymousClass0XV A0I2;
        if (this.A07 != null) {
            C17140to r1 = this.A08;
            if (r1 != null && !this.A0C && !this.A0T) {
                r1.C3N(this, true, z, z2);
                AnonymousClass0AL r0 = this.A0Q.A04;
                C18070vi.A0b(r0);
                AnonymousClass0XV r02 = r0.A0I.A0F;
                AnonymousClass0XV A0I3 = r02.A0I();
                Integer num = r02.A0A;
                if (A0I3 != null && num != AnonymousClass00R.A0C) {
                    while (A0I3.A0A == num && (A0I2 = A0I3.A0I()) != null) {
                        A0I3 = A0I2;
                    }
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            throw AnonymousClass000.A0n("Intrinsics isn't used by the parent");
                        } else if (A0I3.A07 != null) {
                            A0I3.A0j(z);
                        } else {
                            A0I3.A0k(z);
                        }
                    } else if (A0I3.A07 != null) {
                        A0I3.A0l(z, true);
                    } else {
                        A0I3.A0m(z, true);
                    }
                }
            }
        } else {
            throw AnonymousClass000.A0n("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
    }

    public final void A0m(boolean z, boolean z2) {
        C17140to r0;
        AnonymousClass0XV A0I2;
        if (!this.A0C && !this.A0T && (r0 = this.A08) != null) {
            r0.C3N(this, false, z, z2);
            AnonymousClass0XV r02 = this.A0Q.A0G.A0P.A0F;
            AnonymousClass0XV A0I3 = r02.A0I();
            Integer num = r02.A0A;
            if (A0I3 != null && num != AnonymousClass00R.A0C) {
                while (A0I3.A0A == num && (A0I2 = A0I3.A0I()) != null) {
                    A0I3 = A0I2;
                }
                int intValue = num.intValue();
                if (intValue == 0) {
                    A0I3.A0m(z, true);
                } else if (intValue == 1) {
                    A0I3.A0k(z);
                } else {
                    throw AnonymousClass000.A0n("Intrinsics isn't used by the parent");
                }
            }
        }
    }

    public final boolean A0n() {
        long j = this.A0S.A07().A04;
        if (!Constraints.A0A(j) || !Constraints.A09(j)) {
            return false;
        }
        return true;
    }

    public final boolean A0o(Constraints constraints) {
        if (constraints == null || this.A07 == null) {
            return false;
        }
        AnonymousClass0AL r2 = this.A0Q.A04;
        C18070vi.A0b(r2);
        return r2.A0h(constraints.A0B());
    }

    public final boolean A0p(Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.A0A == AnonymousClass00R.A0C) {
            A0Q();
        }
        return this.A0Q.A0G.A0h(constraints.A0B());
    }

    public void BLX() {
        if (this.A07 != null) {
            A0l(false, false);
        } else {
            A0m(false, false);
        }
        Constraints A032 = this.A0Q.A03();
        if (A032 != null) {
            C17140to r2 = this.A08;
            if (r2 != null) {
                r2.Bjd(this, A032.A0B());
                return;
            }
            return;
        }
        C17140to r1 = this.A08;
        if (r1 != null) {
            r1.Bjc(true);
        }
    }

    public boolean Bgy() {
        return AnonymousClass000.A1W(this.A08);
    }

    public void Bqy() {
        AnonymousClass0VQ r1 = this.A05;
        if (r1 != null) {
            AnonymousClass0VQ.A09(r1, true);
        }
        this.A0E = true;
        A05();
        if (this.A08 != null) {
            A0W();
        }
    }

    public void Bwa() {
        AnonymousClass0BQ A072 = this.A0S.A07();
        AnonymousClass0XW A0r = A072.A0r();
        AnonymousClass0XW A022 = A072.A03(true);
        while (A022 != null && (A022.A00 & 128) != 0) {
            if ((A022.A01 & 128) != 0) {
                C06970a9 r5 = null;
                AnonymousClass0XW r4 = A022;
                do {
                    if (r4 instanceof C17650v0) {
                        ((C17650v0) r4).C0g(A072);
                    } else if ((r4.A01 & 128) != 0 && (r4 instanceof C014308l)) {
                        int i = 0;
                        for (AnonymousClass0XW r3 = ((C014308l) r4).A00; r3 != null; r3 = r3.A02) {
                            if ((r3.A01 & 128) != 0) {
                                i++;
                                if (i == 1) {
                                    r4 = r3;
                                } else {
                                    r5 = AnonymousClass001.A0z(r5);
                                    r4 = AnonymousClass000.A0d(r5, r4);
                                    r5.A0F(r3);
                                }
                            }
                        }
                        if (i == 1) {
                            continue;
                        }
                    }
                    r4 = AnonymousClass0QV.A00(r5);
                    continue;
                } while (r4 != null);
            }
            if (A022 != A0r) {
                A022 = A022.A02;
            } else {
                return;
            }
        }
    }

    public void C2t() {
        AnonymousClass0VQ r0 = this.A05;
        if (r0 != null) {
            r0.C2t();
        }
        AnonymousClass0QR r02 = this.A0S;
        C01850Ad A082 = r02.A08();
        C01850Ad A0w = r02.A07().A0w();
        while (!C18070vi.A18(A082, A0w) && A082 != null) {
            A082.A16();
            A082 = A082.A0w();
        }
    }

    public void C46() {
        if (this.A08 != null) {
            AnonymousClass0VQ r1 = this.A05;
            if (r1 != null) {
                AnonymousClass0VQ.A09(r1, false);
            }
            if (this.A0E) {
                this.A0E = false;
                A0W();
            } else {
                A05();
            }
            this.A01 = AnonymousClass0PD.A00.addAndGet(1);
            AnonymousClass0QR r12 = this.A0S;
            for (AnonymousClass0XW r0 = r12.A01; r0 != null; r0 = r0.A02) {
                r0.A0C();
            }
            r12.A09();
            A0A(this);
            return;
        }
        throw AnonymousClass000.A0k("onReuse is only expected on attached node");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CIR(X.C17030tc r9) {
        /*
            r8 = this;
            r8.A02 = r9
            X.07W r0 = X.AnonymousClass0OD.A01
            java.lang.Object r0 = r9.BMA(r0)
            X.ECa r0 = (X.C28644ECa) r0
            r8.CIh(r0)
            X.07W r0 = X.AnonymousClass0OD.A06
            java.lang.Object r0 = r9.BMA(r0)
            X.By4 r0 = (X.C24246By4) r0
            r8.CJJ(r0)
            X.07W r0 = X.AnonymousClass0OD.A0B
            java.lang.Object r0 = r9.BMA(r0)
            X.0tN r0 = (X.C16880tN) r0
            r8.CLP(r0)
            X.0QR r0 = r8.A0S
            r7 = 32768(0x8000, float:4.5918E-41)
            X.0XW r6 = r0.A01
            int r0 = r6.A00
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0085
        L_0x002f:
            int r0 = r6.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x007b
            r5 = 0
            r4 = r6
        L_0x0036:
            boolean r0 = r4 instanceof X.C17560ur
            r3 = 1
            if (r0 == 0) goto L_0x004e
            X.0XW r1 = r4.A03
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x004b
            X.C04970Ps.A03(r1)
        L_0x0044:
            X.0XW r4 = X.AnonymousClass0QV.A00(r5)
        L_0x0048:
            if (r4 == 0) goto L_0x007b
            goto L_0x0036
        L_0x004b:
            r1.A08 = r3
            goto L_0x0044
        L_0x004e:
            int r0 = r4.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0044
            boolean r0 = r4 instanceof X.C014308l
            if (r0 == 0) goto L_0x0044
            r0 = r4
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x005d:
            if (r2 == 0) goto L_0x0078
            int r0 = r2.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0069
            int r1 = r1 + 1
            if (r1 != r3) goto L_0x006c
            r4 = r2
        L_0x0069:
            X.0XW r2 = r2.A02
            goto L_0x005d
        L_0x006c:
            X.0a9 r5 = X.AnonymousClass001.A0z(r5)
            X.0XW r4 = X.AnonymousClass000.A0d(r5, r4)
            r5.A0F(r2)
            goto L_0x0069
        L_0x0078:
            if (r1 != r3) goto L_0x0044
            goto L_0x0048
        L_0x007b:
            int r0 = r6.A00
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0085
            X.0XW r6 = r6.A02
            if (r6 == 0) goto L_0x0085
            goto L_0x002f
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XV.CIR(X.0tc):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CIh(X.C28644ECa r8) {
        /*
            r7 = this;
            X.ECa r0 = r7.A0L
            boolean r0 = X.C18070vi.A18(r0, r8)
            if (r0 != 0) goto L_0x0076
            r7.A0L = r8
            r7.A0V()
            X.0XV r0 = r7.A0I()
            if (r0 == 0) goto L_0x0016
            r0.A0T()
        L_0x0016:
            r7.A0U()
            X.0QR r0 = r7.A0S
            X.0XW r6 = r0.A01
            int r0 = r6.A00
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0076
        L_0x0023:
            int r0 = r6.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x006b
            r5 = 0
            r4 = r6
        L_0x002b:
            boolean r0 = r4 instanceof X.C17690v4
            if (r0 == 0) goto L_0x003b
            X.0v4 r4 = (X.C17690v4) r4
            r4.BrG()
        L_0x0034:
            X.0XW r4 = X.AnonymousClass0QV.A00(r5)
        L_0x0038:
            if (r4 == 0) goto L_0x006b
            goto L_0x002b
        L_0x003b:
            int r0 = r4.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0034
            boolean r0 = r4 instanceof X.C014308l
            if (r0 == 0) goto L_0x0034
            r0 = r4
            X.08l r0 = (X.C014308l) r0
            X.0XW r3 = r0.A00
            r2 = 0
        L_0x004b:
            r1 = 1
            if (r3 == 0) goto L_0x0068
            int r0 = r3.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0059
            int r2 = r2 + 1
            if (r2 != r1) goto L_0x005c
            r4 = r3
        L_0x0059:
            X.0XW r3 = r3.A02
            goto L_0x004b
        L_0x005c:
            X.0a9 r5 = X.AnonymousClass001.A10(r5)
            X.0XW r4 = X.AnonymousClass000.A0d(r5, r4)
            r5.A0F(r3)
            goto L_0x0059
        L_0x0068:
            if (r2 != r1) goto L_0x0034
            goto L_0x0038
        L_0x006b:
            int r0 = r6.A00
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0076
            X.0XW r6 = r6.A02
            if (r6 == 0) goto L_0x0076
            goto L_0x0023
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XV.CIh(X.ECa):void");
    }

    public void CJJ(C24246By4 by4) {
        if (this.A0M != by4) {
            this.A0M = by4;
            A0V();
            AnonymousClass0XV A0I2 = A0I();
            if (A0I2 != null) {
                A0I2.A0T();
            }
            A0U();
        }
    }

    public void CJP(C16870tM r2) {
        if (!C18070vi.A18(this.A06, r2)) {
            this.A06 = r2;
            this.A0P.A00.setValue(r2);
            A0V();
        }
    }

    public void CJY(C17090tj r4) {
        if (this.A0T && this.A04 != C17090tj.A00) {
            throw AnonymousClass000.A0k("Modifiers are not supported on virtual LayoutNodes");
        } else if (!this.A0E) {
            this.A04 = r4;
            AnonymousClass0QR r2 = this.A0S;
            r2.A0B(r4);
            this.A0Q.A05();
            if (AnonymousClass000.A1O(512 & r2.A01.A00) && this.A07 == null) {
                A08(this);
            }
        } else {
            throw AnonymousClass000.A0k("modifier is updated when deactivated");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CLP(X.C16880tN r8) {
        /*
            r7 = this;
            X.0tN r0 = r7.A09
            boolean r0 = X.C18070vi.A18(r0, r8)
            if (r0 != 0) goto L_0x0067
            r7.A09 = r8
            X.0QR r0 = r7.A0S
            X.0XW r6 = r0.A01
            int r0 = r6.A00
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0067
        L_0x0014:
            int r0 = r6.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x005c
            r5 = 0
            r4 = r6
        L_0x001c:
            boolean r0 = r4 instanceof X.C17690v4
            if (r0 == 0) goto L_0x002c
            X.0v4 r4 = (X.C17690v4) r4
            r4.CA7()
        L_0x0025:
            X.0XW r4 = X.AnonymousClass0QV.A00(r5)
        L_0x0029:
            if (r4 == 0) goto L_0x005c
            goto L_0x001c
        L_0x002c:
            int r0 = r4.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0025
            boolean r0 = r4 instanceof X.C014308l
            if (r0 == 0) goto L_0x0025
            r0 = r4
            X.08l r0 = (X.C014308l) r0
            X.0XW r3 = r0.A00
            r2 = 0
        L_0x003c:
            r1 = 1
            if (r3 == 0) goto L_0x0059
            int r0 = r3.A01
            r0 = r0 & 16
            if (r0 == 0) goto L_0x004a
            int r2 = r2 + 1
            if (r2 != r1) goto L_0x004d
            r4 = r3
        L_0x004a:
            X.0XW r3 = r3.A02
            goto L_0x003c
        L_0x004d:
            X.0a9 r5 = X.AnonymousClass001.A10(r5)
            X.0XW r4 = X.AnonymousClass000.A0d(r5, r4)
            r5.A0F(r3)
            goto L_0x004a
        L_0x0059:
            if (r2 != r1) goto L_0x0025
            goto L_0x0029
        L_0x005c:
            int r0 = r6.A00
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0067
            X.0XW r6 = r6.A02
            if (r6 == 0) goto L_0x0067
            goto L_0x0014
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XV.CLP(X.0tN):void");
    }

    public AnonymousClass0XV(boolean z, int i) {
        this.A0T = z;
        this.A01 = i;
        this.A0R = new C03660Jf(C06970a9.A02(new AnonymousClass0XV[16]), new C08240em(this));
        this.A0U = C06970a9.A02(new AnonymousClass0XV[16]);
        this.A0O = true;
        this.A06 = A0W;
        this.A0P = new AnonymousClass0NW(this);
        this.A0L = AnonymousClass0O0.A00;
        this.A0M = C24246By4.Ltr;
        this.A09 = A0X;
        this.A02 = AnonymousClass0MI.A00;
        Integer num = AnonymousClass00R.A0C;
        this.A0A = num;
        this.A0N = num;
        this.A0S = new AnonymousClass0QR(this);
        this.A0Q = new C04700Ok(this);
        this.A0D = true;
        this.A04 = C17090tj.A00;
    }

    private final String A02(int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        for (int i2 = 0; i2 < i; i2++) {
            A10.append("  ");
        }
        A10.append("|-");
        A10.append(toString());
        A10.append(10);
        C06970a9 A0F2 = A0F();
        int i3 = A0F2.A00;
        if (i3 > 0) {
            Object[] objArr = A0F2.A01;
            int i4 = 0;
            do {
                A10.append(((AnonymousClass0XV) objArr[i4]).A02(i + 1));
                i4++;
            } while (i4 < i3);
        }
        String obj = A10.toString();
        if (i != 0) {
            return obj;
        }
        String substring = obj.substring(0, obj.length() - 1);
        C18070vi.A0X(substring);
        return substring;
    }

    public final C06970a9 A0F() {
        A0c();
        if (this.A0H == 0) {
            return this.A0R.A00;
        }
        C06970a9 r0 = this.A03;
        C18070vi.A0b(r0);
        return r0;
    }

    public final C05880Wb A0J() {
        return AnonymousClass0O0.A00(this).getSharedDrawScope();
    }

    public C28644ECa A0M() {
        return this.A0L;
    }

    public C24246By4 A0N() {
        return this.A0M;
    }

    public final void A0T() {
        C01850Ad A012 = A01();
        if (A012 != null) {
            A012.A10();
            return;
        }
        AnonymousClass0XV A0I2 = A0I();
        if (A0I2 != null) {
            A0I2.A0T();
        }
    }

    public final void A0b() {
        C06970a9 A0F2 = A0F();
        int i = A0F2.A00;
        if (i > 0) {
            Object[] objArr = A0F2.A01;
            int i2 = 0;
            do {
                AnonymousClass0XV r2 = (AnonymousClass0XV) objArr[i2];
                Integer num = r2.A0N;
                r2.A0A = num;
                if (num != AnonymousClass00R.A0C) {
                    r2.A0b();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(AnonymousClass0FH.A00(this));
        A10.append(" children: ");
        A10.append(C06970a9.A00(A0F()));
        A10.append(" measurePolicy: ");
        A10.append(this.A06);
        return A10.toString();
    }

    public AnonymousClass0XV() {
        this(false, AnonymousClass0PD.A00.addAndGet(1));
    }
}
