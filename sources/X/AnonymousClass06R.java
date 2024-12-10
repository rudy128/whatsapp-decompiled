package X;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: X.06R  reason: invalid class name */
public class AnonymousClass06R extends AnonymousClass0SF implements C16550sc {
    public static Method A01;
    public C16550sc A00;

    public void A06() {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A01;
            if (method != null) {
                try {
                    method.invoke(this.A0A, new Object[]{false});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            AnonymousClass0DG.A00(this.A0A);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                A01 = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C009205e A02(Context context, boolean z) {
        AnonymousClass06K r0 = new AnonymousClass06K(context, z);
        r0.A00 = this;
        return r0;
    }

    public void A04() {
        if (Build.VERSION.SDK_INT >= 23) {
            C03780Kp.A00(this.A0A);
        }
    }

    public void A05() {
        if (Build.VERSION.SDK_INT >= 23) {
            C03780Kp.A01(this.A0A);
        }
    }

    public void BwH(MenuItem menuItem, C003301m r3) {
        C16550sc r0 = this.A00;
        if (r0 != null) {
            r0.BwH(menuItem, r3);
        }
    }

    public void BwI(MenuItem menuItem, C003301m r3) {
        C16550sc r0 = this.A00;
        if (r0 != null) {
            r0.BwI(menuItem, r3);
        }
    }
}
