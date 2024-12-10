package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.DVa  reason: case insensitive filesystem */
public final class C27116DVa implements Callable {
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;

    public C27116DVa(SharedPreferences sharedPreferences, Integer num, String str) {
        this.A00 = sharedPreferences;
        this.A02 = str;
        this.A01 = num;
    }

    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.A00.getInt(this.A02, this.A01.intValue()));
    }
}
