package X;

import android.os.Bundle;
import com.whatsapp.dialogs.ProgressDialogFragment;

/* renamed from: X.1Gc  reason: invalid class name and case insensitive filesystem */
public class C23451Gc {
    public static boolean A02;
    public static final String A03 = ProgressDialogFragment.class.getName();
    public ProgressDialogFragment A00;
    public final AnonymousClass1FU A01;

    public void A00(int i, int i2) {
        if (this.A00 == null) {
            ProgressDialogFragment A002 = ProgressDialogFragment.A00(i, i2);
            this.A00 = A002;
            A002.A2C(this.A01.A03.A00.A03, A03);
        }
        A02 = true;
    }

    public void A01(String str, String str2) {
        if (this.A00 == null) {
            ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("message", str2);
            progressDialogFragment.A1R(bundle);
            this.A00 = progressDialogFragment;
            progressDialogFragment.A2C(this.A01.A03.A00.A03, A03);
        }
        A02 = true;
    }

    public C23451Gc(AnonymousClass1FU r1) {
        this.A01 = r1;
    }
}
