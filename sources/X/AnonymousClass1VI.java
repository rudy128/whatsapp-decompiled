package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallParticipantJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1VI  reason: invalid class name */
public class AnonymousClass1VI {
    public final AnonymousClass1MR A00;
    public final C25111Mx A01;
    public final C24751Ln A02;
    public final C18030ve A03;

    public ArrayList A01(String str, Set set) {
        HashMap A07 = this.A00.A07(set);
        ArrayList arrayList = new ArrayList(set.size());
        for (Map.Entry entry : A07.entrySet()) {
            arrayList.add(A00(this, (UserJid) entry.getKey(), str, (Set) entry.getValue()));
        }
        return arrayList;
    }

    public AnonymousClass1VI(C25111Mx r1, C24751Ln r2, AnonymousClass1MR r3, C18030ve r4) {
        this.A03 = r4;
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r1;
    }

    public static CallParticipantJid A00(AnonymousClass1VI r8, UserJid userJid, String str, Set set) {
        PhoneUserJid phoneUserJid;
        byte[] bArr;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (C62832s4.A00((Jid) it.next())) {
                it.remove();
            }
        }
        DeviceJid[] deviceJidArr = (DeviceJid[]) set.toArray(new DeviceJid[0]);
        if (C22971Dz.A0T(userJid)) {
            phoneUserJid = r8.A02.A0D((AnonymousClass1E1) userJid);
        } else {
            phoneUserJid = null;
        }
        C25111Mx r0 = r8.A01;
        C18070vi.A0d(userJid, 0);
        C58962lX A05 = r0.A05(userJid);
        if (A05 != null) {
            bArr = A05.A01;
        } else {
            bArr = null;
        }
        int length = deviceJidArr.length;
        if (length > 5) {
            if (C18020vd.A05(C18040vf.A02, r8.A03, 1525)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" calling to primary device only because callee has too many devices");
                Log.i(sb.toString());
                int i = 0;
                do {
                    DeviceJid deviceJid = deviceJidArr[i];
                    if (deviceJid.getDevice() == 0) {
                        return new CallParticipantJid(userJid, bArr, new DeviceJid[]{deviceJid}, phoneUserJid);
                    }
                    i++;
                } while (i < length);
            }
        }
        return new CallParticipantJid(userJid, bArr, deviceJidArr, phoneUserJid);
    }
}
