package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.BaseBundle;
import com.whatsapp.backup.google.SingleChoiceListDialogFragment;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;

/* renamed from: X.4ax  reason: invalid class name and case insensitive filesystem */
public class C88864ax implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C88864ax(Object obj, int i, int i2, Object obj2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A01 = i;
        this.A03 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                C1404271j r2 = (C1404271j) this.A02;
                C1404271j.A00(r2, 1, 1, (long) this.A01, r2.A00.A00().getTime());
                AnonymousClass4Yv.A00((Activity) this.A03, 115);
                return;
            case 1:
                SingleChoiceListDialogFragment singleChoiceListDialogFragment = (SingleChoiceListDialogFragment) this.A02;
                singleChoiceListDialogFragment.A01.C5j(((BaseBundle) this.A03).getStringArray("items"), this.A01, i);
                singleChoiceListDialogFragment.A02.set(true);
                break;
            case 2:
                C75403hR r6 = (C75403hR) this.A02;
                AnonymousClass1E7 r5 = (AnonymousClass1E7) this.A03;
                int i2 = this.A01;
                C37551pj r3 = r6.A06;
                AnonymousClass01E r22 = r6.A02;
                C17960vV.A07(r5);
                r3.A0H(r22, r5, "chat", false);
                AnonymousClass4Yv.A00(r22, i2);
                A74.A01((A74) r6.A0E.get(), AnonymousClass1E7.A00(r5), C17880vN.A0k(), (Integer) null, 2);
                return;
            default:
                AnonymousClass4VP r7 = (AnonymousClass4VP) this.A02;
                AnonymousClass1E2 r62 = (AnonymousClass1E2) this.A03;
                int i3 = this.A01;
                C18070vi.A0d(dialogInterface, 3);
                if (!r7.A02.A0P(r62)) {
                    RequestPhoneNumberViewModel requestPhoneNumberViewModel = r7.A05;
                    requestPhoneNumberViewModel.A05.CGF(new C70863Cu(requestPhoneNumberViewModel, i3, 31, r62));
                    break;
                } else {
                    C92934iA r52 = new C92934iA(new AnonymousClass4i8(r62, r7, i3), r62, r7, 2);
                    AnonymousClass1E7 A0H = r7.A03.A0H(r62);
                    AnonymousClass1FY r4 = r7.A01;
                    r4.CMl(C87374Vi.A01(r52, C17880vN.A0q(r4, r7.A04.A0I(A0H), AnonymousClass3MW.A1a(), 0, 2131894667), 0, false));
                    return;
                }
        }
        dialogInterface.dismiss();
    }
}
