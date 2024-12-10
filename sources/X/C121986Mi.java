package X;

import android.content.Context;
import android.graphics.Matrix;
import android.media.MediaPlayer;
import android.view.Surface;
import android.widget.MediaController;

/* renamed from: X.6Mi  reason: invalid class name and case insensitive filesystem */
public class C121986Mi extends C109845e6 implements MediaController.MediaPlayerControl {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public MediaPlayer.OnCompletionListener A06;
    public MediaPlayer.OnErrorListener A07;
    public MediaPlayer.OnPreparedListener A08;
    public MediaPlayer A09;
    public Surface A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Matrix A0I;
    public final /* synthetic */ C122056Mp A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121986Mi(Context context, C122056Mp r4) {
        super(context);
        this.A0J = r4;
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A02 = -1;
        this.A01 = 0;
        this.A0I = C108945cZ.A0J();
        this.A00 = 0;
        this.A03 = 0;
        A00();
    }

    public void A00() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.A09 = mediaPlayer;
        mediaPlayer.setOnVideoSizeChangedListener(new AnonymousClass75W(this, 1));
        this.A09.setOnErrorListener(new AnonymousClass75S(this, 3));
        this.A09.setOnPreparedListener(new AnonymousClass75U(this, 4));
        this.A09.setOnCompletionListener(new AnonymousClass75Q(this, 6));
        setSurfaceTextureListener(new C1420277w(this, 2));
    }

    public boolean A01() {
        int i;
        if (this.A09 == null || (i = this.A00) == -1 || i == 0 || i == 1) {
            return false;
        }
        return true;
    }

    public int getAudioSessionId() {
        C17960vV.A0F(false, "Not implemented");
        return 0;
    }

    public int getBufferPercentage() {
        C17960vV.A0F(false, "Not implemented");
        return 0;
    }

    public void setLooping(boolean z) {
        this.A0F = z;
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    public void setMute(boolean z) {
        this.A0G = z;
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null) {
            float A002 = C108975cc.A00(z ? 1 : 0);
            mediaPlayer.setVolume(A002, A002);
        }
    }

    public void setScaleType(int i) {
        int i2 = this.A01;
        this.A01 = i;
        if (i2 != i) {
            requestLayout();
        }
    }

    public boolean canPause() {
        return this.A0C;
    }

    public boolean canSeekBackward() {
        return this.A0D;
    }

    public boolean canSeekForward() {
        return this.A0E;
    }

    public int getCurrentPosition() {
        if (!A01()) {
            return 0;
        }
        MediaPlayer mediaPlayer = this.A09;
        C17960vV.A07(mediaPlayer);
        return mediaPlayer.getCurrentPosition();
    }

    public int getDuration() {
        if (!A01()) {
            return -1;
        }
        MediaPlayer mediaPlayer = this.A09;
        C17960vV.A07(mediaPlayer);
        return mediaPlayer.getDuration();
    }

    public boolean isPlaying() {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            C17960vV.A07(mediaPlayer);
            if (!mediaPlayer.isPlaying()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null && this.A00 == 4) {
            mediaPlayer.start();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null && this.A00 == 3) {
            mediaPlayer.pause();
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null && this.A00 == 4) {
            mediaPlayer.start();
        }
    }

    public void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        if (this.A05 != 0 && this.A04 != 0) {
            int i3 = this.A01;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (i3 != 1) {
                int i4 = this.A05;
                int i5 = i4 * measuredHeight;
                int i6 = this.A04;
                int i7 = i6 * measuredWidth;
                if (i5 > i7) {
                    measuredHeight = i7 / i4;
                } else {
                    measuredWidth = i5 / i6;
                }
                setMeasuredDimension(measuredWidth, measuredHeight);
                return;
            }
            Matrix matrix = this.A0I;
            matrix.reset();
            int i8 = this.A05;
            int i9 = i8 * measuredHeight;
            int i10 = this.A04;
            int i11 = i10 * measuredWidth;
            float f2 = 1.0f;
            if (i9 > i11) {
                f2 = (((float) i8) * ((float) measuredHeight)) / ((float) i11);
                f = 1.0f;
            } else {
                f = (((float) i10) * ((float) measuredWidth)) / ((float) i9);
            }
            matrix.setScale(f2, f, (float) (measuredWidth / 2), (float) (measuredHeight / 2));
            setTransform(matrix);
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null && this.A00 == 3) {
            mediaPlayer.pause();
        }
    }

    public void pause() {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            C17960vV.A07(mediaPlayer);
            if (mediaPlayer.isPlaying()) {
                this.A09.pause();
                this.A00 = 4;
            }
        }
        this.A03 = 4;
    }

    public void seekTo(int i) {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            C17960vV.A07(mediaPlayer);
            mediaPlayer.seekTo(i);
            i = -1;
        }
        this.A02 = i;
    }

    public void start() {
        AnonymousClass88R r0;
        if (A01() && (r0 = this.A0J.A0A) != null) {
            r0.C6F();
        }
        boolean A012 = A01();
        MediaPlayer mediaPlayer = this.A09;
        if (A012) {
            C17960vV.A07(mediaPlayer);
            mediaPlayer.start();
            this.A00 = 3;
        } else if (mediaPlayer == null) {
            A00();
        }
        this.A03 = 3;
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.A06 = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.A07 = onErrorListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.A08 = onPreparedListener;
    }

    public void setVideoPath(String str) {
        this.A0B = str;
    }
}
