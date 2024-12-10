package X;

import android.app.Activity;
import android.view.Window;

/* renamed from: X.1oL  reason: invalid class name and case insensitive filesystem */
public class C36711oL {
    public C39641tP A00;
    public Boolean A01;
    public String A02;
    public final AnonymousClass19T A03;
    public final AnonymousClass00H A04;
    public final C18030ve A05;
    public final AnonymousClass18K A06;
    public final C36701oK A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09 = C221618v.A00(C214215x.class);

    public static boolean A00(C36711oL r3) {
        Boolean bool = r3.A01;
        if (bool == null) {
            bool = Boolean.valueOf(new C18180vt(1, 1, 1, false).A00());
            r3.A01 = bool;
        }
        return bool.booleanValue();
    }

    public void A03(Window window, int i) {
        if (this.A00 != null) {
            AnonymousClass19T r4 = this.A03;
            r4.markerStart(689639794);
            if (C18020vd.A05(C18040vf.A02, this.A05, 6084)) {
                r4.Bit(new C694837j(this, 1), 689639794);
            }
            this.A00.C4b(window, i, A00(this), r4.BfT(689639794));
        }
    }

    public C36711oL(C18030ve r2, AnonymousClass18K r3, C36701oK r4, AnonymousClass19T r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        this.A03 = r5;
        this.A05 = r2;
        this.A06 = r3;
        this.A08 = r6;
        this.A04 = r7;
        this.A07 = r4;
    }

    public void A01() {
        C39641tP r0;
        if ((A00(this) || this.A03.BfT(689639794)) && (r0 = this.A00) != null) {
            r0.C4c();
        }
    }

    public void A02(Activity activity) {
        C39641tP r3;
        if ((A00(this) || this.A03.Biy()) && this.A00 == null) {
            Activity activity2 = activity;
            if (C18020vd.A05(C18040vf.A01, this.A05, 5025)) {
                r3 = new C27036DQh(activity2, (C214215x) this.A09.get(), this.A06, this.A03, this.A08);
            } else {
                r3 = new C39651tQ(activity, (C214215x) this.A09.get(), this.A06, this.A03);
            }
            this.A00 = r3;
        }
    }
}
