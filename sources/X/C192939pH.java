package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9pH  reason: invalid class name and case insensitive filesystem */
public final class C192939pH {
    public Map A00 = C17880vN.A11();

    /* JADX WARNING: type inference failed for: r1v0, types: [X.A6Y, java.lang.Object] */
    public A6Y A00() {
        Map map = this.A00;
        ? obj = new Object();
        obj.A00 = new HashMap(map);
        A6Y.A01(obj);
        return obj;
    }

    public void A01(String str, int[] iArr) {
        Map map = this.A00;
        A6Y a6y = A6Y.A01;
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            C17880vN.A1T(numArr, iArr[i], i);
        }
        map.put(str, numArr);
    }

    public void A02(Map map) {
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String A0x = C17880vN.A0x(A16);
            Object value = A16.getValue();
            if (value == null) {
                this.A00.put(A0x, (Object) null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.A00.put(A0x, value);
                } else if (cls == boolean[].class) {
                    Map map2 = this.A00;
                    boolean[] zArr = (boolean[]) value;
                    A6Y a6y = A6Y.A01;
                    int length = zArr.length;
                    Boolean[] boolArr = new Boolean[length];
                    for (int i = 0; i < length; i++) {
                        AnonymousClass8BR.A1L(boolArr, i, zArr[i]);
                    }
                    map2.put(A0x, boolArr);
                } else if (cls == byte[].class) {
                    Map map3 = this.A00;
                    byte[] bArr = (byte[]) value;
                    A6Y a6y2 = A6Y.A01;
                    int length2 = bArr.length;
                    Byte[] bArr2 = new Byte[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        bArr2[i2] = Byte.valueOf(bArr[i2]);
                    }
                    map3.put(A0x, bArr2);
                } else if (cls == int[].class) {
                    Map map4 = this.A00;
                    int[] iArr = (int[]) value;
                    A6Y a6y3 = A6Y.A01;
                    int length3 = iArr.length;
                    Integer[] numArr = new Integer[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        C17880vN.A1T(numArr, iArr[i3], i3);
                    }
                    map4.put(A0x, numArr);
                } else if (cls == long[].class) {
                    Map map5 = this.A00;
                    long[] jArr = (long[]) value;
                    A6Y a6y4 = A6Y.A01;
                    int length4 = jArr.length;
                    Long[] lArr = new Long[length4];
                    for (int i4 = 0; i4 < length4; i4++) {
                        AnonymousClass3MX.A1S(lArr, i4, jArr[i4]);
                    }
                    map5.put(A0x, lArr);
                } else if (cls == float[].class) {
                    Map map6 = this.A00;
                    float[] fArr = (float[]) value;
                    A6Y a6y5 = A6Y.A01;
                    int length5 = fArr.length;
                    Float[] fArr2 = new Float[length5];
                    for (int i5 = 0; i5 < length5; i5++) {
                        fArr2[i5] = Float.valueOf(fArr[i5]);
                    }
                    map6.put(A0x, fArr2);
                } else if (cls == double[].class) {
                    Map map7 = this.A00;
                    double[] dArr = (double[]) value;
                    A6Y a6y6 = A6Y.A01;
                    int length6 = dArr.length;
                    Double[] dArr2 = new Double[length6];
                    for (int i6 = 0; i6 < length6; i6++) {
                        dArr2[i6] = Double.valueOf(dArr[i6]);
                    }
                    map7.put(A0x, dArr2);
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Key ");
                    A10.append(A0x);
                    throw AnonymousClass8BX.A0V(cls, " has invalid type ", A10);
                }
            }
        }
    }
}
