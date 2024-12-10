package com.whatsapp.mute.ui;

import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1KB;
import X.AnonymousClass1NN;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass5IV;
import X.AnonymousClass5IW;
import X.AnonymousClass5IX;
import X.C156357uE;
import X.C156367uF;
import X.C17880vN;
import X.C18100vl;
import X.C19830z4;
import X.C21458AkP;
import X.C29431cG;
import X.C83034Dc;
import X.C86194Qr;
import X.C99274sY;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.List;

public final class MuteDialogFragment extends Hilt_MuteDialogFragment {
    public AnonymousClass1KB A00;
    public C86194Qr A01;
    public C19830z4 A02;
    public AnonymousClass10I A03;
    public boolean A04;
    public final C18100vl A05;

    public static final void A00(MuteDialogFragment muteDialogFragment) {
        String str;
        C18100vl r6 = muteDialogFragment.A05;
        MuteDialogViewModel muteDialogViewModel = (MuteDialogViewModel) r6.getValue();
        List list = muteDialogViewModel.A02;
        if (list != null) {
            boolean z = muteDialogViewModel.A03;
            C19830z4 r1 = muteDialogViewModel.A07;
            int i = muteDialogViewModel.A00.id;
            SharedPreferences.Editor A002 = C19830z4.A00(r1);
            if (!z) {
                str = "last_mute_selection";
            } else {
                str = "last_mute_call_selection";
            }
            C17880vN.A1C(A002, str, i);
            muteDialogViewModel.A0C.CGF(new C21458AkP(muteDialogViewModel, list, 7));
        }
        C83034Dc r3 = ((MuteDialogViewModel) r6.getValue()).A00;
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("is_mute_call_key", muteDialogFragment.A04);
        A0D.putInt("mute_selection_key", r3.id);
        muteDialogFragment.A1F().A0w("mute_dialog_request_key", A0D);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r5 != null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0138, code lost:
        if (X.C40811vJ.A0J(r10.A06, r10.A0A, X.AnonymousClass3MW.A03(r10.A09, r1), false) == false) goto L_0x013a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A27(android.os.Bundle r14) {
        /*
            r13 = this;
            android.os.Bundle r1 = r13.A06
            r2 = 0
            if (r1 == 0) goto L_0x00bd
            java.lang.String r0 = "mute_in_conversation_fragment"
            boolean r4 = r1.getBoolean(r0)
        L_0x000b:
            android.os.Bundle r0 = r13.A06
            r6 = 1
            r3 = 0
            if (r0 == 0) goto L_0x008b
            java.lang.String r5 = "jid"
            boolean r0 = r0.containsKey(r5)
            if (r0 != r6) goto L_0x008b
            X.1Dv r1 = X.AnonymousClass1BI.A00
            android.os.Bundle r0 = r13.A06
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = r0.getString(r5)
        L_0x0023:
            X.1BI r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x002d
            java.util.List r3 = X.C18070vi.A0M(r0)
        L_0x002d:
            android.os.Bundle r1 = r13.A06
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = "mute_entry_point"
            int r5 = r1.getInt(r0)
            X.1i2[] r1 = X.C32961i2.values()
            X.C18070vi.A0d(r1, r2)
            if (r5 < 0) goto L_0x0047
            int r0 = r1.length
            if (r5 >= r0) goto L_0x0047
            r5 = r1[r5]
            if (r5 != 0) goto L_0x0049
        L_0x0047:
            X.1i2 r5 = X.C32961i2.CHAT_LIST_SCREEN
        L_0x0049:
            android.os.Bundle r1 = r13.A06
            if (r1 == 0) goto L_0x0053
            java.lang.String r0 = "is_mute_call"
            boolean r2 = r1.getBoolean(r0)
        L_0x0053:
            r13.A04 = r2
            X.0vl r8 = r13.A05
            java.lang.Object r6 = r8.getValue()
            com.whatsapp.mute.ui.MuteDialogViewModel r6 = (com.whatsapp.mute.ui.MuteDialogViewModel) r6
            boolean r2 = r13.A04
            r6.A02 = r3
            r6.A04 = r4
            r6.A01 = r5
            r6.A03 = r2
            X.0z4 r0 = r6.A07
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            if (r2 == 0) goto L_0x0086
            java.lang.String r0 = "last_mute_call_selection"
        L_0x0071:
            int r5 = X.C17890vO.A00(r1, r0)
            X.4Dc[] r4 = X.C83034Dc.values()
            int r3 = r4.length
            r2 = 0
        L_0x007b:
            if (r2 >= r3) goto L_0x00c0
            r1 = r4[r2]
            int r0 = r1.id
            if (r0 == r5) goto L_0x00c2
            int r2 = r2 + 1
            goto L_0x007b
        L_0x0086:
            java.lang.String r0 = "last_mute_selection"
            goto L_0x0071
        L_0x0089:
            r0 = r3
            goto L_0x0023
        L_0x008b:
            android.os.Bundle r0 = r13.A06
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = "jids"
            boolean r0 = r0.containsKey(r1)
            if (r0 != r6) goto L_0x002d
            android.os.Bundle r0 = r13.A06
            if (r0 == 0) goto L_0x002d
            java.util.ArrayList r0 = r0.getStringArrayList(r1)
            if (r0 == 0) goto L_0x002d
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x00a9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = X.C17880vN.A0v(r1)
            X.1BI r0 = X.AnonymousClass3MX.A0l(r0)
            if (r0 == 0) goto L_0x00a9
            r3.add(r0)
            goto L_0x00a9
        L_0x00bd:
            r4 = 0
            goto L_0x000b
        L_0x00c0:
            X.4Dc r1 = X.C83034Dc.A02
        L_0x00c2:
            r6.A00 = r1
            X.3Rj r4 = X.AnonymousClass4a6.A04(r13)
            r0 = 2131892363(0x7f12188b, float:1.9419472E38)
            r4.A0E(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 27
            X.AnonymousClass4bB.A00(r4, r13, r0, r1)
            r2 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 28
            X.4bB r0 = new X.4bB
            r0.<init>(r13, r1)
            r4.setNegativeButton(r2, r0)
            android.view.LayoutInflater r2 = X.AnonymousClass3MZ.A0E(r13)
            r1 = 2131626132(0x7f0e0894, float:1.8879492E38)
            r0 = 0
            r3 = 0
            android.view.View r2 = r2.inflate(r1, r3, r0)
            r0 = 2131429927(0x7f0b0a27, float:1.848154E38)
            android.widget.TextView r7 = X.AnonymousClass3MW.A0J(r2, r0)
            android.content.Context r9 = r13.A1n()
            if (r9 == 0) goto L_0x0197
            java.lang.Object r10 = r8.getValue()
            com.whatsapp.mute.ui.MuteDialogViewModel r10 = (com.whatsapp.mute.ui.MuteDialogViewModel) r10
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x0193
            java.util.List r0 = r10.A02
            if (r0 == 0) goto L_0x0193
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L_0x0193
            X.1Dv r0 = X.AnonymousClass1BI.A00
            java.util.List r1 = r10.A02
            r0 = 0
            if (r1 == 0) goto L_0x0120
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
        L_0x0120:
            X.1E9 r1 = X.C50242Tr.A00(r0)
            if (r1 == 0) goto L_0x013a
            X.0ve r6 = r10.A0A
            X.11S r5 = r10.A06
            X.1MZ r0 = r10.A09
            int r1 = X.AnonymousClass3MW.A03(r0, r1)
            r0 = 0
            boolean r1 = X.C40811vJ.A0J(r5, r6, r1, r0)
            r0 = 2131892375(0x7f121897, float:1.9419497E38)
            if (r1 != 0) goto L_0x013d
        L_0x013a:
            r0 = 2131892362(0x7f12188a, float:1.941947E38)
        L_0x013d:
            java.lang.CharSequence r0 = r9.getText(r0)
        L_0x0141:
            r7.setText(r0)
            r0 = 2131435464(0x7f0b1fc8, float:1.849277E38)
            android.view.View r6 = X.C18070vi.A05(r2, r0)
            com.whatsapp.SingleSelectionDialogRadioGroup r6 = (com.whatsapp.SingleSelectionDialogRadioGroup) r6
            X.0z2 r0 = X.C83034Dc.A00
            java.util.ArrayList r5 = X.C29351c6.A0D(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x0157:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x019e
            java.lang.Object r9 = r12.next()
            X.4Dc r9 = (X.C83034Dc) r9
            int r11 = r9.ordinal()
            r10 = 2
            r7 = 1
            r1 = 1
            r0 = 0
            if (r11 == r0) goto L_0x018a
            if (r11 == r7) goto L_0x0186
            if (r11 != r10) goto L_0x0199
            X.0vb r1 = r13.A01
            r0 = 2131892361(0x7f121889, float:1.9419468E38)
            java.lang.String r1 = r1.A09(r0)
        L_0x017a:
            X.C18070vi.A0X(r1)
            X.4M8 r0 = new X.4M8
            r0.<init>(r9, r1)
            r5.add(r0)
            goto L_0x0157
        L_0x0186:
            X.0vb r0 = r13.A01
            r10 = 4
            goto L_0x018e
        L_0x018a:
            X.0vb r0 = r13.A01
            r1 = 8
        L_0x018e:
            java.lang.String r1 = X.C64052u8.A02(r0, r1, r10)
            goto L_0x017a
        L_0x0193:
            r0 = 2131892364(0x7f12188c, float:1.9419474E38)
            goto L_0x013d
        L_0x0197:
            r0 = r3
            goto L_0x0141
        L_0x0199:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x019e:
            X.4Qr r1 = r13.A01
            if (r1 == 0) goto L_0x01c1
            java.lang.Object r0 = r8.getValue()
            com.whatsapp.mute.ui.MuteDialogViewModel r0 = (com.whatsapp.mute.ui.MuteDialogViewModel) r0
            X.4Dc r0 = r0.A00
            r1.A00(r6, r0, r5)
            X.1pm r1 = X.AnonymousClass3MZ.A0H(r13)
            com.whatsapp.mute.ui.MuteDialogFragment$addMuteOptions$1 r0 = new com.whatsapp.mute.ui.MuteDialogFragment$addMuteOptions$1
            r0.<init>(r13, r3)
            X.AnonymousClass3MX.A1Q(r0, r1)
            r4.setView(r2)
            X.05w r0 = X.AnonymousClass3MY.A0L(r4)
            return r0
        L_0x01c1:
            java.lang.String r0 = "radioGroupManager"
            X.C18070vi.A11(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mute.ui.MuteDialogFragment.A27(android.os.Bundle):android.app.Dialog");
    }

    public void onCancel(DialogInterface dialogInterface) {
        List list;
        AnonymousClass1BI r1;
        AnonymousClass1NN r0;
        MuteDialogViewModel muteDialogViewModel = (MuteDialogViewModel) this.A05.getValue();
        if (!muteDialogViewModel.A04 && (list = muteDialogViewModel.A02) != null && (r1 = (AnonymousClass1BI) C29431cG.A0c(list)) != null && (r0 = muteDialogViewModel.A08) != null) {
            r0.A02(r1);
        }
    }

    public MuteDialogFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5IW(new AnonymousClass5IV(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(MuteDialogViewModel.class);
        this.A05 = C99274sY.A00(new AnonymousClass5IX(A002), new C156367uF(this, A002), new C156357uE(A002), A15);
    }
}
