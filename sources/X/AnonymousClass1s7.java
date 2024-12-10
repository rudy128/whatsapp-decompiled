package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1s7  reason: invalid class name */
public abstract class AnonymousClass1s7 implements AnonymousClass1s6 {
    public int A00;
    public int A01;
    public C38871s3 A02;
    public AnonymousClass1s9 A03;
    public AnonymousClass1s9 A04;
    public C38901sA A05;
    public C61502pn A06;
    public Integer A07;
    public Integer A08;
    public boolean A09;

    public static final AnonymousClass1s9 A00(C38921sC r3) {
        C38921sC r0 = r3.A03;
        if (r0 == null) {
            return null;
        }
        C38871s3 r2 = r0.A05;
        int intValue = r0.A06.intValue();
        if (intValue == 1) {
            return r2.A0c.A04;
        }
        if (intValue == 3) {
            return r2.A0c.A03;
        }
        if (intValue == 2) {
            return r2.A0d.A04;
        }
        if (intValue == 5) {
            return r2.A0d.A00;
        }
        if (intValue == 4) {
            return r2.A0d.A03;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r1 != 4) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass1s9 A01(X.C38921sC r3, int r4) {
        /*
            X.1sC r1 = r3.A03
            r3 = 0
            if (r1 == 0) goto L_0x001d
            X.1s3 r0 = r1.A05
            if (r4 != 0) goto L_0x001e
            X.1s8 r2 = r0.A0c
        L_0x000b:
            java.lang.Integer r0 = r1.A06
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0024
            r0 = 3
            if (r1 == r0) goto L_0x0021
            r0 = 2
            if (r1 == r0) goto L_0x0024
            r0 = 4
            if (r1 == r0) goto L_0x0021
        L_0x001d:
            return r3
        L_0x001e:
            X.1sB r2 = r0.A0d
            goto L_0x000b
        L_0x0021:
            X.1s9 r3 = r2.A03
            return r3
        L_0x0024:
            X.1s9 r3 = r2.A04
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1s7.A01(X.1sC, int):X.1s9");
    }

    public static final void A02(AnonymousClass1s9 r1, AnonymousClass1s9 r2, int i) {
        r1.A08.add(r2);
        r1.A00 = i;
        r2.A07.add(r1);
    }

    public final int A04(int i, int i2) {
        int i3;
        int i4;
        C38871s3 r0 = this.A02;
        if (i2 == 0) {
            i3 = r0.A0F;
            i4 = r0.A0H;
        } else {
            i3 = r0.A0E;
            i4 = r0.A0G;
        }
        int max = Math.max(i4, i);
        if (i3 > 0) {
            max = Math.min(i3, i);
        }
        if (max != i) {
            return max;
        }
        return i;
    }

    public long A05() {
        if (this instanceof AnonymousClass27R) {
            ArrayList arrayList = ((AnonymousClass27R) this).A01;
            int size = arrayList.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                AnonymousClass1s7 r2 = (AnonymousClass1s7) arrayList.get(i);
                j = j + ((long) r2.A04.A00) + r2.A05() + ((long) r2.A03.A00);
            }
            return j;
        }
        C38901sA r1 = this.A05;
        if (r1.A0B) {
            return (long) r1.A02;
        }
        return 0;
    }

    public void A06() {
        if (this instanceof C38911sB) {
            AnonymousClass1s9 r2 = this.A04;
            if (r2.A0B) {
                this.A02.A0Q = r2.A02;
            }
        } else if (this instanceof AnonymousClass1s8) {
            AnonymousClass1s9 r22 = this.A04;
            if (r22.A0B) {
                this.A02.A0P = r22.A02;
            }
        } else if (this instanceof AnonymousClass27Q) {
            C38871s3 r23 = this.A02;
            if (r23 instanceof AnonymousClass27M) {
                int i = ((AnonymousClass27M) r23).A00;
                if (i == 0 || i == 1) {
                    r23.A0P = this.A04.A02;
                } else {
                    r23.A0Q = this.A04.A02;
                }
            }
        } else if (this instanceof AnonymousClass27P) {
            C38871s3 r3 = this.A02;
            int i2 = ((AnonymousClass27L) r3).A01;
            int i3 = this.A04.A02;
            if (i2 == 1) {
                r3.A0P = i3;
            } else {
                r3.A0Q = i3;
            }
        } else {
            AnonymousClass27R r32 = (AnonymousClass27R) this;
            int i4 = 0;
            while (true) {
                ArrayList arrayList = r32.A01;
                if (i4 < arrayList.size()) {
                    ((AnonymousClass1s7) arrayList.get(i4)).A06();
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public void A07() {
        if (this instanceof C38911sB) {
            C38911sB r1 = (C38911sB) this;
            r1.A06 = null;
            r1.A04.A00();
            r1.A03.A00();
            r1.A00.A00();
            r1.A05.A00();
            r1.A09 = false;
        } else if (this instanceof AnonymousClass1s8) {
            this.A06 = null;
            this.A04.A00();
            this.A03.A00();
            this.A05.A00();
            this.A09 = false;
        } else {
            if (this instanceof AnonymousClass27Q) {
                this.A06 = null;
            } else if (!(this instanceof AnonymousClass27P)) {
                AnonymousClass27R r12 = (AnonymousClass27R) this;
                r12.A06 = null;
                Iterator it = r12.A01.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass1s7) it.next()).A07();
                }
                return;
            }
            this.A04.A00();
        }
    }

    public final void A09(AnonymousClass1s9 r3, AnonymousClass1s9 r4, C38901sA r5, int i) {
        List list = r3.A08;
        list.add(r4);
        list.add(this.A05);
        r3.A01 = i;
        r3.A04 = r5;
        r4.A07.add(r3);
        r5.A07.add(r3);
    }

    public boolean A0A() {
        int i;
        if (this instanceof C38911sB) {
            if (this.A07 != AnonymousClass00R.A0C) {
                return true;
            }
            i = this.A02.A0C;
        } else if (this instanceof AnonymousClass1s8) {
            if (this.A07 != AnonymousClass00R.A0C) {
                return true;
            }
            i = this.A02.A0D;
        } else if ((this instanceof AnonymousClass27Q) || (this instanceof AnonymousClass27P)) {
            return false;
        } else {
            ArrayList arrayList = ((AnonymousClass27R) this).A01;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!((AnonymousClass1s7) arrayList.get(i2)).A0A()) {
                    return false;
                }
            }
            return true;
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x022b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r11 = this;
            boolean r0 = r11 instanceof X.AnonymousClass27Q
            if (r0 == 0) goto L_0x00b2
            X.1s3 r6 = r11.A02
            boolean r0 = r6 instanceof X.AnonymousClass27M
            if (r0 == 0) goto L_0x028f
            X.1s9 r2 = r11.A04
            r0 = 1
            r2.A09 = r0
            X.27M r6 = (X.AnonymousClass27M) r6
            int r1 = r6.A00
            boolean r5 = r6.A02
            r4 = 8
            r3 = 0
            if (r1 == 0) goto L_0x008e
            if (r1 == r0) goto L_0x006a
            r0 = 2
            if (r1 == r0) goto L_0x0046
            r0 = 3
            if (r1 != r0) goto L_0x028f
            java.lang.Integer r0 = X.AnonymousClass00R.A0u
            r2.A06 = r0
        L_0x0026:
            int r0 = r6.A00
            if (r3 >= r0) goto L_0x0155
            X.1s3[] r0 = r6.A01
            r1 = r0[r3]
            if (r5 != 0) goto L_0x0037
            int r0 = r1.A0N
            if (r0 != r4) goto L_0x0037
        L_0x0034:
            int r3 = r3 + 1
            goto L_0x0026
        L_0x0037:
            X.1sB r0 = r1.A0d
            X.1s9 r1 = r0.A03
            java.util.List r0 = r1.A07
            r0.add(r2)
            java.util.List r0 = r2.A08
            r0.add(r1)
            goto L_0x0034
        L_0x0046:
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            r2.A06 = r0
        L_0x004a:
            int r0 = r6.A00
            if (r3 >= r0) goto L_0x0155
            X.1s3[] r0 = r6.A01
            r1 = r0[r3]
            if (r5 != 0) goto L_0x005b
            int r0 = r1.A0N
            if (r0 != r4) goto L_0x005b
        L_0x0058:
            int r3 = r3 + 1
            goto L_0x004a
        L_0x005b:
            X.1sB r0 = r1.A0d
            X.1s9 r1 = r0.A04
            java.util.List r0 = r1.A07
            r0.add(r2)
            java.util.List r0 = r2.A08
            r0.add(r1)
            goto L_0x0058
        L_0x006a:
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            r2.A06 = r0
        L_0x006e:
            int r0 = r6.A00
            if (r3 >= r0) goto L_0x00e3
            X.1s3[] r0 = r6.A01
            r1 = r0[r3]
            if (r5 != 0) goto L_0x007f
            int r0 = r1.A0N
            if (r0 != r4) goto L_0x007f
        L_0x007c:
            int r3 = r3 + 1
            goto L_0x006e
        L_0x007f:
            X.1s8 r0 = r1.A0c
            X.1s9 r1 = r0.A03
            java.util.List r0 = r1.A07
            r0.add(r2)
            java.util.List r0 = r2.A08
            r0.add(r1)
            goto L_0x007c
        L_0x008e:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r2.A06 = r0
        L_0x0092:
            int r0 = r6.A00
            if (r3 >= r0) goto L_0x00e3
            X.1s3[] r0 = r6.A01
            r1 = r0[r3]
            if (r5 != 0) goto L_0x00a3
            int r0 = r1.A0N
            if (r0 != r4) goto L_0x00a3
        L_0x00a0:
            int r3 = r3 + 1
            goto L_0x0092
        L_0x00a3:
            X.1s8 r0 = r1.A0c
            X.1s9 r1 = r0.A04
            java.util.List r0 = r1.A07
            r0.add(r2)
            java.util.List r0 = r2.A08
            r0.add(r1)
            goto L_0x00a0
        L_0x00b2:
            boolean r0 = r11 instanceof X.AnonymousClass27P
            if (r0 == 0) goto L_0x01a1
            X.1s3 r6 = r11.A02
            r0 = r6
            X.27L r0 = (X.AnonymousClass27L) r0
            int r4 = r0.A02
            int r3 = r0.A03
            int r5 = r0.A01
            r1 = -1
            r0 = 1
            X.1s9 r2 = r11.A04
            if (r5 != r0) goto L_0x0139
            if (r4 == r1) goto L_0x0102
            java.util.List r1 = r2.A08
            X.1s3 r0 = r6.A0Z
            X.1s8 r0 = r0.A0c
            X.1s9 r0 = r0.A04
            r1.add(r0)
            X.1s3 r0 = r11.A02
            X.1s3 r0 = r0.A0Z
            X.1s8 r0 = r0.A0c
            X.1s9 r0 = r0.A04
            java.util.List r0 = r0.A07
            r0.add(r2)
        L_0x00e1:
            r2.A00 = r4
        L_0x00e3:
            X.1s3 r0 = r11.A02
            X.1s8 r0 = r0.A0c
            X.1s9 r0 = r0.A04
            java.util.List r1 = r2.A07
            r1.add(r0)
            java.util.List r0 = r0.A08
            r0.add(r2)
            X.1s3 r0 = r11.A02
            X.1s8 r0 = r0.A0c
        L_0x00f7:
            X.1s9 r0 = r0.A03
            r1.add(r0)
            java.util.List r0 = r0.A08
            r0.add(r2)
            return
        L_0x0102:
            if (r3 == r1) goto L_0x011e
            java.util.List r1 = r2.A08
            X.1s3 r0 = r6.A0Z
            X.1s8 r0 = r0.A0c
            X.1s9 r0 = r0.A03
            r1.add(r0)
            X.1s3 r0 = r11.A02
            X.1s3 r0 = r0.A0Z
            X.1s8 r0 = r0.A0c
            X.1s9 r0 = r0.A03
            java.util.List r0 = r0.A07
            r0.add(r2)
            int r4 = -r3
            goto L_0x00e1
        L_0x011e:
            r2.A09 = r0
            java.util.List r1 = r2.A08
            X.1s3 r0 = r6.A0Z
            X.1s8 r0 = r0.A0c
            X.1s9 r0 = r0.A03
            r1.add(r0)
            X.1s3 r0 = r11.A02
            X.1s3 r0 = r0.A0Z
            X.1s8 r0 = r0.A0c
            X.1s9 r0 = r0.A03
            java.util.List r0 = r0.A07
            r0.add(r2)
            goto L_0x00e3
        L_0x0139:
            if (r4 == r1) goto L_0x016a
            java.util.List r1 = r2.A08
            X.1s3 r0 = r6.A0Z
            X.1sB r0 = r0.A0d
            X.1s9 r0 = r0.A04
            r1.add(r0)
            X.1s3 r0 = r11.A02
            X.1s3 r0 = r0.A0Z
            X.1sB r0 = r0.A0d
            X.1s9 r0 = r0.A04
            java.util.List r0 = r0.A07
            r0.add(r2)
        L_0x0153:
            r2.A00 = r4
        L_0x0155:
            X.1s3 r0 = r11.A02
            X.1sB r0 = r0.A0d
            X.1s9 r0 = r0.A04
            java.util.List r1 = r2.A07
            r1.add(r0)
            java.util.List r0 = r0.A08
            r0.add(r2)
            X.1s3 r0 = r11.A02
            X.1sB r0 = r0.A0d
            goto L_0x00f7
        L_0x016a:
            if (r3 == r1) goto L_0x0186
            java.util.List r1 = r2.A08
            X.1s3 r0 = r6.A0Z
            X.1sB r0 = r0.A0d
            X.1s9 r0 = r0.A03
            r1.add(r0)
            X.1s3 r0 = r11.A02
            X.1s3 r0 = r0.A0Z
            X.1sB r0 = r0.A0d
            X.1s9 r0 = r0.A03
            java.util.List r0 = r0.A07
            r0.add(r2)
            int r4 = -r3
            goto L_0x0153
        L_0x0186:
            r2.A09 = r0
            java.util.List r1 = r2.A08
            X.1s3 r0 = r6.A0Z
            X.1sB r0 = r0.A0d
            X.1s9 r0 = r0.A03
            r1.add(r0)
            X.1s3 r0 = r11.A02
            X.1s3 r0 = r0.A0Z
            X.1sB r0 = r0.A0d
            X.1s9 r0 = r0.A03
            java.util.List r0 = r0.A07
            r0.add(r2)
            goto L_0x0155
        L_0x01a1:
            r5 = r11
            X.27R r5 = (X.AnonymousClass27R) r5
            java.util.ArrayList r4 = r5.A01
            java.util.Iterator r1 = r4.iterator()
        L_0x01aa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01ba
            java.lang.Object r0 = r1.next()
            X.1s7 r0 = (X.AnonymousClass1s7) r0
            r0.A0B()
            goto L_0x01aa
        L_0x01ba:
            int r1 = r4.size()
            r9 = 1
            if (r1 < r9) goto L_0x028f
            r10 = 0
            java.lang.Object r0 = r4.get(r10)
            X.1s7 r0 = (X.AnonymousClass1s7) r0
            X.1s3 r2 = r0.A02
            int r1 = r1 - r9
            java.lang.Object r0 = r4.get(r1)
            X.1s7 r0 = (X.AnonymousClass1s7) r0
            X.1s3 r1 = r0.A02
            int r0 = r5.A01
            if (r0 != 0) goto L_0x023d
            X.1sC r0 = r2.A0W
            X.1sC r8 = r1.A0X
            X.1s9 r7 = A01(r0, r10)
            int r6 = r0.A00()
            r3 = 0
        L_0x01e4:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x01fe
            java.lang.Object r0 = r4.get(r3)
            X.1s7 r0 = (X.AnonymousClass1s7) r0
            X.1s3 r2 = r0.A02
            int r1 = r2.A0N
            r0 = 8
            if (r1 == r0) goto L_0x023a
            X.1sC r0 = r2.A0W
            int r6 = r0.A00()
        L_0x01fe:
            if (r7 == 0) goto L_0x0205
            X.1s9 r0 = r5.A04
            A02(r0, r7, r6)
        L_0x0205:
            X.1s9 r6 = A01(r8, r10)
            int r7 = r8.A00()
            int r3 = r4.size()
        L_0x0211:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0229
            java.lang.Object r0 = r4.get(r3)
            X.1s7 r0 = (X.AnonymousClass1s7) r0
            X.1s3 r2 = r0.A02
            int r1 = r2.A0N
            r0 = 8
            if (r1 == r0) goto L_0x0211
            X.1sC r0 = r2.A0X
        L_0x0225:
            int r7 = r0.A00()
        L_0x0229:
            if (r6 == 0) goto L_0x0231
            X.1s9 r1 = r5.A03
            int r0 = -r7
            A02(r1, r6, r0)
        L_0x0231:
            X.1s9 r0 = r5.A04
            r0.A03 = r5
            X.1s9 r0 = r5.A03
            r0.A03 = r5
            return
        L_0x023a:
            int r3 = r3 + 1
            goto L_0x01e4
        L_0x023d:
            X.1sC r0 = r2.A0Y
            X.1sC r8 = r1.A0S
            X.1s9 r7 = A01(r0, r9)
            int r6 = r0.A00()
            r3 = 0
        L_0x024a:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0264
            java.lang.Object r0 = r4.get(r3)
            X.1s7 r0 = (X.AnonymousClass1s7) r0
            X.1s3 r2 = r0.A02
            int r1 = r2.A0N
            r0 = 8
            if (r1 == r0) goto L_0x028c
            X.1sC r0 = r2.A0Y
            int r6 = r0.A00()
        L_0x0264:
            if (r7 == 0) goto L_0x026b
            X.1s9 r0 = r5.A04
            A02(r0, r7, r6)
        L_0x026b:
            X.1s9 r6 = A01(r8, r9)
            int r7 = r8.A00()
            int r3 = r4.size()
        L_0x0277:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0229
            java.lang.Object r0 = r4.get(r3)
            X.1s7 r0 = (X.AnonymousClass1s7) r0
            X.1s3 r2 = r0.A02
            int r1 = r2.A0N
            r0 = 8
            if (r1 == r0) goto L_0x0277
            X.1sC r0 = r2.A0S
            goto L_0x0225
        L_0x028c:
            int r3 = r3 + 1
            goto L_0x024a
        L_0x028f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1s7.A0B():void");
    }

    public void CQN() {
        float f;
        float f2;
        float f3;
        if (this instanceof C38911sB) {
            int intValue = this.A08.intValue();
            if (intValue == 1 || intValue == 2 || intValue != 3) {
                C38901sA r5 = this.A05;
                if (r5.A0A && !r5.A0B && this.A07 == AnonymousClass00R.A0C) {
                    C38871s3 r6 = this.A02;
                    int i = r6.A0C;
                    if (i == 2) {
                        C38871s3 r0 = r6.A0Z;
                        if (r0 != null) {
                            C38901sA r1 = r0.A0d.A05;
                            if (r1.A0B) {
                                f = r6.A03;
                                f2 = (float) r1.A02;
                            }
                        }
                    } else if (i == 3) {
                        C38901sA r2 = r6.A0c.A05;
                        if (r2.A0B) {
                            int i2 = r6.A08;
                            if (i2 == -1 || i2 != 0) {
                                f3 = ((float) r2.A02) / r6.A01;
                                r5.A01((int) (f3 + 0.5f));
                            } else {
                                f2 = (float) r2.A02;
                                f = r6.A01;
                            }
                        }
                    }
                    f3 = f2 * f;
                    r5.A01((int) (f3 + 0.5f));
                }
                AnonymousClass1s9 r7 = this.A04;
                if (r7.A0A) {
                    AnonymousClass1s9 r62 = this.A03;
                    if (!r62.A0A) {
                        return;
                    }
                    if (!r7.A0B || !r62.A0B || !r5.A0B) {
                        if (!r5.A0B && this.A07 == AnonymousClass00R.A0C) {
                            C38871s3 r12 = this.A02;
                            if (r12.A0D == 0 && !r12.A0H()) {
                                int i3 = ((AnonymousClass1s9) r7.A08.get(0)).A02 + r7.A00;
                                int i4 = ((AnonymousClass1s9) r62.A08.get(0)).A02 + r62.A00;
                                r7.A01(i3);
                                r62.A01(i4);
                                r5.A01(i4 - i3);
                                return;
                            } else if (this.A00 == 1) {
                                List list = r7.A08;
                                if (list.size() > 0) {
                                    List list2 = r62.A08;
                                    if (list2.size() > 0) {
                                        int i5 = (((AnonymousClass1s9) list2.get(0)).A02 + r62.A00) - (((AnonymousClass1s9) list.get(0)).A02 + r7.A00);
                                        int i6 = r5.A00;
                                        if (i5 < i6) {
                                            r5.A01(i5);
                                        } else {
                                            r5.A01(i6);
                                        }
                                    }
                                }
                            }
                        }
                        if (r5.A0B) {
                            List list3 = r7.A08;
                            if (list3.size() > 0) {
                                List list4 = r62.A08;
                                if (list4.size() > 0) {
                                    AnonymousClass1s9 r10 = (AnonymousClass1s9) list3.get(0);
                                    AnonymousClass1s9 r9 = (AnonymousClass1s9) list4.get(0);
                                    int i7 = r10.A02;
                                    int i8 = i7 + r7.A00;
                                    int i9 = r9.A02;
                                    int i10 = i9 + r62.A00;
                                    float f4 = this.A02.A06;
                                    if (r10 == r9) {
                                        i8 = i7;
                                        i10 = i9;
                                        f4 = 0.5f;
                                    }
                                    r7.A01((int) (((float) i8) + 0.5f + (((float) ((i10 - i8) - r5.A02)) * f4)));
                                    r62.A01(r7.A02 + r5.A02);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C38871s3 r02 = this.A02;
            A08(r02.A0Y, r02.A0S, 1);
        } else if (this instanceof AnonymousClass27Q) {
            AnonymousClass27M r72 = (AnonymousClass27M) this.A02;
            int i11 = r72.A00;
            AnonymousClass1s9 r52 = this.A04;
            int i12 = 0;
            int i13 = -1;
            for (AnonymousClass1s9 r03 : r52.A08) {
                int i14 = r03.A02;
                if (i13 == -1 || i14 < i13) {
                    i13 = i14;
                }
                if (i12 < i14) {
                    i12 = i14;
                }
            }
            if (i11 == 0 || i11 == 2) {
                r52.A01(i13 + r72.A01);
            } else {
                r52.A01(i12 + r72.A01);
            }
        } else {
            AnonymousClass1s9 r3 = this.A04;
            if (r3.A0A && !r3.A0B) {
                r3.A01((int) ((((float) ((AnonymousClass1s9) r3.A08.get(0)).A02) * ((AnonymousClass27L) this.A02).A00) + 0.5f));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1sA, X.1s9] */
    public AnonymousClass1s7(C38871s3 r3) {
        Integer num;
        ? r1 = new AnonymousClass1s9(this);
        if (this instanceof AnonymousClass1s8) {
            num = AnonymousClass00R.A01;
        } else {
            num = AnonymousClass00R.A0C;
        }
        r1.A06 = num;
        this.A05 = r1;
        this.A01 = 0;
        this.A09 = false;
        this.A04 = new AnonymousClass1s9(this);
        this.A03 = new AnonymousClass1s9(this);
        this.A08 = AnonymousClass00R.A00;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r1.A00 == 3) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C38921sC r16, X.C38921sC r17, int r18) {
        /*
            r15 = this;
            X.1s9 r8 = A00(r16)
            X.1s9 r7 = A00(r17)
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x0066
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0066
            int r6 = r8.A02
            int r0 = r16.A00()
            int r6 = r6 + r0
            int r5 = r7.A02
            int r0 = r17.A00()
            int r5 = r5 - r0
            int r9 = r5 - r6
            X.1sA r4 = r15.A05
            boolean r0 = r4.A0B
            r3 = r18
            if (r0 != 0) goto L_0x0054
            java.lang.Integer r0 = r15.A07
            java.lang.Integer r13 = X.AnonymousClass00R.A0C
            if (r0 != r13) goto L_0x0054
            r0 = r9
            int r1 = r15.A00
            if (r1 == 0) goto L_0x00c2
            r10 = 1
            if (r1 == r10) goto L_0x00cd
            r0 = 2
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r1 == r0) goto L_0x00a8
            r12 = 3
            if (r1 != r12) goto L_0x0054
            X.1s3 r11 = r15.A02
            X.1s8 r2 = r11.A0c
            java.lang.Integer r0 = r2.A07
            if (r0 != r13) goto L_0x008f
            int r0 = r2.A00
            if (r0 != r12) goto L_0x008f
            X.1sB r1 = r11.A0d
            java.lang.Integer r0 = r1.A07
            if (r0 != r13) goto L_0x008f
            int r0 = r1.A00
            if (r0 != r12) goto L_0x008f
        L_0x0054:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0066
            int r1 = r4.A02
            if (r1 != r9) goto L_0x0067
            X.1s9 r0 = r15.A04
            r0.A01(r6)
            X.1s9 r1 = r15.A03
        L_0x0063:
            r1.A01(r5)
        L_0x0066:
            return
        L_0x0067:
            X.1s3 r0 = r15.A02
            if (r18 != 0) goto L_0x008c
            float r3 = r0.A02
        L_0x006d:
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r8 != r7) goto L_0x0077
            int r6 = r8.A02
            int r5 = r7.A02
            r3 = 1056964608(0x3f000000, float:0.5)
        L_0x0077:
            int r5 = r5 - r6
            int r5 = r5 - r1
            X.1s9 r2 = r15.A04
            float r1 = (float) r6
            float r1 = r1 + r0
            float r0 = (float) r5
            float r0 = r0 * r3
            float r1 = r1 + r0
            int r0 = (int) r1
            r2.A01(r0)
            X.1s9 r1 = r15.A03
            int r5 = r2.A02
            int r0 = r4.A02
            int r5 = r5 + r0
            goto L_0x0063
        L_0x008c:
            float r3 = r0.A06
            goto L_0x006d
        L_0x008f:
            if (r18 != 0) goto L_0x0093
            X.1sB r2 = r11.A0d
        L_0x0093:
            X.1sA r2 = r2.A05
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0054
            float r1 = r11.A01
            int r0 = r2.A02
            float r0 = (float) r0
            if (r3 != r10) goto L_0x00a4
            float r0 = r0 / r1
            float r0 = r0 + r14
            int r0 = (int) r0
            goto L_0x00d7
        L_0x00a4:
            float r1 = r1 * r0
            float r1 = r1 + r14
            int r0 = (int) r1
            goto L_0x00d7
        L_0x00a8:
            X.1s3 r1 = r15.A02
            X.1s3 r0 = r1.A0Z
            if (r0 == 0) goto L_0x0054
            if (r18 != 0) goto L_0x00ca
            X.1s8 r0 = r0.A0c
        L_0x00b2:
            X.1sA r2 = r0.A05
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0054
            if (r18 != 0) goto L_0x00c7
            float r1 = r1.A04
        L_0x00bc:
            int r0 = r2.A02
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r14
            int r0 = (int) r0
        L_0x00c2:
            int r0 = r15.A04(r0, r3)
            goto L_0x00d7
        L_0x00c7:
            float r1 = r1.A03
            goto L_0x00bc
        L_0x00ca:
            X.1sB r0 = r0.A0d
            goto L_0x00b2
        L_0x00cd:
            int r0 = r4.A00
            int r0 = r15.A04(r0, r3)
            int r0 = java.lang.Math.min(r0, r9)
        L_0x00d7:
            r4.A01(r0)
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1s7.A08(X.1sC, X.1sC, int):void");
    }
}
