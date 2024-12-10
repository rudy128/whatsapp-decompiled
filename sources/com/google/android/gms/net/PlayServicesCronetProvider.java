package com.google.android.gms.net;

import X.BYT;
import X.C18210vx;
import X.C24394C1p;
import X.C26234CvS;
import X.C26274CwP;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

public class PlayServicesCronetProvider extends CronetProvider {
    public static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    public static final String TAG = "PlayServicesCronet";

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    private void tryToInstallCronetProvider() {
        try {
            C26234CvS.A03(this.mContext);
        } catch (BYT unused) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        } catch (C24394C1p unused2) {
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        }
    }

    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        try {
            C26234CvS.A03(this.mContext);
            Throwable th = null;
            try {
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) ((ClassLoader) C18210vx.A00(((C26274CwP) C18210vx.A00(C26234CvS.A00())).A08().getClassLoader())).loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{this.mContext}));
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                builder = null;
                th = e;
            }
            if (th == null) {
                C18210vx.A02(builder, "The value of the constructed builder should never be null");
                return builder;
            }
            throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", th);
        } catch (BYT e2) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e2);
        } catch (C24394C1p e3) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e3);
        }
    }

    public String getVersion() {
        tryToInstallCronetProvider();
        return C26234CvS.A02();
    }

    public boolean isEnabled() {
        tryToInstallCronetProvider();
        return C26234CvS.A04();
    }

    public PlayServicesCronetProvider(Context context) {
        super(context);
    }
}
