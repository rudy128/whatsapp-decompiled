package X;

import com.whatsapp.profile.CapturePhoto;
import com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheetLauncher;
import com.whatsapp.stickers.thirdpartystickers.AddThirdPartyStickerPackActivity;
import com.whatsapp.support.Remove;

public class AGE implements AnonymousClass01Q {
    public final int A00;
    public final Object A01;

    public AGE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass01C r1, int i) {
        r1.A2L(new AGE(r1, i));
    }

    public void Bq7() {
        switch (this.A00) {
            case 15:
                ((C161468Ek) this.A01).A2n();
                return;
            case 16:
                CapturePhoto capturePhoto = (CapturePhoto) this.A01;
                if (!capturePhoto.A05) {
                    capturePhoto.A05 = true;
                    AnonymousClass10E r1 = ((AnonymousClass1K1) ((C006602x) capturePhoto.A2m().generatedComponent())).AAQ;
                    capturePhoto.A00 = AnonymousClass10E.A12(r1);
                    capturePhoto.A01 = AnonymousClass3Ma.A0b(r1);
                    capturePhoto.A02 = AnonymousClass10E.A8r(r1);
                    capturePhoto.A03 = (AnonymousClass1CM) r1.A9V.get();
                    return;
                }
                return;
            case 18:
                CoinFlipNUXBottomSheetLauncher coinFlipNUXBottomSheetLauncher = (CoinFlipNUXBottomSheetLauncher) this.A01;
                if (!coinFlipNUXBottomSheetLauncher.A02) {
                    coinFlipNUXBottomSheetLauncher.A02 = true;
                    coinFlipNUXBottomSheetLauncher.A00 = AnonymousClass1K1.A1a((AnonymousClass1K1) ((C006602x) coinFlipNUXBottomSheetLauncher.A2m().generatedComponent()));
                    return;
                }
                return;
            case 37:
                AddThirdPartyStickerPackActivity addThirdPartyStickerPackActivity = (AddThirdPartyStickerPackActivity) this.A01;
                if (!addThirdPartyStickerPackActivity.A04) {
                    addThirdPartyStickerPackActivity.A04 = true;
                    AnonymousClass1K1 r2 = (AnonymousClass1K1) ((C006602x) addThirdPartyStickerPackActivity.A2m().generatedComponent());
                    AnonymousClass10E r12 = r2.AAQ;
                    addThirdPartyStickerPackActivity.A02 = AnonymousClass10E.AL1(r12);
                    addThirdPartyStickerPackActivity.A00 = AnonymousClass3Ma.A0g(r12);
                    addThirdPartyStickerPackActivity.A01 = AnonymousClass1K1.A1w(r2);
                    return;
                }
                return;
            case 38:
                Remove remove = (Remove) this.A01;
                if (!remove.A01) {
                    remove.A01 = true;
                    remove.generatedComponent();
                    return;
                }
                return;
            default:
                ((AnonymousClass1FN) this.A01).A2y();
                return;
        }
    }
}
