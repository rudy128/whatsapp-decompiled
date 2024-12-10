package X;

import android.net.Uri;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6MV  reason: invalid class name */
public class AnonymousClass6MV extends A34 {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass11C A01;
    public final AnonymousClass118 A02;
    public final C18000vb A03;
    public final AnonymousClass1W6 A04;
    public final C34481kY A05;
    public final C129386hi A06;
    public final WeakReference A07;

    public AnonymousClass6MV(AnonymousClass1M9 r2, AnonymousClass11C r3, AnonymousClass118 r4, C18000vb r5, AnonymousClass1W6 r6, C34481kY r7, C129386hi r8, ViewSharedContactArrayActivity viewSharedContactArrayActivity) {
        super(viewSharedContactArrayActivity, true);
        this.A02 = r4;
        this.A05 = r7;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A07 = AnonymousClass3MW.A0z(viewSharedContactArrayActivity);
        this.A06 = r8;
    }

    public static void A00(Object obj, AbstractCollection abstractCollection, AnonymousClass73C r4, int i, int i2) {
        abstractCollection.add(new C129356hf(obj, r4.A0A.A08, i, i2));
    }

    public void A0F() {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A07);
        if (A0Z != null) {
            C108965cb.A17(A0Z);
        }
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.6xA, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        AnonymousClass73C r2;
        List<C129926ib> list;
        List list2;
        List A022;
        C129386hi r22 = this.A06;
        AnonymousClass205 r1 = r22.A01;
        if (r1 != null) {
            AnonymousClass206 A0s = C108945cZ.A0s(r1, this.A04);
            if (A0s == null) {
                return null;
            }
            AnonymousClass118 r5 = this.A02;
            C34481kY r4 = this.A05;
            AnonymousClass1M9 r3 = this.A00;
            AnonymousClass11C r23 = this.A01;
            C18000vb r12 = this.A03;
            if (A0s instanceof C442222p) {
                C54032dU A032 = AnonymousClass73Y.A03(r3, r23, r5, r12, (C442222p) A0s);
                if (A032 != null) {
                    return Collections.singletonList(A032);
                }
                return null;
            } else if (A0s instanceof C442022n) {
                C442022n r7 = (C442022n) A0s;
                List list3 = r7.A01;
                if (list3 != null) {
                    return list3;
                }
                ArrayList A023 = AnonymousClass73Y.A02(r3, r23, r5, r12, r7.A17());
                r7.A01 = A023;
                return A023;
            } else if (!A3I.A02(A0s) || (A022 = C62872s8.A02(A0s, r4)) == null) {
                return null;
            } else {
                return AnonymousClass73Y.A02(r3, r23, r5, r12, A022);
            }
        } else {
            List list4 = r22.A03;
            if (list4 != null) {
                AnonymousClass73Y r9 = new AnonymousClass73Y(this.A00, this.A01, this.A02, this.A03);
                ? obj = new Object();
                ArrayList A14 = AnonymousClass000.A14(list4);
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    try {
                        C138486xA.A00(C17880vN.A0v(it), A14, obj, new AnonymousClass73Y(r9.A00, r9.A01, r9.A02, r9.A03));
                    } catch (C33281iZ unused) {
                    }
                }
                int i = obj.A01;
                if (i <= 0 && obj.A00 <= 0) {
                    return A14;
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("contactstruct/construct/too_long=");
                A10.append(i);
                A10.append("; exceed_max=");
                Log.w(C17880vN.A0t(A10, obj.A00));
                return A14;
            }
            Uri uri = r22.A00;
            if (uri != null) {
                try {
                    C34481kY r13 = this.A05;
                    return r13.A00(r13.A01(uri)).A02;
                } catch (C33281iZ | IOException e) {
                    Log.e((Throwable) new AnonymousClass2RP(e));
                    return null;
                }
            } else {
                List<C1417076q> list5 = r22.A02;
                if (list5 == null) {
                    return null;
                }
                ArrayList A13 = AnonymousClass000.A13();
                for (C1417076q r14 : list5) {
                    UserJid A024 = C22941Dw.A02(r14.A01);
                    AnonymousClass1W6 r0 = this.A04;
                    AnonymousClass206 A033 = r0.A01.A03(r14.A00);
                    if (!(A024 == null || A033 == null)) {
                        List A025 = C62872s8.A02(A033, this.A05);
                        if (A025 == null) {
                            list2 = Collections.emptyList();
                        } else {
                            ArrayList A132 = AnonymousClass000.A13();
                            Iterator it2 = A025.iterator();
                            while (it2.hasNext()) {
                                String A0v = C17880vN.A0v(it2);
                                StringBuilder A102 = AnonymousClass000.A10();
                                A102.append("waid=");
                                if (A0v.contains(AnonymousClass000.A0y(A024.user, A102))) {
                                    try {
                                        AnonymousClass73Y r02 = new AnonymousClass73Y(this.A00, this.A01, this.A02, this.A03);
                                        r02.A05(A0v);
                                        r2 = r02.A04;
                                    } catch (C33281iZ e2) {
                                        Log.e("Failed to get contact from VCard.", e2);
                                        r2 = null;
                                    }
                                    if (!(r2 == null || (list = r2.A06) == null)) {
                                        for (C129926ib r03 : list) {
                                            if (A024.equals(r03.A01)) {
                                                A132.add(new C54032dU(A0v, r2));
                                            }
                                        }
                                    }
                                }
                            }
                            list2 = A132;
                        }
                        A13.addAll(list2);
                    }
                }
                return A13;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r19) {
        /*
            r18 = this;
            r6 = r19
            java.util.List r6 = (java.util.List) r6
            r0 = r18
            java.lang.ref.WeakReference r0 = r0.A07
            java.lang.Object r5 = r0.get()
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r5 = (com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity) r5
            if (r5 == 0) goto L_0x0354
            r5.CEx()
            r9 = 0
            if (r6 == 0) goto L_0x0344
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0344
            java.util.HashSet r8 = X.C17880vN.A12()
            java.util.Iterator r11 = r6.iterator()
        L_0x0024:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r11.next()
            X.2dU r0 = (X.C54032dU) r0
            X.73C r7 = r0.A01
            java.lang.String r4 = r7.A02()
            boolean r0 = r8.contains(r4)
            if (r0 != 0) goto L_0x004f
            java.util.ArrayList r0 = r5.A0W
            r0.add(r7)
            java.util.ArrayList r1 = r5.A0X
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.add(r0)
            r8.add(r4)
            goto L_0x0024
        L_0x004f:
            java.util.List r0 = r7.A06
            if (r0 == 0) goto L_0x0024
            java.util.ArrayList r3 = r5.A0W
            java.util.Iterator r10 = r3.iterator()
        L_0x0059:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r2 = r10.next()
            X.73C r2 = (X.AnonymousClass73C) r2
            java.lang.String r0 = r2.A02()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0059
            java.util.List r0 = r2.A06
            if (r0 == 0) goto L_0x0059
            java.util.List r0 = r7.A06
            int r1 = r0.size()
            java.util.List r0 = r2.A06
            int r0 = r0.size()
            if (r1 <= r0) goto L_0x0059
            int r0 = r3.indexOf(r2)
            r3.set(r0, r7)
            goto L_0x0059
        L_0x0089:
            java.util.List r0 = r5.A0P
            if (r0 != 0) goto L_0x0099
            java.util.ArrayList r2 = r5.A0W
            X.0vb r1 = r5.A0F
            X.7Rd r0 = new X.7Rd
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
        L_0x0099:
            r0 = 2131435147(0x7f0b1e8b, float:1.8492128E38)
            android.widget.ImageView r4 = X.AnonymousClass3MX.A0I(r5, r0)
            boolean r0 = r5.A0S
            r3 = 1
            if (r0 == 0) goto L_0x0165
            r4.setVisibility(r9)
            X.0ve r0 = r5.A0E
            X.C18070vi.A0d(r0, r9)
            r1 = 2131232506(0x7f0806fa, float:1.8081123E38)
            X.0vb r0 = r5.A0F
            X.AnonymousClass3NL.A01(r5, r4, r0, r1)
            java.util.ArrayList r0 = r5.A0W
            int r0 = r0.size()
            r2 = 2131895711(0x7f12259f, float:1.9426263E38)
            if (r0 != r3) goto L_0x00c3
            r2 = 2131895718(0x7f1225a6, float:1.9426277E38)
        L_0x00c3:
            X.01n r1 = X.AnonymousClass3MY.A0J(r5)
        L_0x00c7:
            r1.A0M(r2)
            r0 = 2131434768(0x7f0b1d10, float:1.849136E38)
            android.view.View r6 = r5.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            X.1pJ r0 = r5.A0A
            boolean r0 = r0.A02()
            java.util.ArrayList r8 = r5.A0W
            java.util.List r7 = r5.A0P
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            if (r0 == 0) goto L_0x017c
            java.util.ArrayList r11 = r5.A0X
            r11.clear()
            r10 = 0
        L_0x00e9:
            int r0 = r8.size()
            if (r10 >= r0) goto L_0x0323
            java.lang.Object r7 = r8.get(r10)
            X.73C r7 = (X.AnonymousClass73C) r7
            r2 = 0
        L_0x00f6:
            int r1 = r10 + r2
            int r0 = r11.size()
            if (r0 > r1) goto L_0x0106
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r11.add(r0)
        L_0x0106:
            java.lang.Object r13 = r11.get(r1)
            android.util.SparseArray r13 = (android.util.SparseArray) r13
            X.6fK r0 = new X.6fK
            r0.<init>(r7, r2)
            r3.add(r0)
            java.util.List r0 = r7.A06
            if (r0 == 0) goto L_0x0163
            java.util.List r0 = r7.A06
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0163
            java.util.List r0 = r7.A06
            java.lang.Object r12 = r0.get(r2)
            X.6oE r0 = r7.A0A
            java.lang.String r1 = r0.A08
            X.6hg r0 = new X.6hg
            r0.<init>(r12, r1, r10, r2)
            r3.add(r0)
            X.6UK r0 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A03(r13, r9)
            r0.A00 = r12
            r12 = 1
        L_0x0139:
            X.6fa r0 = r7.A09
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x014a
            X.6fa r1 = r7.A09
            A00(r1, r3, r7, r10, r12)
            X.6UK r0 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A03(r13, r12)
            r0.A00 = r1
        L_0x014a:
            X.6d8 r0 = new X.6d8
            r0.<init>()
            r3.add(r0)
            java.util.List r0 = r7.A06
            if (r0 == 0) goto L_0x0160
            int r2 = r2 + 1
            java.util.List r0 = r7.A06
            int r0 = r0.size()
            if (r2 < r0) goto L_0x00f6
        L_0x0160:
            int r10 = r10 + 1
            goto L_0x00e9
        L_0x0163:
            r12 = 0
            goto L_0x0139
        L_0x0165:
            r0 = 8
            r4.setVisibility(r0)
            int r0 = r6.size()
            X.01n r1 = X.AnonymousClass3MY.A0J(r5)
            r2 = 2131897880(0x7f122e18, float:1.9430662E38)
            if (r0 != r3) goto L_0x00c7
            r2 = 2131897881(0x7f122e19, float:1.9430664E38)
            goto L_0x00c7
        L_0x017c:
            int r0 = r8.size()
            if (r9 >= r0) goto L_0x0323
            java.lang.Object r12 = r8.get(r9)
            X.73C r12 = (X.AnonymousClass73C) r12
            java.util.ArrayList r0 = r5.A0X
            java.lang.Object r11 = r0.get(r9)
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            X.6d9 r0 = new X.6d9
            r0.<init>(r12)
            r3.add(r0)
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            java.util.List r0 = r12.A06
            if (r0 == 0) goto L_0x01c7
            java.util.List r0 = r12.A06
            java.util.Iterator r2 = r0.iterator()
            r10 = 0
        L_0x01a7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r1 = r2.next()
            X.6ib r1 = (X.C129926ib) r1
            com.whatsapp.jid.UserJid r0 = r1.A01
            if (r0 != 0) goto L_0x01bb
            r13.add(r1)
            goto L_0x01a7
        L_0x01bb:
            A00(r1, r3, r12, r9, r10)
            X.6UK r0 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A03(r11, r10)
            r0.A00 = r1
            int r10 = r10 + 1
            goto L_0x01a7
        L_0x01c7:
            r10 = 0
        L_0x01c8:
            java.util.List r0 = r12.A03
            if (r0 == 0) goto L_0x01e8
            java.util.List r0 = r12.A03
            java.util.Iterator r2 = r0.iterator()
        L_0x01d2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01e8
            java.lang.Object r1 = r2.next()
            A00(r1, r3, r12, r9, r10)
            X.6UK r0 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A03(r11, r10)
            r0.A00 = r1
            int r10 = r10 + 1
            goto L_0x01d2
        L_0x01e8:
            java.util.Iterator r2 = r13.iterator()
        L_0x01ec:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0202
            java.lang.Object r1 = r2.next()
            A00(r1, r3, r12, r9, r10)
            X.6UK r0 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A03(r11, r10)
            r0.A00 = r1
            int r10 = r10 + 1
            goto L_0x01ec
        L_0x0202:
            java.util.List r0 = r12.A07
            if (r0 == 0) goto L_0x0222
            java.util.List r0 = r12.A07
            java.util.Iterator r2 = r0.iterator()
        L_0x020c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0222
            java.lang.Object r1 = r2.next()
            A00(r1, r3, r12, r9, r10)
            X.6UK r0 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A03(r11, r10)
            r0.A00 = r1
            int r10 = r10 + 1
            goto L_0x020c
        L_0x0222:
            X.6fa r0 = r12.A09
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0235
            X.6fa r1 = r12.A09
            A00(r1, r3, r12, r9, r10)
            X.6UK r0 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A03(r11, r10)
            r0.A00 = r1
            int r10 = r10 + 1
        L_0x0235:
            java.util.Map r0 = r12.A08
            if (r0 == 0) goto L_0x02ec
            java.util.Map r0 = r12.A08
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r17 = X.C17880vN.A10(r0)
            java.util.Collections.sort(r17)
            java.util.ArrayList r13 = X.AnonymousClass000.A13()
            java.util.Iterator r16 = r17.iterator()
        L_0x024e:
            boolean r0 = r16.hasNext()
            java.lang.String r2 = "URL"
            if (r0 == 0) goto L_0x029b
            java.lang.Object r1 = r16.next()
            java.util.Map r0 = r12.A08
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x024e
            java.util.Iterator r15 = r0.iterator()
        L_0x0268:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x024e
            java.lang.Object r1 = r15.next()
            X.6tl r1 = (X.C136406tl) r1
            java.lang.String r0 = r1.A01
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0268
            r1.toString()
            java.util.regex.Pattern r14 = r5.A0Q
            if (r14 != 0) goto L_0x028b
            java.lang.String r0 = "(http|https)://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&amp;=]*)?"
            java.util.regex.Pattern r14 = java.util.regex.Pattern.compile(r0)
            r5.A0Q = r14
        L_0x028b:
            java.lang.String r0 = r1.A02
            java.util.regex.Matcher r0 = r14.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x0268
            r13.add(r1)
            goto L_0x0268
        L_0x029b:
            java.util.Iterator r15 = r17.iterator()
        L_0x029f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x02d2
            java.lang.Object r1 = r15.next()
            java.util.Map r0 = r12.A08
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x029f
            java.util.Iterator r14 = r0.iterator()
        L_0x02b7:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x029f
            java.lang.Object r1 = r14.next()
            X.6tl r1 = (X.C136406tl) r1
            java.lang.String r0 = r1.A01
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x02b7
            r1.toString()
            r13.add(r1)
            goto L_0x02b7
        L_0x02d2:
            java.util.Iterator r2 = r13.iterator()
        L_0x02d6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02ec
            java.lang.Object r1 = r2.next()
            A00(r1, r3, r12, r9, r10)
            X.6UK r0 = com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity.A03(r11, r10)
            r0.A00 = r1
            int r10 = r10 + 1
            goto L_0x02d6
        L_0x02ec:
            if (r7 == 0) goto L_0x0317
            int r0 = r7.size()
            if (r9 >= r0) goto L_0x0317
            java.lang.Object r1 = r7.get(r9)
            X.76q r1 = (X.C1417076q) r1
            java.lang.String r0 = r1.A02
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A02(r0)
            if (r2 == 0) goto L_0x0317
            X.1M9 r0 = r5.A04
            X.1E7 r11 = r0.A0E(r2)
            if (r11 == 0) goto L_0x0317
            long r0 = r1.A00
            X.6hh r10 = new X.6hh
            r12 = r2
            r13 = r5
            r14 = r0
            r10.<init>(r11, r12, r13, r14)
            r3.add(r10)
        L_0x0317:
            X.6d8 r0 = new X.6d8
            r0.<init>()
            r3.add(r0)
            int r9 = r9 + 1
            goto L_0x017c
        L_0x0323:
            int r0 = r3.size()
            r1 = 1
            int r0 = r0 - r1
            java.lang.Object r0 = r3.get(r0)
            X.6d8 r0 = (X.C126686d8) r0
            r0.A00 = r1
            X.5ks r0 = new X.5ks
            r0.<init>(r5, r3)
            r5.A0L = r0
            r6.setAdapter(r0)
            X.AnonymousClass3Ma.A15(r5, r6)
            r0 = 42
            X.AnonymousClass6LG.A00(r4, r5, r0)
            return
        L_0x0344:
            java.lang.String r0 = "viewsharedcontactarrayactivity/oncreate/no vcards to display"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1KB r1 = r5.A05
            r0 = 2131890000(0x7f120f50, float:1.941468E38)
            r1.A08(r0, r9)
            r5.finish()
        L_0x0354:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MV.A0H(java.lang.Object):void");
    }
}
