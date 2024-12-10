package com.whatsapp.status.posting;

import X.AnonymousClass10I;
import X.AnonymousClass880;
import X.C201511a;
import X.C24661Le;
import X.C25001Mm;
import X.C41911xI;
import android.app.Dialog;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public final class FirstStatusConfirmationDialogFragment extends Hilt_FirstStatusConfirmationDialogFragment implements C201511a {
    public C25001Mm A00;
    public C41911xI A01;
    public C24661Le A02;
    public AnonymousClass880 A03;
    public AnonymousClass10I A04;

    public void A1v() {
        TextView textView;
        super.A1v();
        Dialog dialog = this.A03;
        if (dialog != null && (textView = (TextView) dialog.findViewById(16908299)) != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A27(android.os.Bundle r10) {
        /*
            r9 = this;
            X.3Rj r5 = X.AnonymousClass4a6.A03(r9)
            X.1Le r0 = r9.A02
            if (r0 == 0) goto L_0x00b1
            int r1 = r0.A05()
            r6 = 0
            if (r1 == 0) goto L_0x00a2
            r8 = 1
            if (r1 == r8) goto L_0x0090
            r0 = 2
            if (r1 != r0) goto L_0x00aa
            X.1Le r0 = r9.A02
            if (r0 == 0) goto L_0x00b1
            java.util.ArrayList r0 = r0.A0B()
            int r7 = r0.size()
            if (r7 == 0) goto L_0x00a2
            X.0vb r4 = r9.A01
            r3 = 2131755152(0x7f100090, float:1.9141175E38)
        L_0x0028:
            long r1 = (long) r7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            X.C17880vN.A1T(r0, r7, r6)
            java.lang.String r4 = r4.A0K(r0, r3, r1)
        L_0x0032:
            X.C18070vi.A0b(r4)
            r0 = 2131888095(0x7f1207df, float:1.9410816E38)
            java.lang.String r0 = r9.A1H(r0)
            android.text.SpannableStringBuilder r3 = X.AnonymousClass3MW.A09(r0)
            r0 = 2
            X.5dr r2 = new X.5dr
            r2.<init>(r9, r0)
            int r1 = r3.length()
            r0 = 33
            r3.setSpan(r2, r6, r1, r0)
            android.text.SpannableStringBuilder r1 = X.AnonymousClass3MW.A09(r4)
            java.lang.String r0 = " "
            android.text.SpannableStringBuilder r0 = r1.append(r0)
            android.text.SpannableStringBuilder r0 = r0.append(r3)
            X.C18070vi.A0X(r0)
            r5.A0S(r0)
            r0 = 1
            r5.A0T(r0)
            r2 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 27
            X.758 r0 = new X.758
            r0.<init>(r9, r1)
            r5.setNegativeButton(r2, r0)
            X.1Le r0 = r9.A02
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r0.A0H()
            if (r0 != 0) goto L_0x008b
            r2 = 2131899381(0x7f1233f5, float:1.9433706E38)
            r1 = 28
            X.758 r0 = new X.758
            r0.<init>(r9, r1)
            r5.setPositiveButton(r2, r0)
        L_0x008b:
            X.05w r0 = X.AnonymousClass3MY.A0L(r5)
            return r0
        L_0x0090:
            X.1Le r0 = r9.A02
            if (r0 == 0) goto L_0x00b1
            java.util.ArrayList r0 = r0.A0A()
            int r7 = r0.size()
            X.0vb r4 = r9.A01
            r3 = 2131755153(0x7f100091, float:1.9141177E38)
            goto L_0x0028
        L_0x00a2:
            r0 = 2131890427(0x7f1210fb, float:1.9415546E38)
            java.lang.String r4 = r9.A1H(r0)
            goto L_0x0032
        L_0x00aa:
            java.lang.String r0 = "Unknown status distribution mode"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00b1:
            java.lang.String r0 = "statusStore"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.posting.FirstStatusConfirmationDialogFragment.A27(android.os.Bundle):android.app.Dialog");
    }
}
