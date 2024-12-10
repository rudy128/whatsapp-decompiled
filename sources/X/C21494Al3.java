package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.work.impl.WorkDatabase;
import com.whatsapp.jid.GroupJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* renamed from: X.Al3  reason: case insensitive filesystem */
public class C21494Al3 implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C21494Al3(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
    }

    public final Object call() {
        switch (this.A00) {
            case 0:
                String str = this.A03;
                WorkDatabase workDatabase = ((C20359AHp) this.A01).A02;
                ((AbstractCollection) this.A02).addAll(workDatabase.A0F().BaA(str));
                return workDatabase.A0E().Bbs(str);
            case 1:
                String str2 = this.A03;
                CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) this.A02;
                CameraManager cameraManager = ((C26809DEr) this.A01).A0O;
                C28111Yx.A02(cameraManager);
                cameraManager.openCamera(str2, stateCallback, (Handler) null);
                return stateCallback;
            default:
                C173348uv r4 = (C173348uv) this.A01;
                String str3 = this.A03;
                ArrayList A10 = C17880vN.A10((HashSet) this.A02);
                try {
                    AnonymousClass19T r1 = r4.A0A;
                    r1.markerPoint(494345332, "start_outgoing_call_start");
                    int A002 = AnonymousClass1VQ.A00(r4.A05.A00, (AnonymousClass1VQ) r4.A03, (GroupJid) null, (Integer) null, str3, (String) null, A10, 26, 0, false, false, false, false);
                    r1.markerPoint(494345332, "start_outgoing_call_end");
                    return Integer.valueOf(A002);
                } catch (Throwable th) {
                    r4.A0A.markerPoint(494345332, "start_outgoing_call_end");
                    throw th;
                }
        }
    }
}
