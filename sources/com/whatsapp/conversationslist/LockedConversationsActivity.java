package com.whatsapp.conversationslist;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass02B;
import X.AnonymousClass02n;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Z9;
import X.AnonymousClass4aX;
import X.C000200d;
import X.C17880vN;
import X.C18070vi;
import X.C18180vt;
import X.C19620yd;
import X.C22891Dp;
import X.C23721Hj;
import X.C28281Zt;
import X.C31191fA;
import X.C32291gx;
import X.C34001jj;
import X.C70573Bq;
import X.C70813Cp;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C91004ez;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import com.facebook.msys.mci.DefaultCrypto;

public final class LockedConversationsActivity extends AnonymousClass1FY {
    public Intent A00;
    public C23721Hj A01;
    public C31191fA A02;
    public C32291gx A03;
    public AnonymousClass00H A04;
    public Integer A05;
    public AnonymousClass02n A06;
    public boolean A07;

    public LockedConversationsActivity() {
        this(0);
    }

    public void C81(AnonymousClass02B r2) {
        C18070vi.A0d(r2, 0);
        super.C81(r2);
        C28281Zt.A05(this, AnonymousClass4Z9.A01(this, false));
    }

    public void C82(AnonymousClass02B r2) {
        C18070vi.A0d(r2, 0);
        super.C82(r2);
        C72473Md.A0o(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        if (!A4b().A04.A0N()) {
            MenuItem add = menu.add(0, 0, 0, 2131888177);
            if (C22891Dp.A05 && add != null) {
                add.setIcon(AnonymousClass4aX.A01(this, 2131232282));
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.1LU, java.lang.Object] */
    public void onNewIntent(Intent intent) {
        C18070vi.A0d(intent, 0);
        super.onNewIntent(intent);
        AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(intent.getStringExtra("jid"));
        if (A022 != null) {
            int i = 0;
            Boolean valueOf = Boolean.valueOf(intent.getBooleanExtra("fromNotification", false));
            if (C72463Mc.A1Y(valueOf)) {
                i = 2;
            }
            if (!A4b().A00) {
                Intent A1w = new Object().A1w(this, A022, i);
                C18070vi.A0X(A1w);
                A1w.putExtra("fromNotification", valueOf);
                startActivity(A1w);
                return;
            }
            this.A00 = intent;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A012 = AnonymousClass3MY.A01(menuItem, 0);
        if (A012 == 0) {
            Intent A0A = C17880vN.A0A();
            A0A.setClassName(getPackageName(), "com.whatsapp.chatlock.ChatLockSettingsActivity");
            startActivity(A0A);
            AnonymousClass00H r0 = this.A04;
            if (r0 != null) {
                AnonymousClass3MX.A0a(r0).A00(0);
                return true;
            }
            C18070vi.A11("chatLockLogger");
            throw null;
        } else if (A012 != 16908332) {
            return false;
        } else {
            A0Q(this);
            return true;
        }
    }

    public static final void A03(LockedConversationsActivity lockedConversationsActivity) {
        C32291gx r4 = lockedConversationsActivity.A03;
        if (r4 != null) {
            r4.A03().post(new C70813Cp(r4, 18, true));
            r4.A07();
            C34001jj A0H = AnonymousClass3Ma.A0H(lockedConversationsActivity);
            A0H.A0D(new Hilt_LockedConversationsFragment(), "LockedConversationsFragment", 2131429504);
            A0H.A01();
            return;
        }
        C18070vi.A11("messageNotification");
        throw null;
    }

    public static final void A0V(LockedConversationsActivity lockedConversationsActivity, AnonymousClass1BI r6, Integer num) {
        int i;
        lockedConversationsActivity.A05 = num;
        lockedConversationsActivity.A4b().A00 = true;
        Boolean A0h = AnonymousClass000.A0h();
        if (num != null) {
            i = num.intValue();
        } else {
            i = 8;
        }
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(lockedConversationsActivity.getPackageName(), "com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity");
        if (r6 != null) {
            AnonymousClass3MY.A12(A0A, r6, "extra_chat_jid");
        }
        A0A.putExtra("extra_open_chat_directly", A0h);
        A0A.putExtra("extra_unlock_entry_point", i);
        AnonymousClass02n r0 = lockedConversationsActivity.A06;
        if (r0 == null) {
            C18070vi.A11("reauthenticationLauncher");
            throw null;
        } else {
            r0.A03(A0A);
        }
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A01 = (C23721Hj) r1.A5b.get();
            this.A04 = C000200d.A00(A0L.A24);
            this.A02 = AnonymousClass3MY.A0S(A0L);
            this.A03 = (C32291gx) A0L.A6X.get();
        }
    }

    public final C31191fA A4b() {
        C31191fA r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("chatLockManager");
        throw null;
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }

    public void onRestart() {
        this.A05.CGF(new C70573Bq(this, 4));
        super.onRestart();
    }

    public void onWindowFocusChanged(boolean z) {
        Window window = getWindow();
        if (z) {
            window.clearFlags(DefaultCrypto.BUFFER_SIZE);
        } else {
            window.addFlags(DefaultCrypto.BUFFER_SIZE);
        }
        super.onWindowFocusChanged(z);
    }

    public static final void A0Q(LockedConversationsActivity lockedConversationsActivity) {
        Intent intent;
        if ((!lockedConversationsActivity.isTaskRoot() || C18070vi.A18(lockedConversationsActivity.getComponentName().getClassName(), "com.whatsapp.HomeActivity")) && ((intent = lockedConversationsActivity.getIntent()) == null || !intent.getBooleanExtra("extra_from_lock_chat_helper", false))) {
            lockedConversationsActivity.finish();
            return;
        }
        Intent A022 = AnonymousClass1LU.A02(lockedConversationsActivity);
        Intent intent2 = lockedConversationsActivity.getIntent();
        boolean z = false;
        if (intent2 != null) {
            z = intent2.getBooleanExtra("extra_from_lock_chat_helper", false);
        }
        A022.putExtra("extra_from_lock_chat_helper", z);
        lockedConversationsActivity.finishAndRemoveTask();
        lockedConversationsActivity.startActivity(A022);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0047, code lost:
        if (((X.AnonymousClass1XL) r6.A0A.get()).A06() == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            X.02i r1 = new X.02i
            r1.<init>()
            r0 = 7
            X.02n r0 = X.C91074f6.A00(r6, r1, r0)
            r6.A06 = r0
            r0 = 2131891817(0x7f121669, float:1.9418365E38)
            X.AnonymousClass3MY.A0t(r6, r0)
            boolean r4 = X.C72473Md.A1S(r6)
            r0 = 2131625912(0x7f0e07b8, float:1.8879045E38)
            r6.setContentView((int) r0)
            X.1fA r0 = r6.A4b()
            r1 = 0
            r0.A02 = r1
            if (r7 != 0) goto L_0x007a
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r5 = "fromNotification"
            boolean r0 = r0.getBooleanExtra(r5, r1)
            if (r0 == 0) goto L_0x0083
            boolean r0 = r6.A4W()
            if (r0 == 0) goto L_0x0049
            X.00H r0 = r6.A0A
            java.lang.Object r0 = r0.get()
            X.1XL r0 = (X.AnonymousClass1XL) r0
            boolean r0 = r0.A06()
            r3 = 1
            if (r0 != 0) goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            X.1Dv r1 = X.AnonymousClass1BI.A00
            java.lang.String r0 = X.C72453Mb.A0u(r6)
            X.1BI r2 = r1.A02(r0)
            if (r3 == 0) goto L_0x007b
            X.1fA r0 = r6.A4b()
            r0.A03 = r4
            X.1fA r0 = r6.A4b()
            r0.A01 = r4
            A03(r6)
            if (r2 == 0) goto L_0x007a
            X.1LU r1 = new X.1LU
            r1.<init>()
            r0 = 2
            android.content.Intent r0 = r1.A1w(r6, r2, r0)
            X.C18070vi.A0X(r0)
            r0.putExtra(r5, r4)
            r6.startActivity(r0)
        L_0x007a:
            return
        L_0x007b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            A0V(r6, r2, r0)
            return
        L_0x0083:
            X.1fA r0 = r6.A4b()
            r0.A03 = r4
            X.1fA r0 = r6.A4b()
            r0.A01 = r4
            A03(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.LockedConversationsActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        A4b().A06();
    }

    public void onBackPressed() {
        A0Q(this);
    }

    public LockedConversationsActivity(int i) {
        this.A07 = false;
        C91004ez.A00(this, 41);
    }
}
