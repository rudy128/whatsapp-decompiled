package com.whatsapp.chatlock.dialogs.helperflow;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass1BI;
import X.AnonymousClass1FL;
import X.AnonymousClass1FY;
import X.AnonymousClass1MQ;
import X.AnonymousClass1XL;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4EF;
import X.AnonymousClass4R5;
import X.AnonymousClass4YL;
import X.AnonymousClass7RL;
import X.C18030ve;
import X.C18070vi;
import X.C22891Dp;
import X.C34241kA;
import X.C38541rS;
import X.C89894dC;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.WaTextView;

public final class ChatLockHelperBottomSheet extends Hilt_ChatLockHelperBottomSheet {
    public int A00 = 5;
    public AnonymousClass4EF A01;
    public C34241kA A02;
    public AnonymousClass4R5 A03;
    public ChatLockHelperBottomSheetViewModel A04;
    public AnonymousClass1MQ A05;
    public C18030ve A06;
    public AnonymousClass1BI A07;
    public AnonymousClass10I A08;
    public AnonymousClass00H A09;

    public void A21(Bundle bundle, View view) {
        int i;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        super.A21(bundle, view2);
        WaTextView A0N = AnonymousClass3Ma.A0N(view2, 2131429927);
        View A052 = C18070vi.A05(view2, 2131429535);
        AnonymousClass4R5 r3 = this.A03;
        if (r3 != null) {
            AnonymousClass1FL A1D = A1D();
            C18070vi.A0d(A0N, 0);
            C38541rS r9 = (C38541rS) r3.A04.get();
            Context A042 = AnonymousClass3MY.A04(A0N);
            AnonymousClass118 r7 = r3.A01;
            int i2 = 2131888153;
            if (((AnonymousClass1XL) r3.A03.get()).A05()) {
                i2 = 2131888154;
            }
            A0N.setText(r9.A04(A042, new AnonymousClass7RL(A1D, r3), C18070vi.A0G(r7, i2), "learn-more", AnonymousClass1YL.A00(A0N.getContext(), 2130970299, 2131101293)));
            AnonymousClass3Ma.A1K(A0N, r3.A00);
            AnonymousClass3Ma.A1I(A0N, r3.A02);
            ChatLockHelperBottomSheetViewModel chatLockHelperBottomSheetViewModel = this.A04;
            if (chatLockHelperBottomSheetViewModel != null) {
                AnonymousClass3MX.A0a(chatLockHelperBottomSheetViewModel.A06).A04(chatLockHelperBottomSheetViewModel.A03, Integer.valueOf(chatLockHelperBottomSheetViewModel.A00), (Integer) null, 11);
                C89894dC.A00(A052, this, 6);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) C18070vi.A05(view2, 2131431410);
                if (C22891Dp.A02) {
                    lottieAnimationView.setAnimation(2132017159);
                    i = 0;
                } else {
                    lottieAnimationView.setAnimation(2132017158);
                    i = -1;
                }
                lottieAnimationView.setRepeatCount(i);
                lottieAnimationView.A04();
                return;
            }
            AnonymousClass3MW.A1H();
            throw null;
        }
        C18070vi.A11("chatLockLinkUtil");
        throw null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C34241kA r2;
        C18070vi.A0d(dialogInterface, 0);
        ChatLockHelperBottomSheetViewModel chatLockHelperBottomSheetViewModel = this.A04;
        if (chatLockHelperBottomSheetViewModel != null) {
            AnonymousClass1FL A1B = A1B();
            C18070vi.A0z(A1B, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
            AnonymousClass1FY r4 = (AnonymousClass1FY) A1B;
            C18070vi.A0d(r4, 0);
            if (chatLockHelperBottomSheetViewModel.A04) {
                AnonymousClass4EF r3 = chatLockHelperBottomSheetViewModel.A01;
                if (!(r3 == null || (r2 = chatLockHelperBottomSheetViewModel.A02) == null)) {
                    chatLockHelperBottomSheetViewModel.A05.A0B(r4, r3, r2, chatLockHelperBottomSheetViewModel.A00);
                }
            } else {
                C34241kA r32 = chatLockHelperBottomSheetViewModel.A02;
                if (r32 != null) {
                    r32.C3e(new AnonymousClass4YL(AnonymousClass00R.A0N, (Integer) null, (Integer) null));
                }
            }
            super.onDismiss(dialogInterface);
            return;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }

    public void A1z(Bundle bundle) {
        ChatLockHelperBottomSheetViewModel chatLockHelperBottomSheetViewModel = (ChatLockHelperBottomSheetViewModel) AnonymousClass3MW.A0N(this).A00(ChatLockHelperBottomSheetViewModel.class);
        C18070vi.A0d(chatLockHelperBottomSheetViewModel, 0);
        this.A04 = chatLockHelperBottomSheetViewModel;
        AnonymousClass1BI r3 = this.A07;
        AnonymousClass4EF r2 = this.A01;
        C34241kA r1 = this.A02;
        int i = this.A00;
        if (!(r3 == null && r2 == null && r1 == null)) {
            chatLockHelperBottomSheetViewModel.A03 = r3;
            chatLockHelperBottomSheetViewModel.A02 = r1;
            chatLockHelperBottomSheetViewModel.A01 = r2;
            chatLockHelperBottomSheetViewModel.A00 = i;
        }
        super.A1z(bundle);
    }

    public int A2F() {
        return 2131626661;
    }
}
