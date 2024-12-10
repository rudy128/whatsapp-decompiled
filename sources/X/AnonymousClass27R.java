package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.27R  reason: invalid class name */
public class AnonymousClass27R extends AnonymousClass1s7 {
    public int A00;
    public ArrayList A01;

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0246, code lost:
        if (r18 != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02ca, code lost:
        if (r18 != false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0357, code lost:
        if (r18 != false) goto L_0x0326;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQN() {
        /*
            r23 = this;
            r22 = r23
            r0 = r22
            X.1s9 r3 = r0.A04
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x0366
            r0 = r22
            X.1s9 r2 = r0.A03
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0366
            r0 = r22
            X.1s3 r0 = r0.A02
            X.1s3 r1 = r0.A0Z
            if (r1 == 0) goto L_0x0049
            boolean r0 = r1 instanceof X.C38891s5
            if (r0 == 0) goto L_0x0049
            X.1s5 r1 = (X.C38891s5) r1
            boolean r0 = r1.A09
            r18 = r0
        L_0x0024:
            int r0 = r2.A02
            r16 = r0
            int r6 = r3.A02
            int r7 = r0 - r6
            r0 = r22
            java.util.ArrayList r5 = r0.A01
            int r4 = r5.size()
            r3 = 0
        L_0x0035:
            r2 = -1
            r13 = 8
            if (r3 >= r4) goto L_0x004c
            java.lang.Object r0 = r5.get(r3)
            X.1s7 r0 = (X.AnonymousClass1s7) r0
            X.1s3 r0 = r0.A02
            int r0 = r0.A0N
            if (r0 != r13) goto L_0x004d
            int r3 = r3 + 1
            goto L_0x0035
        L_0x0049:
            r18 = 0
            goto L_0x0024
        L_0x004c:
            r3 = -1
        L_0x004d:
            int r1 = r4 + -1
            r21 = r1
        L_0x0051:
            if (r1 < 0) goto L_0x0063
            java.lang.Object r0 = r5.get(r1)
            X.1s7 r0 = (X.AnonymousClass1s7) r0
            X.1s3 r0 = r0.A02
            int r0 = r0.A0N
            if (r0 != r13) goto L_0x0062
            int r1 = r1 + -1
            goto L_0x0051
        L_0x0062:
            r2 = r1
        L_0x0063:
            r11 = 0
        L_0x0064:
            r12 = 0
            r9 = 0
            r8 = 0
            r10 = 0
            r17 = 0
        L_0x006a:
            if (r12 >= r4) goto L_0x00db
            java.lang.Object r1 = r5.get(r12)
            X.1s7 r1 = (X.AnonymousClass1s7) r1
            X.1s3 r0 = r1.A02
            int r0 = r0.A0N
            if (r0 == r13) goto L_0x00be
            int r10 = r10 + 1
            if (r12 <= 0) goto L_0x0083
            if (r12 < r3) goto L_0x0083
            X.1s9 r0 = r1.A04
            int r0 = r0.A00
            int r9 = r9 + r0
        L_0x0083:
            X.1sA r15 = r1.A05
            int r13 = r15.A02
            java.lang.Integer r14 = r1.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r14 == r0) goto L_0x00a6
            r0 = r22
            int r14 = r0.A01
            if (r14 != 0) goto L_0x009e
            X.1s3 r0 = r1.A02
            X.1s8 r0 = r0.A0c
        L_0x0097:
            X.1sA r0 = r0.A05
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00b1
            return
        L_0x009e:
            r0 = 1
            if (r14 != r0) goto L_0x00b1
            X.1s3 r0 = r1.A02
            X.1sB r0 = r0.A0d
            goto L_0x0097
        L_0x00a6:
            int r14 = r1.A00
            r0 = 1
            if (r14 != r0) goto L_0x00c3
            if (r11 != 0) goto L_0x00c3
            int r13 = r15.A00
            int r8 = r8 + 1
        L_0x00b1:
            int r9 = r9 + r13
        L_0x00b2:
            r0 = r21
            if (r12 >= r0) goto L_0x00be
            if (r12 >= r2) goto L_0x00be
            X.1s9 r0 = r1.A03
            int r0 = r0.A00
            int r0 = -r0
            int r9 = r9 + r0
        L_0x00be:
            int r12 = r12 + 1
            r13 = 8
            goto L_0x006a
        L_0x00c3:
            boolean r0 = r15.A0B
            if (r0 != 0) goto L_0x00b1
            int r8 = r8 + 1
            X.1s3 r0 = r1.A02
            float[] r13 = r0.A0j
            r0 = r22
            int r0 = r0.A01
            r13 = r13[r0]
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00b2
            float r17 = r17 + r13
            goto L_0x00b2
        L_0x00db:
            if (r9 < r7) goto L_0x00eb
            if (r8 == 0) goto L_0x00eb
            int r11 = r11 + 1
            r0 = 2
            r9 = 0
            r8 = 0
            r10 = 0
            r17 = 0
            if (r11 >= r0) goto L_0x00eb
            goto L_0x0064
        L_0x00eb:
            if (r18 == 0) goto L_0x00ef
            r6 = r16
        L_0x00ef:
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r9 <= r7) goto L_0x00fe
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = r9 - r7
            float r0 = (float) r0
            float r0 = r0 / r1
            float r0 = r0 + r11
            int r0 = (int) r0
            if (r18 == 0) goto L_0x0179
            int r6 = r6 + r0
        L_0x00fe:
            if (r8 <= 0) goto L_0x01ae
            int r0 = r7 - r9
            float r14 = (float) r0
            float r0 = (float) r8
            float r0 = r14 / r0
            float r0 = r0 + r11
            int r0 = (int) r0
            r20 = r0
            r13 = 0
            r16 = 0
        L_0x010d:
            if (r13 >= r4) goto L_0x017b
            java.lang.Object r15 = r5.get(r13)
            X.1s7 r15 = (X.AnonymousClass1s7) r15
            X.1s3 r0 = r15.A02
            int r1 = r0.A0N
            r0 = 8
            if (r1 == r0) goto L_0x016c
            java.lang.Integer r1 = r15.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x016c
            X.1sA r12 = r15.A05
            boolean r0 = r12.A0B
            if (r0 != 0) goto L_0x016c
            r0 = 0
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0176
            X.1s3 r0 = r15.A02
            float[] r1 = r0.A0j
            r0 = r22
            int r0 = r0.A01
            r1 = r1[r0]
            float r1 = r1 * r14
            float r1 = r1 / r17
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r11 = (int) r1
        L_0x013f:
            r0 = r22
            int r1 = r0.A01
            X.1s3 r0 = r15.A02
            if (r1 != 0) goto L_0x0171
            int r1 = r0.A0F
            int r0 = r0.A0H
        L_0x014b:
            r19 = r0
            int r15 = r15.A00
            r0 = 1
            if (r15 != r0) goto L_0x016f
            int r0 = r12.A00
            int r15 = java.lang.Math.min(r11, r0)
        L_0x0158:
            r0 = r19
            int r0 = java.lang.Math.max(r0, r15)
            if (r1 <= 0) goto L_0x0164
            int r0 = java.lang.Math.min(r1, r0)
        L_0x0164:
            if (r0 == r11) goto L_0x0169
            int r16 = r16 + 1
            r11 = r0
        L_0x0169:
            r12.A01(r11)
        L_0x016c:
            int r13 = r13 + 1
            goto L_0x010d
        L_0x016f:
            r15 = r11
            goto L_0x0158
        L_0x0171:
            int r1 = r0.A0E
            int r0 = r0.A0G
            goto L_0x014b
        L_0x0176:
            r11 = r20
            goto L_0x013f
        L_0x0179:
            int r6 = r6 - r0
            goto L_0x00fe
        L_0x017b:
            if (r16 <= 0) goto L_0x01b1
            int r8 = r8 - r16
            r1 = 0
            r9 = 0
        L_0x0181:
            if (r1 >= r4) goto L_0x01b1
            java.lang.Object r11 = r5.get(r1)
            X.1s7 r11 = (X.AnonymousClass1s7) r11
            X.1s3 r0 = r11.A02
            int r12 = r0.A0N
            r0 = 8
            if (r12 == r0) goto L_0x01ab
            if (r1 <= 0) goto L_0x019a
            if (r1 < r3) goto L_0x019a
            X.1s9 r0 = r11.A04
            int r0 = r0.A00
            int r9 = r9 + r0
        L_0x019a:
            X.1sA r0 = r11.A05
            int r0 = r0.A02
            int r9 = r9 + r0
            r0 = r21
            if (r1 >= r0) goto L_0x01ab
            if (r1 >= r2) goto L_0x01ab
            X.1s9 r0 = r11.A03
            int r0 = r0.A00
            int r0 = -r0
            int r9 = r9 + r0
        L_0x01ab:
            int r1 = r1 + 1
            goto L_0x0181
        L_0x01ae:
            r1 = 0
            r11 = 2
            goto L_0x01bf
        L_0x01b1:
            r0 = r22
            int r0 = r0.A00
            r11 = 2
            if (r0 != r11) goto L_0x0257
            if (r16 != 0) goto L_0x0257
            r1 = 0
            r0 = r22
            r0.A00 = r1
        L_0x01bf:
            if (r9 <= r7) goto L_0x01c5
            r0 = r22
            r0.A00 = r11
        L_0x01c5:
            if (r10 <= 0) goto L_0x01cf
            if (r8 != 0) goto L_0x01cf
            if (r3 != r2) goto L_0x01cf
            r0 = r22
            r0.A00 = r11
        L_0x01cf:
            r0 = r22
            int r11 = r0.A00
            r0 = 1
            if (r11 != r0) goto L_0x025a
            if (r10 <= r0) goto L_0x024f
            int r7 = r7 - r9
            int r10 = r10 - r0
            int r7 = r7 / r10
        L_0x01db:
            if (r8 <= 0) goto L_0x01de
            r7 = 0
        L_0x01de:
            if (r1 >= r4) goto L_0x0366
            r0 = r1
            if (r18 == 0) goto L_0x01e7
            int r0 = r1 + 1
            int r0 = r4 - r0
        L_0x01e7:
            java.lang.Object r10 = r5.get(r0)
            X.1s7 r10 = (X.AnonymousClass1s7) r10
            X.1s3 r0 = r10.A02
            int r8 = r0.A0N
            r0 = 8
            if (r8 != r0) goto L_0x0202
            X.1s9 r0 = r10.A04
            r0.A01(r6)
            X.1s9 r0 = r10.A03
            r0.A01(r6)
        L_0x01ff:
            int r1 = r1 + 1
            goto L_0x01de
        L_0x0202:
            if (r1 <= 0) goto L_0x0246
            if (r18 == 0) goto L_0x0244
            int r6 = r6 - r7
        L_0x0207:
            if (r1 < r3) goto L_0x0246
            X.1s9 r0 = r10.A04
            int r0 = r0.A00
            if (r18 == 0) goto L_0x0249
            int r6 = r6 - r0
        L_0x0210:
            X.1s9 r0 = r10.A03
        L_0x0212:
            r0.A01(r6)
            X.1sA r11 = r10.A05
            int r9 = r11.A02
            java.lang.Integer r8 = r10.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r8 != r0) goto L_0x0226
            int r8 = r10.A00
            r0 = 1
            if (r8 != r0) goto L_0x0226
            int r9 = r11.A00
        L_0x0226:
            if (r18 == 0) goto L_0x0240
            int r6 = r6 - r9
            X.1s9 r0 = r10.A04
        L_0x022b:
            r0.A01(r6)
            r0 = 1
            r10.A09 = r0
            r0 = r21
            if (r1 >= r0) goto L_0x01ff
            if (r1 >= r2) goto L_0x01ff
            X.1s9 r0 = r10.A03
            int r0 = r0.A00
            int r0 = -r0
            if (r18 == 0) goto L_0x024d
            int r6 = r6 - r0
            goto L_0x01ff
        L_0x0240:
            int r6 = r6 + r9
            X.1s9 r0 = r10.A03
            goto L_0x022b
        L_0x0244:
            int r6 = r6 + r7
            goto L_0x0207
        L_0x0246:
            if (r18 == 0) goto L_0x024a
            goto L_0x0210
        L_0x0249:
            int r6 = r6 + r0
        L_0x024a:
            X.1s9 r0 = r10.A04
            goto L_0x0212
        L_0x024d:
            int r6 = r6 + r0
            goto L_0x01ff
        L_0x024f:
            if (r10 != r0) goto L_0x0255
            int r7 = r7 - r9
            r0 = 2
            int r7 = r7 / r0
            goto L_0x01db
        L_0x0255:
            r7 = 0
            goto L_0x01db
        L_0x0257:
            r1 = 0
            goto L_0x01bf
        L_0x025a:
            if (r11 != 0) goto L_0x02d5
            int r7 = r7 - r9
            int r0 = r10 + 1
            int r7 = r7 / r0
            if (r8 <= 0) goto L_0x0263
            r7 = 0
        L_0x0263:
            if (r1 >= r4) goto L_0x0366
            r0 = r1
            if (r18 == 0) goto L_0x026c
            int r0 = r1 + 1
            int r0 = r4 - r0
        L_0x026c:
            java.lang.Object r10 = r5.get(r0)
            X.1s7 r10 = (X.AnonymousClass1s7) r10
            X.1s3 r0 = r10.A02
            int r8 = r0.A0N
            r0 = 8
            if (r8 != r0) goto L_0x0287
            X.1s9 r0 = r10.A04
            r0.A01(r6)
            X.1s9 r0 = r10.A03
            r0.A01(r6)
        L_0x0284:
            int r1 = r1 + 1
            goto L_0x0263
        L_0x0287:
            if (r18 == 0) goto L_0x02d1
            int r6 = r6 - r7
        L_0x028a:
            if (r1 <= 0) goto L_0x02ca
            if (r1 < r3) goto L_0x02ca
            X.1s9 r0 = r10.A04
            int r0 = r0.A00
            if (r18 == 0) goto L_0x02cd
            int r6 = r6 - r0
        L_0x0295:
            X.1s9 r0 = r10.A03
        L_0x0297:
            r0.A01(r6)
            X.1sA r11 = r10.A05
            int r9 = r11.A02
            java.lang.Integer r8 = r10.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r8 != r0) goto L_0x02af
            int r8 = r10.A00
            r0 = 1
            if (r8 != r0) goto L_0x02af
            int r0 = r11.A00
            int r9 = java.lang.Math.min(r9, r0)
        L_0x02af:
            if (r18 == 0) goto L_0x02c6
            int r6 = r6 - r9
            X.1s9 r0 = r10.A04
        L_0x02b4:
            r0.A01(r6)
            r0 = r21
            if (r1 >= r0) goto L_0x0284
            if (r1 >= r2) goto L_0x0284
            X.1s9 r0 = r10.A03
            int r0 = r0.A00
            int r0 = -r0
            if (r18 == 0) goto L_0x02d3
            int r6 = r6 - r0
            goto L_0x0284
        L_0x02c6:
            int r6 = r6 + r9
            X.1s9 r0 = r10.A03
            goto L_0x02b4
        L_0x02ca:
            if (r18 == 0) goto L_0x02ce
            goto L_0x0295
        L_0x02cd:
            int r6 = r6 + r0
        L_0x02ce:
            X.1s9 r0 = r10.A04
            goto L_0x0297
        L_0x02d1:
            int r6 = r6 + r7
            goto L_0x028a
        L_0x02d3:
            int r6 = r6 + r0
            goto L_0x0284
        L_0x02d5:
            r0 = 2
            if (r11 != r0) goto L_0x0366
            r0 = r22
            int r10 = r0.A01
            X.1s3 r0 = r0.A02
            if (r10 != 0) goto L_0x0362
            float r10 = r0.A02
        L_0x02e2:
            if (r18 == 0) goto L_0x02e8
            r0 = 1065353216(0x3f800000, float:1.0)
            float r10 = r0 - r10
        L_0x02e8:
            int r7 = r7 - r9
            float r7 = (float) r7
            float r7 = r7 * r10
            r0 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r0
            int r0 = (int) r7
            if (r0 < 0) goto L_0x02f3
            if (r8 <= 0) goto L_0x02f4
        L_0x02f3:
            r0 = 0
        L_0x02f4:
            if (r18 == 0) goto L_0x0360
            int r6 = r6 - r0
        L_0x02f7:
            if (r1 >= r4) goto L_0x0366
            r0 = r1
            if (r18 == 0) goto L_0x0300
            int r0 = r1 + 1
            int r0 = r4 - r0
        L_0x0300:
            java.lang.Object r10 = r5.get(r0)
            X.1s7 r10 = (X.AnonymousClass1s7) r10
            X.1s3 r0 = r10.A02
            int r7 = r0.A0N
            r0 = 8
            if (r7 != r0) goto L_0x031b
            X.1s9 r0 = r10.A04
            r0.A01(r6)
            X.1s9 r0 = r10.A03
            r0.A01(r6)
        L_0x0318:
            int r1 = r1 + 1
            goto L_0x02f7
        L_0x031b:
            if (r1 <= 0) goto L_0x0357
            if (r1 < r3) goto L_0x0357
            X.1s9 r0 = r10.A04
            int r0 = r0.A00
            if (r18 == 0) goto L_0x035a
            int r6 = r6 - r0
        L_0x0326:
            X.1s9 r0 = r10.A03
        L_0x0328:
            r0.A01(r6)
            X.1sA r9 = r10.A05
            int r8 = r9.A02
            java.lang.Integer r7 = r10.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r7 != r0) goto L_0x033c
            int r7 = r10.A00
            r0 = 1
            if (r7 != r0) goto L_0x033c
            int r8 = r9.A00
        L_0x033c:
            if (r18 == 0) goto L_0x0353
            int r6 = r6 - r8
            X.1s9 r0 = r10.A04
        L_0x0341:
            r0.A01(r6)
            r0 = r21
            if (r1 >= r0) goto L_0x0318
            if (r1 >= r2) goto L_0x0318
            X.1s9 r0 = r10.A03
            int r0 = r0.A00
            int r0 = -r0
            if (r18 == 0) goto L_0x035e
            int r6 = r6 - r0
            goto L_0x0318
        L_0x0353:
            int r6 = r6 + r8
            X.1s9 r0 = r10.A03
            goto L_0x0341
        L_0x0357:
            if (r18 == 0) goto L_0x035b
            goto L_0x0326
        L_0x035a:
            int r6 = r6 + r0
        L_0x035b:
            X.1s9 r0 = r10.A04
            goto L_0x0328
        L_0x035e:
            int r6 = r6 + r0
            goto L_0x0318
        L_0x0360:
            int r6 = r6 + r0
            goto L_0x02f7
        L_0x0362:
            float r10 = r0.A06
            goto L_0x02e2
        L_0x0366:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27R.CQN():void");
    }

    public AnonymousClass27R(C38871s3 r7, int i) {
        super(r7);
        C38921sC r2;
        C38871s3 r0;
        C38871s3 r1;
        Object obj;
        C38921sC r22;
        int i2;
        C38921sC r23;
        ArrayList A13 = AnonymousClass000.A13();
        this.A01 = A13;
        this.A01 = i;
        C38871s3 r5 = this.A02;
        C38871s3 r3 = r5;
        if (i == 0) {
            r2 = r5.A0W;
        } else {
            r2 = r5.A0Y;
        }
        while (true) {
            C38921sC r12 = r2.A03;
            if (r12 == null || r12.A03 != r2) {
                r0 = null;
            } else {
                r0 = r12.A05;
            }
            r1 = r5;
            r5 = r0;
            if (r0 == null) {
                break;
            }
            r3 = r0;
            if (i == 0) {
                r23 = r0.A0W;
            } else {
                r23 = r0.A0Y;
            }
        }
        this.A02 = r3;
        while (true) {
            if (i == 0) {
                obj = r1.A0c;
            } else {
                obj = r1.A0d;
            }
            A13.add(obj);
            if (i == 0) {
                r22 = r1.A0X;
            } else {
                r22 = r1.A0S;
            }
            C38921sC r13 = r22.A03;
            if (r13 == null || r13.A03 != r22) {
                Iterator it = A13.iterator();
            } else {
                r1 = r13.A05;
            }
        }
        Iterator it2 = A13.iterator();
        while (it2.hasNext()) {
            AnonymousClass1s7 r14 = (AnonymousClass1s7) it2.next();
            int i3 = this.A01;
            if (i3 == 0) {
                r14.A02.A0a = this;
            } else if (i3 == 1) {
                r14.A02.A0b = this;
            }
        }
        int i4 = this.A01;
        if (i4 == 0 && ((C38891s5) this.A02.A0Z).A09 && A13.size() > 1) {
            this.A02 = ((AnonymousClass1s7) A13.get(A13.size() - 1)).A02;
        }
        C38871s3 r02 = this.A02;
        if (i4 == 0) {
            i2 = r02.A0A;
        } else {
            i2 = r02.A0L;
        }
        this.A00 = i2;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ChainRun ");
        if (this.A01 == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        String A0y = AnonymousClass000.A0y(str, A10);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            A0y = AnonymousClass000.A0y("> ", AnonymousClass000.A11(AnonymousClass001.A1E(it.next(), AnonymousClass000.A0y("<", AnonymousClass000.A11(A0y)), AnonymousClass000.A10())));
        }
        return A0y;
    }
}
