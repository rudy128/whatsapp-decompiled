package X;

import android.view.View;
import com.whatsapp.invites.SMSPreviewInviteBottomSheetFragment;

/* renamed from: X.AcV  reason: case insensitive filesystem */
public final class C20977AcV implements AnonymousClass1O5 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ SMSPreviewInviteBottomSheetFragment A02;
    public final /* synthetic */ AnonymousClass1EC A03;

    public C20977AcV(View view, SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment, AnonymousClass1EC r3, int i) {
        this.A02 = sMSPreviewInviteBottomSheetFragment;
        this.A01 = view;
        this.A03 = r3;
        this.A00 = i;
    }

    public void BrD(String str) {
        SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment = this.A02;
        AnonymousClass1FL A1B = sMSPreviewInviteBottomSheetFragment.A1B();
        if (A1B != null) {
            A1B.runOnUiThread(new C146507Pj(sMSPreviewInviteBottomSheetFragment, this.A01, 26));
        }
    }

    public void Bt9(C29621ca r6, String str) {
        SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment = this.A02;
        AnonymousClass1FL A1B = sMSPreviewInviteBottomSheetFragment.A1B();
        if (A1B != null) {
            A1B.runOnUiThread(new C146507Pj(sMSPreviewInviteBottomSheetFragment, this.A01, 27));
        }
    }

    public void C7Z(C29621ca r8, String str) {
        SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment = this.A02;
        sMSPreviewInviteBottomSheetFragment.A0C = true;
        AnonymousClass1FL A1B = sMSPreviewInviteBottomSheetFragment.A1B();
        if (A1B != null) {
            A1B.runOnUiThread(new C21365Aiu(sMSPreviewInviteBottomSheetFragment, this.A01, this.A03, this.A00, 27));
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
