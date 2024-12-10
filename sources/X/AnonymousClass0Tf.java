package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import androidx.car.app.CarAppBinder;
import androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub;

/* renamed from: X.0Tf  reason: invalid class name */
public class AnonymousClass0Tf implements C15970rV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass0Tf(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void BIx() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                ((CarAppBinder) obj).m6lambda$onConfigurationChanged$6$androidxcarappCarAppBinder((Configuration) this.A02);
                break;
            case 1:
                ((CarAppBinder) obj).m7lambda$onNewIntent$5$androidxcarappCarAppBinder((Intent) this.A02);
                break;
            case 2:
                ((RemoteUtils$SurfaceCallbackStub) obj).m28lambda$onSurfaceDestroyed$3$androidxcarapputilsRemoteUtils$SurfaceCallbackStub((AnonymousClass0RM) this.A02);
                break;
            case 3:
                ((RemoteUtils$SurfaceCallbackStub) obj).m29lambda$onVisibleAreaChanged$1$androidxcarapputilsRemoteUtils$SurfaceCallbackStub((Rect) this.A02);
                break;
            case 4:
                ((RemoteUtils$SurfaceCallbackStub) obj).m27lambda$onSurfaceAvailable$0$androidxcarapputilsRemoteUtils$SurfaceCallbackStub((AnonymousClass0RM) this.A02);
                break;
            default:
                ((RemoteUtils$SurfaceCallbackStub) obj).m26lambda$onStableAreaChanged$2$androidxcarapputilsRemoteUtils$SurfaceCallbackStub((Rect) this.A02);
                break;
        }
        throw null;
    }
}
