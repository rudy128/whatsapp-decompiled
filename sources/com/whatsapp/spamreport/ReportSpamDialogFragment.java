package com.whatsapp.spamreport;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass12Q;
import X.AnonymousClass18K;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1ED;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass627;
import X.AnonymousClass78H;
import X.AnonymousClass7AS;
import X.AnonymousClass81A;
import X.AnonymousClass81B;
import X.C108945cZ;
import X.C108955ca;
import X.C108985cd;
import X.C136876uY;
import X.C146527Pl;
import X.C153367pP;
import X.C153377pQ;
import X.C153387pR;
import X.C153397pS;
import X.C153407pT;
import X.C153417pU;
import X.C153427pV;
import X.C153437pW;
import X.C153447pX;
import X.C153457pY;
import X.C153467pZ;
import X.C153477pa;
import X.C1602987x;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19830z4;
import X.C22941Dw;
import X.C22971Dz;
import X.C23761Hn;
import X.C24921Me;
import X.C26031Qo;
import X.C30391dr;
import X.C30451dy;
import X.C33971jg;
import X.C34581kj;
import X.C36401np;
import X.C39401t1;
import X.C61562pt;
import X.C678631d;
import X.C72453Mb;
import X.C87904Xn;
import X.C98844ro;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

public final class ReportSpamDialogFragment extends Hilt_ReportSpamDialogFragment {
    public AnonymousClass190 A00;
    public AnonymousClass1KB A01;
    public AnonymousClass1M9 A02;
    public C24921Me A03;
    public C136876uY A04;
    public AnonymousClass11C A05;
    public AnonymousClass118 A06;
    public C19830z4 A07;
    public C26031Qo A08;
    public AnonymousClass1CJ A09;
    public AnonymousClass1MZ A0A;
    public AnonymousClass18K A0B;
    public C87904Xn A0C;
    public C1602987x A0D;
    public C36401np A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public WeakReference A0N;
    public WeakReference A0O;
    public WeakReference A0P;
    public boolean A0Q;
    public boolean A0R;
    public final C18100vl A0S = AnonymousClass1DF.A01(new C153367pP(this));
    public final C18100vl A0T = AnonymousClass1DF.A01(new C153377pQ(this));
    public final C18100vl A0U = AnonymousClass1DF.A01(new C153387pR(this));
    public final C18100vl A0V = AnonymousClass1DF.A01(new C153397pS(this));
    public final C18100vl A0W = AnonymousClass1DF.A01(new C153407pT(this));
    public final C18100vl A0X = AnonymousClass1DF.A01(new C153417pU(this));
    public final C18100vl A0Y = AnonymousClass1DF.A01(new C153427pV(this));
    public final C18100vl A0Z = AnonymousClass1DF.A01(new C153437pW(this));
    public final C18100vl A0a = AnonymousClass1DF.A01(new C153447pX(this));
    public final C18100vl A0b = AnonymousClass1DF.A01(new C153457pY(this));
    public final C18100vl A0c = AnonymousClass1DF.A01(new C153467pZ(this));
    public final C18100vl A0d = AnonymousClass1DF.A01(new C153477pa(this));
    public final C678631d A0e = ((C678631d) AnonymousClass12Q.A01(16501));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Window window;
        C18070vi.A0d(layoutInflater, 0);
        int i = 2131626980;
        if (A06(this)) {
            i = 2131627261;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        Dialog dialog = this.A03;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            AnonymousClass3Ma.A1H(window, C108955ca.A01(A14()));
        }
        C18070vi.A0b(inflate);
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        C34581kj r1;
        C18070vi.A0d(view, 0);
        this.A0O = AnonymousClass3MW.A0z(view.findViewById(2131434555));
        this.A0N = AnonymousClass3MW.A0z(view.findViewById(2131434554));
        this.A0P = AnonymousClass3MW.A0z(view.findViewById(2131434557));
        if (C72453Mb.A1a(this.A0W)) {
            Fragment fragment = this.A0E;
            if ((fragment instanceof C34581kj) && (r1 = (C34581kj) fragment) != null) {
                r1.BrY(true);
            }
        }
        C18100vl r3 = this.A0d;
        AnonymousClass7AS.A00(this, ((ReportSpamDialogViewModel) r3.getValue()).A01, new AnonymousClass81A(this), 16);
        AnonymousClass7AS.A00(this, ((ReportSpamDialogViewModel) r3.getValue()).A02, new AnonymousClass81B(this), 16);
        ReportSpamDialogViewModel reportSpamDialogViewModel = (ReportSpamDialogViewModel) r3.getValue();
        AnonymousClass1BI A0m = AnonymousClass3MX.A0m(this.A0S);
        boolean A1a = C72453Mb.A1a(this.A0U);
        String A0n = C108985cd.A0n(this);
        int A0I2 = C72453Mb.A0I(this.A0b);
        boolean A1a2 = C72453Mb.A1a(this.A0Z);
        boolean A1a3 = C72453Mb.A1a(this.A0V);
        AnonymousClass3MX.A1Q(new ReportSpamDialogViewModel$initializeSpamDialog$1(A0m, (UserJid) this.A0Y.getValue(), (AnonymousClass205) this.A0X.getValue(), reportSpamDialogViewModel, A0n, (C30391dr) null, A0I2, A1a2, A1a3, A1a), C72453Mb.A12(reportSpamDialogViewModel, A0m));
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        C61562pt A0U2 = C108985cd.A0U(this);
        String A0y = AnonymousClass3MW.A0y(this.A0T);
        C18070vi.A0X(A0y);
        AnonymousClass1BI A0m = AnonymousClass3MX.A0m(this.A0S);
        C18070vi.A0h(A0y, A0m);
        C61562pt.A00(A0U2, A0m, A0y, 2);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C34581kj r1;
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        if (C72453Mb.A1a(this.A0W)) {
            Fragment fragment = this.A0E;
            if ((fragment instanceof C34581kj) && (r1 = (C34581kj) fragment) != null) {
                r1.BrY(false);
            }
        }
        if (!this.A0R && C18070vi.A18(this.A0T.getValue(), "status_post_report")) {
            AnonymousClass627 r12 = new AnonymousClass627();
            r12.A00 = C17880vN.A0i();
            AnonymousClass18K r0 = this.A0B;
            if (r0 != null) {
                r0.CC7(r12);
            } else {
                C18070vi.A11("wamRuntime");
                throw null;
            }
        }
    }

    public static final void A02(ReportSpamDialogFragment reportSpamDialogFragment) {
        AnonymousClass1KB A2H;
        int i;
        if (C72453Mb.A1a(reportSpamDialogFragment.A0V)) {
            A2H = reportSpamDialogFragment.A2H();
            i = 2131896936;
        } else if (A06(reportSpamDialogFragment)) {
            A2H = reportSpamDialogFragment.A2H();
            i = 2131896937;
        } else if (!reportSpamDialogFragment.A0Q) {
            reportSpamDialogFragment.A2H().A0J(new C98844ro((Object) reportSpamDialogFragment, 48));
            return;
        } else {
            return;
        }
        A2H.A09(i, 1);
    }

    public static final void A03(ReportSpamDialogFragment reportSpamDialogFragment, boolean z) {
        View A0O2;
        WeakReference weakReference = reportSpamDialogFragment.A0O;
        View view = null;
        if (weakReference != null) {
            view = C108945cZ.A0O(weakReference);
        }
        int i = 0;
        if (view != null) {
            view.setVisibility(C72453Mb.A07(z ? 1 : 0));
        }
        WeakReference weakReference2 = reportSpamDialogFragment.A0N;
        if (weakReference2 != null && (A0O2 = C108945cZ.A0O(weakReference2)) != null) {
            if (!(!z)) {
                i = 8;
            }
            A0O2.setVisibility(i);
        }
    }

    public static final boolean A04(AnonymousClass1E7 r2, ReportSpamDialogFragment reportSpamDialogFragment) {
        C19830z4 r1 = reportSpamDialogFragment.A07;
        if (r1 != null) {
            int A0N2 = r1.A0N("privacy_groupadd");
            if (r2.A0F() && A0N2 == 0) {
                C18030ve r12 = reportSpamDialogFragment.A02;
                C18040vf r22 = C18040vf.A02;
                if (C18020vd.A05(r22, r12, 4314) || !C18020vd.A05(r22, reportSpamDialogFragment.A02, 3995)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        C18070vi.A11("waSharedPreferences");
        throw null;
    }

    public static final boolean A05(AnonymousClass1EC r1, ReportSpamDialogFragment reportSpamDialogFragment) {
        String str;
        AnonymousClass00H r0 = reportSpamDialogFragment.A0G;
        if (r0 != null) {
            if (AnonymousClass3MW.A0Z(r0).A05(r1) != null) {
                AnonymousClass1CJ r02 = reportSpamDialogFragment.A09;
                if (r02 == null) {
                    str = "chatsCache";
                } else if (r02.A0R(r1)) {
                    AnonymousClass1MZ r03 = reportSpamDialogFragment.A0A;
                    if (r03 == null) {
                        str = "groupParticipantsManager";
                    } else if (!r03.A0J(r1)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }
        str = "communityChatManager";
        C18070vi.A11(str);
        throw null;
    }

    public static final boolean A06(ReportSpamDialogFragment reportSpamDialogFragment) {
        if (!C18020vd.A05(C18040vf.A02, reportSpamDialogFragment.A02, 6186)) {
            return false;
        }
        C18100vl r1 = reportSpamDialogFragment.A0S;
        if (C22971Dz.A0d((Jid) r1.getValue()) || C22971Dz.A0a((Jid) r1.getValue())) {
            return true;
        }
        return false;
    }

    public final AnonymousClass1KB A2H() {
        AnonymousClass1KB r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1C();
        throw null;
    }

    public static final Object A00(AnonymousClass1E7 r4, ReportSpamDialogFragment reportSpamDialogFragment, C30391dr r6) {
        boolean z;
        AnonymousClass1EC r3;
        if (!reportSpamDialogFragment.A15().getBoolean("shouldDisplayUpsellCheckbox") || C72453Mb.A1a(reportSpamDialogFragment.A0V)) {
            z = true;
        } else {
            AnonymousClass1BI r32 = r4.A0J;
            if ((r32 instanceof AnonymousClass1EC) && (r3 = (AnonymousClass1EC) r32) != null) {
                return C30451dy.A00(r6, C23761Hn.A01, new ReportSpamDialogFragment$shouldHideCheckBoxContainer$2(r4, r3, reportSpamDialogFragment, (C30391dr) null));
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final void A01(AnonymousClass1E7 r8, AnonymousClass1E7 r9, AnonymousClass1E7 r10, AnonymousClass206 r11, ReportSpamDialogFragment reportSpamDialogFragment, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str, boolean z) {
        View A0O2;
        String str2;
        View A0O3;
        String A0o;
        ReportSpamDialogFragment reportSpamDialogFragment2 = reportSpamDialogFragment;
        boolean A062 = A06(reportSpamDialogFragment);
        WeakReference weakReference = reportSpamDialogFragment.A0N;
        Integer num = null;
        if (weakReference == null || (A0O2 = C108945cZ.A0O(weakReference)) == null) {
            throw C17890vO.A0K();
        }
        C72453Mb.A1F(A0O2, charSequence, 2131434563);
        TextView A0E2 = C17880vN.A0E(A0O2, 2131434556);
        if (A062) {
            AnonymousClass3Ma.A1I(A0E2, reportSpamDialogFragment.A02);
            Rect rect = C39401t1.A0A;
            AnonymousClass11C r0 = reportSpamDialogFragment.A05;
            if (r0 != null) {
                AnonymousClass3MZ.A1Q(A0E2, r0);
            } else {
                str2 = "systemServices";
                C18070vi.A11(str2);
                throw null;
            }
        }
        A0E2.setText(charSequence2);
        if (A062) {
            String str3 = str;
            if (str == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("ReportSpamDialogFragment/redesigned checkBoxTitle - null name, contact type is: ");
                AnonymousClass1BI r02 = r8.A0J;
                if (r02 != null) {
                    num = Integer.valueOf(r02.getType());
                }
                A10.append(num);
                C17890vO.A0w(A10);
            } else {
                C22941Dw r03 = UserJid.Companion;
                if (C22971Dz.A0S(AnonymousClass3MZ.A0w(r8))) {
                    Object[] objArr = new Object[1];
                    AnonymousClass00H r04 = reportSpamDialogFragment.A0J;
                    if (r04 != null) {
                        UserJid A0w = AnonymousClass3MZ.A0w(r8);
                        C18070vi.A0z(A0w, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
                        A0o = AnonymousClass3MX.A16(reportSpamDialogFragment, ((C33971jg) r04.get()).A01((AnonymousClass1ED) A0w), objArr, 0, 2131895189);
                    } else {
                        str2 = "interopUiCache";
                        C18070vi.A11(str2);
                        throw null;
                    }
                } else {
                    A0o = AnonymousClass3MY.A0o(reportSpamDialogFragment, str3, 0, 2131895188);
                }
                C18070vi.A0b(A0o);
                C72453Mb.A1F(A0O2, A0o, 2131428210);
            }
        }
        C72453Mb.A1F(A0O2, charSequence3, 2131428209);
        if (z) {
            WeakReference weakReference2 = reportSpamDialogFragment.A0N;
            if (weakReference2 == null || (A0O3 = C108945cZ.A0O(weakReference2)) == null) {
                throw C17890vO.A0K();
            }
            A0O3.findViewById(2131428217).setVisibility(8);
            ((CompoundButton) A0O3.findViewById(2131428208)).setChecked(false);
        } else {
            ((CompoundButton) A0O2.findViewById(2131428208)).setChecked(reportSpamDialogFragment.A15().getBoolean("upsellCheckboxActionDefault"));
        }
        AnonymousClass3MZ.A1P(A0O2.findViewById(2131434553), reportSpamDialogFragment, r8, 25);
        A0O2.findViewById(2131434558).setOnClickListener(new AnonymousClass78H(reportSpamDialogFragment2, r8, r9, r10, r11, 7));
        reportSpamDialogFragment2.A04.CGF(new C146527Pl(reportSpamDialogFragment2, r8, 37));
    }
}
