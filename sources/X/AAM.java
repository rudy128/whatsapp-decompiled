package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AAM implements Handler.Callback, ServiceConnection {
    public Set A00 = C17880vN.A12();
    public final Context A01;
    public final Handler A02;
    public final Map A03 = C17880vN.A11();
    public final HandlerThread A04;

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", AnonymousClass001.A1E(componentName, "Connected to service ", AnonymousClass000.A10()));
        }
        this.A02.obtainMessage(1, new AnonymousClass9ZO(componentName, iBinder)).sendToTarget();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", AnonymousClass001.A1E(componentName, "Disconnected from service ", AnonymousClass000.A10()));
        }
        this.A02.obtainMessage(2, componentName).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0057, code lost:
        if (r11.A03 != false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(X.C187089fF r11) {
        /*
            r10 = this;
            java.lang.String r2 = "NotifManCompat"
            r7 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r7)
            if (r0 == 0) goto L_0x002e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Processing component "
            r1.append(r0)
            android.content.ComponentName r0 = r11.A04
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.util.ArrayDeque r0 = r11.A02
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = " queued tasks"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            android.util.Log.d(r2, r0)
        L_0x002e:
            java.util.ArrayDeque r6 = r11.A02
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0098
            boolean r0 = r11.A03
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            android.content.Intent r0 = X.C108945cZ.A0G(r0)
            android.content.ComponentName r4 = r11.A04
            android.content.Intent r1 = r0.setComponent(r4)
            android.content.Context r3 = r10.A01
            r0 = 33
            boolean r0 = r3.bindService(r1, r10, r0)
            r11.A03 = r0
            if (r0 == 0) goto L_0x0122
            r0 = 0
            r11.A00 = r0
        L_0x0055:
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x005d
        L_0x0059:
            X.0uC r0 = r11.A01
            if (r0 != 0) goto L_0x0099
        L_0x005d:
            android.os.Handler r5 = r10.A02
            android.content.ComponentName r4 = r11.A04
            boolean r0 = r5.hasMessages(r7, r4)
            if (r0 != 0) goto L_0x0098
            int r0 = r11.A00
            r3 = 1
            int r1 = r0 + 1
            r11.A00 = r1
            r0 = 6
            if (r1 <= r0) goto L_0x0134
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Giving up on delivering "
            X.C17890vO.A14(r0, r1, r6)
            java.lang.String r0 = " tasks to "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " after "
            r1.append(r0)
            int r0 = r11.A00
            r1.append(r0)
            java.lang.String r0 = " retries"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            android.util.Log.w(r2, r0)
            r6.clear()
        L_0x0098:
            return
        L_0x0099:
            java.lang.Object r4 = r6.peek()
            X.B4F r4 = (X.B4F) r4
            if (r4 == 0) goto L_0x011a
            boolean r0 = android.util.Log.isLoggable(r2, r7)     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
            if (r0 == 0) goto L_0x00b4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
            java.lang.String r0 = "Sending task "
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
            android.util.Log.d(r2, r0)     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
        L_0x00b4:
            X.0uC r9 = r11.A01     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
            X.AGQ r4 = (X.AGQ) r4     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
            java.lang.String r8 = r4.A02     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
            int r5 = r4.A00     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
            java.lang.String r3 = r4.A03     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
            android.app.Notification r1 = r4.A01     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
            X.0RO r9 = (X.AnonymousClass0RO) r9     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
            java.lang.String r0 = X.C17150uC.A00     // Catch:{ all -> 0x00e9 }
            r4.writeInterfaceToken(r0)     // Catch:{ all -> 0x00e9 }
            r4.writeString(r8)     // Catch:{ all -> 0x00e9 }
            r4.writeInt(r5)     // Catch:{ all -> 0x00e9 }
            r4.writeString(r3)     // Catch:{ all -> 0x00e9 }
            r0 = 0
            r3 = 1
            r4.writeInt(r3)     // Catch:{ all -> 0x00e9 }
            r1.writeToParcel(r4, r0)     // Catch:{ all -> 0x00e9 }
            android.os.IBinder r1 = r9.A00     // Catch:{ all -> 0x00e9 }
            r0 = 0
            r1.transact(r3, r4, r0, r3)     // Catch:{ all -> 0x00e9 }
            r4.recycle()     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
            r6.remove()     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
            goto L_0x0099
        L_0x00e9:
            r0 = move-exception
            r4.recycle()     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
            throw r0     // Catch:{ DeadObjectException -> 0x0102, RemoteException -> 0x00ee }
        L_0x00ee:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RemoteException communicating with "
            r1.append(r0)
            android.content.ComponentName r0 = r11.A04
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            android.util.Log.w(r2, r0, r3)
            goto L_0x011a
        L_0x0102:
            boolean r0 = android.util.Log.isLoggable(r2, r7)
            if (r0 == 0) goto L_0x011a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Remote service has died: "
            r1.append(r0)
            android.content.ComponentName r0 = r11.A04
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            android.util.Log.d(r2, r0)
        L_0x011a:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0098
            goto L_0x005d
        L_0x0122:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unable to bind to listener "
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)
            android.util.Log.w(r2, r0)
            r3.unbindService(r10)
            goto L_0x0055
        L_0x0134:
            int r1 = r1 - r3
            int r3 = r3 << r1
            int r3 = r3 * 1000
            boolean r0 = android.util.Log.isLoggable(r2, r7)
            if (r0 == 0) goto L_0x0153
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Scheduling retry for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " ms"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            android.util.Log.d(r2, r0)
        L_0x0153:
            android.os.Message r2 = r5.obtainMessage(r7, r4)
            long r0 = (long) r3
            r5.sendMessageDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AAM.A00(X.9fF):void");
    }

    /* JADX WARNING: type inference failed for: r1v18, types: [java.lang.Object, X.0RO] */
    public boolean handleMessage(Message message) {
        Set set;
        C17150uC r1;
        int i = message.what;
        if (i == 0) {
            Object obj = message.obj;
            Context context = this.A01;
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
            synchronized (C27311Vp.A05) {
                if (string != null) {
                    if (!string.equals(C27311Vp.A03)) {
                        HashSet hashSet = new HashSet(r4);
                        for (String unflattenFromString : string.split(":", -1)) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet.add(unflattenFromString2.getPackageName());
                            }
                        }
                        C27311Vp.A04 = hashSet;
                        C27311Vp.A03 = string;
                    }
                }
                set = C27311Vp.A04;
            }
            if (!set.equals(this.A00)) {
                this.A00 = set;
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(C17880vN.A0A().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet A12 = C17880vN.A12();
                for (ResolveInfo next : queryIntentServices) {
                    if (set.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Permission present on component ");
                            A10.append(componentName);
                            Log.w("NotifManCompat", AnonymousClass000.A0y(", not adding listener record.", A10));
                        } else {
                            A12.add(componentName);
                        }
                    }
                }
                Iterator it = A12.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    Map map = this.A03;
                    if (!map.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", AnonymousClass001.A1E(componentName2, "Adding listener record for ", AnonymousClass000.A10()));
                        }
                        map.put(componentName2, new C187089fF(componentName2));
                    }
                }
                Iterator A15 = AnonymousClass000.A15(this.A03);
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    if (!A12.contains(A16.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("Removing listener record for ");
                            Log.d("NotifManCompat", C17890vO.A0V(A16.getKey(), A102));
                        }
                        C187089fF r12 = (C187089fF) A16.getValue();
                        if (r12.A03) {
                            context.unbindService(this);
                            r12.A03 = false;
                        }
                        r12.A01 = null;
                        A15.remove();
                    }
                }
            }
            Iterator A0l = C17890vO.A0l(this.A03);
            while (A0l.hasNext()) {
                C187089fF r13 = (C187089fF) A0l.next();
                r13.A02.add(obj);
                A00(r13);
            }
        } else if (i == 1) {
            AnonymousClass9ZO r0 = (AnonymousClass9ZO) message.obj;
            ComponentName componentName3 = r0.A00;
            IBinder iBinder = r0.A01;
            C187089fF r3 = (C187089fF) this.A03.get(componentName3);
            if (r3 != null) {
                if (iBinder == null) {
                    r1 = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(C17150uC.A00);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C17150uC)) {
                        ? obj2 = new Object();
                        obj2.A00 = iBinder;
                        r1 = obj2;
                    } else {
                        r1 = (C17150uC) queryLocalInterface;
                    }
                }
                r3.A01 = r1;
                r3.A00 = 0;
                A00(r3);
                return true;
            }
        } else if (i == 2) {
            C187089fF r14 = (C187089fF) this.A03.get(message.obj);
            if (r14 != null) {
                if (r14.A03) {
                    this.A01.unbindService(this);
                    r14.A03 = false;
                }
                r14.A01 = null;
                return true;
            }
        } else if (i != 3) {
            return false;
        } else {
            C187089fF r02 = (C187089fF) this.A03.get(message.obj);
            if (r02 != null) {
                A00(r02);
            }
        }
        return true;
    }

    public AAM(Context context) {
        this.A01 = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.A04 = handlerThread;
        handlerThread.start();
        this.A02 = new Handler(handlerThread.getLooper(), this);
    }
}
