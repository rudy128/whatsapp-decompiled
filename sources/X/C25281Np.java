package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Np  reason: invalid class name and case insensitive filesystem */
public class C25281Np {
    public final C18030ve A00;
    public final C222119a A01;
    public final AnonymousClass00H A02;

    public void A04(int i, int i2, int i3, int i4) {
        int i5 = i;
        if (A07(i)) {
            A02(i, i2);
        } else if (i4 != 7 && i4 != 10 && i4 != 11 && i4 != 12) {
            C222119a r5 = this.A01;
            r5.A0E("message_send", false, i);
            AnonymousClass00H r4 = this.A02;
            AnonymousClass165 r3 = (AnonymousClass165) r4.get();
            synchronized (r3) {
                r3.A00.put(Integer.valueOf(i), new HashMap());
            }
            if (i3 >= 0) {
                int i6 = i3 + 1;
                r5.A02(i, A01(A00(i2), i, i2, i6));
                ((AnonymousClass165) r4.get()).A01(i, i2, i6);
            } else {
                A02(i, i2);
            }
            r5.A09("wa_type", i5, (long) i4, false);
        }
    }

    public C25281Np(AnonymousClass11P r19, AnonymousClass118 r20, C18030ve r21, AnonymousClass18K r22, AnonymousClass19V r23, AnonymousClass19Y r24, AnonymousClass19T r25, AnonymousClass198 r26, AnonymousClass10I r27) {
        C18030ve r9 = r21;
        C222119a r6 = new C222119a(r19, r20, r9, r22, r23, r24, r25, r26, r27, "MessageSendPerfQplTracker", 154474694);
        C217617h A002 = C221618v.A00(AnonymousClass165.class);
        C222219b r3 = r6.A05;
        char c = !C18020vd.A05(C18040vf.A02, r9, 1191) ? (char) 1 : 3;
        boolean z = r3.A04;
        if (c != 1) {
            z = false;
            if (c != 2) {
                z = true;
            }
        }
        r3.A04 = z;
        this.A00 = r9;
        this.A01 = r6;
        this.A02 = A002;
    }

    public String A01(String str, int i, int i2, int i3) {
        Integer num;
        if (i3 == 0) {
            AnonymousClass165 r2 = (AnonymousClass165) this.A02.get();
            synchronized (r2) {
                Map map = (Map) r2.A00.get(Integer.valueOf(i));
                if (map == null || (num = (Integer) map.get(Integer.valueOf(i2))) == null) {
                    i3 = 0;
                } else {
                    i3 = num.intValue();
                }
            }
        }
        if (i3 <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(i3);
        return sb.toString();
    }

    public void A03(int i, int i2) {
        if (i2 != 8 && i2 != 7) {
            AnonymousClass00H r2 = this.A02;
            if (((AnonymousClass165) r2.get()).A02(i, i2)) {
                this.A01.A01(i, A01(A00(i2), i, i2, 0));
                ((AnonymousClass165) r2.get()).A00(i, i2);
            }
            int i3 = 2;
            switch (i2) {
                case 1:
                    break;
                case 2:
                    i3 = 5;
                    break;
                case 3:
                    A06(i, 2);
                    return;
                case 4:
                    i3 = 1;
                    break;
                case 5:
                    i3 = 6;
                    break;
                case 6:
                    i3 = 3;
                    break;
                default:
                    return;
            }
            A02(i, i3);
        }
    }

    public void A05(int i, String str, Object obj) {
        long longValue;
        if (obj != null) {
            int i2 = i;
            String str2 = str;
            if (obj instanceof Integer) {
                longValue = (long) ((Number) obj).intValue();
            } else if (obj instanceof Long) {
                longValue = ((Number) obj).longValue();
            } else if (obj instanceof Boolean) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C222119a r0 = this.A01;
                r0.A06.markerAnnotate(r0.A05.A06, i, str, booleanValue);
                return;
            } else if (obj instanceof String) {
                C222119a r02 = this.A01;
                r02.A06.markerAnnotate(r02.A05.A06, i, str, (String) obj);
                return;
            } else {
                return;
            }
            this.A01.A09(str2, i2, longValue, false);
        }
    }

    public void A06(int i, short s) {
        this.A01.A04(i, s);
        AnonymousClass165 r2 = (AnonymousClass165) this.A02.get();
        synchronized (r2) {
            r2.A00.remove(Integer.valueOf(i));
        }
    }

    public boolean A07(int i) {
        boolean containsKey;
        AnonymousClass165 r2 = (AnonymousClass165) this.A02.get();
        synchronized (r2) {
            containsKey = r2.A00.containsKey(Integer.valueOf(i));
        }
        return containsKey;
    }

    public static String A00(int i) {
        switch (i) {
            case 1:
                return "client_rendered";
            case 2:
                return "client_saved";
            case 3:
                return "client_written_wire";
            case 4:
                return "client_queued";
            case 5:
                return "client_waiting_to_encrypt";
            case 6:
                return "client_ready_to_send";
            case 7:
                return "client_encrypt";
            case 8:
                return "client_prekeys_fetch";
            default:
                return "unknown";
        }
    }

    public void A02(int i, int i2) {
        this.A01.A02(i, A01(A00(i2), i, i2, 0));
        AnonymousClass165 r1 = (AnonymousClass165) this.A02.get();
        synchronized (r1) {
            r1.A01(i, i2, 0);
        }
    }
}
