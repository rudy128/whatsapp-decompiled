package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import java.util.Set;

/* renamed from: X.5nQ  reason: invalid class name and case insensitive filesystem */
public class C113645nQ extends C42011xT implements View.OnClickListener, View.OnLongClickListener {
    public final int A00;
    public final ColorDrawable A01;
    public final C136166tN A02;
    public final C1188465m A03;
    public final Set A04;
    public final boolean A05;
    public final AnonymousClass7DY A06;
    public final C20050A4v A07;

    public void onClick(View view) {
        this.A07.A02(C108955ca.A0j(), 1, 17);
        AnonymousClass7DY r4 = this.A06;
        C1188465m r3 = this.A03;
        C18070vi.A0d(r3, 0);
        if ((r3.A0A() || !C72453Mb.A1a(r4.A1W)) && AnonymousClass7DY.A0e(r4)) {
            boolean A1U = C108945cZ.A1U(r4.A15.A09);
            AnonymousClass8B2 r0 = r3.A08;
            if (!A1U) {
                AnonymousClass7DY.A0T(r4, r0, r3, false);
            } else {
                AnonymousClass7DY.A0S(r4, r0);
            }
            C88184Yq r2 = r4.A1A;
            C81613zW r1 = r2.A01;
            if (r1 != null) {
                r1.A03 = C17880vN.A0k();
                C88184Yq.A00(r2);
                r2.A01();
            }
        }
    }

    public boolean onLongClick(View view) {
        this.A07.A02(C108955ca.A0j(), 4, 17);
        AnonymousClass7DY r2 = this.A06;
        C1188465m r1 = this.A03;
        C18070vi.A0d(r1, 0);
        if ((!r1.A0A() && C72453Mb.A1a(r2.A1W)) || !AnonymousClass7DY.A0e(r2)) {
            return true;
        }
        AnonymousClass7DY.A0S(r2, r1.A08);
        return true;
    }

    public C113645nQ(AnonymousClass7DY r3, C136166tN r4, C1188465m r5, C20050A4v a4v, Set set, boolean z) {
        super(r5);
        this.A03 = r5;
        this.A04 = set;
        this.A02 = r4;
        r5.setOnClickListener(this);
        r5.setOnLongClickListener(this);
        this.A06 = r3;
        this.A07 = a4v;
        this.A05 = z;
        int A002 = C19740yt.A00(r5.getContext(), 2131100009);
        this.A00 = A002;
        this.A01 = new ColorDrawable(A002);
    }
}
