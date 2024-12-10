package X;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1GF  reason: invalid class name */
public final class AnonymousClass1GF implements AnonymousClass1GC {
    public final AnonymousClass1FE A00;

    public void C6U(C27581Wq r10, AnonymousClass1F9 r11) {
        C18070vi.A0d(r11, 0);
        C18070vi.A0d(r10, 1);
        if (r10 == C27581Wq.ON_CREATE) {
            r11.getLifecycle().A06(this);
            AnonymousClass1FE r5 = this.A00;
            Bundle A002 = r5.BYX().A00("androidx.savedstate.Restarter");
            if (A002 != null) {
                ArrayList<String> stringArrayList = A002.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, AnonymousClass1GF.class.getClassLoader()).asSubclass(AnonymousClass3KC.class);
                            C18070vi.A0X(asSubclass);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    C18070vi.A0X(declaredConstructor.newInstance(new Object[0]));
                                    if (r5 instanceof AnonymousClass1FD) {
                                        C24081Iu Bba = ((AnonymousClass1FD) r5).Bba();
                                        AnonymousClass1GB BYX = r5.BYX();
                                        Map map = Bba.A00;
                                        Iterator it2 = new HashSet(map.keySet()).iterator();
                                        while (it2.hasNext()) {
                                            Object next2 = it2.next();
                                            C18070vi.A0d(next2, 0);
                                            AnonymousClass1J2 r1 = (AnonymousClass1J2) map.get(next2);
                                            C18070vi.A0b(r1);
                                            C60272ng.A00(r5.getLifecycle(), r1, BYX);
                                        }
                                        if (!new HashSet(map.keySet()).isEmpty()) {
                                            BYX.A02();
                                        }
                                    } else {
                                        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                    }
                                } catch (Exception e) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Failed to instantiate ");
                                    sb.append(next);
                                    throw new RuntimeException(sb.toString(), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Class ");
                                sb2.append(asSubclass.getSimpleName());
                                sb2.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(sb2.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Class ");
                            sb3.append(next);
                            sb3.append(" wasn't found");
                            throw new RuntimeException(sb3.toString(), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    public AnonymousClass1GF(AnonymousClass1FE r1) {
        this.A00 = r1;
    }
}
