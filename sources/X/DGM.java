package X;

import java.util.List;

public class DGM implements C28612EAg {
    public final C26381Cyh A00;
    public volatile C28612EAg A01;

    public void Bt3(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.A01.Bt3(str, str2, str3, str4, str5, str6);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed to send onError(errorCode = %s) callback", e, AnonymousClass8BV.A1b(str2));
        }
    }

    public void C0C(D49 d49, String str, String str2, String str3, long j, boolean z) {
        try {
            this.A01.C0C(d49, str, str2, str3, j, z);
        } catch (IllegalStateException e) {
            C26381Cyh cyh = this.A00;
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1N(A1a, d49.A0R);
            C25905CoJ.A01(cyh, "Failed to send onPaused(isPlaying = %s) callback", e, A1a);
        }
    }

    public void C6S(D49 d49, String str, String str2, String str3, String str4, long j) {
        try {
            this.A01.C6S(d49, str, str2, str3, str4, j);
        } catch (IllegalStateException e) {
            C26381Cyh cyh = this.A00;
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass8BR.A1L(A1a, 0, d49.A0R);
            C25905CoJ.A01(cyh, "Failed to send onStartedPlaying(isPlaying = %s) callback", e, A1a);
        }
    }

    public void Bmr(D49 d49, D40 d40, boolean z) {
        try {
            this.A01.Bmr(d49, d40, z);
        } catch (IllegalStateException e) {
            C26381Cyh cyh = this.A00;
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1N(A1a, d49.A0R);
            C25905CoJ.A01(cyh, "Failed to send onBufferingStarted(isPlaying = %s) callback", e, A1a);
        }
    }

    public void Bms(D49 d49, boolean z) {
        try {
            this.A01.Bms(d49, z);
        } catch (IllegalStateException e) {
            C26381Cyh cyh = this.A00;
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1N(A1a, d49.A0R);
            C25905CoJ.A01(cyh, "Failed to send onBufferingStopped(isPlaying = %s) callback", e, A1a);
        }
    }

    public void Bnr(D49 d49, String str, String str2, String str3, String str4, long j, boolean z) {
        try {
            this.A01.Bnr(d49, str, str2, str3, str4, j, z);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed send onCancelled() callback", e, BE6.A1Z());
        }
    }

    public void BpR(D49 d49, String str, boolean z) {
        try {
            this.A01.BpR(d49, str, z);
        } catch (IllegalStateException e) {
            C26381Cyh cyh = this.A00;
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1N(A1a, d49.A0R);
            C25905CoJ.A01(cyh, "Failed to send onCompletion(isPlaying = %s) callback", e, A1a);
        }
    }

    public void Bqd(List list) {
        try {
            this.A01.Bqd(list);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed send onCues(list = %s) callback", e, AnonymousClass8BV.A1b(list));
        }
    }

    public void Br2(String str, boolean z, long j) {
        try {
            this.A01.Br2(str, z, j);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed to send decoder initialized callback", e, BE6.A1Z());
        }
    }

    public void BsN() {
        try {
            this.A01.BsN();
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed to send onDrawnToSurface callback", e, BE6.A1Z());
        }
    }

    public void Bsa(String str, String str2) {
        try {
            this.A01.Bsa(str, str2);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed send onEncodedFrameDataReceived() callback", e, BE6.A1Z());
        }
    }

    public void BtM(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        try {
            this.A01.BtM(str, str2, str3, str4, str5, str6, str7);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed send onErrorRecoveryAttempt() callback", e, BE6.A1Z());
        }
    }

    public void Bwm(boolean z) {
        try {
            this.A01.Bwm(z);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed to send onLiveInterrupt callback", e, BE6.A1Z());
        }
    }

    public void Bwn(D40 d40) {
        try {
            this.A01.Bwn(d40);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed to send live state update", e, BE6.A1Z());
        }
    }

    public void Bz4(byte[] bArr) {
        try {
            this.A01.Bz4(bArr);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed to send onNewPCMBuffer callback", e, BE6.A1Z());
        }
    }

    public void C0j() {
        try {
            this.A01.C0j();
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed to send onPlaybackAboutToFinish callback", e, BE6.A1Z());
        }
    }

    public void C0m(float f) {
        try {
            this.A01.C0m(f);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed to send onLiveTraceFrameEvent callback", e, BE6.A1Z());
        }
    }

    public void C0s(D49 d49) {
        try {
            this.A01.C0s(d49);
        } catch (IllegalStateException e) {
            C26381Cyh cyh = this.A00;
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1N(A1a, d49.A0R);
            C25905CoJ.A01(cyh, "Failed to send onPlayerStateUpdate(isPlaying = %s) callback", e, A1a);
        }
    }

    public void C1b(D49 d49, String str) {
        try {
            this.A01.C1b(d49, str);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed to send onPrepared callback", e, BE6.A1Z());
        }
    }

    public void C2w(boolean z) {
        try {
            this.A01.C2w(z);
        } catch (IllegalStateException e) {
            C26381Cyh cyh = this.A00;
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass8BR.A1L(A1a, 0, z);
            C25905CoJ.A01(cyh, "Failed to send onRelease(isEvicted = %s) callback", e, A1a);
        }
    }

    public void C4t(D49 d49, long j) {
        try {
            this.A01.C4t(d49, j);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed to send onSeeking callback", e, BE6.A1Z());
        }
    }

    public void C5I(long j) {
        try {
            this.A01.C5I(j);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed send onServicePlayerListenerDetached() callback", e, BE6.A1Z());
        }
    }

    public void C78() {
        this.A01.C78();
    }

    public void C8i(List list) {
        try {
            this.A01.C8i(list);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed to send gaps changed callback", e, BE6.A1Z());
        }
    }

    public void CA2(float f, int i, int i2, int i3) {
        try {
            this.A01.CA2(f, i, i2, i3);
        } catch (IllegalStateException e) {
            C26381Cyh cyh = this.A00;
            Object[] A1b = AnonymousClass3MW.A1b();
            BEA.A1U(A1b, i, i2);
            C25905CoJ.A01(cyh, "Failed to send onVideoSizeChanged(width = %d, height = %d) callback", e, A1b);
        }
    }

    public void CAR(String str, String str2, String str3) {
        try {
            this.A01.CAR(str, str2, str3);
        } catch (IllegalStateException e) {
            C25905CoJ.A01(this.A00, "Failed to send onWarn callback", e, BE6.A1Z());
        }
    }

    public DGM(C28612EAg eAg, C26381Cyh cyh) {
        if (eAg != null) {
            this.A00 = cyh;
            this.A01 = eAg;
            return;
        }
        throw AnonymousClass000.A0k("HeroServicePlayerListener cannot be null");
    }
}
