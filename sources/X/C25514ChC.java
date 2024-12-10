package X;

import java.nio.FloatBuffer;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: X.ChC  reason: case insensitive filesystem */
public class C25514ChC {
    public static final FloatBuffer A01;
    public static final FloatBuffer A02;
    public final Map A00 = new IdentityHashMap();

    static {
        FloatBuffer A0i = BEB.A0i(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}, 32);
        A0i.position(0);
        A01 = A0i;
        FloatBuffer A0i2 = BEB.A0i(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}, 32);
        A0i2.position(0);
        A02 = A0i2;
    }
}
