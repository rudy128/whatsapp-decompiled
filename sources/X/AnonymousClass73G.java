package X;

import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.tasks.zzw;
import com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.73G  reason: invalid class name */
public final class AnonymousClass73G {
    public static final Bc7 A0K = Bc7.A03;
    public int A00;
    public C131726lZ A01;
    public C136296ta A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass1DT A06;
    public final AnonymousClass11S A07;
    public final AnonymousClass11P A08;
    public final AnonymousClass118 A09;
    public final C19830z4 A0A;
    public final AnonymousClass6J2 A0B;
    public final AnonymousClass6J1 A0C;
    public final DecimalFormat A0D;
    public final HashMap A0E = C17880vN.A11();
    public final C18100vl A0F = AnonymousClass7S4.A02(this, 27);
    public final C18100vl A0G;
    public final C136696uE A0H;
    public final AnonymousClass11C A0I;
    public final C138796xi A0J;

    public final void A07(String str) {
        Object obj;
        C18070vi.A0d(str, 0);
        HashMap hashMap = this.A0E;
        if (!hashMap.containsKey(str)) {
            C131726lZ r0 = this.A01;
            if (r0 != null) {
                r0.A00(str, 1);
                return;
            }
            return;
        }
        C136046tB r5 = (C136046tB) hashMap.get(str);
        if (r5 != null) {
            r5.A00 = 1;
        }
        C1593684g A0F2 = C108965cb.A0F(this);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("\n          {\n            \"push_name\": \"");
        A10.append(this.A07.A0D());
        A10.append("\",\n            \"num_files\": ");
        AnonymousClass6J1 r1 = this.A0C;
        A10.append(r1.A00);
        A10.append(",\n            \"total_bytes\": ");
        A10.append(r1.A02);
        byte[] A1O = C108975cc.A1O(AnonymousClass000.A0y("\n          }\n        ", A10));
        BZ9 bz9 = (BZ9) A0F2;
        CWD A012 = C25934Coz.A01(bz9.A02, new C114235qN(bz9, this.A0H), C136696uE.class.getName());
        BZ9.A00(bz9, str);
        C25069CWc A002 = C25558Chw.A00();
        A002.A03 = new C23191Bcl[]{CIV.A0j};
        A002.A01 = new C26895DIc(A012, bz9, str, A1O);
        A002.A00 = 1226;
        zzw A022 = C26126Cso.A02(bz9, A002.A00(), 1);
        A022.addOnFailureListener(new C26950DKj(bz9, str));
        A022.addOnFailureListener(new AnonymousClass7BI(r5, this, str));
        C131726lZ r02 = this.A01;
        if (r02 != null) {
            ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity = r02.A00;
            Iterator it = thunderstormConnectionsInfoActivity.A0K.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C140096zw.A00(obj, str)) {
                    break;
                }
            }
            C140096zw r3 = (C140096zw) obj;
            if (r3 != null) {
                C108955ca.A1C(thunderstormConnectionsInfoActivity, r3.A03, 2131896888);
                AnonymousClass3MX.A1K(r3.A02, 2);
                AnonymousClass3MX.A1K(r3.A06, 1);
                ThunderstormConnectionsInfoActivity.A0Q(thunderstormConnectionsInfoActivity, r3);
            }
            ThunderstormConnectionsInfoActivity.A0c(thunderstormConnectionsInfoActivity, str, 1);
            AnonymousClass7RS r32 = new AnonymousClass7RS(24, str, thunderstormConnectionsInfoActivity);
            thunderstormConnectionsInfoActivity.A07 = r32;
            thunderstormConnectionsInfoActivity.A0I.postDelayed(r32, C20113A7w.A0L);
        }
    }

    public final void A08(List list) {
        long j;
        StringBuilder A10;
        List list2 = list;
        C18070vi.A0d(list2, 0);
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass6J1 r5 = this.A0C;
        if (r5.A00 > 0) {
            r5.A01();
        }
        C138996y2 r2 = (C138996y2) this.A0G.getValue();
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        if (AnonymousClass000.A1a(list2)) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Uri A0M = C108945cZ.A0M(it);
                C26521Sl r1 = r2.A02;
                String A0c = C108975cc.A0c(A0M, r1);
                if (!C138996y2.A00(A0c)) {
                    A10 = AnonymousClass000.A10();
                    A10.append("thunderstorm_logs: ThunderstormMediaContentManager/ createPayloads/ unsupported file mime type: ");
                    A10.append(A0c);
                } else {
                    File A0j = r1.A0j(A0M, true);
                    C18070vi.A0X(A0j);
                    if (C21721ArX.A03(A0j).length() == 0) {
                        String A032 = C25291Nq.A03(A0c);
                        C18070vi.A0X(A032);
                        String parent = A0j.getParent();
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append(A0j.getName());
                        File file = new File(parent, C17890vO.A0Z(A032, A102, '.'));
                        if (A0j.renameTo(file)) {
                            A0j = file;
                        } else {
                            StringBuilder A103 = AnonymousClass000.A10();
                            A103.append("thunderstorm_logs: ThunderstormMediaContentManager/ maybeAddFileExtension/ failed to rename file ");
                            A103.append(A0j.getName());
                            C17900vP.A0g(" with extension ", A032, A103);
                        }
                    }
                    String name = A0j.getName();
                    C18070vi.A0X(name);
                    String A012 = r2.A01(name);
                    if (A012.length() == 0) {
                        A10 = AnonymousClass000.A10();
                        A10.append("thunderstorm_logs: ThunderstormMediaContentManager/ createPayloads/ invalid media file name: ");
                        A10.append(A0j.getName());
                    } else {
                        C23433Bgy bgy = C25959CpR.A08;
                        ParcelFileDescriptor open = ParcelFileDescriptor.open(A0j, 268435456);
                        long length = A0j.length();
                        Uri fromFile = Uri.fromFile(A0j);
                        C18210vx.A02(open, "Cannot create Payload.File from null ParcelFileDescriptor.");
                        C18210vx.A02(fromFile, "Cannot create Payload.File from null Uri");
                        C25959CpR A002 = C25959CpR.A00(new C24950CRa(fromFile, open, A0j, length), UUID.randomUUID().getLeastSignificantBits());
                        long j2 = A002.A04;
                        StringBuilder A104 = AnonymousClass000.A10();
                        A104.append("\n          {\n            \"payload_id\": ");
                        A104.append(j2);
                        A104.append(",\n            \"file_name\": \"");
                        A104.append(A012);
                        C25959CpR cpR = new C25959CpR((C24950CRa) null, (C24877CNv) null, C108975cc.A1O(AnonymousClass000.A0y("\"\n          }\n        ", A104)), 1, UUID.randomUUID().getLeastSignificantBits());
                        A13.add(A002);
                        A132.add(cpR);
                    }
                }
                Log.w(A10.toString());
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(A13));
        Iterator it2 = A13.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(Long.valueOf(((C25959CpR) next).A04), next);
        }
        r5.A04 = new HashMap(linkedHashMap);
        r5.A00 = A13.size();
        Iterator it3 = A13.iterator();
        long j3 = 0;
        while (it3.hasNext()) {
            C24950CRa cRa = ((C25959CpR) it3.next()).A05;
            if (cRa != null) {
                j = cRa.A00;
            } else {
                j = 0;
            }
            j3 += j;
        }
        r5.A02 = j3;
        Locale locale = Locale.US;
        Object[] A1b = AnonymousClass3MW.A1b();
        C17880vN.A1T(A1b, r5.A00, 0);
        A1b[1] = Double.valueOf(((double) j3) / 1000000.0d);
        C108955ca.A1W("thunderstorm_logs: OutgoingTransferInfo/ setFilePayloads: %d file payloads - %.2f MB", locale, Arrays.copyOf(A1b, 2));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C200510q.A00(A132));
        Iterator it4 = A132.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            linkedHashMap2.put(Long.valueOf(((C25959CpR) next2).A04), next2);
        }
        r5.A01 = new HashMap(linkedHashMap2);
        C136296ta r11 = this.A02;
        Long A1B = C108945cZ.A1B(System.currentTimeMillis(), currentTimeMillis);
        r11.A02 = A1B;
        r11.A00 = ((double) r5.A02) / 1000000.0d;
        Object[] A1b2 = AnonymousClass3MW.A1b();
        DecimalFormat decimalFormat = this.A0D;
        A1b2[0] = decimalFormat.format(A1B);
        A1b2[1] = decimalFormat.format(this.A02.A00);
        C108955ca.A1W("thunderstorm_logs: ThunderstormManager/ /setPayloads() - file processing time: %s ms, size: %s MB", locale, Arrays.copyOf(A1b2, 2));
    }

    public static final String[] A01() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return new String[]{"android.permission.NEARBY_WIFI_DEVICES", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"};
        } else if (i >= 31) {
            String[] A1b = C17880vN.A1b("android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE", 8, 1);
            A1b[2] = "android.permission.BLUETOOTH_CONNECT";
            A1b[3] = "android.permission.ACCESS_WIFI_STATE";
            A1b[4] = "android.permission.CHANGE_WIFI_STATE";
            A1b[5] = "android.permission.ACCESS_COARSE_LOCATION";
            A1b[6] = "android.permission.ACCESS_FINE_LOCATION";
            A1b[7] = "android.permission.READ_EXTERNAL_STORAGE";
            return A1b;
        } else if (i >= 29) {
            String[] A1b2 = C17880vN.A1b("android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", 7, 1);
            A1b2[2] = "android.permission.ACCESS_WIFI_STATE";
            A1b2[3] = "android.permission.CHANGE_WIFI_STATE";
            A1b2[4] = "android.permission.ACCESS_COARSE_LOCATION";
            A1b2[5] = "android.permission.ACCESS_FINE_LOCATION";
            A1b2[6] = "android.permission.READ_EXTERNAL_STORAGE";
            return A1b2;
        } else {
            String[] A1b3 = C17880vN.A1b("android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", 6, 1);
            A1b3[2] = "android.permission.ACCESS_WIFI_STATE";
            A1b3[3] = "android.permission.CHANGE_WIFI_STATE";
            A1b3[4] = "android.permission.ACCESS_COARSE_LOCATION";
            A1b3[5] = "android.permission.READ_EXTERNAL_STORAGE";
            return A1b3;
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.Bcp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v6, types: [X.CWx, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r13 = this;
            boolean r0 = r13.A03
            if (r0 != 0) goto L_0x0163
            r0 = 1
            r13.A03 = r0
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            long r0 = java.lang.System.currentTimeMillis()
            r5.append(r0)
            r4 = 10
            r5.append(r4)
            X.0z4 r3 = r13.A0A
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r3)
            r0 = 0
            java.lang.String r2 = "thunderstorm_device_id"
            java.lang.String r1 = r1.getString(r2, r0)
            if (r1 != 0) goto L_0x0031
            java.lang.String r1 = X.C17890vO.A0Q()
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r3)
            X.C17880vN.A1E(r0, r2, r1)
        L_0x0031:
            r5.append(r1)
            r5.append(r4)
            X.11S r0 = r13.A07
            java.lang.String r0 = r0.A0D()
            java.lang.String r8 = X.AnonymousClass000.A0y(r0, r5)
            X.Bcp r7 = new X.Bcp
            r7.<init>()
            r9 = 1
            r7.A0C = r9
            r7.A0D = r9
            r7.A0E = r9
            r7.A0F = r9
            r4 = 0
            r7.A0G = r4
            r7.A0H = r9
            r7.A0I = r9
            r7.A0J = r9
            r7.A0K = r4
            r7.A0L = r4
            r7.A0M = r4
            r7.A02 = r4
            r7.A03 = r4
            r0 = 0
            r7.A04 = r0
            r7.A0N = r4
            r7.A0O = r9
            r7.A0P = r4
            r7.A0Q = r9
            r7.A0R = r9
            r7.A00 = r4
            r7.A07 = r9
            r7.A01 = r4
            r7.A08 = r4
            r7.A09 = r9
            r7.A0A = r9
            r7.A0B = r9
            X.Bc7 r0 = A0K
            r7.A06 = r0
            int[] r11 = r7.A0V
            r10 = 9
            r6 = 2
            r5 = 0
            if (r11 == 0) goto L_0x00d6
            int r3 = r11.length
            if (r3 <= 0) goto L_0x00d6
            r7.A0F = r4
            r7.A0E = r4
            r7.A0I = r4
            r7.A0J = r4
            r7.A0H = r4
            r7.A0L = r4
            r2 = 0
        L_0x009a:
            r12 = r11[r2]
            if (r12 == r6) goto L_0x00d3
            if (r12 == r10) goto L_0x00d0
            r0 = 11
            if (r12 == r0) goto L_0x00bf
            r0 = 4
            if (r12 == r0) goto L_0x00cd
            r0 = 5
            if (r12 == r0) goto L_0x00ca
            r0 = 6
            if (r12 == r0) goto L_0x00c7
            r0 = 7
            if (r12 == r0) goto L_0x00c4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Illegal advertising medium "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r12)
            java.lang.String r0 = "NearbyConnections"
            android.util.Log.d(r0, r1)
        L_0x00bf:
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x00d6
            goto L_0x009a
        L_0x00c4:
            r7.A0I = r9
            goto L_0x00bf
        L_0x00c7:
            r7.A0J = r9
            goto L_0x00bf
        L_0x00ca:
            r7.A0H = r9
            goto L_0x00bf
        L_0x00cd:
            r7.A0F = r9
            goto L_0x00bf
        L_0x00d0:
            r7.A0L = r9
            goto L_0x00bf
        L_0x00d3:
            r7.A0E = r9
            goto L_0x00bf
        L_0x00d6:
            int[] r3 = r7.A0W
            if (r3 == 0) goto L_0x00e6
            int r2 = r3.length
            if (r2 <= 0) goto L_0x00e6
            r7.A0P = r4
            r1 = 0
        L_0x00e0:
            r0 = r3[r1]
            if (r0 != r10) goto L_0x015d
            r7.A0P = r9
        L_0x00e6:
            int r0 = r7.A00
            r1 = 3
            if (r0 != 0) goto L_0x0156
            boolean r0 = r7.A0G
            if (r9 != r0) goto L_0x00f0
            r1 = 1
        L_0x00f0:
            r7.A00 = r1
        L_0x00f2:
            int r0 = r7.A01
            if (r0 != 0) goto L_0x0150
            boolean r0 = r7.A0O
            if (r0 != 0) goto L_0x00fc
            r7.A01 = r6
        L_0x00fc:
            X.118 r0 = r13.A09
            android.content.Context r0 = r0.A00
            X.BZ9 r6 = X.C25929Cot.A00(r0)
            X.6uE r0 = r13.A0H
            X.5qN r2 = new X.5qN
            r2.<init>(r6, r0)
            java.lang.Class<X.6uE> r0 = X.C136696uE.class
            java.lang.String r1 = r0.getName()
            android.os.Looper r0 = r6.A02
            X.CWD r5 = X.C25934Coz.A01(r0, r2, r1)
            X.Cmg r2 = r6.A00
            java.lang.Object r1 = X.C17880vN.A0p()
            java.lang.String r0 = "advertising"
            X.CWD r3 = r2.A00(r6, r1, r0)
            X.Cmg r2 = r6.A00
            X.CWx r1 = new X.CWx
            r1.<init>()
            X.DTT r0 = X.DTT.A00
            r1.A04 = r0
            r1.A01 = r3
            X.DIb r0 = new X.DIb
            r0.<init>(r5, r6, r7, r8)
            r1.A02 = r0
            X.DIg r0 = X.C26899DIg.A00
            r1.A03 = r0
            r0 = 1266(0x4f2, float:1.774E-42)
            r1.A00 = r0
            X.CPy r0 = r1.A00()
            com.google.android.gms.tasks.zzw r1 = r2.A03(r6, r0)
            X.7BG r0 = new X.7BG
            r0.<init>(r13, r4)
            r1.addOnFailureListener(r0)
            return
        L_0x0150:
            if (r0 != r9) goto L_0x0153
            r5 = 1
        L_0x0153:
            r7.A0O = r5
            goto L_0x00fc
        L_0x0156:
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            r7.A0G = r0
            goto L_0x00f2
        L_0x015d:
            int r1 = r1 + 1
            if (r1 >= r2) goto L_0x00e6
            goto L_0x00e0
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73G.A02():void");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.Bco, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.CWx, java.lang.Object] */
    public final void A03() {
        int length;
        if (!this.A04) {
            this.A04 = true;
            this.A0E.clear();
            ? obj = new Object();
            obj.A05 = false;
            obj.A06 = true;
            obj.A07 = true;
            obj.A08 = false;
            obj.A09 = true;
            obj.A0A = true;
            obj.A0B = true;
            obj.A0C = false;
            obj.A00 = 0;
            obj.A01 = 0;
            obj.A02 = 0;
            obj.A0D = true;
            obj.A0E = false;
            obj.A0F = true;
            obj.A0G = true;
            obj.A04 = A0K;
            C1593684g A0F2 = C108965cb.A0F(this);
            C138806xj r3 = new C138806xj(this);
            int[] iArr = obj.A0I;
            if (iArr == null || (length = iArr.length) <= 0) {
                BZ9 bz9 = (BZ9) A0F2;
                CWD A002 = bz9.A00.A00(bz9, r3, "discovery");
                C25829Cmg cmg = bz9.A00;
                ? obj2 = new Object();
                obj2.A04 = DTT.A00;
                obj2.A01 = A002;
                obj2.A02 = new DIZ(A002, bz9, obj);
                obj2.A03 = C26900DIh.A00;
                obj2.A00 = 1267;
                zzw A032 = cmg.A03(bz9, obj2.A00());
                A032.addOnSuccessListener(new AnonymousClass7BM(bz9, obj));
                A032.addOnFailureListener(AnonymousClass7BJ.A00);
                A032.addOnFailureListener(new AnonymousClass7BG(this, 1));
            }
            int i = 0;
            obj.A07 = false;
            obj.A06 = false;
            obj.A0A = false;
            obj.A0B = false;
            obj.A09 = false;
            do {
                int i2 = iArr[i];
                if (i2 == 2) {
                    obj.A06 = true;
                } else if (i2 != 11) {
                    if (i2 == 4) {
                        obj.A07 = true;
                    } else if (i2 == 5) {
                        obj.A09 = true;
                    } else if (i2 == 6) {
                        obj.A0B = true;
                    } else if (i2 != 7) {
                        android.util.Log.d("NearbyConnections", AnonymousClass001.A1I("Illegal discovery medium ", AnonymousClass000.A10(), i2));
                    } else {
                        obj.A0A = true;
                    }
                }
                i++;
            } while (i < length);
            BZ9 bz92 = (BZ9) A0F2;
            CWD A0022 = bz92.A00.A00(bz92, r3, "discovery");
            C25829Cmg cmg2 = bz92.A00;
            ? obj22 = new Object();
            obj22.A04 = DTT.A00;
            obj22.A01 = A0022;
            obj22.A02 = new DIZ(A0022, bz92, obj);
            obj22.A03 = C26900DIh.A00;
            obj22.A00 = 1267;
            zzw A0322 = cmg2.A03(bz92, obj22.A00());
            A0322.addOnSuccessListener(new AnonymousClass7BM(bz92, obj));
            A0322.addOnFailureListener(AnonymousClass7BJ.A00);
            A0322.addOnFailureListener(new AnonymousClass7BG(this, 1));
        }
    }

    public final void A04() {
        if (this.A04) {
            BZ9 bz9 = (BZ9) C108965cb.A0F(this);
            bz9.A00.A01(bz9, "discovery").addOnSuccessListener(new AnonymousClass7BL(bz9));
            this.A04 = false;
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.6J1, X.6nq] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.6ta, java.lang.Object] */
    public AnonymousClass73G(AnonymousClass11S r5, AnonymousClass11C r6, AnonymousClass11P r7, AnonymousClass118 r8, C19830z4 r9, AnonymousClass00H r10) {
        C18070vi.A0w(r7, r5, r8, r6, r9);
        C18070vi.A0d(r10, 6);
        this.A08 = r7;
        this.A07 = r5;
        this.A09 = r8;
        this.A0I = r6;
        this.A0A = r9;
        this.A0G = AnonymousClass1DF.A01(new C147967gg(r10, 12));
        Boolean bool = C17960vV.A01;
        HashMap A11 = C17880vN.A11();
        ? r0 = new C132906nq();
        r0.A00 = 0;
        r0.A02 = false;
        r0.A01 = A11;
        this.A0C = r0;
        this.A0B = new AnonymousClass6J2(C17880vN.A11());
        this.A06 = C108945cZ.A0S();
        ? obj = new Object();
        obj.A00 = 0.0d;
        obj.A05 = null;
        obj.A02 = null;
        obj.A04 = null;
        obj.A01 = null;
        obj.A03 = null;
        this.A02 = obj;
        this.A0D = new DecimalFormat("0.00");
        this.A0J = new C138796xi(this);
        this.A0H = new C114225qM(this);
    }

    public static final void A00(C25959CpR cpR, AnonymousClass73G r5, String str) {
        C1593684g A0F2 = C108965cb.A0F(r5);
        List A0M = C18070vi.A0M(str);
        BZ9 bz9 = (BZ9) A0F2;
        C25069CWc A002 = C25558Chw.A00();
        A002.A01 = new DIY(bz9, cpR, A0M);
        A002.A00 = 1228;
        zzw A022 = C26126Cso.A02(bz9, A002.A00(), 1);
        A022.addOnSuccessListener(new AnonymousClass7BK());
        A022.addOnFailureListener(new AnonymousClass7BH(r5, str, 0));
    }

    public final void A05(String str) {
        C1593684g A0F2 = C108965cb.A0F(this);
        BZ9 bz9 = (BZ9) A0F2;
        CWD A012 = C25934Coz.A01(bz9.A02, this.A0J, C138796xi.class.getName());
        C25069CWc A002 = C25558Chw.A00();
        A002.A01 = new DIX(A012, bz9, str);
        A002.A00 = 1227;
        C26126Cso.A02(bz9, A002.A00(), 1).addOnFailureListener(new AnonymousClass7BH(this, str, 1));
    }

    public final void A06(String str) {
        BZ9 bz9 = (BZ9) C108965cb.A0F(this);
        AnonymousClass7BF r2 = new AnonymousClass7BF(str);
        C25069CWc A002 = C25558Chw.A00();
        A002.A00 = 1229;
        A002.A01 = new DIM(r2);
        C26126Cso.A02(bz9, A002.A00(), 1);
        BZ9.A01(bz9, str);
    }
}
