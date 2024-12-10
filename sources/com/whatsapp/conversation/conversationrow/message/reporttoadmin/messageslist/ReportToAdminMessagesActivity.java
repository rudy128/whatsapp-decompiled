package com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1F9;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1K2;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3Uj;
import X.AnonymousClass3X5;
import X.AnonymousClass3uW;
import X.AnonymousClass48j;
import X.AnonymousClass4JC;
import X.AnonymousClass4JD;
import X.AnonymousClass5NL;
import X.AnonymousClass5S5;
import X.AnonymousClass5S6;
import X.AnonymousClass5S7;
import X.BM3;
import X.C000200d;
import X.C003401n;
import X.C102525Gu;
import X.C102535Gv;
import X.C102545Gw;
import X.C102555Gx;
import X.C102565Gy;
import X.C106745Xa;
import X.C108675c7;
import X.C108875cR;
import X.C17960vV;
import X.C18070vi;
import X.C18100vl;
import X.C19880zA;
import X.C19890zB;
import X.C22971Dz;
import X.C24261Jm;
import X.C24681Lg;
import X.C25161Nd;
import X.C30391dr;
import X.C33251iW;
import X.C34531kd;
import X.C37451pZ;
import X.C41561wd;
import X.C56472hW;
import X.C692236j;
import X.C72473Md;
import X.C72483Me;
import X.C73173Rg;
import X.C88524a2;
import X.C89914dE;
import X.C91004ez;
import X.C91644g1;
import X.C94884lL;
import X.C99274sY;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

public final class ReportToAdminMessagesActivity extends AnonymousClass3uW implements C108875cR {
    public C19880zA A00;
    public AnonymousClass4JC A01;
    public C56472hW A02;
    public C34531kd A03;
    public C106745Xa A04;
    public AnonymousClass3X5 A05;
    public AnonymousClass1LU A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public boolean A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;

    public ReportToAdminMessagesActivity() {
        this(0);
        this.A0E = C99274sY.A00(new C102555Gx(this), new C102565Gy(this), new AnonymousClass5NL(this), AnonymousClass3MW.A15(AnonymousClass3Uj.class));
        this.A0D = AnonymousClass1DF.A01(new C102545Gw(this));
        this.A0B = AnonymousClass1DF.A01(new C102525Gu(this));
        this.A0C = AnonymousClass1DF.A01(new C102535Gv(this));
    }

