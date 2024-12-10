package X;

import android.graphics.Bitmap;
import com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet", f = "CoinFlipNUXBottomSheet.kt", i = {0}, l = {158}, m = "animateCoinFlip", n = {"this"}, s = {"L$0"})
/* renamed from: X.4ub  reason: invalid class name and case insensitive filesystem */
public final class C100494ub extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CoinFlipNUXBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100494ub(CoinFlipNUXBottomSheet coinFlipNUXBottomSheet, C30391dr r2) {
        super(r2);
        this.this$0 = coinFlipNUXBottomSheet;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CoinFlipNUXBottomSheet.A00((Bitmap) null, (Bitmap) null, this.this$0, this);
    }
}
