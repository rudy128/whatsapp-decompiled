package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.profile.coinflip.edit.CoinFlipEditPhotoTabFragment;
import com.whatsapp.profile.coinflip.edit.CoinFlipEditPhotoTabFragment$launchCamera$1;

/* renamed from: X.5Ty  reason: invalid class name and case insensitive filesystem */
public final class C105945Ty extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CoinFlipEditPhotoTabFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105945Ty(CoinFlipEditPhotoTabFragment coinFlipEditPhotoTabFragment) {
        super(1);
        this.this$0 = coinFlipEditPhotoTabFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        CoinFlipEditPhotoTabFragment coinFlipEditPhotoTabFragment;
        Intent A0A;
        C18070vi.A0d(obj, 0);
        if (obj.equals(C823545s.A00)) {
            CoinFlipEditPhotoTabFragment coinFlipEditPhotoTabFragment2 = this.this$0;
            AnonymousClass3MX.A1Q(new CoinFlipEditPhotoTabFragment$launchCamera$1(coinFlipEditPhotoTabFragment2, (C30391dr) null), AnonymousClass2SS.A00(coinFlipEditPhotoTabFragment2));
        } else {
            if (obj.equals(C823645t.A00)) {
                coinFlipEditPhotoTabFragment = this.this$0;
                AnonymousClass11S r0 = coinFlipEditPhotoTabFragment.A01;
                if (r0 != null) {
                    r0.A0I();
                    AnonymousClass1E8 r02 = r0.A0D;
                    if (r02 != null) {
                        boolean A0F = r02.A0F();
                        if (coinFlipEditPhotoTabFragment.A02 != null) {
                            AnonymousClass1FL A1D = coinFlipEditPhotoTabFragment.A1D();
                            int i = 9;
                            if (A0F) {
                                i = 8;
                            }
                            A0A = AnonymousClass1LU.A0E(A1D, i).putExtra("should_return_photo_source", false).putExtra("photo_type", 0).putExtra("photo_update_surface_type", 0);
                            C18070vi.A0X(A0A);
                        }
                        str = "waIntents";
                        C18070vi.A11(str);
                        throw null;
                    }
                } else {
                    str = "meManager";
                    C18070vi.A11(str);
                    throw null;
                }
            } else if (obj.equals(C823745u.A00)) {
                coinFlipEditPhotoTabFragment = this.this$0;
                if (coinFlipEditPhotoTabFragment.A02 != null) {
                    AnonymousClass1FL A1D2 = coinFlipEditPhotoTabFragment.A1D();
                    A0A = C17880vN.A0A();
                    A0A.setClassName(A1D2.getPackageName(), "com.whatsapp.profile.ResetPhoto");
                    A0A.putExtra("photo_type", 0);
                }
                str = "waIntents";
                C18070vi.A11(str);
                throw null;
            }
            coinFlipEditPhotoTabFragment.A1D().startActivityForResult(A0A, 12, (Bundle) null);
            DialogFragment dialogFragment = coinFlipEditPhotoTabFragment.A00;
            if (dialogFragment != null) {
                dialogFragment.A28();
            }
        }
        return C27621Wu.A00;
    }
}
