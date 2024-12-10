package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.ImageView;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public abstract class A2k {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass1KB A02;
    public final A5O A03;
    public final BCQ A04;
    public final Object A05 = C17880vN.A0p();
    public final String A06;
    public final List A07;
    public final List A08;
    public final Map A09 = C17880vN.A11();
    public final Stack A0A = new Stack();
    public final Stack A0B = new Stack();
    public final AnonymousClass10I A0C;

    public abstract Pair A01(C188219h4 r1);

    public static void A00(A2k a2k, Object obj, Object obj2, Map map) {
        a2k.A09.remove(obj);
        if (map.size() != 0) {
            ArrayList arrayList = new ArrayList(map.values());
            map.clear();
            a2k.A02.A0J(new C21455AkM(obj2, arrayList, a2k, 16));
        }
    }

    public void A02(BCx bCx) {
        synchronized (this.A05) {
            C188219h4 r2 = (C188219h4) this.A09.get(bCx.getId());
            if (r2 != null && bCx.getId().equals(r2.A03)) {
                r2.A05.remove(bCx);
            }
        }
    }

    public void A03(BCx bCx, boolean z) {
        String str;
        BCQ bcq = this.A04;
        bcq.Bx1(bCx);
        A5O a5o = this.A03;
        Bitmap A012 = a5o.A01(bCx.getId());
        if (A012 == null) {
            bCx.Bb5();
        }
        ImageView BSp = bCx.BSp();
        if (!(BSp == null || BSp.getTag(2131433300) == null || !AnonymousClass000.A1Y(BSp.getTag(2131433300)))) {
            ImageView BSp2 = bCx.BSp();
            if (BSp2 != null) {
                str = (String) BSp2.getTag(2131434052);
            } else {
                str = null;
            }
            String id = bCx.getId();
            if (str != null) {
                if (TextUtils.isEmpty(id) || !TextUtils.equals(str, id)) {
                    synchronized (a5o.A02) {
                        Bitmap A013 = a5o.A01(str);
                        if (A013 != null) {
                            a5o.A03.A00(A013.getWidth(), A013.getHeight(), str);
                        }
                    }
                }
            }
            if (bCx.BSp() != null) {
                bCx.BSp().setTag(2131434052, id);
            }
        }
        if (A012 != null) {
            if (A012 != A5O.A07) {
                bcq.Bx6(A012, bCx, true);
                return;
            } else if (!z) {
                bcq.Bwu(bCx);
                return;
            }
        }
        bcq.Blh(bCx);
        C17960vV.A02();
        synchronized (this.A05) {
            Map map = this.A09;
            C188219h4 r2 = (C188219h4) map.get(bCx.getId());
            if (r2 == null) {
                r2 = new C188219h4(bCx);
                map.put(r2.A03, r2);
            } else {
                r2.A05.put(bCx, bCx);
            }
            Stack stack = this.A0A;
            stack.remove(r2);
            this.A0B.remove(r2);
            stack.push(r2);
            synchronized (stack) {
                stack.notify();
            }
        }
        if (!this.A00) {
            for (Thread thread : this.A07) {
                if (thread.getState() == Thread.State.NEW) {
                    thread.start();
                }
            }
            this.A00 = true;
        }
        if (!this.A01) {
            for (Thread thread2 : this.A08) {
                if (thread2.getState() == Thread.State.NEW) {
                    thread2.start();
                }
            }
            this.A01 = true;
        }
    }

    public void A04(boolean z) {
        this.A0C.CGF(new AnonymousClass7RK(10, (Object) this, z));
    }

    public A2k(AnonymousClass1KB r5, BCQ bcq, AnonymousClass10I r7, File file, String str, int i, long j) {
        this.A0C = r7;
        this.A02 = r5;
        this.A06 = str;
        this.A03 = new A5O(file, j);
        this.A04 = bcq;
        this.A07 = C17880vN.A0z(i);
        this.A08 = C17880vN.A0z(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.A08.add(new C177999Bk(this, this.A06));
            this.A07.add(new C177989Bj(this, this.A06));
        }
    }
}
