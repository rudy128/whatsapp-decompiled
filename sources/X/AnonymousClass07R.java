package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.07R  reason: invalid class name */
public final class AnonymousClass07R extends AnonymousClass0UH implements AnonymousClass0t3 {
    public int A00 = -1;
    public long A01 = AnonymousClass0QG.A02;
    public AnonymousClass05D A02;
    public final C17330uU A03 = AnonymousClass0Q9.A04(true);
    public final C17330uU A04 = AnonymousClass0Q9.A02((Object) null);
    public final float A05;
    public final ViewGroup A06;
    public final C16300s2 A07;
    public final C16300s2 A08;
    public final C18090vk A09 = new C08130eb(this);
    public final boolean A0A;

    public void C2z() {
    }

    private final AnonymousClass05D A00() {
        AnonymousClass05D r0 = this.A02;
        if (r0 != null) {
            C18070vi.A0b(r0);
            return r0;
        }
        ViewGroup viewGroup = this.A06;
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AnonymousClass05D) {
                this.A02 = (AnonymousClass05D) childAt;
                break;
            }
            i++;
        }
        AnonymousClass05D r1 = this.A02;
        if (r1 == null) {
            r1 = new AnonymousClass05D(viewGroup.getContext());
            viewGroup.addView(r1);
            this.A02 = r1;
        }
        C18070vi.A0b(r1);
        return r1;
    }

    private final void A01() {
        AnonymousClass05D r4 = this.A02;
        if (r4 != null) {
            this.A04.setValue((Object) null);
            AnonymousClass0HO r0 = r4.A01;
            Map map = r0.A01;
            AnonymousClass059 r2 = (AnonymousClass059) map.get(this);
            if (r2 != null) {
                r2.A00();
                Object obj = map.get(this);
                if (obj != null) {
                    r0.A00.remove(obj);
                }
                map.remove(this);
                r4.A02.add(r2);
            }
        }
    }

    public void A04(AnonymousClass0Uk r2) {
        AnonymousClass059 r0 = (AnonymousClass059) this.A04.getValue();
        if (r0 != null) {
            r0.A01();
        }
    }

    public AnonymousClass07R(ViewGroup viewGroup, C16300s2 r4, C16300s2 r5, float f, boolean z) {
        super(r5, z);
        this.A0A = z;
        this.A05 = f;
        this.A07 = r4;
        this.A08 = r5;
        this.A06 = viewGroup;
    }

    public void A05(AnonymousClass0Uk r12, AnonymousClass1OX r13) {
        AnonymousClass059 A002 = A00().A00(this);
        boolean z = this.A0A;
        long j = this.A01;
        int i = this.A00;
        long A0W = AnonymousClass000.A0W(this.A07);
        AnonymousClass0Uk r2 = r12;
        A002.A03(r2, this.A09, ((AnonymousClass0K3) this.A08.getValue()).A03, i, j, A0W, z);
        this.A04.setValue(A002);
    }

    public void BJY(C17480uj r11) {
        int CG9;
        long BZL = r11.BZL();
        this.A01 = BZL;
        float f = this.A05;
        if (Float.isNaN(f)) {
            CG9 = C22339B3q.A01(AnonymousClass0E9.A00(r11, BZL, this.A0A));
        } else {
            CG9 = r11.CG9(f);
        }
        this.A00 = CG9;
        long A0W = AnonymousClass000.A0W(this.A07);
        float f2 = ((AnonymousClass0K3) this.A08.getValue()).A03;
        r11.BJR();
        A03(r11, f, A0W);
        C16960tV BOJ = r11.BQs().BOJ();
        this.A03.getValue();
        AnonymousClass059 r3 = (AnonymousClass059) this.A04.getValue();
        if (r3 != null) {
            r3.A02(f2, this.A00, r11.BZL(), A0W);
            r3.draw(AnonymousClass0M0.A00(BOJ));
        }
    }

    public void Bkh() {
        A01();
    }

    public void Bux() {
        A01();
    }
}
