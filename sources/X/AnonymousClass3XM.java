package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.calling.callhistory.group.GroupCallLogActivity;
import java.util.List;

/* renamed from: X.3XM  reason: invalid class name */
public class AnonymousClass3XM extends C38391rD {
    public List A00;
    public final /* synthetic */ GroupCallLogActivity A01;

    public AnonymousClass3XM(GroupCallLogActivity groupCallLogActivity) {
        this.A01 = groupCallLogActivity;
    }

    public static void A00(AnonymousClass3XM r3, AnonymousClass1BI r4) {
        int i = 0;
        for (C178109Bv r0 : r3.A00) {
            if (r0.A00.equals(r4)) {
                r3.A01.A02.A0G(i);
                return;
            }
            i++;
        }
    }

    public int A0Q() {
        return this.A00.size();
    }

    public void Bmc(C42011xT r7, int i) {
        AnonymousClass3ZP r72 = (AnonymousClass3ZP) r7;
        AnonymousClass1BI r1 = ((C178109Bv) this.A00.get(i)).A00;
        GroupCallLogActivity groupCallLogActivity = this.A01;
        AnonymousClass1BI A012 = ((AnonymousClass1NG) groupCallLogActivity.A0I.get()).A01(r1);
        if (A012 != null) {
            r1 = A012;
        }
        AnonymousClass1E7 A0H = groupCallLogActivity.A08.A0H(r1);
        C37451pZ r2 = groupCallLogActivity.A0C;
        List list = C42011xT.A0I;
        ImageView imageView = r72.A02;
        r2.A07(imageView, A0H);
        C90084dV.A00(imageView, this, A0H, r72, 24);
        r72.A04.A05(A0H);
        C178119Bw r0 = groupCallLogActivity.A0G;
        if (r0 != null && !r0.A04.A03 && i == 0) {
            TextView textView = r72.A03;
            textView.setVisibility(0);
            textView.setTextColor(AnonymousClass3Ma.A01(textView.getContext(), groupCallLogActivity.getResources(), 2130970340, 2131101312));
            textView.setText(2131890898);
        }
        C825248h.A00(r72.A01, this, A0H, 19);
        C825248h.A00(r72.A00, this, A0H, 20);
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        return new AnonymousClass3ZP(AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625480), this.A01);
    }
}
