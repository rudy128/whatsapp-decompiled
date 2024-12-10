package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.71S  reason: invalid class name */
public final class AnonymousClass71S {
    public UserJid A00;
    public Integer A01;
    public Integer A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final UserJid A06;
    public final Integer A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final List A0B;
    public final Map A0C;
    public final Map A0D = C17880vN.A13();
    public final AnonymousClass11P A0E;
    public final Map A0F;

    public AnonymousClass71S(AnonymousClass11P r2, UserJid userJid, Integer num, String str, List list, List list2, List list3, Map map, Map map2, int i, long j, long j2) {
        C18070vi.A0d(map2, 11);
        this.A06 = userJid;
        this.A0E = r2;
        this.A04 = j;
        this.A05 = j2;
        this.A07 = num;
        this.A03 = i;
        this.A0B = list;
        this.A0A = list2;
        this.A09 = list3;
        this.A0C = map;
        this.A0F = map2;
        this.A08 = str;
    }

    public static final int A00(UserJid userJid, AnonymousClass71S r5) {
        if (userJid == AnonymousClass1E5.A00) {
            return 4;
        }
        Iterator it = r5.A0A.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!userJid.equals(((C63372sx) it.next()).A0A)) {
                i2++;
            } else if (i2 >= 0) {
                return 2;
            }
        }
        for (C63372sx r0 : r5.A09) {
            if (!userJid.equals(r0.A0A)) {
                i++;
            } else if (i < 0) {
                return 1;
            } else {
                return 3;
            }
        }
        return 1;
    }

    public static final boolean A01(AnonymousClass206 r9, AnonymousClass71S r10) {
        long A012 = AnonymousClass11P.A01(r10.A0E);
        Map map = r10.A0F;
        AnonymousClass205 r5 = r9.A0v;
        Number A1E = C108945cZ.A1E(r5, map);
        if (A1E != null && A012 - A1E.longValue() <= 60000) {
            return false;
        }
        C18070vi.A0W(r5);
        map.put(r5, Long.valueOf(A012));
        return true;
    }
}
