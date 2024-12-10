package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.ArrayMap;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Ql  reason: invalid class name and case insensitive filesystem */
public final class C05110Ql {
    public static final Map A00;
    public static final Map A01 = A03();

    public static Bundle A01(AnonymousClass0YZ r7, Collection collection) {
        Bundle bundle = new Bundle(2);
        ArrayList A13 = AnonymousClass000.A13();
        int i = 0;
        for (Object next : collection) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("<item ");
            A10.append(i);
            A13.add(A00(r7, next, AnonymousClass000.A0y(">", A10)));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", A13);
        return bundle;
    }

    public static Bundle A02(IconCompat iconCompat) {
        Bundle bundle = new Bundle(2);
        bundle.putInt("tag_class_type", 6);
        bundle.putBundle("tag_value", iconCompat.A0C());
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
        if ((r10 instanceof java.lang.String) != false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle A00(X.AnonymousClass0YZ r9, java.lang.Object r10, java.lang.String r11) {
        /*
            if (r10 == 0) goto L_0x0038
            java.util.ArrayDeque r0 = r9.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0008:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r1.next()
            X.0I7 r0 = (X.AnonymousClass0I7) r0
            java.lang.Object r0 = r0.A00
            if (r0 != r10) goto L_0x0008
            r0 = 1
        L_0x0019:
            if (r0 == 0) goto L_0x0038
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Found cycle while bundling type "
            r1.append(r0)
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.06r r0 = new X.06r
            r0.<init>(r9, r1)
            throw r0
        L_0x0036:
            r0 = 0
            goto L_0x0019
        L_0x0038:
            java.util.ArrayDeque r0 = r9.A01
            X.0YZ r3 = new X.0YZ
            r3.<init>(r10, r11, r0)
            if (r10 == 0) goto L_0x02db
            boolean r0 = r10 instanceof androidx.core.graphics.drawable.IconCompat     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x004d
            androidx.core.graphics.drawable.IconCompat r10 = (androidx.core.graphics.drawable.IconCompat) r10     // Catch:{ all -> 0x02ec }
            android.os.Bundle r7 = A02(r10)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x004d:
            boolean r4 = r10 instanceof java.lang.Boolean     // Catch:{ all -> 0x02ec }
            if (r4 != 0) goto L_0x0072
            boolean r0 = r10 instanceof java.lang.Byte     // Catch:{ all -> 0x02ec }
            if (r0 != 0) goto L_0x0072
            boolean r0 = r10 instanceof java.lang.Character     // Catch:{ all -> 0x02ec }
            if (r0 != 0) goto L_0x0072
            boolean r0 = r10 instanceof java.lang.Short     // Catch:{ all -> 0x02ec }
            if (r0 != 0) goto L_0x0072
            boolean r0 = r10 instanceof java.lang.Integer     // Catch:{ all -> 0x02ec }
            if (r0 != 0) goto L_0x0072
            boolean r0 = r10 instanceof java.lang.Long     // Catch:{ all -> 0x02ec }
            if (r0 != 0) goto L_0x0072
            boolean r0 = r10 instanceof java.lang.Double     // Catch:{ all -> 0x02ec }
            if (r0 != 0) goto L_0x0072
            boolean r0 = r10 instanceof java.lang.Float     // Catch:{ all -> 0x02ec }
            if (r0 != 0) goto L_0x0072
            boolean r1 = r10 instanceof java.lang.String     // Catch:{ all -> 0x02ec }
            r0 = 0
            if (r1 == 0) goto L_0x0073
        L_0x0072:
            r0 = 1
        L_0x0073:
            if (r0 != 0) goto L_0x022f
            boolean r0 = r10 instanceof android.os.Parcelable     // Catch:{ all -> 0x02ec }
            if (r0 != 0) goto L_0x022f
            boolean r0 = r10 instanceof android.os.IInterface     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x00a3
            android.os.IInterface r10 = (android.os.IInterface) r10     // Catch:{ all -> 0x02ec }
            r0 = 3
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x02ec }
            r7.<init>(r0)     // Catch:{ all -> 0x02ec }
            java.lang.Class r0 = r10.getClass()     // Catch:{ all -> 0x02ec }
            java.lang.String r2 = r0.getName()     // Catch:{ all -> 0x02ec }
            java.lang.String r1 = "tag_class_type"
            r0 = 1
            r7.putInt(r1, r0)     // Catch:{ all -> 0x02ec }
            java.lang.String r1 = "tag_value"
            android.os.IBinder r0 = r10.asBinder()     // Catch:{ all -> 0x02ec }
            r7.putBinder(r1, r0)     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = "tag_class_name"
            r7.putString(r0, r2)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x00a3:
            boolean r0 = r10 instanceof android.os.IBinder     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x00bd
            android.os.IBinder r10 = (android.os.IBinder) r10     // Catch:{ all -> 0x02ec }
            r0 = 2
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x02ec }
            r7.<init>(r0)     // Catch:{ all -> 0x02ec }
            java.lang.String r1 = "tag_class_type"
            r0 = 9
            r7.putInt(r1, r0)     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = "tag_value"
            r7.putBinder(r0, r10)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x00bd:
            boolean r0 = r10 instanceof java.util.Map     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x0135
            java.util.Map r10 = (java.util.Map) r10     // Catch:{ all -> 0x02ec }
            r5 = 2
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x02ec }
            r7.<init>(r5)     // Catch:{ all -> 0x02ec }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x02ec }
            java.util.Iterator r11 = X.AnonymousClass000.A15(r10)     // Catch:{ all -> 0x02ec }
            r8 = 0
        L_0x00d2:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x0129
            java.util.Map$Entry r10 = X.AnonymousClass000.A16(r11)     // Catch:{ all -> 0x02ec }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ all -> 0x02ec }
            r6.<init>(r5)     // Catch:{ all -> 0x02ec }
            java.lang.Object r2 = r10.getKey()     // Catch:{ all -> 0x02ec }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = "<key "
            r1.append(r0)     // Catch:{ all -> 0x02ec }
            r1.append(r8)     // Catch:{ all -> 0x02ec }
            java.lang.String r9 = ">"
            java.lang.String r0 = X.AnonymousClass000.A0y(r9, r1)     // Catch:{ all -> 0x02ec }
            android.os.Bundle r1 = A00(r3, r2, r0)     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = "tag_1"
            r6.putBundle(r0, r1)     // Catch:{ all -> 0x02ec }
            java.lang.Object r0 = r10.getValue()     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x0123
            java.lang.Object r2 = r10.getValue()     // Catch:{ all -> 0x02ec }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = "<value "
            r1.append(r0)     // Catch:{ all -> 0x02ec }
            r1.append(r8)     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = X.AnonymousClass000.A0y(r9, r1)     // Catch:{ all -> 0x02ec }
            android.os.Bundle r1 = A00(r3, r2, r0)     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = "tag_2"
            r6.putBundle(r0, r1)     // Catch:{ all -> 0x02ec }
        L_0x0123:
            int r8 = r8 + 1
            r4.add(r6)     // Catch:{ all -> 0x02ec }
            goto L_0x00d2
        L_0x0129:
            java.lang.String r0 = "tag_class_type"
            r7.putInt(r0, r5)     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = "tag_value"
            r7.putParcelableArrayList(r0, r4)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x0135:
            boolean r0 = r10 instanceof java.util.List     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x0147
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x02ec }
            android.os.Bundle r7 = A01(r3, r10)     // Catch:{ all -> 0x02ec }
            java.lang.String r1 = "tag_class_type"
            r0 = 4
        L_0x0142:
            r7.putInt(r1, r0)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x0147:
            boolean r0 = r10 instanceof java.util.Set     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x0155
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ all -> 0x02ec }
            android.os.Bundle r7 = A01(r3, r10)     // Catch:{ all -> 0x02ec }
            java.lang.String r1 = "tag_class_type"
            r0 = 3
            goto L_0x0142
        L_0x0155:
            java.lang.Class r2 = r10.getClass()     // Catch:{ all -> 0x02ec }
            boolean r0 = r2.isEnum()     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x018a
            r0 = 3
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x02ec }
            r7.<init>(r0)     // Catch:{ all -> 0x02ec }
            java.lang.String r1 = "tag_class_type"
            r0 = 7
            r7.putInt(r1, r0)     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = "name"
            java.lang.reflect.Method r1 = A08(r3, r2, r0)     // Catch:{ all -> 0x02ec }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ ReflectiveOperationException -> 0x02e3 }
            java.lang.Object r1 = r1.invoke(r10, r0)     // Catch:{ ReflectiveOperationException -> 0x02e3 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ ReflectiveOperationException -> 0x02e3 }
            java.lang.String r0 = "tag_value"
            r7.putString(r0, r1)     // Catch:{ all -> 0x02ec }
            java.lang.String r1 = r2.getName()     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = "tag_class_name"
            r7.putString(r0, r1)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x018a:
            boolean r0 = r10 instanceof java.lang.Class     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x01a8
            java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x02ec }
            r0 = 2
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x02ec }
            r7.<init>(r0)     // Catch:{ all -> 0x02ec }
            java.lang.String r1 = "tag_class_type"
            r0 = 8
            r7.putInt(r1, r0)     // Catch:{ all -> 0x02ec }
            java.lang.String r1 = "tag_value"
            java.lang.String r0 = r10.getName()     // Catch:{ all -> 0x02ec }
            r7.putString(r1, r0)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x01a8:
            boolean r0 = r2.isArray()     // Catch:{ all -> 0x02ec }
            if (r0 != 0) goto L_0x0226
            java.lang.String r4 = r2.getName()     // Catch:{ all -> 0x02ec }
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x0219 }
            r2.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0219 }
            java.util.ArrayList r2 = A09(r2)     // Catch:{ all -> 0x02ec }
            int r0 = r2.size()     // Catch:{ all -> 0x02ec }
            int r0 = r0 + 2
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x02ec }
            r7.<init>(r0)     // Catch:{ all -> 0x02ec }
            java.lang.String r1 = "tag_class_type"
            r0 = 5
            r7.putInt(r1, r0)     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = "tag_class_name"
            r7.putString(r0, r4)     // Catch:{ all -> 0x02ec }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x02ec }
        L_0x01d6:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x02bc
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x02ec }
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch:{ all -> 0x02ec }
            r0 = 1
            r5.setAccessible(r0)     // Catch:{ all -> 0x02ec }
            java.lang.Class r0 = r5.getDeclaringClass()     // Catch:{ all -> 0x02ec }
            java.lang.String r2 = r0.getName()     // Catch:{ all -> 0x02ec }
            java.lang.String r1 = r5.getName()     // Catch:{ all -> 0x02ec }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02ec }
            java.lang.String r4 = X.AnonymousClass001.A1H(r2, r1, r0)     // Catch:{ all -> 0x02ec }
            java.lang.Object r1 = r5.get(r10)     // Catch:{ IllegalAccessException -> 0x020c }
            if (r1 == 0) goto L_0x01d6
            java.lang.String r0 = r5.getName()     // Catch:{ all -> 0x02ec }
            android.os.Bundle r0 = A00(r3, r1, r0)     // Catch:{ all -> 0x02ec }
            r7.putParcelable(r4, r0)     // Catch:{ all -> 0x02ec }
            goto L_0x01d6
        L_0x020c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = "Field is not accessible: "
            X.06s r1 = A04(r3, r0, r4, r1, r2)     // Catch:{ all -> 0x02ec }
            goto L_0x02eb
        L_0x0219:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = "Class to deserialize is missing a no args constructor: "
            X.06s r1 = A04(r3, r0, r4, r1, r2)     // Catch:{ all -> 0x02ec }
            goto L_0x02eb
        L_0x0226:
            java.lang.String r0 = "Object serializing contains an array, use a list or a set instead"
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02ec }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x02ec }
            goto L_0x02eb
        L_0x022f:
            r0 = 2
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x02ec }
            r7.<init>(r0)     // Catch:{ all -> 0x02ec }
            java.lang.String r1 = "tag_class_type"
            r0 = 0
            r7.putInt(r1, r0)     // Catch:{ all -> 0x02ec }
            java.lang.String r2 = "tag_value"
            if (r4 == 0) goto L_0x0247
            boolean r0 = X.AnonymousClass000.A1Y(r10)     // Catch:{ all -> 0x02ec }
            r7.putBoolean(r2, r0)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x0247:
            boolean r0 = r10 instanceof java.lang.Byte     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x0255
            java.lang.Byte r10 = (java.lang.Byte) r10     // Catch:{ all -> 0x02ec }
            byte r0 = r10.byteValue()     // Catch:{ all -> 0x02ec }
            r7.putByte(r2, r0)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x0255:
            boolean r0 = r10 instanceof java.lang.Character     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x0263
            java.lang.Character r10 = (java.lang.Character) r10     // Catch:{ all -> 0x02ec }
            char r0 = r10.charValue()     // Catch:{ all -> 0x02ec }
            r7.putChar(r2, r0)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x0263:
            boolean r0 = r10 instanceof java.lang.Short     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x0271
            java.lang.Short r10 = (java.lang.Short) r10     // Catch:{ all -> 0x02ec }
            short r0 = r10.shortValue()     // Catch:{ all -> 0x02ec }
            r7.putShort(r2, r0)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x0271:
            boolean r0 = r10 instanceof java.lang.Integer     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x027f
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x02ec }
            int r0 = r10.intValue()     // Catch:{ all -> 0x02ec }
            r7.putInt(r2, r0)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x027f:
            boolean r0 = r10 instanceof java.lang.Long     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x028d
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x02ec }
            long r0 = r10.longValue()     // Catch:{ all -> 0x02ec }
            r7.putLong(r2, r0)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x028d:
            boolean r0 = r10 instanceof java.lang.Double     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x029b
            java.lang.Double r10 = (java.lang.Double) r10     // Catch:{ all -> 0x02ec }
            double r0 = r10.doubleValue()     // Catch:{ all -> 0x02ec }
            r7.putDouble(r2, r0)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x029b:
            boolean r0 = r10 instanceof java.lang.Float     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x02a9
            java.lang.Float r10 = (java.lang.Float) r10     // Catch:{ all -> 0x02ec }
            float r0 = r10.floatValue()     // Catch:{ all -> 0x02ec }
            r7.putFloat(r2, r0)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x02a9:
            boolean r0 = r10 instanceof java.lang.String     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x02b3
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x02ec }
            r7.putString(r2, r10)     // Catch:{ all -> 0x02ec }
            goto L_0x02bc
        L_0x02b3:
            boolean r0 = r10 instanceof android.os.Parcelable     // Catch:{ all -> 0x02ec }
            if (r0 == 0) goto L_0x02c0
            android.os.Parcelable r10 = (android.os.Parcelable) r10     // Catch:{ all -> 0x02ec }
            r7.putParcelable(r2, r10)     // Catch:{ all -> 0x02ec }
        L_0x02bc:
            r3.close()
            return r7
        L_0x02c0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = "Unsupported primitive type: "
            r1.append(r0)     // Catch:{ all -> 0x02ec }
            java.lang.Class r0 = r10.getClass()     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x02ec }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x02ec }
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02ec }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x02ec }
            goto L_0x02eb
        L_0x02db:
            java.lang.String r0 = "Bundling of null object is not supported"
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02ec }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x02ec }
            goto L_0x02eb
        L_0x02e3:
            r2 = move-exception
            java.lang.String r0 = "Enum missing name method"
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02ec }
            r1.<init>(r3, r0, r2)     // Catch:{ all -> 0x02ec }
        L_0x02eb:
            throw r1     // Catch:{ all -> 0x02ec }
        L_0x02ec:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x02f1 }
            throw r1
        L_0x02f1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05110Ql.A00(X.0YZ, java.lang.Object, java.lang.String):android.os.Bundle");
    }

    public static ArrayMap A03() {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, "long");
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        return arrayMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02bd, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02c1, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02c3, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02c6, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1 = A04(r2, "Method to create IInterface from a Binder is not accessible for interface: ", r4, X.AnonymousClass000.A10(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c4, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c5, code lost:
        r1 = A04(r2, "Binder for unknown IInterface: ", r4, X.AnonymousClass000.A10(), r3);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x002c, B:24:0x0099] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A05(android.os.Bundle r10, X.AnonymousClass0YZ r11) {
        /*
            java.lang.Class<X.0Ql> r0 = X.C05110Ql.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r0.getClass()
            r10.setClassLoader(r0)
            java.lang.String r0 = "tag_class_type"
            int r3 = r10.getInt(r0)
            int r1 = r10.getInt(r0)
            java.util.Map r0 = A00
            java.lang.Object r1 = X.AnonymousClass000.A0w(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = "unknown"
        L_0x0022:
            java.util.ArrayDeque r0 = r11.A01
            X.0YZ r2 = new X.0YZ
            r2.<init>(r10, r1, r0)
            switch(r3) {
                case 0: goto L_0x0078;
                case 1: goto L_0x0089;
                case 2: goto L_0x00e3;
                case 3: goto L_0x003d;
                case 4: goto L_0x0043;
                case 5: goto L_0x0132;
                case 6: goto L_0x0072;
                case 7: goto L_0x01f0;
                case 8: goto L_0x0288;
                case 9: goto L_0x02a9;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "Unsupported class type in bundle: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)     // Catch:{ all -> 0x02bd }
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02bd }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x003d:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x02bd }
            r3.<init>()     // Catch:{ all -> 0x02bd }
            goto L_0x0047
        L_0x0043:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x02bd }
        L_0x0047:
            java.lang.String r0 = "tag_value"
            java.util.ArrayList r0 = r10.getParcelableArrayList(r0)     // Catch:{ all -> 0x02bd }
            if (r0 == 0) goto L_0x0069
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x02bd }
        L_0x0053:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x02bd }
            if (r0 == 0) goto L_0x02b9
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x02bd }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ all -> 0x02bd }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ all -> 0x02bd }
            java.lang.Object r0 = A05(r0, r2)     // Catch:{ all -> 0x02bd }
            r3.add(r0)     // Catch:{ all -> 0x02bd }
            goto L_0x0053
        L_0x0069:
            java.lang.String r0 = "Bundle is missing the collection"
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02bd }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x0072:
            java.lang.Object r3 = A06(r10, r2)     // Catch:{ all -> 0x02bd }
            goto L_0x02b9
        L_0x0078:
            java.lang.String r0 = "tag_value"
            java.lang.Object r3 = r10.get(r0)     // Catch:{ all -> 0x02bd }
            if (r3 != 0) goto L_0x02b9
            java.lang.String r0 = "Bundle is missing the primitive value"
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02bd }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x0089:
            java.lang.String r0 = "tag_value"
            android.os.IBinder r5 = r10.getBinder(r0)     // Catch:{ all -> 0x02bd }
            if (r5 == 0) goto L_0x00da
            java.lang.String r0 = "tag_class_name"
            java.lang.String r4 = r10.getString(r0)     // Catch:{ all -> 0x02bd }
            if (r4 == 0) goto L_0x00d1
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x00c4, ReflectiveOperationException -> 0x00b7 }
            java.lang.String r0 = "asInterface"
            java.lang.reflect.Method r3 = A08(r2, r1, r0)     // Catch:{ ClassNotFoundException -> 0x00c4, ReflectiveOperationException -> 0x00b7 }
            r0 = 1
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r5, r0)     // Catch:{ ClassNotFoundException -> 0x00c4, ReflectiveOperationException -> 0x00b7 }
            r0 = 0
            java.lang.Object r3 = r3.invoke(r0, r1)     // Catch:{ ClassNotFoundException -> 0x00c4, ReflectiveOperationException -> 0x00b7 }
            if (r3 != 0) goto L_0x02b9
            java.lang.String r1 = "Failed to get interface from binder"
            X.06s r0 = new X.06s     // Catch:{ ClassNotFoundException -> 0x00c4, ReflectiveOperationException -> 0x00b7 }
            r0.<init>(r2, r1)     // Catch:{ ClassNotFoundException -> 0x00c4, ReflectiveOperationException -> 0x00b7 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x00c4, ReflectiveOperationException -> 0x00b7 }
        L_0x00b7:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "Method to create IInterface from a Binder is not accessible for interface: "
            X.06s r1 = A04(r2, r0, r4, r1, r3)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x00c4:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "Binder for unknown IInterface: "
            X.06s r1 = A04(r2, r0, r4, r1, r3)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x00d1:
            java.lang.String r0 = "Bundle is missing IInterface class name"
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02bd }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x00da:
            java.lang.String r0 = "Bundle is missing the binder"
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02bd }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x00e3:
            java.lang.String r0 = "tag_value"
            java.util.ArrayList r0 = r10.getParcelableArrayList(r0)     // Catch:{ all -> 0x02bd }
            if (r0 == 0) goto L_0x0129
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x02bd }
            r3.<init>()     // Catch:{ all -> 0x02bd }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x02bd }
        L_0x00f4:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x02bd }
            if (r0 == 0) goto L_0x02b9
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x02bd }
            android.os.Parcelable r4 = (android.os.Parcelable) r4     // Catch:{ all -> 0x02bd }
            android.os.Bundle r4 = (android.os.Bundle) r4     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "tag_1"
            android.os.Bundle r1 = r4.getBundle(r0)     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "tag_2"
            android.os.Bundle r0 = r4.getBundle(r0)     // Catch:{ all -> 0x02bd }
            if (r1 == 0) goto L_0x0120
            java.lang.Object r1 = A05(r1, r2)     // Catch:{ all -> 0x02bd }
            if (r0 != 0) goto L_0x0118
            r0 = 0
            goto L_0x011c
        L_0x0118:
            java.lang.Object r0 = A05(r0, r2)     // Catch:{ all -> 0x02bd }
        L_0x011c:
            r3.put(r1, r0)     // Catch:{ all -> 0x02bd }
            goto L_0x00f4
        L_0x0120:
            java.lang.String r0 = "Bundle is missing key"
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02bd }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x0129:
            java.lang.String r0 = "Bundle is missing the map"
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02bd }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x0132:
            java.lang.String r6 = "CarApp.Bun"
            java.lang.String r0 = "tag_class_name"
            java.lang.String r4 = r10.getString(r0)     // Catch:{ all -> 0x02bd }
            if (r4 == 0) goto L_0x01e7
            java.lang.Class r7 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            r3 = 0
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.lang.reflect.Constructor r1 = r7.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            r5 = 1
            r1.setAccessible(r5)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.lang.Object r3 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.util.ArrayList r0 = A09(r7)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
        L_0x0159:
            boolean r0 = r9.hasNext()     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            if (r0 == 0) goto L_0x02b9
            java.lang.Object r7 = r9.next()     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            r7.setAccessible(r5)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.lang.Class r0 = r7.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.lang.String r8 = r0.getName()     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.lang.String r1 = r7.getName()     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.lang.String r8 = X.AnonymousClass001.A1H(r8, r1, r0)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.lang.Object r1 = r10.get(r8)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            if (r1 != 0) goto L_0x018e
            java.lang.String r1 = "androidx.core.graphics.drawable.IconCompat"
            java.lang.String r0 = "android.support.v4.graphics.drawable.IconCompat"
            java.lang.String r0 = r8.replaceAll(r1, r0)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.lang.Object r1 = r10.get(r0)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
        L_0x018e:
            boolean r0 = r1 instanceof android.os.Bundle     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            if (r0 == 0) goto L_0x019c
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.lang.Object r0 = A05(r1, r2)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            r7.set(r3, r0)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            goto L_0x0159
        L_0x019c:
            if (r1 != 0) goto L_0x0159
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r6, r0)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            if (r0 == 0) goto L_0x0159
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            java.lang.String r0 = "Value is null for field: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r7, r0, r1)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            android.util.Log.d(r6, r0)     // Catch:{ ClassNotFoundException -> 0x01da, NoSuchMethodException -> 0x01cd, ReflectiveOperationException -> 0x01c0, IllegalArgumentException -> 0x01b3 }
            goto L_0x0159
        L_0x01b3:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "Failed to deserialize class: "
            X.06s r1 = A04(r2, r0, r4, r1, r3)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x01c0:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "Constructor or field is not accessible: "
            X.06s r1 = A04(r2, r0, r4, r1, r3)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x01cd:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "Object missing no args constructor: "
            X.06s r1 = A04(r2, r0, r4, r1, r3)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x01da:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "Object for unknown class: "
            X.06s r1 = A04(r2, r0, r4, r1, r3)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x01e7:
            java.lang.String r0 = "Bundle is missing the class name"
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02bd }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x01f0:
            java.lang.String r0 = "tag_value"
            java.lang.String r6 = r10.getString(r0)     // Catch:{ all -> 0x02bd }
            java.lang.String r5 = "]"
            if (r6 == 0) goto L_0x0275
            java.lang.String r0 = "tag_class_name"
            java.lang.String r4 = r10.getString(r0)     // Catch:{ all -> 0x02bd }
            if (r4 == 0) goto L_0x0262
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch:{ IllegalArgumentException -> 0x024b, ClassNotFoundException -> 0x0232, ReflectiveOperationException -> 0x0218 }
            java.lang.String r0 = "valueOf"
            java.lang.reflect.Method r3 = A08(r2, r1, r0)     // Catch:{ IllegalArgumentException -> 0x024b, ClassNotFoundException -> 0x0232, ReflectiveOperationException -> 0x0218 }
            r0 = 1
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r6, r0)     // Catch:{ IllegalArgumentException -> 0x024b, ClassNotFoundException -> 0x0232, ReflectiveOperationException -> 0x0218 }
            r0 = 0
            java.lang.Object r3 = r3.invoke(r0, r1)     // Catch:{ IllegalArgumentException -> 0x024b, ClassNotFoundException -> 0x0232, ReflectiveOperationException -> 0x0218 }
            goto L_0x02b9
        L_0x0218:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "Enum of class ["
            r1.append(r0)     // Catch:{ all -> 0x02bd }
            r1.append(r4)     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "] missing valueOf method"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x02bd }
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02bd }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x0232:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "Enum class ["
            r1.append(r0)     // Catch:{ all -> 0x02bd }
            r1.append(r4)     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "] not found"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x02bd }
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02bd }
            r1.<init>(r2, r0, r3)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x024b:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "Enum value ["
            r1.append(r0)     // Catch:{ all -> 0x02bd }
            r1.append(r6)     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "] does not exist in enum class ["
            r1.append(r0)     // Catch:{ all -> 0x02bd }
            X.06s r1 = A04(r2, r4, r5, r1, r3)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x0262:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "Missing enum className ["
            r1.append(r0)     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = X.AnonymousClass001.A1H(r4, r5, r1)     // Catch:{ all -> 0x02bd }
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02bd }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x0275:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "Missing enum name ["
            r1.append(r0)     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = X.AnonymousClass001.A1H(r6, r5, r1)     // Catch:{ all -> 0x02bd }
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02bd }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x0288:
            java.lang.String r0 = "tag_value"
            java.lang.String r4 = r10.getString(r0)     // Catch:{ all -> 0x02bd }
            if (r4 == 0) goto L_0x02a1
            java.lang.Class r3 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x0295 }
            goto L_0x02b9
        L_0x0295:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02bd }
            java.lang.String r0 = "Class name is unknown: "
            X.06s r1 = A04(r2, r0, r4, r1, r3)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x02a1:
            java.lang.String r0 = "Class is missing the class name"
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02bd }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02bd }
            goto L_0x02b8
        L_0x02a9:
            java.lang.String r0 = "tag_value"
            android.os.IBinder r3 = r10.getBinder(r0)     // Catch:{ all -> 0x02bd }
            if (r3 != 0) goto L_0x02b9
            java.lang.String r0 = "Bundle is missing the binder"
            X.06s r1 = new X.06s     // Catch:{ all -> 0x02bd }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02bd }
        L_0x02b8:
            throw r1     // Catch:{ all -> 0x02bd }
        L_0x02b9:
            r2.close()
            return r3
        L_0x02bd:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x02c2 }
            throw r1
        L_0x02c2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05110Ql.A05(android.os.Bundle, X.0YZ):java.lang.Object");
    }

    public static Object A06(Bundle bundle, AnonymousClass0YZ r2) {
        Bundle bundle2 = bundle.getBundle("tag_value");
        if (bundle2 != null) {
            IconCompat A04 = IconCompat.A04(bundle2);
            if (A04 != null) {
                return A04;
            }
            throw new C010406s(r2, "Failed to create IconCompat from bundle");
        }
        throw new C010406s(r2, "IconCompat bundle is null");
    }

    public static String A07(Class cls) {
        String str = (String) A01.get(cls);
        if (str != null) {
            return str;
        }
        if (List.class.isAssignableFrom(cls)) {
            return "<List>";
        }
        if (Map.class.isAssignableFrom(cls)) {
            return "<Map>";
        }
        if (Set.class.isAssignableFrom(cls)) {
            return "<Set>";
        }
        return cls.getSimpleName();
    }

    public static Method A08(AnonymousClass0YZ r5, Class cls, String str) {
        if (cls == null || cls == Object.class) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("No method ");
            A10.append(str);
            throw new C010406s(r5, AnonymousClass001.A1E(cls, " in class ", A10));
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return A08(r5, cls.getSuperclass(), str);
    }

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(0, "primitive");
        arrayMap.put(1, "iInterface");
        arrayMap.put(9, "iBinder");
        arrayMap.put(2, "map");
        arrayMap.put(3, "set");
        arrayMap.put(4, "list");
        arrayMap.put(5, "object");
        arrayMap.put(6, "image");
        A00 = arrayMap;
    }

    public static C010406s A04(AnonymousClass0YZ r2, String str, String str2, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(str2);
        return new C010406s(r2, sb.toString(), th);
    }

    public static ArrayList A09(Class cls) {
        ArrayList A13 = AnonymousClass000.A13();
        if (!(cls == null || cls == Object.class)) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    A13.add(field);
                }
            }
            A13.addAll(A09(cls.getSuperclass()));
        }
        return A13;
    }
}
