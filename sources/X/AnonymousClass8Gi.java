package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity;

/* renamed from: X.8Gi  reason: invalid class name */
public class AnonymousClass8Gi extends C24121Iy {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public AnonymousClass8Gi(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = str2;
    }

    public AnonymousClass1J2 BG9(Class cls) {
        Class cls2 = cls;
        if (this.A00 != 0) {
            if (cls2.isAssignableFrom(AnonymousClass8GO.class)) {
                IndiaUpiQrCodeUrlValidationActivity indiaUpiQrCodeUrlValidationActivity = (IndiaUpiQrCodeUrlValidationActivity) this.A01;
                AnonymousClass18O r7 = indiaUpiQrCodeUrlValidationActivity.A06;
                C197929xV r6 = indiaUpiQrCodeUrlValidationActivity.A05;
                AnonymousClass8GO r8 = new AnonymousClass8GO(r7, indiaUpiQrCodeUrlValidationActivity.A00, indiaUpiQrCodeUrlValidationActivity.A02, indiaUpiQrCodeUrlValidationActivity.A04, r6);
                C20337AGt aGt = new C20337AGt(this, 33);
                C41731wy r62 = r8.A00;
                r62.A0A(indiaUpiQrCodeUrlValidationActivity, aGt);
                String str = this.A03;
                String str2 = this.A02;
                if (TextUtils.isEmpty(str)) {
                    C187449fp.A00(r62, 0);
                    return r8;
                }
                r8.A01 = str2;
                AnonymousClass1DT r3 = r8.A03;
                r3.A0F(C20118A8b.A01(str, str2));
                C197929xV r63 = r8.A07;
                C1418477e A0L = AnonymousClass8BT.A0L(AnonymousClass8BR.A0Z(), ((C20118A8b) AnonymousClass8BS.A0W(r3)).A0O);
                C183469Yj r32 = new C183469Yj(r8);
                C188439hQ r72 = r63.A01;
                Context context = r72.A01.A00;
                AnonymousClass1KB r9 = r72.A00;
                AnonymousClass1OZ A0U = C17880vN.A0U(r72.A08);
                C30931ek r1 = r72.A07;
                A7U a7u = r72.A04;
                C31061ex r15 = r72.A05;
                new C175788zH(context, r9, r72.A02, A0U, r72.A03, a7u, AnonymousClass8BR.A0a(r72.A09), r15, r72.A06, r1).A01(A0L, (C1418477e) null, new AXZ(indiaUpiQrCodeUrlValidationActivity, A0L, r63, r32));
                return r8;
            }
            throw AnonymousClass000.A0k("Invalid viewModel");
        } else if (cls2.isAssignableFrom(AnonymousClass8Ft.class)) {
            IndiaUpiQrCodeScannedDialogFragment indiaUpiQrCodeScannedDialogFragment = (IndiaUpiQrCodeScannedDialogFragment) this.A01;
            AnonymousClass118 r92 = indiaUpiQrCodeScannedDialogFragment.A0D;
            C18030ve r82 = indiaUpiQrCodeScannedDialogFragment.A0F;
            AnonymousClass8Ft r10 = new AnonymousClass8Ft(indiaUpiQrCodeScannedDialogFragment.A0B, r92, indiaUpiQrCodeScannedDialogFragment.A0E, r82, indiaUpiQrCodeScannedDialogFragment.A0I, indiaUpiQrCodeScannedDialogFragment.A0J, indiaUpiQrCodeScannedDialogFragment.A0K);
            C20337AGt aGt2 = new C20337AGt(this, 23);
            C20337AGt aGt3 = new C20337AGt(this, 24);
            C20337AGt aGt4 = new C20337AGt(this, 25);
            C20337AGt aGt5 = new C20337AGt(this, 26);
            C20337AGt aGt6 = new C20337AGt(this, 27);
            C20337AGt aGt7 = new C20337AGt(this, 28);
            C20337AGt aGt8 = new C20337AGt(this, 29);
            C20337AGt aGt9 = new C20337AGt(this, 30);
            C20337AGt aGt10 = new C20337AGt(this, 31);
            r10.A02.A0A(indiaUpiQrCodeScannedDialogFragment, aGt2);
            r10.A05.A0A(indiaUpiQrCodeScannedDialogFragment, aGt3);
            r10.A09.A0A(indiaUpiQrCodeScannedDialogFragment, aGt4);
            r10.A08.A0A(indiaUpiQrCodeScannedDialogFragment, aGt5);
            r10.A01.A0A(indiaUpiQrCodeScannedDialogFragment, aGt6);
            r10.A00.A0A(indiaUpiQrCodeScannedDialogFragment, aGt7);
            r10.A03.A0A(indiaUpiQrCodeScannedDialogFragment, aGt8);
            r10.A07.A0A(indiaUpiQrCodeScannedDialogFragment, aGt9);
            r10.A04.A0A(indiaUpiQrCodeScannedDialogFragment, aGt10);
            r10.A0A.A0A(indiaUpiQrCodeScannedDialogFragment, new C20337AGt(this, 32));
            r10.A0T(this.A03, this.A02);
            return r10;
        } else {
            throw AnonymousClass000.A0k("Invalid viewModel");
        }
    }
}
