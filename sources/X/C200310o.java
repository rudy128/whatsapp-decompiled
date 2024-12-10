package X;

import java.util.Arrays;

/* renamed from: X.10o  reason: invalid class name and case insensitive filesystem */
public abstract class C200310o extends C200210n {
    public static final void A02(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        C18070vi.A0d(iArr, 0);
        C18070vi.A0d(iArr2, 1);
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static /* synthetic */ void A04(int i, int i2, int[] iArr, int[] iArr2) {
        if ((i2 & 8) != 0) {
            i = iArr.length;
        }
        A02(0, 0, i, iArr, iArr2);
    }

    public static final void A05(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        C18070vi.A0d(jArr, 0);
        C18070vi.A0d(jArr2, 1);
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static final void A06(Object[] objArr, int i, int i2) {
        C18070vi.A0d(objArr, 0);
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static final void A07(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        C18070vi.A0d(objArr, 0);
        C18070vi.A0d(objArr2, 1);
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static final byte[] A09(byte[] bArr, int i, int i2) {
        C18070vi.A0d(bArr, 0);
        C200110m.A00(i2, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C18070vi.A0X(copyOfRange);
        return copyOfRange;
    }

    public static final byte[] A0A(byte[] bArr, byte[] bArr2) {
        C18070vi.A0d(bArr, 0);
        C18070vi.A0d(bArr2, 1);
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        C18070vi.A0b(copyOf);
        return copyOf;
    }

    public static final int[] A0B(int[] iArr, int i) {
        C18070vi.A0d(iArr, 0);
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i;
        return copyOf;
    }

    public static final int[] A0C(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        C18070vi.A0b(copyOf);
        return copyOf;
    }

    public static final Object[] A0D(Object obj, Object[] objArr) {
        C18070vi.A0d(objArr, 0);
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        return copyOf;
    }

    public static final Object[] A0E(Object[] objArr, int i, int i2) {
        C18070vi.A0d(objArr, 0);
        C200110m.A00(i2, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i2);
        C18070vi.A0X(copyOfRange);
        return copyOfRange;
    }

    public static final Object[] A0F(Object[] objArr, Object[] objArr2) {
        C18070vi.A0d(objArr, 0);
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        C18070vi.A0b(copyOf);
        return copyOf;
    }
}
