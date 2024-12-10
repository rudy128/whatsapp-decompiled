package X;

import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: X.Civ  reason: case insensitive filesystem */
public final class C25615Civ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final D48 A07;
    public final C28627EBa[] A08;

    public static AudioTrack A00(C25720Ckq ckq, C25615Civ civ, int i) {
        AudioFormat A0I = BEB.A0I(civ.A06, civ.A02, civ.A03);
        C24757CIu cIu = ckq.A00;
        if (cIu == null) {
            cIu = new C24757CIu(ckq);
            ckq.A00 = cIu;
        }
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(cIu.A00).setAudioFormat(A0I);
        boolean z = true;
        AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(civ.A00).setSessionId(i);
        if (civ.A04 != 1) {
            z = false;
        }
        return sessionId.setOffloadedPlayback(z).build();
    }

    public C25615Civ(D48 d48, C28627EBa[] eBaArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A07 = d48;
        this.A01 = i;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A02 = i5;
        this.A03 = i6;
        this.A00 = i7;
        this.A08 = eBaArr;
    }
}
