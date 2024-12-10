package X;

import android.view.View;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.781  reason: invalid class name */
public class AnonymousClass781 implements View.OnClickListener {
    public final int A00;

    public AnonymousClass781(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.4Rb, java.lang.Object] */
    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                List list = C42011xT.A0I;
                return;
            case 1:
                List list2 = C42011xT.A0I;
                try {
                    C72453Mb.A1I(VoipErrorDialogFragment.A00(new Object(), 9), (AnonymousClass1FL) AnonymousClass1L9.A01(view.getContext(), AnonymousClass1FL.class));
                    return;
                } catch (IllegalStateException e) {
                    Log.w(C17900vP.A0C("CallInfoButtonViewHolder/showCallIsFullDialog/Context not an activity: ", AnonymousClass000.A10(), e));
                    return;
                }
            case 9:
            case 10:
            case 11:
                HashMap hashMap = MessageReplyActivity.A1v;
                return;
            default:
                return;
        }
    }
}
