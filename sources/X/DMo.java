package X;

import com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl;
import com.facebook.native_bridge.NativeDataPromise;

public class DMo implements AnonymousClass3LY {
    public final /* synthetic */ NetworkClientImpl A00;
    public final /* synthetic */ NativeDataPromise A01;

    public DMo(NetworkClientImpl networkClientImpl, NativeDataPromise nativeDataPromise) {
        this.A00 = networkClientImpl;
        this.A01 = nativeDataPromise;
    }

    public void Btr(Throwable th) {
        this.A01.setException(th.toString());
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        try {
            this.A01.setValue(obj);
        } catch (Exception e) {
            this.A01.setException(e.toString());
        }
    }
}
