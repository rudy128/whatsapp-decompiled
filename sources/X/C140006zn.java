package X;

import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6zn  reason: invalid class name and case insensitive filesystem */
public class C140006zn {
    public long A00;
    public final C137946wH A01 = new C137946wH();
    public final C137946wH A02 = new C137946wH();
    public final List A03 = C17880vN.A0z(1);
    public final Map A04 = C17880vN.A11();
    public final boolean A05;

    private void A00(C137946wH r5) {
        Iterator A0l = C17890vO.A0l(r5.A00);
        while (A0l.hasNext()) {
            C1404171i r2 = (C1404171i) A0l.next();
            C128256fh r1 = (C128256fh) this.A04.get(r2.A00);
            if (r1 != null) {
                r1.A00 = AnonymousClass00R.A0C;
                r1.A02.clear();
                r2.A00(this);
            }
        }
    }

    public float A01(C1404171i r6) {
        C128256fh r3 = (C128256fh) this.A04.get(r6.A00);
        if (r3 == null) {
            return 0.0f;
        }
        Rect rect = r3.A01;
        if (rect.top == Integer.MIN_VALUE || rect.left == Integer.MIN_VALUE || rect.right == Integer.MIN_VALUE || rect.bottom == Integer.MIN_VALUE) {
            throw AnonymousClass000.A0n("This viewpoint has not been measured or is a group which will never return a measurement since it's made up of subviews that could be offscreen");
        }
        int height = rect.height() * rect.width();
        int i = 0;
        for (Rect rect2 : r3.A02) {
            i += rect2.height() * rect2.width();
        }
        return ((float) i) / ((float) height);
    }

    public void A02() {
        C137946wH r2 = this.A02;
        for (C1404171i A002 : r2.A01) {
            A002.A00(this);
        }
        A00(r2);
        C137946wH r22 = this.A01;
        for (C1404171i A003 : r22.A01) {
            A003.A00(this);
        }
        A00(r22);
    }

    public void A03(List list, long j) {
        this.A00 = j;
        List list2 = this.A03;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            list2.add(new Rect((Rect) it.next()));
        }
        C137946wH r4 = this.A02;
        Iterator A0l = C17890vO.A0l(r4.A00);
        while (A0l.hasNext()) {
            this.A04.remove(((C1404171i) A0l.next()).A00);
        }
        C137946wH r3 = this.A01;
        Iterator A0l2 = C17890vO.A0l(r3.A00);
        while (A0l2.hasNext()) {
            this.A04.remove(((C1404171i) A0l2.next()).A00);
        }
        Iterator A0l3 = C17890vO.A0l(this.A04);
        while (A0l3.hasNext()) {
            ((C128256fh) A0l3.next()).A02.clear();
        }
        C137946wH.A00(r4);
        C137946wH.A00(r3);
    }

    public C140006zn(boolean z) {
        this.A05 = z;
    }
}
