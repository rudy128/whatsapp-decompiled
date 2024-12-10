package X;

import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel;
import java.util.Set;

/* renamed from: X.38g  reason: invalid class name and case insensitive filesystem */
public class C697138g implements AnonymousClass887 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C697138g(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void Bqt(String str) {
        switch (this.A00) {
            case 2:
                ((StarOrRemoveFromRecentsStickerDialogFragment) this.A01).A00.A0R((Set) this.A02);
                return;
            case 3:
                ((StickerInfoViewModel) this.A02).A05.A0R((Set) this.A01);
                return;
            default:
                C676530i r1 = (C676530i) this.A01;
                if (!((C441322g) this.A02).A1H()) {
                    C26811To r2 = r1.A02;
                    if (((C58862lN) r2.A0a.get()).A00("removeRecentSticker") != null && r2.A0T()) {
                        AnonymousClass1S3 r22 = r2.A0K;
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("[\"removeRecentSticker\",\"");
                        A10.append(str);
                        r22.A06(AnonymousClass000.A0y("\"]", A10));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
