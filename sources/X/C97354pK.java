package X;

import com.whatsapp.profile.coinflip.edit.CoinFlipEditBottomSheetViewModel;

/* renamed from: X.4pK  reason: invalid class name and case insensitive filesystem */
public final class C97354pK implements AnonymousClass89J {
    public final /* synthetic */ CoinFlipEditBottomSheetViewModel A00;

    public C97354pK(CoinFlipEditBottomSheetViewModel coinFlipEditBottomSheetViewModel) {
        this.A00 = coinFlipEditBottomSheetViewModel;
    }

    public void onSuccess() {
        this.A00.A02.A0F(AnonymousClass45n.A00);
    }

    public void onFailure(Exception exc) {
        StringBuilder A0K = C18070vi.A0K(exc);
        A0K.append("onAvatarDeleteClicked/onFailure ");
        A0K.append(exc);
        C17890vO.A1A(A0K, ".message");
        this.A00.A02.A0F(AnonymousClass45o.A00);
    }
}
