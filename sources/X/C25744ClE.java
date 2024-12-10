package X;

import android.os.Looper;
import android.util.LruCache;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.ClE  reason: case insensitive filesystem */
public class C25744ClE {
    public Looper A00;
    public C24797CKq A01;
    public final C24759CIw A02;
    public final C25852CnE A03;
    public final CSV A04;
    public final List A05;
    public final List A06;
    public final UUID A07;
    public final int[] A08;
    public volatile C22616BFx A09;

    public static C26556D3w A00(DUU duu, UUID uuid) {
        int i;
        CPA A002;
        int i2 = duu.A01;
        ArrayList A0z = C17880vN.A0z(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            C26556D3w d3w = duu.A03[i3];
            UUID uuid2 = C24736CHy.A03;
            UUID uuid3 = d3w.A03;
            if (!uuid2.equals(uuid3) && !uuid.equals(uuid3)) {
                if (C24736CHy.A00.equals(uuid)) {
                    UUID uuid4 = C24736CHy.A01;
                    UUID uuid5 = d3w.A03;
                    if (!uuid2.equals(uuid5) && !uuid4.equals(uuid5)) {
                    }
                }
            }
            if (d3w.A04 != null) {
                A0z.add(d3w);
            }
        }
        if (A0z.isEmpty()) {
            return null;
        }
        if (C24736CHy.A04.equals(uuid)) {
            for (int i4 = 0; i4 < A0z.size(); i4++) {
                C26556D3w d3w2 = (C26556D3w) A0z.get(i4);
                if (d3w2.A04 == null || (A002 = C85.A00(d3w2.A04)) == null) {
                    i = -1;
                } else {
                    i = A002.A00;
                }
                if (Util.A00 < 23) {
                    if (i == 0) {
                        return d3w2;
                    }
                } else if (i == 1) {
                    return d3w2;
                }
            }
        }
        return (C26556D3w) A0z.get(0);
    }

    public void A01(C26669D8s d8s) {
        List list = this.A05;
        list.add(d8s);
        if (list.size() == 1) {
            d8s.A03.obtainMessage(0, 1, 0, d8s.A0B.A02()).sendToTarget();
        }
    }

    public void A02(E8V e8v) {
        C25496Cgr cgr;
        if (!(e8v instanceof C26668D8r)) {
            C26669D8s d8s = (C26669D8s) e8v;
            int i = d8s.A00 - 1;
            d8s.A00 = i;
            if (i == 0) {
                d8s.A01 = 0;
                d8s.A08.removeCallbacksAndMessages((Object) null);
                d8s.A03.removeCallbacksAndMessages((Object) null);
                d8s.A03 = null;
                d8s.A02.quit();
                d8s.A02 = null;
                d8s.A05 = null;
                d8s.A04 = null;
                byte[] bArr = d8s.A07;
                if (bArr != null) {
                    d8s.A0B.A08(bArr);
                    d8s.A07 = null;
                }
                this.A06.remove(d8s);
                List list = this.A05;
                if (list.size() > 1 && C108955ca.A0p(list) == d8s) {
                    C26669D8s d8s2 = (C26669D8s) list.get(1);
                    d8s2.A03.obtainMessage(0, 1, 0, d8s2.A0B.A02()).sendToTarget();
                }
                list.remove(d8s);
            }
            if (this.A01 != null) {
                synchronized (C25496Cgr.class) {
                    cgr = C25496Cgr.A01;
                }
                synchronized (cgr) {
                    LruCache lruCache = cgr.A00;
                    if (lruCache != null) {
                        Iterator A0x = AnonymousClass8BU.A0x(lruCache.snapshot());
                        while (true) {
                            if (!A0x.hasNext()) {
                                break;
                            }
                            C26556D3w d3w = (C26556D3w) A0x.next();
                            if (cgr.A00.get(d3w) == e8v) {
                                if (d3w != null) {
                                    cgr.A00.remove(d3w);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public C25744ClE(C25852CnE cnE, CSV csv, UUID uuid, int[] iArr) {
        C26056CrS.A01(uuid);
        C26056CrS.A01(cnE);
        if (!C24736CHy.A01.equals(uuid)) {
            this.A07 = uuid;
            this.A03 = cnE;
            this.A04 = csv;
            this.A02 = new C24759CIw();
            this.A08 = iArr;
            this.A06 = AnonymousClass000.A13();
            this.A05 = AnonymousClass000.A13();
            cnE.A06(new C24760CIx(this));
            return;
        }
        throw BE8.A0W("Use C.CLEARKEY_UUID instead");
    }
}
