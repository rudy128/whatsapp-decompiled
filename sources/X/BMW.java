package X;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BMW extends C65142vu {
    public View A00;
    public E7C A01;

    public void C9I() {
        this.A01.setVisibility(4);
    }

    public void C9J() {
        this.A01.setVisibility(0);
    }

    public void C9H(AnonymousClass1LG r8) {
        r8.A0O(this);
        View view = this.A00;
        if (Build.VERSION.SDK_INT == 28) {
            if (!D77.A05) {
                try {
                    D77.A00();
                    Method declaredMethod = D77.A01.getDeclaredMethod("removeGhost", new Class[]{View.class});
                    D77.A03 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
                }
                D77.A05 = true;
            }
            Method method = D77.A03;
            if (method != null) {
                try {
                    method.invoke((Object) null, AnonymousClass000.A1b(view, 1));
                } catch (IllegalAccessException unused) {
                } catch (InvocationTargetException e2) {
                    throw AnonymousClass8BR.A0x(e2.getCause());
                }
            }
        } else {
            C22647BHl bHl = (C22647BHl) view.getTag(2131431115);
            if (bHl != null) {
                int i = bHl.A00 - 1;
                bHl.A00 = i;
                if (i <= 0) {
                    ((ViewGroup) bHl.getParent()).removeView(bHl);
                }
            }
        }
        view.setTag(2131436427, (Object) null);
        view.setTag(2131433423, (Object) null);
    }
}
