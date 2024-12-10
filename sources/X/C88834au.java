package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.account.delete.DeleteAccountFeedback;

/* renamed from: X.4au  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C88834au implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DeleteAccountFeedback.ChangeNumberMessageDialogFragment A01;
    public final /* synthetic */ String A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment = this.A01;
        int i2 = this.A00;
        String str = this.A02;
        AnonymousClass1FL A1B = changeNumberMessageDialogFragment.A1B();
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(A1B.getPackageName(), "com.whatsapp.account.delete.DeleteAccountConfirmation");
        A0A.putExtra("deleteReason", i2);
        A0A.putExtra("additionalComments", str);
        changeNumberMessageDialogFragment.A1k(A0A);
    }

    public /* synthetic */ C88834au(DeleteAccountFeedback.ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment, String str, int i) {
        this.A01 = changeNumberMessageDialogFragment;
        this.A00 = i;
        this.A02 = str;
    }
}
