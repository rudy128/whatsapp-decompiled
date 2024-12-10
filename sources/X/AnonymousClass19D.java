package X;

import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.19D  reason: invalid class name */
public class AnonymousClass19D extends C18020vd {
    public static SharedPreferences A03;
    public final C18030ve A00;
    public final ConcurrentHashMap A01 = new ConcurrentHashMap(0);
    public final C18010vc A02;

    public synchronized SharedPreferences A0P() {
        SharedPreferences sharedPreferences;
        sharedPreferences = A03;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A05("ab-prechatd-props");
            A03 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public AnonymousClass19D(C18030ve r10, AnonymousClass10U r11, C18010vc r12, AnonymousClass10I r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        super(r11, r12, r13, r14, r15, "ab-prechatd-props");
        this.A00 = r10;
        this.A02 = r12;
    }
}
