package X;

import java.util.Arrays;

/* renamed from: X.002  reason: invalid class name */
public abstract class AnonymousClass002 {
    public static float A00(float[] fArr, float[] fArr2, int i, int i2) {
        int i3 = i * 4;
        return (fArr[i3] * fArr2[i2]) + (fArr[i3 + 1] * fArr2[i2 + 4]) + (fArr[i3 + 2] * fArr2[i2 + 8]) + (fArr[i3 + 3] * fArr2[i2 + 12]);
    }

    public static long A01(long[] jArr, int i) {
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        return ((jArr[i2 + 1] << (64 - i3)) & ((-((long) i3)) >> 63)) | (jArr[i2] >>> i3);
    }

    public static IllegalStateException A02(Object obj, String str, String str2, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while pushing ");
        sb.append(obj);
        sb.append(". Not all arguments were provided. Missing ");
        sb.append(i);
        sb.append(" int arguments (");
        sb.append(str);
        sb.append(") and ");
        sb.append(i2);
        sb.append(" object arguments (");
        sb.append(str2);
        sb.append(").");
        return new IllegalStateException(sb.toString());
    }

    public static void A04(Object obj, Object obj2) {
        C17130tn r2 = (C17130tn) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && r2.BZO()) {
            r2.CNR();
        }
    }

    public static void A05(Object obj, Object obj2) {
        C17130tn r2 = (C17130tn) obj;
        if ((((Number) obj2).intValue() & 81) == 16 && r2.BZO()) {
            r2.CNR();
        }
    }

    public static void A06(long[] jArr, int i) {
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (j ^ -1)) | j;
    }

    public static long[] A07(int i) {
        if (i == 0) {
            return AnonymousClass0GO.A00;
        }
        int i2 = ((((i + 1) + 7) + 7) & -8) >> 3;
        long[] jArr = new long[i2];
        Arrays.fill(jArr, 0, i2, -9187201950435737472L);
        return jArr;
    }

    public static Object A03(C17130tn r2) {
        r2.COB(-492369756);
        Object CER = r2.CER();
        if (CER != AnonymousClass0MH.A00) {
            return CER;
        }
        C05500Um r0 = new C05500Um();
        ((AnonymousClass0VR) r2).A0c(r0);
        return r0;
    }
}
