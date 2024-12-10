package X;

import com.whatsapp.audioRecording.AudioRecordFactory;
import com.whatsapp.audioRecording.NoiseMetricsCallback;
import com.whatsapp.audioRecording.OpusRecorderFactory;

/* renamed from: X.6o2  reason: invalid class name and case insensitive filesystem */
public final class C133016o2 {
    public final C18030ve A00;
    public final AnonymousClass190 A01;
    public final C218617r A02;
    public final AnonymousClass1KB A03;
    public final AudioRecordFactory A04;
    public final OpusRecorderFactory A05;
    public final AnonymousClass11P A06;

    public AnonymousClass72K A00(NoiseMetricsCallback noiseMetricsCallback, AnonymousClass89T r15, boolean z) {
        boolean z2;
        boolean z3;
        AnonymousClass89T r9 = r15;
        C18070vi.A0d(r15, 1);
        if (z) {
            C18030ve r2 = this.A00;
            C18040vf r1 = C18040vf.A02;
            z2 = C18020vd.A05(r1, r2, 10005);
            z3 = C18020vd.A05(r1, r2, 10004);
        } else {
            z2 = false;
            z3 = false;
        }
        AnonymousClass11P r7 = this.A06;
        C18030ve r8 = this.A00;
        AnonymousClass1KB r3 = this.A03;
        AudioRecordFactory audioRecordFactory = this.A04;
        OpusRecorderFactory opusRecorderFactory = this.A05;
        return new AnonymousClass72K(this.A01, this.A02, r3, audioRecordFactory, noiseMetricsCallback, opusRecorderFactory, r7, r8, r9, r8.A0E(10020), z2, z3);
    }

    public C133016o2(AnonymousClass190 r1, C218617r r2, AnonymousClass1KB r3, AudioRecordFactory audioRecordFactory, OpusRecorderFactory opusRecorderFactory, AnonymousClass11P r6, C18030ve r7) {
        C18070vi.A0w(r7, audioRecordFactory, opusRecorderFactory, r2, r6);
        C18070vi.A0l(r3, r1);
        this.A00 = r7;
        this.A04 = audioRecordFactory;
        this.A05 = opusRecorderFactory;
        this.A02 = r2;
        this.A06 = r6;
        this.A03 = r3;
        this.A01 = r1;
    }
}
