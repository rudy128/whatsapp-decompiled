package com.whatsapp.inappsupport.ui;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass190;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1KB;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass6gC;
import X.AnonymousClass70X;
import X.AnonymousClass78A;
import X.AnonymousClass7O4;
import X.C000200d;
import X.C003401n;
import X.C108955ca;
import X.C108995ce;
import X.C109005cf;
import X.C1185063s;
import X.C121996Mj;
import X.C122076Mr;
import X.C122136Mx;
import X.C129046hA;
import X.C132976nx;
import X.C133906ph;
import X.C135056ra;
import X.C1423279a;
import X.C146077Ns;
import X.C146097Nu;
import X.C146137Ny;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C28931bI;
import X.C35541mP;
import X.C72473Md;
import X.C74743cP;
import X.C89954dI;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.videoplayback.ExoPlayerErrorFrame;

public final class SupportVideoActivity extends AnonymousClass1FY {
    public FrameLayout A00;
    public AnonymousClass118 A01;
    public WamediaManager A02;
    public ExoPlayerErrorFrame A03;
    public AnonymousClass70X A04;
    public C121996Mj A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public String A09;
    public String A0A;
    public boolean A0B;

    public void A2y() {
        if (!this.A0B) {
            this.A0B = true;
            AnonymousClass10E A0A2 = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0c(A0A2, r1, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A06 = C000200d.A00(r1.A2V);
            this.A07 = C000200d.A00(A0A2.AkJ);
            this.A08 = C000200d.A00(r1.AHv);
            this.A01 = AnonymousClass3MZ.A0l(A0A2);
            this.A02 = (WamediaManager) A0A2.ABs.get();
        }
    }

    public final AnonymousClass70X A4b() {
        AnonymousClass70X r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("videoPlayer");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        String str5;
        super.onCreate(bundle);
        setContentView(2131624116);
        FrameLayout frameLayout = (FrameLayout) AnonymousClass3MY.A0H(this, 2131434739);
        this.A00 = frameLayout;
        if (frameLayout == null) {
            C18070vi.A11("rootView");
            throw null;
        }
        frameLayout.setClipChildren(false);
        Toolbar A0G = AnonymousClass3Ma.A0G(this);
        C003401n A0K = AnonymousClass3MY.A0K(this, A0G);
        if (A0K != null) {
            A0K.A0Y(false);
        }
        C72473Md.A18(this);
        C74743cP A002 = AnonymousClass3NL.A00(this, this.A00, 2131231675);
        A002.setColorFilter(AnonymousClass3Ma.A01(this, getResources(), 2130971957, 2131103410), PorterDuff.Mode.SRC_ATOP);
        A0G.setNavigationIcon((Drawable) A002);
        Bundle A092 = AnonymousClass3MY.A09(this);
        if (A092 == null || (str = A092.getString("video_url", "")) == null) {
            str = "";
        }
        Bundle A093 = AnonymousClass3MY.A09(this);
        if (A093 != null) {
            str2 = A093.getString("captions_url", (String) null);
        } else {
            str2 = null;
        }
        Bundle A094 = AnonymousClass3MY.A09(this);
        if (A094 != null) {
            str3 = A094.getString("media_group_id", "");
        } else {
            str3 = null;
        }
        this.A09 = str3;
        Bundle A095 = AnonymousClass3MY.A09(this);
        if (A095 != null) {
            str4 = A095.getString("video_locale", "");
        } else {
            str4 = null;
        }
        this.A0A = str4;
        AnonymousClass190 r10 = this.A03;
        AnonymousClass1KB r9 = this.A05;
        AnonymousClass11C r8 = this.A08;
        AnonymousClass118 r7 = this.A01;
        if (r7 != null) {
            C18030ve r3 = this.A0E;
            WamediaManager wamediaManager = this.A02;
            if (wamediaManager != null) {
                AnonymousClass10I r1 = this.A05;
                AnonymousClass00H r0 = this.A06;
                if (r0 != null) {
                    C122076Mr r14 = new C122076Mr(this, r10, r9, r8, r7, r3, (AnonymousClass6gC) r0.get(), r1, (C135056ra) null, 0, false);
                    r14.A04 = Uri.parse(str);
                    if (str2 != null) {
                        uri = Uri.parse(str2);
                    } else {
                        uri = null;
                    }
                    r14.A03 = uri;
                    String string = getString(2131898700);
                    try {
                        str5 = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
                    } catch (PackageManager.NameNotFoundException unused) {
                        str5 = "?";
                    }
                    StringBuilder A11 = AnonymousClass000.A11(string);
                    A11.append("/");
                    A11.append(str5);
                    A11.append(" (Linux;Android ");
                    A11.append(Build.VERSION.RELEASE);
                    A11.append(") ");
                    r14.A0f(new C122136Mx(r7, wamediaManager, AnonymousClass000.A0y("ExoPlayerLib/2.13.3", A11)));
                    this.A04 = r14;
                    FrameLayout frameLayout2 = this.A00;
                    if (frameLayout2 == null) {
                        C18070vi.A11("rootView");
                        throw null;
                    }
                    frameLayout2.addView(A4b().A09(), 0);
                    AnonymousClass00H r02 = this.A08;
                    if (r02 != null) {
                        C129046hA r32 = new C129046hA((C132976nx) C18070vi.A0E(r02), A4b());
                        int intExtra = getIntent().getIntExtra("video_start_position", 0);
                        boolean A1R = AnonymousClass000.A1R(intExtra);
                        A4b().A0F = A1R;
                        this.A05 = (C121996Mj) AnonymousClass3MY.A0H(this, 2131429540);
                        AnonymousClass70X A4b = A4b();
                        C121996Mj r03 = this.A05;
                        if (r03 == null) {
                            C18070vi.A11("videoPlayerControllerView");
                            throw null;
                        }
                        A4b.A0U(r03);
                        FrameLayout frameLayout3 = this.A00;
                        if (frameLayout3 == null) {
                            C18070vi.A11("rootView");
                            throw null;
                        }
                        ExoPlayerErrorFrame exoPlayerErrorFrame = (ExoPlayerErrorFrame) AnonymousClass3MX.A0C(frameLayout3, 2131430703);
                        this.A03 = exoPlayerErrorFrame;
                        if (exoPlayerErrorFrame == null) {
                            C18070vi.A11("exoPlayerErrorFrame");
                            throw null;
                        }
                        C121996Mj r82 = this.A05;
                        if (r82 == null) {
                            C18070vi.A11("videoPlayerControllerView");
                            throw null;
                        }
                        A4b().A0Q(new C133906ph(exoPlayerErrorFrame, r82, true));
                        C121996Mj r12 = this.A05;
                        if (r12 == null) {
                            C18070vi.A11("videoPlayerControllerView");
                            throw null;
                        }
                        r12.A07 = new AnonymousClass7O4(this);
                        FrameLayout frameLayout4 = this.A00;
                        if (frameLayout4 == null) {
                            C18070vi.A11("rootView");
                            throw null;
                        }
                        frameLayout4.setOnClickListener(new C89954dI(this, 11));
                        A4b().A0T(new C146137Ny(r32, this, 0));
                        A4b().A08 = new C146077Ns(r32, 0);
                        A4b().A09 = new C146097Nu(this, str);
                        C121996Mj r04 = this.A05;
                        if (r04 == null) {
                            C18070vi.A11("videoPlayerControllerView");
                            throw null;
                        }
                        r04.A0H.setVisibility(8);
                        A4b().A0E();
                        if (A1R) {
                            A4b().A0M(intExtra);
                        }
                        if (str2 != null) {
                            C28931bI A0x = AnonymousClass3Ma.A0x(this, 2131431435);
                            A0x.A04(0);
                            ImageView imageView = (ImageView) AnonymousClass3MX.A0D(A0x);
                            AnonymousClass70X A4b2 = A4b();
                            if (A4b2 instanceof C122076Mr) {
                                ((C122076Mr) A4b2).A0a.setCaptionsEnabled(false);
                            }
                            imageView.setImageResource(2131233245);
                            imageView.setOnClickListener(new AnonymousClass78A(this, imageView, r32, 9));
                        }
                        AnonymousClass00H r05 = this.A07;
                        if (r05 != null) {
                            String str6 = this.A09;
                            String str7 = this.A0A;
                            C1185063s r13 = new C1185063s();
                            r13.A00 = 27;
                            r13.A07 = str;
                            r13.A04 = str6;
                            r13.A06 = str7;
                            ((C35541mP) r05.get()).A00.CC4(r13);
                            return;
                        }
                        C18070vi.A11("supportLogging");
                        throw null;
                    }
                    C18070vi.A11("supportVideoLogger");
                    throw null;
                }
                C18070vi.A11("heroSettingProvider");
                throw null;
            }
            C18070vi.A11("wamediaManager");
            throw null;
        }
        C18070vi.A11("waContext");
        throw null;
    }

    public SupportVideoActivity(int i) {
        this.A0B = false;
        C1423279a.A00(this, 7);
    }

    public void onBackPressed() {
        Intent A0A2 = C17880vN.A0A();
        A0A2.putExtra("video_start_position", A4b().A05());
        setResult(-1, A0A2);
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        A4b().A0F();
    }

    public void onPause() {
        super.onPause();
        A4b().A0B();
    }

    public void onResume() {
        super.onResume();
        C121996Mj r0 = this.A05;
        if (r0 != null) {
            if (!C108995ce.A1U(r0.A0F)) {
                C121996Mj r02 = this.A05;
                if (r02 != null) {
                    r02.A05();
                    return;
                }
            } else {
                return;
            }
        }
        C18070vi.A11("videoPlayerControllerView");
        throw null;
    }

    public SupportVideoActivity() {
        this(0);
    }
}