    public int getContainerType() {
        return 6;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        C692236j r6;
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            ArrayList A062 = this.A00.A06();
            if (intent.getBooleanExtra("ad_creation_tapped", false)) {
                C19880zA r1 = this.A00;
                if (r1 == null) {
                    str = "advertiseForwardMediaHelper";
                    C18070vi.A11(str);
                    throw null;
                } else if (r1.A07()) {
                    r1.A03();
                    throw AnonymousClass000.A0s("handleAdvertiseForwardClick");
                }
            } else {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("jids");
                if (A062.isEmpty() || stringArrayListExtra == null) {
                    this.A05.A08(2131892058, 0);
                } else {
                    ArrayList A0A2 = C22971Dz.A0A(AnonymousClass1BI.class, stringArrayListExtra);
                    boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
                    String stringExtra = intent.getStringExtra("appended_message");
                    if (C22971Dz.A01(A0A2) != null) {
                        Bundle extras = intent.getExtras();
                        C17960vV.A07(extras);
                        C18070vi.A0X(extras);
                        r6 = new C692236j();
                        AnonymousClass00H r0 = this.A09;
                        if (r0 != null) {
                            C72473Md.A0v(extras, r6, r0);
                        } else {
                            str = "statusAudienceRepository";
                            C18070vi.A11(str);
                            throw null;
                        }
                    } else {
                        r6 = null;
                    }
                    C33251iW r4 = this.A00.A06;
                    C34531kd r5 = this.A03;
                    if (r5 != null) {
                        r4.A0N(r5, r6, stringExtra, C25161Nd.A00(A062), A0A2, booleanExtra);
                        if (A0A2.size() != 1 || C22971Dz.A0a((Jid) A0A2.get(0))) {
                            CPW(A0A2, 1);
                        } else {
                            AnonymousClass1L9 r12 = this.A01;
                            AnonymousClass1LU r02 = this.A06;
                            if (r02 != null) {
                                C72473Md.A0q(this, r12, r02, A0A2);
                            } else {
                                str = "waIntents";
                            }
                        }
                    } else {
                        str = "sendMedia";
                    }
                    C18070vi.A11(str);
                    throw null;
                }
            }
            BLL();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        A3f();
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
        }
        Toolbar toolbar = this.A02;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new C89914dE(this, 22));
        }
        C24681Lg r1 = this.A00.A0W;
        C18100vl r3 = this.A0E;
        r1.registerObserver(((AnonymousClass3Uj) r3.getValue()).A05);
        setContentView(2131626726);
        setTitle(2131895227);
        RecyclerView recyclerView = (RecyclerView) findViewById(16908298);
        if (recyclerView != null) {
            AnonymousClass3Ma.A15(this, recyclerView);
            BM3 bm3 = new BM3(this);
            Drawable A002 = C24261Jm.A00(this, 2131231352);
            if (A002 != null) {
                bm3.A01 = A002;
                recyclerView.A0r(bm3);
                AnonymousClass1LU r4 = this.A06;
                if (r4 != null) {
                    AnonymousClass48j r10 = new AnonymousClass48j(this, r4, this.A01, 19);
                    AnonymousClass4JC r42 = this.A01;
                    if (r42 != null) {
                        C37451pZ A062 = this.A00.A0E.A06(this, "report-to-admin");
                        C88524a2 r7 = this.A00.A0I;
                        C18070vi.A0X(r7);
                        AnonymousClass1K2 r12 = r42.A00;
                        AnonymousClass3X5 r43 = new AnonymousClass3X5((AnonymousClass4JD) r12.A00.A2O.get(), A062, r7, this, AnonymousClass3Ma.A0s(r12.A01), r10);
                        this.A05 = r43;
                        recyclerView.setAdapter(r43);
                    } else {
                        str = "adapterFactory";
                    }
                } else {
                    str = "waIntents";
                }
                C18070vi.A11(str);
                throw null;
            }
        }
        AnonymousClass3MX.A0v(this.A0C).A04(0);
        C91644g1.A00(this, ((AnonymousClass3Uj) r3.getValue()).A02, new AnonymousClass5S5(this), 16);
        C91644g1.A00(this, ((AnonymousClass3Uj) r3.getValue()).A01, new AnonymousClass5S6(this), 16);
        AnonymousClass3Uj r5 = (AnonymousClass3Uj) r3.getValue();
        r5.A04.BEK(67, r5.A06.getRawString(), "ReportToAdminMessagesActivity");
        AnonymousClass3MX.A1Q(new ReportToAdminMessagesViewModel$fetchReportedMessages$1(r5, (C30391dr) null), C41561wd.A00(r5));
        BVe().A09(new C73173Rg(this, 4), this);
        C91644g1.A00(this, ((MessageSelectionViewModel) this.A0D.getValue()).A01, new AnonymousClass5S7(this), 16);
    }

    public void A2y() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r2 = r1.A00;
            AnonymousClass1FB.A0K(r1, r2, this, r2.A45);
            AnonymousClass1FB.A0L(r1, r2, this, r2.A5A);
            this.A01 = (AnonymousClass4JC) A0K.A2P.get();
            this.A00 = C19890zB.A00;
            this.A02 = (C56472hW) A0K.A2M.get();
            this.A07 = C000200d.A00(A0K.A5i);
            this.A08 = C000200d.A00(A0K.A5j);
            this.A04 = (C106745Xa) A0K.A2R.get();
            this.A03 = AnonymousClass3MZ.A0R(r1);
            this.A09 = C000200d.A00(r2.A4e);
            this.A06 = AnonymousClass3MY.A0Z(r1);
        }
    }

    public void C4z() {
        ((MessageSelectionViewModel) this.A0D.getValue()).A0U(1);
    }

    public /* bridge */ /* synthetic */ C108675c7 getConversationRowCustomizer() {
        AnonymousClass00H r0 = this.A08;
        if (r0 != null) {
            return (C94884lL) r0.get();
        }
        C18070vi.A11("rtaConversationRowCustomizer");
        throw null;
    }

    public /* bridge */ /* synthetic */ AnonymousClass1F9 getLifecycleOwner() {
        return this;
    }

    public void onDestroy() {
        this.A00.A0W.unregisterObserver(((AnonymousClass3Uj) this.A0E.getValue()).A05);
        super.onDestroy();
    }

    public static final void A03(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        if (reportToAdminMessagesActivity.isTaskRoot()) {
            AnonymousClass1LU r1 = reportToAdminMessagesActivity.A06;
            if (r1 != null) {
                Intent A062 = AnonymousClass3MY.A06(reportToAdminMessagesActivity, r1, ((AnonymousClass3Uj) reportToAdminMessagesActivity.A0E.getValue()).A06);
                C18070vi.A0X(A062);
                reportToAdminMessagesActivity.finishAndRemoveTask();
                reportToAdminMessagesActivity.startActivity(A062);
            } else {
                AnonymousClass3MW.A1F();
                throw null;
            }
        }
        reportToAdminMessagesActivity.finish();
    }

    public ReportToAdminMessagesActivity(int i) {
        this.A0A = false;
        C91004ez.A00(this, 33);
    }
}
