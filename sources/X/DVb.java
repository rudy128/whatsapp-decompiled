package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

public final class DVb implements Callable {
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ Long A01;
    public final /* synthetic */ String A02;

    public DVb(SharedPreferences sharedPreferences, Long l, String str) {
        this.A00 = sharedPreferences;
        this.A02 = str;
        this.A01 = l;
    }

    public final /* synthetic */ Object call() {
        return Long.valueOf(this.A00.getLong(this.A02, this.A01.longValue()));
    }
}
