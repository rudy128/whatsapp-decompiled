package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: X.3Eo  reason: invalid class name and case insensitive filesystem */
public final class C71263Eo extends HashMap<UserJid, Integer> {
    public static List A00;

    public static void A00() {
        LinkedList linkedList = new LinkedList();
        List A0u = C29431cG.A0u(new C25411Oc(0, 20));
        Collections.shuffle(A0u);
        linkedList.addAll(A0u);
        A00 = linkedList;
    }

    public final void A02(UserJid userJid, Integer num) {
        int A0M;
        if (num != null) {
            A0M = num.intValue();
        } else {
            List list = A00;
            if (!list.isEmpty()) {
                A0M = AnonymousClass000.A0M(list.remove(0));
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        }
        if (A00.size() == 0) {
            A00();
        }
        C17890vO.A0z(userJid, this, A0M);
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof UserJid)) {
            return false;
        }
        return super.containsKey(obj);
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof UserJid)) {
            return null;
        }
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof UserJid)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof UserJid)) {
            return null;
        }
        return super.remove(obj);
    }

    static {
        A00();
    }

    public /* bridge */ Integer A01(UserJid userJid) {
        return (Integer) super.get(userJid);
    }

    public /* bridge */ boolean A03(UserJid userJid) {
        return super.containsKey(userJid);
    }

    public void clear() {
        super.clear();
        A00();
    }

    public final /* bridge */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ int size() {
        return super.size();
    }

    public final /* bridge */ Collection values() {
        return super.values();
    }

    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof UserJid) || !(obj2 instanceof Integer)) {
            return false;
        }
        return super.remove(obj, obj2);
    }
}
