package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1gn  reason: invalid class name and case insensitive filesystem */
public class C32191gn {
    public static final int[] A0X = {2131888940, 2131888941};
    public static final int[] A0Y = {2131755049, 2131888488, 2131888489, 2131755048, 2131755048};
    public static final int[] A0Z = {2131896683, 2131896681, 2131896682};
    public static final int[][] A0a = {new int[]{2131886650, 2131886649}, new int[]{2131892986, 2131892985}};
    public static final int[][] A0b = {new int[]{2131888942, 2131888945}, new int[]{2131888943, 2131888944}};
    public static final int[][] A0c = {new int[]{2131891222, 2131891221}, new int[]{2131891224, 2131891223}, new int[]{2131891226, 2131891225}};
    public static final int[][] A0d = {new int[]{2131891228, 2131891227}, new int[]{2131891230, 2131891229}, new int[]{2131891232, 2131891231}};
    public static final int[][] A0e = {new int[]{2131888934, 2131888937}, new int[]{2131888935, 2131888936}};
    public static final int[][] A0f = {new int[]{2131896679, 2131896680}, new int[]{2131896675, 2131896676}, new int[]{2131896677, 2131896678}};
    public static final int[][] A0g = {new int[]{2131896685, 2131896686}, new int[]{2131896684, 2131896689}, new int[]{2131896687, 2131896688}};
    public static final int[][] A0h = {new int[]{2131891028, 2131891031}, new int[]{2131891029, 2131891030}};
    public static final int[][] A0i = {new int[]{2131893505, 2131893499, 2131893500}, new int[]{2131890954, 2131890948, 2131890949}};
    public static final int[][] A0j = {new int[]{2131893507, 2131893503, 2131893504}, new int[]{2131890956, 2131890952, 2131890953}};
    public static final int[][] A0k = {new int[]{2131755430, 2131755428, 2131755429}, new int[]{2131896710, 2131896708, 2131896709}, new int[]{2131755427, 2131755425, 2131755426}};
    public static final int[][] A0l = {new int[]{2131893506, 2131893501, 2131893502}, new int[]{2131890955, 2131890950, 2131890951}};
    public static final int[][] A0m = {new int[]{2131886650, 2131886649}, new int[]{2131892984, 2131892983}};
    public static final int[][] A0n = {new int[]{2131890167, 2131890164, 2131890165}, new int[]{2131890168, 2131890169, 2131890166}};
    public static final int[][] A0o = {new int[]{2131755439, 2131755435, 2131755437}, new int[]{2131896716, 2131896712, 2131896714}, new int[]{2131896722, 2131896720, 2131896721}, new int[]{2131896719, 2131896717, 2131896718}, new int[]{2131755433, 2131755431, 2131755432}};
    public static final int[][] A0p = {new int[]{2131755438, 2131755434, 2131755436}, new int[]{2131896715, 2131896711, 2131896713}, new int[]{2131896722, 2131896720, 2131896721}, new int[]{2131896719, 2131896717, 2131896718}, new int[]{2131755433, 2131755431, 2131755432}};
    public static final int[][] A0q = {new int[]{2131755445, 2131755443, 2131755444}, new int[]{2131896725, 2131896723, 2131896724}, new int[]{2131755442, 2131755440, 2131755441}};
    public final C19880zA A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1M9 A02;
    public final C24921Me A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass118 A05;
    public final C18000vb A06;
    public final AnonymousClass1CJ A07;
    public final AnonymousClass1MZ A08;
    public final C18030ve A09;
    public final AnonymousClass126 A0A;
    public final C32011gU A0B;
    public final AnonymousClass00H A0C;
    public final C19880zA A0D;
    public final C19880zA A0E;
    public final C19880zA A0F;
    public final C19880zA A0G;
    public final AnonymousClass190 A0H;
    public final C32151gj A0I;
    public final AnonymousClass12B A0J;
    public final C24751Ln A0K;
    public final AnonymousClass12L A0L;
    public final AnonymousClass1MB A0M;
    public final AnonymousClass1R5 A0N;
    public final AnonymousClass1PU A0O;
    public final C32131gh A0P;
    public final C32161gk A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;

    private String A03(AnonymousClass1E7 r4, int i) {
        String A0U2 = this.A03.A0U(r4, i, false);
        if (A0U2 == null) {
            return null;
        }
        return this.A06.A0F(A0U2);
    }

