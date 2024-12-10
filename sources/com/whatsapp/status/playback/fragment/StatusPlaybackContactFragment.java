package com.whatsapp.status.playback.fragment;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass122;
import X.AnonymousClass18K;
import X.AnonymousClass18O;
import X.AnonymousClass1BI;
import X.AnonymousClass1DC;
import X.AnonymousClass1DF;
import X.AnonymousClass1E5;
import X.AnonymousClass1E7;
import X.AnonymousClass1F9;
import X.AnonymousClass1FL;
import X.AnonymousClass1FY;
import X.AnonymousClass1M9;
import X.AnonymousClass1Nb;
import X.AnonymousClass1TG;
import X.AnonymousClass1VP;
import X.AnonymousClass1WR;
import X.AnonymousClass1ZK;
import X.AnonymousClass1ZU;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass21V;
import X.AnonymousClass21W;
import X.AnonymousClass21Y;
import X.AnonymousClass25A;
import X.AnonymousClass2R2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4ZR;
import X.AnonymousClass4aU;
import X.AnonymousClass6GW;
import X.AnonymousClass6GX;
import X.AnonymousClass6Gp;
import X.AnonymousClass6M8;
import X.AnonymousClass6R1;
import X.AnonymousClass6YA;
import X.AnonymousClass6YI;
import X.AnonymousClass70K;
import X.AnonymousClass70O;
import X.AnonymousClass727;
import X.AnonymousClass72B;
import X.AnonymousClass72Z;
import X.AnonymousClass745;
import X.AnonymousClass78R;
import X.AnonymousClass7E1;
import X.AnonymousClass7FF;
import X.AnonymousClass7FH;
import X.AnonymousClass7ID;
import X.AnonymousClass7PK;
import X.AnonymousClass7RH;
import X.AnonymousClass7RQ;
import X.AnonymousClass86D;
import X.AnonymousClass89M;
import X.C002100z;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108985cd;
import X.C110825hA;
import X.C111255jJ;
import X.C120886Gk;
import X.C120906Gm;
import X.C122646Re;
import X.C131096kV;
import X.C137086ut;
import X.C1406472j;
import X.C1406672l;
import X.C146377Ow;
import X.C153717py;
import X.C153727pz;
import X.C1596985n;
import X.C1604188j;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18180vt;
import X.C18460wS;
import X.C18600wl;
import X.C19620yd;
import X.C19740yt;
import X.C19830z4;
import X.C217517g;
import X.C22971Dz;
import X.C23291Fl;
import X.C23401Fx;
import X.C23581Gv;
import X.C24261Jm;
import X.C24631Lb;
import X.C24661Le;
import X.C24671Lf;
import X.C24681Lg;
import X.C24921Me;
import X.C25221Nj;
import X.C25931Qe;
import X.C27201Vd;
import X.C28741ap;
import X.C29431cG;
import X.C30141dS;
import X.C30391dr;
import X.C31191fA;
import X.C32741hg;
import X.C32951i1;
import X.C33251iW;
import X.C34531kd;
import X.C34581kj;
import X.C34611km;
import X.C34621kn;
import X.C34771l3;
import X.C36341nj;
import X.C36361nl;
import X.C37581pm;
import X.C41801x5;
import X.C446824j;
import X.C62572rc;
import X.C63322ss;
import X.C63672tV;
import X.C692236j;
import X.C72043Kk;
import X.C72453Mb;
import X.C72463Mc;
import X.C90594eK;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class StatusPlaybackContactFragment extends Hilt_StatusPlaybackContactFragment implements C23291Fl, C34581kj, AnonymousClass1ZK, C34611km, C34621kn {
    public int A00;
    public int A01;
    public C36361nl A02;
    public C34531kd A03;
    public AnonymousClass18O A04;
    public C72043Kk A05;
    public C33251iW A06;
    public AnonymousClass1VP A07;
    public C31191fA A08;
    public AnonymousClass1M9 A09;
    public C24671Lf A0A;
    public C24921Me A0B;
    public C27201Vd A0C;
    public C32951i1 A0D;
    public AnonymousClass11P A0E;
    public C19830z4 A0F;
    public AnonymousClass122 A0G;
    public C24681Lg A0H;
    public AnonymousClass1TG A0I;
    public C24631Lb A0J;
    public C24661Le A0K;
    public AnonymousClass18K A0L;
    public C25931Qe A0M;
    public UserJid A0N;
    public C36341nj A0O;
    public AnonymousClass206 A0P;
    public AnonymousClass1Nb A0Q;
    public C32741hg A0R;
    public C34771l3 A0S;
    public C111255jJ A0T;
    public AnonymousClass1DC A0U;
    public AnonymousClass10I A0V;
    public AnonymousClass72B A0W;
    public AnonymousClass00H A0X;
    public AnonymousClass00H A0Y;
    public AnonymousClass00H A0Z;
    public AnonymousClass00H A0a;
    public AnonymousClass00H A0b;
    public AnonymousClass00H A0c;
    public AnonymousClass00H A0d;
    public AnonymousClass00H A0e;
    public AnonymousClass00H A0f;
    public AnonymousClass00H A0g;
    public AnonymousClass00H A0h;
    public AnonymousClass00H A0i;
    public AnonymousClass00H A0j;
    public AnonymousClass00H A0k;
    public AnonymousClass00H A0l;
    public AnonymousClass00H A0m;
    public AnonymousClass00H A0n;
    public AnonymousClass00H A0o;
    public AnonymousClass00H A0p;
    public AnonymousClass00H A0q;
    public AnonymousClass00H A0r;
    public AnonymousClass00H A0s;
    public AnonymousClass00H A0t;
    public String A0u;
    public String A0v;
    public List A0w;
    public Map A0x;
    public C18600wl A0y;
    public C18600wl A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public AnonymousClass6M8 A14;
    public AnonymousClass6R1 A15;
    public boolean A16;
    public final C002100z A17 = new C110825hA(this);
    public final C18100vl A18 = AnonymousClass1DF.A01(new C153717py(this));
    public final C18100vl A19 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C153727pz(this));
    public final C23581Gv A1A = new AnonymousClass7E1(this, 3);
    public final C28741ap A1B = new AnonymousClass7FF(this, 5);
    public final AnonymousClass1WR A1C = new AnonymousClass7FH(this, 12);
    public final C25221Nj A1D = new AnonymousClass7ID(this, 5);
    public final AnonymousClass86D A1E = new C146377Ow(this, 1);
    public final C1604188j A1F = new AnonymousClass7PK(this, 1);
    public final AnonymousClass00H A1G = C217517g.A00(16503);

    public static final void A03(SpannableStringBuilder spannableStringBuilder, AnonymousClass206 r9, C131096kV r10, StatusPlaybackContactFragment statusPlaybackContactFragment) {
        StatusPlaybackContactFragment statusPlaybackContactFragment2 = statusPlaybackContactFragment;
        C37581pm A0H2 = AnonymousClass3MZ.A0H(statusPlaybackContactFragment);
        C18600wl r0 = statusPlaybackContactFragment.A0y;
        if (r0 != null) {
            AnonymousClass3MW.A1X(r0, new StatusPlaybackContactFragment$maybeSetupHeaderCTA$1(spannableStringBuilder, r9, r10, statusPlaybackContactFragment2, (C30391dr) null), A0H2);
        } else {
            C18070vi.A11("ioDispatcher");
            throw null;
        }
    }

    public static final void A04(Menu menu, StatusPlaybackContactFragment statusPlaybackContactFragment, Integer num, int i, int i2) {
        MenuItem add = menu.add(0, i, 0, i2);
        if (statusPlaybackContactFragment.A09 && !statusPlaybackContactFragment.A0A && num != null) {
            Drawable A002 = C24261Jm.A00(statusPlaybackContactFragment.A14(), num.intValue());
            if (A002 != null) {
                Context A142 = statusPlaybackContactFragment.A14();
                int i3 = 2131100146;
                if (i == 2131432617) {
                    i3 = 2131103172;
                }
                A002.setTint(C19740yt.A00(A142, i3));
                add.setIcon(A002);
            }
            if (i == 2131432617) {
                SpannableString spannableString = new SpannableString(String.valueOf(add.getTitle()));
                spannableString.setSpan(new ForegroundColorSpan(C19740yt.A00(statusPlaybackContactFragment.A14(), 2131103172)), 0, spannableString.length(), 0);
                add.setTitle(spannableString);
            }
        }
    }

    public void A1w(int i, int i2, Intent intent) {
        String str;
        AnonymousClass1FY r1;
        Bundle extras;
        if (i != 2) {
            super.A1w(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            ArrayList A0r2 = C72463Mc.A0r(intent, AnonymousClass1BI.class);
            boolean A1a = AnonymousClass3MY.A1a(intent, "include_captions");
            String stringExtra = intent.getStringExtra("appended_message");
            boolean z = false;
            if (C22971Dz.A01(A0r2) != null) {
                z = true;
            }
            C692236j r3 = null;
            if (z && (extras = intent.getExtras()) != null) {
                r3 = new C692236j();
                AnonymousClass00H r0 = this.A0h;
                if (r0 != null) {
                    r3.A00(AnonymousClass727.A00(extras, r0));
                } else {
                    str = "statusAudienceRepository";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            C33251iW r12 = this.A06;
            if (r12 != null) {
                C34531kd r2 = this.A03;
                if (r2 != null) {
                    r12.A0N(r2, r3, stringExtra, C18070vi.A0M(this.A0P), A0r2, A1a);
                    if (A0r2.size() != 1 || C22971Dz.A0a((Jid) C29431cG.A0b(A0r2))) {
                        AnonymousClass1FL A1B2 = A1B();
                        if ((A1B2 instanceof StatusPlaybackActivity) && (r1 = (AnonymousClass1FY) A1B2) != null) {
                            r1.CPW(A0r2, 1);
                            return;
                        }
                        return;
                    }
                    AnonymousClass00H r02 = this.A0m;
                    if (r02 != null) {
                        C137086ut.A00(AnonymousClass3MY.A06(A14(), C108945cZ.A0h(r02), (AnonymousClass1BI) C29431cG.A0b(A0r2)), this, A2F());
                        return;
                    }
                    str = "waIntents";
                } else {
                    str = "sendMedia";
                }
            } else {
                str = "userActions";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        AnonymousClass206 r0 = this.A0P;
        if (r0 != null) {
            AnonymousClass4aU.A0A(bundle, r0.A0v);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r10.A13 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r29, android.view.View r30) {
        /*
            r28 = this;
            r11 = 0
            r12 = r30
            X.C18070vi.A0d(r12, r11)
            r10 = r28
            r0 = r29
            super.A21(r0, r12)
            X.6kV r0 = r10.A05
            if (r0 == 0) goto L_0x0023
            android.view.View r2 = r0.A02
            com.whatsapp.jid.UserJid r1 = r10.A0N
            X.1E5 r0 = X.AnonymousClass1E5.A00
            if (r1 != r0) goto L_0x001f
            boolean r1 = r10.A13
            r0 = 8
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r2.setVisibility(r0)
        L_0x0023:
            X.6kV r1 = r10.A05
            if (r1 == 0) goto L_0x003b
            X.00H r0 = r10.A0k
            if (r0 == 0) goto L_0x0138
            java.lang.Object r2 = r0.get()
            X.72j r2 = (X.C1406472j) r2
            android.widget.TextView r1 = r1.A0C
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            r2.A03 = r10
            r2.A02 = r1
        L_0x003b:
            A07(r10)
            android.os.Bundle r1 = r10.A15()
            java.lang.String r0 = ""
            X.205 r20 = X.AnonymousClass4aU.A03(r1, r0)
            com.whatsapp.jid.UserJid r15 = r10.A0N
            if (r15 == 0) goto L_0x011c
            X.1Le r9 = r10.A0K
            if (r9 == 0) goto L_0x0135
            X.00H r0 = r10.A0s
            if (r0 == 0) goto L_0x0132
            java.lang.Object r8 = X.C18070vi.A0E(r0)
            X.1dS r8 = (X.C30141dS) r8
            X.00H r0 = r10.A0b
            if (r0 == 0) goto L_0x012f
            java.lang.Object r7 = X.C18070vi.A0E(r0)
            X.1W6 r7 = (X.AnonymousClass1W6) r7
            X.00H r0 = r10.A0p
            if (r0 == 0) goto L_0x012c
            java.lang.Object r6 = X.C18070vi.A0E(r0)
            com.whatsapp.bridge.wfal.WfalManager r6 = (com.whatsapp.bridge.wfal.WfalManager) r6
            X.1TG r5 = r10.A0I
            if (r5 == 0) goto L_0x0129
            X.1Lb r4 = r10.A0J
            if (r4 == 0) goto L_0x0126
            X.00H r3 = r10.A0o
            if (r3 == 0) goto L_0x0123
            X.00H r2 = r10.A0t
            if (r2 == 0) goto L_0x0120
            X.1Qe r1 = r10.A0M
            if (r1 == 0) goto L_0x013b
            boolean r0 = r10.A16
            r16 = r0
            X.1Lc r0 = r10.A2C()
            X.0ve r14 = r0.A01
            r13 = 8880(0x22b0, float:1.2444E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r27 = X.C18020vd.A05(r0, r14, r13)
            X.6M8 r13 = new X.6M8
            r26 = r16
            r23 = r8
            r24 = r3
            r25 = r2
            r21 = r10
            r22 = r7
            r18 = r1
            r19 = r15
            r16 = r4
            r17 = r9
            r14 = r6
            r15 = r5
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r10.A14 = r13
            com.whatsapp.jid.UserJid r2 = r10.A0N
            X.1E5 r1 = X.AnonymousClass1E5.A00
            if (r2 != r1) goto L_0x00d4
            X.1Lc r1 = r10.A2C()
            X.0ve r2 = r1.A01
            r1 = 9866(0x268a, float:1.3825E-41)
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            if (r1 == 0) goto L_0x00d4
            X.1l3 r1 = r10.A0S
            if (r1 == 0) goto L_0x011d
            X.5jJ r2 = X.C108995ce.A0S(r10, r1)
            X.1Fw r1 = r10.A0L
            r1.A05(r2)
            r10.A0T = r2
        L_0x00d4:
            android.content.Context r2 = r10.A1n()
            if (r2 == 0) goto L_0x011c
            java.lang.String r1 = "accessibility"
            java.lang.Object r1 = r2.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L_0x011c
            X.1Lc r1 = r10.A2C()
            X.0ve r2 = r1.A01
            r1 = 11675(0x2d9b, float:1.636E-41)
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x011c
            r0 = 2131435664(0x7f0b2090, float:1.8493177E38)
            X.1bI r0 = X.C72453Mb.A0s(r12, r0)
            android.view.View r2 = X.AnonymousClass3MX.A0D(r0)
            r2.setVisibility(r11)
            r0 = 2131434039(0x7f0b1a37, float:1.848988E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r2, r0)
            r0 = 12
            X.AnonymousClass78P.A00(r1, r10, r0)
            r0 = 2131433119(0x7f0b169f, float:1.8488015E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r2, r0)
            r0 = 13
            X.AnonymousClass78P.A00(r1, r10, r0)
        L_0x011c:
            return
        L_0x011d:
            java.lang.String r0 = "statusesViewModelFactory"
            goto L_0x013d
        L_0x0120:
            java.lang.String r0 = "xFamilyStatusCrosspostStateCacheLazy"
            goto L_0x013d
        L_0x0123:
            java.lang.String r0 = "waffleStatusCrosspostStateCacheLazy"
            goto L_0x013d
        L_0x0126:
            java.lang.String r0 = "statusPsaCampaignStore"
            goto L_0x013d
        L_0x0129:
            java.lang.String r0 = "statusMessageStore"
            goto L_0x013d
        L_0x012c:
            java.lang.String r0 = "wfalManager"
            goto L_0x013d
        L_0x012f:
            java.lang.String r0 = "fMessageDatabase"
            goto L_0x013d
        L_0x0132:
            java.lang.String r0 = "xFamilyGating"
            goto L_0x013d
        L_0x0135:
            java.lang.String r0 = "statusStore"
            goto L_0x013d
        L_0x0138:
            java.lang.String r0 = "topAttributionManager"
            goto L_0x013d
        L_0x013b:
            java.lang.String r0 = "fMessageLazyManager"
        L_0x013d:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A21(android.os.Bundle, android.view.View):void");
    }

    /* JADX WARNING: type inference failed for: r0v50, types: [X.70K, X.6Gp, X.6Go, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r22v4, types: [X.6Gl] */
    /* JADX WARNING: type inference failed for: r22v5, types: [X.6Gm] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0051, code lost:
        if (r86.A02() != 0) goto L_0x0053;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass70K A2G(X.AnonymousClass206 r88) {
        /*
            r87 = this;
            r1 = 0
            r63 = r88
            r0 = r63
            X.C18070vi.A0d(r0, r1)
            r13 = r87
            X.6kV r0 = r13.A05
            r21 = r0
            X.00z r0 = r13.A17
            r86 = r0
            r0 = r63
            X.205 r0 = r0.A0v
            r85 = r0
            X.C18070vi.A0W(r85)
            r1 = r86
            java.lang.Object r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x0220
            X.00H r0 = r13.A0j
            if (r0 == 0) goto L_0x0310
            java.lang.Object r12 = r0.get()
            X.6kc r12 = (X.C131166kc) r12
            X.6p9 r20 = new X.6p9
            r1 = r20
            r0 = r63
            r1.<init>(r0, r13)
            X.0vl r0 = r13.A18
            java.lang.Object r19 = r0.getValue()
            r0 = r19
            X.1pZ r0 = (X.C37451pZ) r0
            r19 = r0
            X.1pm r23 = X.AnonymousClass3MZ.A0H(r13)
            int r1 = r13.A01
            r0 = 1
            if (r1 != r0) goto L_0x0053
            int r0 = r86.A02()
            r64 = 1
            if (r0 == 0) goto L_0x0055
        L_0x0053:
            r64 = 0
        L_0x0055:
            r1 = 2
            r0 = r19
            X.C18070vi.A0d(r0, r1)
            r0 = r85
            boolean r1 = r0.A02
            X.11P r0 = r12.A0L
            r46 = r0
            X.0ve r0 = r12.A0T
            if (r1 == 0) goto L_0x0223
            r55 = r0
            X.00H r0 = r12.A0l
            java.lang.Object r18 = X.C18070vi.A0E(r0)
            r0 = r18
            X.6zi r0 = (X.C139956zi) r0
            r18 = r0
            X.1KB r0 = r12.A06
            r31 = r0
            X.11S r0 = r12.A08
            r32 = r0
            X.1kd r0 = r12.A09
            r33 = r0
            X.10I r0 = r12.A0Z
            r72 = r0
            X.1Le r0 = r12.A0R
            r53 = r0
            X.1iW r0 = r12.A0B
            r35 = r0
            X.1L9 r0 = r12.A04
            r84 = r0
            X.1Vd r0 = r12.A0F
            r41 = r0
            X.00H r0 = r12.A0w
            java.lang.Object r17 = X.C18070vi.A0E(r0)
            r0 = r17
            X.1dS r0 = (X.C30141dS) r0
            r17 = r0
            X.1i4 r0 = r12.A0S
            r54 = r0
            X.00H r0 = r12.A0m
            java.lang.Object r16 = X.C18070vi.A0E(r0)
            r0 = r16
            X.2r5 r0 = (X.C62242r5) r0
            r16 = r0
            X.1M9 r0 = r12.A0C
            r37 = r0
            X.1WX r0 = r12.A0Q
            r52 = r0
            X.1Me r0 = r12.A0E
            r39 = r0
            X.0vb r0 = r12.A0N
            r48 = r0
            X.00H r0 = r12.A0k
            java.lang.Object r15 = X.C18070vi.A0E(r0)
            X.168 r15 = (X.AnonymousClass168) r15
            X.1no r0 = r12.A0P
            r51 = r0
            X.00H r0 = r12.A0o
            java.lang.Object r14 = X.C18070vi.A0E(r0)
            X.1c4 r14 = (X.AnonymousClass1c4) r14
            X.1nl r0 = r12.A07
            r83 = r0
            X.1Lf r0 = r12.A0D
            r38 = r0
            X.1Lg r0 = r12.A0O
            r50 = r0
            X.00H r0 = r12.A0u
            java.lang.Object r11 = X.C18070vi.A0E(r0)
            com.whatsapp.bridge.wfal.WfalManager r11 = (com.whatsapp.bridge.wfal.WfalManager) r11
            X.00H r0 = r12.A0c
            java.lang.Object r10 = X.C18070vi.A0E(r0)
            X.1Q1 r10 = (X.AnonymousClass1Q1) r10
            X.0z4 r0 = r12.A0M
            r47 = r0
            X.1hg r0 = r12.A0Y
            r67 = r0
            X.00H r0 = r12.A0p
            java.lang.Object r9 = X.C18070vi.A0E(r0)
            X.72w r9 = (X.C1407572w) r9
            X.1hs r0 = r12.A0W
            r60 = r0
            X.00H r0 = r12.A0v
            java.lang.Object r8 = X.C18070vi.A0E(r0)
            X.1x7 r8 = (X.C41821x7) r8
            X.00H r0 = r12.A0d
            java.lang.Object r7 = X.C18070vi.A0E(r0)
            X.6y9 r7 = (X.C139066y9) r7
            X.00H r0 = r12.A0i
            java.lang.Object r6 = X.C18070vi.A0E(r0)
            X.1Ng r6 = (X.C25191Ng) r6
            X.00H r0 = r12.A0r
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.6kb r5 = (X.C131156kb) r5
            X.11Q r0 = r12.A0J
            r44 = r0
            X.00H r0 = r12.A0e
            java.lang.Object r4 = X.C18070vi.A0E(r0)
            X.72B r4 = (X.AnonymousClass72B) r4
            X.00H r0 = r12.A0f
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.6hR r3 = (X.C129216hR) r3
            X.11C r0 = r12.A0K
            r45 = r0
            X.00H r0 = r12.A0h
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.4Yp r2 = (X.C88174Yp) r2
            X.00H r0 = r12.A0b
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.6mq r1 = (X.C132456mq) r1
            X.0zA r0 = r12.A03
            r82 = r0
            X.0zA r0 = r12.A02
            r81 = r0
            X.6wL r0 = r12.A0I
            r43 = r0
            X.0zA r0 = r12.A00
            r80 = r0
            X.0zA r0 = r12.A01
            r29 = r0
            X.1Qe r0 = r12.A0U
            r28 = r0
            X.1Lc r0 = r12.A0X
            r27 = r0
            X.1vD r0 = r12.A0A
            r26 = r0
            X.1o3 r0 = r12.A0G
            r25 = r0
            X.00H r0 = r12.A0j
            r24 = r0
            X.00H r0 = r12.A0q
            r22 = r0
            X.2qP r0 = r12.A05
            r30 = r0
            X.00H r12 = r12.A0n
            X.6Gm r0 = new X.6Gm
            r34 = r26
            r36 = r11
            r40 = r19
            r42 = r25
            r49 = r10
            r56 = r28
            r57 = r2
            r58 = r6
            r59 = r16
            r61 = r15
            r62 = r14
            r64 = r27
            r65 = r1
            r66 = r3
            r68 = r9
            r69 = r5
            r70 = r20
            r71 = r18
            r73 = r7
            r74 = r4
            r75 = r8
            r76 = r17
            r77 = r24
            r78 = r22
            r79 = r12
            r22 = r0
            r24 = r82
            r25 = r81
            r26 = r80
            r27 = r29
            r28 = r83
            r29 = r84
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79)
        L_0x01c4:
            if (r21 == 0) goto L_0x0219
            r1 = r21
            android.view.ViewGroup r5 = r1.A07
            int r2 = r13.A04
            r1 = 7
            boolean r4 = X.C108975cc.A1C(r2, r1)
            android.graphics.Rect r3 = r13.A01
            X.C72473Md.A1I(r5, r3)
            boolean r1 = r0.A01
            if (r1 != 0) goto L_0x0219
            r1 = 1
            r0.A01 = r1
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "StatusPlaybackPage/onCreate page="
            X.C108985cd.A1H(r0, r1, r2)
            X.6p9 r1 = r0.A0N
            com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment r1 = r1.A01
            X.C17900vP.A0b(r1, r2)
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r5)
            X.C18070vi.A0X(r1)
            android.view.View r1 = r0.A0Z(r1, r5)
            r0.A00 = r1
            r0.A0U(r1)
            X.70O r1 = r0.A0K()
            r1.A0D()
            boolean r1 = r0.A0X()
            r0.A0V(r1)
            r0.A0I(r3)
            if (r4 == 0) goto L_0x0219
            boolean r1 = r0.A03
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0219
            r0.A0F()
        L_0x0219:
            r2 = r86
            r1 = r85
            r2.A08(r1, r0)
        L_0x0220:
            X.70K r0 = (X.AnonymousClass70K) r0
            return r0
        L_0x0223:
            r43 = r0
            X.00H r0 = r12.A0l
            java.lang.Object r14 = X.C18070vi.A0E(r0)
            X.6zi r14 = (X.C139956zi) r14
            X.1KB r0 = r12.A06
            r68 = r0
            X.1kd r0 = r12.A09
            r67 = r0
            X.10I r0 = r12.A0Z
            r58 = r0
            X.1LU r0 = r12.A0V
            r45 = r0
            X.1Le r0 = r12.A0R
            r41 = r0
            X.1iW r0 = r12.A0B
            r66 = r0
            X.1L9 r0 = r12.A04
            r65 = r0
            X.1i4 r0 = r12.A0S
            r42 = r0
            X.00H r0 = r12.A0m
            java.lang.Object r11 = X.C18070vi.A0E(r0)
            X.2r5 r11 = (X.C62242r5) r11
            X.1M9 r0 = r12.A0C
            r31 = r0
            X.1WX r0 = r12.A0Q
            r40 = r0
            X.1Me r0 = r12.A0E
            r30 = r0
            X.00H r0 = r12.A0k
            java.lang.Object r10 = X.C18070vi.A0E(r0)
            X.168 r10 = (X.AnonymousClass168) r10
            X.1no r0 = r12.A0P
            r29 = r0
            X.1nl r0 = r12.A07
            r28 = r0
            X.00H r0 = r12.A0g
            java.lang.Object r9 = X.C18070vi.A0E(r0)
            X.1W6 r9 = (X.AnonymousClass1W6) r9
            X.1Lg r0 = r12.A0O
            r27 = r0
            X.73X r0 = r12.A0a
            r26 = r0
            X.1hg r0 = r12.A0Y
            r25 = r0
            X.00H r0 = r12.A0p
            java.lang.Object r8 = X.C18070vi.A0E(r0)
            X.72w r8 = (X.C1407572w) r8
            X.1hs r0 = r12.A0W
            r24 = r0
            X.00H r0 = r12.A0r
            java.lang.Object r7 = X.C18070vi.A0E(r0)
            X.6kb r7 = (X.C131156kb) r7
            X.11C r0 = r12.A0K
            r23 = r0
            X.1Qe r0 = r12.A0U
            r22 = r0
            X.11S r0 = r12.A08
            r18 = r0
            X.1i1 r0 = r12.A0H
            r17 = r0
            X.1Lc r0 = r12.A0X
            r16 = r0
            X.00H r15 = r12.A0s
            X.1vD r6 = r12.A0A
            X.1o3 r5 = r12.A0G
            X.00H r4 = r12.A0j
            X.00H r3 = r12.A0q
            X.00H r0 = r12.A0t
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.1DC r2 = (X.AnonymousClass1DC) r2
            X.2qP r1 = r12.A05
            X.00H r12 = r12.A0n
            X.6Gl r0 = new X.6Gl
            r32 = r30
            r33 = r19
            r34 = r5
            r35 = r17
            r36 = r23
            r37 = r46
            r38 = r27
            r39 = r29
            r44 = r22
            r46 = r11
            r47 = r24
            r48 = r10
            r49 = r63
            r50 = r16
            r51 = r25
            r52 = r8
            r53 = r7
            r54 = r20
            r55 = r9
            r56 = r14
            r57 = r2
            r59 = r26
            r60 = r15
            r61 = r4
            r62 = r3
            r63 = r12
            r22 = r0
            r23 = r28
            r24 = r65
            r25 = r1
            r26 = r68
            r27 = r18
            r28 = r67
            r29 = r6
            r30 = r66
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            goto L_0x01c4
        L_0x0310:
            java.lang.String r0 = "statusPlaybackPageFactory"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A2G(X.206):X.70K");
    }

    public C90594eK BZQ(int i, int i2, boolean z) {
        C131096kV r0 = this.A05;
        C17960vV.A07(r0);
        ViewGroup viewGroup = r0.A07;
        View findViewById = A1D().findViewById(2131428345);
        C18070vi.A0X(findViewById);
        ArrayList A062 = AnonymousClass1ZU.A06(findViewById);
        AnonymousClass11C r5 = this.A02;
        if (r5 != null) {
            C90594eK r2 = new C90594eK((View) viewGroup, (AnonymousClass1F9) this, r5, (List) A062, i, i2, z);
            r2.A07(new AnonymousClass7RH((Object) this, 38));
            return r2;
        }
        AnonymousClass3MW.A1N();
        throw null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        StatusPlaybackActivity statusPlaybackActivity;
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        AnonymousClass1FL A1B2 = A1B();
        if ((!(A1B2 instanceof StatusPlaybackActivity) || (statusPlaybackActivity = (StatusPlaybackActivity) A1B2) == null || !statusPlaybackActivity.A0T) && !this.A09) {
            AnonymousClass70K A012 = A01(this);
            if (A012 != null) {
                A012.A0C();
                return;
            }
            return;
        }
        Iterator A0l2 = C17890vO.A0l(this.A17.A06());
        while (A0l2.hasNext()) {
            ((AnonymousClass70K) A0l2.next()).A0C();
        }
    }

    public static final AnonymousClass70K A01(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        List list;
        List list2;
        int i = statusPlaybackContactFragment.A00;
        if (i < 0 || (list = statusPlaybackContactFragment.A0w) == null || i >= list.size() || (list2 = statusPlaybackContactFragment.A0w) == null) {
            return null;
        }
        C002100z r1 = statusPlaybackContactFragment.A17;
        AnonymousClass205 r0 = AnonymousClass3MW.A0k(list2, statusPlaybackContactFragment.A00).A0v;
        C18070vi.A0W(r0);
        return (AnonymousClass70K) r1.A04(r0);
    }

    public static final void A06(AnonymousClass206 r9, StatusPlaybackContactFragment statusPlaybackContactFragment) {
        TextView textView;
        String str;
        int i;
        AnonymousClass21V r0;
        C62572rc r1;
        Context A0A2;
        int lineHeight;
        int A002;
        int i2;
        C131096kV r12 = statusPlaybackContactFragment.A05;
        TextView textView2 = null;
        if (r12 != null) {
            textView = r12.A0D;
            textView2 = r12.A0C;
        } else {
            textView = null;
        }
        int A0D2 = C72453Mb.A0D(textView2);
        if (!C22971Dz.A0Z(statusPlaybackContactFragment.A0N)) {
            C72453Mb.A1C(textView);
            C692236j A022 = C63672tV.A02(r9);
            if (A022 != null && A022.A08) {
                if (C18020vd.A05(C18040vf.A02, statusPlaybackContactFragment.A2C().A01, 10970)) {
                    AnonymousClass10I r13 = statusPlaybackContactFragment.A0V;
                    if (r13 != null) {
                        AnonymousClass7RQ.A02(r13, statusPlaybackContactFragment, r9, 3);
                        return;
                    }
                    str = "waWorkers";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            if (r9.A0v.A02) {
                C131096kV r6 = statusPlaybackContactFragment.A05;
                int A0D3 = r9.A0D();
                if (C446824j.A02(A0D3, 4)) {
                    long j = r9.A0H;
                    if (j <= 0) {
                        j = r9.A0I;
                    }
                    SpannableStringBuilder A092 = AnonymousClass3MW.A09(A02(r9, statusPlaybackContactFragment, j));
                    if (r6 != null) {
                        AnonymousClass72B r14 = statusPlaybackContactFragment.A0W;
                        if (r14 != null) {
                            int ordinal = r14.A02(false).ordinal();
                            if (ordinal == 1 || ordinal == 2) {
                                AnonymousClass00H r02 = statusPlaybackContactFragment.A0s;
                                if (r02 == null) {
                                    str = "xFamilyGating";
                                } else if (((C30141dS) r02.get()).A02()) {
                                    AnonymousClass00H r03 = statusPlaybackContactFragment.A0r;
                                    if (r03 != null) {
                                        boolean A052 = C108945cZ.A12(r03).A05(r9);
                                        AnonymousClass00H r04 = statusPlaybackContactFragment.A0r;
                                        if (A052) {
                                            if (r04 != null) {
                                                A0A2 = C108955ca.A0A(statusPlaybackContactFragment, r04);
                                                lineHeight = r6.A0D.getLineHeight();
                                                A002 = statusPlaybackContactFragment.A00();
                                                i2 = 2131232284;
                                            }
                                        } else if (r04 != null) {
                                            if (C108945cZ.A12(r04).A04(r9)) {
                                                AnonymousClass00H r05 = statusPlaybackContactFragment.A0r;
                                                if (r05 != null) {
                                                    A0A2 = C108955ca.A0A(statusPlaybackContactFragment, r05);
                                                    lineHeight = r6.A0D.getLineHeight();
                                                    A002 = statusPlaybackContactFragment.A00();
                                                    i2 = 2131232285;
                                                }
                                            }
                                        }
                                        A092.append(AnonymousClass6YI.A00(A0A2, lineHeight, i2, A002));
                                    }
                                    str = "xFamilyCrosspostManager";
                                }
                            } else if (ordinal == 3) {
                                AnonymousClass00H r06 = statusPlaybackContactFragment.A0a;
                                if (r06 != null) {
                                    boolean A053 = ((C41801x5) r06.get()).A05(C122646Re.FACEBOOK, r9);
                                    AnonymousClass00H r07 = statusPlaybackContactFragment.A0a;
                                    if (r07 != null) {
                                        boolean A054 = ((C41801x5) r07.get()).A05(C122646Re.INSTAGRAM, r9);
                                        if (A053 || A054) {
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                            if (A053) {
                                                AnonymousClass00H r08 = statusPlaybackContactFragment.A0a;
                                                if (r08 != null) {
                                                    spannableStringBuilder.append(AnonymousClass6YA.A00(C108955ca.A0A(statusPlaybackContactFragment, r08), r6.A0D.getLineHeight(), 2131232205, statusPlaybackContactFragment.A00()));
                                                }
                                            }
                                            if (A054) {
                                                AnonymousClass00H r09 = statusPlaybackContactFragment.A0a;
                                                if (r09 != null) {
                                                    spannableStringBuilder.append(AnonymousClass6YA.A00(C108955ca.A0A(statusPlaybackContactFragment, r09), r6.A0D.getLineHeight(), 2131233618, statusPlaybackContactFragment.A00()));
                                                }
                                            }
                                            spannableStringBuilder.append(' ');
                                            spannableStringBuilder.append(statusPlaybackContactFragment.A14().getString(2131898389));
                                            A092.append(spannableStringBuilder);
                                        }
                                    }
                                }
                                str = "crosspostManager";
                            }
                            A03(A092, r9, r6, statusPlaybackContactFragment);
                        } else {
                            str = "crosspostMigrationManager";
                        }
                        C18070vi.A11(str);
                        throw null;
                    }
                    if (textView != null) {
                        textView.setText(A092);
                        return;
                    }
                    return;
                }
                if ((!(r9 instanceof AnonymousClass21V) || (r0 = (AnonymousClass21V) r9) == null || (r1 = r0.A02) == null || r1.A0V || r1.A0f) && !C446824j.A02(A0D3, 20)) {
                    i = 2131895762;
                    if (AnonymousClass25A.A0p(r9)) {
                        i = 2131889345;
                    }
                } else {
                    i = 2131895761;
                }
                if (textView != null) {
                    textView.setText(i);
                    return;
                }
                return;
            }
            SpannableStringBuilder A093 = AnonymousClass3MW.A09(A02(r9, statusPlaybackContactFragment, statusPlaybackContactFragment.A2F().A09(r9.A0I)));
            C131096kV r010 = statusPlaybackContactFragment.A05;
            if (r010 != null) {
                A03(A093, r9, r010, statusPlaybackContactFragment);
            }
            if (textView != null) {
                textView.setText(A093);
            }
        } else if (textView != null) {
            textView.setVisibility(A0D2);
        }
    }

    public static final void A07(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        String str;
        UserJid userJid = statusPlaybackContactFragment.A0N;
        if (userJid != null) {
            if (userJid == AnonymousClass1E5.A00) {
                AnonymousClass11S r0 = statusPlaybackContactFragment.A01;
                if (r0 != null) {
                    userJid = AnonymousClass11S.A01(r0);
                    C18070vi.A0X(userJid);
                } else {
                    str = "meManager";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            C37581pm A0H2 = AnonymousClass3MZ.A0H(statusPlaybackContactFragment);
            C18600wl r2 = statusPlaybackContactFragment.A0y;
            if (r2 != null) {
                AnonymousClass3MW.A1X(r2, new StatusPlaybackContactFragment$fetchContactAndUpdateUI$1(userJid, statusPlaybackContactFragment, (C30391dr) null), A0H2);
                return;
            }
            str = "ioDispatcher";
            C18070vi.A11(str);
            throw null;
        }
    }

    public static final void A08(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        List list;
        AnonymousClass206 A0k2;
        C120906Gm r6;
        int i = statusPlaybackContactFragment.A00;
        if (i >= 0 && (list = statusPlaybackContactFragment.A0w) != null && i < list.size()) {
            List list2 = statusPlaybackContactFragment.A0w;
            if (list2 == null || (A0k2 = AnonymousClass3MW.A0k(list2, statusPlaybackContactFragment.A00)) == null) {
                Log.w("playbackFragment/refreshCurrentPageSubTitle message is empty");
                return;
            }
            A06(A0k2, statusPlaybackContactFragment);
            AnonymousClass70K A2G = statusPlaybackContactFragment.A2G(A0k2);
            if ((A2G instanceof C120906Gm) && (r6 = (C120906Gm) A2G) != null) {
                C120886Gk r7 = r6.A0B;
                C1406672l r5 = r7.A0A;
                if (r5 != null) {
                    boolean A042 = r6.A0C.A04(C122646Re.FACEBOOK, C18070vi.A0M(r6.A07), 8, false);
                    Boolean valueOf = Boolean.valueOf(A042);
                    ImageView imageView = r5.A01;
                    if (!(imageView == null || valueOf == null)) {
                        imageView.setVisibility(C72453Mb.A07(A042 ? 1 : 0));
                    }
                }
                C1406672l r52 = r7.A0A;
                if (r52 != null) {
                    boolean A043 = r6.A0C.A04(C122646Re.INSTAGRAM, C18070vi.A0M(r6.A07), 8, false);
                    Boolean valueOf2 = Boolean.valueOf(A043);
                    ImageView imageView2 = r52.A02;
                    if (!(imageView2 == null || valueOf2 == null)) {
                        imageView2.setVisibility(C72453Mb.A07(A043 ? 1 : 0));
                    }
                }
                r6.A0b();
            }
        }
    }

    public static final void A09(StatusPlaybackContactFragment statusPlaybackContactFragment) {
        C62572rc r1;
        StatusPlaybackProgressView statusPlaybackProgressView;
        StatusPlaybackProgressView statusPlaybackProgressView2;
        C131096kV r5 = statusPlaybackContactFragment.A05;
        List list = statusPlaybackContactFragment.A0w;
        if (list != null) {
            if (!(r5 == null || (statusPlaybackProgressView2 = r5.A0E) == null)) {
                statusPlaybackProgressView2.setCount(list.size());
                statusPlaybackProgressView2.A04.clear();
            }
            if (statusPlaybackContactFragment.A0N == AnonymousClass1E5.A00) {
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    AnonymousClass206 A0Y2 = C17880vN.A0Y(it);
                    if ((A0Y2 instanceof AnonymousClass21V) && (r1 = ((AnonymousClass21V) A0Y2).A02) != null && !r1.A0V && !r1.A0f && !(((A0Y2 instanceof AnonymousClass21Y) && AnonymousClass72Z.A03((AnonymousClass21W) A0Y2)) || r5 == null || (statusPlaybackProgressView = r5.A0E) == null)) {
                        statusPlaybackProgressView.A04.add(Integer.valueOf(i));
                    }
                    i++;
                }
            }
        }
    }

    public static final void A0A(StatusPlaybackContactFragment statusPlaybackContactFragment, int i) {
        List list;
        AnonymousClass206 r3;
        ViewGroup viewGroup;
        int i2;
        Map map;
        C63322ss r5;
        Button button;
        StatusPlaybackProgressView statusPlaybackProgressView;
        if (statusPlaybackContactFragment.A00 != i && (list = statusPlaybackContactFragment.A0w) != null) {
            if (list.isEmpty()) {
                C17900vP.A0Z(statusPlaybackContactFragment, "playbackFragment/setPageActive no-messages ", AnonymousClass000.A10());
                return;
            }
            statusPlaybackContactFragment.A00 = i;
            C131096kV r0 = statusPlaybackContactFragment.A05;
            View view = null;
            if (!(r0 == null || (statusPlaybackProgressView = r0.A0E) == null)) {
                statusPlaybackProgressView.setPosition(i);
                statusPlaybackProgressView.setProgressProvider((C1596985n) null);
            }
            List list2 = statusPlaybackContactFragment.A0w;
            if (list2 != null && (r3 = (AnonymousClass206) C29431cG.A0f(list2, i)) != null) {
                if (!(!C22971Dz.A0Z(r3.A0H()) || (map = statusPlaybackContactFragment.A0x) == null || (r5 = (C63322ss) C108965cb.A0o(map, r3.A0x)) == null)) {
                    C32741hg r02 = statusPlaybackContactFragment.A0R;
                    if (r02 != null) {
                        r02.A0Q.put(C108955ca.A0w(r3), false);
                        String str = r5.A03;
                        String str2 = r5.A02;
                        View view2 = null;
                        if (str == null || str2 == null) {
                            C131096kV r03 = statusPlaybackContactFragment.A05;
                            if (r03 != null) {
                                C72453Mb.A1D(r03.A08);
                            }
                        } else {
                            C131096kV r04 = statusPlaybackContactFragment.A05;
                            if (r04 != null) {
                                button = r04.A00;
                                if (button == null) {
                                    ViewStub viewStub = r04.A08;
                                    if (viewStub != null) {
                                        view2 = viewStub.inflate();
                                    }
                                }
                                button.setText(r5.A02);
                                button.setOnClickListener(new AnonymousClass78R(statusPlaybackContactFragment, r3, str, 7));
                                button.setVisibility(0);
                            }
                            C18070vi.A0z(view2, "null cannot be cast to non-null type android.widget.Button");
                            button = (Button) view2;
                            C131096kV r05 = statusPlaybackContactFragment.A05;
                            if (r05 != null) {
                                r05.A00 = button;
                            }
                            button.setText(r5.A02);
                            button.setOnClickListener(new AnonymousClass78R(statusPlaybackContactFragment, r3, str, 7));
                            button.setVisibility(0);
                        }
                        statusPlaybackContactFragment.A0v = r5.A04;
                    } else {
                        C18070vi.A11("statusesStatsManager");
                        throw null;
                    }
                }
                AnonymousClass70K A2G = statusPlaybackContactFragment.A2G(r3);
                C131096kV r06 = statusPlaybackContactFragment.A05;
                if (r06 != null) {
                    view = r06.A04;
                }
                if (view != null) {
                    AnonymousClass70O A0K2 = ((AnonymousClass6Gp) A2G).A0K();
                    if ((A0K2 instanceof AnonymousClass6GX) || (A0K2 instanceof AnonymousClass6GW)) {
                        i2 = 4;
                    } else {
                        i2 = 0;
                    }
                    view.setVisibility(i2);
                }
                View view3 = A2G.A00;
                C131096kV r07 = statusPlaybackContactFragment.A05;
                if (!(r07 == null || (viewGroup = r07.A07) == null || (viewGroup.getChildCount() != 0 && viewGroup.getChildAt(0) == view3))) {
                    viewGroup.removeAllViews();
                    viewGroup.addView(view3);
                }
                Collection values = statusPlaybackContactFragment.A17.A06().values();
                ArrayList<AnonymousClass70K> A132 = AnonymousClass000.A13();
                for (Object next : values) {
                    AnonymousClass3MZ.A1V(next, A132, C18070vi.A18(next, A2G) ? 1 : 0);
                }
                for (AnonymousClass70K r1 : A132) {
                    if (r1 != null && r1.A04) {
                        r1.A0H();
                    }
                }
                if (!A2G.A04) {
                    A2G.A0G();
                }
                List list3 = statusPlaybackContactFragment.A0w;
                if (list3 != null) {
                    if (i < AnonymousClass3MX.A01(list3)) {
                        statusPlaybackContactFragment.A2G(AnonymousClass3MW.A0k(list3, i + 1));
                    }
                    if (i > 0) {
                        statusPlaybackContactFragment.A2G(AnonymousClass3MW.A0k(list3, i - 1));
                    }
                }
                UserJid userJid = statusPlaybackContactFragment.A0N;
                if (userJid != null) {
                    C32951i1 r12 = statusPlaybackContactFragment.A0D;
                    if (r12 != null) {
                        r12.A0A(AnonymousClass2R2.A18, userJid);
                    } else {
                        C18070vi.A11("chatMessageCounts");
                        throw null;
                    }
                }
                A06(r3, statusPlaybackContactFragment);
            }
        }
    }

    public static final void A0B(StatusPlaybackContactFragment statusPlaybackContactFragment, AnonymousClass70K r3, int i, int i2) {
        Collection values = statusPlaybackContactFragment.A17.A06().values();
        ArrayList<AnonymousClass70K> A132 = AnonymousClass000.A13();
        for (Object next : values) {
            if (next != r3) {
                A132.add(next);
            }
        }
        for (AnonymousClass70K r1 : A132) {
            if (r1 != null && r1.A05) {
                AnonymousClass6Gp r12 = (AnonymousClass6Gp) r1;
                r12.A05 = false;
                r12.A0S(i);
            }
        }
        if (r3 != null && (!r3.A05)) {
            AnonymousClass6Gp r32 = (AnonymousClass6Gp) r3;
            r32.A05 = true;
            r32.A0T(i2, r32.A09);
        }
    }

    public static final boolean A0C(StatusPlaybackContactFragment statusPlaybackContactFragment, int i, int i2) {
        List list = statusPlaybackContactFragment.A0w;
        if (list == null) {
            return false;
        }
        if (statusPlaybackContactFragment.A00 < list.size() - 1) {
            A0A(statusPlaybackContactFragment, statusPlaybackContactFragment.A00 + 1);
            A0B(statusPlaybackContactFragment, A01(statusPlaybackContactFragment), i, i2);
            return true;
        }
        AnonymousClass89M r1 = (AnonymousClass89M) statusPlaybackContactFragment.A1B();
        if (r1 != null) {
            return r1.BwG(statusPlaybackContactFragment.A26(), i, i2, true);
        }
        return false;
    }

    public static final boolean A0D(StatusPlaybackContactFragment statusPlaybackContactFragment, int i, int i2) {
        if (statusPlaybackContactFragment.A0w == null) {
            return false;
        }
        int i3 = statusPlaybackContactFragment.A00;
        if (i3 > 0) {
            A0A(statusPlaybackContactFragment, i3 - 1);
            A0B(statusPlaybackContactFragment, A01(statusPlaybackContactFragment), i, i2);
            return true;
        }
        AnonymousClass89M r1 = (AnonymousClass89M) statusPlaybackContactFragment.A1B();
        if (r1 != null) {
            return r1.BwG(statusPlaybackContactFragment.A26(), i, i2, false);
        }
        return false;
    }

    public final AnonymousClass11P A2F() {
        AnonymousClass11P r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("time");
        throw null;
    }

    public C23401Fx BPx() {
        return this.A0L.A02;
    }

    public void BrY(boolean z) {
        this.A11 = z;
        A27();
    }

    public String toString() {
        String str;
        UserJid userJid = this.A0N;
        if ((userJid != null && (str = userJid.toString()) != null) || (str = C108985cd.A0i(this)) != null) {
            return str;
        }
        throw C17890vO.A0K();
    }

    private final int A00() {
        return AnonymousClass3Ma.A01(A1n(), AnonymousClass3MZ.A09(this), 2130971957, 2131103410);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r10.A2C().A01, 10970) == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0.A02() != true) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(X.AnonymousClass206 r9, com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment r10, long r11) {
        /*
            X.Ac1 r0 = X.AnonymousClass9RY.A00(r9)
            r8 = 0
            r1 = 1
            boolean r7 = X.AnonymousClass000.A1W(r0)
            X.36j r0 = X.C63672tV.A02(r9)
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.A02()
            r6 = 1
            if (r0 == r1) goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            X.36j r0 = X.C63672tV.A02(r9)
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.A08
            if (r0 != r1) goto L_0x0033
            X.1Lc r0 = r10.A2C()
            X.0ve r2 = r0.A01
            r1 = 10970(0x2ada, float:1.5372E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r5 = 1
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            boolean r0 = r9 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0119
            r0 = r9
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r0 = r0.A02
            if (r0 == 0) goto L_0x0119
            com.whatsapp.InteractiveAnnotation[] r4 = r0.A0b
            if (r4 == 0) goto L_0x0119
            int r3 = r4.length
            r2 = 0
        L_0x0045:
            if (r2 >= r3) goto L_0x0119
            r0 = r4[r2]
            if (r0 == 0) goto L_0x0115
            X.2Qq r1 = r0.type
            X.2Qq r0 = X.C49482Qq.LINKCLICK
            if (r1 != r0) goto L_0x0115
            X.1Lc r0 = r10.A2C()
            X.0ve r2 = r0.A01
            r0 = 11820(0x2e2c, float:1.6563E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x0069
            r0 = 12414(0x307e, float:1.7396E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0119
        L_0x0069:
            r2 = 1
        L_0x006a:
            X.36j r0 = X.C63672tV.A02(r9)
            if (r0 == 0) goto L_0x007d
            X.6RJ r1 = r0.A02
            if (r1 == 0) goto L_0x007d
            X.6RJ r0 = X.AnonymousClass6RJ.NONE
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x007d
            r8 = 1
        L_0x007d:
            if (r7 != 0) goto L_0x009a
            if (r6 != 0) goto L_0x009a
            if (r5 != 0) goto L_0x009a
            if (r2 != 0) goto L_0x009a
            if (r8 != 0) goto L_0x009a
            r10.A2F()
            X.0vb r1 = r10.A03
            if (r1 == 0) goto L_0x011c
            X.11P r0 = r10.A2F()
            java.lang.String r0 = X.C108965cb.A0q(r0, r1, r11)
        L_0x0096:
            X.C18070vi.A0b(r0)
            return r0
        L_0x009a:
            long r4 = r9.A0H
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            X.11P r0 = r10.A2F()
            if (r1 <= 0) goto L_0x0110
            long r2 = X.AnonymousClass11P.A01(r0)
        L_0x00aa:
            X.0vb r7 = r10.A03
            if (r7 == 0) goto L_0x011c
            r6 = 0
            long r2 = r2 - r11
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r0.toDays(r2)
            r8 = 1
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c9
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.AnonymousClass3MX.A1S(r1, r6, r4)
            r0 = 276(0x114, float:3.87E-43)
        L_0x00c4:
            java.lang.String r0 = r7.A0J(r1, r0, r4)
            goto L_0x0096
        L_0x00c9:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r0 = r0.toMillis(r4)
            long r2 = r2 - r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r0.toHours(r2)
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e2
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.AnonymousClass3MX.A1S(r1, r6, r4)
            r0 = 280(0x118, float:3.92E-43)
            goto L_0x00c4
        L_0x00e2:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            long r0 = r0.toMillis(r4)
            long r2 = r2 - r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r0.toMinutes(r2)
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fb
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.AnonymousClass3MX.A1S(r1, r6, r4)
            r0 = 285(0x11d, float:4.0E-43)
            goto L_0x00c4
        L_0x00fb:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            long r0 = r0.toMillis(r4)
            long r2 = r2 - r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r0.toSeconds(r2)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.AnonymousClass3MX.A1S(r1, r6, r4)
            r0 = 291(0x123, float:4.08E-43)
            goto L_0x00c4
        L_0x0110:
            long r2 = java.lang.System.currentTimeMillis()
            goto L_0x00aa
        L_0x0115:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0119:
            r2 = 0
            goto L_0x006a
        L_0x011c:
            X.AnonymousClass3MW.A1M()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A02(X.206, com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment, long):java.lang.String");
    }

    public static final void A05(AnonymousClass1E7 r4, C131096kV r5, StatusPlaybackContactFragment statusPlaybackContactFragment) {
        AnonymousClass1FL A1D2 = statusPlaybackContactFragment.A1D();
        Bundle A052 = AnonymousClass745.A05(A1D2, r5.A0B, new AnonymousClass4ZR(A1D2).A02(2131899529));
        AnonymousClass00H r0 = statusPlaybackContactFragment.A0m;
        if (r0 != null) {
            A1D2.startActivity(C108945cZ.A0h(r0).A1v(A1D2, r4, C17880vN.A0l()), A052);
        } else {
            AnonymousClass3MW.A1F();
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r1 != 3) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1r() {
        /*
            r3 = this;
            super.A1r()
            X.1Lf r1 = r3.A0A
            if (r1 == 0) goto L_0x008c
            X.1Gv r0 = r3.A1A
            r1.unregisterObserver(r0)
            X.1Lg r1 = r3.A0H
            if (r1 == 0) goto L_0x0089
            X.1WR r0 = r3.A1C
            r1.unregisterObserver(r0)
            X.00H r0 = r3.A0Y
            if (r0 == 0) goto L_0x0086
            X.10T r1 = X.C17880vN.A0V(r0)
            X.1ap r0 = r3.A1B
            r1.unregisterObserver(r0)
            X.00H r0 = r3.A0d
            if (r0 == 0) goto L_0x0083
            X.10T r1 = X.C17880vN.A0V(r0)
            X.1Nj r0 = r3.A1D
            r1.unregisterObserver(r0)
            X.00H r0 = r3.A1G
            java.lang.Object r0 = r0.get()
            X.178 r0 = (X.AnonymousClass178) r0
            r0.A02(r3)
            X.6R1 r0 = r3.A15
            if (r0 != 0) goto L_0x0040
            X.6R1 r0 = X.AnonymousClass6R1.DISABLED
        L_0x0040:
            int r1 = r0.ordinal()
            r2 = 1
            if (r1 == r2) goto L_0x0072
            r0 = 2
            if (r1 == r0) goto L_0x005a
            r0 = 3
            if (r1 == r0) goto L_0x0067
        L_0x004d:
            X.6M8 r0 = r3.A14
            if (r0 == 0) goto L_0x0054
            r0.A0B(r2)
        L_0x0054:
            X.0vl r0 = r3.A18
            X.C108975cc.A18(r0)
            return
        L_0x005a:
            X.00H r0 = r3.A0q
            if (r0 == 0) goto L_0x008f
            X.10T r1 = X.C17880vN.A0V(r0)
            X.88j r0 = r3.A1F
            r1.unregisterObserver(r0)
        L_0x0067:
            X.00H r0 = r3.A0Z
            if (r0 == 0) goto L_0x0080
            X.10T r1 = X.C17880vN.A0V(r0)
            X.86D r0 = r3.A1E
            goto L_0x007c
        L_0x0072:
            X.00H r0 = r3.A0q
            if (r0 == 0) goto L_0x008f
            X.10T r1 = X.C17880vN.A0V(r0)
            X.88j r0 = r3.A1F
        L_0x007c:
            r1.unregisterObserver(r0)
            goto L_0x004d
        L_0x0080:
            java.lang.String r0 = "crosspostEventObservers"
            goto L_0x0091
        L_0x0083:
            java.lang.String r0 = "groupParticipantsObservers"
            goto L_0x0091
        L_0x0086:
            java.lang.String r0 = "chatObservers"
            goto L_0x0091
        L_0x0089:
            java.lang.String r0 = "messageObservers"
            goto L_0x0091
        L_0x008c:
            java.lang.String r0 = "contactObservers"
            goto L_0x0091
        L_0x008f:
            java.lang.String r0 = "xFamilyCrosspostEventObservers"
        L_0x0091:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A1r():void");
    }

    public void A1s() {
        super.A1s();
        AnonymousClass00H r0 = this.A0k;
        if (r0 != null) {
            C1406472j r2 = (C1406472j) r0.get();
            TextView textView = r2.A02;
            if (textView != null) {
                textView.removeCallbacks(r2.A0B);
            }
            r2.A02 = null;
            r2.A03 = null;
            r2.A04 = C18460wS.A00;
            this.A17.A07(-1);
            return;
        }
        C18070vi.A11("topAttributionManager");
        throw null;
    }

    public void A1t() {
        super.A1t();
        Iterator A0l2 = C17890vO.A0l(this.A17.A06());
        while (A0l2.hasNext()) {
            AnonymousClass70K r1 = (AnonymousClass70K) A0l2.next();
            if (r1 != null && r1.A03) {
                r1.A0E();
            }
        }
    }

    public void A1u() {
        super.A1u();
        Iterator A0l2 = C17890vO.A0l(this.A17.A06());
        while (A0l2.hasNext()) {
            AnonymousClass70K r1 = (AnonymousClass70K) A0l2.next();
            if (r1 != null && (!r1.A03)) {
                r1.A0F();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r1 != 3) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1y(android.os.Bundle r6) {
        /*
            r5 = this;
            super.A1y(r6)
            X.00H r0 = r5.A0Y
            if (r0 == 0) goto L_0x00b2
            X.10T r1 = X.C17880vN.A0V(r0)
            X.1ap r0 = r5.A1B
            r1.registerObserver(r0)
            X.1Lf r1 = r5.A0A
            if (r1 == 0) goto L_0x00af
            X.1Gv r0 = r5.A1A
            r1.registerObserver(r0)
            X.1Lg r1 = r5.A0H
            if (r1 == 0) goto L_0x00ac
            X.1WR r0 = r5.A1C
            r1.registerObserver(r0)
            X.00H r0 = r5.A0d
            if (r0 == 0) goto L_0x00a9
            X.10T r1 = X.C17880vN.A0V(r0)
            X.1Nj r0 = r5.A1D
            r1.registerObserver(r0)
            X.00H r0 = r5.A1G
            java.lang.Object r0 = r0.get()
            X.178 r0 = (X.AnonymousClass178) r0
            r0.A01(r5)
            X.72B r1 = r5.A0W
            if (r1 == 0) goto L_0x00a6
            r0 = 0
            X.6R1 r0 = r1.A02(r0)
            r5.A15 = r0
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x008f
            r0 = 2
            if (r1 == r0) goto L_0x0077
            r0 = 3
            if (r1 == r0) goto L_0x0084
        L_0x0052:
            X.6M8 r1 = r5.A14
            if (r1 == 0) goto L_0x005d
            X.10I r0 = r5.A0V
            if (r0 == 0) goto L_0x00b5
            X.C17890vO.A0u(r1, r0)
        L_0x005d:
            com.whatsapp.jid.UserJid r4 = r5.A0N
            X.1E5 r0 = X.AnonymousClass1E5.A00
            if (r4 == r0) goto L_0x0076
            if (r4 == 0) goto L_0x0076
            X.1pm r3 = X.AnonymousClass3MZ.A0H(r5)
            X.0wl r2 = r5.A0y
            if (r2 == 0) goto L_0x009d
            r1 = 0
            com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$onActivityCreated$2 r0 = new com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$onActivityCreated$2
            r0.<init>(r4, r5, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
        L_0x0076:
            return
        L_0x0077:
            X.00H r0 = r5.A0q
            if (r0 == 0) goto L_0x00a3
            X.10T r1 = X.C17880vN.A0V(r0)
            X.88j r0 = r5.A1F
            r1.registerObserver(r0)
        L_0x0084:
            X.00H r0 = r5.A0Z
            if (r0 == 0) goto L_0x00a0
            X.10T r1 = X.C17880vN.A0V(r0)
            X.86D r0 = r5.A1E
            goto L_0x0099
        L_0x008f:
            X.00H r0 = r5.A0q
            if (r0 == 0) goto L_0x00a3
            X.10T r1 = X.C17880vN.A0V(r0)
            X.88j r0 = r5.A1F
        L_0x0099:
            r1.registerObserver(r0)
            goto L_0x0052
        L_0x009d:
            java.lang.String r0 = "ioDispatcher"
            goto L_0x00b7
        L_0x00a0:
            java.lang.String r0 = "crosspostEventObservers"
            goto L_0x00b7
        L_0x00a3:
            java.lang.String r0 = "xFamilyCrosspostEventObservers"
            goto L_0x00b7
        L_0x00a6:
            java.lang.String r0 = "crosspostMigrationManager"
            goto L_0x00b7
        L_0x00a9:
            java.lang.String r0 = "groupParticipantsObservers"
            goto L_0x00b7
        L_0x00ac:
            java.lang.String r0 = "messageObservers"
            goto L_0x00b7
        L_0x00af:
            java.lang.String r0 = "contactObservers"
            goto L_0x00b7
        L_0x00b2:
            java.lang.String r0 = "chatObservers"
            goto L_0x00b7
        L_0x00b5:
            java.lang.String r0 = "waWorkers"
        L_0x00b7:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A1y(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, A2C().A01, 9839) == false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1z(android.os.Bundle r4) {
        /*
            r3 = this;
            super.A1z(r4)
            java.lang.String r0 = X.C108985cd.A0i(r3)
            com.whatsapp.jid.UserJid r0 = X.C22971Dz.A05(r0)
            r3.A0N = r0
            X.00H r0 = r3.A0g
            if (r0 == 0) goto L_0x0069
            boolean r0 = X.C72453Mb.A1X(r0)
            r3.A13 = r0
            android.os.Bundle r1 = r3.A15()
            java.lang.String r0 = "unseen_only"
            boolean r0 = r1.getBoolean(r0)
            r3.A16 = r0
            if (r4 == 0) goto L_0x0041
            java.lang.String r0 = ""
            X.205 r2 = X.AnonymousClass4aU.A03(r4, r0)
            if (r2 == 0) goto L_0x0041
            X.00H r0 = r3.A0b
            if (r0 == 0) goto L_0x006c
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.1W6 r1 = (X.AnonymousClass1W6) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.206 r0 = X.C108945cZ.A0s(r2, r1)
            r3.A0P = r0
        L_0x0041:
            com.whatsapp.jid.UserJid r1 = r3.A0N
            X.1E5 r0 = X.AnonymousClass1E5.A00
            if (r1 != r0) goto L_0x0062
            X.11S r0 = r3.A01
            if (r0 == 0) goto L_0x0066
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x0062
            X.1Lc r0 = r3.A2C()
            X.0ve r2 = r0.A01
            r1 = 9839(0x266f, float:1.3787E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            r3.A12 = r0
            return
        L_0x0066:
            java.lang.String r0 = "meManager"
            goto L_0x006e
        L_0x0069:
            java.lang.String r0 = "newsletterConfig"
            goto L_0x006e
        L_0x006c:
            java.lang.String r0 = "fMessageDatabase"
        L_0x006e:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A1z(android.os.Bundle):void");
    }

    public void A28() {
        super.A28();
        if (this.A0w != null) {
            int i = this.A00;
            this.A00 = -1;
            if (i == -1) {
                i = 0;
            }
            A0A(this, i);
        }
    }

    public void A29() {
        super.A29();
        AnonymousClass70K A012 = A01(this);
        if (A012 != null && A012.A04) {
            A012.A0H();
        }
    }

    public String BSb() {
        return "status_playback_fragment";
    }

    public C18180vt BYS() {
        return C19620yd.A01;
    }
}
