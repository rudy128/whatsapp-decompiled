package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2nt  reason: invalid class name and case insensitive filesystem */
public abstract class C60362nt {
    public static final LinkedHashMap A01(AnonymousClass1MK r6, String str, Set set) {
        C18070vi.A0d(r6, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(set));
        for (Object next : set) {
            linkedHashMap.put(next, next);
        }
        LinkedHashMap A08 = AnonymousClass1D7.A08(linkedHashMap);
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next2 : set) {
            if (next2 instanceof PhoneUserJid) {
                A13.add(next2);
            }
        }
        ArrayList A132 = AnonymousClass000.A13();
        for (Object next3 : A13) {
            if (!C42701yb.A01((AnonymousClass1BI) next3)) {
                A132.add(next3);
            }
        }
        Set A12 = C29431cG.A12(A132);
        if (!A12.isEmpty()) {
            A08.putAll(r6.A06("getOriginalJidsToTranslatedJids", str, A12));
        }
        return A08;
    }

    public static final C201110w A00(C201110w r4, UserJid userJid) {
        C18070vi.A0h(userJid, r4);
        Set entrySet = r4.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(entrySet));
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(it);
            linkedHashMap.put(DeviceJid.Companion.A03(userJid, ((Jid) A16.getKey()).getDevice()), A16.getValue());
        }
        return AnonymousClass2V0.A00(linkedHashMap);
    }
}
