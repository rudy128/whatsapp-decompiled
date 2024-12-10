package com.whatsapp.bot.creation;

import X.AnonymousClass1FL;
import X.AnonymousClass1G0;
import X.AnonymousClass1GW;
import X.AnonymousClass1KB;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3U6;
import X.AnonymousClass5BX;
import X.AnonymousClass5BY;
import X.AnonymousClass5BZ;
import X.AnonymousClass5M4;
import X.AnonymousClass5M5;
import X.C101025Ba;
import X.C106665Ws;
import X.C18070vi;
import X.C18100vl;
import X.C23401Fx;
import X.C29431cG;
import X.C30391dr;
import X.C41561wd;
import X.C77543qX;
import X.C87924Xq;
import X.C89474cW;
import X.C93004iH;
import X.C99274sY;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import com.whatsapp.WaEditText;
import com.whatsapp.bot.creation.service.AiCreationPhotoLoader;
import com.whatsapp.bot.creation.viewmodel.AiCreationViewModel;
import com.whatsapp.bot.creation.viewmodel.AiCreationViewModel$updateGenAiPersonaCreationResultFlow$1;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.wds.components.button.WDSButton;

public final class EditAvatarFragment extends Hilt_EditAvatarFragment implements AnonymousClass1GW {
    public ProgressBar A00;
    public AnonymousClass1KB A01;
    public WaEditText A02;
    public AiCreationPhotoLoader A03;
    public ThumbnailButton A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public WDSButton A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        AnonymousClass1FL A1D = A1D();
        AnonymousClass3MY.A0t(A1D, 2131886606);
        A1D.A2P(this, C23401Fx.RESUMED, A1G());
        this.A04 = (ThumbnailButton) view.findViewById(2131427713);
        this.A00 = (ProgressBar) view.findViewById(2131427714);
        this.A02 = (WaEditText) view.findViewById(2131427712);
        WDSButton A0r = AnonymousClass3MW.A0r(view, 2131427716);
        this.A0A = A0r;
        if (A0r != null) {
            AnonymousClass3MZ.A1I(A0r, this, 40);
        }
        AnonymousClass3MX.A1Q(new EditAvatarFragment$onViewCreated$3(this, (C30391dr) null), AnonymousClass3MZ.A0G(this));
    }

    public void BqV(Menu menu, MenuInflater menuInflater) {
        C18070vi.A0d(menu, 0);
        menu.add(0, 2131432604, 0, 2131886605).setEnabled(true).setShowAsAction(2);
    }

    public /* synthetic */ void ByC(Menu menu) {
    }

    public boolean ByD(MenuItem menuItem) {
        if (AnonymousClass3MY.A01(menuItem, 0) != 2131432604) {
            return false;
        }
        AiCreationViewModel aiCreationViewModel = (AiCreationViewModel) this.A0B.getValue();
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A07;
        C106665Ws r1 = (C106665Ws) C29431cG.A0d(((AnonymousClass1G0) aiCreationViewModel.A04.getValue()).BY9());
        if (r1 instanceof C93004iH) {
            C89474cW r0 = (C89474cW) ((C93004iH) r1).A00;
            String str4 = r0.A01;
            String str5 = r0.A07;
            String str6 = r0.A04;
            if (str == null) {
                str = r0.A03;
            }
            if (str2 == null) {
                str2 = r0.A06;
            }
            if (str3 == null) {
                str3 = r0.A08;
            }
            C89474cW r4 = new C89474cW(r0.A00, r0.A02, r0.A05, str4, str5, str6, str, str2, str3);
            AnonymousClass3MX.A1Q(new AiCreationViewModel$updateGenAiPersonaCreationResultFlow$1(r4, aiCreationViewModel, (C30391dr) null), C41561wd.A00(aiCreationViewModel));
        }
        ((AnonymousClass3U6) this.A0C.getValue()).A0T(C87924Xq.A00);
        return true;
    }

    public /* synthetic */ void C1X(Menu menu) {
    }

    public EditAvatarFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(AiCreationViewModel.class);
        this.A0B = C99274sY.A00(new AnonymousClass5BX(this), new AnonymousClass5BY(this), new AnonymousClass5M4(this), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(C77543qX.class);
        this.A0C = C99274sY.A00(new AnonymousClass5BZ(this), new C101025Ba(this), new AnonymousClass5M5(this), A152);
    }

    public void A1s() {
        super.A1s();
        ThumbnailButton thumbnailButton = this.A04;
        if (thumbnailButton != null) {
            thumbnailButton.setImageDrawable((Drawable) null);
        }
        this.A04 = null;
        this.A00 = null;
        this.A02 = null;
        WDSButton wDSButton = this.A0A;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A0A = null;
    }
}
