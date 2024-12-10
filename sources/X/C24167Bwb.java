package X;

import dalvik.system.PathClassLoader;

/* renamed from: X.Bwb  reason: case insensitive filesystem */
public final class C24167Bwb extends PathClassLoader {
    public final Class loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
