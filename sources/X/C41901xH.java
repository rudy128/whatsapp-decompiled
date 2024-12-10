package X;

import com.whatsapp.jid.Jid;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1xH  reason: invalid class name and case insensitive filesystem */
public final class C41901xH {
    public final AnonymousClass18K A00;
    public final AnonymousClass00H A01;

    public C41901xH(AnonymousClass18K r2, AnonymousClass00H r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void A03(Collection collection, Collection collection2, int i, boolean z) {
        int i2;
        C18070vi.A0d(collection, 0);
        int i3 = 0;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    if ((it.next() instanceof AnonymousClass1EC) && (i2 = i2 + 1) < 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            i2 = 0;
        }
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if ((obj instanceof AnonymousClass1EC) && (i3 = i3 + 1) < 0) {
                    AnonymousClass1ZU.A0A();
                    throw null;
                }
            }
        }
        int i4 = i3;
        if (!z) {
            i4 = -i3;
        }
        int i5 = i2 + i4;
        int size = collection.size() - i2;
        int size2 = collection2.size() - i3;
        if (!z) {
            size2 = -size2;
        }
        AnonymousClass2G4 r9 = new AnonymousClass2G4();
        r9.A00 = Integer.valueOf(i);
        r9.A01 = Long.valueOf((long) (size2 + size));
        r9.A02 = Long.valueOf((long) size);
        r9.A03 = Long.valueOf((long) i5);
        r9.A04 = Long.valueOf((long) i2);
        this.A00.CC7(r9);
    }

    public static final void A00(C41901xH r2, Integer num, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8) {
        AnonymousClass2H0 r1 = new AnonymousClass2H0();
        r1.A0A = ((C189339iv) r2.A01.get()).A00();
        r1.A01 = 15;
        r1.A00 = num;
        r1.A09 = l;
        r1.A02 = l2;
        r1.A08 = l3;
        r1.A06 = l4;
        r1.A07 = l5;
        r1.A05 = l6;
        r1.A04 = l7;
        r1.A03 = l8;
        r2.A00.CC7(r1);
    }

    public final void A01(long j, long j2) {
        A00(this, 9, (Long) null, (Long) null, (Long) null, Long.valueOf(j), Long.valueOf(j2), (Long) null, (Long) null, (Long) null);
    }

    public final void A02(Long l, Long l2, Long l3, Long l4, Long l5, Collection collection, List list) {
        int i;
        int i2;
        int i3;
        Collection<Jid> collection2 = collection;
        List list2 = list;
        C18070vi.A0d(list2, 0);
        if (collection == null) {
            collection2 = C18460wS.A00;
        }
        boolean z = list2 instanceof Collection;
        int i4 = 0;
        if (!z || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((C62482rT) it.next()).A02 == C49512Qt.ONE_TO_ONE && (i = i + 1) < 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
            AnonymousClass1ZU.A0A();
            throw null;
        }
        i = 0;
        long j = (long) i;
        boolean z2 = collection2 instanceof Collection;
        if (!z2 || !collection2.isEmpty()) {
            Iterator it2 = collection2.iterator();
            i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (C22971Dz.A0d((Jid) it2.next()) && (i2 = i2 + 1) < 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
            AnonymousClass1ZU.A0A();
            throw null;
        }
        i2 = 0;
        long j2 = j + ((long) i2);
        if (!z || !list2.isEmpty()) {
            Iterator it3 = list2.iterator();
            i3 = 0;
            while (true) {
                if (it3.hasNext()) {
                    if (((C62482rT) it3.next()).A02 == C49512Qt.GROUP && (i3 = i3 + 1) < 0) {
                        break;
                    }
                } else {
                    break;
                }
            }
            AnonymousClass1ZU.A0A();
            throw null;
        }
        i3 = 0;
        long j3 = (long) i3;
        if (!z2 || !collection2.isEmpty()) {
            for (Jid A0e : collection2) {
                if (C22971Dz.A0e(A0e) && (i4 = i4 + 1) < 0) {
                    AnonymousClass1ZU.A0A();
                    throw null;
                }
            }
        }
        long j4 = j3 + ((long) i4);
        A00(this, 9, Long.valueOf(j2 + j4), Long.valueOf(j2), Long.valueOf(j4), l, l2, l3, l4, l5);
    }
}
