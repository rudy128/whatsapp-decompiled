package X;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.CompoundButton;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.8Iw  reason: invalid class name and case insensitive filesystem */
public final class C162078Iw extends C42011xT {
    public CountDownTimer A00;
    public final CompoundButton A01;
    public final WaImageView A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final /* synthetic */ C161718Hl A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162078Iw(View view, C161718Hl r4) {
        super(view);
        C18070vi.A0d(view, 2);
        this.A05 = r4;
        this.A01 = (CompoundButton) C18070vi.A05(view, 2131434443);
        this.A03 = AnonymousClass3Ma.A0N(view, 2131434445);
        this.A04 = AnonymousClass3Ma.A0N(view, 2131434444);
        View A06 = AnonymousClass1HF.A06(view, 2131431496);
        C18070vi.A0z(A06, "null cannot be cast to non-null type com.whatsapp.WaImageView");
        this.A02 = (WaImageView) A06;
    }
}
