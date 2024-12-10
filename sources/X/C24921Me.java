package X;

import android.content.Context;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Me  reason: invalid class name and case insensitive filesystem */
public class C24921Me {
    public final AnonymousClass11S A00;
    public final AnonymousClass118 A01;
    public final C18000vb A02;
    public final AnonymousClass1CJ A03;
    public final C18030ve A04;
    public final AnonymousClass00H A05;
    public final ConcurrentHashMap A06 = new ConcurrentHashMap();
    public final ConcurrentHashMap A07 = new ConcurrentHashMap();
    public final AnonymousClass190 A08;
    public final AnonymousClass12L A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (((X.C32171gl) ((X.C19880zA) r3.get()).A03()).Bey(r2) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e3, code lost:
        if (X.C22971Dz.A0O(r2) != false) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A04(X.C24921Me r15, X.AnonymousClass1E9 r16, int r17, boolean r18) {
        /*
            r8 = r15
            if (r18 == 0) goto L_0x00b3
            java.util.concurrent.ConcurrentHashMap r1 = r15.A07
        L_0x0005:
            r2 = r16
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x012a
            r0 = 1
            r12 = 0
            r11 = r17
            if (r11 != r0) goto L_0x0036
            X.00H r3 = r15.A0E
            java.lang.Object r0 = r3.get()
            X.0zA r0 = (X.C19880zA) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r3.get()
            X.0zA r0 = (X.C19880zA) r0
            java.lang.Object r0 = r0.A03()
            X.1gl r0 = (X.C32171gl) r0
            boolean r0 = r0.Bey(r2)
            r7 = 1
            if (r0 != 0) goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            X.00H r4 = r15.A0D
            java.lang.Object r0 = r4.get()
            X.1MZ r0 = (X.AnonymousClass1MZ) r0
            X.1MW r0 = r0.A08
            X.2tp r3 = r0.A0C(r2)
            java.lang.Object r0 = r4.get()
            X.1MZ r0 = (X.AnonymousClass1MZ) r0
            boolean r0 = r0.A0I(r2)
            if (r0 == 0) goto L_0x00ae
            java.util.Map r0 = r3.A08
            java.util.Collection r0 = r0.values()
            X.10f r0 = X.C199410f.copyOf((java.util.Collection) r0)
        L_0x0065:
            X.1IZ r6 = r0.iterator()
            r5 = 0
        L_0x006a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r4 = r6.next()
            X.2sr r4 = (X.C63312sr) r4
            X.11S r0 = r15.A00
            com.whatsapp.jid.UserJid r4 = r4.A04
            boolean r0 = r0.A0O(r4)
            if (r0 == 0) goto L_0x0082
            r5 = 1
            goto L_0x006a
        L_0x0082:
            if (r7 == 0) goto L_0x009e
            X.2sr r0 = r3.A0D(r4, r12)
            if (r0 == 0) goto L_0x009e
            int r0 = r0.A01
            if (r0 == 0) goto L_0x009e
            X.00H r0 = r15.A05
            java.lang.Object r0 = r0.get()
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            X.1E7 r0 = r0.A0H(r4)
            r9.add(r0)
            goto L_0x006a
        L_0x009e:
            X.00H r0 = r15.A05
            java.lang.Object r0 = r0.get()
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            X.1E7 r0 = r0.A0H(r4)
            r14.add(r0)
            goto L_0x006a
        L_0x00ae:
            X.10f r0 = r3.A0B()
            goto L_0x0065
        L_0x00b3:
            java.util.concurrent.ConcurrentHashMap r1 = r15.A06
            goto L_0x0005
        L_0x00b7:
            if (r7 == 0) goto L_0x0125
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x0125
            r10 = -1
            if (r18 == 0) goto L_0x00c4
            r10 = 10
        L_0x00c4:
            r4 = 10
            r15 = 0
            r13 = r12
            java.lang.String r3 = r8.A0b(r9, r10, r11, r12, r13)
            int r0 = r9.size()
            if (r0 >= r4) goto L_0x00d8
            int r0 = r9.size()
            int r15 = 10 - r0
        L_0x00d8:
            if (r18 != 0) goto L_0x00db
            r15 = -1
        L_0x00db:
            if (r5 == 0) goto L_0x00e5
            boolean r0 = X.C22971Dz.A0O(r2)
            r17 = 1
            if (r0 == 0) goto L_0x00e7
        L_0x00e5:
            r17 = 0
        L_0x00e7:
            r13 = r8
            r16 = r11
            r18 = r12
            java.lang.String r4 = r13.A0b(r14, r15, r16, r17, r18)
            if (r7 == 0) goto L_0x0121
            r0 = 2
            java.lang.CharSequence[] r6 = new java.lang.CharSequence[r0]
            r6[r12] = r3
            r0 = 1
            r6[r0] = r4
            java.lang.String r5 = ", "
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r3 = 0
        L_0x0102:
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0113
            r0 = r6[r3]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0113
            r4.append(r5)
        L_0x0113:
            r0 = r6[r3]
            r4.append(r0)
            int r3 = r3 + 1
            r0 = 2
            if (r3 < r0) goto L_0x0102
            java.lang.String r4 = r4.toString()
        L_0x0121:
            r1.put(r2, r4)
            return r4
        L_0x0125:
            java.lang.String r3 = ""
            r15 = 10
            goto L_0x00d8
        L_0x012a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24921Me.A04(X.1Me, X.1E9, int, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r5.A0I == null) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A07(X.AnonymousClass1E7 r5, X.AnonymousClass1BI r6) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == 0) goto L_0x0008
            X.1E7 r1 = r5.A0I
            r0 = 1
            if (r1 != 0) goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r6 == 0) goto L_0x0052
            if (r0 != 0) goto L_0x0052
            X.00H r0 = r4.A0C
            java.lang.Object r1 = r0.get()
            X.2c0 r1 = (X.C53112c0) r1
            boolean r0 = X.C22971Dz.A0e(r6)
            if (r0 == 0) goto L_0x0052
            boolean r0 = r6 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0052
            X.1CJ r0 = r1.A00
            boolean r0 = r0.A0R(r6)
            if (r0 != 0) goto L_0x004b
            X.1MZ r0 = r1.A01
            X.1E9 r6 = (X.AnonymousClass1E9) r6
            X.1MW r0 = r0.A08
            X.2tp r2 = r0.A0B(r6)
            int r1 = r2.A00
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)
            if (r0 == 0) goto L_0x004d
            java.util.Map r0 = r2.A08
            java.util.Collection r0 = r0.values()
            X.10f r0 = X.C199410f.copyOf((java.util.Collection) r0)
            int r1 = r0.size()
        L_0x0048:
            r0 = 3
            if (r1 < r0) goto L_0x0052
        L_0x004b:
            r0 = 7
            return r0
        L_0x004d:
            int r1 = r2.A06()
            goto L_0x0048
        L_0x0052:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24921Me.A07(X.1E7, X.1BI):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r5.A0I == null) goto L_0x0008;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A08(X.AnonymousClass1E7 r5, X.AnonymousClass1BI r6) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == 0) goto L_0x0008
            X.1E7 r1 = r5.A0I
            r0 = 1
            if (r1 != 0) goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r6 == 0) goto L_0x005a
            if (r0 != 0) goto L_0x005a
            X.1CJ r0 = r4.A03
            boolean r0 = r0.A0R(r6)
            if (r0 != 0) goto L_0x0053
            X.00H r0 = r4.A0C
            java.lang.Object r1 = r0.get()
            X.2c0 r1 = (X.C53112c0) r1
            boolean r0 = X.C22971Dz.A0e(r6)
            if (r0 == 0) goto L_0x005a
            boolean r0 = r6 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x005a
            X.1CJ r0 = r1.A00
            boolean r0 = r0.A0R(r6)
            if (r0 != 0) goto L_0x0053
            X.1MZ r0 = r1.A01
            X.1E9 r6 = (X.AnonymousClass1E9) r6
            X.1MW r0 = r0.A08
            X.2tp r2 = r0.A0C(r6)
            int r1 = r2.A00
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)
            if (r0 == 0) goto L_0x0055
            java.util.Map r0 = r2.A08
            java.util.Collection r0 = r0.values()
            X.10f r0 = X.C199410f.copyOf((java.util.Collection) r0)
            int r1 = r0.size()
        L_0x0050:
            r0 = 3
            if (r1 < r0) goto L_0x005a
        L_0x0053:
            r0 = 7
            return r0
        L_0x0055:
            int r1 = r2.A06()
            goto L_0x0050
        L_0x005a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24921Me.A08(X.1E7, X.1BI):int");
    }

    public C42751yg A0E(AnonymousClass1E7 r4, int i, boolean z) {
        if (z || r4.A0H == null || TextUtils.isEmpty(r4.A0T) || r4.A0O()) {
            return A0F(r4, i, false, true);
        }
        return new C42751yg(r4.A0T, AnonymousClass00R.A18);
    }

    public String A0I(AnonymousClass1E7 r3) {
        return A0U(r3, -1, false);
    }

    public String A0P(AnonymousClass1E7 r7) {
        String str;
        String A032 = A03(this, r7, 2131898919);
        C42741yf r1 = r7.A0G;
        if (!A032.isEmpty() && r7.A0H == null && !r7.A0C() && (r1 == null || (str = r1.A08) == null || str.isEmpty())) {
            if (C18020vd.A05(C18040vf.A02, this.A04, 8000)) {
                return A032;
            }
        }
        return A0U(r7, -1, false);
    }

    public String A0T(AnonymousClass1E7 r2, int i) {
        return A0E(r2, i, false).A01;
    }

    public String A0U(AnonymousClass1E7 r2, int i, boolean z) {
        return A0F(r2, i, z, true).A01;
    }

    public String A0Z(Iterable iterable, int i) {
        HashSet hashSet = new HashSet();
        return A0b(hashSet, i, -1, A05(this, iterable, hashSet), true);
    }

    public String A0a(Iterable iterable, int i) {
        HashSet hashSet = new HashSet();
        return A0b(hashSet, -1, i, A05(this, iterable, hashSet), true);
    }

    public ArrayList A0e(Iterable iterable, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C42751yg A0E2 = A0E((AnonymousClass1E7) it.next(), i, false);
            Integer num = A0E2.A00;
            String str = A0E2.A01;
            if (str != null) {
                if (num == AnonymousClass00R.A0N) {
                    arrayList3.add(str);
                } else if (num == AnonymousClass00R.A0Y) {
                    arrayList2.add(str);
                } else {
                    arrayList.add(str);
                }
            }
        }
        Collections.sort(arrayList, A0c());
        Collections.sort(arrayList2, A0c());
        Collections.sort(arrayList3);
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList3);
        if (z) {
            arrayList.add(this.A01.A00.getString(2131898595));
        }
        return arrayList;
    }

    public boolean A0l(AnonymousClass1E7 r3, List list) {
        return A0m(r3, list, true, false);
    }

    private int A00(C47712Jo r4) {
        C63872tp A0C2 = ((AnonymousClass1MZ) this.A0D.get()).A08.A0C(r4);
        boolean A0W = A0C2.A0W(this.A00);
        int size = A0C2.A07().size();
        if (A0W) {
            return size - 1;
        }
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r5.A0I != null) goto L_0x000b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C42751yg A01(X.C24921Me r4, X.AnonymousClass1E7 r5, boolean r6) {
        /*
            X.1BI r2 = r5.A0J
            boolean r0 = r2 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x000b
            X.1E7 r1 = r5.A0I
            r0 = 1
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r3 = 0
            if (r0 == 0) goto L_0x0027
            X.0vb r1 = r4.A02
            java.lang.String r0 = r5.A0K()
        L_0x0015:
            java.lang.String r2 = r1.A0G(r0)
        L_0x0019:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x0039
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.1yg r1 = new X.1yg
            r1.<init>(r3, r0)
            return r1
        L_0x0027:
            if (r6 == 0) goto L_0x0030
            X.0vb r1 = r4.A02
            java.lang.String r0 = X.AnonymousClass17K.A02(r5)
            goto L_0x0015
        L_0x0030:
            if (r2 == 0) goto L_0x0037
            java.lang.String r2 = X.AnonymousClass17K.A04(r2)
            goto L_0x0019
        L_0x0037:
            r2 = r3
            goto L_0x0019
        L_0x0039:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            X.1yg r1 = new X.1yg
            r1.<init>(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24921Me.A01(X.1Me, X.1E7, boolean):X.1yg");
    }

    public static String A02(Context context, C18000vb r3, AnonymousClass1E7 r4) {
        Integer num;
        int i;
        if (C22971Dz.A0V(r4.A0J) || (num = r4.A0N) == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return r4.A0X;
        }
        switch (intValue) {
            case 1:
                i = 2131894523;
                break;
            case 2:
                i = 2131894527;
                break;
            case 3:
                i = 2131894534;
                break;
            case 4:
                i = 2131894522;
                break;
            case 5:
                i = 2131894521;
                break;
            case 6:
                i = 2131894530;
                break;
            case 7:
                i = 2131894528;
                break;
            case 8:
                i = 2131894518;
                break;
            case 9:
                i = 2131894519;
                break;
            case 10:
                i = 2131894520;
                break;
            case 11:
                i = 2131894524;
                break;
            case 12:
                i = 2131894525;
                break;
            case 13:
                i = 2131894529;
                break;
            case 14:
                i = 2131894531;
                break;
            case 15:
                i = 2131894532;
                break;
            case 16:
                i = 2131894533;
                break;
            case 17:
                i = 2131894535;
                break;
            case 18:
                i = 2131894536;
                break;
            case 19:
                i = 2131894517;
                break;
            case 20:
                i = 2131894526;
                break;
            default:
                return r3.A0A(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(intValue));
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null) {
            return context.getString(valueOf.intValue());
        }
        return r3.A0A(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(intValue));
    }

    public static boolean A06(AnonymousClass1E7 r2) {
        if (C22971Dz.A0N(r2.A0J) || !TextUtils.isEmpty(r2.A0K())) {
            return false;
        }
        if (!r2.A0C()) {
            return !TextUtils.isEmpty(r2.A0c);
        }
        if (r2.A0A() || TextUtils.isEmpty(r2.A0L())) {
            return false;
        }
        return true;
    }

    public int A0A(AnonymousClass1BI r4) {
        int A0A2 = ((AnonymousClass1MZ) this.A0D.get()).A08.A0A((AnonymousClass1E9) r4);
        if (A0A2 != -1) {
            C53112c0 r1 = (C53112c0) this.A0C.get();
            if (A0A2 >= 3 || r1.A00.A0R(r4)) {
                return 7;
            }
            return 1;
        }
        return 7;
    }

    public C42751yg A0D(AnonymousClass1E7 r4, int i) {
        boolean A0P;
        String A0W;
        C46162Dk r0;
        if (C22971Dz.A0V(r4.A0J)) {
            C46162Dk r02 = (C46162Dk) this.A03.A0A(r4.A0J);
            if (r02 != null) {
                A0P = AnonymousClass000.A1Z(r02.A05, AnonymousClass9IW.VERIFIED);
            }
            return A0F(r4, i, false, true);
        }
        A0P = r4.A0P();
        if (A0P) {
            if (!C22971Dz.A0V(r4.A0J) || (r0 = (C46162Dk) this.A03.A0A(r4.A0J)) == null) {
                A0W = A0W(r4, false);
            } else {
                A0W = r0.A0T;
            }
            return new C42751yg(A0W, AnonymousClass00R.A0C);
        }
        return A0F(r4, i, false, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A04, 8000) != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C42751yg A0G(X.AnonymousClass1E7 r4, java.lang.Integer r5, int r6) {
        /*
            r3 = this;
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r5 != r0) goto L_0x0013
            r0 = 2131898919(0x7f123227, float:1.943277E38)
            java.lang.String r2 = A03(r3, r4, r0)
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
        L_0x000d:
            X.1yg r0 = new X.1yg
            r0.<init>(r2, r1)
            return r0
        L_0x0013:
            X.1yf r1 = r4.A0G
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            if (r5 != r0) goto L_0x0040
            r0 = 7
            if (r6 == r0) goto L_0x003a
            boolean r0 = r4.A0C()
            if (r0 != 0) goto L_0x0040
            if (r1 == 0) goto L_0x002e
            java.lang.String r0 = r1.A08
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0040
        L_0x002e:
            X.0ve r2 = r3.A04
            r1 = 8000(0x1f40, float:1.121E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0040
        L_0x003a:
            r0 = 1
            X.1yg r0 = A01(r3, r4, r0)
            return r0
        L_0x0040:
            r2 = 0
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24921Me.A0G(X.1E7, java.lang.Integer, int):X.1yg");
    }

    public C42751yg A0H(AnonymousClass1E7 r11, boolean z) {
        String str;
        Integer num;
        String A0F2;
        String quantityString;
        Integer num2;
        Integer num3;
        int i;
        AnonymousClass1BI r2 = r11.A0J;
        if (C22971Dz.A0a(r2)) {
            A0F2 = this.A01.A00.getString(2131892379);
            num3 = AnonymousClass00R.A15;
        } else {
            if (C42701yb.A01(r2)) {
                quantityString = r11.A0K();
                num2 = AnonymousClass00R.A0C;
            } else if (!r11.A0E() || !C84104Hw.A00(this.A04)) {
                if (r11.A0O() || (A0h(r11) && r11.A0C() && ((i = r11.A0A) == 2 || i == 3))) {
                    str = A0W(r11, z);
                    num = AnonymousClass00R.A0C;
                } else if (C22971Dz.A0S(r2)) {
                    quantityString = r11.A0K();
                    num2 = AnonymousClass00R.A19;
                } else if (TextUtils.isEmpty(r11.A0K()) || ((r11.A0J instanceof AnonymousClass1E2) && r11.A0I == null)) {
                    if (r11.A0F()) {
                        A0F2 = this.A03.A0F((AnonymousClass1BI) r11.A06(AnonymousClass1BI.class));
                        if (TextUtils.isEmpty(A0F2)) {
                            AnonymousClass1E9 r9 = (AnonymousClass1E9) r11.A06(AnonymousClass1E9.class);
                            r9.getClass();
                            A0F2 = C88374Zl.A00(this.A00, (AnonymousClass1M9) this.A05.get(), this, this.A01, (AnonymousClass1MZ) this.A0D.get(), r9);
                        } else if (TextUtils.isEmpty(A0F2)) {
                            A0F2 = this.A01.A00.getString(2131891156);
                        }
                    } else if (C22971Dz.A0N(r11.A0J)) {
                        Jid A062 = r11.A06(C47712Jo.class);
                        C17960vV.A07(A062);
                        int A002 = A00((C47712Jo) A062);
                        quantityString = this.A01.A00.getResources().getQuantityString(2131755028, A002, new Object[]{Integer.valueOf(A002)});
                        num2 = AnonymousClass00R.A0u;
                    } else {
                        str = null;
                        if (r2 == null) {
                            A0F2 = null;
                        } else {
                            A0F2 = this.A03.A0F(r2);
                        }
                        if (TextUtils.isEmpty(A0F2)) {
                            num = AnonymousClass00R.A00;
                        }
                    }
                    num3 = AnonymousClass00R.A0j;
                } else {
                    quantityString = r11.A0K();
                    num2 = AnonymousClass00R.A01;
                }
                return new C42751yg(str, num);
            } else {
                quantityString = A0W(r11, false);
                num2 = AnonymousClass00R.A0C;
            }
            return new C42751yg(quantityString, num2);
        }
        return new C42751yg(A0F2, num3);
    }

    public String A0K(AnonymousClass1E7 r4) {
        if (!C22971Dz.A0N(r4.A0J) || !TextUtils.isEmpty(r4.A0K())) {
            return A0I(r4);
        }
        Jid A062 = r4.A06(C47712Jo.class);
        C17960vV.A07(A062);
        return A04(this, (AnonymousClass1E9) A062, -1, true);
    }

    public String A0L(AnonymousClass1E7 r8) {
        AnonymousClass1BI r3 = r8.A0J;
        AnonymousClass11S r6 = this.A00;
        if (r6.A0O(r3)) {
            r6.A0I();
            PhoneUserJid phoneUserJid = r6.A0E;
            String A002 = AnonymousClass17K.A00(C42771yi.A00(), phoneUserJid);
            if (!r6.A0N()) {
                AnonymousClass1M9 r1 = (AnonymousClass1M9) this.A05.get();
                AnonymousClass11S r0 = r1.A01;
                r0.A0I();
                AnonymousClass1E7 A0G = r1.A0G(r0.A0E);
                if (A0G != null) {
                    String A0I = A0I(A0G);
                    A0f(r3, phoneUserJid, A0I, "address book");
                    return A0I;
                }
            } else {
                String string = AnonymousClass11Q.A01((AnonymousClass11Q) this.A0B.get()).getString("self_contact_name", (String) null);
                if (string != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("companion=");
                    sb.append(r6.A0N());
                    sb.append("; deviceId=");
                    sb.append(r6.A06());
                    A0f(r3, phoneUserJid, string, sb.toString());
                    return string;
                }
            }
            A0f(r3, phoneUserJid, A002, "phone number");
            return this.A02.A0G(A002);
        } else if (r8.A0H != null) {
            return A0I(r8);
        } else {
            return this.A02.A0G(AnonymousClass17K.A02(r8));
        }
    }

    public String A0M(AnonymousClass1E7 r3) {
        if (this.A00.A0O(r3.A0J)) {
            return this.A01.A00.getString(2131898595);
        }
        if (r3.A0H != null) {
            return A0I(r3);
        }
        if (!TextUtils.isEmpty(r3.A0c)) {
            return A03(this, r3, 2131898919);
        }
        return null;
    }

    public String A0N(AnonymousClass1E7 r8) {
        if (C22971Dz.A0a(r8.A0J)) {
            return this.A01.A00.getString(2131892379);
        }
        if (r8.A0O()) {
            return A0W(r8, false);
        }
        if (!TextUtils.isEmpty(r8.A0K())) {
            return r8.A0K();
        }
        if (!TextUtils.isEmpty(r8.A0P)) {
            return r8.A0P;
        }
        if (r8.A0F()) {
            String A0F2 = this.A03.A0F((AnonymousClass1BI) r8.A06(AnonymousClass1BI.class));
            if (!TextUtils.isEmpty(A0F2)) {
                return A0F2;
            }
            AnonymousClass118 r4 = this.A01;
            AnonymousClass1E9 r6 = (AnonymousClass1E9) r8.A06(AnonymousClass1E9.class);
            r6.getClass();
            return C88374Zl.A00(this.A00, (AnonymousClass1M9) this.A05.get(), this, r4, (AnonymousClass1MZ) this.A0D.get(), r6);
        } else if (C22971Dz.A0N(r8.A0J)) {
            Jid A062 = r8.A06(C47712Jo.class);
            C17960vV.A07(A062);
            int A002 = A00((C47712Jo) A062);
            return this.A01.A00.getResources().getQuantityString(2131755028, A002, new Object[]{Integer.valueOf(A002)});
        } else {
            String A0F3 = this.A03.A0F((AnonymousClass1BI) r8.A06(AnonymousClass1BI.class));
            if (!TextUtils.isEmpty(A0F3)) {
                return A0F3;
            }
            TextUtils.isEmpty(A03(this, r8, 2131898919));
            return A01(this, r8, true).A01;
        }
    }

    public String A0O(AnonymousClass1E7 r8) {
        String str;
        if (C22971Dz.A0a(r8.A0J)) {
            return this.A01.A00.getString(2131892379);
        }
        if (r8.A0O()) {
            return A0W(r8, false);
        }
        if (!TextUtils.isEmpty(r8.A0K())) {
            return r8.A0K();
        }
        if (r8.A0F()) {
            str = this.A03.A0F((AnonymousClass1BI) r8.A06(AnonymousClass1BI.class));
            if (TextUtils.isEmpty(str)) {
                AnonymousClass118 r4 = this.A01;
                AnonymousClass1E9 r6 = (AnonymousClass1E9) r8.A06(AnonymousClass1E9.class);
                r6.getClass();
                return C88374Zl.A00(this.A00, (AnonymousClass1M9) this.A05.get(), this, r4, (AnonymousClass1MZ) this.A0D.get(), r6);
            }
        } else if (C22971Dz.A0N(r8.A0J)) {
            Jid A062 = r8.A06(C47712Jo.class);
            C17960vV.A07(A062);
            int A002 = A00((C47712Jo) A062);
            return this.A01.A00.getResources().getQuantityString(2131755028, A002, new Object[]{Integer.valueOf(A002)});
        } else {
            str = this.A03.A0F((AnonymousClass1BI) r8.A06(AnonymousClass1BI.class));
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(r8.A0c)) {
                    return A03(this, r8, 2131898919);
                }
                return this.A02.A0G(AnonymousClass17K.A02(r8));
            }
        }
        return str;
    }

    public String A0V(AnonymousClass1E7 r3, AnonymousClass1BI r4, Integer num, int i) {
        if (num != AnonymousClass00R.A0Y || !A0k(r3, r4)) {
            return A0G(r3, num, i).A01;
        }
        return ((AnonymousClass1M4) this.A0A.get()).BMm((AnonymousClass1E1) r3.A06(AnonymousClass1E1.class));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (X.C42701yb.A01(r4.A0J) != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        if (android.text.TextUtils.isEmpty(r4.A0K()) == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0W(X.AnonymousClass1E7 r4, boolean r5) {
        /*
            r3 = this;
            X.1BI r0 = r4.A0J
            boolean r0 = X.C22971Dz.A0Z(r0)
            if (r0 != 0) goto L_0x0066
            int r1 = r4.A0A
            r0 = 3
            if (r1 == r0) goto L_0x0018
            boolean r0 = r3.A0h(r4)
            r2 = 2
            if (r0 == 0) goto L_0x002f
            int r0 = r4.A0A
            if (r0 != r2) goto L_0x002f
        L_0x0018:
            java.lang.String r0 = r4.A0K()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0056
            X.1BI r0 = r4.A0J
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x0056
        L_0x002a:
            java.lang.String r0 = r4.A0K()
            return r0
        L_0x002f:
            boolean r0 = r4.A0E()
            if (r0 != 0) goto L_0x0066
            int r1 = r4.A0A
            if (r1 == r2) goto L_0x0047
            r0 = 1
            if (r1 == r0) goto L_0x0047
            boolean r0 = r4.A0F()
            if (r0 == 0) goto L_0x006b
            boolean r0 = r4.A0j
            if (r0 == 0) goto L_0x006b
            goto L_0x002a
        L_0x0047:
            X.2lf r0 = r4.A0H
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r4.A0K()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006b
            goto L_0x002a
        L_0x0056:
            if (r5 != 0) goto L_0x0066
            X.2lf r0 = r4.A0H
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = r4.A0K()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x002a
        L_0x0066:
            java.lang.String r0 = r4.A0L()
            return r0
        L_0x006b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24921Me.A0W(X.1E7, boolean):java.lang.String");
    }

    public String A0X(AnonymousClass1BI r2) {
        return A0J(((AnonymousClass1M9) this.A05.get()).A0H(r2));
    }

    @Deprecated
    public String A0Y(GroupJid groupJid) {
        if (groupJid == null) {
            return null;
        }
        return this.A03.A0F(groupJid);
    }

    public String A0b(Iterable iterable, int i, int i2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z3 = false;
        if (i > 0) {
            z3 = true;
        }
        Iterator it = iterable.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            AnonymousClass1E7 r0 = (AnonymousClass1E7) it.next();
            i3++;
            if (!z3 || i3 <= i) {
                C42751yg A0E2 = A0E(r0, i2, z2);
                Integer num = A0E2.A00;
                String str = A0E2.A01;
                if (str != null) {
                    if (num == AnonymousClass00R.A0N) {
                        arrayList3.add(str);
                    } else if (num == AnonymousClass00R.A0Y) {
                        arrayList2.add(str);
                    } else {
                        arrayList.add(str);
                    }
                }
            }
        }
        Collections.sort(arrayList, A0c());
        Collections.sort(arrayList2, A0c());
        Collections.sort(arrayList3);
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList3);
        if (z) {
            i3++;
            arrayList.add(this.A01.A00.getString(2131898595));
        }
        if (i3 <= i || i < 0) {
            return C60592oI.A00(this.A02, arrayList, z2);
        }
        int size = arrayList.size();
        Object[] objArr = new String[(size + 1)];
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i4] = arrayList.get(i4);
        }
        int i5 = i3 - size;
        objArr[size] = this.A01.A00.getResources().getQuantityString(2131755269, i5, new Object[]{Integer.valueOf(i5)});
        return C60592oI.A00(this.A02, Arrays.asList(objArr), z2);
    }

    public Collator A0c() {
        Collator instance = Collator.getInstance(this.A02.A0N());
        instance.setDecomposition(1);
        return instance;
    }

    public ArrayList A0d(Context context, List list) {
        String A0I;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI r2 = (AnonymousClass1BI) it.next();
            AnonymousClass1E7 A0H = ((AnonymousClass1M9) this.A05.get()).A0H(r2);
            if (this.A00.A0O(r2)) {
                A0I = AnonymousClass2T2.A00(context, this, this.A02, A0H);
            } else if (!C22971Dz.A0a(A0H.A0J)) {
                A0I = A0I(A0H);
                if (A0I == null) {
                }
            }
            arrayList.add(A0I);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r2.equals(r1) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r8.equals(r1) != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0f(X.AnonymousClass1BI r10, com.whatsapp.jid.PhoneUserJid r11, java.lang.String r12, java.lang.String r13) {
        /*
            r9 = this;
            if (r11 == 0) goto L_0x00a0
            if (r12 == 0) goto L_0x00a0
            X.00H r2 = r9.A0F     // Catch:{ 1Mf -> 0x00a0 }
            java.lang.Object r0 = r2.get()     // Catch:{ 1Mf -> 0x00a0 }
            X.1yi r0 = (X.C42771yi) r0     // Catch:{ 1Mf -> 0x00a0 }
            r8 = 0
            X.1ym r1 = r0.A0H(r12, r8)     // Catch:{ 1Mf -> 0x00a0 }
            java.lang.Object r0 = r2.get()     // Catch:{ 1Mf -> 0x00a0 }
            X.1yi r0 = (X.C42771yi) r0     // Catch:{ 1Mf -> 0x00a0 }
            boolean r0 = r0.A0M(r1)     // Catch:{ 1Mf -> 0x00a0 }
            if (r0 != 0) goto L_0x001e
            return
        L_0x001e:
            boolean r5 = r10 instanceof com.whatsapp.jid.PhoneUserJid
            java.lang.String r2 = X.AnonymousClass17K.A04(r10)
            java.lang.String r3 = X.AnonymousClass17K.A04(r11)
            java.lang.String r1 = X.C63942tw.A04(r12)
            r0 = 4
            if (r2 == 0) goto L_0x009e
            java.lang.String r2 = X.AnonymousClass1EG.A0B(r2, r0)
        L_0x0033:
            if (r3 == 0) goto L_0x0039
            java.lang.String r8 = X.AnonymousClass1EG.A0B(r3, r0)
        L_0x0039:
            java.lang.String r1 = X.AnonymousClass1EG.A0B(r1, r0)
            r7 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0048
            boolean r0 = r2.equals(r1)
            r6 = 1
            if (r0 == 0) goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            if (r8 == 0) goto L_0x0052
            boolean r0 = r8.equals(r1)
            r3 = 1
            if (r0 == 0) goto L_0x0053
        L_0x0052:
            r3 = 0
        L_0x0053:
            if (r2 == 0) goto L_0x009c
            if (r8 == 0) goto L_0x009c
            boolean r0 = r2.equals(r8)
            if (r0 != 0) goto L_0x009c
        L_0x005d:
            if (r6 != 0) goto L_0x0063
            if (r3 != 0) goto L_0x0063
            if (r7 == 0) goto L_0x00a0
        L_0x0063:
            X.190 r2 = r9.A08
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "contactVsDisplay="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; jidVsDisplay="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; contactVsJid="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "; contactIsPhone="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "; context="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "contactnames/wrong display name"
            r2.A0G(r0, r1, r4)
            return
        L_0x009c:
            r7 = 0
            goto L_0x005d
        L_0x009e:
            r2 = r8
            goto L_0x0033
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24921Me.A0f(X.1BI, com.whatsapp.jid.PhoneUserJid, java.lang.String, java.lang.String):void");
    }

    public void A0g(AnonymousClass1E9 r2) {
        this.A06.remove(r2);
        this.A07.remove(r2);
    }

    public boolean A0i(AnonymousClass1E7 r4) {
        if (r4.A0H != null) {
            String A0K = r4.A0K();
            String A0L = r4.A0L();
            if (TextUtils.isEmpty(A0L) || TextUtils.isEmpty(A0K) || !AnonymousClass1EG.A05(A0K).equals(AnonymousClass1EG.A05(A0L))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r5.A0I != null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0k(X.AnonymousClass1E7 r5, X.AnonymousClass1BI r6) {
        /*
            r4 = this;
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r3 = r5.A06(r0)
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.1BI r0 = r5.A0J
            boolean r0 = r0 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x0013
            X.1E7 r1 = r5.A0I
            r0 = 1
            if (r1 == 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r2 = 0
            if (r0 == 0) goto L_0x0040
            X.1CJ r0 = r4.A03
            boolean r0 = r0.A0R(r6)
            if (r0 == 0) goto L_0x0040
            if (r6 == 0) goto L_0x0040
            if (r3 == 0) goto L_0x0040
            X.1EC r6 = (X.AnonymousClass1EC) r6
            X.00H r1 = r4.A0D
            java.lang.Object r0 = r1.get()
            X.1MZ r0 = (X.AnonymousClass1MZ) r0
            boolean r0 = r0.A0K(r6)
            if (r0 != 0) goto L_0x0040
            java.lang.Object r0 = r1.get()
            X.1MZ r0 = (X.AnonymousClass1MZ) r0
            boolean r0 = r0.A0Q(r6, r3)
            if (r0 != 0) goto L_0x0040
            r2 = 1
        L_0x0040:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24921Me.A0k(X.1E7, X.1BI):boolean");
    }

    public boolean A0m(AnonymousClass1E7 r20, List list, boolean z, boolean z2) {
        String A022;
        AnonymousClass118 r7;
        AnonymousClass11S r5;
        AnonymousClass1M9 r4;
        AnonymousClass1MZ r3;
        Jid A062;
        boolean equals;
        List<String> list2 = list;
        if (list != null && !list2.isEmpty()) {
            AnonymousClass1E7 r2 = r20;
            if (!TextUtils.isEmpty(r2.A0K())) {
                A022 = C63462t7.A03(r2.A0K());
            } else if (C22971Dz.A0N(r2.A0J)) {
                Jid A063 = r2.A06(C47712Jo.class);
                C17960vV.A07(A063);
                A022 = A04(this, (AnonymousClass1E9) A063, -1, false);
            } else if (r2.A0F()) {
                if (C18020vd.A05(C18040vf.A02, this.A04, 6645)) {
                    AnonymousClass1CJ r32 = this.A03;
                    Class<AnonymousClass1E9> cls = AnonymousClass1E9.class;
                    Jid A064 = r2.A06(cls);
                    C17960vV.A07(A064);
                    A022 = r32.A0F((AnonymousClass1BI) A064);
                    if (TextUtils.isEmpty(A022)) {
                        r7 = this.A01;
                        r5 = this.A00;
                        r4 = (AnonymousClass1M9) this.A05.get();
                        r3 = (AnonymousClass1MZ) this.A0D.get();
                        A062 = r2.A06(cls);
                    }
                } else {
                    r7 = this.A01;
                    r5 = this.A00;
                    r4 = (AnonymousClass1M9) this.A05.get();
                    r3 = (AnonymousClass1MZ) this.A0D.get();
                    A062 = r2.A06(AnonymousClass1E9.class);
                }
                C17960vV.A07(A062);
                A022 = C88374Zl.A00(r5, r4, this, r7, r3, (AnonymousClass1E9) A062);
            } else if (!C22971Dz.A0V(r2.A0J) || AnonymousClass1EG.A0H(A0I(r2))) {
                A022 = AnonymousClass17K.A02(r2);
            } else {
                A022 = A0I(r2);
            }
            Jid A065 = r2.A06(AnonymousClass1BI.class);
            C17960vV.A07(A065);
            AnonymousClass1BI r33 = (AnonymousClass1BI) A065;
            String A042 = AnonymousClass17K.A04(r33);
            AnonymousClass11S r8 = this.A00;
            if (r8.A0O(r33)) {
                ArrayList arrayList = new ArrayList();
                Context context = this.A01.A00;
                for (String lowerCase : context.getResources().getStringArray(2130903065)) {
                    arrayList.add(lowerCase.toLowerCase(this.A02.A0N()));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (str.contains((String) it2.next())) {
                                return true;
                            }
                        }
                    }
                }
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String str2 = (String) it3.next();
                    r8.A0I();
                    AnonymousClass1E8 r42 = r8.A0D;
                    if (r42 != null) {
                        String A002 = AnonymousClass2T2.A00(context, this, this.A02, r42);
                        String str3 = r42.A0T;
                        String str4 = r42.A0S;
                        String str5 = r42.A0c;
                        String str6 = r42.A0Y;
                        String str7 = r42.A0W;
                        Locale locale = Locale.ROOT;
                        if (A002.toLowerCase(locale).contains(str2) || ((str3 != null && str3.toLowerCase(locale).contains(str2)) || ((str4 != null && str4.toLowerCase(locale).contains(str2)) || ((str5 != null && str5.toLowerCase(locale).contains(str2)) || (str6 != null && str6.toLowerCase(locale).contains(str2)))))) {
                            break;
                        } else if (str7 != null && str7.toLowerCase(locale).contains(str2)) {
                            return true;
                        }
                    }
                }
            }
            C18000vb r52 = this.A02;
            boolean z3 = z;
            if (C20103A7h.A04(r52, A022, list2, z3) || ((r2.A0C() && ((r2.A0A() || r2.A0E()) && C20103A7h.A04(r52, r2.A0L(), list2, z3))) || ((C22971Dz.A0T(r2.A0J) && C20103A7h.A04(r52, r2.A0K(), list2, z3)) || C20103A7h.A04(r52, r2.A0W, list2, z3) || C20103A7h.A04(r52, r2.A0Q, list2, z3) || C20103A7h.A04(r52, r2.A0b, list2, z3) || (r2.A0I == null && z2 && C20103A7h.A04(r52, A0R(r2), list2, z3))))) {
                return true;
            }
            if (C22971Dz.A0N(r2.A0J) || r2.A0F() || TextUtils.isEmpty(A042)) {
                return false;
            }
            for (String str8 : list2) {
                String str9 = r33.user;
                if (z) {
                    equals = str9.contains(str8);
                    continue;
                } else {
                    equals = str9.equals(str8);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
        }
        return true;
    }

    public C24921Me(AnonymousClass190 r2, AnonymousClass11S r3, AnonymousClass118 r4, C18000vb r5, AnonymousClass1CJ r6, C18030ve r7, AnonymousClass12L r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        this.A01 = r4;
        this.A04 = r7;
        this.A08 = r2;
        this.A00 = r3;
        this.A03 = r6;
        this.A09 = r8;
        this.A05 = r9;
        this.A02 = r5;
        this.A0F = r10;
        this.A0C = r11;
        this.A0D = r12;
        this.A0A = r13;
        this.A0B = r14;
        this.A0E = r15;
    }

    public static String A03(C24921Me r2, AnonymousClass1E7 r3, int i) {
        String A0R = r2.A0R(r3);
        if (A0R == null) {
            return "";
        }
        return r2.A01.A00.getString(i, new Object[]{A0R});
    }

    public static boolean A05(C24921Me r4, Iterable iterable, Set set) {
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AnonymousClass1BI r1 = (AnonymousClass1BI) it.next();
            if (r4.A00.A0O(r1)) {
                z = true;
            } else {
                set.add(((AnonymousClass1M9) r4.A05.get()).A0H(r1));
            }
        }
        return z;
    }

    public int A09(AnonymousClass1E7 r2, AnonymousClass1BI r3) {
        if (!C22971Dz.A0e(r3)) {
            return 2;
        }
        return A07(r2, r3);
    }

    public int A0B(AnonymousClass1BI r2) {
        if (!C22971Dz.A0e(r2) || !(r2 instanceof GroupJid)) {
            return 2;
        }
        return A0A(r2);
    }

    public C42751yg A0C(AnonymousClass1E7 r4) {
        if (!r4.A0B()) {
            if (!C18020vd.A05(C18040vf.A02, this.A04, 8000)) {
                return new C42751yg(A03(this, r4, 2131898919), AnonymousClass00R.A0Y);
            }
        }
        return A01(this, r4, true);
    }

    public C42751yg A0F(AnonymousClass1E7 r4, int i, boolean z, boolean z2) {
        Integer num;
        C42751yg A0H = A0H(r4, z);
        if (!TextUtils.isEmpty(A0H.A01)) {
            return A0H;
        }
        String A032 = A03(this, r4, 2131898919);
        if (!TextUtils.isEmpty(A032) && i == 7) {
            num = AnonymousClass00R.A0Y;
        } else if (i != 8) {
            return A01(this, r4, z2);
        } else {
            A032 = A0M(r4);
            num = AnonymousClass00R.A02;
        }
        return new C42751yg(A032, num);
    }

    public String A0J(AnonymousClass1E7 r2) {
        if (r2.A0B() || !A06(r2)) {
            return A0T(r2, -1);
        }
        return A03(this, r2, 2131898919);
    }

    public String A0Q(AnonymousClass1E7 r2) {
        return A03(this, r2, 2131898919);
    }

    public String A0R(AnonymousClass1E7 r2) {
        if (!r2.A0C() && !TextUtils.isEmpty(r2.A0c)) {
            return r2.A0c;
        }
        if ((!r2.A0C() || r2.A0A() || TextUtils.isEmpty(r2.A0L())) && !C42761yh.A00(r2, this.A09)) {
            return null;
        }
        return r2.A0L();
    }

    public String A0S(AnonymousClass1E7 r7, int i) {
        C42751yg A0D2 = A0D(r7, i);
        String str = A0D2.A01;
        Integer num = A0D2.A00;
        String str2 = A0G(r7, num, i).A01;
        if (AnonymousClass00R.A0Y == num && i == 7) {
            str = A03(this, r7, 2131898920);
        }
        if (!TextUtils.isEmpty(str2)) {
            str = this.A01.A00.getString(2131888788, new Object[]{str, str2});
        }
        if (str != null) {
            return str.trim();
        }
        return "";
    }

    public boolean A0h(AnonymousClass1E7 r4) {
        C18030ve r2;
        int i;
        if (r4.A0G()) {
            r2 = this.A04;
            i = 2520;
        } else {
            String str = r4.A0V;
            if (str == null || !str.startsWith("ent:")) {
                return false;
            }
            r2 = this.A04;
            i = 2519;
        }
        return !C18020vd.A05(C18040vf.A02, r2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r5 == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        if (r1 != 1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0046, code lost:
        if (r7.A0A() == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0049, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0j(X.AnonymousClass1E7 r7, int r8) {
        /*
            r6 = this;
            boolean r5 = A06(r7)
            r1 = 1
            if (r8 == r1) goto L_0x0012
            r0 = 5
            if (r8 == r0) goto L_0x0012
            r0 = 7
            if (r8 == r0) goto L_0x0012
            r0 = 8
            if (r8 == r0) goto L_0x0012
            r1 = 0
        L_0x0012:
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0019
            r2 = 1
            if (r5 != 0) goto L_0x0042
        L_0x0019:
            r2 = 0
            if (r5 != 0) goto L_0x0042
            int r1 = r7.A0A
            r0 = 2
            if (r1 == r0) goto L_0x0023
            if (r1 != r3) goto L_0x0049
        L_0x0023:
            r1 = 1
        L_0x0024:
            X.1BI r0 = r7.A0J
            boolean r0 = X.C22971Dz.A0N(r0)
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = r7.A0K()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0041
            if (r2 != 0) goto L_0x0041
            java.lang.String r0 = r7.A0L()
            if (r0 == 0) goto L_0x0040
            if (r1 == 0) goto L_0x0041
        L_0x0040:
            r4 = 1
        L_0x0041:
            return r4
        L_0x0042:
            boolean r0 = r7.A0A()
            if (r0 != 0) goto L_0x0049
            goto L_0x0023
        L_0x0049:
            r1 = 0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24921Me.A0j(X.1E7, int):boolean");
    }
}
