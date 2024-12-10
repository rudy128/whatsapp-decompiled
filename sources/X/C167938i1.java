package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.Me;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.biz.catalog.view.CategoryMediaCard;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: X.8i1  reason: invalid class name and case insensitive filesystem */
public final class C167938i1 extends C168758jd implements B7L {
    public long A00 = 1;
    public UserJid A01;
    public String A02;
    public String A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Activity A08;
    public final C56412hQ A09;
    public final C132216mP A0A;
    public final C20114A7x A0B;
    public final C189029iO A0C;
    public final AnonymousClass8F8 A0D;
    public final C22369B4x A0E;
    public final AnonymousClass1M9 A0F;
    public final AnonymousClass1PM A0G;
    public final C24921Me A0H;
    public final AnonymousClass11C A0I;
    public final C19830z4 A0J;
    public final AnonymousClass18K A0K;
    public final AnonymousClass1MB A0L;
    public final C36401np A0M;
    public final Map A0N = C17880vN.A11();

    /* JADX WARNING: type inference failed for: r1v1, types: [X.8jW, X.9Wn, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v44, types: [X.9Wn, X.8jb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v16, types: [X.9Wn, X.8jX] */
    /* JADX WARNING: type inference failed for: r1v18, types: [X.9Wn, X.8jX] */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d6, code lost:
        if (r0.A01 != false) goto L_0x01d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0c(com.whatsapp.jid.UserJid r19) {
        /*
            r18 = this;
            r8 = 0
            r5 = r18
            java.util.List r6 = r5.A00
            r6.clear()
            android.app.Activity r7 = r5.A08
            int r0 = X.C72453Mb.A08(r7)
            r2 = 1
            if (r0 != r2) goto L_0x0014
            r5.A0Z()
        L_0x0014:
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x005a
            com.whatsapp.jid.UserJid r10 = r5.A01
            if (r10 != 0) goto L_0x001e
            com.whatsapp.jid.UserJid r10 = r5.A07
        L_0x001e:
            X.9iO r4 = r5.A0C
            X.0z4 r3 = r5.A0J
            java.lang.String r0 = r10.getRawString()
            java.lang.String r1 = r3.A0q(r0)
            java.lang.String r0 = r5.A03
            java.lang.String r9 = r4.A00(r1, r0)
            java.lang.String r4 = r10.getRawString()
            android.content.SharedPreferences r3 = X.C17890vO.A0B(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "dc_location_name_"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)
            java.lang.String r4 = X.C17880vN.A0r(r3, r0)
            java.lang.String r3 = r5.A02
            if (r9 == 0) goto L_0x010f
            if (r4 == 0) goto L_0x010f
            r0 = 14
            X.8jX r1 = new X.8jX
            r1.<init>(r0)
            r1.A01 = r9
        L_0x0055:
            r1.A00 = r4
            r6.add(r1)
        L_0x005a:
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0070
            X.8jY r0 = new X.8jY
            r0.<init>()
            r6.add(r0)
            java.util.List r1 = r5.A04
            X.8jZ r0 = new X.8jZ
            r0.<init>(r1)
            r6.add(r0)
        L_0x0070:
            boolean r0 = r5.A06
            r4 = 1
            r9 = r19
            if (r0 == 0) goto L_0x0127
            int r0 = r6.size()
            boolean r2 = X.C108975cc.A1D(r0, r2)
            X.A7x r11 = r5.A0B
            java.util.ArrayList r17 = r11.A0C(r9)
            java.util.Iterator r16 = r17.iterator()
            r12 = 0
        L_0x008a:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r13 = r16.next()
            X.9sq r13 = (X.C195129sq) r13
            X.C18070vi.A0d(r13, r8)
            X.9O2 r0 = r13.A00
            int r0 = r0.A00
            if (r0 != 0) goto L_0x008a
            java.util.List r3 = r13.A04
            java.util.Iterator r1 = r3.iterator()
        L_0x00a5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008a
            X.AEv r0 = X.AnonymousClass8BS.A0B(r1)
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00a5
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            java.lang.String r10 = r13.A03
            java.lang.String r1 = r13.A02
            X.8jc r0 = new X.8jc
            r0.<init>(r10, r1, r2)
            r12.add(r0)
            X.9O2 r2 = r13.A00
            int r1 = r2.A00
            r0 = 2
            if (r1 != r0) goto L_0x00d6
            java.lang.String r1 = r13.A02
            X.8ja r0 = new X.8ja
            r0.<init>(r2, r10, r1)
            r12.add(r0)
        L_0x00d6:
            java.util.Iterator r15 = r3.iterator()
            r14 = 0
        L_0x00db:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0108
            X.AEv r13 = X.AnonymousClass8BS.A0B(r15)
            r0 = 3
            if (r14 == r0) goto L_0x0108
            boolean r0 = r5.A0d(r13)
            if (r0 == 0) goto L_0x00db
            long r1 = r5.A0U(r13)
            r3 = 5
            r0 = 2
            X.C18070vi.A0d(r13, r0)
            X.8jb r0 = new X.8jb
            r0.<init>(r3)
            r0.A01 = r13
            r0.A02 = r10
            r0.A00 = r1
            r12.add(r0)
            int r14 = r14 + 1
            goto L_0x00db
        L_0x0108:
            r6.addAll(r12)
            r2 = 1
            r12 = 1
            goto L_0x008a
        L_0x010f:
            if (r3 == 0) goto L_0x005a
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131894714(0x7f1221ba, float:1.942424E38)
            java.lang.String r4 = X.AnonymousClass3MY.A0m(r1, r0)
            r0 = 14
            X.8jX r1 = new X.8jX
            r1.<init>(r0)
            r1.A01 = r3
            goto L_0x0055
        L_0x0127:
            r12 = 0
        L_0x0128:
            X.A7x r8 = r5.A0B
            monitor-enter(r8)
            X.9yf r0 = X.A76.A00(r8, r9)     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x0134
            monitor-exit(r8)
            goto L_0x01d8
        L_0x0134:
            java.util.LinkedHashSet r10 = X.C17880vN.A14()     // Catch:{ all -> 0x01f3 }
            java.util.List r0 = r0.A06     // Catch:{ all -> 0x01f3 }
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x01f3 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x01f3 }
        L_0x0142:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0189
            java.lang.Object r3 = r11.next()     // Catch:{ all -> 0x01f3 }
            r1 = r3
            X.AEv r1 = (X.C20287AEv) r1     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = r1.A0H     // Catch:{ all -> 0x01f3 }
            boolean r0 = r10.contains(r0)     // Catch:{ all -> 0x01f3 }
            if (r0 != 0) goto L_0x017d
            X.AE6 r0 = r1.A05     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0185
            X.ADW r0 = r0.A00     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0185
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0185
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)     // Catch:{ all -> 0x01f3 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01f3 }
        L_0x016b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01f3 }
            if (r0 == 0) goto L_0x0182
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x01f3 }
            X.ADo r0 = (X.C20256ADo) r0     // Catch:{ all -> 0x01f3 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x01f3 }
            r2.add(r0)     // Catch:{ all -> 0x01f3 }
            goto L_0x016b
        L_0x017d:
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0142
            goto L_0x0185
        L_0x0182:
            r10.addAll(r2)     // Catch:{ all -> 0x01f3 }
        L_0x0185:
            r9.add(r3)     // Catch:{ all -> 0x01f3 }
            goto L_0x0142
        L_0x0189:
            java.util.List r3 = java.util.Collections.unmodifiableList(r9)     // Catch:{ all -> 0x01f3 }
            monitor-exit(r8)
            if (r3 == 0) goto L_0x01d8
            if (r12 != 0) goto L_0x0196
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x01a7
        L_0x0196:
            r0 = 2131888364(0x7f1208ec, float:1.9411361E38)
            java.lang.String r2 = r7.getString(r0)
            java.lang.String r1 = "catalog_products_all_items_collection_id"
            X.8jc r0 = new X.8jc
            r0.<init>(r1, r2, r4)
            r6.add(r0)
        L_0x01a7:
            java.util.Iterator r4 = r3.iterator()
        L_0x01ab:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01d8
            X.AEv r3 = X.AnonymousClass8BS.A0B(r4)
            boolean r0 = r5.A0d(r3)
            if (r0 == 0) goto L_0x01ab
            long r1 = r5.A0U(r3)
            X.8jb r0 = new X.8jb
            r0.<init>(r3, r1)
            r6.add(r0)
            goto L_0x01ab
        L_0x01c8:
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x0128
            X.9q5 r0 = r11.A05(r9)
            if (r0 == 0) goto L_0x0128
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0128
        L_0x01d8:
            int r1 = r5.A00()
            r0 = -1
            if (r1 != r0) goto L_0x01f2
            r0 = 2
            X.8jW r1 = new X.8jW
            r1.<init>(r0)
            r0 = 5
            r1.A00 = r0
            r6.add(r1)
            int r0 = X.AnonymousClass3MX.A01(r6)
            r5.A0H(r0)
        L_0x01f2:
            return
        L_0x01f3:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167938i1.A0c(com.whatsapp.jid.UserJid):void");
    }

    public boolean A0d(C20287AEv aEv) {
        C18070vi.A0d(aEv, 0);
        if (!aEv.A01()) {
            return false;
        }
        Integer num = this.A0D.A01;
        if (num == null || num.intValue() != 404) {
            return true;
        }
        return false;
    }

    public C185599cq BOv(int i) {
        int i2 = 0;
        String str = null;
        if (i < 0) {
            return null;
        }
        boolean z = false;
        int i3 = -1;
        int i4 = -1;
        while (true) {
            C182999Wn r1 = (C182999Wn) this.A00.get(i2);
            if (r1 instanceof C168748jc) {
                i3++;
                str = ((C168748jc) r1).A02;
                z = true;
                i4 = -1;
            }
            if (r1 instanceof C168738jb) {
                if (!z) {
                    return null;
                }
                i4++;
            }
            if (i2 != i) {
                i2++;
            } else if (!z) {
                return null;
            } else {
                if ("catalog_products_all_items_collection_id".equals(str)) {
                    return new C185599cq((String) null, String.valueOf(i4), (String) null);
                }
                return new C185599cq(String.valueOf(i3), String.valueOf(i4), str);
            }
        }
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        int i2 = i;
        if (i2 == 2) {
            List list = C42011xT.A0I;
            UserJid userJid = this.A07;
            AnonymousClass11S r5 = this.A03;
            AnonymousClass1L9 r4 = this.A02;
            AnonymousClass1M9 r6 = this.A0F;
            C24921Me r8 = this.A0H;
            AnonymousClass1PM r7 = this.A0G;
            C18070vi.A0d(r6, 4);
            C72473Md.A1J(r8, r7);
            return new C168828jk(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624376), r4, r5, r6, r7, r8, userJid);
        } else if (i2 == 5) {
            C56412hQ r42 = this.A09;
            List list2 = C42011xT.A0I;
            return r42.A00(AnonymousClass9PR.A00(viewGroup), new C182919Wf(897462978), this, this, (B7Q) null, this.A0E, this.A07);
        } else if (i2 == 7) {
            List list3 = C42011xT.A0I;
            return new C168848jm(C108955ca.A0G(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626622, false), this.A02, this, this, this.A07);
        } else if (i2 == 10) {
            return new C42011xT(C108955ca.A0G(LayoutInflater.from(AnonymousClass3MY.A05(viewGroup)), viewGroup, 2131624378, false));
        } else {
            switch (i) {
                case 14:
                    List list4 = C42011xT.A0I;
                    Activity activity = this.A08;
                    C18070vi.A0z(activity, "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.viewholder.PostcodeHeaderViewHolder.PostcodeHeaderEventsListener");
                    B7M b7m = (B7M) activity;
                    View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131626507, viewGroup, C72453Mb.A1Z(b7m));
                    AnonymousClass3Ma.A1C(inflate, b7m, 30);
                    b7m.setPostcodeAndLocationViews(inflate);
                    return new C168808ji(inflate);
                case 15:
                    List list5 = C42011xT.A0I;
                    C20005A2v a2v = this.A05;
                    AnonymousClass8F8 r43 = this.A0D;
                    View inflate2 = AnonymousClass3MZ.A0D(viewGroup).inflate(2131624504, viewGroup, C108975cc.A1J(r43));
                    C18070vi.A0z(inflate2, "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.CategoryMediaCard");
                    return new C168818jj(a2v, (CategoryMediaCard) inflate2, r43);
                case 16:
                    List list6 = C42011xT.A0I;
                    AnonymousClass8F8 r44 = this.A0D;
                    return new C168798jh(C108955ca.A0G(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624503, C72453Mb.A1Z(r44)), r44);
                default:
                    if (i2 != 1) {
                        return super.A0V(viewGroup, i2);
                    }
                    List list7 = C42011xT.A0I;
                    UserJid userJid2 = this.A07;
                    AnonymousClass11S r62 = this.A03;
                    AnonymousClass1L9 r52 = this.A02;
                    Activity activity2 = this.A08;
                    C18070vi.A0z(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    AnonymousClass1GP A0O = AnonymousClass3MX.A0O((AnonymousClass1FL) activity2);
                    C18030ve r9 = this.A06;
                    C36401np r12 = this.A0M;
                    AnonymousClass18K r10 = this.A0K;
                    return new C168838jl(C108955ca.A0G(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624377, false), A0O, r52, r62, this, this.A0I, r9, r10, userJid2, r12);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C167938i1(android.app.Activity r24, X.AnonymousClass1L9 r25, X.C56412hQ r26, X.AnonymousClass11S r27, X.C132216mP r28, X.C20114A7x r29, com.whatsapp.biz.catalog.manager.CatalogManager r30, X.C20005A2v r31, X.C189029iO r32, X.AnonymousClass8F8 r33, X.C22369B4x r34, X.AnonymousClass1M9 r35, X.AnonymousClass1PM r36, X.C24921Me r37, X.AnonymousClass11C r38, X.C19830z4 r39, X.C18030ve r40, X.AnonymousClass18K r41, X.AnonymousClass1MB r42, com.whatsapp.jid.UserJid r43, X.C36401np r44) {
        /*
            r23 = this;
            r4 = r44
            r5 = r40
            r18 = r27
            r17 = r25
            r13 = r28
            r1 = r18
            r0 = r17
            X.C18070vi.A0w(r5, r1, r13, r4, r0)
            r11 = r31
            r14 = r30
            r0 = r42
            r15 = r29
            r7 = r38
            X.C18070vi.A0x(r14, r7, r11, r0, r15)
            r8 = r37
            r10 = r35
            r1 = r41
            X.C18070vi.A0r(r1, r10, r8)
            r2 = 15
            r9 = r36
            X.C18070vi.A0d(r9, r2)
            r6 = r39
            r12 = r26
            X.C18070vi.A0m(r6, r12)
            r3 = 1
            r2 = r23
            r22 = r43
            r19 = r14
            r20 = r11
            r21 = r5
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2.A0A = r13
            r2.A0L = r0
            r2.A0B = r15
            r0 = r24
            r2.A08 = r0
            r2.A0M = r4
            r2.A0K = r1
            r2.A0I = r7
            r0 = 1
            r2.A00 = r0
            java.util.HashMap r0 = X.C17880vN.A11()
            r2.A0N = r0
            r2.A0K(r3)
            r2.A0F = r10
            r2.A0H = r8
            r0 = r32
            r2.A0C = r0
            r2.A0G = r9
            r2.A0J = r6
            r2.A09 = r12
            r0 = r33
            r2.A0D = r0
            r0 = r34
            r2.A0E = r0
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r2.A04 = r0
            r0 = r22
            r2.A0c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167938i1.<init>(android.app.Activity, X.1L9, X.2hQ, X.11S, X.6mP, X.A7x, com.whatsapp.biz.catalog.manager.CatalogManager, X.A2v, X.9iO, X.8F8, X.B4x, X.1M9, X.1PM, X.1Me, X.11C, X.0z4, X.0ve, X.18K, X.1MB, com.whatsapp.jid.UserJid, X.1np):void");
    }

    private final int A00() {
        List list = this.A00;
        if (list.size() <= 0 || !(list.get(AnonymousClass3MX.A01(list)) instanceof C168688jW)) {
            return -1;
        }
        return AnonymousClass3MX.A01(list);
    }

    public final void A0Z() {
        List list = this.A00;
        if (list.size() <= 0 || !(C108955ca.A0p(list) instanceof C168668jU)) {
            list.add(0, new C182999Wn(1));
            A0H(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        if (r0 != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0a() {
        /*
            r4 = this;
            com.whatsapp.biz.catalog.manager.CatalogManager r2 = r4.A04
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "CatalogListAdapterBase updateLoadingView() hide loading view"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A0W()
        L_0x0012:
            int r1 = r4.A00()
            r0 = -1
            if (r1 == r0) goto L_0x0056
            X.8jW r3 = X.C168758jd.A02(r4, r1)
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x004d
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x004d
            X.A7x r2 = r4.A0B
            com.whatsapp.jid.UserJid r1 = r4.A07
            boolean r0 = r2.A0P(r1)
            if (r0 != 0) goto L_0x0053
            monitor-enter(r2)
            goto L_0x003a
        L_0x0031:
            java.lang.String r0 = "CatalogListAdapterBase updateLoadingView() show loading view"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4.A0X()
            goto L_0x0012
        L_0x003a:
            X.9yf r0 = X.A76.A00(r2, r1)     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0043
            monitor-exit(r2)
            r0 = 0
            goto L_0x0050
        L_0x0043:
            java.util.List r0 = r0.A05     // Catch:{ all -> 0x004a }
            boolean r0 = X.AnonymousClass000.A1a(r0)     // Catch:{ all -> 0x004a }
            goto L_0x004f
        L_0x004a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x004d:
            r1 = 5
            goto L_0x0054
        L_0x004f:
            monitor-exit(r2)
        L_0x0050:
            r1 = 3
            if (r0 == 0) goto L_0x0054
        L_0x0053:
            r1 = 1
        L_0x0054:
            r3.A00 = r1
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167938i1.A0a():void");
    }

    public final void A0b(int i) {
        int i2;
        if (i == 404) {
            A0c(this.A07);
            notifyDataSetChanged();
        }
        CatalogManager catalogManager = this.A04;
        if (catalogManager.A02 || catalogManager.A01) {
            Log.i("CatalogListAdapterBase updateLoadingView() show loading view");
            A0X();
        } else {
            Log.i("CatalogListAdapterBase updateLoadingView() hide loading view");
            A0W();
        }
        int A002 = A00();
        if (A002 == -1) {
            Log.i("CatalogListAdapterBase onFetchCatalogFail() no footer view");
            return;
        }
        C168688jW A022 = C168758jd.A02(this, A002);
        if (i != -1) {
            i2 = 1;
            if (i != 404) {
                if (i != 406) {
                    C17900vP.A0k("CatalogListAdapterBase business-catalog-list-adapter/request-catalog/fetch-catalog-error/error: ", AnonymousClass000.A10(), i);
                    i2 = 2;
                } else {
                    Activity activity = this.A08;
                    AnonymousClass11S r3 = this.A03;
                    C132216mP r5 = this.A0A;
                    AnonymousClass1MB r6 = this.A0L;
                    WeakReference weakReference = C180509Mv.A00;
                    if (weakReference == null || weakReference.get() == null || !((Dialog) weakReference.get()).isShowing()) {
                        r3.A0I();
                        Me me = r3.A00;
                        C73203Rj A003 = AnonymousClass4a6.A00(activity);
                        A003.A0D(2131887976);
                        A003.A0T(true);
                        A003.A0Z((DialogInterface.OnClickListener) null, 2131898766);
                        A003.A0Y(new AnonymousClass4b0(r5, r6, activity, me, 1), 2131895062);
                        C010105w create = A003.create();
                        C180509Mv.A00 = AnonymousClass3MW.A0z(create);
                        create.show();
                    }
                    A0G(A002);
                }
            }
        } else {
            i2 = 4;
        }
        A022.A00 = i2;
        A0G(A002);
    }

    public static void A01(C167938i1 r0, UserJid userJid) {
        r0.A0c(userJid);
        r0.A0a();
        r0.notifyDataSetChanged();
    }

    public long A0M(int i) {
        String str;
        StringBuilder sb;
        String str2;
        switch (getItemViewType(i)) {
            case 1:
                return -2;
            case 2:
                return -3;
            case 3:
                return -4;
            case 4:
                return -5;
            case 5:
                Object obj = this.A00.get(i);
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.model.ProductDisplayItem");
                C168738jb r2 = (C168738jb) obj;
                str = AnonymousClass000.A0y(r2.A01.A0H, AnonymousClass000.A11("product_"));
                String str3 = r2.A02;
                if (str3 != null) {
                    str = AnonymousClass001.A1H("_in_collection_", str3, AnonymousClass000.A11(str));
                    break;
                }
                break;
            case 6:
                return -6;
            case 7:
                Object obj2 = this.A00.get(i);
                C18070vi.A0z(obj2, "null cannot be cast to non-null type com.whatsapp.biz.collection.view.adapter.model.CollectionHeaderDisplayItem");
                sb = AnonymousClass000.A10();
                sb.append("collection_");
                str2 = ((C168748jc) obj2).A02;
                break;
            case 8:
                Object obj3 = this.A00.get(i);
                C18070vi.A0z(obj3, "null cannot be cast to non-null type com.whatsapp.biz.collection.view.adapter.model.CollectionReviewStatusBannerDisplayItem");
                sb = AnonymousClass000.A10();
                sb.append("collection_review_status_banner");
                str2 = ((C168728ja) obj3).A00;
                break;
            case 9:
                return -7;
            case 10:
                return -8;
            case 11:
                return -10;
            case 12:
                C18070vi.A0z(this.A00.get(i), "null cannot be cast to non-null type com.whatsapp.biz.catalog.view.adapter.model.OrderCatalogPickerDisplayItem");
                throw AnonymousClass000.A0s("getOrderProduct");
            case 13:
                return -9;
            case 14:
                return -11;
            case 15:
                return -12;
            default:
                return -13;
        }
        str = AnonymousClass000.A0y(str2, sb);
        Map map = this.A0N;
        if (!map.containsKey(str)) {
            long j = this.A00;
            this.A00 = 1 + j;
            AnonymousClass8BT.A1O(str, map, j);
        }
        return C17880vN.A05(C200510q.A01(str, map));
    }
}
