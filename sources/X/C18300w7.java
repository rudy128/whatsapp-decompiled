package X;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.0w7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C18300w7 implements C18290w6 {
    public final /* synthetic */ String A00;

    public final Object get() {
        String str = this.A00;
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C18420wN(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e) {
            throw new C18420wN(String.format("Could not instantiate %s.", new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new C18420wN(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new C18420wN(String.format("Could not instantiate %s", new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new C18420wN(String.format("Could not instantiate %s", new Object[]{str}), e4);
        }
    }

    public /* synthetic */ C18300w7(String str) {
        this.A00 = str;
    }
}
