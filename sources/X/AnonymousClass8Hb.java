package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.8Hb  reason: invalid class name */
public class AnonymousClass8Hb extends C38391rD {
    public List A00;
    public final C51322Xv A01;

    public int A0Q() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r14, int i) {
        C161978Im r142 = (C161978Im) r14;
        C192199ny r7 = (C192199ny) this.A00.get(i);
        WaTextView waTextView = r142.A01;
        AnonymousClass8nD r3 = r7.A01;
        waTextView.setText(r3.A01);
        int parseColor = Color.parseColor(r3.A02);
        WaImageButton waImageButton = r142.A00;
        View view = r142.A0H;
        Context context = view.getContext();
        int A0G = C72453Mb.A0G(waImageButton, context, 1);
        int A03 = AnonymousClass1Z2.A03(0.08f, parseColor, -16777216);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int[] iArr = new int[A0G];
        iArr[0] = parseColor;
        iArr[1] = A03;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setShape(1);
        gradientDrawable.setGradientType(A0G);
        gradientDrawable.setGradientCenter(-1.0f, 0.5f);
        gradientDrawable.setSize(waImageButton.getWidth(), waImageButton.getHeight());
        waImageButton.setBackground(AnonymousClass4aX.A09(context, gradientDrawable));
        r142.A02.A00(waImageButton, r3.A03);
        AnonymousClass4aX.A0D(waImageButton, AnonymousClass3MZ.A02(view.getContext(), view.getContext(), 2130971957, 2131103410));
        C825248h.A00(view, r142, r7, 16);
        waImageButton.setOnClickListener(new AnonymousClass48l(r142, 5));
        waTextView.setOnClickListener(new AnonymousClass48l(r142, 6));
    }

    public AnonymousClass8Hb(C51322Xv r1) {
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View A09 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626501);
        Resources resources = viewGroup.getResources();
        if (resources.getConfiguration().orientation == 1) {
            float paddingStart = ((float) (resources.getDisplayMetrics().widthPixels - (viewGroup.getPaddingStart() + viewGroup.getPaddingEnd()))) / 4.4f;
            if (((float) resources.getDimensionPixelSize(2131168274)) > paddingStart) {
                View A06 = AnonymousClass1HF.A06(A09, 2131428925);
                int floor = (int) Math.floor(((double) paddingStart) / 1.5d);
                A06.getLayoutParams().width = floor;
                AnonymousClass3MX.A1F(A06, floor);
            }
            A09.getLayoutParams().width = (int) paddingStart;
        }
        C51322Xv r1 = this.A01;
        List list = C42011xT.A0I;
        return new C161978Im(A09, (C189989kB) r1.A00.A01.A00.A1U.get());
    }
}
