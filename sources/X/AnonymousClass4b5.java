package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.invites.PromptSendGroupInviteDialogFragment;
import java.util.ArrayList;

/* renamed from: X.4b5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4b5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Intent A02;
    public final /* synthetic */ PromptSendGroupInviteDialogFragment A03;
    public final /* synthetic */ AnonymousClass1EC A04;
    public final /* synthetic */ ArrayList A05;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass1FL A1B;
        AnonymousClass1FL A1B2;
        PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment = this.A03;
        Intent intent = this.A02;
        int i2 = this.A00;
        AnonymousClass1EC r4 = this.A04;
        ArrayList arrayList = this.A05;
        int i3 = this.A01;
        if (i != -2) {
            if (i == -1 && (A1B2 = promptSendGroupInviteDialogFragment.A1B()) != null && !A1B2.isFinishing()) {
                promptSendGroupInviteDialogFragment.A1B().startActivityForResult(intent, i2);
            }
        } else if (r4 != null && arrayList != null && !arrayList.isEmpty() && (A1B = promptSendGroupInviteDialogFragment.A1B()) != null && !A1B.isFinishing()) {
            AnonymousClass1FL A1B3 = promptSendGroupInviteDialogFragment.A1B();
            A1B3.startActivity(AnonymousClass1LU.A0q(A1B3, r4, arrayList, i3, false));
        }
    }

    public /* synthetic */ AnonymousClass4b5(Intent intent, PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment, AnonymousClass1EC r3, ArrayList arrayList, int i, int i2) {
        this.A03 = promptSendGroupInviteDialogFragment;
        this.A02 = intent;
        this.A00 = i;
        this.A04 = r3;
        this.A05 = arrayList;
        this.A01 = i2;
    }
}
