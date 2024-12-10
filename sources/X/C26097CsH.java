package X;

import android.app.Activity;
import android.app.ActivityThread;
import android.os.Build;
import com.facebook.common.hiddenapis2.ApiExemption;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.CsH  reason: case insensitive filesystem */
public class C26097CsH {
    public static C26097CsH A00;
    public static COT A01;
    public static Field A02;
    public static Field A03;
    public static final AnonymousClass00H A04 = C18150vq.A02(new DWI(2));

    public static /* synthetic */ Boolean A01() {
        Field field;
        try {
            if (!ApiExemption.removeRestriction_DO_NOT_USE()) {
                return false;
            }
            C24897COq cOq = C24897COq.A02;
            C17960vV.A0H(AnonymousClass000.A1W(cOq), "Call FixieReflectionConfig.init() first");
            if (BE9.A1U(cOq.A01)) {
                return false;
            }
            ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
            if (Build.VERSION.SDK_INT >= 29) {
                field = ActivityThread.class.getDeclaredField("mLastProcessState");
                A03 = field;
            } else {
                Field declaredField = ActivityThread.class.getDeclaredField("mAppThread");
                A02 = declaredField;
                declaredField.setAccessible(true);
                Object obj = A02.get(currentActivityThread);
                if (obj != null) {
                    field = obj.getClass().getDeclaredField("mLastProcessState");
                    A03 = field;
                }
                return true;
            }
            field.setAccessible(true);
            return true;
        } catch (Throwable th) {
            Log.e("FixieReflectionRefActivityThread.ensureInit", th);
            return false;
        }
    }

    public static Activity A00() {
        ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
        if (currentActivityThread != null) {
            try {
                Field declaredField = ActivityThread.class.getDeclaredField("mActivities");
                declaredField.setAccessible(true);
                Map map = (Map) declaredField.get(currentActivityThread);
                if (map != null && !map.isEmpty()) {
                    Iterator A0l = C17890vO.A0l(map);
                    while (A0l.hasNext()) {
                        Object next = A0l.next();
                        if (next != null) {
                            COT cot = A01;
                            if (cot == null) {
                                cot = new COT(next);
                                A01 = cot;
                            }
                            if (!cot.A01.getBoolean(next)) {
                                return (Activity) A01.A00.get(next);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                Log.e("FixieReflectionRefActivityThread.getCurrentActivity", th);
                return null;
            }
        }
        return null;
    }
}
