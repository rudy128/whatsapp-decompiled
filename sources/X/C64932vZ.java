package X;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: X.2vZ  reason: invalid class name and case insensitive filesystem */
public class C64932vZ implements C33981jh {
    public final int A00;
    public final int A01;
    public final String A02;
    public final /* synthetic */ AnonymousClass1GP A03;

    public C64932vZ(AnonymousClass1GP r1, String str, int i, int i2) {
        this.A03 = r1;
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean BLr(ArrayList arrayList, ArrayList arrayList2) {
        AnonymousClass1GP r2 = this.A03;
        Fragment fragment = r2.A07;
        if (fragment != null && this.A01 < 0 && this.A02 == null && AnonymousClass1GP.A0J(fragment.A1E(), (String) null)) {
            return false;
        }
        return r2.A15(this.A02, arrayList, arrayList2, this.A01, this.A00);
    }
}
