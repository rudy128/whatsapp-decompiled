package X;

import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1O2  reason: invalid class name */
public class AnonymousClass1O2 {
    public final AnonymousClass1O0 A00;
    public final AnonymousClass1O1 A01;
    public final List A02 = new ArrayList();
    public final Map A03 = new HashMap();
    public final Set A04 = new HashSet();

    public void A02(Message message, String str) {
        List list = this.A02;
        synchronized (list) {
            list.add(new C54972f0(message, (C26971Uf) null, str, false));
        }
    }

    public static DeviceJid A00(DeviceJid deviceJid, AnonymousClass205 r1) {
        if (deviceJid != null) {
            return deviceJid;
        }
        AnonymousClass1BI r12 = r1.A00;
        if (!C22971Dz.A0d(r12)) {
            return null;
        }
        DeviceJid A022 = DeviceJid.Companion.A02(r12);
        C17960vV.A07(A022);
        return A022;
    }

    public C54972f0 A01(String str) {
        C17960vV.A08(str, "Can't remove message with null id");
        List list = this.A02;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C54972f0 r1 = (C54972f0) it.next();
                if (str.equals(r1.A02)) {
                    it.remove();
                    return r1;
                }
            }
            return null;
        }
    }

    public void A03(DeviceJid deviceJid, AnonymousClass206 r8) {
        Set set;
        Map map = this.A03;
        synchronized (map) {
            AnonymousClass205 r5 = r8.A0v;
            Pair pair = (Pair) map.get(r5);
            if (pair == null) {
                set = new HashSet();
                map.put(r5, new Pair(set, r8));
                this.A00.notifyAllObservers(new AnonymousClass35V(r8, 31));
            } else {
                set = (Set) pair.first;
            }
            if (!set.add(A00(deviceJid, r5))) {
                StringBuilder sb = new StringBuilder();
                sb.append("in-flight-messages/duplicate in flight message: ");
                sb.append(r5);
                sb.append(" : ");
                sb.append(deviceJid);
                Log.w(sb.toString());
            }
        }
        this.A01.A01("message_send", true);
    }

    public void A04(DeviceJid deviceJid, AnonymousClass205 r8) {
        Map map = this.A03;
        synchronized (map) {
            Pair pair = (Pair) map.get(r8);
            if (pair == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("in-flight-messages/no message to remove: ");
                sb.append(r8);
                sb.append(" : ");
                sb.append(deviceJid);
                Log.w(sb.toString());
            } else {
                Set set = (Set) pair.first;
                if (set == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("in-flight-messages/no message to remove: ");
                    sb2.append(r8);
                    sb2.append(" : ");
                    sb2.append(deviceJid);
                    Log.w(sb2.toString());
                } else {
                    if (!set.remove(A00(deviceJid, r8))) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("in-flight-messages/no message to remove for target: ");
                        sb3.append(r8);
                        sb3.append(" : ");
                        sb3.append(deviceJid);
                        Log.w(sb3.toString());
                    }
                    if (set.isEmpty()) {
                        map.remove(r8);
                        AnonymousClass1O0 r3 = this.A00;
                        AnonymousClass206 r2 = (AnonymousClass206) pair.second;
                        C18070vi.A0d(r2, 0);
                        r3.notifyAllObservers(new AnonymousClass35V(r2, 30));
                    }
                    if (map.isEmpty()) {
                        this.A01.A01("message_send", false);
                    }
                }
            }
        }
    }

    public AnonymousClass1O2(AnonymousClass1O0 r2, AnonymousClass1O1 r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}
