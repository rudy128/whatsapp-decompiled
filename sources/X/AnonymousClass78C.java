package X;

import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.List;

/* renamed from: X.78C  reason: invalid class name */
public class AnonymousClass78C implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass78C(Object obj, int i, Object obj2, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj2;
        this.A01 = i;
        this.A04 = obj;
        this.A02 = i2;
    }

    public final void onClick(View view) {
        if (this.A00 != 0) {
            AnonymousClass4VW r3 = (AnonymousClass4VW) this.A03;
            int i = this.A01;
            int i2 = this.A02;
            AnonymousClass74D r4 = r3.A05;
            C29681ch r5 = r3.A03;
            long j = r3.A01;
            int A002 = r3.A00();
            r4.A0E(r5, Integer.valueOf(i), (Integer) null, A002, 4, j);
            ((AnonymousClass1FU) this.A04).CMl(AnonymousClass4H7.A00(r5, i2, A002, j));
            return;
        }
        AnonymousClass61I r7 = (AnonymousClass61I) this.A03;
        C1418377d r6 = (C1418377d) this.A04;
        int i3 = this.A02;
        int i4 = this.A01;
        C1418377d r32 = r6;
        List list = C42011xT.A0I;
        if (!r6.A0N && r6.A0B == null) {
            C25311Ns r2 = r7.A07;
            String str = r6.A0F;
            if (str == null) {
                str = "";
            }
            File A042 = r2.A04(str, r6.A0E);
            r32 = r6.A00();
            C108945cZ.A1O(r32, A042);
        }
        r7.A02 = !r7.A02;
        int i5 = 0;
        C72453Mb.A0T(r7.A0G).setVisibility(C72453Mb.A07(r7.A02 ? 1 : 0));
        View A0A = AnonymousClass3MW.A0A(r7.A0D);
        if (!r7.A02) {
            i5 = 8;
        }
        A0A.setVisibility(i5);
        FrameLayout frameLayout = r7.A06;
        AnonymousClass73J.A03(frameLayout, true, r7.A02);
        C108955ca.A1B(AnonymousClass3MY.A04(r7.A0H), frameLayout, r6);
        r7.A09.C6w((AnonymousClass1BI) null, r32, Integer.valueOf(i3), i4);
    }
}
