package X;

import android.content.res.AssetManager;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: X.0Ma  reason: invalid class name and case insensitive filesystem */
public class C04150Ma {
    public static Method A01;
    public static Method A02;
    public static Method A03;
    public final AssetManager A00 = AssetManager.class.getConstructor(new Class[0]).newInstance(new Object[0]);

    static {
        Class<AssetManager> cls = AssetManager.class;
        try {
            Method declaredMethod = cls.getDeclaredMethod("ensureStringBlocks", new Class[0]);
            A03 = declaredMethod;
            declaredMethod.setAccessible(true);
            Class<String> cls2 = String.class;
            Method declaredMethod2 = cls.getDeclaredMethod("addAssetPath", new Class[]{cls2});
            A02 = declaredMethod2;
            declaredMethod2.setAccessible(true);
            if (Build.VERSION.SDK_INT >= 24) {
                Method declaredMethod3 = cls.getDeclaredMethod("addAssetPathAsSharedLibrary", new Class[]{cls2});
                A01 = declaredMethod3;
                declaredMethod3.setAccessible(true);
                return;
            }
            A01 = A02;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
