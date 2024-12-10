package X;

import android.graphics.Bitmap;
import com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.preview.CoinFlipPreviewActivity", f = "CoinFlipPreviewActivity.kt", i = {0}, l = {310}, m = "animateCoinFlip", n = {"this"}, s = {"L$0"})
/* renamed from: X.4uc  reason: invalid class name and case insensitive filesystem */
public final class C100504uc extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CoinFlipPreviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100504uc(CoinFlipPreviewActivity coinFlipPreviewActivity, C30391dr r2) {
        super(r2);
        this.this$0 = coinFlipPreviewActivity;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CoinFlipPreviewActivity.A03((Bitmap) null, (Bitmap) null, this.this$0, this, false);
    }
}
