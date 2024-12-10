package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CDj  reason: case insensitive filesystem */
public abstract class C24645CDj {
    public static Integer A00(Field field) {
        Class<?> type = field.getType();
        Class<?> componentType = type.getComponentType();
        if (type.isArray() && componentType != null && Parcelable.class.isAssignableFrom(componentType)) {
            return AnonymousClass00R.A0j;
        }
        if (type.isArray() && componentType != null && String.class.isAssignableFrom(componentType)) {
            return AnonymousClass00R.A0u;
        }
        if (type.isArray() && componentType != null && Byte.TYPE.isAssignableFrom(componentType)) {
            return AnonymousClass00R.A15;
        }
        if (type.isArray() && componentType != null && Integer.TYPE.isAssignableFrom(componentType)) {
            return AnonymousClass00R.A19;
        }
        if (Bundle.class.isAssignableFrom(type)) {
            return AnonymousClass00R.A0Y;
        }
        if (Parcelable.class.isAssignableFrom(type)) {
            return AnonymousClass00R.A00;
        }
        if (IBinder.class.isAssignableFrom(type)) {
            return AnonymousClass00R.A01;
        }
        if (IInterface.class.isAssignableFrom(type)) {
            return AnonymousClass00R.A18;
        }
        if (type == List.class || type == ArrayList.class) {
            if (C25361CeL.A00(field) != String.class || C25361CeL.A01(field)) {
                return AnonymousClass00R.A0N;
            }
            return AnonymousClass00R.A0C;
        } else if (type == Map.class || type == HashMap.class) {
            return AnonymousClass00R.A08;
        } else {
            if (type == Integer.TYPE || type == Integer.class) {
                return AnonymousClass00R.A02;
            }
            if (type == Boolean.TYPE || type == Boolean.class) {
                return AnonymousClass00R.A04;
            }
            if (type == Long.TYPE || type == Long.class) {
                return AnonymousClass00R.A03;
            }
            if (type == Float.TYPE || type == Float.class) {
                return AnonymousClass00R.A05;
            }
            if (type == Double.TYPE || type == Double.class) {
                return AnonymousClass00R.A06;
            }
            if (type == Byte.TYPE || type == Byte.class) {
                return AnonymousClass00R.A09;
            }
            if (type == String.class) {
                return AnonymousClass00R.A07;
            }
            throw AnonymousClass8BR.A0w(AnonymousClass001.A1E(type, "Type is not yet usable with SafeParcelUtil: ", AnonymousClass000.A10()));
        }
    }
}
