package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;

/* renamed from: X.03x  reason: invalid class name and case insensitive filesystem */
public class C008803x implements AnonymousClass009 {
    public final Fragment A00;
    public final Object A01 = new Object();
    public volatile Object A02;

    public static final Context A00(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    private C008903z A01() {
        Fragment fragment = this.A00;
        AnonymousClass1FL A1C = fragment.A1C();
        if (A1C != null) {
            C008303s.A00("Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", new Object[]{A1C.getClass()}, A1C instanceof AnonymousClass009);
            AnonymousClass03y AHs = ((C006602x) C000400h.A00(C006602x.class, fragment.A1C())).AHs();
            AHs.BLf(fragment);
            return AHs.BDS();
        }
        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
    }

    public Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = A01();
                }
            }
        }
        return this.A02;
    }

    public C008803x(Fragment fragment) {
        this.A00 = fragment;
    }
}
