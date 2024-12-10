package X;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.DGs  reason: case insensitive filesystem */
public class C26861DGs implements C28594E9k {
    public int A00;
    public final AudioTrack A01;
    public final C25537Cha A02;
    public final AtomicLong A03 = new AtomicLong(0);

    public C26861DGs BY2() {
        return this;
    }

    public boolean CNN() {
        return true;
    }

    public void CRz() {
    }

    public void flush() {
        AudioTrack audioTrack = this.A01;
        if (audioTrack.getState() == 1) {
            audioTrack.stop();
            audioTrack.flush();
            this.A03.set(0);
        }
    }

    public void release() {
        this.A01.release();
    }

    public C26861DGs(int i) {
        AudioTrack audioTrack;
        this.A00 = AudioTrack.getMinBufferSize(44100, 12, 2) * i;
        if (C26171Ctn.A00 >= 29) {
            audioTrack = A00();
        } else {
            audioTrack = new AudioTrack(new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1).build(), BEB.A0I(44100, 12, 2), this.A00, 1, 0);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            this.A01 = audioTrack;
            this.A02 = new C25537Cha(audioTrack);
            return;
        }
        audioTrack.release();
        throw AnonymousClass8BX.A0W("build audio track failed. State: ", AnonymousClass000.A10(), state);
    }

    private AudioTrack A00() {
        return new AudioTrack.Builder().setAudioFormat(BEB.A0I(44100, 12, 2)).setTransferMode(1).setBufferSizeInBytes(this.A00).build();
    }

    public void CCf(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            this.A03.compareAndSet(0, System.nanoTime());
            AudioTrack audioTrack = this.A01;
            if (audioTrack.getPlayState() != 3) {
                try {
                    audioTrack.play();
                } catch (IllegalStateException e) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    AnonymousClass8BS.A1I(A10, e);
                    A10.append(" PlayerState: ");
                    A10.append(audioTrack.getPlayState());
                    A10.append(" AudioTrack state:");
                    throw new IllegalStateException(C17880vN.A0t(A10, audioTrack.getState()), e);
                }
            }
            audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
    }
}
