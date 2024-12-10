package X;

import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;

/* renamed from: X.CCc  reason: case insensitive filesystem */
public abstract class C24616CCc {
    public static final AudioRecord A00(MediaProjection mediaProjection, int i, int i2) {
        AudioPlaybackCaptureConfiguration.Builder builder = new AudioPlaybackCaptureConfiguration.Builder(mediaProjection);
        builder.addMatchingUsage(14);
        builder.addMatchingUsage(1);
        builder.addMatchingUsage(0);
        AudioPlaybackCaptureConfiguration build = builder.build();
        C18070vi.A0X(build);
        AudioRecord build2 = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(16).build()).setAudioPlaybackCaptureConfig(build).setBufferSizeInBytes(i2).build();
        C18070vi.A0X(build2);
        return build2;
    }
}
