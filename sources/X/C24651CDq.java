package X;

/* renamed from: X.CDq  reason: case insensitive filesystem */
public abstract class C24651CDq {
    public static void A00(byte[] bArr, int[] iArr) {
        byte[] bArr2 = bArr;
        long A0F = BEB.A0F(bArr2, 0) | BEA.A0J(bArr2, 0);
        long A0J = (BEA.A0J(bArr2, 4) | BEB.A0F(bArr2, 4)) << 6;
        long A0F2 = BEB.A0F(bArr2, 7);
        long A0J2 = (BEA.A0J(bArr2, 10) | BEB.A0F(bArr2, 10)) << 3;
        long A0F3 = BEB.A0F(bArr2, 13);
        long A0F4 = ((((long) bArr2[19]) << 24) & 4278190080L) | BEB.A0F(bArr2, 16) | BEA.A0J(bArr2, 16);
        long A0F5 = BEB.A0F(bArr2, 20);
        long A0J3 = (BEA.A0J(bArr2, 23) | BEB.A0F(bArr2, 23)) << 5;
        long A0F6 = BEB.A0F(bArr2, 26);
        long A0J4 = ((BEA.A0J(bArr2, 29) | BEB.A0F(bArr2, 29)) & 8388607) << 2;
        long j = (A0J4 + 16777216) >> 25;
        long j2 = (((((long) bArr[3]) << 24) & 4278190080L) | A0F) + (19 * j);
        long j3 = (A0J + 16777216) >> 25;
        long A0J5 = ((BEA.A0J(bArr2, 7) | A0F2) << 5) + j3;
        long j4 = A0J - (j3 << 25);
        long j5 = (A0J2 + 16777216) >> 25;
        long A0J6 = ((BEA.A0J(bArr2, 13) | A0F3) << 2) + j5;
        long j6 = A0J2 - (j5 << 25);
        long j7 = (A0F4 + 16777216) >> 25;
        long A0J7 = ((BEA.A0J(bArr2, 20) | A0F5) << 7) + j7;
        long j8 = A0F4 - (j7 << 25);
        long j9 = (A0J3 + 16777216) >> 25;
        long A0J8 = ((BEA.A0J(bArr2, 26) | A0F6) << 4) + j9;
        long j10 = A0J3 - (j9 << 25);
        long j11 = (j2 + 33554432) >> 26;
        long j12 = j4 + j11;
        long j13 = j2 - (j11 << 26);
        long j14 = (A0J5 + 33554432) >> 26;
        long j15 = j6 + j14;
        long j16 = A0J5 - (j14 << 26);
        long j17 = (A0J6 + 33554432) >> 26;
        long j18 = j8 + j17;
        long j19 = A0J6 - (j17 << 26);
        long j20 = (A0J7 + 33554432) >> 26;
        long j21 = j10 + j20;
        long j22 = A0J7 - (j20 << 26);
        long j23 = (A0J8 + 33554432) >> 26;
        iArr[0] = (int) j13;
        iArr[1] = (int) j12;
        iArr[2] = (int) j16;
        iArr[3] = (int) j15;
        iArr[4] = (int) j19;
        iArr[5] = (int) j18;
        iArr[6] = (int) j22;
        iArr[7] = (int) j21;
        iArr[8] = (int) (A0J8 - (j23 << 26));
        iArr[9] = (int) ((A0J4 - (j << 25)) + j23);
    }
}
