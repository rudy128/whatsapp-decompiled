package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.WaButtonWithLoader;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.3rb  reason: invalid class name and case insensitive filesystem */
public final class C77853rb extends C75423hT implements C28741ap {
    public static final Integer A0J = AnonymousClass00R.A01;
    public Menu A00;
    public WaButtonWithLoader A01;
    public C86924Tp A02;
    public C90594eK A03;
    public boolean A04 = true;
    public boolean A05;
    public final AnonymousClass11C A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass1c4 A08;
    public final AnonymousClass74D A09;
    public final AnonymousClass440 A0A;
    public final AnonymousClass00H A0B;
    public final C19880zA A0C;
    public final C19880zA A0D;
    public final AnonymousClass1Q1 A0E;
    public final C76823oU A0F;
    public final C86454Rr A0G;
    public final AnonymousClass00H A0H;
    public final C18100vl A0I = AnonymousClass1DF.A01(new AnonymousClass5GC(this));

    public /* synthetic */ void BoD(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoE(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoF(AnonymousClass1BI r1, Integer num) {
    }

    public void BoG(AnonymousClass1BI r3, boolean z) {
        C18070vi.A0d(r3, 0);
        if (C18070vi.A18(this.A0G, r3)) {
            A0A(this, false);
        }
    }

    public /* synthetic */ void BoJ(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoK() {
    }

    public /* synthetic */ void BoO(AnonymousClass1BI r1, C32961i2 r2) {
    }

    public /* synthetic */ void BoP(AnonymousClass1BI r1, AnonymousClass201 r2) {
    }

    public /* synthetic */ void BoQ(AnonymousClass1BI r1, Collection collection, int i, boolean z) {
    }

    public /* synthetic */ void BoR(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoS(AnonymousClass1BI r1, Collection collection) {
    }

    public /* synthetic */ void BoW(AnonymousClass1BI r1) {
    }

    public /* synthetic */ void BoX(AnonymousClass1BI r1, Integer num) {
    }

    public /* synthetic */ void BoY(AnonymousClass1BI r1, C32961i2 r2) {
    }

    public /* synthetic */ void BoZ(AnonymousClass1BI r1) {
    }

    public boolean Bze(MenuItem menuItem) {
        int i;
        String A10;
        int i2;
        int i3;
        if (menuItem == null) {
            return super.Bze((MenuItem) null);
        }
        int itemId = menuItem.getItemId();
        if (itemId != 7) {
            switch (itemId) {
                case 53:
                    A09(this, false);
                    return true;
                case 54:
                    A0B(this, false);
                    return true;
                case 55:
                    A06(this);
                    return true;
                case 56:
                case 59:
                    C46162Dk A032 = A03(this);
                    if (A032 != null) {
                        AnonymousClass01E r5 = this.A01;
                        C18070vi.A0W(r5);
                        C73203Rj A002 = AnonymousClass4a6.A00(r5);
                        A002.A0S(C17880vN.A0q(r5, A032.A0T, new Object[1], 0, 2131897309));
                        C73203Rj.A05(r5, A002, 3, 2131898766);
                        A002.A0g(r5, new C91624fz(this, 30), 2131897305);
                        AnonymousClass3MY.A1G(A002);
                        return true;
                    }
                    break;
                case 57:
                    Intent intent = new Intent("android.intent.action.SEND");
                    C46162Dk A033 = A03(this);
                    if (A033 == null) {
                        A10 = "";
                    } else {
                        String str = A033.A0R;
                        if (str != null) {
                            i = 2131892897;
                        } else {
                            str = A033.A0S;
                            i = 2131892898;
                        }
                        AnonymousClass01E r2 = this.A01;
                        Object[] A1b = AnonymousClass3MW.A1b();
                        A1b[0] = A033.A0T;
                        A10 = AnonymousClass3Ma.A10(r2, str, A1b, 1, i);
                    }
                    intent.putExtra("android.intent.extra.TEXT", A10);
                    this.A09.A0D(A0J(), (Integer) null, 3, 3);
                    intent.setType("text/plain");
                    intent.addFlags(524288);
                    this.A01.startActivity(Intent.createChooser(intent, A10));
                    return true;
                case 58:
                    C46162Dk A034 = A03(this);
                    if (A034 != null) {
                        AnonymousClass01E r52 = this.A01;
                        Intent intent2 = r52.getIntent();
                        if (intent2 != null) {
                            i2 = intent2.getIntExtra("mat_entry_point", 0);
                        } else {
                            i2 = 0;
                        }
                        Intent intent3 = r52.getIntent();
                        if (intent3 != null) {
                            i3 = intent3.getIntExtra("extra_forwarded_message_thread_type", -1);
                        } else {
                            i3 = -1;
                        }
                        Intent A102 = AnonymousClass1LU.A10(r52, A034.A08(), (Long) null, i2, i3, true);
                        Bundle A003 = AnonymousClass4ZR.A00(r52, AnonymousClass3MY.A0H(r52, 2131436426), this.A07);
                        C29681ch A0J2 = A0J();
                        Integer num = A0J;
                        C18070vi.A0d(A0J2, 0);
                        C18070vi.A0d(num, 1);
                        C60442o2.A00(A102, this.A07, C72463Mc.A0p(r52));
                        r52.startActivity(A102, A003);
                        return true;
                    }
                    break;
                default:
                    switch (itemId) {
                        case 61:
                            C46162Dk A035 = A03(this);
                            if (A035 != null) {
                                AnonymousClass01E r3 = this.A01;
                                C18070vi.A0W(r3);
                                Intent A16 = AnonymousClass1LU.A16(r3, A035.A0M(), 1);
                                C60442o2.A00(A16, this.A07, C72463Mc.A0p(r3));
                                r3.startActivity(A16, (Bundle) null);
                                return true;
                            }
                            break;
                        case 62:
                            AnonymousClass01E r53 = this.A01;
                            C18070vi.A0W(r53);
                            C29681ch A0J3 = A0J();
                            Intent A072 = AnonymousClass3MZ.A07(A0J3, 1);
                            A072.setClassName(r53.getPackageName(), "com.whatsapp.newsletter.ui.settings.NewsletterSettingsActivity");
                            AnonymousClass3MY.A12(A072, A0J3, "jid");
                            r53.startActivity(A072);
                            return true;
                        case 63:
                        case 64:
                            break;
                        default:
                            super.Bze(menuItem);
                            break;
                    }
            }
            return true;
        }
        this.A01.onSearchRequested();
        return true;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C18070vi.A0d(activity, 0);
        super.onActivityCreated(activity, bundle);
        this.A0E.registerObserver(this);
        AnonymousClass440 r4 = this.A0A;
        C91644g1.A00((AnonymousClass1FB) activity, r4.A01, new C105305Rm(this), 5);
        AnonymousClass1F9 r6 = (AnonymousClass1F9) activity;
        C91644g1.A00(r6, r4.A00, new C105315Rn(this), 5);
        C91644g1.A00(r6, C95424mD.A00(r4), new C105325Ro(this), 5);
    }

    public void onActivityDestroyed(Activity activity) {
        C18070vi.A0d(activity, 0);
        super.onActivityDestroyed(activity);
        this.A0E.unregisterObserver(this);
        ((AnonymousClass1FB) activity).getLifecycle().A06(this.A0A);
    }

    public void onActivityResumed(Activity activity) {
        C18070vi.A0d(activity, 0);
        if (C95424mD.A00(this.A0A).A06() != null) {
            A0A(this, false);
        }
    }

    public static final C46162Dk A03(C77853rb r4) {
        AnonymousClass440 r3 = r4.A0A;
        if (r3.A0U() == null) {
            r4.A04.A0J(new C98774rh(r4, 19));
        }
        return r3.A0U();
    }

    private final void A04(int i) {
        Menu menu = this.A00;
        if (menu != null) {
            MenuItem findItem = menu.findItem(60);
            if (findItem != null) {
                findItem.setVisible(true);
            }
            Menu menu2 = this.A00;
            if (menu2 != null) {
                MenuItem findItem2 = menu2.findItem(i);
                if (findItem2 != null) {
                    findItem2.setVisible(false);
                    return;
                }
                return;
            }
        }
        C18070vi.A11("menu");
        throw null;
    }

    public static final void A06(C77853rb r11) {
        WaButtonWithLoader waButtonWithLoader = r11.A01;
        if (waButtonWithLoader != null) {
            waButtonWithLoader.A02();
        }
        Integer num = A0J;
        Integer A042 = ((A6Q) r11.A0H.get()).A04(C1402570p.A01(num), C1402570p.A00(num));
        AnonymousClass440 r2 = r11.A0A;
        C29681ch A0J2 = r11.A0J();
        C18070vi.A0d(A0J2, 0);
        r2.A03.A0D(A0J2, A042);
        AnonymousClass01E r1 = r11.A01;
        r11.A09.A0H(r11.A0J(), AnonymousClass4aS.A00(r1.getIntent()), num, r11.A09.getSimilarChannelsSessionId(), (String) null, AnonymousClass4aS.A01(r1), (String) null, -1, -1);
    }

    public static final void A07(C77853rb r16) {
        C77853rb r2 = r16;
        C46162Dk A032 = A03(r2);
        if (A032 != null) {
            Menu menu = r2.A00;
            if (menu == null) {
                C18070vi.A11("menu");
                throw null;
            }
            MenuItem findItem = menu.findItem(53);
            if (findItem != null) {
                findItem.setVisible(false);
            }
            C72453Mb.A19(menu, 54, false);
            C72453Mb.A19(menu, 1, false);
            C72453Mb.A19(menu, 59, false);
            r2.A04(56);
            Integer num = A0J;
            r2.A0A.A0T(r2.A0J(), ((A6Q) r2.A0H.get()).A05(C1402570p.A01(num), C1402570p.A00(num)));
            AnonymousClass01E r4 = r2.A01;
            r2.A09.A0I(r2.A0J(), AnonymousClass4aS.A00(r4.getIntent()), num, r2.A09.getSimilarChannelsSessionId(), (String) null, AnonymousClass4aS.A01(r4), (String) null, -1, -1);
            AnonymousClass1Y5.A00(r4, r2.A06, C17880vN.A0q(r4, A032.A0T, AnonymousClass3MW.A1a(), 0, 2131886293));
        }
    }

    public static final void A08(C77853rb r10, String str, C18090vk r12) {
        AnonymousClass01E r5 = r10.A01;
        String A0F2 = C18070vi.A0F(r5, 2131897301);
        C89904dD r2 = new C89904dD(r12, 2);
        if (((C23391Fw) r5.getLifecycle()).A02 != C23401Fx.DESTROYED) {
            C23520Bik A022 = C23520Bik.A02(r5.findViewById(16908298), str, 0);
            A022.A0G(A0F2, r2);
            A022.A0E(AnonymousClass3Ma.A00(r5, 2130971311, 2131102579));
            ArrayList A062 = AnonymousClass1ZU.A06(r5.findViewById(2131433122), r5.findViewById(2131434835));
            AnonymousClass11C r7 = r10.A06;
            C18070vi.A0W(r7);
            C90594eK r4 = new C90594eK(r5, A022, r7, A062, false);
            r4.A07(new C98774rh(r10, 23));
            r4.A03();
            r10.A03 = r4;
        }
    }

    public static final void A09(C77853rb r8, boolean z) {
        r8.A04(53);
        AnonymousClass440 r2 = r8.A0A;
        C29681ch A0J2 = r8.A0J();
        C18070vi.A0d(A0J2, 0);
        r2.A03.A09(A0J2);
        AnonymousClass01E r1 = r8.A01;
        r8.A09.A0F(r8.A0J(), AnonymousClass4aS.A00(r1.getIntent()), A0J, r8.A09.getSimilarChannelsSessionId(), AnonymousClass4aS.A01(r1));
        r8.A05 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r0.isVisible() != true) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r1 == r5.A0D()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0070, code lost:
        if (r3 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0.isVisible() != true) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0A(X.C77853rb r5, boolean r6) {
        /*
            android.view.Menu r1 = r5.A00
            if (r1 == 0) goto L_0x003d
            java.lang.String r4 = "menu"
            r0 = 55
            android.view.MenuItem r0 = r1.findItem(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isVisible()
            r2 = 1
            if (r0 == r3) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            android.view.Menu r1 = r5.A00
            if (r1 != 0) goto L_0x0020
            X.C18070vi.A11(r4)
        L_0x001e:
            r0 = 0
            throw r0
        L_0x0020:
            r0 = 59
            android.view.MenuItem r0 = r1.findItem(r0)
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.isVisible()
            r1 = 1
            if (r0 == r3) goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            boolean r0 = r5.A0C()
            if (r2 != r0) goto L_0x0072
            boolean r0 = r5.A0D()
            if (r1 == r0) goto L_0x003d
            goto L_0x0072
        L_0x003d:
            X.2Dk r4 = A03(r5)
            if (r4 == 0) goto L_0x0061
            android.view.Menu r1 = r5.A00
            if (r1 == 0) goto L_0x0061
            boolean r3 = r4.A0A
            java.lang.String r2 = "menu"
            r0 = 53
            android.view.MenuItem r0 = r1.findItem(r0)
            if (r0 == 0) goto L_0x0059
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x0072
            if (r3 != 0) goto L_0x0072
        L_0x0059:
            android.view.Menu r1 = r5.A00
            if (r1 != 0) goto L_0x0064
            X.C18070vi.A11(r2)
            goto L_0x001e
        L_0x0061:
            if (r6 == 0) goto L_0x0077
            goto L_0x0072
        L_0x0064:
            r0 = 54
            android.view.MenuItem r0 = r1.findItem(r0)
            if (r0 == 0) goto L_0x0061
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0072
            if (r3 == 0) goto L_0x0061
        L_0x0072:
            X.01E r0 = r5.A01
            r0.invalidateOptionsMenu()
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77853rb.A0A(X.3rb, boolean):void");
    }

    public static final void A0B(C77853rb r8, boolean z) {
        r8.A04(54);
        AnonymousClass440 r2 = r8.A0A;
        C29681ch A0J2 = r8.A0J();
        C18070vi.A0d(A0J2, 0);
        r2.A03.A0A(A0J2);
        AnonymousClass01E r1 = r8.A01;
        r8.A09.A0G(r8.A0J(), AnonymousClass4aS.A00(r1.getIntent()), A0J, r8.A09.getSimilarChannelsSessionId(), AnonymousClass4aS.A01(r1));
        r8.A05 = z;
    }

    private final boolean A0C() {
        C46162Dk A0U;
        AnonymousClass440 r2 = this.A0A;
        C46162Dk A0U2 = r2.A0U();
        if (A0U2 == null || !AnonymousClass000.A1Z(A0U2.A02, C179509Ig.GUEST) || ((A0U = r2.A0U()) != null && A0U.A0A)) {
            return false;
        }
        return true;
    }

    private final boolean A0D() {
        C46162Dk A0U;
        AnonymousClass440 r3 = this.A0A;
        C46162Dk A0U2 = r3.A0U();
        if (A0U2 == null || !AnonymousClass000.A1Z(A0U2.A02, C179509Ig.SUBSCRIBED)) {
            return false;
        }
        if (this.A0G.A00(r3.A0U()) || ((A0U = r3.A0U()) != null && A0U.A0A)) {
            return true;
        }
        return false;
    }

    public final C29681ch A0J() {
        AnonymousClass1BI r1 = this.A00.A0J;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
        return (C29681ch) r1;
    }

    public void BqX(Menu menu) {
        if (menu != null) {
            C137526vb.A00(menu);
            C46162Dk A032 = A03(this);
            if (A032 != null) {
                this.A00 = menu;
                boolean A002 = this.A0G.A00(A032);
                boolean z = A032.A0A;
                if (A0D()) {
                    A05(menu, 2131897305, 59);
                }
                if (!A002 && !z) {
                    if (A0C()) {
                        A05(menu, 2131890489, 55);
                        return;
                    }
                    if (A032.A0P()) {
                        MenuItem A022 = A02(menu, 61, 2131892886, 2131233226);
                        A022.setActionView(2131626227);
                        C75443hV.A02(A022, this, 2131892886, true);
                        if (AnonymousClass112.A03()) {
                            A022.setContentDescription(this.A01.getString(2131892886));
                        }
                    }
                    MenuItem add = menu.add(0, 60, 0, "");
                    add.setActionView(2131626166);
                    View actionView = add.getActionView();
                    if (actionView != null) {
                        AnonymousClass3MY.A0w(this.A01, actionView, 2131891797);
                    }
                    add.setShowAsAction(2);
                    add.setVisible(false);
                    if (A0C()) {
                        A05(menu, 2131890489, 55);
                    } else {
                        C46162Dk A033 = A03(this);
                        if (A033 != null && (A033.A0O() || (!A033.A0Q() ? AnonymousClass000.A1Z(A033.A02, C179509Ig.SUBSCRIBED) : A033.A00 > 1))) {
                            C46162Dk A0U = this.A0A.A0U();
                            if (A0U == null || !A0U.A0B) {
                                MenuItem A023 = A02(menu, 53, 2131891999, 2131232146);
                                A023.setActionView(2131626133);
                                View actionView2 = A023.getActionView();
                                if (actionView2 != null) {
                                    AnonymousClass3MY.A0w(this.A01, actionView2, 2131891999);
                                }
                                C75443hV.A02(A023, this, 2131891999, true);
                            } else {
                                MenuItem A024 = A02(menu, 54, 2131892017, 2131232147);
                                A024.setActionView(2131627250);
                                View actionView3 = A024.getActionView();
                                if (actionView3 != null) {
                                    AnonymousClass3MY.A0w(this.A01, actionView3, 2131892017);
                                }
                                C75443hV.A02(A024, this, 2131892017, true);
                                this.A09.BjP(0);
                            }
                        }
                    }
                    A02(menu, 58, 2131892878, 2131232010);
                    if (A032.A0P() && !A032.A0S(this.A08)) {
                        A02(menu, 62, 2131892811, 2131232282);
                    }
                    if (!A0C() && !A032.A0P()) {
                        A02(menu, 56, 2131897305, 2131232077);
                    }
                    if (C18020vd.A05(C18040vf.A02, this.A0E, 11266)) {
                        A02(menu, 7, 2131899369, 2131232266);
                    }
                    A02(menu, 57, 2131899418, 2131232294);
                    if (!A032.A0P()) {
                        A02(menu, 9, 2131895214, 2131232349);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
        if (r0.A0B != true) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean C1Y(android.view.Menu r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0075
            int r0 = r6.size()
            if (r0 == 0) goto L_0x0075
            boolean r0 = r5.A0C()
            if (r0 == 0) goto L_0x0056
            r2 = 55
        L_0x0010:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0052
            android.view.MenuItem r4 = r6.findItem(r2)
            if (r4 == 0) goto L_0x0052
            X.5Q1 r3 = X.AnonymousClass5Q1.A00
            r2 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.View r0 = r4.getActionView()
            if (r0 == 0) goto L_0x0028
            r0.setAlpha(r2)
        L_0x0028:
            android.view.View r0 = r4.getActionView()
            if (r0 == 0) goto L_0x0052
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L_0x0052
            android.view.ViewPropertyAnimator r2 = r0.alpha(r1)
            if (r2 == 0) goto L_0x0052
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r0)
            if (r2 == 0) goto L_0x0052
            r1 = 20
            X.4rh r0 = new X.4rh
            r0.<init>(r3, r1)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r0)
            if (r0 == 0) goto L_0x0052
            r0.start()
        L_0x0052:
            r0 = 1
            r5.A04 = r0
            return r0
        L_0x0056:
            X.440 r2 = r5.A0A
            X.2Dk r0 = r2.A0U()
            if (r0 == 0) goto L_0x0066
            boolean r1 = r0.A0B
            r0 = 1
            if (r1 != r0) goto L_0x0066
            r2 = 54
            goto L_0x0010
        L_0x0066:
            X.2Dk r0 = r2.A0U()
            if (r0 == 0) goto L_0x0072
            boolean r1 = r0.A0B
            r0 = 1
            r2 = -1
            if (r1 == r0) goto L_0x0010
        L_0x0072:
            r2 = 53
            goto L_0x0010
        L_0x0075:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77853rb.C1Y(android.view.Menu):boolean");
    }

    private final void A05(Menu menu, int i, int i2) {
        MenuItem A072 = AnonymousClass3MX.A07(menu, i2, i);
        A072.setActionView(2131626186);
        View actionView = A072.getActionView();
        if (actionView != null) {
            WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) actionView.findViewById(2131431897);
            this.A01 = waButtonWithLoader;
            if (waButtonWithLoader != null) {
                waButtonWithLoader.setButtonText(i);
                waButtonWithLoader.A00 = new C90004dN(this, A072, 45);
                waButtonWithLoader.setSize(AnonymousClass4D1.SMALL);
                waButtonWithLoader.setVariant(C27881Xz.TONAL);
                waButtonWithLoader.findViewById(2131428624).getLayoutParams().width = -2;
            }
            AnonymousClass3MY.A0w(this.A01, actionView, i);
        }
        C75443hV.A02(A072, this, i, true);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C77853rb(X.AnonymousClass01E r60, X.C19880zA r61, X.C19880zA r62, X.C19880zA r63, X.C19880zA r64, X.C84164Ii r65, X.C56322hH r66, X.C84174Ij r67, X.AnonymousClass4JP r68, X.AnonymousClass4JQ r69, X.AnonymousClass1FR r70, X.AnonymousClass1KB r71, X.AnonymousClass11S r72, X.AnonymousClass18O r73, X.C33251iW r74, X.AnonymousClass4ZR r75, X.AnonymousClass1HS r76, X.AnonymousClass1MC r77, X.C24671Lf r78, X.C108885cS r79, X.C32951i1 r80, X.AnonymousClass11C r81, X.AnonymousClass11P r82, X.C19830z4 r83, X.C18000vb r84, X.AnonymousClass1Q1 r85, X.AnonymousClass1CJ r86, X.C25181Nf r87, X.AnonymousClass1E7 r88, X.AnonymousClass1RK r89, X.C18030ve r90, X.AnonymousClass12L r91, X.C25191Ng r92, X.AnonymousClass1BI r93, X.C37701pz r94, X.AnonymousClass1c4 r95, X.AnonymousClass74D r96, X.C86454Rr r97, X.AnonymousClass1Nb r98, X.C25831Pu r99, X.AnonymousClass10I r100, X.AnonymousClass00H r101, X.AnonymousClass00H r102, X.AnonymousClass00H r103) {
        /*
            r59 = this;
            r1 = 1
            r7 = r90
            X.C18070vi.A0d(r7, r1)
            r17 = r100
            r50 = r71
            r24 = r72
            r3 = r24
            r2 = r17
            r0 = r50
            X.C18070vi.A0p(r0, r3, r2)
            r2 = 5
            r37 = r86
            r0 = r37
            X.C18070vi.A0d(r0, r2)
            r26 = r74
            r23 = r91
            r16 = r101
            r25 = r73
            r57 = r61
            r5 = r25
            r4 = r26
            r3 = r16
            r2 = r23
            r0 = r57
            X.C18070vi.A0x(r0, r5, r4, r3, r2)
            r35 = r84
            r32 = r80
            r30 = r78
            r29 = r77
            r28 = r76
            r5 = r28
            r4 = r35
            r3 = r29
            r2 = r30
            r0 = r32
            X.C18070vi.A0y(r5, r4, r3, r2, r0)
            r34 = r83
            r54 = r65
            r19 = r98
            r40 = r89
            r4 = r19
            r3 = r34
            r2 = r40
            r0 = r54
            X.C18070vi.A0t(r4, r3, r2, r0)
            r38 = r87
            r22 = r92
            r53 = r66
            r18 = r99
            r4 = r38
            r3 = r18
            r2 = r22
            r0 = r53
            X.C18070vi.A0u(r0, r4, r3, r2)
            r56 = r62
            r52 = r67
            r12 = r68
            r11 = r69
            r2 = r52
            r0 = r56
            X.C18070vi.A0v(r2, r0, r12, r11)
            r9 = r85
            r10 = r82
            r20 = r94
            r5 = r96
            r0 = r20
            X.C72483Me.A15(r0, r10, r9, r5)
            r0 = 32
            r14 = r81
            X.C18070vi.A0d(r14, r0)
            r0 = 33
            r3 = r102
            X.C18070vi.A0d(r3, r0)
            r0 = 34
            r4 = r97
            X.C18070vi.A0d(r4, r0)
            r0 = 35
            r2 = r103
            X.C18070vi.A0d(r2, r0)
            r0 = 36
            r6 = r95
            X.C18070vi.A0d(r6, r0)
            r8 = 37
            r55 = r63
            r0 = r55
            X.C18070vi.A0d(r0, r8)
            r0 = 38
            r13 = r64
            X.C18070vi.A0d(r13, r0)
            r8 = 39
            r21 = r93
            r0 = r21
            X.C18070vi.A0d(r0, r8)
            r0 = 40
            r8 = r88
            X.C18070vi.A0d(r8, r0)
            r15 = 41
            r58 = r60
            r0 = r58
            X.C18070vi.A0d(r0, r15)
            r15 = 42
            r51 = r70
            r0 = r51
            X.C18070vi.A0d(r0, r15)
            r15 = 45
            r0 = r79
            X.C18070vi.A0d(r0, r15)
            r15 = r59
            r27 = r75
            r31 = r0
            r33 = r14
            r36 = r9
            r39 = r8
            r41 = r7
            r42 = r23
            r43 = r22
            r44 = r21
            r45 = r20
            r46 = r19
            r47 = r18
            r48 = r17
            r49 = r16
            r16 = r58
            r17 = r57
            r18 = r56
            r19 = r54
            r20 = r53
            r21 = r52
            r22 = r51
            r23 = r50
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r15.A07 = r10
            r15.A0E = r9
            r15.A09 = r5
            r15.A06 = r14
            r15.A0H = r3
            r15.A0G = r4
            r15.A0B = r2
            r15.A08 = r6
            r0 = r55
            r15.A0C = r0
            r15.A0D = r13
            r15.A04 = r1
            X.5GC r0 = new X.5GC
            r0.<init>(r15)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            r15.A0I = r0
            X.01E r6 = r15.A01
            java.lang.String r4 = "null cannot be cast to non-null type com.whatsapp.DialogActivity"
            X.C18070vi.A0z(r6, r4)
            r5 = r6
            X.1FU r5 = (X.AnonymousClass1FU) r5
            X.1ch r0 = r15.A0J()
            r2 = 0
            X.440 r3 = X.AnonymousClass4HB.A00(r12, r5, r0)
            r15.A0A = r3
            X.C18070vi.A0z(r6, r4)
            X.1ch r4 = r15.A0J()
            X.C17960vV.A07(r4)
            X.C18070vi.A0X(r4)
            r0 = 6
            X.1It r4 = X.C91784gF.A00(r5, r11, r8, r4, r0)
            java.lang.Class<X.3oU> r0 = X.C76823oU.class
            X.1J2 r4 = r4.A00(r0)
            X.3oU r4 = (X.C76823oU) r4
            r15.A0F = r4
            r5 = 10325(0x2855, float:1.4468E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r5 = X.C18020vd.A05(r0, r7, r5)
            X.440 r0 = r15.A0A
            X.2Dk r0 = r0.A0U()
            if (r5 == 0) goto L_0x01bc
            if (r0 == 0) goto L_0x01a6
            boolean r0 = r0.A0Q()
            if (r0 != r1) goto L_0x01a6
            X.1ch r0 = r15.A0J()
            r4.A0Y(r0, r1, r2, r1)
        L_0x018d:
            X.1Dg r0 = X.C95424mD.A00(r3)
            java.lang.Object r0 = r0.A06()
            X.4Tp r0 = (X.C86924Tp) r0
            r2 = 0
            if (r0 == 0) goto L_0x01a3
            X.2Dk r1 = r0.A00
            boolean r0 = r0.A01
            X.4Tp r2 = new X.4Tp
            r2.<init>(r1, r0)
        L_0x01a3:
            r15.A02 = r2
            return
        L_0x01a6:
            X.440 r0 = r15.A0A
            X.2Dk r0 = r0.A0U()
            if (r0 == 0) goto L_0x018d
            boolean r0 = r0.A0O()
            if (r0 != r1) goto L_0x018d
            X.1ch r0 = r15.A0J()
            r4.A0Y(r0, r2, r2, r1)
            goto L_0x018d
        L_0x01bc:
            if (r0 == 0) goto L_0x018d
            boolean r0 = r0.A0Q()
            if (r0 != r1) goto L_0x018d
            X.1ch r0 = r15.A0J()
            r4.A0Y(r0, r1, r2, r2)
            goto L_0x018d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77853rb.<init>(X.01E, X.0zA, X.0zA, X.0zA, X.0zA, X.4Ii, X.2hH, X.4Ij, X.4JP, X.4JQ, X.1FR, X.1KB, X.11S, X.18O, X.1iW, X.4ZR, X.1HS, X.1MC, X.1Lf, X.5cS, X.1i1, X.11C, X.11P, X.0z4, X.0vb, X.1Q1, X.1CJ, X.1Nf, X.1E7, X.1RK, X.0ve, X.12L, X.1Ng, X.1BI, X.1pz, X.1c4, X.74D, X.4Rr, X.1Nb, X.1Pu, X.10I, X.00H, X.00H, X.00H):void");
    }
}
