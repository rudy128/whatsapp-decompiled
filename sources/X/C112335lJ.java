package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5lJ  reason: invalid class name and case insensitive filesystem */
public class C112335lJ extends C38391rD {
    public AnonymousClass6RN A00 = AnonymousClass6RN.ALL;
    public C128726ga A01;
    public C128726ga A02;
    public C128736gb A03;
    public String A04;
    public List A05 = AnonymousClass000.A13();
    public List A06;
    public boolean A07;
    public boolean A08;
    public C113475n9 A09;
    public String A0A;
    public final AnonymousClass1KB A0B;
    public final C112085ku A0C;
    public final C1598085y A0D;
    public final Runnable A0E = AnonymousClass7RI.A00(this, 39);
    public final boolean A0F;
    public final int A0G;
    public final LinearLayoutManager A0H;
    public final AnonymousClass190 A0I;
    public final AnonymousClass18O A0J;
    public final C72043Kk A0K;
    public final AnonymousClass1M9 A0L;
    public final C24921Me A0M;
    public final C37451pZ A0N;
    public final C18000vb A0O;
    public final C18030ve A0P;
    public final AnonymousClass18K A0Q;
    public final AnonymousClass1LU A0R;
    public final C41731wy A0S;
    public final String A0T;
    public final LinkedHashMap A0U;
    public final boolean A0V;
    public final boolean A0W;

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        if (i == 1) {
            C113475n9 r1 = this.A09;
            if (r1 != null) {
                return r1;
            }
            C113475n9 r12 = new C113475n9(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131627143), this.A0I, this.A0O);
            this.A09 = r12;
            return r12;
        } else if (i == 2) {
            List list = C42011xT.A0I;
            return new C42011xT(AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131627138, false));
        } else if (i == 3) {
            AnonymousClass18K r4 = this.A0Q;
            return new C113445n6(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131627132), this.A0O, r4, this.A0W);
        } else if (i == 4) {
            C18030ve r13 = this.A0P;
            C18000vb r42 = this.A0O;
            List list2 = C42011xT.A0I;
            boolean A052 = AnonymousClass1J8.A05(r13);
            int i2 = 2131627131;
            if (A052) {
                i2 = 2131627597;
            }
            View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(i2, viewGroup, false);
            if (inflate instanceof WDSSectionHeader) {
                C18000vb.A00(r42);
                inflate.setPadding(viewGroup.getResources().getDimensionPixelSize(2131169533), 0, AnonymousClass3Ma.A02(viewGroup, 2131169533), 0);
            }
            return new C113175mf(inflate);
        } else if (i == 10) {
            C112085ku r3 = this.A0C;
            List list3 = C42011xT.A0I;
            return new C113165me(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131627129, C18070vi.A15(viewGroup, r3)), r3);
        } else if (i == 6) {
            return new C113285mq(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131627128), this.A0O);
        } else if (i == 7) {
            AnonymousClass66J r5 = new AnonymousClass66J(AnonymousClass3MY.A0B(viewGroup).inflate(2131626823, viewGroup, false));
            r5.A0H(0, 2131895498, false);
            return r5;
        } else if (i == 8) {
            String str = this.A0A;
            AnonymousClass1LU r32 = this.A0R;
            return new C113415n3(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131627141), this.A0P, r32, str);
        } else if (i == 9) {
            List list4 = C42011xT.A0I;
            return new C42011xT(AnonymousClass3MX.A0B(C72463Mc.A0K(viewGroup, 0), viewGroup, 2131625401, false));
        } else {
            AnonymousClass18K r122 = this.A0Q;
            AnonymousClass18O r7 = this.A0J;
            AnonymousClass1M9 r9 = this.A0L;
            C24921Me r10 = this.A0M;
            C18000vb r11 = this.A0O;
            return new C113405n2(AnonymousClass3MX.A09(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131627130), r7, this.A0K, r9, r10, r11, r122);
        }
    }

    public static int A00(C112335lJ r2) {
        Iterator A0i = C17890vO.A0i(r2.A0U);
        int i = 0;
        while (A0i.hasNext()) {
            if (AnonymousClass000.A1Y(C17890vO.A0P(A0i))) {
                i++;
            }
        }
        return i;
    }

    public static int A01(C112335lJ r6) {
        int i = 0;
        for (AnonymousClass7PZ r0 : r6.A05) {
            if (r0.A00.A0I == 0) {
                i++;
            }
        }
        return i;
    }

    public static int A02(C112335lJ r3, int i) {
        Iterator A0i = C17890vO.A0i(r3.A0U);
        int i2 = 0;
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            if (AnonymousClass000.A1Y(A16.getValue())) {
                if (AnonymousClass000.A0M(A16.getKey()) == i) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r2 < 4) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0.A02.size() < 4) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C112335lJ r7) {
        /*
            java.util.LinkedHashMap r6 = r7.A0U
            r4 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r6.get(r5)
            if (r0 == 0) goto L_0x003d
            X.6ga r0 = r7.A02
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r0.A02
            int r1 = r0.size()
            r0 = 4
            r3 = 1
            if (r1 >= r0) goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            X.6ga r0 = r7.A01
            if (r0 == 0) goto L_0x002a
            java.util.List r0 = r0.A02
            int r2 = r0.size()
            r1 = 4
            r0 = 1
            if (r2 >= r1) goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r3 != 0) goto L_0x003e
            if (r0 != 0) goto L_0x003e
            java.lang.Object r0 = r6.get(r5)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x004e
            r0 = 0
        L_0x003a:
            A04(r7, r4, r0)
        L_0x003d:
            return
        L_0x003e:
            java.lang.Object r0 = r6.get(r5)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 != 0) goto L_0x004e
            boolean r0 = r7.A08
            if (r0 != 0) goto L_0x003d
            r0 = 1
            goto L_0x003a
        L_0x004e:
            int r0 = A02(r7, r4)
            if (r0 < 0) goto L_0x003d
            r7.A0G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112335lJ.A03(X.5lJ):void");
    }

    public static void A04(C112335lJ r4, int i, boolean z) {
        LinkedHashMap linkedHashMap = r4.A0U;
        Integer valueOf = Integer.valueOf(i);
        if (linkedHashMap.get(valueOf) != null && AnonymousClass000.A1Y(linkedHashMap.get(valueOf)) != z) {
            if (z) {
                linkedHashMap.put(valueOf, AnonymousClass000.A0i());
                int A022 = A02(r4, i);
                r4.A0H(A022);
                if (A022 == 0) {
                    LinearLayoutManager linearLayoutManager = r4.A0H;
                    if (linearLayoutManager.A1N() == 0) {
                        linearLayoutManager.A13(0);
                        return;
                    }
                    return;
                }
                return;
            }
            r4.A0I(A02(r4, i));
            linkedHashMap.put(valueOf, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x045a, code lost:
        if (r8 != 0) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x046c, code lost:
        if (r8 == 0) goto L_0x04a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009b, code lost:
        if (r12.A02.size() < 4) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b4, code lost:
        if (r3 != 0) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01bf, code lost:
        if (r3 <= 0) goto L_0x01b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r21, int r22) {
        /*
            r20 = this;
            r6 = r21
            boolean r0 = r6 instanceof X.C113475n9
            r11 = r20
            if (r0 == 0) goto L_0x0049
            X.5n9 r6 = (X.C113475n9) r6
            X.6gb r1 = r11.A03
            if (r1 == 0) goto L_0x0048
            java.lang.String r0 = "storage-usage-summary-view-holder/bind"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r4 = r1.A01
            long r2 = r1.A00
            long r10 = r1.A02
            long r7 = r10 - r2
            long r7 = r7 - r4
            X.0vb r9 = r6.A0B
            java.lang.String r12 = X.C88584aA.A02(r9, r4)
            java.lang.String r13 = X.C88584aA.A02(r9, r2)
            r0 = 0
            long r0 = java.lang.Math.max(r0, r7)
            java.lang.String r16 = X.C88584aA.A02(r9, r0)
            long r0 = r6.A01
            java.lang.String r0 = X.C88584aA.A02(r9, r0)
            boolean r0 = X.C42171xk.A00(r12, r0)
            if (r0 == 0) goto L_0x0266
            long r0 = r6.A00
            java.lang.String r0 = X.C88584aA.A02(r9, r0)
            boolean r0 = X.C42171xk.A00(r13, r0)
            if (r0 == 0) goto L_0x0266
        L_0x0048:
            return
        L_0x0049:
            boolean r0 = r6 instanceof X.C113405n2
            if (r0 == 0) goto L_0x007c
            X.5n2 r6 = (X.C113405n2) r6
            java.util.List r1 = r11.A05
            int r0 = A00(r11)
            int r2 = r22 - r0
            java.lang.Object r7 = r1.get(r2)
            X.7PZ r7 = (X.AnonymousClass7PZ) r7
            X.1pZ r10 = r11.A0N
            java.lang.String r9 = r11.A04
            java.util.List r3 = r11.A06
            java.lang.String r5 = r11.A0T
            int r4 = r11.A0G
            X.1wy r8 = r11.A0S
            X.1M9 r1 = r6.A03
            X.1BI r0 = r7.A01()
            X.1E7 r2 = r1.A0E(r0)
            if (r2 != 0) goto L_0x0230
            android.view.View r1 = r6.A0H
            r0 = 0
            r1.setOnClickListener(r0)
            return
        L_0x007c:
            boolean r0 = r6 instanceof X.C113445n6
            if (r0 == 0) goto L_0x0132
            X.5n6 r6 = (X.C113445n6) r6
            X.6ga r4 = r11.A02
            X.6ga r12 = r11.A01
            java.lang.String r8 = r11.A0T
            int r2 = r11.A0G
            X.1wy r10 = r11.A0S
            java.lang.String r0 = "storage-usage-cleanup-suggestions-view-holder/bind"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r12 == 0) goto L_0x009d
            java.util.List r0 = r12.A02
            int r3 = r0.size()
            r1 = 4
            r0 = 1
            if (r3 >= r1) goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            r3 = 0
            r7 = 8
            if (r0 == 0) goto L_0x012c
            android.view.View r11 = r6.A00
            r19 = 2
            X.78G r13 = new X.78G
            r14 = r6
            r15 = r12
            r16 = r10
            r17 = r8
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r11.setOnClickListener(r13)
            long r0 = r12.A01
            android.widget.TextView r9 = r6.A02
            X.0vb r5 = r6.A05
            java.lang.String r5 = X.C88584aA.A04(r5, r0)
            r9.setText(r5)
            r13 = 0
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            int r0 = X.C72453Mb.A02(r5)
            r11.setVisibility(r0)
            com.whatsapp.storage.StorageUsageMediaPreviewView r9 = r6.A07
            java.util.List r5 = r12.A02
            int r1 = r12.A00
            java.lang.String r0 = "forwarded_files"
            r9.setPreviewMediaItems(r5, r1, r0)
            r11.setVisibility(r3)
        L_0x00dd:
            if (r4 == 0) goto L_0x0262
            java.util.List r5 = r4.A02
            int r1 = r5.size()
            r0 = 4
            if (r1 < r0) goto L_0x0262
            android.view.View r9 = r6.A01
            r17 = 3
            X.78G r11 = new X.78G
            r12 = r6
            r13 = r4
            r14 = r10
            r15 = r8
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r9.setOnClickListener(r11)
            android.widget.TextView r1 = r6.A04
            android.content.Context r0 = X.C108945cZ.A0D(r6)
            X.0vb r8 = r6.A05
            java.lang.String r0 = X.C31141f5.A04(r0, r8)
            r1.setText(r0)
            long r1 = r4.A01
            android.widget.TextView r7 = r6.A03
            java.lang.String r0 = X.C88584aA.A04(r8, r1)
            r7.setText(r0)
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            int r0 = X.C72453Mb.A02(r0)
            r9.setVisibility(r0)
            com.whatsapp.storage.StorageUsageMediaPreviewView r2 = r6.A08
            int r1 = r4.A00
            java.lang.String r0 = "large_files"
            r2.setPreviewMediaItems(r5, r1, r0)
            r9.setVisibility(r3)
            return
        L_0x012c:
            android.view.View r0 = r6.A00
            r0.setVisibility(r7)
            goto L_0x00dd
        L_0x0132:
            boolean r0 = r6 instanceof X.C113175mf
            if (r0 == 0) goto L_0x01c2
            java.util.List r0 = r11.A05
            java.util.Iterator r1 = r0.iterator()
            r3 = 0
        L_0x013d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0156
            java.lang.Object r0 = r1.next()
            X.7PZ r0 = (X.AnonymousClass7PZ) r0
            X.1BI r0 = r0.A01()
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x013d
            int r3 = r3 + 1
            goto L_0x013d
        L_0x0156:
            X.5mf r6 = (X.C113175mf) r6
            java.util.List r0 = r11.A05
            int r1 = X.AnonymousClass3MX.A02(r0, r3)
            X.85y r7 = r11.A0D
            boolean r0 = r11.A0F
            if (r0 == 0) goto L_0x01af
            r2 = 2131896555(0x7f1228eb, float:1.9427975E38)
        L_0x0167:
            android.view.View r1 = r6.A01
            boolean r0 = r1 instanceof com.whatsapp.wds.components.list.header.WDSSectionHeader
            if (r0 == 0) goto L_0x019d
            r5 = r1
            com.whatsapp.wds.components.list.header.WDSSectionHeader r5 = (com.whatsapp.wds.components.list.header.WDSSectionHeader) r5
            r5.setHeaderText((int) r2)
            r4 = 2131232271(0x7f08060f, float:1.8080647E38)
            X.1Xz r3 = X.C27881Xz.TONAL
            android.content.Context r1 = r1.getContext()
            r0 = 2131899369(0x7f1233e9, float:1.9433682E38)
            java.lang.String r2 = r1.getString(r0)
            r1 = 0
            X.6Pl r0 = new X.6Pl
            r0.<init>(r3, r2, r4, r1)
            r5.setAddOnType(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r5.A07(r1)
            if (r2 == 0) goto L_0x0048
            if (r7 == 0) goto L_0x03ef
            r0 = 37
        L_0x0196:
            X.78P r1 = new X.78P
            r1.<init>((java.lang.Object) r7, (int) r0)
            goto L_0x044d
        L_0x019d:
            boolean r0 = r1 instanceof com.whatsapp.WaTextView
            if (r0 == 0) goto L_0x0048
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setText(r2)
            if (r7 == 0) goto L_0x0048
            com.whatsapp.WaImageView r2 = r6.A00
            if (r2 == 0) goto L_0x0048
            r0 = 38
            goto L_0x0196
        L_0x01af:
            if (r1 <= 0) goto L_0x01ba
            r2 = 2131895812(0x7f122604, float:1.9426468E38)
            if (r3 == 0) goto L_0x0167
        L_0x01b6:
            r2 = 2131896542(0x7f1228de, float:1.9427948E38)
            goto L_0x0167
        L_0x01ba:
            if (r1 != 0) goto L_0x01b6
            r2 = 2131896541(0x7f1228dd, float:1.9427946E38)
            if (r3 > 0) goto L_0x0167
            goto L_0x01b6
        L_0x01c2:
            boolean r0 = r6 instanceof X.C113165me
            if (r0 == 0) goto L_0x01d0
            X.5me r6 = (X.C113165me) r6
            androidx.recyclerview.widget.RecyclerView r1 = r6.A00
            X.5ku r0 = r6.A01
            r1.setAdapter(r0)
            return
        L_0x01d0:
            boolean r0 = r6 instanceof X.C113285mq
            if (r0 == 0) goto L_0x0200
            X.5mq r6 = (X.C113285mq) r6
            java.util.List r0 = r11.A05
            java.util.Iterator r7 = r0.iterator()
            r9 = 0
        L_0x01dd:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x03f1
            java.lang.Object r5 = r7.next()
            X.7PZ r5 = (X.AnonymousClass7PZ) r5
            X.D3j r0 = r5.A00
            long r3 = r0.A0I
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01dd
            X.1BI r0 = r5.A01()
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 != 0) goto L_0x01dd
            int r9 = r9 + 1
            goto L_0x01dd
        L_0x0200:
            boolean r0 = r6 instanceof X.C113415n3
            if (r0 == 0) goto L_0x0048
            X.5n3 r6 = (X.C113415n3) r6
            X.1wy r4 = r11.A0S
            boolean r3 = r11.A0V
            com.whatsapp.wds.components.list.listitem.WDSListItem r2 = r6.A04
            int r0 = X.C72453Mb.A07(r3)
            r2.setVisibility(r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r1 = r6.A05
            r0 = 48
            X.AnonymousClass3MZ.A1P(r1, r6, r4, r0)
            if (r3 == 0) goto L_0x0221
            r0 = 49
            X.AnonymousClass3MZ.A1P(r2, r6, r4, r0)
        L_0x0221:
            com.whatsapp.WaTextView r1 = r6.A03
            r0 = 3
            r1.setMaxLines(r0)
            com.whatsapp.wds.components.list.listitem.WDSListItem r1 = r6.A00
            if (r1 == 0) goto L_0x0048
            r0 = 0
            X.AnonymousClass78M.A00(r1, r6, r4, r0)
            return
        L_0x0230:
            com.whatsapp.components.button.ThumbnailButton r1 = r6.A02
            r0 = 0
            r10.A0C(r1, r2, r0)
            X.1xh r1 = r6.A01
            if (r9 == 0) goto L_0x025d
            r1.A0A(r2, r3)
        L_0x023d:
            android.widget.TextView r3 = r6.A00
            X.0vb r2 = r6.A04
            X.D3j r0 = r7.A00
            long r0 = r0.A0I
            java.lang.String r0 = X.C88584aA.A04(r2, r0)
            r3.setText(r0)
            android.view.View r0 = r6.A0H
            r15 = 1
            X.78G r9 = new X.78G
            r10 = r6
            r11 = r7
            r12 = r8
            r13 = r5
            r14 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r0.setOnClickListener(r9)
            return
        L_0x025d:
            r0 = -1
            r1.A08(r2, r0)
            goto L_0x023d
        L_0x0262:
            android.view.View r0 = r6.A01
            goto L_0x03b6
        L_0x0266:
            r6.A01 = r4
            r6.A00 = r2
            com.whatsapp.WaTextView r14 = r6.A07
            android.view.View r15 = r6.A0H
            android.content.Context r13 = r15.getContext()
            r1 = 2131896558(0x7f1228ee, float:1.942798E38)
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r7 = 0
            r0[r7] = r12
            X.AnonymousClass3MY.A0y(r13, r14, r0, r1)
            com.whatsapp.WaTextView r13 = r6.A08
            android.content.Context r12 = r15.getContext()
            r1 = 2131896562(0x7f1228f2, float:1.9427989E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r16
            X.AnonymousClass3MY.A0y(r12, r13, r0, r1)
            com.whatsapp.storage.SizeTickerView r14 = r6.A0D
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 300(0x12c, float:4.2E-43)
            r14.A01 = r1
            r14.A00 = r0
            android.content.Context r13 = r15.getContext()
            android.content.Context r12 = r15.getContext()
            r1 = 2130971979(0x7f040d4b, float:1.7552712E38)
            r0 = 2131103155(0x7f060db3, float:1.7818768E38)
            int r0 = X.AnonymousClass3MZ.A02(r12, r13, r1, r0)
            r14.A0M(r0, r4, r8)
            com.whatsapp.WaTextView r13 = r6.A09
            r14 = 2131755418(0x7f10019a, float:1.9141715E38)
            android.util.Pair r0 = X.C88584aA.A00(r9, r4, r7, r7)
            java.lang.Object r12 = r0.second
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Object r0 = r0.first
            r1[r7] = r0
            java.lang.String r0 = r9.A0H(r12, r1, r14)
            r13.setText(r0)
            com.whatsapp.storage.SizeTickerView r12 = r6.A0C
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 300(0x12c, float:4.2E-43)
            r12.A01 = r1
            r12.A00 = r0
            int r0 = r6.A02
            r12.A0M(r0, r2, r8)
            com.whatsapp.WaTextView r13 = r6.A06
            r14 = 2131755417(0x7f100199, float:1.9141713E38)
            android.util.Pair r0 = X.C88584aA.A00(r9, r2, r7, r7)
            java.lang.Object r12 = r0.second
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Object r0 = r0.first
            r1[r7] = r0
            java.lang.String r0 = r9.A0H(r12, r1, r14)
            r13.setText(r0)
            float r9 = (float) r4
            float r0 = (float) r10
            float r9 = r9 / r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 * r1
            float r4 = (float) r2
            float r4 = r4 / r0
            float r4 = r4 * r1
            float r1 = r1 - r4
            float r1 = r1 - r9
            r0 = 0
            r2 = 2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x03c7
            float[] r10 = new float[r2]
            r10[r7] = r9
            r10[r8] = r1
            com.whatsapp.components.SegmentedProgressBar r4 = r6.A0A
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 300(0x12c, float:4.2E-43)
            r4.A02 = r1
            r4.A01 = r0
            int[] r3 = r6.A0E
            int r9 = r6.A03
            X.C18070vi.A0d(r3, r8)
            r5 = 2
            r11 = 2
            r2 = 0
            r1 = 0
        L_0x031c:
            r0 = r10[r1]
            float r2 = r2 + r0
            int r1 = r1 + 1
            if (r1 < r5) goto L_0x031c
            int r1 = (int) r2
            r4.A06 = r1
            if (r1 < 0) goto L_0x03c0
            r0 = 101(0x65, float:1.42E-43)
            if (r1 >= r0) goto L_0x03c0
            float[] r0 = r4.A0D
            if (r0 == 0) goto L_0x03ba
            int r0 = r0.length
            if (r0 != r5) goto L_0x03ba
        L_0x0333:
            r4.A0E = r3
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            android.animation.AnimatorSet r0 = r4.A08
            if (r0 == 0) goto L_0x0340
            r0.cancel()
        L_0x0340:
            android.animation.AnimatorSet r2 = X.C108945cZ.A0B()
            r12 = 0
        L_0x0345:
            float[] r5 = r4.A0D
            if (r5 == 0) goto L_0x0368
            r13 = r5[r12]
            r0 = r10[r12]
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0368
            float[] r1 = new float[r11]
            r1[r7] = r13
            r0 = r10[r12]
            r1[r8] = r0
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            X.74d r0 = new X.74d
            r0.<init>(r4, r5, r12)
            r1.addUpdateListener(r0)
            r3.add(r1)
        L_0x0368:
            int r12 = r12 + 1
            if (r12 < r11) goto L_0x0345
            int r0 = r4.A03
            if (r0 == r9) goto L_0x038b
            android.animation.ArgbEvaluator r5 = new android.animation.ArgbEvaluator
            r5.<init>()
            java.lang.Object[] r1 = new java.lang.Object[r11]
            int r0 = r4.A03
            X.C17880vN.A1T(r1, r0, r7)
            X.C17880vN.A1T(r1, r9, r8)
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofObject(r5, r1)
            r0 = 12
            X.C1411074h.A00(r1, r4, r0)
            r3.add(r1)
        L_0x038b:
            X.5ck r0 = new X.5ck
            r0.<init>(r4, r10, r9)
            r2.addListener(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            android.animation.TimeInterpolator r0 = (android.animation.TimeInterpolator) r0
            r2.setInterpolator(r0)
            int r0 = r4.A02
            long r0 = (long) r0
            r2.setDuration(r0)
            int r0 = r4.A01
            long r0 = (long) r0
            r2.setStartDelay(r0)
            r2.playTogether(r3)
            r2.start()
            r4.A08 = r2
            r4.setVisibility(r7)
            android.view.View r0 = r6.A04
        L_0x03b6:
            r0.setVisibility(r7)
            return
        L_0x03ba:
            float[] r0 = new float[r5]
            r4.A0D = r0
            goto L_0x0333
        L_0x03c0:
            java.lang.String r0 = "Progress sum must be between 0 and 100 inclusive"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x03c7:
            com.whatsapp.components.SegmentedProgressBar r0 = r6.A0A
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r6.A04
            r0.setVisibility(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            r1[r7] = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            r1[r8] = r0
            java.lang.String r0 = "usedSpacePercentage: %s, freeSpacePercentage: %s"
            java.lang.String r2 = java.lang.String.format(r0, r1)
            X.190 r1 = r6.A05
            java.lang.String r0 = "storage-usage-summary progress percentages sum up above 100"
            r1.A0G(r0, r2, r8)
            return
        L_0x03ef:
            r1 = 0
            goto L_0x044d
        L_0x03f1:
            java.util.List r0 = r11.A05
            java.util.Iterator r5 = r0.iterator()
            r8 = 0
        L_0x03f8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x041b
            java.lang.Object r1 = r5.next()
            X.7PZ r1 = (X.AnonymousClass7PZ) r1
            X.1BI r0 = r1.A01()
            boolean r0 = X.C22971Dz.A0V(r0)
            if (r0 == 0) goto L_0x03f8
            X.D3j r0 = r1.A00
            long r3 = r0.A0I
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x03f8
            int r8 = r8 + 1
            goto L_0x03f8
        L_0x041b:
            boolean r5 = r11.A0F
            X.6RN r10 = r11.A00
            X.85y r4 = r11.A0D
            X.6RN r2 = X.AnonymousClass6RN.ALL
            r3 = 0
            if (r10 != r2) goto L_0x0451
            if (r9 != 0) goto L_0x0451
            if (r8 != 0) goto L_0x045c
            android.widget.TextView r0 = r6.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131896561(0x7f1228f1, float:1.9427987E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x0437:
            r7 = 0
        L_0x0438:
            android.widget.TextView r0 = r6.A00
            r0.setText(r1)
            if (r5 == 0) goto L_0x04b5
            if (r7 == 0) goto L_0x04b5
            com.whatsapp.WaTextView r2 = r6.A01
            r2.setVisibility(r3)
            r0 = 36
            X.78P r1 = new X.78P
            r1.<init>((java.lang.Object) r4, (int) r0)
        L_0x044d:
            r2.setOnClickListener(r1)
            return
        L_0x0451:
            r7 = 1
            if (r10 != r2) goto L_0x0456
            if (r9 == 0) goto L_0x045c
        L_0x0456:
            X.6RN r1 = X.AnonymousClass6RN.CHANNELS
            if (r10 != r1) goto L_0x046a
            if (r8 == 0) goto L_0x046e
        L_0x045c:
            android.widget.TextView r0 = r6.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131755414(0x7f100196, float:1.9141707E38)
            java.lang.String r1 = X.C72473Md.A0k(r1, r8, r0)
            goto L_0x0437
        L_0x046a:
            if (r10 != r2) goto L_0x046e
            if (r8 == 0) goto L_0x04a7
        L_0x046e:
            X.6RN r0 = X.AnonymousClass6RN.CHATS
            if (r10 != r0) goto L_0x0482
            if (r9 != 0) goto L_0x04a7
            android.widget.TextView r0 = r6.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131896560(0x7f1228f0, float:1.9427985E38)
        L_0x047d:
            java.lang.String r1 = r1.getString(r0)
            goto L_0x0438
        L_0x0482:
            if (r10 != r2) goto L_0x0498
            android.widget.TextView r0 = r6.A00
            android.content.Context r2 = r0.getContext()
            r1 = 2131896543(0x7f1228df, float:1.942795E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r9 = r9 + r8
            X.C17880vN.A1T(r0, r9, r3)
            java.lang.String r1 = r2.getString(r1, r0)
            goto L_0x0437
        L_0x0498:
            if (r10 != r1) goto L_0x04a4
            android.widget.TextView r0 = r6.A00
            android.content.Context r1 = r0.getContext()
            r0 = 2131896559(0x7f1228ef, float:1.9427983E38)
            goto L_0x047d
        L_0x04a4:
            java.lang.String r1 = ""
            goto L_0x0437
        L_0x04a7:
            android.widget.TextView r0 = r6.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131755415(0x7f100197, float:1.9141709E38)
            java.lang.String r1 = X.C72473Md.A0k(r1, r9, r0)
            goto L_0x0437
        L_0x04b5:
            com.whatsapp.WaTextView r1 = r6.A01
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112335lJ.Bmc(X.1xT, int):void");
    }

    public int getItemViewType(int i) {
        Iterator A0i = C17890vO.A0i(this.A0U);
        int i2 = 0;
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            if (AnonymousClass000.A1Y(A16.getValue())) {
                if (i2 == i) {
                    return AnonymousClass000.A0M(A16.getKey());
                }
                i2++;
            }
        }
        if (this.A07 && !this.A08 && ((this.A05.size() == 0 || A01(this) > 0) && i == A0Q() - 1)) {
            return 6;
        }
        if (!this.A08 || this.A05.size() != 0) {
            return 5;
        }
        return 7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r3.A05.size() != 0) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0Q() {
        /*
            r3 = this;
            int r2 = A00(r3)
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x0041
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x0041
            java.util.List r0 = r3.A05
            int r1 = r0.size()
            int r0 = A01(r3)
            int r1 = r1 - r0
        L_0x0017:
            int r2 = r2 + r1
            boolean r0 = r3.A07
            r1 = 0
            if (r0 == 0) goto L_0x0030
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x0030
            java.util.List r0 = r3.A05
            int r0 = r0.size()
            if (r0 == 0) goto L_0x002f
            int r0 = A01(r3)
            if (r0 <= 0) goto L_0x0030
        L_0x002f:
            r1 = 1
        L_0x0030:
            int r2 = r2 + r1
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x003e
            java.util.List r0 = r3.A05
            int r1 = r0.size()
            r0 = 1
            if (r1 == 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            int r2 = r2 + r0
            return r2
        L_0x0041:
            java.util.List r0 = r3.A05
            int r1 = r0.size()
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112335lJ.A0Q():int");
    }

    public C112335lJ(LinearLayoutManager linearLayoutManager, AnonymousClass190 r7, C124656Ze r8, AnonymousClass1KB r9, AnonymousClass18O r10, C72043Kk r11, AnonymousClass1M9 r12, C24921Me r13, C37451pZ r14, C18000vb r15, C18030ve r16, AnonymousClass18K r17, AnonymousClass1LU r18, C1598085y r19, C41731wy r20, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        this.A0B = r9;
        this.A0I = r7;
        this.A0R = r18;
        this.A0Q = r17;
        this.A0J = r10;
        this.A0L = r12;
        this.A0M = r13;
        this.A0O = r15;
        this.A0K = r11;
        this.A0H = linearLayoutManager;
        this.A0N = r14;
        this.A0G = i;
        this.A0T = str;
        this.A0S = r20;
        this.A0A = str2;
        this.A0V = z;
        this.A0F = z2;
        this.A0W = z3;
        this.A0C = new C112085ku((C51122Xb) r8.A00.A00.A3Z.get(), this);
        this.A0D = r19;
        this.A0P = r16;
        LinkedHashMap A13 = C17880vN.A13();
        this.A0U = A13;
        Integer A0i = C17880vN.A0i();
        Boolean A0h = AnonymousClass000.A0h();
        A13.put(A0i, A0h);
        C108955ca.A1V(true, A13, 1);
        C108955ca.A1V(A0h, A13, 3);
        C108955ca.A1V(true, A13, 8);
        C108955ca.A1V(true, A13, 4);
        if (z2) {
            C108955ca.A1V(true, A13, 10);
        }
    }
}
