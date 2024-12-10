package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.1U5  reason: invalid class name */
public class AnonymousClass1U5 {
    public WeakHashMap A00 = new WeakHashMap();
    public final AnonymousClass190 A01;
    public final AnonymousClass11S A02;
    public final C26721Tf A03;
    public final C26191Re A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass1P3 A06;
    public final AnonymousClass1RK A07;
    public final AnonymousClass1U2 A08;
    public final AnonymousClass1MR A09;
    public final C18030ve A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass1U4 A0D;
    public final C25571Os A0E;
    public final C26111Qw A0F;
    public final AnonymousClass123 A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;

    public static C33801jP A02(byte[] bArr, byte b) {
        try {
            return C63962tz.A01(A8G.A05(new byte[]{b}, bArr));
        } catch (C22511Ak e) {
            Log.e("DeviceVerificationUtil/generatePublicIdentityKey invalidKeyException", e);
            return null;
        }
    }

    public C59352mA A07(UserJid userJid, byte[] bArr) {
        C58252kO r2;
        boolean z;
        String str;
        try {
            AnonymousClass2BB r9 = (AnonymousClass2BB) C23577Bm6.A07(AnonymousClass2BB.DEFAULT_INSTANCE, bArr);
            C58252kO A0D2 = this.A06.A0D(C63962tz.A02(userJid.getPrimaryDevice()));
            if ((r9.bitField0_ & 4) != 0) {
                r2 = new C58252kO(new C33801jP(r9.accountSignatureKey_.A06()));
            } else {
                r2 = null;
            }
            int i = 2;
            if (A0D2 != null) {
                z = false;
            } else if (r2 != null) {
                z = true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("DeviceADVInfoHandler/getPublicKeyFromUserJidOrIndexList/no primary identity. userJid=");
                sb.append(userJid);
                Log.w(sb.toString());
                AnonymousClass1U2 r22 = this.A08;
                C46302Ea r1 = new C46302Ea();
                r1.A00 = 2;
                r22.A00.CC7(r1);
                return new C59352mA((C58252kO) null, (AnonymousClass2BR) null, true);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DeviceADVInfoHandler/getPublicKeyFromUserJidOrIndexList/use public key from: ");
            if (z) {
                str = "adv";
            } else {
                str = "local";
            }
            sb2.append(str);
            Log.i(sb2.toString());
            C58252kO r7 = A0D2;
            if (z) {
                r7 = r2;
            }
            if (!(A0D2 == null || r2 == null || A0D2.A00.equals(r2.A00))) {
                Log.w("DeviceADVInfoManager/verifyADVSignedKeyIndexList/identity public key mismatch");
            }
            byte[] A062 = r9.details_.A06();
            if (!C63962tz.A07(r7.A00, A8G.A05(C19620yd.A0I, A062), r9.accountSignature_.A06())) {
                Log.w("DeviceADVInfoManager/verifyADVSignedKeyIndexList/fail to verify account signature");
                AnonymousClass1U2 r23 = this.A08;
                if (!z) {
                    i = 1;
                }
                AnonymousClass2EY r12 = new AnonymousClass2EY();
                r12.A00 = Integer.valueOf(i);
                r23.A00.CC7(r12);
                return new C59352mA((C58252kO) null, (AnonymousClass2BR) null, true);
            }
            try {
                AnonymousClass2BR r0 = (AnonymousClass2BR) C23577Bm6.A07(AnonymousClass2BR.DEFAULT_INSTANCE, A062);
                if (!z) {
                    r7 = null;
                }
                return new C59352mA(r7, r0, false);
            } catch (AnonymousClass1PN e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("DeviceADVInfoManager/verifyADVSignedKeyIndexList/ADVKeyIndexList invalidProto:");
                sb3.append(e.getMessage());
                Log.e(sb3.toString());
                this.A08.A00(4);
                return null;
            }
        } catch (AnonymousClass1PN e2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("DeviceADVInfoManager/verifyADVSignedKeyIndexList/ADVSignedKeyIndexList invalidProto:");
            sb4.append(e2.getMessage());
            Log.e(sb4.toString());
            this.A08.A00(3);
            return null;
        }
    }

    public boolean A0D(DeviceJid deviceJid, C194059r6 r10, byte[] bArr, int i) {
        byte[] bArr2;
        DeviceJid deviceJid2 = deviceJid;
        if (deviceJid == null || deviceJid.getDevice() == 0 || r10 == null || r10.A00 != 1) {
            return true;
        }
        byte[] bArr3 = r10.A01;
        try {
            bArr2 = C63962tz.A01(C20065A5o.A01(((C165738bg) C23577Bm6.A02(DSQ.A01(bArr3, 1, bArr3.length - 1), C165738bg.DEFAULT_INSTANCE)).identityKey_.A06()).A00()).A00;
        } catch (C22511Ak | AnonymousClass1P8 | AnonymousClass1PN | ArrayIndexOutOfBoundsException e) {
            Log.e("DeviceVerificationUtil/extractIdentityFromCipherText/fail to get key", e);
            bArr2 = null;
        }
        return A0E(deviceJid2, bArr, bArr2, (byte) 5, i);
    }

    private C23581BmB A00(C201110w r10, UserJid userJid, Map map, Set set) {
        HashSet hashSet = new HashSet();
        boolean z = true;
        if (r10.size() > 1) {
            boolean A0O = this.A02.A0O(userJid);
            ArrayList arrayList = new ArrayList();
            AnonymousClass1IZ it = r10.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    DeviceJid deviceJid = (DeviceJid) ((Map.Entry) it.next()).getKey();
                    Object obj = map.get(C63962tz.A02(deviceJid));
                    if (obj == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DeviceADVInfoManager/getKeyHash cannot find identity key for device=");
                        sb.append(deviceJid);
                        sb.append("; isMe=");
                        sb.append(A0O);
                        Log.w(sb.toString());
                        if (A0O) {
                            break;
                        }
                        hashSet.add(deviceJid);
                    } else {
                        arrayList.add(obj);
                    }
                } else {
                    z = false;
                    if (!arrayList.isEmpty()) {
                        if (!hashSet.isEmpty() && !A0O) {
                            AnonymousClass1IZ it2 = r10.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                if (!hashSet.contains(entry.getKey())) {
                                    set.add(Integer.valueOf(((Number) entry.getValue()).intValue()));
                                }
                            }
                        }
                        try {
                            byte[] A042 = A8G.A04(A05(MessageDigest.getInstance("SHA-256"), arrayList), C18020vd.A00(C18040vf.A02, this.A0A, 310));
                            DSQ dsq = DSQ.A00;
                            return DSQ.A01(A042, 0, A042.length);
                        } catch (NoSuchAlgorithmException e) {
                            Log.e("DeviceADVInfoManager/getKeyHash no such algorithm exception", e);
                            this.A08.A04(false);
                            return null;
                        }
                    }
                }
            }
            this.A08.A04(z);
        }
        return null;
    }

    private C23581BmB A01(UserJid userJid, Set set) {
        Map A0B2;
        Set<DeviceJid> keySet;
        C58252kO A0D2;
        AnonymousClass11S r4 = this.A02;
        boolean A0O = r4.A0O(userJid);
        if (A0O) {
            A0B2 = new HashMap();
            keySet = this.A09.A0A(userJid);
        } else {
            A0B2 = this.A09.A0B(userJid);
            keySet = A0B2.keySet();
        }
        HashSet hashSet = new HashSet();
        if (keySet.size() > 1) {
            ArrayList arrayList = new ArrayList();
            for (DeviceJid deviceJid : keySet) {
                if (r4.A0Q(deviceJid)) {
                    A0D2 = this.A06.A01.A03().A01;
                } else {
                    A0D2 = this.A06.A0D(C63962tz.A02(deviceJid));
                }
                if (A0D2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DeviceADVInfoManager/getKeyHash cannot find identity key for device=");
                    sb.append(deviceJid);
                    sb.append("; isMe=");
                    sb.append(A0O);
                    Log.w(sb.toString());
                    if (A0O) {
                        this.A08.A04(true);
                    } else {
                        hashSet.add(deviceJid);
                    }
                } else {
                    arrayList.add(A0D2);
                }
            }
            if (arrayList.isEmpty()) {
                this.A08.A04(false);
                return null;
            }
            if (!hashSet.isEmpty()) {
                for (Map.Entry entry : A0B2.entrySet()) {
                    if (!hashSet.contains(entry.getKey())) {
                        set.add(Integer.valueOf(((Number) entry.getValue()).intValue()));
                    }
                }
            }
            try {
                byte[] A042 = A8G.A04(A05(MessageDigest.getInstance("SHA-256"), arrayList), C18020vd.A00(C18040vf.A02, this.A0A, 310));
                DSQ dsq = DSQ.A00;
                return DSQ.A01(A042, 0, A042.length);
            } catch (NoSuchAlgorithmException e) {
                Log.e("DeviceADVInfoManager/getKeyHash no such algorithm exception", e);
                this.A08.A04(false);
                return null;
            }
        }
        return null;
    }

    private void A03(UserJid userJid, long j) {
        AnonymousClass1MR r1 = this.A09;
        C62512rW A052 = r1.A05(userJid);
        if (A052 != null) {
            r1.A0D(r1.A04(A052, j), userJid);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceADVInfoManager/updateDeviceInfoWithExpectedTs user has no device info, user=");
        sb.append(userJid);
        Log.w(sb.toString());
    }

    public static boolean A04(AnonymousClass1U5 r12, UserJid userJid, AnonymousClass2BR r14, AnonymousClass1A3 r15, long j) {
        Object valueOf;
        long j2;
        long j3 = j;
        if (r14 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("DeviceADVInfoManager/verifyKeyIndexListData/verifyKeyIndexListData fail keyIndexListNull, userJid=");
            sb.append(userJid);
            Log.w(sb.toString());
            return false;
        }
        long j4 = r14.timestamp_;
        if (j != j4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DeviceADVInfoManager/verifyKeyIndexListData/verifyKeyIndexListData advTimestampMismatch; ts=");
            sb2.append(j3);
            sb2.append("; advts=");
            sb2.append(j4);
            Log.w(sb2.toString());
            AnonymousClass1U2 r7 = r12.A08;
            long j5 = r14.timestamp_;
            C46542Ey r1 = new C46542Ey();
            r1.A01 = Long.valueOf(j / 3600);
            r1.A00 = Long.valueOf(j5 / 3600);
            r7.A00.CC7(r1);
            return false;
        }
        AnonymousClass1MR r3 = r12.A09;
        C62512rW A052 = r3.A05(userJid);
        long A012 = AnonymousClass11P.A01(r12.A05);
        int A002 = C18020vd.A00(C18040vf.A02, r12.A0A, 730);
        if (A002 < 1) {
            A002 = 1;
        }
        if (j >= (A012 - (((long) Math.min(35, A002)) * 86400000)) / 1000 || r14.validIndexes_.size() <= 1) {
            if (A052 == null || A052.A01 != r14.rawId_) {
                Log.w("DeviceADVInfoManager/verifyKeyIndexListData/incoming key-index not matching local state, resetting");
                AnonymousClass11S r13 = r12.A02;
                if (r13.A0O(userJid) && r13.A0N()) {
                    AnonymousClass190 r4 = r12.A01;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("indexRawId=");
                    sb3.append(r14.rawId_);
                    sb3.append("; rawId=");
                    if (A052 == null) {
                        valueOf = "null";
                    } else {
                        valueOf = Integer.valueOf(A052.A01);
                    }
                    sb3.append(valueOf);
                    r4.A0G("device_self_invalid_index_list", sb3.toString(), false);
                } else if (r15.A00 == null) {
                    r3.A0E(userJid, "adv_key_index_list_validation_failed");
                }
            }
            if (r15.A00 == null) {
                return true;
            }
            C62512rW r6 = ((C54292du) ((C19760yx) r15.A00()).A00).A01;
            C201110w r42 = ((C54292du) ((C19760yx) r15.A00()).A00).A00;
            AnonymousClass11S r16 = r12.A02;
            if (!r16.A0N() || !r16.A0O(userJid)) {
                return r3.A0G(r42, r6, userJid, ((Boolean) ((C19760yx) r15.A00()).A01).booleanValue());
            }
            r3.A0D(r6, userJid);
            return r12.A07.A0C(r42, true, false);
        }
        if (A052 != null) {
            j2 = A052.A05;
        } else {
            j2 = 0;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("DeviceADVInfoManager/verifyKeyIndexListData/verifyKeyIndexListData advListTimestampInvalid; localTs=");
        sb4.append(j2);
        sb4.append("; ts=");
        sb4.append(j3);
        Log.w(sb4.toString());
        r12.A08.A03(j2, true, j3);
        return false;
    }

    public C187959ge A06(UserJid userJid) {
        C23581BmB A012;
        long A013;
        AnonymousClass2RD r15;
        UserJid userJid2 = userJid;
        HashSet hashSet = null;
        if (!C22971Dz.A0S(userJid2)) {
            AnonymousClass11S r5 = this.A02;
            r5.A0I();
            C23581BmB A014 = A01(r5.A0E, new HashSet());
            r5.A0I();
            PhoneUserJid phoneUserJid = r5.A0E;
            AnonymousClass1MR r4 = this.A09;
            long A015 = r4.A01(phoneUserJid);
            if (A014 == null && AnonymousClass11P.A01(this.A05) - (1000 * A015) >= 2592000000L) {
                A015 = 0;
            }
            boolean A0O = r5.A0O(userJid2);
            HashSet hashSet2 = new HashSet();
            if (A0O) {
                A012 = null;
            } else {
                A012 = A01(userJid2, hashSet2);
            }
            if (A0O) {
                A013 = 0;
            } else {
                A013 = r4.A01(userJid2);
                if (A012 == null && AnonymousClass11P.A01(this.A05) - (1000 * A013) >= 2592000000L) {
                    A013 = 0;
                }
            }
            if (!(A014 == null && A015 == 0 && A012 == null && A013 == 0)) {
                this.A0I.get();
                AnonymousClass2RD r14 = AnonymousClass2RD.E2EE;
                if (!hashSet2.isEmpty()) {
                    hashSet = hashSet2;
                }
                C62512rW A052 = r4.A05(userJid2);
                if (r5.A0O(userJid2) || A052 == null || A052.A00 == 0) {
                    r15 = null;
                } else {
                    r15 = AnonymousClass2RD.HOSTED;
                }
                return new C187959ge(A014, A012, r14, r15, hashSet, A015, A013);
            }
        }
        return null;
    }

    public HashMap A08(List list, Map map, Map map2, int i) {
        StringBuilder sb;
        Object obj;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            DeviceJid deviceJid = (DeviceJid) entry.getKey();
            Number number = (Number) entry.getValue();
            if (deviceJid.getDevice() == 0 || list.contains(Integer.valueOf(number.intValue()))) {
                hashMap.put(deviceJid, number);
            } else {
                AnonymousClass1U2 r0 = this.A08;
                r0.A00.CC7(new AnonymousClass2ES());
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            Number number2 = (Number) entry2.getValue();
            long longValue = number2.longValue();
            if (longValue > ((long) i)) {
                sb = new StringBuilder();
                sb.append("DevicesUtil/filterDeviceWithKeyIndexList/larger index exists in current map, jid=");
                sb.append(key);
                sb.append("; indexValue=");
                obj = number2;
            } else if (map2.containsKey(key) && ((Number) map2.get(key)).longValue() < longValue && list.contains(Integer.valueOf(number2.intValue()))) {
                sb = new StringBuilder();
                sb.append("DevicesUtil/filterDeviceWithKeyIndexList/larger index exists in current map for the same deviceJid, jid=");
                sb.append(key);
                sb.append("; index=");
                sb.append(number2);
                sb.append("; incomingIndex=");
                obj = map2.get(key);
            }
            sb.append(obj);
            sb.append("; currentIndex=");
            sb.append(i);
            Log.w(sb.toString());
        }
        return hashMap;
    }

    /* JADX WARNING: type inference failed for: r20v0, types: [X.9ge] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A09(java.util.Set r31, boolean r32) {
        /*
            r30 = this;
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r8 = r31
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x02b0
            r5 = r30
            X.11S r9 = r5.A02
            if (r32 == 0) goto L_0x0055
            X.1E2 r7 = r9.A0A()
        L_0x0017:
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>(r8)
            r12.add(r7)
            X.1MR r6 = r5.A09
            int r0 = r12.size()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r0)
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            java.util.Iterator r2 = r12.iterator()
        L_0x0033:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r1 = r2.next()
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.11S r0 = r6.A00
            boolean r0 = r0.A0O(r1)
            if (r0 == 0) goto L_0x004f
            X.2rW r0 = r6.A03()
            r4.put(r1, r0)
            goto L_0x0033
        L_0x004f:
            if (r1 == 0) goto L_0x0033
            r14.add(r1)
            goto L_0x0033
        L_0x0055:
            r9.A0I()
            com.whatsapp.jid.PhoneUserJid r7 = r9.A0E
            X.C17960vV.A07(r7)
            goto L_0x0017
        L_0x005e:
            X.1MQ r11 = r6.A03
            java.util.Iterator r2 = r14.iterator()
        L_0x0064:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r1 = r2.next()
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.11S r0 = r11.A00
            boolean r0 = r0.A0O(r1)
            r1 = r0 ^ 1
            java.lang.String r0 = "only query info for others"
            X.C17960vV.A0H(r1, r0)
            goto L_0x0064
        L_0x007e:
            X.1MN r2 = r11.A02
            X.0ve r3 = r2.A02
            r1 = 7088(0x1bb0, float:9.932E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 != 0) goto L_0x0131
            java.util.HashMap r13 = X.AnonymousClass1MN.A02(r2, r14)
        L_0x0090:
            r4.putAll(r13)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            X.11S r2 = r6.A00
            r2.A0I()
            com.whatsapp.jid.PhoneUserJid r0 = r2.A0E
            boolean r0 = r12.contains(r0)
            if (r0 != 0) goto L_0x00af
            X.1E2 r0 = r2.A09()
            boolean r0 = r12.contains(r0)
            if (r0 == 0) goto L_0x00cf
        L_0x00af:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r12)
            r2.A0I()
            com.whatsapp.jid.PhoneUserJid r13 = r2.A0E
            X.1E2 r2 = r2.A09()
            boolean r0 = r12.contains(r13)
            if (r0 == 0) goto L_0x011f
            r1.remove(r13)
            r0 = 0
            X.10w r0 = X.AnonymousClass1MR.A00(r6, r0)
            r3.put(r13, r0)
        L_0x00ce:
            r12 = r1
        L_0x00cf:
            X.1ML r0 = r11.A05
            java.util.Map r0 = r0.A03(r12)
            r3.putAll(r0)
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x00e0:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x016a
            java.lang.Object r0 = r13.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r12 = r0.getKey()
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            java.lang.Object r1 = r0.getValue()
            X.10w r1 = (X.C201110w) r1
            com.whatsapp.jid.DeviceJid r0 = r12.getPrimaryDevice()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x00e0
            X.10x r11 = new X.10x
            r11.<init>()
            r11.putAll((java.util.Map) r1)
            com.whatsapp.jid.DeviceJid r2 = r12.getPrimaryDevice()
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.put(r2, r0)
            X.10w r0 = r11.build()
            r3.put(r12, r0)
            goto L_0x00e0
        L_0x011f:
            boolean r0 = r12.contains(r2)
            if (r0 == 0) goto L_0x00ce
            r1.remove(r2)
            r0 = 1
            X.10w r0 = X.AnonymousClass1MR.A00(r6, r0)
            r3.put(r2, r0)
            goto L_0x00ce
        L_0x0131:
            X.1MK r1 = r2.A03
            java.lang.String r0 = "user_device_info"
            java.util.LinkedHashMap r3 = X.C60362nt.A01(r1, r0, r14)
            java.util.Collection r1 = r3.values()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            java.util.HashMap r2 = X.AnonymousClass1MN.A02(r2, r0)
            int r0 = r14.size()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>(r0)
            java.util.Iterator r14 = r14.iterator()
        L_0x0154:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r1 = r14.next()
            java.lang.Object r0 = r3.get(r1)
            java.lang.Object r0 = r2.get(r0)
            r13.put(r1, r0)
            goto L_0x0154
        L_0x016a:
            int r0 = r3.size()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r14 = r0.iterator()
        L_0x0180:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r12 = r14.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r0 = r12.getValue()
            X.10w r0 = (X.C201110w) r0
            int r11 = r0.size()
            java.lang.Object r0 = r12.getValue()
            X.10w r0 = (X.C201110w) r0
            X.10f r0 = r0.keySet()
            X.1IZ r13 = r0.iterator()
        L_0x01a4:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0180
            java.lang.Object r12 = r13.next()
            com.whatsapp.jid.DeviceJid r12 = (com.whatsapp.jid.DeviceJid) r12
            boolean r0 = r9.A0Q(r12)
            if (r0 == 0) goto L_0x01c8
            X.2nE r12 = X.C63962tz.A02(r12)
            X.1P3 r0 = r5.A06
            X.1PJ r0 = r0.A01
            X.2cG r0 = r0.A03()
            X.2kO r0 = r0.A01
            r2.put(r12, r0)
            goto L_0x01a4
        L_0x01c8:
            r0 = 1
            if (r11 <= r0) goto L_0x01a4
            X.2nE r0 = X.C63962tz.A02(r12)
            r1.add(r0)
            goto L_0x01a4
        L_0x01d3:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01e2
            X.1P3 r0 = r5.A06
            java.util.HashMap r0 = r0.A0L(r1)
            r2.putAll(r0)
        L_0x01e2:
            java.lang.Object r1 = r3.get(r7)
            X.C17960vV.A07(r1)
            X.10w r1 = (X.C201110w) r1
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            X.BmB r21 = r5.A00(r1, r7, r2, r0)
            java.lang.Object r0 = r4.get(r7)
            X.2rW r0 = (X.C62512rW) r0
            r26 = 0
            if (r0 != 0) goto L_0x02ac
            r0 = 0
        L_0x0200:
            if (r21 != 0) goto L_0x0215
            X.11P r7 = r5.A05
            long r13 = X.AnonymousClass11P.A01(r7)
            r11 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r0
            long r13 = r13 - r11
            r11 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x0217
        L_0x0215:
            r26 = r0
        L_0x0217:
            java.util.Iterator r19 = r8.iterator()
        L_0x021b:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x02b0
            java.lang.Object r0 = r19.next()
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            boolean r8 = r9.A0O(r0)
            r11 = 0
            if (r8 == 0) goto L_0x029e
            r22 = r11
        L_0x0235:
            r17 = 0
            if (r8 == 0) goto L_0x0277
            r28 = 0
        L_0x023b:
            if (r21 != 0) goto L_0x0247
            int r7 = (r26 > r17 ? 1 : (r26 == r17 ? 0 : -1))
            if (r7 != 0) goto L_0x0247
            if (r22 != 0) goto L_0x0247
            int r7 = (r28 > r17 ? 1 : (r28 == r17 ? 0 : -1))
            if (r7 == 0) goto L_0x0270
        L_0x0247:
            X.00H r7 = r5.A0I
            r7.get()
            X.2RD r23 = X.AnonymousClass2RD.E2EE
            boolean r7 = r1.isEmpty()
            if (r7 != 0) goto L_0x0255
            r11 = r1
        L_0x0255:
            X.2rW r1 = r6.A05(r0)
            boolean r7 = r9.A0O(r0)
            if (r7 != 0) goto L_0x0274
            if (r1 == 0) goto L_0x0274
            int r1 = r1.A00
            if (r1 == 0) goto L_0x0274
            X.2RD r24 = X.AnonymousClass2RD.HOSTED
        L_0x0267:
            X.9ge r20 = new X.9ge
            r25 = r11
            r20.<init>(r21, r22, r23, r24, r25, r26, r28)
            r11 = r20
        L_0x0270:
            r10.put(r0, r11)
            goto L_0x021b
        L_0x0274:
            r24 = 0
            goto L_0x0267
        L_0x0277:
            java.lang.Object r7 = r4.get(r0)
            X.2rW r7 = (X.C62512rW) r7
            r28 = 0
            if (r7 != 0) goto L_0x029b
            r7 = 0
        L_0x0283:
            if (r22 != 0) goto L_0x0298
            X.11P r12 = r5.A05
            long r15 = X.AnonymousClass11P.A01(r12)
            r12 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 * r7
            long r15 = r15 - r12
            r13 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r12 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x023b
        L_0x0298:
            r28 = r7
            goto L_0x023b
        L_0x029b:
            long r7 = r7.A05
            goto L_0x0283
        L_0x029e:
            java.lang.Object r7 = r3.get(r0)
            X.C17960vV.A07(r7)
            X.10w r7 = (X.C201110w) r7
            X.BmB r22 = r5.A00(r7, r0, r2, r1)
            goto L_0x0235
        L_0x02ac:
            long r0 = r0.A05
            goto L_0x0200
        L_0x02b0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1U5.A09(java.util.Set, boolean):java.util.HashMap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.C187959ge r23, com.whatsapp.jid.DeviceJid r24, com.whatsapp.jid.UserJid r25) {
        /*
            r22 = this;
            r0 = r24
            com.whatsapp.jid.UserJid r2 = r0.userJid
            int r0 = r0.getDevice()
            r3 = 0
            if (r0 != 0) goto L_0x000c
            r3 = 1
        L_0x000c:
            r0 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r8 = 1
            r5 = r22
            r6 = r23
            r0 = r25
            if (r3 == 0) goto L_0x006c
            X.DSQ r1 = r6.A03
            if (r1 != 0) goto L_0x006c
            long r12 = r6.A01
            X.1MR r4 = r5.A09
            long r9 = r4.A01(r2)
            int r1 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x006c
            X.11S r1 = r5.A02
            boolean r3 = r1.A0O(r2)
            if (r3 == 0) goto L_0x0041
            boolean r3 = r1.A0N()
            if (r3 == 0) goto L_0x0041
            X.1Tf r1 = r5.A03
            java.lang.String r0 = "invalid_adv_status"
            r1.A02(r0, r8, r8)
        L_0x0040:
            return
        L_0x0041:
            java.lang.String r3 = "DeviceADVInfoHandler/handleADVMetadata hash is null, try to remove all devices"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.2rW r8 = r4.A05(r2)
            com.whatsapp.jid.DeviceJid r3 = r2.getPrimaryDevice()
            X.10w r3 = X.C201110w.of(r3, r7)
            if (r8 != 0) goto L_0x005a
            r9 = 0
        L_0x0055:
            r8 = 0
            r4.A0G(r3, r9, r2, r8)
            goto L_0x00bd
        L_0x005a:
            int r10 = r8.A01
            r8 = 1
            long r12 = r12 + r8
            r14 = 0
            r11 = 0
            X.2rW r9 = new X.2rW
            r18 = r14
            r16 = r14
            r9.<init>((int) r10, (int) r11, (long) r12, (long) r14, (long) r16, (long) r18)
            goto L_0x0055
        L_0x006c:
            X.11S r1 = r5.A02
            boolean r3 = r1.A0O(r2)
            if (r3 == 0) goto L_0x007a
            boolean r3 = r1.A0N()
            if (r3 == 0) goto L_0x00bd
        L_0x007a:
            long r3 = r6.A01
            X.1MR r9 = r5.A09
            long r11 = r9.A01(r2)
            int r10 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00bd
            boolean r10 = r1.A0O(r2)
            if (r10 != 0) goto L_0x00eb
            X.2RD r12 = r6.A05
            X.2RD r10 = X.AnonymousClass2RD.HOSTED
            if (r12 != r10) goto L_0x00eb
            X.2RD r11 = r9.A06(r2)
            X.2RD r10 = X.AnonymousClass2RD.E2EE
            if (r11 != r10) goto L_0x00eb
            com.whatsapp.jid.DeviceJid r3 = r2.getPrimaryDevice()
            X.10w r3 = X.C201110w.of(r3, r7)
            r13 = 0
            r14 = 0
            X.2rW r11 = new X.2rW
            r18 = r14
            r20 = r14
            r16 = r14
            r11.<init>((X.AnonymousClass2RD) r12, (int) r13, (long) r14, (long) r16, (long) r18, (long) r20)
            r9.A0G(r3, r11, r2, r13)
            X.1Re r9 = r5.A04
            com.whatsapp.jid.UserJid[] r4 = new com.whatsapp.jid.UserJid[r8]
            r4[r13] = r25
            r3 = 3
            r9.A01(r4, r3)
        L_0x00bd:
            boolean r3 = r1.A0O(r0)
            if (r3 == 0) goto L_0x00ef
            long r3 = r6.A00
            X.1MR r11 = r5.A09
            long r9 = r11.A01(r0)
            int r8 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x00ef
            java.util.HashSet r3 = r11.A0A(r0)
            int r4 = r3.size()
            r3 = 1
            if (r4 <= r3) goto L_0x00ef
            boolean r3 = r1.A0N()
            if (r3 != 0) goto L_0x00ef
            java.lang.String r0 = "DeviceADVInfoHandler/handleADVMetadata detect larger self timestamp, mark the list as dirty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1U4 r0 = r5.A0D
            r0.A03()
            return
        L_0x00eb:
            r5.A03(r2, r3)
            goto L_0x00bd
        L_0x00ef:
            if (r25 == 0) goto L_0x0040
            boolean r3 = r1.A0O(r0)
            if (r3 == 0) goto L_0x0103
            boolean r3 = r1.A0N()
            if (r3 == 0) goto L_0x0040
            boolean r3 = r1.A0O(r2)
            if (r3 == 0) goto L_0x0040
        L_0x0103:
            long r3 = r6.A00
            X.1MR r8 = r5.A09
            long r10 = r8.A01(r0)
            int r9 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0040
            X.2RD r9 = r6.A04
            X.2RD r6 = X.AnonymousClass2RD.HOSTED
            if (r9 != r6) goto L_0x012c
            boolean r6 = r1.A0O(r2)
            if (r6 == 0) goto L_0x0153
            boolean r1 = r1.A0O(r0)
            if (r1 != 0) goto L_0x0153
            X.2rW r1 = r8.A05(r0)
            r11 = 1
            if (r1 == 0) goto L_0x0130
            int r1 = r1.A00
            if (r1 != r11) goto L_0x0130
        L_0x012c:
            r5.A03(r0, r3)
            return
        L_0x0130:
            com.whatsapp.jid.DeviceJid r1 = r0.getPrimaryDevice()
            X.10w r1 = X.C201110w.of(r1, r7)
            r12 = 0
            r10 = 0
            X.2rW r9 = new X.2rW
            r16 = r12
            r18 = r12
            r14 = r12
            r9.<init>((int) r10, (int) r11, (long) r12, (long) r14, (long) r16, (long) r18)
            r8.A0G(r1, r9, r0, r10)
            X.1Re r6 = r5.A04
            com.whatsapp.jid.UserJid[] r2 = new com.whatsapp.jid.UserJid[r11]
            r2[r10] = r25
            r1 = 3
            r6.A01(r2, r1)
            goto L_0x012c
        L_0x0153:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "DeviceADVInfoHandler/handleADVMetadataReceiverAccountType: receiver account type from incorrect sender id: "
            r6.append(r1)
            r6.append(r2)
            java.lang.String r1 = " recipient: "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r1 = r6.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x012c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1U5.A0A(X.9ge, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.UserJid):void");
    }

    public void A0C(UserJid userJid, long j) {
        if (j - (AnonymousClass11P.A01(this.A05) / 1000) > 5184000) {
            StringBuilder sb = new StringBuilder();
            sb.append("DeviceADVInfoHandler/removeDeviceInfoIfTimestampIsInvalid invalid local timestamp ts=");
            sb.append(j);
            Log.e(sb.toString());
            this.A09.A0E(userJid, "adv_key_index_list_validation_failed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x026e, code lost:
        if (((java.lang.Long) r12.get(r9)).longValue() != ((long) r4.keyIndex_)) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03d7, code lost:
        if (r9 > 0) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0204, code lost:
        if (new X.C58252kO(r3).equals(r0) == false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0215, code lost:
        if (r24.A0P(r9) == false) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023a, code lost:
        if (r10.A01 != r4.rawId_) goto L_0x023c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x063b A[Catch:{ all -> 0x0489, all -> 0x0711 }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0648 A[Catch:{ all -> 0x0489, all -> 0x0711 }] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x068d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(com.whatsapp.jid.DeviceJid r39, byte[] r40, byte[] r41, byte r42, int r43) {
        /*
            r38 = this;
            r11 = r43
            r8 = r38
            X.1Os r0 = r8.A0E
            r9 = r39
            X.3Ez r26 = r0.A08(r9)
            int r1 = r9.getDevice()     // Catch:{ all -> 0x0711 }
            r0 = 0
            if (r1 != 0) goto L_0x0014
            r0 = 1
        L_0x0014:
            r7 = 1
            if (r0 != 0) goto L_0x070b
            r6 = 0
            r1 = r40
            if (r40 != 0) goto L_0x0028
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/null deviceADVInfo"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            X.1U2 r0 = r8.A08     // Catch:{ all -> 0x0711 }
            r0.A01(r11, r6)     // Catch:{ all -> 0x0711 }
            goto L_0x0705
        L_0x0028:
            r3 = r41
            if (r41 != 0) goto L_0x0038
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/null identity"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            X.1U2 r0 = r8.A08     // Catch:{ all -> 0x0711 }
            r0.A01(r11, r7)     // Catch:{ all -> 0x0711 }
            goto L_0x0705
        L_0x0038:
            X.1RK r0 = r8.A07     // Catch:{ all -> 0x0711 }
            r25 = r0
            boolean r0 = r0.A0D(r9)     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/message from device in progress of login"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            goto L_0x0705
        L_0x0049:
            X.1MR r5 = r8.A09     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.UserJid r0 = r9.userJid     // Catch:{ all -> 0x0711 }
            java.util.HashSet r0 = r5.A0A(r0)     // Catch:{ all -> 0x0711 }
            boolean r0 = r0.contains(r9)     // Catch:{ all -> 0x0711 }
            r2 = r42
            if (r0 == 0) goto L_0x007b
            X.1P3 r4 = r8.A06     // Catch:{ all -> 0x0711 }
            X.2nE r0 = X.C63962tz.A02(r9)     // Catch:{ all -> 0x0711 }
            X.2kO r10 = r4.A0D(r0)     // Catch:{ all -> 0x0711 }
            X.1jP r4 = A02(r3, r2)     // Catch:{ all -> 0x0711 }
            if (r4 == 0) goto L_0x007b
            X.2kO r0 = new X.2kO     // Catch:{ all -> 0x0711 }
            r0.<init>(r4)     // Catch:{ all -> 0x0711 }
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/already have device"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            goto L_0x070b
        L_0x007b:
            X.11S r0 = r8.A02     // Catch:{ all -> 0x0711 }
            r24 = r0
            boolean r0 = r0.A0P(r9)     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x00a9
            boolean r0 = r24.A0N()     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x00a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0711 }
            r1.<init>()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/unexpected self device, jid="
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            r1.append(r9)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0711 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r1 = "unknown_companion"
            r0 = r25
            r0.A09(r9, r1, r6, r6)     // Catch:{ all -> 0x0711 }
            goto L_0x0705
        L_0x00a9:
            X.2BI r0 = X.AnonymousClass2BI.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x06e7 }
            X.Bm6 r10 = X.C23577Bm6.A07(r0, r1)     // Catch:{ 1PN -> 0x06e7 }
            X.2BI r10 = (X.AnonymousClass2BI) r10     // Catch:{ 1PN -> 0x06e7 }
            X.DSQ r1 = r10.details_     // Catch:{ 1PN -> 0x06c7 }
            X.2BM r0 = X.AnonymousClass2BM.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x06c7 }
            X.Bm6 r4 = X.C23577Bm6.A02(r1, r0)     // Catch:{ 1PN -> 0x06c7 }
            X.2BM r4 = (X.AnonymousClass2BM) r4     // Catch:{ 1PN -> 0x06c7 }
            X.DSQ r0 = r10.accountSignatureKey_     // Catch:{ all -> 0x0711 }
            byte[] r1 = r0.A06()     // Catch:{ all -> 0x0711 }
            int r0 = r1.length     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x00c9
            X.1jP r14 = A02(r1, r2)     // Catch:{ all -> 0x0711 }
            goto L_0x00dd
        L_0x00c9:
            X.1P3 r1 = r8.A06     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.UserJid r0 = r9.userJid     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()     // Catch:{ all -> 0x0711 }
            X.2nE r0 = X.C63962tz.A02(r0)     // Catch:{ all -> 0x0711 }
            X.2kO r0 = r1.A0D(r0)     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x0691
            X.1jP r14 = r0.A00     // Catch:{ all -> 0x0711 }
        L_0x00dd:
            if (r14 == 0) goto L_0x0691
            int r0 = r4.deviceType_     // Catch:{ all -> 0x0711 }
            X.2RD r0 = X.AnonymousClass2RD.A00(r0)     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x00e9
            X.2RD r0 = X.AnonymousClass2RD.E2EE     // Catch:{ all -> 0x0711 }
        L_0x00e9:
            X.2RD r1 = X.AnonymousClass2RD.HOSTED     // Catch:{ all -> 0x0711 }
            if (r0 != r1) goto L_0x0122
            int r0 = r4.accountType_     // Catch:{ all -> 0x0711 }
            X.2RD r12 = X.AnonymousClass2RD.A00(r0)     // Catch:{ all -> 0x0711 }
            if (r12 != 0) goto L_0x00f7
            X.2RD r12 = X.AnonymousClass2RD.E2EE     // Catch:{ all -> 0x0711 }
        L_0x00f7:
            X.2RD r0 = X.AnonymousClass2RD.E2EE     // Catch:{ all -> 0x0711 }
            if (r12 != r0) goto L_0x0122
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/account and device encryption type mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            X.1U2 r0 = r8.A08     // Catch:{ all -> 0x0711 }
            X.2EQ r2 = new X.2EQ     // Catch:{ all -> 0x0711 }
            r2.<init>()     // Catch:{ all -> 0x0711 }
            X.18K r0 = r0.A00     // Catch:{ all -> 0x0711 }
        L_0x0109:
            r0.CC7(r2)     // Catch:{ all -> 0x0711 }
        L_0x010c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0711 }
            r1.<init>()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/signature verification fail, deviceJid="
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            r1.append(r9)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0711 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            goto L_0x0705
        L_0x0122:
            byte[] r22 = r4.A0M()     // Catch:{ all -> 0x0711 }
            X.DSQ r0 = r10.accountSignature_     // Catch:{ all -> 0x0711 }
            byte[] r21 = r0.A06()     // Catch:{ all -> 0x0711 }
            X.DSQ r0 = r10.deviceSignature_     // Catch:{ all -> 0x0711 }
            byte[] r20 = r0.A06()     // Catch:{ all -> 0x0711 }
            X.1jP r10 = A02(r3, r2)     // Catch:{ all -> 0x0711 }
            if (r10 != 0) goto L_0x0143
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/invalid companion public key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            X.1U2 r0 = r8.A08     // Catch:{ all -> 0x0711 }
            r0.A01(r11, r7)     // Catch:{ all -> 0x0711 }
            goto L_0x010c
        L_0x0143:
            byte[] r15 = X.C19620yd.A0E     // Catch:{ all -> 0x0711 }
            X.00H r0 = r8.A0B     // Catch:{ all -> 0x0711 }
            r23 = r0
            java.lang.Object r0 = r23.get()     // Catch:{ all -> 0x0711 }
            X.2Zm r0 = (X.C51752Zm) r0     // Catch:{ all -> 0x0711 }
            X.0ve r12 = r0.A00     // Catch:{ all -> 0x0711 }
            r13 = 6939(0x1b1b, float:9.724E-42)
            X.0vf r19 = X.C18040vf.A02     // Catch:{ all -> 0x0711 }
            r0 = r19
            boolean r0 = X.C18020vd.A05(r0, r12, r13)     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x0169
            int r0 = r4.deviceType_     // Catch:{ all -> 0x0711 }
            X.2RD r0 = X.AnonymousClass2RD.A00(r0)     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x0169
            if (r0 != r1) goto L_0x0169
            byte[] r15 = X.C19620yd.A0F     // Catch:{ all -> 0x0711 }
        L_0x0169:
            r12 = 3
            byte[][] r0 = new byte[r12][]     // Catch:{ all -> 0x0711 }
            r0[r6] = r15     // Catch:{ all -> 0x0711 }
            r0[r7] = r22     // Catch:{ all -> 0x0711 }
            r18 = 2
            r0[r18] = r41     // Catch:{ all -> 0x0711 }
            byte[] r17 = X.A8G.A05(r0)     // Catch:{ all -> 0x0711 }
            byte[] r16 = X.C19620yd.A0G     // Catch:{ all -> 0x0711 }
            java.lang.Object r0 = r23.get()     // Catch:{ all -> 0x0711 }
            X.2Zm r0 = (X.C51752Zm) r0     // Catch:{ all -> 0x0711 }
            X.0ve r0 = r0.A00     // Catch:{ all -> 0x0711 }
            r15 = r19
            boolean r0 = X.C18020vd.A05(r15, r0, r13)     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x0196
            int r0 = r4.deviceType_     // Catch:{ all -> 0x0711 }
            X.2RD r0 = X.AnonymousClass2RD.A00(r0)     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x0196
            if (r0 != r1) goto L_0x0196
            byte[] r16 = X.C19620yd.A0H     // Catch:{ all -> 0x0711 }
        L_0x0196:
            r0 = 4
            byte[][] r0 = new byte[r0][]     // Catch:{ all -> 0x0711 }
            r0[r6] = r16     // Catch:{ all -> 0x0711 }
            r0[r7] = r22     // Catch:{ all -> 0x0711 }
            r0[r18] = r41     // Catch:{ all -> 0x0711 }
            byte[] r3 = r14.A00     // Catch:{ all -> 0x0711 }
            r0[r12] = r3     // Catch:{ all -> 0x0711 }
            byte[] r13 = X.A8G.A05(r0)     // Catch:{ all -> 0x0711 }
            r12 = r17
            r0 = r21
            boolean r0 = X.C63962tz.A07(r14, r12, r0)     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x01c7
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/fail to verify account signature"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            X.1U2 r1 = r8.A08     // Catch:{ all -> 0x0711 }
            X.2EX r2 = new X.2EX     // Catch:{ all -> 0x0711 }
            r2.<init>()     // Catch:{ all -> 0x0711 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0711 }
        L_0x01c1:
            r2.A00 = r0     // Catch:{ all -> 0x0711 }
            X.18K r0 = r1.A00     // Catch:{ all -> 0x0711 }
            goto L_0x0109
        L_0x01c7:
            r0 = r20
            boolean r0 = X.C63962tz.A07(r10, r13, r0)     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x01e0
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/fail to verify device signature"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            X.1U2 r1 = r8.A08     // Catch:{ all -> 0x0711 }
            X.2EX r2 = new X.2EX     // Catch:{ all -> 0x0711 }
            r2.<init>()     // Catch:{ all -> 0x0711 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x0711 }
            goto L_0x01c1
        L_0x01e0:
            com.whatsapp.jid.UserJid r13 = r9.userJid     // Catch:{ all -> 0x0711 }
            X.2rW r10 = r5.A05(r13)     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.DeviceJid r0 = r13.getPrimaryDevice()     // Catch:{ all -> 0x0711 }
            X.1P3 r12 = r8.A06     // Catch:{ all -> 0x0711 }
            X.2nE r0 = X.C63962tz.A02(r0)     // Catch:{ all -> 0x0711 }
            X.2kO r0 = r12.A0D(r0)     // Catch:{ all -> 0x0711 }
            X.1jP r3 = A02(r3, r2)     // Catch:{ all -> 0x0711 }
            if (r3 == 0) goto L_0x0206
            X.2kO r2 = new X.2kO     // Catch:{ all -> 0x0711 }
            r2.<init>(r3)     // Catch:{ all -> 0x0711 }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0711 }
            r15 = 1
            if (r0 != 0) goto L_0x0207
        L_0x0206:
            r15 = 0
        L_0x0207:
            boolean r0 = r24.A0N()     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x0217
            r0 = r24
            boolean r0 = r0.A0P(r9)     // Catch:{ all -> 0x0711 }
            r18 = 1
            if (r0 != 0) goto L_0x0219
        L_0x0217:
            r18 = 0
        L_0x0219:
            if (r10 != 0) goto L_0x021c
            goto L_0x0223
        L_0x021c:
            int r0 = r10.A00     // Catch:{ all -> 0x0711 }
            if (r0 == r7) goto L_0x0225
            X.2RD r1 = X.AnonymousClass2RD.E2EE     // Catch:{ all -> 0x0711 }
            goto L_0x0225
        L_0x0223:
            X.2RD r1 = X.AnonymousClass2RD.E2EE     // Catch:{ all -> 0x0711 }
        L_0x0225:
            int r0 = r4.accountType_     // Catch:{ all -> 0x0711 }
            X.2RD r0 = X.AnonymousClass2RD.A00(r0)     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x022f
            X.2RD r0 = X.AnonymousClass2RD.E2EE     // Catch:{ all -> 0x0711 }
        L_0x022f:
            r2 = 0
            if (r1 != r0) goto L_0x0233
            r2 = 1
        L_0x0233:
            if (r10 == 0) goto L_0x023c
            int r3 = r10.A01     // Catch:{ all -> 0x0711 }
            int r0 = r4.rawId_     // Catch:{ all -> 0x0711 }
            r1 = 1
            if (r3 == r0) goto L_0x023d
        L_0x023c:
            r1 = 0
        L_0x023d:
            java.lang.String r17 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity"
            java.lang.String r16 = "; keyIndex"
            if (r15 == 0) goto L_0x04a3
            if (r1 == 0) goto L_0x04a3
            if (r2 == 0) goto L_0x04a3
            if (r18 == 0) goto L_0x024a
            goto L_0x024f
        L_0x024a:
            java.util.Map r12 = r5.A0B(r13)     // Catch:{ all -> 0x0711 }
            goto L_0x0258
        L_0x024f:
            X.10w r0 = X.AnonymousClass1MR.A00(r5, r6)     // Catch:{ all -> 0x0711 }
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ all -> 0x0711 }
            r12.<init>(r0)     // Catch:{ all -> 0x0711 }
        L_0x0258:
            boolean r0 = r12.containsKey(r9)     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x0270
            java.lang.Object r0 = r12.get(r9)     // Catch:{ all -> 0x0711 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0711 }
            long r14 = r0.longValue()     // Catch:{ all -> 0x0711 }
            int r0 = r4.keyIndex_     // Catch:{ all -> 0x0711 }
            long r0 = (long) r0     // Catch:{ all -> 0x0711 }
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            r15 = 1
            if (r2 == 0) goto L_0x0271
        L_0x0270:
            r15 = 0
        L_0x0271:
            long r2 = r10.A05     // Catch:{ all -> 0x0711 }
            long r0 = r4.timestamp_     // Catch:{ all -> 0x0711 }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 < 0) goto L_0x027d
            if (r15 != 0) goto L_0x027d
            goto L_0x055a
        L_0x027d:
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x0292
            X.2rW r10 = r5.A04(r10, r0)     // Catch:{ all -> 0x0711 }
            r5.A0D(r10, r13)     // Catch:{ all -> 0x0711 }
            X.1Re r2 = r8.A04     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r7]     // Catch:{ all -> 0x0711 }
            r1[r6] = r13     // Catch:{ all -> 0x0711 }
            r0 = 3
            r2.A01(r1, r0)     // Catch:{ all -> 0x0711 }
        L_0x0292:
            if (r15 != 0) goto L_0x068a
            if (r18 == 0) goto L_0x02b3
            X.10x r2 = new X.10x     // Catch:{ all -> 0x0711 }
            r2.<init>()     // Catch:{ all -> 0x0711 }
            r2.putAll((java.util.Map) r12)     // Catch:{ all -> 0x0711 }
            int r0 = r4.keyIndex_     // Catch:{ all -> 0x0711 }
            long r0 = (long) r0     // Catch:{ all -> 0x0711 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0711 }
            r2.put(r9, r0)     // Catch:{ all -> 0x0711 }
            X.10w r1 = r2.build()     // Catch:{ all -> 0x0711 }
            r0 = r25
            r0.A0C(r1, r6, r6)     // Catch:{ all -> 0x0711 }
            goto L_0x068a
        L_0x02b3:
            com.whatsapp.jid.UserJid r2 = r9.userJid     // Catch:{ all -> 0x0711 }
            int r0 = r4.keyIndex_     // Catch:{ all -> 0x0711 }
            long r0 = (long) r0     // Catch:{ all -> 0x0711 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0711 }
            X.10w r0 = X.C201110w.of(r9, r0)     // Catch:{ all -> 0x0711 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0711 }
            r4.<init>(r0)     // Catch:{ all -> 0x0711 }
            X.1MQ r3 = r5.A03     // Catch:{ all -> 0x0711 }
            X.10w r0 = r3.A05(r2)     // Catch:{ all -> 0x0711 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0711 }
            r8.<init>(r0)     // Catch:{ all -> 0x0711 }
            java.util.Set r0 = r8.keySet()     // Catch:{ all -> 0x0711 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0711 }
        L_0x02d8:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x02e6
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0711 }
            r4.remove(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x02d8
        L_0x02e6:
            r5.A0F(r2, r4)     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.DeviceJid r0 = r2.getPrimaryDevice()     // Catch:{ all -> 0x0711 }
            boolean r0 = r8.containsKey(r0)     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x0314
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0711 }
            r1.<init>()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "UserDeviceManager/addDevicesForUser/no primary device for this user, jid="
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            r1.append(r2)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0711 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.DeviceJid r8 = r2.getPrimaryDevice()     // Catch:{ all -> 0x0711 }
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0711 }
            r4.put(r8, r0)     // Catch:{ all -> 0x0711 }
        L_0x0314:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x068a
            java.util.Set r0 = r4.keySet()     // Catch:{ all -> 0x0711 }
            boolean r0 = X.C62832s4.A02(r0)     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x032f
            int r0 = r10.A00     // Catch:{ all -> 0x0711 }
            if (r0 == r7) goto L_0x032f
            java.lang.String r0 = "DeviceManager/refreshDevicesForUser cannot add hosted device with adv e2ee"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            goto L_0x068a
        L_0x032f:
            X.10w r8 = X.C201110w.copyOf((java.util.Map) r4)     // Catch:{ all -> 0x0711 }
            X.11S r0 = r3.A00     // Catch:{ all -> 0x0711 }
            boolean r0 = r0.A0O(r2)     // Catch:{ all -> 0x0711 }
            r1 = r0 ^ 1
            java.lang.String r0 = "only add new device for others"
            X.C17960vV.A0H(r1, r0)     // Catch:{ all -> 0x0711 }
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x048e
            X.1Ln r0 = r3.A03     // Catch:{ all -> 0x0711 }
            java.util.Set r25 = r0.A0M(r2)     // Catch:{ all -> 0x0711 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0711 }
            r7.<init>()     // Catch:{ all -> 0x0711 }
            r8.size()     // Catch:{ all -> 0x0711 }
            X.1Cd r0 = r3.A01     // Catch:{ all -> 0x0711 }
            X.1au r24 = r0.A05()     // Catch:{ all -> 0x0711 }
            X.1xA r23 = r24.BD0()     // Catch:{ all -> 0x0484 }
            java.util.Iterator r22 = r25.iterator()     // Catch:{ all -> 0x047a }
        L_0x0362:
            boolean r0 = r22.hasNext()     // Catch:{ all -> 0x047a }
            if (r0 == 0) goto L_0x0448
            java.lang.Object r11 = r22.next()     // Catch:{ all -> 0x047a }
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11     // Catch:{ all -> 0x047a }
            X.10w r0 = r3.A05(r11)     // Catch:{ all -> 0x047a }
            X.10f r21 = r0.keySet()     // Catch:{ all -> 0x047a }
            r0 = r21
            r7.put(r11, r0)     // Catch:{ all -> 0x047a }
            X.10w r20 = X.C63442t5.A00(r8, r11)     // Catch:{ all -> 0x047a }
            X.1ML r14 = r3.A05     // Catch:{ all -> 0x047a }
            java.lang.String r13 = "; keyIndex="
            X.1Cd r0 = r14.A02     // Catch:{ all -> 0x047a }
            X.1au r10 = r0.A05()     // Catch:{ all -> 0x047a }
            X.1xA r19 = r10.BD0()     // Catch:{ all -> 0x043e }
            X.10f r0 = r20.entrySet()     // Catch:{ all -> 0x0434 }
            X.1IZ r18 = r0.iterator()     // Catch:{ all -> 0x0434 }
        L_0x0395:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0434 }
            if (r0 == 0) goto L_0x0412
            java.lang.Object r9 = r18.next()     // Catch:{ all -> 0x0434 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ all -> 0x0434 }
            java.lang.Object r0 = r9.getKey()     // Catch:{ all -> 0x0434 }
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0     // Catch:{ all -> 0x0434 }
            int r1 = r0.getDevice()     // Catch:{ all -> 0x0434 }
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ all -> 0x0434 }
            com.whatsapp.jid.DeviceJid r15 = r0.A04(r11, r1)     // Catch:{ all -> 0x0434 }
            r1 = 0
            if (r15 == 0) goto L_0x03b5
            r1 = 1
        L_0x03b5:
            java.lang.String r0 = "DeviceJid must not be null"
            X.C17960vV.A0F(r1, r0)     // Catch:{ all -> 0x0434 }
            if (r15 == 0) goto L_0x0395
            java.lang.Object r0 = r9.getValue()     // Catch:{ all -> 0x0434 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0434 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0434 }
            int r9 = r15.getDevice()     // Catch:{ all -> 0x0434 }
            r12 = 0
            if (r9 != 0) goto L_0x03ce
            r12 = 1
        L_0x03ce:
            r16 = 0
            int r9 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r12 == 0) goto L_0x03d7
            if (r9 == 0) goto L_0x03d9
            goto L_0x03dd
        L_0x03d7:
            if (r9 <= 0) goto L_0x03dd
        L_0x03d9:
            r14.A05(r15, r11, r0)     // Catch:{ all -> 0x0434 }
            goto L_0x0395
        L_0x03dd:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0434 }
            r12.<init>()     // Catch:{ all -> 0x0434 }
            java.lang.String r9 = "invalid devices jid="
            r12.append(r9)     // Catch:{ all -> 0x0434 }
            r12.append(r15)     // Catch:{ all -> 0x0434 }
            r12.append(r13)     // Catch:{ all -> 0x0434 }
            r12.append(r0)     // Catch:{ all -> 0x0434 }
            java.lang.String r9 = r12.toString()     // Catch:{ all -> 0x0434 }
            X.C17960vV.A0F(r6, r9)     // Catch:{ all -> 0x0434 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0434 }
            r12.<init>()     // Catch:{ all -> 0x0434 }
            java.lang.String r9 = "DeviceStore/addDevicesForUser/invalid devices jid="
            r12.append(r9)     // Catch:{ all -> 0x0434 }
            r12.append(r15)     // Catch:{ all -> 0x0434 }
            r12.append(r13)     // Catch:{ all -> 0x0434 }
            r12.append(r0)     // Catch:{ all -> 0x0434 }
            java.lang.String r0 = r12.toString()     // Catch:{ all -> 0x0434 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0434 }
            goto L_0x0395
        L_0x0412:
            r19.A00()     // Catch:{ all -> 0x0434 }
            X.AnonymousClass1ML.A02(r10, r14, r11)     // Catch:{ all -> 0x0434 }
            r19.close()     // Catch:{ all -> 0x043e }
            r10.close()     // Catch:{ all -> 0x047a }
            X.10f r13 = r20.keySet()     // Catch:{ all -> 0x047a }
            X.10f r14 = X.C199410f.of()     // Catch:{ all -> 0x047a }
            r18 = r6
            r12 = r21
            r15 = r3
            r16 = r11
            r17 = r6
            X.AnonymousClass1MQ.A02(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x047a }
            goto L_0x0362
        L_0x0434:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0439 }
            goto L_0x043d
        L_0x0439:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x043e }
        L_0x043d:
            throw r1     // Catch:{ all -> 0x043e }
        L_0x043e:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0443 }
            goto L_0x0447
        L_0x0443:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x047a }
        L_0x0447:
            throw r1     // Catch:{ all -> 0x047a }
        L_0x0448:
            r23.A00()     // Catch:{ all -> 0x047a }
            r23.close()     // Catch:{ all -> 0x0484 }
            r24.close()     // Catch:{ all -> 0x0711 }
            java.util.Iterator r10 = r25.iterator()     // Catch:{ all -> 0x0711 }
        L_0x0455:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x048e
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ all -> 0x0711 }
            java.lang.Object r6 = r7.get(r9)     // Catch:{ all -> 0x0711 }
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x0711 }
            X.10f r6 = (X.C199410f) r6     // Catch:{ all -> 0x0711 }
            X.10w r0 = X.C63442t5.A00(r8, r9)     // Catch:{ all -> 0x0711 }
            X.10f r1 = r0.keySet()     // Catch:{ all -> 0x0711 }
            X.10f r0 = X.C199410f.of()     // Catch:{ all -> 0x0711 }
            X.AnonymousClass1MQ.A01(r6, r1, r0, r3, r9)     // Catch:{ all -> 0x0711 }
            goto L_0x0455
        L_0x047a:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x047f }
            goto L_0x0483
        L_0x047f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0484 }
        L_0x0483:
            throw r1     // Catch:{ all -> 0x0484 }
        L_0x0484:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x0489 }
            goto L_0x048d
        L_0x0489:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0711 }
        L_0x048d:
            throw r1     // Catch:{ all -> 0x0711 }
        L_0x048e:
            X.00H r0 = r5.A04     // Catch:{ all -> 0x0711 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0711 }
            X.2LS r3 = (X.AnonymousClass2LS) r3     // Catch:{ all -> 0x0711 }
            java.util.Set r1 = r4.keySet()     // Catch:{ all -> 0x0711 }
            java.util.Set r0 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0711 }
            r3.A00(r2, r1, r0)     // Catch:{ all -> 0x0711 }
            goto L_0x068a
        L_0x04a3:
            if (r18 == 0) goto L_0x04da
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0711 }
            r3.<init>()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/raw_id or primary public key for own companion device doesn't match in companion mode, device="
            r3.append(r0)     // Catch:{ all -> 0x0711 }
            r3.append(r9)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "pkMatch"
            r3.append(r0)     // Catch:{ all -> 0x0711 }
            r3.append(r15)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "; accountEncryptionTypeMatch"
            r3.append(r0)     // Catch:{ all -> 0x0711 }
            r3.append(r2)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "; rawIdMatch"
            r3.append(r0)     // Catch:{ all -> 0x0711 }
            r3.append(r1)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0711 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            X.1Tf r1 = r8.A03     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "invalid_adv_status"
            r1.A02(r0, r7, r7)     // Catch:{ all -> 0x0711 }
            goto L_0x05ea
        L_0x04da:
            if (r10 == 0) goto L_0x05ed
            if (r15 != 0) goto L_0x04f2
            com.whatsapp.jid.UserJid r0 = r9.userJid     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()     // Catch:{ all -> 0x0711 }
            X.2nE r0 = X.C63962tz.A02(r0)     // Catch:{ all -> 0x0711 }
            X.2kO r0 = r12.A0D(r0)     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x05ed
            X.1jP r0 = r0.A00     // Catch:{ all -> 0x0711 }
            if (r0 == 0) goto L_0x05ed
        L_0x04f2:
            r13 = 1
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x0711 }
            long r2 = r10.A05     // Catch:{ all -> 0x0711 }
            long r0 = r4.timestamp_     // Catch:{ all -> 0x0711 }
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x05ee
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0711 }
            r1.<init>()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/advDeviceIdentity has a lower ts, jid="
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            r1.append(r9)     // Catch:{ all -> 0x0711 }
            r0 = r16
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            int r0 = r4.keyIndex_     // Catch:{ all -> 0x0711 }
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "; local.rawId="
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            int r6 = r10.A01     // Catch:{ all -> 0x0711 }
            r1.append(r6)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "; downloaded.rawId="
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            int r0 = r4.rawId_     // Catch:{ all -> 0x0711 }
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0711 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            X.1U2 r5 = r8.A08     // Catch:{ all -> 0x0711 }
            X.C17960vV.A07(r10)     // Catch:{ all -> 0x0711 }
            long r0 = r4.timestamp_     // Catch:{ all -> 0x0711 }
            r12 = r15
            r13 = r0
            r9 = r5
            r10 = r2
            r9.A02(r10, r12, r13)     // Catch:{ all -> 0x0711 }
            X.190 r2 = r8.A01     // Catch:{ all -> 0x0711 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0711 }
            r3.<init>()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "local timestamp is ahead; ; primaryKeyMatch="
            r3.append(r0)     // Catch:{ all -> 0x0711 }
            r3.append(r15)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "; rawIdMatch="
            r3.append(r0)     // Catch:{ all -> 0x0711 }
            int r0 = r4.rawId_     // Catch:{ all -> 0x0711 }
            int r11 = X.AnonymousClass1XO.A00(r6, r0)     // Catch:{ all -> 0x0711 }
            goto L_0x05de
        L_0x055a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0711 }
            r5.<init>()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "DeviceADVInfoManager/processADVIdentity/device has been deleted already, device="
            r5.append(r0)     // Catch:{ all -> 0x0711 }
            r5.append(r9)     // Catch:{ all -> 0x0711 }
            r0 = r16
            r5.append(r0)     // Catch:{ all -> 0x0711 }
            int r0 = r4.keyIndex_     // Catch:{ all -> 0x0711 }
            r5.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "; localTs="
            r5.append(r0)     // Catch:{ all -> 0x0711 }
            r5.append(r2)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "; remoteTs="
            r5.append(r0)     // Catch:{ all -> 0x0711 }
            long r0 = r4.timestamp_     // Catch:{ all -> 0x0711 }
            r5.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "; atype="
            r5.append(r0)     // Catch:{ all -> 0x0711 }
            int r0 = r4.accountType_     // Catch:{ all -> 0x0711 }
            X.2RD r0 = X.AnonymousClass2RD.A00(r0)     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x0592
            X.2RD r0 = X.AnonymousClass2RD.E2EE     // Catch:{ all -> 0x0711 }
        L_0x0592:
            r5.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "; dtype="
            r5.append(r0)     // Catch:{ all -> 0x0711 }
            int r0 = r4.deviceType_     // Catch:{ all -> 0x0711 }
            X.2RD r0 = X.AnonymousClass2RD.A00(r0)     // Catch:{ all -> 0x0711 }
            if (r0 != 0) goto L_0x05a4
            X.2RD r0 = X.AnonymousClass2RD.E2EE     // Catch:{ all -> 0x0711 }
        L_0x05a4:
            r5.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0711 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.UserJid r0 = r9.userJid     // Catch:{ all -> 0x0711 }
            r8.A0C(r0, r2)     // Catch:{ all -> 0x0711 }
            X.1U2 r5 = r8.A08     // Catch:{ all -> 0x0711 }
            long r0 = r4.timestamp_     // Catch:{ all -> 0x0711 }
            r18 = r5
            r19 = r2
            r21 = r7
            r22 = r0
            r18.A02(r19, r21, r22)     // Catch:{ all -> 0x0711 }
            X.190 r2 = r8.A01     // Catch:{ all -> 0x0711 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0711 }
            r3.<init>()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "Not existing device; isLocalTimestampIsAhead="
            r3.append(r0)     // Catch:{ all -> 0x0711 }
            int r1 = r10.A01     // Catch:{ all -> 0x0711 }
            int r0 = r4.rawId_     // Catch:{ all -> 0x0711 }
            int r0 = X.AnonymousClass1XO.A00(r1, r0)     // Catch:{ all -> 0x0711 }
            r3.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "; proto="
            r3.append(r0)     // Catch:{ all -> 0x0711 }
        L_0x05de:
            r3.append(r11)     // Catch:{ all -> 0x0711 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0711 }
            r0 = r17
            r2.A0G(r0, r1, r7)     // Catch:{ all -> 0x0711 }
        L_0x05ea:
            r0 = 0
            goto L_0x068b
        L_0x05ed:
            r13 = 0
        L_0x05ee:
            com.whatsapp.jid.UserJid r2 = r9.userJid     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.DeviceJid r0 = r2.getPrimaryDevice()     // Catch:{ all -> 0x0711 }
            X.2nE r1 = X.C63962tz.A02(r0)     // Catch:{ all -> 0x0711 }
            X.2kO r0 = new X.2kO     // Catch:{ all -> 0x0711 }
            r0.<init>(r14)     // Catch:{ all -> 0x0711 }
            r12.A0a(r0, r1)     // Catch:{ all -> 0x0711 }
            r32 = 0
            if (r13 == 0) goto L_0x060e
            long r30 = r5.A01(r2)     // Catch:{ all -> 0x0711 }
            int r0 = (r30 > r32 ? 1 : (r30 == r32 ? 0 : -1))
            if (r0 <= 0) goto L_0x060e
            r12 = 0
            goto L_0x0634
        L_0x060e:
            X.11P r0 = r8.A05     // Catch:{ all -> 0x0711 }
            long r30 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0711 }
            X.0ve r3 = r8.A0A     // Catch:{ all -> 0x0711 }
            r1 = 730(0x2da, float:1.023E-42)
            r0 = r19
            int r1 = X.C18020vd.A00(r0, r3, r1)     // Catch:{ all -> 0x0711 }
            if (r1 >= r7) goto L_0x0621
            r1 = 1
        L_0x0621:
            r0 = 35
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x0711 }
            int r0 = r0 - r7
            long r0 = (long) r0     // Catch:{ all -> 0x0711 }
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r10
            long r30 = r30 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r30 = r30 / r0
            r12 = 1
        L_0x0634:
            long r0 = r4.timestamp_     // Catch:{ all -> 0x0711 }
            int r3 = (r0 > r30 ? 1 : (r0 == r30 ? 0 : -1))
            r11 = 1
            if (r3 > 0) goto L_0x063e
            r11 = 0
            r0 = 0
        L_0x063e:
            int r10 = r4.rawId_     // Catch:{ all -> 0x0711 }
            int r3 = r4.accountType_     // Catch:{ all -> 0x0711 }
            X.2RD r28 = X.AnonymousClass2RD.A00(r3)     // Catch:{ all -> 0x0711 }
            if (r28 != 0) goto L_0x064a
            X.2RD r28 = X.AnonymousClass2RD.E2EE     // Catch:{ all -> 0x0711 }
        L_0x064a:
            X.2rW r3 = new X.2rW     // Catch:{ all -> 0x0711 }
            r36 = r32
            r34 = r32
            r27 = r3
            r29 = r10
            r27.<init>((X.AnonymousClass2RD) r28, (int) r29, (long) r30, (long) r32, (long) r34, (long) r36)     // Catch:{ all -> 0x0711 }
            X.2rW r3 = r5.A04(r3, r0)     // Catch:{ all -> 0x0711 }
            X.10x r10 = new X.10x     // Catch:{ all -> 0x0711 }
            r10.<init>()     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.DeviceJid r1 = r2.getPrimaryDevice()     // Catch:{ all -> 0x0711 }
            java.lang.Long r0 = java.lang.Long.valueOf(r32)     // Catch:{ all -> 0x0711 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0711 }
            int r0 = r4.keyIndex_     // Catch:{ all -> 0x0711 }
            long r0 = (long) r0     // Catch:{ all -> 0x0711 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0711 }
            r10.put(r9, r0)     // Catch:{ all -> 0x0711 }
            X.10w r0 = r10.build()     // Catch:{ all -> 0x0711 }
            r5.A0G(r0, r3, r2, r6)     // Catch:{ all -> 0x0711 }
            if (r11 != 0) goto L_0x0680
            if (r12 == 0) goto L_0x068a
        L_0x0680:
            X.1Re r3 = r8.A04     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r7]     // Catch:{ all -> 0x0711 }
            r1[r6] = r2     // Catch:{ all -> 0x0711 }
            r0 = 3
            r3.A01(r1, r0)     // Catch:{ all -> 0x0711 }
        L_0x068a:
            r0 = 1
        L_0x068b:
            if (r26 == 0) goto L_0x0690
            r26.close()
        L_0x0690:
            return r0
        L_0x0691:
            X.123 r1 = r8.A0G     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.UserJid r0 = r9.userJid     // Catch:{ all -> 0x0711 }
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()     // Catch:{ all -> 0x0711 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x0711 }
            r1.A02(r0)     // Catch:{ all -> 0x0711 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0711 }
            r1.<init>()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/no primary key, jid="
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            r1.append(r9)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0711 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            X.1U2 r2 = r8.A08     // Catch:{ all -> 0x0711 }
            X.2Ea r1 = new X.2Ea     // Catch:{ all -> 0x0711 }
            r1.<init>()     // Catch:{ all -> 0x0711 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0711 }
            r1.A00 = r0     // Catch:{ all -> 0x0711 }
            X.18K r0 = r2.A00     // Catch:{ all -> 0x0711 }
            r0.CC7(r1)     // Catch:{ all -> 0x0711 }
            goto L_0x0705
        L_0x06c7:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0711 }
            r1.<init>()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/advDeviceIdentity invalidProto:"
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0711 }
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0711 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            X.1U2 r1 = r8.A08     // Catch:{ all -> 0x0711 }
            r0 = 2
            r1.A00(r0)     // Catch:{ all -> 0x0711 }
            goto L_0x0705
        L_0x06e7:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0711 }
            r1.<init>()     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/advSignedDeviceIdentity invalidProto:"
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0711 }
            r1.append(r0)     // Catch:{ all -> 0x0711 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0711 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0711 }
            X.1U2 r0 = r8.A08     // Catch:{ all -> 0x0711 }
            r0.A00(r7)     // Catch:{ all -> 0x0711 }
        L_0x0705:
            if (r26 == 0) goto L_0x070a
            r26.close()
        L_0x070a:
            return r6
        L_0x070b:
            if (r26 == 0) goto L_0x0710
            r26.close()
        L_0x0710:
            return r7
        L_0x0711:
            r1 = move-exception
            if (r26 == 0) goto L_0x071c
            r26.close()     // Catch:{ all -> 0x0718 }
            throw r1
        L_0x0718:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x071c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1U5.A0E(com.whatsapp.jid.DeviceJid, byte[], byte[], byte, int):boolean");
    }

    public AnonymousClass1U5(AnonymousClass190 r2, AnonymousClass11S r3, AnonymousClass1U4 r4, C26721Tf r5, C26191Re r6, AnonymousClass11P r7, AnonymousClass1P3 r8, C25571Os r9, C26111Qw r10, AnonymousClass1RK r11, AnonymousClass1U2 r12, AnonymousClass123 r13, AnonymousClass1MR r14, C18030ve r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19) {
        this.A05 = r7;
        this.A0A = r15;
        this.A01 = r2;
        this.A02 = r3;
        this.A0E = r9;
        this.A04 = r6;
        this.A06 = r8;
        this.A09 = r14;
        this.A0C = r16;
        this.A0B = r18;
        this.A0G = r13;
        this.A0H = r17;
        this.A08 = r12;
        this.A0F = r10;
        this.A07 = r11;
        this.A03 = r5;
        this.A0I = r19;
        this.A0D = r4;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, java.util.Comparator] */
    public static byte[] A05(MessageDigest messageDigest, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C58252kO) it.next()).A00.A00);
        }
        Collections.sort(arrayList, new Object());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            messageDigest.update((byte[]) it2.next());
        }
        return messageDigest.digest();
    }

    public void A0B(DeviceJid deviceJid, boolean z) {
        boolean z2 = false;
        if (deviceJid.getDevice() == 0) {
            z2 = true;
        }
        C17960vV.A0D(!z2);
        C71363Ez A082 = this.A0E.A08(deviceJid);
        if (z) {
            try {
                if (this.A02.A0P(deviceJid)) {
                    Log.e("DeviceADVInfoHandler/onCompanionDeviceVerificationFail logout");
                    this.A07.A09(deviceJid, "unknown_companion", false, false);
                } else {
                    this.A09.A0C(C199410f.of(deviceJid), deviceJid.userJid);
                }
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
        if (A082 != null) {
            A082.close();
        }
        this.A0F.A05(Collections.singleton(deviceJid));
        Iterator it = this.A00.keySet().iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException("onCompanionDeviceVerificationFail");
        }
    }
}
