package X;

import android.widget.PopupWindow;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.Dnq  reason: case insensitive filesystem */
public final class C27915Dnq extends AnonymousClass11G implements C18090vk {
    public static final C27915Dnq A00 = new C27915Dnq();

    public C27915Dnq() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            Method declaredMethod = cls.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodError e) {
            Log.e("popupwindowcompat/settouchmodal/no such method", e);
            return null;
        }
    }
}
