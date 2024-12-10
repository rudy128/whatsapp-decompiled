package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.2LS  reason: invalid class name */
public class AnonymousClass2LS extends AnonymousClass17A {
    public void A00(UserJid userJid, Set set, Set set2) {
        if (!set.isEmpty() || !set2.isEmpty()) {
            notifyAllObservers(new C97054oq(set2, userJid, set, 2));
        }
    }
}
