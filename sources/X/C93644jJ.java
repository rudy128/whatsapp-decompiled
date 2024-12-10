package X;

import com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;

/* renamed from: X.4jJ  reason: invalid class name and case insensitive filesystem */
public final class C93644jJ implements C72203La {
    public static final Charset A0Y = C26571Sq.A05;
    public A99 A00;
    public MetaAiVoiceViewModel A01;
    public Runnable A02;
    public String A03;
    public String A04;
    public AnonymousClass1OB A05;
    public AnonymousClass1OB A06;
    public AnonymousClass1OB A07;
    public AnonymousClass1OB A08;
    public AnonymousClass1OB A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final C18100vl A0Q;
    public final C18100vl A0R;
    public final C18100vl A0S;
    public final C18100vl A0T;
    public final C18100vl A0U = C99164sN.A01(this, 5);
    public final C18100vl A0V;
    public final AnonymousClass1OX A0W;
    public final AnonymousClass00H A0X;

    public void C5F(A99 a99) {
        C18070vi.A0d(a99, 0);
        this.A00 = a99;
        if (this.A0C) {
            this.A0C = false;
            a99.A19(this.A0B);
            a99.A0z(Boolean.valueOf(this.A0A));
        }
    }

    public void C5G() {
        this.A00 = null;
    }

    public static final void A00(C93644jJ r2) {
        AnonymousClass6RF r0;
        MetaAiVoiceViewModel metaAiVoiceViewModel = r2.A01;
        if (metaAiVoiceViewModel != null) {
            boolean z = true;
            if (((AnonymousClass11E) r2.A0I.get()).A03(true) == 0) {
                z = false;
            }
            AnonymousClass1DT r1 = metaAiVoiceViewModel.A0D;
            if (z) {
                r0 = AnonymousClass6RF.TIMEOUT_GENERIC;
            } else {
                r0 = AnonymousClass6RF.TIMEOUT_NO_INTERNET;
            }
            r1.A0E(r0);
        }
    }

    public void A01() {
        Log.i("MetaAiRtcVoiceManager/stopInteraction");
        C138466x8.A00((C138466x8) this.A0N.get());
        this.A01 = null;
        Log.i("MetaAiRtcVoiceManager/releaseResources");
        if (this.A00 != null) {
            ((AnonymousClass1V7) this.A0O.get()).A02(this);
            this.A00 = null;
        }
        ((AnonymousClass1HQ) this.A0X.get()).BjM();
        AnonymousClass1OB r0 = this.A08;
        if (r0 != null) {
            r0.BEM((CancellationException) null);
        }
        AnonymousClass1OB r02 = this.A06;
        if (r02 != null) {
            r02.BEM((CancellationException) null);
        }
        AnonymousClass1OB r03 = this.A07;
        if (r03 != null) {
            r03.BEM((CancellationException) null);
        }
        AnonymousClass1OB r04 = this.A05;
        if (r04 != null) {
            r04.BEM((CancellationException) null);
        }
        AnonymousClass1OB r05 = this.A09;
        if (r05 != null) {
            r05.BEM((CancellationException) null);
        }
        Runnable runnable = this.A02;
        if (runnable != null) {
            AnonymousClass3MX.A0x(this.A0P).CEz(runnable);
        }
    }

    public C93644jJ(AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17, C18600wl r18) {
        C18070vi.A0w(r4, r5, r6, r7, r8);
        C18070vi.A0x(r9, r10, r11, r12, r13);
        AnonymousClass00H r2 = r16;
        AnonymousClass00H r1 = r17;
        C18600wl r0 = r18;
        C18070vi.A0y(r14, r15, r2, r1, r0);
        this.A0J = r4;
        this.A0L = r5;
        this.A0P = r6;
        this.A0X = r7;
        this.A0H = r8;
        this.A0F = r9;
        this.A0E = r10;
        this.A0G = r11;
        this.A0O = r12;
        this.A0K = r13;
        this.A0I = r14;
        this.A0N = r15;
        this.A0D = r2;
        this.A0M = r1;
        this.A0W = AnonymousClass1OW.A02(r0);
        AnonymousClass4D6 r19 = AnonymousClass4D6.NONE;
        Integer num = AnonymousClass00R.A01;
        this.A0R = AnonymousClass1DF.A00(num, new AnonymousClass5HU(r19));
        this.A0S = AnonymousClass1DF.A00(num, new AnonymousClass5HU(new AnonymousClass4YD(false, false)));
        this.A0V = C99164sN.A01(this, 6);
        this.A0Q = AnonymousClass1DF.A00(num, new AnonymousClass5HU(new AnonymousClass4Y2(0.0f)));
        this.A0T = C99164sN.A01(this, 7);
    }
}
