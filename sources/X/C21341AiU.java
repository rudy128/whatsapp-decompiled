package X;

import android.content.ComponentName;

/* renamed from: X.AiU  reason: case insensitive filesystem */
public class C21341AiU implements Comparable {
    public final ComponentName A00;
    public final C139656zE A01;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A01.A02 - ((C21341AiU) obj).A01.A02;
    }

    public C21341AiU(ComponentName componentName, C139656zE r2) {
        this.A01 = r2;
        this.A00 = componentName;
    }
}
