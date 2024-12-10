package X;

import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.reflect.Field;

/* renamed from: X.Bde  reason: case insensitive filesystem */
public final class C23228Bde extends C23331BfJ {
    public final Object A00;

    public static Object A00(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof C23228Bde) {
            return ((C23228Bde) iObjectWrapper).A00;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field field = null;
        int i = 0;
        for (Field field2 : asBinder.getClass().getDeclaredFields()) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C18210vx.A00(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw AnonymousClass000.A0k("IObjectWrapper declared field not private!");
            }
        } else {
            throw AnonymousClass001.A13("Unexpected number of IObjectWrapper declared fields: ", AnonymousClass000.A10(), r5);
        }
    }

    public C23228Bde(Object obj) {
        this.A00 = obj;
    }
}
