package com.whatsapp.identity;

import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.C18070vi;
import X.C72453Mb;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public final class QrCodeValidationResultBottomSheet extends WDSBottomSheetDialogFragment {
    public View.OnClickListener A00;
    public View.OnClickListener A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131626653, false);
    }

    public void A21(Bundle bundle, View view) {
        int i;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        TextView A0W = C72453Mb.A0W(view, 2131434262);
        Bundle bundle2 = this.A06;
        if (bundle2 == null || !bundle2.getBoolean("is_valid")) {
            A0W.setText(2131894858);
            i = 2131434261;
        } else {
            A0W.setText(2131894860);
            i = 2131434263;
        }
        AnonymousClass3MY.A1B(view, i, 0);
        View findViewById = view.findViewById(2131430125);
        View.OnClickListener onClickListener = this.A01;
        if (onClickListener != null) {
            findViewById.setOnClickListener(onClickListener);
        } else {
            C18070vi.A11("doneButtonClickListener");
            throw null;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener != null) {
            onClickListener.onClick(this.A0B);
        } else {
            C18070vi.A11("dismissClickListener");
            throw null;
        }
    }
}
