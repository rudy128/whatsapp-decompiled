package X;

import android.media.MediaMetadataRetriever;
import android.util.Pair;

/* renamed from: X.67j  reason: invalid class name and case insensitive filesystem */
public final class C1192567j extends C115525vC {
    public Pair A01(C188219h4 r4) {
        BCx bCx = (BCx) C17890vO.A0l(r4.A05).next();
        if (!(bCx instanceof C168558j5)) {
            return super.A01(r4);
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(((C168558j5) bCx).Bb5(), C17880vN.A11());
        return C108945cZ.A0N(AnonymousClass000.A0i(), mediaMetadataRetriever.getFrameAtTime(0));
    }
}
