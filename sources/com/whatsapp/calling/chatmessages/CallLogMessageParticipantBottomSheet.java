package com.whatsapp.calling.chatmessages;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass1DC;
import X.AnonymousClass1DF;
import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3WJ;
import X.AnonymousClass4K2;
import X.AnonymousClass5D3;
import X.AnonymousClass5D4;
import X.AnonymousClass5D5;
import X.AnonymousClass5ML;
import X.AnonymousClass5MM;
import X.C000500i;
import X.C105095Qr;
import X.C155367sd;
import X.C155377se;
import X.C18070vi;
import X.C18100vl;
import X.C36241nZ;
import X.C36251na;
import X.C72453Mb;
import X.C99274sY;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.util.Log;

public final class CallLogMessageParticipantBottomSheet extends Hilt_CallLogMessageParticipantBottomSheet {
    public AnonymousClass1L9 A00;
    public AnonymousClass4K2 A01;
    public AnonymousClass3WJ A02;
    public AnonymousClass1DC A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public boolean A06;
    public final C18100vl A07;
    public final C18100vl A08;

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        if (AnonymousClass3Ma.A0y(AnonymousClass00R.A0C, new AnonymousClass5ML(this)) == null) {
            Log.e("CallLogMessageParticipantBottomSheet/onViewCreated abprops not enabled");
            A29();
            return;
        }
        AnonymousClass4K2 r0 = this.A01;
        if (r0 != null) {
            C105095Qr r7 = new C105095Qr(this);
            C36251na r2 = r0.A00;
            AnonymousClass10E r1 = r2.A02;
            this.A02 = new AnonymousClass3WJ(C000500i.A00(r1.Ao9), C36241nZ.A0N(r2.A01), AnonymousClass3MZ.A0e(r1), AnonymousClass3MZ.A0i(r1), r7);
            View A0S = C72453Mb.A0S(view, 2131434430);
            C18070vi.A0z(A0S, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) A0S;
            AnonymousClass3WJ r02 = this.A02;
            if (r02 == null) {
                str = "participantAdapter";
            } else {
                recyclerView.setAdapter(r02);
                AnonymousClass3MW.A0E(view, 2131434429).inflate();
                AnonymousClass3MX.A1A(A14(), AnonymousClass1HF.A06(view, 2131435586), 2131100370);
                return;
            }
        } else {
            str = "adapterFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0.A09 != 0) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDismiss(android.content.DialogInterface r9) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            super.onDismiss(r9)
            X.0vl r0 = r8.A08
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r4 = (com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel) r4
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0056
            boolean r0 = r4.A04
            r5 = 1
            if (r0 == 0) goto L_0x0024
            X.9Bw r0 = r4.A00
            if (r0 == 0) goto L_0x0024
            X.C178119Bw.A00(r0)
            int r0 = r0.A09
            r2 = 1
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            X.9Bw r0 = r4.A00
            if (r0 == 0) goto L_0x0079
            int r0 = r0.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x0079
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x003f
            r0 = 4
            if (r1 == r0) goto L_0x003f
            if (r1 == r5) goto L_0x003f
            if (r1 != 0) goto L_0x0079
        L_0x003f:
            if (r2 != 0) goto L_0x0045
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0079
        L_0x0045:
            r3 = 7
        L_0x0046:
            boolean r2 = r4.A03
            boolean r1 = r4.A02
            r0 = 0
            X.63F r1 = X.AnonymousClass74H.A03(r0, r3, r2, r5, r1)
            X.A4u r0 = r4.A07
            X.18K r0 = r0.A00
            r0.CC7(r1)
        L_0x0056:
            boolean r0 = r8.A06
            if (r0 != 0) goto L_0x0078
            X.00H r0 = r8.A04
            if (r0 == 0) goto L_0x007c
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.9sP r1 = (X.C194859sP) r1
            java.lang.Integer r4 = X.AnonymousClass3MY.A0h()
            X.0vl r0 = r8.A07
            java.lang.Object r5 = r0.getValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            r2 = 0
            r7 = 8
            r6 = r2
            r3 = r2
            r1.A01(r2, r3, r4, r5, r6, r7)
        L_0x0078:
            return
        L_0x0079:
            r3 = 8
            goto L_0x0046
        L_0x007c:
            java.lang.String r0 = "preCallChatThreadLogger"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet.onDismiss(android.content.DialogInterface):void");
    }

    public CallLogMessageParticipantBottomSheet() {
        AnonymousClass5D3 r1 = new AnonymousClass5D3(this);
        Integer num = AnonymousClass00R.A0C;
        C18100vl A002 = AnonymousClass1DF.A00(num, new AnonymousClass5D4(r1));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(CallLogMessageParticipantBottomSheetViewModel.class);
        this.A08 = C99274sY.A00(new AnonymousClass5D5(A002), new C155377se(this, A002), new C155367sd(A002), A15);
        this.A07 = AnonymousClass1DF.A00(num, new AnonymousClass5MM(this));
    }
}
