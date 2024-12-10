package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* renamed from: X.031  reason: invalid class name */
public final class AnonymousClass031 implements AnonymousClass009 {
    public final View A00;
    public final Object A01 = new Object();
    public volatile Object A02;

    public Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    Class<AnonymousClass009> cls = AnonymousClass009.class;
                    View view = this.A00;
                    Context context = view.getContext();
                    while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (context == AnonymousClass00g.A00(context.getApplicationContext())) {
                        C008303s.A00("%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", new Object[]{view.getClass()}, false);
                        context = null;
                    }
                    if (context instanceof AnonymousClass009) {
                        AnonymousClass032 AHt = ((C006602x) C000400h.A00(C006602x.class, (AnonymousClass009) context)).AHt();
                        AHt.CRp(view);
                        this.A02 = AHt.BDU();
                    } else {
                        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", new Object[]{view.getClass()}));
                    }
                }
            }
        }
        return this.A02;
    }

    public AnonymousClass031(View view) {
        this.A00 = view;
    }
}
