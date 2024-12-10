package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import java.util.List;

/* renamed from: X.3Wm  reason: invalid class name and case insensitive filesystem */
public final class C73573Wm extends C38391rD {
    public final C107645aM A00;
    public final Integer A01;
    public final List A02;
    public final C18090vk A03;
    public final Integer A04;

    public C73573Wm(C107645aM r2, Integer num, Integer num2, List list, C18090vk r6) {
        C18070vi.A0d(r6, 4);
        this.A02 = list;
        this.A00 = r2;
        this.A01 = num;
        this.A03 = r6;
        this.A04 = num2;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r5, int i) {
        C18070vi.A0d(r5, 0);
        List list = this.A02;
        int size = i % list.size();
        AnonymousClass77E r3 = (AnonymousClass77E) list.get(size);
        C18070vi.A0d(r3, 0);
        View view = r5.A0H;
        if (view instanceof Chip) {
            C18070vi.A0z(view, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            ((TextView) view).setText(r3.A03);
        }
        view.setOnClickListener(new AnonymousClass48n(this, size, 15));
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        int i2 = 2131626782;
        if (this.A01 == AnonymousClass00R.A01) {
            i2 = 2131626285;
        }
        View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(i2, viewGroup, false);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        AnonymousClass3MX.A1P(inflate);
        return new C42011xT(inflate);
    }

    public int A0Q() {
        Integer num = this.A04;
        if (num != null) {
            return num.intValue();
        }
        return 1200;
    }
}
