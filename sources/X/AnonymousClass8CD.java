package X;

import android.database.AbstractCursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8CD  reason: invalid class name */
public class AnonymousClass8CD extends AbstractCursor {
    public Map A00 = null;
    public Map A01 = null;
    public final C24791Lr A02;
    public final C62012qe A03;
    public final AnonymousClass19T A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final AnonymousClass1PW A0E;
    public final C24921Me A0F;
    public final AnonymousClass1TM A0G;
    public final C198339yB A0H;
    public final C198099xm A0I;
    public final C19959A0q A0J;
    public final AnonymousClass1TN A0K;
    public final C60012nF A0L;
    public final List A0M;
    public final Set A0N;
    public final Set A0O;
    public final AtomicInteger A0P = new AtomicInteger();
    public final String[] A0Q;

    public static int A00(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (AnonymousClass026.A00(objArr[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public int getInt(int i) {
        AnonymousClass1BI r1;
        Map map;
        C193869qn r2;
        int i2;
        Set set;
        int i3 = i;
        if (i3 != -1) {
            AnonymousClass1E7 A012 = A01(getPosition());
            if (i3 == this.A09) {
                return A012.A0F() ? 1 : 0;
            }
            int i4 = 1;
            if (i3 == this.A08) {
                if (!C18020vd.A05(C18040vf.A02, this.A0G.A01, 11345)) {
                    return 0;
                }
                set = this.A0N;
            } else if (i3 == this.A0A) {
                if (!C18020vd.A05(C18040vf.A02, this.A0G.A01, 11345)) {
                    return 0;
                }
                set = this.A0O;
            } else {
                i4 = Integer.MAX_VALUE;
                if (i3 == this.A05) {
                    Map map2 = this.A00;
                    if (map2 == null) {
                        C198339yB r3 = this.A0H;
                        String str = this.A0L.A01;
                        Set set2 = this.A0O;
                        Set set3 = this.A0N;
                        C18070vi.A0n(str, set2, set3);
                        if (C18020vd.A05(C18040vf.A02, r3.A02.A01, 12646)) {
                            AnonymousClass00H r12 = r3.A03;
                            if (((C190609lE) r12.get()).A01.A00.A09(AnonymousClass18O.A0F)) {
                                C190609lE r13 = (C190609lE) r12.get();
                                long A013 = AnonymousClass11P.A01(r13.A00);
                                AnonymousClass1HY r0 = r13.A02;
                                if (A013 - C17890vO.A05(AnonymousClass1HY.A00(r0), AnonymousClass1HY.A01(str, "metadata/last_call_ranking_time")) >= 86400000) {
                                    AnonymousClass1HY r14 = ((C190609lE) r12.get()).A02;
                                    C17880vN.A1D(AnonymousClass1HY.A00(r14).edit(), AnonymousClass1HY.A01(str, "metadata/last_call_ranking_time"), AnonymousClass11P.A01(r14.A01));
                                    ArrayList A092 = r3.A01.A09(new ARD(0), 0, 1000);
                                    long A002 = ((C190609lE) r12.get()).A00();
                                    long A014 = AnonymousClass11P.A01(r3.A00);
                                    ArrayList A13 = AnonymousClass000.A13();
                                    Iterator it = A092.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        C178119Bw r15 = (C178119Bw) next;
                                        C18070vi.A0b(r15);
                                        if (C198339yB.A00(r15) && r15.A01 >= A002) {
                                            A13.add(next);
                                        }
                                    }
                                    LinkedHashMap A132 = C17880vN.A13();
                                    for (Object next2 : A13) {
                                        ((List) C72473Md.A0h(((C178119Bw) next2).A04.A01, A132)).add(next2);
                                    }
                                    LinkedHashMap A0b = C108995ce.A0b(A132);
                                    Iterator A15 = AnonymousClass000.A15(A132);
                                    while (A15.hasNext()) {
                                        Map.Entry A16 = AnonymousClass000.A16(A15);
                                        Object key = A16.getKey();
                                        Iterator A133 = AnonymousClass8BR.A13(A16.getValue());
                                        int i5 = 0;
                                        while (A133.hasNext()) {
                                            long j = A014 - ((C178119Bw) A133.next()).A01;
                                            if (j <= 3600000) {
                                                i2 = 10;
                                            } else if (j <= 86400000) {
                                                i2 = 4;
                                            } else {
                                                i2 = 1;
                                                if (j <= 604800000) {
                                                    i2 = 2;
                                                }
                                            }
                                            i5 += i2;
                                        }
                                        C17880vN.A1P(key, A0b, i5);
                                    }
                                    ArrayList A134 = AnonymousClass000.A13();
                                    Iterator it2 = A092.iterator();
                                    while (it2.hasNext()) {
                                        Object next3 = it2.next();
                                        C178119Bw r16 = (C178119Bw) next3;
                                        C18070vi.A0b(r16);
                                        if (C198339yB.A00(r16) && r16.A01 >= A002) {
                                            A134.add(next3);
                                        }
                                    }
                                    LinkedHashMap A135 = C17880vN.A13();
                                    for (Object next4 : A134) {
                                        ((List) C72473Md.A0h(((C178119Bw) next4).A04.A01, A135)).add(next4);
                                    }
                                    LinkedHashMap A0b2 = C108995ce.A0b(A135);
                                    Iterator A152 = AnonymousClass000.A15(A135);
                                    while (A152.hasNext()) {
                                        Map.Entry A162 = AnonymousClass000.A16(A152);
                                        Object key2 = A162.getKey();
                                        Iterator A136 = AnonymousClass8BR.A13(A162.getValue());
                                        if (A136.hasNext()) {
                                            long j2 = ((C178119Bw) A136.next()).A01;
                                            while (A136.hasNext()) {
                                                long j3 = ((C178119Bw) A136.next()).A01;
                                                if (j2 < j3) {
                                                    j2 = j3;
                                                }
                                            }
                                            AnonymousClass8BT.A1O(key2, A0b2, j2);
                                        } else {
                                            throw new NoSuchElementException();
                                        }
                                    }
                                    ArrayList A0m = C29431cG.A0m(C41841x9.A04(set2, C41841x9.A04(set3, A0b2.keySet())));
                                    C29391cC.A0H(A0m, new C21481Akm(A0b2, new C21481Akm(A0b, new C98974s1((Object) new C22821Di[]{new C22199AzF(set3), new C22200AzG(set2)}, 16), 1), 2));
                                    C98534rJ A153 = C29431cG.A15(A0m);
                                    int A032 = C200610r.A03(C29351c6.A0C(A153, 10));
                                    if (A032 < 16) {
                                        A032 = 16;
                                    }
                                    map2 = new LinkedHashMap(A032);
                                    Iterator it3 = A153.iterator();
                                    while (it3.hasNext()) {
                                        C194139rE r02 = (C194139rE) it3.next();
                                        AnonymousClass1D6 A003 = AnonymousClass1D6.A00(r02.A01, r02.A00);
                                        map2.put(A003.first, A003.second);
                                    }
                                    this.A00 = map2;
                                }
                            }
                        } else {
                            AnonymousClass00H r5 = r3.A03;
                            if (((C190609lE) r5.get()).A01.A00.A09(AnonymousClass18O.A0F)) {
                                C190609lE r17 = (C190609lE) r5.get();
                                long A015 = AnonymousClass11P.A01(r17.A00);
                                AnonymousClass1HY r03 = r17.A02;
                                if (A015 - C17890vO.A05(AnonymousClass1HY.A00(r03), AnonymousClass1HY.A01(str, "metadata/last_call_ranking_time")) >= 86400000) {
                                    AnonymousClass1HY r18 = ((C190609lE) r5.get()).A02;
                                    C17880vN.A1D(AnonymousClass1HY.A00(r18).edit(), AnonymousClass1HY.A01(str, "metadata/last_call_ranking_time"), AnonymousClass11P.A01(r18.A01));
                                    ArrayList A093 = r3.A01.A09(new ARD(1), 0, 1000);
                                    long A004 = ((C190609lE) r5.get()).A00();
                                    C99414sm r04 = new C99414sm(new C99444sp(new AnonymousClass7SY(new C22201AzH(r3), new AnonymousClass7SZ(new C21486Akr(30), AnonymousClass1b2.A09(new C22268B0w(r3, A004), C29431cG.A0V(A093)))), 50));
                                    map2 = C17880vN.A13();
                                    C99034s9 r32 = new C99034s9(r04);
                                    while (r32.hasNext()) {
                                        C194139rE r22 = (C194139rE) r32.next();
                                        Object obj = r22.A01;
                                        C18070vi.A0X(obj);
                                        AnonymousClass1D6 A005 = AnonymousClass1D6.A00(((C178119Bw) obj).A04.A01, r22.A00);
                                        map2.put(A005.first, A005.second);
                                    }
                                    this.A00 = map2;
                                }
                            }
                        }
                        map2 = AnonymousClass1D7.A0I();
                        this.A00 = map2;
                    }
                    r1 = A012.A0J;
                    if (map2.containsKey(r1)) {
                        map = this.A00;
                    }
                    return i4;
                } else if (i3 == this.A0B) {
                    if (this.A01 == null) {
                        C198099xm r52 = this.A0I;
                        String str2 = this.A0L.A01;
                        C18070vi.A0d(str2, 0);
                        AnonymousClass00H r6 = r52.A02;
                        if (((C190609lE) r6.get()).A01.A00.A09(AnonymousClass18O.A0F)) {
                            C190609lE r19 = (C190609lE) r6.get();
                            long A016 = AnonymousClass11P.A01(r19.A00);
                            AnonymousClass1HY r05 = r19.A02;
                            if (A016 - C17890vO.A05(AnonymousClass1HY.A00(r05), AnonymousClass1HY.A01(str2, "metadata/last_message_ranking_time")) >= 86400000) {
                                AnonymousClass1HY r110 = ((C190609lE) r6.get()).A02;
                                C17880vN.A1D(AnonymousClass1HY.A00(r110).edit(), AnonymousClass1HY.A01(str2, "metadata/last_message_ranking_time"), AnonymousClass11P.A01(r110.A01));
                                C22621Co.A02(r52.A00, false);
                                Collection A0H2 = r52.A01.A0H();
                                ArrayList A0t = C108965cb.A0t(A0H2);
                                ArrayList A137 = AnonymousClass000.A13();
                                for (Object next5 : A0H2) {
                                    if (C22971Dz.A0d(((C29691ci) next5).A08())) {
                                        A0t.add(next5);
                                    } else {
                                        A137.add(next5);
                                    }
                                }
                                LinkedHashMap A006 = C198099xm.A00(r52, A0t);
                                ArrayList A138 = AnonymousClass000.A13();
                                for (Object next6 : A137) {
                                    if (C22971Dz.A0e(((C29691ci) next6).A08())) {
                                        A138.add(next6);
                                    }
                                }
                                r2 = new C193869qn(A006, C198099xm.A00(r52, A138));
                                HashMap hashMap = new HashMap(r2.A01);
                                this.A01 = hashMap;
                                hashMap.putAll(r2.A00);
                            }
                        }
                        r2 = new C193869qn(AnonymousClass1D7.A0I(), AnonymousClass1D7.A0I());
                        HashMap hashMap2 = new HashMap(r2.A01);
                        this.A01 = hashMap2;
                        hashMap2.putAll(r2.A00);
                    }
                    r1 = A012.A0J;
                    if (this.A01.containsKey(r1)) {
                        map = this.A01;
                    }
                    return i4;
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Column #");
                    A10.append(i3);
                    throw AnonymousClass000.A0o(" is not an int.", A10);
                }
                return AnonymousClass000.A0M(map.get(r1));
            }
            if (set.contains(A012.A0J)) {
                return i4;
            }
            return 0;
        }
        throw AnonymousClass000.A0n("Invalid column index");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cb, code lost:
        if (r0 == false) goto L_0x00cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getString(int r14) {
        /*
            r13 = this;
            r0 = -1
            if (r14 == r0) goto L_0x0211
            int r0 = r13.getPosition()
            X.1E7 r1 = r13.A01(r0)
            int r0 = r13.A07
            if (r14 != r0) goto L_0x0020
            X.A0q r3 = r13.A0J
            X.2nF r2 = r13.A0L
            X.1BI r0 = X.AnonymousClass1E7.A00(r1)
            if (r0 != 0) goto L_0x001b
            r0 = 0
            return r0
        L_0x001b:
            java.lang.String r0 = r3.A02(r0, r2)
            return r0
        L_0x0020:
            int r0 = r13.A0D
            r4 = 0
            if (r14 != r0) goto L_0x0036
            X.1BI r0 = r1.A0J
            if (r0 == 0) goto L_0x01ef
            X.1TN r2 = r13.A0K
            X.2nF r1 = r13.A0L
            java.lang.String r0 = r0.getRawString()
            java.lang.String r0 = r2.A00(r1, r0)
            return r0
        L_0x0036:
            int r0 = r13.A06
            if (r14 != r0) goto L_0x005f
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass3MZ.A0x(r1)
            if (r3 == 0) goto L_0x0055
            X.1PW r2 = r13.A0E
            if (r2 == 0) goto L_0x0055
            boolean r0 = r2.A08()
            if (r0 == 0) goto L_0x0055
            boolean r0 = X.C42701yb.A01(r3)
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = r2.A06(r3)
            return r0
        L_0x0055:
            X.1Me r2 = r13.A0F
            r0 = 0
            X.1yg r0 = r2.A0H(r1, r0)
            java.lang.String r0 = r0.A01
            return r0
        L_0x005f:
            int r0 = r13.A09
            if (r14 == r0) goto L_0x0208
            int r0 = r13.A05
            if (r14 == r0) goto L_0x0208
            int r0 = r13.A0B
            if (r14 == r0) goto L_0x0208
            int r0 = r13.A08
            if (r14 == r0) goto L_0x0208
            int r0 = r13.A0A
            if (r14 == r0) goto L_0x0208
            int r0 = r13.A0C
            if (r14 != r0) goto L_0x01f5
            X.1TM r0 = r13.A0G
            X.0ve r3 = r0.A01
            r2 = 5340(0x14dc, float:7.483E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x01f4
            X.1BI r0 = r1.A0J
            if (r0 == 0) goto L_0x01f4
            java.util.concurrent.atomic.AtomicInteger r0 = r13.A0P
            int r5 = r0.getAndIncrement()
            X.19T r4 = r13.A04
            r3 = 494354237(0x1d773f3d, float:3.2722871E-21)
            r2 = 0
            r4.Bj1(r3, r5, r2)
            int r6 = r13.getPosition()
            if (r6 >= 0) goto L_0x00ea
            java.lang.String r6 = "invalid"
        L_0x00a0:
            java.lang.String r0 = "cursor_position"
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r0, (java.lang.String) r6)
            X.2qe r6 = r13.A03
            X.1BI r0 = r1.A0J
            boolean r0 = X.C22971Dz.A0Y(r0)
            if (r0 == 0) goto L_0x00cd
            X.00H r0 = r6.A02
            r0.get()
            X.1BI r0 = X.AnonymousClass1E7.A00(r1)
            java.lang.String r6 = X.AnonymousClass17K.A03(r0)
            if (r6 == 0) goto L_0x00cd
            X.00H r0 = X.C62012qe.A04
            java.lang.Object r0 = r0.get()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            boolean r0 = X.AnonymousClass8BU.A1V(r6, r0)
            r6 = 1
            if (r0 != 0) goto L_0x00ce
        L_0x00cd:
            r6 = 0
        L_0x00ce:
            if (r6 == 0) goto L_0x01a7
            java.lang.String r0 = "is_privacy_placeholder"
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r0, (boolean) r2)
            X.1Lr r0 = r13.A02
            java.io.File r1 = r0.A01(r1)
            java.lang.String r0 = "get_file_end"
            r4.markerPoint((int) r3, (int) r5, (java.lang.String) r0)
            r6 = 0
            if (r1 == 0) goto L_0x01b6
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x01b6
            goto L_0x0110
        L_0x00ea:
            r0 = 10
            if (r6 >= r0) goto L_0x00f1
            java.lang.String r6 = "<10"
            goto L_0x00a0
        L_0x00f1:
            r0 = 50
            if (r6 >= r0) goto L_0x00f8
            java.lang.String r6 = "<50"
            goto L_0x00a0
        L_0x00f8:
            r0 = 100
            if (r6 >= r0) goto L_0x00ff
            java.lang.String r6 = "<100"
            goto L_0x00a0
        L_0x00ff:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r6 >= r0) goto L_0x0106
            java.lang.String r6 = "<500"
            goto L_0x00a0
        L_0x0106:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r6 >= r0) goto L_0x010d
            java.lang.String r6 = "<1000"
            goto L_0x00a0
        L_0x010d:
            java.lang.String r6 = ">=1000"
            goto L_0x00a0
        L_0x0110:
            java.io.FileInputStream r7 = X.C108945cZ.A18(r1)     // Catch:{ IOException -> 0x019a }
            long r0 = r1.length()     // Catch:{ all -> 0x0190 }
            int r11 = (int) r0     // Catch:{ all -> 0x0190 }
            java.lang.String r12 = "file_size"
            long r0 = (long) r11     // Catch:{ all -> 0x0190 }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0128
            java.lang.String r8 = "Invalid"
        L_0x0124:
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r12, (java.lang.String) r8)     // Catch:{ all -> 0x0190 }
            goto L_0x0158
        L_0x0128:
            r9 = 2048(0x800, double:1.0118E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0131
            java.lang.String r8 = "<2KB"
            goto L_0x0124
        L_0x0131:
            r9 = 4096(0x1000, double:2.0237E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x013a
            java.lang.String r8 = "<4KB"
            goto L_0x0124
        L_0x013a:
            r9 = 6144(0x1800, double:3.0355E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0143
            java.lang.String r8 = "<6KB"
            goto L_0x0124
        L_0x0143:
            r9 = 8192(0x2000, double:4.0474E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x014c
            java.lang.String r8 = "<8KB"
            goto L_0x0124
        L_0x014c:
            r9 = 10240(0x2800, double:5.059E-320)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0155
            java.lang.String r8 = "<10KB"
            goto L_0x0124
        L_0x0155:
            java.lang.String r8 = ">=10KB"
            goto L_0x0124
        L_0x0158:
            r9 = 102400(0x19000, double:5.05923E-319)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x016e
            java.lang.String r0 = "ContactsUriHandler/RestrictedCursor/getThumbnailPic thumbnail file size is >100KB"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0190 }
            X.9Hy r0 = X.C179439Hy.FILE_TOO_LARGE     // Catch:{ all -> 0x0190 }
            android.util.Pair r8 = X.C108945cZ.A0N(r6, r0)     // Catch:{ all -> 0x0190 }
            r7.close()     // Catch:{ IOException -> 0x019a }
            goto L_0x01bc
        L_0x016e:
            byte[] r1 = new byte[r11]     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = "read_from_file_to_byte_array_end"
            r4.markerPoint((int) r3, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x0190 }
            r7.read(r1)     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = "convert_to_byte_array_end"
            r4.markerPoint((int) r3, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x0190 }
            java.lang.String r1 = X.C108955ca.A14(r1)     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = "encode_to_base64_string_end"
            r4.markerPoint((int) r3, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x0190 }
            X.9Hy r0 = X.C179439Hy.SUCCESS_WITH_PICTURE     // Catch:{ all -> 0x0190 }
            android.util.Pair r8 = X.C108945cZ.A0N(r1, r0)     // Catch:{ all -> 0x0190 }
            r7.close()     // Catch:{ IOException -> 0x019a }
            goto L_0x01bc
        L_0x0190:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0195 }
            goto L_0x0199
        L_0x0195:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x019a }
        L_0x0199:
            throw r1     // Catch:{ IOException -> 0x019a }
        L_0x019a:
            r1 = move-exception
            java.lang.String r0 = "ContactsUriHandler/RestrictedCursor/getThumbnailPic encountered IO exception"
            com.whatsapp.util.Log.w(r0, r1)
            X.9Hy r0 = X.C179439Hy.IO_EXCEPTION
            android.util.Pair r8 = X.C108945cZ.A0N(r6, r0)
            goto L_0x01bc
        L_0x01a7:
            java.lang.String r1 = "is_privacy_placeholder"
            r0 = 1
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r1, (boolean) r0)
            java.lang.String r1 = "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"
            X.9Hy r0 = X.C179439Hy.SUCCESS_WITH_PICTURE
            android.util.Pair r8 = X.C108945cZ.A0N(r1, r0)
            goto L_0x01bc
        L_0x01b6:
            X.9Hy r0 = X.C179439Hy.SUCCESS_WITHOUT_PICTURE
            android.util.Pair r8 = X.C108945cZ.A0N(r6, r0)
        L_0x01bc:
            java.lang.Object r0 = r8.second
            X.9Hy r0 = (X.C179439Hy) r0
            int r7 = r0.ordinal()
            r0 = 1
            r6 = 2
            java.lang.String r1 = "is_pic_available"
            if (r7 == r2) goto L_0x01e8
            if (r7 == r0) goto L_0x01e4
            r0 = 3
            if (r7 == r0) goto L_0x01de
            if (r7 != r6) goto L_0x01d9
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r1, (boolean) r2)
            r0 = 147(0x93, float:2.06E-43)
        L_0x01d6:
            r4.markerEnd(r3, r5, r0)
        L_0x01d9:
            java.lang.Object r0 = r8.first
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x01de:
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r1, (boolean) r2)
            r0 = 159(0x9f, float:2.23E-43)
            goto L_0x01d6
        L_0x01e4:
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r1, (boolean) r2)
            goto L_0x01eb
        L_0x01e8:
            r4.markerAnnotate((int) r3, (int) r5, (java.lang.String) r1, (boolean) r0)
        L_0x01eb:
            r4.markerEnd(r3, r5, r6)
            goto L_0x01d9
        L_0x01ef:
            java.lang.String r0 = "ContactsUriHandler/RestrictedCursor/ chat JID is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x01f4:
            return r4
        L_0x01f5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Column #"
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = " is not a string."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)
            throw r0
        L_0x0208:
            int r0 = r13.getInt(r14)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        L_0x0211:
            java.lang.String r0 = "Invalid column index"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8CD.getString(int):java.lang.String");
    }

    public boolean isNull(int i) {
        return false;
    }

    private AnonymousClass1E7 A01(int i) {
        if (i >= 0) {
            List list = this.A0M;
            if (i < list.size()) {
                return (AnonymousClass1E7) list.get(i);
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Position: ");
        A10.append(i);
        A10.append(", size = ");
        throw AnonymousClass000.A0n(C17880vN.A0t(A10, this.A0M.size()));
    }

    public static String[] A02() {
        return new String[]{"_id", "display_name", "is_group", "is_favorite", "is_pinned", "call_rank", "message_rank", "primary_profile_picture_bytestream", "seci"};
    }

    public int getCount() {
        return this.A0M.size();
    }

    public AnonymousClass8CD(AnonymousClass1PW r9, C24921Me r10, C24791Lr r11, AnonymousClass1TM r12, C198339yB r13, C190609lE r14, C198099xm r15, C19959A0q a0q, AnonymousClass1TN r17, C62012qe r18, AnonymousClass19T r19, C60012nF r20, List list, List list2, Set set, String[] strArr) {
        Object[] A022 = A02();
        String[] strArr2 = strArr;
        if (strArr != null) {
            HashSet A12 = AnonymousClass8BR.A12(Arrays.asList(A022));
            ArrayList A13 = AnonymousClass000.A13();
            int length = strArr2.length;
            for (int i = 0; i < length; i++) {
                String str = strArr[i];
                if (A12.contains(str)) {
                    A13.add(str);
                }
            }
            A022 = A13.toArray(new String[0]);
        }
        LinkedList linkedList = new LinkedList(Arrays.asList(A022));
        if (!r14.A01.A00.A09(AnonymousClass18O.A0F)) {
            linkedList.remove("call_rank");
            linkedList.remove("message_rank");
        }
        if (!C18020vd.A05(C18040vf.A02, r12.A01, 9695)) {
            linkedList.remove("seci");
        }
        String[] A1b = C17890vO.A1b(linkedList, 0);
        this.A0Q = A1b;
        this.A0E = r9;
        this.A0M = C17880vN.A10(list);
        this.A04 = r19;
        HashSet A122 = C17880vN.A12();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C62482rT r3 = (C62482rT) it.next();
            if (r3.A02 != C49512Qt.NONE) {
                A122.add(r3.A03);
            }
        }
        this.A0N = A122;
        this.A0F = r10;
        this.A0O = set;
        this.A02 = r11;
        this.A0L = r20;
        this.A0G = r12;
        this.A0H = r13;
        this.A0I = r15;
        this.A03 = r18;
        this.A0J = a0q;
        this.A0K = r17;
        this.A07 = A00(A1b, "_id");
        this.A06 = A00(A1b, "display_name");
        this.A09 = A00(A1b, "is_group");
        this.A08 = A00(A1b, "is_favorite");
        this.A0A = A00(A1b, "is_pinned");
        this.A05 = A00(A1b, "call_rank");
        this.A0B = A00(A1b, "message_rank");
        this.A0C = A00(A1b, "primary_profile_picture_bytestream");
        this.A0D = A00(A1b, "seci");
    }

    public String[] getColumnNames() {
        return this.A0Q;
    }

    public double getDouble(int i) {
        throw C17880vN.A0y();
    }

    public float getFloat(int i) {
        throw C17880vN.A0y();
    }

    public long getLong(int i) {
        throw C17880vN.A0y();
    }

    public short getShort(int i) {
        throw C17880vN.A0y();
    }
}
