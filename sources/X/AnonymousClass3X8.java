package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3X8  reason: invalid class name */
public final class AnonymousClass3X8 extends C38391rD {
    public AnonymousClass1E7 A00;
    public List A01 = C18460wS.A00;
    public final Context A02;
    public final C37451pZ A03;
    public final C88524a2 A04;
    public final C108875cR A05;
    public final C18030ve A06;
    public final C29681ch A07;
    public final C36401np A08;
    public final C18090vk A09;
    public final C22821Di A0A;
    public final AnonymousClass1LU A0B;

    public AnonymousClass3X8(Context context, C27201Vd r3, C88524a2 r4, C108875cR r5, C18030ve r6, AnonymousClass1LU r7, C29681ch r8, C36401np r9, C18090vk r10, C22821Di r11) {
        C18070vi.A0d(r8, 6);
        this.A06 = r6;
        this.A02 = context;
        this.A08 = r9;
        this.A0B = r7;
        this.A07 = r8;
        this.A04 = r4;
        this.A05 = r5;
        this.A09 = r10;
        this.A0A = r11;
        this.A03 = r3.A06(context, "newsletter-suspension-info-adapter");
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new AnonymousClass3ZN(AnonymousClass3MY.A0E(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131626181));
    }

    public int A0Q() {
        return this.A01.size();
    }

    public final void A0U(AnonymousClass206 r10) {
        List list = this.A01;
        ArrayList A0D = C29351c6.A0D(list);
        int i = 0;
        int i2 = -1;
        for (Object next : list) {
            int i3 = i + 1;
            if (i < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            }
            C86984Tv r3 = (C86984Tv) next;
            if (C18070vi.A18(r3.A01.A0v, r10.A0v)) {
                r3 = new C86984Tv(r3.A00, r10);
                i2 = i;
            }
            A0D.add(r3);
            i = i3;
        }
        this.A01 = A0D;
        if (i2 != -1) {
            A0G(i2);
        }
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r10, int i) {
        AnonymousClass3ZN r102 = (AnonymousClass3ZN) r10;
        C18070vi.A0d(r102, 0);
        C86984Tv r0 = (C86984Tv) this.A01.get(i);
        AnonymousClass206 r6 = r0.A01;
        AnonymousClass445 r4 = r0.A00;
        FrameLayout frameLayout = r102.A00;
        AnonymousClass3uP A052 = this.A04.A05(this.A05, r6);
        Context context = this.A02;
        AnonymousClass4HL.A00(context, A052);
        A052.setHeaderChevronVisibility(false);
        AnonymousClass1E7 r2 = this.A00;
        if (r2 != null) {
            this.A03.A07(AnonymousClass3MW.A0H(A052, 2131434167), r2);
        }
        frameLayout.removeAllViews();
        frameLayout.addView(A052);
        C90024dP.A00(r102.A03, this, r4, 8);
        C90024dP.A00(r102.A02, this, r6, 9);
        WaTextView waTextView = r102.A01;
        C36401np r5 = this.A08;
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = context.getString(AnonymousClass4HN.A00(r4.A03));
        waTextView.setText(r5.A05(context, new C146757Qm((Object) this.A09, 3), C17880vN.A0q(context, "clickable-span", A1b, 1, 2131892544), "clickable-span"));
        AnonymousClass3Ma.A1I(waTextView, this.A06);
    }
}
