package com.whatsapp.community;

import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1M9;
import X.AnonymousClass1OR;
import X.AnonymousClass2QF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3To;
import X.AnonymousClass4J4;
import X.C102035Ex;
import X.C102045Ey;
import X.C104035Mp;
import X.C104045Mq;
import X.C104055Mr;
import X.C104145Na;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C27201Vd;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C39261sm;
import X.C39321ss;
import X.C41561wd;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C84004Hm;
import X.C89894dC;
import X.C91004ez;
import X.C99274sY;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.List;

public final class TransferCommunityOwnershipActivity extends AnonymousClass1FY {
    public int A00;
    public AnonymousClass4J4 A01;
    public AnonymousClass1M9 A02;
    public C27201Vd A03;
    public WDSProfilePhoto A04;
    public boolean A05;
    public final C18100vl A06;
    public final C18100vl A07;
    public final C18100vl A08;
    public final C18100vl A09;

    public TransferCommunityOwnershipActivity() {
        this(0);
        Integer num = AnonymousClass00R.A01;
        this.A06 = AnonymousClass1DF.A00(num, new C104035Mp(this));
        this.A08 = AnonymousClass1DF.A00(num, new C104045Mq(this));
        this.A07 = AnonymousClass1DF.A00(num, new C104145Na(this));
        this.A09 = C99274sY.A00(new C102035Ex(this), new C102045Ey(this), new C104055Mr(this), AnonymousClass3MW.A15(AnonymousClass3To.class));
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A02 = AnonymousClass10E.A4z(r2);
            this.A03 = AnonymousClass3MZ.A0i(r2);
            this.A01 = (AnonymousClass4J4) A0K.A1y.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624118);
        Toolbar A0T = C72463Mc.A0T(this);
        C18000vb r1 = this.A00;
        C18070vi.A0W(r1);
        C84004Hm.A00(this, A0T, r1, C18070vi.A0F(this, 2131897126));
        C72473Md.A16(getSupportActionBar());
        this.A00 = getResources().getDimensionPixelSize(2131165951);
        this.A04 = (WDSProfilePhoto) AnonymousClass3MY.A0H(this, 2131431496);
        AnonymousClass3To r3 = (AnonymousClass3To) this.A09.getValue();
        Integer A0w = AnonymousClass3MW.A0w(r3.A04, new TransferCommunityOwnershipViewModel$loadParentContact$1(r3, (C30391dr) null), C41561wd.A00(r3));
        WDSProfilePhoto wDSProfilePhoto = this.A04;
        if (wDSProfilePhoto == null) {
            C18070vi.A11("communityProfilePhoto");
            throw null;
        }
        wDSProfilePhoto.setProfileBadge(new AnonymousClass2QF(C39321ss.A00(), new C39261sm(2131103088, C72463Mc.A03(this), 0, 0), 2131233465, false));
        ((TextEmojiLabel) AnonymousClass3MY.A0H(this, 2131436415)).A0S(C17880vN.A0q(this, this.A07.getValue(), AnonymousClass3MW.A1a(), 0, 2131897123), (List) null, 0, false);
        C89894dC.A00(findViewById(2131434059), this, 24);
        C37581pm A0H = AnonymousClass3MZ.A0H(this);
        C30451dy.A02(A0w, AnonymousClass1OR.A00, new TransferCommunityOwnershipActivity$collectViewModelEvents$1(this, (C30391dr) null), A0H);
    }

    public TransferCommunityOwnershipActivity(int i) {
        this.A05 = false;
        C91004ez.A00(this, 9);
    }
}
