package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.media.utwonet.UTwoNetViewModel;
import com.whatsapp.media.utwonet.UTwoNetViewModel$process$1;
import com.whatsapp.mediacomposer.StickerComposerFragment;
import com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel;
import com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$processBitmap$1;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.809  reason: invalid class name */
public final class AnonymousClass809 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ StickerComposerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass809(StickerComposerFragment stickerComposerFragment) {
        super(1);
        this.this$0 = stickerComposerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6TS r11 = (AnonymousClass6TS) obj;
        StickerComposerFragment stickerComposerFragment = this.this$0;
        C18070vi.A0b(r11);
        if (r11 instanceof C1195668s) {
            Log.i("StickerComposerFragment/modelProcessing/bitmap success");
            C18100vl r2 = stickerComposerFragment.A05;
            ((StickerComposerViewModel) r2.getValue()).A0T(80);
            StickerComposerViewModel stickerComposerViewModel = (StickerComposerViewModel) r2.getValue();
            Bitmap bitmap = (Bitmap) C29431cG.A0b(((C1195668s) r11).A00);
            AnonymousClass3MX.A1Q(new StickerComposerViewModel$processBitmap$1(bitmap, stickerComposerViewModel, (C30391dr) null), C72453Mb.A12(stickerComposerViewModel, bitmap));
        } else if (C18070vi.A18(r11, C1196168x.A00)) {
            ((StickerComposerViewModel) stickerComposerFragment.A05.getValue()).A0T(50);
            Log.i("StickerComposerFragment/modelProcessing/model loaded success");
            Uri uri = stickerComposerFragment.A01;
            if (uri != null) {
                UTwoNetViewModel uTwoNetViewModel = (UTwoNetViewModel) stickerComposerFragment.A06.getValue();
                int A00 = C18020vd.A00(C18040vf.A02, stickerComposerFragment.A28(), 1576);
                List A0M = C18070vi.A0M("WA_CUTOUT_BITMAP");
                AnonymousClass6RK r5 = AnonymousClass6RK.NORMAL;
                if (uTwoNetViewModel.A00 != null) {
                    AnonymousClass3MW.A1X(uTwoNetViewModel.A08, new UTwoNetViewModel$process$1(uri, uTwoNetViewModel, r5, A0M, (C30391dr) null, 512, A00), C41561wd.A00(uTwoNetViewModel));
                }
            }
        } else {
            C1195868u r1 = C1195868u.A00;
            if (C18070vi.A18(r11, r1)) {
                Log.i("StickerComposerFragment/modelProcessing/Fetching");
                ((StickerComposerViewModel) stickerComposerFragment.A05.getValue()).A0T(10);
            } else if (!C18070vi.A18(r11, r1)) {
                StickerComposerFragment.A00(stickerComposerFragment);
            }
        }
        return C27621Wu.A00;
    }
}
