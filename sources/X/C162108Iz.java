package X;

import android.view.View;
import android.widget.ImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.8Iz  reason: invalid class name and case insensitive filesystem */
public class C162108Iz extends C42011xT {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final WaTextView A03;
    public final C28931bI A04;
    public final C28931bI A05;
    public final C28931bI A06;
    public final WDSButton A07;
    public final WDSButton A08;
    public final /* synthetic */ C161778Hs A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162108Iz(View view, AnonymousClass1L9 r6, C161778Hs r7) {
        super(view);
        this.A09 = r7;
        this.A00 = view;
        this.A02 = (TextEmojiLabel) AnonymousClass3MX.A0C(view, 2131436208);
        this.A06 = C72453Mb.A0s(view, 2131435885);
        this.A05 = C72453Mb.A0s(view, 2131431333);
        ImageView A0B = C108975cc.A0B(view, 2131427946);
        this.A01 = A0B;
        WDSButton wDSButton = (WDSButton) AnonymousClass3MX.A0C(view, 2131427364);
        this.A07 = wDSButton;
        WDSButton wDSButton2 = (WDSButton) AnonymousClass3MX.A0C(view, 2131434468);
        this.A08 = wDSButton2;
        this.A03 = C72453Mb.A0g(view, 2131434612);
        this.A04 = C72453Mb.A0s(view, 2131427655);
        C90014dO.A00(view, r6, this, 39);
        C90014dO.A00(wDSButton, r7, this, 40);
        C90014dO.A00(wDSButton2, r7, this, 41);
        A0B.setImportantForAccessibility(2);
    }
}
