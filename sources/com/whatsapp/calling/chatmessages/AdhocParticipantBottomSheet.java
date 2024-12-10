package com.whatsapp.calling.chatmessages;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DC;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass1L9;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.AnonymousClass3WI;
import X.AnonymousClass4K0;
import X.AnonymousClass5D0;
import X.AnonymousClass5D1;
import X.AnonymousClass74H;
import X.C101535Cz;
import X.C155347sb;
import X.C155357sc;
import X.C178119Bw;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C72453Mb;
import X.C72473Md;
import X.C83604Fy;
import X.C83614Fz;
import X.C99274sY;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.MaxHeightLinearLayout;

public class AdhocParticipantBottomSheet extends Hilt_AdhocParticipantBottomSheet {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public AnonymousClass1L9 A03;
    public AnonymousClass4K0 A04;
    public TextEmojiLabel A05;
    public AnonymousClass3WI A06;
    public MaxHeightLinearLayout A07;
    public C18030ve A08;
    public AnonymousClass1DC A09;
    public AnonymousClass00H A0A;
    public final C18100vl A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2, 7175) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r9, android.view.View r10) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            super.A21(r9, r10)
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            X.5MK r0 = new X.5MK
            r0.<init>(r8)
            X.0vl r2 = X.AnonymousClass1DF.A00(r1, r0)
            java.lang.String r0 = "is_from_call_log"
            X.0vl r1 = X.C88414Zp.A00(r8, r0)
            java.lang.Object r0 = r2.getValue()
            if (r0 == 0) goto L_0x0032
            boolean r0 = X.C72453Mb.A1a(r1)
            if (r0 == 0) goto L_0x0046
            X.0ve r2 = r8.A08
            if (r2 == 0) goto L_0x00ce
            r1 = 7175(0x1c07, float:1.0054E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0046
        L_0x0032:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r8.A2K()
            r1.append(r0)
            java.lang.String r0 = " onViewCreated callLogKey is null or abprops not enabled"
            X.C17890vO.A19(r1, r0)
            r8.A29()
            return
        L_0x0046:
            r0 = r10
            com.whatsapp.components.MaxHeightLinearLayout r0 = (com.whatsapp.components.MaxHeightLinearLayout) r0
            r8.A07 = r0
            r8.A01()
            X.4K0 r0 = r8.A04
            if (r0 == 0) goto L_0x00cb
            X.5W6 r7 = new X.5W6
            r7.<init>(r8)
            X.1na r2 = r0.A00
            X.10E r1 = r2.A02
            X.00V r0 = r1.Ao9
            android.content.Context r3 = X.C000500i.A00(r0)
            X.1VW r5 = X.AnonymousClass3MZ.A0e(r1)
            X.1Vd r6 = X.AnonymousClass3MZ.A0i(r1)
            X.1nZ r0 = r2.A01
            X.2ym r4 = X.C36241nZ.A0N(r0)
            X.3WI r2 = new X.3WI
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A06 = r2
            r0 = 2131427673(0x7f0b0159, float:1.8476969E38)
            androidx.recyclerview.widget.RecyclerView r1 = X.AnonymousClass3MX.A0Q(r10, r0)
            X.3WI r0 = r8.A06
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "adapter"
            goto L_0x00d0
        L_0x0084:
            r1.setAdapter(r0)
            r0 = 2131435585(0x7f0b2041, float:1.8493016E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r10, r0)
            r8.A01 = r0
            r0 = 2131435599(0x7f0b204f, float:1.8493045E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r10, r0)
            r8.A02 = r0
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r10, r0)
            r8.A00 = r0
            r0 = 2131429927(0x7f0b0a27, float:1.848154E38)
            com.whatsapp.TextEmojiLabel r0 = X.AnonymousClass3MX.A0V(r10, r0)
            r8.A05 = r0
            android.widget.TextView r1 = r8.A01
            if (r1 == 0) goto L_0x00b4
            r0 = 41
            X.C89874dA.A00(r1, r8, r0)
        L_0x00b4:
            android.widget.TextView r1 = r8.A02
            if (r1 == 0) goto L_0x00bd
            r0 = 42
            X.C89874dA.A00(r1, r8, r0)
        L_0x00bd:
            X.1pm r2 = X.AnonymousClass3MZ.A0G(r8)
            r1 = 0
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1 r0 = new com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet$initObservables$1
            r0.<init>(r8, r1)
            X.AnonymousClass3MX.A1Q(r0, r2)
            return
        L_0x00cb:
            java.lang.String r0 = "adapterFactory"
            goto L_0x00d0
        L_0x00ce:
            java.lang.String r0 = "abProps"
        L_0x00d0:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet.A21(android.os.Bundle, android.view.View):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        A01();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        int i;
        Integer valueOf;
        int intValue;
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel = (AdhocParticipantBottomSheetViewModel) this.A0B.getValue();
        if (!adhocParticipantBottomSheetViewModel.A01) {
            C178119Bw r0 = adhocParticipantBottomSheetViewModel.A00;
            if (r0 == null || (valueOf = Integer.valueOf(r0.A06)) == null || !((intValue = valueOf.intValue()) == 2 || intValue == 4 || intValue == 1 || intValue == 0)) {
                i = 8;
            } else {
                i = 7;
            }
            adhocParticipantBottomSheetViewModel.A07.A00.CC7(AnonymousClass74H.A03((String) null, i, adhocParticipantBottomSheetViewModel.A02, false, adhocParticipantBottomSheetViewModel.A01));
            int i2 = adhocParticipantBottomSheetViewModel.A03;
            if (C83614Fz.A00(i2)) {
                adhocParticipantBottomSheetViewModel.A06.BiX(15, (Integer) null, 8, false);
            } else if (AnonymousClass3Ma.A1b(C83604Fy.A00(), i2)) {
                adhocParticipantBottomSheetViewModel.A06.BiW(8, 15);
            }
        }
    }

    public String A2K() {
        return "AdhocParticipantBottomSheet";
    }

    public AdhocParticipantBottomSheet() {
        super(2131624142);
        this.A00 = false;
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5D0(new C101535Cz(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(AdhocParticipantBottomSheetViewModel.class);
        this.A0B = C99274sY.A00(new AnonymousClass5D1(A002), new C155357sc(this, A002), new C155347sb(A002), A15);
    }

    private final void A01() {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            float f = 0.85f;
            if (C72453Mb.A08(A14()) == 2) {
                f = 1.0f;
            }
            C72473Md.A0p(A1B, this.A07, f);
        }
    }

    public void A1s() {
        super.A1s();
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A07 = null;
    }
}
