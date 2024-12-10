package X;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3hT  reason: invalid class name and case insensitive filesystem */
public abstract class C75423hT extends C75443hV implements C108185bH {
    public AnonymousClass1E7 A00;
    public final AnonymousClass01E A01;
    public final C19880zA A02;
    public final AnonymousClass1FR A03;
    public final AnonymousClass1KB A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass18O A06;
    public final AnonymousClass4ZR A07;
    public final AnonymousClass1HS A08;
    public final C108885cS A09;
    public final C32951i1 A0A;
    public final AnonymousClass11C A0B;
    public final C18000vb A0C;
    public final AnonymousClass1CJ A0D;
    public final C18030ve A0E;
    public final AnonymousClass12L A0F;
    public final AnonymousClass1BI A0G;
    public final C37701pz A0H;
    public final C25831Pu A0I;
    public final AnonymousClass10I A0J;
    public final AnonymousClass00H A0K;
    public final C19880zA A0L;
    public final C33251iW A0M;
    public final AnonymousClass1MC A0N;
    public final AnonymousClass4MF A0O;
    public final AnonymousClass4N4 A0P;
    public final C57902jp A0Q;
    public final C23581Gv A0R = new C94164k9(this, 12);
    public final C19830z4 A0S;
    public final C28741ap A0T = new C95414mC(this, 8);
    public final AnonymousClass1Q1 A0U;
    public final C25181Nf A0V;
    public final AnonymousClass1RK A0W;
    public final C25221Nj A0X = new C96314ne(this, 13);
    public final C25191Ng A0Y;
    public final AnonymousClass1Nb A0Z;
    public final C24671Lf A0a;

    public static void A00(C75423hT r2) {
        C25181Nf r0 = r2.A0V;
        AnonymousClass1E7 A0F2 = r0.A02.A0F(r2.A0G);
        if (A0F2 != null) {
            r2.A00 = A0F2;
        }
    }

    public int A01() {
        AnonymousClass1Nb r0 = this.A0Z;
        AnonymousClass1BI r2 = this.A0G;
        if (!r0.A0a(r2).A0A()) {
            if (AnonymousClass1Q0.A03(this.A0S, this.A0D, r2)) {
                return 2131892017;
            }
            return 2131891999;
        }
        return 2131892017;
    }

    public MenuItem A02(Menu menu, int i, int i2, int i3) {
        if (menu == null) {
            return null;
        }
        MenuItem A072 = AnonymousClass3MX.A07(menu, i, i2);
        if (!C22891Dp.A05) {
            return A072;
        }
        A072.setIcon(AnonymousClass4aX.A01(this.A01, i3));
        return A072;
    }

    public void A0G(Menu menu) {
        if (menu != null && this.A06.A09(AnonymousClass18O.A0h)) {
            A02(menu, 3, 2131890222, 2131232379);
        }
    }

    public void A0H(MenuItem menuItem) {
        if (menuItem != null) {
            AnonymousClass01E r4 = this.A01;
            SpannableString spannableString = new SpannableString(r4.getString(A01()));
            AnonymousClass1BI r2 = this.A0G;
            if (AnonymousClass1Q0.A03(this.A0S, this.A0D, r2)) {
                spannableString.setSpan(new ForegroundColorSpan(AnonymousClass3Ma.A00(r4, 2130970337, 2131101306)), 0, spannableString.length(), 0);
            }
            menuItem.setTitle(spannableString);
        }
    }

    public String BO6() {
        return "ConversationMenu";
    }

    public boolean Bze(MenuItem menuItem) {
        C29691ci A0A2;
        Intent A0G2;
        String packageName;
        String str;
        this.A0N.A01 = 6;
        int itemId = menuItem.getItemId();
        if (itemId == 12) {
            C98774rh.A01(this.A0J, this, 13);
            AnonymousClass1BI r3 = this.A0G;
            if (C22971Dz.A0d(r3) && this.A0I.A01((UserJid) r3)) {
                AnonymousClass01E r2 = this.A01;
                r2.startActivity(AnonymousClass1LU.A0c(r2, r3, this.A0D.A04(r3), 3));
                return true;
            }
        } else if (itemId == 14) {
            C20098A7b.A01(AnonymousClass9P2.A00((AnonymousClass1GP) null, (Integer) null, 2131891430, 2131892908, (Integer) null, String.valueOf(14), (String) null, (Object[]) null, 2131898593), this.A01.getSupportFragmentManager());
            return true;
        } else if (itemId == 18) {
            AnonymousClass1BI r22 = this.A0G;
            ClipboardManager A092 = this.A0B.A09();
            if (A092 == null || (A0A2 = this.A0D.A0A(r22)) == null) {
                this.A04.A0G("Error: chat details could not be copied", 0);
                return true;
            }
            A092.setPrimaryClip(ClipData.newPlainText("jid data", C43501zu.A00(":", new CharSequence[]{r22.getRawString(), A0A2.A09().toString()})));
            this.A04.A0G("Chat details copied", 0);
            return true;
        } else if (itemId != 16908332) {
            switch (itemId) {
                case 2:
                    AnonymousClass4MF r0 = this.A0O;
                    r0.A00.A05(r0.A01);
                    return true;
                case 3:
                    return this.A0Q.A00();
                case 4:
                    AnonymousClass1BI r5 = this.A0G;
                    if (AnonymousClass1Q0.A03(this.A0S, this.A0D, r5)) {
                        AnonymousClass01E r32 = this.A01;
                        AnonymousClass1Q0.A01(r32, r32.findViewById(2131430949), this.A0M, r5, C17880vN.A0k());
                        return true;
                    } else if (this.A0Z.A0a(r5).A0A()) {
                        C98774rh.A01(this.A0J, this, 12);
                        return true;
                    } else {
                        AnonymousClass4Z1.A01(r5, C32961i2.CONVERSATION_SCREEN).A2C(this.A01.getSupportFragmentManager(), "MuteDialogFragment");
                        return true;
                    }
                case 5:
                    Log.i("conversation/menu/wallpaper/");
                    AnonymousClass01E r52 = this.A01;
                    AnonymousClass1BI r33 = this.A0G;
                    if (r33 == null || C28281Zt.A0B(r52)) {
                        A0G2 = C72463Mc.A0G(r52);
                        packageName = r52.getPackageName();
                        str = "com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity";
                    } else {
                        A0G2 = C72463Mc.A0G(r52);
                        packageName = r52.getPackageName();
                        str = "com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity";
                    }
                    C72473Md.A0s(A0G2, r33, packageName, str);
                    r52.startActivity(A0G2);
                    return true;
                case 6:
                    AnonymousClass01E r1 = this.A01;
                    r1.startActivity(AnonymousClass1LU.A0Y(r1, this.A0G));
                    return true;
                case 7:
                    this.A01.onSearchRequested();
                    return true;
                case 8:
                    AnonymousClass4N4 r02 = this.A0P;
                    r02.A02.A01(r02.A01, new C98094qZ(r02));
                    return true;
                case 9:
                    C98334qx.A00(this.A0W.A04(), this, 7);
                    break;
                case 10:
                    C19880zA r12 = this.A0L;
                    if (r12.A07()) {
                        r12.A03();
                        throw AnonymousClass000.A0s("exportChatMessages");
                    }
                    break;
                default:
                    return false;
            }
        } else {
            this.A01.finish();
            return true;
        }
        return true;
    }

