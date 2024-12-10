package X;

import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cmk  reason: case insensitive filesystem */
public class C25831Cmk {
    public final AnonymousClass11N A00;
    public final C23859BrG A01;
    public final C23858BrF A02;
    public final AnonymousClass182 A03;
    public final AnonymousClass189 A04;
    public final C25847Cn3 A05;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Cvc, X.BrF] */
    public C25831Cmk(AnonymousClass11N r3, AnonymousClass182 r4, AnonymousClass189 r5, C25847Cn3 cn3) {
        ? cvc = new C26239Cvc();
        C23859BrG brG = new C23859BrG();
        this.A05 = cn3;
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r3;
        this.A02 = cvc;
        this.A01 = brG;
    }

    private void A00(int i) {
        AnonymousClass18A r0;
        AnonymousClass18B r02;
        Object obj;
        AnonymousClass189 r3 = this.A04;
        C25847Cn3 cn3 = this.A05;
        int i2 = cn3.A03;
        if (i2 == 1 || i2 == 0) {
            r0 = r3.A00;
        } else {
            r0 = r3.A01;
        }
        Map map = r0.A00;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            r02 = AnonymousClass18A.A01;
        } else {
            r02 = (AnonymousClass18B) map.get(valueOf);
        }
        C25273CcL ccL = cn3.A04.A00;
        if (ccL.A02 == ccL.A05.A01) {
            Map map2 = ccL.A03.A00;
            if (!map2.containsKey(valueOf)) {
                obj = AnonymousClass18A.A01;
            } else {
                obj = map2.get(valueOf);
            }
            C23859BrG brG = this.A01;
            Map map3 = brG.A00;
            if (!map3.containsKey(valueOf) && !r02.equals(obj)) {
                brG.A07(r02.A00, 0, i);
                map3.put(valueOf, r02);
                return;
            }
            return;
        }
        throw BE6.A0v("No attribute value available for rotated buffers");
    }

    public int A01() {
        return this.A02.A02.size() + this.A01.A02.size();
    }

    public void A02(AnonymousClass184 r5, int i) {
        C23858BrF brF = this.A02;
        brF.A06();
        brF.A07(Integer.valueOf(i), 1, r5.code);
        r5.serialize(new DP8(this));
        byte[] A012 = brF.A02.A01();
        int i2 = brF.A00;
        A012[i2] = (byte) (A012[i2] | 4);
    }

    public void A03(Integer num) {
        long j;
        Integer num2;
        AnonymousClass18A r0;
        this.A01.A06();
        C25847Cn3 cn3 = this.A05;
        int i = cn3.A03;
        if (i == 2 || i == 3) {
            j = TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis()) * 3600;
            if (cn3.A06()) {
                AnonymousClass182 r7 = this.A03;
                synchronized (r7) {
                    num2 = null;
                    if (num != null) {
                        if (num.intValue() != 0) {
                            Map map = r7.A01;
                            if (map == null) {
                                map = r7.A04();
                                r7.A01 = map;
                            }
                            C55332fb r8 = (C55332fb) map.get(num);
                            if (r8 != null) {
                                long currentTimeMillis = System.currentTimeMillis() / 86400000;
                                if (currentTimeMillis > r8.A01) {
                                    r8.A00 = 0;
                                    r8.A01 = currentTimeMillis;
                                }
                                r8.A00++;
                                r7.A05(r8, num);
                                num2 = Integer.valueOf(r8.A00);
                            }
                        }
                    }
                }
            }
            num2 = null;
        } else {
            j = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            if (cn3.A06()) {
                CT0 ct0 = cn3.A06;
                int i2 = ct0.A02 + 1;
                if (i2 <= 0) {
                    ct0.A02 = 0;
                    ct0.A04 = false;
                }
                if (ct0.A04) {
                    ct0.A02 = i2;
                    num2 = Integer.valueOf(i2);
                }
            }
            num2 = null;
        }
        AnonymousClass189 r2 = this.A04;
        r2.A01(Long.valueOf(j), 47, i);
        r2.A01(num2, 3433, i);
        if (i == 1 || i == 0) {
            r0 = r2.A00;
        } else {
            r0 = r2.A01;
        }
        Iterator it = Collections.unmodifiableCollection(r0.A00.keySet()).iterator();
        while (it.hasNext()) {
            A00(C72453Mb.A0H(it));
        }
        C25273CcL ccL = cn3.A04.A00;
        if (ccL.A02 == ccL.A05.A01) {
            Iterator it2 = Collections.unmodifiableCollection(ccL.A03.A00.keySet()).iterator();
            while (it2.hasNext()) {
                A00(C72453Mb.A0H(it2));
            }
            return;
        }
        throw BE6.A0v("No attribute codes available for rotated buffers");
    }

    public void A04(byte[] bArr, int i, int i2) {
        C23858BrF brF = this.A02;
        brF.A06();
        brF.A07(Integer.valueOf(i2), 1, i);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        C18070vi.A0d(wrap, 0);
        while (wrap.position() < wrap.limit()) {
            try {
                CQX A032 = C26239Cvc.A03(wrap);
                brF.A07(A032.A02, 2, A032.A00);
            } catch (C24388C1i e) {
                Log.e("EventSerialBuffer/putSerializedEvent Error adding serialized event to buffer", e);
            }
        }
        byte[] A012 = brF.A02.A01();
        int i3 = brF.A00;
        A012[i3] = (byte) (A012[i3] | 4);
    }
}
