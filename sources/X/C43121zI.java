package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.1zI  reason: invalid class name and case insensitive filesystem */
public abstract class C43121zI {
    public static final C43141zK A00(Context context, Integer num) {
        int i;
        int i2;
        int i3;
        Resources resources = context.getResources();
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                i = 2131169512;
                break;
            case 1:
                i = 2131169518;
                break;
            case 2:
                i = 2131169517;
                break;
            case 3:
                i = 2131169516;
                break;
            case 4:
                i = 2131169511;
                break;
            default:
                i = 2131169510;
                break;
        }
        float dimension = resources.getDimension(i);
        C43131zJ r3 = new C43131zJ(dimension, dimension);
        Resources resources2 = context.getResources();
        switch (intValue) {
            case 0:
                i2 = 2131169521;
                break;
            case 1:
                i2 = 2131169524;
                break;
            case 2:
                i2 = 2131169523;
                break;
            case 3:
                i2 = 2131169522;
                break;
            case 4:
                i2 = 2131169520;
                break;
            default:
                i2 = 2131169519;
                break;
        }
        float dimension2 = resources2.getDimension(i2);
        Resources resources3 = context.getResources();
        switch (intValue) {
            case 0:
            case 1:
            case 2:
                i3 = 2131169515;
                break;
            case 3:
                i3 = 2131169514;
                break;
            default:
                i3 = 2131169513;
                break;
        }
        return new C43141zK(r3, dimension2, resources3.getDimension(i3));
    }
}
