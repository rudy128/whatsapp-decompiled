package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1GB  reason: invalid class name */
public final class AnonymousClass1GB {
    public Bundle A00;
    public boolean A01;
    public boolean A02 = true;
    public boolean A03;
    public C65122vs A04;
    public final C001200q A05 = new C001200q();

    public final Bundle A00(String str) {
        C18070vi.A0d(str, 0);
        if (this.A03) {
            Bundle bundle = this.A00;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.A00;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.A00;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.A00 = null;
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final void A03(AnonymousClass1GI r3, String str) {
        C18070vi.A0d(str, 0);
        C18070vi.A0d(r3, 1);
        if (this.A05.A02(str, r3) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void A04(String str) {
        C18070vi.A0d(str, 0);
        this.A05.A01(str);
    }

    public final AnonymousClass1GI A01() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C18070vi.A0V(entry);
            Object key = entry.getKey();
            AnonymousClass1GI r1 = (AnonymousClass1GI) entry.getValue();
            if (C18070vi.A18(key, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return r1;
            }
        }
        return null;
    }

    public final void A02() {
        Class<C65112vr> cls = C65112vr.class;
        if (this.A02) {
            C65122vs r0 = this.A04;
            if (r0 == null) {
                r0 = new C65122vs(this);
            }
            this.A04 = r0;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                C65122vs r02 = this.A04;
                if (r02 != null) {
                    String name = cls.getName();
                    C18070vi.A0X(name);
                    r02.A00.add(name);
                }
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Class ");
                sb.append(cls.getSimpleName());
                sb.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(sb.toString(), e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
