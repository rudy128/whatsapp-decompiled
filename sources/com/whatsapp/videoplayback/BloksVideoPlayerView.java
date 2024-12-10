package com.whatsapp.videoplayback;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass190;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.AnonymousClass6gC;
import X.AnonymousClass70X;
import X.BE9;
import X.BEB;
import X.C000200d;
import X.C122076Mr;
import X.C122136Mx;
import X.C135056ra;
import X.C18030ve;
import X.C18070vi;
import X.C25192Caj;
import X.C25220CbG;
import X.C26327Cxk;
import X.D5I;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.whatsapp.media.WamediaManager;

public final class BloksVideoPlayerView extends FrameLayout implements AnonymousClass009 {
    public ViewTreeObserver.OnScrollChangedListener A00;
    public AnonymousClass190 A01;
    public AnonymousClass1KB A02;
    public AnonymousClass11C A03;
    public AnonymousClass118 A04;
    public C18030ve A05;
    public WamediaManager A06;
    public AnonymousClass10I A07;
    public ExoPlayerErrorFrame A08;
    public C25192Caj A09;
    public AnonymousClass70X A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass031 A0C;
    public boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksVideoPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A01();
        this.A09 = new C25192Caj(false, false, false);
        A00();
    }

    public final void A03(Activity activity, C25220CbG cbG) {
        C25220CbG cbG2 = cbG;
        if (cbG2.A01 != null || cbG2.A00 != null) {
            AnonymousClass70X r3 = this.A0A;
            C122076Mr r32 = r3;
            if (r3 == null) {
                AnonymousClass190 crashLogs = getCrashLogs();
                AnonymousClass1KB globalUI = getGlobalUI();
                AnonymousClass11C systemServices = getSystemServices();
                Activity A052 = AnonymousClass3Ma.A05(this);
                AnonymousClass118 waContext = getWaContext();
                C18030ve abProps = getAbProps();
                C122136Mx A0Q = BEB.A0Q(this);
                C122076Mr r33 = new C122076Mr(A052, crashLogs, globalUI, systemServices, waContext, abProps, (AnonymousClass6gC) getHeroSettingProvider().get(), getWaWorkers(), (C135056ra) null, 0, false);
                r33.A0f(A0Q);
                this.A0A = r33;
                r32 = r33;
            }
            addView(r32.A09(), 0, new FrameLayout.LayoutParams(-1, -1));
            boolean z = cbG2.A02;
            if (z) {
                D5I d5i = new D5I(this);
                getViewTreeObserver().addOnScrollChangedListener(d5i);
                this.A00 = d5i;
            }
            AnonymousClass70X r1 = this.A0A;
            if (r1 != null) {
                r1.A0D = cbG2.A03;
                r1.A0W(cbG2.A04);
            }
            AnonymousClass70X r0 = this.A0A;
            if (r0 != null) {
                r0.A0O(0);
            }
            AnonymousClass70X r02 = this.A0A;
            if (r02 != null) {
                r02.A0G();
            }
            this.A09 = new C25192Caj(z, this.A09.A02, true);
            A02();
            if (Build.VERSION.SDK_INT > 29) {
                activity.registerActivityLifecycleCallbacks(new C26327Cxk(this));
            }
        }
    }

    public final void setAbProps(C18030ve r2) {
        C18070vi.A0d(r2, 0);
        this.A05 = r2;
    }

    public final void setCrashLogs(AnonymousClass190 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setExoPlayerErrorElements(ExoPlayerErrorFrame exoPlayerErrorFrame) {
        C18070vi.A0d(exoPlayerErrorFrame, 0);
        this.A08 = exoPlayerErrorFrame;
    }

    public final void setGlobalUI(AnonymousClass1KB r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setHeroSettingProvider(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 0);
        this.A0B = r2;
    }

    public final void setSystemServices(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setWaContext(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setWaWorkers(AnonymousClass10I r2) {
        C18070vi.A0d(r2, 0);
        this.A07 = r2;
    }

    public final void setWamediaManager(WamediaManager wamediaManager) {
        C18070vi.A0d(wamediaManager, 0);
        this.A06 = wamediaManager;
    }

    public void A01() {
        if (!this.A0D) {
            this.A0D = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A05 = AnonymousClass10E.A8q(A0O);
            this.A01 = (AnonymousClass190) A0O.A31.get();
            this.A02 = AnonymousClass10E.A13(A0O);
            this.A0B = C000200d.A00(A0O.A00.A2V);
            this.A03 = (AnonymousClass11C) A0O.AAp.get();
            this.A04 = BE9.A0Z(A0O);
            this.A07 = (AnonymousClass10I) A0O.AC1.get();
            this.A06 = (WamediaManager) A0O.ABs.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r2 = this;
            X.Caj r1 = r2.A09
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.A02
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            X.70X r0 = r2.A0A
            if (r1 == 0) goto L_0x001a
            if (r0 == 0) goto L_0x0019
            r0.A0E()
        L_0x0019:
            return
        L_0x001a:
            if (r0 == 0) goto L_0x0019
            r0.A0B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.videoplayback.BloksVideoPlayerView.A02():void");
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0C;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public final C18030ve getAbProps() {
        C18030ve r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("abProps");
        throw null;
    }

    public final AnonymousClass190 getCrashLogs() {
        AnonymousClass190 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("crashLogs");
        throw null;
    }

    public final ExoPlayerErrorFrame getExoPlayerErrorElements() {
        ExoPlayerErrorFrame exoPlayerErrorFrame = this.A08;
        if (exoPlayerErrorFrame != null) {
            return exoPlayerErrorFrame;
        }
        C18070vi.A11("exoPlayerErrorElements");
        throw null;
    }

    public final AnonymousClass1KB getGlobalUI() {
        AnonymousClass1KB r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("globalUI");
        throw null;
    }

    public final AnonymousClass00H getHeroSettingProvider() {
        AnonymousClass00H r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("heroSettingProvider");
        throw null;
    }

    public final AnonymousClass11C getSystemServices() {
        AnonymousClass11C r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("systemServices");
        throw null;
    }

    public final AnonymousClass118 getWaContext() {
        AnonymousClass118 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContext");
        throw null;
    }

    public final AnonymousClass10I getWaWorkers() {
        AnonymousClass10I r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waWorkers");
        throw null;
    }

    public final WamediaManager getWamediaManager() {
        WamediaManager wamediaManager = this.A06;
        if (wamediaManager != null) {
            return wamediaManager;
        }
        C18070vi.A11("wamediaManager");
        throw null;
    }

    private final void A00() {
        setExoPlayerErrorElements((ExoPlayerErrorFrame) AnonymousClass3MX.A0C(View.inflate(getContext(), 2131624298, this), 2131430703));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksVideoPlayerView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A01();
        this.A09 = new C25192Caj(false, false, false);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BloksVideoPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A01();
        this.A09 = new C25192Caj(false, false, false);
        A00();
    }

    public BloksVideoPlayerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }
}
