package X;

import android.view.View;
import android.widget.RadioButton;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.8Ix  reason: invalid class name and case insensitive filesystem */
public class C162088Ix extends C42011xT {
    public final View A00;
    public final View A01;
    public final RadioButton A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final WaImageView A06;
    public final C28931bI A07;

    public C162088Ix(View view, AnonymousClass11C r6, C18030ve r7) {
        super(view);
        this.A04 = AnonymousClass3MX.A0V(view, 2131433682);
        TextEmojiLabel A0V = AnonymousClass3MX.A0V(view, 2131433672);
        this.A03 = A0V;
        AnonymousClass3Ma.A1K(A0V, r6);
        AnonymousClass3Ma.A1L(r7, A0V);
        this.A06 = AnonymousClass3MW.A0R(view, 2131433611);
        this.A02 = (RadioButton) AnonymousClass1HF.A06(view, 2131433631);
        this.A01 = AnonymousClass1HF.A06(view, 2131433647);
        TextEmojiLabel A0V2 = AnonymousClass3MX.A0V(view, 2131435029);
        this.A05 = A0V2;
        AnonymousClass3Ma.A1K(A0V2, r6);
        AnonymousClass3Ma.A1L(r7, A0V2);
        C28931bI A002 = C28931bI.A00(view, 2131431437);
        this.A07 = A002;
        ((WaTextView) A002.A02()).setAccessibilityHelper(new C39411t2(AnonymousClass3MX.A0M(A002), r6));
        AnonymousClass3Ma.A1L(r7, (TextEmojiLabel) A002.A02());
        this.A00 = AnonymousClass1HF.A06(view, 2131433612);
    }
}