    public boolean C1Y(Menu menu) {
        boolean Bci = this.A09.Bci();
        C72453Mb.A19(menu, 8, Bci);
        C72453Mb.A19(menu, 7, Bci);
        C72453Mb.A19(menu, 3, Bci);
        C72453Mb.A19(menu, 9, true);
        MenuItem findItem = menu.findItem(1);
        if (findItem != null) {
            SubMenu subMenu = findItem.getSubMenu();
            C72453Mb.A19(subMenu, 10, Bci);
            findItem.setVisible(subMenu.hasVisibleItems());
        }
        return true;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.A0U.registerObserver(this.A0T);
        this.A0a.registerObserver(this.A0R);
        this.A0Y.registerObserver(this.A0X);
    }

    public void onActivityDestroyed(Activity activity) {
        this.A0U.unregisterObserver(this.A0T);
        this.A0a.unregisterObserver(this.A0R);
        this.A0Y.unregisterObserver(this.A0X);
    }

    public void A0E(Menu menu) {
        A02(menu, 2, 2131886508, 2131232173);
    }

    public void A0F(Menu menu) {
        A02(menu, 8, 2131888320, 2131231862);
    }

    public void A0I(MenuItem menuItem, int i, boolean z) {
        C64732vF r0;
        View actionView = menuItem.getActionView();
        float f = 0.4f;
        if (z) {
            f = 1.0f;
        }
        actionView.setAlpha(f);
        actionView.setEnabled(z);
        if (z) {
            if (!AnonymousClass3MY.A1b(this.A0C)) {
                r0 = new C64732vF(0.2f, 0.0f, 0.0f, 0.0f);
            }
            actionView.setOnTouchListener(r0);
            C90004dN.A00(actionView, this, menuItem, 42);
            actionView.setOnLongClickListener(new C90234dk(this, i, 0));
        }
    }

    public C75423hT(AnonymousClass01E r5, C19880zA r6, C19880zA r7, C84164Ii r8, C56322hH r9, C84174Ij r10, AnonymousClass1FR r11, AnonymousClass1KB r12, AnonymousClass11S r13, AnonymousClass18O r14, C33251iW r15, AnonymousClass4ZR r16, AnonymousClass1HS r17, AnonymousClass1MC r18, C24671Lf r19, C108885cS r20, C32951i1 r21, AnonymousClass11C r22, C19830z4 r23, C18000vb r24, AnonymousClass1Q1 r25, AnonymousClass1CJ r26, C25181Nf r27, AnonymousClass1E7 r28, AnonymousClass1RK r29, C18030ve r30, AnonymousClass12L r31, C25191Ng r32, AnonymousClass1BI r33, C37701pz r34, AnonymousClass1Nb r35, C25831Pu r36, AnonymousClass10I r37, AnonymousClass00H r38) {
        this.A0E = r30;
        this.A01 = r5;
        this.A03 = r11;
        this.A09 = r20;
        this.A04 = r12;
        this.A0K = r38;
        this.A05 = r13;
        this.A0J = r37;
        this.A0D = r26;
        this.A02 = r6;
        this.A06 = r14;
        this.A0M = r15;
        this.A0F = r31;
        this.A08 = r17;
        this.A0B = r22;
        this.A0C = r24;
        this.A07 = r16;
        this.A0H = r34;
        this.A0N = r18;
        this.A0a = r19;
        this.A0A = r21;
        this.A0Z = r35;
        this.A0U = r25;
        this.A0S = r23;
        this.A0W = r29;
        this.A0V = r27;
        this.A0I = r36;
        this.A0Y = r32;
        this.A0L = r7;
        AnonymousClass1BI r3 = r33;
        this.A0G = r3;
        AnonymousClass1E7 r2 = r28;
        this.A00 = r2;
        this.A0P = new AnonymousClass4N4(r5, r3, (C36741oO) r8.A00.A01.A00.A1L.get());
        this.A0Q = r9.A00(r5, r11, r3);
        this.A0O = new AnonymousClass4MF((C32531hL) r10.A00.A01.ABm.get(), r2);
    }
}
