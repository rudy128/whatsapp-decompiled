package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;

/* renamed from: X.9o1  reason: invalid class name and case insensitive filesystem */
public final class C192229o1 {
    public final AnonymousClass00H A00;
    public final HashMap A01 = C17880vN.A11();

    public C192229o1(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.9pS] */
    public final void A01(UserJid userJid) {
        if (userJid != null) {
            HashMap hashMap = this.A01;
            C193049pS r0 = (C193049pS) hashMap.get(userJid);
            C193049pS r02 = r0;
            if (r0 == null) {
                ? obj = new Object();
                obj.A00 = null;
                r02 = obj;
            }
            r02.A00 = null;
            hashMap.put(userJid, r02);
        }
    }

    public final Integer A00(UserJid userJid) {
        if (userJid == null) {
            return null;
        }
        HashMap hashMap = this.A01;
        if (hashMap.get(userJid) == null) {
            A01(userJid);
        }
        C193049pS r3 = (C193049pS) hashMap.get(userJid);
        if (r3 == null) {
            return null;
        }
        Integer num = r3.A00;
        if (num != null) {
            return num;
        }
        Integer A002 = C63092sU.A00((C63092sU) this.A00.get(), userJid, System.currentTimeMillis());
        r3.A00 = A002;
        return A002;
    }
}
