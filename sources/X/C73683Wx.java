package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.3Wx  reason: invalid class name and case insensitive filesystem */
public class C73683Wx extends C38391rD {
    public int A00;
    public List A01;
    public final /* synthetic */ AnonymousClass4SZ A02;

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        List list = C42011xT.A0I;
        LayoutInflater layoutInflater = this.A02.A02;
        if (i != 0) {
            return new C74013Ye(layoutInflater.inflate(2131623970, viewGroup, false));
        }
        return new AnonymousClass3Z0(layoutInflater.inflate(2131623969, viewGroup, false));
    }

    public C73683Wx(AnonymousClass4SZ r1) {
        this.A02 = r1;
    }

    public int A0Q() {
        int A0C = C72463Mc.A0C(this.A01);
        List list = this.A01;
        int i = this.A00;
        if (list != null) {
            i -= list.size();
        }
        if (i <= 0 || A0C <= 0) {
            return A0C;
        }
        return A0C + 1;
    }

    public int getItemViewType(int i) {
        List list = this.A01;
        int i2 = this.A00;
        if (list != null) {
            i2 -= list.size();
        }
        if (i2 <= 0 || i != this.A01.size()) {
            return 0;
        }
        return 1;
    }

    public void Bmc(C42011xT r9, int i) {
        Context context;
        int i2;
        int i3;
        String A0W;
        if (getItemViewType(i) != 0) {
            List list = C42011xT.A0I;
            TextView textView = ((C74013Ye) r9).A00;
            Context context2 = this.A02.A01;
            Object[] objArr = new Object[1];
            List list2 = this.A01;
            int i4 = this.A00;
            if (list2 != null) {
                i4 -= list2.size();
            }
            C17880vN.A1T(objArr, i4, 0);
            AnonymousClass3MY.A0y(context2, textView, objArr, 2131886534);
            return;
        }
        AnonymousClass3Z0 r92 = (AnonymousClass3Z0) r9;
        AnonymousClass1E7 r6 = (AnonymousClass1E7) this.A01.get(i);
        AnonymousClass4SZ r4 = this.A02;
        List list3 = C42011xT.A0I;
        TextView textView2 = r92.A01;
        if (!AnonymousClass3MZ.A1X(r6)) {
            A0W = r6.A0K();
        } else if (r6.A0O()) {
            A0W = r4.A08.A0W(r6, false);
        } else {
            String A0F = r4.A0B.A0F(AnonymousClass1E7.A00(r6));
            if (!TextUtils.isEmpty(A0F)) {
                textView2.setSingleLine(false);
            } else if (!TextUtils.isEmpty(r6.A0c)) {
                A0F = AnonymousClass3MX.A17(r4.A08, r6);
                textView2.setSingleLine(false);
                context = r4.A01;
                i2 = 2130971113;
                i3 = 2131102439;
                C72463Mc.A0y(context, textView2, i2, i3);
                textView2.setText(A0F);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                r4.A09.A0C(r92.A00, r6, false);
            } else {
                A0F = r4.A0A.A0G(AnonymousClass17K.A02(r6));
                textView2.setSingleLine(true);
            }
            context = r4.A01;
            i2 = 2130970831;
            i3 = 2131102246;
            C72463Mc.A0y(context, textView2, i2, i3);
            textView2.setText(A0F);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            r4.A09.A0C(r92.A00, r6, false);
        }
        textView2.setText(A0W);
        textView2.setSingleLine(false);
        C72463Mc.A0y(r4.A01, textView2, 2130970831, 2131102246);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        r4.A09.A0C(r92.A00, r6, false);
    }
}
