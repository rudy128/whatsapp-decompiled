package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1Re  reason: invalid class name and case insensitive filesystem */
public class C26191Re implements C26181Rd, C201511a {
    public final C25001Mm A00;
    public final AnonymousClass1M9 A01;
    public final C26171Rc A02;
    public final C25161Nd A03;
    public final AnonymousClass11P A04;
    public final C19830z4 A05;
    public final AnonymousClass10I A06;

    public /* synthetic */ void BvR() {
    }

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvT() {
    }

    public /* synthetic */ void BvV() {
    }

    public static HashSet A00(C26191Re r4) {
        HashSet hashSet = new HashSet();
        Set<String> stringSet = ((SharedPreferences) r4.A05.A00.get()).getStringSet("pending_users_to_sync_device", new HashSet());
        C17960vV.A07(stringSet);
        hashSet.addAll(C22971Dz.A0C((String[]) stringSet.toArray(new String[0])));
        return hashSet;
    }

    public void A01(UserJid[] userJidArr, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceSyncManager/scheduleSyncDevicesJob size=");
        sb.append(r7);
        sb.append(" type=");
        sb.append(i);
        Log.i(sb.toString());
        String[] A0j = C22971Dz.A0j(Arrays.asList(userJidArr));
        Boolean bool = C17960vV.A01;
        if (A0j == null || A0j.length == 0) {
            throw new IllegalArgumentException("invalid jid list");
        }
        ArrayList arrayList = new ArrayList();
        for (UserJid userJid : userJidArr) {
            C26171Rc r1 = this.A02;
            Set set = r1.A03;
            synchronized (set) {
                if (!set.contains(userJid)) {
                    r1.A01.put(userJid, Long.valueOf(AnonymousClass11P.A01(r1.A00)));
                    set.add(userJid);
                    arrayList.add(userJid);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            new C21470Akb((Object) this, i, 31, (Object) arrayList).run();
        }
    }

    public void BvU() {
        this.A06.CGF(new C70563Bp(this, 39));
    }

    public C26191Re(C25001Mm r1, AnonymousClass1M9 r2, C26171Rc r3, C25161Nd r4, AnonymousClass11P r5, C19830z4 r6, AnonymousClass10I r7) {
        this.A04 = r5;
        this.A06 = r7;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
    }
}
