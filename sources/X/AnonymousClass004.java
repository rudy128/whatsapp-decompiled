package X;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

/* renamed from: X.004  reason: invalid class name */
public abstract class AnonymousClass004 extends Application {
    public static final int MODULES_MASK = 8;
    public static final int NATIVE_LIBRARY_MASK = 2;
    public static final int RESOURCES_MASK = 4;
    public static final int SECONDARY_DEX_MASK = 1;
    public AnonymousClass00L delegate;
    public final String delegateClassName;
    public final int exopackageFlags;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.00L] */
    private synchronized void ensureDelegate() {
        if (this.delegate == null) {
            this.delegate = new Object();
        }
    }

    public abstract AnonymousClass00L createDelegate();

    public void onBaseContextAttached() {
    }

    public boolean isExopackageEnabledForNativeLibraries() {
        if ((this.exopackageFlags & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean isExopackageEnabledForResources() {
        if ((this.exopackageFlags & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean isExopackageEnabledForSecondaryDex() {
        if ((this.exopackageFlags & 1) == 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass004(String str, int i) {
        this.delegateClassName = str;
        this.exopackageFlags = i;
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        ensureDelegate();
    }

    public final AnonymousClass00L getDelegateIfPresent() {
        return this.delegate;
    }

    public Object getSystemService(String str) {
        return super.getSystemService(str);
    }

    public void onCreate() {
        super.onCreate();
        if (isExopackageEnabledForResources()) {
            C05000Px.A03(this);
        }
        ensureDelegate();
    }

    public final void onLowMemory() {
        super.onLowMemory();
    }

    public final void onTerminate() {
        super.onTerminate();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
    }
}
