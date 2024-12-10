package X;

import com.google.android.material.chip.Chip;

/* renamed from: X.8ky  reason: invalid class name and case insensitive filesystem */
public class C169398ky extends C169408kz {
    public final C18000vb A00;

    public void A0B(C180589Nd r5) {
        Chip chip = this.A00;
        chip.setChipIconResource(2131232057);
        chip.setChipIconVisible(true);
        super.A0B(r5);
        int i = 2131887032;
        int i2 = 2131887032;
        if (A78.A03(this.A00.A0N())) {
            i = 2131887031;
            i2 = 2131887031;
        }
        chip.setText(i);
        AnonymousClass3MY.A0w(chip.getContext(), chip, i2);
        C89994dM.A00(chip, this, r5, 6);
    }

    public C169398ky(Chip chip, C22553BCk bCk, C18000vb r3) {
        super(chip, bCk);
        this.A00 = r3;
    }
}
