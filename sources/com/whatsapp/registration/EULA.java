package com.whatsapp.registration;

import X.A29;
import X.A4H;
import X.A98;
import X.A9B;
import X.AGE;
import X.AGV;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11V;
import X.AnonymousClass12Q;
import X.AnonymousClass194;
import X.AnonymousClass19T;
import X.AnonymousClass1DC;
import X.AnonymousClass1K1;
import X.AnonymousClass1LU;
import X.AnonymousClass1VK;
import X.AnonymousClass1YE;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass48o;
import X.AnonymousClass4Yv;
import X.AnonymousClass4Z9;
import X.AnonymousClass4aX;
import X.AnonymousClass5a6;
import X.AnonymousClass6LF;
import X.AnonymousClass6XL;
import X.AnonymousClass895;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.C000200d;
import X.C130676jp;
import X.C137116uw;
import X.C139576z4;
import X.C166908eI;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C18070vi;
import X.C189979kA;
import X.C196549vF;
import X.C197489wm;
import X.C197499wn;
import X.C19830z4;
import X.C19880zA;
import X.C19890zB;
import X.C20138A8z;
import X.C20296AFe;
import X.C20309AFr;
import X.C21449AkG;
import X.C219017v;
import X.C219217x;
import X.C221618v;
import X.C25351CeA;
import X.C26166Ctg;
import X.C27361Vu;
import X.C27371Vv;
import X.C32291gx;
import X.C32531hL;
import X.C33451iq;
import X.C33641j9;
import X.C33841jT;
import X.C35461mH;
import X.C35491mK;
import X.C37081ow;
import X.C57052iS;
import X.C58712l8;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import X.C72933Og;
import X.C86154Qk;
import X.C90794ee;
import X.C95294m0;
import android.content.Intent;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.BottomSheetListView;
import com.whatsapp.registration.audioguidance.RegistrationAudioGuidanceViewModel;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class EULA extends C166908eI implements AnonymousClass895, AnonymousClass5a6 {
    public int A00;
    public View A01;
    public ViewTreeObserver.OnGlobalLayoutListener A02;
    public NestedScrollView A03;
    public C19880zA A04;
    public C19880zA A05;
    public C19880zA A06;
    public C19880zA A07;
    public AnonymousClass194 A08;
    public C32531hL A09;
    public AnonymousClass1VK A0A;
    public C219217x A0B;
    public C18000vb A0C;
    public AGV A0D;
    public C139576z4 A0E;
    public A4H A0F;
    public AnonymousClass1LU A0G;
    public C86154Qk A0H;
    public C219017v A0I;
    public C32291gx A0J;
    public C33451iq A0K;
    public A98 A0L;
    public C33841jT A0M;
    public C33641j9 A0N;
    public C27371Vv A0O;
    public C27361Vu A0P;
    public AnonymousClass1DC A0Q;
    public C35491mK A0R;
    public C35461mH A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
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
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public final AnonymousClass11V A0s;

    public void C4m(C130676jp r14) {
        CNh(this.A0G.A23(this, "eula", r14.A02, (String) null, r14.A05, r14.A06, r14.A03, r14.A07, r14.A04, r14.A08, r14.A00), 32);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0d = AnonymousClass12Q.A00(C37081ow.class);
        this.A0q = false;
        this.A0p = C17880vN.A0I(this.A0T).A0J(false);
        C17880vN.A1C(C17890vO.A0A(((RegistrationAudioGuidanceViewModel) this.A01.getValue()).A0D.A01), "reg_audio_guidance_feature_id", this.A0E.A01(12573));
        this.A0P.A02();
        if (this.A06.A07()) {
            AnonymousClass6XL.A00(getApplicationContext(), this.A0A, this.A05);
            this.A06.A03();
            throw AnonymousClass000.A0s("getSmbEulaLayoutId");
        }
        if (((C57052iS) this.A0o.get()).A00() != null && AnonymousClass8BX.A0J(this.A0o).A03) {
            C139576z4 r1 = this.A0E;
            C18070vi.A0d(r1, 1);
            if ((C196549vF.A01(this) || C196549vF.A00(this)) && !r1.A02(11228)) {
                C21449AkG.A00(this.A05, this, 6);
                C189979kA r2 = (C189979kA) AnonymousClass8BX.A0J(this.A0o).A08.get();
                if (r2.A00) {
                    r2.A01.markerDrop(551497305);
                    r2.A00 = false;
                }
                r2.A00 = true;
                AnonymousClass19T r3 = r2.A01;
                r3.Bj2(551497305, true);
                r3.markerAnnotate(551497305, "is_debug_build", false);
                AnonymousClass8BX.A0J(this.A0o).A00(this);
                C33841jT.A03(this.A0M, 1, true);
                C17960vV.A07(((C57052iS) this.A0o.get()).A00());
                Intent A0A2 = C17880vN.A0A();
                A0A2.setClassName(getPackageName(), "com.whatsapp.bridge.wfs.ui.LinkedUsersActivity");
                startActivity(A0A2);
                finish();
                return;
            }
        }
        C18000vb r0 = this.A0C;
        r0.A09.add(this.A0s);
        if (C17880vN.A1W(C72453Mb.A0M(this), "is_ls_shown_during_reg") || this.A0p) {
            setContentView(2131625232);
            findViewById(2131430538).startAnimation(AnimationUtils.loadAnimation(getBaseContext(), 2130772028));
            A03(this);
            A9B.A0Q(this.A00, this, 2131430543, false, this.A0p, false);
            A0Q(this);
        } else {
            ((A29) this.A0h.get()).A01("language_selector");
            setContentView(2131626517);
            C86154Qk r22 = this.A0H;
            r22.A01 = true;
            r22.A00 = System.currentTimeMillis();
            ImageView A0I2 = AnonymousClass3MX.A0I(this, 2131433121);
            AnonymousClass3NL.A01(this, A0I2, this.A0C, 2131231900);
            AnonymousClass48o.A00(A0I2, this, 2);
            BottomSheetListView bottomSheetListView = (BottomSheetListView) findViewById(2131431940);
            C18000vb r32 = this.A0C;
            bottomSheetListView.setAdapter(new C72933Og(this, r32, C26166Ctg.A02(this.A02, this.A08, r32, this.A0Q), C26166Ctg.A04()));
            bottomSheetListView.setOnItemClickListener(new C90794ee(bottomSheetListView, this, 3));
            bottomSheetListView.setOnScrollListener(new C20309AFr(bottomSheetListView, this));
            ImageView A0I3 = AnonymousClass3MX.A0I(this, 2131430539);
            LayerDrawable layerDrawable = (LayerDrawable) A0I3.getDrawable();
            layerDrawable.setDrawableByLayerId(2131432209, AnonymousClass4aX.A08(layerDrawable.findDrawableByLayerId(2131432209), getResources().getColor(AnonymousClass4Z9.A00(this, 2130969487))));
            A0I3.setImageDrawable(layerDrawable);
        }
        boolean z = this.A0p;
        if (z) {
            A9B.A0Q(this.A00, this, 2131430543, false, z, false);
            AnonymousClass3MX.A0L(this, 2131436208).setText(2131890035);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0070, code lost:
        X.C20155A9r.A00(r3, r6, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ec, code lost:
        X.A9Q.A00(r3, r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r7) {
        /*
            r6 = this;
            r5 = 1
            if (r7 == r5) goto L_0x00b7
            r0 = 2
            if (r7 == r0) goto L_0x00c7
            r4 = 0
            switch(r7) {
                case 5: goto L_0x0074;
                case 6: goto L_0x0054;
                case 7: goto L_0x003d;
                case 8: goto L_0x0020;
                case 9: goto L_0x000f;
                default: goto L_0x000a;
            }
        L_0x000a:
            android.app.Dialog r0 = super.onCreateDialog(r7)
            return r0
        L_0x000f:
            X.3Rj r3 = X.AnonymousClass8BW.A0D(r6)
            r0 = 2131888329(0x7f1208c9, float:1.941129E38)
            r3.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 43
            goto L_0x00d6
        L_0x0020:
            r6.A00 = r0
            X.3Rj r3 = X.AnonymousClass8BW.A0D(r6)
            r0 = 2131889177(0x7f120c19, float:1.941301E38)
            r3.A0D(r0)
            r3.A0T(r4)
            r1 = 2131889426(0x7f120d12, float:1.9413515E38)
            r0 = 48
            X.C20155A9r.A01(r3, r6, r0, r1)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 49
            goto L_0x0070
        L_0x003d:
            X.3Rj r3 = X.AnonymousClass4a6.A00(r6)
            r2 = 2131889178(0x7f120c1a, float:1.9413012E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131899103(0x7f1232df, float:1.9433143E38)
            java.lang.String r0 = X.AnonymousClass8BV.A0q(r6, r1, r0, r4, r2)
            r3.A0S(r0)
            r0 = 30
            goto L_0x00ec
        L_0x0054:
            r6.A00 = r5
            X.3Rj r3 = X.AnonymousClass8BW.A0D(r6)
            r0 = 2131896779(0x7f1229cb, float:1.9428429E38)
            r3.A0D(r0)
            r3.A0T(r4)
            r1 = 2131889426(0x7f120d12, float:1.9413515E38)
            r0 = 46
            X.C20155A9r.A01(r3, r6, r0, r1)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 47
        L_0x0070:
            X.C20155A9r.A00(r3, r6, r0, r1)
            goto L_0x00ef
        L_0x0074:
            X.1mK r0 = r6.A0R
            if (r0 == 0) goto L_0x00da
            java.util.Set r0 = r0.A00
            if (r0 == 0) goto L_0x00da
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00da
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            X.1mK r0 = r6.A0R
            java.util.Set r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x008e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r1 = r2.next()
            X.2ki r1 = (X.C58452ki) r1
            r0 = 9
            r3.append(r0)
            java.lang.CharSequence r0 = r1.A00
            r3.append(r0)
            r0 = 10
            r3.append(r0)
            goto L_0x008e
        L_0x00aa:
            int r0 = r3.length()
            int r0 = r0 - r5
            r3.setLength(r0)
            java.lang.String r1 = r3.toString()
            goto L_0x00dc
        L_0x00b7:
            X.3Rj r3 = X.AnonymousClass4a6.A00(r6)
            r0 = 2131894989(0x7f1222cd, float:1.9424798E38)
            r3.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 44
            goto L_0x00d6
        L_0x00c7:
            X.3Rj r3 = X.AnonymousClass8BW.A0D(r6)
            r0 = 2131895080(0x7f122328, float:1.9424983E38)
            r3.A0D(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 45
        L_0x00d6:
            X.C20155A9r.A01(r3, r6, r0, r1)
            goto L_0x00ef
        L_0x00da:
            java.lang.String r1 = ""
        L_0x00dc:
            X.3Rj r3 = X.AnonymousClass4a6.A00(r6)
            r0 = 2131896780(0x7f1229cc, float:1.942843E38)
            java.lang.String r0 = X.C17890vO.A0R(r6, r1, r5, r4, r0)
            r3.A0S(r0)
            r0 = 29
        L_0x00ec:
            X.A9Q.A00(r3, r6, r0)
        L_0x00ef:
            X.05w r0 = r3.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.EULA.onCreateDialog(int):android.app.Dialog");
    }

    private boolean A0V(String str) {
        if (this.A0E.A02(7228)) {
            this.A0Z.get();
            if ("CA".equalsIgnoreCase(str)) {
                this.A0a.get();
                String A052 = this.A0C.A05();
                List list = C197489wm.A00;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String A0v = C17880vN.A0v(it);
                        if (A0v != null && A0v.equalsIgnoreCase(A052)) {
                            return true;
                        }
                    }
                }
            }
        }
        this.A0Z.get();
        List list2 = C197499wn.A01;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (AnonymousClass1YE.A09(C17880vN.A0v(it2), str, true)) {
                this.A0a.get();
                String A053 = this.A0C.A05();
                List list3 = C197489wm.A01;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    return false;
                }
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    String A0v2 = C17880vN.A0v(it3);
                    if (A0v2 != null && A0v2.equalsIgnoreCase(A053)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public void A2y() {
        if (!this.A0r) {
            this.A0r = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r1 = A002.AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r2 = r1.A00;
            C63932tv.A01(r1, r2, this);
            C63662tU.A00(r1, r2, this, r2.A5A);
            this.A00 = AnonymousClass1K1.A1f(A002);
            C19890zB r4 = C19890zB.A00;
            this.A05 = r4;
            this.A08 = (AnonymousClass194) r1.A9Z.get();
            this.A06 = r4;
            this.A07 = r4;
            this.A0S = (C35461mH) r1.AAr.get();
            this.A0e = C000200d.A00(r1.A4U);
            this.A04 = AnonymousClass8BV.A0A(r1);
            this.A0E = (C139576z4) r1.A01.get();
            this.A0I = (C219017v) r1.A6S.get();
            this.A0Q = AnonymousClass3MZ.A13(r1);
            this.A0C = AnonymousClass10E.A6Q(r1);
            this.A0T = AnonymousClass8BT.A0g(r1);
            this.A0K = (C33451iq) r1.ABJ.get();
            this.A09 = (C32531hL) r1.ABm.get();
            this.A0j = C000200d.A00(A002.A5g);
            this.A0J = (C32291gx) r1.A6X.get();
            this.A0M = AnonymousClass8BU.A0c(r1);
            this.A0B = AnonymousClass3Ma.A0b(r1);
            this.A0F = (A4H) r1.AKi.get();
            this.A0N = AnonymousClass8BW.A0T(r1);
            this.A0O = (C27371Vv) r1.A3Q.get();
            this.A0h = C000200d.A00(r2.AEq);
            this.A0g = C000200d.A00(r2.AEo);
            this.A0i = C000200d.A00(r1.Afu);
            this.A0c = C000200d.A00(A002.A42);
            this.A0L = (A98) r1.Ag7.get();
            this.A0D = AnonymousClass1K1.A15(A002);
            this.A0A = (AnonymousClass1VK) r1.A2S.get();
            this.A0P = (C27361Vu) r1.A5Q.get();
            this.A0H = (C86154Qk) r2.ACm.get();
            this.A0U = C000200d.A00(r2.A5q);
            this.A0o = C000200d.A00(r2.A5E);
            this.A0G = AnonymousClass3MY.A0Z(r1);
            this.A0k = C000200d.A00(r1.AA9);
            this.A0X = C000200d.A00(r1.A30);
            this.A0l = C000200d.A00(r1.AAV);
            this.A0b = C000200d.A00(r1.A4I);
            this.A0Y = C000200d.A00(r1.A3C);
            this.A0f = C000200d.A00(r1.A6D);
            this.A0m = C000200d.A00(r1.AAb);
            this.A0W = C000200d.A00(r2.A8E);
            this.A0n = C000200d.A00(r1.AkJ);
        }
    }

    public String A4b() {
        if (this.A0p) {
            Log.i("EULA/getAudioGuidanceFileId/adding new account");
            return "add_account";
        } else if (C17880vN.A1W(C72453Mb.A0M(this), "is_ls_shown_during_reg") || this.A0p) {
            Log.i("EULA/getAudioGuidanceFileId/should skip preTos");
            return "eula";
        } else {
            Log.i("EULA/getAudioGuidanceFileId/should not skip preTos");
            return "lang_selector";
        }
    }

    public C72933Og BMY() {
        C18000vb r3 = this.A0C;
        return new C72933Og(this, r3, C26166Ctg.A02(this.A02, this.A08, r3, this.A0Q), C26166Ctg.A04());
    }

    public void onBackPressed() {
        if (this.A0p) {
            Log.i("EULA/onBackPressed/is adding new account");
            A9B.A0S(this, this.A0T);
            return;
        }
        isTaskRoot();
        super.onBackPressed();
    }

    public void onDestroy() {
        AnonymousClass8BU.A1F(this.A0j);
        C18000vb r0 = this.A0C;
        r0.A09.remove(this.A0s);
        super.onDestroy();
    }

    public void onPause() {
        AGV agv = this.A0D;
        C18070vi.A0d(agv, 0);
        ((C37081ow) this.A0d.get()).A00.remove(agv);
        ((C37081ow) this.A0d.get()).A00();
        super.onPause();
    }

    public EULA(int i) {
        this.A0r = false;
        AGE.A00(this, 23);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x019c, code lost:
        if (r7 != false) goto L_0x019e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x024b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.whatsapp.registration.EULA r24) {
        /*
            r0 = 2131430538(0x7f0b0c8a, float:1.848278E38)
            r11 = r24
            android.view.View r10 = r11.findViewById(r0)
            r0 = 2131430541(0x7f0b0c8d, float:1.8482786E38)
            android.view.View r0 = r11.findViewById(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r11.A03 = r0
            X.0z4 r0 = r11.A0A
            r0.A10()
            X.00H r0 = r11.A0l
            r0.get()
            r4 = 10000000(0x989680, double:4.9406565E-317)
            X.00H r0 = r11.A0l
            long r1 = X.AnonymousClass8BV.A05(r0)
            r3 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0039
            android.content.Intent r1 = X.AnonymousClass1LU.A0K(r11, r4)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r0 = r1.setFlags(r0)
            r11.startActivity(r0)
        L_0x0039:
            X.1CM r0 = r11.A07
            int r0 = r0.A00(r3)
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "EULA/create/wrong-state bounce to main"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Intent r0 = X.AnonymousClass1LU.A0A(r11)
            r11.startActivity(r0)
            r11.finish()
            return
        L_0x0051:
            X.10I r1 = r11.A05
            X.9Am r0 = new X.9Am
            r0.<init>(r11)
            X.AnonymousClass3MW.A1T(r0, r1, r3)
            r0 = 2131430544(0x7f0b0c90, float:1.8482792E38)
            android.view.View r14 = X.C110885hR.A0A(r11, r0)
            com.whatsapp.TextEmojiLabel r14 = (com.whatsapp.TextEmojiLabel) r14
            X.0ve r2 = r11.A0E
            r1 = 8399(0x20cf, float:1.177E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0178
            X.11C r1 = r11.A08
            X.0vb r0 = r11.A0C
            X.9c6 r2 = new X.9c6
            r2.<init>(r1, r0)
            android.content.Context r1 = r11.getApplicationContext()
            X.0ve r0 = r11.A0E
            X.9f6 r5 = new X.9f6
            r5.<init>(r1, r0, r2)
            java.util.List r0 = r5.A02
            java.util.Iterator r4 = r0.iterator()
        L_0x008a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0175
            java.lang.Object r2 = r4.next()
            r0 = r2
            X.9s3 r0 = (X.C194639s3) r0
            X.1Di r1 = r0.A01
            X.9c6 r0 = r5.A01
            java.lang.Object r0 = r1.invoke(r0)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x008a
        L_0x00a5:
            X.9s3 r2 = (X.C194639s3) r2
            if (r2 == 0) goto L_0x0178
            X.9pj r0 = r2.A00
            X.9r9 r0 = r0.A00
            java.lang.String r2 = r0.A00
            java.util.Map r1 = r0.A01
            X.0ve r0 = r11.A0E
            X.1KB r13 = r11.A05
            X.1L9 r12 = r11.A01
            X.11C r15 = r11.A08
            r17 = r2
            r18 = r1
            r16 = r0
            X.C26302CxJ.A0M(r11, r12, r13, r14, r15, r16, r17, r18)
            r14.setHighlightColor(r3)
            X.10I r1 = r11.A05
            r0 = 4
        L_0x00c8:
            X.C21449AkG.A00(r1, r11, r0)
        L_0x00cb:
            android.view.WindowManager r0 = r11.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            int r2 = r0.getHeight()
            int r1 = X.C72453Mb.A08(r11)
            r0 = 1
            if (r1 != r0) goto L_0x0105
            r0 = 2131430539(0x7f0b0c8b, float:1.8482782E38)
            android.view.View r6 = r11.findViewById(r0)
            int r5 = r2 / 10
            if (r6 == 0) goto L_0x00f9
            android.view.ViewGroup$MarginLayoutParams r4 = X.AnonymousClass3MW.A0B(r6)
            int r2 = r4.leftMargin
            int r1 = r4.rightMargin
            int r0 = r4.bottomMargin
            r4.setMargins(r2, r5, r1, r0)
            r6.setLayoutParams(r4)
        L_0x00f9:
            androidx.core.widget.NestedScrollView r2 = r11.A03
            if (r2 == 0) goto L_0x0105
            r1 = 2
            X.4fZ r0 = new X.4fZ
            r0.<init>(r11, r1)
            r2.A0B = r0
        L_0x0105:
            androidx.core.widget.NestedScrollView r0 = r11.A03
            if (r0 == 0) goto L_0x0116
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 7
            X.AFe r0 = new X.AFe
            r0.<init>(r11, r1)
            r2.addOnGlobalLayoutListener(r0)
        L_0x0116:
            r0 = 2131430536(0x7f0b0c88, float:1.8482776E38)
            android.view.View r1 = X.C110885hR.A0A(r11, r0)
            r0 = 41
            X.AnonymousClass3Ma.A1A(r1, r11, r0)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "show_registration_first_dlg"
            boolean r0 = r1.getBooleanExtra(r0, r3)
            if (r0 == 0) goto L_0x0132
            r0 = 1
            X.AnonymousClass4Yv.A01(r11, r0)
        L_0x0132:
            X.1jT r1 = r11.A0M
            r0 = 1
            X.C33841jT.A03(r1, r3, r0)
            X.194 r0 = r11.A08
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = "EULA/clock-wrong"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.17v r1 = r11.A0I
            X.1gx r0 = r11.A0J
            X.C88364Zk.A02(r11, r1, r0)
        L_0x014c:
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BR.A08(r11)
            java.lang.String r0 = "input_enter_send"
            X.C17880vN.A1F(r1, r0, r3)
            r0 = 2131430539(0x7f0b0c8b, float:1.8482782E38)
            android.view.View r0 = r11.findViewById(r0)
            r11.A01 = r0
            if (r10 == 0) goto L_0x0169
            android.view.ViewTreeObserver r1 = r10.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r11.A02
            r1.addOnGlobalLayoutListener(r0)
        L_0x0169:
            X.1hL r0 = r11.A09
            r0.A02()
            X.10I r1 = r11.A05
            r0 = 6
            X.C21449AkG.A00(r1, r11, r0)
            return
        L_0x0175:
            r2 = 0
            goto L_0x00a5
        L_0x0178:
            X.11C r0 = r11.A08
            android.telephony.TelephonyManager r0 = r0.A0K()
            if (r0 == 0) goto L_0x0264
            java.lang.String r5 = r0.getSimCountryIso()
        L_0x0184:
            X.00H r1 = r11.A0Z
            r1.get()
            java.lang.String r0 = "gb"
            boolean r7 = r0.equalsIgnoreCase(r5)
            r1.get()
            java.util.List r0 = X.C197499wn.A00
            boolean r4 = X.C29431cG.A18(r0, r5)
            r2 = 1
            if (r4 != 0) goto L_0x019e
            r9 = 0
            if (r7 == 0) goto L_0x019f
        L_0x019e:
            r9 = 1
        L_0x019f:
            boolean r8 = r11.A0V(r5)
            r0 = 2131890036(0x7f120f74, float:1.9414752E38)
            java.lang.String r1 = r11.getString(r0)
            if (r9 == 0) goto L_0x0250
            r0 = 2131890039(0x7f120f77, float:1.9414759E38)
        L_0x01af:
            java.lang.String r23 = X.C17890vO.A0R(r11, r1, r2, r3, r0)
        L_0x01b3:
            r0 = 2131890037(0x7f120f75, float:1.9414754E38)
            java.lang.String r21 = r11.getString(r0)
            r0 = 2131430540(0x7f0b0c8c, float:1.8482784E38)
            com.whatsapp.TextEmojiLabel r6 = X.AnonymousClass8BR.A0H(r11, r0)
            java.util.HashMap r5 = X.C17880vN.A11()
            X.1LC r1 = r11.A03
            java.lang.String r0 = "https://www.whatsapp.com/legal/privacy-policy"
            android.net.Uri r1 = r1.A01(r0, r7, r4, r2)
            java.lang.String r0 = "privacy-policy"
            r5.put(r0, r1)
            X.1LC r1 = r11.A03
            java.lang.String r0 = "https://www.whatsapp.com/legal/terms-of-service"
            android.net.Uri r1 = r1.A01(r0, r7, r4, r2)
            java.lang.String r0 = "terms-and-privacy-policy"
            r5.put(r0, r1)
            if (r8 == 0) goto L_0x020e
            if (r6 == 0) goto L_0x020e
            X.1LC r1 = r11.A03
            java.lang.String r0 = "https://faq.whatsapp.com/227626810186044"
            android.net.Uri r1 = r1.A01(r0, r3, r3, r3)
            java.lang.String r0 = "manage-data"
            r5.put(r0, r1)
            X.0ve r4 = r11.A0E
            X.1KB r2 = r11.A05
            X.1L9 r1 = r11.A01
            X.11C r0 = r11.A08
            r15 = r11
            r16 = r1
            r17 = r2
            r18 = r6
            r19 = r0
            r20 = r4
            r22 = r5
            X.C26302CxJ.A0M(r15, r16, r17, r18, r19, r20, r21, r22)
            r6.setVisibility(r3)
            r6.setHighlightColor(r3)
        L_0x020e:
            if (r9 == 0) goto L_0x021d
            X.1LC r1 = r11.A03
            java.lang.String r0 = "https://www.whatsapp.com/legal/information-for-people-who-dont-use-whatsapp"
            android.net.Uri r1 = r1.A00(r0)
            java.lang.String r0 = "learn-more"
            r5.put(r0, r1)
        L_0x021d:
            X.0ve r4 = r11.A0E
            X.1KB r2 = r11.A05
            X.1L9 r1 = r11.A01
            X.11C r0 = r11.A08
            r24 = r5
            r17 = r11
            r18 = r1
            r19 = r2
            r20 = r14
            r21 = r0
            r22 = r4
            X.C26302CxJ.A0M(r17, r18, r19, r20, r21, r22, r23, r24)
            r14.setHighlightColor(r3)
            if (r9 == 0) goto L_0x0249
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131169440(0x7f0710a0, float:1.795321E38)
            float r0 = r1.getDimension(r0)
            r14.setTextSize(r3, r0)
        L_0x0249:
            if (r8 == 0) goto L_0x00cb
            X.10I r1 = r11.A05
            r0 = 5
            goto L_0x00c8
        L_0x0250:
            boolean r0 = r11.A0V(r5)
            if (r0 == 0) goto L_0x025f
            r0 = 2131890040(0x7f120f78, float:1.941476E38)
            java.lang.String r23 = r11.getString(r0)
            goto L_0x01b3
        L_0x025f:
            r0 = 2131890038(0x7f120f76, float:1.9414757E38)
            goto L_0x01af
        L_0x0264:
            r5 = 0
            goto L_0x0184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.EULA.A03(com.whatsapp.registration.EULA):void");
    }

    public static void A0Q(EULA eula) {
        TextView A0L2 = AnonymousClass3MX.A0L(eula, 2131431938);
        if (eula.A0p) {
            A0L2.setVisibility(8);
            return;
        }
        ((A29) eula.A0h.get()).A01("eula_with_language_selector");
        A0L2.setText(C26166Ctg.A01(C25351CeA.A01(Locale.getDefault())));
        A0L2.setOnClickListener(new AnonymousClass6LF(eula, A0L2, 21));
        AnonymousClass4aX.A0E(A0L2, AnonymousClass3Ma.A01(eula, eula.getResources(), 2130970098, 2131101221));
    }

    public String A4c() {
        if (C17880vN.A1W(C72453Mb.A0M(this), "is_ls_shown_during_reg") || this.A0p) {
            return "eula_screen";
        }
        return "language_selector";
    }

    public void BsZ() {
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, 2131895081);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0N.A02("eula");
            ((C58712l8) this.A0j.get()).A01(this, this.A0N, "eula");
            ((A29) this.A0h.get()).A03("eula_screen", "tapped", "menu_help_tapped");
            return true;
        } else if (itemId == 1) {
            C21449AkG.A00(this.A05, this, 3);
            return true;
        } else if (itemId != 2) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            C17880vN.A1F(C19830z4.A00(this.A0A), "is_ls_shown_during_reg", false);
            recreate();
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        int i = this.A00;
        int i2 = 6;
        if (i != 1) {
            if (i == 2) {
                i2 = 8;
            }
            ((C37081ow) this.A0d.get()).A02(this.A0D);
            ((C37081ow) this.A0d.get()).A01(this);
        }
        AnonymousClass4Yv.A01(this, i2);
        ((C37081ow) this.A0d.get()).A02(this.A0D);
        ((C37081ow) this.A0d.get()).A01(this);
    }

    public EULA() {
        this(0);
        this.A00 = 0;
        this.A01 = null;
        this.A0p = false;
        this.A0Z = C221618v.A00(C197499wn.class);
        this.A0a = C221618v.A00(C197489wm.class);
        this.A0V = C221618v.A00(C20138A8z.class);
        this.A02 = new C20296AFe(this, 6);
        this.A0s = new C95294m0(this, 2);
    }
}
