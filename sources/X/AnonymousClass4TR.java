package X;

import java.util.Map;

/* renamed from: X.4TR  reason: invalid class name */
public class AnonymousClass4TR {
    public Map A00;
    public final C18030ve A01;

    public synchronized int A00(AnonymousClass21X r11) {
        int i;
        long j;
        C19760yx r0;
        long j2;
        C19760yx r02;
        synchronized (this) {
            C18030ve r2 = this.A01;
            C18040vf r1 = C18040vf.A02;
            if (C18020vd.A05(r1, r2, 2281)) {
                int A002 = C18020vd.A00(r1, r2, 3683);
                double A003 = (double) (((long) C18020vd.A00(r1, r2, 3684)) * 1000);
                if (r11.A0D <= 1) {
                    j2 = 600;
                } else {
                    j2 = ((long) r11.A0D) * 1000;
                }
                i = Math.min(A002, (int) Math.ceil(A003 / ((double) j2)));
                Map map = this.A00;
                if (!(map == null || (r02 = (C19760yx) map.get(r11.A0v)) == null)) {
                    i -= ((Integer) r02.A01).intValue();
                }
            } else {
                if (r11.A0D <= 1) {
                    j = 600;
                } else {
                    j = C17890vO.A03(r11.A0D);
                }
                i = Math.max(3, (int) Math.ceil(6000.0d / ((double) j)));
                Map map2 = this.A00;
                if (!(map2 == null || (r0 = (C19760yx) map2.get(r11.A0v)) == null)) {
                    i -= ((Integer) r0.A01).intValue();
                }
            }
        }
        return i;
    }

    public synchronized void A01(AnonymousClass205 r5) {
        Map map = this.A00;
        if (map == null) {
            map = C17880vN.A11();
            this.A00 = map;
        }
        map.put(r5, new C19760yx(0L, AnonymousClass3MY.A0f()));
    }

    public synchronized void A02(AnonymousClass205 r2) {
        Map map = this.A00;
        if (map != null) {
            map.remove(r2);
        }
    }

    public AnonymousClass4TR(C18030ve r1) {
        this.A01 = r1;
    }
}
