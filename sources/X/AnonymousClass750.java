package X;

import android.content.DialogInterface;
import com.whatsapp.location.StopLiveLocationDialogFragment;
import com.whatsapp.textstatus.AddTextStatusActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.750  reason: invalid class name */
public class AnonymousClass750 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public AnonymousClass750(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            C112015kn r7 = (C112015kn) this.A01;
            String str = this.A02;
            String str2 = this.A03;
            C18070vi.A0d(r7, 0);
            dialogInterface.dismiss();
            List list = r7.A06;
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                C135726sf r1 = (C135726sf) it.next();
                if (C18070vi.A18(r1.A02, str2) && C18070vi.A18(r1.A03, str)) {
                    break;
                }
                i2++;
            }
            list.remove(i2);
            if (list.size() > 0) {
                r7.A0I(i2);
            }
            AddTextStatusActivity addTextStatusActivity = r7.A03.A00;
            List list2 = addTextStatusActivity.A0L;
            list2.remove(i2);
            if (list2.isEmpty()) {
                addTextStatusActivity.findViewById(2131435920).setVisibility(8);
                AnonymousClass3MX.A1H(addTextStatusActivity, 2131435919, 8);
                return;
            }
            return;
        }
        StopLiveLocationDialogFragment stopLiveLocationDialogFragment = (StopLiveLocationDialogFragment) this.A01;
        stopLiveLocationDialogFragment.A01.CGF(new AnonymousClass7Pq(stopLiveLocationDialogFragment, this.A02, this.A03, 11));
    }
}
