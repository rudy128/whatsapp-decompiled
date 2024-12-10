package X;

import android.media.MediaPlayer;
import java.lang.ref.WeakReference;

/* renamed from: X.75V  reason: invalid class name */
public final /* synthetic */ class AnonymousClass75V implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ AnonymousClass73N A00;
    public final /* synthetic */ WeakReference A01;

    public final void onPrepared(MediaPlayer mediaPlayer) {
        AnonymousClass73N r1 = this.A00;
        WeakReference weakReference = this.A01;
        if (r1.A08) {
            C108945cZ.A0a(r1.A0A).A0J(new C146757Qm((Object) weakReference, 24));
        }
    }

    public /* synthetic */ AnonymousClass75V(AnonymousClass73N r1, WeakReference weakReference) {
        this.A00 = r1;
        this.A01 = weakReference;
    }
}
