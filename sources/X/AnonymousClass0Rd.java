package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Rd  reason: invalid class name */
public class AnonymousClass0Rd implements View.OnClickListener {
    public Context A00;
    public Method A01;
    public final View A02;
    public final String A03;

    public void onClick(View view) {
        String A0y;
        Method method = this.A01;
        if (method == null) {
            View view2 = this.A02;
            for (Context context = view2.getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.A03, new Class[]{View.class})) != null) {
                        this.A01 = method;
                        this.A00 = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
            }
            int id = view2.getId();
            if (id == -1) {
                A0y = "";
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(" with id '");
                A10.append(AnonymousClass000.A0Y(view2).getResourceEntryName(id));
                A0y = AnonymousClass000.A0y("'", A10);
            }
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Could not find method ");
            A102.append(this.A03);
            A102.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            A102.append(view2.getClass());
            throw AnonymousClass000.A0o(A0y, A102);
        }
        try {
            method.invoke(this.A00, AnonymousClass000.A1b(view, 1));
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }

    public AnonymousClass0Rd(View view, String str) {
        this.A02 = view;
        this.A03 = str;
    }
}
