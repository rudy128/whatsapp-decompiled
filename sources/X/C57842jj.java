package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2jj  reason: invalid class name and case insensitive filesystem */
public final class C57842jj {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public final void A00(Set set) {
        C18070vi.A0d(set, 0);
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : set) {
            if (next instanceof PhoneUserJid) {
                A13.add(next);
            }
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (!C42701yb.A01((AnonymousClass1BI) next2)) {
                A132.add(next2);
            }
        }
        ArrayList A133 = AnonymousClass000.A13();
        Iterator it2 = A132.iterator();
        while (it2.hasNext()) {
            Object next3 = it2.next();
            Jid jid = (Jid) next3;
            if (jid != null && !C22971Dz.A0Z(jid)) {
                A133.add(next3);
            }
        }
        Set A11 = C29431cG.A11(A133);
        if (!A11.isEmpty()) {
            Iterator A0i = C17890vO.A0i(((AnonymousClass1MI) this.A02.get()).A00.A0P(new HashSet(A11)));
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                Object key = A16.getKey();
                if (!((AnonymousClass1E7) A16.getValue()).A10) {
                    C41681wt.A00(A11).remove(key);
                }
            }
        }
        if (!A11.isEmpty()) {
            A11.removeAll(((AnonymousClass1MK) this.A01.get()).A06("requestSyncDevicesAndLidIfMissingLids", "PreKeyFetch", new HashSet(A11)).keySet());
        }
        if (!A11.isEmpty()) {
            HashSet hashSet = new HashSet(A11);
            AnonymousClass2R1 r3 = AnonymousClass2R1.A0I;
            hashSet.size();
            C18070vi.A0X(((AnonymousClass12E) this.A04.get()).A04(C62132qq.A0L, r3, hashSet, true, true).get());
        }
    }

    public C57842jj(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A04 = r4;
        this.A01 = r5;
    }
}
