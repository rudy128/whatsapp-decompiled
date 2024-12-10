package com.whatsapp.calling.audio;

import X.A1P;
import X.AnonymousClass000;
import X.AnonymousClass1DC;
import X.AnonymousClass7DO;
import X.C123796Vw;
import X.C129596i3;
import X.C17900vP;
import X.C17960vV;
import X.C18070vi;
import X.C72473Md;
import android.media.AudioRecord;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

public final class ScreenShareAudioCapturer implements VoipSystemAudioDeviceFactory {
    public static final C123796Vw Companion = new Object();
    @Deprecated
    public static final int STATE_DISABLED = 0;
    @Deprecated
    public static final int STATE_ENABLED = 1;
    @Deprecated
    public static final int STATE_NOT_SET = -1;
    public C129596i3 audioRecorder;
    public final int audioSampleRate;
    public final AnonymousClass7DO mediaProjectionListener;
    public AtomicInteger mediaProjectionState = new AtomicInteger(-1);
    public final A1P screenShareLoggingHelper;
    public final ScreenShareResourceManager screenShareResourceManager;
    public final AnonymousClass1DC systeamFeatures;

    public int read(short[] sArr, int i, int i2) {
        A1P a1p;
        int i3;
        C18070vi.A0d(sArr, 0);
        if (this.mediaProjectionState.get() != 1) {
            stopCapture();
            Log.e("ScreenShareAudioCapturer mediaprojection state not enabled");
            A1P a1p2 = this.screenShareLoggingHelper;
            a1p2.A01 |= 1;
            a1p2.A03 = 1;
        } else {
            try {
                C129596i3 r3 = this.audioRecorder;
                if (r3 != null) {
                    AudioRecord audioRecord = r3.A00;
                    if (audioRecord == null) {
                        C17960vV.A0F(false, "captureAudio() audio record not initialized");
                        a1p = r3.A03;
                        i3 = 32;
                    } else {
                        int read = audioRecord.read(sArr, i, i2);
                        if (read >= 0) {
                            return read;
                        }
                        C17900vP.A0i("captureAudio() No audio frame data available with read error:", AnonymousClass000.A10(), read);
                        a1p = r3.A03;
                        i3 = 64;
                    }
                    a1p.A01 |= i3;
                    a1p.A03 = i3;
                    return -1;
                }
            } catch (IllegalStateException e) {
                Log.e("ScreenShareAudioCapturer read in invalid state exception", e);
                A1P a1p3 = this.screenShareLoggingHelper;
                a1p3.A01 |= 8;
                a1p3.A03 = 8;
                return -1;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b A[Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b A[Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean startCapture() {
        /*
            r8 = this;
            int r0 = r8.audioSampleRate
            r4 = 0
            if (r0 != 0) goto L_0x001a
            r8.stopCapture()
            X.A1P r2 = r8.screenShareLoggingHelper
            r1 = 32
            int r0 = r2.A01
            r0 = r0 | 32
            r2.A01 = r0
            r2.A03 = r1
            java.lang.String r0 = "audioSampleRate must be set to enable ScreenShareAudioCapturer"
            X.C17960vV.A0F(r4, r0)
            return r4
        L_0x001a:
            com.whatsapp.calling.screenshare.ScreenShareResourceManager r0 = r8.screenShareResourceManager     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            android.media.projection.MediaProjection r7 = r0.getMediaProjectionHandle()     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            if (r7 == 0) goto L_0x00b5
            java.util.concurrent.atomic.AtomicInteger r1 = r8.mediaProjectionState     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            r0 = -1
            r3 = 1
            r1.compareAndSet(r0, r3)     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            X.1DC r6 = r8.systeamFeatures     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            int r2 = r8.audioSampleRate     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            X.A1P r0 = r8.screenShareLoggingHelper     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            r1 = 16
            X.6i3 r5 = new X.6i3     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            r5.<init>(r7, r0, r6, r2)     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            r8.audioRecorder = r5     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            android.media.AudioRecord r0 = r5.A00     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "initAudioRecord() audio record already initialized"
        L_0x003e:
            X.C17960vV.A0F(r4, r0)     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
        L_0x0041:
            android.media.AudioRecord r0 = r5.A00     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            if (r0 == 0) goto L_0x005b
            int r0 = r0.getState()     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "AudioRecorder Failed to create AudioRecord"
        L_0x004d:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            X.A1P r1 = r5.A03     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            int r0 = r1.A01     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            r0 = r0 | 1
            r1.A01 = r0     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            r1.A03 = r3     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            goto L_0x00b5
        L_0x005b:
            android.media.AudioRecord r0 = r5.A00     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            if (r0 == 0) goto L_0x0062
            r0.startRecording()     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
        L_0x0062:
            android.media.AudioRecord r0 = r5.A00     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            if (r0 == 0) goto L_0x0073
            int r1 = r0.getRecordingState()     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            r0 = 3
            if (r1 != r0) goto L_0x0073
            java.lang.String r0 = "ScreenShareAudioCapturer startCapture started successfully"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            goto L_0x0092
        L_0x0073:
            java.lang.String r0 = "AudioRecorder Failed to start recording"
            goto L_0x004d
        L_0x0076:
            int r2 = r5.A01     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            if (r2 != 0) goto L_0x007d
            java.lang.String r0 = "initAudioRecord() audio sample rate is zero"
            goto L_0x003e
        L_0x007d:
            r0 = 2
            int r0 = android.media.AudioRecord.getMinBufferSize(r2, r1, r0)     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            int r1 = r0 * 2
            if (r1 > 0) goto L_0x0089
            java.lang.String r0 = "initAudioRecord() minBufferSize invalid"
            goto L_0x003e
        L_0x0089:
            android.media.projection.MediaProjection r0 = r5.A02     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            android.media.AudioRecord r0 = X.C24616CCc.A00(r0, r2, r1)     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            r5.A00 = r0     // Catch:{ IllegalStateException -> 0x0093, IllegalArgumentException -> 0x00a3 }
            goto L_0x0041
        L_0x0092:
            return r3
        L_0x0093:
            r3 = move-exception
            X.A1P r2 = r8.screenShareLoggingHelper
            r1 = 8
            int r0 = r2.A01
            r0 = r0 | 8
            r2.A01 = r0
            r2.A03 = r1
            java.lang.String r0 = "ScreenShareAudioCapturer exception during startCapture"
            goto L_0x00b1
        L_0x00a3:
            r3 = move-exception
            X.A1P r2 = r8.screenShareLoggingHelper
            r1 = 256(0x100, float:3.59E-43)
            int r0 = r2.A01
            r0 = r0 | r1
            r2.A01 = r0
            r2.A03 = r1
            java.lang.String r0 = "ScreenShareAudioCapturer illegal argument for AudioRecord"
        L_0x00b1:
            com.whatsapp.util.Log.e(r0, r3)
            goto L_0x00ba
        L_0x00b5:
            java.lang.String r0 = "ScreenShareAudioCapturer Unable to startCapture"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00ba:
            r8.stopCapture()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.audio.ScreenShareAudioCapturer.startCapture():boolean");
    }

    public boolean stopCapture() {
        try {
            C129596i3 r1 = this.audioRecorder;
            if (r1 != null) {
                AudioRecord audioRecord = r1.A00;
                if (audioRecord != null) {
                    audioRecord.stop();
                }
                AudioRecord audioRecord2 = r1.A00;
                if (audioRecord2 != null) {
                    audioRecord2.release();
                }
                r1.A00 = null;
            }
        } catch (IllegalStateException e) {
            Log.e("ScreenShareAudioCapturer exception during stopCapture", e);
        }
        this.audioRecorder = null;
        this.screenShareResourceManager.unregisterListener(this.mediaProjectionListener);
        this.mediaProjectionState.set(-1);
        return true;
    }

    public ScreenShareAudioCapturer(AnonymousClass1DC r3, int i, A1P a1p, ScreenShareResourceManager screenShareResourceManager2) {
        C72473Md.A1I(r3, a1p);
        C18070vi.A0d(screenShareResourceManager2, 4);
        this.systeamFeatures = r3;
        this.audioSampleRate = i;
        this.screenShareLoggingHelper = a1p;
        this.screenShareResourceManager = screenShareResourceManager2;
        AnonymousClass7DO r0 = new AnonymousClass7DO(this);
        this.mediaProjectionListener = r0;
        screenShareResourceManager2.registerListener(r0);
    }
}
