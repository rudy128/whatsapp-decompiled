package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1qi  reason: invalid class name and case insensitive filesystem */
public class C38111qi implements C38101qh {
    public int A00 = 0;
    public C29011bR A01 = new C29021bS(30);
    public final C38081qf A02;
    public final C38121qj A03;
    public final ArrayList A04 = new ArrayList();
    public final ArrayList A05 = new ArrayList();

    public void CDm(C38481rM r2) {
        r2.A03 = null;
        this.A01.CEF(r2);
    }

    private int A00(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = this.A05;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C38481rM r3 = (C38481rM) arrayList.get(size);
            int i9 = r3.A00;
            int i10 = r3.A02;
            if (i9 == 8) {
                if (i10 < r3.A01) {
                    i4 = r3.A02;
                    i5 = r3.A01;
                } else {
                    i4 = r3.A01;
                    i5 = r3.A02;
                }
                if (i < i4 || i > i5) {
                    if (i < r3.A02) {
                        if (i2 == 1) {
                            r3.A02++;
                            i6 = r3.A01 + 1;
                        } else if (i2 == 2) {
                            r3.A02--;
                            i6 = r3.A01 - 1;
                        }
                        r3.A01 = i6;
                    }
                } else if (i4 == r3.A02) {
                    if (i2 == 1) {
                        i8 = r3.A01 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = r3.A01 - 1;
                        }
                        i++;
                    }
                    r3.A01 = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = r3.A02 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = r3.A02 - 1;
                        }
                        i--;
                    }
                    r3.A02 = i7;
                    i--;
                }
            } else if (i10 > i) {
                if (i2 == 1) {
                    i3 = r3.A02 + 1;
                } else if (i2 == 2) {
                    i3 = r3.A02 - 1;
                }
                r3.A02 = i3;
            } else if (r3.A00 == 1) {
                i -= r3.A01;
            } else if (r3.A00 == 2) {
                i += r3.A01;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C38481rM r2 = (C38481rM) arrayList.get(size2);
            int i11 = r2.A00;
            int i12 = r2.A01;
            if (i11 == 8) {
                if (i12 != r2.A02 && r2.A01 >= 0) {
                }
            } else if (i12 > 0) {
            }
            arrayList.remove(size2);
            CDm(r2);
        }
        return i;
    }

    private void A01(C38481rM r11) {
        int i;
        int i2 = r11.A00;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int A002 = A00(r11.A02, i2);
        int i3 = r11.A02;
        int i4 = r11.A00;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("op should be remove or update.");
            sb.append(r11);
            throw new IllegalArgumentException(sb.toString());
        }
        int i5 = 1;
        for (int i6 = 1; i6 < r11.A01; i6++) {
            int A003 = A00(r11.A02 + (i * i6), i4);
            i4 = r11.A00;
            if (i4 == 2 ? A003 != A002 : !(i4 == 4 && A003 == A002 + 1)) {
                C38481rM Bkc = Bkc(r11.A03, i4, A002, i5);
                A08(Bkc, i3);
                CDm(Bkc);
                i4 = r11.A00;
                if (i4 == 4) {
                    i3 += i5;
                }
                A002 = A003;
                i5 = 1;
            } else {
                i5++;
            }
        }
        Object obj = r11.A03;
        CDm(r11);
        if (i5 > 0) {
            C38481rM Bkc2 = Bkc(obj, r11.A00, A002, i5);
            A08(Bkc2, i3);
            CDm(Bkc2);
        }
    }

    private void A02(C38481rM r5) {
        this.A05.add(r5);
        int i = r5.A00;
        if (i == 1) {
            this.A02.Bke(r5.A02, r5.A01);
        } else if (i == 2) {
            C38081qf r0 = this.A02;
            int i2 = r5.A02;
            int i3 = r5.A01;
            RecyclerView recyclerView = ((C38091qg) r0).A00;
            recyclerView.A0m(i2, i3, false);
            recyclerView.A0T = true;
        } else if (i == 4) {
            this.A02.Bip(r5.A03, r5.A02, r5.A01);
        } else if (i == 8) {
            this.A02.Bkf(r5.A02, r5.A01);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown update op type for ");
            sb.append(r5);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private boolean A03(int i) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C38481rM r7 = (C38481rM) arrayList.get(i2);
            if (r7.A00 != 8) {
                if (r7.A00 == 1) {
                    int i3 = r7.A02;
                    int i4 = i3 + r7.A01;
                    while (i3 < i4) {
                        if (A04(i3, i2 + 1) != i) {
                            i3++;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
                i2++;
            } else if (A04(r7.A01, i2 + 1) != i) {
                i2++;
            }
            return true;
        }
        return false;
    }

    public int A04(int i, int i2) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        while (i2 < size) {
            C38481rM r5 = (C38481rM) arrayList.get(i2);
            int i3 = r5.A00;
            int i4 = r5.A02;
            if (i3 == 8) {
                if (i4 == i) {
                    i = r5.A01;
                } else {
                    if (r5.A02 < i) {
                        i--;
                    }
                    if (r5.A01 <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (r5.A00 == 2) {
                if (i < r5.A02 + r5.A01) {
                    return -1;
                }
                i -= r5.A01;
            } else if (r5.A00 == 1) {
                i += r5.A01;
            }
            i2++;
        }
        return i;
    }

    public void A05() {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C38091qg) this.A02).A00((C38481rM) arrayList.get(i));
        }
        A09(arrayList);
        this.A00 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01e1, code lost:
        if (r12.A08.A02.contains(r1.A0H) != false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0219, code lost:
        if (r3 == 0) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x023f, code lost:
        if (r13.A08.A02.contains(r1.A0H) != false) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0279, code lost:
        if (r4 == 0) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a2, code lost:
        if (r4.A01 != (r11 - r13)) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fb, code lost:
        if (r4.A01 != (r13 - r11)) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ff, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012a, code lost:
        if (r1 > r4.A02) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016f, code lost:
        if (r1 >= r4.A02) goto L_0x012c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0004 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07() {
        /*
            r15 = this;
            X.1qj r8 = r15.A03
            java.util.ArrayList r9 = r15.A04
        L_0x0004:
            int r7 = r9.size()
            r0 = 1
            int r7 = r7 - r0
            r2 = 0
        L_0x000b:
            if (r7 < 0) goto L_0x01a0
            java.lang.Object r0 = r9.get(r7)
            X.1rM r0 = (X.C38481rM) r0
            int r1 = r0.A00
            r0 = 8
            if (r1 != r0) goto L_0x019b
            if (r2 == 0) goto L_0x019c
            int r6 = r7 + 1
            java.lang.Object r5 = r9.get(r7)
            X.1rM r5 = (X.C38481rM) r5
            java.lang.Object r4 = r9.get(r6)
            X.1rM r4 = (X.C38481rM) r4
            int r1 = r4.A00
            r0 = 1
            if (r1 == r0) goto L_0x0172
            r10 = 2
            if (r1 == r10) goto L_0x0091
            r3 = 4
            if (r1 != r3) goto L_0x0004
            int r2 = r5.A01
            int r1 = r4.A02
            r11 = 1
            r10 = 0
            if (r2 >= r1) goto L_0x007e
            int r1 = r1 - r0
            r4.A02 = r1
        L_0x003f:
            r11 = r10
        L_0x0040:
            int r1 = r5.A02
            int r12 = r4.A02
            if (r1 > r12) goto L_0x0068
            int r0 = r12 + 1
            r4.A02 = r0
        L_0x004a:
            r9.set(r6, r5)
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x005f
            r9.set(r7, r4)
        L_0x0054:
            if (r11 == 0) goto L_0x0059
            r9.add(r7, r11)
        L_0x0059:
            if (r10 == 0) goto L_0x0004
            r9.add(r7, r10)
            goto L_0x0004
        L_0x005f:
            r9.remove(r7)
            X.1qh r0 = r8.A00
            r0.CDm(r4)
            goto L_0x0054
        L_0x0068:
            int r0 = r4.A01
            int r12 = r12 + r0
            if (r1 >= r12) goto L_0x004a
            int r12 = r12 - r1
            X.1qh r2 = r8.A00
            int r1 = r1 + 1
            java.lang.Object r0 = r4.A03
            X.1rM r10 = r2.Bkc(r0, r3, r1, r12)
            int r0 = r4.A01
            int r0 = r0 - r12
            r4.A01 = r0
            goto L_0x004a
        L_0x007e:
            int r0 = r4.A01
            int r1 = r1 + r0
            if (r2 >= r1) goto L_0x003f
            int r0 = r0 - r11
            r4.A01 = r0
            X.1qh r2 = r8.A00
            int r1 = r5.A02
            java.lang.Object r0 = r4.A03
            X.1rM r11 = r2.Bkc(r0, r3, r1, r11)
            goto L_0x0040
        L_0x0091:
            int r13 = r5.A02
            int r11 = r5.A01
            r2 = 1
            r14 = 0
            int r3 = r4.A02
            if (r13 >= r11) goto L_0x00f3
            if (r3 != r13) goto L_0x00a4
            int r1 = r4.A01
            int r0 = r11 - r13
            r12 = 0
            if (r1 == r0) goto L_0x00ff
        L_0x00a4:
            r12 = 0
        L_0x00a5:
            if (r11 >= r3) goto L_0x00d8
            int r3 = r3 - r2
            r4.A02 = r3
        L_0x00aa:
            int r11 = r5.A02
            r2 = 0
            if (r11 > r3) goto L_0x00c2
            int r0 = r3 + 1
            r4.A02 = r0
        L_0x00b3:
            if (r14 == 0) goto L_0x0101
            r9.set(r7, r4)
            r9.remove(r6)
            X.1qh r0 = r8.A00
            r0.CDm(r5)
            goto L_0x0004
        L_0x00c2:
            int r0 = r4.A01
            int r3 = r3 + r0
            if (r11 >= r3) goto L_0x00b3
            int r3 = r3 - r11
            X.1qh r1 = r8.A00
            int r0 = r11 + 1
            X.1rM r2 = r1.Bkc(r2, r10, r0, r3)
            int r1 = r5.A02
            int r0 = r4.A02
            int r1 = r1 - r0
            r4.A01 = r1
            goto L_0x00b3
        L_0x00d8:
            int r1 = r4.A01
            int r0 = r3 + r1
            if (r11 >= r0) goto L_0x00aa
            int r1 = r1 - r2
            r4.A01 = r1
            r5.A00 = r10
            r5.A01 = r2
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0004
            r9.remove(r6)
            X.1qh r0 = r8.A00
            r0.CDm(r4)
            goto L_0x0004
        L_0x00f3:
            int r0 = r11 + 1
            if (r3 != r0) goto L_0x00fd
            int r0 = r4.A01
            int r13 = r13 - r11
            r12 = 1
            if (r0 == r13) goto L_0x00ff
        L_0x00fd:
            r12 = 1
            goto L_0x00a5
        L_0x00ff:
            r14 = 1
            goto L_0x00a5
        L_0x0101:
            if (r12 == 0) goto L_0x0148
            if (r2 == 0) goto L_0x011b
            int r1 = r5.A02
            int r0 = r2.A02
            if (r1 <= r0) goto L_0x0110
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x0110:
            int r1 = r5.A01
            int r0 = r2.A02
            if (r1 <= r0) goto L_0x011b
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A01 = r1
        L_0x011b:
            int r1 = r5.A02
            int r0 = r4.A02
            if (r1 <= r0) goto L_0x0126
            int r0 = r4.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x0126:
            int r1 = r5.A01
            int r0 = r4.A02
            if (r1 <= r0) goto L_0x0131
        L_0x012c:
            int r0 = r4.A01
            int r1 = r1 - r0
            r5.A01 = r1
        L_0x0131:
            r9.set(r7, r4)
            int r1 = r5.A02
            int r0 = r5.A01
            if (r1 == r0) goto L_0x0144
            r9.set(r6, r5)
        L_0x013d:
            if (r2 == 0) goto L_0x0004
            r9.add(r7, r2)
            goto L_0x0004
        L_0x0144:
            r9.remove(r6)
            goto L_0x013d
        L_0x0148:
            if (r2 == 0) goto L_0x0160
            int r1 = r5.A02
            int r0 = r2.A02
            if (r1 < r0) goto L_0x0155
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x0155:
            int r1 = r5.A01
            int r0 = r2.A02
            if (r1 < r0) goto L_0x0160
            int r0 = r2.A01
            int r1 = r1 - r0
            r5.A01 = r1
        L_0x0160:
            int r1 = r5.A02
            int r0 = r4.A02
            if (r1 < r0) goto L_0x016b
            int r0 = r4.A01
            int r1 = r1 - r0
            r5.A02 = r1
        L_0x016b:
            int r1 = r5.A01
            int r0 = r4.A02
            if (r1 < r0) goto L_0x0131
            goto L_0x012c
        L_0x0172:
            int r3 = r5.A01
            int r0 = r4.A02
            r2 = 0
            if (r3 >= r0) goto L_0x017a
            r2 = -1
        L_0x017a:
            int r1 = r5.A02
            if (r1 >= r0) goto L_0x0180
            int r2 = r2 + 1
        L_0x0180:
            if (r0 > r1) goto L_0x0187
            int r0 = r4.A01
            int r1 = r1 + r0
            r5.A02 = r1
        L_0x0187:
            int r1 = r4.A02
            if (r1 > r3) goto L_0x0190
            int r0 = r4.A01
            int r3 = r3 + r0
            r5.A01 = r3
        L_0x0190:
            int r1 = r1 + r2
            r4.A02 = r1
            r9.set(r7, r4)
            r9.set(r6, r5)
            goto L_0x0004
        L_0x019b:
            r2 = 1
        L_0x019c:
            int r7 = r7 + -1
            goto L_0x000b
        L_0x01a0:
            int r8 = r9.size()
            r7 = 0
        L_0x01a5:
            if (r7 >= r8) goto L_0x0285
            java.lang.Object r6 = r9.get(r7)
            X.1rM r6 = (X.C38481rM) r6
            int r1 = r6.A00
            r0 = 1
            if (r1 == r0) goto L_0x0280
            r11 = 2
            if (r1 == r11) goto L_0x021c
            r5 = 4
            if (r1 == r5) goto L_0x01bf
            r0 = 8
            if (r1 == r0) goto L_0x0280
        L_0x01bc:
            int r7 = r7 + 1
            goto L_0x01a5
        L_0x01bf:
            int r10 = r6.A02
            int r0 = r6.A01
            int r11 = r10 + r0
            r4 = r10
            r3 = -1
            r2 = 0
        L_0x01c8:
            if (r4 >= r11) goto L_0x020c
            X.1qf r0 = r15.A02
            X.1qg r0 = (X.C38091qg) r0
            androidx.recyclerview.widget.RecyclerView r12 = r0.A00
            r0 = 1
            X.1xT r1 = r12.A0P(r4, r0)
            if (r1 == 0) goto L_0x01e3
            X.1qm r0 = r12.A08
            android.view.View r1 = r1.A0H
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x01fd
        L_0x01e3:
            r1 = 1
            boolean r0 = r15.A03(r4)
            if (r0 != 0) goto L_0x01fd
            if (r3 != r1) goto L_0x01f7
            java.lang.Object r0 = r6.A03
            X.1rM r0 = r15.Bkc(r0, r5, r10, r2)
            r15.A02(r0)
            r10 = r4
            r2 = 0
        L_0x01f7:
            r3 = 0
        L_0x01f8:
            int r2 = r2 + 1
            int r4 = r4 + 1
            goto L_0x01c8
        L_0x01fd:
            if (r3 != 0) goto L_0x020a
            java.lang.Object r0 = r6.A03
            X.1rM r0 = r15.Bkc(r0, r5, r10, r2)
            r15.A01(r0)
            r10 = r4
            r2 = 0
        L_0x020a:
            r3 = 1
            goto L_0x01f8
        L_0x020c:
            int r0 = r6.A01
            if (r2 == r0) goto L_0x0219
            java.lang.Object r0 = r6.A03
            r15.CDm(r6)
            X.1rM r6 = r15.Bkc(r0, r5, r10, r2)
        L_0x0219:
            if (r3 != 0) goto L_0x0280
            goto L_0x027b
        L_0x021c:
            int r10 = r6.A02
            int r0 = r6.A01
            int r12 = r10 + r0
            r5 = r10
            r4 = -1
            r3 = 0
        L_0x0225:
            r2 = 0
            if (r5 >= r12) goto L_0x026e
            X.1qf r0 = r15.A02
            X.1qg r0 = (X.C38091qg) r0
            androidx.recyclerview.widget.RecyclerView r13 = r0.A00
            r0 = 1
            X.1xT r1 = r13.A0P(r5, r0)
            if (r1 == 0) goto L_0x0241
            X.1qm r0 = r13.A08
            android.view.View r1 = r1.A0H
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0260
        L_0x0241:
            r1 = 1
            boolean r0 = r15.A03(r5)
            if (r0 != 0) goto L_0x0260
            if (r4 != r1) goto L_0x025e
            X.1rM r0 = r15.Bkc(r2, r11, r10, r3)
            r15.A02(r0)
            r0 = 1
        L_0x0252:
            r4 = 0
        L_0x0253:
            if (r0 == 0) goto L_0x025b
            int r5 = r5 - r3
            int r12 = r12 - r3
            r3 = 1
        L_0x0258:
            int r5 = r5 + 1
            goto L_0x0225
        L_0x025b:
            int r3 = r3 + 1
            goto L_0x0258
        L_0x025e:
            r0 = 0
            goto L_0x0252
        L_0x0260:
            if (r4 != 0) goto L_0x026c
            X.1rM r0 = r15.Bkc(r2, r11, r10, r3)
            r15.A01(r0)
            r0 = 1
        L_0x026a:
            r4 = 1
            goto L_0x0253
        L_0x026c:
            r0 = 0
            goto L_0x026a
        L_0x026e:
            int r0 = r6.A01
            if (r3 == r0) goto L_0x0279
            r15.CDm(r6)
            X.1rM r6 = r15.Bkc(r2, r11, r10, r3)
        L_0x0279:
            if (r4 != 0) goto L_0x0280
        L_0x027b:
            r15.A01(r6)
            goto L_0x01bc
        L_0x0280:
            r15.A02(r6)
            goto L_0x01bc
        L_0x0285:
            r9.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38111qi.A07():void");
    }

    public void A08(C38481rM r5, int i) {
        C38081qf r2 = this.A02;
        C38091qg r3 = (C38091qg) r2;
        r3.A00(r5);
        int i2 = r5.A00;
        if (i2 == 2) {
            int i3 = r5.A01;
            RecyclerView recyclerView = r3.A00;
            recyclerView.A0m(i, i3, true);
            recyclerView.A0T = true;
            recyclerView.A0w.A00 += i3;
        } else if (i2 == 4) {
            r2.Bip(r5.A03, i, r5.A01);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.1rM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.1rM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: X.1rM} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C38481rM Bkc(java.lang.Object r2, int r3, int r4, int r5) {
        /*
            r1 = this;
            X.1bR r0 = r1.A01
            java.lang.Object r0 = r0.BAf()
            X.1rM r0 = (X.C38481rM) r0
            if (r0 != 0) goto L_0x000f
            X.1rM r0 = new X.1rM
            r0.<init>()
        L_0x000f:
            r0.A00 = r3
            r0.A02 = r4
            r0.A01 = r5
            r0.A03 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38111qi.Bkc(java.lang.Object, int, int, int):X.1rM");
    }

    public C38111qi(C38081qf r3) {
        this.A02 = r3;
        this.A03 = new C38121qj(this);
    }

    public void A06() {
        A05();
        ArrayList arrayList = this.A04;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C38481rM r8 = (C38481rM) arrayList.get(i);
            int i2 = r8.A00;
            if (i2 == 1) {
                C38081qf r2 = this.A02;
                ((C38091qg) r2).A00(r8);
                r2.Bke(r8.A02, r8.A01);
            } else if (i2 == 2) {
                C38091qg r0 = (C38091qg) this.A02;
                r0.A00(r8);
                int i3 = r8.A02;
                int i4 = r8.A01;
                RecyclerView recyclerView = r0.A00;
                recyclerView.A0m(i3, i4, true);
                recyclerView.A0T = true;
                recyclerView.A0w.A00 += i4;
            } else if (i2 == 4) {
                C38081qf r3 = this.A02;
                ((C38091qg) r3).A00(r8);
                r3.Bip(r8.A03, r8.A02, r8.A01);
            } else if (i2 == 8) {
                C38081qf r22 = this.A02;
                ((C38091qg) r22).A00(r8);
                r22.Bkf(r8.A02, r8.A01);
            }
        }
        A09(arrayList);
        this.A00 = 0;
    }

    public void A09(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            CDm((C38481rM) list.get(i));
        }
        list.clear();
    }
}
