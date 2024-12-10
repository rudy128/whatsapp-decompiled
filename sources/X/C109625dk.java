package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.conversation.waveforms.VoiceVisualizer;

/* renamed from: X.5dk  reason: invalid class name and case insensitive filesystem */
public class C109625dk extends Handler {
    public long A00;
    public final long A01;
    public final C122956So A02;
    public final C33251iW A03;
    public final AnonymousClass7OH A04;
    public final AnonymousClass88W A05;
    public final AnonymousClass88W A06;
    public final AnonymousClass88W A07;
    public final AnonymousClass88W A08;
    public final C126716dB A09;
    public final C1603288a A0A;
    public final C1603288a A0B;
    public final AnonymousClass11P A0C;

    public void handleMessage(Message message) {
        AnonymousClass1BI r2;
        AnonymousClass72K r0;
        AnonymousClass74M r9 = this.A09.A00;
        if (r9.A0J != null) {
            long elapsedRealtime = (SystemClock.elapsedRealtime() - r9.A06) + r9.A05;
            this.A0B.BE2(Integer.valueOf((int) C17880vN.A04(elapsedRealtime)));
            if (r9.A02 % 2 == 0) {
                C122956So r02 = this.A02;
                double longBitsToDouble = Double.longBitsToDouble(r02.A00.getAndSet(Double.doubleToRawLongBits(Double.MIN_VALUE)));
                if (longBitsToDouble == -1.0d) {
                    this.A06.BE1();
                } else if (longBitsToDouble != Double.MIN_VALUE) {
                    float f = (float) longBitsToDouble;
                    VoiceVisualizer voiceVisualizer = this.A04.A0H;
                    C17960vV.A0C(voiceVisualizer.A0E.isEmpty());
                    Boolean bool = C17970vW.A03;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j = voiceVisualizer.A03;
                    if (j != 0) {
                        voiceVisualizer.A04 = Math.max(elapsedRealtime2 - j, 0);
                    }
                    voiceVisualizer.A03 = elapsedRealtime2;
                    voiceVisualizer.A0C.add(Float.valueOf(f));
                    if (!voiceVisualizer.A06) {
                        voiceVisualizer.A06 = true;
                        voiceVisualizer.invalidate();
                    }
                }
            }
            this.A05.BE1();
            sendEmptyMessageDelayed(0, 50);
            Boolean bool2 = C17970vW.A03;
            if (r9.A0D == null && !C22971Dz.A0V(r9.A0C) && elapsedRealtime > 1000 && (r0 = r9.A0J) != null && r0.A03().length() > 0) {
                this.A08.BE1();
                this.A0A.BE2(r9.A0J.A03());
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.A00 + 1250 < currentTimeMillis && (r2 = r9.A0C) != null) {
                this.A00 = currentTimeMillis;
                this.A03.A0Q(r2, 1);
                AnonymousClass72K r03 = r9.A0J;
                if (r03 != null && r03.A03().length() > this.A01) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("voicenote/filelimit ");
                    C17890vO.A16(A10, r9.A0J.A03().length());
                    this.A07.BE1();
                }
            }
        }
    }

    public C109625dk(C122956So r2, C33251iW r3, AnonymousClass11P r4, AnonymousClass7OH r5, AnonymousClass88W r6, AnonymousClass88W r7, AnonymousClass88W r8, AnonymousClass88W r9, C126716dB r10, C1603288a r11, C1603288a r12, long j) {
        super(Looper.getMainLooper());
        this.A0C = r4;
        this.A03 = r3;
        this.A09 = r10;
        this.A04 = r5;
        this.A02 = r2;
        this.A0A = r11;
        this.A0B = r12;
        this.A07 = r6;
        this.A08 = r7;
        this.A06 = r8;
        this.A05 = r9;
        this.A01 = j;
    }
}
