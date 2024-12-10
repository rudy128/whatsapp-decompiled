package androidx.constraintlayout.helper.widget;

import X.AnonymousClass27S;
import X.BJO;
import X.C38871s3;
import X.C39121sW;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class Flow extends AnonymousClass27S {
    public BJO A00;

    public void A07(C38871s3 r4, boolean z) {
        BJO bjo = this.A00;
        int i = bjo.A04;
        if (i <= 0 && bjo.A03 <= 0) {
            return;
        }
        if (z) {
            bjo.A06 = bjo.A03;
            bjo.A07 = i;
            return;
        }
        bjo.A06 = i;
        bjo.A07 = bjo.A03;
    }

    public void onMeasure(int i, int i2) {
        A09(this.A00, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.A00.A00 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.A00.A07 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.A00.A01 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.A00.A08 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.A00.A09 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.A00.A02 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.A00.A0A = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.A00.A0B = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.A00.A0E = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.A00.A0F = i;
        requestLayout();
    }

    public void setPadding(int i) {
        BJO bjo = this.A00;
        bjo.A05 = i;
        bjo.A02 = i;
        bjo.A04 = i;
        bjo.A03 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.A00.A02 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.A00.A06 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.A00.A07 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.A00.A05 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.A00.A0G = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.A00.A05 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.A00.A0H = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.A00.A0I = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.A00.A0J = i;
        requestLayout();
    }

    public void A06(AttributeSet attributeSet) {
        BJO bjo;
        int dimensionPixelSize;
        BJO bjo2;
        int dimensionPixelSize2;
        super.A06(attributeSet);
        this.A00 = new BJO();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39121sW.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.A00.A0F = obtainStyledAttributes.getInt(index, 0);
                } else {
                    if (index == 1) {
                        bjo2 = this.A00;
                        dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        bjo2.A05 = dimensionPixelSize2;
                        bjo2.A02 = dimensionPixelSize2;
                        bjo2.A04 = dimensionPixelSize2;
                    } else {
                        if (index == 11) {
                            bjo = this.A00;
                            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                            bjo.A04 = dimensionPixelSize;
                            bjo.A06 = dimensionPixelSize;
                        } else if (index == 12) {
                            bjo2 = this.A00;
                            dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 2) {
                            this.A00.A06 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 3) {
                            this.A00.A05 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 4) {
                            bjo = this.A00;
                            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 5) {
                            this.A00.A02 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 37) {
                            this.A00.A0J = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 27) {
                            this.A00.A0B = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 36) {
                            this.A00.A0I = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 21) {
                            this.A00.A07 = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 29) {
                            this.A00.A0C = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 23) {
                            this.A00.A08 = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 31) {
                            this.A00.A0D = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 25) {
                            this.A00.A02 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 20) {
                            this.A00.A00 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 28) {
                            this.A00.A03 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 22) {
                            this.A00.A01 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 30) {
                            this.A00.A04 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 34) {
                            this.A00.A05 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 24) {
                            this.A00.A09 = obtainStyledAttributes.getInt(index, 2);
                        } else if (index == 33) {
                            this.A00.A0G = obtainStyledAttributes.getInt(index, 2);
                        } else if (index == 26) {
                            this.A00.A0A = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 35) {
                            this.A00.A0H = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 32) {
                            this.A00.A0E = obtainStyledAttributes.getInt(index, -1);
                        }
                        bjo.A07 = dimensionPixelSize;
                    }
                    bjo2.A03 = dimensionPixelSize2;
                }
            }
        }
        this.A02 = this.A00;
        A04();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v2, types: [int] */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x026b, code lost:
        if (r0 == r1) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r0 == r4) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04dc, code lost:
        if (r5 == 0) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04e7, code lost:
        if (r5 == 0) goto L_0x04e9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0525  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x053e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0585  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x058b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x042e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x050b A[EDGE_INSN: B:369:0x050b->B:270:0x050b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.BJP r50, int r51, int r52) {
        /*
            r49 = this;
            int r20 = android.view.View.MeasureSpec.getMode(r51)
            int r19 = android.view.View.MeasureSpec.getSize(r51)
            int r18 = android.view.View.MeasureSpec.getMode(r52)
            int r17 = android.view.View.MeasureSpec.getSize(r52)
            r48 = r49
            r16 = r50
            if (r50 == 0) goto L_0x05ae
            r8 = r16
            X.BJO r8 = (X.BJO) r8
            int r4 = r8.A00
            r7 = 0
            if (r4 <= 0) goto L_0x0082
            X.1s3 r0 = r8.A0Z
            if (r0 == 0) goto L_0x059c
            X.1s5 r0 = (X.C38891s5) r0
            X.1sU r2 = r0.A05
            if (r2 == 0) goto L_0x059c
            r1 = 0
        L_0x002a:
            int r4 = r8.A00
            r6 = 1
            if (r1 >= r4) goto L_0x0082
            X.1s3[] r0 = r8.A01
            r3 = r0[r1]
            if (r3 == 0) goto L_0x004d
            boolean r0 = r3 instanceof X.AnonymousClass27L
            if (r0 != 0) goto L_0x004d
            java.lang.Integer[] r4 = r3.A0q
            r0 = r4[r7]
            r5 = r4[r6]
            java.lang.Integer r4 = X.AnonymousClass00R.A0C
            if (r0 != r4) goto L_0x0050
            int r0 = r3.A0D
            if (r0 == r6) goto L_0x0052
            if (r5 != r4) goto L_0x0052
            int r0 = r3.A0C
            if (r0 == r6) goto L_0x0052
        L_0x004d:
            int r1 = r1 + 1
            goto L_0x002a
        L_0x0050:
            if (r0 != r4) goto L_0x0054
        L_0x0052:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
        L_0x0054:
            if (r5 != r4) goto L_0x0058
            java.lang.Integer r5 = X.AnonymousClass00R.A01
        L_0x0058:
            X.1sE r4 = r8.A08
            r4.A05 = r0
            r4.A06 = r5
            int r0 = r3.A03()
            r4.A00 = r0
            int r0 = r3.A02()
            r4.A04 = r0
            r2.BjX(r3, r4)
            int r0 = r4.A03
            r3.A0A(r0)
            int r0 = r4.A02
            r3.A09(r0)
            int r0 = r4.A01
            r3.A07 = r0
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r3.A0h = r0
            goto L_0x004d
        L_0x0082:
            int r0 = r8.A06
            r22 = r0
            int r0 = r8.A07
            r23 = r0
            int r0 = r8.A05
            r21 = r0
            int r0 = r8.A02
            r24 = r0
            int[] r25 = X.C108945cZ.A1W()
            int r6 = r19 - r22
            int r6 = r6 - r23
            int r5 = r8.A0F
            r0 = 1
            if (r5 != r0) goto L_0x00a3
            int r6 = r17 - r21
            int r6 = r6 - r24
        L_0x00a3:
            r1 = -1
            int r0 = r8.A0B
            if (r0 != r1) goto L_0x00aa
            r8.A0B = r7
        L_0x00aa:
            int r0 = r8.A0I
            if (r0 != r1) goto L_0x00b0
            r8.A0I = r7
        L_0x00b0:
            X.1s3[] r10 = r8.A01
            r11 = r10
            r2 = 0
        L_0x00b4:
            if (r2 >= r4) goto L_0x00c3
            r0 = r10[r2]
            int r1 = r0.A0N
            r0 = 8
            if (r1 != r0) goto L_0x00c0
            int r7 = r7 + 1
        L_0x00c0:
            int r2 = r2 + 1
            goto L_0x00b4
        L_0x00c3:
            r9 = r4
            if (r7 <= 0) goto L_0x00dd
            int r0 = r4 - r7
            X.1s3[] r10 = new X.C38871s3[r0]
            r3 = 0
            r9 = 0
        L_0x00cc:
            if (r3 >= r4) goto L_0x00dd
            r2 = r11[r3]
            int r1 = r2.A0N
            r0 = 8
            if (r1 == r0) goto L_0x00da
            r10[r9] = r2
            int r9 = r9 + 1
        L_0x00da:
            int r3 = r3 + 1
            goto L_0x00cc
        L_0x00dd:
            r8.A0O = r10
            r8.A06 = r9
            int r0 = r8.A0J
            if (r0 == 0) goto L_0x0442
            r4 = 1
            if (r0 == r4) goto L_0x0175
            r4 = 2
            if (r0 == r4) goto L_0x0134
            r0 = 0
            r7 = 1
        L_0x00ed:
            r2 = r25[r0]
            int r2 = r2 + r22
            int r2 = r2 + r23
            r1 = r25[r7]
            int r1 = r1 + r21
            int r1 = r1 + r24
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r0 = r20
            if (r0 != r3) goto L_0x0127
            r2 = r19
        L_0x0103:
            r0 = r18
            if (r0 != r3) goto L_0x011a
            r1 = r17
        L_0x0109:
            r8.A01 = r2
            r8.A00 = r1
            r8.A0A(r2)
            r8.A09(r1)
            int r0 = r8.A00
            if (r0 > 0) goto L_0x05a0
            r7 = 0
            goto L_0x05a0
        L_0x011a:
            if (r0 != r4) goto L_0x0123
            r0 = r17
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x0109
        L_0x0123:
            if (r18 == 0) goto L_0x0109
            r1 = 0
            goto L_0x0109
        L_0x0127:
            if (r0 != r4) goto L_0x0130
            r0 = r19
            int r2 = java.lang.Math.min(r2, r0)
            goto L_0x0103
        L_0x0130:
            if (r20 == 0) goto L_0x0103
            r2 = 0
            goto L_0x0103
        L_0x0134:
            r7 = 1
            r14 = 0
            int r2 = r8.A0E
            if (r5 != 0) goto L_0x0156
            if (r2 > 0) goto L_0x04cc
            r2 = 0
            r3 = 0
            r1 = 0
        L_0x013f:
            if (r3 >= r9) goto L_0x04cc
            if (r3 <= 0) goto L_0x0146
            int r0 = r8.A0A
            int r1 = r1 + r0
        L_0x0146:
            r0 = r10[r3]
            if (r0 == 0) goto L_0x0153
            int r0 = X.BJO.A01(r0, r8, r6)
            int r1 = r1 + r0
            if (r1 > r6) goto L_0x04cc
            int r2 = r2 + 1
        L_0x0153:
            int r3 = r3 + 1
            goto L_0x013f
        L_0x0156:
            if (r2 > 0) goto L_0x0172
            r2 = 0
            r1 = 0
            r3 = 0
        L_0x015b:
            if (r1 >= r9) goto L_0x0172
            if (r1 <= 0) goto L_0x0162
            int r0 = r8.A0H
            int r3 = r3 + r0
        L_0x0162:
            r0 = r10[r1]
            if (r0 == 0) goto L_0x016f
            int r0 = X.BJO.A00(r0, r8, r6)
            int r3 = r3 + r0
            if (r3 > r6) goto L_0x0172
            int r2 = r2 + 1
        L_0x016f:
            int r1 = r1 + 1
            goto L_0x015b
        L_0x0172:
            r3 = 0
            goto L_0x04ce
        L_0x0175:
            r7 = 1
            if (r9 == 0) goto L_0x04e4
            java.util.ArrayList r3 = r8.A0K
            r3.clear()
            X.1sC r0 = r8.A0W
            r47 = r0
            X.1sC r0 = r8.A0Y
            r46 = r0
            X.1sC r0 = r8.A0X
            r45 = r0
            X.1sC r0 = r8.A0S
            r44 = r0
            X.CZP r13 = new X.CZP
            r26 = r13
            r27 = r47
            r28 = r46
            r29 = r45
            r30 = r0
            r31 = r8
            r32 = r5
            r33 = r6
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r3.add(r13)
            r2 = 0
            r26 = 0
            r12 = 0
            r11 = 0
            if (r5 != 0) goto L_0x01fb
        L_0x01ac:
            if (r11 >= r9) goto L_0x024a
            r1 = r10[r11]
            int r15 = X.BJO.A01(r1, r8, r6)
            java.lang.Integer[] r0 = r1.A0q
            r14 = r0[r2]
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r14 != r0) goto L_0x01be
            int r26 = r26 + 1
        L_0x01be:
            if (r12 == r6) goto L_0x01c6
            int r0 = r8.A0A
            int r0 = r0 + r12
            int r0 = r0 + r15
            if (r0 <= r6) goto L_0x01eb
        L_0x01c6:
            X.1s3 r0 = r13.A0G
            if (r0 == 0) goto L_0x01eb
        L_0x01ca:
            X.CZP r13 = new X.CZP
            r27 = r13
            r28 = r47
            r29 = r46
            r30 = r45
            r31 = r44
            r32 = r8
            r33 = r2
            r34 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            r13.A0A = r11
            r3.add(r13)
        L_0x01e4:
            r12 = r15
        L_0x01e5:
            r13.A01(r1)
            int r11 = r11 + 1
            goto L_0x01ac
        L_0x01eb:
            if (r11 <= 0) goto L_0x01e4
            int r0 = r8.A0E
            if (r0 <= 0) goto L_0x01f6
            int r0 = r11 % r0
            if (r0 != 0) goto L_0x01f6
            goto L_0x01ca
        L_0x01f6:
            int r0 = r8.A0A
            int r0 = r0 + r15
            int r12 = r12 + r0
            goto L_0x01e5
        L_0x01fb:
            if (r11 >= r9) goto L_0x024a
            r1 = r10[r11]
            int r15 = X.BJO.A00(r1, r8, r6)
            java.lang.Integer[] r0 = r1.A0q
            r14 = r0[r4]
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r14 != r0) goto L_0x020d
            int r26 = r26 + 1
        L_0x020d:
            if (r12 == r6) goto L_0x0215
            int r0 = r8.A0H
            int r0 = r0 + r12
            int r0 = r0 + r15
            if (r0 <= r6) goto L_0x023a
        L_0x0215:
            X.1s3 r0 = r13.A0G
            if (r0 == 0) goto L_0x023a
        L_0x0219:
            X.CZP r13 = new X.CZP
            r27 = r13
            r28 = r47
            r29 = r46
            r30 = r45
            r31 = r44
            r32 = r8
            r33 = r5
            r34 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)
            r13.A0A = r11
            r3.add(r13)
        L_0x0233:
            r12 = r15
        L_0x0234:
            r13.A01(r1)
            int r11 = r11 + 1
            goto L_0x01fb
        L_0x023a:
            if (r11 <= 0) goto L_0x0233
            int r0 = r8.A0E
            if (r0 <= 0) goto L_0x0245
            int r0 = r11 % r0
            if (r0 != 0) goto L_0x0245
            goto L_0x0219
        L_0x0245:
            int r0 = r8.A0H
            int r0 = r0 + r15
            int r12 = r12 + r0
            goto L_0x0234
        L_0x024a:
            int r30 = r3.size()
            r43 = r45
            r42 = r44
            int r0 = r8.A06
            r29 = r0
            int r0 = r8.A05
            r28 = r0
            int r0 = r8.A07
            r27 = r0
            int r11 = r8.A02
            java.lang.Integer[] r9 = r8.A0q
            r0 = r9[r2]
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            if (r0 == r1) goto L_0x026d
            r0 = r9[r4]
            r9 = 0
            if (r0 != r1) goto L_0x026e
        L_0x026d:
            r9 = 1
        L_0x026e:
            if (r26 <= 0) goto L_0x0273
            r10 = 0
            if (r9 != 0) goto L_0x0333
        L_0x0273:
            r12 = 0
            r10 = 0
            r9 = 0
        L_0x0276:
            r0 = r30
            if (r9 >= r0) goto L_0x043c
            java.lang.Object r1 = r3.get(r9)
            X.CZP r1 = (X.CZP) r1
            int r0 = r30 + -1
            if (r5 != 0) goto L_0x02da
            if (r9 >= r0) goto L_0x02d5
            int r0 = r9 + 1
            java.lang.Object r0 = r3.get(r0)
            X.CZP r0 = (X.CZP) r0
            X.1s3 r0 = r0.A0G
            X.1sC r0 = r0.A0Y
            r42 = r0
            r11 = 0
        L_0x0295:
            X.1s3 r0 = r1.A0G
            X.1sC r13 = r0.A0S
            r1.A05 = r2
            r0 = r47
            r1.A0D = r0
            r0 = r46
            r1.A0F = r0
            r0 = r43
            r1.A0E = r0
            r0 = r42
            r1.A0C = r0
            r0 = r29
            r1.A07 = r0
            r0 = r28
            r1.A09 = r0
            r0 = r27
            r1.A08 = r0
            r1.A06 = r11
            r1.A03 = r6
            int r14 = r1.A0B
            X.BJO r0 = r1.A0H
            int r0 = r0.A0A
            int r14 = r14 - r0
            int r10 = java.lang.Math.max(r10, r14)
            int r0 = r1.A02
            int r12 = r12 + r0
            if (r9 <= 0) goto L_0x02ce
            int r0 = r8.A0H
            int r12 = r12 + r0
        L_0x02ce:
            r46 = r13
            r28 = 0
        L_0x02d2:
            int r9 = r9 + 1
            goto L_0x0276
        L_0x02d5:
            r42 = r44
            int r11 = r8.A02
            goto L_0x0295
        L_0x02da:
            if (r9 >= r0) goto L_0x032c
            int r0 = r9 + 1
            java.lang.Object r0 = r3.get(r0)
            X.CZP r0 = (X.CZP) r0
            X.1s3 r0 = r0.A0G
            X.1sC r0 = r0.A0W
            r43 = r0
            r27 = 0
        L_0x02ec:
            X.1s3 r0 = r1.A0G
            X.1sC r13 = r0.A0X
            r1.A05 = r5
            r0 = r47
            r1.A0D = r0
            r0 = r46
            r1.A0F = r0
            r0 = r43
            r1.A0E = r0
            r0 = r42
            r1.A0C = r0
            r0 = r29
            r1.A07 = r0
            r0 = r28
            r1.A09 = r0
            r0 = r27
            r1.A08 = r0
            r1.A06 = r11
            r1.A03 = r6
            int r0 = r1.A0B
            int r10 = r10 + r0
            int r14 = r1.A02
            if (r5 != r4) goto L_0x031e
            X.BJO r0 = r1.A0H
            int r0 = r0.A0H
            int r14 = r14 - r0
        L_0x031e:
            int r12 = java.lang.Math.max(r12, r14)
            if (r9 <= 0) goto L_0x0327
            int r0 = r8.A0A
            int r10 = r10 + r0
        L_0x0327:
            r47 = r13
            r29 = 0
            goto L_0x02d2
        L_0x032c:
            int r0 = r8.A07
            r27 = r0
            r43 = r45
            goto L_0x02ec
        L_0x0333:
            r0 = r30
            if (r10 >= r0) goto L_0x0273
            java.lang.Object r1 = r3.get(r10)
            X.CZP r1 = (X.CZP) r1
            int r0 = r1.A05
            if (r5 != 0) goto L_0x0432
            int r9 = r1.A0B
            if (r0 != 0) goto L_0x034a
            X.BJO r0 = r1.A0H
            int r0 = r0.A0A
        L_0x0349:
            int r9 = r9 - r0
        L_0x034a:
            int r35 = r6 - r9
            int r9 = r1.A04
            if (r9 == 0) goto L_0x042e
            int r0 = r1.A01
            r15 = r0
            int r35 = r35 / r9
            r9 = 0
        L_0x0356:
            if (r9 >= r15) goto L_0x03af
            int r13 = r1.A0A
            int r14 = r13 + r9
            X.BJO r12 = r1.A0H
            int r0 = r12.A06
            if (r14 >= r0) goto L_0x03af
            X.1s3[] r0 = r12.A0O
            int r13 = r13 + r9
            r0 = r0[r13]
            int r13 = r1.A05
            if (r13 != 0) goto L_0x038d
            if (r0 == 0) goto L_0x038a
            java.lang.Integer[] r13 = r0.A0q
            r14 = r13[r2]
            java.lang.Integer r13 = X.AnonymousClass00R.A0C
            if (r14 != r13) goto L_0x038a
            int r13 = r0.A0D
            if (r13 != 0) goto L_0x038a
            java.lang.Integer r33 = X.AnonymousClass00R.A00
            java.lang.Integer[] r13 = r0.A0q
            r34 = r13[r4]
            int r36 = r0.A02()
            r31 = r12
            r32 = r0
            r31.A0J(r32, r33, r34, r35, r36)
        L_0x038a:
            int r9 = r9 + 1
            goto L_0x0356
        L_0x038d:
            if (r0 == 0) goto L_0x038a
            java.lang.Integer[] r13 = r0.A0q
            r14 = r13[r4]
            java.lang.Integer r13 = X.AnonymousClass00R.A0C
            if (r14 != r13) goto L_0x038a
            int r13 = r0.A0C
            if (r13 != 0) goto L_0x038a
            java.lang.Integer[] r13 = r0.A0q
            r38 = r13[r2]
            int r40 = r0.A03()
            java.lang.Integer r39 = X.AnonymousClass00R.A00
            r36 = r12
            r37 = r0
            r41 = r35
            r36.A0J(r37, r38, r39, r40, r41)
            goto L_0x038a
        L_0x03af:
            r1.A0B = r2
            r1.A02 = r2
            r0 = 0
            r1.A0G = r0
            r1.A00 = r2
            int r0 = r1.A01
            r31 = r0
            r14 = 0
        L_0x03bd:
            r0 = r31
            if (r14 >= r0) goto L_0x042e
            int r13 = r1.A0A
            int r9 = r13 + r14
            X.BJO r12 = r1.A0H
            int r0 = r12.A06
            if (r9 >= r0) goto L_0x042e
            X.1s3[] r0 = r12.A0O
            int r13 = r13 + r14
            r13 = r0[r13]
            int r0 = r1.A05
            if (r0 != 0) goto L_0x0401
            int r26 = r13.A03()
            int r15 = r12.A0A
            int r0 = r13.A0N
            r9 = r0
            r0 = 8
            if (r9 != r0) goto L_0x03e2
            r15 = 0
        L_0x03e2:
            int r0 = r1.A0B
            int r26 = r26 + r15
            int r0 = r0 + r26
            r1.A0B = r0
            int r0 = r1.A03
            int r9 = X.BJO.A00(r13, r12, r0)
            X.1s3 r0 = r1.A0G
            if (r0 == 0) goto L_0x03f8
            int r0 = r1.A00
            if (r0 >= r9) goto L_0x03fe
        L_0x03f8:
            r1.A0G = r13
            r1.A00 = r9
            r1.A02 = r9
        L_0x03fe:
            int r14 = r14 + 1
            goto L_0x03bd
        L_0x0401:
            int r0 = r1.A03
            int r15 = X.BJO.A01(r13, r12, r0)
            int r0 = r1.A03
            int r26 = X.BJO.A00(r13, r12, r0)
            int r12 = r12.A0H
            int r0 = r13.A0N
            r9 = r0
            r0 = 8
            if (r9 != r0) goto L_0x0417
            r12 = 0
        L_0x0417:
            int r0 = r1.A02
            int r26 = r26 + r12
            int r0 = r0 + r26
            r1.A02 = r0
            X.1s3 r0 = r1.A0G
            if (r0 == 0) goto L_0x0427
            int r0 = r1.A00
            if (r0 >= r15) goto L_0x03fe
        L_0x0427:
            r1.A0G = r13
            r1.A00 = r15
            r1.A0B = r15
            goto L_0x03fe
        L_0x042e:
            int r10 = r10 + 1
            goto L_0x0333
        L_0x0432:
            int r9 = r1.A02
            if (r0 != r4) goto L_0x034a
            X.BJO r0 = r1.A0H
            int r0 = r0.A0H
            goto L_0x0349
        L_0x043c:
            r25[r2] = r10
            r25[r4] = r12
            goto L_0x04e4
        L_0x0442:
            r7 = 1
            if (r9 == 0) goto L_0x04e4
            java.util.ArrayList r12 = r8.A0K
            int r0 = r12.size()
            r11 = 0
            if (r0 != 0) goto L_0x0479
            X.1sC r3 = r8.A0W
            X.1sC r2 = r8.A0Y
            X.1sC r1 = r8.A0X
            X.1sC r0 = r8.A0S
            X.CZP r4 = new X.CZP
            r26 = r4
            r27 = r3
            r28 = r2
            r29 = r1
            r30 = r0
            r31 = r8
            r32 = r5
            r33 = r6
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r12.add(r4)
        L_0x046e:
            r1 = 0
        L_0x046f:
            if (r1 >= r9) goto L_0x04b3
            r0 = r10[r1]
            r4.A01(r0)
            int r1 = r1 + 1
            goto L_0x046f
        L_0x0479:
            java.lang.Object r4 = r12.get(r11)
            X.CZP r4 = (X.CZP) r4
            r4.A00 = r11
            r0 = 0
            r4.A0G = r0
            r4.A0B = r11
            r4.A02 = r11
            r4.A0A = r11
            r4.A01 = r11
            r4.A04 = r11
            X.1sC r15 = r8.A0W
            X.1sC r14 = r8.A0Y
            X.1sC r13 = r8.A0X
            X.1sC r12 = r8.A0S
            int r3 = r8.A06
            int r2 = r8.A05
            int r1 = r8.A07
            int r0 = r8.A02
            r4.A05 = r5
            r4.A0D = r15
            r4.A0F = r14
            r4.A0E = r13
            r4.A0C = r12
            r4.A07 = r3
            r4.A09 = r2
            r4.A08 = r1
            r4.A06 = r0
            r4.A03 = r6
            goto L_0x046e
        L_0x04b3:
            int r2 = r4.A05
            int r1 = r4.A0B
            if (r2 != 0) goto L_0x04be
            X.BJO r0 = r4.A0H
            int r0 = r0.A0A
            int r1 = r1 - r0
        L_0x04be:
            r25[r11] = r1
            int r1 = r4.A02
            if (r2 != r7) goto L_0x04c9
            X.BJO r0 = r4.A0H
            int r0 = r0.A0H
            int r1 = r1 - r0
        L_0x04c9:
            r25[r7] = r1
            goto L_0x04e4
        L_0x04cc:
            r3 = r2
            r2 = 0
        L_0x04ce:
            int[] r0 = r8.A0L
            if (r0 != 0) goto L_0x04d6
            int[] r0 = new int[r4]
            r8.A0L = r0
        L_0x04d6:
            if (r2 != 0) goto L_0x04da
            if (r5 == r7) goto L_0x04de
        L_0x04da:
            if (r3 != 0) goto L_0x04e7
            if (r5 != 0) goto L_0x0591
        L_0x04de:
            int[] r0 = r8.A0L
            r0[r14] = r3
            r0[r7] = r2
        L_0x04e4:
            r0 = 0
            goto L_0x00ed
        L_0x04e7:
            if (r5 != 0) goto L_0x0591
        L_0x04e9:
            float r1 = (float) r9
            float r0 = (float) r3
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r2 = (int) r0
        L_0x04f2:
            X.1s3[] r1 = r8.A0M
            r4 = 0
            if (r1 == 0) goto L_0x0585
            int r0 = r1.length
            if (r0 < r3) goto L_0x0585
            java.util.Arrays.fill(r1, r4)
        L_0x04fd:
            X.1s3[] r1 = r8.A0N
            if (r1 == 0) goto L_0x0580
            int r0 = r1.length
            if (r0 < r2) goto L_0x0580
            java.util.Arrays.fill(r1, r4)
        L_0x0507:
            r13 = 0
        L_0x0508:
            r12 = 0
            if (r13 < r3) goto L_0x0545
            r4 = 0
        L_0x050c:
            if (r4 >= r3) goto L_0x0521
            X.1s3[] r0 = r8.A0M
            r1 = r0[r4]
            if (r1 == 0) goto L_0x051e
            if (r4 <= 0) goto L_0x0519
            int r0 = r8.A0A
            int r12 = r12 + r0
        L_0x0519:
            int r0 = X.BJO.A01(r1, r8, r6)
            int r12 = r12 + r0
        L_0x051e:
            int r4 = r4 + 1
            goto L_0x050c
        L_0x0521:
            r11 = 0
            r4 = 0
        L_0x0523:
            if (r11 >= r2) goto L_0x0538
            X.1s3[] r0 = r8.A0N
            r1 = r0[r11]
            if (r1 == 0) goto L_0x0535
            if (r11 <= 0) goto L_0x0530
            int r0 = r8.A0H
            int r4 = r4 + r0
        L_0x0530:
            int r0 = X.BJO.A00(r1, r8, r6)
            int r4 = r4 + r0
        L_0x0535:
            int r11 = r11 + 1
            goto L_0x0523
        L_0x0538:
            r25[r14] = r12
            r25[r7] = r4
            if (r5 != 0) goto L_0x058b
            if (r12 <= r6) goto L_0x04de
            if (r3 <= r7) goto L_0x04de
            int r3 = r3 + -1
            goto L_0x04e9
        L_0x0545:
            if (r12 >= r2) goto L_0x057d
            int r1 = r12 * r3
            int r1 = r1 + r13
            if (r5 != r7) goto L_0x054f
            int r1 = r13 * r2
            int r1 = r1 + r12
        L_0x054f:
            int r0 = r10.length
            if (r1 >= r0) goto L_0x057a
            r11 = r10[r1]
            if (r11 == 0) goto L_0x057a
            int r4 = X.BJO.A01(r11, r8, r6)
            X.1s3[] r1 = r8.A0M
            r0 = r1[r13]
            if (r0 == 0) goto L_0x0566
            int r0 = r0.A03()
            if (r0 >= r4) goto L_0x0568
        L_0x0566:
            r1[r13] = r11
        L_0x0568:
            int r4 = X.BJO.A00(r11, r8, r6)
            X.1s3[] r1 = r8.A0N
            r0 = r1[r12]
            if (r0 == 0) goto L_0x0578
            int r0 = r0.A02()
            if (r0 >= r4) goto L_0x057a
        L_0x0578:
            r1[r12] = r11
        L_0x057a:
            int r12 = r12 + 1
            goto L_0x0545
        L_0x057d:
            int r13 = r13 + 1
            goto L_0x0508
        L_0x0580:
            X.1s3[] r0 = new X.C38871s3[r2]
            r8.A0N = r0
            goto L_0x0507
        L_0x0585:
            X.1s3[] r0 = new X.C38871s3[r3]
            r8.A0M = r0
            goto L_0x04fd
        L_0x058b:
            if (r4 <= r6) goto L_0x04de
            if (r2 <= r7) goto L_0x04de
            int r2 = r2 + -1
        L_0x0591:
            float r1 = (float) r9
            float r0 = (float) r2
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            goto L_0x04f2
        L_0x059c:
            r8.A01 = r7
            r8.A00 = r7
        L_0x05a0:
            r8.A0A = r7
            r0 = r16
            int r2 = r0.A01
            int r1 = r0.A00
            r0 = r48
            r0.setMeasuredDimension(r2, r1)
            return
        L_0x05ae:
            r1 = 0
            r0 = r48
            r0.setMeasuredDimension(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.A09(X.BJP, int, int):void");
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Flow(Context context) {
        super(context);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
