package X;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.facebook.wearable.applinks.AppLinkLinkInfoRequest;
import java.util.concurrent.Executor;

public final class CZ7 {
    public final Context A00;
    public final CL9 A01;
    public final C22869BTd A02;
    public final Executor A03;
    public final /* synthetic */ Cw1 A04;

    /* JADX WARNING: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C24337BzY r15, java.util.UUID r16, X.C22821Di r17) {
        /*
            r14 = this;
            r0 = 0
            r7 = r16
            X.C18070vi.A0d(r7, r0)
            X.Cw1 r1 = r14.A04
            r3 = 1
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0F
            java.lang.Object r4 = r0.get(r7)
            X.9hg r4 = (X.C188599hg) r4
            r5 = r17
            if (r4 != 0) goto L_0x0034
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "switchLink: linkedDeviceManager is null for serviceUUID="
            java.lang.String r2 = X.AnonymousClass001.A1E(r7, r0, r1)
            r1 = 0
            java.lang.String r0 = "lam:LinkedAppManager"
            X.C26294Cx6.A09(r0, r2, r1)
            int r0 = r15.ordinal()
            if (r0 == r3) goto L_0x0031
            X.Bzt r0 = X.C24358Bzt.FAILED_TO_SWITCH_TO_WIFI
        L_0x002d:
            r5.invoke(r0)
        L_0x0030:
            return
        L_0x0031:
            X.Bzt r0 = X.C24358Bzt.FAILED_TO_SWITCH_TO_BTC
            goto L_0x002d
        L_0x0034:
            int r0 = r15.ordinal()
            r6 = 0
            if (r0 == r3) goto L_0x00bc
            X.ByZ r10 = X.C24276ByZ.WifiTcpIp
            X.Ds5 r3 = X.C28146Ds5.A00
            X.AwZ r2 = new X.AwZ
            r2.<init>(r1, r15, r7, r5)
        L_0x0044:
            X.0vk r2 = (X.C18090vk) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "switchLink transportType="
            java.lang.String r1 = X.AnonymousClass001.A1E(r10, r0, r1)
            java.lang.String r0 = "lam:LinkedDeviceManager"
            X.C26294Cx6.A06(r0, r1)
            X.Csp r7 = r4.A00
            if (r7 == 0) goto L_0x0159
            X.Dqu r5 = new X.Dqu
            r5.<init>(r7, r4, r3)
            X.DhP r4 = new X.DhP
            r4.<init>(r2)
            X.Cw0 r3 = r7.A01
            if (r3 == 0) goto L_0x0152
            java.util.concurrent.ConcurrentHashMap r12 = r3.A08
            java.util.Collection r0 = r12.values()
            X.C18070vi.A0X(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0074:
            boolean r0 = r1.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r9 = r1.next()
            r0 = r9
            X.C6o r0 = (X.C24496C6o) r0
            X.ByZ r0 = r0.A02()
            if (r0 != r10) goto L_0x0074
        L_0x0088:
            X.C6o r9 = (X.C24496C6o) r9
            java.util.concurrent.ConcurrentHashMap r11 = r3.A07
            java.util.Collection r0 = r11.values()
            X.C18070vi.A0X(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x0097:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r1 = r8.next()
            r0 = r1
            X.C6o r0 = (X.C24496C6o) r0
            X.ByZ r0 = r0.A02()
            if (r0 != r10) goto L_0x0097
        L_0x00aa:
            if (r9 == 0) goto L_0x00af
            if (r1 == 0) goto L_0x00af
            r2 = r9
        L_0x00af:
            java.lang.String r9 = "LinkManagerImpl"
            if (r2 == 0) goto L_0x00f3
            java.io.InputStream r0 = r2.A03()
            goto L_0x00c7
        L_0x00b8:
            r1 = r2
            goto L_0x00aa
        L_0x00ba:
            r9 = r2
            goto L_0x0088
        L_0x00bc:
            X.ByZ r10 = X.C24276ByZ.BtcRfcomm
            X.Ds4 r3 = X.C28145Ds4.A00
            X.AwY r2 = new X.AwY
            r2.<init>(r1, r15, r7, r5)
            goto L_0x0044
        L_0x00c7:
            int r0 = r0.available()     // Catch:{ all -> 0x00d0 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00d5
        L_0x00d0:
            r0 = move-exception
            X.1IU r13 = X.C108945cZ.A1J(r0)
        L_0x00d5:
            r8 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            boolean r0 = r13 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x00df
            r13 = r1
        L_0x00df:
            int r0 = X.AnonymousClass000.A0M(r13)
            if (r0 == r8) goto L_0x00f3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Link is available for type: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r10, r0, r1)
            X.C26294Cx6.A06(r9, r0)
            goto L_0x0111
        L_0x00f3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Link is unavailable for type: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r10, r0, r1)
            X.C26294Cx6.A06(r9, r0)
            if (r2 == 0) goto L_0x0110
            java.util.UUID r0 = X.C26256Cw0.A01(r2)
            r12.remove(r0)
            java.util.UUID r0 = X.C26256Cw0.A00(r2)
            r11.remove(r0)
        L_0x0110:
            r2 = 0
        L_0x0111:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "switchLink: Switching to linkType="
            r1.append(r0)
            if (r2 == 0) goto L_0x014c
            X.ByZ r0 = r2.A02()
        L_0x0120:
            java.lang.String r1 = X.C17890vO.A0V(r0, r1)
            java.lang.String r0 = "lam:LinkedDevice"
            X.C26294Cx6.A06(r0, r1)
            if (r2 == 0) goto L_0x014e
            X.C0r r0 = X.C24374C0r.READY
            com.meta.common.monad.railway.Result r3 = X.C26127Csp.A01(r2, r6, r3, r7, r0)
            X.DpN r1 = new X.DpN
            r1.<init>(r5)
            boolean r2 = r3.A01
            if (r2 == 0) goto L_0x013f
            java.lang.Object r0 = r3.A00
            r1.invoke(r0)
        L_0x013f:
            X.DpO r1 = new X.DpO
            r1.<init>(r4)
            if (r2 != 0) goto L_0x0030
            java.lang.Object r0 = r3.A00
            r1.invoke(r0)
            return
        L_0x014c:
            r0 = 0
            goto L_0x0120
        L_0x014e:
            r4.invoke()
            return
        L_0x0152:
            java.lang.String r0 = "LinkManager is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0159:
            r2.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZ7.A01(X.BzY, java.util.UUID, X.1Di):void");
    }

    public void A00() {
        Cw1 cw1 = this.A04;
        C26294Cx6.A06("lam:LinkedAppManager", "stop:");
        C26294Cx6.A06("lam:LinkedAppManager", "releaseMwaResources");
        if (cw1.A0H) {
            C23624Bmt A0N = C23651BnK.DEFAULT_INSTANCE.A0N();
            ((C23651BnK) C17880vN.A0G(A0N)).requestType_ = C24373C0q.RELEASE.BVW();
            Cw1.A05(new Dm2(new AppLinkLinkInfoRequest((C23651BnK) A0N.A0C()), cw1));
        }
        Cw1.A02(cw1);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.CCP, java.lang.Object] */
    public CZ7(Context context, CL9 cl9, C22869BTd bTd, Executor executor) {
        this.A00 = context;
        this.A03 = executor;
        this.A01 = cl9;
        this.A02 = bTd;
        Object systemService = context.getSystemService("bluetooth");
        C18070vi.A0z(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        BluetoothManager bluetoothManager = (BluetoothManager) systemService;
        ? obj = new Object();
        this.A04 = new Cw1(bluetoothManager, context, cl9, obj, bTd, executor);
    }
}
