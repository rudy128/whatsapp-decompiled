package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: X.CuS  reason: case insensitive filesystem */
public final class C26197CuS {
    public BYB A00;
    public final CLC A01 = new CLC(this);
    public final C18090vk A02;
    public final LinkedHashSet A03 = C17880vN.A14();
    public final Set A04 = C18070vi.A0P(C108955ca.A0e());
    public final C18090vk A05;
    public final C18090vk A06;
    public final C22821Di A07;

    private final void A01(int i, int i2) {
        Iterator it = this.A03.iterator();
        C18070vi.A0X(it);
        while (it.hasNext()) {
            Object next = it.next();
            C18070vi.A0X(next);
            C24867CNl cNl = (C24867CNl) next;
            if (cNl.A00 == i2 && A00(cNl.A01) > i) {
                it.remove();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r1.contains(X.C22966BXm.A00) == false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C26197CuS r6, X.C24867CNl r7, X.C24867CNl r8) {
        /*
            java.lang.Integer r4 = r7.A01
            int r0 = r4.intValue()
            r2 = 0
            r5 = 3
            if (r0 == r2) goto L_0x0078
            r1 = 1
            if (r0 == r1) goto L_0x0041
            java.util.LinkedHashSet r2 = r6.A03
            boolean r0 = r2.contains(r7)
            if (r0 != 0) goto L_0x0027
            X.0vk r0 = r6.A05
            boolean r0 = X.BE9.A1Y(r0)
            if (r0 != 0) goto L_0x0028
            java.util.Set r1 = r6.A04
            int r0 = r7.A00
            boolean r0 = X.C108965cb.A1b(r1, r0)
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            return
        L_0x0028:
            boolean r0 = r7 instanceof X.C22967BXn
            if (r0 == 0) goto L_0x0033
            java.lang.Integer r1 = r8.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 != r0) goto L_0x0033
            return
        L_0x0033:
            X.1Di r0 = r6.A07
            r0.invoke(r7)
            r2.add(r7)
            X.0vk r0 = r6.A06
            r0.invoke()
            return
        L_0x0041:
            java.lang.Integer r0 = r8.A01
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x006d
            if (r0 == r1) goto L_0x005d
            int r1 = A00(r4)
            int r0 = r7.A00
            r6.A01(r1, r0)
            r6.A03(r7, r8)
        L_0x0057:
            java.util.LinkedHashSet r0 = r6.A03
            r0.add(r7)
            return
        L_0x005d:
            java.util.LinkedHashSet r1 = r6.A03
            boolean r0 = r1.contains(r7)
            if (r0 != 0) goto L_0x0057
            X.BXm r0 = X.C22966BXm.A00
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0057
        L_0x006d:
            X.1Di r0 = r6.A07
            r0.invoke(r7)
            X.0vk r0 = r6.A06
            r0.invoke()
            goto L_0x0057
        L_0x0078:
            java.lang.Integer r1 = r8.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0089
            X.1Di r1 = r6.A07
            X.BYB r0 = r6.A00
            if (r0 == 0) goto L_0x0085
            r7 = r0
        L_0x0085:
            r1.invoke(r7)
            return
        L_0x0089:
            int r3 = r7.A00
            r0 = 5
            if (r3 != r0) goto L_0x00ad
            java.util.Set r0 = r6.A04
            java.util.Iterator r2 = r0.iterator()
        L_0x0094:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a6
            int r1 = X.C72453Mb.A0H(r2)
            int r0 = A00(r4)
            r6.A01(r0, r1)
            goto L_0x0094
        L_0x00a6:
            int r0 = A00(r4)
            r6.A01(r0, r5)
        L_0x00ad:
            int r0 = A00(r4)
            r6.A01(r0, r3)
            r6.A03(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26197CuS.A02(X.CuS, X.CNl, X.CNl):void");
    }

    private final void A03(C24867CNl cNl, C24867CNl cNl2) {
        LinkedHashSet linkedHashSet = this.A03;
        Object obj = null;
        if (!(linkedHashSet instanceof Collection) || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (A00(((C24867CNl) it.next()).A01) > A00(cNl.A01)) {
                    if (cNl2.A00 == cNl.A00) {
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            if (it2.hasNext()) {
                                int A002 = A00(((C24867CNl) next).A01);
                                do {
                                    Object next2 = it2.next();
                                    int A003 = A00(((C24867CNl) next2).A01);
                                    if (A002 < A003) {
                                        next = next2;
                                        A002 = A003;
                                    }
                                } while (it2.hasNext());
                            }
                            int A004 = A00(((C24867CNl) next).A01);
                            boolean z = false;
                            for (Object next3 : linkedHashSet) {
                                if (A00(((C24867CNl) next3).A01) == A004) {
                                    z = true;
                                    obj = next3;
                                }
                            }
                            if (z) {
                                this.A07.invoke(obj);
                            } else {
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        } else {
                            throw BE6.A14();
                        }
                    } else {
                        return;
                    }
                }
            }
            this.A06.invoke();
        }
        C24867CNl cNl3 = this.A00;
        if (cNl3 == null || cNl.A01 != AnonymousClass00R.A00) {
            cNl3 = cNl;
        }
        this.A07.invoke(cNl3);
        if (cNl.A00 == 5) {
            return;
        }
        this.A06.invoke();
    }

    public final void A04() {
        C18090vk r2 = this.A02;
        C24867CNl cNl = (C24867CNl) r2.invoke();
        if (cNl == null || cNl.A00 != 3) {
            C24867CNl cNl2 = (C24867CNl) r2.invoke();
            if (cNl2 == null || cNl2.A00 != 8) {
                C24867CNl cNl3 = (C24867CNl) r2.invoke();
                if (cNl3 == null || cNl3.A00 != 9) {
                    C24867CNl cNl4 = (C24867CNl) r2.invoke();
                    if (cNl4 == null || cNl4.A00 != 10) {
                        this.A03.clear();
                    }
                }
            }
        }
    }

    public final void A06(C24867CNl cNl) {
        C24867CNl cNl2;
        int i = cNl.A00;
        if (i == 1 && (cNl instanceof BYB)) {
            this.A00 = (BYB) cNl;
        }
        if ((!BE9.A1Y(this.A05) || !this.A03.contains(C22968BXo.A00) || i != 3 || cNl.A01 == AnonymousClass00R.A0C) && (cNl2 = (C24867CNl) this.A02.invoke()) != null) {
            A02(this, cNl, cNl2);
        }
    }

    public C26197CuS(C18090vk r2, C18090vk r3, C18090vk r4, C22821Di r5) {
        this.A02 = r2;
        this.A07 = r5;
        this.A05 = r3;
        this.A06 = r4;
    }

    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0109, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010b, code lost:
        r0 = X.BY2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0117, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0119, code lost:
        r0 = X.C22970BXq.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0142, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0144, code lost:
        r0 = X.C22967BXn.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0146, code lost:
        A06(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0149, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C24474C5p r3) {
        /*
            r2 = this;
            java.lang.String r1 = r3.A00()
            int r0 = r1.hashCode()
            switch(r0) {
                case -2142600848: goto L_0x013c;
                case -1907274391: goto L_0x0139;
                case -1827018166: goto L_0x0136;
                case -1748158431: goto L_0x0133;
                case -1659914561: goto L_0x0130;
                case -1639263991: goto L_0x012d;
                case -1622789342: goto L_0x012a;
                case -1564554863: goto L_0x011f;
                case -1447972833: goto L_0x011c;
                case -1393327239: goto L_0x0111;
                case -1371358665: goto L_0x010e;
                case -1258081213: goto L_0x0103;
                case -1085472894: goto L_0x0100;
                case -1076491209: goto L_0x00fd;
                case -956481827: goto L_0x00fa;
                case -914743687: goto L_0x00ef;
                case -792582493: goto L_0x00e4;
                case -735657628: goto L_0x00e1;
                case -712771762: goto L_0x00de;
                case -679949903: goto L_0x00db;
                case -646453283: goto L_0x00d0;
                case -618496294: goto L_0x00cd;
                case -536086858: goto L_0x00c2;
                case -485608986: goto L_0x00bf;
                case -473284920: goto L_0x00bb;
                case -472195994: goto L_0x00af;
                case -259501732: goto L_0x00ab;
                case -241236408: goto L_0x00a8;
                case -195374854: goto L_0x00a4;
                case -106498639: goto L_0x00a0;
                case 35580499: goto L_0x009c;
                case 39350972: goto L_0x0098;
                case 62482298: goto L_0x0094;
                case 64254586: goto L_0x0090;
                case 167229966: goto L_0x008c;
                case 223933925: goto L_0x0088;
                case 247259090: goto L_0x0084;
                case 345573223: goto L_0x0080;
                case 345971800: goto L_0x007c;
                case 426664360: goto L_0x0078;
                case 427425418: goto L_0x0074;
                case 433141802: goto L_0x0070;
                case 496649534: goto L_0x006c;
                case 554408463: goto L_0x0068;
                case 624934087: goto L_0x005c;
                case 720580000: goto L_0x0058;
                case 743369482: goto L_0x0054;
                case 764460121: goto L_0x0050;
                case 879138356: goto L_0x004c;
                case 933142426: goto L_0x0048;
                case 937195223: goto L_0x0044;
                case 1051436370: goto L_0x0040;
                case 1072999339: goto L_0x003c;
                case 1112689461: goto L_0x0038;
                case 1237785799: goto L_0x0034;
                case 1430407976: goto L_0x0030;
                case 1483329954: goto L_0x002c;
                case 1483851953: goto L_0x0028;
                case 1596674987: goto L_0x0024;
                case 1684979281: goto L_0x0020;
                case 1808400106: goto L_0x001c;
                case 1935425562: goto L_0x0018;
                case 2104595036: goto L_0x0014;
                case 2109336670: goto L_0x0010;
                case 2124047836: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            return
        L_0x000c:
            java.lang.String r0 = "STREAM_STOPPED_REASON_SYSTEM_SHUTDOWN"
            goto L_0x013e
        L_0x0010:
            java.lang.String r0 = "SNAPP_UNSUPPORTED_APP"
            goto L_0x013e
        L_0x0014:
            java.lang.String r0 = "SNAPP_APP_NOT_RUNNING"
            goto L_0x013e
        L_0x0018:
            java.lang.String r0 = "STREAM_STOPPED_REASON_CAMERA_FAILURE"
            goto L_0x013e
        L_0x001c:
            java.lang.String r0 = "MEDIA_STREAM_SERVICE_DISCONNECT"
            goto L_0x013e
        L_0x0020:
            java.lang.String r0 = "MEDIA_STREAM_SERVICE_CONNECTION_FAIL"
            goto L_0x013e
        L_0x0024:
            java.lang.String r0 = "SOCKET_CONNECTION_ENCRYPT_LINK_TIMEOUT"
            goto L_0x013e
        L_0x0028:
            java.lang.String r0 = "SNAPP_NOT_ENOUGH_STORAGE"
            goto L_0x013e
        L_0x002c:
            java.lang.String r0 = "SNAPP_DENIED_BY_PEAK_POWER"
            goto L_0x0105
        L_0x0030:
            java.lang.String r0 = "LINKED_DEVICE_START_ERROR"
            goto L_0x013e
        L_0x0034:
            java.lang.String r0 = "BT_PERMISSIONS_NOT_GRANTED"
            goto L_0x013e
        L_0x0038:
            java.lang.String r0 = "SOCKET_CONNECTION_DEVICE_PROTOCOL_ERROR"
            goto L_0x013e
        L_0x003c:
            java.lang.String r0 = "STREAMING_ERROR"
            goto L_0x013e
        L_0x0040:
            java.lang.String r0 = "MEDIA_STREAM_SERVICE_CHANNEL_NOT_CREATED"
            goto L_0x013e
        L_0x0044:
            java.lang.String r0 = "STREAM_STOPPED_REASON_AUDIO_FAILURE"
            goto L_0x013e
        L_0x0048:
            java.lang.String r0 = "SOCKET_CONNECTION_DEVICE_LINKAGE_ERROR"
            goto L_0x013e
        L_0x004c:
            java.lang.String r0 = "SOCKET_CONNECTION_BT_DISABLED"
            goto L_0x013e
        L_0x0050:
            java.lang.String r0 = "SNAPP_UNKNOWN_MESSAGE"
            goto L_0x013e
        L_0x0054:
            java.lang.String r0 = "SOCKET_CONNECTION_DEVICE_IO_EXCEPTION"
            goto L_0x013e
        L_0x0058:
            java.lang.String r0 = "STREAM_STOPPED_REASON_UNKNOWN"
            goto L_0x013e
        L_0x005c:
            java.lang.String r0 = "OUTDATED_GLASSES_FIRMWARE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.BXv r0 = X.C22975BXv.A00
            goto L_0x0146
        L_0x0068:
            java.lang.String r0 = "LIVE_STREAM_START_INTERNAL_ERROR"
            goto L_0x013e
        L_0x006c:
            java.lang.String r0 = "SOCKET_CONNECTION_UNKNOWN_ERROR"
            goto L_0x013e
        L_0x0070:
            java.lang.String r0 = "UNKNOWN"
            goto L_0x013e
        L_0x0074:
            java.lang.String r0 = "STREAMING_ALREADY_ACTIVE"
            goto L_0x013e
        L_0x0078:
            java.lang.String r0 = "SNAPP_CHARGING_NOT_CONNECTED"
            goto L_0x013e
        L_0x007c:
            java.lang.String r0 = "STREAM_STOPPED_REASON_BATTERY_LOW"
            goto L_0x0105
        L_0x0080:
            java.lang.String r0 = "SNAM_CONNECTION_FAIL"
            goto L_0x013e
        L_0x0084:
            java.lang.String r0 = "SNAPP_UNHANDLED_MESSAGE"
            goto L_0x013e
        L_0x0088:
            java.lang.String r0 = "CONNECTION_TIMED_OUT"
            goto L_0x013e
        L_0x008c:
            java.lang.String r0 = "SNAPP_NOT_ENOUGH_PRIORITY"
            goto L_0x013e
        L_0x0090:
            java.lang.String r0 = "STREAM_STOPPED_REASON_TAMPER_DETECTED"
            goto L_0x013e
        L_0x0094:
            java.lang.String r0 = "SOCKET_CONNECTION_UNKNOWN_APPLINK_ERROR"
            goto L_0x013e
        L_0x0098:
            java.lang.String r0 = "LIVE_STREAM_START_INVALID_PARAM"
            goto L_0x013e
        L_0x009c:
            java.lang.String r0 = "STREAM_STOPPED_REASON_PEAK_POWER_INTERRUPT"
            goto L_0x013e
        L_0x00a0:
            java.lang.String r0 = "SNAPP_START_APP_FAILED"
            goto L_0x013e
        L_0x00a4:
            java.lang.String r0 = "LIVE_STREAM_START_UNSUPPORTED_PARAM"
            goto L_0x013e
        L_0x00a8:
            java.lang.String r0 = "SNAPP_THERMAL_THROTTLING"
            goto L_0x0113
        L_0x00ab:
            java.lang.String r0 = "STREAM_STOPPED_REASON_MOBILE_STREAM_ERROR"
            goto L_0x013e
        L_0x00af:
            java.lang.String r0 = "WIFI_DISABLED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.BY1 r0 = X.BY1.A00
            goto L_0x0146
        L_0x00bb:
            java.lang.String r0 = "SNAPP_UNRECOGNIZED"
            goto L_0x013e
        L_0x00bf:
            java.lang.String r0 = "INTERNAL_ERROR"
            goto L_0x013e
        L_0x00c2:
            java.lang.String r0 = "VPN_ENABLED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.BY0 r0 = X.BY0.A00
            goto L_0x0146
        L_0x00cd:
            java.lang.String r0 = "SNAPP_UNKNOWN_ERROR"
            goto L_0x013e
        L_0x00d0:
            java.lang.String r0 = "LIVE_STREAM_START_DOFF_ERROR"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.BXo r0 = X.C22968BXo.A00
            goto L_0x0146
        L_0x00db:
            java.lang.String r0 = "INVALID_STATE_MESSAGE"
            goto L_0x013e
        L_0x00de:
            java.lang.String r0 = "SOCKET_CONNECTION_SET_LINK_TIMEOUT"
            goto L_0x013e
        L_0x00e1:
            java.lang.String r0 = "SOCKET_CONNECTION_LINK_SETUP_DETACHED"
            goto L_0x013e
        L_0x00e4:
            java.lang.String r0 = "OUTDATED_APP_VERSION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.BXu r0 = X.C22974BXu.A00
            goto L_0x0146
        L_0x00ef:
            java.lang.String r0 = "OUTDATED_MWA_VERSION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.BXw r0 = X.C22976BXw.A00
            goto L_0x0146
        L_0x00fa:
            java.lang.String r0 = "SOCKET_CONNECTION_ERROR_ESTABLISHING_DEVICE_CONNECTION"
            goto L_0x013e
        L_0x00fd:
            java.lang.String r0 = "BACKGROUNDED_DISCONNECT_ERROR"
            goto L_0x013e
        L_0x0100:
            java.lang.String r0 = "SNAPP_PAYLOAD_CORRUPTED"
            goto L_0x013e
        L_0x0103:
            java.lang.String r0 = "SNAPP_NOT_ENOUGH_BATTERY"
        L_0x0105:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.BY2 r0 = X.BY2.A00
            goto L_0x0146
        L_0x010e:
            java.lang.String r0 = "SNAM_SHUTDOWN_ERROR"
            goto L_0x013e
        L_0x0111:
            java.lang.String r0 = "STREAM_STOPPED_REASON_THERMAL_THRESHOLD"
        L_0x0113:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.BXq r0 = X.C22970BXq.A00
            goto L_0x0146
        L_0x011c:
            java.lang.String r0 = "SNAPP_STOP_APP_FAILED"
            goto L_0x013e
        L_0x011f:
            java.lang.String r0 = "HOTSPOT_ENABLED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.BXs r0 = X.C22972BXs.A00
            goto L_0x0146
        L_0x012a:
            java.lang.String r0 = "SNAM_MAXED_OUT_CONNECTION_ATTEMPTS"
            goto L_0x013e
        L_0x012d:
            java.lang.String r0 = "MEDIA_STREAM_SERVICE_MSG_SEND_FAIL"
            goto L_0x013e
        L_0x0130:
            java.lang.String r0 = "DEVICE_ERROR"
            goto L_0x013e
        L_0x0133:
            java.lang.String r0 = "SOCKET_CONNECTION_CLOSED"
            goto L_0x013e
        L_0x0136:
            java.lang.String r0 = "BUG_MUST_FIX"
            goto L_0x013e
        L_0x0139:
            java.lang.String r0 = "STREAM_STOPPED_REASON_SYSTEM_PREEMPT"
            goto L_0x013e
        L_0x013c:
            java.lang.String r0 = "SOCKET_CONNECTION_CONNECT_TO_SOCKET_FAIL"
        L_0x013e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            X.BXn r0 = X.C22967BXn.A00
        L_0x0146:
            r2.A06(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26197CuS.A05(X.C5p):void");
    }
}
