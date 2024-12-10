package X;

import android.graphics.PointF;

/* renamed from: X.2w4  reason: invalid class name and case insensitive filesystem */
public class C65242w4 implements C40301uU {
    public static final C65242w4 A00 = new Object();
    public static final C40111uB A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2w4, java.lang.Object] */
    static {
        String[] strArr = new String[13];
        strArr[0] = "t";
        strArr[1] = "f";
        strArr[2] = "s";
        strArr[3] = "j";
        strArr[4] = "tr";
        strArr[5] = "lh";
        strArr[6] = "ls";
        strArr[7] = "fc";
        strArr[8] = "sc";
        strArr[9] = "sw";
        strArr[10] = "of";
        strArr[11] = "ps";
        A01 = C40111uB.A00("sz", strArr, 12);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.CXZ, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object CB7(C39941tt r20, float f) {
        Integer num = AnonymousClass00R.A0C;
        C39941tt r18 = r20;
        r18.A0G();
        String str = null;
        Integer num2 = num;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (r18.A0M()) {
            switch (r18.A09(A01)) {
                case 0:
                    str = r18.A0D();
                    continue;
                case 1:
                    str2 = r18.A0D();
                    continue;
                case 2:
                    f2 = (float) r18.A07();
                    continue;
                case 3:
                    int A08 = r18.A08();
                    if (A08 > 2 || A08 < 0) {
                        num2 = num;
                        break;
                    } else {
                        num2 = AnonymousClass00R.A00(3)[A08];
                        continue;
                    }
                case 4:
                    i = r18.A08();
                    continue;
                case 5:
                    f3 = (float) r18.A07();
                    continue;
                case 6:
                    f4 = (float) r18.A07();
                    continue;
                case 7:
                    i2 = C40491un.A01(r18);
                    continue;
                case 8:
                    i3 = C40491un.A01(r18);
                    continue;
                case 9:
                    f5 = (float) r18.A07();
                    continue;
                case 10:
                    z = r18.A0N();
                    continue;
                case 11:
                    r18.A0F();
                    pointF = new PointF(((float) r18.A07()) * f, ((float) r18.A07()) * f);
                    break;
                case 12:
                    r18.A0F();
                    pointF2 = new PointF(((float) r18.A07()) * f, ((float) r18.A07()) * f);
                    break;
                default:
                    r18.A0J();
                    r18.A0K();
                    continue;
            }
            r18.A0H();
        }
        r18.A0I();
        ? obj = new Object();
        obj.A0B = str;
        obj.A0A = str2;
        obj.A02 = f2;
        obj.A09 = num2;
        obj.A06 = i;
        obj.A01 = f3;
        obj.A00 = f4;
        obj.A04 = i2;
        obj.A05 = i3;
        obj.A03 = f5;
        obj.A0C = z;
        obj.A07 = pointF;
        obj.A08 = pointF2;
        return obj;
    }
}
