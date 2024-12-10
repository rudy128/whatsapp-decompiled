package com.whatsapp.conversation.selection;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass205;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3U8;
import X.AnonymousClass3uP;
import X.AnonymousClass5H9;
import X.AnonymousClass5HA;
import X.AnonymousClass5SD;
import X.AnonymousClass5ZI;
import X.C000200d;
import X.C000400h;
import X.C006602x;
import X.C108605by;
import X.C1193267r;
import X.C18010vc;
import X.C18070vi;
import X.C18100vl;
import X.C19880zA;
import X.C33251iW;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C80053wT;
import X.C80133wd;
import X.C84324Jb;
import X.C91004ez;
import X.C91644g1;
import X.C91774gE;
import X.C98554rL;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.whatsapp.reactions.ReactionsTrayViewModel;

public final class SingleSelectedMessageActivity extends C80133wd {
    public C19880zA A00;
    public C84324Jb A01;
    public C33251iW A02;
    public C80053wT A03;
    public AnonymousClass3U8 A04;
    public C1193267r A05;
    public C18010vc A06;
    public ReactionsTrayViewModel A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public Boolean A0B;
    public boolean A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;

    public SingleSelectedMessageActivity() {
        this(0);
        this.A0D = AnonymousClass1DF.A01(new AnonymousClass5H9(this));
        this.A0E = AnonymousClass1DF.A01(new AnonymousClass5HA(this));
    }

    public void A2y() {
        if (!this.A0C) {
            this.A0C = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r3 = r1.A00;
            AnonymousClass1FB.A0K(r1, r3, this, r3.A45);
            AnonymousClass1FB.A0L(r1, r3, this, r3.A5A);
            this.A04 = AnonymousClass3Ma.A0W(A0K);
            this.A03 = (AnonymousClass5ZI) A0K.A2I.get();
            this.A00 = AnonymousClass3MZ.A0M(r1.A12);
            this.A08 = C000200d.A00(A0K.A10);
            this.A09 = C000200d.A00(r3.A1c);
            this.A0A = C000200d.A00(r3.A1h);
            this.A05 = AnonymousClass3MZ.A0t(r1);
            this.A06 = AnonymousClass3Ma.A0r(r1);
            this.A01 = (C84324Jb) A0K.A2m.get();
            this.A02 = AnonymousClass3MZ.A0U(r1);
        }
    }

    public void A3J() {
        AnonymousClass1BI r1;
        C108605by AHr = ((C006602x) C000400h.A00(C006602x.class, this)).AHr();
        Resources.Theme theme = getTheme();
        C18070vi.A0X(theme);
        AnonymousClass205 r0 = (AnonymousClass205) this.A0E.getValue();
        if (r0 != null) {
            r1 = r0.A00;
        } else {
            r1 = null;
        }
        AHr.CB2(theme, r1, false);
    }

    public void A4e() {
        if (this.A0B != null) {
            super.A4e();
        } else {
            this.A05.CGF(new C98554rL(this, 2));
        }
    }

    public void onBackPressed() {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A07;
        if (reactionsTrayViewModel != null) {
            if (C72463Mc.A0A(reactionsTrayViewModel.A0F) == 2) {
                ReactionsTrayViewModel reactionsTrayViewModel2 = this.A07;
                if (reactionsTrayViewModel2 != null) {
                    reactionsTrayViewModel2.A0U(0);
                    return;
                }
            } else {
                super.onBackPressed();
                return;
            }
        }
        C18070vi.A11("reactionsTrayViewModel");
        throw null;
    }

    public static final void A03(SingleSelectedMessageActivity singleSelectedMessageActivity, boolean z) {
        singleSelectedMessageActivity.A0B = Boolean.valueOf(z);
        super.A4e();
    }

    public void A4d() {
        super.A4d();
        AnonymousClass3uP r2 = this.A02;
        if (r2 != null) {
            r2.post(new C98554rL(this, 5));
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Object value = this.A0E.getValue();
        if (value == null) {
            setResult(0, (Intent) null);
            finish();
            return;
        }
        ReactionsTrayViewModel reactionsTrayViewModel = (ReactionsTrayViewModel) AnonymousClass3MW.A0N(this).A00(ReactionsTrayViewModel.class);
        this.A07 = reactionsTrayViewModel;
        if (reactionsTrayViewModel == null) {
            C18070vi.A11("reactionsTrayViewModel");
            throw null;
        }
        C91644g1.A00(this, reactionsTrayViewModel.A0G, new AnonymousClass5SD(this), 24);
        C84324Jb r1 = this.A01;
        if (r1 != null) {
            AnonymousClass3U8 r0 = (AnonymousClass3U8) C91774gE.A00(this, value, r1, 6).A00(AnonymousClass3U8.class);
            this.A04 = r0;
            if (r0 == null) {
                str = "singleSelectedMessageViewModel";
            } else {
                C91644g1.A00(this, r0.A00, AnonymousClass3MW.A16(this, 42), 24);
                ReactionsTrayViewModel reactionsTrayViewModel2 = this.A07;
                if (reactionsTrayViewModel2 != null) {
                    C91644g1.A00(this, reactionsTrayViewModel2.A0F, AnonymousClass3MW.A16(this, 43), 24);
                    ReactionsTrayViewModel reactionsTrayViewModel3 = this.A07;
                    if (reactionsTrayViewModel3 != null) {
                        C91644g1.A00(this, reactionsTrayViewModel3.A0H, AnonymousClass3MW.A16(this, 44), 24);
                        return;
                    }
                }
                C18070vi.A11("reactionsTrayViewModel");
                throw null;
            }
        } else {
            str = "singleSelectedMessageViewModelFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public SingleSelectedMessageActivity(int i) {
        this.A0C = false;
        C91004ez.A00(this, 37);
    }
}
