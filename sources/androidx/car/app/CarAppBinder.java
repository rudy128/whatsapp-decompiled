package androidx.car.app;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0CX;
import X.AnonymousClass0DU;
import X.AnonymousClass0I6;
import X.AnonymousClass0LU;
import X.AnonymousClass0RM;
import X.AnonymousClass0Td;
import X.AnonymousClass0Tf;
import X.AnonymousClass0Tj;
import X.AnonymousClass0YA;
import X.AnonymousClass0ZR;
import X.C04180Md;
import X.C04400Nd;
import X.C23381Fv;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.Looper;
import android.util.Log;
import androidx.car.app.ICarApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;

public final class CarAppBinder extends ICarApp.Stub {
    public AnonymousClass0YA mCurrentSession;
    public final SessionInfo mCurrentSessionInfo;
    public HandshakeInfo mHandshakeInfo;
    public C04180Md mHostValidator;
    public CarAppService mService;

    public void destroy() {
        this.mCurrentSession = null;
        this.mCurrentSession = null;
        this.mHostValidator = null;
        this.mHandshakeInfo = null;
        this.mService = null;
    }

    /* renamed from: lambda$getManager$7$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ void m0lambda$getManager$7$androidxcarappCarAppBinder(String str, IOnDoneCallback iOnDoneCallback) {
        Object obj = null;
        obj.getClass();
        Log.e("CarApp", AnonymousClass000.A0y("%s is not a valid manager", AnonymousClass000.A11(str)));
        C04400Nd.A02(iOnDoneCallback, "getManager", new InvalidParameterException(AnonymousClass000.A0y(" is not a valid manager type", AnonymousClass000.A11(str))));
    }

    /* renamed from: lambda$onAppCreate$0$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ Object m1lambda$onAppCreate$0$androidxcarappCarAppBinder(ICarHost iCarHost, Configuration configuration, Intent intent) {
        Object obj = null;
        obj.getClass();
        throw AnonymousClass000.A0s("getLifecycle");
    }

    /* renamed from: lambda$onAppPause$3$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ Object m2lambda$onAppPause$3$androidxcarappCarAppBinder() {
        Object obj = null;
        obj.getClass();
        throw AnonymousClass000.A0s("handleLifecycleEvent");
    }

    /* renamed from: lambda$onAppResume$2$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ Object m3lambda$onAppResume$2$androidxcarappCarAppBinder() {
        Object obj = null;
        obj.getClass();
        throw AnonymousClass000.A0s("handleLifecycleEvent");
    }

    /* renamed from: lambda$onAppStart$1$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ Object m4lambda$onAppStart$1$androidxcarappCarAppBinder() {
        Object obj = null;
        obj.getClass();
        throw AnonymousClass000.A0s("handleLifecycleEvent");
    }

    /* renamed from: lambda$onAppStop$4$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ Object m5lambda$onAppStop$4$androidxcarappCarAppBinder() {
        Object obj = null;
        obj.getClass();
        throw AnonymousClass000.A0s("handleLifecycleEvent");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Throwable, java.lang.Object, X.0YA] */
    /* renamed from: lambda$onConfigurationChanged$6$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ Object m6lambda$onConfigurationChanged$6$androidxcarappCarAppBinder(Configuration configuration) {
        ? r0 = 0;
        r0.getClass();
        onConfigurationChangedInternal(r0, configuration);
        throw r0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Throwable, java.lang.Object, X.0YA] */
    /* renamed from: lambda$onNewIntent$5$androidx-car-app-CarAppBinder  reason: not valid java name */
    public /* synthetic */ Object m7lambda$onNewIntent$5$androidxcarappCarAppBinder(Intent intent) {
        ? r0 = 0;
        r0.getClass();
        onNewIntentInternal(r0, intent);
        throw r0;
    }

    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        C04400Nd.A00(iOnDoneCallback, new AnonymousClass0Td(this, 0), (C23381Fv) null, "onAppPause");
    }

    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        C04400Nd.A00(iOnDoneCallback, new AnonymousClass0Td(this, 3), (C23381Fv) null, "onAppResume");
    }

    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        C04400Nd.A00(iOnDoneCallback, new AnonymousClass0Td(this, 1), (C23381Fv) null, "onAppStart");
    }

    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        C04400Nd.A00(iOnDoneCallback, new AnonymousClass0Td(this, 2), (C23381Fv) null, "onAppStop");
    }

    public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        C04400Nd.A00(iOnDoneCallback, new AnonymousClass0Tf(configuration, this, 0), (C23381Fv) null, "onConfigurationChanged");
    }

    public void onDestroyLifecycle() {
        this.mCurrentSession = null;
    }

    public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
        C04400Nd.A00(iOnDoneCallback, new AnonymousClass0Tf(intent, this, 1), (C23381Fv) null, "onNewIntent");
    }

    private C04180Md getHostValidator() {
        C04180Md r0 = this.mHostValidator;
        if (r0 != null) {
            return r0;
        }
        Object obj = null;
        obj.getClass();
        throw AnonymousClass000.A0s("createHostValidator");
    }

    public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        Object obj = null;
        try {
            obj.getClass();
            throw AnonymousClass000.A0s("getAppInfo");
        } catch (IllegalArgumentException e) {
            C04400Nd.A02(iOnDoneCallback, "getAppInfo", e);
        }
    }

    public void getManager(String str, IOnDoneCallback iOnDoneCallback) {
        AnonymousClass0LU.A00(new AnonymousClass0ZR(this, iOnDoneCallback, str));
    }

    public void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", AnonymousClass001.A1E(intent, "onAppCreate intent: ", AnonymousClass000.A10()));
        }
        C04400Nd.A01(iOnDoneCallback, new AnonymousClass0Tj(intent, configuration, this, iCarHost), "onAppCreate");
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate completed");
        }
    }

    public void onHandshakeCompleted(AnonymousClass0RM r9, IOnDoneCallback iOnDoneCallback) {
        Object obj = null;
        obj.getClass();
        try {
            String str = ((HandshakeInfo) r9.A00()).mHostPackageName;
            str.getClass();
            int callingUid = Binder.getCallingUid();
            AnonymousClass0I6 r4 = new AnonymousClass0I6(str, callingUid);
            getHostValidator();
            if (Log.isLoggable("CarApp.Val", 3)) {
                Log.d("CarApp.Val", AnonymousClass001.A1E(r4, "Evaluating ", AnonymousClass000.A10()));
            }
            if (Log.isLoggable("CarApp.Val", 3)) {
                Log.d("CarApp.Val", "Accepted - Validator disabled, all hosts allowed");
            }
            if (1 == 0) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Unknown host '");
                A10.append(str);
                C04400Nd.A02(iOnDoneCallback, "onHandshakeCompleted", AnonymousClass001.A13("', uid:", A10, callingUid));
                return;
            }
            throw AnonymousClass000.A0s("getAppInfo");
        } catch (AnonymousClass0CX | IllegalArgumentException unused) {
            throw AnonymousClass000.A0s("setHostInfo");
        }
    }

    public void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int i = handshakeInfo.mHostCarAppApiLevel;
        if (i >= 1) {
            ClassLoader classLoader = AnonymousClass0DU.class.getClassLoader();
            classLoader.getClass();
            InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
            if (resourceAsStream != null) {
                try {
                    String readLine = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
                    int parseInt = Integer.parseInt(readLine);
                    if (parseInt < 1 || parseInt > 6) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Unrecognized Car API level: ");
                        throw AnonymousClass000.A0o(readLine, A10);
                    } else if (i <= parseInt) {
                        this.mHandshakeInfo = handshakeInfo;
                        return;
                    }
                } catch (IOException unused) {
                    throw AnonymousClass000.A0n("Unable to read Car API level file");
                }
            } else {
                throw AnonymousClass000.A0n(String.format("Car API level file %s not found", AnonymousClass000.A1b("car-app-api.level", 1)));
            }
        }
        throw AnonymousClass001.A13("Invalid Car App API level received: ", AnonymousClass000.A10(), i);
    }

    public CarAppBinder(CarAppService carAppService, SessionInfo sessionInfo) {
        this.mService = carAppService;
        this.mCurrentSessionInfo = sessionInfo;
    }

    private C23381Fv getCurrentLifecycle() {
        return null;
    }

    private void onConfigurationChangedInternal(AnonymousClass0YA r4, Configuration configuration) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", AnonymousClass001.A1E(configuration, "onCarConfigurationChanged configuration: ", AnonymousClass000.A10()));
            }
            throw AnonymousClass000.A0s("onCarConfigurationChangedInternal");
        }
        throw AnonymousClass000.A0n("Not running on main thread when it is required to");
    }

    private void onNewIntentInternal(AnonymousClass0YA r3, Intent intent) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw AnonymousClass000.A0s("onNewIntent");
        }
        throw AnonymousClass000.A0n("Not running on main thread when it is required to");
    }

    public AnonymousClass0YA getCurrentSession() {
        return null;
    }

    public SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    public HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    public void onAutoDriveEnabled() {
    }
}
