package X;

import com.whatsapp.util.Log;

/* renamed from: X.1TV  reason: invalid class name */
public final class AnonymousClass1TV {
    public final C26371Rw A00;
    public final C25851Pw A01;

    public AnonymousClass1TV(C26371Rw r2, C25851Pw r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public static final int A00(String str) {
        switch (str.hashCode()) {
            case -849492943:
                if (str.equals("regular_low")) {
                    return 5;
                }
                break;
            case -564602779:
                if (str.equals("regular_high")) {
                    return 4;
                }
                break;
            case -498584183:
                if (str.equals("critical_unblock_low")) {
                    return 2;
                }
                break;
            case 207170541:
                if (str.equals("critical_block")) {
                    return 1;
                }
                break;
            case 1086463900:
                if (str.equals("regular")) {
                    return 3;
                }
                break;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdAntiTamperingLoggingHelper/getShiftBit unknown collection name: ");
        sb.append(str);
        Log.w(sb.toString());
        return 0;
    }
}
