package X;

import android.widget.PopupWindow;
import com.whatsapp.reactions.ReactionsTrayViewModel;

/* renamed from: X.4en  reason: invalid class name and case insensitive filesystem */
public class C90884en implements PopupWindow.OnDismissListener {
    public final int A00;
    public final Object A01;

    public C90884en(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onDismiss() {
        C18090vk r0;
        AnonymousClass3V4 r1;
        ReactionsTrayViewModel reactionsTrayViewModel;
        switch (this.A00) {
            case 0:
                r0 = ((AnonymousClass4RO) this.A01).A03;
                if (r0 == null) {
                    return;
                }
                break;
            case 1:
                r0 = (C18090vk) this.A01;
                break;
            case 2:
                AnonymousClass4RQ r2 = (AnonymousClass4RQ) this.A01;
                AnonymousClass4N8 r02 = (AnonymousClass4N8) r2.A09.getValue();
                r02.A01.removeView(AnonymousClass3MW.A0A(r02.A02));
                AnonymousClass4LC r03 = r2.A01;
                if (r03 != null && (r1 = r03.A00.A04) != null) {
                    r1.A0Y(false);
                    return;
                }
                return;
            default:
                C94604kt r22 = (C94604kt) this.A01;
                C74873d3 BRC = r22.A0J.BRC((Integer) null);
                if (r22.A0J.Bg6() && BRC != null && !BRC.A02 && (reactionsTrayViewModel = r22.A0p) != null) {
                    reactionsTrayViewModel.A0T(0);
                    return;
                }
                return;
        }
        r0.invoke();
    }
}
