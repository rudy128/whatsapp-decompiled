package X;

import android.app.ActivityManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.DeadObjectException;
import android.os.Debug;
import com.whatsapp.util.Log;

/* renamed from: X.1cr  reason: invalid class name and case insensitive filesystem */
public class C29781cr {
    public final AnonymousClass11C A00;

    public void A00() {
        NetworkInfo[] networkInfoArr;
        String str;
        ConnectivityManager A0E = this.A00.A0E();
        if (A0E == null) {
            Log.w("app/log-network-info cm=null");
            return;
        }
        try {
            networkInfoArr = A0E.getAllNetworkInfo();
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                networkInfoArr = null;
            } else {
                throw e;
            }
        }
        StringBuilder sb = new StringBuilder("network/info");
        if (networkInfoArr != null) {
            boolean z = false;
            for (NetworkInfo networkInfo : networkInfoArr) {
                if (networkInfo.getState() != NetworkInfo.State.UNKNOWN) {
                    sb.append("\n");
                    sb.append(networkInfo.toString());
                    sb.append(", type: ");
                    sb.append(networkInfo.getType());
                    sb.append(", subtype: ");
                    sb.append(networkInfo.getSubtype());
                    z = true;
                }
            }
            if (z) {
                str = sb.toString();
            } else {
                str = "app/log-network-info/all_network_states_unknown";
            }
            Log.i(str);
            return;
        }
        Log.e("app/log-network-info/unavailable");
    }

    public C29781cr(AnonymousClass11C r1) {
        this.A00 = r1;
    }

    public void A01() {
        C17960vV.A01();
        AnonymousClass11C r17 = this.A00;
        ActivityManager A04 = r17.A04();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (A04 == null) {
            Log.w("device/memory am=null");
        } else {
            A04.getMemoryInfo(memoryInfo);
            StringBuilder sb = new StringBuilder();
            sb.append("device/memory/system/available ");
            sb.append(memoryInfo.availMem / 1024);
            sb.append(" kiB (");
            sb.append(memoryInfo.threshold / 1024);
            sb.append(" kiB) lowMemory=");
            sb.append(memoryInfo.lowMemory);
            Log.i(sb.toString());
        }
        long freeMemory = Runtime.getRuntime().freeMemory();
        long j = Runtime.getRuntime().totalMemory();
        long nativeHeapFreeSize = Debug.getNativeHeapFreeSize();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
        long j2 = C19620yd.A00;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("device/memory/max ");
        sb2.append(j2 / 1024);
        sb2.append(" kiB (~");
        sb2.append(C24161Jc.A00(r17));
        sb2.append(" memory class)");
        Log.i(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("device/memory/native/size ");
        sb3.append((nativeHeapFreeSize + nativeHeapAllocatedSize) / 1024);
        sb3.append(" kiB/allocated ");
        sb3.append(nativeHeapAllocatedSize / 1024);
        sb3.append(" kiB/free ");
        sb3.append(nativeHeapFreeSize / 1024);
        sb3.append(" kiB");
        Log.i(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("device/memory/dalvik/size ");
        sb4.append(j / 1024);
        sb4.append(" kiB/allocated ");
        sb4.append((j - freeMemory) / 1024);
        sb4.append(" kiB/free ");
        sb4.append(freeMemory / 1024);
        sb4.append(" kiB");
        Log.i(sb4.toString());
    }
}
