package com.whatsapp.events;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1L4;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass5NX;
import X.AnonymousClass5PQ;
import X.C000200d;
import X.C136736uJ;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C28281Zt;
import X.C34001jj;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C87544Vz;
import X.C89934dG;
import X.C91014f0;
import X.C91374fa;
import X.C98564rM;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.jid.Jid;
import java.util.Iterator;
import java.util.List;

public final class EventCreationActivity extends AnonymousClass1FY {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public AnonymousClass00H A02;
    public BottomSheetBehavior A03;
    public boolean A04;
    public boolean A05;
    public final C18100vl A06;
    public final C18100vl A07;

    public EventCreationActivity() {
        this(0);
        Integer num = AnonymousClass00R.A01;
        this.A06 = AnonymousClass1DF.A00(num, new AnonymousClass5NX(this));
        this.A07 = AnonymousClass1DF.A00(num, new AnonymousClass5PQ(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625243);
        C18030ve r0 = this.A0E;
        C18070vi.A0W(r0);
        boolean A002 = C87544Vz.A00(r0);
        this.A05 = A002;
        if (A002) {
            View A052 = C18070vi.A05(this.A00, 2131430566);
            this.A03 = new BottomSheetBehavior();
            AnonymousClass00H r02 = this.A01;
            if (r02 != null) {
                BottomSheetBehavior bottomSheetBehavior = this.A03;
                AnonymousClass1L4 r7 = this.A09;
                C18070vi.A0W(r7);
                ((C136736uJ) r02.get()).A02(A052, bottomSheetBehavior, this, r7, (Float) null, true, true);
            }
            C18070vi.A11("mediaAttachmentUtils");
            throw null;
        }
        View view = this.A00;
        C18070vi.A0X(view);
        ImageView A0C = AnonymousClass3Ma.A0C(view, 2131430568);
        A0C.setImageResource(2131231814);
        C89934dG.A00(A0C, this, 47);
        View view2 = this.A00;
        C18070vi.A0X(view2);
        AnonymousClass3Ma.A0E(view2, 2131430567).setText(2131890076);
        if (bundle == null) {
            C34001jj A0H = AnonymousClass3Ma.A0H(this);
            Jid A0h = AnonymousClass3MW.A0h(this.A06);
            long A0K = C72453Mb.A0K(this.A07);
            C18070vi.A0d(A0h, 0);
            Bundle A0H2 = C72473Md.A0H(A0h);
            A0H2.putLong("extra_quoted_message_row_id", A0K);
            EventCreateOrEditFragment eventCreateOrEditFragment = new EventCreateOrEditFragment();
            eventCreateOrEditFragment.A1R(A0H2);
            A0H.A09(eventCreateOrEditFragment, 2131429507);
            A0H.A01();
        }
        getSupportFragmentManager().A0t(new C91374fa(this, 16), this, "RESULT");
        C28281Zt.A06(this, AnonymousClass1YL.A00(this, 2130971617, 2131102224));
        if (this.A05) {
            AnonymousClass00H r03 = this.A01;
            if (r03 != null) {
                ((C136736uJ) r03.get()).A03(this.A03, false);
                return;
            }
            C18070vi.A11("mediaAttachmentUtils");
            throw null;
        }
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = C000200d.A00(r1.A15);
            this.A01 = C000200d.A00(r1.AD5);
            this.A02 = AnonymousClass3MX.A11(A0L);
        }
    }

    public void A3K() {
        AnonymousClass00H r0 = this.A02;
        if (r0 != null) {
            AnonymousClass3MX.A0u(r0).A02(AnonymousClass3MX.A0m(this.A06), 55);
        } else {
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public void onDestroy() {
        this.A05.CGF(new C98564rM(this, 48));
        super.onDestroy();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Object obj;
        super.onActivityResult(i, i2, intent);
        if (i == 40) {
            List A042 = getSupportFragmentManager().A0U.A04();
            C18070vi.A0X(A042);
            Iterator it = A042.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (obj instanceof EventCreateOrEditFragment) {
                    break;
                }
            }
            Fragment fragment = (Fragment) obj;
            if (fragment != null) {
                fragment.A1w(i, i2, intent);
            }
        }
    }

    public EventCreationActivity(int i) {
        this.A04 = false;
        C91014f0.A00(this, 5);
    }
}
