package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import com.whatsapp.documentpicker.DocumentPickerActivity;
import com.whatsapp.documentpicker.fragments.SendDocumentsConfirmationDialogFragment;
import java.util.ArrayList;

/* renamed from: X.4az  reason: invalid class name and case insensitive filesystem */
public class C88884az implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public C88884az(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
        this.A04 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        DocumentPickerActivity documentPickerActivity;
        switch (this.A00) {
            case 0:
                C36531o3 r2 = (C36531o3) this.A02;
                boolean z = this.A04;
                AnonymousClass1FL r1 = (AnonymousClass1FL) this.A03;
                ((C107005Ya) this.A01).C31();
                if (z) {
                    str = "newsletter-delete-updates";
                } else {
                    str = "how-to-delete-messages";
                }
                r2.A01(r1, str);
                return;
            case 1:
                CallConfirmationFragment callConfirmationFragment = (CallConfirmationFragment) this.A01;
                boolean z2 = this.A04;
                C72453Mb.A1P(callConfirmationFragment.A05);
                C17900vP.A0M(callConfirmationFragment.A03, "call_confirmation_dialog_count", C17890vO.A00(C17890vO.A0B(callConfirmationFragment.A03), "call_confirmation_dialog_count") + 1);
                CallConfirmationFragment.A00((Activity) this.A02, callConfirmationFragment, (AnonymousClass1E7) this.A03, z2);
                return;
            default:
                SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = (SendDocumentsConfirmationDialogFragment) this.A01;
                ArrayList arrayList = (ArrayList) this.A02;
                AnonymousClass1BI r6 = (AnonymousClass1BI) this.A03;
                boolean z3 = this.A04;
                AnonymousClass1FL A1B = sendDocumentsConfirmationDialogFragment.A1B();
                if (A1B != null) {
                    AnonymousClass1PM r12 = sendDocumentsConfirmationDialogFragment.A01;
                    if (r12 != null) {
                        if (!AnonymousClass747.A04(r12, r6, arrayList.size())) {
                            Intent A0A = C17880vN.A0A();
                            A0A.putExtra("selection_from_gallery_picker", z3);
                            A0A.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                            C72453Mb.A16(A1B, A0A);
                        } else if ((A1B instanceof DocumentPickerActivity) && (documentPickerActivity = (DocumentPickerActivity) A1B) != null) {
                            Object obj = arrayList.get(0);
                            C18070vi.A0X(obj);
                            documentPickerActivity.A4c((Uri) obj);
                        }
                        C88184Yq r0 = sendDocumentsConfirmationDialogFragment.A03;
                        if (r0 != null) {
                            r0.A03(2);
                            return;
                        }
                        str2 = "conversationAttachmentEventLogger";
                    } else {
                        str2 = "verifiedNameManager";
                    }
                    C18070vi.A11(str2);
                    throw null;
                }
                return;
        }
    }
}
