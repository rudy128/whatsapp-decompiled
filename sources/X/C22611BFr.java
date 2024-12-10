package X;

import android.os.Binder;
import android.os.IBinder;
import com.facebook.wearable.applinks.AppLinkRegisterRequest;
import com.facebook.wearable.applinks.IAppLinkRegisterResponseCallback;

/* renamed from: X.BFr  reason: case insensitive filesystem */
public final class C22611BFr extends Binder implements IAppLinkRegisterResponseCallback {
    public final /* synthetic */ AppLinkRegisterRequest A00;
    public final /* synthetic */ Cw1 A01;

    public IBinder asBinder() {
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C22611BFr(AppLinkRegisterRequest appLinkRegisterRequest, Cw1 cw1) {
        this();
        this.A01 = cw1;
        this.A00 = appLinkRegisterRequest;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r19, android.os.Parcel r20, android.os.Parcel r21, int r22) {
        /*
            r18 = this;
            java.lang.String r1 = "com.facebook.wearable.applinks.IAppLinkRegisterResponseCallback"
            r4 = 1
            r3 = r18
            r6 = r19
            r5 = r20
            r2 = r21
            if (r6 < r4) goto L_0x016f
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r6 > r0) goto L_0x0166
            r5.enforceInterface(r1)
            r0 = 2
            if (r6 == r0) goto L_0x003c
            r0 = 3
            if (r6 != r0) goto L_0x016f
            int r3 = r5.readInt()
            java.lang.String r2 = r5.readString()
            java.lang.StringBuilder r1 = X.AnonymousClass3MZ.A19(r2, r4)
            java.lang.String r0 = "onError: error="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " message="
            java.lang.String r2 = X.AnonymousClass001.A1H(r0, r2, r1)
            r1 = 0
            java.lang.String r0 = "lam:LinkedAppManager"
            X.C26294Cx6.A09(r0, r2, r1)
        L_0x003b:
            return r4
        L_0x003c:
            android.os.Parcelable$Creator r0 = com.facebook.wearable.applinks.AppLinkRegisterResponse.CREATOR
            java.util.ArrayList r1 = r5.createTypedArrayList(r0)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0060
            r2 = 0
            java.lang.String r1 = "lam:LinkedAppManager"
            java.lang.String r0 = "registerLinkableAppService: No devices to connect"
            X.C26294Cx6.A09(r1, r0, r2)
            X.Cw1 r2 = r3.A01
            com.facebook.wearable.applinks.AppLinkRegisterRequest r1 = r3.A00
            X.Dm0 r0 = new X.Dm0
            r0.<init>(r1, r2)
            r2.A01 = r0
            return r4
        L_0x0060:
            X.Cw1 r6 = r3.A01
            r0 = 0
            r6.A01 = r0
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r1.iterator()
        L_0x006d:
            boolean r0 = r3.hasNext()
            java.lang.String r5 = "lam:LinkedAppManager"
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r3.next()
            com.facebook.wearable.applinks.AppLinkRegisterResponse r0 = (com.facebook.wearable.applinks.AppLinkRegisterResponse) r0
            byte[] r0 = r0.serviceUUID
            X.C18070vi.A0W(r0)
            java.util.UUID r2 = X.BEA.A0v(r0)
            r7.add(r2)
            X.1Di r0 = r6.A02
            if (r0 == 0) goto L_0x008e
            r0.invoke(r2)
        L_0x008e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "serviceUUID="
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            X.C26294Cx6.A06(r5, r0)
            goto L_0x006d
        L_0x009c:
            java.lang.String r0 = "listenToDeviceConnectionState:"
            X.C26294Cx6.A06(r5, r0)
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x00ad
            X.DhM r0 = new X.DhM
            r0.<init>(r6)
            X.Cw1.A05(r0)
        L_0x00ad:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r9 = r7.iterator()
        L_0x00b5:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r2 = r9.next()
            java.util.UUID r2 = (java.util.UUID) r2
            X.Cjd r8 = new X.Cjd
            r8.<init>()
            X.Dsr r1 = new X.Dsr
            r1.<init>(r8, r6)
            X.DpJ r0 = new X.DpJ
            r0.<init>(r8)
            X.Cw1.A04(r6, r2, r0, r1)
            r2 = 0
            java.lang.Object r2 = r8.A01()     // Catch:{ TimeoutException -> 0x00dd, Error -> 0x00d9 }
            goto L_0x00e3
        L_0x00d9:
            r1 = move-exception
            java.lang.String r0 = "prepareDeviceConfig: error getting UUID!"
            goto L_0x00e0
        L_0x00dd:
            r1 = move-exception
            java.lang.String r0 = "prepareDeviceConfig: timed out getting UUID!"
        L_0x00e0:
            X.C26294Cx6.A09(r5, r0, r1)
        L_0x00e3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "deviceConfig="
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            X.C26294Cx6.A06(r5, r0)
            if (r2 == 0) goto L_0x00b5
            r3.add(r2)
            goto L_0x00b5
        L_0x00f6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "calling onDeviceConfig "
            java.lang.String r1 = X.AnonymousClass001.A1E(r3, r0, r1)
            r0 = 0
            X.C26294Cx6.A0B(r5, r1, r0)
            java.util.Iterator r8 = r7.iterator()
        L_0x0108:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x015e
            java.lang.Object r13 = r8.next()
            java.util.UUID r13 = (java.util.UUID) r13
            java.util.concurrent.ConcurrentHashMap r7 = r6.A0F
            java.lang.Object r2 = r7.get(r13)
            if (r2 != 0) goto L_0x0151
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Adding linkedDeviceManager for uuid="
            java.lang.String r0 = X.AnonymousClass001.A1E(r13, r0, r1)
            X.C26294Cx6.A06(r5, r0)
            android.content.Context r11 = r6.A09
            android.bluetooth.BluetoothManager r10 = r6.A08
            java.util.concurrent.Executor r14 = r6.A0G
            r2 = 0
            X.Are r15 = new X.Are
            r15.<init>(r6, r2)
            X.Are r1 = new X.Are
            r1.<init>(r6, r4)
            X.Arh r0 = new X.Arh
            r0.<init>(r6, r2)
            X.CCP r12 = r6.A0A
            X.9hg r9 = new X.9hg
            r17 = r0
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r2 = r7.putIfAbsent(r13, r9)
            if (r2 != 0) goto L_0x0151
            r2 = r9
        L_0x0151:
            X.9hg r2 = (X.C188599hg) r2
            java.util.ArrayDeque r1 = r6.A0C
            X.AwP r0 = new X.AwP
            r0.<init>(r6, r2, r13)
            r1.add(r0)
            goto L_0x0108
        L_0x015e:
            X.1Di r0 = r6.A05
            if (r0 == 0) goto L_0x003b
            r0.invoke(r3)
            return r4
        L_0x0166:
            r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r6 != r0) goto L_0x016f
            r2.writeString(r1)
            return r4
        L_0x016f:
            r0 = r22
            boolean r0 = super.onTransact(r6, r5, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22611BFr.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public C22611BFr() {
        attachInterface(this, "com.facebook.wearable.applinks.IAppLinkRegisterResponseCallback");
    }
}
