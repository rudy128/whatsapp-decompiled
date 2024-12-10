package X;

import android.util.Log;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.lang.reflect.Proxy;

/* renamed from: X.CjC  reason: case insensitive filesystem */
public final class C25628CjC {
    public static final boolean A00() {
        String str;
        try {
            ClassLoader classLoader = D7H.class.getClassLoader();
            if (classLoader == null) {
                return false;
            }
            C24745CIh cIh = new C24745CIh(classLoader);
            WindowExtensions windowExtensions = WindowExtensionsProvider.getWindowExtensions();
            C18070vi.A0X(windowExtensions);
            if (new CYm(cIh, windowExtensions, classLoader).A00() != null) {
                return true;
            }
            return false;
        } catch (NoClassDefFoundError unused) {
            str = "Embedding extension version not found";
            Log.d("EmbeddingCompat", str);
            return false;
        } catch (UnsupportedOperationException unused2) {
            str = "Stub Extension";
            Log.d("EmbeddingCompat", str);
            return false;
        }
    }

    public final ActivityEmbeddingComponent A01() {
        ClassLoader classLoader;
        if (A00() && (classLoader = D7H.class.getClassLoader()) != null) {
            C24745CIh cIh = new C24745CIh(classLoader);
            WindowExtensions windowExtensions = WindowExtensionsProvider.getWindowExtensions();
            C18070vi.A0X(windowExtensions);
            ActivityEmbeddingComponent A00 = new CYm(cIh, windowExtensions, classLoader).A00();
            if (A00 != null) {
                return A00;
            }
        }
        Object newProxyInstance = Proxy.newProxyInstance(D7H.class.getClassLoader(), new Class[]{ActivityEmbeddingComponent.class}, new C27091DTq());
        C18070vi.A0z(newProxyInstance, "null cannot be cast to non-null type androidx.window.extensions.embedding.ActivityEmbeddingComponent");
        return (ActivityEmbeddingComponent) newProxyInstance;
    }
}
