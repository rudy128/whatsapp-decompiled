package com.whatsapp.metaai.voice.ui;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1D6;
import X.AnonymousClass1DF;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4XB;
import X.AnonymousClass6RF;
import X.AnonymousClass7T6;
import X.AnonymousClass7T7;
import X.C108945cZ;
import X.C108995ce;
import X.C122526Qs;
import X.C130826k4;
import X.C136746uK;
import X.C139286ya;
import X.C140076zu;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C22801Dg;
import X.C30391dr;
import X.C41111vp;
import X.C41731wy;
import X.C72453Mb;
import X.C72463Mc;
import X.C91644g1;
import X.C93644jJ;
import X.C99164sN;
import X.C99254sW;
import com.whatsapp.metaai.voice.MetaAiRtcVoiceManager$startInteraction$1;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Timer;

public class MetaAiVoiceViewModel extends AnonymousClass1J2 {
    public C41731wy A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public List A04;
    public Timer A05;
    public Timer A06;
    public boolean A07;
    public boolean A08;
    public Timer A09;
    public Timer A0A;
    public final C22801Dg A0B;
    public final C22801Dg A0C;
    public final AnonymousClass1DT A0D;
    public final AnonymousClass1DT A0E = AnonymousClass3MW.A0M((Object) null);
    public final AnonymousClass1DT A0F;
    public final AnonymousClass1DT A0G;
    public final AnonymousClass1KB A0H;
    public final C139286ya A0I;
    public final AnonymousClass4XB A0J;
    public final C130826k4 A0K;
    public final C136746uK A0L;
    public final C41111vp A0M;
    public final C41111vp A0N;
    public final C41111vp A0O;
    public final C41731wy A0P;
    public final C41731wy A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;
    public final C18100vl A0X;
    public final int A0Y;
    public final C18030ve A0Z;

    public static final synchronized void A04(MetaAiVoiceViewModel metaAiVoiceViewModel) {
        synchronized (metaAiVoiceViewModel) {
            Timer timer = metaAiVoiceViewModel.A09;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = new Timer();
            timer2.schedule(new AnonymousClass7T6(metaAiVoiceViewModel), 4000);
            metaAiVoiceViewModel.A09 = timer2;
        }
    }

    public static final synchronized void A05(MetaAiVoiceViewModel metaAiVoiceViewModel) {
        synchronized (metaAiVoiceViewModel) {
            Timer timer = metaAiVoiceViewModel.A0A;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = new Timer();
            timer2.schedule(new AnonymousClass7T7(metaAiVoiceViewModel), (long) metaAiVoiceViewModel.A0Y);
            metaAiVoiceViewModel.A0A = timer2;
        }
    }

    public static final synchronized void A06(MetaAiVoiceViewModel metaAiVoiceViewModel) {
        synchronized (metaAiVoiceViewModel) {
            Timer timer = metaAiVoiceViewModel.A09;
            if (timer != null) {
                timer.cancel();
            }
            metaAiVoiceViewModel.A09 = null;
        }
    }

