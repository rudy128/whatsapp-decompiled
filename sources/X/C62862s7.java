package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;

/* renamed from: X.2s7  reason: invalid class name and case insensitive filesystem */
public abstract class C62862s7 {
    public static final boolean A01(C24751Ln r3, AnonymousClass8pI r4, AnonymousClass1KH r5) {
        PhoneUserJid A0D;
        C18070vi.A0e(r5, 0, r3);
        UserJid userJid = r4.A03;
        if (userJid instanceof PhoneUserJid) {
            return r5.A0J(r4, userJid, r3.A0C((PhoneUserJid) userJid));
        }
        if (!(userJid instanceof AnonymousClass1E2) || (A0D = r3.A0D((AnonymousClass1E1) userJid)) == null) {
            return false;
        }
        return r5.A0J(r4, A0D, userJid);
    }

    public static final boolean A02(C24751Ln r9, AnonymousClass1KH r10, UserJid userJid, Boolean bool, String str, HashMap hashMap, HashMap hashMap2) {
        PhoneUserJid A0D;
        UserJid userJid2 = userJid;
        C18070vi.A0d(userJid, 0);
        AnonymousClass1KH r2 = r10;
        C18070vi.A0d(r10, 5);
        C18070vi.A0d(r9, 6);
        Boolean bool2 = bool;
        String str2 = str;
        HashMap hashMap3 = hashMap;
        HashMap hashMap4 = hashMap2;
        if (userJid instanceof PhoneUserJid) {
            return r2.A0K(userJid2, r9.A0C((PhoneUserJid) userJid2), bool2, str2, hashMap3, hashMap4);
        }
        if (!(userJid instanceof AnonymousClass1E2) || (A0D = r9.A0D((AnonymousClass1E1) userJid2)) == null) {
            return false;
        }
        return r2.A0K(A0D, userJid, bool, str, hashMap, hashMap2);
    }

    public static final AnonymousClass8pI A00(C24751Ln r1, AnonymousClass1KH r2, UserJid userJid) {
        PhoneUserJid A0D;
        C18070vi.A0n(r2, userJid, r1);
        if (userJid instanceof PhoneUserJid) {
            return r2.A06(userJid, r1.A0C((PhoneUserJid) userJid));
        }
        if (!(userJid instanceof AnonymousClass1E2) || (A0D = r1.A0D((AnonymousClass1E1) userJid)) == null) {
            return null;
        }
        return r2.A06(A0D, userJid);
    }
}
