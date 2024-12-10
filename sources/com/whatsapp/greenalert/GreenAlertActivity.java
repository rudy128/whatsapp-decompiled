package com.whatsapp.greenalert;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass129;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K3;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LC;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C24521Kq;
import X.C26106CsQ;
import X.C33451iq;
import X.C63802ti;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C74403Zv;
import X.C74413Zw;
import X.C89944dH;
import X.C89984dL;
import X.C90574eI;
import X.C90584eJ;
import X.C91014f0;
import X.C91364fZ;
import X.E3d;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTabLayout;
import com.whatsapp.WaViewPager;
import com.whatsapp.wds.components.button.WDSButton;

public final class GreenAlertActivity extends AnonymousClass1FY {
    public WaImageButton A00;
    public WaImageButton A01;
    public WaViewPager A02;
    public C33451iq A03;
    public AnonymousClass129 A04;
    public AnonymousClass1K3 A05;
    public WDSButton A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public View A0A;
    public View A0B;
    public WaImageButton A0C;
    public WaTabLayout A0D;
    public C74403Zv A0E;
    public boolean A0F;
    public final E3d A0G;

    public GreenAlertActivity() {
        this(0);
        this.A0G = new C91364fZ(this, 0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        A0Q(this);
    }

    public static final void A03(GreenAlertActivity greenAlertActivity) {
        String str;
        WaViewPager waViewPager = greenAlertActivity.A02;
        if (waViewPager == null) {
            str = "viewPager";
        } else {
            int currentLogicalItem = waViewPager.getCurrentLogicalItem();
            C33451iq r0 = greenAlertActivity.A03;
            if (r0 == null) {
                str = "userNoticeManager";
            } else if (C63802ti.A03(r0)) {
                AnonymousClass00H r02 = greenAlertActivity.A08;
                if (r02 != null) {
                    C26106CsQ csQ = (C26106CsQ) r02.get();
                    int i = 12;
                    if (currentLogicalItem == 1) {
                        i = 4;
                    }
                    C26106CsQ.A00(csQ, i);
                    greenAlertActivity.finish();
                    return;
                }
                str = "userNoticeLogger";
            } else {
                AnonymousClass1L9.A02(greenAlertActivity);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0Q(GreenAlertActivity greenAlertActivity) {
        WaViewPager waViewPager = greenAlertActivity.A02;
        if (waViewPager == null) {
            C18070vi.A11("viewPager");
            throw null;
        }
        View findViewWithTag = waViewPager.findViewWithTag(Integer.valueOf(waViewPager.getCurrentLogicalItem()));
        if (findViewWithTag != null) {
            C90574eI.A00(findViewWithTag.getViewTreeObserver(), findViewWithTag, greenAlertActivity, 2);
        }
    }

    public static final void A0V(GreenAlertActivity greenAlertActivity, int i) {
        String str;
        WaImageButton waImageButton = greenAlertActivity.A00;
        if (waImageButton == null) {
            str = "backButton";
        } else {
            waImageButton.setVisibility(C72453Mb.A02(i));
            WDSButton wDSButton = greenAlertActivity.A06;
            if (wDSButton == null) {
                str = "continueButton";
            } else {
                int i2 = 2131890848;
                if (i == 1) {
                    i2 = 2131890846;
                }
                wDSButton.setText(i2);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0c(com.whatsapp.greenalert.GreenAlertActivity r7, int r8) {
        /*
            com.whatsapp.WaViewPager r1 = r7.A02
            if (r1 == 0) goto L_0x0086
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            android.view.View r4 = r1.findViewWithTag(r0)
            if (r4 == 0) goto L_0x008f
            java.lang.String r6 = "scrollTosButton"
            java.lang.String r5 = "continueButton"
            r2 = 0
            r3 = 1
            if (r8 != r3) goto L_0x0071
            com.whatsapp.WaViewPager r1 = r7.A02
            if (r1 == 0) goto L_0x0086
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            android.view.View r0 = r1.findViewWithTag(r0)
            boolean r0 = r0.canScrollVertically(r3)
            if (r0 == 0) goto L_0x0071
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A06
            if (r1 == 0) goto L_0x0082
            r0 = 4
            r1.setVisibility(r0)
            com.whatsapp.WaImageButton r0 = r7.A0C
            if (r0 == 0) goto L_0x0050
            r0.setVisibility(r2)
        L_0x0037:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131166926(0x7f0706ce, float:1.7948111E38)
            float r1 = r1.getDimension(r0)
            int r0 = r4.getScrollY()
            r2 = 0
            if (r0 > 0) goto L_0x004a
            r1 = 0
        L_0x004a:
            android.view.View r0 = r7.A0B
            if (r0 != 0) goto L_0x0055
            java.lang.String r6 = "stickyTopPanel"
        L_0x0050:
            X.C18070vi.A11(r6)
        L_0x0053:
            r0 = 0
            throw r0
        L_0x0055:
            X.AnonymousClass1HF.A0W(r0, r1)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131166925(0x7f0706cd, float:1.794811E38)
            float r1 = r1.getDimension(r0)
            boolean r0 = r4.canScrollVertically(r3)
            if (r0 == 0) goto L_0x006a
            r2 = r1
        L_0x006a:
            android.view.View r0 = r7.A0A
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = "stickyBottomPanel"
            goto L_0x0088
        L_0x0071:
            com.whatsapp.wds.components.button.WDSButton r0 = r7.A06
            if (r0 == 0) goto L_0x0082
            r0.setVisibility(r2)
            com.whatsapp.WaImageButton r1 = r7.A0C
            if (r1 == 0) goto L_0x0050
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0037
        L_0x0082:
            X.C18070vi.A11(r5)
            goto L_0x0053
        L_0x0086:
            java.lang.String r0 = "viewPager"
        L_0x0088:
            X.C18070vi.A11(r0)
            goto L_0x0053
        L_0x008c:
            X.AnonymousClass1HF.A0W(r0, r2)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.greenalert.GreenAlertActivity.A0c(com.whatsapp.greenalert.GreenAlertActivity, int):void");
    }

    public static final void A0d(GreenAlertActivity greenAlertActivity, int i) {
        WaViewPager waViewPager = greenAlertActivity.A02;
        if (waViewPager == null) {
            C18070vi.A11("viewPager");
            throw null;
        }
        waViewPager.setCurrentLogicalItem(i);
        A0V(greenAlertActivity, i);
        A0c(greenAlertActivity, i);
    }

    public void A2y() {
        if (!this.A0F) {
            this.A0F = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A05 = AnonymousClass3Ma.A0v(A0L);
            this.A04 = AnonymousClass3Ma.A0t(A0L);
            this.A07 = C000200d.A00(A0L.AAx);
            this.A08 = C000200d.A00(A0L.ABI);
            this.A03 = (C33451iq) A0L.ABJ.get();
            this.A09 = C000200d.A00(A0L.ABc);
        }
    }

    public void onBackPressed() {
        WaViewPager waViewPager = this.A02;
        if (waViewPager == null) {
            C18070vi.A11("viewPager");
            throw null;
        }
        int currentLogicalItem = waViewPager.getCurrentLogicalItem() - 1;
        if (-1 < currentLogicalItem) {
            A0d(this, currentLogicalItem);
        } else {
            A03(this);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131624054);
        this.A00 = (WaImageButton) findViewById(2131431200);
        this.A01 = (WaImageButton) findViewById(2131431202);
        this.A06 = (WDSButton) findViewById(2131431201);
        this.A0C = (WaImageButton) findViewById(2131431210);
        this.A0D = (WaTabLayout) findViewById(2131431213);
        this.A0B = findViewById(2131431212);
        this.A0A = findViewById(2131431211);
        this.A02 = (WaViewPager) findViewById(2131431225);
        C33451iq r0 = this.A03;
        if (r0 != null) {
            boolean A032 = C63802ti.A03(r0);
            C18030ve r11 = this.A0E;
            C18070vi.A0W(r11);
            AnonymousClass1KB r6 = this.A05;
            C18070vi.A0W(r6);
            AnonymousClass1K3 r13 = this.A05;
            if (r13 != null) {
                AnonymousClass1L9 r5 = this.A01;
                C18070vi.A0W(r5);
                AnonymousClass1LC r7 = this.A03;
                C18070vi.A0W(r7);
                AnonymousClass129 r12 = this.A04;
                if (r12 != null) {
                    AnonymousClass11C r8 = this.A08;
                    C18070vi.A0W(r8);
                    C18000vb r10 = this.A00;
                    C18070vi.A0W(r10);
                    AnonymousClass00H r02 = this.A09;
                    if (r02 != null) {
                        C74403Zv r3 = new C74403Zv(this.A0G, r5, r6, r7, r8, (C24521Kq) C18070vi.A0E(r02), r10, r11, r12, r13);
                        this.A0E = r3;
                        WaViewPager waViewPager = this.A02;
                        String str2 = "viewPager";
                        if (waViewPager != null) {
                            waViewPager.setAdapter(r3);
                            WaViewPager waViewPager2 = this.A02;
                            if (waViewPager2 != null) {
                                waViewPager2.A0K(new C74413Zw(this));
                                WaViewPager waViewPager3 = this.A02;
                                if (waViewPager3 != null) {
                                    C90584eJ.A00(waViewPager3.getViewTreeObserver(), this, 23);
                                    WaTabLayout waTabLayout = this.A0D;
                                    if (waTabLayout != null) {
                                        WaViewPager waViewPager4 = this.A02;
                                        if (waViewPager4 != null) {
                                            waTabLayout.setupWithViewPager(waViewPager4);
                                            WaTabLayout waTabLayout2 = this.A0D;
                                            if (waTabLayout2 != null) {
                                                WDSButton wDSButton = this.A06;
                                                str2 = "continueButton";
                                                if (wDSButton != null) {
                                                    waTabLayout2.setupTabsForAccessibility(wDSButton);
                                                    WaTabLayout waTabLayout3 = this.A0D;
                                                    if (waTabLayout3 != null) {
                                                        waTabLayout3.setTabsClickable(false);
                                                        WaImageButton waImageButton = this.A00;
                                                        if (waImageButton == null) {
                                                            str = "backButton";
                                                        } else {
                                                            C89984dL.A00(waImageButton, this, 6, A032);
                                                            WaImageButton waImageButton2 = this.A01;
                                                            if (waImageButton2 == null) {
                                                                str = "dismissButton";
                                                            } else {
                                                                C89944dH.A00(waImageButton2, this, 40);
                                                                WDSButton wDSButton2 = this.A06;
                                                                if (wDSButton2 != null) {
                                                                    C89984dL.A00(wDSButton2, this, 7, A032);
                                                                    WaImageButton waImageButton3 = this.A0C;
                                                                    if (waImageButton3 == null) {
                                                                        str = "scrollTosButton";
                                                                    } else {
                                                                        C89944dH.A00(waImageButton3, this, 41);
                                                                        A0d(this, getIntent().getIntExtra("page", 0));
                                                                        AnonymousClass00H r03 = this.A08;
                                                                        if (r03 != null) {
                                                                            C26106CsQ.A00((C26106CsQ) r03.get(), 11);
                                                                            return;
                                                                        }
                                                                        str = "userNoticeLogger";
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    C18070vi.A11("tabLayout");
                                    throw null;
                                }
                            }
                        }
                        C18070vi.A11(str2);
                        throw null;
                    }
                    str = "waDebugBuildSharedPreferences";
                } else {
                    str = "faqLinkFactory";
                }
            } else {
                str = "countryUtils";
            }
        } else {
            str = "userNoticeManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onResume() {
        String str;
        int i;
        super.onResume();
        C33451iq r0 = this.A03;
        if (r0 != null) {
            boolean A032 = C63802ti.A03(r0);
            str = "dismissButton";
            WaImageButton waImageButton = this.A01;
            if (!A032) {
                if (waImageButton != null) {
                    i = 8;
                }
            } else if (waImageButton != null) {
                i = 0;
            }
            waImageButton.setVisibility(i);
            return;
        }
        str = "userNoticeManager";
        C18070vi.A11(str);
        throw null;
    }

    public GreenAlertActivity(int i) {
        this.A0F = false;
        C91014f0.A00(this, 12);
    }
}
