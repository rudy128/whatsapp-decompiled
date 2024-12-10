package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class A6Y {
    public static final A6Y A01 = new C192939pH().A00();
    public static final String A02 = A5Z.A01("Data");
    public Map A00;

    public boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                Map map = this.A00;
                Set keySet = map.keySet();
                Map map2 = ((A6Y) obj).A00;
                if (keySet.equals(map2.keySet())) {
                    for (Object next : keySet) {
                        Object obj2 = map.get(next);
                        Object obj3 = map2.get(next);
                        if (obj2 != null) {
                            if (obj3 != null) {
                                if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                                    equals = obj2.equals(obj3);
                                } else {
                                    equals = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                                }
                                if (!equals) {
                                }
                            }
                        } else if (obj2 == obj3) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.A6Y, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042 A[SYNTHETIC, Splitter:B:20:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.A6Y A00(byte[] r7) {
        /*
            java.lang.String r3 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L_0x0079
            java.util.HashMap r5 = X.C17880vN.A11()
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            r6.<init>(r7)
            r1 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0039, all -> 0x0037 }
            r4.<init>(r6)     // Catch:{ IOException | ClassNotFoundException -> 0x0039, all -> 0x0037 }
            int r2 = r4.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0035 }
        L_0x001a:
            if (r2 <= 0) goto L_0x002a
            java.lang.String r1 = r4.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0035 }
            java.lang.Object r0 = r4.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0035 }
            r5.put(r1, r0)     // Catch:{ IOException | ClassNotFoundException -> 0x0035 }
            int r2 = r2 + -1
            goto L_0x001a
        L_0x002a:
            r4.close()     // Catch:{ IOException -> 0x002e }
            goto L_0x004a
        L_0x002e:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            goto L_0x004a
        L_0x0035:
            r0 = move-exception
            goto L_0x003b
        L_0x0037:
            r2 = move-exception
            goto L_0x006e
        L_0x0039:
            r0 = move-exception
            r4 = r1
        L_0x003b:
            java.lang.String r1 = A02     // Catch:{ all -> 0x0061 }
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x0061 }
            if (r4 == 0) goto L_0x004a
            r4.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
        L_0x004a:
            r6.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x0054
        L_0x004e:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0054:
            X.A6Y r1 = new X.A6Y
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r5)
            r1.A00 = r0
            return r1
        L_0x0061:
            r2 = move-exception
            if (r4 == 0) goto L_0x006e
            r4.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x006e
        L_0x0068:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x006e:
            r6.close()     // Catch:{ IOException -> 0x0072 }
            throw r2
        L_0x0072:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            throw r2
        L_0x0079:
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0n(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6Y.A00(byte[]):X.A6Y");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b A[SYNTHETIC, Splitter:B:28:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082 A[SYNTHETIC, Splitter:B:42:0x0082] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(X.A6Y r7) {
        /*
            java.lang.String r3 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r4 = X.C108945cZ.A15()
            r6 = 0
            java.io.ObjectOutputStream r5 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x005f }
            r5.<init>(r4)     // Catch:{ IOException -> 0x005f }
            java.util.Map r0 = r7.A00     // Catch:{ IOException -> 0x005c, all -> 0x007e }
            int r0 = r0.size()     // Catch:{ IOException -> 0x005c, all -> 0x007e }
            r5.writeInt(r0)     // Catch:{ IOException -> 0x005c, all -> 0x007e }
            java.util.Map r0 = r7.A00     // Catch:{ IOException -> 0x005c, all -> 0x007e }
            java.util.Iterator r2 = X.AnonymousClass000.A15(r0)     // Catch:{ IOException -> 0x005c, all -> 0x007e }
        L_0x001b:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x005c, all -> 0x007e }
            if (r0 == 0) goto L_0x0034
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r2)     // Catch:{ IOException -> 0x005c, all -> 0x007e }
            java.lang.String r0 = X.C17880vN.A0x(r1)     // Catch:{ IOException -> 0x005c, all -> 0x007e }
            r5.writeUTF(r0)     // Catch:{ IOException -> 0x005c, all -> 0x007e }
            java.lang.Object r0 = r1.getValue()     // Catch:{ IOException -> 0x005c, all -> 0x007e }
            r5.writeObject(r0)     // Catch:{ IOException -> 0x005c, all -> 0x007e }
            goto L_0x001b
        L_0x0034:
            r5.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003e
        L_0x0038:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x003e:
            r4.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0048
        L_0x0042:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x0048:
            int r1 = r4.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r0) goto L_0x0055
            byte[] r2 = r4.toByteArray()
            return r2
        L_0x0055:
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0n(r0)
            throw r2
        L_0x005c:
            r0 = move-exception
            r6 = r5
            goto L_0x0060
        L_0x005f:
            r0 = move-exception
        L_0x0060:
            java.lang.String r1 = A02     // Catch:{ all -> 0x007c }
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x007c }
            byte[] r2 = r4.toByteArray()     // Catch:{ all -> 0x007c }
            if (r6 == 0) goto L_0x0073
            r6.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x0073
        L_0x006f:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
        L_0x0073:
            r4.close()     // Catch:{ IOException -> 0x0077 }
            return r2
        L_0x0077:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
            return r2
        L_0x007c:
            r2 = move-exception
            goto L_0x0080
        L_0x007e:
            r2 = move-exception
            r6 = r5
        L_0x0080:
            if (r6 == 0) goto L_0x008c
            r6.close()     // Catch:{ IOException -> 0x0086 }
            goto L_0x008c
        L_0x0086:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
        L_0x008c:
            r4.close()     // Catch:{ IOException -> 0x0090 }
            throw r2
        L_0x0090:
            r1 = move-exception
            java.lang.String r0 = A02
            android.util.Log.e(r0, r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A6Y.A01(X.A6Y):byte[]");
    }

    public int A02(String str, int i) {
        Object obj = this.A00.get(str);
        if (obj instanceof Integer) {
            return AnonymousClass000.A0M(obj);
        }
        return i;
    }

    public String A03(String str) {
        return AnonymousClass8BX.A0e(str, this.A00);
    }

    public int[] A04(String str) {
        Object obj = this.A00.get(str);
        if (!(obj instanceof Integer[])) {
            return null;
        }
        Integer[] numArr = (Integer[]) obj;
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public int hashCode() {
        return this.A00.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        Map map = this.A00;
        if (!map.isEmpty()) {
            Iterator A0x = AnonymousClass8BU.A0x(map);
            while (A0x.hasNext()) {
                String A0v = C17880vN.A0v(A0x);
                sb.append(A0v);
                sb.append(" : ");
                Object obj = map.get(A0v);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        return AnonymousClass000.A0y("}", sb);
    }
}
