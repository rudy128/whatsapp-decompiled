package com.whatsapp.biz.product.view.fragment;

import X.AnonymousClass1KB;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.B7R;
import X.C010105w;
import X.C183929a8;
import X.C20151A9n;
import X.C20163A9z;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class ProductReportReasonDialogFragment extends Hilt_ProductReportReasonDialogFragment {
    public int A00 = -1;
    public AnonymousClass1KB A01;
    public B7R A02;
    public final C183929a8[] A03 = {new C183929a8("no-match", 2131887997), new C183929a8("spam", 2131888000), new C183929a8("illegal", 2131887995), new C183929a8("scam", 2131887999), new C183929a8("knockoff", 2131887996), new C183929a8("other", 2131887998)};

    public Dialog A27(Bundle bundle) {
        C73203Rj A032 = AnonymousClass4a6.A03(this);
        C183929a8[] r4 = this.A03;
        int length = r4.length;
        CharSequence[] charSequenceArr = new CharSequence[length];
        for (int i = 0; i < length; i++) {
            charSequenceArr[i] = A1H(r4[i].A00);
        }
        A032.A0N(new C20151A9n(this, 22), charSequenceArr, this.A00);
        A032.A0E(2131887993);
        A032.setPositiveButton(2131895217, (DialogInterface.OnClickListener) null);
        C010105w A0L = AnonymousClass3MY.A0L(A032);
        A0L.setOnShowListener(new C20163A9z(this, 0));
        return A0L;
    }
}
