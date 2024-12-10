package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;

public class D3C implements Parcelable.Creator {
    public final Class A00;

    public static int A00(Parcel parcel, int i) {
        if ((i & -65536) != -65536) {
            return (i >> 16) & 65535;
        }
        return parcel.readInt();
    }

    public static Parcelable.Creator A01(Class cls) {
        try {
            Field declaredField = cls.getDeclaredField("CREATOR");
            declaredField.setAccessible(true);
            return (Parcelable.Creator) declaredField.get((Object) null);
        } catch (NoSuchFieldException unused) {
            throw BE9.A0n(" is an Parcelable without CREATOR", C17890vO.A0f(cls));
        } catch (IllegalAccessException unused2) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("CREATOR in ");
            A10.append(cls);
            throw BE9.A0n(" is not accessible", A10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x024f, code lost:
        A03(r13, r6, 4);
        r17 = r13.readInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0259, code lost:
        if (r2 == -1) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0260, code lost:
        if (((long) r17) <= r2) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0262, code lost:
        r1 = new java.lang.Object[3];
        r1[0] = r5.getDeclaringClass().getName();
        X.BE8.A1A(java.lang.Long.valueOf(r2), r1, 1, r17, 2);
        X.BE7.A1L("Version code of %s (%d) is older than object read (%d).", "SafeParcel", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x027d, code lost:
        r5.set(r11, java.lang.Integer.valueOf(r17));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0286, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x028a, code lost:
        if (r2 != 0) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x028c, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028e, code lost:
        r0 = r13.dataPosition();
        r1 = r13.createIntArray();
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x029a, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x029f, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02a3, code lost:
        if (r2 != 0) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02a5, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02a7, code lost:
        r0 = r13.dataPosition();
        r1 = r13.createByteArray();
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02b3, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b8, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02bc, code lost:
        if (r2 != 0) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02be, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02c0, code lost:
        r0 = r13.dataPosition();
        r1 = r13.createStringArray();
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02cc, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02d1, code lost:
        r0 = (org.microg.safeparcel.SafeParcelable.Field) r5.getAnnotation(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d7, code lost:
        if (r0 == null) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02d9, code lost:
        r1 = r0.subClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02df, code lost:
        if (r1 == org.microg.safeparcel.SafeParcelable.class) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02e1, code lost:
        if (r1 == null) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e9, code lost:
        if (android.os.Parcelable.class.isAssignableFrom(r1) == false) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ef, code lost:
        if (X.C25361CeL.A01(r5) == false) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02f1, code lost:
        r1 = r5.getDeclaringClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02f5, code lost:
        if (r1 == null) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02fb, code lost:
        if (r1.getClassLoader() == null) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02fd, code lost:
        r1 = r1.getClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0301, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0305, code lost:
        if (r2 != 0) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0308, code lost:
        r1 = java.lang.ClassLoader.getSystemClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x030d, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x030f, code lost:
        r0 = r13.dataPosition();
        r1 = r13.readBundle(r1);
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x031b, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x031f, code lost:
        r0 = (org.microg.safeparcel.SafeParcelable.Field) r5.getAnnotation(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0325, code lost:
        if (r0 == null) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0327, code lost:
        r1 = r0.subClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x032d, code lost:
        if (r1 == org.microg.safeparcel.SafeParcelable.class) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x032f, code lost:
        if (r1 == null) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0332, code lost:
        r1 = java.lang.ClassLoader.getSystemClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x033b, code lost:
        if (r1.getClassLoader() == null) goto L_0x0332;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x033d, code lost:
        r1 = r1.getClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0341, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0345, code lost:
        if (r2 != 0) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0347, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0349, code lost:
        r0 = r13.dataPosition();
        r1 = r13.readHashMap(r1);
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0355, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0359, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x035d, code lost:
        if (r2 != 0) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x035f, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0361, code lost:
        r0 = r13.dataPosition();
        r1 = r13.createStringArrayList();
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x036d, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0371, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0375, code lost:
        if (r2 != 0) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0377, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0379, code lost:
        r0 = r13.dataPosition();
        r1 = r13.readStrongBinder();
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0385, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x038f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r1 = new java.lang.Object[2];
        X.C17880vN.A1T(r1, r14, 0);
        r1[1] = r24.getName();
        android.util.Log.w("SafeParcel", java.lang.String.format("Error reading field: %d in %s, skipping.", r1), r2);
        r13.setDataPosition(r13.dataPosition() + A00(r13, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b6, code lost:
        if (r13.dataPosition() > r7) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03b8, code lost:
        r23.setAccessible(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03bf, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03c0, code lost:
        r1 = X.BEA.A0h("Overread allowed size end=", X.AnonymousClass000.A10(), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03cb, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Size read is invalid start=");
        r1.append(r2);
        r1 = new X.DZs(X.AnonymousClass001.A1I(" end=", r1, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03e3, code lost:
        r1 = X.AnonymousClass000.A10();
        X.BE9.A1J("Expected object header. Got 0x", r1, r3);
        r1 = new X.DZs(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        r13 = r26;
        r3 = r13.readInt();
        r7 = A00(r13, r3);
        r2 = r13.dataPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        if ((r3 & 65535) != 20293) goto L_0x03e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        r7 = r7 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r7 < r2) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        if (r7 > r13.dataSize()) goto L_0x03cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0086, code lost:
        if (r13.dataPosition() >= r7) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        r6 = r13.readInt();
        r14 = r6 & 65535;
        r5 = (java.lang.reflect.Field) r10.get(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        if (r5 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        r1 = new java.lang.Object[2];
        X.C17880vN.A1T(r1, r14, 0);
        r1[1] = r24.getName();
        X.BE7.A1L("Unknown field id %d in %s, skipping.", "SafeParcel", r1);
        r13.setDataPosition(r13.dataPosition() + A00(r13, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r21 = r5.isAccessible();
        r5.setAccessible(true);
        r1 = org.microg.safeparcel.SafeParcelable.Field.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c7, code lost:
        if (r5.isAnnotationPresent(r1) == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c9, code lost:
        r2 = ((org.microg.safeparcel.SafeParcelable.Field) r5.getAnnotation(r1)).versionCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00de, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e1, code lost:
        switch(X.C24645CDj.A00(r5).intValue()) {
            case 0: goto L_0x0154;
            case 1: goto L_0x0371;
            case 2: goto L_0x0359;
            case 3: goto L_0x0105;
            case 4: goto L_0x02d1;
            case 5: goto L_0x00e6;
            case 6: goto L_0x02b8;
            case 7: goto L_0x029f;
            case 8: goto L_0x0173;
            case 9: goto L_0x0286;
            case 10: goto L_0x024f;
            case 11: goto L_0x021b;
            case 12: goto L_0x0206;
            case 13: goto L_0x01f5;
            case 14: goto L_0x01e3;
            case 15: goto L_0x01ca;
            case 16: goto L_0x031f;
            default: goto L_0x00e4;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e6, code lost:
        r0 = A02(r5);
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ee, code lost:
        if (r2 != 0) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f0, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f2, code lost:
        r1 = r13.dataPosition();
        r0 = (android.os.Parcelable[]) r13.createTypedArray(r0);
        r13.setDataPosition(r1 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0100, code lost:
        r5.set(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0105, code lost:
        r1 = X.C25361CeL.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0109, code lost:
        if (r1 == null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0111, code lost:
        if (android.os.Parcelable.class.isAssignableFrom(r1) == false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0117, code lost:
        if (X.C25361CeL.A01(r5) != false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0119, code lost:
        r0 = A01(r1);
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0121, code lost:
        if (r2 == 0) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0123, code lost:
        r1 = r13.dataPosition();
        r0 = r13.createTypedArrayList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012b, code lost:
        r13.setDataPosition(r1 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012f, code lost:
        r5.set(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0134, code lost:
        r0 = java.lang.ClassLoader.getSystemClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013d, code lost:
        if (r1.getClassLoader() == null) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013f, code lost:
        r0 = r1.getClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0143, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0147, code lost:
        if (r2 == 0) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0149, code lost:
        r1 = r13.dataPosition();
        r0 = r13.readArrayList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0152, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        r0 = A02(r5);
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015c, code lost:
        if (r2 != 0) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015e, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0160, code lost:
        r1 = r13.dataPosition();
        r0 = (android.os.Parcelable) r0.createFromParcel(r13);
        r13.setDataPosition(r1 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016e, code lost:
        r5.set(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0173, code lost:
        r1 = r5.getType().getDeclaredClasses();
        r18 = r1.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ca, code lost:
        r2 = A00(r13, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ce, code lost:
        if (r2 != 0) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d0, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d2, code lost:
        r0 = r13.dataPosition();
        r1 = r13.readString();
        r13.setDataPosition(r0 + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01de, code lost:
        r5.set(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e3, code lost:
        A03(r13, r6, 8);
        r5.set(r11, java.lang.Double.valueOf(r13.readDouble()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f5, code lost:
        A03(r13, r6, 4);
        r5.set(r11, java.lang.Float.valueOf(r13.readFloat()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0206, code lost:
        A03(r13, r6, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r5.set(r11, java.lang.Boolean.valueOf(X.AnonymousClass000.A1O(r13.readInt())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x021b, code lost:
        A03(r13, r6, 8);
        r16 = r13.readLong();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0226, code lost:
        if (r2 == -1) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022a, code lost:
        if (r16 <= r2) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x022c, code lost:
        r15 = new java.lang.Object[3];
        r15[0] = r5.getDeclaringClass().getName();
        X.AnonymousClass3MX.A1S(r15, 1, r2);
        X.AnonymousClass3MX.A1S(r15, 2, r16);
        X.BE7.A1L("Version code of %s (%d) is older than object read (%d).", "SafeParcel", r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0246, code lost:
        r5.set(r11, java.lang.Long.valueOf(r16));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r26) {
        /*
            r25 = this;
            r0 = r25
            java.lang.Class r2 = r0.A00
            r1 = 0
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.reflect.Constructor r23 = r2.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            boolean r22 = r23.isAccessible()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r12 = 1
            r0 = r23
            r0.setAccessible(r12)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.Object r11 = r0.newInstance(r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            org.microg.safeparcel.SafeParcelable r11 = (org.microg.safeparcel.SafeParcelable) r11     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            if (r11 == 0) goto L_0x03f6
            java.lang.Class r6 = r11.getClass()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r24 = r6
            android.util.SparseArray r10 = X.BE6.A0Q()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
        L_0x0029:
            r9 = 2
            r8 = 0
            if (r6 == 0) goto L_0x0062
            java.lang.reflect.Field[] r5 = r6.getDeclaredFields()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r4 = r5.length     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r2 = 0
        L_0x0033:
            if (r2 >= r4) goto L_0x0057
            r3 = r5[r2]     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.Class<org.microg.safeparcel.SafeParcelable$Field> r1 = org.microg.safeparcel.SafeParcelable.Field.class
            boolean r0 = r3.isAnnotationPresent(r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            if (r0 == 0) goto L_0x0054
            java.lang.annotation.Annotation r0 = r3.getAnnotation(r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            if (r0 == 0) goto L_0x005c
            int r1 = r0.value()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.Object r0 = r10.get(r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            if (r0 != 0) goto L_0x03fb
            r10.put(r1, r3)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0057:
            java.lang.Class r6 = r6.getSuperclass()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x0029
        L_0x005c:
            java.lang.IllegalStateException r1 = X.BE6.A0k()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x0425
        L_0x0062:
            r13 = r26
            int r3 = r13.readInt()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r7 = A00(r13, r3)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r2 = r13.dataPosition()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r3 & r0
            r0 = 20293(0x4f45, float:2.8437E-41)
            if (r1 != r0) goto L_0x03e3
            int r7 = r7 + r2
            if (r7 < r2) goto L_0x03cb
            int r0 = r13.dataSize()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            if (r7 > r0) goto L_0x03cb
        L_0x0082:
            int r0 = r13.dataPosition()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            if (r0 >= r7) goto L_0x03b2
            int r6 = r13.readInt()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r14 = r6 & r0
            java.lang.Object r5 = r10.get(r14)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r4 = "SafeParcel"
            if (r5 != 0) goto L_0x00b8
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            X.C17880vN.A1T(r1, r14, r8)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = r24.getName()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r1[r12] = r0     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = "Unknown field id %d in %s, skipping."
            X.BE7.A1L(r0, r4, r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r1 = A00(r13, r6)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r0 = r13.dataPosition()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r0 = r0 + r1
            r13.setDataPosition(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x0082
        L_0x00b8:
            boolean r21 = r5.isAccessible()     // Catch:{ Exception -> 0x038f }
            r5.setAccessible(r12)     // Catch:{ Exception -> 0x038f }
            java.lang.Class<org.microg.safeparcel.SafeParcelable$Field> r1 = org.microg.safeparcel.SafeParcelable.Field.class
            boolean r0 = r5.isAnnotationPresent(r1)     // Catch:{ Exception -> 0x038f }
            r19 = -1
            if (r0 == 0) goto L_0x00de
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r1)     // Catch:{ Exception -> 0x038f }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x038f }
            long r2 = r0.versionCode()     // Catch:{ Exception -> 0x038f }
        L_0x00d3:
            java.lang.Integer r0 = X.C24645CDj.A00(r5)     // Catch:{ Exception -> 0x038f }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x038f }
            java.lang.String r18 = "Version code of %s (%d) is older than object read (%d)."
            goto L_0x00e1
        L_0x00de:
            r2 = -1
            goto L_0x00d3
        L_0x00e1:
            switch(r0) {
                case 0: goto L_0x0154;
                case 1: goto L_0x0371;
                case 2: goto L_0x0359;
                case 3: goto L_0x0105;
                case 4: goto L_0x02d1;
                case 5: goto L_0x00e6;
                case 6: goto L_0x02b8;
                case 7: goto L_0x029f;
                case 8: goto L_0x0173;
                case 9: goto L_0x0286;
                case 10: goto L_0x024f;
                case 11: goto L_0x021b;
                case 12: goto L_0x0206;
                case 13: goto L_0x01f5;
                case 14: goto L_0x01e3;
                case 15: goto L_0x01ca;
                case 16: goto L_0x031f;
                default: goto L_0x00e4;
            }     // Catch:{ Exception -> 0x038f }
        L_0x00e4:
            goto L_0x0388
        L_0x00e6:
            android.os.Parcelable$Creator r0 = A02(r5)     // Catch:{ Exception -> 0x038f }
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x038f }
            if (r2 != 0) goto L_0x00f2
            r0 = 0
            goto L_0x0100
        L_0x00f2:
            int r1 = r13.dataPosition()     // Catch:{ Exception -> 0x038f }
            java.lang.Object[] r0 = r13.createTypedArray(r0)     // Catch:{ Exception -> 0x038f }
            android.os.Parcelable[] r0 = (android.os.Parcelable[]) r0     // Catch:{ Exception -> 0x038f }
            int r1 = r1 + r2
            r13.setDataPosition(r1)     // Catch:{ Exception -> 0x038f }
        L_0x0100:
            r5.set(r11, r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x0105:
            java.lang.Class r1 = X.C25361CeL.A00(r5)     // Catch:{ Exception -> 0x038f }
            if (r1 == 0) goto L_0x0134
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ Exception -> 0x038f }
            if (r0 == 0) goto L_0x0139
            boolean r0 = X.C25361CeL.A01(r5)     // Catch:{ Exception -> 0x038f }
            if (r0 != 0) goto L_0x0139
            android.os.Parcelable$Creator r0 = A01(r1)     // Catch:{ Exception -> 0x038f }
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x038f }
            if (r2 == 0) goto L_0x0152
            int r1 = r13.dataPosition()     // Catch:{ Exception -> 0x038f }
            java.util.ArrayList r0 = r13.createTypedArrayList(r0)     // Catch:{ Exception -> 0x038f }
        L_0x012b:
            int r1 = r1 + r2
            r13.setDataPosition(r1)     // Catch:{ Exception -> 0x038f }
        L_0x012f:
            r5.set(r11, r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x0134:
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x038f }
            goto L_0x0143
        L_0x0139:
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ Exception -> 0x038f }
            if (r0 == 0) goto L_0x0134
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ Exception -> 0x038f }
        L_0x0143:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x038f }
            if (r2 == 0) goto L_0x0152
            int r1 = r13.dataPosition()     // Catch:{ Exception -> 0x038f }
            java.util.ArrayList r0 = r13.readArrayList(r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x012b
        L_0x0152:
            r0 = 0
            goto L_0x012f
        L_0x0154:
            android.os.Parcelable$Creator r0 = A02(r5)     // Catch:{ Exception -> 0x038f }
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x038f }
            if (r2 != 0) goto L_0x0160
            r0 = 0
            goto L_0x016e
        L_0x0160:
            int r1 = r13.dataPosition()     // Catch:{ Exception -> 0x038f }
            java.lang.Object r0 = r0.createFromParcel(r13)     // Catch:{ Exception -> 0x038f }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ Exception -> 0x038f }
            int r1 = r1 + r2
            r13.setDataPosition(r1)     // Catch:{ Exception -> 0x038f }
        L_0x016e:
            r5.set(r11, r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x0173:
            java.lang.Class r0 = r5.getType()     // Catch:{ Exception -> 0x038f }
            java.lang.Class[] r1 = r0.getDeclaredClasses()     // Catch:{ Exception -> 0x038f }
            int r0 = r1.length     // Catch:{ Exception -> 0x038f }
            r18 = r0
            r2 = 0
        L_0x017f:
            r0 = r18
            if (r2 >= r0) goto L_0x01bb
            r16 = r1[r2]     // Catch:{ Exception -> 0x038f }
            java.lang.String r15 = "asInterface"
            java.lang.Class[] r3 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x01b8 }
            java.lang.Class<android.os.IBinder> r0 = android.os.IBinder.class
            r3[r8] = r0     // Catch:{ Exception -> 0x01b8 }
            r0 = r16
            java.lang.reflect.Method r17 = r0.getDeclaredMethod(r15, r3)     // Catch:{ Exception -> 0x01b8 }
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01b8 }
            int r16 = A00(r13, r6)     // Catch:{ Exception -> 0x01b8 }
            if (r16 != 0) goto L_0x019d
            r3 = 0
            goto L_0x01aa
        L_0x019d:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x01b8 }
            android.os.IBinder r3 = r13.readStrongBinder()     // Catch:{ Exception -> 0x01b8 }
            int r0 = r0 + r16
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x01b8 }
        L_0x01aa:
            r15[r8] = r3     // Catch:{ Exception -> 0x01b8 }
            r3 = 0
            r0 = r17
            java.lang.Object r0 = r0.invoke(r3, r15)     // Catch:{ Exception -> 0x01b8 }
            r5.set(r11, r0)     // Catch:{ Exception -> 0x01b8 }
            goto L_0x0388
        L_0x01b8:
            int r2 = r2 + 1
            goto L_0x017f
        L_0x01bb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x038f }
            java.lang.String r0 = "Field has broken interface: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r5, r0, r1)     // Catch:{ Exception -> 0x038f }
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ Exception -> 0x038f }
            throw r0     // Catch:{ Exception -> 0x038f }
        L_0x01ca:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x038f }
            if (r2 != 0) goto L_0x01d2
            r1 = 0
            goto L_0x01de
        L_0x01d2:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x038f }
            java.lang.String r1 = r13.readString()     // Catch:{ Exception -> 0x038f }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x038f }
        L_0x01de:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x01e3:
            r0 = 8
            A03(r13, r6, r0)     // Catch:{ Exception -> 0x038f }
            double r0 = r13.readDouble()     // Catch:{ Exception -> 0x038f }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x038f }
            r5.set(r11, r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x01f5:
            r0 = 4
            A03(r13, r6, r0)     // Catch:{ Exception -> 0x038f }
            float r0 = r13.readFloat()     // Catch:{ Exception -> 0x038f }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ Exception -> 0x038f }
            r5.set(r11, r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x0206:
            r0 = 4
            A03(r13, r6, r0)     // Catch:{ Exception -> 0x038f }
            int r0 = r13.readInt()     // Catch:{ Exception -> 0x038f }
            boolean r0 = X.AnonymousClass000.A1O(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x038f }
            r5.set(r11, r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x021b:
            r0 = 8
            A03(r13, r6, r0)     // Catch:{ Exception -> 0x038f }
            long r16 = r13.readLong()     // Catch:{ Exception -> 0x038f }
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0246
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0246
            r0 = 3
            java.lang.Object[] r15 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x038f }
            java.lang.Class r0 = r5.getDeclaringClass()     // Catch:{ Exception -> 0x038f }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x038f }
            r15[r8] = r0     // Catch:{ Exception -> 0x038f }
            X.AnonymousClass3MX.A1S(r15, r12, r2)     // Catch:{ Exception -> 0x038f }
            r0 = r16
            X.AnonymousClass3MX.A1S(r15, r9, r0)     // Catch:{ Exception -> 0x038f }
            r0 = r18
            X.BE7.A1L(r0, r4, r15)     // Catch:{ Exception -> 0x038f }
        L_0x0246:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x038f }
            r5.set(r11, r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x024f:
            r0 = 4
            A03(r13, r6, r0)     // Catch:{ Exception -> 0x038f }
            int r17 = r13.readInt()     // Catch:{ Exception -> 0x038f }
            int r0 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x027d
            r0 = r17
            long r0 = (long) r0     // Catch:{ Exception -> 0x038f }
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x027d
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x038f }
            java.lang.Class r0 = r5.getDeclaringClass()     // Catch:{ Exception -> 0x038f }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x038f }
            r1[r8] = r0     // Catch:{ Exception -> 0x038f }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x038f }
            r0 = r17
            X.BE8.A1A(r2, r1, r12, r0, r9)     // Catch:{ Exception -> 0x038f }
            r0 = r18
            X.BE7.A1L(r0, r4, r1)     // Catch:{ Exception -> 0x038f }
        L_0x027d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x038f }
            r5.set(r11, r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x0286:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x038f }
            if (r2 != 0) goto L_0x028e
            r1 = 0
            goto L_0x029a
        L_0x028e:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x038f }
            int[] r1 = r13.createIntArray()     // Catch:{ Exception -> 0x038f }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x038f }
        L_0x029a:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x029f:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x038f }
            if (r2 != 0) goto L_0x02a7
            r1 = 0
            goto L_0x02b3
        L_0x02a7:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x038f }
            byte[] r1 = r13.createByteArray()     // Catch:{ Exception -> 0x038f }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x038f }
        L_0x02b3:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x02b8:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x038f }
            if (r2 != 0) goto L_0x02c0
            r1 = 0
            goto L_0x02cc
        L_0x02c0:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x038f }
            java.lang.String[] r1 = r13.createStringArray()     // Catch:{ Exception -> 0x038f }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x038f }
        L_0x02cc:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x02d1:
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r1)     // Catch:{ Exception -> 0x038f }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x038f }
            if (r0 == 0) goto L_0x02f1
            java.lang.Class r1 = r0.subClass()     // Catch:{ Exception -> 0x038f }
            java.lang.Class<org.microg.safeparcel.SafeParcelable> r0 = org.microg.safeparcel.SafeParcelable.class
            if (r1 == r0) goto L_0x02f1
            if (r1 == 0) goto L_0x02f1
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ Exception -> 0x038f }
            if (r0 == 0) goto L_0x02f1
            boolean r0 = X.C25361CeL.A01(r5)     // Catch:{ Exception -> 0x038f }
            if (r0 == 0) goto L_0x02f7
        L_0x02f1:
            java.lang.Class r1 = r5.getDeclaringClass()     // Catch:{ Exception -> 0x038f }
            if (r1 == 0) goto L_0x0308
        L_0x02f7:
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ Exception -> 0x038f }
            if (r0 == 0) goto L_0x0308
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x038f }
        L_0x0301:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x038f }
            if (r2 != 0) goto L_0x030f
            goto L_0x030d
        L_0x0308:
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x038f }
            goto L_0x0301
        L_0x030d:
            r1 = 0
            goto L_0x031b
        L_0x030f:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x038f }
            android.os.Bundle r1 = r13.readBundle(r1)     // Catch:{ Exception -> 0x038f }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x038f }
        L_0x031b:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x031f:
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r1)     // Catch:{ Exception -> 0x038f }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x038f }
            if (r0 == 0) goto L_0x0332
            java.lang.Class r1 = r0.subClass()     // Catch:{ Exception -> 0x038f }
            java.lang.Class<org.microg.safeparcel.SafeParcelable> r0 = org.microg.safeparcel.SafeParcelable.class
            if (r1 == r0) goto L_0x0332
            if (r1 == 0) goto L_0x0332
            goto L_0x0337
        L_0x0332:
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x038f }
            goto L_0x0341
        L_0x0337:
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch:{ Exception -> 0x038f }
            if (r0 == 0) goto L_0x0332
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ Exception -> 0x038f }
        L_0x0341:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x038f }
            if (r2 != 0) goto L_0x0349
            r1 = 0
            goto L_0x0355
        L_0x0349:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x038f }
            java.util.HashMap r1 = r13.readHashMap(r1)     // Catch:{ Exception -> 0x038f }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x038f }
        L_0x0355:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x0359:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x038f }
            if (r2 != 0) goto L_0x0361
            r1 = 0
            goto L_0x036d
        L_0x0361:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x038f }
            java.util.ArrayList r1 = r13.createStringArrayList()     // Catch:{ Exception -> 0x038f }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x038f }
        L_0x036d:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x038f }
            goto L_0x0388
        L_0x0371:
            int r2 = A00(r13, r6)     // Catch:{ Exception -> 0x038f }
            if (r2 != 0) goto L_0x0379
            r1 = 0
            goto L_0x0385
        L_0x0379:
            int r0 = r13.dataPosition()     // Catch:{ Exception -> 0x038f }
            android.os.IBinder r1 = r13.readStrongBinder()     // Catch:{ Exception -> 0x038f }
            int r0 = r0 + r2
            r13.setDataPosition(r0)     // Catch:{ Exception -> 0x038f }
        L_0x0385:
            r5.set(r11, r1)     // Catch:{ Exception -> 0x038f }
        L_0x0388:
            r0 = r21
            r5.setAccessible(r0)     // Catch:{ Exception -> 0x038f }
            goto L_0x0082
        L_0x038f:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            X.C17880vN.A1T(r1, r14, r8)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = r24.getName()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r1[r12] = r0     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = "Error reading field: %d in %s, skipping."
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            android.util.Log.w(r4, r0, r2)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r1 = A00(r13, r6)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r0 = r13.dataPosition()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            int r0 = r0 + r1
            r13.setDataPosition(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x0082
        L_0x03b2:
            int r0 = r13.dataPosition()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            if (r0 > r7) goto L_0x03c0
            r1 = r22
            r0 = r23
            r0.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            return r11
        L_0x03c0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = "Overread allowed size end="
            java.lang.RuntimeException r1 = X.BEA.A0h(r0, r1, r7)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x0425
        L_0x03cb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = "Size read is invalid start="
            r1.append(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r1.append(r2)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = " end="
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r7)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            X.DZs r1 = new X.DZs     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x0425
        L_0x03e3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = "Expected object header. Got 0x"
            X.BE9.A1J(r0, r1, r3)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = r1.toString()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            X.DZs r1 = new X.DZs     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x0425
        L_0x03f6:
            java.lang.NullPointerException r1 = X.BE6.A0m()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            goto L_0x0425
        L_0x03fb:
            java.lang.Object[] r2 = X.BE6.A1a()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            X.C17880vN.A1T(r2, r1, r8)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = r6.getName()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r2[r12] = r0     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = r3.getName()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r2[r9] = r0     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.Object r0 = r10.get(r1)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r1 = r0.getName()     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            r0 = 3
            r2[r0] = r1     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.String r0 = "Field number %d is used twice in %s for fields %s and %s"
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
            java.lang.RuntimeException r1 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
        L_0x0425:
            throw r1     // Catch:{ NoSuchMethodException -> 0x042e, Exception -> 0x0426 }
        L_0x0426:
            r1 = move-exception
            java.lang.String r0 = "Can't construct object"
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r1)
            throw r0
        L_0x042e:
            java.lang.String r0 = "createObject() requires a default constructor"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D3C.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return (Object[]) Array.newInstance(this.A00, i);
    }

    public D3C(Class cls) {
        this.A00 = cls;
    }

    public static Parcelable.Creator A02(Field field) {
        Class<?> type = field.getType();
        if ((!type.isArray() || (type = type.getComponentType()) != null) && Parcelable.class.isAssignableFrom(type)) {
            return A01(type);
        }
        throw BE9.A0n(" is not an Parcelable", C17890vO.A0f(type));
    }

    public static void A03(Parcel parcel, int i, int i2) {
        int A002 = A00(parcel, i);
        if (A002 != i2) {
            StringBuilder A0p = BEA.A0p(i2);
            A0p.append(" got ");
            A0p.append(A002);
            BE9.A1J(" (0x", A0p, A002);
            throw new DZs(AnonymousClass8BU.A0q(A0p));
        }
    }
}
