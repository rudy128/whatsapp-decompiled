package com.whatsapp.payments.ui.instructions;

import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1R2;
import X.AnonymousClass8BR;
import X.BD4;
import X.C17960vV;
import X.C18030ve;
import X.C18070vi;
import X.C20087A6p;
import X.C20112A7u;
import X.C20157A9t;
import X.C24751Ln;
import X.C25181Nf;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class PaymentCustomInstructionsBottomSheet extends Hilt_PaymentCustomInstructionsBottomSheet {
    public AnonymousClass11S A00;
    public C25181Nf A01;
    public C24751Ln A02;
    public C18030ve A03;
    public AnonymousClass1BI A04;
    public C20157A9t A05 = new Object();
    public BD4 A06;
    public AnonymousClass1R2 A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public String A0C;

    public static final void A00(PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet, Integer num, int i) {
        C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
        A032.A07("payment_method", "cpi");
        String str = paymentCustomInstructionsBottomSheet.A0C;
        BD4 bd4 = paymentCustomInstructionsBottomSheet.A06;
        if (bd4 != null) {
            C20087A6p.A02(A032, bd4, num, "payment_instructions_prompt", str, i);
        } else {
            C18070vi.A11("fieldStatEventLogger");
            throw null;
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String A0K;
        C18070vi.A0d(layoutInflater, 0);
        Bundle A15 = A15();
        String string = A15.getString("PayInstructionsKey", "");
        C18070vi.A0X(string);
        this.A09 = string;
        this.A04 = (AnonymousClass1BI) A15.getParcelable("merchantJid");
        this.A0C = AnonymousClass8BR.A0y(A15);
        this.A0B = A15.getBoolean("has_total_amount");
        AnonymousClass1BI r1 = this.A04;
        if (r1 == null) {
            A0K = null;
        } else {
            C25181Nf r0 = this.A01;
            if (r0 != null) {
                C17960vV.A07(r1);
                AnonymousClass1E7 A012 = r0.A01(r1);
                if (A012.A0L() != null) {
                    A0K = A012.A0L();
                } else {
                    A0K = A012.A0K();
                }
            } else {
                C18070vi.A11("conversationContactManager");
                throw null;
            }
        }
        this.A08 = A0K;
        this.A0A = A15.getString("total_amount");
        A00(this, (Integer) null, 0);
        return super.A1q(bundle, layoutInflater, viewGroup);
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        this.A05.onDismiss(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        this.A05.onDismiss(dialogInterface);
    }
}
