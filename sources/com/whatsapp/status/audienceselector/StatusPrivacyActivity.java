package com.whatsapp.status.audienceselector;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11J;
import X.AnonymousClass178;
import X.AnonymousClass1DF;
import X.AnonymousClass1F9;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1J8;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass48o;
import X.AnonymousClass6LG;
import X.AnonymousClass72B;
import X.AnonymousClass77K;
import X.AnonymousClass77S;
import X.AnonymousClass7PH;
import X.AnonymousClass7RH;
import X.C000200d;
import X.C003401n;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108985cd;
import X.C109005cf;
import X.C123626Ve;
import X.C124616Za;
import X.C126406cg;
import X.C131646lR;
import X.C133776pT;
import X.C1404671n;
import X.C1405571y;
import X.C1423279a;
import X.C1423479c;
import X.C153557pi;
import X.C1605989c;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C217517g;
import X.C23291Fl;
import X.C23391Fw;
import X.C23401Fx;
import X.C24641Lc;
import X.C24661Le;
import X.C25001Mm;
import X.C30141dS;
import X.C32741hg;
import X.C35511mM;
import X.C41911xI;
import X.C56422hR;
import X.C59732mn;
import X.C72453Mb;
import X.C90594eK;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.CompoundButton;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.list.footer.WDSSectionFooter;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;
import java.util.ArrayList;
import java.util.List;

public final class StatusPrivacyActivity extends AnonymousClass1FY implements C23291Fl, AnonymousClass11J {
    public AnonymousClass02n A00;
    public C56422hR A01;
    public C124616Za A02;
    public C25001Mm A03;
    public C41911xI A04;
    public AnonymousClass77K A05;
    public C24661Le A06;
    public C90594eK A07;
    public C24641Lc A08;
    public C32741hg A09;
    public C1605989c A0A;
    public C35511mM A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public C1404671n A0M;
    public boolean A0N;
    public final C18100vl A0O;
    public final C126406cg A0P;
    public final C131646lR A0Q;
    public final AnonymousClass00H A0R;

    private final void A03() {
        boolean isChecked;
        int i;
        C1404671n r1 = this.A0M;
        List list = null;
        if (r1 == null) {
            C18070vi.A11("radioOptionsHelper");
            throw null;
        }
        if (r1.A03.A04()) {
            isChecked = false;
        } else {
            isChecked = ((CompoundButton) AnonymousClass3MX.A14(r1.A09)).isChecked();
        }
        if (isChecked) {
            i = 0;
        } else {
            AnonymousClass77K r0 = this.A05;
            if (r0 != null) {
                i = r0.A00;
                if (i == 1) {
                    list = r0.A01;
                } else {
                    list = r0.A02;
                }
            } else {
                Intent intent = getIntent();
                C18070vi.A0X(intent);
                setResult(-1, C123626Ve.A00(intent));
                finish();
                return;
            }
        }
        boolean A052 = C18020vd.A05(C18040vf.A01, this.A0E, 2531);
        C108965cb.A17(this);
        int i2 = -1;
        if (A052) {
            i2 = 1;
        }
        AnonymousClass10I r12 = this.A05;
        C56422hR r2 = this.A01;
        if (r2 != null) {
            AnonymousClass3MW.A1T(r2.A00(this, list, i, i2, 2131896392, 300, true, true, false, true, true), r12, 0);
        } else {
            C18070vi.A11("saveStatusFactory");
            throw null;
        }
    }

    public C90594eK BZQ(int i, int i2, boolean z) {
        View view = this.A00;
        ArrayList A0t = C108965cb.A0t(view);
        AnonymousClass11C r5 = this.A08;
        C18070vi.A0W(r5);
        C90594eK r2 = new C90594eK(view, (AnonymousClass1F9) this, r5, (List) A0t, i, i2, z);
        this.A07 = r2;
        r2.A07(new AnonymousClass7RH((Object) this, 7));
        C90594eK r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C17890vO.A0K();
    }

