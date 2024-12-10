package X;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.areffects.tray.ArEffectsTrayFragment;
import com.whatsapp.collections.centeredrecyclerview.CenteredSelectionRecyclerView;
import java.util.Set;

/* renamed from: X.4t3  reason: invalid class name and case insensitive filesystem */
public final class C99554t3 implements AnonymousClass1G2 {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ AnonymousClass3WK A02;
    public final /* synthetic */ ArEffectsTrayFragment A03;
    public final /* synthetic */ AnonymousClass4VF A04;
    public final /* synthetic */ CenteredSelectionRecyclerView A05;

    public C99554t3(FrameLayout frameLayout, TextView textView, AnonymousClass3WK r3, ArEffectsTrayFragment arEffectsTrayFragment, AnonymousClass4VF r5, CenteredSelectionRecyclerView centeredSelectionRecyclerView) {
        this.A03 = arEffectsTrayFragment;
        this.A02 = r3;
        this.A05 = centeredSelectionRecyclerView;
        this.A01 = textView;
        this.A00 = frameLayout;
        this.A04 = r5;
    }

    public /* bridge */ /* synthetic */ Object BJt(Object obj, C30391dr r11) {
        C86764Sy r10 = (C86764Sy) obj;
        ArEffectsTrayFragment arEffectsTrayFragment = this.A03;
        AnonymousClass3WK r6 = this.A02;
        CenteredSelectionRecyclerView centeredSelectionRecyclerView = this.A05;
        TextView textView = this.A01;
        FrameLayout frameLayout = this.A00;
        boolean z = this.A04.A09;
        Set set = r6.A05;
        C106535Wf r5 = r10.A00;
        if (set.contains(r5)) {
            int i = 0;
            if (z && (r5 instanceof C92434hI)) {
                i = 4;
            }
            frameLayout.setVisibility(i);
            String A002 = C83464Ff.A00(AnonymousClass3MY.A04(textView), r5);
            CharSequence text = textView.getText();
            if (text == null || text.length() == 0) {
                C1420577z.A00(textView, new C21459AkQ(textView, textView, A002, 17));
            } else {
                textView.setText(A002);
            }
            if (r10.A01) {
                int indexOf = r6.A00.A02.indexOf(r5);
                arEffectsTrayFragment.A04.getValue();
                centeredSelectionRecyclerView.A0f(indexOf);
            }
        }
        return C27621Wu.A00;
    }
}
