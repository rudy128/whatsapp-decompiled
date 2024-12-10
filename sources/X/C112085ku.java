package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5ku  reason: invalid class name and case insensitive filesystem */
public final class C112085ku extends C38391rD {
    public List A00 = AnonymousClass000.A13();
    public final C112335lJ A01;
    public final C51122Xb A02;
    public final C19810z2 A03 = AnonymousClass6RN.A00;

    public C112085ku(C51122Xb r2, C112335lJ r3) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
        this.A01 = r3;
    }

    public final void A0U(AnonymousClass6RN r6) {
        C18070vi.A0d(r6, 0);
        C19810z2<AnonymousClass6RN> r0 = this.A03;
        ArrayList A0D = C29351c6.A0D(r0);
        for (AnonymousClass6RN r2 : r0) {
            A0D.add(new C134996rU(r2, AnonymousClass000.A1Z(r2, r6)));
        }
        this.A00 = A0D;
        notifyDataSetChanged();
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View inflate = C72463Mc.A0K(viewGroup, 0).inflate(2131626258, viewGroup, false);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        TextView textView = (TextView) inflate;
        C43421zm.A04(textView);
        return new C113035mR(textView, this);
    }

    public int A0Q() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r7, int i) {
        C113035mR r72 = (C113035mR) r7;
        C18070vi.A0d(r72, 0);
        C134996rU r1 = (C134996rU) this.A00.get(i);
        C18070vi.A0d(r1, 0);
        Chip chip = r72.A00;
        chip.setContentDescription(chip.getText());
        chip.setChecked(r1.A01);
        chip.setCheckedIconVisible(false);
        AnonymousClass6RN r0 = r1.A00;
        Context A04 = AnonymousClass3MY.A04(chip);
        int ordinal = r0.ordinal();
        int i2 = 2131896536;
        if (ordinal != 0) {
            i2 = 2131896538;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i2 = 2131896537;
                } else {
                    throw AnonymousClass3MW.A14();
                }
            }
        }
        chip.setText(C18070vi.A0F(A04, i2));
    }
}
