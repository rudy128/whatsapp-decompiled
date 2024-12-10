package X;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: X.0RX  reason: invalid class name */
public class AnonymousClass0RX implements MenuItem.OnMenuItemClickListener {
    public static final Class[] A02 = {MenuItem.class};
    public Object A00;
    public Method A01;

    public boolean onMenuItemClick(MenuItem menuItem) {
        try {
            Method method = this.A01;
            if (method.getReturnType() == Boolean.TYPE) {
                return AnonymousClass000.A1Y(method.invoke(this.A00, new Object[]{menuItem}));
            }
            method.invoke(this.A00, new Object[]{menuItem});
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
