package X;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;

/* renamed from: X.Dq6  reason: case insensitive filesystem */
public final class C28031Dq6 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C25213Cb9 $typefaceRequest;
    public final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28031Dq6(FontFamilyResolverImpl fontFamilyResolverImpl, C25213Cb9 cb9) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
        this.$typefaceRequest = cb9;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Typeface BHJ;
        C25213Cb9 cb9 = this.$typefaceRequest;
        CIX cix = this.this$0.A01;
        C24693CGf cGf = cb9.A02;
        if (cGf == null || (cGf instanceof BJF)) {
            BHJ = cix.A00.BHJ(cb9.A03, cb9.A00);
        } else if (cGf instanceof BJG) {
            BHJ = cix.A00.BHb(cb9.A03, (BJG) cGf, cb9.A00);
        } else {
            throw AnonymousClass000.A0n("Could not load font");
        }
        return new C26602D5s(BHJ);
    }
}
