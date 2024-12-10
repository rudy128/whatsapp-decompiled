package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass00H;
import X.AnonymousClass1FL;
import X.AnonymousClass1SB;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass7RQ;
import X.AnonymousClass7wD;
import X.C112115kx;
import X.C1588082c;
import X.C18000vb;
import X.C18070vi;
import X.C201811d;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class StickerAddToPackBottomSheet extends Hilt_StickerAddToPackBottomSheet {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public final AnonymousClass00H A06 = C201811d.A00(49491);

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        ArrayList parcelableArrayList = A15().getParcelableArrayList("arg_stickers");
        if (parcelableArrayList != null) {
            View findViewById = view.findViewById(2131433390);
            C18070vi.A0z(findViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            AnonymousClass3Ma.A15(A1n(), recyclerView);
            AnonymousClass1FL A1B = A1B();
            if (A1B != null) {
                AnonymousClass7wD r4 = new AnonymousClass7wD(A1B, this, parcelableArrayList);
                C1588082c r3 = new C1588082c(this, parcelableArrayList);
                AnonymousClass00H r0 = this.A05;
                if (r0 != null) {
                    C18000vb r1 = (C18000vb) C18070vi.A0E(r0);
                    AnonymousClass00H r02 = this.A03;
                    if (r02 != null) {
                        C112115kx r2 = new C112115kx(r1, (AnonymousClass1SB) C18070vi.A0E(r02), r4, r3);
                        recyclerView.setAdapter(r2);
                        AnonymousClass00H r03 = this.A04;
                        if (r03 != null) {
                            AnonymousClass7RQ.A02(AnonymousClass3MX.A0x(r03), this, r2, 33);
                            return;
                        }
                        str = "waWorkers";
                    } else {
                        str = "stickerRepository";
                    }
                } else {
                    str = "whatsAppLocale";
                }
                C18070vi.A11(str);
                throw null;
            }
        }
    }
}
