package X;

import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment;

/* renamed from: X.7An  reason: invalid class name and case insensitive filesystem */
public class C142717An implements C23521Gp {
    public int A00;
    public final /* synthetic */ LinkedAccountMediaViewFragment A01;

    public void Bzw(int i) {
    }

    public void Bzy(int i) {
    }

    public C142717An(LinkedAccountMediaViewFragment linkedAccountMediaViewFragment) {
        this.A01 = linkedAccountMediaViewFragment;
        this.A00 = linkedAccountMediaViewFragment.A03;
    }

    public void Bzx(int i, float f, int i2) {
        if (this.A00 != i) {
            LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = this.A01;
            linkedAccountMediaViewFragment.A01 = i;
            this.A00 = i;
            if (linkedAccountMediaViewFragment.A02 == 0) {
                int i3 = 27;
                if (linkedAccountMediaViewFragment.A00 == 0) {
                    i3 = 26;
                }
                linkedAccountMediaViewFragment.A05.A04(linkedAccountMediaViewFragment.A06, i3);
                return;
            }
            C137966wJ.A00((C137966wJ) linkedAccountMediaViewFragment.A0G.get(), linkedAccountMediaViewFragment.A0E, 3);
        }
    }
}
