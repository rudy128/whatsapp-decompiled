package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;

/* renamed from: X.9O6  reason: invalid class name */
public abstract class AnonymousClass9O6 {
    public static final Bundle A00(AnonymousClass1D6... r9) {
        Bundle bundle = new Bundle(r7);
        for (AnonymousClass1D6 r0 : r9) {
            String str = (String) r0.first;
            Object obj = r0.second;
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, AnonymousClass000.A1Y(obj));
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, AnonymousClass8BR.A00(obj));
            } else if (obj instanceof Float) {
                bundle.putFloat(str, AnonymousClass000.A04(obj));
            } else if (obj instanceof Integer) {
                bundle.putInt(str, AnonymousClass000.A0M(obj));
            } else if (obj instanceof Long) {
                bundle.putLong(str, C17880vN.A05(obj));
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else {
                if (obj instanceof Object[]) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    C18070vi.A0b(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        bundle.putParcelableArray(str, (Parcelable[]) obj);
                    } else if (String.class.isAssignableFrom(componentType)) {
                        bundle.putStringArray(str, (String[]) obj);
                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
                        bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                    } else if (!Serializable.class.isAssignableFrom(componentType)) {
                        String canonicalName = componentType.getCanonicalName();
                        StringBuilder A10 = AnonymousClass000.A10();
                        C17900vP.A0c("Illegal value array type ", canonicalName, " for key \"", str, A10);
                        A10.append('\"');
                        throw AnonymousClass000.A0j(A10);
                    }
                } else if (!(obj instanceof Serializable)) {
                    if (obj instanceof IBinder) {
                        bundle.putBinder(str, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        C196319uq.A00(bundle, (Size) obj, str);
                    } else if (obj instanceof SizeF) {
                        C196319uq.A01(bundle, (SizeF) obj, str);
                    } else {
                        String canonicalName2 = obj.getClass().getCanonicalName();
                        StringBuilder A102 = AnonymousClass000.A10();
                        C17900vP.A0c("Illegal value type ", canonicalName2, " for key \"", str, A102);
                        A102.append('\"');
                        throw AnonymousClass000.A0j(A102);
                    }
                }
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
        return bundle;
    }
}
