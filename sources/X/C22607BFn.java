package X;

import android.os.Binder;
import android.os.IBinder;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: X.BFn  reason: case insensitive filesystem */
public final class C22607BFn extends Binder implements ECP {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    public IBinder asBinder() {
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C22607BFn(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this();
        this.A00 = multiInstanceInvalidationService;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.D75, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.D75, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b3, code lost:
        if (r0 != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f4, code lost:
        if (r0 != false) goto L_0x00d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r12, android.os.Parcel r13, android.os.Parcel r14, int r15) {
        /*
            r11 = this;
            java.lang.String r1 = X.ECP.A00
            r4 = 1
            if (r12 < r4) goto L_0x0131
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r12 > r0) goto L_0x0128
            r13.enforceInterface(r1)
            if (r12 == r4) goto L_0x00d2
            r0 = 2
            if (r12 == r0) goto L_0x0094
            r0 = 3
            if (r12 != r0) goto L_0x0131
            int r9 = r13.readInt()
            java.lang.String[] r10 = r13.createStringArray()
            X.C18070vi.A0d(r10, r4)
            androidx.room.MultiInstanceInvalidationService r0 = r11.A00
            android.os.RemoteCallbackList r8 = r0.A01
            monitor-enter(r8)
            java.util.Map r7 = r0.A02     // Catch:{ all -> 0x0091 }
            java.lang.Object r6 = X.AnonymousClass000.A0w(r7, r9)     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0091 }
            if (r6 != 0) goto L_0x0037
            java.lang.String r1 = "ROOM"
            java.lang.String r0 = "Remote invalidation client ID not registered"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0091 }
            goto L_0x008f
        L_0x0037:
            int r5 = r8.beginBroadcast()     // Catch:{ all -> 0x0091 }
            r3 = 0
        L_0x003c:
            if (r3 >= r5) goto L_0x008c
            java.lang.Object r2 = r8.getBroadcastCookie(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            X.C18070vi.A0z(r2, r0)     // Catch:{ all -> 0x0087 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0087 }
            int r1 = r2.intValue()     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = X.C17880vN.A0s(r2, r7)     // Catch:{ all -> 0x0087 }
            if (r9 == r1) goto L_0x0084
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0084
            android.os.IInterface r1 = r8.getBroadcastItem(r3)     // Catch:{ RemoteException -> 0x007c }
            X.ECO r1 = (X.ECO) r1     // Catch:{ RemoteException -> 0x007c }
            X.D75 r1 = (X.D75) r1     // Catch:{ RemoteException -> 0x007c }
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x007c }
            java.lang.String r0 = X.ECO.A00     // Catch:{ all -> 0x0077 }
            r2.writeInterfaceToken(r0)     // Catch:{ all -> 0x0077 }
            r2.writeStringArray(r10)     // Catch:{ all -> 0x0077 }
            android.os.IBinder r1 = r1.A00     // Catch:{ all -> 0x0077 }
            r0 = 0
            r1.transact(r4, r2, r0, r4)     // Catch:{ all -> 0x0077 }
            r2.recycle()     // Catch:{ RemoteException -> 0x007c }
            goto L_0x0084
        L_0x0077:
            r0 = move-exception
            r2.recycle()     // Catch:{ RemoteException -> 0x007c }
            throw r0     // Catch:{ RemoteException -> 0x007c }
        L_0x007c:
            r2 = move-exception
            java.lang.String r1 = "ROOM"
            java.lang.String r0 = "Error invoking a remote callback"
            android.util.Log.w(r1, r0, r2)     // Catch:{ all -> 0x0087 }
        L_0x0084:
            int r3 = r3 + 1
            goto L_0x003c
        L_0x0087:
            r0 = move-exception
            r8.finishBroadcast()     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x008c:
            r8.finishBroadcast()     // Catch:{ all -> 0x0091 }
        L_0x008f:
            monitor-exit(r8)
            return r4
        L_0x0091:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0094:
            android.os.IBinder r2 = r13.readStrongBinder()
            if (r2 != 0) goto L_0x00a9
            r1 = 0
        L_0x009b:
            int r3 = r13.readInt()
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            androidx.room.MultiInstanceInvalidationService r0 = r11.A00
            android.os.RemoteCallbackList r2 = r0.A01
            monitor-enter(r2)
            goto L_0x00be
        L_0x00a9:
            java.lang.String r0 = X.ECO.A00
            android.os.IInterface r1 = r2.queryLocalInterface(r0)
            if (r1 == 0) goto L_0x00b6
            boolean r0 = r1 instanceof X.ECO
            if (r0 == 0) goto L_0x00b6
            goto L_0x009b
        L_0x00b6:
            X.D75 r1 = new X.D75
            r1.<init>()
            r1.A00 = r2
            goto L_0x009b
        L_0x00be:
            r2.unregister(r1)     // Catch:{ all -> 0x00cf }
            java.util.Map r1 = r0.A02     // Catch:{ all -> 0x00cf }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00cf }
            r1.remove(r0)     // Catch:{ all -> 0x00cf }
            monitor-exit(r2)
            r14.writeNoException()
            return r4
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00d2:
            android.os.IBinder r1 = r13.readStrongBinder()
            if (r1 != 0) goto L_0x00ea
            r8 = 0
        L_0x00d9:
            java.lang.String r7 = r13.readString()
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            r6 = 0
            if (r7 == 0) goto L_0x0121
            androidx.room.MultiInstanceInvalidationService r5 = r11.A00
            android.os.RemoteCallbackList r3 = r5.A01
            monitor-enter(r3)
            goto L_0x00ff
        L_0x00ea:
            java.lang.String r0 = X.ECO.A00
            android.os.IInterface r8 = r1.queryLocalInterface(r0)
            if (r8 == 0) goto L_0x00f7
            boolean r0 = r8 instanceof X.ECO
            if (r0 == 0) goto L_0x00f7
            goto L_0x00d9
        L_0x00f7:
            X.D75 r8 = new X.D75
            r8.<init>()
            r8.A00 = r1
            goto L_0x00d9
        L_0x00ff:
            int r0 = r5.A00     // Catch:{ all -> 0x011c }
            int r2 = r0 + 1
            r5.A00 = r2     // Catch:{ all -> 0x011c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x011c }
            boolean r0 = r3.register(r8, r1)     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x0115
            java.util.Map r0 = r5.A02     // Catch:{ all -> 0x011c }
            r0.put(r1, r7)     // Catch:{ all -> 0x011c }
            goto L_0x011f
        L_0x0115:
            int r0 = r5.A00     // Catch:{ all -> 0x011c }
            int r0 = r0 + -1
            r5.A00 = r0     // Catch:{ all -> 0x011c }
            goto L_0x0120
        L_0x011c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x011f:
            r6 = r2
        L_0x0120:
            monitor-exit(r3)
        L_0x0121:
            r14.writeNoException()
            r14.writeInt(r6)
            return r4
        L_0x0128:
            r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r12 != r0) goto L_0x0131
            r14.writeString(r1)
            return r4
        L_0x0131:
            boolean r0 = super.onTransact(r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22607BFn.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public C22607BFn() {
        attachInterface(this, ECP.A00);
    }
}