    public static final synchronized void A07(MetaAiVoiceViewModel metaAiVoiceViewModel) {
        synchronized (metaAiVoiceViewModel) {
            Timer timer = metaAiVoiceViewModel.A0A;
            if (timer != null) {
                timer.cancel();
            }
            metaAiVoiceViewModel.A0A = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [java.lang.Object, X.6uK] */
    public MetaAiVoiceViewModel(AnonymousClass1KB r8, C18030ve r9, C139286ya r10, AnonymousClass4XB r11, C130826k4 r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18) {
        AnonymousClass00H r3 = r16;
        C18070vi.A0w(r13, r14, r15, r8, r3);
        AnonymousClass00H r2 = r17;
        C18070vi.A0x(r2, r12, r9, r10, r11);
        AnonymousClass00H r1 = r18;
        C18070vi.A0d(r1, 11);
        this.A0V = r13;
        this.A0T = r14;
        this.A0W = r15;
        this.A0H = r8;
        this.A0U = r3;
        this.A0R = r2;
        this.A0K = r12;
        this.A0Z = r9;
        this.A0I = r10;
        this.A0J = r11;
        this.A0S = r1;
        Boolean A0h = AnonymousClass000.A0h();
        AnonymousClass1DT A0M2 = AnonymousClass3MW.A0M(A0h);
        this.A0F = A0M2;
        AnonymousClass1DT A0M3 = AnonymousClass3MW.A0M(AnonymousClass1D6.A01((Object) null, A0h));
        this.A0G = A0M3;
        this.A0D = AnonymousClass3MW.A0M(AnonymousClass6RF.CONNECTING);
        this.A0Q = AnonymousClass3MW.A0o();
        this.A0N = AnonymousClass3MW.A0n(A0h);
        this.A0O = AnonymousClass3MW.A0n(Boolean.valueOf(C17880vN.A1W(C108995ce.A0G(r14), "pref_meta_ai_audio_player_muted")));
        this.A0M = AnonymousClass3MW.A0n(Float.valueOf(0.0f));
        this.A0X = AnonymousClass1DF.A01(new C99164sN(this, 10));
        this.A0P = AnonymousClass3MW.A0o();
        this.A0L = new Object();
        this.A00 = new C41731wy("");
        C22801Dg A0R2 = C108945cZ.A0R();
        C91644g1.A01(C108945cZ.A0Q(this.A0X), A0R2, new C99254sW((Object) this, 5), 48);
        C91644g1.A01(A0M3, A0R2, new C99254sW((Object) this, 6), 48);
        this.A0C = A0R2;
        this.A0Y = C18020vd.A00(C18040vf.A02, r9, 11047);
        C22801Dg A0R3 = C108945cZ.A0R();
        C91644g1.A01(C108945cZ.A0Q(this.A0X), A0R3, new C99254sW((Object) this, 7), 48);
        C91644g1.A01(A0M2, A0R3, new C99254sW((Object) this, 3), 48);
        C91644g1.A01(A0M3, A0R3, new C99254sW((Object) this, 4), 48);
        this.A0B = A0R3;
    }

    public static final void A00(MetaAiVoiceViewModel metaAiVoiceViewModel) {
        C22801Dg r1;
        C122526Qs r0;
        String str;
        Boolean bool = (Boolean) metaAiVoiceViewModel.A0F.A06();
        if (bool == null || !bool.booleanValue()) {
            Object A062 = metaAiVoiceViewModel.A0D.A06();
            if (!(A062 == AnonymousClass6RF.CONNECTING || A062 == AnonymousClass6RF.TIMEOUT_GENERIC || A062 == AnonymousClass6RF.TIMEOUT_NO_INTERNET || A062 == AnonymousClass6RF.PROCESSING)) {
                if (C18020vd.A05(C18040vf.A01, AnonymousClass3MW.A0X(metaAiVoiceViewModel.A0S).A00, 10729) || metaAiVoiceViewModel.A07) {
                    AnonymousClass1D6 r02 = (AnonymousClass1D6) metaAiVoiceViewModel.A0G.A06();
                    if (r02 != null) {
                        str = (String) r02.first;
                    } else {
                        str = null;
                    }
                    if (A062 != AnonymousClass6RF.RESPONDING || str == null || str.length() == 0) {
                        r1 = metaAiVoiceViewModel.A0B;
                        r0 = C122526Qs.SHOWN;
                    }
                }
            }
            r1 = metaAiVoiceViewModel.A0B;
            r0 = C122526Qs.TEXT_HIDDEN;
        } else {
            r1 = metaAiVoiceViewModel.A0B;
            r0 = C122526Qs.FULLY_HIDDEN;
        }
        r1.A0F(r0);
    }

    public static final void A03(MetaAiVoiceViewModel metaAiVoiceViewModel) {
        AnonymousClass1D6 r0;
        AnonymousClass1D6 r02;
        String str;
        Object A062 = metaAiVoiceViewModel.A0D.A06();
        AnonymousClass6RF r03 = AnonymousClass6RF.CONNECTING;
        Integer A0f = AnonymousClass3MY.A0f();
        if (!(A062 == r03 || A062 == AnonymousClass6RF.TIMEOUT_GENERIC || A062 == AnonymousClass6RF.TIMEOUT_NO_INTERNET || A062 == AnonymousClass6RF.PROCESSING)) {
            if ((C18020vd.A05(C18040vf.A01, AnonymousClass3MW.A0X(metaAiVoiceViewModel.A0S).A00, 10729) || metaAiVoiceViewModel.A07) && (A062 != AnonymousClass6RF.RESPONDING || ((!metaAiVoiceViewModel.A08 && ((r02 = (AnonymousClass1D6) metaAiVoiceViewModel.A0G.A06()) == null || (str = (String) r02.first) == null || str.length() == 0)) || ((r0 = (AnonymousClass1D6) metaAiVoiceViewModel.A0G.A06()) != null && AnonymousClass000.A1Y(r0.second))))) {
                AnonymousClass3MX.A1J(metaAiVoiceViewModel.A0C, 8);
                return;
            }
        }
        metaAiVoiceViewModel.A0C.A0F(A0f);
    }

    public static final void A08(MetaAiVoiceViewModel metaAiVoiceViewModel, int i, int i2) {
        if (!C72463Mc.A1Y(metaAiVoiceViewModel.A0F.A06())) {
            i = i2;
        }
        C140076zu r2 = (C140076zu) metaAiVoiceViewModel.A0V.get();
        Integer valueOf = Integer.valueOf(i);
        if (C72453Mb.A1a(r2.A08) && valueOf != null) {
            r2.A02 = valueOf;
        }
        metaAiVoiceViewModel.A0P.A0E((Object) null);
    }

    public final void A0U() {
        C93644jJ r3 = (C93644jJ) this.A0U.get();
        boolean A1O = C72463Mc.A1O(this.A0O);
        Log.i("MetaAiRtcVoiceManager/startInteraction");
        r3.A0B = A1O;
        r3.A01 = this;
        AnonymousClass3MX.A1Q(new MetaAiRtcVoiceManager$startInteraction$1(r3, (C30391dr) null), r3.A0W);
        C140076zu r32 = (C140076zu) this.A0V.get();
        String str = "";
        String string = C108995ce.A0G(this.A0T).getString("meta_ai_voice_option_selection_identifier", str);
        if (string != null) {
            str = string;
        }
        if (C72453Mb.A1a(r32.A08)) {
            r32.A04 = str;
        }
    }

    public final void A0W(boolean z) {
        AnonymousClass3MY.A1M(this.A0F, z);
        C140076zu r1 = (C140076zu) this.A0V.get();
        if (C72453Mb.A1a(r1.A08)) {
            r1.A00 = AnonymousClass000.A0i();
        }
    }

    public final void A0T() {
        int i;
        Integer valueOf;
        A0V();
        AnonymousClass00H r2 = this.A0V;
        C140076zu r1 = (C140076zu) r2.get();
        r1.A03((Integer) null);
        r1.A02(AnonymousClass00R.A00);
        A0U();
        this.A0D.A0E(AnonymousClass6RF.CONNECTING);
        Integer num = this.A01;
        if (num != null) {
            int intValue = num.intValue();
            C140076zu r12 = (C140076zu) r2.get();
            switch (intValue) {
                case 18:
                    i = 1;
                    break;
                case 19:
                    i = 2;
                    break;
                case 20:
                    i = 3;
                    break;
                default:
                    valueOf = null;
                    break;
            }
            valueOf = Integer.valueOf(i);
            r12.A01 = valueOf;
        }
    }

    public final void A0V() {
        A07(this);
        Timer timer = this.A06;
        if (timer != null) {
            timer.cancel();
        }
        this.A06 = null;
        Timer timer2 = this.A05;
        if (timer2 != null) {
            timer2.cancel();
        }
        this.A05 = null;
        ((C93644jJ) this.A0U.get()).A01();
        this.A0I.A01();
        this.A0D.A0F(AnonymousClass6RF.CONNECTING);
    }
}
