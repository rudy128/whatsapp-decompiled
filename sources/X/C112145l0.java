package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.5l0  reason: invalid class name and case insensitive filesystem */
public final class C112145l0 extends C38391rD {
    public int A00;
    public List A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass1M9 A03;
    public final AnonymousClass10I A04;
    public final int A05;
    public final int A06;
    public final C125346av A07;
    public final C37451pZ A08;
    public final AnonymousClass85W A09;

    public void Bmc(C42011xT r8, int i) {
        int i2;
        C18070vi.A0d(r8, 0);
        if (r8 instanceof C113455n7) {
            C113455n7 r82 = (C113455n7) r8;
            C135386s7 r4 = (C135386s7) this.A01.get(i);
            C18070vi.A0d(r4, 0);
            AnonymousClass1E7 r3 = r4.A00;
            int i3 = 0;
            r82.A06.A05(r82.A02, r82.A09, r3, false);
            WaTextView waTextView = r82.A04;
            waTextView.setText(r82.A05.A0N(r3));
            C43421zm.A04(waTextView);
            View view = r82.A0H;
            AnonymousClass78T.A00(view, r82, r4, i, 21);
            WaButtonWithLoader waButtonWithLoader = r82.A00;
            waButtonWithLoader.A00 = new AnonymousClass78T(r82, i, 22, r4);
            if (r4.A01) {
                waButtonWithLoader.A02();
            } else {
                waButtonWithLoader.A01();
            }
            C46162Dk r42 = r4.A02;
            if (AnonymousClass000.A1Z(r42.A02, C179509Ig.GUEST)) {
                waButtonWithLoader.setVariant(C27881Xz.TONAL);
                i2 = 2131890489;
            } else {
                waButtonWithLoader.setVariant(C27881Xz.OUTLINE);
                i2 = 2131890498;
            }
            waButtonWithLoader.setButtonText(i2);
            ViewStub viewStub = r82.A01;
            C18070vi.A0W(viewStub);
            if (!AnonymousClass000.A1Z(r42.A05, AnonymousClass9IW.VERIFIED)) {
                i3 = 8;
            }
            viewStub.setVisibility(i3);
            if (r82.A07.A09()) {
                r82.A03.A00(view, r42.A0M(), i).A00();
            }
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        LayoutInflater A0K = C72463Mc.A0K(viewGroup, 0);
        if (i == 1) {
            View inflate = A0K.inflate(this.A05, viewGroup, false);
            C125346av r1 = this.A07;
            C18070vi.A0b(inflate);
            C37451pZ r6 = this.A08;
            AnonymousClass85W r8 = this.A09;
            List list = C42011xT.A0I;
            AnonymousClass10E r2 = r1.A00.A00;
            C24921Me A0g = AnonymousClass3MZ.A0g(r2);
            AnonymousClass10G r12 = r2.A00;
            AnonymousClass1c4 A0T = C108965cb.A0T(r2);
            return new C113455n7(inflate, (AnonymousClass6l4) r12.A1w.get(), A0g, r6, A0T, r8, (AQC) r12.A0z.get());
        }
        View inflate2 = A0K.inflate(this.A06, viewGroup, false);
        List list2 = C42011xT.A0I;
        C72453Mb.A1S(inflate2);
        return new C42011xT(inflate2);
    }

    public int A0Q() {
        int i = this.A00;
        if (i <= 0) {
            return this.A01.size();
        }
        return i;
    }

    public int getItemViewType(int i) {
        if (this.A00 > 0) {
            return 0;
        }
        return 1;
    }

    public C112145l0(C125346av r2, AnonymousClass1KB r3, AnonymousClass1M9 r4, C37451pZ r5, AnonymousClass85W r6, AnonymousClass10I r7, boolean z) {
        C18070vi.A0s(r3, r7, r4, r2);
        this.A02 = r3;
        this.A04 = r7;
        this.A03 = r4;
        this.A07 = r2;
        this.A08 = r5;
        this.A09 = r6;
        this.A05 = z ? 2131626685 : 2131626687;
        this.A06 = z ? 2131626686 : 2131626688;
        this.A01 = C18460wS.A00;
    }
}
