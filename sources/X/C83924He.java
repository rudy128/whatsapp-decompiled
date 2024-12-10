package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.4He  reason: invalid class name and case insensitive filesystem */
public abstract class C83924He {
    public static void A00(Context context, AnonymousClass10I r5, int i) {
        float f;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("android.resource://");
        A10.append(context.getPackageName());
        A10.append("/");
        Uri parse = Uri.parse(C17880vN.A0t(A10, 2132017219));
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnCompletionListener(new AnonymousClass4bK(r5, 1));
        mediaPlayer.setAudioStreamType(i);
        if (i == 3) {
            f = 0.35f;
        } else {
            if (i == 0) {
                f = 0.2f;
            }
            mediaPlayer.setDataSource(context, parse);
            mediaPlayer.prepare();
            mediaPlayer.start();
        }
        mediaPlayer.setVolume(f, f);
        try {
            mediaPlayer.setDataSource(context, parse);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            Log.e("SequentialMessagesTonePlayer/playEndTone ", e);
        }
    }
}
