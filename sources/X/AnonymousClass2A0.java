package X;

import com.facebook.msys.mci.NotificationCenterInternal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2A0  reason: invalid class name */
public class AnonymousClass2A0 extends C70553Bn {
    public final /* synthetic */ C72003Ke A00;
    public final /* synthetic */ NotificationCenterInternal A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ Map A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2A0(C72003Ke r2, NotificationCenterInternal notificationCenterInternal, String str, ArrayList arrayList, Map map) {
        super("dispatchNotificationToCallbacks");
        this.A01 = notificationCenterInternal;
        this.A03 = arrayList;
        this.A02 = str;
        this.A00 = r2;
        this.A04 = map;
    }

    public void run() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((NotificationCenterInternal.NotificationCallbackInternal) it.next()).onNewNotification(this.A02, this.A00, this.A04);
        }
    }
}
