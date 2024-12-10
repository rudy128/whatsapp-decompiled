package X;

import com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.4Vj  reason: invalid class name and case insensitive filesystem */
public abstract class C87384Vj {
    public static final CallConfirmationSheet A00(GroupJid groupJid, C89444cT r6, int i) {
        C18070vi.A0d(r6, 1);
        CallConfirmationSheet callConfirmationSheet = new CallConfirmationSheet();
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[3];
        r2[0] = AnonymousClass1D6.A00("call_from_ui", i);
        AnonymousClass1D6.A03("call_log_key", r6, r2, 1);
        C72463Mc.A1I("group_jid", groupJid, r2);
        AnonymousClass3MX.A1I(callConfirmationSheet, r2);
        return callConfirmationSheet;
    }

    public static final CallConfirmationSheet A01(AnonymousClass1EC r2, int i, boolean z) {
        C18070vi.A0d(r2, 1);
        CallConfirmationSheet callConfirmationSheet = new CallConfirmationSheet();
        callConfirmationSheet.A1R(AnonymousClass4Ft.A00(r2, Boolean.valueOf(z), i));
        return callConfirmationSheet;
    }
}
