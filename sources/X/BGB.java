package X;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

public final class BGB extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService A00;

    public /* bridge */ /* synthetic */ void onCallbackDied(IInterface iInterface, Object obj) {
        C18070vi.A0d(obj, 1);
        this.A00.A02.remove(obj);
    }

    public BGB(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.A00 = multiInstanceInvalidationService;
    }
}
