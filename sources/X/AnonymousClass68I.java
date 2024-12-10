package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.68I  reason: invalid class name */
public final class AnonymousClass68I extends C144737Im {
    public void run() {
        File A0H = C26511Sk.A0H(this.A01, this.A04);
        if (A0H.exists() && !A0H.delete()) {
            Log.w("MediaDeleteDoodleJob/failed-delete-doodle-file");
        }
    }
}
