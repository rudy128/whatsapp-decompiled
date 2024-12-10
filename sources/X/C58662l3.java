package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2l3  reason: invalid class name and case insensitive filesystem */
public final class C58662l3 {
    public final AnonymousClass1P1 A00;
    public final AnonymousClass1P3 A01;
    public final Set A02;
    public final C32501hI A03;
    public final C26191Re A04;

    public final HashSet A00(Collection collection, boolean z) {
        C18070vi.A0d(collection, 0);
        HashSet A12 = C17880vN.A12();
        HashSet A122 = C17880vN.A12();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DeviceJid A0R = C17880vN.A0R(it);
            if (A0R.getDevice() != 0) {
                UserJid userJid = A0R.userJid;
                DeviceJid primaryDevice = userJid.getPrimaryDevice();
                if (!this.A01.A0b(this.A00.A01(C63962tz.A02(primaryDevice))) && !this.A02.contains(primaryDevice)) {
                    C17900vP.A0Y(userJid, "voip/encryption/schedule usync for ", AnonymousClass000.A10());
                    this.A04.A01(new UserJid[]{userJid}, 4);
                    A122.add(primaryDevice);
                    A12.add(A0R);
                }
            }
            if (!this.A01.A0b(this.A00.A01(C63962tz.A02(A0R))) && !this.A02.contains(A0R)) {
                A122.add(A0R);
                A12.add(A0R);
            }
        }
        if (!A122.isEmpty()) {
            DeviceJid[] deviceJidArr = (DeviceJid[]) A122.toArray(new DeviceJid[0]);
            C32501hI r1 = this.A03;
            int i = 6;
            if (z) {
                i = 10;
            }
            r1.A04(deviceJidArr, i, false);
        }
        return A12;
    }

    public final void A01(DeviceJid deviceJid) {
        boolean add = this.A02.add(deviceJid);
        StringBuilder A10 = AnonymousClass000.A10();
        if (add) {
            C17900vP.A0Y(deviceJid, "voip/encryption/startGetPreKeyJobForE2EFail for ", A10);
            this.A03.A04(new DeviceJid[]{deviceJid}, 7, false);
            return;
        }
        C17900vP.A0Y(deviceJid, "voip/encryption/startGetPreKeyJobForE2EFail do nothing, PreKey already sent for ", A10);
    }

    public C58662l3(C32501hI r2, C26191Re r3, AnonymousClass1P1 r4, AnonymousClass1P3 r5) {
        C18070vi.A0s(r3, r5, r2, r4);
        this.A04 = r3;
        this.A01 = r5;
        this.A03 = r2;
        this.A00 = r4;
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C18070vi.A0X(newSetFromMap);
        this.A02 = newSetFromMap;
    }
}
