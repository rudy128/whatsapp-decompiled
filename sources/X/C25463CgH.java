package X;

import android.os.Build;
import android.os.Handler;
import com.facebook.common.hiddenapis2.ApiExemption;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.CgH  reason: case insensitive filesystem */
public abstract class C25463CgH {
    public static Handler A00;
    public static Object A01;
    public static Field A02;
    public static Field A03;
    public static final AnonymousClass00H A04 = C18150vq.A02(new DWI(3));

    public static /* synthetic */ Boolean A00() {
        try {
            if (!ApiExemption.removeRestriction_DO_NOT_USE()) {
                return false;
            }
            C24897COq cOq = C24897COq.A02;
            C17960vV.A0H(AnonymousClass000.A1W(cOq), "Call FixieReflectionConfig.init() first");
            if (BE9.A1U(cOq.A01)) {
                return false;
            }
            Class<?> cls = Class.forName("android.app.QueuedWork");
            Field declaredField = cls.getDeclaredField("sHandler");
            declaredField.setAccessible(true);
            Handler handler = (Handler) declaredField.get((Object) null);
            A00 = handler;
            if (handler == null) {
                Method declaredMethod = cls.getDeclaredMethod("getHandler", new Class[0]);
                declaredMethod.setAccessible(true);
                Handler handler2 = (Handler) declaredMethod.invoke((Object) null, new Object[0]);
                A00 = handler2;
                if (handler2 == null) {
                    Log.w("RefQueuedWork.NullField_sHandle");
                    return false;
                }
            }
            Field declaredField2 = cls.getDeclaredField("sLock");
            declaredField2.setAccessible(true);
            A01 = declaredField2.get((Object) null);
            Field declaredField3 = cls.getDeclaredField("sWork");
            A03 = declaredField3;
            declaredField3.setAccessible(true);
            Field declaredField4 = cls.getDeclaredField("sFinishers");
            A02 = declaredField4;
            declaredField4.setAccessible(true);
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("RefQueuedWork.sdk_int");
            A10.append(Build.VERSION.SDK_INT);
            Log.w(C17900vP.A0C(" exception:", A10, e));
            return false;
        }
    }
}
