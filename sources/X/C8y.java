package X;

import android.os.StrictMode;
import java.util.UUID;

public abstract class C8y {
    public static final UUID A00() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID randomUUID = UUID.randomUUID();
            C18070vi.A0b(randomUUID);
            return randomUUID;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