    public void Bps(C59732mn r3) {
        String str;
        C18070vi.A0d(r3, 0);
        if (r3.A02) {
            AnonymousClass00H r0 = this.A0J;
            if (r0 == null) {
                str = "xFamilyCrosspostManager";
            } else if (((C133776pT) C108945cZ.A12(r0).A0C.get()).A00()) {
                AnonymousClass00H r02 = this.A0K;
                if (r02 == null) {
                    str = "xFamilyGating";
                } else if (C108985cd.A1a(r02)) {
                    AnonymousClass7RH.A01(this.A05, this, 6);
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (AnonymousClass3MY.A01(menuItem, 0) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A03();
        return false;
    }

    public void A2y() {
        if (!this.A0N) {
            this.A0N = true;
            AnonymousClass1K1 A0K2 = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K2, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r2 = A0A2.A00;
            C109005cf.A0d(A0A2, r2, this);
            C109005cf.A0e(A0A2, r2, this, r2.A5A);
            this.A0C = C000200d.A00(r2.A4e);
            this.A0D = C000200d.A00(A0A2.ADa);
            this.A0E = C000200d.A00(A0A2.ADb);
            this.A0F = C000200d.A00(A0A2.A34);
            this.A0B = C108965cb.A0h(A0A2);
            this.A0G = C000200d.A00(A0K2.A3z);
            this.A01 = (C56422hR) A0K2.A2t.get();
            this.A08 = C108965cb.A0X(A0A2);
            this.A0H = C000200d.A00(A0K2.A5r);
            this.A02 = (C124616Za) A0K2.A3W.get();
            this.A06 = C108955ca.A0M(A0A2);
            this.A09 = C108965cb.A0Z(A0A2);
            this.A04 = (C41911xI) A0A2.AAl.get();
            this.A03 = (C25001Mm) A0A2.ABf.get();
            this.A0I = C000200d.A00(A0A2.ABv);
            this.A0J = C000200d.A00(r2.A5I);
            this.A0K = C000200d.A00(A0A2.AC9);
            this.A0L = C000200d.A00(A0A2.Anv);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0) {
            if (i2 == -1 && intent != null) {
                this.A05 = null;
            }
            C1404671n r1 = this.A0M;
            if (r1 == null) {
                C18070vi.A11("radioOptionsHelper");
                throw null;
            } else {
                r1.A02(this.A05);
            }
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARNING: type inference failed for: r1v15, types: [java.lang.Object, X.02h] */
    public void onCreate(Bundle bundle) {
        String str;
        C18100vl r0;
        int A052;
        super.onCreate(bundle);
        setContentView(2131627053);
        C003401n A0J2 = AnonymousClass3MY.A0J(this);
        C18070vi.A0X(A0J2);
        A0J2.A0W(true);
        A0J2.A0M(2131899454);
        ViewStub viewStub = (ViewStub) AnonymousClass3MY.A0C(this, 2131435072);
        int i = 2131627059;
        if (AnonymousClass1J8.A06(this.A0E)) {
            i = 2131627597;
        }
        View A0G2 = AnonymousClass3MY.A0G(viewStub, i);
        if (A0G2 instanceof WDSSectionHeader) {
            WDSSectionHeader wDSSectionHeader = (WDSSectionHeader) A0G2;
            C24641Lc r02 = this.A08;
            if (r02 != null) {
                boolean A042 = r02.A04();
                int i2 = 2131895635;
                if (A042) {
                    i2 = 2131895633;
                }
                wDSSectionHeader.setHeaderText(i2);
            }
            str = "statusConfig";
            C18070vi.A11(str);
            throw null;
        }
        ViewStub viewStub2 = (ViewStub) AnonymousClass3MY.A0C(this, 2131435073);
        C24641Lc r03 = this.A08;
        if (r03 != null) {
            boolean A043 = r03.A04();
            int i3 = 2131627060;
            if (A043) {
                i3 = 2131627061;
            }
            viewStub2.setLayoutResource(i3);
            viewStub2.inflate();
            ViewStub viewStub3 = (ViewStub) AnonymousClass3MY.A0C(this, 2131435071);
            int i4 = 2131627058;
            if (AnonymousClass1J8.A06(this.A0E)) {
                i4 = 2131627594;
            }
            View A0G3 = AnonymousClass3MY.A0G(viewStub3, i4);
            if (A0G3 instanceof WDSSectionFooter) {
                ((WDSSectionFooter) A0G3).setFooterText(2131895627);
            }
            C124616Za r1 = this.A02;
            if (r1 != null) {
                View A0H2 = AnonymousClass3MY.A0H(this, 2131435073);
                AnonymousClass10E r04 = r1.A00.A01;
                C1404671n r4 = new C1404671n(A0H2, C108955ca.A0M(r04), AnonymousClass10E.A8r(r04), C108965cb.A0X(r04));
                this.A0M = r4;
                AnonymousClass77K r3 = this.A05;
                C131646lR r2 = this.A0Q;
                C18070vi.A0d(r2, 1);
                if (r4.A03.A04()) {
                    if (r3 != null) {
                        A052 = r3.A00;
                    } else {
                        A052 = r4.A01.A05();
                    }
                    if (A052 == 0) {
                        StatusPrivacyActivity statusPrivacyActivity = r2.A00;
                        AnonymousClass10I r12 = statusPrivacyActivity.A05;
                        C56422hR r6 = statusPrivacyActivity.A01;
                        if (r6 != null) {
                            AnonymousClass3MW.A1T(r6.A00(statusPrivacyActivity, C18460wS.A00, 2, -1, 0, 0, true, false, false, false, true), r12, 0);
                        } else {
                            str = "saveStatusFactory";
                        }
                    }
                    C18100vl r7 = r4.A04;
                    C72453Mb.A0X(r7).setText(2131895630);
                    C18100vl r62 = r4.A0B;
                    C72453Mb.A0X(r62).setText(2131895631);
                    AnonymousClass3MZ.A1P(C72453Mb.A0T(r7), r4, r2, 30);
                    AnonymousClass3MZ.A1P(C72453Mb.A0T(r62), r4, r2, 31);
                    AnonymousClass6LG.A00(C72453Mb.A0T(r4.A07), r2, 0);
                    r0 = r4.A0A;
                } else {
                    C18100vl r8 = r4.A09;
                    C72453Mb.A0X(r8).setText(2131895628);
                    C18100vl r72 = r4.A06;
                    C72453Mb.A0X(r72).setText(2131895625);
                    C18100vl r63 = r4.A05;
                    C72453Mb.A0X(r63).setText(2131895636);
                    AnonymousClass3MZ.A1P(C72453Mb.A0T(r8), r4, r2, 27);
                    AnonymousClass3MZ.A1P(C72453Mb.A0T(r72), r4, r2, 28);
                    AnonymousClass3MZ.A1P(C72453Mb.A0T(r63), r4, r2, 29);
                    AnonymousClass6LG.A00(C72453Mb.A0T(r4.A07), r2, 0);
                    r0 = r4.A08;
                }
                AnonymousClass48o.A00(C72453Mb.A0T(r0), r2, 49);
                r4.A02(r3);
                this.A00 = CDw(new C1423479c(this, 9), new Object());
                this.A0A = new AnonymousClass7PH(this);
                C24661Le r05 = this.A06;
                if (r05 != null) {
                    if (!r05.A0I()) {
                        AnonymousClass7RH.A01(this.A05, this, 8);
                    }
                    ((AnonymousClass178) this.A0R.get()).A01(this);
                    this.A07.registerObserver(this);
                    AnonymousClass00H r06 = this.A0F;
                    if (r06 != null) {
                        AnonymousClass72B r32 = (AnonymousClass72B) r06.get();
                        if ((((C133776pT) r32.A03.getValue()).A00() && ((C30141dS) r32.A04.getValue()).A00()) || WfalManager.A00((WfalManager) r32.A02.getValue(), true)) {
                            AnonymousClass00H r07 = this.A0H;
                            if (r07 != null) {
                                r07.get();
                                ViewStub viewStub4 = (ViewStub) this.A0O.getValue();
                                C18070vi.A0d(viewStub4, 0);
                                viewStub4.setLayoutResource(2131627055);
                                viewStub4.inflate();
                                AnonymousClass00H r08 = this.A0H;
                                if (r08 != null) {
                                    C1405571y r42 = (C1405571y) C18070vi.A0E(r08);
                                    AnonymousClass02n r33 = this.A00;
                                    if (r33 == null) {
                                        str = "crosspostAccountUnlinkingActivityResultLauncher";
                                    } else {
                                        C1605989c r09 = this.A0A;
                                        if (r09 == null) {
                                            str = "crosspostAccountLinkingResultListener";
                                        } else {
                                            r42.A02(r33, this, (AnonymousClass77S) null, r09);
                                            AnonymousClass00H r010 = this.A0E;
                                            if (r010 != null) {
                                                C17880vN.A0V(r010).registerObserver(this.A0P);
                                            } else {
                                                C18070vi.A11("autoCrosspostSettingsObservers");
                                                throw null;
                                            }
                                        }
                                    }
                                }
                            }
                            str = "statusPrivacyCrosspostingSettingHandler";
                        }
                        AnonymousClass00H r011 = this.A0F;
                        if (r011 != null) {
                            AnonymousClass72B r13 = (AnonymousClass72B) r011.get();
                            if (((C30141dS) r13.A04.getValue()).A00() && ((C35511mM) r13.A00.getValue()).A06(AnonymousClass00R.A0S)) {
                                AnonymousClass7RH.A01(this.A05, this, 9);
                                return;
                            }
                            return;
                        }
                    }
                    str = "crosspostMigrationManagerLazy";
                } else {
                    str = "statusStore";
                }
            } else {
                str = "statusPrivacyRadioOptionsHelperFactory";
            }
            C18070vi.A11(str);
            throw null;
        }
        str = "statusConfig";
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        Log.i("StatusPrivacyActivity/onDestroy");
        super.onDestroy();
        ((AnonymousClass178) this.A0R.get()).A02(this);
        this.A07.unregisterObserver(this);
        AnonymousClass00H r0 = this.A0E;
        if (r0 != null) {
            C17880vN.A0V(r0).unregisterObserver(this.A0P);
        } else {
            C18070vi.A11("autoCrosspostSettingsObservers");
            throw null;
        }
    }

    public StatusPrivacyActivity(int i) {
        this.A0N = false;
        C1423279a.A00(this, 40);
    }

    public C23401Fx BPx() {
        return ((C23391Fw) getLifecycle()).A02;
    }

    public String BSb() {
        return "status_privacy_activity";
    }

    public void onBackPressed() {
        A03();
    }

    public StatusPrivacyActivity() {
        this(0);
        this.A0R = C217517g.A00(16503);
        this.A0O = AnonymousClass1DF.A01(new C153557pi(this));
        this.A0P = new C126406cg(this);
        this.A0Q = new C131646lR(this);
    }
}
