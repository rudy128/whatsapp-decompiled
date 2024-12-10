package X;

import android.widget.TextView;
import com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet;
import com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet;

/* renamed from: X.5Ab  reason: invalid class name */
public class AnonymousClass5Ab extends C445423v implements AnonymousClass1OS {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5Ab(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0018;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.4P9> r3 = X.AnonymousClass4P9.class
            java.lang.String r5 = "render(Lcom/whatsapp/status/archive/entity/StatusArchiveSettingsViewState;)V"
            r6 = 4
            r1 = 2
            java.lang.String r4 = "render"
        L_0x000e:
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet> r3 = com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet.class
            java.lang.String r5 = "updateUiState(Lcom/whatsapp/calling/callconfirmationsheet/data/CallConfirmationSheetUiState;)V"
            goto L_0x001c
        L_0x0018:
            java.lang.Class<com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet> r3 = com.whatsapp.calling.callconfirmationsheet.ui.OneOnOneCallConfirmationSheet.class
            java.lang.String r5 = "updateUiState(Lcom/whatsapp/calling/callconfirmationsheet/data/OneOnOneCallConfirmationSheetUiState;)V"
        L_0x001c:
            r6 = 4
            r1 = 2
            java.lang.String r4 = "updateUiState"
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Ab.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                ((CallConfirmationSheet) this.receiver).A2M((C87154Um) obj);
                break;
            case 1:
                ((OneOnOneCallConfirmationSheet) this.receiver).A2M((AnonymousClass4U0) obj);
                break;
            default:
                C89374cM r10 = (C89374cM) obj;
                AnonymousClass4P9 r8 = (AnonymousClass4P9) this.receiver;
                C18070vi.A0d(r10, 0);
                TextView textView = r8.A01;
                C18000vb r5 = r8.A03;
                int i = r10.A00;
                Object[] A1a = AnonymousClass3MW.A1a();
                C17880vN.A1T(A1a, i, 0);
                textView.setText(r5.A0K(A1a, 2131755399, (long) i));
                r8.A02.setChecked(r10.A01);
                break;
        }
        return C27621Wu.A00;
    }
}
