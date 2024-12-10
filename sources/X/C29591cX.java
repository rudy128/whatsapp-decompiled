package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1cX  reason: invalid class name and case insensitive filesystem */
public final class C29591cX {
    public String A00;
    public byte[] A01;
    public final List A02;
    public final List A03;

    public final void A06(C29621ca r10) {
        C18070vi.A0d(r10, 0);
        String str = this.A00;
        if ("smax:any".equals(str)) {
            str = r10.A00;
            C18070vi.A0X(str);
            this.A00 = str;
        }
        String str2 = r10.A00;
        if (!C18070vi.A18(str, str2) && !"smax:any".equals(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error merging <");
            sb.append(this.A00);
            sb.append("/> with <");
            sb.append(str2);
            sb.append("/>: conflicting tags");
            C17960vV.A0F(false, sb.toString());
        }
        AnonymousClass1MD[] A0S = r10.A0S();
        if (A0S != null) {
            C99014s7 r3 = new C99014s7(A0S);
            while (r3.hasNext()) {
                AnonymousClass1MD r7 = (AnonymousClass1MD) r3.next();
                String str3 = r7.A02;
                List list = this.A02;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        list.add(r7);
                        break;
                    }
                    AnonymousClass1MD r1 = (AnonymousClass1MD) it.next();
                    if (C18070vi.A18(r1.A02, str3)) {
                        if (!r7.equals(r1)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Error merging attribute '");
                            sb2.append(str3);
                            sb2.append("' in <");
                            sb2.append(this.A00);
                            sb2.append("/>: conflicting values");
                            C17960vV.A0F(false, sb2.toString());
                        }
                    }
                }
            }
        }
        C29621ca[] r32 = r10.A02;
        if (!(r32 == null || r32.length == 0)) {
            if (this.A01 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Error merging children into <");
                sb3.append(this.A00);
                sb3.append("/>: element already has data");
                C17960vV.A0F(false, sb3.toString());
            }
            List<C29621ca> list2 = this.A03;
            if (list2.isEmpty()) {
                C99014s7 r12 = new C99014s7(r32);
                while (r12.hasNext()) {
                    Object next = r12.next();
                    C18070vi.A0b(next);
                    list2.add(next);
                }
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object next2 : list2) {
                    String str4 = ((C29621ca) next2).A00;
                    Object obj = linkedHashMap.get(str4);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(str4, obj);
                    }
                    ((List) obj).add(next2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C200610r.A03(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), C29431cG.A0m((Collection) entry.getValue()));
                }
                List A0Q = C200410p.A0Q(r32);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object next3 : A0Q) {
                    String str5 = ((C29621ca) next3).A00;
                    Object obj2 = linkedHashMap3.get(str5);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap3.put(str5, obj2);
                    }
                    ((List) obj2).add(next3);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(C200610r.A03(linkedHashMap3.size()));
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    linkedHashMap4.put(entry2.getKey(), C29431cG.A0m((Collection) entry2.getValue()));
                }
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    String str6 = (String) entry3.getKey();
                    List list3 = (List) entry3.getValue();
                    if (linkedHashMap4.containsKey(str6)) {
                        int size = list3.size();
                        Object obj3 = linkedHashMap4.get(str6);
                        if (obj3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        } else if (size != ((List) obj3).size()) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Error merging children into <");
                            sb4.append(this.A00);
                            sb4.append("/>: conflicting child count for <");
                            sb4.append(str6);
                            sb4.append("/>");
                            C17960vV.A0F(false, sb4.toString());
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (C29621ca r2 : list2) {
                    String str7 = r2.A00;
                    if (linkedHashMap4.containsKey(str7)) {
                        Object obj4 = linkedHashMap4.get(str7);
                        if (obj4 != null) {
                            C29591cX r0 = new C29591cX(r2);
                            r0.A06((C29621ca) ((List) obj4).remove(0));
                            r2 = r0.A03();
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    arrayList.add(r2);
                }
                for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
                    Object key = entry4.getKey();
                    Collection collection = (Collection) entry4.getValue();
                    if (!linkedHashMap2.containsKey(key)) {
                        arrayList.addAll(collection);
                    }
                }
                list2.clear();
                list2.addAll(arrayList);
            }
        }
        byte[] bArr = r10.A01;
        if (bArr != null) {
            if (!this.A03.isEmpty()) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Error merging data into <");
                sb5.append(this.A00);
                sb5.append("/>: element already has children");
                C17960vV.A0F(false, sb5.toString());
            }
            byte[] bArr2 = this.A01;
            if (bArr2 != null && !Arrays.equals(bArr2, bArr)) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Error merging data into <");
                sb6.append(this.A00);
                sb6.append("/>: conflicting values");
                C17960vV.A0F(false, sb6.toString());
            }
            this.A01 = bArr;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29591cX(X.C29621ca r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.A00
            X.C18070vi.A0X(r0)
            r2.<init>((java.lang.String) r0)
            X.1ca[] r0 = r3.A02
            if (r0 == 0) goto L_0x0015
            java.util.List r1 = r2.A03
            java.util.List r0 = X.C200410p.A0Q(r0)
            r1.addAll(r0)
        L_0x0015:
            X.1MD[] r0 = r3.A0S()
            if (r0 == 0) goto L_0x0024
            java.util.List r1 = r2.A02
            java.util.List r0 = X.C200410p.A0Q(r0)
            r1.addAll(r0)
        L_0x0024:
            byte[] r0 = r3.A01
            r2.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29591cX.<init>(X.1ca):void");
    }

    public static void A01(C29591cX r1, String str, String str2) {
        r1.A04(new AnonymousClass1MD(str, str2));
    }

    public final C29621ca A03() {
        C29621ca[] r1;
        List list = this.A02;
        Object[] objArr = null;
        if (!list.isEmpty()) {
            objArr = list.toArray(new AnonymousClass1MD[0]);
        }
        List list2 = this.A03;
        if ((!list2.isEmpty()) && (r1 = (C29621ca[]) list2.toArray(new C29621ca[0])) != null) {
            return new C29621ca(this.A00, (AnonymousClass1MD[]) objArr, r1);
        }
        return new C29621ca(this.A00, this.A01, (AnonymousClass1MD[]) objArr);
    }

    public final void A04(AnonymousClass1MD r2) {
        this.A02.add(r2);
    }

    public final void A05(C29621ca r2) {
        if (r2 != null) {
            this.A03.add(r2);
        }
    }

    public final void A07(String str) {
        byte[] bArr;
        if (str != null) {
            bArr = str.getBytes(C26571Sq.A05);
            C18070vi.A0X(bArr);
        } else {
            bArr = null;
        }
        this.A01 = bArr;
    }

    public final void A08(String str, String str2, List list) {
        if (str != null) {
            A09(str, str2, list);
        }
    }

    public static C29621ca A00(C29591cX r0, C29591cX r1) {
        r1.A05(r0.A03());
        return r1.A03();
    }

    public static final void A02(String str, List list) {
        if (!list.contains(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("String was expected to be one of '");
            sb.append(C29431cG.A0g(",", "", "", list, (C22821Di) null));
            sb.append("'.");
            C17960vV.A0F(false, sb.toString());
        }
    }

    public final void A09(String str, String str2, List list) {
        A02(str, list);
        A04(new AnonymousClass1MD(str2, str));
    }

    public C29591cX(String str) {
        this.A00 = str;
        this.A03 = new ArrayList();
        this.A02 = new ArrayList();
    }
}
