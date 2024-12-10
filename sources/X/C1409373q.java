package X;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.73q  reason: invalid class name and case insensitive filesystem */
public final class C1409373q {
    public AudioManager.OnAudioFocusChangeListener A00;
    public Handler A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public AudioFocusRequest A05;
    public Object A06;
    public final AnonymousClass11C A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final Runnable A0A = AnonymousClass7RI.A00(this, 3);

    public static final void A03(C1409373q r7, boolean z) {
        int i;
        C1409373q r4 = r7;
        AudioManager A0D = r7.A07.A0D();
        if (A0D != null) {
            int streamVolume = A0D.getStreamVolume(3);
            int streamMaxVolume = A0D.getStreamMaxVolume(3);
            if (z) {
                if (streamVolume < streamMaxVolume) {
                    A0D.adjustSuggestedStreamVolume(1, 3, 16);
                    i = streamVolume + 1;
                }
                i = streamVolume;
            } else {
                if (streamVolume > 0) {
                    A0D.adjustSuggestedStreamVolume(-1, 3, 16);
                    i = streamVolume - 1;
                }
                i = streamVolume;
            }
            if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(r4.A08), 12053)) {
                Handler handler = r4.A01;
                if (handler != null) {
                    handler.post(new C21461AkS(r4, streamVolume, i, streamMaxVolume, 4));
                    return;
                }
                return;
            }
            List<AnonymousClass89N> list = r4.A02;
            if (list != null) {
                for (AnonymousClass89N Blq : list) {
                    Blq.Blq(i, streamMaxVolume);
                }
            }
        }
    }

    private final AudioFocusRequest A00() {
        AudioFocusRequest audioFocusRequest = this.A05;
        if (audioFocusRequest != null) {
            return audioFocusRequest;
        }
        AudioFocusRequest build = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build()).build();
        this.A05 = build;
        return build;
    }

    public static final void A01(AudioManager audioManager, C1409373q r4) {
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest A002 = r4.A00();
            if (A002 != null) {
                audioManager.requestAudioFocus(A002);
                return;
            }
            return;
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = r4.A00;
        if (onAudioFocusChangeListener == null) {
            onAudioFocusChangeListener = new AnonymousClass75N(1);
            r4.A00 = onAudioFocusChangeListener;
        }
        audioManager.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
    }

    public static final void A02(C1409373q r3) {
        if (r3.A06 != null) {
            Log.i("StatusPlaybackAudioManager/audio-focus-abandoned");
            r3.A06 = null;
            AudioManager A0D = r3.A07.A0D();
            if (A0D == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest A002 = r3.A00();
                if (A002 != null) {
                    A0D.abandonAudioFocusRequest(A002);
                    return;
                }
                return;
            }
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = r3.A00;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new AnonymousClass75N(1);
                r3.A00 = onAudioFocusChangeListener;
            }
            A0D.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    public static final void A04(C1409373q r4, boolean z) {
        boolean z2;
        List<AnonymousClass89N> list = r4.A02;
        if (list != null) {
            for (AnonymousClass89N r2 : list) {
                if (!z) {
                    z2 = false;
                    if (!r4.A03) {
                        r2.Blo(z2);
                    }
                }
                z2 = true;
                r2.Blo(z2);
            }
        }
    }

    public final void A06(Object obj) {
        Handler handler;
        Log.i("AudioManager/on-abandon-audio-focus");
        if (this.A06 == obj && (handler = this.A01) != null) {
            Runnable runnable = this.A0A;
            handler.removeCallbacks(runnable);
            Handler handler2 = this.A01;
            if (handler2 != null) {
                handler2.postDelayed(runnable, 1000);
            }
        }
    }

    public final void A07(Object obj) {
        Log.i("StatusPlaybackAudioManager/on-request-audio-focus");
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeCallbacks(this.A0A);
        }
        if (this.A06 == null) {
            Log.i("StatusPlaybackAudioManager/request-audio-focus");
            AudioManager A0D = this.A07.A0D();
            if (A0D != null) {
                if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(this.A08), 12053)) {
                    ((C200710s) this.A09.get()).execute(new AnonymousClass7RQ(this, A0D, 9));
                } else {
                    A01(A0D, this);
                }
            }
        }
        this.A06 = obj;
    }

    public C1409373q(AnonymousClass11C r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0j(r2, r3);
        C18070vi.A0d(r4, 3);
        this.A07 = r2;
        this.A09 = r3;
        this.A08 = r4;
    }

    public final void A05() {
        boolean z;
        AudioManager A0D;
        this.A01 = C17890vO.A0D();
        AnonymousClass11C r2 = this.A07;
        AudioManager A0D2 = r2.A0D();
        if (A0D2 != null) {
            try {
                if (A0D2.getRingerMode() != 2 && ((A0D = r2.A0D()) == null || !A0D.isMusicActive())) {
                    z = true;
                    this.A04 = z;
                }
            } catch (RuntimeException unused) {
                return;
            }
        }
        z = false;
        this.A04 = z;
    }
}
