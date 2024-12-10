package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1O1  reason: invalid class name */
public final class AnonymousClass1O1 implements C24411Kf {
    public HashSet A00 = new HashSet();
    public HashSet A01 = new HashSet();

    public static final String A00(AnonymousClass1O1 r3, Set set) {
        String A0g;
        synchronized (r3) {
            A0g = C29431cG.A0g(" ", "", "", set, (C22821Di) null);
        }
        return A0g;
    }

    public final void A01(String str, boolean z) {
        synchronized (this) {
            if (z) {
                if (this.A00.add(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LongRunningTaskTracker/setLongRunningTaskState/");
                    sb.append(str);
                    sb.append(":true");
                    Log.i(sb.toString());
                }
                this.A01.add(str);
            } else if (this.A00.remove(str)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("LongRunningTaskTracker/setLongRunningTaskState/");
                sb2.append(str);
                sb2.append(":false");
                Log.i(sb2.toString());
            }
        }
    }

    public void BlT() {
        synchronized (this) {
            HashSet hashSet = this.A01;
            hashSet.clear();
            hashSet.addAll(this.A00);
        }
    }

    public void onAppBackgrounded() {
        synchronized (this) {
            HashSet hashSet = this.A01;
            hashSet.clear();
            hashSet.addAll(this.A00);
        }
    }
}
