package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* renamed from: X.BjQ  reason: case insensitive filesystem */
public final class C23534BjQ extends C27079DTe {
    public final /* synthetic */ IBinder A00;
    public final /* synthetic */ C26337Cxu A01;

    public C23534BjQ(IBinder iBinder, C26337Cxu cxu) {
        this.A00 = iBinder;
        this.A01 = cxu;
    }

    public final void b() {
        C26028Cqm cqm = this.A01.A00;
        cqm.A01 = (IInterface) cqm.A07.a(this.A00);
        C25764Cla cla = cqm.A06;
        cla.A02("linkToDeath", new Object[0]);
        try {
            cqm.A01.asBinder().linkToDeath(cqm.A05, 0);
        } catch (RemoteException e) {
            cla.A01("linkToDeath failed", e, new Object[0]);
        }
        cqm.A02 = false;
        List<Object> list = cqm.A0B;
        for (Object A1P : list) {
            C108945cZ.A1P(A1P);
        }
        list.clear();
    }
}
