package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.0XT  reason: invalid class name */
public final class AnonymousClass0XT implements C17430ue, C16410sD {
    public static final C05940Wi A05 = new C05940Wi();
    public final AnonymousClass0CI A00;
    public final AnonymousClass0H2 A01;
    public final C16160ro A02;
    public final C24246By4 A03;
    public final boolean A04;

    private final boolean A00(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            return false;
        }
        if (i != 2) {
            if (i != 5) {
                if (i != 6) {
                    if (AnonymousClass000.A1T(i, 3)) {
                        int ordinal = this.A03.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new AnonymousClass3EW();
                            }
                        }
                    } else if (i == 4) {
                        int ordinal2 = this.A03.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new AnonymousClass3EW();
                            }
                        }
                    } else {
                        throw AnonymousClass000.A0n("Lazy list does not support beyond bounds layout for the specified direction");
                    }
                }
                if (!this.A04) {
                    return true;
                }
                return false;
            }
            return this.A04;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r1 == r0) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.AnonymousClass0Jb r4, X.AnonymousClass0XT r5, int r6) {
        /*
            r0 = 5
            boolean r0 = X.AnonymousClass000.A1T(r6, r0)
            r2 = 1
            if (r0 != 0) goto L_0x0022
            r0 = 6
            if (r6 == r0) goto L_0x0022
            r0 = 3
            if (r6 == r0) goto L_0x001d
            r0 = 4
            if (r6 == r0) goto L_0x001d
            if (r6 == r2) goto L_0x0050
            r0 = 2
            if (r6 == r0) goto L_0x0050
            java.lang.String r0 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x001d:
            X.0CI r1 = r5.A00
            X.0CI r0 = X.AnonymousClass0CI.Vertical
            goto L_0x0026
        L_0x0022:
            X.0CI r1 = r5.A00
            X.0CI r0 = X.AnonymousClass0CI.Horizontal
        L_0x0026:
            if (r1 != r0) goto L_0x0050
        L_0x0028:
            r3 = 0
            if (r2 != 0) goto L_0x004a
            boolean r0 = r5.A00(r6)
            r2 = 1
            if (r0 == 0) goto L_0x004b
            int r1 = r4.A00
            X.0ro r0 = r5.A02
            X.0V3 r0 = (X.AnonymousClass0V3) r0
            androidx.compose.foundation.lazy.LazyListState r0 = r0.A01
            X.0uU r0 = r0.A0L
            java.lang.Object r0 = r0.getValue()
            X.0r3 r0 = (X.C15700r3) r0
            X.0XG r0 = (X.AnonymousClass0XG) r0
            int r0 = r0.A04
            int r0 = r0 - r2
            if (r1 >= r0) goto L_0x004a
        L_0x0049:
            r3 = 1
        L_0x004a:
            return r3
        L_0x004b:
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x004a
            goto L_0x0049
        L_0x0050:
            r2 = 0
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XT.A01(X.0Jb, X.0XT, int):boolean");
    }

    public /* synthetic */ boolean BC2(C22821Di r2) {
        return AnonymousClass0LD.A01(this, r2);
    }

    public /* synthetic */ Object BLT(Object obj, AnonymousClass1OS r3) {
        return AnonymousClass0LD.A00(this, obj, r3);
    }

    public /* synthetic */ C17090tj CP5(C17090tj r2) {
        return AnonymousClass0EW.A00(this, r2);
    }

    public Object BhO(C22821Di r8, int i) {
        int max;
        C16160ro r4 = this.A02;
        AnonymousClass0V3 r2 = (AnonymousClass0V3) r4;
        LazyListState lazyListState = r2.A01;
        C17330uU r1 = lazyListState.A0L;
        if (((AnonymousClass0XG) ((C15700r3) r1.getValue())).A04 <= 0 || !AnonymousClass000.A1a(((AnonymousClass0XG) ((C15700r3) r1.getValue())).A08)) {
            return r8.invoke(A05);
        }
        if (A00(i)) {
            max = r4.BTr();
        } else {
            max = Math.max(0, lazyListState.A0F.A03.BT8() - r2.A00);
        }
        C98494rF r6 = new C98494rF();
        AnonymousClass0H2 r12 = this.A01;
        AnonymousClass0Jb r0 = new AnonymousClass0Jb(max, max);
        C06970a9 r5 = r12.A00;
        r5.A0F(r0);
        r6.element = r0;
        Object obj = null;
        while (A01((AnonymousClass0Jb) r6.element, this, i)) {
            AnonymousClass0Jb r02 = (AnonymousClass0Jb) r6.element;
            int i2 = r02.A01;
            int i3 = r02.A00;
            if (A00(i)) {
                i3++;
            } else {
                i2--;
            }
            AnonymousClass0Jb r13 = new AnonymousClass0Jb(i2, i3);
            r5.A0F(r13);
            r5.A0H(r6.element);
            r6.element = r13;
            C16450sH r03 = lazyListState.A04;
            if (r03 != null) {
                r03.BLX();
            }
            obj = r8.invoke(new C05950Wj(this, r6, i));
            if (obj != null) {
                break;
            }
        }
        r5.A0H(r6.element);
        C16450sH r04 = lazyListState.A04;
        if (r04 != null) {
            r04.BLX();
        }
        return obj;
    }

    public AnonymousClass0XT(AnonymousClass0CI r1, AnonymousClass0H2 r2, C16160ro r3, C24246By4 by4, boolean z) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = z;
        this.A03 = by4;
        this.A00 = r1;
    }

    public AnonymousClass0OJ BTf() {
        return AnonymousClass0GF.A00;
    }

    public /* bridge */ /* synthetic */ Object getValue() {
        return this;
    }
}
