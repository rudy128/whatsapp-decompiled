package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.flows.downloadresponse.view.FlowsDownloadResponseBottomSheet;
import com.whatsapp.util.Log;

/* renamed from: X.5SP  reason: invalid class name */
public final class AnonymousClass5SP extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ FlowsDownloadResponseBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SP(FlowsDownloadResponseBottomSheet flowsDownloadResponseBottomSheet) {
        super(1);
        this.this$0 = flowsDownloadResponseBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4EU r8 = (AnonymousClass4EU) obj;
        if (r8 instanceof C81843zu) {
            Fragment A0Q = this.this$0.A1F().A0Q("PROGRESS_LOADING_ACTION");
            if (A0Q != null) {
                ((DialogFragment) A0Q).A29();
            }
            try {
                Context A1n = this.this$0.A1n();
                if (A1n != null) {
                    C59072li r0 = ((C81843zu) r8).A00;
                    A1n.startActivity(Intent.createChooser(r0.A00, r0.A01));
                }
                this.this$0.A29();
            } catch (ActivityNotFoundException e) {
                Log.e("FlowsDownloadResponseBottomSheet/start-activity ", e);
                Toast.makeText(this.this$0.A14(), 2131896261, 0).show();
            }
        } else if (r8 instanceof C81853zv) {
            Fragment A0Q2 = this.this$0.A1F().A0Q("PROGRESS_LOADING_ACTION");
            if (A0Q2 != null) {
                ((DialogFragment) A0Q2).A29();
            }
            Toast.makeText(this.this$0.A14(), 2131896261, 0).show();
        } else if (r8 instanceof C81863zw) {
            FlowsDownloadResponseBottomSheet flowsDownloadResponseBottomSheet = this.this$0;
            String A0n = AnonymousClass3MY.A0n(flowsDownloadResponseBottomSheet, 2131890442);
            ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
            Bundle A0D = C17880vN.A0D();
            A0D.putString("title", (String) null);
            A0D.putString("message", A0n);
            progressDialogFragment.A1R(A0D);
            progressDialogFragment.A2D(false);
            progressDialogFragment.A2C(flowsDownloadResponseBottomSheet.A1F(), "PROGRESS_LOADING_ACTION");
        }
        return C27621Wu.A00;
    }
}
