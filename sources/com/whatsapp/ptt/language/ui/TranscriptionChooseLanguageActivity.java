package com.whatsapp.ptt.language.ui;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1OR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3U1;
import X.AnonymousClass42U;
import X.AnonymousClass5LH;
import X.AnonymousClass5LI;
import X.AnonymousClass5LJ;
import X.C1407873b;
import X.C17880vN;
import X.C18100vl;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C72473Md;
import X.C72483Me;
import X.C84464Jp;
import X.C87534Vy;
import X.C88534a3;
import X.C90294dq;
import X.C91024f1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.whatsapp.wds.components.button.WDSButton;

public final class TranscriptionChooseLanguageActivity extends AnonymousClass1FY {
    public C84464Jp A00;
    public C1407873b A01;
    public AnonymousClass42U A02;
    public C88534a3 A03;
    public WDSButton A04;
    public WDSButton A05;
    public boolean A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final C18100vl A09;

    public TranscriptionChooseLanguageActivity() {
        this(0);
        this.A07 = AnonymousClass1DF.A01(new AnonymousClass5LH(this));
        this.A08 = AnonymousClass1DF.A01(new AnonymousClass5LI(this));
        this.A09 = AnonymousClass1DF.A01(new AnonymousClass5LJ(this));
    }

    public static final void A0V(TranscriptionChooseLanguageActivity transcriptionChooseLanguageActivity, boolean z) {
        AnonymousClass42U r0 = transcriptionChooseLanguageActivity.A02;
        if (r0 != null) {
            int i = r0.A00;
            AnonymousClass3MX.A1Q(new TranscriptionChooseLanguageActivity$enqueueModelDownloadIntent$1(transcriptionChooseLanguageActivity, (C30391dr) null, i, z), AnonymousClass3MZ.A0H(transcriptionChooseLanguageActivity));
        }
    }

    public void A2y() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A01 = (C1407873b) r2.AXd.get();
            this.A03 = (C88534a3) r2.A9G.get();
            this.A00 = (C84464Jp) A0K.A3O.get();
        }
    }

    public static final View A03(TranscriptionChooseLanguageActivity transcriptionChooseLanguageActivity, int i) {
        LayoutInflater layoutInflater = transcriptionChooseLanguageActivity.getLayoutInflater();
        C18100vl r3 = transcriptionChooseLanguageActivity.A07;
        View inflate = layoutInflater.inflate(i, (ViewGroup) r3.getValue(), false);
        inflate.setFocusable(false);
        inflate.setClickable(false);
        inflate.setOnTouchListener(new C90294dq(1));
        ((ListView) r3.getValue()).addHeaderView(inflate);
        return inflate;
    }

    public static final void A0Q(View view) {
        view.findViewById(2131436405).setVisibility(8);
        C17880vN.A0E(view, 2131436404).setText(view.getResources().getText(2131897095));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("languageSelectionKey");
        if (stringExtra != null) {
            C87534Vy.A00(stringExtra);
            setContentView(2131627221);
            C37581pm A0H = AnonymousClass3MZ.A0H(this);
            TranscriptionChooseLanguageViewModel$observeIntents$1 transcriptionChooseLanguageViewModel$observeIntents$1 = new TranscriptionChooseLanguageViewModel$observeIntents$1((AnonymousClass3U1) this.A09.getValue(), (C30391dr) null);
            AnonymousClass1OR r3 = AnonymousClass1OR.A00;
            C30451dy.A02(AnonymousClass3MW.A0w(r3, transcriptionChooseLanguageViewModel$observeIntents$1, A0H), r3, new TranscriptionChooseLanguageActivity$onCreate$2(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
            return;
        }
        finish();
    }

    public TranscriptionChooseLanguageActivity(int i) {
        this.A06 = false;
        C91024f1.A00(this, 41);
    }
}
