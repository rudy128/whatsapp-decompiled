package kotlinx.coroutines.android;

import X.AnonymousClass1IQ;
import X.AnonymousClass1IR;
import X.AnonymousClass1IT;
import android.os.Looper;
import java.util.List;

public final class AndroidDispatcherFactory {
    public int getLoadPriority() {
        return 1073741823;
    }

    public AnonymousClass1IR createDispatcher(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new AnonymousClass1IT(AnonymousClass1IQ.A00(mainLooper), (String) null, false);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
