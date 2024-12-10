package com.whatsapp.settings.chat.theme;

import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass5UA;
import X.C003401n;
import X.C17880vN;
import X.C18070vi;
import X.C34001jj;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C84314Ja;
import X.C91034f2;
import X.C91074f6;
import X.C91634g0;
import X.C91774gE;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;
import com.whatsapp.settings.chat.theme.fragment.ChatThemeSelectionFragment;

public final class ChatThemeActivity extends AnonymousClass1FY {
    public AnonymousClass02n A00;
    public C84314Ja A01;
    public ChatThemeViewModel A02;
    public boolean A03;

    public ChatThemeActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A03) {
            this.A03 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A01 = (C84314Ja) A0K.A0d.get();
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, X.02h] */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131624032);
        AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(getIntent().getStringExtra("chat_jid"));
        C84314Ja r1 = this.A01;
        if (r1 != null) {
            ChatThemeViewModel chatThemeViewModel = (ChatThemeViewModel) C91774gE.A00(this, r1, A022, 7).A00(ChatThemeViewModel.class);
            C18070vi.A0d(chatThemeViewModel, 0);
            this.A02 = chatThemeViewModel;
            chatThemeViewModel.A0T(this);
            Bundle A0D = C17880vN.A0D();
            A0D.putString("jid_key", C72463Mc.A0n(A022));
            ChatThemeSelectionFragment chatThemeSelectionFragment = new ChatThemeSelectionFragment();
            chatThemeSelectionFragment.A1R(A0D);
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            A0H.A0D(chatThemeSelectionFragment, "ChatThemeSelectionFragment", 2131429504);
            A0H.A01();
            this.A00 = C91074f6.A00(this, new Object(), 12);
            ChatThemeViewModel chatThemeViewModel2 = this.A02;
            if (chatThemeViewModel2 != null) {
                C91634g0.A00(this, chatThemeViewModel2.A09, new AnonymousClass5UA(this), 27);
                C003401n supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.A0O(AnonymousClass3NL.A00(this, this.A00, 2131231672));
                    return;
                }
                return;
            }
            str = "viewModel";
        } else {
            str = "viewModelFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public ChatThemeActivity(int i) {
        this.A03 = false;
        C91034f2.A00(this, 26);
    }
}
