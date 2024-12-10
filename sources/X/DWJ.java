package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

public class DWJ implements C18140vp {
    public final int A00;
    public final Object A01;

    public DWJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object get() {
        Paint A06;
        long j;
        int i;
        int i2;
        LinkedBlockingQueue linkedBlockingQueue;
        String str;
        AnonymousClass10I r0;
        boolean z;
        switch (this.A00) {
            case 0:
                return new D55(DWR.A02(this.A01, 48), 6);
            case 1:
                Context context = ((C24897COq) this.A01).A00;
                C17960vV.A0H(AnonymousClass000.A1O((Thread.currentThread().getId() > 0 ? 1 : (Thread.currentThread().getId() == 0 ? 0 : -1))), "Do NOT call on the main thread");
                String[] A1Z = C17880vN.A1Z();
                A1Z[0] = "org.chromium.arc";
                A1Z[1] = "org.chromium.arc.device_management";
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    int i3 = 0;
                    while (true) {
                        if (packageManager.hasSystemFeature(A1Z[i3])) {
                            z = true;
                        } else {
                            i3++;
                            if (i3 >= 2) {
                            }
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                C52292ag r1 = (C52292ag) this.A01;
                C18070vi.A0d(r1, 0);
                r0 = r1.A00;
                linkedBlockingQueue = new LinkedBlockingQueue();
                str = "DocumentCheckQueue";
                break;
            case 3:
                C26541Sn r12 = (C26541Sn) this.A01;
                C18070vi.A0d(r12, 0);
                Set set = C26541Sn.A04;
                r0 = r12.A00.A00;
                linkedBlockingQueue = new LinkedBlockingQueue();
                str = "ProcessImageQueue";
                i2 = 4;
                j = 0;
                i = 1;
                break;
            case 4:
                C26541Sn r13 = (C26541Sn) this.A01;
                C18070vi.A0d(r13, 0);
                Set set2 = C26541Sn.A04;
                r0 = r13.A00.A00;
                linkedBlockingQueue = new LinkedBlockingQueue();
                str = "TranscodeQueue";
                break;
            case 5:
                return ((AnonymousClass10E) ((C000100c) AnonymousClass00E.A00(((Context) this.A01).getApplicationContext(), C000100c.class))).Ao8.A00.A2j.get();
            case 6:
                int A002 = AnonymousClass3Ma.A00((Context) this.A01, 2130971982, 2131103160);
                Paint A062 = AnonymousClass3MW.A06();
                AnonymousClass3MZ.A1D(A002, A062);
                return A062;
            case 7:
                BHY bhy = (BHY) this.A01;
                C18070vi.A0d(bhy, 0);
                if (bhy.A04.A07) {
                    A06 = AnonymousClass3MZ.A0A();
                } else {
                    A06 = AnonymousClass3MW.A06();
                }
                A06.setColorFilter(A06.getColorFilter());
                return A06;
            default:
                return new AtomicReference(((C18140vp) this.A01).get());
        }
        i2 = 1;
        j = 0;
        i = 1;
        return r0.BHv(str, linkedBlockingQueue, i2, i2, i, j);
    }
}
