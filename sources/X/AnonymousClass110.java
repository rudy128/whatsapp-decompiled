package X;

import java.util.Arrays;

/* renamed from: X.110  reason: invalid class name */
public final class AnonymousClass110<K, V> extends C201110w<K, V> {
    public static final C201110w EMPTY = new AnonymousClass110((Object) null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient Object[] alternatingKeysAndValues;
    public final transient Object hashTable;
    public final transient int size;

    public static AnonymousClass110 create(int i, Object[] objArr) {
        return create(i, objArr, (C201210x) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object createHashTable(java.lang.Object[] r17, int r18, int r19, int r20) {
        /*
            r16 = 0
            r8 = 0
            r7 = 1
            r10 = r18
            if (r10 != r7) goto L_0x0016
            r1 = r17[r16]
            r1.getClass()
            r0 = r17[r7]
            r0.getClass()
            X.C201310y.checkEntryNotNull(r1, r0)
            return r8
        L_0x0016:
            r1 = r19
            int r15 = r19 + -1
            r0 = 128(0x80, float:1.794E-43)
            r9 = 3
            r6 = -1
            r14 = 2
            if (r1 > r0) goto L_0x0087
            byte[] r3 = new byte[r1]
            java.util.Arrays.fill(r3, r6)
            r5 = 0
            r4 = 0
        L_0x0028:
            if (r5 >= r10) goto L_0x0077
            int r0 = r5 * 2
            int r11 = r4 * 2
            r6 = r17[r0]
            r6.getClass()
            r0 = r0 ^ 1
            r2 = r17[r0]
            r2.getClass()
            X.C201310y.checkEntryNotNull(r6, r2)
            int r0 = r6.hashCode()
            int r12 = X.AnonymousClass111.smear(r0)
        L_0x0045:
            r12 = r12 & r15
            byte r1 = r3[r12]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x005d
            byte r0 = (byte) r11
            r3[r12] = r0
            if (r4 >= r5) goto L_0x0058
            r17[r11] = r6
            r0 = r11 ^ 1
            r17[r0] = r2
        L_0x0058:
            int r4 = r4 + 1
        L_0x005a:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x005d:
            r0 = r17[r1]
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0074
            r1 = r1 ^ 1
            r0 = r17[r1]
            r0.getClass()
            X.2j2 r8 = new X.2j2
            r8.<init>(r6, r2, r0)
            r17[r1] = r2
            goto L_0x005a
        L_0x0074:
            int r12 = r12 + 1
            goto L_0x0045
        L_0x0077:
            if (r4 == r10) goto L_0x0086
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r16] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1[r7] = r0
            r1[r14] = r8
            return r1
        L_0x0086:
            return r3
        L_0x0087:
            r0 = 32768(0x8000, float:4.5918E-41)
            if (r1 > r0) goto L_0x00f3
            short[] r3 = new short[r1]
            java.util.Arrays.fill(r3, r6)
            r5 = 0
            r4 = 0
        L_0x0093:
            if (r5 >= r10) goto L_0x00e3
            int r0 = r5 * 2
            int r11 = r4 * 2
            r6 = r17[r0]
            r6.getClass()
            r0 = r0 ^ 1
            r2 = r17[r0]
            r2.getClass()
            X.C201310y.checkEntryNotNull(r6, r2)
            int r0 = r6.hashCode()
            int r12 = X.AnonymousClass111.smear(r0)
        L_0x00b0:
            r12 = r12 & r15
            short r1 = r3[r12]
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x00c9
            short r0 = (short) r11
            r3[r12] = r0
            if (r4 >= r5) goto L_0x00c4
            r17[r11] = r6
            r0 = r11 ^ 1
            r17[r0] = r2
        L_0x00c4:
            int r4 = r4 + 1
        L_0x00c6:
            int r5 = r5 + 1
            goto L_0x0093
        L_0x00c9:
            r0 = r17[r1]
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00e0
            r1 = r1 ^ 1
            r0 = r17[r1]
            r0.getClass()
            X.2j2 r8 = new X.2j2
            r8.<init>(r6, r2, r0)
            r17[r1] = r2
            goto L_0x00c6
        L_0x00e0:
            int r12 = r12 + 1
            goto L_0x00b0
        L_0x00e3:
            if (r4 == r10) goto L_0x00f2
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r16] = r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1[r7] = r0
            r1[r14] = r8
            return r1
        L_0x00f2:
            return r3
        L_0x00f3:
            int[] r5 = new int[r1]
            java.util.Arrays.fill(r5, r6)
            r4 = 0
            r3 = 0
        L_0x00fa:
            if (r4 >= r10) goto L_0x0145
            int r0 = r4 * 2
            int r13 = r3 * 2
            r11 = r17[r0]
            r11.getClass()
            r0 = r0 ^ 1
            r2 = r17[r0]
            r2.getClass()
            X.C201310y.checkEntryNotNull(r11, r2)
            int r0 = r11.hashCode()
            int r12 = X.AnonymousClass111.smear(r0)
        L_0x0117:
            r12 = r12 & r15
            r1 = r5[r12]
            if (r1 != r6) goto L_0x012b
            r5[r12] = r13
            if (r3 >= r4) goto L_0x0126
            r17[r13] = r11
            r0 = r13 ^ 1
            r17[r0] = r2
        L_0x0126:
            int r3 = r3 + 1
        L_0x0128:
            int r4 = r4 + 1
            goto L_0x00fa
        L_0x012b:
            r0 = r17[r1]
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0142
            r1 = r1 ^ 1
            r0 = r17[r1]
            r0.getClass()
            X.2j2 r8 = new X.2j2
            r8.<init>(r11, r2, r0)
            r17[r1] = r2
            goto L_0x0128
        L_0x0142:
            int r12 = r12 + 1
            goto L_0x0117
        L_0x0145:
            if (r3 == r10) goto L_0x0154
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r16] = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1[r7] = r0
            r1[r14] = r8
            return r1
        L_0x0154:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass110.createHashTable(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public C199410f createEntrySet() {
        return new C23554Blh(this, this.alternatingKeysAndValues, 0, this.size);
    }

    public C199410f createKeySet() {
        return new AnonymousClass2AL(this, new C28591aa(this.alternatingKeysAndValues, 0, this.size));
    }

    public C199310e createValues() {
        return new C28591aa(this.alternatingKeysAndValues, 1, this.size);
    }

    public Object get(Object obj) {
        Object obj2 = get(this.hashTable, this.alternatingKeysAndValues, this.size, 0, obj);
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    public AnonymousClass110(Object obj, Object[] objArr, int i) {
        this.hashTable = obj;
        this.alternatingKeysAndValues = objArr;
        this.size = i;
    }

    public int size() {
        return this.size;
    }

    public Object writeReplace() {
        return super.writeReplace();
    }

    public static AnonymousClass110 create(int i, Object[] objArr, C201210x r6) {
        if (i == 0) {
            return (AnonymousClass110) EMPTY;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            Object obj2 = objArr[1];
            obj2.getClass();
            C201310y.checkEntryNotNull(obj, obj2);
            return new AnonymousClass110((Object) null, objArr, 1);
        }
        C199610h.A02(i, objArr.length >> 1);
        Object createHashTable = createHashTable(objArr, i, C199410f.chooseTableSize(i), 0);
        if (createHashTable instanceof Object[]) {
            Object[] objArr2 = (Object[]) createHashTable;
            C57412j2 r0 = (C57412j2) objArr2[2];
            if (r6 != null) {
                r6.duplicateKey = r0;
                Object obj3 = objArr2[0];
                i = ((Number) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, i * 2);
                createHashTable = obj3;
            } else {
                throw r0.exception();
            }
        }
        return new AnonymousClass110(createHashTable, objArr, i);
    }

    public static Object get(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        int i3;
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[0];
            obj3.getClass();
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[1];
            obj4.getClass();
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int smear = AnonymousClass111.smear(obj2.hashCode());
                while (true) {
                    int i4 = smear & length;
                    i3 = bArr[i4] & 255;
                    if (i3 != 255) {
                        if (obj2.equals(objArr[i3])) {
                            break;
                        }
                        smear = i4 + 1;
                    } else {
                        return null;
                    }
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int smear2 = AnonymousClass111.smear(obj2.hashCode());
                while (true) {
                    int i5 = smear2 & length2;
                    i3 = sArr[i5] & 65535;
                    if (i3 != 65535) {
                        if (obj2.equals(objArr[i3])) {
                            break;
                        }
                        smear2 = i5 + 1;
                    } else {
                        return null;
                    }
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int smear3 = AnonymousClass111.smear(obj2.hashCode());
                while (true) {
                    int i6 = smear3 & length3;
                    i3 = iArr[i6];
                    if (i3 != -1) {
                        if (obj2.equals(objArr[i3])) {
                            break;
                        }
                        smear3 = i6 + 1;
                    } else {
                        return null;
                    }
                }
            }
            return objArr[i3 ^ 1];
        }
    }
}
