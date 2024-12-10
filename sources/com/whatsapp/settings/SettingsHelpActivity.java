package com.whatsapp.settings;

import X.A98;
import X.ADL;
import X.AFH;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11S;
import X.AnonymousClass129;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1MB;
import X.AnonymousClass1X0;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass4SS;
import X.AnonymousClass4aX;
import X.AnonymousClass7OM;
import X.C000200d;
import X.C003401n;
import X.C132216mP;
import X.C133096oA;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C19880zA;
import X.C19890zB;
import X.C21433Ak0;
import X.C219217x;
import X.C24261Jm;
import X.C28281Zt;
import X.C33531iy;
import X.C62302rB;
import X.C63332st;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C74733cO;
import X.C87824Xf;
import X.C90094dW;
import X.C91034f2;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.TextView;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.icon.WDSIcon;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class SettingsHelpActivity extends AnonymousClass1FY {
    public C19880zA A00;
    public C132216mP A01;
    public C219217x A02;
    public AnonymousClass1MB A03;
    public AnonymousClass4SS A04;
    public C33531iy A05;
    public A98 A06;
    public AnonymousClass129 A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public boolean A0E;
    public boolean A0F;

    public SettingsHelpActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A0F) {
            this.A0F = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r3 = r1.A00;
            AnonymousClass1FB.A0K(r1, r3, this, r3.A45);
            AnonymousClass1FB.A0L(r1, r3, this, r3.A5A);
            this.A08 = C000200d.A00(A0K.A05);
            this.A07 = AnonymousClass3Ma.A0t(r1);
            this.A04 = (AnonymousClass4SS) r3.A3V.get();
            this.A09 = C000200d.A00(r1.Aly);
            this.A06 = (A98) r1.Ag7.get();
            this.A01 = (C132216mP) r3.A4S.get();
            this.A0A = C000200d.A00(A0K.A5o);
            this.A00 = C19890zB.A00;
            this.A03 = AnonymousClass3Ma.A0k(r1);
            this.A0B = C000200d.A00(r1.AkJ);
            this.A05 = (C33531iy) r1.ABF.get();
            this.A0C = C000200d.A00(r1.ABc);
            this.A0D = AnonymousClass3MW.A0s(r1);
            this.A02 = AnonymousClass3Ma.A0b(r1);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        ViewGroup A0F2;
        super.onCreate(bundle);
        setTitle(2131899401);
        setContentView(2131626564);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
            this.A0E = C18020vd.A05(C18040vf.A02, this.A0E, 4023);
            int A032 = C72483Me.A03(this);
            View findViewById = findViewById(2131431108);
            View findViewById2 = findViewById.findViewById(2131434753);
            C18070vi.A0z(findViewById2, "null cannot be cast to non-null type com.whatsapp.wds.components.icon.WDSIcon");
            WDSIcon wDSIcon = (WDSIcon) findViewById2;
            wDSIcon.setIcon((Drawable) new C74733cO(C24261Jm.A00(this, 2131231968), this.A00));
            AnonymousClass4aX.A0D(wDSIcon, A032);
            AnonymousClass1Y5.A07(findViewById, "Button");
            C90094dW.A00(findViewById, this, 6);
            View findViewById3 = findViewById(2131436039);
            TextView A0E2 = C17880vN.A0E(findViewById3, 2131434761);
            View findViewById4 = findViewById3.findViewById(2131434753);
            C18070vi.A0z(findViewById4, "null cannot be cast to non-null type com.whatsapp.wds.components.icon.WDSIcon");
            WDSIcon wDSIcon2 = (WDSIcon) findViewById4;
            wDSIcon2.setIcon((Drawable) AnonymousClass3NL.A00(this, this.A00, 2131231849));
            AnonymousClass4aX.A0D(wDSIcon2, A032);
            A0E2.setText(getText(2131896019));
            AnonymousClass1Y5.A07(findViewById3, "Button");
            C90094dW.A00(findViewById3, this, 5);
            WDSListItem wDSListItem = (WDSListItem) findViewById(2131427360);
            if (this.A0E) {
                wDSListItem.setIcon(2131232010);
            }
            AnonymousClass4aX.A0D(AnonymousClass3MW.A0H(wDSListItem, 2131434753), A032);
            AnonymousClass1Y5.A07(wDSListItem, "Button");
            C90094dW.A00(wDSListItem, this, 8);
            C18030ve r2 = this.A0E;
            C18070vi.A0W(r2);
            if (C18020vd.A05(C18040vf.A01, r2, 1799) && (A0F2 = AnonymousClass3MX.A0F(this, 2131433198)) != null) {
                AnonymousClass00H r0 = this.A09;
                if (r0 != null) {
                    List<C62302rB> A033 = ((C63332st) r0.get()).A03();
                    if (AnonymousClass000.A1a(A033)) {
                        C33531iy r9 = this.A05;
                        if (r9 != null) {
                            LayoutInflater layoutInflater = getLayoutInflater();
                            C18070vi.A0X(layoutInflater);
                            for (C62302rB r7 : A033) {
                                if (r7 != null) {
                                    SettingsRowNoticeView settingsRowNoticeView = (SettingsRowNoticeView) layoutInflater.inflate(2131626920, A0F2, false);
                                    String str4 = r7.A05.A02;
                                    if (URLUtil.isValidUrl(str4)) {
                                        settingsRowNoticeView.setOnClickListener(new AFH(r7, settingsRowNoticeView, r9, str4, 8));
                                    }
                                    settingsRowNoticeView.setNotice(r7);
                                    if (r9.A03(r7, false)) {
                                        settingsRowNoticeView.A01(settingsRowNoticeView.A00, false);
                                        r9.A04.execute(new C21433Ak0(r9, r7, 26));
                                    } else {
                                        settingsRowNoticeView.A01((Drawable) null, false);
                                    }
                                    C17960vV.A0F(settingsRowNoticeView instanceof View, "UserNoticeBadgeView from the factory is not an android.view.View");
                                    A0F2.addView(settingsRowNoticeView);
                                }
                            }
                        } else {
                            str = "userNoticeBadgeManager";
                        }
                    }
                    A0F2.setVisibility(0);
                } else {
                    str = "noticeBadgeSharedPreferences";
                }
                C18070vi.A11(str);
                throw null;
            }
            View findViewById5 = findViewById(2131433078);
            AnonymousClass1Y5.A07(findViewById5, "Button");
            C90094dW.A00(findViewById5, this, 7);
            AnonymousClass00H r02 = this.A0A;
            if (r02 != null) {
                View view = this.A00;
                C18070vi.A0X(view);
                ((C87824Xf) r02.get()).A02(view, "help", C72453Mb.A0w(this));
                try {
                    JSONObject A15 = C17880vN.A15();
                    JSONObject A152 = C17880vN.A15();
                    Locale A0N = this.A00.A0N();
                    String[] strArr = AnonymousClass1X0.A04;
                    str2 = A15.put("params", A152.put("locale", A0N.toLanguageTag())).toString();
                } catch (JSONException unused) {
                    Log.e("SettingsHelpV2 - Could not create Bloks parameter");
                    str2 = null;
                }
                AnonymousClass00H r03 = this.A08;
                if (r03 != null) {
                    C133096oA r1 = (C133096oA) r03.get();
                    WeakReference A0z = AnonymousClass3MW.A0z(this);
                    boolean A0B2 = C28281Zt.A0B(this);
                    PhoneUserJid A002 = AnonymousClass11S.A00(this.A02);
                    if (A002 == null || (str3 = A002.getRawString()) == null) {
                        str3 = "";
                    }
                    r1.A00(new AnonymousClass7OM(3), (ADL) null, "com.bloks.www.csf.whatsapp.gethelp.locale.async", str3, str2, A0z, A0B2);
                    return;
                }
                str = "asyncActionLauncherLazy";
            } else {
                str = "settingsSearchUtil";
            }
            C18070vi.A11(str);
            throw null;
        }
        throw C17890vO.A0K();
    }

    public void onResume() {
        super.onResume();
        if (this.A04 != null) {
            Iterator it = AnonymousClass000.A13().iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0s("shouldShowNotice");
            }
            return;
        }
        C18070vi.A11("noticeBadgeManager");
        throw null;
    }

    public SettingsHelpActivity(int i) {
        this.A0F = false;
        C91034f2.A00(this, 16);
    }
}
