package com.whatsapp.payments.ui;

import X.AnonymousClass00H;
import X.AnonymousClass1R2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass9F6;
import X.BBZ;
import X.BD4;
import X.C175438yi;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18070vi;
import X.C20855AaX;
import X.C29621ca;
import X.C33711jG;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.payments.ui.viewmodel.BrazilIncomeCollectionViewModel;
import java.util.ArrayList;

public final class BrazilPaymentIncomeCollectionBottomSheet extends Hilt_BrazilPaymentIncomeCollectionBottomSheet {
    public static ArrayList A05;
    public BD4 A00;
    public BBZ A01;
    public BrazilIncomeCollectionViewModel A02;
    public AnonymousClass1R2 A03;
    public String A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.6UJ[]} */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.6UJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.6UJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.6UJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.6UJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.6UJ, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 5
            X.6UJ[] r6 = new X.AnonymousClass6UJ[r0]
            r4 = 0
            r2 = 15000(0x3a98, double:7.411E-320)
            X.6UJ r1 = new X.6UJ
            r1.<init>()
            r1.A01 = r4
            r1.A00 = r2
            r0 = 0
            r6[r0] = r1
            r4 = 15000(0x3a98, double:7.411E-320)
            r2 = 30000(0x7530, double:1.4822E-319)
            X.6UJ r1 = new X.6UJ
            r1.<init>()
            r1.A01 = r4
            r1.A00 = r2
            r0 = 1
            r6[r0] = r1
            r4 = 30000(0x7530, double:1.4822E-319)
            r2 = 45000(0xafc8, double:2.2233E-319)
            X.6UJ r1 = new X.6UJ
            r1.<init>()
            r1.A01 = r4
            r1.A00 = r2
            r0 = 2
            r6[r0] = r1
            r4 = 45000(0xafc8, double:2.2233E-319)
            r2 = 60000(0xea60, double:2.9644E-319)
            X.6UJ r1 = new X.6UJ
            r1.<init>()
            r1.A01 = r4
            r1.A00 = r2
            r0 = 3
            r6[r0] = r1
            r4 = 60000(0xea60, double:2.9644E-319)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.6UJ r1 = new X.6UJ
            r1.<init>()
            r1.A01 = r4
            r1.A00 = r2
            r0 = 4
            r6[r0] = r1
            java.util.ArrayList r0 = X.AnonymousClass1ZU.A05(r6)
            A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet.<clinit>():void");
    }

    public void A21(Bundle bundle, View view) {
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        BrazilIncomeCollectionViewModel brazilIncomeCollectionViewModel = this.A02;
        if (brazilIncomeCollectionViewModel == null) {
            C18070vi.A11("brazilIncomeCollectionViewModel");
            throw null;
        }
        Context A042 = AnonymousClass3MY.A04(view2);
        C20855AaX aaX = new C20855AaX(view2, this, 2);
        AnonymousClass00H r1 = brazilIncomeCollectionViewModel.A03;
        String A0T = C17890vO.A0T(r1);
        AnonymousClass9F6 r7 = new AnonymousClass9F6(A0T, 9);
        C17880vN.A0U(r1).A0I(new C175438yi(A042, brazilIncomeCollectionViewModel.A00, (C33711jG) brazilIncomeCollectionViewModel.A04.get(), aaX, brazilIncomeCollectionViewModel, r7), (C29621ca) r7.A00, A0T, 204, 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        String str = this.A04;
        BD4 bd4 = this.A00;
        if (bd4 == null) {
            C18070vi.A11("paymentFieldStatsLogger");
            throw null;
        }
        C17960vV.A07(bd4);
        bd4.BiL(128, "income_collection_prompt", str, 1);
        super.onDismiss(dialogInterface);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A04 = A15().getString("referral_screen");
        this.A02 = (BrazilIncomeCollectionViewModel) AnonymousClass3MW.A0N(this).A00(BrazilIncomeCollectionViewModel.class);
    }
}
