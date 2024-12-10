package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Pp  reason: invalid class name and case insensitive filesystem */
public final class C25781Pp extends C25771Po {
    public int A00 = 1;
    public int A01 = 1;
    public AnonymousClass1BI A02;
    public Integer A03;
    public boolean A04;
    public final AnonymousClass18K A05;
    public final AnonymousClass10I A06;
    public final Map A07 = Collections.synchronizedMap(new LinkedHashMap());
    public final AnonymousClass11P A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25781Pp(AnonymousClass11S r3, C25741Pl r4, AnonymousClass11P r5, AnonymousClass18K r6, AnonymousClass10I r7) {
        super(r3, r4, r5, r6, r7);
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r7, 2);
        C18070vi.A0d(r6, 3);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r4, 5);
        this.A08 = r5;
        this.A06 = r7;
        this.A05 = r6;
    }

    private final void A00(C55902gY r4) {
        int i;
        C1185463w r2 = new C1185463w();
        r2.A03 = Integer.valueOf(this.A00);
        int i2 = r4.A04;
        if (i2 == 0) {
            i = 1;
        } else {
            i = this.A01;
        }
        r2.A04 = Integer.valueOf(i);
        r2.A02 = Integer.valueOf(i2);
        r2.A01 = Boolean.valueOf(r4.A03);
        r2.A00 = Boolean.valueOf(r4.A02);
        r2.A05 = this.A03;
        r2.A06 = Long.valueOf(r4.A00);
        this.A05.CC7(r2);
    }

    public static final void A01(C25781Pp r8, int i, boolean z) {
        List<C55902gY> list = (List) r8.A07.get(Integer.valueOf(i));
        if (list != null) {
            boolean z2 = r8.A04;
            if (z) {
                int i2 = 0;
                for (Object next : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AnonymousClass1ZU.A0B();
                        throw null;
                    }
                    C55902gY r3 = (C55902gY) next;
                    if (i2 == list.size() - 1) {
                        r3.A03 = z2;
                        r3.A02 = !z2;
                    } else {
                        r3.A03 = false;
                        r3.A02 = true;
                    }
                    r8.A00(r3);
                    i2 = i3;
                }
                return;
            }
            for (C55902gY r1 : list) {
                r1.A03 = z2;
                r1.A02 = !z2;
                r8.A00(r1);
            }
        }
    }

    public final void A06(int i, boolean z) {
        C55902gY r4 = new C55902gY(this, i, SystemClock.elapsedRealtime(), z);
        Map map = this.A07;
        Integer valueOf = Integer.valueOf(i);
        List list = (List) map.get(valueOf);
        if (!(list == null && (list = Collections.synchronizedList(new ArrayList())) == null)) {
            if (list.isEmpty() || !z) {
                list.add(r4);
            } else {
                return;
            }
        }
        map.put(valueOf, list);
    }

    public final boolean A07(int i) {
        int size;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        List list = (List) this.A07.get(Integer.valueOf(i));
        if (list == null || (size = list.size() - 1) < 0) {
            return false;
        }
        C55902gY r7 = (C55902gY) list.get(size);
        if (r7.A00 != 0) {
            return false;
        }
        r7.A00 = elapsedRealtime - r7.A05;
        return true;
    }
}
