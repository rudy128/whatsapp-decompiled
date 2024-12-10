package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.profile.coinflip.edit.CoinFlipEditAvatarTabFragment;
import com.whatsapp.profile.coinflip.edit.CoinFlipEditPhotoTabFragment;

/* renamed from: X.3Zy  reason: invalid class name and case insensitive filesystem */
public final class C74433Zy extends BLs {
    public final DialogFragment A00;

    public int A0Q() {
        return 2;
    }

    public Fragment A0U(int i) {
        if (i == 0) {
            CoinFlipEditPhotoTabFragment coinFlipEditPhotoTabFragment = new CoinFlipEditPhotoTabFragment();
            DialogFragment dialogFragment = this.A00;
            C18070vi.A0d(dialogFragment, 0);
            coinFlipEditPhotoTabFragment.A00 = dialogFragment;
            return coinFlipEditPhotoTabFragment;
        } else if (i == 1) {
            CoinFlipEditAvatarTabFragment coinFlipEditAvatarTabFragment = new CoinFlipEditAvatarTabFragment();
            DialogFragment dialogFragment2 = this.A00;
            C18070vi.A0d(dialogFragment2, 0);
            coinFlipEditAvatarTabFragment.A00 = dialogFragment2;
            return coinFlipEditAvatarTabFragment;
        } else {
            throw AnonymousClass001.A13("Invalid item position: ", AnonymousClass000.A10(), i);
        }
    }

    public C74433Zy(DialogFragment dialogFragment) {
        super(dialogFragment.A1D());
        this.A00 = dialogFragment;
    }
}
