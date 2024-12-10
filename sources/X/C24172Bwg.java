package X;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* renamed from: X.Bwg  reason: case insensitive filesystem */
public class C24172Bwg extends ByteArrayOutputStream {
    public synchronized void reset() {
        Arrays.fill(this.buf, 0, this.count, (byte) 0);
        this.count = 0;
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [X.E9q, X.Dyk, X.DZM] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0573, code lost:
        r2 = r3.A03;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0576, code lost:
        r1 = X.BE6.A0L(r54, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x057c, code lost:
        if (r1 < 10) goto L_0x0576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x057e, code lost:
        r1 = r53;
        X.C26292Cx1.A0D(r1, r52, r3.A00);
        X.C26268CwD.A01(r11, r3, r11, true);
        r4 = r1;
        X.C26268CwD.A04(r4, r52, r56, r55, r54);
        r3 = new X.C24972CRw();
        r2 = r3.A01;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x059e, code lost:
        r1 = X.BE6.A0L(r56, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x05a4, code lost:
        if (r1 < 10) goto L_0x059e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x05a6, code lost:
        r2 = r3.A02;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x05a9, code lost:
        r1 = X.BE6.A0L(r55, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x05af, code lost:
        if (r1 < 10) goto L_0x05a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x05b1, code lost:
        r2 = r3.A03;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x05b4, code lost:
        r1 = X.BE6.A0L(r54, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x05ba, code lost:
        if (r1 < 10) goto L_0x05b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x05bc, code lost:
        X.C26292Cx1.A0D(r4, r52, r3.A00);
        r7[r6] = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x05c7, code lost:
        if ((r37 + r6) == 10) goto L_0x05d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x05c9, code lost:
        X.C26268CwD.A04(r4, r52, r56, r55, r54);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x05d6, code lost:
        if (r5 >= 8) goto L_0x05d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x05d9, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x05dd, code lost:
        r8 = new X.C24972CRw[8];
        r12 = 1;
        r8[0] = r11;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x05e3, code lost:
        r5 = 1 << r6;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x05e6, code lost:
        if (r4 >= r5) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x05e8, code lost:
        r3 = r8[r12 - r5];
        r2 = r7[r6];
        r1 = new X.C24972CRw();
        r8[r12] = r1;
        X.C26268CwD.A01(r3, r2, r1, false);
        r4 = r4 + 1;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x05ff, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0602, code lost:
        if (r6 < 3) goto L_0x05e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0604, code lost:
        r44 = new int[80];
        r7 = new int[10];
        r1 = r8[0].A03;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0611, code lost:
        r0 = X.BE6.A0L(r1, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0615, code lost:
        if (r0 < 10) goto L_0x0611;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0617, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0618, code lost:
        r1 = X.BE6.A0L(r7, r44, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x061e, code lost:
        if (r1 < 10) goto L_0x0618;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0620, code lost:
        r43 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0622, code lost:
        r43 = r43 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0626, code lost:
        if (r43 >= 8) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0628, code lost:
        X.C26292Cx1.A0D(r7, r8[r43].A03, r7);
        r3 = r43 * 10;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0632, code lost:
        r44[r3 + r0] = r7[r0];
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x063a, code lost:
        if (r0 >= 10) goto L_0x0622;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x063d, code lost:
        X.C26292Cx1.A0C(r7, r7, r7);
        r3 = new int[10];
        r42 = new int[8];
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0647, code lost:
        r0 = X.BE6.A0L(r7, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x064b, code lost:
        if (r0 < 10) goto L_0x0647;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x064d, code lost:
        X.C26292Cx1.A05(r3);
        r0 = r42;
        X.C26292Cx1.A01(0, 0, r3, r0);
        X.C26292Cx1.A01(5, 4, r3, r0);
        r1 = X.C26292Cx1.A00;
        r6 = 256 - java.lang.Integer.numberOfLeadingZeros(r1[7]);
        r14 = (r6 + 29) / 30;
        r41 = new int[4];
        r5 = new int[r14];
        r0 = new int[r14];
        r40 = r0;
        r13 = new int[r14];
        r12 = new int[r14];
        r11 = new int[r14];
        r39 = 0;
        r0[0] = 1;
        X.C25897Co8.A00(r42, r12, r6);
        X.C25897Co8.A00(r1, r11, r6);
        java.lang.System.arraycopy(r11, 0, r13, 0, r14);
        r4 = r14 - 1;
        r3 = -1 - (java.lang.Integer.numberOfLeadingZeros(r12[r4] | 1) - (((r14 * 30) + 2) - r6));
        r1 = r11[0];
        r50 = (2 - (r1 * r1)) * r1;
        r50 = r50 * (2 - (r1 * r50));
        r50 = r50 * (2 - (r1 * r50));
        r50 = r50 * (2 - (r1 * r50));
        r2 = r6 * 49;
        r1 = 47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x06bf, code lost:
        if (r6 >= 46) goto L_0x06c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x06c1, code lost:
        r1 = 80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x06c3, code lost:
        r51 = (r2 + r1) / 17;
        r2 = r14;
        r36 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x06cb, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x06cc, code lost:
        if (r0 >= r2) goto L_0x079d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x06d0, code lost:
        if (r12[r0] == 0) goto L_0x0799;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x06d6, code lost:
        if (r36 >= r51) goto L_0x07ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x06d8, code lost:
        r36 = r36 + 30;
        r35 = r13[0];
        r34 = r12[0];
        r1 = 30;
        r15 = 1;
        r33 = 0;
        r32 = 0;
        r31 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x06e7, code lost:
        r0 = java.lang.Integer.numberOfTrailingZeros((-1 << r1) | r34);
        r34 = r34 >> r0;
        r15 = r15 << r0;
        r33 = r33 << r0;
        r3 = r3 - r0;
        r1 = r1 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x06fa, code lost:
        if (r1 > 0) goto L_0x073e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x06fc, code lost:
        r41[0] = r15;
        r41[1] = r33;
        r41[2] = r32;
        r41[3] = r31;
        X.C25897Co8.A02(r5, r40, r41, r11, r14, r50);
        X.C25897Co8.A01(r13, r12, r41, r2);
        r0 = r2 - 1;
        r26 = r13[r0];
        r25 = r12[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x072b, code lost:
        if (((((r2 - 2) >> 31) | ((r26 >> 31) ^ r26)) | ((r25 >> 31) ^ r25)) != 0) goto L_0x06cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x072d, code lost:
        r15 = r2 - 2;
        r13[r15] = (r26 << 30) | r13[r15];
        r12[r15] = r12[r15] | (r25 << 30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x073e, code lost:
        if (r3 >= 0) goto L_0x077c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0740, code lost:
        r3 = -r3;
        r26 = -r35;
        r46 = -r15;
        r45 = -r33;
        r0 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0750, code lost:
        if (r0 <= r1) goto L_0x0753;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0752, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0753, code lost:
        r25 = ((-1 >>> (32 - r0)) & 63) & ((r34 * r26) * ((r34 * r34) - 2));
        r35 = r34;
        r34 = r26;
        r15 = r32;
        r32 = r46;
        r33 = r31;
        r31 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x076e, code lost:
        r34 = r34 + (r35 * r25);
        r32 = r32 + (r15 * r25);
        r31 = r31 + (r25 * r33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x077c, code lost:
        r0 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x077e, code lost:
        if (r0 <= r1) goto L_0x0781;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0780, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0781, code lost:
        r25 = ((-1 >>> (32 - r0)) & 15) & ((-((((r35 + 1) & 4) << 1) + r35)) * r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0795, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0799, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x079d, code lost:
        r3 = r2 - 1;
        r15 = r13[r3] >> 31;
        r14 = r5[r4] >> 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x07a7, code lost:
        if (r14 >= 0) goto L_0x07c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x07a9, code lost:
        r12 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x07ab, code lost:
        if (r12 >= r4) goto L_0x07be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x07ad, code lost:
        r1 = X.BE6.A0J(r11, r12, r5[r12], r1);
        r5[r12] = 1073741823 & r1;
        r1 = r1 >> 30;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x07be, code lost:
        r0 = X.BE6.A0J(r11, r4, r5[r4], r1);
        r5[r4] = r0;
        r14 = r0 >> 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x07c8, code lost:
        if (r15 >= 0) goto L_0x07fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x07ca, code lost:
        r0 = 0;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x07cc, code lost:
        if (r0 >= r4) goto L_0x07dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x07ce, code lost:
        r12 = r12 - r5[r0];
        r5[r0] = 1073741823 & r12;
        r12 = r12 >> 30;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x07dc, code lost:
        r12 = r12 - r5[r4];
        r5[r4] = r12;
        r14 = r12 >> 30;
        r0 = 0;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x07e5, code lost:
        if (r0 >= r3) goto L_0x07f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x07e7, code lost:
        r12 = r12 - r13[r0];
        r13[r0] = 1073741823 & r12;
        r12 = r12 >> 30;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x07f5, code lost:
        r13[r3] = r12 - r13[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x07fa, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x07fd, code lost:
        if (r13[0] == 1) goto L_0x081a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x07ff, code lost:
        r0 = r42;
        X.C26292Cx1.A00(0, 0, r0, r7);
        X.C26292Cx1.A00(4, 5, r0, r7);
        r7[9] = r7[9] & 16777215;
        r6 = r43 - 1;
        r2 = new int[10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x081a, code lost:
        if (r1 >= r2) goto L_0x0823;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x081e, code lost:
        if (r13[r1] != 0) goto L_0x07ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0820, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0823, code lost:
        if (r14 >= 0) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0825, code lost:
        r2 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0827, code lost:
        if (r2 >= r4) goto L_0x083a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0829, code lost:
        r1 = X.BE6.A0J(r11, r2, r5[r2], r1);
        r5[r2] = 1073741823 & r1;
        r1 = r1 >> 30;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x083a, code lost:
        r5[r4] = X.BE6.A0J(r11, r4, r5[r4], r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0842, code lost:
        r12 = 0;
        r4 = 0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0846, code lost:
        if (r6 <= 0) goto L_0x07ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x084e, code lost:
        if (r4 >= java.lang.Math.min(32, r6)) goto L_0x085c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0850, code lost:
        r2 = r2 | (((long) r5[r39]) << r4);
        r4 = r4 + 30;
        r39 = r39 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x085c, code lost:
        r42[r12] = (int) r2;
        r2 = r2 >>> 32;
        r4 = r4 - 32;
        r6 = r6 - 32;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        r21 = new int[10];
        r20 = new int[10];
        r2 = new byte[32];
        java.lang.System.arraycopy(r14, 0, r2, 0, java.lang.Math.min(r14.length, 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0869, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x086a, code lost:
        if (r6 <= 0) goto L_0x0893;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x086c, code lost:
        r5 = r6 - 1;
        r3 = r5 * 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0870, code lost:
        r2[r1] = r44[r3 + r1];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0878, code lost:
        if (r1 < 10) goto L_0x0870;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x087a, code lost:
        X.C26292Cx1.A0D(r2, r7, r2);
        r4 = r6 * 10;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0880, code lost:
        r44[r4 + r3] = r2[r3];
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0888, code lost:
        if (r3 < 10) goto L_0x0880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x088a, code lost:
        X.C26292Cx1.A0D(r7, r8[r6].A03, r7);
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0893, code lost:
        r1 = X.BE6.A0L(r7, r44, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0094, code lost:
        if (X.C26268CwD.A05(r2) == false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0899, code lost:
        if (r1 < 10) goto L_0x0893;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x089b, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x089c, code lost:
        r3 = r8[r5];
        r1 = new int[10];
        r0 = new int[10];
        r6 = r5 * 10;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x08a5, code lost:
        r0[r4] = r44[r6 + r4];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x08ad, code lost:
        if (r4 < 10) goto L_0x08a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x08af, code lost:
        X.C26292Cx1.A0D(r3.A01, r0, r1);
        X.C26292Cx1.A0D(r3.A02, r0, r0);
        r2 = new int[10];
        r3 = new int[10];
        r4 = new int[10];
        X.C26292Cx1.A0F(r0, r1, r2, r3);
        X.C26292Cx1.A0D(r1, r0, r4);
        X.C26292Cx1.A0D(r4, X.C26268CwD.A06, r4);
        X.C26292Cx1.A05(r2);
        X.C26292Cx1.A05(r3);
        r7 = X.C26268CwD.A00;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x08d3, code lost:
        r7[r38 + r1] = r2[r1];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x08db, code lost:
        if (r1 < 10) goto L_0x08d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x08dd, code lost:
        r6 = r38 + 10;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x08e0, code lost:
        r7[r6 + r2] = r3[r2];
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0096, code lost:
        r1 = r2[31];
        r12 = (r1 & 128) >>> 7;
        r2[31] = (byte) (r1 & Byte.MAX_VALUE);
        X.C26292Cx1.A02(r2, r20, 0, 0);
        X.C26292Cx1.A02(r2, r20, 16, 5);
        r20[9] = r20[9] & 16777215;
        r11 = new int[10];
        r10 = new int[10];
        X.C26292Cx1.A0A(r20, r11);
        r17 = X.C26268CwD.A05;
        X.C26292Cx1.A0D(r17, r11, r10);
        r11[0] = r11[0] - 1;
        X.BE6.A1R(r10, 0);
        r8 = new int[10];
        r7 = new int[10];
        X.C26292Cx1.A0D(r11, r10, r8);
        X.C26292Cx1.A0A(r10, r7);
        X.C26292Cx1.A0D(r8, r7, r8);
        X.C26292Cx1.A0A(r7, r7);
        X.C26292Cx1.A0D(r7, r8, r7);
        r6 = new int[10];
        r5 = new int[10];
        X.C26292Cx1.A0A(r7, r6);
        X.C26292Cx1.A0D(r7, r6, r6);
        r4 = new int[10];
        X.C26292Cx1.A0A(r6, r4);
        X.C26292Cx1.A0D(r7, r4, r4);
        X.C26292Cx1.A0B(r4, r4, 2);
        X.C26292Cx1.A0D(r6, r4, r4);
        r2 = new int[10];
        X.C26292Cx1.A0B(r4, r2, 5);
        X.C26292Cx1.A0D(r4, r2, r2);
        r1 = new int[10];
        X.C26292Cx1.A0B(r2, r1, 5);
        X.C26292Cx1.A0D(r4, r1, r1);
        X.C26292Cx1.A0B(r1, r4, 10);
        X.C26292Cx1.A0D(r2, r4, r4);
        X.C26292Cx1.A0B(r4, r2, 25);
        X.C26292Cx1.A0D(r4, r2, r2);
        X.C26292Cx1.A0B(r2, r1, 25);
        X.C26292Cx1.A0D(r4, r1, r1);
        X.C26292Cx1.A0B(r1, r4, 50);
        X.C26292Cx1.A0D(r2, r4, r4);
        X.C26292Cx1.A0B(r4, r2, 125);
        X.C26292Cx1.A0D(r4, r2, r2);
        X.C26292Cx1.A0B(r2, r4, 2);
        X.C26292Cx1.A0D(r4, r7, r5);
        X.C26292Cx1.A0D(r5, r8, r5);
        r0 = new int[10];
        X.C26292Cx1.A0A(r5, r0);
        X.C26292Cx1.A0D(r0, r10, r0);
        X.C26292Cx1.A0E(r0, r11, r6);
        X.C26292Cx1.A05(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x08e8, code lost:
        if (r2 < 10) goto L_0x08e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x08ea, code lost:
        r3 = r6 + 10;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x08ed, code lost:
        r7[r3 + r2] = r4[r2];
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x08f5, code lost:
        if (r2 < 10) goto L_0x08ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x08f7, code lost:
        r38 = r3 + 10;
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x08fb, code lost:
        if (r5 < 8) goto L_0x089c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x08fd, code lost:
        r37 = r37 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0901, code lost:
        if (r37 >= 8) goto L_0x0905;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0905, code lost:
        monitor-exit(r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        r9 = X.C26268CwD.A06(r28, 7);
        r8 = X.C26268CwD.A06(r27, 5);
        r3 = new X.C24972CRw();
        r2 = r3.A01;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x091c, code lost:
        r1 = X.BE6.A0L(r21, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0924, code lost:
        if (r1 < 10) goto L_0x091c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0926, code lost:
        r4 = r3.A02;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0929, code lost:
        r1 = X.BE6.A0L(r20, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x092f, code lost:
        if (r1 < 10) goto L_0x0929;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0931, code lost:
        X.C26292Cx1.A06(r3.A03);
        X.C26292Cx1.A0D(r2, r4, r3.A00);
        r7 = X.C26268CwD.A07(r3, 8);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0940, code lost:
        r23[r0] = 0;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0944, code lost:
        if (r0 < 10) goto L_0x0940;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0946, code lost:
        X.C26292Cx1.A06(r59);
        X.C26292Cx1.A06(r58);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x094d, code lost:
        r24[r0] = 0;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0951, code lost:
        if (r0 < 10) goto L_0x094d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0953, code lost:
        X.C26292Cx1.A06(r57);
        r6 = 252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0958, code lost:
        r1 = r9[r6];
        r32 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x095c, code lost:
        if (r1 == 0) goto L_0x0978;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x095e, code lost:
        r0 = r1 >> 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        X.C26268CwD.A02(X.C26268CwD.A01[(r1 ^ r0) >>> 1], r24, r57, r23, r59, r58, X.AnonymousClass000.A1O(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0978, code lost:
        r1 = r8[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x097a, code lost:
        if (r1 == 0) goto L_0x0994;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x097c, code lost:
        r0 = r1 >> 31;
        r1 = (r1 ^ r0) >>> 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0981, code lost:
        if (r0 == 0) goto L_0x0985;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0983, code lost:
        r32 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0985, code lost:
        X.C26268CwD.A02(r7[r1], r24, r57, r23, r59, r58, r32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0994, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0996, code lost:
        if (r6 >= 0) goto L_0x0999;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0999, code lost:
        X.C26268CwD.A04(r24, r57, r23, r59, r58);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x09a7, code lost:
        r2 = new byte[32];
        r4 = new int[10];
        r3 = new int[10];
        X.C26292Cx1.A08(r58, r3);
        X.C26292Cx1.A0D(r23, r3, r4);
        X.C26292Cx1.A0D(r59, r3, r3);
        X.C26292Cx1.A05(r4);
        X.C26292Cx1.A05(r3);
        r7 = new int[10];
        r0 = new int[10];
        r6 = new int[10];
        X.C26292Cx1.A0A(r4, r0);
        X.C26292Cx1.A0A(r3, r6);
        X.C26292Cx1.A0D(r0, r6, r7);
        X.C26292Cx1.A0E(r6, r0, r6);
        X.C26292Cx1.A0D(r7, r17, r7);
        r1 = 0;
        X.BE6.A1R(r7, 0);
        X.C26292Cx1.A0E(r7, r6, r7);
        X.C26292Cx1.A05(r7);
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x09e6, code lost:
        r6 = r6 | r7[r1];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x09eb, code lost:
        if (r1 < 10) goto L_0x09e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x09ed, code lost:
        r5 = (((r6 >>> 1) | (r6 & 1)) - 1) >> 31;
        X.C26292Cx1.A03(r2, r3, 0, 0);
        X.C26292Cx1.A03(r2, r3, 5, 16);
        X.BE6.A1N(r2, (r4[0] & 1) << 7, r2[31], 31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0a0e, code lost:
        if (r5 == 0) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0a16, code lost:
        if (java.util.Arrays.equals(r2, r60) == false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0a18, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x015c, code lost:
        r1 = 0;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x015e, code lost:
        r3 = r3 | r6[r1];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0163, code lost:
        if (r1 < 10) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0172, code lost:
        if (X.AnonymousClass000.A1O((((r3 >>> 1) | (r3 & 1)) - 1) >> 31) == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0174, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0175, code lost:
        r1 = X.BE6.A0L(r5, r21, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x017b, code lost:
        if (r1 >= 10) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x017e, code lost:
        X.C26292Cx1.A0C(r0, r11, r6);
        X.C26292Cx1.A05(r6);
        r1 = 0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0186, code lost:
        r2 = r2 | r6[r1];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x018b, code lost:
        if (r1 < 10) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x019a, code lost:
        if (X.AnonymousClass000.A1O((((r2 >>> 1) | (r2 & 1)) - 1) >> 31) == false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x019c, code lost:
        X.C26292Cx1.A0D(r5, X.C26292Cx1.A01, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01a3, code lost:
        X.C26292Cx1.A05(r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01aa, code lost:
        if (r12 != 1) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01ac, code lost:
        r1 = 0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01ae, code lost:
        r2 = r2 | r21[r1];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01b3, code lost:
        if (r1 < 10) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01c2, code lost:
        if (X.AnonymousClass000.A1O((((r2 >>> 1) | (r2 & 1)) - 1) >> 31) == false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01cd, code lost:
        if (r12 != (r21[0] & 1)) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01cf, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01d0, code lost:
        r21[r1] = -r21[r1];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01d7, code lost:
        if (r1 >= 10) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01da, code lost:
        r2 = new X.DZM();
        r36 = new byte[64];
        r2.update(r60, 0, 32);
        r2.update(r14, 0, 32);
        r2.update(r23, 0, r13);
        r1 = r36;
        r2.BJ6(r1, 0);
        r23 = ((long) X.BEB.A0A(r1, 0)) & 4294967295L;
        r27 = ((long) (X.C26268CwD.A00(r36, 4) << 4)) & 4294967295L;
        r25 = ((long) X.BEB.A0A(r36, 7)) & 4294967295L;
        r29 = ((long) X.BEB.A0A(r36, 35)) & 4294967295L;
        r41 = ((long) (X.C26268CwD.A00(r36, 39) << 4)) & 4294967295L;
        r49 = ((long) X.BEB.A0A(r36, 42)) & 4294967295L;
        r53 = ((long) (X.C26268CwD.A00(r36, 46) << 4)) & 4294967295L;
        r57 = ((long) X.BEB.A0A(r36, 49)) & 4294967295L;
        r55 = ((long) (X.C26268CwD.A00(r36, 53) << 4)) & 4294967295L;
        r51 = ((long) X.BEB.A0A(r36, 56)) & 4294967295L;
        r34 = 4294967295L & ((long) (X.C26268CwD.A00(r36, 60) << 4));
        r32 = ((long) r36[63]) & 255;
        r10 = (((long) (X.C26268CwD.A00(r36, 32) << 4)) & 4294967295L) - (r32 * -50998291);
        r34 = r34 + (r51 >> 28);
        r51 = r51 & 268435455;
        r2 = (((long) X.BEB.A0A(r36, 28)) & 4294967295L) - (r34 * -50998291);
        r49 = (r49 - (r32 * -6428113)) - (r34 * 5343);
        r8 = (((long) (X.C26268CwD.A00(r36, 25) << 4)) & 4294967295L) - (r51 * -50998291);
        r41 = ((r41 - (r32 * 127719000)) - (r34 * -6428113)) - (r51 * 5343);
        r55 = r55 + (r57 >> 28);
        r57 = r57 & 268435455;
        r12 = (((long) X.BEB.A0A(r36, 21)) & 4294967295L) - (r55 * -50998291);
        r29 = (((r29 - (r32 * 19280294)) - (r34 * 127719000)) - (r51 * -6428113)) - (r55 * 5343);
        r14 = (((long) (X.C26268CwD.A00(r36, 18) << 4)) & 4294967295L) - (r57 * -50998291);
        r10 = (((r10 - (r34 * 19280294)) - (r51 * 127719000)) - (r55 * -6428113)) - (r57 * 5343);
        r53 = (r53 - (r32 * 5343)) + (r49 >> 28);
        r4 = (((long) X.BEB.A0A(r36, 14)) & 4294967295L) - (r53 * -50998291);
        r49 = (r49 & 268435455) + (r41 >> 28);
        r8 = (((r8 - (r55 * 19280294)) - (r57 * 127719000)) - (r53 * -6428113)) - (r49 * 5343);
        r41 = (r41 & 268435455) + (r29 >> 28);
        r29 = (r29 & 268435455) + (r10 >> 28);
        r27 = r27 - (r29 * -50998291);
        r25 = (r25 - (r41 * -50998291)) - (r29 * 19280294);
        r6 = (((((long) (X.C26268CwD.A00(r36, 11) << 4)) & 4294967295L) - (r49 * -50998291)) - (r41 * 19280294)) - (r29 * 127719000);
        r4 = ((r4 - (r49 * 19280294)) - (r41 * 127719000)) - (r29 * -6428113);
        r14 = (((r14 - (r53 * 19280294)) - (r49 * 127719000)) - (r41 * -6428113)) - (r29 * 5343);
        r2 = ((((r2 - (r51 * 19280294)) - (r55 * 127719000)) - (r57 * -6428113)) - (r53 * 5343)) + (r8 >> 28);
        r2 = r2 & 268435455;
        r29 = r2 >>> 27;
        r10 = ((r10 & 268435455) + (r2 >> 28)) + r29;
        r23 = r23 - (r10 * -50998291);
        r27 = (r27 - (r10 * 19280294)) + (r23 >> 28);
        r25 = (r25 - (r10 * 127719000)) + (r27 >> 28);
        r6 = (r6 - (r10 * -6428113)) + (r25 >> 28);
        r4 = (r4 - (r10 * 5343)) + (r6 >> 28);
        r14 = r14 + (r4 >> 28);
        r12 = ((((r12 - (r57 * 19280294)) - (r53 * 127719000)) - (r49 * -6428113)) - (r41 * 5343)) + (r14 >> 28);
        r8 = (r8 & 268435455) + (r12 >> 28);
        r2 = r2 + (r8 >> 28);
        r10 = (r2 >> 28) - r29;
        r23 = (r23 & 268435455) + (r10 & -50998291);
        r27 = ((r27 & 268435455) + (r10 & 19280294)) + (r23 >> 28);
        r25 = ((r25 & 268435455) + (r10 & 127719000)) + (r27 >> 28);
        r6 = ((r6 & 268435455) + (r10 & -6428113)) + (r25 >> 28);
        r4 = ((r4 & 268435455) + (r10 & 5343)) + (r6 >> 28);
        r14 = (r14 & 268435455) + (r4 >> 28);
        r12 = (r12 & 268435455) + (r14 >> 28);
        r8 = (r8 & 268435455) + (r12 >> 28);
        r11 = new byte[32];
        X.C26268CwD.A03(r11, 0, (r23 & 268435455) | ((r27 & 268435455) << 28));
        X.C26268CwD.A03(r11, 7, ((r6 & 268435455) << 28) | (r25 & 268435455));
        X.C26268CwD.A03(r11, 14, (r4 & 268435455) | ((r14 & 268435455) << 28));
        X.C26268CwD.A03(r11, 21, (r12 & 268435455) | ((r8 & 268435455) << 28));
        r4 = (int) ((r2 & 268435455) + (r8 >> 28));
        r11[28] = (byte) r4;
        r11[29] = (byte) (r4 >>> 8);
        r11[30] = (byte) (r4 >>> 16);
        r11[31] = (byte) (r4 >>> 24);
        r28 = new int[8];
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x047e, code lost:
        r28[r2] = X.BEB.A0A(r59, r2 * 4);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x048a, code lost:
        if (r2 < 8) goto L_0x047e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x048c, code lost:
        r27 = new int[8];
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0491, code lost:
        r27[r1] = X.BEB.A0A(r11, r1 * 4);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x049b, code lost:
        if (r1 < 8) goto L_0x0491;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x049d, code lost:
        r23 = new int[10];
        r59 = new int[10];
        r58 = new int[10];
        r24 = new int[10];
        r57 = new int[10];
        r29 = X.C26268CwD.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x04b5, code lost:
        monitor-enter(r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x04b8, code lost:
        if (X.C26268CwD.A00 != null) goto L_0x0905;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x04ba, code lost:
        r4 = new X.C24972CRw();
        r2 = X.C26268CwD.A03;
        r5 = r4.A01;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x04c4, code lost:
        r0 = X.BE6.A0L(r2, r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x04c8, code lost:
        if (r0 < 10) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x04ca, code lost:
        r1 = X.C26268CwD.A04;
        r3 = r4.A02;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x04cf, code lost:
        r0 = X.BE6.A0L(r1, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x04d3, code lost:
        if (r0 < 10) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x04d5, code lost:
        X.C26292Cx1.A06(r4.A03);
        X.C26292Cx1.A0D(r5, r3, r4.A00);
        X.C26268CwD.A01 = X.C26268CwD.A07(r4, 32);
        r56 = new int[10];
        r55 = new int[10];
        r54 = new int[10];
        r53 = new int[10];
        r52 = new int[10];
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x04fc, code lost:
        r3 = X.BE6.A0L(r2, r56, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0502, code lost:
        if (r3 < 10) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0504, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0505, code lost:
        r2 = X.BE6.A0L(r1, r55, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x050b, code lost:
        if (r2 < 10) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x050d, code lost:
        X.C26292Cx1.A06(r54);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0511, code lost:
        r2 = X.BE6.A0L(r56, r53, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0519, code lost:
        if (r2 < 10) goto L_0x0511;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x051b, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x051c, code lost:
        r2 = X.BE6.A0L(r55, r52, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0524, code lost:
        if (r2 < 10) goto L_0x051c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0526, code lost:
        X.C26268CwD.A00 = new int[1920];
        r37 = 0;
        r38 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0530, code lost:
        r7 = new X.C24972CRw[4];
        r11 = new X.C24972CRw();
        r1 = r11.A01;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x053b, code lost:
        r1[r0] = 0;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x053f, code lost:
        if (r0 < 10) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0541, code lost:
        X.C26292Cx1.A06(r11.A02);
        X.C26292Cx1.A06(r11.A03);
        r1 = r11.A00;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x054e, code lost:
        r1[r0] = 0;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0552, code lost:
        if (r0 < 10) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0554, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0555, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0556, code lost:
        if (r6 >= 4) goto L_0x05dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0558, code lost:
        r3 = new X.C24972CRw();
        r2 = r3.A01;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0560, code lost:
        r1 = X.BE6.A0L(r56, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0566, code lost:
        if (r1 < 10) goto L_0x0560;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0568, code lost:
        r2 = r3.A02;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x056b, code lost:
        r1 = X.BE6.A0L(r55, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0571, code lost:
        if (r1 < 10) goto L_0x056b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A00(X.DYl r62, byte[] r63) {
        /*
            r61 = this;
            r16 = r61
            monitor-enter(r16)
            r3 = r63
            int r1 = r3.length     // Catch:{ all -> 0x0a21 }
            r15 = 64
            if (r15 == r1) goto L_0x0011
            r16.reset()     // Catch:{ all -> 0x0a21 }
            monitor-exit(r16)
            r18 = 0
            return r18
        L_0x0011:
            r0 = r62
            byte[] r0 = r0.A00     // Catch:{ all -> 0x0a21 }
            byte[] r14 = X.AnonymousClass1C2.A02(r0)     // Catch:{ all -> 0x0a21 }
            r0 = r16
            byte[] r0 = r0.buf     // Catch:{ all -> 0x0a21 }
            r23 = r0
            r0 = r16
            int r13 = r0.count     // Catch:{ all -> 0x0a21 }
            r31 = 0
            r19 = 32
            r0 = r19
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0a21 }
            r60 = r0
            r0 = r19
            int r4 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0a21 }
            r2 = r31
            r0 = r60
            java.lang.System.arraycopy(r3, r2, r0, r2, r4)     // Catch:{ all -> 0x0a21 }
            r0 = r19
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0a21 }
            r59 = r0
            r1 = r19
            int r4 = java.lang.Math.min(r1, r1)     // Catch:{ all -> 0x0a21 }
            r2 = r1
            r1 = r59
            r0 = r31
            java.lang.System.arraycopy(r3, r2, r1, r0, r4)     // Catch:{ all -> 0x0a21 }
            boolean r0 = X.C26268CwD.A05(r60)     // Catch:{ all -> 0x0a21 }
            r18 = 0
            if (r0 == 0) goto L_0x01c4
            r0 = 8
            int[] r5 = new int[r0]     // Catch:{ all -> 0x0a21 }
            r3 = 8
            r2 = 0
        L_0x005d:
            int r1 = r2 * 4
            r0 = r59
            int r0 = X.BEB.A0A(r0, r1)     // Catch:{ all -> 0x0a21 }
            r5[r2] = r0     // Catch:{ all -> 0x0a21 }
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x005d
            int[] r4 = X.C26268CwD.A07     // Catch:{ all -> 0x0a21 }
            r3 = 7
        L_0x006e:
            r2 = r5[r3]     // Catch:{ all -> 0x0a21 }
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 ^ r1
            r0 = r4[r3]     // Catch:{ all -> 0x0a21 }
            r1 = r1 ^ r0
            if (r2 >= r1) goto L_0x0154
            r1 = 10
            int[] r0 = new int[r1]     // Catch:{ all -> 0x0a21 }
            r21 = r0
            int[] r0 = new int[r1]     // Catch:{ all -> 0x0a21 }
            r20 = r0
            r0 = r19
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0a21 }
            int r1 = r14.length     // Catch:{ all -> 0x0a21 }
            int r3 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0a21 }
            r1 = r31
            java.lang.System.arraycopy(r14, r1, r2, r1, r3)     // Catch:{ all -> 0x0a21 }
            boolean r0 = X.C26268CwD.A05(r2)     // Catch:{ all -> 0x0a21 }
            if (r0 == 0) goto L_0x01c4
            r3 = 31
            byte r1 = r2[r3]     // Catch:{ all -> 0x0a21 }
            r0 = r1 & 128(0x80, float:1.794E-43)
            int r12 = r0 >>> 7
            r0 = r1 & 127(0x7f, float:1.78E-43)
            byte r0 = (byte) r0     // Catch:{ all -> 0x0a21 }
            r2[r3] = r0     // Catch:{ all -> 0x0a21 }
            r3 = r31
            r1 = r20
            X.C26292Cx1.A02(r2, r1, r3, r3)     // Catch:{ all -> 0x0a21 }
            r3 = 16
            r1 = 5
            r0 = r20
            X.C26292Cx1.A02(r2, r0, r3, r1)     // Catch:{ all -> 0x0a21 }
            r2 = 9
            r1 = r20[r2]     // Catch:{ all -> 0x0a21 }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            r20[r2] = r1     // Catch:{ all -> 0x0a21 }
            r0 = 10
            int[] r11 = new int[r0]     // Catch:{ all -> 0x0a21 }
            int[] r10 = new int[r0]     // Catch:{ all -> 0x0a21 }
            r0 = r20
            X.C26292Cx1.A0A(r0, r11)     // Catch:{ all -> 0x0a21 }
            int[] r17 = X.C26268CwD.A05     // Catch:{ all -> 0x0a21 }
            r0 = r17
            X.C26292Cx1.A0D(r0, r11, r10)     // Catch:{ all -> 0x0a21 }
            r0 = r11[r31]     // Catch:{ all -> 0x0a21 }
            int r0 = r0 + -1
            r11[r31] = r0     // Catch:{ all -> 0x0a21 }
            r0 = r31
            X.BE6.A1R(r10, r0)     // Catch:{ all -> 0x0a21 }
            r9 = 10
            int[] r8 = new int[r9]     // Catch:{ all -> 0x0a21 }
            int[] r7 = new int[r9]     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r11, r10, r8)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0A(r10, r7)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r8, r7, r8)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0A(r7, r7)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r7, r8, r7)     // Catch:{ all -> 0x0a21 }
            int[] r6 = new int[r9]     // Catch:{ all -> 0x0a21 }
            int[] r5 = new int[r9]     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0A(r7, r6)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r7, r6, r6)     // Catch:{ all -> 0x0a21 }
            int[] r4 = new int[r9]     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0A(r6, r4)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r7, r4, r4)     // Catch:{ all -> 0x0a21 }
            r3 = 2
            X.C26292Cx1.A0B(r4, r4, r3)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r6, r4, r4)     // Catch:{ all -> 0x0a21 }
            int[] r2 = new int[r9]     // Catch:{ all -> 0x0a21 }
            r0 = 5
            X.C26292Cx1.A0B(r4, r2, r0)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r4, r2, r2)     // Catch:{ all -> 0x0a21 }
            int[] r1 = new int[r9]     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0B(r2, r1, r0)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r4, r1, r1)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0B(r1, r4, r9)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r2, r4, r4)     // Catch:{ all -> 0x0a21 }
            r0 = 25
            X.C26292Cx1.A0B(r4, r2, r0)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r4, r2, r2)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0B(r2, r1, r0)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r4, r1, r1)     // Catch:{ all -> 0x0a21 }
            r0 = 50
            X.C26292Cx1.A0B(r1, r4, r0)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r2, r4, r4)     // Catch:{ all -> 0x0a21 }
            r0 = 125(0x7d, float:1.75E-43)
            X.C26292Cx1.A0B(r4, r2, r0)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r4, r2, r2)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0B(r2, r4, r3)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r4, r7, r5)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r5, r8, r5)     // Catch:{ all -> 0x0a21 }
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0A(r5, r0)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r0, r10, r0)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0E(r0, r11, r6)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A05(r6)     // Catch:{ all -> 0x0a21 }
            goto L_0x015c
        L_0x0154:
            if (r2 > r1) goto L_0x01c4
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x01c4
            goto L_0x006e
        L_0x015c:
            r1 = 0
            r3 = 0
        L_0x015e:
            r2 = r6[r1]     // Catch:{ all -> 0x0a21 }
            r3 = r3 | r2
            int r1 = r1 + 1
            if (r1 < r9) goto L_0x015e
            int r2 = r3 >>> 1
            r1 = r3 & 1
            r2 = r2 | r1
            int r1 = r2 + -1
            int r1 = r1 >> 31
            boolean r1 = X.AnonymousClass000.A1O(r1)     // Catch:{ all -> 0x0a21 }
            if (r1 == 0) goto L_0x017e
            r1 = 0
        L_0x0175:
            r0 = r21
            int r1 = X.BE6.A0L(r5, r0, r1)     // Catch:{ all -> 0x0a21 }
            if (r1 >= r9) goto L_0x01a3
            goto L_0x0175
        L_0x017e:
            X.C26292Cx1.A0C(r0, r11, r6)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A05(r6)     // Catch:{ all -> 0x0a21 }
            r1 = 0
            r2 = 0
        L_0x0186:
            r0 = r6[r1]     // Catch:{ all -> 0x0a21 }
            r2 = r2 | r0
            int r1 = r1 + 1
            if (r1 < r9) goto L_0x0186
            int r1 = r2 >>> 1
            r0 = r2 & 1
            r1 = r1 | r0
            int r0 = r1 + -1
            int r0 = r0 >> 31
            boolean r0 = X.AnonymousClass000.A1O(r0)     // Catch:{ all -> 0x0a21 }
            if (r0 == 0) goto L_0x01c4
            int[] r1 = X.C26292Cx1.A01     // Catch:{ all -> 0x0a21 }
            r0 = r21
            X.C26292Cx1.A0D(r5, r1, r0)     // Catch:{ all -> 0x0a21 }
        L_0x01a3:
            X.C26292Cx1.A05(r21)     // Catch:{ all -> 0x0a21 }
            r22 = 1
            r0 = r22
            if (r12 != r0) goto L_0x01c9
            r1 = 0
            r2 = 0
        L_0x01ae:
            r0 = r21[r1]     // Catch:{ all -> 0x0a21 }
            r2 = r2 | r0
            int r1 = r1 + 1
            if (r1 < r9) goto L_0x01ae
            int r1 = r2 >>> 1
            r0 = r2 & 1
            r1 = r1 | r0
            int r0 = r1 + -1
            int r0 = r0 >> 31
            boolean r0 = X.AnonymousClass000.A1O(r0)     // Catch:{ all -> 0x0a21 }
            if (r0 == 0) goto L_0x01c9
        L_0x01c4:
            r16.reset()     // Catch:{ all -> 0x0a21 }
            goto L_0x0a1c
        L_0x01c9:
            r0 = r21[r31]     // Catch:{ all -> 0x0a21 }
            r0 = r0 & 1
            if (r12 != r0) goto L_0x01da
            r1 = 0
        L_0x01d0:
            r0 = r21[r1]     // Catch:{ all -> 0x0a21 }
            int r0 = -r0
            r21[r1] = r0     // Catch:{ all -> 0x0a21 }
            int r1 = r1 + 1
            if (r1 >= r9) goto L_0x01da
            goto L_0x01d0
        L_0x01da:
            X.Dyk r2 = new X.Dyk     // Catch:{ all -> 0x0a21 }
            r2.<init>()     // Catch:{ all -> 0x0a21 }
            byte[] r0 = new byte[r15]     // Catch:{ all -> 0x0a21 }
            r36 = r0
            r3 = r60
            r1 = r31
            r0 = r19
            r2.update(r3, r1, r0)     // Catch:{ all -> 0x0a21 }
            r2.update(r14, r1, r0)     // Catch:{ all -> 0x0a21 }
            r1 = r23
            r0 = r31
            r2.update(r1, r0, r13)     // Catch:{ all -> 0x0a21 }
            r1 = r36
            r2.BJ6(r1, r0)     // Catch:{ all -> 0x0a21 }
            int r0 = X.BEB.A0A(r1, r0)     // Catch:{ all -> 0x0a21 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a21 }
            r34 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r23 = r0 & r34
            r2 = 4
            r0 = r36
            int r0 = X.C26268CwD.A00(r0, r2)     // Catch:{ all -> 0x0a21 }
            int r0 = r0 << r2
            long r0 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r27 = r0 & r34
            r1 = 7
            r0 = r36
            int r0 = X.BEB.A0A(r0, r1)     // Catch:{ all -> 0x0a21 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r25 = r0 & r34
            r1 = 11
            r0 = r36
            int r0 = X.C26268CwD.A00(r0, r1)     // Catch:{ all -> 0x0a21 }
            int r0 = r0 << r2
            long r6 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r6 = r6 & r34
            r1 = 14
            r0 = r36
            int r0 = X.BEB.A0A(r0, r1)     // Catch:{ all -> 0x0a21 }
            long r4 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r4 = r4 & r34
            r1 = 18
            r0 = r36
            int r0 = X.C26268CwD.A00(r0, r1)     // Catch:{ all -> 0x0a21 }
            int r0 = r0 << r2
            long r14 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r14 = r14 & r34
            r1 = 21
            r0 = r36
            int r0 = X.BEB.A0A(r0, r1)     // Catch:{ all -> 0x0a21 }
            long r12 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r12 = r12 & r34
            r1 = 25
            r0 = r36
            int r0 = X.C26268CwD.A00(r0, r1)     // Catch:{ all -> 0x0a21 }
            int r0 = r0 << r2
            long r8 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r8 = r8 & r34
            r1 = 28
            r0 = r36
            int r0 = X.BEB.A0A(r0, r1)     // Catch:{ all -> 0x0a21 }
            long r2 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r2 = r2 & r34
            r1 = r36
            r0 = r19
            int r0 = X.C26268CwD.A00(r1, r0)     // Catch:{ all -> 0x0a21 }
            int r0 = r0 << 4
            long r10 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r10 = r10 & r34
            r1 = 35
            r0 = r36
            int r0 = X.BEB.A0A(r0, r1)     // Catch:{ all -> 0x0a21 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r29 = r0 & r34
            r0 = 39
            r1 = r36
            int r0 = X.C26268CwD.A00(r1, r0)     // Catch:{ all -> 0x0a21 }
            int r0 = r0 << 4
            long r0 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r41 = r0 & r34
            r0 = 42
            r1 = r36
            int r0 = X.BEB.A0A(r1, r0)     // Catch:{ all -> 0x0a21 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r49 = r0 & r34
            r0 = 46
            r1 = r36
            int r0 = X.C26268CwD.A00(r1, r0)     // Catch:{ all -> 0x0a21 }
            int r0 = r0 << 4
            long r0 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r53 = r0 & r34
            r0 = 49
            r1 = r36
            int r0 = X.BEB.A0A(r1, r0)     // Catch:{ all -> 0x0a21 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r57 = r0 & r34
            r0 = 53
            r1 = r36
            int r0 = X.C26268CwD.A00(r1, r0)     // Catch:{ all -> 0x0a21 }
            int r0 = r0 << 4
            long r0 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r55 = r0 & r34
            r0 = 56
            r1 = r36
            int r0 = X.BEB.A0A(r1, r0)     // Catch:{ all -> 0x0a21 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r51 = r0 & r34
            r0 = 60
            r1 = r36
            int r0 = X.C26268CwD.A00(r1, r0)     // Catch:{ all -> 0x0a21 }
            int r0 = r0 << 4
            long r0 = (long) r0     // Catch:{ all -> 0x0a21 }
            long r34 = r34 & r0
            r0 = 63
            byte r0 = r36[r0]     // Catch:{ all -> 0x0a21 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a21 }
            r32 = r0
            r0 = 255(0xff, double:1.26E-321)
            long r32 = r32 & r0
            r47 = -50998291(0xfffffffffcf5d3ed, double:NaN)
            long r0 = r32 * r47
            long r10 = r10 - r0
            r45 = 19280294(0x12631a6, double:9.525731E-317)
            long r0 = r32 * r45
            long r29 = r29 - r0
            r43 = 127719000(0x79cd658, double:6.310157E-316)
            long r0 = r32 * r43
            long r41 = r41 - r0
            r39 = -6428113(0xffffffffff9dea2f, double:NaN)
            long r0 = r32 * r39
            long r49 = r49 - r0
            r37 = 5343(0x14df, double:2.64E-320)
            long r32 = r32 * r37
            long r53 = r53 - r32
            r36 = 28
            long r0 = r51 >> r36
            long r34 = r34 + r0
            r32 = 268435455(0xfffffff, double:1.326247364E-315)
            long r51 = r51 & r32
            long r0 = r34 * r47
            long r2 = r2 - r0
            long r0 = r34 * r45
            long r10 = r10 - r0
            long r0 = r34 * r43
            long r29 = r29 - r0
            long r0 = r34 * r39
            long r41 = r41 - r0
            long r34 = r34 * r37
            long r49 = r49 - r34
            long r0 = r51 * r47
            long r8 = r8 - r0
            long r0 = r51 * r45
            long r2 = r2 - r0
            long r0 = r51 * r43
            long r10 = r10 - r0
            long r0 = r51 * r39
            long r29 = r29 - r0
            long r51 = r51 * r37
            long r41 = r41 - r51
            long r0 = r57 >> r36
            long r55 = r55 + r0
            long r57 = r57 & r32
            long r0 = r55 * r47
            long r12 = r12 - r0
            long r0 = r55 * r45
            long r8 = r8 - r0
            long r0 = r55 * r43
            long r2 = r2 - r0
            long r0 = r55 * r39
            long r10 = r10 - r0
            long r55 = r55 * r37
            long r29 = r29 - r55
            long r0 = r57 * r47
            long r14 = r14 - r0
            long r0 = r57 * r45
            long r12 = r12 - r0
            long r0 = r57 * r43
            long r8 = r8 - r0
            long r0 = r57 * r39
            long r2 = r2 - r0
            long r57 = r57 * r37
            long r10 = r10 - r57
            long r0 = r49 >> r36
            long r53 = r53 + r0
            long r49 = r49 & r32
            long r0 = r53 * r47
            long r4 = r4 - r0
            long r0 = r53 * r45
            long r14 = r14 - r0
            long r0 = r53 * r43
            long r12 = r12 - r0
            long r0 = r53 * r39
            long r8 = r8 - r0
            long r53 = r53 * r37
            long r2 = r2 - r53
            long r0 = r41 >> r36
            long r49 = r49 + r0
            long r41 = r41 & r32
            long r0 = r49 * r47
            long r6 = r6 - r0
            long r0 = r49 * r45
            long r4 = r4 - r0
            long r0 = r49 * r43
            long r14 = r14 - r0
            long r0 = r49 * r39
            long r12 = r12 - r0
            long r49 = r49 * r37
            long r8 = r8 - r49
            long r0 = r29 >> r36
            long r41 = r41 + r0
            long r29 = r29 & r32
            long r0 = r41 * r47
            long r25 = r25 - r0
            long r0 = r41 * r45
            long r6 = r6 - r0
            long r0 = r41 * r43
            long r4 = r4 - r0
            long r0 = r41 * r39
            long r14 = r14 - r0
            long r41 = r41 * r37
            long r12 = r12 - r41
            long r0 = r10 >> r36
            long r29 = r29 + r0
            long r10 = r10 & r32
            long r0 = r29 * r47
            long r27 = r27 - r0
            long r0 = r29 * r45
            long r25 = r25 - r0
            long r0 = r29 * r43
            long r6 = r6 - r0
            long r0 = r29 * r39
            long r4 = r4 - r0
            long r29 = r29 * r37
            long r14 = r14 - r29
            long r0 = r8 >> r36
            long r2 = r2 + r0
            long r8 = r8 & r32
            long r0 = r2 >> r36
            long r10 = r10 + r0
            long r2 = r2 & r32
            r0 = 27
            long r29 = r2 >>> r0
            long r10 = r10 + r29
            long r0 = r10 * r47
            long r23 = r23 - r0
            long r0 = r10 * r45
            long r27 = r27 - r0
            long r0 = r10 * r43
            long r25 = r25 - r0
            long r0 = r10 * r39
            long r6 = r6 - r0
            long r10 = r10 * r37
            long r4 = r4 - r10
            long r0 = r23 >> r36
            long r27 = r27 + r0
            long r23 = r23 & r32
            long r0 = r27 >> r36
            long r25 = r25 + r0
            long r27 = r27 & r32
            long r0 = r25 >> r36
            long r6 = r6 + r0
            long r25 = r25 & r32
            long r0 = r6 >> r36
            long r4 = r4 + r0
            long r6 = r6 & r32
            long r0 = r4 >> r36
            long r14 = r14 + r0
            long r4 = r4 & r32
            long r0 = r14 >> r36
            long r12 = r12 + r0
            long r14 = r14 & r32
            long r0 = r12 >> r36
            long r8 = r8 + r0
            long r12 = r12 & r32
            long r0 = r8 >> r36
            long r2 = r2 + r0
            long r8 = r8 & r32
            long r10 = r2 >> r36
            long r2 = r2 & r32
            long r10 = r10 - r29
            long r0 = r10 & r47
            long r23 = r23 + r0
            long r0 = r10 & r45
            long r27 = r27 + r0
            long r0 = r10 & r43
            long r25 = r25 + r0
            long r0 = r10 & r39
            long r6 = r6 + r0
            long r10 = r10 & r37
            long r4 = r4 + r10
            long r0 = r23 >> r36
            long r27 = r27 + r0
            long r23 = r23 & r32
            long r0 = r27 >> r36
            long r25 = r25 + r0
            long r27 = r27 & r32
            long r0 = r25 >> r36
            long r6 = r6 + r0
            long r25 = r25 & r32
            long r0 = r6 >> r36
            long r4 = r4 + r0
            long r6 = r6 & r32
            long r0 = r4 >> r36
            long r14 = r14 + r0
            long r4 = r4 & r32
            long r0 = r14 >> r36
            long r12 = r12 + r0
            long r14 = r14 & r32
            long r0 = r12 >> r36
            long r8 = r8 + r0
            long r12 = r12 & r32
            long r0 = r8 >> r36
            long r2 = r2 + r0
            long r8 = r8 & r32
            r0 = r19
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x0a21 }
            long r27 = r27 << r36
            long r23 = r23 | r27
            r10 = r31
            r0 = r23
            X.C26268CwD.A03(r11, r10, r0)     // Catch:{ all -> 0x0a21 }
            long r6 = r6 << r36
            long r6 = r6 | r25
            r0 = 7
            X.C26268CwD.A03(r11, r0, r6)     // Catch:{ all -> 0x0a21 }
            long r14 = r14 << r36
            long r4 = r4 | r14
            r0 = 14
            X.C26268CwD.A03(r11, r0, r4)     // Catch:{ all -> 0x0a21 }
            long r8 = r8 << r36
            long r12 = r12 | r8
            r0 = 21
            X.C26268CwD.A03(r11, r0, r12)     // Catch:{ all -> 0x0a21 }
            int r4 = (int) r2     // Catch:{ all -> 0x0a21 }
            byte r0 = (byte) r4     // Catch:{ all -> 0x0a21 }
            r11[r36] = r0     // Catch:{ all -> 0x0a21 }
            r1 = 29
            int r0 = r4 >>> 8
            byte r0 = (byte) r0     // Catch:{ all -> 0x0a21 }
            r11[r1] = r0     // Catch:{ all -> 0x0a21 }
            r1 = 30
            int r0 = r4 >>> 16
            byte r0 = (byte) r0     // Catch:{ all -> 0x0a21 }
            r11[r1] = r0     // Catch:{ all -> 0x0a21 }
            r1 = 31
            int r0 = r4 >>> 24
            byte r0 = (byte) r0     // Catch:{ all -> 0x0a21 }
            r11[r1] = r0     // Catch:{ all -> 0x0a21 }
            r10 = 8
            int[] r0 = new int[r10]     // Catch:{ all -> 0x0a21 }
            r28 = r0
            r2 = 0
        L_0x047e:
            int r1 = r2 * 4
            r0 = r59
            int r0 = X.BEB.A0A(r0, r1)     // Catch:{ all -> 0x0a21 }
            r28[r2] = r0     // Catch:{ all -> 0x0a21 }
            int r2 = r2 + 1
            if (r2 < r10) goto L_0x047e
            int[] r0 = new int[r10]     // Catch:{ all -> 0x0a21 }
            r27 = r0
            r1 = 0
        L_0x0491:
            int r0 = r1 * 4
            int r0 = X.BEB.A0A(r11, r0)     // Catch:{ all -> 0x0a21 }
            r27[r1] = r0     // Catch:{ all -> 0x0a21 }
            int r1 = r1 + 1
            if (r1 < r10) goto L_0x0491
            r9 = 10
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a21 }
            r23 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a21 }
            r59 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a21 }
            r58 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a21 }
            r24 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a21 }
            r57 = r0
            java.lang.Object r29 = X.C26268CwD.A02     // Catch:{ all -> 0x0a21 }
            monitor-enter(r29)     // Catch:{ all -> 0x0a21 }
            int[] r0 = X.C26268CwD.A00     // Catch:{ all -> 0x0a1e }
            if (r0 != 0) goto L_0x0905
            X.CRw r4 = new X.CRw     // Catch:{ all -> 0x0a1e }
            r4.<init>()     // Catch:{ all -> 0x0a1e }
            int[] r2 = X.C26268CwD.A03     // Catch:{ all -> 0x0a1e }
            int[] r5 = r4.A01     // Catch:{ all -> 0x0a1e }
            r0 = 0
        L_0x04c4:
            int r0 = X.BE6.A0L(r2, r5, r0)     // Catch:{ all -> 0x0a1e }
            if (r0 < r9) goto L_0x04c4
            int[] r1 = X.C26268CwD.A04     // Catch:{ all -> 0x0a1e }
            int[] r3 = r4.A02     // Catch:{ all -> 0x0a1e }
            r0 = 0
        L_0x04cf:
            int r0 = X.BE6.A0L(r1, r3, r0)     // Catch:{ all -> 0x0a1e }
            if (r0 < r9) goto L_0x04cf
            int[] r0 = r4.A03     // Catch:{ all -> 0x0a1e }
            X.C26292Cx1.A06(r0)     // Catch:{ all -> 0x0a1e }
            int[] r0 = r4.A00     // Catch:{ all -> 0x0a1e }
            X.C26292Cx1.A0D(r5, r3, r0)     // Catch:{ all -> 0x0a1e }
            r0 = r19
            X.CRw[] r0 = X.C26268CwD.A07(r4, r0)     // Catch:{ all -> 0x0a1e }
            X.C26268CwD.A01 = r0     // Catch:{ all -> 0x0a1e }
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a1e }
            r56 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a1e }
            r55 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a1e }
            r54 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a1e }
            r53 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a1e }
            r52 = r0
            r3 = 0
        L_0x04fc:
            r0 = r56
            int r3 = X.BE6.A0L(r2, r0, r3)     // Catch:{ all -> 0x0a1e }
            if (r3 < r9) goto L_0x04fc
            r2 = 0
        L_0x0505:
            r0 = r55
            int r2 = X.BE6.A0L(r1, r0, r2)     // Catch:{ all -> 0x0a1e }
            if (r2 < r9) goto L_0x0505
            X.C26292Cx1.A06(r54)     // Catch:{ all -> 0x0a1e }
            r2 = 0
        L_0x0511:
            r1 = r56
            r0 = r53
            int r2 = X.BE6.A0L(r1, r0, r2)     // Catch:{ all -> 0x0a1e }
            if (r2 < r9) goto L_0x0511
            r2 = 0
        L_0x051c:
            r1 = r55
            r0 = r52
            int r2 = X.BE6.A0L(r1, r0, r2)     // Catch:{ all -> 0x0a1e }
            if (r2 < r9) goto L_0x051c
            r0 = 1920(0x780, float:2.69E-42)
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0a1e }
            X.C26268CwD.A00 = r0     // Catch:{ all -> 0x0a1e }
            r37 = 0
            r38 = 0
        L_0x0530:
            r8 = 4
            X.CRw[] r7 = new X.C24972CRw[r8]     // Catch:{ all -> 0x0a1e }
            X.CRw r11 = new X.CRw     // Catch:{ all -> 0x0a1e }
            r11.<init>()     // Catch:{ all -> 0x0a1e }
            int[] r1 = r11.A01     // Catch:{ all -> 0x0a1e }
            r0 = 0
        L_0x053b:
            r1[r0] = r18     // Catch:{ all -> 0x0a1e }
            int r0 = r0 + 1
            if (r0 < r9) goto L_0x053b
            int[] r0 = r11.A02     // Catch:{ all -> 0x0a1e }
            X.C26292Cx1.A06(r0)     // Catch:{ all -> 0x0a1e }
            int[] r0 = r11.A03     // Catch:{ all -> 0x0a1e }
            X.C26292Cx1.A06(r0)     // Catch:{ all -> 0x0a1e }
            int[] r1 = r11.A00     // Catch:{ all -> 0x0a1e }
            r0 = 0
        L_0x054e:
            r1[r0] = r18     // Catch:{ all -> 0x0a1e }
            int r0 = r0 + 1
            if (r0 < r9) goto L_0x054e
            r6 = 0
        L_0x0555:
            r5 = 1
            if (r6 >= r8) goto L_0x05dd
            X.CRw r3 = new X.CRw     // Catch:{ all -> 0x0a1e }
            r3.<init>()     // Catch:{ all -> 0x0a1e }
            int[] r2 = r3.A01     // Catch:{ all -> 0x0a1e }
            r1 = 0
        L_0x0560:
            r0 = r56
            int r1 = X.BE6.A0L(r0, r2, r1)     // Catch:{ all -> 0x0a1e }
            if (r1 < r9) goto L_0x0560
            int[] r2 = r3.A02     // Catch:{ all -> 0x0a1e }
            r1 = 0
        L_0x056b:
            r0 = r55
            int r1 = X.BE6.A0L(r0, r2, r1)     // Catch:{ all -> 0x0a1e }
            if (r1 < r9) goto L_0x056b
            int[] r2 = r3.A03     // Catch:{ all -> 0x0a1e }
            r1 = 0
        L_0x0576:
            r0 = r54
            int r1 = X.BE6.A0L(r0, r2, r1)     // Catch:{ all -> 0x0a1e }
            if (r1 < r9) goto L_0x0576
            int[] r2 = r3.A00     // Catch:{ all -> 0x0a1e }
            r1 = r53
            r0 = r52
            X.C26292Cx1.A0D(r1, r0, r2)     // Catch:{ all -> 0x0a1e }
            X.C26268CwD.A01(r11, r3, r11, r5)     // Catch:{ all -> 0x0a1e }
            r4 = r1
            r3 = r52
            r2 = r56
            r1 = r55
            r0 = r54
            X.C26268CwD.A04(r4, r3, r2, r1, r0)     // Catch:{ all -> 0x0a1e }
            X.CRw r3 = new X.CRw     // Catch:{ all -> 0x0a1e }
            r3.<init>()     // Catch:{ all -> 0x0a1e }
            int[] r2 = r3.A01     // Catch:{ all -> 0x0a1e }
            r1 = 0
        L_0x059e:
            r0 = r56
            int r1 = X.BE6.A0L(r0, r2, r1)     // Catch:{ all -> 0x0a1e }
            if (r1 < r9) goto L_0x059e
            int[] r2 = r3.A02     // Catch:{ all -> 0x0a1e }
            r1 = 0
        L_0x05a9:
            r0 = r55
            int r1 = X.BE6.A0L(r0, r2, r1)     // Catch:{ all -> 0x0a1e }
            if (r1 < r9) goto L_0x05a9
            int[] r2 = r3.A03     // Catch:{ all -> 0x0a1e }
            r1 = 0
        L_0x05b4:
            r0 = r54
            int r1 = X.BE6.A0L(r0, r2, r1)     // Catch:{ all -> 0x0a1e }
            if (r1 < r9) goto L_0x05b4
            int[] r2 = r3.A00     // Catch:{ all -> 0x0a1e }
            r0 = r52
            X.C26292Cx1.A0D(r4, r0, r2)     // Catch:{ all -> 0x0a1e }
            r7[r6] = r3     // Catch:{ all -> 0x0a1e }
            int r0 = r37 + r6
            if (r0 == r9) goto L_0x05d9
        L_0x05c9:
            r3 = r52
            r2 = r56
            r1 = r55
            r0 = r54
            X.C26268CwD.A04(r4, r3, r2, r1, r0)     // Catch:{ all -> 0x0a1e }
            int r5 = r5 + 1
            if (r5 >= r10) goto L_0x05d9
            goto L_0x05c9
        L_0x05d9:
            int r6 = r6 + 1
            goto L_0x0555
        L_0x05dd:
            X.CRw[] r8 = new X.C24972CRw[r10]     // Catch:{ all -> 0x0a1e }
            r12 = 1
            r8[r18] = r11     // Catch:{ all -> 0x0a1e }
            r6 = 0
        L_0x05e3:
            int r5 = r22 << r6
            r4 = 0
        L_0x05e6:
            if (r4 >= r5) goto L_0x05ff
            int r0 = r12 - r5
            r3 = r8[r0]     // Catch:{ all -> 0x0a1e }
            r2 = r7[r6]     // Catch:{ all -> 0x0a1e }
            X.CRw r1 = new X.CRw     // Catch:{ all -> 0x0a1e }
            r1.<init>()     // Catch:{ all -> 0x0a1e }
            r8[r12] = r1     // Catch:{ all -> 0x0a1e }
            r0 = r18
            X.C26268CwD.A01(r3, r2, r1, r0)     // Catch:{ all -> 0x0a1e }
            int r4 = r4 + 1
            int r12 = r12 + 1
            goto L_0x05e6
        L_0x05ff:
            int r6 = r6 + 1
            r0 = 3
            if (r6 < r0) goto L_0x05e3
            r0 = 80
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0a1e }
            r44 = r0
            int[] r7 = new int[r9]     // Catch:{ all -> 0x0a1e }
            r0 = r8[r18]     // Catch:{ all -> 0x0a1e }
            int[] r1 = r0.A03     // Catch:{ all -> 0x0a1e }
            r0 = 0
        L_0x0611:
            int r0 = X.BE6.A0L(r1, r7, r0)     // Catch:{ all -> 0x0a1e }
            if (r0 < r9) goto L_0x0611
            r1 = 0
        L_0x0618:
            r0 = r44
            int r1 = X.BE6.A0L(r7, r0, r1)     // Catch:{ all -> 0x0a1e }
            if (r1 < r9) goto L_0x0618
            r43 = 0
        L_0x0622:
            int r43 = r43 + 1
            r0 = r43
            if (r0 >= r10) goto L_0x063d
            r0 = r8[r43]     // Catch:{ all -> 0x0a1e }
            int[] r0 = r0.A03     // Catch:{ all -> 0x0a1e }
            X.C26292Cx1.A0D(r7, r0, r7)     // Catch:{ all -> 0x0a1e }
            int r3 = r43 * 10
            r0 = 0
        L_0x0632:
            int r2 = r3 + r0
            r1 = r7[r0]     // Catch:{ all -> 0x0a1e }
            r44[r2] = r1     // Catch:{ all -> 0x0a1e }
            int r0 = r0 + 1
            if (r0 >= r9) goto L_0x0622
            goto L_0x0632
        L_0x063d:
            X.C26292Cx1.A0C(r7, r7, r7)     // Catch:{ all -> 0x0a1e }
            int[] r3 = new int[r9]     // Catch:{ all -> 0x0a1e }
            int[] r0 = new int[r10]     // Catch:{ all -> 0x0a1e }
            r42 = r0
            r0 = 0
        L_0x0647:
            int r0 = X.BE6.A0L(r7, r3, r0)     // Catch:{ all -> 0x0a1e }
            if (r0 < r9) goto L_0x0647
            X.C26292Cx1.A05(r3)     // Catch:{ all -> 0x0a1e }
            r2 = r18
            r0 = r42
            X.C26292Cx1.A01(r2, r2, r3, r0)     // Catch:{ all -> 0x0a1e }
            r2 = 4
            r1 = 5
            X.C26292Cx1.A01(r1, r2, r3, r0)     // Catch:{ all -> 0x0a1e }
            int[] r1 = X.C26292Cx1.A00     // Catch:{ all -> 0x0a1e }
            r6 = 256(0x100, float:3.59E-43)
            r0 = 7
            r0 = r1[r0]     // Catch:{ all -> 0x0a1e }
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch:{ all -> 0x0a1e }
            int r6 = r6 - r0
            int r0 = r6 + 29
            int r14 = r0 / 30
            int[] r0 = new int[r2]     // Catch:{ all -> 0x0a1e }
            r41 = r0
            int[] r5 = new int[r14]     // Catch:{ all -> 0x0a1e }
            int[] r0 = new int[r14]     // Catch:{ all -> 0x0a1e }
            r40 = r0
            int[] r13 = new int[r14]     // Catch:{ all -> 0x0a1e }
            int[] r12 = new int[r14]     // Catch:{ all -> 0x0a1e }
            int[] r11 = new int[r14]     // Catch:{ all -> 0x0a1e }
            r39 = 0
            r0[r18] = r22     // Catch:{ all -> 0x0a1e }
            r0 = r42
            X.C25897Co8.A00(r0, r12, r6)     // Catch:{ all -> 0x0a1e }
            X.C25897Co8.A00(r1, r11, r6)     // Catch:{ all -> 0x0a1e }
            r1 = r18
            java.lang.System.arraycopy(r11, r1, r13, r1, r14)     // Catch:{ all -> 0x0a1e }
            int r4 = r14 + -1
            r0 = r12[r4]     // Catch:{ all -> 0x0a1e }
            r0 = r0 | 1
            int r1 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch:{ all -> 0x0a1e }
            int r0 = r14 * 30
            int r0 = r0 + 2
            int r0 = r0 - r6
            int r1 = r1 - r0
            int r3 = -1 - r1
            r1 = r11[r18]     // Catch:{ all -> 0x0a1e }
            int r0 = r1 * r1
            int r50 = 2 - r0
            int r50 = r50 * r1
            int r0 = r1 * r50
            int r0 = 2 - r0
            int r50 = r50 * r0
            int r0 = r1 * r50
            int r0 = 2 - r0
            int r50 = r50 * r0
            int r1 = r1 * r50
            int r0 = 2 - r1
            int r50 = r50 * r0
            int r2 = r6 * 49
            r0 = 46
            r1 = 47
            if (r6 >= r0) goto L_0x06c3
            r1 = 80
        L_0x06c3:
            int r2 = r2 + r1
            int r0 = r2 / 17
            r51 = r0
            r2 = r14
            r36 = 0
        L_0x06cb:
            r0 = 0
        L_0x06cc:
            if (r0 >= r2) goto L_0x079d
            r1 = r12[r0]     // Catch:{ all -> 0x0a1e }
            if (r1 == 0) goto L_0x0799
            r1 = r36
            r0 = r51
            if (r1 >= r0) goto L_0x07ff
            int r36 = r36 + 30
            r35 = r13[r18]     // Catch:{ all -> 0x0a1e }
            r34 = r12[r18]     // Catch:{ all -> 0x0a1e }
            r1 = 30
            r15 = 1
            r33 = 0
            r32 = 0
            r31 = 1
        L_0x06e7:
            r25 = -1
            int r0 = r25 << r1
            r0 = r0 | r34
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)     // Catch:{ all -> 0x0a1e }
            int r34 = r34 >> r0
            int r15 = r15 << r0
            int r33 = r33 << r0
            int r3 = r3 - r0
            int r1 = r1 - r0
            r30 = 2
            if (r1 > 0) goto L_0x073e
            r41[r18] = r15     // Catch:{ all -> 0x0a1e }
            r41[r22] = r33     // Catch:{ all -> 0x0a1e }
            r41[r30] = r32     // Catch:{ all -> 0x0a1e }
            r0 = 3
            r41[r0] = r31     // Catch:{ all -> 0x0a1e }
            r45 = r5
            r46 = r40
            r47 = r41
            r48 = r11
            r49 = r14
            X.C25897Co8.A02(r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x0a1e }
            r0 = r41
            X.C25897Co8.A01(r13, r12, r0, r2)     // Catch:{ all -> 0x0a1e }
            int r0 = r2 + -1
            r26 = r13[r0]     // Catch:{ all -> 0x0a1e }
            r25 = r12[r0]     // Catch:{ all -> 0x0a1e }
            int r0 = r2 + -2
            int r1 = r0 >> 31
            int r0 = r26 >> 31
            r0 = r0 ^ r26
            r1 = r1 | r0
            int r0 = r25 >> 31
            r0 = r0 ^ r25
            r1 = r1 | r0
            if (r1 != 0) goto L_0x06cb
            int r15 = r2 + -2
            r1 = r13[r15]     // Catch:{ all -> 0x0a1e }
            int r0 = r26 << 30
            r0 = r0 | r1
            r13[r15] = r0     // Catch:{ all -> 0x0a1e }
            r1 = r12[r15]     // Catch:{ all -> 0x0a1e }
            int r0 = r25 << 30
            r1 = r1 | r0
            r12[r15] = r1     // Catch:{ all -> 0x0a1e }
            goto L_0x0795
        L_0x073e:
            if (r3 >= 0) goto L_0x077c
            int r3 = -r3
            r0 = r35
            int r0 = -r0
            r26 = r0
            int r0 = -r15
            r46 = r0
            r0 = r33
            int r0 = -r0
            r45 = r0
            int r0 = r3 + 1
            if (r0 <= r1) goto L_0x0753
            r0 = r1
        L_0x0753:
            int r0 = 32 - r0
            int r25 = r25 >>> r0
            r25 = r25 & 63
            int r15 = r34 * r26
            int r0 = r34 * r34
            int r0 = r0 - r30
            int r15 = r15 * r0
            r25 = r25 & r15
            r35 = r34
            r34 = r26
            r15 = r32
            r32 = r46
            r33 = r31
            r31 = r45
        L_0x076e:
            int r0 = r35 * r25
            int r34 = r34 + r0
            int r0 = r15 * r25
            int r32 = r32 + r0
            int r25 = r25 * r33
            int r31 = r31 + r25
            goto L_0x06e7
        L_0x077c:
            int r0 = r3 + 1
            if (r0 <= r1) goto L_0x0781
            r0 = r1
        L_0x0781:
            int r0 = 32 - r0
            int r25 = r25 >>> r0
            r25 = r25 & 15
            int r0 = r35 + 1
            r0 = r0 & 4
            int r0 = r0 << r22
            int r0 = r0 + r35
            int r0 = -r0
            int r0 = r0 * r34
            r25 = r25 & r0
            goto L_0x076e
        L_0x0795:
            int r2 = r2 + -1
            goto L_0x06cb
        L_0x0799:
            int r0 = r0 + 1
            goto L_0x06cc
        L_0x079d:
            int r3 = r2 + -1
            r0 = r13[r3]     // Catch:{ all -> 0x0a1e }
            int r15 = r0 >> 31
            r0 = r5[r4]     // Catch:{ all -> 0x0a1e }
            int r14 = r0 >> 31
            if (r14 >= 0) goto L_0x07c8
            r12 = 0
            r1 = 0
        L_0x07ab:
            if (r12 >= r4) goto L_0x07be
            r0 = r5[r12]     // Catch:{ all -> 0x0a1e }
            int r1 = X.BE6.A0J(r11, r12, r0, r1)     // Catch:{ all -> 0x0a1e }
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r1
            r5[r12] = r0     // Catch:{ all -> 0x0a1e }
            int r1 = r1 >> 30
            int r12 = r12 + 1
            goto L_0x07ab
        L_0x07be:
            r0 = r5[r4]     // Catch:{ all -> 0x0a1e }
            int r0 = X.BE6.A0J(r11, r4, r0, r1)     // Catch:{ all -> 0x0a1e }
            r5[r4] = r0     // Catch:{ all -> 0x0a1e }
            int r14 = r0 >> 30
        L_0x07c8:
            if (r15 >= 0) goto L_0x07fa
            r0 = 0
            r12 = 0
        L_0x07cc:
            if (r0 >= r4) goto L_0x07dc
            r1 = r5[r0]     // Catch:{ all -> 0x0a1e }
            int r12 = r12 - r1
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            r1 = r1 & r12
            r5[r0] = r1     // Catch:{ all -> 0x0a1e }
            int r12 = r12 >> 30
            int r0 = r0 + 1
            goto L_0x07cc
        L_0x07dc:
            r0 = r5[r4]     // Catch:{ all -> 0x0a1e }
            int r12 = r12 - r0
            r5[r4] = r12     // Catch:{ all -> 0x0a1e }
            int r14 = r12 >> 30
            r0 = 0
            r12 = 0
        L_0x07e5:
            if (r0 >= r3) goto L_0x07f5
            r1 = r13[r0]     // Catch:{ all -> 0x0a1e }
            int r12 = r12 - r1
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            r1 = r1 & r12
            r13[r0] = r1     // Catch:{ all -> 0x0a1e }
            int r12 = r12 >> 30
            int r0 = r0 + 1
            goto L_0x07e5
        L_0x07f5:
            r0 = r13[r3]     // Catch:{ all -> 0x0a1e }
            int r12 = r12 - r0
            r13[r3] = r12     // Catch:{ all -> 0x0a1e }
        L_0x07fa:
            r3 = r13[r18]     // Catch:{ all -> 0x0a1e }
            r1 = 1
            if (r3 == r1) goto L_0x081a
        L_0x07ff:
            r2 = r18
            r0 = r42
            X.C26292Cx1.A00(r2, r2, r0, r7)     // Catch:{ all -> 0x0a1e }
            r2 = 4
            r1 = 5
            X.C26292Cx1.A00(r2, r1, r0, r7)     // Catch:{ all -> 0x0a1e }
            r2 = 9
            r1 = r7[r2]     // Catch:{ all -> 0x0a1e }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            r7[r2] = r1     // Catch:{ all -> 0x0a1e }
            int r6 = r43 + -1
            int[] r2 = new int[r9]     // Catch:{ all -> 0x0a1e }
            goto L_0x0869
        L_0x081a:
            if (r1 >= r2) goto L_0x0823
            r0 = r13[r1]     // Catch:{ all -> 0x0a1e }
            if (r0 != 0) goto L_0x07ff
            int r1 = r1 + 1
            goto L_0x081a
        L_0x0823:
            if (r14 >= 0) goto L_0x0842
            r2 = 0
            r1 = 0
        L_0x0827:
            if (r2 >= r4) goto L_0x083a
            r0 = r5[r2]     // Catch:{ all -> 0x0a1e }
            int r1 = X.BE6.A0J(r11, r2, r0, r1)     // Catch:{ all -> 0x0a1e }
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r1
            r5[r2] = r0     // Catch:{ all -> 0x0a1e }
            int r1 = r1 >> 30
            int r2 = r2 + 1
            goto L_0x0827
        L_0x083a:
            r0 = r5[r4]     // Catch:{ all -> 0x0a1e }
            int r0 = X.BE6.A0J(r11, r4, r0, r1)     // Catch:{ all -> 0x0a1e }
            r5[r4] = r0     // Catch:{ all -> 0x0a1e }
        L_0x0842:
            r12 = 0
            r4 = 0
            r2 = 0
        L_0x0846:
            if (r6 <= 0) goto L_0x07ff
        L_0x0848:
            r0 = r19
            int r0 = java.lang.Math.min(r0, r6)     // Catch:{ all -> 0x0a1e }
            if (r4 >= r0) goto L_0x085c
            int r11 = r39 + 1
            r0 = r5[r39]     // Catch:{ all -> 0x0a1e }
            long r0 = (long) r0     // Catch:{ all -> 0x0a1e }
            long r0 = r0 << r4
            long r2 = r2 | r0
            int r4 = r4 + 30
            r39 = r11
            goto L_0x0848
        L_0x085c:
            int r1 = r12 + 1
            int r0 = (int) r2     // Catch:{ all -> 0x0a1e }
            r42[r12] = r0     // Catch:{ all -> 0x0a1e }
            long r2 = r2 >>> r19
            int r4 = r4 + -32
            int r6 = r6 + -32
            r12 = r1
            goto L_0x0846
        L_0x0869:
            r1 = 0
            if (r6 <= 0) goto L_0x0893
            int r5 = r6 + -1
            int r3 = r5 * 10
        L_0x0870:
            int r0 = r3 + r1
            r0 = r44[r0]     // Catch:{ all -> 0x0a1e }
            r2[r1] = r0     // Catch:{ all -> 0x0a1e }
            int r1 = r1 + 1
            if (r1 < r9) goto L_0x0870
            X.C26292Cx1.A0D(r2, r7, r2)     // Catch:{ all -> 0x0a1e }
            int r4 = r6 * 10
            r3 = 0
        L_0x0880:
            int r1 = r4 + r3
            r0 = r2[r3]     // Catch:{ all -> 0x0a1e }
            r44[r1] = r0     // Catch:{ all -> 0x0a1e }
            int r3 = r3 + 1
            if (r3 < r9) goto L_0x0880
            r0 = r8[r6]     // Catch:{ all -> 0x0a1e }
            int[] r0 = r0.A03     // Catch:{ all -> 0x0a1e }
            X.C26292Cx1.A0D(r7, r0, r7)     // Catch:{ all -> 0x0a1e }
            r6 = r5
            goto L_0x0869
        L_0x0893:
            r0 = r44
            int r1 = X.BE6.A0L(r7, r0, r1)     // Catch:{ all -> 0x0a1e }
            if (r1 < r9) goto L_0x0893
            r5 = 0
        L_0x089c:
            r3 = r8[r5]     // Catch:{ all -> 0x0a1e }
            int[] r1 = new int[r9]     // Catch:{ all -> 0x0a1e }
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a1e }
            int r6 = r5 * 10
            r4 = 0
        L_0x08a5:
            int r2 = r6 + r4
            r2 = r44[r2]     // Catch:{ all -> 0x0a1e }
            r0[r4] = r2     // Catch:{ all -> 0x0a1e }
            int r4 = r4 + 1
            if (r4 < r9) goto L_0x08a5
            int[] r2 = r3.A01     // Catch:{ all -> 0x0a1e }
            X.C26292Cx1.A0D(r2, r0, r1)     // Catch:{ all -> 0x0a1e }
            int[] r2 = r3.A02     // Catch:{ all -> 0x0a1e }
            X.C26292Cx1.A0D(r2, r0, r0)     // Catch:{ all -> 0x0a1e }
            int[] r2 = new int[r9]     // Catch:{ all -> 0x0a1e }
            int[] r3 = new int[r9]     // Catch:{ all -> 0x0a1e }
            int[] r4 = new int[r9]     // Catch:{ all -> 0x0a1e }
            X.C26292Cx1.A0F(r0, r1, r2, r3)     // Catch:{ all -> 0x0a1e }
            X.C26292Cx1.A0D(r1, r0, r4)     // Catch:{ all -> 0x0a1e }
            int[] r0 = X.C26268CwD.A06     // Catch:{ all -> 0x0a1e }
            X.C26292Cx1.A0D(r4, r0, r4)     // Catch:{ all -> 0x0a1e }
            X.C26292Cx1.A05(r2)     // Catch:{ all -> 0x0a1e }
            X.C26292Cx1.A05(r3)     // Catch:{ all -> 0x0a1e }
            int[] r7 = X.C26268CwD.A00     // Catch:{ all -> 0x0a1e }
            r1 = 0
        L_0x08d3:
            int r6 = r38 + r1
            r0 = r2[r1]     // Catch:{ all -> 0x0a1e }
            r7[r6] = r0     // Catch:{ all -> 0x0a1e }
            int r1 = r1 + 1
            if (r1 < r9) goto L_0x08d3
            int r6 = r38 + 10
            r2 = 0
        L_0x08e0:
            int r1 = r6 + r2
            r0 = r3[r2]     // Catch:{ all -> 0x0a1e }
            r7[r1] = r0     // Catch:{ all -> 0x0a1e }
            int r2 = r2 + 1
            if (r2 < r9) goto L_0x08e0
            int r3 = r6 + 10
            r2 = 0
        L_0x08ed:
            int r1 = r3 + r2
            r0 = r4[r2]     // Catch:{ all -> 0x0a1e }
            r7[r1] = r0     // Catch:{ all -> 0x0a1e }
            int r2 = r2 + 1
            if (r2 < r9) goto L_0x08ed
            int r38 = r3 + 10
            int r5 = r5 + 1
            if (r5 < r10) goto L_0x089c
            int r37 = r37 + 1
            r0 = r37
            if (r0 >= r10) goto L_0x0905
            goto L_0x0530
        L_0x0905:
            monitor-exit(r29)     // Catch:{ all -> 0x0a1e }
            r1 = 7
            r0 = r28
            byte[] r9 = X.C26268CwD.A06(r0, r1)     // Catch:{ all -> 0x0a21 }
            r1 = 5
            r0 = r27
            byte[] r8 = X.C26268CwD.A06(r0, r1)     // Catch:{ all -> 0x0a21 }
            X.CRw r3 = new X.CRw     // Catch:{ all -> 0x0a21 }
            r3.<init>()     // Catch:{ all -> 0x0a21 }
            int[] r2 = r3.A01     // Catch:{ all -> 0x0a21 }
            r1 = 0
        L_0x091c:
            r0 = r21
            int r1 = X.BE6.A0L(r0, r2, r1)     // Catch:{ all -> 0x0a21 }
            r5 = 10
            if (r1 < r5) goto L_0x091c
            int[] r4 = r3.A02     // Catch:{ all -> 0x0a21 }
            r1 = 0
        L_0x0929:
            r0 = r20
            int r1 = X.BE6.A0L(r0, r4, r1)     // Catch:{ all -> 0x0a21 }
            if (r1 < r5) goto L_0x0929
            int[] r0 = r3.A03     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A06(r0)     // Catch:{ all -> 0x0a21 }
            int[] r0 = r3.A00     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r2, r4, r0)     // Catch:{ all -> 0x0a21 }
            X.CRw[] r7 = X.C26268CwD.A07(r3, r10)     // Catch:{ all -> 0x0a21 }
            r0 = 0
        L_0x0940:
            r23[r0] = r18     // Catch:{ all -> 0x0a21 }
            int r0 = r0 + 1
            if (r0 < r5) goto L_0x0940
            X.C26292Cx1.A06(r59)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A06(r58)     // Catch:{ all -> 0x0a21 }
            r0 = 0
        L_0x094d:
            r24[r0] = r18     // Catch:{ all -> 0x0a21 }
            int r0 = r0 + 1
            if (r0 < r5) goto L_0x094d
            X.C26292Cx1.A06(r57)     // Catch:{ all -> 0x0a21 }
            r6 = 252(0xfc, float:3.53E-43)
        L_0x0958:
            byte r1 = r9[r6]     // Catch:{ all -> 0x0a21 }
            r32 = 0
            if (r1 == 0) goto L_0x0978
            int r0 = r1 >> 31
            r1 = r1 ^ r0
            int r1 = r1 >>> r22
            boolean r31 = X.AnonymousClass000.A1O(r0)
            X.CRw[] r0 = X.C26268CwD.A01     // Catch:{ all -> 0x0a21 }
            r25 = r0[r1]     // Catch:{ all -> 0x0a21 }
            r26 = r24
            r27 = r57
            r28 = r23
            r29 = r59
            r30 = r58
            X.C26268CwD.A02(r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0a21 }
        L_0x0978:
            byte r1 = r8[r6]     // Catch:{ all -> 0x0a21 }
            if (r1 == 0) goto L_0x0994
            int r0 = r1 >> 31
            r1 = r1 ^ r0
            int r1 = r1 >>> r22
            if (r0 == 0) goto L_0x0985
            r32 = 1
        L_0x0985:
            r26 = r7[r1]     // Catch:{ all -> 0x0a21 }
            r27 = r24
            r28 = r57
            r29 = r23
            r30 = r59
            r31 = r58
            X.C26268CwD.A02(r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x0a21 }
        L_0x0994:
            int r6 = r6 + -1
            if (r6 >= 0) goto L_0x0999
            goto L_0x09a7
        L_0x0999:
            r4 = r24
            r3 = r57
            r2 = r23
            r1 = r59
            r0 = r58
            X.C26268CwD.A04(r4, r3, r2, r1, r0)     // Catch:{ all -> 0x0a21 }
            goto L_0x0958
        L_0x09a7:
            r0 = r19
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0a21 }
            int[] r4 = new int[r5]     // Catch:{ all -> 0x0a21 }
            int[] r3 = new int[r5]     // Catch:{ all -> 0x0a21 }
            r0 = r58
            X.C26292Cx1.A08(r0, r3)     // Catch:{ all -> 0x0a21 }
            r0 = r23
            X.C26292Cx1.A0D(r0, r3, r4)     // Catch:{ all -> 0x0a21 }
            r0 = r59
            X.C26292Cx1.A0D(r0, r3, r3)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A05(r4)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A05(r3)     // Catch:{ all -> 0x0a21 }
            int[] r7 = new int[r5]     // Catch:{ all -> 0x0a21 }
            int[] r0 = new int[r5]     // Catch:{ all -> 0x0a21 }
            int[] r6 = new int[r5]     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0A(r4, r0)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0A(r3, r6)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0D(r0, r6, r7)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0E(r6, r0, r6)     // Catch:{ all -> 0x0a21 }
            r0 = r17
            X.C26292Cx1.A0D(r7, r0, r7)     // Catch:{ all -> 0x0a21 }
            r1 = 0
            X.BE6.A1R(r7, r1)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A0E(r7, r6, r7)     // Catch:{ all -> 0x0a21 }
            X.C26292Cx1.A05(r7)     // Catch:{ all -> 0x0a21 }
            r6 = 0
        L_0x09e6:
            r0 = r7[r1]     // Catch:{ all -> 0x0a21 }
            r6 = r6 | r0
            int r1 = r1 + 1
            if (r1 < r5) goto L_0x09e6
            int r1 = r6 >>> 1
            r0 = r6 & 1
            r1 = r1 | r0
            int r0 = r1 + -1
            int r5 = r0 >> 31
            r1 = r18
            X.C26292Cx1.A03(r2, r3, r1, r1)     // Catch:{ all -> 0x0a21 }
            r1 = 16
            r0 = 5
            X.C26292Cx1.A03(r2, r3, r0, r1)     // Catch:{ all -> 0x0a21 }
            r3 = 31
            byte r1 = r2[r3]     // Catch:{ all -> 0x0a21 }
            r0 = r4[r18]     // Catch:{ all -> 0x0a21 }
            r0 = r0 & 1
            int r0 = r0 << 7
            X.BE6.A1N(r2, r0, r1, r3)     // Catch:{ all -> 0x0a21 }
            if (r5 == 0) goto L_0x01c4
            r0 = r60
            boolean r0 = java.util.Arrays.equals(r2, r0)     // Catch:{ all -> 0x0a21 }
            if (r0 == 0) goto L_0x01c4
            r18 = 1
            goto L_0x01c4
        L_0x0a1c:
            monitor-exit(r16)
            return r18
        L_0x0a1e:
            r0 = move-exception
            monitor-exit(r29)     // Catch:{ all -> 0x0a1e }
            throw r0     // Catch:{ all -> 0x0a21 }
        L_0x0a21:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24172Bwg.A00(X.DYl, byte[]):boolean");
    }
}
