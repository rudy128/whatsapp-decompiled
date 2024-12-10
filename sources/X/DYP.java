package X;

import android.os.Parcel;
import org.microg.safeparcel.SafeParcelable;

public abstract class DYP implements SafeParcelable {
    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0059, code lost:
        r9.setAccessible(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        if (r0 == null) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        r1 = A00(r8, r10);
        r8.writeStrongBinder(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a5, code lost:
        r8.writeInt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e4, code lost:
        A01(r8, r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01eb A[Catch:{ Exception -> 0x01fa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeToParcel(android.os.Parcel r18, int r19) {
        /*
            r17 = this;
            r7 = r17
            java.lang.Class r16 = r7.getClass()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = -45243(0xffffffffffff4f45, float:NaN)
            r8 = r18
            r8.writeInt(r0)
            r8.writeInt(r1)
            int r6 = r8.dataPosition()
        L_0x0018:
            if (r16 == 0) goto L_0x0214
            java.lang.reflect.Field[] r5 = r16.getDeclaredFields()
            int r4 = r5.length
            r3 = 0
        L_0x0020:
            if (r3 >= r4) goto L_0x020e
            r9 = r5[r3]
            java.lang.Class<org.microg.safeparcel.SafeParcelable$Field> r1 = org.microg.safeparcel.SafeParcelable.Field.class
            boolean r0 = r9.isAnnotationPresent(r1)
            if (r0 == 0) goto L_0x020a
            java.lang.annotation.Annotation r0 = r9.getAnnotation(r1)     // Catch:{ Exception -> 0x01fa }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x01f0
            int r10 = r0.value()     // Catch:{ Exception -> 0x01fa }
            java.lang.annotation.Annotation r0 = r9.getAnnotation(r1)     // Catch:{ Exception -> 0x01fa }
            org.microg.safeparcel.SafeParcelable$Field r0 = (org.microg.safeparcel.SafeParcelable.Field) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x01f5
            boolean r15 = r0.mayNull()     // Catch:{ Exception -> 0x01fa }
            boolean r2 = r9.isAccessible()     // Catch:{ Exception -> 0x01fa }
            r0 = 1
            r9.setAccessible(r0)     // Catch:{ Exception -> 0x01fa }
            java.lang.Integer r0 = X.C24645CDj.A00(r9)     // Catch:{ Exception -> 0x01fa }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01fa }
            r12 = r19
            switch(r0) {
                case 0: goto L_0x005e;
                case 1: goto L_0x006f;
                case 2: goto L_0x008b;
                case 3: goto L_0x009c;
                case 4: goto L_0x0105;
                case 5: goto L_0x0116;
                case 6: goto L_0x013d;
                case 7: goto L_0x014e;
                case 8: goto L_0x0076;
                case 9: goto L_0x015f;
                case 10: goto L_0x016f;
                case 11: goto L_0x017f;
                case 12: goto L_0x0196;
                case 13: goto L_0x01aa;
                case 14: goto L_0x01be;
                case 15: goto L_0x01d5;
                case 16: goto L_0x00f4;
                default: goto L_0x0059;
            }     // Catch:{ Exception -> 0x01fa }
        L_0x0059:
            r9.setAccessible(r2)     // Catch:{ Exception -> 0x01fa }
            goto L_0x020a
        L_0x005e:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x01e9
            int r1 = A00(r8, r10)     // Catch:{ Exception -> 0x01fa }
            r0.writeToParcel(r8, r12)     // Catch:{ Exception -> 0x01fa }
            goto L_0x01e4
        L_0x006f:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            android.os.IBinder r0 = (android.os.IBinder) r0     // Catch:{ Exception -> 0x01fa }
            goto L_0x0080
        L_0x0076:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            android.os.IInterface r0 = (android.os.IInterface) r0     // Catch:{ Exception -> 0x01fa }
            android.os.IBinder r0 = r0.asBinder()     // Catch:{ Exception -> 0x01fa }
        L_0x0080:
            if (r0 == 0) goto L_0x01e9
            int r1 = A00(r8, r10)     // Catch:{ Exception -> 0x01fa }
            r8.writeStrongBinder(r0)     // Catch:{ Exception -> 0x01fa }
            goto L_0x01e4
        L_0x008b:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x01e9
            int r1 = A00(r8, r10)     // Catch:{ Exception -> 0x01fa }
            r8.writeStringList(r0)     // Catch:{ Exception -> 0x01fa }
            goto L_0x01e4
        L_0x009c:
            java.lang.Class r1 = X.C25361CeL.A00(r9)     // Catch:{ Exception -> 0x01fa }
            if (r1 == 0) goto L_0x00e3
            java.lang.Class<android.os.Parcelable> r0 = android.os.Parcelable.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x00e3
            boolean r0 = X.C25361CeL.A01(r9)     // Catch:{ Exception -> 0x01fa }
            if (r0 != 0) goto L_0x00e3
            java.lang.Object r1 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x01fa }
            r11 = 0
            if (r1 == 0) goto L_0x01e9
            int r10 = A00(r8, r10)     // Catch:{ Exception -> 0x01fa }
            int r0 = r1.size()     // Catch:{ Exception -> 0x01fa }
            r8.writeInt(r0)     // Catch:{ Exception -> 0x01fa }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x01fa }
        L_0x00c8:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x00de
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x01fa }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 != 0) goto L_0x00da
            r8.writeInt(r11)     // Catch:{ Exception -> 0x01fa }
            goto L_0x00c8
        L_0x00da:
            X.BEB.A0o(r8, r0, r12)     // Catch:{ Exception -> 0x01fa }
            goto L_0x00c8
        L_0x00de:
            A01(r8, r10)     // Catch:{ Exception -> 0x01fa }
            goto L_0x0059
        L_0x00e3:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x01e9
            int r1 = A00(r8, r10)     // Catch:{ Exception -> 0x01fa }
            r8.writeList(r0)     // Catch:{ Exception -> 0x01fa }
            goto L_0x01e4
        L_0x00f4:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x01e9
            int r1 = A00(r8, r10)     // Catch:{ Exception -> 0x01fa }
            r8.writeMap(r0)     // Catch:{ Exception -> 0x01fa }
            goto L_0x01e4
        L_0x0105:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x01e9
            int r1 = A00(r8, r10)     // Catch:{ Exception -> 0x01fa }
            r8.writeBundle(r0)     // Catch:{ Exception -> 0x01fa }
            goto L_0x01e4
        L_0x0116:
            java.lang.Object r14 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            android.os.Parcelable[] r14 = (android.os.Parcelable[]) r14     // Catch:{ Exception -> 0x01fa }
            r13 = 0
            if (r14 == 0) goto L_0x01e9
            int r11 = A00(r8, r10)     // Catch:{ Exception -> 0x01fa }
            int r10 = r14.length     // Catch:{ Exception -> 0x01fa }
            r8.writeInt(r10)     // Catch:{ Exception -> 0x01fa }
            r1 = 0
        L_0x0128:
            if (r1 >= r10) goto L_0x0138
            r0 = r14[r1]     // Catch:{ Exception -> 0x01fa }
            if (r0 != 0) goto L_0x0132
            r8.writeInt(r13)     // Catch:{ Exception -> 0x01fa }
            goto L_0x0135
        L_0x0132:
            X.BEB.A0o(r8, r0, r12)     // Catch:{ Exception -> 0x01fa }
        L_0x0135:
            int r1 = r1 + 1
            goto L_0x0128
        L_0x0138:
            A01(r8, r11)     // Catch:{ Exception -> 0x01fa }
            goto L_0x0059
        L_0x013d:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x01e9
            int r1 = A00(r8, r10)     // Catch:{ Exception -> 0x01fa }
            r8.writeStringArray(r0)     // Catch:{ Exception -> 0x01fa }
            goto L_0x01e4
        L_0x014e:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x01e9
            int r1 = A00(r8, r10)     // Catch:{ Exception -> 0x01fa }
            r8.writeByteArray(r0)     // Catch:{ Exception -> 0x01fa }
            goto L_0x01e4
        L_0x015f:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            int[] r0 = (int[]) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x01e9
            int r1 = A00(r8, r10)     // Catch:{ Exception -> 0x01fa }
            r8.writeIntArray(r0)     // Catch:{ Exception -> 0x01fa }
            goto L_0x01e4
        L_0x016f:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x0059
            X.BE7.A0z(r10, r8)     // Catch:{ Exception -> 0x01fa }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01fa }
            goto L_0x01a5
        L_0x017f:
            java.lang.Object r1 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01fa }
            if (r1 == 0) goto L_0x0059
            r0 = 524288(0x80000, float:7.34684E-40)
            r10 = r10 | r0
            r8.writeInt(r10)     // Catch:{ Exception -> 0x01fa }
            long r0 = r1.longValue()     // Catch:{ Exception -> 0x01fa }
            r8.writeLong(r0)     // Catch:{ Exception -> 0x01fa }
            goto L_0x0059
        L_0x0196:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x0059
            X.BE7.A0z(r10, r8)     // Catch:{ Exception -> 0x01fa }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x01fa }
        L_0x01a5:
            r8.writeInt(r0)     // Catch:{ Exception -> 0x01fa }
            goto L_0x0059
        L_0x01aa:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x0059
            X.BE7.A0z(r10, r8)     // Catch:{ Exception -> 0x01fa }
            float r0 = r0.floatValue()     // Catch:{ Exception -> 0x01fa }
            r8.writeFloat(r0)     // Catch:{ Exception -> 0x01fa }
            goto L_0x0059
        L_0x01be:
            java.lang.Object r1 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            java.lang.Double r1 = (java.lang.Double) r1     // Catch:{ Exception -> 0x01fa }
            if (r1 == 0) goto L_0x0059
            r0 = 524288(0x80000, float:7.34684E-40)
            r10 = r10 | r0
            r8.writeInt(r10)     // Catch:{ Exception -> 0x01fa }
            double r0 = r1.doubleValue()     // Catch:{ Exception -> 0x01fa }
            r8.writeDouble(r0)     // Catch:{ Exception -> 0x01fa }
            goto L_0x0059
        L_0x01d5:
            java.lang.Object r0 = r9.get(r7)     // Catch:{ Exception -> 0x01fa }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x01e9
            int r1 = A00(r8, r10)     // Catch:{ Exception -> 0x01fa }
            r8.writeString(r0)     // Catch:{ Exception -> 0x01fa }
        L_0x01e4:
            A01(r8, r1)     // Catch:{ Exception -> 0x01fa }
            goto L_0x0059
        L_0x01e9:
            if (r15 == 0) goto L_0x0059
            r8.writeInt(r10)     // Catch:{ Exception -> 0x01fa }
            goto L_0x0059
        L_0x01f0:
            java.lang.IllegalStateException r0 = X.BE6.A0k()     // Catch:{ Exception -> 0x01fa }
            goto L_0x01f9
        L_0x01f5:
            java.lang.IllegalStateException r0 = X.BE6.A0k()     // Catch:{ Exception -> 0x01fa }
        L_0x01f9:
            throw r0     // Catch:{ Exception -> 0x01fa }
        L_0x01fa:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error writing field: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r2, r0, r1)
            java.lang.String r0 = "SafeParcel"
            android.util.Log.w(r0, r1)
        L_0x020a:
            int r3 = r3 + 1
            goto L_0x0020
        L_0x020e:
            java.lang.Class r16 = r16.getSuperclass()
            goto L_0x0018
        L_0x0214:
            A01(r8, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DYP.writeToParcel(android.os.Parcel, int):void");
    }

    public static int A00(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(65535);
        return parcel.dataPosition();
    }

    public static void A01(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }
}
