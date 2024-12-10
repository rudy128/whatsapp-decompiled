package androidx.car.app.utils;

import X.AnonymousClass000;
import X.AnonymousClass0LU;
import X.AnonymousClass0RM;
import X.AnonymousClass0Td;
import X.AnonymousClass0Tf;
import X.AnonymousClass0Tk;
import X.AnonymousClass0ZW;
import X.C04400Nd;
import X.C15360qV;
import X.C15970rV;
import X.C23381Fv;
import android.graphics.Rect;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.ISurfaceCallback;

public class RemoteUtils$SurfaceCallbackStub extends ISurfaceCallback.Stub {
    public final C23381Fv mLifecycle;
    public final C15360qV mSurfaceCallback;

    public static void A00(C15970rV r1, C23381Fv r2, String str) {
        AnonymousClass0LU.A00(new AnonymousClass0ZW(r1, r2, str));
    }

    /* renamed from: lambda$onClick$7$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m22lambda$onClick$7$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(float f, float f2) {
        throw AnonymousClass000.A0s("onClick");
    }

    /* renamed from: lambda$onFling$5$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m23lambda$onFling$5$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(float f, float f2) {
        throw AnonymousClass000.A0s("onFling");
    }

    /* renamed from: lambda$onScale$6$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m24lambda$onScale$6$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(float f, float f2, float f3) {
        throw AnonymousClass000.A0s("onScale");
    }

    /* renamed from: lambda$onScroll$4$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m25lambda$onScroll$4$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(float f, float f2) {
        throw AnonymousClass000.A0s("onScroll");
    }

    /* renamed from: lambda$onStableAreaChanged$2$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m26lambda$onStableAreaChanged$2$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(Rect rect) {
        throw AnonymousClass000.A0s("onStableAreaChanged");
    }

    /* renamed from: lambda$onVisibleAreaChanged$1$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m29lambda$onVisibleAreaChanged$1$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(Rect rect) {
        throw AnonymousClass000.A0s("onVisibleAreaChanged");
    }

    public void onClick(float f, float f2) {
        A00(new AnonymousClass0Tk(this, f, f2, 0), this.mLifecycle, "onClick");
    }

    public void onFling(float f, float f2) {
        A00(new AnonymousClass0Tk(this, f, f2, 2), this.mLifecycle, "onFling");
    }

    public void onScale(float f, float f2, float f3) {
        A00(new AnonymousClass0Td(this, 8), this.mLifecycle, "onScale");
    }

    public void onScroll(float f, float f2) {
        A00(new AnonymousClass0Tk(this, f, f2, 1), this.mLifecycle, "onScroll");
    }

    public void onStableAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        C04400Nd.A00(iOnDoneCallback, new AnonymousClass0Tf(rect, this, 5), this.mLifecycle, "onStableAreaChanged");
    }

    public void onSurfaceAvailable(AnonymousClass0RM r4, IOnDoneCallback iOnDoneCallback) {
        C04400Nd.A00(iOnDoneCallback, new AnonymousClass0Tf(r4, this, 4), this.mLifecycle, "onSurfaceAvailable");
    }

    public void onSurfaceDestroyed(AnonymousClass0RM r4, IOnDoneCallback iOnDoneCallback) {
        C04400Nd.A00(iOnDoneCallback, new AnonymousClass0Tf(r4, this, 2), this.mLifecycle, "onSurfaceDestroyed");
    }

    public void onVisibleAreaChanged(Rect rect, IOnDoneCallback iOnDoneCallback) {
        C04400Nd.A00(iOnDoneCallback, new AnonymousClass0Tf(rect, this, 3), this.mLifecycle, "onVisibleAreaChanged");
    }

    public RemoteUtils$SurfaceCallbackStub(C23381Fv r1, C15360qV r2) {
        this.mLifecycle = r1;
        this.mSurfaceCallback = r2;
    }

    /* renamed from: lambda$onSurfaceAvailable$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m27lambda$onSurfaceAvailable$0$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(AnonymousClass0RM r2) {
        r2.A00();
        throw AnonymousClass000.A0s("onSurfaceAvailable");
    }

    /* renamed from: lambda$onSurfaceDestroyed$3$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub  reason: not valid java name */
    public /* synthetic */ Object m28lambda$onSurfaceDestroyed$3$androidxcarapputilsRemoteUtils$SurfaceCallbackStub(AnonymousClass0RM r2) {
        r2.A00();
        throw AnonymousClass000.A0s("onSurfaceDestroyed");
    }
}
