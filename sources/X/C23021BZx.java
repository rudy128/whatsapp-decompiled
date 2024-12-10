package X;

import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.Set;

/* renamed from: X.BZx  reason: case insensitive filesystem */
public final class C23021BZx extends C23023BZz {
    public long A00;
    public C25583CiN A01;
    public final Set A02 = new AnonymousClass016(0);
    public final Set A03 = new AnonymousClass016(0);
    public final Set A04 = new AnonymousClass016(0);
    public final Set A05 = new AnonymousClass016(0);
    public final Set A06 = new AnonymousClass016(0);
    public final Set A07 = new AnonymousClass016(0);

    public final void A07(int i) {
        if (i == 1) {
            A01();
            i = 1;
        }
        super.A07(i);
    }

    public final int BUx() {
        return 12451000;
    }

    public C23021BZx(Context context, Looper looper, EDW edw, EDX edx, CTL ctl) {
        super(context, looper, edw, edx, ctl, 54);
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            Log.e("NearbyConnections", "Cannot set null temp directory");
        } else {
            C24452C4r.A00 = cacheDir;
        }
    }

    public static Status A00(int i) {
        String str;
        if (i == 8025) {
            str = "MISSING_SETTING_LOCATION_MUST_BE_ON";
        } else if (i != 8050) {
            switch (i) {
                case 8000:
                    str = "STATUS_NETWORK_NOT_CONNECTED";
                    break;
                case 8001:
                    str = "STATUS_ALREADY_ADVERTISING";
                    break;
                case 8002:
                    str = "STATUS_ALREADY_DISCOVERING";
                    break;
                case 8003:
                    str = "STATUS_ALREADY_CONNECTED_TO_ENDPOINT";
                    break;
                case 8004:
                    str = "STATUS_CONNECTION_REJECTED";
                    break;
                case 8005:
                    str = "STATUS_NOT_CONNECTED_TO_ENDPOINT";
                    break;
                default:
                    switch (i) {
                        case 8007:
                            str = "STATUS_RADIO_ERROR";
                            break;
                        case 8008:
                            str = "STATUS_ALREADY_HAVE_ACTIVE_STRATEGY";
                            break;
                        case 8009:
                            str = "STATUS_OUT_OF_ORDER_API_CALL";
                            break;
                        case 8010:
                            str = "STATUS_UNSUPPORTED_PAYLOAD_TYPE_FOR_STRATEGY";
                            break;
                        case 8011:
                            str = "STATUS_ENDPOINT_UNKNOWN";
                            break;
                        case 8012:
                            str = "STATUS_ENDPOINT_IO_ERROR";
                            break;
                        case 8013:
                            str = "STATUS_PAYLOAD_IO_ERROR";
                            break;
                        case 8014:
                            str = "STATUS_PAYLOAD_UNKNOWN";
                            break;
                        case 8015:
                            str = "STATUS_ALREADY_LISTENING";
                            break;
                        case 8016:
                            str = "STATUS_AUTH_ERROR";
                            break;
                        default:
                            switch (i) {
                                case 8029:
                                    str = "MISSING_PERMISSION_NEARBY_WIFI_DEVICES";
                                    break;
                                case 8030:
                                    str = "MISSING_PERMISSION_BLUETOOTH";
                                    break;
                                case 8031:
                                    str = "MISSING_PERMISSION_BLUETOOTH_ADMIN";
                                    break;
                                case 8032:
                                    str = "MISSING_PERMISSION_ACCESS_WIFI_STATE";
                                    break;
                                case 8033:
                                    str = "MISSING_PERMISSION_CHANGE_WIFI_STATE";
                                    break;
                                case 8034:
                                    str = "MISSING_PERMISSION_ACCESS_COARSE_LOCATION";
                                    break;
                                case 8035:
                                    str = "MISSING_PERMISSION_RECORD_AUDIO";
                                    break;
                                case 8036:
                                    str = "MISSING_PERMISSION_ACCESS_FINE_LOCATION";
                                    break;
                                case 8037:
                                    str = "MISSING_PERMISSION_BLUETOOTH_SCAN";
                                    break;
                                case 8038:
                                    str = "MISSING_PERMISSION_BLUETOOTH_ADVERTISE";
                                    break;
                                case 8039:
                                    str = "MISSING_PERMISSION_BLUETOOTH_CONNECT";
                                    break;
                                default:
                                    str = C24600CAw.A00(i);
                                    break;
                            }
                    }
            }
        } else {
            str = "API_CONNECTION_FAILED_ALREADY_IN_USE";
        }
        return new Status(i, str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:63|(2:65|66)|67|68|(3:70|71|91)(1:92)|72) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x010b */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010f A[SYNTHETIC, Splitter:B:70:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0112 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r8 = this;
            java.util.Set r7 = r8.A02
            java.util.Iterator r6 = r7.iterator()
        L_0x0006:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r5 = r6.next()
            X.Bgg r5 = (X.C23415Bgg) r5
            monitor-enter(r5)
            java.util.Set r4 = r5.A01     // Catch:{ all -> 0x0033 }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x0033 }
        L_0x0019:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002e
            java.lang.String r2 = X.C17880vN.A0v(r3)     // Catch:{ all -> 0x0033 }
            X.CWD r1 = r5.A00     // Catch:{ all -> 0x0033 }
            X.Bgq r0 = new X.Bgq     // Catch:{ all -> 0x0033 }
            r0.<init>(r2)     // Catch:{ all -> 0x0033 }
            r1.A00(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0019
        L_0x002e:
            r4.clear()     // Catch:{ all -> 0x0033 }
            monitor-exit(r5)
            goto L_0x0006
        L_0x0033:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0036:
            java.util.Set r6 = r8.A05
            java.util.Iterator r1 = r6.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004a
            r1.next()
            java.lang.NullPointerException r0 = X.BE7.A0a()
            throw r0
        L_0x004a:
            java.util.Set r5 = r8.A03
            java.util.Iterator r1 = r5.iterator()
        L_0x0050:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r1.next()
            X.E5R r0 = (X.E5R) r0
            r0.CTc()
            goto L_0x0050
        L_0x0060:
            java.util.Set r4 = r8.A06
            java.util.Iterator r1 = r4.iterator()
        L_0x0066:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r1.next()
            X.E5R r0 = (X.E5R) r0
            r0.CTc()
            goto L_0x0066
        L_0x0076:
            java.util.Set r3 = r8.A04
            java.util.Iterator r1 = r3.iterator()
        L_0x007c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r1.next()
            X.E5R r0 = (X.E5R) r0
            r0.CTc()
            goto L_0x007c
        L_0x008c:
            java.util.Set r2 = r8.A07
            java.util.Iterator r1 = r2.iterator()
        L_0x0092:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = r1.next()
            X.E5R r0 = (X.E5R) r0
            r0.CTc()
            goto L_0x0092
        L_0x00a2:
            r7.clear()
            r6.clear()
            r5.clear()
            r4.clear()
            r3.clear()
            r2.clear()
            X.CiN r4 = r8.A01
            if (r4 == 0) goto L_0x0120
            monitor-enter(r4)
            r0 = 1
            r4.A04 = r0     // Catch:{ all -> 0x0119 }
            java.util.concurrent.ExecutorService r0 = r4.A03     // Catch:{ all -> 0x0119 }
            r0.shutdownNow()     // Catch:{ all -> 0x0119 }
            r3 = 0
            r2 = 0
        L_0x00c3:
            X.00O r1 = r4.A00     // Catch:{ all -> 0x0119 }
            int r0 = r1.size()     // Catch:{ all -> 0x0119 }
            if (r2 >= r0) goto L_0x00d9
            java.lang.Object r0 = r1.A06(r2)     // Catch:{ all -> 0x0119 }
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x00d6
            r0.close()     // Catch:{ IOException -> 0x00d6 }
        L_0x00d6:
            int r2 = r2 + 1
            goto L_0x00c3
        L_0x00d9:
            r1.clear()     // Catch:{ all -> 0x0119 }
            r2 = 0
        L_0x00dd:
            X.00O r1 = r4.A01     // Catch:{ all -> 0x0119 }
            int r0 = r1.size()     // Catch:{ all -> 0x0119 }
            if (r2 >= r0) goto L_0x00f3
            java.lang.Object r0 = r1.A06(r2)     // Catch:{ all -> 0x0119 }
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x00f0
            r0.close()     // Catch:{ IOException -> 0x00f0 }
        L_0x00f0:
            int r2 = r2 + 1
            goto L_0x00dd
        L_0x00f3:
            r1.clear()     // Catch:{ all -> 0x0119 }
        L_0x00f6:
            X.00O r1 = r4.A02     // Catch:{ all -> 0x0119 }
            int r0 = r1.size()     // Catch:{ all -> 0x0119 }
            if (r3 >= r0) goto L_0x0115
            java.lang.Object r1 = r1.A06(r3)     // Catch:{ all -> 0x0119 }
            X.Bbw r1 = (X.C23143Bbw) r1     // Catch:{ all -> 0x0119 }
            android.os.ParcelFileDescriptor r0 = r1.A06     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x010b
            r0.close()     // Catch:{ IOException -> 0x010b }
        L_0x010b:
            android.os.ParcelFileDescriptor r0 = r1.A07     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x0112
            r0.close()     // Catch:{ IOException -> 0x0112 }
        L_0x0112:
            int r3 = r3 + 1
            goto L_0x00f6
        L_0x0115:
            r1.clear()     // Catch:{ all -> 0x0119 }
            goto L_0x011c
        L_0x0119:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x011c:
            monitor-exit(r4)
            r0 = 0
            r8.A01 = r0
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23021BZx.A01():void");
    }

    public final boolean CFd() {
        return C25929Cot.A01(this.A0F);
    }

    public final /* bridge */ /* synthetic */ void A09(IInterface iInterface) {
        super.A09(iInterface);
        this.A01 = new C25583CiN();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.Parcelable, java.lang.Object] */
    public final void BIn() {
        if (isConnected()) {
            try {
                C26398Cyy cyy = (C26398Cyy) A04();
                cyy.A01(2011, C26398Cyy.A00(new Object(), cyy));
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        A01();
        super.BIn();
    }
}
