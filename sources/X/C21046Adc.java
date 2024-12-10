package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeBottomSheetFragment;
import com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeFullScreenFragment;
import java.util.List;

/* renamed from: X.Adc  reason: case insensitive filesystem */
public class C21046Adc implements B9Q {
    public final int A00;
    public final Object A01;

    public C21046Adc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BwC(int i) {
        C161718Hl r4;
        if (this.A00 != 0) {
            RequestServerDrivenOtpCodeFullScreenFragment requestServerDrivenOtpCodeFullScreenFragment = (RequestServerDrivenOtpCodeFullScreenFragment) this.A01;
            RecyclerView recyclerView = requestServerDrivenOtpCodeFullScreenFragment.A04;
            C38391rD r42 = null;
            if (recyclerView != null) {
                r42 = recyclerView.A0B;
            }
            C18070vi.A0z(r42, "null cannot be cast to non-null type com.whatsapp.registration.verifyphone.RegMethodsAdapter");
            r4 = (C161718Hl) r42;
            if (r4.A00 != i && i != -1) {
                A8V a8v = requestServerDrivenOtpCodeFullScreenFragment.A0A;
                if (a8v != null) {
                    a8v.A0A(new C197939xW((List) null, ((C195499tR) requestServerDrivenOtpCodeFullScreenFragment.A0K.get(i)).A02), "tapped_fallback_option", requestServerDrivenOtpCodeFullScreenFragment.A0M);
                }
                C18070vi.A11("funnelLogger");
                throw null;
            }
            return;
        }
        RequestServerDrivenOtpCodeBottomSheetFragment requestServerDrivenOtpCodeBottomSheetFragment = (RequestServerDrivenOtpCodeBottomSheetFragment) this.A01;
        RecyclerView recyclerView2 = requestServerDrivenOtpCodeBottomSheetFragment.A03;
        C38391rD r43 = null;
        if (recyclerView2 != null) {
            r43 = recyclerView2.A0B;
        }
        C18070vi.A0z(r43, "null cannot be cast to non-null type com.whatsapp.registration.verifyphone.RegMethodsAdapter");
        r4 = (C161718Hl) r43;
        if (r4.A00 != i && i != -1) {
            A8V a8v2 = requestServerDrivenOtpCodeBottomSheetFragment.A08;
            if (a8v2 != null) {
                a8v2.A0A(new C197939xW((List) null, ((C195499tR) requestServerDrivenOtpCodeBottomSheetFragment.A0H.get(i)).A02), "tapped_fallback_option", false);
            }
            C18070vi.A11("funnelLogger");
            throw null;
        }
        return;
        r4.A00 = i;
        r4.notifyDataSetChanged();
    }
}
