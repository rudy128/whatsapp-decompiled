package X;

import android.animation.ValueAnimator;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.whatsapp.components.RoundCornerProgressBarV2;
import java.util.List;

/* renamed from: X.6px  reason: invalid class name and case insensitive filesystem */
public abstract class C134066px {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final RoundCornerProgressBarV2 A03;
    public final AnonymousClass11C A04;
    public final C18000vb A05;
    public final AnonymousClass1KW A06;
    public final C18010vc A07;

    public final void A03(String str, List list) {
        C18070vi.A0d(str, 0);
        CharSequence charSequence = str;
        if (list != null) {
            charSequence = C43351zf.A01(this.A00.getContext(), this.A05, str, list);
        }
        C18070vi.A0b(charSequence);
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(charSequence);
        C26302CxJ.A0C(this.A04, this.A07, A09);
        TextView textView = this.A02;
        textView.setText(C43251zV.A03(this.A00.getContext(), textView.getPaint(), this.A06, A09));
    }

    public final void A02(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            this.A03.A01 = C19740yt.A00(this.A00.getContext(), 2131102191);
        }
        RoundCornerProgressBarV2 roundCornerProgressBarV2 = this.A03;
        int i3 = 0;
        if (i2 != 0) {
            int i4 = (i * 100) / i2;
            if (i4 > 100) {
                i4 = 100;
            } else if (i4 < 0) {
                i4 = 0;
            }
            i3 = i4;
        }
        if (i3 != roundCornerProgressBarV2.A03) {
            roundCornerProgressBarV2.A03 = i3;
            ValueAnimator valueAnimator = roundCornerProgressBarV2.A00;
            if (valueAnimator != null && valueAnimator.isStarted()) {
                valueAnimator.cancel();
            }
            if (z2) {
                float[] A1V = C108945cZ.A1V();
                A1V[0] = roundCornerProgressBarV2.A00;
                A1V[1] = (float) roundCornerProgressBarV2.A03;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new C88754aj(roundCornerProgressBarV2, 10));
                ofFloat.start();
                roundCornerProgressBarV2.A00 = ofFloat;
                return;
            }
            roundCornerProgressBarV2.A00 = (float) i3;
            roundCornerProgressBarV2.invalidate();
        }
    }

    public C134066px(View view, AnonymousClass11C r3, C18000vb r4, AnonymousClass1KW r5, C18010vc r6) {
        C18070vi.A0w(r4, r5, r3, r6, view);
        this.A05 = r4;
        this.A06 = r5;
        this.A04 = r3;
        this.A07 = r6;
        this.A00 = view;
        this.A02 = AnonymousClass3Ma.A0E(view, 2131433933);
        this.A01 = AnonymousClass3Ma.A0E(view, 2131433935);
        this.A03 = (RoundCornerProgressBarV2) C18070vi.A05(view, 2131433960);
    }
}
