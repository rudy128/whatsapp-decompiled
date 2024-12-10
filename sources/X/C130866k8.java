package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaTextView;
import com.whatsapp.status.playback.page.StatusMentionsPanel$loadData$1;
import java.util.Set;

/* renamed from: X.6k8  reason: invalid class name and case insensitive filesystem */
public final class C130866k8 {
    public AnonymousClass1OB A00;
    public final View A01;
    public final View A02;
    public final WaTextView A03;
    public final AnonymousClass1M9 A04;
    public final C24921Me A05;
    public final C111985kk A06;
    public final C18100vl A07;
    public final C18600wl A08;
    public final AnonymousClass1OX A09;

    public C130866k8(ViewGroup viewGroup, AnonymousClass1M9 r7, C24921Me r8, C27201Vd r9, Set set, C18600wl r11, AnonymousClass1OX r12) {
        C72473Md.A1M(r9, r12, r7, 1);
        C18070vi.A0l(r8, r11);
        this.A09 = r12;
        this.A04 = r7;
        this.A05 = r8;
        this.A08 = r11;
        C18110vm A012 = AnonymousClass1DF.A01(new AnonymousClass7vL(viewGroup, r9));
        this.A07 = A012;
        C111985kk r2 = new C111985kk((C37451pZ) A012.getValue());
        this.A06 = r2;
        View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131627015, viewGroup, true);
        this.A02 = AnonymousClass3MX.A0C(inflate, 2131435659);
        this.A03 = C72453Mb.A0g(inflate, 2131436208);
        this.A01 = AnonymousClass3MX.A0C(inflate, 2131434181);
        RecyclerView A0Q = AnonymousClass3MX.A0Q(inflate, 2131432485);
        AnonymousClass3Ma.A15(A0Q.getContext(), A0Q);
        A0Q.setAdapter(r2);
        this.A01.setVisibility(0);
        AnonymousClass1OX r3 = this.A09;
        this.A00 = C30451dy.A02(AnonymousClass00R.A00, this.A08, new StatusMentionsPanel$loadData$1(inflate, this, set, (C30391dr) null), r3);
    }
}
