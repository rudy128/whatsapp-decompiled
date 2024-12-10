package com.whatsapp.bot.botmemory.bottomsheet;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1HF;
import X.AnonymousClass1LU;
import X.AnonymousClass1OR;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3WC;
import X.AnonymousClass5BO;
import X.AnonymousClass5BP;
import X.AnonymousClass5BQ;
import X.AnonymousClass78Q;
import X.C139776zQ;
import X.C155127sF;
import X.C155137sG;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C41561wd;
import X.C99274sY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public final class MemoryBottomSheet extends Hilt_MemoryBottomSheet {
    public AnonymousClass1LU A00;
    public AnonymousClass00H A01;
    public final C18100vl A02;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626010, viewGroup);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            ((C139776zQ) r0.get()).A02(23);
            AnonymousClass3WC r2 = new AnonymousClass3WC();
            RecyclerView recyclerView = (RecyclerView) AnonymousClass1HF.A06(view, 2131432478);
            recyclerView.setAdapter(r2);
            AnonymousClass3Ma.A15(recyclerView.getContext(), recyclerView);
            C37581pm A0G = AnonymousClass3MZ.A0G(this);
            MemoryBottomSheet$onViewCreated$2 memoryBottomSheet$onViewCreated$2 = new MemoryBottomSheet$onViewCreated$2(r2, this, (C30391dr) null);
            AnonymousClass1OR r5 = AnonymousClass1OR.A00;
            Integer A0w = AnonymousClass3MW.A0w(r5, memoryBottomSheet$onViewCreated$2, A0G);
            String string = A15().getString("annotated_message_key_id");
            if (string != null) {
                MemoryBottomSheetViewModel memoryBottomSheetViewModel = (MemoryBottomSheetViewModel) this.A02.getValue();
                C30451dy.A02(A0w, r5, new MemoryBottomSheetViewModel$getMemoryByMemoryAnnotatedUserMessageKeyId$1(memoryBottomSheetViewModel, string, (C30391dr) null), C41561wd.A00(memoryBottomSheetViewModel));
            }
            AnonymousClass3MZ.A1I(C18070vi.A05(view, 2131432479), this, 36);
            View A06 = AnonymousClass1HF.A06(view, 2131432480);
            A06.setOnClickListener(new AnonymousClass78Q((Object) this, (Object) A06, 36));
            return;
        }
        C18070vi.A11("memoryJourneyLogger");
        throw null;
    }

    public MemoryBottomSheet() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5BP(new AnonymousClass5BO(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(MemoryBottomSheetViewModel.class);
        this.A02 = C99274sY.A00(new AnonymousClass5BQ(A002), new C155137sG(this, A002), new C155127sF(A002), A15);
    }

    public void A1s() {
        super.A1s();
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            ((C139776zQ) r0.get()).A01(23);
        } else {
            C18070vi.A11("memoryJourneyLogger");
            throw null;
        }
    }
}
