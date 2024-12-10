package X;

import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import com.whatsapp.bot.metaai.imagineme.ImagineMeRetakePhotoNuxBottomSheet;

/* renamed from: X.7y6  reason: invalid class name */
public final class AnonymousClass7y6 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AiImagineBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7y6(AiImagineBottomSheet aiImagineBottomSheet) {
        super(1);
        this.this$0 = aiImagineBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AiImagineBottomSheet aiImagineBottomSheet = this.this$0;
        AnonymousClass1FL A1B = aiImagineBottomSheet.A1B();
        if (A1B != null) {
            ImagineMeRetakePhotoNuxBottomSheet imagineMeRetakePhotoNuxBottomSheet = new ImagineMeRetakePhotoNuxBottomSheet();
            imagineMeRetakePhotoNuxBottomSheet.A02 = new C148617hj(aiImagineBottomSheet);
            C20098A7b.A04(imagineMeRetakePhotoNuxBottomSheet, A1B.getSupportFragmentManager(), "ImagineMeRetakePhotoNuxBottomSheet");
        }
        return C27621Wu.A00;
    }
}
