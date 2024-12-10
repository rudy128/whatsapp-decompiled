package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;

/* renamed from: X.1zH  reason: invalid class name and case insensitive filesystem */
public abstract class C43111zH {
    public static final PointF A00(Context context, C39201sg r4, C39191sf r5) {
        float f;
        Resources resources;
        int i;
        Resources resources2;
        int i2;
        C18070vi.A0d(r5, 0);
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            int ordinal2 = r5.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    return new PointF(0.0f, 0.0f);
                }
                resources2 = context.getResources();
                i2 = 2131169502;
                f = resources2.getDimension(i2);
                resources = context.getResources();
                i = 2131169503;
                return new PointF(f, resources.getDimension(i));
            }
        } else if (ordinal == 1) {
            switch (r5.ordinal()) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                case 3:
                case 4:
                    resources2 = context.getResources();
                    i2 = 2131169501;
                    break;
                case 5:
                    f = context.getResources().getDimension(2131169499);
                    resources = context.getResources();
                    i = 2131169502;
                    break;
                default:
                    throw new AnonymousClass3EW();
            }
        } else {
            throw new AnonymousClass3EW();
        }
        f = context.getResources().getDimension(2131169503);
        resources = context.getResources();
        i = 2131169500;
        return new PointF(f, resources.getDimension(i));
    }

    public static final C43151zL A01(Context context, C39191sf r2) {
        float f = C43121zI.A00(context, A02(r2)).A01;
        switch (r2.ordinal()) {
            case 0:
                return new AnonymousClass2QB(f);
            case 1:
            case 2:
            case 3:
                return new C43161zM(f);
            case 4:
                return new AnonymousClass2QD(f);
            case 5:
                return new AnonymousClass2QC(f);
            default:
                throw new AnonymousClass3EW();
        }
    }

    public static final Integer A02(C39191sf r0) {
        switch (r0.ordinal()) {
            case 0:
                return AnonymousClass00R.A00;
            case 1:
                return AnonymousClass00R.A01;
            case 2:
                return AnonymousClass00R.A0C;
            case 3:
                return AnonymousClass00R.A0N;
            case 4:
                return AnonymousClass00R.A0Y;
            case 5:
                return AnonymousClass00R.A0j;
            default:
                throw new AnonymousClass3EW();
        }
    }
}
