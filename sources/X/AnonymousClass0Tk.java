package X;

import androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub;

/* renamed from: X.0Tk  reason: invalid class name */
public class AnonymousClass0Tk implements C15970rV {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Object A03;

    public AnonymousClass0Tk(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f, float f2, int i) {
        this.A02 = i;
        this.A03 = remoteUtils$SurfaceCallbackStub;
        this.A00 = f;
        this.A01 = f2;
    }

    public final void BIx() {
        switch (this.A02) {
            case 0:
                throw AnonymousClass000.A0s("onClick");
            case 1:
                throw AnonymousClass000.A0s("onScroll");
            default:
                throw AnonymousClass000.A0s("onFling");
        }
    }
}
