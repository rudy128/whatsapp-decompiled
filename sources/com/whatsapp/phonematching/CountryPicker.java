package com.whatsapp.phonematching;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1GP;
import X.AnonymousClass1K1;
import X.AnonymousClass1K3;
import X.AnonymousClass1LA;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aX;
import X.AnonymousClass7AQ;
import X.C108955ca;
import X.C109005cf;
import X.C110205f6;
import X.C111075i9;
import X.C137106uv;
import X.C1423279a;
import X.C1604888r;
import X.C17900vP;
import X.C34001jj;
import X.C72453Mb;
import X.C72463Mc;
import X.C74803cp;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.whatsapp.base.WDSSearchViewFragment;
import com.whatsapp.wds.components.search.WDSConversationSearchView;

public class CountryPicker extends C74803cp implements C1604888r {
    public View A00;
    public View A01;
    public Toolbar A02;
    public AnonymousClass1LA A03;
    public C110205f6 A04;
    public AnonymousClass1K3 A05;
    public C111075i9 A06;
    public boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e1, code lost:
        if (X.C25950CpI.A00(r2, r1) == false) goto L_0x00e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r10 = r15
            r0 = r16
            super.onCreate(r0)
            X.C72463Mc.A0t(r15)
            r0 = 2131894556(0x7f12211c, float:1.942392E38)
            r4 = 2131894556(0x7f12211c, float:1.942392E38)
            r15.setTitle(r0)
            r0 = 2131625014(0x7f0e0436, float:1.8877224E38)
            r15.setContentView((int) r0)
            X.C72463Mc.A0t(r15)
            r0 = 2131436246(0x7f0b22d6, float:1.8494357E38)
            android.view.View r0 = r15.findViewById(r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r15.A02 = r0
            android.content.Context r0 = r15.getApplicationContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r1 = r0.hasPermanentMenuKey()
            androidx.appcompat.widget.Toolbar r0 = r15.A02
            r15.setSupportActionBar(r0)
            r5 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0045
            X.01n r0 = X.AnonymousClass3MY.A0J(r15)
            r0.A0W(r3)
            r0.A0Y(r5)
        L_0x0045:
            X.0vb r1 = r15.A00
            r0 = 2131231675(0x7f0803bb, float:1.8079438E38)
            X.3cP r2 = X.AnonymousClass3NL.A00(r15, r1, r0)
            r1 = 2130970284(0x7f0406ac, float:1.7549274E38)
            r0 = 2131101275(0x7f06065b, float:1.7814955E38)
            int r0 = X.AnonymousClass3Ma.A00(r15, r1, r0)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass4aX.A08(r2, r0)
            androidx.appcompat.widget.Toolbar r0 = r15.A02
            r0.setNavigationIcon((android.graphics.drawable.Drawable) r1)
            androidx.appcompat.widget.Toolbar r0 = r15.A02
            r0.setTitle((int) r4)
            X.1K3 r1 = r15.A05
            X.0vb r0 = r15.A00
            java.util.Locale r0 = r0.A0N()
            java.lang.String r0 = X.AnonymousClass1X0.A04(r0)
            java.util.List r1 = X.AnonymousClass1K3.A02(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0088
            X.1K3 r1 = r15.A05
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = X.AnonymousClass1X0.A04(r0)
            java.util.List r1 = X.AnonymousClass1K3.A02(r1, r0)
        L_0x0088:
            java.util.ArrayList r14 = X.AnonymousClass000.A14(r1)
            java.util.Iterator r9 = r1.iterator()
        L_0x0090:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r2 = r9.next()
            X.2dJ r2 = (X.C53922dJ) r2
            X.1LA r0 = r15.A03
            java.lang.String r7 = r2.A00
            X.1yp r8 = r0.A02(r7)
            if (r8 != 0) goto L_0x00bd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "countrypicker/oncreate saw unknown country "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "="
            r1.append(r0)
            java.lang.String r0 = r2.A01
            X.C17890vO.A1B(r1, r0)
            goto L_0x0090
        L_0x00bd:
            java.lang.String r6 = r2.A01
            java.lang.String r4 = r8.A03
            boolean r0 = r6.equals(r4)
            if (r0 != 0) goto L_0x00e3
            X.CpI r0 = X.C25950CpI.A05
            int r1 = r4.codePointAt(r5)
            r0 = 255(0xff, float:3.57E-43)
            if (r1 <= r0) goto L_0x00e4
            X.CpI r2 = X.C25950CpI.A05
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r0) goto L_0x00f3
            char r0 = (char) r1
            java.lang.String r1 = java.lang.Character.toString(r0)
        L_0x00dd:
            boolean r0 = X.C25950CpI.A00(r2, r1)
            if (r0 != 0) goto L_0x00e4
        L_0x00e3:
            r4 = 0
        L_0x00e4:
            int r0 = r8.A00
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.6ne r0 = new X.6ne
            r0.<init>(r6, r4, r1, r7)
            r14.add(r0)
            goto L_0x0090
        L_0x00f3:
            char[] r0 = java.lang.Character.toChars(r1)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            goto L_0x00dd
        L_0x00fd:
            X.0vb r0 = r15.A00
            java.util.Locale r1 = r0.A0N()
            X.7Ri r0 = new X.7Ri
            r0.<init>(r15, r1)
            java.util.Collections.sort(r14, r0)
            X.11C r0 = r15.A08
            android.telephony.TelephonyManager r0 = r0.A0K()
            if (r0 == 0) goto L_0x0137
            java.lang.String r4 = r0.getSimCountryIso()
            if (r4 == 0) goto L_0x0137
            java.util.Iterator r2 = r14.iterator()
        L_0x011d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0137
            java.lang.Object r1 = r2.next()
            X.6ne r1 = (X.C132826ne) r1
            java.lang.String r0 = r1.A03
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x011d
            r2.remove()
            r14.add(r5, r1)
        L_0x0137:
            android.widget.ListView r2 = r15.getListView()
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "country_iso"
            java.lang.String r12 = r1.getStringExtra(r0)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "country_display_name"
            java.lang.String r13 = r1.getStringExtra(r0)
            X.5f6 r9 = new X.5f6
            r11 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            r15.A04 = r9
            r15.A4b(r9)
            r1 = 6
            X.79J r0 = new X.79J
            r0.<init>(r15, r1)
            r2.setOnItemClickListener(r0)
            r2.setFastScrollEnabled(r3)
            r2.setScrollbarFadingEnabled(r3)
            r2.setFastScrollAlwaysVisible(r3)
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r2.setScrollBarStyle(r0)
            X.0vb r0 = r15.A00
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            if (r0 == 0) goto L_0x018f
            r2.setVerticalScrollbarPosition(r3)
        L_0x017c:
            r0 = 2131434898(0x7f0b1d92, float:1.8491623E38)
            android.view.View r0 = r15.findViewById(r0)
            r15.A01 = r0
            r0 = 2131430073(0x7f0b0ab9, float:1.8481837E38)
            android.view.View r0 = r15.findViewById(r0)
            r15.A00 = r0
            return
        L_0x018f:
            r0 = 2
            r2.setVerticalScrollbarPosition(r0)
            goto L_0x017c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.phonematching.CountryPicker.onCreate(android.os.Bundle):void");
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            C137106uv.A00(A0K, this);
            this.A05 = AnonymousClass3Ma.A0v(A0A);
            this.A03 = C72453Mb.A0b(A0A);
        }
    }

    public CountryPicker(int i) {
        this.A07 = false;
        C1423279a.A00(this, 28);
    }

    public static void A0y(CountryPicker countryPicker) {
        AnonymousClass1GP supportFragmentManager = countryPicker.getSupportFragmentManager();
        if (!supportFragmentManager.A0z()) {
            Fragment A0Q = supportFragmentManager.A0Q("search_fragment");
            if (A0Q != null) {
                ((WDSSearchViewFragment) A0Q).A26();
            }
            countryPicker.getSupportFragmentManager().A0v("search_fragment", 1);
            C72453Mb.A1B(countryPicker.A01);
            countryPicker.A02.setVisibility(0);
            countryPicker.A00.setVisibility(0);
            C72463Mc.A0t(countryPicker);
        }
    }

    public static boolean A0z(CountryPicker countryPicker) {
        Fragment A0Q;
        AnonymousClass1GP supportFragmentManager = countryPicker.getSupportFragmentManager();
        if (supportFragmentManager.A0K() != 1 || (A0Q = supportFragmentManager.A0Q("search_fragment")) == null || !A0Q.A1e()) {
            return false;
        }
        return true;
    }

    public C111075i9 BYk() {
        return this.A06;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void onBackPressed() {
        if (A0z(this)) {
            A0y(this);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 2131432620, 0, 2131899369).setIcon(AnonymousClass4aX.A08(AnonymousClass3MX.A06(this, 2131232266), AnonymousClass3Ma.A00(this, 2130970284, 2131101275))).setShowAsAction(2);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("item.getItemId()");
        A10.append(menuItem.getItemId());
        C17900vP.A0r(A10, AnonymousClass000.A1T(menuItem.getItemId(), 2131432620));
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            super.onBackPressed();
        } else if (itemId == 2131432620) {
            if (!A0z(this)) {
                if (this.A06 == null) {
                    C111075i9 r2 = (C111075i9) AnonymousClass3MW.A0N(this).A00(C111075i9.class);
                    this.A06 = r2;
                    r2.A00.A0A(this, new AnonymousClass7AQ(this, 18));
                    C111075i9 r22 = this.A06;
                    r22.A01.A0A(this, new AnonymousClass7AQ(this, 19));
                }
                this.A02.setVisibility(8);
                this.A00.setVisibility(8);
                View view = this.A01;
                if (view != null) {
                    view.setVisibility(0);
                    this.A01.setElevation(0.0f);
                }
                AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
                WDSSearchViewFragment wDSSearchViewFragment = (WDSSearchViewFragment) supportFragmentManager.A0Q("search_fragment");
                if (wDSSearchViewFragment == null) {
                    wDSSearchViewFragment = new WDSSearchViewFragment();
                    C34001jj r1 = new C34001jj(supportFragmentManager);
                    r1.A0G = true;
                    r1.A0D(wDSSearchViewFragment, "search_fragment", 2131434898);
                    r1.A0H("search_fragment");
                    r1.A01();
                    supportFragmentManager.A0Z();
                }
                WDSConversationSearchView wDSConversationSearchView = wDSSearchViewFragment.A00;
                if (wDSConversationSearchView != null) {
                    wDSConversationSearchView.A02();
                }
                WDSConversationSearchView wDSConversationSearchView2 = wDSSearchViewFragment.A00;
                if (wDSConversationSearchView2 != null) {
                    wDSConversationSearchView2.setHint(2131895478);
                }
                return true;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-this.A02.getHeight()), 0.0f);
            translateAnimation.setDuration(250);
            this.A01.clearAnimation();
            this.A01.startAnimation(translateAnimation);
            return true;
        }
        return false;
    }

    public CountryPicker() {
        this(0);
    }
}
