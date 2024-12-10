package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.status.StatusesFragment;
import java.util.List;

/* renamed from: X.7M4  reason: invalid class name */
public class AnonymousClass7M4 implements C1603187z {
    public final long A00;
    public final /* synthetic */ StatusesFragment A01;

    public View BbX(Context context, View view, ViewGroup viewGroup, C37451pZ r15, List list, List list2, List list3, List list4, boolean z) {
        int i;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(2131625859, viewGroup, false);
            view.setImportantForAccessibility(1);
        }
        TextView A0C = C108975cc.A0C(view);
        C43421zm.A04(A0C);
        long j = this.A00;
        if (j == 0) {
            i = 2131894946;
        } else if (j == 1) {
            i = 2131897968;
        } else {
            if (j != 2) {
                C17900vP.A0l("statusesFragment/invalid id: ", AnonymousClass000.A10(), j);
            }
            i = 2131899251;
        }
        A0C.setText(i);
        ImageView A0H = AnonymousClass3MW.A0H(view, 2131435621);
        A0H.setImportantForAccessibility(2);
        StatusesFragment statusesFragment = this.A01;
        if (!statusesFragment.A1H || j != 2 || statusesFragment.A1F) {
            A0H.setVisibility(4);
            AnonymousClass1HF.A0f(view, (AnonymousClass1XU) null);
            view.setOnClickListener((View.OnClickListener) null);
            view.setClickable(false);
        } else {
            A0H.setVisibility(0);
            int i2 = 2131886247;
            if (statusesFragment.A1E) {
                i2 = 2131886290;
            }
            AnonymousClass1Y5.A02(view, i2);
            boolean z2 = statusesFragment.A1E;
            Resources A09 = AnonymousClass3MZ.A09(statusesFragment);
            int i3 = 2131232031;
            if (z2) {
                i3 = 2131232029;
            }
            A0H.setImageDrawable(A09.getDrawable(i3));
            view.setClickable(true);
            AnonymousClass3MZ.A1P(view, this, A0H, 26);
        }
        AnonymousClass1Y5.A0A(view, true);
        return view;
    }

    public AnonymousClass7M4(StatusesFragment statusesFragment, long j) {
        this.A01 = statusesFragment;
        this.A00 = j;
    }
}
