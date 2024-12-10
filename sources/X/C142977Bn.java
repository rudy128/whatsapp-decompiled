package X;

import android.content.Intent;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.7Bn  reason: invalid class name and case insensitive filesystem */
public class C142977Bn implements AnonymousClass1FR {
    public final C166678dR A00;

    public static C003401n A00(ContactPickerFragment contactPickerFragment) {
        return contactPickerFragment.A0r.A00.getSupportActionBar();
    }

    public void A01(Intent intent) {
        if (this instanceof C116575y5) {
            ((C116575y5) this).A00 = intent;
        } else {
            this.A00.setResult(-1, intent);
        }
    }

    public boolean Bed() {
        return this.A00.Bed();
    }

    public void BhQ(int i) {
        this.A00.BhQ(i);
    }

    public void BhR(String str) {
        this.A00.BhR(str);
    }

    public void BhS(String str, String str2) {
        this.A00.BhS(str, str2);
    }

    public void BhT(C72033Kj r7, Object[] objArr, int i, int i2, int i3) {
        this.A00.BhT(r7, objArr, i, i2, i3);
    }

    public void BhU(Object[] objArr, int i, int i2) {
        this.A00.BhU(objArr, i, i2);
    }

    public void CEx() {
        this.A00.CEx();
    }

    public void CMk(DialogFragment dialogFragment, String str) {
        this.A00.CMk(dialogFragment, str);
    }

    public void CMl(DialogFragment dialogFragment) {
        this.A00.CMl(dialogFragment);
    }

    public void CMm(DialogFragment dialogFragment, String str) {
        this.A00.CMm(dialogFragment, "BrazilPaymentIncomeCollectionBottomSheet");
    }

    public void CNB(int i, int i2) {
        this.A00.CNB(i, i2);
    }

    public void CRG(String str) {
        this.A00.CRG(str);
    }

    public C142977Bn(C166678dR r1) {
        this.A00 = r1;
    }
}
