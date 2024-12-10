package X;

import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import java.util.List;

/* renamed from: X.7MX  reason: invalid class name */
public final class AnonymousClass7MX implements AnonymousClass88B, AnonymousClass87C {
    public C117015z4 A00;
    public AnonymousClass87C A01;
    public C23221Fe A02;
    public PickerSearchDialogFragment A03;
    public AnonymousClass88B A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public AnonymousClass1BI A08;
    public final AnonymousClass722 A09;

    public final void A02(PickerSearchDialogFragment pickerSearchDialogFragment) {
        AnonymousClass722 r0;
        C18070vi.A0d(pickerSearchDialogFragment, 0);
        this.A06 = true;
        this.A03 = pickerSearchDialogFragment;
        pickerSearchDialogFragment.A00 = this;
        if ((pickerSearchDialogFragment instanceof StickerSearchDialogFragment) && (r0 = this.A09) != null) {
            r0.A00 = this;
        }
    }

    public void BvG(AnonymousClass77J r2, boolean z) {
        C18070vi.A0d(r2, 0);
        AnonymousClass87C r0 = this.A01;
        if (r0 != null) {
            r0.BvG(r2, z);
        }
    }

    public final void A00() {
        C117015z4 r1 = this.A00;
        if (r1 != null) {
            r1.A02 = null;
        }
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
    }

    public void A03(List list) {
        this.A05 = list;
        PickerSearchDialogFragment pickerSearchDialogFragment = this.A03;
        if (pickerSearchDialogFragment instanceof StickerSearchDialogFragment) {
            C18070vi.A0z(pickerSearchDialogFragment, "null cannot be cast to non-null type com.whatsapp.picker.search.StickerSearchDialogFragment");
            ((StickerSearchDialogFragment) pickerSearchDialogFragment).A2H().A01.A0F(list);
        }
    }

    public final void A04(boolean z) {
        this.A07 = z;
        PickerSearchDialogFragment pickerSearchDialogFragment = this.A03;
        if (pickerSearchDialogFragment != null) {
            pickerSearchDialogFragment.A28();
        }
    }

    public void C6w(AnonymousClass1BI r3, C1418377d r4, Integer num, int i) {
        AnonymousClass88B r1 = this.A04;
        if (r1 != null) {
            AnonymousClass1BI r0 = this.A08;
            if (r0 != null) {
                r3 = r0;
            }
            r1.C6w(r3, r4, num, i);
        }
    }

    public AnonymousClass7MX(AnonymousClass722 r1) {
        this.A09 = r1;
    }

    public final void A01(C117015z4 r1, AnonymousClass1BI r2, C23221Fe r3) {
        C18070vi.A0h(r3, r1);
        this.A08 = r2;
        this.A02 = r3;
        this.A00 = r1;
        r1.A02 = this;
    }
}
