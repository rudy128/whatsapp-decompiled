package X;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.Dbu  reason: case insensitive filesystem */
public class C27323Dbu extends HashMap {
    public final int A00;

    public static HashSet A00() {
        return C25870Cne.A00(new C26132Csv(1440, 1080));
    }

    public C27323Dbu(int i) {
        char c;
        Object obj;
        this.A00 = i;
        switch (i) {
            case 0:
                BE7.A1H(50, this, 0.0f);
                BE7.A1H(51, this, 0.03f);
                BE7.A1H(52, this, 0.06f);
                BE7.A1H(53, this, 0.08f);
                BE7.A1H(54, this, 0.1f);
                BE7.A1H(55, this, 0.13f);
                BE7.A1H(56, this, 0.16f);
                BE7.A1H(57, this, 0.18f);
                BE7.A1H(58, this, 0.2f);
                BE7.A1H(59, this, 0.23f);
                BE7.A1H(60, this, 0.26f);
                BE7.A1H(61, this, 0.28f);
                BE7.A1H(62, this, 0.31f);
                BE7.A1H(63, this, 0.33f);
                BE7.A1H(64, this, 0.36f);
                BE7.A1H(65, this, 0.39f);
                BE7.A1H(66, this, 0.42f);
                BE7.A1H(67, this, 0.44f);
                BE7.A1H(68, this, 0.47f);
                BE7.A1H(69, this, 0.5f);
                BE7.A1H(70, this, 0.53f);
                BE7.A1H(71, this, 0.56f);
                BE7.A1H(72, this, 0.59f);
                BE7.A1H(73, this, 0.62f);
                BE7.A1H(74, this, 0.65f);
                BE7.A1H(75, this, 0.68f);
                BE7.A1H(76, this, 0.71f);
                BE7.A1H(77, this, 0.74f);
                BE7.A1H(78, this, 0.78f);
                BE7.A1H(79, this, 0.81f);
                BE7.A1H(80, this, 0.85f);
                BE7.A1H(81, this, 0.88f);
                BE7.A1H(82, this, 0.92f);
                BE7.A1H(83, this, 0.96f);
                BE7.A1H(84, this, 1.0f);
                BE7.A1H(85, this, 1.04f);
                BE7.A1H(86, this, 1.08f);
                BE7.A1H(87, this, 1.13f);
                BE7.A1H(88, this, 1.18f);
                BE7.A1H(89, this, 1.23f);
                BE7.A1H(90, this, 1.28f);
                BE7.A1H(91, this, 1.34f);
                BE7.A1H(92, this, 1.41f);
                BE7.A1H(93, this, 1.48f);
                BE7.A1H(94, this, 1.56f);
                BE7.A1H(95, this, 1.65f);
                BE7.A1H(96, this, 1.76f);
                BE7.A1H(97, this, 1.89f);
                BE7.A1H(98, this, 2.06f);
                BE7.A1H(99, this, 2.33f);
                return;
            case 1:
                put(BE6.A0T("Huawei", "HUAWEI GRA-CL00"), C25870Cne.A00(new C26132Csv(1440, 1080)));
                put(BE6.A0T("Huawei", "HUAWEI GRA-CL10"), A00());
                put(BE6.A0T("Huawei", "HUAWEI GRA-L09"), A00());
                put(BE6.A0T("Huawei", "HUAWEI GRA-TL00"), A00());
                put(BE6.A0T("Huawei", "HUAWEI GRA-UL00"), A00());
                put(BE6.A0T("Huawei", "HUAWEI GRA-UL10"), A00());
                put(BE6.A0T("Huawei", "HUAWEI MT7-CL00"), A00());
                put(BE6.A0T("Huawei", "HUAWEI MT7-J1"), A00());
                put(BE6.A0T("Huawei", "HUAWEI MT7-L09"), A00());
                put(BE6.A0T("Huawei", "HUAWEI MT7-TL00"), A00());
                put(BE6.A0T("Huawei", "HUAWEI MT7-TL10"), A00());
                put(BE6.A0T("Huawei", "HUAWEI MT7-UL00"), A00());
                return;
            case 2:
                put(BE6.A0T("Amazon", "SD4930UR"), C25870Cne.A00(new C26132Csv(2592, 1944)));
                return;
            case 3:
                put("android.intent.action.", CII.A03);
                put("android.app.action.", CII.A01);
                put("com.android.server.", CII.A05);
                put("android.bluetooth.", CII.A02);
                put("com.android.", CII.A06);
                put("android.", CII.A04);
                c = "";
                obj = CII.A08;
                break;
            default:
                put(8304, "0");
                put(185, "1");
                put(178, "2");
                put(179, "3");
                put(8308, "4");
                put(8309, "5");
                put(8310, "6");
                put(8311, "7");
                put(8312, "8");
                c = 8313;
                obj = "9";
                break;
        }
        put(c, obj);
    }
}
