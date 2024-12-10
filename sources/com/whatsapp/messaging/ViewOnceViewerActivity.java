package com.whatsapp.messaging;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1M9;
import X.AnonymousClass1RK;
import X.AnonymousClass1W2;
import X.AnonymousClass1WR;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass215;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4aX;
import X.C000200d;
import X.C17880vN;
import X.C17890vO;
import X.C18070vi;
import X.C24681Lg;
import X.C24921Me;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C91014f0;
import X.C95504mL;
import X.C98284qs;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.whatsapp.ephemeral.ViewOnceNuxBottomSheet;
import com.whatsapp.mediaview.DeleteMessagesDialogFragment;

public final class ViewOnceViewerActivity extends AnonymousClass1FY {
    public AnonymousClass1M9 A00;
    public C24921Me A01;
    public C24681Lg A02;
    public AnonymousClass1RK A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass205 A06;
    public boolean A07;
    public final AnonymousClass1WR A08;

    public ViewOnceViewerActivity() {
        this(0);
        this.A08 = new C95504mL(this, 14);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        super.onCreateOptionsMenu(menu);
        menu.clear();
        menu.add(0, 2131432523, 1, 2131897917).setIcon(AnonymousClass4aX.A03(this, 2130971957, 2131103410, 2131232408)).setShowAsAction(1);
        menu.add(1, 2131432498, 0, 2131898874);
        menu.add(1, 2131432515, 0, 2131895214);
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        String str;
        MenuItem findItem;
        C18070vi.A0d(menu, 0);
        AnonymousClass205 r1 = this.A06;
        if (r1 == null) {
            str = "messageKey";
        } else {
            AnonymousClass00H r0 = this.A04;
            if (r0 != null) {
                AnonymousClass206 A012 = AnonymousClass1W2.A01(r1, r0);
                if (A012 == null) {
                    this.A03.A0G("Expand VO: No message found", (String) null, false);
                    return false;
                }
                AnonymousClass1BI A0H = A012.A0H();
                if (A0H == null || (findItem = menu.findItem(2131432515)) == null) {
                    return true;
                }
                AnonymousClass1M9 r02 = this.A00;
                if (r02 != null) {
                    AnonymousClass1E7 A0H2 = r02.A0H(A0H);
                    C24921Me r03 = this.A01;
                    if (r03 != null) {
                        findItem.setTitle(C17890vO.A0R(this, AnonymousClass3MY.A0q(r03, A0H2), 1, 0, 2131895215));
                        return true;
                    }
                    str = "waContactNames";
                } else {
                    str = "contactManager";
                }
            } else {
                str = "fMessageDatabase";
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A03 = AnonymousClass3MZ.A0r(A0L);
            this.A00 = AnonymousClass10E.A4z(A0L);
            this.A04 = AnonymousClass3MX.A12(A0L);
            this.A02 = AnonymousClass3MZ.A0o(A0L);
            this.A01 = AnonymousClass3MZ.A0g(A0L);
            this.A05 = C000200d.A00(A0L.ABc);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment A0O = getSupportFragmentManager().A0O(2131436798);
        if (A0O != null) {
            A0O.A1w(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r0 = 2131627374(0x7f0e0d6e, float:1.888201E38)
            r6.setContentView((int) r0)
            X.00H r0 = r6.A05
            if (r0 == 0) goto L_0x00cf
            r0.get()
            X.1Kq r0 = X.C24521Kq.$redex_init_class
            android.view.Window r1 = r6.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
            android.content.Intent r0 = r6.getIntent()
            X.205 r1 = X.AnonymousClass4aU.A02(r0)
            if (r1 != 0) goto L_0x0029
            r6.finish()
        L_0x0028:
            return
        L_0x0029:
            r6.A06 = r1
            java.lang.String r5 = "messageKey"
            X.00H r0 = r6.A04
            if (r0 == 0) goto L_0x00c8
            X.206 r0 = X.AnonymousClass1W2.A01(r1, r0)
            if (r0 == 0) goto L_0x00c3
            X.1GP r4 = X.AnonymousClass3MX.A0O(r6)
            int r1 = r0.A0u
            r0 = 82
            if (r1 != r0) goto L_0x00a4
            java.lang.String r3 = "view_once_audio"
            androidx.fragment.app.Fragment r2 = r4.A0Q(r3)
            boolean r0 = r2 instanceof com.whatsapp.messaging.ViewOnceAudioFragment
            if (r0 == 0) goto L_0x004d
            if (r2 != 0) goto L_0x0060
        L_0x004d:
            X.205 r1 = r6.A06
            if (r1 == 0) goto L_0x00bf
            com.whatsapp.messaging.ViewOnceAudioFragment r2 = new com.whatsapp.messaging.ViewOnceAudioFragment
            r2.<init>()
        L_0x0056:
            android.os.Bundle r0 = X.C17880vN.A0D()
            X.AnonymousClass4aU.A0A(r0, r1)
            r2.A1R(r0)
        L_0x0060:
            X.1jj r1 = new X.1jj
            r1.<init>(r4)
            r0 = 2131436798(0x7f0b24fe, float:1.8495477E38)
            r1.A0D(r2, r3, r0)
            r1.A01()
            X.1Lg r1 = r6.A02
            if (r1 == 0) goto L_0x00d2
            X.1WR r0 = r6.A08
            r1.registerObserver(r0)
            androidx.appcompat.widget.Toolbar r3 = X.C72463Mc.A0T(r6)
            r2 = 0
            r3.A0L()
            r0 = 2131231814(0x7f080446, float:1.807972E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass03S.A01(r6, r0)
            if (r0 == 0) goto L_0x00ba
            android.graphics.drawable.Drawable r1 = X.C27831Xu.A02(r0)
            X.C18070vi.A0X(r1)
            r0 = -1
            X.C27831Xu.A0C(r1, r0)
            r3.setNavigationIcon((android.graphics.drawable.Drawable) r1)
            X.01n r1 = X.AnonymousClass3MY.A0K(r6, r3)
            if (r1 == 0) goto L_0x0028
            r1.A0Y(r2)
            r0 = 1
            r1.A0W(r0)
            return
        L_0x00a4:
            java.lang.String r3 = "view_once_text"
            androidx.fragment.app.Fragment r2 = r4.A0Q(r3)
            boolean r0 = r2 instanceof com.whatsapp.messaging.ViewOnceTextFragment
            if (r0 == 0) goto L_0x00b0
            if (r2 != 0) goto L_0x0060
        L_0x00b0:
            X.205 r1 = r6.A06
            if (r1 == 0) goto L_0x00bf
            com.whatsapp.messaging.ViewOnceTextFragment r2 = new com.whatsapp.messaging.ViewOnceTextFragment
            r2.<init>()
            goto L_0x0056
        L_0x00ba:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x00bf:
            X.C18070vi.A11(r5)
            goto L_0x00d7
        L_0x00c3:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x00c8:
            java.lang.String r0 = "fMessageDatabase"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x00cf:
            java.lang.String r0 = "waDebugBuildSharedPreferences"
            goto L_0x00d4
        L_0x00d2:
            java.lang.String r0 = "messageObservers"
        L_0x00d4:
            X.C18070vi.A11(r0)
        L_0x00d7:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ViewOnceViewerActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C24681Lg r1 = this.A02;
        if (r1 != null) {
            r1.unregisterObserver(this.A08);
        } else {
            C18070vi.A11("messageObservers");
            throw null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int A0B = C72453Mb.A0B(menuItem);
        AnonymousClass205 r1 = this.A06;
        if (r1 == null) {
            str = "messageKey";
        } else {
            AnonymousClass00H r0 = this.A04;
            if (r0 != null) {
                AnonymousClass206 A012 = AnonymousClass1W2.A01(r1, r0);
                if (A012 != null) {
                    if (A0B == 16908332) {
                        finish();
                    } else if (A0B == 2131432523) {
                        if (A012 instanceof AnonymousClass215) {
                            ViewOnceNuxBottomSheet.A0B.A00(AnonymousClass3MX.A0O(this), A012, true);
                            return true;
                        }
                    } else if (A0B == 2131432498) {
                        AnonymousClass3MY.A1H(DeleteMessagesDialogFragment.A00(A012.A0v.A00, C18070vi.A0M(A012)), this, (String) null);
                        return true;
                    } else if (A0B == 2131432515) {
                        AnonymousClass1RK r02 = this.A03;
                        if (r02 != null) {
                            r02.A04().A09(new C98284qs(this, A012, 5));
                            return true;
                        }
                        str = "companionDeviceManager";
                    }
                    return true;
                }
                throw C17880vN.A0g();
            }
            str = "fMessageDatabase";
        }
        C18070vi.A11(str);
        throw null;
    }

    public ViewOnceViewerActivity(int i) {
        this.A07 = false;
        C91014f0.A00(this, 44);
    }
}
