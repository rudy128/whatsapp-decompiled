package X;

import android.hardware.Camera;
import android.os.SystemClock;
import java.util.List;

/* renamed from: X.CyC  reason: case insensitive filesystem */
public class C26350CyC implements Camera.PreviewCallback {
    public final int A00;
    public final Object A01;

    public C26350CyC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.CXa, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.CXa, java.lang.Object] */
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        switch (this.A00) {
            case 0:
                if (bArr != null) {
                    C25986Cq0.A00().A02();
                    ? obj = new Object();
                    C25229CbQ cbQ = (C25229CbQ) this.A01;
                    int i = cbQ.A00;
                    C26132Csv csv = cbQ.A01;
                    int i2 = csv.A02;
                    int i3 = csv.A01;
                    obj.A09 = bArr;
                    obj.A01 = i;
                    obj.A02 = i2;
                    obj.A00 = i3;
                    obj.A03 = SystemClock.elapsedRealtimeNanos();
                    List list = cbQ.A03.A00;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((E4h) list.get(i4)).C1f(obj);
                    }
                    return;
                }
                return;
            case 1:
                if (bArr != null) {
                    C25986Cq0.A00().A02();
                    ? obj2 = new Object();
                    C25229CbQ cbQ2 = (C25229CbQ) this.A01;
                    int i5 = cbQ2.A00;
                    C26132Csv csv2 = cbQ2.A01;
                    int i6 = csv2.A02;
                    int i7 = csv2.A01;
                    obj2.A09 = bArr;
                    obj2.A01 = i5;
                    obj2.A02 = i6;
                    obj2.A00 = i7;
                    obj2.A03 = SystemClock.elapsedRealtimeNanos();
                    List list2 = cbQ2.A03.A00;
                    int size2 = list2.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        ((E4h) list2.get(i8)).C1f(obj2);
                    }
                    camera.addCallbackBuffer(bArr);
                    return;
                }
                return;
            case 2:
                ((Bq6) this.A01).A0I.A01("cameraView1");
                return;
            default:
                C109835e5 r3 = (C109835e5) this.A01;
                r3.A05.post(new AnonymousClass3C5(r3, bArr, camera, 31));
                return;
        }
    }
}