    private String A08(C436420i r10, int i, int i2, int i3) {
        List<AnonymousClass1BI> list = ((C48392Mh) r10).A01;
        if (list.size() == 1 && this.A01.A0O((AnonymousClass1BI) list.get(0))) {
            return this.A05.A00.getString(i);
        }
        AnonymousClass11S r4 = this.A01;
        r4.A0I();
        int i4 = -1;
        if (list.contains(r4.A0E) || list.contains(r4.A09())) {
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass1BI r1 : list) {
                if (!r4.A0O(r1)) {
                    arrayList.add(r1);
                }
            }
            AnonymousClass1BI r12 = r10.A0v.A00;
            if (r12 != null) {
                i4 = this.A03.A0B(r12);
            }
            return this.A05.A00.getResources().getQuantityString(i2, arrayList.size(), new Object[]{this.A06.A0F(this.A03.A0a(arrayList, i4))});
        }
        AnonymousClass1BI r13 = r10.A0v.A00;
        if (r13 != null) {
            i4 = this.A03.A0B(r13);
        }
        return this.A05.A00.getResources().getQuantityString(i3, list.size(), new Object[]{this.A06.A0F(this.A03.A0a(list, i4))});
    }

    private String A0F(String str, Collection collection, int i, boolean z) {
        char c;
        int[][] iArr;
        ArrayList A0H2 = A0H(collection, 3);
        if (z) {
            c = 0;
        } else {
            c = 1;
            if (str == null) {
                c = 2;
            }
        }
        Pair A002 = A00(A0H2, i);
        if (C18020vd.A05(C18040vf.A02, this.A09, 4345)) {
            iArr = A0o;
        } else {
            iArr = A0p;
        }
        int intValue = ((Number) A002.first).intValue();
        if (intValue == 1) {
            return this.A05.A00.getResources().getString(iArr[1][c], new Object[]{A0H2.get(0), str});
        } else if (intValue != 2) {
            Context context = this.A05.A00;
            if (intValue == 3) {
                return context.getResources().getString(iArr[3][c], new Object[]{A0H2.get(0), A0H2.get(1), A0H2.get(2), str});
            } else if (intValue != 4) {
                return context.getResources().getQuantityString(iArr[0][c], i, new Object[]{Integer.valueOf(i), str});
            } else {
                Resources resources = context.getResources();
                int i2 = iArr[4][c];
                Object obj = A002.second;
                return resources.getQuantityString(i2, ((Number) obj).intValue(), new Object[]{A0H2.get(0), A0H2.get(1), str, obj});
            }
        } else {
            return this.A05.A00.getResources().getString(iArr[2][c], new Object[]{A0H2.get(0), A0H2.get(1), str});
        }
    }

    public boolean A0U(AnonymousClass206 r5, boolean z) {
        AnonymousClass1E7 A0F2;
        if (z) {
            AnonymousClass1BI r1 = r5.A0v.A00;
            Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
            AnonymousClass1EC A002 = C42941yz.A00(r1);
            if (!(A002 == null || (A0F2 = this.A02.A0F(A002)) == null || this.A07.A06(A002) != 0)) {
                return C62822s3.A01(this.A08, A0F2, (C42211xo) this.A0W.get());
            }
        }
        return false;
    }

    private PhoneUserJid A01(UserJid userJid, String str) {
        if (userJid instanceof PhoneUserJid) {
            return (PhoneUserJid) userJid;
        }
        if (userJid instanceof AnonymousClass1E2) {
            return this.A0K.A0D((AnonymousClass1E1) userJid);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid ");
        sb.append(str);
        sb.append(" JID type: ");
        sb.append(userJid);
        throw new UnsupportedOperationException(sb.toString());
    }

    public static String A02(Context context, String str, boolean z) {
        if (str == null) {
            int i = 2131890875;
            if (z) {
                i = 2131890874;
            }
            return context.getString(i);
        }
        int i2 = 2131890873;
        if (z) {
            i2 = 2131890872;
        }
        return context.getString(i2, new Object[]{str});
    }

    private String A05(C436420i r10) {
        int i;
        Object[] objArr;
        C48382Mg r102 = (C48382Mg) r10;
        String A0F2 = this.A07.A0F(r102.A19(2));
        if (A0F2 == null) {
            A0F2 = r102.A1B(2);
        }
        List list = r102.A01;
        if (list.size() != 1 || !this.A01.A0O((AnonymousClass1BI) list.get(0))) {
            return this.A05.A00.getResources().getQuantityString(2131755024, list.size(), new Object[]{this.A06.A0F(this.A03.A0a(list, -1))});
        }
        if (A0F2 == null) {
            i = 2131886800;
            objArr = new Object[0];
        } else {
            i = 2131886801;
            objArr = new Object[]{A0F2};
        }
        return this.A05.A00.getString(i, objArr);
    }

    private String A07(C436420i r6, int i, int i2, int i3) {
        if (C22971Dz.A0N(r6.A0v.A00)) {
            return this.A05.A00.getString(i, new Object[]{A04(r6)});
        }
        boolean A0O2 = this.A01.A0O(r6.A0H());
        Context context = this.A05.A00;
        if (A0O2) {
            return context.getString(i2);
        }
        return context.getResources().getQuantityString(i3, 1, new Object[]{A04(r6)});
    }

    private String A0C(C436420i r20, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String A0a2;
        String A0a3;
        String A0a4;
        C436420i r11 = r20;
        List list = ((C48392Mh) r11).A01;
        int size = list.size();
        if (z) {
            i = 2131891119;
            i2 = 2131891097;
            i3 = 2131755176;
            i4 = 2131891113;
            i5 = 2131891111;
            boolean z3 = z2;
            if (z2 && !A0I(this.A09, list.size())) {
                if (A0U(r11, z3)) {
                    i4 = 2131891115;
                }
                if (C62822s3.A00(this.A07, this.A08, r11)) {
                    i5 = 2131891112;
                }
            }
            i6 = 2131755212;
        } else {
            i = 2131891120;
            i2 = 2131891108;
            i3 = 2131755181;
            i4 = 2131891117;
            i5 = 2131891116;
            i6 = 2131755213;
        }
        AnonymousClass1BI r12 = r11.A0v.A00;
        if (C22971Dz.A0N(r12)) {
            return this.A05.A00.getResources().getQuantityString(i6, size, new Object[]{this.A06.A0F(this.A03.A0a(list, -1))});
        }
        AnonymousClass11S r13 = this.A01;
        if (r13.A0O(r11.A0H())) {
            Context context = this.A05.A00;
            Object[] objArr = new Object[1];
            C18000vb r2 = this.A06;
            boolean A0I2 = A0I(this.A09, size);
            C24921Me r1 = this.A03;
            if (A0I2) {
                A0a4 = r1.A0Z(list, 2);
            } else {
                A0a4 = r1.A0a(list, -1);
            }
            objArr[0] = r2.A0F(A0a4);
            return context.getString(i, objArr);
        }
        String A042 = A04(r11);
        if (A042 == null) {
            if (size == 1 && r13.A0O((AnonymousClass1BI) list.get(0))) {
                return this.A05.A00.getString(i2);
            }
            Resources resources = this.A05.A00.getResources();
            Object[] objArr2 = new Object[1];
            C18000vb r22 = this.A06;
            boolean A0I3 = A0I(this.A09, size);
            C24921Me r14 = this.A03;
            if (A0I3) {
                A0a3 = r14.A0Z(list, 2);
            } else {
                A0a3 = r14.A0a(list, -1);
            }
            objArr2[0] = r22.A0F(A0a3);
            return resources.getQuantityString(i3, size, objArr2);
        } else if (size != 1 || !r13.A0O((AnonymousClass1BI) list.get(0))) {
            C24921Me r132 = this.A03;
            int A0B2 = r132.A0B(r12);
            Context context2 = this.A05.A00;
            Object[] objArr3 = new Object[2];
            objArr3[0] = A042;
            C18000vb r15 = this.A06;
            if (A0I(this.A09, size)) {
                HashSet hashSet = new HashSet();
                A0a2 = r132.A0b(hashSet, 2, A0B2, C24921Me.A05(r132, list, hashSet), true);
            } else {
                A0a2 = r132.A0a(list, A0B2);
            }
            objArr3[1] = r15.A0F(A0a2);
            return context2.getString(i5, objArr3);
        } else {
            return this.A05.A00.getString(i4, new Object[]{A042});
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        if (r10.A01.A0O((X.AnonymousClass1BI) r8.get(0)) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r3 == null) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A0D(X.C48392Mh r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.AnonymousClass98T
            r9 = 0
            if (r0 == 0) goto L_0x007d
            X.1CJ r2 = r10.A07
            r1 = r11
            X.2Mg r1 = (X.C48382Mg) r1
            r0 = 1
            com.whatsapp.jid.GroupJid r0 = r1.A19(r0)
            java.lang.String r3 = r2.A0F(r0)
            if (r3 != 0) goto L_0x001a
        L_0x0015:
            r0 = 1
            java.lang.String r3 = r1.A1B(r0)
        L_0x001a:
            X.1BI r1 = r11.A0H()
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A01(r1)
            java.util.List r8 = r11.A01
            if (r2 == 0) goto L_0x007b
            X.1M9 r0 = r10.A02
            X.1E7 r1 = r0.A0H(r2)
            X.1Me r0 = r10.A03
            java.lang.String r9 = r0.A0I(r1)
            X.11S r0 = r10.A01
            boolean r5 = r0.A0O(r2)
        L_0x003a:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r7 = 1
            r2 = r0 ^ 1
            int r0 = r8.size()
            r6 = 0
            if (r0 != r7) goto L_0x005b
            X.11S r1 = r10.A01
            java.lang.Object r0 = r8.get(r6)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            boolean r0 = r1.A0O(r0)
            r1 = 1
            if (r0 != 0) goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            if (r5 == 0) goto L_0x0091
            X.118 r0 = r10.A05
            android.content.Context r5 = r0.A00
            r4 = 2131891027(0x7f121353, float:1.9416762E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            X.0vb r2 = r10.A06
            X.1Me r1 = r10.A03
            r0 = -1
            java.lang.String r0 = r1.A0a(r8, r0)
            java.lang.String r0 = r2.A0F(r0)
            r3[r6] = r0
            java.lang.String r0 = r5.getString(r4, r3)
            return r0
        L_0x007b:
            r5 = 0
            goto L_0x003a
        L_0x007d:
            boolean r0 = r11 instanceof X.AnonymousClass2MU
            if (r0 == 0) goto L_0x0087
            r0 = r11
            X.2MU r0 = (X.AnonymousClass2MU) r0
            java.lang.String r3 = r0.A00
            goto L_0x001a
        L_0x0087:
            boolean r0 = r11 instanceof X.C1772897z
            if (r0 == 0) goto L_0x008f
            r1 = r11
            X.2Mg r1 = (X.C48382Mg) r1
            goto L_0x0015
        L_0x008f:
            r3 = r9
            goto L_0x001a
        L_0x0091:
            if (r2 == 0) goto L_0x00c7
            r5 = 2
            X.118 r0 = r10.A05
            if (r1 == 0) goto L_0x00ab
            android.content.Context r2 = r0.A00
            int[][] r0 = A0h
            r0 = r0[r7]
            r1 = r0[r4]
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r6] = r9
            r0[r7] = r3
            java.lang.String r0 = r2.getString(r1, r0)
            return r0
        L_0x00ab:
            android.content.Context r4 = r0.A00
            r3 = 2131891026(0x7f121352, float:1.941676E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r6] = r9
            X.0vb r1 = r10.A06
            X.1Me r0 = r10.A03
            java.lang.String r0 = r0.A0a(r8, r7)
            java.lang.String r0 = r1.A0F(r0)
            r2[r7] = r0
            java.lang.String r0 = r4.getString(r3, r2)
            return r0
        L_0x00c7:
            X.118 r0 = r10.A05
            if (r1 == 0) goto L_0x00dc
            android.content.Context r2 = r0.A00
            int[][] r0 = A0h
            r0 = r0[r6]
            r1 = r0[r4]
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r6] = r3
            java.lang.String r0 = r2.getString(r1, r0)
            return r0
        L_0x00dc:
            android.content.Context r0 = r0.A00
            android.content.res.Resources r5 = r0.getResources()
            r4 = 2131755172(0x7f1000a4, float:1.9141216E38)
            int r3 = r8.size()
            java.lang.Object[] r2 = new java.lang.Object[r7]
            X.0vb r1 = r10.A06
            X.1Me r0 = r10.A03
            java.lang.String r0 = r0.A0a(r8, r7)
            java.lang.String r0 = r1.A0F(r0)
            r2[r6] = r0
            java.lang.String r0 = r5.getQuantityString(r4, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32191gn.A0D(X.2Mh):java.lang.String");
    }

    private String A0G(String str, Collection collection, int i, boolean z) {
        char c;
        if (z) {
            c = 0;
        } else {
            c = 1;
            if (str == null) {
                c = 2;
            }
        }
        ArrayList A0H2 = A0H(collection, 1);
        int size = A0H2.size();
        AnonymousClass118 r0 = this.A05;
        if (size < 1) {
            return r0.A00.getResources().getQuantityString(A0q[0][c], i, new Object[]{Integer.valueOf(i), str});
        } else if (i == 1) {
            return r0.A00.getString(A0q[1][c], new Object[]{A0H2.get(0), str});
        } else {
            return r0.A00.getResources().getQuantityString(A0q[2][c], i - 1, new Object[]{A0H2.get(0), Integer.valueOf(i - 1), str});
        }
    }

    public static ArrayList A0H(Collection collection, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext() && arrayList.size() < i) {
            String str = ((A2B) it.next()).A06;
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static boolean A0I(C18030ve r2, int i) {
        if (i <= Math.max(C18020vd.A00(C18040vf.A02, r2, 3449), 2) || i <= 3) {
            return false;
        }
        return true;
    }

    public C54082dZ A0J(AnonymousClass206 r7, String str, boolean z) {
        int i;
        Object[] objArr;
        AnonymousClass1PU r2 = this.A0O;
        AnonymousClass1BI r1 = r7.A0v.A00;
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        boolean A022 = r2.A02(C42941yz.A00(r1));
        List list = ((C48392Mh) r7).A01;
        if (list.size() != 1 || !this.A01.A0O((AnonymousClass1BI) list.get(0))) {
            i = 2131891101;
            if (A022) {
                i = 2131893519;
            }
            objArr = new Object[]{str};
        } else if (A022) {
            i = 2131893520;
            objArr = new Object[0];
        } else {
            boolean A0U2 = A0U(r7, z);
            int i2 = 2131891102;
            if (A0U2) {
                i2 = 2131891104;
            }
            return new C54082dZ(new Object[0], i2, A0U2);
        }
        return new C54082dZ(objArr, i, false);
    }

    public C54082dZ A0K(C436420i r8, boolean z) {
        int i;
        Object[] objArr;
        int i2;
        Object[] objArr2;
        AnonymousClass1PU r2 = this.A0O;
        AnonymousClass1BI r1 = r8.A0v.A00;
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        boolean A022 = r2.A02(C42941yz.A00(r1));
        String A0P2 = r8.A0P();
        boolean isEmpty = TextUtils.isEmpty(A0P2);
        boolean A0O2 = this.A01.A0O(r8.A0H());
        if (!isEmpty) {
            if (!A0O2) {
                if (r8.A0H() != null) {
                    i2 = 2131890923;
                    if (A022) {
                        i2 = 2131893493;
                    }
                    objArr2 = new Object[]{A04(r8), this.A06.A0F(A0P2)};
                } else {
                    i = 2131890921;
                    if (A022) {
                        i = 2131893492;
                    }
                }
            } else if (A022) {
                i = 2131893494;
            } else {
                boolean A0U2 = A0U(r8, z);
                int i3 = 2131890925;
                if (A0U2) {
                    i3 = 2131890927;
                }
                return new C54082dZ(new Object[]{this.A06.A0F(A0P2)}, i3, A0U2);
            }
            objArr = new Object[]{this.A06.A0F(A0P2)};
            return new C54082dZ(objArr, i, false);
        } else if (A0O2) {
            boolean A0U3 = A0U(r8, z);
            int i4 = 2131890928;
            if (A0U3) {
                i4 = 2131890929;
            }
            return new C54082dZ(new Object[0], i4, A0U3);
        } else if (r8.A0H() != null) {
            i2 = 2131890924;
            objArr2 = new Object[]{A04(r8)};
        } else {
            i = 2131890922;
            objArr = new Object[0];
            return new C54082dZ(objArr, i, false);
        }
        return new C54082dZ(objArr2, i2, false);
    }

    public String A0L(Context context, GroupJid groupJid, String str, boolean z, boolean z2) {
        String A0F2 = this.A07.A0F(groupJid);
        char A0H2 = AnonymousClass1EG.A0H(A0F2);
        if (z2) {
            if (A0H2 != 0) {
                return context.getString(2131892474);
            }
            return context.getString(2131892473, new Object[]{A0F2});
        } else if (z) {
            return context.getString(A0n[A0H2][0], new Object[]{A0F2});
        } else {
            int[] iArr = A0n[A0H2];
            if (str != null) {
                return context.getString(iArr[1], new Object[]{str, A0F2});
            }
            return context.getString(iArr[2], new Object[]{A0F2});
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0M(X.AnonymousClass1BI r11, int r12, int r13, boolean r14) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0068
            r1 = 4
            X.11S r0 = r10.A01
            boolean r0 = r0.A0O(r11)
            if (r13 != r1) goto L_0x0025
            if (r0 != 0) goto L_0x0023
            X.1E5 r0 = X.AnonymousClass1E5.A00
            if (r11 == r0) goto L_0x0023
            r1 = 0
        L_0x0012:
            X.118 r0 = r10.A05
            android.content.Context r2 = r0.A00
            r0 = 2131889929(0x7f120f09, float:1.9414535E38)
            if (r1 == 0) goto L_0x001e
            r0 = 2131889930(0x7f120f0a, float:1.9414537E38)
        L_0x001e:
            java.lang.String r0 = r2.getString(r0)
            return r0
        L_0x0023:
            r1 = 1
            goto L_0x0012
        L_0x0025:
            if (r0 != 0) goto L_0x0059
            X.1E5 r0 = X.AnonymousClass1E5.A00
            if (r11 == r0) goto L_0x0059
            X.1M9 r0 = r10.A02
            X.1E7 r2 = r0.A0H(r11)
            boolean r1 = X.C22971Dz.A0e(r11)
            r6 = 2
            r5 = 1
            r0 = 2
            if (r1 == 0) goto L_0x003b
            r0 = 1
        L_0x003b:
            java.lang.String r9 = r10.A03(r2, r0)
            if (r9 == 0) goto L_0x0068
            r8 = 0
            if (r12 > 0) goto L_0x0077
            X.118 r0 = r10.A05
            android.content.Context r2 = r0.A00
            r1 = 2131889925(0x7f120f05, float:1.9414527E38)
            if (r14 == 0) goto L_0x0050
            r1 = 2131889926(0x7f120f06, float:1.941453E38)
        L_0x0050:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r8] = r9
            java.lang.String r0 = r2.getString(r1, r0)
            return r0
        L_0x0059:
            if (r12 > 0) goto L_0x00cb
            X.118 r0 = r10.A05
            android.content.Context r2 = r0.A00
            r0 = 2131889927(0x7f120f07, float:1.9414531E38)
            if (r14 == 0) goto L_0x001e
            r0 = 2131889928(0x7f120f08, float:1.9414533E38)
            goto L_0x001e
        L_0x0068:
            if (r12 > 0) goto L_0x00c2
            X.118 r0 = r10.A05
            android.content.Context r2 = r0.A00
            r0 = 2131889924(0x7f120f04, float:1.9414525E38)
            if (r14 == 0) goto L_0x001e
            r0 = 2131889931(0x7f120f0b, float:1.941454E38)
            goto L_0x001e
        L_0x0077:
            r4 = 2131889898(0x7f120eea, float:1.9414473E38)
            if (r14 == 0) goto L_0x007f
            r4 = 2131889899(0x7f120eeb, float:1.9414475E38)
        L_0x007f:
            r7 = 2131755121(0x7f100071, float:1.9141112E38)
            r0 = 86400(0x15180, float:1.21072E-40)
            if (r12 <= r0) goto L_0x00ae
            int r12 = r12 / r0
            r7 = 2131755118(0x7f10006e, float:1.9141106E38)
        L_0x008b:
            X.118 r0 = r10.A05
            android.content.Context r3 = r0.A00
            android.content.res.Resources r2 = r3.getResources()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r1[r8] = r0
            java.lang.String r2 = r2.getQuantityString(r7, r12, r1)
            android.content.res.Resources r1 = r3.getResources()
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r8] = r9
            r0[r5] = r2
            java.lang.String r0 = r1.getString(r4, r0)
            return r0
        L_0x00ae:
            r0 = 3600(0xe10, float:5.045E-42)
            if (r12 < r0) goto L_0x00b8
            int r12 = r12 / 3600
            r7 = 2131755119(0x7f10006f, float:1.9141108E38)
            goto L_0x008b
        L_0x00b8:
            r0 = 60
            if (r12 < r0) goto L_0x008b
            int r12 = r12 / 60
            r7 = 2131755120(0x7f100070, float:1.914111E38)
            goto L_0x008b
        L_0x00c2:
            r6 = 2131889902(0x7f120eee, float:1.941448E38)
            if (r14 == 0) goto L_0x00d3
            r6 = 2131889903(0x7f120eef, float:1.9414483E38)
            goto L_0x00d3
        L_0x00cb:
            r6 = 2131889900(0x7f120eec, float:1.9414477E38)
            if (r14 == 0) goto L_0x00d3
            r6 = 2131889901(0x7f120eed, float:1.9414479E38)
        L_0x00d3:
            r7 = 2131755121(0x7f100071, float:1.9141112E38)
            r0 = 86400(0x15180, float:1.21072E-40)
            if (r12 <= r0) goto L_0x0102
            int r12 = r12 / r0
            r7 = 2131755118(0x7f10006e, float:1.9141106E38)
        L_0x00df:
            X.118 r0 = r10.A05
            android.content.Context r5 = r0.A00
            android.content.res.Resources r2 = r5.getResources()
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r3 = 0
            r1[r3] = r0
            java.lang.String r2 = r2.getQuantityString(r7, r12, r1)
            android.content.res.Resources r1 = r5.getResources()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r2
            java.lang.String r0 = r1.getString(r6, r0)
            return r0
        L_0x0102:
            r0 = 3600(0xe10, float:5.045E-42)
            if (r12 < r0) goto L_0x010c
            int r12 = r12 / 3600
            r7 = 2131755119(0x7f10006f, float:1.9141108E38)
            goto L_0x00df
        L_0x010c:
            r0 = 60
            if (r12 < r0) goto L_0x00df
            int r12 = r12 / 60
            r7 = 2131755120(0x7f100070, float:1.914111E38)
            goto L_0x00df
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32191gn.A0M(X.1BI, int, int, boolean):java.lang.String");
    }

    public String A0N(AnonymousClass1BI r9, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        Object[] objArr;
        if (this.A01.A0O(r9) || r9 == AnonymousClass1E5.A00) {
            r9 = null;
        }
        if (i <= 86400) {
            i2 = i / 3600;
            i3 = 2131755119;
        } else {
            i2 = i / 86400;
            i3 = 2131755118;
        }
        Context context = this.A05.A00;
        String quantityString = context.getResources().getQuantityString(i3, i2, new Object[]{Integer.valueOf(i2)});
        if (r9 == null) {
            i4 = 2131891550;
            if (z) {
                i4 = 2131891549;
            }
            objArr = new Object[]{quantityString};
        } else {
            AnonymousClass1E7 A0H2 = this.A02.A0H(r9);
            int i5 = 2;
            if (C22971Dz.A0e(r9)) {
                i5 = 1;
            }
            String A032 = A03(A0H2, i5);
            int i6 = 2131891548;
            if (z) {
                i6 = 2131891547;
            }
            objArr = new Object[]{A032, quantityString};
        }
        return context.getString(i4, objArr);
    }

    public String A0O(AnonymousClass206 r5) {
        AnonymousClass1BI r1 = r5.A0v.A00;
        if (r1 == null) {
            return null;
        }
        AnonymousClass1E7 A0H2 = this.A02.A0H(r1);
        C24921Me r12 = this.A03;
        String A0I2 = r12.A0I(A0H2);
        if (!r12.A0j(A0H2, -1)) {
            return A0I2;
        }
        if (A0H2.A0C() && A0H2.A0L() != null) {
            return A0H2.A0L();
        }
        if (!TextUtils.isEmpty(A0H2.A0c)) {
            return C24921Me.A03(r12, A0H2, 2131898919);
        }
        return A0I2;
    }

    public String A0Q(AnonymousClass206 r3) {
        String A0I2;
        AnonymousClass1BI r1 = r3.A0v.A00;
        if (r1 == null || (A0I2 = this.A03.A0I(this.A02.A0H(r1))) == null) {
            return this.A05.A00.getString(2131887824);
        }
        return A0I2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a9, code lost:
        r0 = r0[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ba, code lost:
        return r7.A05.A02(r0[r2], r4, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0R(X.C436420i r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C48372Mf
            r4 = 0
            if (r0 == 0) goto L_0x0042
            r2 = r8
            X.2Mg r2 = (X.C48382Mg) r2
            X.1CJ r1 = r7.A07
            r0 = 1
            com.whatsapp.jid.GroupJid r0 = r2.A19(r0)
            java.lang.String r3 = r1.A0F(r0)
            if (r3 != 0) goto L_0x001a
            r0 = 1
            java.lang.String r3 = r2.A1B(r0)
        L_0x001a:
            int r1 = r8.A00
            r0 = 11
            if (r1 == r0) goto L_0x0116
            r0 = 12
            r6 = 0
            r5 = 1
            if (r1 == r0) goto L_0x00e2
            r0 = 20
            if (r1 == r0) goto L_0x00dc
            r0 = 139(0x8b, float:1.95E-43)
            if (r1 == r0) goto L_0x00d6
            r0 = 143(0x8f, float:2.0E-43)
            if (r1 == r0) goto L_0x00f4
            r0 = 144(0x90, float:2.02E-43)
            if (r1 == r0) goto L_0x011c
            r0 = 148(0x94, float:2.07E-43)
            if (r1 == r0) goto L_0x00bb
            r0 = 149(0x95, float:2.09E-43)
            if (r1 == r0) goto L_0x00bb
            switch(r1) {
                case 122: goto L_0x0044;
                case 123: goto L_0x011c;
                case 124: goto L_0x011c;
                case 125: goto L_0x011c;
                case 126: goto L_0x004b;
                case 127: goto L_0x008d;
                case 128: goto L_0x005e;
                default: goto L_0x0041;
            }
        L_0x0041:
            return r4
        L_0x0042:
            r3 = r4
            goto L_0x001a
        L_0x0044:
            X.118 r1 = r7.A05
            r0 = 2131888892(0x7f120afc, float:1.9412432E38)
            goto L_0x0121
        L_0x004b:
            if (r3 == 0) goto L_0x0054
            X.118 r2 = r7.A05
            r1 = 2131888938(0x7f120b2a, float:1.9412525E38)
            goto L_0x010d
        L_0x0054:
            X.118 r1 = r7.A05
            r0 = 2131888939(0x7f120b2b, float:1.9412527E38)
            java.lang.String r0 = r1.A01(r0)
            return r0
        L_0x005e:
            X.1BI r1 = r8.A0H()
            if (r1 == 0) goto L_0x0070
            X.1M9 r0 = r7.A02
            X.1E7 r1 = r0.A0H(r1)
            X.1Me r0 = r7.A03
            java.lang.String r4 = r0.A0I(r1)
        L_0x0070:
            X.1BI r1 = r8.A0H()
            X.11S r0 = r7.A01
            boolean r0 = r0.A0O(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0083
            if (r3 != 0) goto L_0x0080
            r2 = 1
        L_0x0080:
            int[] r0 = A0X
            goto L_0x00ab
        L_0x0083:
            r1 = 1
            if (r4 == 0) goto L_0x0087
            r1 = 0
        L_0x0087:
            if (r3 != 0) goto L_0x008a
            r2 = 1
        L_0x008a:
            int[][] r0 = A0b
            goto L_0x00a9
        L_0x008d:
            X.1BI r1 = r8.A0H()
            if (r1 == 0) goto L_0x009f
            X.1M9 r0 = r7.A02
            X.1E7 r1 = r0.A0H(r1)
            X.1Me r0 = r7.A03
            java.lang.String r4 = r0.A0I(r1)
        L_0x009f:
            r2 = 0
            r1 = 1
            if (r4 == 0) goto L_0x00a4
            r1 = 0
        L_0x00a4:
            if (r3 != 0) goto L_0x00a7
            r2 = 1
        L_0x00a7:
            int[][] r0 = A0e
        L_0x00a9:
            r0 = r0[r1]
        L_0x00ab:
            r2 = r0[r2]
            X.118 r1 = r7.A05
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r6] = r4
            r0[r5] = r3
            java.lang.String r0 = r1.A02(r2, r0)
            return r0
        L_0x00bb:
            X.2Mg r8 = (X.C48382Mg) r8
            r0 = 2
            java.lang.String r4 = r8.A1B(r0)
            X.118 r3 = r7.A05
            r2 = 2131888910(0x7f120b0e, float:1.9412469E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.0vb r0 = r7.A06
            java.lang.String r0 = r0.A0F(r4)
            r1[r6] = r0
            java.lang.String r0 = r3.A02(r2, r1)
            return r0
        L_0x00d6:
            X.118 r1 = r7.A05
            r0 = 2131898917(0x7f123225, float:1.9432765E38)
            goto L_0x0121
        L_0x00dc:
            X.118 r1 = r7.A05
            r0 = 2131891103(0x7f12139f, float:1.9416917E38)
            goto L_0x0121
        L_0x00e2:
            java.lang.String r3 = r7.A04(r8)
            if (r3 != 0) goto L_0x00ee
            X.118 r1 = r7.A05
            r0 = 2131891118(0x7f1213ae, float:1.9416947E38)
            goto L_0x0121
        L_0x00ee:
            X.118 r2 = r7.A05
            r1 = 2131891114(0x7f1213aa, float:1.9416939E38)
            goto L_0x010d
        L_0x00f4:
            X.2Mg r8 = (X.C48382Mg) r8
            X.1CJ r2 = r7.A07
            r1 = 2
            com.whatsapp.jid.GroupJid r0 = r8.A19(r1)
            java.lang.String r3 = r8.A1B(r1)
            java.lang.String r0 = r2.A0F(r0)
            if (r0 == 0) goto L_0x0108
            r3 = r0
        L_0x0108:
            X.118 r2 = r7.A05
            r1 = 2131888897(0x7f120b01, float:1.9412442E38)
        L_0x010d:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r6] = r3
            java.lang.String r0 = r2.A02(r1, r0)
            return r0
        L_0x0116:
            X.118 r1 = r7.A05
            r0 = 2131890926(0x7f1212ee, float:1.9416558E38)
            goto L_0x0121
        L_0x011c:
            X.118 r1 = r7.A05
            r0 = 2131888931(0x7f120b23, float:1.9412511E38)
        L_0x0121:
            java.lang.String r0 = r1.A01(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32191gn.A0R(X.20i):java.lang.String");
    }

    public String A0T(String str, String str2, String str3, boolean z) {
        int i;
        Object[] objArr;
        int i2;
        if (str3 == null) {
            return this.A05.A00.getString(2131896697);
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        Context context = this.A05.A00;
        if (isEmpty) {
            if (z) {
                i = 2131896700;
            } else if (str == null) {
                i = 2131896699;
            } else {
                i2 = 2131896698;
                objArr = new Object[2];
                objArr[0] = str;
                objArr[1] = str3;
            }
            objArr = new Object[]{str3};
        } else {
            if (z) {
                i2 = 2131896703;
            } else if (str == null) {
                i2 = 2131896702;
            } else {
                i = 2131896701;
                objArr = new Object[]{str, str2, str3};
            }
            objArr = new Object[2];
            objArr[0] = str2;
            objArr[1] = str3;
        }
        return context.getString(i, objArr);
    }

    public C32191gn(C19880zA r2, C19880zA r3, C19880zA r4, C19880zA r5, C19880zA r6, AnonymousClass190 r7, AnonymousClass11S r8, C32151gj r9, AnonymousClass1M9 r10, C24921Me r11, AnonymousClass11P r12, AnonymousClass118 r13, C18000vb r14, AnonymousClass1CJ r15, AnonymousClass1MZ r16, AnonymousClass12B r17, C24751Ln r18, C18030ve r19, AnonymousClass12L r20, AnonymousClass126 r21, AnonymousClass1MB r22, C32011gU r23, AnonymousClass1R5 r24, AnonymousClass1PU r25, C32131gh r26, C32161gk r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33, AnonymousClass00H r34) {
        this.A04 = r12;
        this.A09 = r19;
        this.A0H = r7;
        this.A01 = r8;
        this.A05 = r13;
        this.A07 = r15;
        this.A0B = r23;
        this.A0G = r2;
        this.A0L = r20;
        this.A0P = r26;
        this.A02 = r10;
        this.A03 = r11;
        this.A06 = r14;
        this.A0O = r25;
        this.A0A = r21;
        this.A0J = r17;
        this.A00 = r6;
        this.A0K = r18;
        this.A0W = r28;
        this.A0M = r22;
        this.A0V = r29;
        this.A0D = r3;
        this.A0C = r30;
        this.A0N = r24;
        this.A0T = r31;
        this.A0F = r4;
        this.A08 = r16;
        this.A0S = r32;
        this.A0U = r33;
        this.A0I = r9;
        this.A0Q = r27;
        this.A0E = r5;
        this.A0R = r34;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r3 != 1) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A00(java.util.List r4, int r5) {
        /*
            int r3 = r4.size()
        L_0x0004:
            int r0 = r4.size()
            r2 = 3
            if (r0 >= r2) goto L_0x0010
            r0 = 0
            r4.add(r0)
            goto L_0x0004
        L_0x0010:
            r1 = 1
            r0 = 0
            if (r5 < r1) goto L_0x0046
            if (r3 >= r2) goto L_0x001a
            if (r3 != r5) goto L_0x0046
            if (r3 == r1) goto L_0x002d
        L_0x001a:
            r1 = 2
            if (r3 == r1) goto L_0x002d
            if (r5 != r2) goto L_0x0036
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r1, r0)
            return r2
        L_0x002d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L_0x0040
        L_0x0036:
            r0 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r5 = r5 - r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
        L_0x0040:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        L_0x0046:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r0, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32191gn.A00(java.util.List, int):android.util.Pair");
    }

    private String A04(C436420i r5) {
        AnonymousClass1BI A0H2;
        if (AnonymousClass25A.A0g(r5)) {
            A0H2 = ((AnonymousClass2MN) r5).A01;
        } else if (!r5.A17()) {
            return null;
        } else {
            A0H2 = r5.A0H();
        }
        if (A0H2 == null) {
            return null;
        }
        AnonymousClass1BI r3 = r5.A0v.A00;
        int i = 2;
        if (C22971Dz.A0e(r3)) {
            i = 1;
        }
        AnonymousClass1E7 A0H3 = this.A02.A0H(A0H2);
        if (i == 1) {
            i = this.A03.A0A(r3);
        }
        return A03(A0H3, i);
    }

    private String A06(C436420i r5, int i, int i2) {
        Context context;
        AnonymousClass1BI A0H2 = r5.A0H();
        C22941Dw r0 = UserJid.Companion;
        UserJid A012 = C22941Dw.A01(A0H2);
        AnonymousClass1BI r1 = r5.A0v.A00;
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        AnonymousClass1EC A002 = C42941yz.A00(r1);
        if (A012 == null) {
            AnonymousClass1MZ r02 = this.A08;
            C17960vV.A07(A002);
            boolean A0K2 = r02.A0K(A002);
            context = this.A05.A00;
            i = 2131891037;
            if (A0K2) {
                i = 2131891036;
            }
        } else if (this.A01.A0O(A012)) {
            context = this.A05.A00;
        } else {
            String A0I2 = this.A03.A0I(this.A02.A0H(A012));
            return this.A05.A00.getString(i2, new Object[]{A0I2});
        }
        return context.getString(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r6.A0A.A0n(r1) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A09(X.C436420i r7, int r8, int r9, int r10, int r11, int r12, int r13) {
        /*
            r6 = this;
            X.1BI r1 = r7.A0H()
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A01(r1)
            X.205 r0 = r7.A0v
            X.1BI r1 = r0.A00
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r1 = X.C42941yz.A00(r1)
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0021
            X.126 r0 = r6.A0A
            boolean r0 = r0.A0n(r1)
            r3 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            X.11S r0 = r6.A01
            boolean r0 = r0.A0O(r2)
            if (r0 == 0) goto L_0x0036
            X.118 r0 = r6.A05
            android.content.Context r0 = r0.A00
            if (r3 != 0) goto L_0x0031
            r8 = r9
        L_0x0031:
            java.lang.String r0 = r0.getString(r8)
            return r0
        L_0x0036:
            if (r2 == 0) goto L_0x0054
            X.1M9 r0 = r6.A02
            X.1E7 r1 = r0.A0H(r2)
            X.1Me r0 = r6.A03
            java.lang.String r2 = r0.A0I(r1)
            if (r3 != 0) goto L_0x0047
            r10 = r11
        L_0x0047:
            X.118 r0 = r6.A05
            android.content.Context r1 = r0.A00
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r2
            java.lang.String r0 = r1.getString(r10, r0)
            return r0
        L_0x0054:
            if (r3 != 0) goto L_0x0057
            r12 = r13
        L_0x0057:
            X.118 r0 = r6.A05
            android.content.Context r0 = r0.A00
            java.lang.String r0 = r0.getString(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32191gn.A09(X.20i, int, int, int, int, int, int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r6.A0A.A0o(r1) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A0A(X.C436420i r7, int r8, int r9, int r10, int r11, int r12, int r13) {
        /*
            r6 = this;
            X.1BI r1 = r7.A0H()
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A01(r1)
            X.205 r0 = r7.A0v
            X.1BI r1 = r0.A00
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r1 = X.C42941yz.A00(r1)
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0021
            X.126 r0 = r6.A0A
            boolean r0 = r0.A0o(r1)
            r3 = 1
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            X.11S r0 = r6.A01
            boolean r0 = r0.A0O(r2)
            if (r0 == 0) goto L_0x0036
            if (r3 != 0) goto L_0x002d
            r8 = r11
        L_0x002d:
            X.118 r0 = r6.A05
            android.content.Context r0 = r0.A00
            java.lang.String r0 = r0.getString(r8)
            return r0
        L_0x0036:
            if (r2 == 0) goto L_0x0054
            X.1M9 r0 = r6.A02
            X.1E7 r1 = r0.A0H(r2)
            X.1Me r0 = r6.A03
            java.lang.String r2 = r0.A0I(r1)
            if (r3 != 0) goto L_0x0047
            r9 = r12
        L_0x0047:
            X.118 r0 = r6.A05
            android.content.Context r1 = r0.A00
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r2
            java.lang.String r0 = r1.getString(r9, r0)
            return r0
        L_0x0054:
            if (r3 != 0) goto L_0x0057
            r10 = r13
        L_0x0057:
            X.118 r0 = r6.A05
            android.content.Context r0 = r0.A00
            java.lang.String r0 = r0.getString(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32191gn.A0A(X.20i, int, int, int, int, int, int):java.lang.String");
    }

    private String A0B(C436420i r7, int i, boolean z) {
        int[] iArr;
        int i2;
        int i3;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = false;
        if (r7.A0P() == null) {
            z4 = true;
        }
        if (this.A01.A0O(r7.A0H())) {
            if (i == 1) {
                z2 = true;
            }
            iArr = A0j[!z2];
            if (z4) {
                i2 = iArr[0];
            } else {
                if (z) {
                    i2 = iArr[1];
                }
                i2 = iArr[2];
            }
        } else if (r7.A0H() == null) {
            if (i != 1) {
                z3 = false;
            }
            iArr = A0l[!z3];
            if (z4) {
                i2 = iArr[0];
            } else {
                if (z) {
                    i2 = iArr[1];
                }
                i2 = iArr[2];
            }
        } else {
            boolean z5 = false;
            if (i == 1) {
                z5 = true;
            }
            int[] iArr2 = A0i[!z5];
            if (z4) {
                i3 = iArr2[0];
            } else if (z) {
                i3 = iArr2[1];
            } else {
                i3 = iArr2[2];
            }
            return this.A05.A00.getString(i3, new Object[]{A04(r7)});
        }
        return this.A05.A00.getString(i2);
    }

    private String A0E(AnonymousClass2MN r12, boolean z) {
        PhoneUserJid phoneUserJid;
        PhoneUserJid phoneUserJid2;
        int i;
        if (C22781De.A03()) {
            phoneUserJid = A01(r12.A01, "old");
            phoneUserJid2 = A01(r12.A00, "new");
        } else {
            phoneUserJid = A01(r12.A01, "old");
            phoneUserJid2 = A01(r12.A00, "new");
        }
        if (phoneUserJid != null) {
            phoneUserJid.getRawString();
        }
        if (phoneUserJid == null) {
            return "";
        }
        AnonymousClass1E7 A0H2 = this.A02.A0H(phoneUserJid);
        int i2 = 2;
        if (z) {
            i2 = 1;
        }
        String A032 = A03(A0H2, i2);
        C17960vV.A07(A032);
        if (!z) {
            C17960vV.A07(phoneUserJid);
            boolean equals = phoneUserJid.equals(r12.A0v.A00);
            if (!this.A01.A0N()) {
                i = 2131888117;
                if (equals) {
                    i = 2131888119;
                }
            } else {
                i = 2131888118;
                if (equals) {
                    i = 2131888120;
                }
            }
            boolean A0j2 = this.A03.A0j(A0H2, -1);
            Context context = this.A05.A00;
            Object[] objArr = new Object[1];
            if (A0j2) {
                objArr[0] = A032.replace(' ', 160);
                return context.getString(i, objArr);
            }
            objArr[0] = A032;
            return context.getString(i, objArr);
        } else if (this.A03.A0j(A0H2, 1)) {
            C17960vV.A07(phoneUserJid2);
            String A002 = AnonymousClass17K.A00(C42771yi.A00(), phoneUserJid2);
            Context context2 = this.A05.A00;
            C17960vV.A07(A002);
            return context2.getString(2131891099, new Object[]{A032.replace(' ', 160), this.A06.A0G(A002.replace(' ', 160))});
        } else {
            return this.A05.A00.getString(2131891098, new Object[]{A032});
        }
    }

    public String A0P(AnonymousClass206 r5) {
        AnonymousClass1BI A0H2 = r5.A0H();
        C22941Dw r0 = UserJid.Companion;
        UserJid A012 = C22941Dw.A01(A0H2);
        if (A012 == null) {
            return null;
        }
        return this.A03.A0U(this.A02.A0H(A012), 1, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v582, resolved type: X.2Mg} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v40, types: [X.1BI] */
    /* JADX WARNING: type inference failed for: r7v79, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r7v108 */
    /* JADX WARNING: type inference failed for: r7v109 */
    /* JADX WARNING: type inference failed for: r7v110 */
    /* JADX WARNING: type inference failed for: r7v111 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("Missing text resolution for system message with action type: ");
        r4.append(r14);
        r4.append(". Resolution is null: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        if (r13 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x042d, code lost:
        r4 = new java.lang.Object[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x042f, code lost:
        r13 = r1.A05.A00.getString(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x044a, code lost:
        r4 = new java.lang.Object[]{r5};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0474, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6, 5191) == false) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0059, code lost:
        r4.append(r2);
        r1.A0H.A0G("notification-preview/bad-system-message", r4.toString(), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0676, code lost:
        if (r29 == false) goto L_0x0678;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x067c, code lost:
        if (r5 != null) goto L_0x136f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0802, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r1.A09, 5263) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0814, code lost:
        if (r0 != false) goto L_0x0816;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x08c0, code lost:
        r13 = r1.A05.A01(2131888933);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x08e5, code lost:
        r5 = A0R(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x08e9, code lost:
        if (r5 != null) goto L_0x136f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x08eb, code lost:
        r5 = A05(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x08f1, code lost:
        r13 = A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0bd9, code lost:
        if (r5 != null) goto L_0x0be4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0bdb, code lost:
        r13 = r6.getString(2131896691);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0be4, code lost:
        r13 = r6.getString(2131896690, new java.lang.Object[]{r5});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0e71, code lost:
        if (r0 == null) goto L_0x0e73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0e97, code lost:
        if (r8.A00 != 0) goto L_0x0e99;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0f0a, code lost:
        r13 = r4.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0fb8, code lost:
        if (r5 != 5) goto L_0x1190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x1059, code lost:
        if (r7.A03 == 1) goto L_0x105b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x10c3, code lost:
        r4 = 2131891353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x10dd, code lost:
        r13 = r8.getString(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x116d, code lost:
        if (r1.A03.A0i(r5) != false) goto L_0x116f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x1190, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x1256, code lost:
        r13 = r6.A00(r5, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x12c7, code lost:
        r0 = new java.lang.Object[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x12d7, code lost:
        r0[0] = r7;
        r13 = r5.getString(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x13ac, code lost:
        r5 = r5.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r1.A09, 7133) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:765:0x17c2, code lost:
        if (r5 != 0) goto L_0x178b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
        if (r13 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:818:0x1944, code lost:
        r13 = r6.getString(r5, new java.lang.Object[]{A04(r0)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:851:0x1a80, code lost:
        if (((X.C88304Zd) r1.A0T.get()).A03(r0) != false) goto L_0x1a82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:852:0x1a82, code lost:
        r13 = A0R(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:853:0x1a88, code lost:
        r6 = A0K(r0, r11);
        r13 = r1.A05.A00.getString(r6.A00, r6.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:902:0x1bf1, code lost:
        if (r4.lastIndexOf("\"") > r4.indexOf("\"")) goto L_0x1bf3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (r13.isEmpty() == false) goto L_0x0067;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0647  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0ca3  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0cc5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0S(X.C436420i r28, boolean r29) {
        /*
            r27 = this;
            r0 = r28
            boolean r1 = X.AnonymousClass25A.A0g(r0)
            if (r1 == 0) goto L_0x1d26
            r1 = r0
            X.2MN r1 = (X.AnonymousClass2MN) r1
            com.whatsapp.jid.UserJid r12 = r1.A01
        L_0x000d:
            r1 = r27
            X.1PU r3 = r1.A0O
            X.205 r5 = r0.A0v
            X.1BI r9 = r5.A00
            android.os.Parcelable$Creator r2 = X.AnonymousClass1EC.CREATOR
            X.1EC r4 = X.C42941yz.A00(r9)
            boolean r15 = r3.A02(r4)
            int r14 = r0.A00
            java.lang.String r8 = "🗓"
            r7 = 0
            r10 = 3
            r6 = 2
            r3 = 0
            r2 = 1
            java.lang.String r13 = ""
            r11 = r29
            switch(r14) {
                case 1: goto L_0x1bb6;
                case 2: goto L_0x0030;
                case 3: goto L_0x0030;
                case 4: goto L_0x1ba7;
                case 5: goto L_0x1b7d;
                case 6: goto L_0x1b24;
                case 7: goto L_0x1b15;
                case 8: goto L_0x1af1;
                case 9: goto L_0x1aa2;
                case 10: goto L_0x1a9a;
                case 11: goto L_0x1a74;
                case 12: goto L_0x1a60;
                case 13: goto L_0x1a0a;
                case 14: goto L_0x1a04;
                case 15: goto L_0x19f5;
                case 16: goto L_0x19e6;
                case 17: goto L_0x19bc;
                case 18: goto L_0x1984;
                case 19: goto L_0x0030;
                case 20: goto L_0x1952;
                case 21: goto L_0x1912;
                case 22: goto L_0x1905;
                case 23: goto L_0x18f0;
                case 24: goto L_0x18db;
                case 25: goto L_0x18c6;
                case 26: goto L_0x18b9;
                case 27: goto L_0x18b3;
                case 28: goto L_0x18ab;
                case 29: goto L_0x1887;
                case 30: goto L_0x1863;
                case 31: goto L_0x1839;
                case 32: goto L_0x180f;
                case 33: goto L_0x1801;
                case 34: goto L_0x17f4;
                case 35: goto L_0x17df;
                case 36: goto L_0x17ca;
                case 37: goto L_0x1733;
                case 38: goto L_0x0030;
                case 39: goto L_0x16a4;
                case 40: goto L_0x167b;
                case 41: goto L_0x1652;
                case 42: goto L_0x162e;
                case 43: goto L_0x0030;
                case 44: goto L_0x15c8;
                case 45: goto L_0x0030;
                case 46: goto L_0x15bb;
                case 47: goto L_0x159f;
                case 48: goto L_0x1583;
                case 49: goto L_0x1567;
                case 50: goto L_0x155a;
                case 51: goto L_0x1523;
                case 52: goto L_0x149b;
                case 53: goto L_0x1477;
                case 54: goto L_0x1453;
                case 55: goto L_0x143e;
                case 56: goto L_0x141d;
                case 57: goto L_0x13c2;
                case 58: goto L_0x1347;
                case 59: goto L_0x1325;
                case 60: goto L_0x12df;
                case 61: goto L_0x1157;
                case 62: goto L_0x1146;
                case 63: goto L_0x1135;
                case 64: goto L_0x10fd;
                case 65: goto L_0x10f0;
                case 66: goto L_0x10e3;
                case 67: goto L_0x0ff2;
                case 68: goto L_0x0fc9;
                case 69: goto L_0x0f9c;
                case 70: goto L_0x0f39;
                case 71: goto L_0x0f10;
                case 72: goto L_0x0030;
                case 73: goto L_0x0efa;
                case 74: goto L_0x0ee9;
                case 75: goto L_0x0e79;
                case 76: goto L_0x0e2c;
                case 77: goto L_0x0e11;
                case 78: goto L_0x0df6;
                case 79: goto L_0x0d83;
                case 80: goto L_0x0d74;
                case 81: goto L_0x0d65;
                case 82: goto L_0x0d56;
                case 83: goto L_0x0d21;
                case 84: goto L_0x0d07;
                case 85: goto L_0x0ced;
                case 86: goto L_0x0cd7;
                case 87: goto L_0x0c7b;
                case 88: goto L_0x0030;
                case 89: goto L_0x0030;
                case 90: goto L_0x0c73;
                case 91: goto L_0x0c59;
                case 92: goto L_0x0c3f;
                case 93: goto L_0x0c34;
                case 94: goto L_0x0c34;
                case 95: goto L_0x0bfe;
                case 96: goto L_0x0bf1;
                case 97: goto L_0x0030;
                case 98: goto L_0x0bcb;
                case 99: goto L_0x0bbe;
                case 100: goto L_0x0b89;
                case 101: goto L_0x08f1;
                case 102: goto L_0x0b6b;
                case 103: goto L_0x0b49;
                case 104: goto L_0x0b31;
                case 105: goto L_0x0b19;
                case 106: goto L_0x0c73;
                case 107: goto L_0x0af9;
                case 108: goto L_0x0ad6;
                case 109: goto L_0x0ab3;
                case 110: goto L_0x0030;
                case 111: goto L_0x0030;
                case 112: goto L_0x0a91;
                case 113: goto L_0x0a6f;
                case 114: goto L_0x0a6f;
                case 115: goto L_0x0030;
                case 116: goto L_0x0a2d;
                case 117: goto L_0x0a03;
                case 118: goto L_0x09d3;
                case 119: goto L_0x0030;
                case 120: goto L_0x098f;
                case 121: goto L_0x093e;
                case 122: goto L_0x066d;
                case 123: goto L_0x091b;
                case 124: goto L_0x08f7;
                case 125: goto L_0x08cb;
                case 126: goto L_0x08af;
                case 127: goto L_0x0892;
                case 128: goto L_0x0833;
                case 129: goto L_0x07e9;
                case 130: goto L_0x07da;
                case 131: goto L_0x07d4;
                case 132: goto L_0x0786;
                case 133: goto L_0x0786;
                case 134: goto L_0x0786;
                case 135: goto L_0x0766;
                case 136: goto L_0x0709;
                case 137: goto L_0x06d5;
                case 138: goto L_0x06d5;
                case 139: goto L_0x0030;
                case 140: goto L_0x06bb;
                case 141: goto L_0x06a1;
                case 142: goto L_0x0680;
                case 143: goto L_0x0615;
                case 144: goto L_0x05ec;
                case 145: goto L_0x0597;
                case 146: goto L_0x0556;
                case 147: goto L_0x0522;
                case 148: goto L_0x04fb;
                case 149: goto L_0x04a8;
                case 150: goto L_0x044f;
                case 151: goto L_0x044f;
                case 152: goto L_0x041f;
                case 153: goto L_0x03ca;
                case 154: goto L_0x0030;
                case 155: goto L_0x0522;
                case 156: goto L_0x03b4;
                case 157: goto L_0x038e;
                case 158: goto L_0x037d;
                case 159: goto L_0x0030;
                case 160: goto L_0x0030;
                case 161: goto L_0x0030;
                case 162: goto L_0x0335;
                case 163: goto L_0x0328;
                case 164: goto L_0x031b;
                case 165: goto L_0x02ed;
                case 166: goto L_0x0030;
                case 167: goto L_0x1a88;
                case 168: goto L_0x02b9;
                case 169: goto L_0x029e;
                case 170: goto L_0x0283;
                case 171: goto L_0x01f6;
                case 172: goto L_0x01cb;
                case 173: goto L_0x0139;
                case 174: goto L_0x00f6;
                case 175: goto L_0x00dd;
                case 176: goto L_0x00cc;
                case 177: goto L_0x0098;
                case 178: goto L_0x0088;
                case 179: goto L_0x0078;
                case 180: goto L_0x0068;
                default: goto L_0x0030;
            }
        L_0x0030:
            X.0ve r5 = r1.A09
            r4 = 7133(0x1bdd, float:9.995E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r4)
            if (r0 == 0) goto L_0x0067
            if (r13 == 0) goto L_0x0044
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x0067
        L_0x0044:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Missing text resolution for system message with action type: "
            r4.append(r0)
            r4.append(r14)
            java.lang.String r0 = ". Resolution is null: "
            r4.append(r0)
            if (r13 == 0) goto L_0x0059
            r2 = 0
        L_0x0059:
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            X.190 r1 = r1.A0H
            java.lang.String r0 = "notification-preview/bad-system-message"
            r1.A0G(r0, r2, r3)
        L_0x0067:
            return r13
        L_0x0068:
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            r0 = 2131896692(0x7f122974, float:1.9428252E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x0078:
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            r0 = 2131896693(0x7f122975, float:1.9428254E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x0088:
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            r0 = 2131896694(0x7f122976, float:1.9428256E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x0098:
            X.1BI r4 = r0.A0H()
            X.11S r0 = r1.A01
            boolean r0 = r0.A0O(r4)
            if (r0 == 0) goto L_0x00a9
            r6 = 2131891202(0x7f121402, float:1.9417117E38)
            goto L_0x042d
        L_0x00a9:
            X.0vb r5 = r1.A06
            r0 = 0
            if (r4 == 0) goto L_0x00ba
            X.1M9 r0 = r1.A02
            X.1E7 r4 = r0.A0H(r4)
            X.1Me r0 = r1.A03
            java.lang.String r0 = r0.A0I(r4)
        L_0x00ba:
            java.lang.String r5 = r5.A0F(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r6 = 2131891200(0x7f121400, float:1.9417113E38)
            if (r0 == 0) goto L_0x044a
            r6 = 2131891201(0x7f121401, float:1.9417115E38)
            goto L_0x042d
        L_0x00cc:
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            r0 = 2131897244(0x7f122b9c, float:1.9429372E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x00dd:
            boolean r4 = r0 instanceof X.C1772197s
            if (r4 == 0) goto L_0x0030
            java.lang.String r6 = r1.A0Q(r0)
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            r4 = 2131887830(0x7f1206d6, float:1.9410278E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r6
            java.lang.String r13 = r5.getString(r4, r0)
            goto L_0x0030
        L_0x00f6:
            boolean r4 = r0 instanceof X.C1772297t
            if (r4 == 0) goto L_0x0030
            r5 = r0
            X.97t r5 = (X.C1772297t) r5
            java.lang.String r4 = r1.A0Q(r0)
            X.118 r0 = r1.A05
            android.content.Context r9 = r0.A00
            r8 = 2131887831(0x7f1206d7, float:1.941028E38)
            java.lang.Object[] r10 = new java.lang.Object[r6]
            r10[r3] = r4
            X.0vb r6 = r1.A06
            long r4 = r5.A00
            X.C18070vi.A0d(r6, r3)
            r0 = 171(0xab, float:2.4E-43)
            java.lang.String r7 = r6.A08(r0)
            X.C18070vi.A0X(r7)
            java.util.Locale r0 = r6.A0N()
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            r6.<init>(r7, r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r4)
            java.lang.String r0 = r6.format(r0)
            X.C18070vi.A0X(r0)
            r10[r2] = r0
            java.lang.String r13 = r9.getString(r8, r10)
            goto L_0x0030
        L_0x0139:
            r4 = r0
            X.2Mh r4 = (X.C48392Mh) r4
            java.util.List r5 = r4.A01
            boolean r4 = r5.isEmpty()
            r8 = 0
            if (r4 != 0) goto L_0x01be
            java.lang.Object r4 = r5.get(r3)
            X.1BI r4 = (X.AnonymousClass1BI) r4
            if (r4 == 0) goto L_0x01be
            X.1BI r10 = r0.A0H()
            X.11S r9 = r1.A01
            boolean r5 = r9.A0O(r4)
            if (r5 != 0) goto L_0x0165
            X.1M9 r0 = r1.A02
            X.1E7 r4 = r0.A0H(r4)
            X.1Me r0 = r1.A03
            java.lang.String r8 = r0.A0I(r4)
        L_0x0165:
            if (r10 == 0) goto L_0x01a8
            X.1M9 r0 = r1.A02
            X.1E7 r4 = r0.A0H(r10)
            X.1Me r0 = r1.A03
            java.lang.String r7 = r0.A0I(r4)
            boolean r4 = r9.A0O(r10)
            X.118 r0 = r1.A05
            android.content.Context r9 = r0.A00
            if (r4 == 0) goto L_0x018a
            r5 = 2131888618(0x7f1209ea, float:1.9411876E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
        L_0x0182:
            r4[r3] = r8
        L_0x0184:
            java.lang.String r13 = r9.getString(r5, r4)
            goto L_0x0030
        L_0x018a:
            if (r5 == 0) goto L_0x0198
            r5 = 2131888553(0x7f1209a9, float:1.9411745E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.0vb r0 = r1.A06
            java.lang.String r8 = r0.A0F(r7)
            goto L_0x0182
        L_0x0198:
            r5 = 2131888552(0x7f1209a8, float:1.9411743E38)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            X.0vb r0 = r1.A06
            java.lang.String r0 = r0.A0F(r7)
            r4[r3] = r0
            r4[r2] = r8
            goto L_0x0184
        L_0x01a8:
            X.118 r0 = r1.A05
            android.content.Context r9 = r0.A00
            if (r5 == 0) goto L_0x01b2
            r0 = 2131888613(0x7f1209e5, float:1.9411866E38)
            goto L_0x01c5
        L_0x01b2:
            r5 = 2131888612(0x7f1209e4, float:1.9411864E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.0vb r0 = r1.A06
            java.lang.String r8 = r0.A0F(r8)
            goto L_0x0182
        L_0x01be:
            X.118 r0 = r1.A05
            android.content.Context r9 = r0.A00
            r0 = 2131888611(0x7f1209e3, float:1.9411862E38)
        L_0x01c5:
            java.lang.String r13 = r9.getString(r0)
            goto L_0x0030
        L_0x01cb:
            X.118 r4 = r1.A05
            android.content.Context r8 = r4.A00
            r7 = 2131889155(0x7f120c03, float:1.9412966E38)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.String r4 = r1.A0O(r0)
            r5[r3] = r4
            X.464 r0 = (X.AnonymousClass464) r0
            X.1gU r4 = r1.A0B
            java.lang.String r0 = r0.A00
            X.C18070vi.A0d(r4, r3)
            int r0 = X.AnonymousClass4X8.A00(r0)
            if (r0 != r6) goto L_0x01f3
            java.lang.String r0 = "Instagram"
        L_0x01eb:
            r5[r2] = r0
            java.lang.String r13 = r8.getString(r7, r5)
            goto L_0x0030
        L_0x01f3:
            java.lang.String r0 = "Facebook"
            goto L_0x01eb
        L_0x01f6:
            r5 = r0
            X.2Me r5 = (X.C48362Me) r5
            java.util.ArrayList r4 = r5.A1C(r6)
            int r9 = r4.size()
            java.lang.String r11 = r1.A04(r0)
            X.11S r4 = r1.A01
            X.1BI r0 = r5.A0H()
            boolean r4 = r4.A0O(r0)
            java.util.List r0 = r5.A1E(r2)
            if (r4 == 0) goto L_0x023e
            r5 = 0
        L_0x0216:
            java.util.ArrayList r10 = A0H(r0, r2)
            int r4 = r10.size()
            X.118 r0 = r1.A05
            if (r4 >= r2) goto L_0x0243
            android.content.Context r0 = r0.A00
            android.content.res.Resources r7 = r0.getResources()
            int[][] r0 = A0k
            r0 = r0[r3]
            r5 = r0[r5]
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4[r3] = r0
            r4[r2] = r11
            java.lang.String r13 = r7.getQuantityString(r5, r9, r4)
            goto L_0x0030
        L_0x023e:
            r5 = 1
            if (r11 != 0) goto L_0x0216
            r5 = 2
            goto L_0x0216
        L_0x0243:
            if (r9 != r2) goto L_0x025d
            android.content.Context r7 = r0.A00
            int[][] r0 = A0k
            r0 = r0[r2]
            r5 = r0[r5]
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Object r0 = r10.get(r3)
            r4[r3] = r0
            r4[r2] = r11
            java.lang.String r13 = r7.getString(r5, r4)
            goto L_0x0030
        L_0x025d:
            android.content.Context r0 = r0.A00
            android.content.res.Resources r8 = r0.getResources()
            int[][] r0 = A0k
            r0 = r0[r6]
            r7 = r0[r5]
            int r5 = r9 + -1
            r0 = 3
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Object r0 = r10.get(r3)
            r4[r3] = r0
            int r9 = r9 - r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r4[r2] = r0
            r4[r6] = r11
            java.lang.String r13 = r8.getQuantityString(r7, r5, r4)
            goto L_0x0030
        L_0x0283:
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            r5 = 2131890061(0x7f120f8d, float:1.9414803E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.2MQ r0 = (X.AnonymousClass2MQ) r0
            java.lang.String r0 = r0.A01
            r4[r3] = r0
            java.lang.String r4 = r6.getString(r5, r4)
            X.2hF r0 = X.C61522pp.A03
            java.lang.String r13 = r0.A00(r7, r8, r4)
            goto L_0x0030
        L_0x029e:
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            r5 = 2131890146(0x7f120fe2, float:1.9414976E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.2MQ r0 = (X.AnonymousClass2MQ) r0
            java.lang.String r0 = r0.A01
            r4[r3] = r0
            java.lang.String r4 = r6.getString(r5, r4)
            X.2hF r0 = X.C61522pp.A03
            java.lang.String r13 = r0.A00(r7, r8, r4)
            goto L_0x0030
        L_0x02b9:
            X.118 r4 = r1.A05
            android.content.Context r8 = r4.A00
            X.11S r5 = r1.A01
            X.1BI r4 = r0.A0H()
            boolean r4 = r5.A0O(r4)
            java.lang.String r7 = r1.A04(r0)
            X.1CJ r0 = r1.A07
            java.lang.String r5 = r0.A0F(r9)
            if (r4 == 0) goto L_0x02e4
            r4 = 0
        L_0x02d4:
            int[] r0 = A0Z
            r4 = r0[r4]
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r7
            r0[r2] = r5
            java.lang.String r13 = r8.getString(r4, r0)
            goto L_0x0030
        L_0x02e4:
            boolean r0 = X.AnonymousClass1EG.A0H(r7)
            r4 = 1
            if (r0 == 0) goto L_0x02d4
            r4 = 2
            goto L_0x02d4
        L_0x02ed:
            X.97q r0 = (X.C1771997q) r0
            java.lang.String r8 = r0.A01
            boolean r4 = r8.isEmpty()
            if (r4 != 0) goto L_0x0310
            java.lang.String r7 = r0.A00
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0310
            X.118 r5 = r1.A05
            r4 = 2131897681(0x7f122d51, float:1.9430258E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r8
            r0[r2] = r7
            java.lang.String r13 = r5.A02(r4, r0)
            goto L_0x0030
        L_0x0310:
            X.118 r4 = r1.A05
            r0 = 2131897682(0x7f122d52, float:1.943026E38)
            java.lang.String r13 = r4.A01(r0)
            goto L_0x0030
        L_0x031b:
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131892402(0x7f1218b2, float:1.9419551E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x0328:
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131892398(0x7f1218ae, float:1.9419543E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x0335:
            X.2MG r0 = (X.AnonymousClass2MG) r0
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            long r4 = r0.A01
            r7.setTimeInMillis(r4)
            X.0vb r10 = r1.A06
            java.lang.String r9 = X.A8I.A03(r10, r7)
            long r4 = r0.A01
            X.11Y r8 = X.AnonymousClass11X.A00
            java.lang.String r7 = r8.A06(r10, r4)
            X.11P r0 = r1.A04
            long r4 = X.AnonymousClass11P.A01(r0)
            java.lang.String r0 = r8.A06(r10, r4)
            boolean r4 = r7.equals(r0)
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r5 = r0.getResources()
            if (r4 == 0) goto L_0x0373
            r4 = 2131892405(0x7f1218b5, float:1.9419557E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r9
        L_0x036d:
            java.lang.String r13 = r5.getString(r4, r0)
            goto L_0x0030
        L_0x0373:
            r4 = 2131892404(0x7f1218b4, float:1.9419555E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r9
            r0[r2] = r7
            goto L_0x036d
        L_0x037d:
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            r0 = 2131889162(0x7f120c0a, float:1.941298E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x038e:
            X.0ve r5 = r1.A09
            r4 = 10379(0x288b, float:1.4544E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r5 = X.C18020vd.A05(r0, r5, r4)
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            if (r5 == 0) goto L_0x03ab
            r0 = 2131892261(0x7f121825, float:1.9419265E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x03ab:
            r0 = 2131892260(0x7f121824, float:1.9419263E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x03b4:
            X.0zA r5 = r1.A0E
            boolean r0 = r5.A07()
            if (r0 == 0) goto L_0x0030
            X.118 r4 = r1.A05
            r5.A03()
            r0 = 2131896621(0x7f12292d, float:1.9428108E38)
            java.lang.String r13 = r4.A01(r0)
            goto L_0x0030
        L_0x03ca:
            boolean r4 = r0 instanceof X.AnonymousClass2MK
            if (r4 == 0) goto L_0x0030
            X.2MK r0 = (X.AnonymousClass2MK) r0
            int r7 = r0.A00
            int r0 = r0.A01
            if (r0 != 0) goto L_0x0030
            X.1M9 r0 = r1.A02
            X.C17960vV.A07(r9)
            X.1E7 r5 = r0.A0E(r9)
            X.00H r0 = r1.A0R
            java.lang.Object r4 = r0.get()
            X.2bs r4 = (X.C53032bs) r4
            if (r5 == 0) goto L_0x040e
            X.1Me r0 = r4.A00
            java.lang.String r6 = r0.A0W(r5, r2)
            if (r6 == 0) goto L_0x040e
            X.118 r0 = r4.A01
            android.content.Context r0 = r0.A00
            android.content.res.Resources r5 = r0.getResources()
            r4 = 2131887129(0x7f120419, float:1.9408856E38)
            if (r7 != 0) goto L_0x0401
            r4 = 2131887119(0x7f12040f, float:1.9408836E38)
        L_0x0401:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r6
            java.lang.String r13 = r5.getString(r4, r0)
        L_0x0409:
            X.C18070vi.A0X(r13)
            goto L_0x0030
        L_0x040e:
            X.118 r0 = r4.A01
            android.content.Context r4 = r0.A00
            r0 = 2131887130(0x7f12041a, float:1.9408858E38)
            if (r7 != 0) goto L_0x041a
            r0 = 2131887120(0x7f120410, float:1.9408838E38)
        L_0x041a:
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0409
        L_0x041f:
            r4 = r0
            X.98E r4 = (X.AnonymousClass98E) r4
            java.lang.Integer r5 = r4.A1H()
            java.lang.Integer r4 = X.AnonymousClass00R.A01
            if (r5 != r4) goto L_0x0439
            r6 = 2131890747(0x7f12123b, float:1.9416195E38)
        L_0x042d:
            java.lang.Object[] r4 = new java.lang.Object[r3]
        L_0x042f:
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            java.lang.String r13 = r0.getString(r6, r4)
            goto L_0x0030
        L_0x0439:
            java.lang.String r5 = r0.A0P()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r6 = 2131890746(0x7f12123a, float:1.9416193E38)
            if (r0 == 0) goto L_0x044a
            r6 = 2131890748(0x7f12123c, float:1.9416197E38)
            goto L_0x042d
        L_0x044a:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r5
            goto L_0x042f
        L_0x044f:
            r5 = 150(0x96, float:2.1E-43)
            if (r14 == r5) goto L_0x0495
            int[][] r8 = A0c
        L_0x0455:
            X.0vb r6 = r1.A06
            java.lang.String r5 = r1.A0P(r0)
            java.lang.String r7 = r6.A0F(r5)
            X.1MZ r5 = r1.A08
            X.0ve r6 = r1.A09
            if (r4 == 0) goto L_0x0476
            boolean r4 = r5.A0K(r4)
            if (r4 == 0) goto L_0x0476
            r5 = 5191(0x1447, float:7.274E-42)
            X.0vf r4 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r4, r6, r5)
            r5 = 1
            if (r4 != 0) goto L_0x0477
        L_0x0476:
            r5 = 0
        L_0x0477:
            X.11S r4 = r1.A01
            boolean r4 = X.AnonymousClass25A.A0Q(r4, r0)
            r0 = 2
            if (r4 != 0) goto L_0x0498
            r0 = 1
            if (r7 == 0) goto L_0x0498
            r0 = r8[r3]
            r5 = r0[r5]
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r7
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            java.lang.String r13 = r0.getString(r5, r4)
            goto L_0x0030
        L_0x0495:
            int[][] r8 = A0d
            goto L_0x0455
        L_0x0498:
            r0 = r8[r0]
            r5 = r0[r5]
            java.lang.Object[] r4 = new java.lang.Object[r3]
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            java.lang.String r13 = r0.getString(r5, r4)
            goto L_0x0030
        L_0x04a8:
            if (r29 == 0) goto L_0x0519
            X.2Mg r0 = (X.C48382Mg) r0
            java.lang.String r5 = r0.A0X
            java.lang.String r4 = "linked_group_join"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x04f4
            java.lang.String r4 = "invite"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x04f4
            java.lang.String r4 = "general_chat_auto_add"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x04d6
            int r0 = r0.A18()
            X.118 r6 = r1.A05
            r4 = 2131888905(0x7f120b09, float:1.9412459E38)
            if (r0 != 0) goto L_0x09e0
            r4 = 2131888904(0x7f120b08, float:1.9412456E38)
            goto L_0x09e0
        L_0x04d6:
            java.lang.String r5 = r1.A04(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            X.118 r6 = r1.A05
            if (r0 == 0) goto L_0x04e7
            r4 = 2131888907(0x7f120b0b, float:1.9412463E38)
            goto L_0x09e0
        L_0x04e7:
            r4 = 2131888906(0x7f120b0a, float:1.941246E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r5
            java.lang.String r13 = r6.A02(r4, r0)
            goto L_0x0030
        L_0x04f4:
            X.118 r6 = r1.A05
            r4 = 2131888911(0x7f120b0f, float:1.941247E38)
            goto L_0x09e0
        L_0x04fb:
            if (r29 == 0) goto L_0x0519
            X.2Mg r0 = (X.C48382Mg) r0
            int r0 = r0.A18()
            X.118 r4 = r1.A05
            if (r0 != r2) goto L_0x0510
            r0 = 2131888909(0x7f120b0d, float:1.9412467E38)
            java.lang.String r13 = r4.A01(r0)
            goto L_0x0030
        L_0x0510:
            r0 = 2131888908(0x7f120b0c, float:1.9412465E38)
            java.lang.String r13 = r4.A01(r0)
            goto L_0x0030
        L_0x0519:
            java.lang.String r13 = r1.A0R(r0)
            X.C17960vV.A07(r13)
            goto L_0x0030
        L_0x0522:
            X.1gh r4 = r1.A0P
            X.118 r6 = r1.A05
            X.1gi r4 = (X.C32141gi) r4
            X.C18070vi.A0d(r6, r2)
            r0 = 147(0x93, float:2.06E-43)
            if (r14 != r0) goto L_0x0552
            X.00H r0 = r4.A02
            java.lang.Object r0 = r0.get()
            X.73F r0 = (X.AnonymousClass73F) r0
            X.0ve r5 = r0.A03
            r4 = 10379(0x288b, float:1.4544E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r0, r5, r4)
            r0 = 2131898317(0x7f122fcd, float:1.9431548E38)
            if (r4 == 0) goto L_0x0549
            r0 = 2131898319(0x7f122fcf, float:1.9431552E38)
        L_0x0549:
            java.lang.String r13 = r6.A01(r0)
            X.C18070vi.A0b(r13)
            goto L_0x0030
        L_0x0552:
            r0 = 2131898318(0x7f122fce, float:1.943155E38)
            goto L_0x0549
        L_0x0556:
            X.0zA r4 = r1.A0D
            boolean r0 = r4.A07()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r4 = r4.A03()
            X.1Ps r4 = (X.C25811Ps) r4
            X.118 r0 = r1.A05
            android.content.Context r6 = r0.A00
            X.C18070vi.A0d(r6, r3)
            X.00H r0 = r4.A02
            java.lang.Object r0 = r0.get()
            X.1z1 r0 = (X.C42961z1) r0
            X.1E7 r0 = r0.A08
            if (r0 == 0) goto L_0x057d
            java.lang.String r5 = r0.A0K()
            if (r5 != 0) goto L_0x0584
        L_0x057d:
            r0 = 2131898736(0x7f123170, float:1.9432398E38)
            java.lang.String r5 = r6.getString(r0)
        L_0x0584:
            X.C18070vi.A0b(r5)
            r4 = 2131887318(0x7f1204d6, float:1.940924E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r5
            java.lang.String r13 = r6.getString(r4, r0)
            X.C18070vi.A0X(r13)
            goto L_0x0030
        L_0x0597:
            java.lang.String r10 = r1.A04(r0)
            X.C17960vV.A07(r9)
            X.1CJ r4 = r1.A07
            boolean r4 = r4.A0R(r9)
            if (r4 == 0) goto L_0x05c3
            X.118 r4 = r1.A05
            android.content.Context r8 = r4.A00
            r7 = 2131896600(0x7f122918, float:1.9428066E38)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r5[r3] = r10
            X.0vb r4 = r1.A06
            java.lang.String r0 = r0.A0P()
            java.lang.String r0 = r4.A0F(r0)
            r5[r2] = r0
            java.lang.String r13 = r8.getString(r7, r5)
            goto L_0x0030
        L_0x05c3:
            X.1BI r4 = r0.A0H()
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A01(r4)
            X.C17960vV.A07(r4)
            X.11S r0 = r1.A01
            boolean r0 = r0.A0O(r4)
            r0 = r0 ^ 1
            X.C17960vV.A0D(r0)
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            r4 = 2131896598(0x7f122916, float:1.9428062E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r10
            java.lang.String r13 = r5.getString(r4, r0)
            goto L_0x0030
        L_0x05ec:
            boolean r4 = r0 instanceof X.C1772597w
            if (r4 == 0) goto L_0x08f1
            r4 = r0
            X.2Mg r4 = (X.C48382Mg) r4
            if (r29 == 0) goto L_0x08e5
            java.lang.String r6 = r4.A1B(r6)
            if (r6 != 0) goto L_0x0606
            X.118 r4 = r1.A05
            r0 = 2131888929(0x7f120b21, float:1.9412507E38)
            java.lang.String r5 = r4.A01(r0)
            goto L_0x136f
        L_0x0606:
            X.118 r5 = r1.A05
            r4 = 2131888928(0x7f120b20, float:1.9412505E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r6
            java.lang.String r5 = r5.A02(r4, r0)
            goto L_0x136f
        L_0x0615:
            r8 = r0
            X.984 r8 = (X.AnonymousClass984) r8
            java.lang.String r9 = r8.A1B(r2)
            X.0ve r7 = r1.A09
            r5 = 7180(0x1c0c, float:1.0061E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r4 = X.C18020vd.A05(r4, r7, r5)
            if (r4 == 0) goto L_0x0667
            int r4 = r8.A18()
            if (r4 == r2) goto L_0x0661
            if (r4 == r6) goto L_0x065b
            if (r4 != r10) goto L_0x0667
            X.118 r7 = r1.A05
            r6 = 2131888893(0x7f120afd, float:1.9412434E38)
        L_0x0637:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            X.0vb r4 = r1.A06
            java.lang.String r4 = r4.A0F(r9)
            r5[r3] = r4
            java.lang.String r13 = r7.A02(r6, r5)
            if (r29 != 0) goto L_0x0030
            java.lang.String r5 = r8.A01
            java.lang.String r4 = "sub_group_suggestion_approved"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0678
            r0 = 2131896597(0x7f122915, float:1.942806E38)
            java.lang.String r5 = r7.A01(r0)
            goto L_0x136f
        L_0x065b:
            X.118 r7 = r1.A05
            r6 = 2131888895(0x7f120aff, float:1.9412438E38)
            goto L_0x0637
        L_0x0661:
            X.118 r7 = r1.A05
            r6 = 2131888896(0x7f120b00, float:1.941244E38)
            goto L_0x0637
        L_0x0667:
            X.118 r7 = r1.A05
            r6 = 2131888894(0x7f120afe, float:1.9412436E38)
            goto L_0x0637
        L_0x066d:
            X.118 r5 = r1.A05
            r4 = 2131888891(0x7f120afb, float:1.941243E38)
            java.lang.String r13 = r5.A01(r4)
            if (r29 != 0) goto L_0x0030
        L_0x0678:
            java.lang.String r5 = r1.A0R(r0)
            if (r5 == 0) goto L_0x0030
            goto L_0x136f
        L_0x0680:
            boolean r4 = r0 instanceof X.AnonymousClass2MX
            if (r4 == 0) goto L_0x0030
            X.2MX r0 = (X.AnonymousClass2MX) r0
            X.118 r4 = r1.A05
            android.content.Context r4 = r4.A00
            android.content.res.Resources r7 = r4.getResources()
            r6 = 2131755185(0x7f1000b1, float:1.9141242E38)
            int r5 = r0.A00
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r4[r3] = r0
            java.lang.String r13 = r7.getQuantityString(r6, r5, r4)
            goto L_0x0030
        L_0x06a1:
            r6 = 2131895684(0x7f122584, float:1.9426208E38)
            r7 = 2131895682(0x7f122582, float:1.9426204E38)
            r8 = 2131895686(0x7f122586, float:1.9426212E38)
            r9 = 2131895685(0x7f122585, float:1.942621E38)
            r10 = 2131895683(0x7f122583, float:1.9426206E38)
            r11 = 2131895687(0x7f122587, float:1.9426214E38)
            r4 = r1
            r5 = r0
            java.lang.String r13 = r4.A0A(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0030
        L_0x06bb:
            r6 = 2131895690(0x7f12258a, float:1.942622E38)
            r7 = 2131895688(0x7f122588, float:1.9426216E38)
            r8 = 2131895692(0x7f12258c, float:1.9426224E38)
            r9 = 2131895691(0x7f12258b, float:1.9426222E38)
            r10 = 2131895689(0x7f122589, float:1.9426218E38)
            r11 = 2131895693(0x7f12258d, float:1.9426226E38)
            r4 = r1
            r5 = r0
            java.lang.String r13 = r4.A0A(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0030
        L_0x06d5:
            r0 = 137(0x89, float:1.92E-43)
            r6 = 1
            r5 = 1
            if (r14 != r0) goto L_0x06dc
            r5 = 0
        L_0x06dc:
            if (r4 == 0) goto L_0x06f7
            X.00H r0 = r1.A0C
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            X.1EC r4 = r0.A05(r4)
            if (r4 == 0) goto L_0x06f7
            if (r29 == 0) goto L_0x06f7
            X.1MZ r0 = r1.A08
            boolean r0 = r0.A0K(r4)
            if (r0 == 0) goto L_0x06f7
            r6 = 0
        L_0x06f7:
            int[][] r0 = A0a
            r0 = r0[r5]
            r5 = r0[r6]
            java.lang.Object[] r4 = new java.lang.Object[r3]
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            java.lang.String r13 = r0.getString(r5, r4)
            goto L_0x0030
        L_0x0709:
            X.97o r0 = (X.C1771797o) r0
            X.1Me r7 = r1.A03
            X.1M9 r5 = r1.A02
            X.205 r4 = r0.A0v
            X.1BI r4 = r4.A00
            X.C17960vV.A07(r4)
            X.1E7 r4 = r5.A0H(r4)
            java.lang.String r9 = r7.A0I(r4)
            java.lang.String r4 = r0.A0P()
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            if (r4 == 0) goto L_0x0739
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            r4 = 2131896704(0x7f122980, float:1.9428277E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r9
            java.lang.String r13 = r5.getString(r4, r0)
            goto L_0x0030
        L_0x0739:
            boolean r0 = r0.A00
            X.118 r8 = r1.A05
            android.content.Context r7 = r8.A00
            if (r0 == 0) goto L_0x0757
            r5 = 2131896705(0x7f122981, float:1.9428279E38)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r3] = r9
            r0 = 2131899103(0x7f1232df, float:1.9433143E38)
            java.lang.String r0 = r7.getString(r0)
        L_0x074f:
            r4[r2] = r0
            java.lang.String r13 = r7.getString(r5, r4)
            goto L_0x0030
        L_0x0757:
            r5 = 2131893080(0x7f121b58, float:1.9420926E38)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r3] = r9
            r0 = 2131899103(0x7f1232df, float:1.9433143E38)
            java.lang.String r0 = r8.A01(r0)
            goto L_0x074f
        L_0x0766:
            X.118 r0 = r1.A05
            android.content.Context r7 = r0.A00
            r6 = 2131896695(0x7f122977, float:1.9428259E38)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            X.1Me r4 = r1.A03
            X.1M9 r0 = r1.A02
            X.C17960vV.A07(r9)
            X.1E7 r0 = r0.A0H(r9)
            java.lang.String r0 = r4.A0I(r0)
            r5[r3] = r0
            java.lang.String r13 = r7.getString(r6, r5)
            goto L_0x0030
        L_0x0786:
            if (r9 == 0) goto L_0x0030
            X.1CJ r0 = r1.A07
            X.1ci r4 = X.AnonymousClass1CJ.A00(r0, r9)
            boolean r0 = r4 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x0030
            X.2Dk r4 = (X.C46162Dk) r4
            X.1M9 r0 = r1.A02
            X.1E7 r0 = r0.A0H(r9)
            java.lang.String r7 = r1.A03(r0, r2)
            switch(r14) {
                case 132: goto L_0x07bc;
                case 133: goto L_0x07b6;
                default: goto L_0x07a1;
            }
        L_0x07a1:
            boolean r0 = r4.A0P()
            X.118 r6 = r1.A05
            if (r0 == 0) goto L_0x07cb
            r5 = 2131888105(0x7f1207e9, float:1.9410836E38)
        L_0x07ac:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r7
            java.lang.String r13 = r6.A02(r5, r0)
            goto L_0x0030
        L_0x07b6:
            X.118 r6 = r1.A05
            r5 = 2131888103(0x7f1207e7, float:1.9410832E38)
            goto L_0x07ac
        L_0x07bc:
            X.9Ig r4 = r4.A02
            X.9Ig r0 = X.C179509Ig.OWNER
            X.118 r6 = r1.A05
            r5 = 2131888101(0x7f1207e5, float:1.9410828E38)
            if (r4 != r0) goto L_0x07ac
            r5 = 2131888102(0x7f1207e6, float:1.941083E38)
            goto L_0x07ac
        L_0x07cb:
            r0 = 2131888104(0x7f1207e8, float:1.9410834E38)
            java.lang.String r13 = r6.A01(r0)
            goto L_0x0030
        L_0x07d4:
            java.lang.String r13 = r1.A0B(r0, r2, r11)
            goto L_0x0030
        L_0x07da:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r4 = 2131889913(0x7f120ef9, float:1.9414503E38)
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            java.lang.String r13 = r0.getString(r4, r5)
            goto L_0x0030
        L_0x07e9:
            X.1M9 r0 = r1.A02
            X.C17960vV.A07(r9)
            X.1E7 r8 = r0.A0H(r9)
            boolean r0 = r8.A0C()
            if (r0 == 0) goto L_0x0806
            X.0ve r5 = r1.A09
            r4 = 5263(0x148f, float:7.375E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r4)
            if (r0 != 0) goto L_0x0806
            goto L_0x0030
        L_0x0806:
            X.2lf r4 = r8.A0H
            r0 = 0
            if (r4 == 0) goto L_0x080c
            r0 = 1
        L_0x080c:
            if (r0 != 0) goto L_0x0816
            X.1E7 r4 = r8.A0I
            r0 = 0
            if (r4 == 0) goto L_0x0814
            r0 = 1
        L_0x0814:
            if (r0 == 0) goto L_0x0030
        L_0x0816:
            X.118 r0 = r1.A05
            android.content.Context r7 = r0.A00
            r6 = 2131890470(0x7f121126, float:1.9415633E38)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            boolean r4 = X.C22971Dz.A0e(r9)
            r0 = 2
            if (r4 == 0) goto L_0x0827
            r0 = 1
        L_0x0827:
            java.lang.String r0 = r1.A03(r8, r0)
            r5[r3] = r0
            java.lang.String r13 = r7.getString(r6, r5)
            goto L_0x0030
        L_0x0833:
            X.2Mg r0 = (X.C48382Mg) r0
            X.11S r5 = r1.A01
            X.1BI r4 = r0.A0H()
            boolean r8 = r5.A0O(r4)
            r13 = 0
            int r0 = r0.A18()     // Catch:{ ClassCastException -> 0x0848 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassCastException -> 0x0848 }
        L_0x0848:
            if (r7 == 0) goto L_0x086e
            X.0ve r5 = r1.A09
            r4 = 7889(0x1ed1, float:1.1055E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r4)
            if (r0 == 0) goto L_0x086e
            int r0 = r7.intValue()
            if (r0 == r2) goto L_0x0887
            if (r0 == r6) goto L_0x087c
            if (r0 != r10) goto L_0x086e
            X.118 r4 = r1.A05
            r0 = 2131888901(0x7f120b05, float:1.941245E38)
            if (r8 == 0) goto L_0x086a
            r0 = 2131888900(0x7f120b04, float:1.9412448E38)
        L_0x086a:
            java.lang.String r13 = r4.A01(r0)
        L_0x086e:
            if (r13 != 0) goto L_0x0030
            X.118 r6 = r1.A05
            r4 = 2131888933(0x7f120b25, float:1.9412515E38)
            if (r8 == 0) goto L_0x09e0
            r4 = 2131888932(0x7f120b24, float:1.9412513E38)
            goto L_0x09e0
        L_0x087c:
            X.118 r4 = r1.A05
            r0 = 2131888899(0x7f120b03, float:1.9412446E38)
            if (r8 == 0) goto L_0x086a
            r0 = 2131888898(0x7f120b02, float:1.9412444E38)
            goto L_0x086a
        L_0x0887:
            X.118 r4 = r1.A05
            r0 = 2131888903(0x7f120b07, float:1.9412454E38)
            if (r8 == 0) goto L_0x086a
            r0 = 2131888902(0x7f120b06, float:1.9412452E38)
            goto L_0x086a
        L_0x0892:
            if (r29 != 0) goto L_0x08c0
            java.lang.String r5 = r1.A0R(r0)
            if (r5 != 0) goto L_0x136f
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            r5 = 2131891113(0x7f1213a9, float:1.9416937E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.1BI r0 = r0.A0H()
            r4[r3] = r0
            java.lang.String r5 = r6.getString(r5, r4)
            goto L_0x136f
        L_0x08af:
            if (r29 != 0) goto L_0x08c0
            java.lang.String r5 = r1.A0R(r0)
            if (r5 != 0) goto L_0x136f
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            r0 = 2131891102(0x7f12139e, float:1.9416915E38)
            goto L_0x13ac
        L_0x08c0:
            X.118 r4 = r1.A05
            r0 = 2131888933(0x7f120b25, float:1.9412515E38)
            java.lang.String r13 = r4.A01(r0)
            goto L_0x0030
        L_0x08cb:
            boolean r4 = r0 instanceof X.C1772797y
            if (r4 == 0) goto L_0x08f1
            r4 = r0
            if (r29 == 0) goto L_0x08e5
            X.118 r6 = r1.A05
            r5 = 2131888930(0x7f120b22, float:1.941251E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r1.A0P(r0)
            r4[r3] = r0
            java.lang.String r5 = r6.A02(r5, r4)
            goto L_0x136f
        L_0x08e5:
            java.lang.String r5 = r1.A0R(r0)
            if (r5 != 0) goto L_0x136f
            java.lang.String r5 = r1.A05(r4)
            goto L_0x136f
        L_0x08f1:
            java.lang.String r13 = r1.A05(r0)
            goto L_0x0030
        L_0x08f7:
            if (r29 == 0) goto L_0x090c
            X.118 r6 = r1.A05
            r5 = 2131888927(0x7f120b1f, float:1.9412503E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r1.A0P(r0)
            r4[r3] = r0
            java.lang.String r13 = r6.A02(r5, r4)
            goto L_0x0030
        L_0x090c:
            java.lang.String r5 = r1.A0R(r0)
            if (r5 != 0) goto L_0x136f
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            r0 = 2131893520(0x7f121d10, float:1.9421819E38)
            goto L_0x13ac
        L_0x091b:
            if (r29 == 0) goto L_0x0930
            X.118 r6 = r1.A05
            r5 = 2131888930(0x7f120b22, float:1.941251E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r1.A0P(r0)
            r4[r3] = r0
            java.lang.String r13 = r6.A02(r5, r4)
            goto L_0x0030
        L_0x0930:
            java.lang.String r5 = r1.A0R(r0)
            if (r5 != 0) goto L_0x136f
            X.2Mh r0 = (X.C48392Mh) r0
            java.lang.String r5 = r1.A0D(r0)
            goto L_0x136f
        L_0x093e:
            X.118 r4 = r1.A05
            android.content.Context r7 = r4.A00
            X.1M9 r5 = r1.A02
            X.1Me r8 = r1.A03
            com.whatsapp.jid.UserJid r4 = r0.A0I()
            if (r4 != 0) goto L_0x0982
            r4 = 2131888741(0x7f120a65, float:1.9412126E38)
            java.lang.String r8 = r7.getString(r4)
        L_0x0953:
            X.11S r5 = r1.A01
            com.whatsapp.jid.UserJid r4 = r0.A0I()
            boolean r4 = r5.A0O(r4)
            android.content.res.Resources r7 = r7.getResources()
            if (r4 == 0) goto L_0x0974
            r5 = 2131895411(0x7f122473, float:1.9425654E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r0.A0R()
            r4[r3] = r0
        L_0x096e:
            java.lang.String r13 = r7.getString(r5, r4)
            goto L_0x0030
        L_0x0974:
            r5 = 2131895410(0x7f122472, float:1.9425652E38)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r3] = r8
            java.lang.String r0 = r0.A0R()
            r4[r2] = r0
            goto L_0x096e
        L_0x0982:
            X.1E7 r5 = r5.A0H(r4)
            int r4 = r8.A0B(r9)
            java.lang.String r8 = r8.A0T(r5, r4)
            goto L_0x0953
        L_0x098f:
            X.2Mh r0 = (X.C48392Mh) r0
            java.util.List r4 = r0.A01
            java.lang.Object r5 = r4.get(r3)
            X.C18070vi.A0X(r5)
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            X.1Dw r4 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r5 = X.C22941Dw.A01(r5)
            X.C17960vV.A07(r5)
            X.1M9 r4 = r1.A02
            X.1E7 r4 = r4.A0H(r5)
            X.1Me r5 = r1.A03
            java.lang.String r8 = r5.A0I(r4)
            java.util.List r4 = r0.A01
            int r0 = r4.size()
            java.util.List r4 = r4.subList(r2, r0)
            r0 = -1
            java.lang.String r7 = r5.A0a(r4, r0)
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            r4 = 2131896696(0x7f122978, float:1.942826E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r8
            r0[r2] = r7
            java.lang.String r13 = r5.getString(r4, r0)
            goto L_0x0030
        L_0x09d3:
            X.11S r4 = r1.A01
            boolean r4 = r4.A0O(r12)
            if (r4 == 0) goto L_0x09e6
            X.118 r6 = r1.A05
            r4 = 2131894562(0x7f122122, float:1.9423932E38)
        L_0x09e0:
            java.lang.String r13 = r6.A01(r4)
            goto L_0x0030
        L_0x09e6:
            java.lang.String r5 = r1.A04(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            X.118 r6 = r1.A05
            if (r0 == 0) goto L_0x09f6
            r4 = 2131894561(0x7f122121, float:1.942393E38)
            goto L_0x09e0
        L_0x09f6:
            r4 = 2131894559(0x7f12211f, float:1.9423926E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r5
            java.lang.String r13 = r6.A02(r4, r0)
            goto L_0x0030
        L_0x0a03:
            X.2MO r0 = (X.AnonymousClass2MO) r0
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            long r4 = r0.A00
            r7.setTimeInMillis(r4)
            X.0vb r4 = r1.A06
            java.lang.String r8 = X.A8I.A03(r4, r7)
            X.118 r4 = r1.A05
            android.content.Context r4 = r4.A00
            android.content.res.Resources r7 = r4.getResources()
            r5 = 2131895433(0x7f122489, float:1.9425699E38)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r0 = r0.A02
            r4[r3] = r0
            r4[r2] = r8
            java.lang.String r13 = r7.getString(r5, r4)
            goto L_0x0030
        L_0x0a2d:
            r6 = r0
            X.2Mg r6 = (X.C48382Mg) r6
            X.118 r4 = r1.A05
            android.content.Context r8 = r4.A00
            X.11S r5 = r1.A01
            X.1BI r4 = r0.A0H()
            boolean r5 = r5.A0O(r4)
            java.lang.String r9 = r1.A04(r0)
            com.whatsapp.jid.GroupJid r4 = r6.A19(r2)
            X.1CJ r0 = r1.A07
            java.lang.String r7 = r0.A0F(r4)
            r6 = 2
            if (r5 == 0) goto L_0x0a66
            r5 = 0
        L_0x0a50:
            boolean r4 = X.AnonymousClass1EG.A0H(r7)
            int[][] r0 = A0g
            r0 = r0[r5]
            r4 = r0[r4]
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r9
            r0[r2] = r7
            java.lang.String r13 = r8.getString(r4, r0)
            goto L_0x0030
        L_0x0a66:
            boolean r0 = X.AnonymousClass1EG.A0H(r9)
            r5 = 1
            if (r0 == 0) goto L_0x0a50
            r5 = 2
            goto L_0x0a50
        L_0x0a6f:
            r5 = r0
            X.2Mg r5 = (X.C48382Mg) r5
            java.lang.String r7 = r1.A04(r0)
            X.11S r4 = r1.A01
            X.1BI r0 = r5.A0H()
            boolean r8 = r4.A0O(r0)
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            com.whatsapp.jid.GroupJid r6 = r5.A19(r2)
            r4 = r1
            r5 = r0
            r9 = r2
            java.lang.String r13 = r4.A0L(r5, r6, r7, r8, r9)
            goto L_0x0030
        L_0x0a91:
            r5 = r0
            X.2Mg r5 = (X.C48382Mg) r5
            java.lang.String r7 = r1.A04(r0)
            X.11S r4 = r1.A01
            X.1BI r0 = r5.A0H()
            boolean r8 = r4.A0O(r0)
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            com.whatsapp.jid.GroupJid r6 = r5.A19(r2)
            r4 = r1
            r5 = r0
            r9 = r3
            java.lang.String r13 = r4.A0L(r5, r6, r7, r8, r9)
            goto L_0x0030
        L_0x0ab3:
            r7 = r0
            X.2Me r7 = (X.C48362Me) r7
            java.util.ArrayList r4 = r7.A1C(r6)
            int r6 = r4.size()
            java.lang.String r5 = r1.A04(r0)
            X.11S r4 = r1.A01
            X.1BI r0 = r7.A0H()
            boolean r4 = r4.A0O(r0)
            java.util.List r0 = r7.A1E(r2)
            java.lang.String r13 = r1.A0G(r5, r0, r6, r4)
            goto L_0x0030
        L_0x0ad6:
            r7 = r0
            X.2Me r7 = (X.C48362Me) r7
            java.util.ArrayList r4 = r7.A1C(r6)
            int r6 = r4.size()
            java.lang.String r5 = r1.A04(r0)
            X.11S r4 = r1.A01
            X.1BI r0 = r7.A0H()
            boolean r4 = r4.A0O(r0)
            java.util.List r0 = r7.A1E(r10)
            java.lang.String r13 = r1.A0F(r5, r0, r6, r4)
            goto L_0x0030
        L_0x0af9:
            r8 = r0
            X.2Mg r8 = (X.C48382Mg) r8
            java.lang.String r7 = r1.A04(r0)
            java.lang.String r6 = r8.A1B(r2)
            r0 = 4
            java.lang.String r5 = r8.A1B(r0)
            X.11S r4 = r1.A01
            X.1BI r0 = r8.A0H()
            boolean r0 = r4.A0O(r0)
            java.lang.String r13 = r1.A0T(r7, r5, r6, r0)
            goto L_0x0030
        L_0x0b19:
            X.2Mg r0 = (X.C48382Mg) r0
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            X.1CJ r5 = r1.A07
            com.whatsapp.jid.GroupJid r4 = r0.A19(r2)
            java.lang.String r5 = r5.A0F(r4)
            if (r5 != 0) goto L_0x0be4
            java.lang.String r5 = r0.A1B(r2)
            goto L_0x0bd9
        L_0x0b31:
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            X.126 r0 = r1.A0A
            boolean r4 = r0.A0n(r4)
            r0 = 2131890869(0x7f1212b5, float:1.9416442E38)
            if (r4 == 0) goto L_0x0b43
            r0 = 2131890868(0x7f1212b4, float:1.941644E38)
        L_0x0b43:
            java.lang.String r13 = r5.getString(r0)
            goto L_0x0030
        L_0x0b49:
            X.2Mg r0 = (X.C48382Mg) r0
            java.lang.String r6 = r0.A1B(r2)
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            if (r6 != 0) goto L_0x0b5e
            r0 = 2131890871(0x7f1212b7, float:1.9416446E38)
            java.lang.String r13 = r5.getString(r0)
            goto L_0x0030
        L_0x0b5e:
            r4 = 2131890870(0x7f1212b6, float:1.9416444E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r6
            java.lang.String r13 = r5.getString(r4, r0)
            goto L_0x0030
        L_0x0b6b:
            X.2Mg r0 = (X.C48382Mg) r0
            java.lang.String r5 = r0.A1B(r2)
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            X.1EC r4 = X.C42941yz.A00(r0)
            X.126 r0 = r1.A0A
            boolean r4 = r0.A0n(r4)
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            java.lang.String r13 = A02(r0, r5, r4)
            goto L_0x0030
        L_0x0b89:
            r8 = r0
            X.98B r8 = (X.AnonymousClass98B) r8
            java.lang.String r7 = r1.A04(r0)
            java.lang.String r6 = r8.A18()
            X.C17960vV.A07(r6)
            java.util.Set r0 = r8.A03
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            int r0 = r4.size()
            if (r0 == r2) goto L_0x0bb5
            r5 = 0
        L_0x0ba5:
            X.11S r4 = r1.A01
            X.1BI r0 = r8.A0H()
            boolean r0 = r4.A0O(r0)
            java.lang.String r13 = r1.A0T(r7, r5, r6, r0)
            goto L_0x0030
        L_0x0bb5:
            java.lang.Object r0 = r4.get(r3)
            X.A2B r0 = (X.A2B) r0
            java.lang.String r5 = r0.A06
            goto L_0x0ba5
        L_0x0bbe:
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131894648(0x7f122178, float:1.9424107E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x0bcb:
            X.2MW r0 = (X.AnonymousClass2MW) r0
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            X.1CJ r4 = r1.A07
            com.whatsapp.jid.GroupJid r0 = r0.A01
            java.lang.String r5 = r4.A0F(r0)
        L_0x0bd9:
            if (r5 != 0) goto L_0x0be4
            r0 = 2131896691(0x7f122973, float:1.942825E38)
            java.lang.String r13 = r6.getString(r0)
            goto L_0x0030
        L_0x0be4:
            r4 = 2131896690(0x7f122972, float:1.9428248E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r5
            java.lang.String r13 = r6.getString(r4, r0)
            goto L_0x0030
        L_0x0bf1:
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131894664(0x7f122188, float:1.942414E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x0bfe:
            X.2MW r0 = (X.AnonymousClass2MW) r0
            com.whatsapp.jid.GroupJid r5 = r0.A01
            X.1CJ r4 = r1.A07
            java.lang.String r7 = r4.A0F(r5)
            X.118 r4 = r1.A05
            android.content.Context r8 = r4.A00
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            X.1EC r6 = X.C42941yz.A00(r0)
            X.C17960vV.A07(r6)
            X.126 r0 = r1.A0A
            int r5 = r0.A0K(r6)
            r4 = 4
            boolean r0 = r0.A0n(r6)
            if (r5 == r4) goto L_0x0c2a
            java.lang.String r13 = A02(r8, r7, r0)
            goto L_0x0030
        L_0x0c2a:
            r4 = 2131890869(0x7f1212b5, float:1.9416442E38)
            if (r0 == 0) goto L_0x10dd
            r4 = 2131890868(0x7f1212b4, float:1.941644E38)
            goto L_0x10dd
        L_0x0c34:
            X.118 r4 = r1.A05
            r0 = 2131888537(0x7f120999, float:1.9411712E38)
            java.lang.String r13 = r4.A01(r0)
            goto L_0x0030
        L_0x0c3f:
            if (r15 == 0) goto L_0x0c4d
            r5 = 2131887606(0x7f1205f6, float:1.9409824E38)
            r4 = 2131887608(0x7f1205f8, float:1.9409828E38)
            java.lang.String r13 = r1.A06(r0, r5, r4)
            goto L_0x0030
        L_0x0c4d:
            r5 = 2131891034(0x7f12135a, float:1.9416777E38)
            r4 = 2131891038(0x7f12135e, float:1.9416785E38)
            java.lang.String r13 = r1.A06(r0, r5, r4)
            goto L_0x0030
        L_0x0c59:
            if (r15 == 0) goto L_0x0c67
            r5 = 2131887607(0x7f1205f7, float:1.9409826E38)
            r4 = 2131887609(0x7f1205f9, float:1.940983E38)
            java.lang.String r13 = r1.A06(r0, r5, r4)
            goto L_0x0030
        L_0x0c67:
            r5 = 2131891035(0x7f12135b, float:1.9416779E38)
            r4 = 2131891039(0x7f12135f, float:1.9416787E38)
            java.lang.String r13 = r1.A06(r0, r5, r4)
            goto L_0x0030
        L_0x0c73:
            X.2Mh r0 = (X.C48392Mh) r0
            java.lang.String r13 = r1.A0D(r0)
            goto L_0x0030
        L_0x0c7b:
            X.118 r4 = r1.A05
            android.content.Context r7 = r4.A00
            java.lang.String r11 = r1.A04(r0)
            X.2MU r0 = (X.AnonymousClass2MU) r0
            java.lang.String r8 = r0.A00
            X.11S r4 = r1.A01
            X.1BI r0 = r0.A0H()
            boolean r0 = r4.A0O(r0)
            if (r0 == 0) goto L_0x0cb1
            r10 = 0
        L_0x0c94:
            r9 = 0
        L_0x0c95:
            boolean r4 = X.AnonymousClass1EG.A0H(r8)
            r5 = r4 ^ 1
            int[][] r0 = A0f
            r0 = r0[r10]
            r4 = r0[r4]
            if (r5 == 0) goto L_0x0cc5
            if (r9 == 0) goto L_0x0cbb
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r11
            r0[r2] = r8
            java.lang.String r13 = r7.getString(r4, r0)
            goto L_0x0030
        L_0x0cb1:
            boolean r0 = X.AnonymousClass1EG.A0H(r11)
            r10 = 2
            if (r0 != 0) goto L_0x0c94
            r10 = 1
            r9 = 1
            goto L_0x0c95
        L_0x0cbb:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r8
            java.lang.String r13 = r7.getString(r4, r0)
            goto L_0x0030
        L_0x0cc5:
            if (r9 == 0) goto L_0x0cd1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r11
            java.lang.String r13 = r7.getString(r4, r0)
            goto L_0x0030
        L_0x0cd1:
            java.lang.String r13 = r7.getString(r4)
            goto L_0x0030
        L_0x0cd7:
            X.118 r4 = r1.A05
            if (r15 == 0) goto L_0x0ce4
            r0 = 2131888537(0x7f120999, float:1.9411712E38)
            java.lang.String r5 = r4.A01(r0)
            goto L_0x136f
        L_0x0ce4:
            r0 = 2131891109(0x7f1213a5, float:1.9416929E38)
            java.lang.String r5 = r4.A01(r0)
            goto L_0x136f
        L_0x0ced:
            r6 = 2131891070(0x7f12137e, float:1.941685E38)
            r7 = 2131891071(0x7f12137f, float:1.9416852E38)
            r8 = 2131891067(0x7f12137b, float:1.9416844E38)
            r9 = 2131891069(0x7f12137d, float:1.9416848E38)
            r10 = 2131891066(0x7f12137a, float:1.9416842E38)
            r11 = 2131891068(0x7f12137c, float:1.9416846E38)
            r4 = r1
            r5 = r0
            java.lang.String r13 = r4.A09(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0030
        L_0x0d07:
            r6 = 2131891074(0x7f121382, float:1.9416858E38)
            r7 = 2131891075(0x7f121383, float:1.941686E38)
            r8 = 2131891072(0x7f121380, float:1.9416854E38)
            r9 = 2131891073(0x7f121381, float:1.9416856E38)
            r10 = 2131890868(0x7f1212b4, float:1.941644E38)
            r11 = 2131890869(0x7f1212b5, float:1.9416442E38)
            r4 = r1
            r5 = r0
            java.lang.String r13 = r4.A09(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0030
        L_0x0d21:
            X.1BI r4 = r0.A0H()
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A01(r4)
            X.C17960vV.A07(r4)
            X.11S r0 = r1.A01
            boolean r0 = r0.A0O(r4)
            r0 = r0 ^ 1
            X.C17960vV.A0D(r0)
            X.1M9 r0 = r1.A02
            X.1E7 r4 = r0.A0H(r4)
            X.1Me r0 = r1.A03
            java.lang.String r6 = r0.A0I(r4)
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            r4 = 2131890876(0x7f1212bc, float:1.9416456E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r6
            java.lang.String r13 = r5.getString(r4, r0)
            goto L_0x0030
        L_0x0d56:
            r6 = 2131888556(0x7f1209ac, float:1.941175E38)
            r5 = 2131755059(0x7f100033, float:1.9140987E38)
            r4 = 2131755058(0x7f100032, float:1.9140985E38)
            java.lang.String r13 = r1.A08(r0, r6, r5, r4)
            goto L_0x0030
        L_0x0d65:
            r6 = 2131888557(0x7f1209ad, float:1.9411753E38)
            r5 = 2131755061(0x7f100035, float:1.914099E38)
            r4 = 2131755060(0x7f100034, float:1.9140989E38)
            java.lang.String r13 = r1.A08(r0, r6, r5, r4)
            goto L_0x0030
        L_0x0d74:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r4 = 2131891570(0x7f121572, float:1.9417864E38)
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            java.lang.String r13 = r0.getString(r4, r5)
            goto L_0x0030
        L_0x0d83:
            X.2Mh r0 = (X.C48392Mh) r0
            java.util.List r8 = r0.A01
            int r0 = r8.size()
            if (r0 != r2) goto L_0x0da8
            X.11S r4 = r1.A01
            java.lang.Object r0 = r8.get(r3)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            boolean r0 = r4.A0O(r0)
            if (r0 == 0) goto L_0x0da8
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131891178(0x7f1213ea, float:1.9417069E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x0da8:
            X.0vb r5 = r1.A06
            X.0ve r4 = r1.A09
            int r0 = r8.size()
            boolean r0 = A0I(r4, r0)
            X.1Me r4 = r1.A03
            if (r0 == 0) goto L_0x0ddb
            java.lang.String r0 = r4.A0Z(r8, r6)
        L_0x0dbc:
            java.lang.String r7 = r5.A0F(r0)
            boolean r4 = X.AnonymousClass1EG.A0H(r7)
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            if (r4 == 0) goto L_0x0de1
            android.content.res.Resources r5 = r0.getResources()
            r4 = 2131755164(0x7f10009c, float:1.91412E38)
            int r0 = r8.size()
            java.lang.String r13 = r5.getQuantityString(r4, r0)
            goto L_0x0030
        L_0x0ddb:
            r0 = -1
            java.lang.String r0 = r4.A0a(r8, r0)
            goto L_0x0dbc
        L_0x0de1:
            android.content.res.Resources r6 = r0.getResources()
            r5 = 2131755162(0x7f10009a, float:1.9141195E38)
            int r4 = r8.size()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r7
            java.lang.String r13 = r6.getQuantityString(r5, r4, r0)
            goto L_0x0030
        L_0x0df6:
            r8 = r0
            X.98B r8 = (X.AnonymousClass98B) r8
            java.lang.String r7 = r1.A04(r0)
            int r6 = r8.A00
            java.util.Set r5 = r8.A03
            X.11S r4 = r1.A01
            X.1BI r0 = r8.A0H()
            boolean r0 = r4.A0O(r0)
            java.lang.String r13 = r1.A0G(r7, r5, r6, r0)
            goto L_0x0030
        L_0x0e11:
            r7 = r0
            X.98B r7 = (X.AnonymousClass98B) r7
            java.lang.String r6 = r1.A04(r0)
            int r5 = r7.A00
            X.11S r4 = r1.A01
            X.1BI r0 = r7.A0H()
            boolean r4 = r4.A0O(r0)
            java.util.Set r0 = r7.A03
            java.lang.String r13 = r1.A0F(r6, r0, r5, r4)
            goto L_0x0030
        L_0x0e2c:
            boolean r4 = r0.A17()
            r6 = 5
            if (r4 == 0) goto L_0x0e5e
            X.1BI r5 = r0.A0H()
            if (r5 == 0) goto L_0x0e5e
            X.11S r4 = r1.A01
            boolean r4 = r4.A0O(r5)
            if (r4 == 0) goto L_0x0e5e
            if (r9 == 0) goto L_0x0e5e
            X.1M9 r0 = r1.A02
            X.1E7 r0 = r0.A0H(r9)
            java.lang.String r0 = r1.A03(r0, r6)
            r5 = 2131888737(0x7f120a61, float:1.9412118E38)
        L_0x0e50:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r0
        L_0x0e54:
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            java.lang.String r13 = r0.getString(r5, r4)
            goto L_0x0030
        L_0x0e5e:
            X.1BI r4 = r0.A0H()
            if (r4 == 0) goto L_0x0e73
            X.1M9 r0 = r1.A02
            X.1E7 r0 = r0.A0H(r4)
            java.lang.String r0 = r1.A03(r0, r6)
            r5 = 2131887009(0x7f1203a1, float:1.9408613E38)
            if (r0 != 0) goto L_0x0e50
        L_0x0e73:
            r5 = 2131887008(0x7f1203a0, float:1.940861E38)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            goto L_0x0e54
        L_0x0e79:
            r8 = r0
            X.2MW r8 = (X.AnonymousClass2MW) r8
            java.lang.String r11 = r1.A04(r0)
            X.118 r0 = r1.A05
            android.content.Context r7 = r0.A00
            java.lang.Integer r10 = r8.A02
            int r0 = r8.A00
            boolean r9 = X.AnonymousClass2TI.A00(r0)
            if (r10 == 0) goto L_0x0e99
            int r0 = r10.intValue()
            if (r0 != r6) goto L_0x0e99
            int r4 = r8.A00
            r0 = 1
            if (r4 == 0) goto L_0x0e9a
        L_0x0e99:
            r0 = 0
        L_0x0e9a:
            com.whatsapp.jid.GroupJid r5 = r8.A01
            if (r9 == 0) goto L_0x0eb5
            r13 = 0
            if (r10 != 0) goto L_0x0ea2
            r13 = 1
        L_0x0ea2:
            X.11S r4 = r1.A01
            X.1BI r0 = r8.A0H()
            boolean r12 = r4.A0O(r0)
            r8 = r1
            r9 = r7
            r10 = r5
            java.lang.String r13 = r8.A0L(r9, r10, r11, r12, r13)
            goto L_0x0030
        L_0x0eb5:
            if (r0 == 0) goto L_0x0030
            X.11S r4 = r1.A01
            X.1BI r0 = r8.A0H()
            boolean r4 = r4.A0O(r0)
            X.1CJ r0 = r1.A07
            java.lang.String r8 = r0.A0F(r5)
            if (r4 == 0) goto L_0x0ee0
            r5 = 0
        L_0x0eca:
            boolean r4 = X.AnonymousClass1EG.A0H(r8)
            int[][] r0 = A0g
            r0 = r0[r5]
            r4 = r0[r4]
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r11
            r0[r2] = r8
            java.lang.String r13 = r7.getString(r4, r0)
            goto L_0x0030
        L_0x0ee0:
            boolean r0 = X.AnonymousClass1EG.A0H(r11)
            r5 = 1
            if (r0 == 0) goto L_0x0eca
            r5 = 2
            goto L_0x0eca
        L_0x0ee9:
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            r0 = 2131891499(0x7f12152b, float:1.941772E38)
            if (r29 == 0) goto L_0x0f0a
            r0 = 2131891498(0x7f12152a, float:1.9417718E38)
            goto L_0x0f0a
        L_0x0efa:
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            r0 = 2131891501(0x7f12152d, float:1.9417724E38)
            if (r29 == 0) goto L_0x0f0a
            r0 = 2131891500(0x7f12152c, float:1.9417722E38)
        L_0x0f0a:
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x0f10:
            X.1gk r4 = r1.A0Q
            java.lang.String r6 = r1.A04(r0)
            X.C17960vV.A07(r6)
            X.1BI r0 = r0.A0H()
            if (r0 != 0) goto L_0x0f28
            r0 = 2131897368(0x7f122c18, float:1.9429624E38)
            java.lang.String r13 = X.C32161gk.A00(r9, r4, r0)
            goto L_0x0030
        L_0x0f28:
            X.118 r0 = r4.A03
            android.content.Context r5 = r0.A00
            r4 = 2131897368(0x7f122c18, float:1.9429624E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r6
            java.lang.String r13 = r5.getString(r4, r0)
            goto L_0x0030
        L_0x0f39:
            boolean r4 = r0 instanceof X.AnonymousClass2MM
            if (r4 == 0) goto L_0x0030
            X.1BI r5 = r0.A0H()
            if (r5 == 0) goto L_0x0030
            r7 = r0
            X.2MM r7 = (X.AnonymousClass2MM) r7
            X.11S r4 = r1.A01
            boolean r5 = r4.A0O(r5)
            X.118 r4 = r1.A05
            android.content.Context r4 = r4.A00
            android.content.res.Resources r8 = r4.getResources()
            int r4 = r7.A00
            if (r5 == 0) goto L_0x0f70
            if (r4 == r6) goto L_0x0f6c
            if (r4 == r10) goto L_0x0f6c
            boolean r0 = r7.A02
            r4 = 2131891701(0x7f1215f5, float:1.941813E38)
            if (r0 == 0) goto L_0x0f66
            r4 = 2131891699(0x7f1215f3, float:1.9418125E38)
        L_0x0f66:
            java.lang.String r5 = r8.getString(r4)
            goto L_0x136f
        L_0x0f6c:
            r4 = 2131898034(0x7f122eb2, float:1.9430974E38)
            goto L_0x0f66
        L_0x0f70:
            if (r4 == r6) goto L_0x0f98
            if (r4 == r10) goto L_0x0f98
            boolean r4 = r7.A02
            r7 = 2131891700(0x7f1215f4, float:1.9418127E38)
            if (r4 == 0) goto L_0x0f7e
            r7 = 2131891698(0x7f1215f2, float:1.9418123E38)
        L_0x0f7e:
            java.lang.Object[] r6 = new java.lang.Object[r2]
            X.1Me r5 = r1.A03
            X.1M9 r4 = r1.A02
            X.1BI r0 = r0.A0H()
            X.1E7 r0 = r4.A0H(r0)
            java.lang.String r0 = r5.A0I(r0)
            r6[r3] = r0
            java.lang.String r5 = r8.getString(r7, r6)
            goto L_0x136f
        L_0x0f98:
            r7 = 2131898033(0x7f122eb1, float:1.9430972E38)
            goto L_0x0f7e
        L_0x0f9c:
            X.2MD r0 = (X.AnonymousClass2MD) r0
            X.118 r4 = r1.A05
            android.content.Context r4 = r4.A00
            android.content.res.Resources r7 = r4.getResources()
            int r5 = r0.A00
            if (r5 == r2) goto L_0x0fbc
            if (r5 == r6) goto L_0x0fc0
            r4 = 2131887145(0x7f120429, float:1.9408889E38)
            if (r5 == r10) goto L_0x0fc3
            r0 = 4
            r4 = 2131897130(0x7f122b2a, float:1.942914E38)
            if (r5 == r0) goto L_0x0fc3
            r0 = 5
            if (r5 == r0) goto L_0x0fc0
            goto L_0x1190
        L_0x0fbc:
            r4 = 2131890786(0x7f121262, float:1.9416274E38)
            goto L_0x0fc3
        L_0x0fc0:
            r4 = 2131887146(0x7f12042a, float:1.940889E38)
        L_0x0fc3:
            java.lang.String r13 = r7.getString(r4)
            goto L_0x0030
        L_0x0fc9:
            X.2M9 r0 = (X.AnonymousClass2M9) r0
            X.11S r5 = r1.A01
            int r4 = r0.A00
            if (r4 != r6) goto L_0x0fec
            X.205 r4 = r0.A0v
            X.1BI r5 = r4.A00
        L_0x0fd5:
            X.C17960vV.A07(r5)
            X.00H r4 = r1.A0S
            java.lang.Object r4 = r4.get()
            X.2ij r4 = (X.C57222ij) r4
            boolean r4 = r4.A00()
            int r0 = r0.A00
            java.lang.String r13 = r1.A0N(r5, r0, r4)
            goto L_0x0030
        L_0x0fec:
            r5.A0I()
            com.whatsapp.jid.PhoneUserJid r5 = r5.A0E
            goto L_0x0fd5
        L_0x0ff2:
            X.1M9 r4 = r1.A02
            X.1E7 r7 = r4.A0E(r9)
            X.1MB r4 = r1.A0M
            boolean r4 = r4.A03(r9)
            if (r4 == 0) goto L_0x100d
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131888122(0x7f1207fa, float:1.941087E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x100d:
            X.0ve r10 = r1.A09
            boolean r4 = X.C43381zi.A01(r10, r9)
            if (r4 == 0) goto L_0x102c
            X.118 r0 = r1.A05
            android.content.Context r7 = r0.A00
            r5 = 2131891354(0x7f12149a, float:1.9417426E38)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r0 = "WhatsApp Surveys"
            r4[r3] = r0
            java.lang.String r0 = "Meta"
            r4[r2] = r0
            java.lang.String r13 = r7.getString(r5, r4)
            goto L_0x0030
        L_0x102c:
            X.12L r4 = r1.A0L
            boolean r4 = X.C42761yh.A01(r4, r9)
            if (r4 == 0) goto L_0x1041
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131898339(0x7f122fe3, float:1.9431593E38)
            java.lang.String r13 = X.C80613xU.A04(r4, r0)
            goto L_0x0030
        L_0x1041:
            boolean r4 = X.C22971Dz.A0S(r9)
            if (r4 == 0) goto L_0x1054
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131888124(0x7f1207fc, float:1.9410874E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x1054:
            if (r7 == 0) goto L_0x1073
            int r5 = r7.A03
            r4 = 1
            if (r5 != r2) goto L_0x1073
        L_0x105b:
            if (r4 == 0) goto L_0x1082
            if (r7 == 0) goto L_0x1075
            X.0zA r4 = r1.A00
            boolean r0 = r4.A07()
            if (r0 == 0) goto L_0x1075
            java.lang.Object r0 = r4.A03()
            X.1gl r0 = (X.C32171gl) r0
            java.lang.String r13 = r0.BSa(r7)
            goto L_0x0030
        L_0x1073:
            r4 = 0
            goto L_0x105b
        L_0x1075:
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131891353(0x7f121499, float:1.9417424E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x1082:
            X.2MC r0 = (X.AnonymousClass2MC) r0
            int r7 = r0.A00
            X.118 r0 = r1.A05
            android.content.Context r8 = r0.A00
            X.0zA r4 = r1.A0D
            X.0zA r6 = r1.A0F
            X.11S r0 = r1.A01
            boolean r5 = r0.A0O(r9)
            boolean r0 = X.C43381zi.A00(r10, r9)
            java.lang.Object r4 = r4.A04()
            switch(r7) {
                case 0: goto L_0x10cb;
                case 1: goto L_0x10cb;
                case 2: goto L_0x10d1;
                case 3: goto L_0x10d1;
                case 4: goto L_0x10d1;
                case 5: goto L_0x10c3;
                case 6: goto L_0x10c3;
                case 7: goto L_0x10c7;
                case 8: goto L_0x10c7;
                case 9: goto L_0x10c3;
                case 10: goto L_0x10c3;
                case 11: goto L_0x109f;
                case 12: goto L_0x109f;
                case 13: goto L_0x109f;
                case 14: goto L_0x109f;
                case 15: goto L_0x10a1;
                case 16: goto L_0x10c3;
                case 17: goto L_0x10da;
                default: goto L_0x109f;
            }
        L_0x109f:
            goto L_0x0030
        L_0x10a1:
            boolean r0 = r6.A07()
            if (r0 == 0) goto L_0x10b2
            r6.A03()
            java.lang.String r1 = "getAssistantPrivacyInitialMessageRes"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x10b2:
            if (r4 == 0) goto L_0x10c3
            X.C18070vi.A0d(r8, r3)
            r0 = 2131887317(0x7f1204d5, float:1.9409238E38)
            java.lang.String r13 = r8.getString(r0)
            X.C18070vi.A0X(r13)
            goto L_0x0030
        L_0x10c3:
            r4 = 2131891353(0x7f121499, float:1.9417424E38)
            goto L_0x10dd
        L_0x10c7:
            r4 = 2131891351(0x7f121497, float:1.941742E38)
            goto L_0x10dd
        L_0x10cb:
            if (r5 == 0) goto L_0x10d1
            r4 = 2131892102(0x7f121786, float:1.9418943E38)
            goto L_0x10dd
        L_0x10d1:
            r4 = 2131888121(0x7f1207f9, float:1.9410868E38)
            if (r0 == 0) goto L_0x10dd
            r4 = 2131888123(0x7f1207fb, float:1.9410872E38)
            goto L_0x10dd
        L_0x10da:
            r4 = 2131891352(0x7f121498, float:1.9417422E38)
        L_0x10dd:
            java.lang.String r13 = r8.getString(r4)
            goto L_0x0030
        L_0x10e3:
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131893910(0x7f121e96, float:1.942261E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x10f0:
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131893911(0x7f121e97, float:1.9422612E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x10fd:
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r8 = r0.getResources()
            if (r29 == 0) goto L_0x112c
            r7 = 2131894025(0x7f121f09, float:1.9422843E38)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            X.0vb r5 = r1.A06
            X.1Me r4 = r1.A03
            X.1M9 r0 = r1.A02
            X.C17960vV.A07(r12)
            X.1E7 r0 = r0.A0E(r12)
            X.C17960vV.A07(r0)
            java.lang.String r0 = r4.A0O(r0)
            java.lang.String r0 = r5.A0F(r0)
            r6[r3] = r0
            java.lang.String r5 = r8.getString(r7, r6)
            goto L_0x136f
        L_0x112c:
            r0 = 2131894022(0x7f121f06, float:1.9422837E38)
            java.lang.String r5 = r8.getString(r0)
            goto L_0x136f
        L_0x1135:
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            r0 = 2131896707(0x7f122983, float:1.9428283E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x1146:
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            r0 = 2131890786(0x7f121262, float:1.9416274E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x1157:
            X.2MD r0 = (X.AnonymousClass2MD) r0
            X.1M9 r4 = r1.A02
            X.1E7 r5 = r4.A0E(r9)
            X.C17960vV.A07(r5)
            X.2lf r4 = r5.A0H
            if (r4 == 0) goto L_0x116f
            X.1Me r4 = r1.A03
            boolean r4 = r4.A0i(r5)
            r8 = 1
            if (r4 == 0) goto L_0x1170
        L_0x116f:
            r8 = 0
        L_0x1170:
            X.118 r4 = r1.A05
            int r5 = r0.A00
            java.lang.String r7 = r0.A01
            X.C17960vV.A07(r7)
            android.content.Context r4 = r4.A00
            java.lang.Class<X.00c> r0 = X.C000100c.class
            java.lang.Object r0 = X.C000400h.A00(r0, r4)
            X.00c r0 = (X.C000100c) r0
            X.10E r0 = (X.AnonymousClass10E) r0
            X.00S r0 = r0.A6p
            java.lang.Object r6 = r0.get()
            X.2iq r6 = (X.C57292iq) r6
            switch(r5) {
                case 1: goto L_0x1193;
                case 2: goto L_0x119b;
                case 3: goto L_0x11a3;
                case 4: goto L_0x11ab;
                case 5: goto L_0x11b3;
                case 6: goto L_0x11bb;
                case 7: goto L_0x11c3;
                case 8: goto L_0x11cb;
                case 9: goto L_0x11d3;
                case 10: goto L_0x11da;
                case 11: goto L_0x11e1;
                case 12: goto L_0x11e8;
                case 13: goto L_0x11ef;
                case 14: goto L_0x11f6;
                case 15: goto L_0x1205;
                case 16: goto L_0x120c;
                case 17: goto L_0x121b;
                case 18: goto L_0x122a;
                case 19: goto L_0x1239;
                case 20: goto L_0x1248;
                case 21: goto L_0x1260;
                case 22: goto L_0x1268;
                case 23: goto L_0x1270;
                case 24: goto L_0x1278;
                case 25: goto L_0x1280;
                case 26: goto L_0x1288;
                case 27: goto L_0x1290;
                case 28: goto L_0x1298;
                case 29: goto L_0x12a0;
                case 30: goto L_0x12a8;
                case 31: goto L_0x12b0;
                case 32: goto L_0x12b8;
                case 33: goto L_0x12c0;
                case 34: goto L_0x12ca;
                default: goto L_0x1190;
            }
        L_0x1190:
            r13 = 0
            goto L_0x0030
        L_0x1193:
            r5 = 2131887238(0x7f120486, float:1.9409077E38)
            r4 = 2131887239(0x7f120487, float:1.940908E38)
            goto L_0x1256
        L_0x119b:
            r5 = 2131887244(0x7f12048c, float:1.940909E38)
            r4 = 2131887245(0x7f12048d, float:1.9409092E38)
            goto L_0x1256
        L_0x11a3:
            r5 = 2131887247(0x7f12048f, float:1.9409096E38)
            r4 = 2131887248(0x7f120490, float:1.9409098E38)
            goto L_0x1256
        L_0x11ab:
            r5 = 2131887249(0x7f120491, float:1.94091E38)
            r4 = 2131887250(0x7f120492, float:1.9409102E38)
            goto L_0x1256
        L_0x11b3:
            r5 = 2131887261(0x7f12049d, float:1.9409124E38)
            r4 = 2131887262(0x7f12049e, float:1.9409126E38)
            goto L_0x1256
        L_0x11bb:
            r5 = 2131887265(0x7f1204a1, float:1.9409132E38)
            r4 = 2131887266(0x7f1204a2, float:1.9409134E38)
            goto L_0x1256
        L_0x11c3:
            r5 = 2131887294(0x7f1204be, float:1.9409191E38)
            r4 = 2131887295(0x7f1204bf, float:1.9409193E38)
            goto L_0x1256
        L_0x11cb:
            r5 = 2131887292(0x7f1204bc, float:1.9409187E38)
            r4 = 2131887293(0x7f1204bd, float:1.940919E38)
            goto L_0x1256
        L_0x11d3:
            r5 = 2131887242(0x7f12048a, float:1.9409086E38)
            r4 = 2131887243(0x7f12048b, float:1.9409088E38)
            goto L_0x1256
        L_0x11da:
            r5 = 2131887290(0x7f1204ba, float:1.9409183E38)
            r4 = 2131887291(0x7f1204bb, float:1.9409185E38)
            goto L_0x1256
        L_0x11e1:
            r5 = 2131887263(0x7f12049f, float:1.9409128E38)
            r4 = 2131887264(0x7f1204a0, float:1.940913E38)
            goto L_0x1256
        L_0x11e8:
            r5 = 2131887240(0x7f120488, float:1.9409081E38)
            r4 = 2131887241(0x7f120489, float:1.9409084E38)
            goto L_0x1256
        L_0x11ef:
            r5 = 2131887288(0x7f1204b8, float:1.9409179E38)
            r4 = 2131887289(0x7f1204b9, float:1.940918E38)
            goto L_0x1256
        L_0x11f6:
            r5 = 2131887274(0x7f1204aa, float:1.940915E38)
            r4 = 2131887277(0x7f1204ad, float:1.9409157E38)
            if (r8 == 0) goto L_0x1256
            r5 = 2131887275(0x7f1204ab, float:1.9409152E38)
            r4 = 2131887276(0x7f1204ac, float:1.9409155E38)
            goto L_0x1256
        L_0x1205:
            r5 = 2131887286(0x7f1204b6, float:1.9409175E38)
            r4 = 2131887287(0x7f1204b7, float:1.9409177E38)
            goto L_0x1256
        L_0x120c:
            r5 = 2131887282(0x7f1204b2, float:1.9409167E38)
            r4 = 2131887285(0x7f1204b5, float:1.9409173E38)
            if (r8 == 0) goto L_0x1256
            r5 = 2131887283(0x7f1204b3, float:1.9409169E38)
            r4 = 2131887284(0x7f1204b4, float:1.940917E38)
            goto L_0x1256
        L_0x121b:
            r5 = 2131887234(0x7f120482, float:1.940907E38)
            r4 = 2131887237(0x7f120485, float:1.9409075E38)
            if (r8 == 0) goto L_0x1256
            r5 = 2131887235(0x7f120483, float:1.9409071E38)
            r4 = 2131887236(0x7f120484, float:1.9409073E38)
            goto L_0x1256
        L_0x122a:
            r5 = 2131887278(0x7f1204ae, float:1.9409159E38)
            r4 = 2131887281(0x7f1204b1, float:1.9409165E38)
            if (r8 == 0) goto L_0x1256
            r5 = 2131887279(0x7f1204af, float:1.940916E38)
            r4 = 2131887280(0x7f1204b0, float:1.9409163E38)
            goto L_0x1256
        L_0x1239:
            r5 = 2131887257(0x7f120499, float:1.9409116E38)
            r4 = 2131887260(0x7f12049c, float:1.9409122E38)
            if (r8 == 0) goto L_0x1256
            r5 = 2131887258(0x7f12049a, float:1.9409118E38)
            r4 = 2131887259(0x7f12049b, float:1.940912E38)
            goto L_0x1256
        L_0x1248:
            r5 = 2131887230(0x7f12047e, float:1.9409061E38)
            r4 = 2131887233(0x7f120481, float:1.9409067E38)
            if (r8 == 0) goto L_0x1256
            r5 = 2131887231(0x7f12047f, float:1.9409063E38)
            r4 = 2131887232(0x7f120480, float:1.9409065E38)
        L_0x1256:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r7
            java.lang.String r13 = r6.A00(r5, r4, r0)
            goto L_0x0030
        L_0x1260:
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131887229(0x7f12047d, float:1.940906E38)
            goto L_0x12c7
        L_0x1268:
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131887227(0x7f12047b, float:1.9409055E38)
            goto L_0x12c7
        L_0x1270:
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131887228(0x7f12047c, float:1.9409057E38)
            goto L_0x12c7
        L_0x1278:
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131887256(0x7f120498, float:1.9409114E38)
            goto L_0x12c7
        L_0x1280:
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131887255(0x7f120497, float:1.9409112E38)
            goto L_0x12c7
        L_0x1288:
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131887267(0x7f1204a3, float:1.9409136E38)
            goto L_0x12c7
        L_0x1290:
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131887246(0x7f12048e, float:1.9409094E38)
            goto L_0x12c7
        L_0x1298:
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131887271(0x7f1204a7, float:1.9409144E38)
            goto L_0x12c7
        L_0x12a0:
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131887273(0x7f1204a9, float:1.9409148E38)
            goto L_0x12c7
        L_0x12a8:
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131887254(0x7f120496, float:1.940911E38)
            goto L_0x12c7
        L_0x12b0:
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131887253(0x7f120495, float:1.9409108E38)
            goto L_0x12c7
        L_0x12b8:
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131887252(0x7f120494, float:1.9409106E38)
            goto L_0x12c7
        L_0x12c0:
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131887251(0x7f120493, float:1.9409104E38)
        L_0x12c7:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            goto L_0x12d7
        L_0x12ca:
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131887272(0x7f1204a8, float:1.9409146E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r7 = X.C27641Ww.A02(r7)
        L_0x12d7:
            r0[r3] = r7
            java.lang.String r13 = r5.getString(r4, r0)
            goto L_0x0030
        L_0x12df:
            X.2MJ r0 = (X.AnonymousClass2MJ) r0
            int r4 = r0.A00
            r0 = 0
            if (r4 <= 0) goto L_0x12e7
            r0 = 1
        L_0x12e7:
            r4 = 2131889934(0x7f120f0e, float:1.9414546E38)
            r6 = 2131889935(0x7f120f0f, float:1.9414548E38)
            if (r0 == 0) goto L_0x12f5
            r4 = 2131889936(0x7f120f10, float:1.941455E38)
            r6 = 2131889937(0x7f120f11, float:1.9414552E38)
        L_0x12f5:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x1303
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            java.lang.String r13 = r0.getString(r4)
            goto L_0x0030
        L_0x1303:
            boolean r0 = X.C22971Dz.A0e(r9)
            r4 = 2
            if (r0 == 0) goto L_0x130b
            r4 = 1
        L_0x130b:
            if (r9 == 0) goto L_0x0030
            X.1M9 r0 = r1.A02
            X.1E7 r0 = r0.A0H(r9)
            java.lang.String r5 = r1.A03(r0, r4)
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r5
            java.lang.String r13 = r4.getString(r6, r0)
            goto L_0x0030
        L_0x1325:
            X.2MA r0 = (X.AnonymousClass2MA) r0
            X.205 r5 = r0.A0v
            boolean r4 = r5.A02
            if (r4 == 0) goto L_0x1344
            X.1BI r4 = r0.A0H()
            if (r4 == 0) goto L_0x133a
            X.11S r4 = r1.A01
            r4.A0I()
            com.whatsapp.jid.PhoneUserJid r7 = r4.A0E
        L_0x133a:
            int r4 = r0.A00
            int r0 = r0.A04
            java.lang.String r13 = r1.A0M(r7, r4, r0, r2)
            goto L_0x0030
        L_0x1344:
            X.1BI r7 = r5.A00
            goto L_0x133a
        L_0x1347:
            boolean r4 = r0 instanceof X.AnonymousClass2MI
            if (r4 == 0) goto L_0x0030
            X.2MI r0 = (X.AnonymousClass2MI) r0
            boolean r5 = r0.A00
            X.1M9 r0 = r1.A02
            X.C17960vV.A07(r9)
            X.1E7 r4 = r0.A0E(r9)
            if (r4 == 0) goto L_0x0030
            X.12L r0 = r1.A0L
            boolean r0 = X.C42761yh.A00(r4, r0)
            if (r5 == 0) goto L_0x1372
            if (r0 == 0) goto L_0x139f
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131898328(0x7f122fd8, float:1.943157E38)
            java.lang.String r5 = X.C80613xU.A04(r4, r0)
        L_0x136f:
            r13 = r5
            goto L_0x0030
        L_0x1372:
            if (r0 == 0) goto L_0x1380
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131898342(0x7f122fe6, float:1.94316E38)
            java.lang.String r5 = X.C80613xU.A04(r4, r0)
            goto L_0x136f
        L_0x1380:
            boolean r0 = r4.A0E()
            if (r0 == 0) goto L_0x138e
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            r0 = 2131897295(0x7f122bcf, float:1.9429475E38)
            goto L_0x13ac
        L_0x138e:
            boolean r4 = r4.A0C()
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            r0 = 2131897297(0x7f122bd1, float:1.942948E38)
            if (r4 == 0) goto L_0x13ac
            r0 = 2131897296(0x7f122bd0, float:1.9429477E38)
            goto L_0x13ac
        L_0x139f:
            boolean r0 = r4.A0E()
            if (r0 == 0) goto L_0x13b1
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            r0 = 2131887204(0x7f120464, float:1.9409008E38)
        L_0x13ac:
            java.lang.String r5 = r5.getString(r0)
            goto L_0x136f
        L_0x13b1:
            boolean r4 = r4.A0C()
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            r0 = 2131887209(0x7f120469, float:1.9409019E38)
            if (r4 == 0) goto L_0x13ac
            r0 = 2131887206(0x7f120466, float:1.9409013E38)
            goto L_0x13ac
        L_0x13c2:
            X.1gk r5 = r1.A0Q
            java.lang.String r7 = r1.A04(r0)
            X.11S r6 = r5.A00
            X.1BI r4 = r0.A0H()
            boolean r4 = r6.A0O(r4)
            if (r4 == 0) goto L_0x13fd
            X.1M9 r0 = r5.A01
            X.1E7 r4 = r0.A0H(r9)
            boolean r0 = r4.A0F()
            if (r0 == 0) goto L_0x13ed
            X.118 r0 = r5.A03
            android.content.Context r4 = r0.A00
            r0 = 2131895642(0x7f12255a, float:1.9426123E38)
        L_0x13e7:
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x13ed:
            X.1BI r0 = r4.A0J
            boolean r0 = X.C22971Dz.A0N(r0)
            if (r0 == 0) goto L_0x1414
            X.118 r0 = r5.A03
            android.content.Context r4 = r0.A00
            r0 = 2131895643(0x7f12255b, float:1.9426125E38)
            goto L_0x13e7
        L_0x13fd:
            X.1BI r0 = r0.A0H()
            if (r0 == 0) goto L_0x1414
            X.118 r0 = r5.A03
            android.content.Context r5 = r0.A00
            r4 = 2131891241(0x7f121429, float:1.9417196E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r7
            java.lang.String r13 = r5.getString(r4, r0)
            goto L_0x0030
        L_0x1414:
            r0 = 2131891241(0x7f121429, float:1.9417196E38)
            java.lang.String r13 = X.C32161gk.A00(r9, r5, r0)
            goto L_0x0030
        L_0x141d:
            X.2MS r0 = (X.AnonymousClass2MS) r0
            int r7 = r0.A00
            int r6 = r0.A04
            X.1BI r5 = r0.A0H()
            if (r29 == 0) goto L_0x1438
            X.1MZ r0 = r1.A08
            X.C17960vV.A07(r4)
            boolean r0 = r0.A0K(r4)
            java.lang.String r13 = r1.A0M(r5, r7, r6, r0)
            goto L_0x0030
        L_0x1438:
            java.lang.String r13 = r1.A0M(r5, r7, r6, r3)
            goto L_0x0030
        L_0x143e:
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            r5 = 2131897994(0x7f122e8a, float:1.9430893E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.2MB r0 = (X.AnonymousClass2MB) r0
            java.lang.String r0 = r0.A00
            r4[r3] = r0
            java.lang.String r13 = r6.getString(r5, r4)
            goto L_0x0030
        L_0x1453:
            X.11S r5 = r1.A01
            X.1BI r4 = r0.A0H()
            boolean r5 = r5.A0O(r4)
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            if (r5 == 0) goto L_0x146d
            r0 = 2131891093(0x7f121395, float:1.9416896E38)
            if (r15 == 0) goto L_0x1b04
            r0 = 2131893516(0x7f121d0c, float:1.942181E38)
            goto L_0x1b04
        L_0x146d:
            r5 = 2131891092(0x7f121394, float:1.9416894E38)
            if (r15 == 0) goto L_0x1944
            r5 = 2131893515(0x7f121d0b, float:1.9421809E38)
            goto L_0x1944
        L_0x1477:
            X.11S r5 = r1.A01
            X.1BI r4 = r0.A0H()
            boolean r5 = r5.A0O(r4)
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            if (r5 == 0) goto L_0x1491
            r0 = 2131891095(0x7f121397, float:1.94169E38)
            if (r15 == 0) goto L_0x1b04
            r0 = 2131893518(0x7f121d0e, float:1.9421815E38)
            goto L_0x1b04
        L_0x1491:
            r5 = 2131891094(0x7f121396, float:1.9416898E38)
            if (r15 == 0) goto L_0x1944
            r5 = 2131893517(0x7f121d0d, float:1.9421813E38)
            goto L_0x1944
        L_0x149b:
            r4 = r0
            X.2Mh r4 = (X.C48392Mh) r4
            java.util.List r11 = r4.A01
            int r10 = r11.size()
            X.1BI r5 = r0.A0H()
            X.1Dw r4 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A01(r5)
            X.11S r5 = r1.A01
            boolean r4 = r5.A0O(r4)
            if (r4 == 0) goto L_0x14d8
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r8 = r0.getResources()
            r7 = 2131755513(0x7f1001f9, float:1.9141907E38)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            X.0vb r5 = r1.A06
            X.1Me r4 = r1.A03
            r0 = -1
            java.lang.String r0 = r4.A0a(r11, r0)
            java.lang.String r0 = r5.A0F(r0)
            r6[r3] = r0
            java.lang.String r13 = r8.getQuantityString(r7, r10, r6)
            goto L_0x0030
        L_0x14d8:
            if (r10 != r2) goto L_0x14fb
            java.lang.Object r4 = r11.get(r3)
            X.1BI r4 = (X.AnonymousClass1BI) r4
            boolean r4 = r5.A0O(r4)
            if (r4 == 0) goto L_0x14fb
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            r5 = 2131891495(0x7f121527, float:1.9417712E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r1.A04(r0)
            r4[r3] = r0
            java.lang.String r13 = r6.getString(r5, r4)
            goto L_0x0030
        L_0x14fb:
            X.118 r4 = r1.A05
            android.content.Context r4 = r4.A00
            android.content.res.Resources r9 = r4.getResources()
            r8 = 2131755196(0x7f1000bc, float:1.9141264E38)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            X.0vb r6 = r1.A06
            X.1Me r5 = r1.A03
            r4 = -1
            java.lang.String r4 = r5.A0a(r11, r4)
            java.lang.String r4 = r6.A0F(r4)
            r7[r3] = r4
            java.lang.String r0 = r1.A04(r0)
            r7[r2] = r0
            java.lang.String r13 = r9.getQuantityString(r8, r10, r7)
            goto L_0x0030
        L_0x1523:
            r9 = 2131755182(0x7f1000ae, float:1.9141236E38)
            r4 = r0
            X.2Mh r4 = (X.C48392Mh) r4
            java.util.List r10 = r4.A01
            X.11S r4 = r1.A01
            X.1BI r0 = r0.A0H()
            boolean r0 = r4.A0O(r0)
            if (r0 == 0) goto L_0x0030
            X.118 r0 = r1.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r8 = r0.getResources()
            int r7 = r10.size()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            X.0vb r5 = r1.A06
            X.1Me r4 = r1.A03
            r0 = -1
            java.lang.String r0 = r4.A0a(r10, r0)
            java.lang.String r0 = r5.A0F(r0)
            r6[r3] = r0
            java.lang.String r13 = r8.getQuantityString(r9, r7, r6)
            goto L_0x0030
        L_0x155a:
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131897992(0x7f122e88, float:1.943089E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x1567:
            X.00H r4 = r1.A0U
            java.lang.Object r7 = r4.get()
            X.2iq r7 = (X.C57292iq) r7
            r6 = 2131897998(0x7f122e8e, float:1.9430901E38)
            r5 = 2131897999(0x7f122e8f, float:1.9430903E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.2MB r0 = (X.AnonymousClass2MB) r0
            java.lang.String r0 = r0.A00
            r4[r3] = r0
            java.lang.String r13 = r7.A00(r6, r5, r4)
            goto L_0x0030
        L_0x1583:
            X.00H r4 = r1.A0U
            java.lang.Object r7 = r4.get()
            X.2iq r7 = (X.C57292iq) r7
            r6 = 2131898003(0x7f122e93, float:1.9430911E38)
            r5 = 2131898004(0x7f122e94, float:1.9430913E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.2MB r0 = (X.AnonymousClass2MB) r0
            java.lang.String r0 = r0.A00
            r4[r3] = r0
            java.lang.String r13 = r7.A00(r6, r5, r4)
            goto L_0x0030
        L_0x159f:
            X.00H r4 = r1.A0U
            java.lang.Object r7 = r4.get()
            X.2iq r7 = (X.C57292iq) r7
            r6 = 2131887269(0x7f1204a5, float:1.940914E38)
            r5 = 2131887270(0x7f1204a6, float:1.9409142E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.2MB r0 = (X.AnonymousClass2MB) r0
            java.lang.String r0 = r0.A00
            r4[r3] = r0
            java.lang.String r13 = r7.A00(r6, r5, r4)
            goto L_0x0030
        L_0x15bb:
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131887268(0x7f1204a4, float:1.9409138E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x15c8:
            X.1R5 r11 = r1.A0N
            X.2MH r0 = (X.AnonymousClass2MH) r0
            com.whatsapp.jid.UserJid r10 = r0.A01
            com.whatsapp.jid.UserJid r9 = r0.A00
            if (r10 == 0) goto L_0x1625
            if (r9 == 0) goto L_0x1625
            java.lang.String r4 = r0.A03
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x161c
            X.118 r0 = r11.A04
            android.content.Context r4 = r0.A00
            r0 = 2131897312(0x7f122be0, float:1.942951E38)
            java.lang.String r12 = r4.getString(r0)
        L_0x15e7:
            X.11S r0 = r11.A00
            boolean r4 = r0.A0O(r10)
            X.118 r0 = r11.A04
            android.content.Context r8 = r0.A00
            if (r4 == 0) goto L_0x160e
            r7 = 2131894003(0x7f121ef3, float:1.9422798E38)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            X.1Me r4 = r11.A02
            X.1M9 r0 = r11.A01
            X.1E7 r0 = r0.A0H(r9)
        L_0x1600:
            java.lang.String r0 = r4.A0I(r0)
            r5[r3] = r0
            r5[r2] = r12
            java.lang.String r13 = r8.getString(r7, r5)
            goto L_0x0030
        L_0x160e:
            r7 = 2131894004(0x7f121ef4, float:1.94228E38)
            java.lang.Object[] r5 = new java.lang.Object[r6]
            X.1Me r4 = r11.A02
            X.1M9 r0 = r11.A01
            X.1E7 r0 = r0.A0H(r10)
            goto L_0x1600
        L_0x161c:
            X.1R2 r4 = r11.A0B
            java.lang.String r0 = r0.A03
            java.lang.String r12 = r4.A0e(r0)
            goto L_0x15e7
        L_0x1625:
            X.1QE r4 = r11.A0A
            java.lang.String r0 = "failed to retrieve request sender jid or receiver jid"
            r4.A05(r0)
            goto L_0x0030
        L_0x162e:
            X.118 r4 = r1.A05
            android.content.Context r8 = r4.A00
            r7 = 2131893909(0x7f121e95, float:1.9422608E38)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            X.1Me r5 = r1.A03
            X.1M9 r4 = r1.A02
            X.1BI r0 = r0.A0H()
            X.C17960vV.A07(r0)
            X.1E7 r0 = r4.A0H(r0)
            java.lang.String r0 = r5.A0I(r0)
            r6[r3] = r0
            java.lang.String r13 = r8.getString(r7, r6)
            goto L_0x0030
        L_0x1652:
            X.118 r0 = r1.A05
            android.content.Context r8 = r0.A00
            r7 = 2131894025(0x7f121f09, float:1.9422843E38)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            X.0vb r5 = r1.A06
            X.1Me r4 = r1.A03
            X.1M9 r0 = r1.A02
            X.C17960vV.A07(r12)
            X.1E7 r0 = r0.A0E(r12)
            X.C17960vV.A07(r0)
            java.lang.String r0 = r4.A0O(r0)
            java.lang.String r0 = r5.A0F(r0)
            r6[r3] = r0
            java.lang.String r13 = r8.getString(r7, r6)
            goto L_0x0030
        L_0x167b:
            X.118 r0 = r1.A05
            android.content.Context r8 = r0.A00
            r7 = 2131894056(0x7f121f28, float:1.9422906E38)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            X.0vb r5 = r1.A06
            X.1Me r4 = r1.A03
            X.1M9 r0 = r1.A02
            X.C17960vV.A07(r12)
            X.1E7 r0 = r0.A0E(r12)
            X.C17960vV.A07(r0)
            java.lang.String r0 = r4.A0O(r0)
            java.lang.String r0 = r5.A0F(r0)
            r6[r3] = r0
            java.lang.String r13 = r8.getString(r7, r6)
            goto L_0x0030
        L_0x16a4:
            X.1R5 r9 = r1.A0N
            X.2Mi r0 = (X.C48402Mi) r0
            java.lang.String r4 = r0.A01
            if (r4 != 0) goto L_0x16f9
            r7 = 1
        L_0x16ad:
            java.lang.String r4 = r0.A03
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x16f0
            X.118 r4 = r9.A04
            android.content.Context r5 = r4.A00
            r4 = 2131897312(0x7f122be0, float:1.942951E38)
            java.lang.String r12 = r5.getString(r4)
        L_0x16c0:
            java.lang.String r8 = r0.A03
            X.1R2 r11 = r9.A0B
            int r0 = r0.A00
            long r4 = (long) r0
            java.lang.String r11 = r11.A0Q(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            boolean r4 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x170d
            X.118 r0 = r9.A04
            android.content.Context r0 = r0.A00
            android.content.res.Resources r5 = r0.getResources()
            if (r4 != 0) goto L_0x16fe
            r4 = 2131894086(0x7f121f46, float:1.9422967E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r3] = r8
            r0[r2] = r12
            r0[r6] = r11
            java.lang.String r13 = r5.getString(r4, r0)
            goto L_0x0030
        L_0x16f0:
            X.1R2 r5 = r9.A0B
            java.lang.String r4 = r0.A03
            java.lang.String r12 = r5.A0e(r4)
            goto L_0x16c0
        L_0x16f9:
            int r7 = X.C20099A7c.A01(r4, r2)
            goto L_0x16ad
        L_0x16fe:
            r4 = 2131755335(0x7f100147, float:1.9141546E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r8
            r0[r2] = r12
            java.lang.String r13 = r5.getQuantityString(r4, r7, r0)
            goto L_0x0030
        L_0x170d:
            X.118 r0 = r9.A04
            android.content.Context r0 = r0.A00
            android.content.res.Resources r5 = r0.getResources()
            if (r4 != 0) goto L_0x1726
            r4 = 2131894085(0x7f121f45, float:1.9422965E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r3] = r12
            r0[r2] = r11
            java.lang.String r13 = r5.getString(r4, r0)
            goto L_0x0030
        L_0x1726:
            r4 = 2131755332(0x7f100144, float:1.914154E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r12
            java.lang.String r13 = r5.getQuantityString(r4, r7, r0)
            goto L_0x0030
        L_0x1733:
            X.1R5 r7 = r1.A0N
            X.2Mj r0 = (X.C48412Mj) r0
            X.205 r12 = r0.A02
            X.C17960vV.A07(r12)
            java.lang.String r15 = r0.A02
            java.lang.String r8 = r0.A04
            r4 = 0
            long r24 = X.C20099A7c.A04(r8, r4)
            java.lang.String r8 = r0.A01
            X.C17960vV.A07(r8)
            java.lang.String r13 = ";"
            java.lang.String[] r9 = r8.split(r13)
            int r11 = r9.length
            r8 = 5
            if (r11 < r8) goto L_0x17c8
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x17c8
            java.lang.String[] r0 = r0.split(r13)
            X.1R2 r11 = r7.A0B
            boolean r8 = r12.A02
            r16 = r9[r10]
            r10 = 4
            r17 = r9[r10]
            r6 = r9[r6]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r19 = r6.intValue()
            r6 = r9[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r20 = r6.intValue()
            long r22 = X.C20099A7c.A04(r15, r4)
            int r5 = r0.length
            if (r5 == 0) goto L_0x17b7
            r4 = r0[r3]
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x17b7
            r18 = r0[r2]
        L_0x178b:
            r4 = r0[r3]
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x17c5
            r0 = r0[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r21 = r0.intValue()
        L_0x179d:
            r26 = r8
            r15 = r11
            java.lang.String r13 = r15.A0f(r16, r17, r18, r19, r20, r21, r22, r24, r26)
        L_0x17a4:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x0030
            X.118 r0 = r7.A04
            android.content.Context r4 = r0.A00
            r0 = 2131894148(0x7f121f84, float:1.9423093E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x17b7:
            X.118 r4 = r7.A04
            android.content.Context r6 = r4.A00
            r4 = 2131897312(0x7f122be0, float:1.942951E38)
            java.lang.String r18 = r6.getString(r4)
            if (r5 == 0) goto L_0x17c5
            goto L_0x178b
        L_0x17c5:
            r21 = 1
            goto L_0x179d
        L_0x17c8:
            r13 = 0
            goto L_0x17a4
        L_0x17ca:
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            r5 = 2131898005(0x7f122e95, float:1.9430916E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.2MB r0 = (X.AnonymousClass2MB) r0
            java.lang.String r0 = r0.A00
            r4[r3] = r0
            java.lang.String r13 = r6.getString(r5, r4)
            goto L_0x0030
        L_0x17df:
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            r5 = 2131898013(0x7f122e9d, float:1.9430932E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.2MB r0 = (X.AnonymousClass2MB) r0
            java.lang.String r0 = r0.A00
            r4[r3] = r0
            java.lang.String r13 = r6.getString(r5, r4)
            goto L_0x0030
        L_0x17f4:
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131898009(0x7f122e99, float:1.9430924E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x1801:
            X.118 r0 = r1.A05
            android.content.Context r6 = r0.A00
            r0 = 2131890306(0x7f121082, float:1.94153E38)
            if (r15 == 0) goto L_0x1b04
            r0 = 2131890307(0x7f121083, float:1.9415302E38)
            goto L_0x1b04
        L_0x180f:
            X.11S r5 = r1.A01
            X.1BI r4 = r0.A0H()
            boolean r5 = r5.A0O(r4)
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            if (r5 == 0) goto L_0x1828
            r0 = 2131890886(0x7f1212c6, float:1.9416476E38)
            java.lang.String r13 = r6.getString(r0)
            goto L_0x0030
        L_0x1828:
            r5 = 2131890885(0x7f1212c5, float:1.9416474E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r1.A04(r0)
            r4[r3] = r0
            java.lang.String r13 = r6.getString(r5, r4)
            goto L_0x0030
        L_0x1839:
            X.11S r5 = r1.A01
            X.1BI r4 = r0.A0H()
            boolean r5 = r5.A0O(r4)
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            if (r5 == 0) goto L_0x1852
            r0 = 2131890888(0x7f1212c8, float:1.941648E38)
            java.lang.String r13 = r6.getString(r0)
            goto L_0x0030
        L_0x1852:
            r5 = 2131890887(0x7f1212c7, float:1.9416478E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r1.A04(r0)
            r4[r3] = r0
            java.lang.String r13 = r6.getString(r5, r4)
            goto L_0x0030
        L_0x1863:
            X.11S r5 = r1.A01
            X.1BI r4 = r0.A0H()
            boolean r5 = r5.A0O(r4)
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            if (r5 == 0) goto L_0x187d
            r0 = 2131891136(0x7f1213c0, float:1.9416984E38)
            if (r15 == 0) goto L_0x1b04
            r0 = 2131893524(0x7f121d14, float:1.9421827E38)
            goto L_0x1b04
        L_0x187d:
            r5 = 2131891135(0x7f1213bf, float:1.9416981E38)
            if (r15 == 0) goto L_0x1944
            r5 = 2131893523(0x7f121d13, float:1.9421825E38)
            goto L_0x1944
        L_0x1887:
            X.11S r5 = r1.A01
            X.1BI r4 = r0.A0H()
            boolean r5 = r5.A0O(r4)
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            if (r5 == 0) goto L_0x18a1
            r0 = 2131891138(0x7f1213c2, float:1.9416988E38)
            if (r15 == 0) goto L_0x1b04
            r0 = 2131893526(0x7f121d16, float:1.9421831E38)
            goto L_0x1b04
        L_0x18a1:
            r5 = 2131891137(0x7f1213c1, float:1.9416986E38)
            if (r15 == 0) goto L_0x1944
            r5 = 2131893525(0x7f121d15, float:1.942183E38)
            goto L_0x1944
        L_0x18ab:
            X.2MN r0 = (X.AnonymousClass2MN) r0
            java.lang.String r13 = r1.A0E(r0, r3)
            goto L_0x0030
        L_0x18b3:
            java.lang.String r13 = r1.A0B(r0, r10, r11)
            goto L_0x0030
        L_0x18b9:
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131897989(0x7f122e85, float:1.9430883E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x18c6:
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            r5 = 2131897995(0x7f122e8b, float:1.9430895E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.2MB r0 = (X.AnonymousClass2MB) r0
            java.lang.String r0 = r0.A00
            r4[r3] = r0
            java.lang.String r13 = r6.getString(r5, r4)
            goto L_0x0030
        L_0x18db:
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            r5 = 2131898000(0x7f122e90, float:1.9430905E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.2MB r0 = (X.AnonymousClass2MB) r0
            java.lang.String r0 = r0.A00
            r4[r3] = r0
            java.lang.String r13 = r6.getString(r5, r4)
            goto L_0x0030
        L_0x18f0:
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            r5 = 2131898007(0x7f122e97, float:1.943092E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.2MB r0 = (X.AnonymousClass2MB) r0
            java.lang.String r0 = r0.A00
            r4[r3] = r0
            java.lang.String r13 = r6.getString(r5, r4)
            goto L_0x0030
        L_0x1905:
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131898011(0x7f122e9b, float:1.9430928E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x1912:
            X.1BI r5 = r0.A0H()
            if (r5 != 0) goto L_0x1926
            X.118 r0 = r1.A05
            android.content.Context r6 = r0.A00
            r0 = 2131891478(0x7f121516, float:1.9417677E38)
            if (r29 == 0) goto L_0x1b04
            r0 = 2131891477(0x7f121515, float:1.9417675E38)
            goto L_0x1b04
        L_0x1926:
            X.11S r4 = r1.A01
            boolean r5 = r4.A0O(r5)
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            if (r5 == 0) goto L_0x193c
            r0 = 2131891482(0x7f12151a, float:1.9417685E38)
            if (r29 == 0) goto L_0x1b04
            r0 = 2131891481(0x7f121519, float:1.9417683E38)
            goto L_0x1b04
        L_0x193c:
            r5 = 2131891480(0x7f121518, float:1.9417681E38)
            if (r29 == 0) goto L_0x1944
            r5 = 2131891479(0x7f121517, float:1.941768E38)
        L_0x1944:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r1.A04(r0)
            r4[r3] = r0
            java.lang.String r13 = r6.getString(r5, r4)
            goto L_0x0030
        L_0x1952:
            X.00H r4 = r1.A0T
            java.lang.Object r4 = r4.get()
            X.4Zd r4 = (X.C88304Zd) r4
            boolean r4 = r4.A04(r0)
            if (r4 != 0) goto L_0x1a82
            r4 = r0
            X.2Mh r4 = (X.C48392Mh) r4
            java.util.List r7 = r4.A01
            X.0vb r6 = r1.A06
            X.1Me r5 = r1.A03
            r4 = -1
            java.lang.String r4 = r5.A0a(r7, r4)
            java.lang.String r4 = r6.A0F(r4)
            X.2dZ r6 = r1.A0J(r0, r4, r11)
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            int r4 = r6.A00
            java.lang.Object[] r0 = r6.A02
            java.lang.String r13 = r5.getString(r4, r0)
            goto L_0x0030
        L_0x1984:
            r8 = 2131891241(0x7f121429, float:1.9417196E38)
            X.1BI r5 = r0.A0H()
            X.118 r4 = r1.A05
            android.content.Context r7 = r4.A00
            java.lang.Object[] r6 = new java.lang.Object[r2]
            if (r5 != 0) goto L_0x19b0
            X.1M9 r0 = r1.A02
            X.C17960vV.A07(r9)
            X.1E7 r5 = r0.A0H(r9)
            boolean r4 = X.C22971Dz.A0e(r9)
            r0 = 2
            if (r4 == 0) goto L_0x19a4
            r0 = 1
        L_0x19a4:
            java.lang.String r0 = r1.A03(r5, r0)
            r6[r3] = r0
            java.lang.String r13 = r7.getString(r8, r6)
            goto L_0x0030
        L_0x19b0:
            java.lang.String r0 = r1.A04(r0)
            r6[r3] = r0
            java.lang.String r13 = r7.getString(r8, r6)
            goto L_0x0030
        L_0x19bc:
            X.1M9 r0 = r1.A02
            X.C17960vV.A07(r9)
            X.1E7 r0 = r0.A0E(r9)
            if (r0 == 0) goto L_0x19d8
            boolean r0 = r0.A0j
            if (r0 == 0) goto L_0x19d8
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            r0 = 2131887924(0x7f120734, float:1.9410469E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x19d8:
            X.118 r0 = r1.A05
            android.content.Context r6 = r0.A00
            r0 = 2131890961(0x7f121311, float:1.9416629E38)
            if (r15 == 0) goto L_0x1b04
            r0 = 2131893508(0x7f121d04, float:1.9421795E38)
            goto L_0x1b04
        L_0x19e6:
            r6 = 2131891100(0x7f12139c, float:1.941691E38)
            r5 = 2131755178(0x7f1000aa, float:1.9141228E38)
            r4 = 2131755177(0x7f1000a9, float:1.9141226E38)
            java.lang.String r13 = r1.A08(r0, r6, r5, r4)
            goto L_0x0030
        L_0x19f5:
            r6 = 2131891107(0x7f1213a3, float:1.9416925E38)
            r5 = 2131755180(0x7f1000ac, float:1.9141232E38)
            r4 = 2131755179(0x7f1000ab, float:1.914123E38)
            java.lang.String r13 = r1.A08(r0, r6, r5, r4)
            goto L_0x0030
        L_0x1a04:
            java.lang.String r13 = r1.A0C(r0, r3, r11)
            goto L_0x0030
        L_0x1a0a:
            X.2Mh r0 = (X.C48392Mh) r0
            java.util.List r12 = r0.A01
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            X.C17960vV.A07(r0)
            X.1Me r10 = r1.A03
            int r9 = r10.A0B(r0)
            if (r29 != 0) goto L_0x1a50
            int r0 = r12.size()
            if (r0 <= r6) goto L_0x1a50
            X.118 r0 = r1.A05
            android.content.Context r8 = r0.A00
            r7 = 2131891105(0x7f1213a1, float:1.941692E38)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            X.0vb r4 = r1.A06
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            boolean r19 = X.C24921Me.A05(r10, r12, r0)
            r15 = r10
            r16 = r0
            r17 = r6
            r18 = r9
            r20 = r2
            java.lang.String r0 = r15.A0b(r16, r17, r18, r19, r20)
        L_0x1a44:
            java.lang.String r0 = r4.A0F(r0)
            r5[r3] = r0
            java.lang.String r13 = r8.getString(r7, r5)
            goto L_0x0030
        L_0x1a50:
            X.118 r0 = r1.A05
            android.content.Context r8 = r0.A00
            r7 = 2131891105(0x7f1213a1, float:1.941692E38)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            X.0vb r4 = r1.A06
            java.lang.String r0 = r10.A0a(r12, r9)
            goto L_0x1a44
        L_0x1a60:
            X.00H r4 = r1.A0T
            java.lang.Object r4 = r4.get()
            X.4Zd r4 = (X.C88304Zd) r4
            boolean r4 = r4.A02(r0)
            if (r4 != 0) goto L_0x1a82
            java.lang.String r13 = r1.A0C(r0, r2, r11)
            goto L_0x0030
        L_0x1a74:
            X.00H r4 = r1.A0T
            java.lang.Object r4 = r4.get()
            X.4Zd r4 = (X.C88304Zd) r4
            boolean r4 = r4.A03(r0)
            if (r4 == 0) goto L_0x1a88
        L_0x1a82:
            java.lang.String r13 = r1.A0R(r0)
            goto L_0x0030
        L_0x1a88:
            X.2dZ r6 = r1.A0K(r0, r11)
            X.118 r0 = r1.A05
            android.content.Context r5 = r0.A00
            int r4 = r6.A00
            java.lang.Object[] r0 = r6.A02
            java.lang.String r13 = r5.getString(r4, r0)
            goto L_0x0030
        L_0x1a9a:
            X.2MN r0 = (X.AnonymousClass2MN) r0
            java.lang.String r13 = r1.A0E(r0, r2)
            goto L_0x0030
        L_0x1aa2:
            r4 = r0
            X.2Mh r4 = (X.C48392Mh) r4
            java.util.List r9 = r4.A01
            java.lang.String r4 = r0.A0P()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            X.118 r4 = r1.A05
            android.content.Context r4 = r4.A00
            android.content.res.Resources r8 = r4.getResources()
            if (r5 == 0) goto L_0x1ad2
            r6 = 2131755512(0x7f1001f8, float:1.9141905E38)
            int r5 = r9.size()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r0 = r9.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r3] = r0
            java.lang.String r13 = r8.getQuantityString(r6, r5, r4)
            goto L_0x0030
        L_0x1ad2:
            r7 = 2131755511(0x7f1001f7, float:1.9141903E38)
            int r5 = r9.size()
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r0 = r0.A0P()
            r4[r3] = r0
            int r0 = r9.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r2] = r0
            java.lang.String r13 = r8.getQuantityString(r7, r5, r4)
            goto L_0x0030
        L_0x1af1:
            if (r9 == 0) goto L_0x1b13
            X.1M9 r0 = r1.A02
            X.1E7 r0 = r0.A0H(r9)
            boolean r4 = r0.A0j
        L_0x1afb:
            X.118 r0 = r1.A05
            android.content.Context r6 = r0.A00
            if (r4 == 0) goto L_0x1b0a
            r0 = 2131887928(0x7f120738, float:1.9410477E38)
        L_0x1b04:
            java.lang.String r13 = r6.getString(r0)
            goto L_0x0030
        L_0x1b0a:
            r0 = 2131887929(0x7f120739, float:1.9410479E38)
            if (r15 == 0) goto L_0x1b04
            r0 = 2131887930(0x7f12073a, float:1.941048E38)
            goto L_0x1b04
        L_0x1b13:
            r4 = 0
            goto L_0x1afb
        L_0x1b15:
            r6 = 2131891729(0x7f121611, float:1.9418186E38)
            r5 = 2131891108(0x7f1213a4, float:1.9416927E38)
            r4 = 2131755181(0x7f1000ad, float:1.9141234E38)
            java.lang.String r13 = r1.A07(r0, r6, r5, r4)
            goto L_0x0030
        L_0x1b24:
            r7 = r0
            X.2MP r7 = (X.AnonymousClass2MP) r7
            X.1BI r5 = r0.A0H()
            if (r5 == 0) goto L_0x0030
            X.11S r4 = r1.A01
            boolean r6 = r4.A0O(r5)
            java.lang.String r4 = r7.A18()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x1b55
            X.118 r0 = r1.A05
            android.content.Context r4 = r0.A00
            if (r5 == 0) goto L_0x1b4c
            r0 = 2131894550(0x7f122116, float:1.9423908E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x1b4c:
            r0 = 2131894541(0x7f12210d, float:1.942389E38)
            java.lang.String r13 = r4.getString(r0)
            goto L_0x0030
        L_0x1b55:
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            if (r5 == 0) goto L_0x1b6c
            r5 = 2131894549(0x7f122115, float:1.9423906E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r1.A04(r0)
            r4[r3] = r0
            java.lang.String r13 = r6.getString(r5, r4)
            goto L_0x0030
        L_0x1b6c:
            r5 = 2131894540(0x7f12210c, float:1.9423888E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r1.A04(r0)
            r4[r3] = r0
            java.lang.String r13 = r6.getString(r5, r4)
            goto L_0x0030
        L_0x1b7d:
            X.11S r5 = r1.A01
            X.1BI r4 = r0.A0H()
            boolean r5 = r5.A0O(r4)
            X.118 r4 = r1.A05
            android.content.Context r6 = r4.A00
            if (r5 == 0) goto L_0x1b96
            r0 = 2131891106(0x7f1213a2, float:1.9416923E38)
            java.lang.String r13 = r6.getString(r0)
            goto L_0x0030
        L_0x1b96:
            r5 = 2131891105(0x7f1213a1, float:1.941692E38)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r0 = r1.A04(r0)
            r4[r3] = r0
            java.lang.String r13 = r6.getString(r5, r4)
            goto L_0x0030
        L_0x1ba7:
            r6 = 2131891728(0x7f121610, float:1.9418184E38)
            r5 = 2131891097(0x7f121399, float:1.9416904E38)
            r4 = 2131755176(0x7f1000a8, float:1.9141224E38)
            java.lang.String r13 = r1.A07(r0, r6, r5, r4)
            goto L_0x0030
        L_0x1bb6:
            java.lang.String r4 = r0.A0P()
            r8 = 0
            if (r4 == 0) goto L_0x1bc7
            java.lang.String r5 = r0.A0P()
            java.lang.String r4 = "\n"
            java.lang.String[] r7 = r5.split(r4)
        L_0x1bc7:
            boolean r4 = r0 instanceof X.AnonymousClass98A
            if (r4 == 0) goto L_0x1bd0
            r4 = r0
            X.98A r4 = (X.AnonymousClass98A) r4
            java.lang.String r8 = r4.A01
        L_0x1bd0:
            java.lang.String r5 = "\""
            if (r7 == 0) goto L_0x1c6b
            int r4 = r7.length
            if (r4 != r6) goto L_0x1c6b
            X.1BI r4 = r0.A0H()
            if (r4 == 0) goto L_0x1bf3
            r11 = r7[r3]
            X.1Dv r4 = X.AnonymousClass1BI.A00
            X.1BI r4 = r4.A02(r11)
            if (r4 == 0) goto L_0x1c6b
            r4 = r7[r2]
            int r11 = r4.lastIndexOf(r5)
            int r4 = r4.indexOf(r5)
            if (r11 <= r4) goto L_0x1c6b
        L_0x1bf3:
            r8 = r7[r3]
            X.1Dv r4 = X.AnonymousClass1BI.A00
            X.1BI r8 = r4.A02(r8)
            if (r8 == 0) goto L_0x1c66
            boolean r4 = X.C22971Dz.A0e(r9)
            r9 = 2
            if (r4 == 0) goto L_0x1c05
            r9 = 1
        L_0x1c05:
            X.1M9 r4 = r1.A02
            X.1E7 r4 = r4.A0H(r8)
            java.lang.String r12 = r1.A03(r4, r9)
        L_0x1c0f:
            r4 = r7[r2]
            int r11 = r4.indexOf(r5)
            int r10 = r4.lastIndexOf(r5)
            if (r10 > r11) goto L_0x1c45
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = "divider_row/rr="
            r5.append(r4)
            X.1BI r0 = r0.A0H()
            r5.append(r0)
            java.lang.String r0 = " jid="
            r5.append(r0)
            r5.append(r8)
            java.lang.String r0 = " s="
            r5.append(r0)
            r0 = r7[r2]
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x1c45:
            X.118 r0 = r1.A05
            android.content.Context r9 = r0.A00
            r8 = 2131891083(0x7f12138b, float:1.9416876E38)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r12
            X.0vb r5 = r1.A06
            r4 = r7[r2]
            int r0 = r11 + 1
            java.lang.String r0 = r4.substring(r0, r10)
            java.lang.String r0 = r5.A0F(r0)
            r6[r2] = r0
            java.lang.String r13 = r9.getString(r8, r6)
            goto L_0x0030
        L_0x1c66:
            java.lang.String r12 = r1.A04(r0)
            goto L_0x1c0f
        L_0x1c6b:
            X.11S r7 = r1.A01
            X.1BI r4 = r0.A0H()
            boolean r4 = r7.A0O(r4)
            if (r4 != 0) goto L_0x1ca4
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            X.118 r4 = r1.A05
            android.content.Context r7 = r4.A00
            if (r5 != 0) goto L_0x1d09
            r11 = 2131891084(0x7f12138c, float:1.9416878E38)
            java.lang.Object[] r9 = new java.lang.Object[r10]
            java.lang.String r4 = r1.A04(r0)
            r9[r3] = r4
            X.0vb r5 = r1.A06
            java.lang.String r4 = r5.A0F(r8)
            r9[r2] = r4
            java.lang.String r0 = r0.A0P()
            java.lang.String r0 = r5.A0F(r0)
            r9[r6] = r0
            java.lang.String r13 = r7.getString(r11, r9)
            goto L_0x0030
        L_0x1ca4:
            java.lang.String r4 = r0.A0P()
            X.C17960vV.A07(r4)
            int r7 = r4.indexOf(r5)
            java.lang.String r4 = r0.A0P()
            int r5 = r4.lastIndexOf(r5)
            if (r7 != 0) goto L_0x1ce5
            java.lang.String r4 = r0.A0P()
            int r4 = r4.length()
            int r4 = r4 - r2
            if (r5 != r4) goto L_0x1ce5
            if (r7 == r5) goto L_0x1ce5
            java.lang.String r0 = r0.A0P()
            java.lang.String r8 = r0.substring(r2, r5)
            X.118 r0 = r1.A05
            android.content.Context r7 = r0.A00
            r6 = 2131891085(0x7f12138d, float:1.941688E38)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            X.0vb r4 = r1.A06
        L_0x1cd9:
            java.lang.String r0 = r4.A0F(r8)
            r5[r3] = r0
            java.lang.String r13 = r7.getString(r6, r5)
            goto L_0x0030
        L_0x1ce5:
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            X.118 r4 = r1.A05
            android.content.Context r7 = r4.A00
            if (r5 != 0) goto L_0x1cfd
            r9 = 2131891086(0x7f12138e, float:1.9416882E38)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            X.0vb r5 = r1.A06
            java.lang.String r4 = r5.A0F(r8)
            r6[r3] = r4
            goto L_0x1d16
        L_0x1cfd:
            r6 = 2131891085(0x7f12138d, float:1.941688E38)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            X.0vb r4 = r1.A06
            java.lang.String r8 = r0.A0P()
            goto L_0x1cd9
        L_0x1d09:
            r9 = 2131891083(0x7f12138b, float:1.9416876E38)
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r4 = r1.A04(r0)
            r6[r3] = r4
            X.0vb r5 = r1.A06
        L_0x1d16:
            java.lang.String r0 = r0.A0P()
            java.lang.String r0 = r5.A0F(r0)
            r6[r2] = r0
            java.lang.String r13 = r7.getString(r9, r6)
            goto L_0x0030
        L_0x1d26:
            boolean r1 = r0.A17()
            if (r1 == 0) goto L_0x1d32
            X.1BI r12 = r0.A0H()
            goto L_0x000d
        L_0x1d32:
            r12 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32191gn.A0S(X.20i, boolean):java.lang.String");
    }
}
