package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass129;
import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4a6;
import X.AnonymousClass6h0;
import X.C17880vN;
import X.C19880zA;
import X.C32151gj;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import java.util.Random;

public class ChatWithBusinessInDirectoryDialogFragment extends Hilt_ChatWithBusinessInDirectoryDialogFragment implements View.OnClickListener {
    public C19880zA A00;
    public AnonymousClass1L9 A01;
    public AnonymousClass6h0 A02;
    public C32151gj A03;
    public AnonymousClass129 A04;
    public boolean A05;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.conversation.conversationrow.Hilt_ChatWithBusinessInDirectoryDialogFragment, androidx.fragment.app.Fragment, com.whatsapp.conversation.conversationrow.ChatWithBusinessInDirectoryDialogFragment] */
    public static ChatWithBusinessInDirectoryDialogFragment A00(boolean z) {
        ? hilt_ChatWithBusinessInDirectoryDialogFragment = new Hilt_ChatWithBusinessInDirectoryDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("arg_conversation_stared_by_me", z);
        hilt_ChatWithBusinessInDirectoryDialogFragment.A1R(A0D);
        return hilt_ChatWithBusinessInDirectoryDialogFragment;
    }

    public Dialog A27(Bundle bundle) {
        this.A05 = A15().getBoolean("arg_conversation_stared_by_me");
        View A08 = AnonymousClass3MX.A08(A14(), 2131625781);
        int i = 2131887007;
        if (this.A05) {
            i = 2131888736;
        }
        AnonymousClass3MW.A0J(A08, 2131432664).setText(i);
        View A06 = AnonymousClass1HF.A06(A08, 2131436208);
        if (this.A05) {
            A06.setVisibility(8);
        }
        View A062 = AnonymousClass1HF.A06(A08, 2131428441);
        View A063 = AnonymousClass1HF.A06(A08, 2131428440);
        View A064 = AnonymousClass1HF.A06(A08, 2131428446);
        if (this.A05) {
            A062.setVisibility(8);
        } else {
            A063.setVisibility(4);
        }
        A064.setOnClickListener(this);
        A063.setOnClickListener(this);
        A062.setOnClickListener(this);
        C73203Rj A032 = AnonymousClass4a6.A03(this);
        A032.A0c(A08);
        A032.A0T(true);
        return A032.create();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == 2131428440) {
            this.A01.CGU(A14(), this.A04.A05("security-and-privacy", "how-to-select-a-location-when-looking-for-businesses-nearby"), (AnonymousClass206) null);
        } else if (id == 2131428441) {
            AnonymousClass6h0 r1 = this.A02;
            r1.A00 = 9;
            Random random = r1.A01;
            if (random == null) {
                random = new Random();
                r1.A01 = random;
            }
            random.nextLong();
            A14();
            this.A00.A03();
            A14();
            throw AnonymousClass000.A0s("businessDirectoryStatusActivity");
        }
        A28();
    }
}
