package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2lT  reason: invalid class name and case insensitive filesystem */
public final class C58922lT {
    public final C24751Ln A00;
    public final AnonymousClass10I A01;

    public final void A00(C63872tp r9, Runnable runnable) {
        C63872tp r5 = r9;
        C18070vi.A0d(r9, 0);
        C56652ho r4 = r9.A05;
        C18070vi.A0X(r4);
        AnonymousClass1IZ it = r9.A07().iterator();
        int i = 0;
        while (it.hasNext()) {
            UserJid A0T = C17880vN.A0T(it);
            C18070vi.A0b(A0T);
            r4.A00(A0T, i);
            i++;
        }
        runnable.run();
        this.A01.CGF(new C21368Aix(this, r4, r5, runnable, 18));
    }

    public final void A01(C63872tp r7, Collection collection) {
        C18070vi.A0d(collection, 1);
        LinkedHashMap A0G = this.A00.A0G(C29431cG.A12(collection));
        C56652ho r5 = r7.A05;
        C18070vi.A0X(r5);
        Iterator A15 = AnonymousClass000.A15(A0G);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            UserJid userJid = (UserJid) A16.getKey();
            UserJid userJid2 = (UserJid) A16.getValue();
            if (r7.A0D(userJid, false) == null) {
                C18070vi.A0d(userJid, 0);
                r5.A00.remove(userJid);
            }
            if (r7.A0D(userJid2, false) == null) {
                C18070vi.A0d(userJid2, 0);
                r5.A00.remove(userJid2);
            }
        }
    }

    public C58922lT(C24751Ln r1, AnonymousClass10I r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A02(C63872tp r8, List list) {
        C63312sr A0D;
        ArrayList A0D2 = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0D2.add(((C63312sr) it.next()).A04);
        }
        C27300DbW create = C27300DbW.create();
        Iterator A15 = AnonymousClass000.A15(this.A00.A0G(C29431cG.A12(A0D2)));
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            Object value = A16.getValue();
            if (key instanceof AnonymousClass1E2) {
                create.put(value, key);
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            UserJid userJid = ((C63312sr) it2.next()).A04;
            AnonymousClass3MQ r2 = create;
            if (!(userJid instanceof PhoneUserJid)) {
                if (userJid instanceof AnonymousClass1E2) {
                    r2 = create.inverse();
                }
            }
            UserJid userJid2 = (UserJid) r2.get(userJid);
            if (!(userJid2 == null || (A0D = r8.A0D(userJid2, true)) == null)) {
                UserJid userJid3 = A0D.A04;
                C56652ho r1 = r8.A05;
                C18070vi.A0X(r1);
                Integer num = (Integer) r1.A00.get(userJid3);
                if (num != null) {
                    r1.A00(userJid, num.intValue());
                }
                C63312sr A0D3 = r8.A0D(userJid, false);
                if (A0D3 != null) {
                    A0D3.A00 = A0D.A00;
                } else {
                    C17900vP.A0X(userJid, "ParticipantColorUtils/syncParticipantResponseToGroup/participant added failed for ", AnonymousClass000.A10());
                }
            }
        }
    }
}
