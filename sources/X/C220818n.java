package X;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.18n  reason: invalid class name and case insensitive filesystem */
public class C220818n extends C220718m implements AnonymousClass113 {
    public final C220918o A00 = new C220918o();
    public final Context A01;
    public final C221518u A02;
    public final ThreadLocal A03;
    public final Map A04;

    public C220818n BYf() {
        return this;
    }

    public C220518k BSz() {
        return (C220518k) this.A03.get();
    }

    public C220818n(Context context) {
        boolean z = false;
        this.A03 = new C221018p(this);
        this.A01 = context.getApplicationContext();
        this.A02 = new C221518u(context, this);
        C199610h.A07(context == context.getApplicationContext() ? true : z);
        this.A04 = new HashMap();
    }

    public AnonymousClass113 BN6() {
        return this.A02;
    }

    @Deprecated
    public C221318s BYe() {
        C221318s r0;
        List list = BSz().A01;
        if (!list.isEmpty() && (r0 = (C221318s) list.get(list.size() - 1)) != null) {
            return r0;
        }
        throw new IllegalStateException("Should never call getScopeAwareInjector without an active ThreadStack");
    }
}
