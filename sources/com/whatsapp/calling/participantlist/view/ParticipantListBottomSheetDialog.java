package com.whatsapp.calling.participantlist.view;

import X.AnonymousClass00H;
import X.AnonymousClass1DC;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass1V9;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3WN;
import X.AnonymousClass4RO;
import X.AnonymousClass5E3;
import X.AnonymousClass5E4;
import X.AnonymousClass5E5;
import X.AnonymousClass5E6;
import X.AnonymousClass5MY;
import X.AnonymousClass5MZ;
import X.AnonymousClass5R2;
import X.AnonymousClass5R3;
import X.AnonymousClass5R4;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C38391rD;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C99274sY;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;
import com.whatsapp.components.MaxHeightLinearLayout;

public class ParticipantListBottomSheetDialog extends Hilt_ParticipantListBottomSheetDialog {
    public RecyclerView A00;
    public AnonymousClass1L9 A01;
    public WaTextView A02;
    public AnonymousClass3WN A03;
    public AnonymousClass1V9 A04;
    public AnonymousClass4RO A05;
    public AnonymousClass1DC A06;
    public AnonymousClass00H A07;
    public MaxHeightLinearLayout A08;
    public final C18100vl A09;
    public final int A0A = 2131626306;
    public final C18100vl A0B;

    public void A21(Bundle bundle, View view) {
        Window window;
        View decorView;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(C72463Mc.A0L(view));
        C18070vi.A0X(A022);
        A022.A0h = true;
        A022.A0W(3);
        this.A08 = (MaxHeightLinearLayout) view;
        this.A02 = AnonymousClass3MW.A0T(view, 2131436208);
        A00();
        this.A00 = (RecyclerView) AnonymousClass1HF.A06(view, 2131433437);
        AnonymousClass3WN r1 = this.A03;
        if (r1 != null) {
            r1.A02 = A2K();
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                AnonymousClass3WN r0 = this.A03;
                if (r0 != null) {
                    recyclerView.setAdapter(r0);
                }
            }
            AnonymousClass3MY.A1K(A1G(), A2K().A02, new AnonymousClass5R2(this), 28);
            AnonymousClass3MY.A1K(A1G(), A2K().A03, new AnonymousClass5R3(this), 28);
            A2K().A07.A00(this, new AnonymousClass5R4(this));
            if (!(this instanceof VoiceChatParticipantListBottomSheetDialog)) {
                C18100vl r3 = this.A09;
                AnonymousClass3MY.A1K(A1G(), ((MenuBottomSheetViewModel) r3.getValue()).A02, AnonymousClass3MW.A16(this, 10), 28);
                AnonymousClass3MY.A1K(A1G(), ((MenuBottomSheetViewModel) r3.getValue()).A03, AnonymousClass3MW.A16(this, 11), 28);
            }
            AnonymousClass1FL A1B = A1B();
            if (A1B != null && (window = A1B.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.announceForAccessibility(A14().getResources().getText(2131898215));
                return;
            }
            return;
        }
        C18070vi.A11("participantListAdapter");
        throw null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        A00();
    }

    public int A25() {
        if (this instanceof VoiceChatParticipantListBottomSheetDialog) {
            return 2132084312;
        }
        return 2132083351;
    }

    public int A2F() {
        return this.A0A;
    }

    public ParticipantsListViewModel A2K() {
        C18100vl r0;
        if (this instanceof VoiceChatParticipantListBottomSheetDialog) {
            r0 = ((VoiceChatParticipantListBottomSheetDialog) this).A01;
        } else {
            r0 = this.A0B;
        }
        return (ParticipantsListViewModel) r0.getValue();
    }

    public ParticipantListBottomSheetDialog() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(ParticipantsListViewModel.class);
        this.A0B = C99274sY.A00(new AnonymousClass5E3(this), new AnonymousClass5E4(this), new AnonymousClass5MY(this), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(MenuBottomSheetViewModel.class);
        this.A09 = C99274sY.A00(new AnonymousClass5E5(this), new AnonymousClass5E6(this), new AnonymousClass5MZ(this), A152);
    }

    private final void A00() {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            float f = 0.6f;
            if (C72453Mb.A08(A14()) == 2) {
                f = 1.0f;
            }
            C72473Md.A0p(A1B, this.A08, f);
        }
    }

    public void A1s() {
        Integer A0g;
        int i;
        int i2;
        Window window;
        View decorView;
        super.A1s();
        boolean z = this instanceof VoiceChatParticipantListBottomSheetDialog;
        AnonymousClass1V9 r3 = this.A04;
        if (z) {
            if (r3 != null) {
                A0g = AnonymousClass3MY.A0g();
                i = 23;
                i2 = 35;
            }
            C18070vi.A11("callUserJourneyLogger");
            throw null;
        }
        if (r3 != null) {
            A0g = AnonymousClass3MY.A0g();
            i = 23;
            i2 = 16;
        }
        C18070vi.A11("callUserJourneyLogger");
        throw null;
        r3.A01(A0g, i, i2);
        AnonymousClass1FL A1B = A1B();
        if (!(A1B == null || (window = A1B.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            decorView.announceForAccessibility(A14().getResources().getText(2131898214));
        }
        this.A08 = null;
        this.A02 = null;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter((C38391rD) null);
        }
        this.A00 = null;
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("on_dismissed", true);
        A1F().A0w("participant_list_request", A0D);
    }

    public Dialog A27(Bundle bundle) {
        Dialog A27 = super.A27(bundle);
        Window window = A27.getWindow();
        if (window != null) {
            window.addFlags(128);
        }
        return A27;
    }
}
