package com.whatsapp.events;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1G4;
import X.AnonymousClass1OR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4K9;
import X.AnonymousClass4YZ;
import X.AnonymousClass4bB;
import X.AnonymousClass5NY;
import X.AnonymousClass5PM;
import X.AnonymousClass5PN;
import X.AnonymousClass5PU;
import X.C139436yq;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C29431cG;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C41561wd;
import X.C72483Me;
import X.C73193Ri;
import X.C73353Va;
import X.C82954Cu;
import X.C82984Cx;
import X.C91374fa;
import X.C91784gF;
import X.C99154sM;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.Iterator;
import java.util.List;

public final class EventInfoBottomSheet extends Hilt_EventInfoBottomSheet {
    public AnonymousClass4K9 A00;
    public WaImageView A01;
    public WaTextView A02;
    public C18000vb A03;
    public C73353Va A04;
    public final C18100vl A05;
    public final C18100vl A06;
    public final C18100vl A07 = C99154sM.A01(this, 16);
    public final C18100vl A08;
    public final C18100vl A09;

    public static final void A00(Bundle bundle, EventInfoBottomSheet eventInfoBottomSheet) {
        C18070vi.A0d(bundle, 2);
        if (bundle.getBoolean("SUCCESS")) {
            eventInfoBottomSheet.A28();
        }
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131625250, viewGroup, false);
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.A20(bundle);
        C73353Va r0 = this.A04;
        if (r0 == null) {
            C18070vi.A11("eventInfoViewModel");
            throw null;
        } else {
            bundle.putInt("STATE_CURRENT_STEP", ((AnonymousClass4YZ) r0.A0F.getValue()).A01.ordinal());
        }
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        AnonymousClass4K9 r3 = this.A00;
        if (r3 != null) {
            Object value = this.A07.getValue();
            Object value2 = this.A09.getValue();
            C18070vi.A0j(value, value2);
            this.A04 = (C73353Va) C91784gF.A00(this, value, r3, value2, 2).A00(C73353Va.class);
            this.A01 = AnonymousClass3MW.A0R(view, 2131430589);
            this.A02 = AnonymousClass3MW.A0T(view, 2131430587);
            C37581pm A0G = AnonymousClass3MZ.A0G(this);
            Integer A0w = AnonymousClass3MW.A0w(AnonymousClass1OR.A00, new EventInfoBottomSheet$onViewCreated$1(this, (C30391dr) null), A0G);
            if (this.A06.getValue() == C82954Cu.MAIN && bundle == null) {
                C73353Va r32 = this.A04;
                if (r32 == null) {
                    C18070vi.A11("eventInfoViewModel");
                    throw null;
                } else {
                    C30451dy.A02(A0w, r32.A0D, new EventInfoViewModel$logNavigateToEventInfo$1(r32, (C30391dr) null), C41561wd.A00(r32));
                }
            }
            A1E().A0t(new C91374fa(this, 17), this, "RESULT");
            return;
        }
        C18070vi.A11("eventInfoViewModelFactory");
        throw null;
    }

    public static final void A01(EventInfoBottomSheet eventInfoBottomSheet) {
        if (eventInfoBottomSheet.A06.getValue() == C82954Cu.EDIT) {
            eventInfoBottomSheet.A28();
            return;
        }
        C73353Va r0 = eventInfoBottomSheet.A04;
        if (r0 == null) {
            C18070vi.A11("eventInfoViewModel");
            throw null;
        } else {
            r0.A0T();
        }
    }

    public void A1s() {
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            waImageView.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        this.A02 = null;
        super.A1s();
    }

    public boolean A2J() {
        C73353Va r0 = this.A04;
        if (r0 != null) {
            if (((AnonymousClass4YZ) r0.A0F.getValue()).A01 != C82954Cu.EDIT) {
                return false;
            }
            List A042 = A1E().A0U.A04();
            C18070vi.A0X(A042);
            Fragment fragment = (Fragment) C29431cG.A0e(A042);
            if (!(fragment instanceof EventCreateOrEditFragment) || !((EventCreateOrEditFragment) fragment).A26()) {
                C73353Va r02 = this.A04;
                if (r02 != null) {
                    r02.A0T();
                    return true;
                }
            } else {
                A02(this);
                return true;
            }
        }
        C18070vi.A11("eventInfoViewModel");
        throw null;
    }

    public EventInfoBottomSheet() {
        Integer num = AnonymousClass00R.A0C;
        this.A05 = AnonymousClass1DF.A00(num, new AnonymousClass5NY(this));
        this.A08 = AnonymousClass1DF.A00(num, new AnonymousClass5PU(this, "extra_quoted_message_row_id"));
        this.A06 = AnonymousClass1DF.A00(num, new AnonymousClass5PM(this, C82954Cu.MAIN));
        this.A09 = AnonymousClass1DF.A00(num, new AnonymousClass5PN(this, C82984Cx.NONE));
    }

    public static final void A02(EventInfoBottomSheet eventInfoBottomSheet) {
        C73193Ri A002 = C73193Ri.A00(eventInfoBottomSheet.A14());
        A002.A0V(2131889620);
        A002.A0U(2131889617);
        A002.A0X(new AnonymousClass4bB(eventInfoBottomSheet, 1), 2131889618);
        C73193Ri.A01(A002, 19, 2131889619);
        AnonymousClass3MY.A1G(A002);
    }

    public void A1Q(Bundle bundle) {
        Object value;
        AnonymousClass4YZ r0;
        super.A1Q(bundle);
        if (bundle != null) {
            int i = bundle.getInt("STATE_CURRENT_STEP");
            if (Integer.valueOf(i) != null) {
                C82954Cu r5 = C82954Cu.values()[i];
                C73353Va r02 = this.A04;
                if (r02 == null) {
                    C18070vi.A11("eventInfoViewModel");
                    throw null;
                }
                C18070vi.A0d(r5, 0);
                AnonymousClass1G4 r2 = r02.A0E;
                do {
                    value = r2.getValue();
                    r0 = (AnonymousClass4YZ) value;
                } while (!r2.BFK(value, new AnonymousClass4YZ(r0.A00, r5, r0.A03, r0.A02, false)));
            }
        }
    }

    public void A1w(int i, int i2, Intent intent) {
        Object obj;
        super.A1w(i, i2, intent);
        List A042 = A1E().A0U.A04();
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

    public void A2I(C139436yq r1) {
        C72483Me.A13(r1);
    }

    public int A25() {
        return 2132083615;
    }
}
