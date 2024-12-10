package com.whatsapp.wabloks.ui;

import X.A2X;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass16T;
import X.AnonymousClass16U;
import X.AnonymousClass1GP;
import X.AnonymousClass3MX;
import X.AnonymousClass6NY;
import X.AnonymousClass6Np;
import X.AnonymousClass6Nq;
import X.AnonymousClass74k;
import X.AnonymousClass86V;
import X.AnonymousClass86W;
import X.AnonymousClass89U;
import X.AnonymousClass89W;
import X.C108185bH;
import X.C108955ca;
import X.C114935sU;
import X.C115075tM;
import X.C115085tN;
import X.C115535vJ;
import X.C123626Ve;
import X.C133976po;
import X.C178149Bz;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C197609wy;
import X.C199029zJ;
import X.C20000A2o;
import X.C20049A4s;
import X.C21104AeY;
import X.C21106Aea;
import X.C221618v;
import X.C23391Fw;
import X.C23401Fx;
import X.C26209Cul;
import X.C26743DBw;
import X.C26744DBx;
import X.C56382hN;
import X.CXN;
import X.CXY;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BloksCDSBottomSheetActivity;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WaBloksActivity extends C114935sU implements AnonymousClass89U, AnonymousClass89W {
    public static boolean A0H;
    public C56382hN A00;
    public CXY A01;
    public C20049A4s A02;
    public CXN A03;
    public C20000A2o A04;
    public C115075tM A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08 = C221618v.A00(AnonymousClass16T.class);
    public AnonymousClass00H A09 = C221618v.A00(AnonymousClass16U.class);
    public Map A0A;
    public Map A0B;
    public Map A0C;
    public C115085tN A0D;
    public String A0E;
    public final Set A0F = C17880vN.A12();
    public final Set A0G = C17880vN.A12();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: com.whatsapp.bloks.components.BkCdsBottomSheetFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: com.whatsapp.authgraphql.ui.CommonBloksScreenFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: com.whatsapp.wabloks.base.FdsContentFragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment} */
    /* JADX WARNING: type inference failed for: r7v1, types: [com.whatsapp.wabloks.base.BkFragment, com.whatsapp.wabloks.base.BkScreenFragment, com.whatsapp.wabloks.base.Hilt_BkScreenFragment] */
    /* JADX WARNING: type inference failed for: r7v6, types: [com.whatsapp.inappsupport.ui.SupportBkScreenFragment] */
    /* JADX WARNING: type inference failed for: r7v8, types: [com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4b(android.content.Intent r30, android.os.Bundle r31) {
        /*
            r29 = this;
            r0 = r29
            X.1GP r3 = r0.getSupportFragmentManager()
            boolean r1 = r0 instanceof com.whatsapp.wabloks.ui.WaFcsPreloadedBloksActivity
            r2 = r30
            if (r1 == 0) goto L_0x0109
            java.lang.String r1 = "screen_name"
            java.lang.String r5 = r2.getStringExtra(r1)
            java.lang.String r1 = "fds_state_name"
            java.lang.String r6 = r2.getStringExtra(r1)
            java.lang.String r1 = "data_module_job_id"
            java.lang.String r7 = r2.getStringExtra(r1)
            java.lang.String r1 = "data_module_namespace"
            java.lang.String r8 = r2.getStringExtra(r1)
            java.lang.String r1 = "screen_params"
            java.lang.String r9 = r2.getStringExtra(r1)
            java.lang.String r1 = "screen_cache_config"
            android.os.Parcelable r4 = r2.getParcelableExtra(r1)
            X.ADL r4 = (X.ADL) r4
            java.lang.String r1 = "qpl_param_map"
            java.lang.String r10 = r2.getStringExtra(r1)
            java.lang.String r1 = "fds_manager_id"
            java.lang.String r11 = r2.getStringExtra(r1)
            java.lang.String r1 = "fds_observer_id"
            java.lang.String r12 = r2.getStringExtra(r1)
            com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment r7 = X.AnonymousClass6Y3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0048:
            boolean r1 = r7 instanceof com.whatsapp.wabloks.base.BkFragment
            if (r1 == 0) goto L_0x0069
            java.lang.String r1 = r0.A0E
            if (r1 == 0) goto L_0x0069
            X.00H r1 = r0.A09
            java.lang.Object r4 = r1.get()
            X.16U r4 = (X.AnonymousClass16U) r4
            java.lang.String r2 = r0.A0E
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            java.util.Map r1 = r4.A00
            r1.get(r2)
            r2 = r7
            com.whatsapp.wabloks.base.BkFragment r2 = (com.whatsapp.wabloks.base.BkFragment) r2
            r1 = 0
            r2.A06 = r1
        L_0x0069:
            int r1 = r3.A0K()
            if (r1 != 0) goto L_0x0084
            if (r7 == 0) goto L_0x0084
            X.1jj r2 = new X.1jj
            r2.<init>(r3)
            r1 = 2131428247(0x7f0b0397, float:1.8478133E38)
            r2.A08(r7, r1)
            java.lang.String r1 = r0.A0E
            r2.A0H(r1)
            r2.A02()
        L_0x0084:
            java.lang.String r4 = r0.A0E
            java.util.Map r1 = r0.A0C
            java.lang.Object r2 = r1.get(r4)
            X.89V r2 = (X.AnonymousClass89V) r2
            if (r2 != 0) goto L_0x00a3
            boolean r1 = r0 instanceof X.AnonymousClass869
            if (r1 == 0) goto L_0x00de
            r1 = r0
            X.869 r1 = (X.AnonymousClass869) r1
            X.6NY r1 = (X.AnonymousClass6NY) r1
            X.00H r1 = r1.A01
            if (r1 == 0) goto L_0x0285
            java.lang.Object r2 = X.C18070vi.A0E(r1)
        L_0x00a1:
            X.89V r2 = (X.AnonymousClass89V) r2
        L_0x00a3:
            X.00H r1 = r0.A07
            java.lang.Object r1 = r1.get()
            X.74k r1 = (X.AnonymousClass74k) r1
            X.5tM r1 = r2.BHc(r0, r1)
            r0.A05 = r1
            X.5tN r1 = r2.BHZ(r0)
            r0.A0D = r1
            java.util.Set r3 = r0.A0F
            r3.add(r1)
            java.util.Set r2 = r0.A0G
            X.5tN r1 = r0.A0D
            r2.add(r1)
            X.5tM r1 = r0.A05
            r3.add(r1)
            java.util.Iterator r2 = r3.iterator()
        L_0x00cc:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0284
            java.lang.Object r1 = r2.next()
            android.app.Application$ActivityLifecycleCallbacks r1 = (android.app.Application.ActivityLifecycleCallbacks) r1
            r3 = r31
            r1.onActivityCreated(r0, r3)
            goto L_0x00cc
        L_0x00de:
            java.util.Map r1 = r0.A0B
            java.util.Iterator r3 = X.AnonymousClass000.A15(r1)
        L_0x00e4:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0103
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r3)
            java.lang.Object r1 = r2.getKey()
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            java.util.regex.Matcher r1 = r1.matcher(r4)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L_0x00e4
            java.lang.Object r2 = r2.getValue()
            goto L_0x00a1
        L_0x0103:
            X.7OX r2 = new X.7OX
            r2.<init>(r0)
            goto L_0x00a3
        L_0x0109:
            boolean r1 = r0 instanceof com.whatsapp.wabloks.ui.WaFcsModalActivity
            if (r1 == 0) goto L_0x0122
            r5 = r0
            com.whatsapp.wabloks.ui.WaFcsModalActivity r5 = (com.whatsapp.wabloks.ui.WaFcsModalActivity) r5
            java.lang.String r4 = "fds_observer_id"
            java.lang.String r1 = r2.getStringExtra(r4)
            com.whatsapp.wabloks.base.FdsContentFragmentManager r7 = new com.whatsapp.wabloks.base.FdsContentFragmentManager
            r7.<init>()
            X.C108985cd.A15(r7, r4, r1)
            r5.A00 = r7
            goto L_0x0048
        L_0x0122:
            boolean r1 = r0 instanceof com.whatsapp.wabloks.ui.WaBloksGenericBottomSheetActivity
            if (r1 == 0) goto L_0x0129
            r7 = 0
            goto L_0x0048
        L_0x0129:
            boolean r1 = r0 instanceof com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity
            if (r1 != 0) goto L_0x027d
            boolean r1 = r0 instanceof com.whatsapp.wabloks.ui.WaBloksActivityWithCustomPreloadScreens
            if (r1 == 0) goto L_0x015a
            java.lang.String r1 = "screen_name"
            java.lang.String r6 = r2.getStringExtra(r1)
            if (r6 == 0) goto L_0x028c
            java.lang.String r1 = "screen_params"
            java.lang.String r5 = r2.getStringExtra(r1)
            java.lang.String r1 = "screen_cache_config"
            android.os.Parcelable r4 = r2.getParcelableExtra(r1)
            X.ADL r4 = (X.ADL) r4
            java.lang.String r1 = "qpl_param_map"
            java.lang.String r1 = r2.getStringExtra(r1)
            com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens r7 = new com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens
            r7.<init>()
            r7.A2A(r6)
            X.C108995ce.A1F(r7, r4, r1, r5)
            goto L_0x0048
        L_0x015a:
            boolean r1 = r0 instanceof com.whatsapp.payments.care.csat.CsatSurveyBloksActivity
            if (r1 != 0) goto L_0x027d
            boolean r1 = r0 instanceof com.whatsapp.inappsupport.ui.SupportBloksActivity
            if (r1 == 0) goto L_0x01cc
            java.lang.String r1 = "screen_name"
            java.lang.String r8 = r2.getStringExtra(r1)
            if (r8 != 0) goto L_0x016c
            java.lang.String r8 = ""
        L_0x016c:
            java.lang.String r1 = "com.bloks.www.csf"
            boolean r1 = X.C108975cc.A1N(r1, r8)
            if (r1 != 0) goto L_0x01b0
            java.lang.String r1 = "com.bloks.www.cxthelp"
            boolean r1 = X.C108975cc.A1N(r1, r8)
            if (r1 == 0) goto L_0x01b0
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r6 = "screen_params"
            java.lang.String r5 = r1.getStringExtra(r6)
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r4 = "screen_cache_config"
            android.os.Parcelable r2 = r1.getParcelableExtra(r4)
            X.ADL r2 = (X.ADL) r2
            com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment r7 = new com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment
            r7.<init>()
        L_0x0197:
            r7.A2A(r8)
        L_0x019a:
            com.whatsapp.wabloks.base.BkFragment.A03(r7)
            android.os.Bundle r1 = r7.A15()
            r1.putSerializable(r6, r5)
            com.whatsapp.wabloks.base.BkFragment.A03(r7)
            android.os.Bundle r1 = r7.A15()
            r1.putParcelable(r4, r2)
            goto L_0x0048
        L_0x01b0:
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r6 = "screen_params"
            java.lang.String r5 = r1.getStringExtra(r6)
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r4 = "screen_cache_config"
            android.os.Parcelable r2 = r1.getParcelableExtra(r4)
            X.ADL r2 = (X.ADL) r2
            com.whatsapp.inappsupport.ui.SupportBkScreenFragment r7 = new com.whatsapp.inappsupport.ui.SupportBkScreenFragment
            r7.<init>()
            goto L_0x0197
        L_0x01cc:
            boolean r1 = r0 instanceof com.whatsapp.avatar.editor.AvatarEditorLauncherFSActivity
            if (r1 == 0) goto L_0x022c
            r1 = r0
            com.whatsapp.avatar.editor.AvatarEditorLauncherFSActivity r1 = (com.whatsapp.avatar.editor.AvatarEditorLauncherFSActivity) r1
            java.lang.String r4 = "screen_name"
            java.lang.String r2 = r2.getStringExtra(r4)
            r6 = 0
            X.C08 r4 = X.D8F.A0N
            java.lang.Integer r18 = X.AnonymousClass00R.A0C
            X.C0B r4 = X.C0B.FULL_SCREEN
            X.C07 r4 = X.C07.AUTO
            X.C06 r14 = X.C06.AUTO
            X.C08 r11 = X.C08.ANIMATED
            X.C0B r16 = X.C0B.FULL_SCREEN
            X.C07 r15 = X.C07.DISABLED
            X.6Vl r17 = new X.6Vl
            r17.<init>()
            X.6bF r5 = r1.A01
            if (r5 == 0) goto L_0x0291
            X.7Bf r4 = new X.7Bf
            r4.<init>(r5)
            X.D3L r10 = new X.D3L
            r10.<init>(r4)
            X.C05 r13 = X.C05.SAME_SIZE
            r23 = 16542(0x409e, float:2.318E-41)
            java.lang.Integer r21 = X.AnonymousClass00R.A00
            X.BpJ r8 = X.C23774BpJ.A00
            r24 = 0
            r9 = r6
            r12 = r6
            r19 = r6
            r20 = r6
            r22 = r6
            r26 = r24
            r27 = r24
            r28 = r24
            X.D8F r5 = new X.D8F
            r7 = r6
            r25 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r7 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A01(r5, r2)
            r1.A04 = r7
            X.9WU r2 = new X.9WU
            r2.<init>(r1)
            r7.A00 = r2
            goto L_0x0048
        L_0x022c:
            boolean r4 = r0 instanceof com.whatsapp.authgraphql.ui.CommonBloksActivity
            java.lang.String r1 = "screen_name"
            if (r4 == 0) goto L_0x0252
            java.lang.String r1 = r2.getStringExtra(r1)
            if (r1 != 0) goto L_0x023a
            java.lang.String r1 = ""
        L_0x023a:
            java.lang.String r6 = "screen_params"
            java.lang.String r5 = r2.getStringExtra(r6)
            java.lang.String r4 = "screen_cache_config"
            android.os.Parcelable r2 = r2.getParcelableExtra(r4)
            X.ADL r2 = (X.ADL) r2
            com.whatsapp.authgraphql.ui.CommonBloksScreenFragment r7 = new com.whatsapp.authgraphql.ui.CommonBloksScreenFragment
            r7.<init>()
            r7.A2A(r1)
            goto L_0x019a
        L_0x0252:
            java.lang.String r6 = r2.getStringExtra(r1)
            java.lang.String r1 = "screen_params"
            java.lang.String r5 = r2.getStringExtra(r1)
            java.lang.String r1 = "screen_cache_config"
            android.os.Parcelable r4 = r2.getParcelableExtra(r1)
            X.ADL r4 = (X.ADL) r4
            java.lang.String r1 = "qpl_param_map"
            java.lang.String r2 = r2.getStringExtra(r1)
            r1 = 0
            X.C18070vi.A0d(r6, r1)
            com.whatsapp.wabloks.base.BkScreenFragment r7 = new com.whatsapp.wabloks.base.BkScreenFragment
            r7.<init>()
            r7.A2A(r6)
            X.C108995ce.A1F(r7, r4, r2, r5)
            r7.A07 = r1
            goto L_0x0048
        L_0x027d:
            androidx.fragment.app.Fragment r7 = new androidx.fragment.app.Fragment
            r7.<init>()
            goto L_0x0048
        L_0x0284:
            return
        L_0x0285:
            java.lang.String r0 = "phoenixBloksActivityHelper"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x028c:
            java.lang.IllegalArgumentException r0 = X.C17890vO.A0K()
            throw r0
        L_0x0291:
            java.lang.String r0 = "avatarEditorDismissCallback"
            X.C18070vi.A11(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wabloks.ui.WaBloksActivity.A4b(android.content.Intent, android.os.Bundle):void");
    }

    public CXY Bbg() {
        CXY cxy = this.A01;
        if (cxy != null) {
            return cxy;
        }
        C115535vJ A002 = C197609wy.A00(this, getSupportFragmentManager(), this.A00, this.A0A);
        this.A01 = A002;
        return A002;
    }

    public void onBackPressed() {
        BkCdsBottomSheetFragment bkCdsBottomSheetFragment;
        boolean z;
        A2X a2x;
        A2X a2x2;
        C115075tM r1 = this.A05;
        if (r1 != null) {
            if (r1 instanceof AnonymousClass6Np) {
                z = AnonymousClass000.A1W(((AnonymousClass6Np) r1).A00);
            } else {
                z = r1 instanceof AnonymousClass6Nq;
            }
            if (z) {
                if (r1 instanceof AnonymousClass6Np) {
                    AnonymousClass6Np r12 = (AnonymousClass6Np) r1;
                    if (r12.A00 != null) {
                        CXY Bbg = r12.A03.Bbg();
                        C26209Cul.A05(C199029zJ.A01, r12.A00.BM3(), Bbg);
                        return;
                    }
                    return;
                } else if (r1 instanceof AnonymousClass6Nq) {
                    AnonymousClass6Nq r13 = (AnonymousClass6Nq) r1;
                    WaBloksActivity waBloksActivity = r13.A03;
                    C18070vi.A0z(waBloksActivity, "null cannot be cast to non-null type com.whatsapp.wabloks.ui.WaBloksPhoenixBaseActivity");
                    AnonymousClass6NY r6 = (AnonymousClass6NY) waBloksActivity;
                    C133976po r5 = r13.A00;
                    String str = r5.A02;
                    String str2 = r6.A03;
                    if (!(str2 == null || (a2x2 = r6.A00) == null)) {
                        a2x2.A02(new C21104AeY(str2, str));
                    }
                    String str3 = r5.A00;
                    String str4 = r5.A01;
                    if (r6.A05 && (a2x = r6.A00) != null) {
                        a2x.A02(new C21106Aea(str3, str4, true));
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
        List A042 = supportFragmentManager.A0U.A04();
        Fragment fragment = null;
        if (!A042.isEmpty()) {
            fragment = (Fragment) A042.get(AnonymousClass3MX.A01(A042));
        }
        if ((fragment instanceof BkCdsBottomSheetFragment) && (bkCdsBottomSheetFragment = (BkCdsBottomSheetFragment) fragment) != null) {
            BkCdsBottomSheetFragment.A00(bkCdsBottomSheetFragment).A05(bkCdsBottomSheetFragment.A14());
        } else if (supportFragmentManager.A0K() <= 1) {
            setResult(0, C123626Ve.A00(getIntent()));
            finish();
        } else {
            super.onBackPressed();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        for (C108185bH BqX : this.A0G) {
            BqX.BqX(menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        for (C108185bH Bze : this.A0G) {
            if (Bze.Bze(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        for (C108185bH C1Y : this.A0G) {
            C1Y.C1Y(menu);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public CXN BNV() {
        return this.A03;
    }

    public void CR1(AnonymousClass86W r3) {
        if (((C23391Fw) getLifecycle()).A02.A00(C23401Fx.CREATED)) {
            this.A05.A04(r3);
        }
    }

    public void CR2(AnonymousClass86V r3, AnonymousClass86W r4, boolean z) {
        if (((C23391Fw) getLifecycle()).A02.A00(C23401Fx.CREATED)) {
            C115085tN r0 = this.A0D;
            if (r0 != null) {
                r0.A01(r3, r4);
            }
            if (z) {
                onCreateOptionsMenu(this.A02.getMenu());
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this instanceof BloksCDSBottomSheetActivity) {
            i = 2131627510;
        } else {
            i = 2131624122;
        }
        setContentView(i);
        Intent intent = getIntent();
        this.A0E = intent.getStringExtra("screen_name");
        String str = this.A0E;
        C18070vi.A0d(str, 0);
        ((AnonymousClass16T) this.A08.get()).A00 = str;
        if (this.A01 == null) {
            this.A01 = C197609wy.A00(this, getSupportFragmentManager(), this.A00, this.A0A);
        }
        C18030ve r1 = this.A0E;
        C18040vf r2 = C18040vf.A02;
        if ((C18020vd.A05(r2, r1, 8202) || C18020vd.A05(r2, this.A0E, 12585)) && !A0H) {
            C26744DBx.A01(new C26743DBw((AnonymousClass74k) this.A07.get()));
            A0H = true;
        }
        C20049A4s a4s = this.A02;
        if (!a4s.A00) {
            C20049A4s.A00(a4s);
        }
        A4b(intent, bundle);
    }

    public void onDestroy() {
        if (isFinishing() && getIntent().getStringExtra("wa_screen_options") != null) {
            this.A04.A05(C178149Bz.A00(C108955ca.A0r(this, "wa_screen_options")), "wa_screen_options");
        }
        if (this.A0E != null) {
            String str = this.A0E;
            C18070vi.A0d(str, 0);
            ((AnonymousClass16U) this.A09.get()).A00.remove(str);
        }
        super.onDestroy();
    }

    public void setRequestedOrientation(int i) {
        super.setRequestedOrientation(i);
    }
}
