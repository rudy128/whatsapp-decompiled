package X;

import android.view.LayoutInflater;
import android.view.ViewTreeObserver;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.6CG  reason: invalid class name */
public class AnonymousClass6CG extends C136866uX implements AnonymousClass8AV {
    public static final String[] A0Q = {"recents", "starred", "id_all", "id_love", "id_haha", "id_sad", "id_angry", "id_reaction", "id_lifestyle"};
    public int A00;
    public int A01;
    public AnonymousClass1BI A02;
    public C114605rK A03;
    public AnonymousClass88B A04;
    public List A05 = AnonymousClass000.A13();
    public boolean A06 = false;
    public boolean A07 = false;
    public final int A08 = 9;
    public final int A09;
    public final int A0A;
    public final LayoutInflater A0B;
    public final ViewTreeObserver.OnGlobalLayoutListener A0C;
    public final AnonymousClass1KB A0D;
    public final C18030ve A0E;
    public final AnonymousClass717 A0F;
    public final C26631Sw A0G;
    public final AnonymousClass1SB A0H;
    public final AnonymousClass88B A0I;
    public final AnonymousClass722 A0J;
    public final C145237Km A0K;
    public final C121156Hy A0L;
    public final C121146Hx A0M;
    public final StickerPackDownloader A0N;
    public final AnonymousClass10I A0O;
    public final C137356vK A0P;

    public void C6r(String str, HashMap hashMap, HashMap hashMap2, HashSet hashSet, List list, int i) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.6oW, java.lang.Object] */
    private AnonymousClass725 A00(String str) {
        ? obj = new Object();
        obj.A0E = str;
        obj.A0G = "";
        obj.A0I = "";
        ArrayList A13 = AnonymousClass000.A13();
        int i = 0;
        do {
            C1418377d r1 = new C1418377d();
            r1.A0F = "loading-hash";
            A13.add(r1);
            i++;
        } while (i < 16);
        obj.A0O = A13;
        obj.A0N = new LinkedList();
        obj.A0Z = false;
        obj.A0S = true;
        obj.A0V = false;
        return new AnonymousClass725(obj);
    }

    public static void A02(String str, String str2, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new C121066Hp(i, str, str2));
    }

    public void A07(String str) {
        List<AnonymousClass89I> list = this.A05;
        for (AnonymousClass89I r2 : list) {
            if (str.equals(r2.getId())) {
                A05(list.indexOf(r2), true);
                try {
                    ((C145227Kl) r2).A04(this.A02, true);
                    return;
                } catch (Exception e) {
                    Log.e("AvatarStickerPicker/selectPageById/Error setting current displayed tab", e);
                    return;
                }
            }
        }
    }

    public void Bu2(boolean z, boolean z2) {
        this.A0M.A01();
        if (this.A06 && z && !z2) {
            A07("starred");
        }
    }

    public void C2h() {
        this.A0L.A01();
    }

    public void C6v(AnonymousClass725 r4) {
        if (r4.A0S) {
            this.A0O.CGN(new AnonymousClass7RQ(this, r4, 35));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r6.A0L.A0A.A03() != 0) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r6 = this;
            int r2 = r6.A03()
            java.lang.String r4 = "recents"
            if (r2 < 0) goto L_0x006a
            java.util.List r1 = r6.A05
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x006a
            java.lang.Object r0 = r1.get(r2)
            X.89I r0 = (X.AnonymousClass89I) r0
            java.lang.String r3 = r0.getId()
            boolean r0 = r4.equals(r3)
            r5 = 1
            if (r0 == 0) goto L_0x002c
            X.6Hy r0 = r6.A0L
            X.67t r0 = r0.A0A
            int r0 = r0.A03()
            r2 = 1
            if (r0 == 0) goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            java.lang.String r1 = "starred"
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x0068
            X.6Hx r0 = r6.A0M
            X.5l4 r0 = r0.A00()
            int r0 = r0.A0Q()
            if (r0 != 0) goto L_0x0068
        L_0x0041:
            if (r2 == 0) goto L_0x0054
            X.6Hx r0 = r6.A0M
            X.5l4 r0 = r0.A00()
            int r0 = r0.A0Q()
            if (r0 == 0) goto L_0x0054
            r4 = r1
        L_0x0050:
            r6.A07(r4)
            return
        L_0x0054:
            if (r5 == 0) goto L_0x0060
            X.6Hy r0 = r6.A0L
            X.67t r0 = r0.A0A
            int r0 = r0.A03()
            if (r0 != 0) goto L_0x0050
        L_0x0060:
            if (r2 != 0) goto L_0x0064
            if (r5 == 0) goto L_0x0066
        L_0x0064:
            java.lang.String r3 = "id_all"
        L_0x0066:
            r4 = r3
            goto L_0x0050
        L_0x0068:
            r5 = 0
            goto L_0x0041
        L_0x006a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AvatarStickerPicker/getDesiredPageId/pagePos out of bounds, pages.size()="
            r1.append(r0)
            java.util.List r0 = r6.A05
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = ", index="
            X.C17900vP.A0i(r0, r1, r2)
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6CG.A01():void");
    }

    public void CKs(String str, HashMap hashMap, HashMap hashMap2, HashSet hashSet, List list) {
        String A0y;
        if (list.size() == 0) {
            A0y = "AvatarStickerPicker/setStickerPacks Avatar sticker pack is empty";
        } else {
            Iterator A0j = C17890vO.A0j(hashMap);
            while (A0j.hasNext()) {
                if (C108945cZ.A0y(A0j).A0S) {
                    this.A07 = true;
                    for (int i = 2; i < this.A08; i++) {
                        C121136Hw r1 = (C121136Hw) this.A05.get(i);
                        r1.A06(A00(A0Q[i]));
                        r1.A01();
                    }
                    C121156Hy r6 = this.A0L;
                    r6.A05((C1418377d) null);
                    C121146Hx r5 = this.A0M;
                    r5.A05((C1418377d) null);
                    List list2 = r6.A06;
                    if (list2 != null && list2.size() > 0) {
                        int size = list2.size();
                        ArrayList A13 = AnonymousClass000.A13();
                        for (int i2 = 0; i2 < size; i2++) {
                            C1418377d r12 = new C1418377d();
                            r12.A0F = "loading-hash";
                            A13.add(r12);
                        }
                        r6.A06(A13);
                    }
                    List list3 = r5.A02;
                    if (list3 != null && list3.size() > 0) {
                        int size2 = list3.size();
                        ArrayList A132 = AnonymousClass000.A13();
                        for (int i3 = 0; i3 < size2; i3++) {
                            C1418377d r13 = new C1418377d();
                            r13.A0F = "loading-hash";
                            A132.add(r13);
                        }
                        r5.A06(A132);
                    }
                    A01();
                    return;
                }
            }
            if (this.A07) {
                this.A07 = false;
                C121156Hy r14 = this.A0L;
                List list4 = r14.A06;
                if (list4 == null ? r14.A0A.A03() != 0 : !list4.isEmpty()) {
                    r14.A06 = null;
                    r14.A01();
                }
                C121146Hx r15 = this.A0M;
                List list5 = r15.A02;
                if (list5 == null ? r15.A00().A0Q() != 0 : !list5.isEmpty()) {
                    r15.A02 = null;
                    r15.A01();
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass725 A0y2 = C108945cZ.A0y(it);
                if (A0y2.A0S) {
                    if (str != null) {
                        A01();
                    }
                    this.A0O.CGN(new AnonymousClass7RQ(this, A0y2, 35));
                    return;
                }
            }
            StringBuilder A10 = AnonymousClass000.A10();
            C17890vO.A15("AvatarStickerPicker/setStickerPacks got ", A10, list);
            A0y = AnonymousClass000.A0y(" sticker packs, but no Avatar sticker pack", A10);
        }
        Log.e(A0y);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6CG(android.app.Activity r29, android.view.ViewGroup r30, X.C39711tW r31, X.AnonymousClass1KB r32, X.AnonymousClass11S r33, X.C18000vb r34, X.C18030ve r35, X.AnonymousClass1BI r36, X.AnonymousClass73V r37, X.C136936ue r38, X.C137356vK r39, X.C1193467t r40, X.C26631Sw r41, X.AnonymousClass1SB r42, X.AnonymousClass722 r43, com.whatsapp.stickers.stickerpack.StickerPackDownloader r44, X.AnonymousClass10I r45) {
        /*
            r28 = this;
            r9 = 0
            r16 = 2131427998(0x7f0b029e, float:1.8477628E38)
            r4 = r28
            r14 = r31
            r10 = r30
            r2 = r29
            r27 = r34
            r11 = r4
            r12 = r2
            r13 = r10
            r15 = r27
            r11.<init>(r12, r13, r14, r15, r16)
            r0 = 9
            r4.A08 = r0
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r4.A05 = r0
            r4.A06 = r9
            r4.A07 = r9
            r5 = 8
            X.7MW r13 = new X.7MW
            r13.<init>(r4, r5)
            r4.A0I = r13
            r1 = 24
            X.793 r0 = new X.793
            r0.<init>(r4, r1)
            r4.A0C = r0
            r20 = r35
            r0 = r20
            r4.A0E = r0
            r0 = r32
            r4.A0D = r0
            r0 = r45
            r4.A0O = r0
            r3 = r43
            r4.A0J = r3
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r2)
            r4.A0B = r12
            r14 = r42
            r4.A0H = r14
            r0 = r39
            r4.A0P = r0
            r0 = r44
            r4.A0N = r0
            r15 = r41
            r4.A0G = r15
            r0 = r36
            r4.A02 = r0
            r1 = 2130969438(0x7f04035e, float:1.7547558E38)
            r0 = 2131100423(0x7f060307, float:1.7813227E38)
            int r0 = X.AnonymousClass3Ma.A00(r2, r1, r0)
            r4.A09 = r0
            androidx.viewpager.widget.ViewPager r0 = r4.A07
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r0)
            r0 = 2131168921(0x7f070e99, float:1.7952157E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r4.A0A = r0
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131168918(0x7f070e96, float:1.7952151E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.717 r0 = new X.717
            r0.<init>()
            r4.A0F = r0
            int r0 = r10.getWidth()
            r4.A01 = r0
            int r0 = r10.getHeight()
            int r0 = r0 - r1
            r4.A00 = r0
            android.content.Context r11 = r4.A05
            int r6 = r4.A0A
            int r1 = r4.A09
            r8 = 0
            X.6Hy r0 = new X.6Hy
            r22 = r40
            r19 = r33
            r26 = r1
            r21 = r4
            r23 = r15
            r24 = r13
            r25 = r6
            r18 = r12
            r16 = r0
            r17 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4.A0L = r0
            int r6 = r4.A0A
            r7 = 1
            int r1 = r4.A09
            X.6Hx r0 = new X.6Hx
            r16 = r11
            r17 = r12
            r18 = r20
            r19 = r15
            r20 = r14
            r21 = r13
            r22 = r6
            r23 = r1
            r24 = r7
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r4.A0M = r0
            X.89I[] r6 = new X.AnonymousClass89I[r9]
            X.5rK r1 = new X.5rK
            r0 = r27
            r1.<init>(r0, r6)
            r4.A03 = r1
            r4.A06(r1)
            X.7Km r6 = new X.7Km
            r6.<init>(r11, r10)
            r4.A0K = r6
            X.89w r1 = r4.A04
            if (r1 == 0) goto L_0x00fa
            r0 = 0
            r1.CIW(r0)
        L_0x00fa:
            r4.A04 = r6
            r6.CIW(r4)
            r0 = 2131427953(0x7f0b0271, float:1.8477537E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r10, r0)
            X.48k r0 = new X.48k
            r16 = r38
            r15 = r37
            r12 = r0
            r13 = r4
            r14 = r2
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            r1.setOnClickListener(r0)
            r0 = 2131886889(0x7f120329, float:1.940837E38)
            X.AnonymousClass3MY.A0w(r2, r1, r0)
            X.2LK r1 = r3.A0B
            X.6qF r0 = r3.A09
            r1.registerObserver(r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r6 = 2131232258(0x7f080602, float:1.808062E38)
            r0 = 2131886891(0x7f12032b, float:1.9408374E38)
            java.lang.String r2 = r11.getString(r0)
            java.lang.String r1 = "1"
            X.6Hq r0 = new X.6Hq
            r0.<init>(r9, r6, r1, r2)
            r3.add(r0)
            r6 = 2131232317(0x7f08063d, float:1.808074E38)
            r0 = 2131886890(0x7f12032a, float:1.9408372E38)
            java.lang.String r2 = r11.getString(r0)
            java.lang.String r1 = "2"
            X.6Hq r0 = new X.6Hq
            r0.<init>(r7, r6, r1, r2)
            r3.add(r0)
            r0 = 2131886892(0x7f12032c, float:1.9408376E38)
            java.lang.String r2 = r11.getString(r0)
            r1 = 2
            java.lang.String r0 = "3"
            A02(r0, r2, r3, r1)
            r0 = 2131886896(0x7f120330, float:1.9408384E38)
            java.lang.String r2 = r11.getString(r0)
            r1 = 3
            java.lang.String r0 = "4"
            A02(r0, r2, r3, r1)
            r0 = 2131886894(0x7f12032e, float:1.940838E38)
            java.lang.String r2 = r11.getString(r0)
            r1 = 4
            java.lang.String r0 = "5"
            A02(r0, r2, r3, r1)
            r0 = 2131886898(0x7f120332, float:1.9408388E38)
            java.lang.String r2 = r11.getString(r0)
            r1 = 5
            java.lang.String r0 = "6"
            A02(r0, r2, r3, r1)
            r0 = 2131886893(0x7f12032d, float:1.9408378E38)
            java.lang.String r2 = r11.getString(r0)
            r1 = 6
            java.lang.String r0 = "7"
            A02(r0, r2, r3, r1)
            r0 = 2131886897(0x7f120331, float:1.9408386E38)
            java.lang.String r2 = r11.getString(r0)
            r1 = 7
            java.lang.String r0 = "8"
            A02(r0, r2, r3, r1)
            X.0ve r2 = r4.A0E
            r1 = 4821(0x12d5, float:6.756E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x01b6
            r0 = 2131886895(0x7f12032f, float:1.9408382E38)
            java.lang.String r1 = r11.getString(r0)
            java.lang.String r0 = "9"
            A02(r0, r1, r3, r5)
        L_0x01b6:
            X.7Km r1 = r4.A0K
            java.util.ArrayList r0 = r1.A05
            r0.clear()
            r0.addAll(r3)
            X.5kq r2 = r1.A04
            java.util.List r1 = r2.A00
            X.5jg r0 = new X.5jg
            r0.<init>(r1, r3)
            X.C72473Md.A1B(r0, r2, r3, r1)
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            X.6Hy r0 = r4.A0L
            r10.add(r0)
            X.6Hx r0 = r4.A0M
            r10.add(r0)
            r12 = 2
        L_0x01db:
            int r0 = r4.A08
            if (r12 >= r0) goto L_0x0212
            java.lang.String[] r0 = A0Q
            r0 = r0[r12]
            X.0ve r9 = r4.A0E
            android.view.LayoutInflater r7 = r4.A0B
            X.1SB r6 = r4.A0H
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r5 = r4.A0N
            X.1Sw r3 = r4.A0G
            X.88B r2 = r4.A0I
            int r1 = r4.A0A
            X.725 r18 = r4.A00(r0)
            int r0 = r4.A09
            X.6Hw r13 = new X.6Hw
            r14 = r11
            r15 = r7
            r16 = r9
            r17 = r3
            r19 = r6
            r20 = r2
            r21 = r5
            r22 = r1
            r23 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r10.add(r13)
            int r12 = r12 + 1
            goto L_0x01db
        L_0x0212:
            r4.A05 = r10
            int r0 = r10.size()
            X.89I[] r0 = new X.AnonymousClass89I[r0]
            java.lang.Object[] r2 = r10.toArray(r0)
            X.89I[] r2 = (X.AnonymousClass89I[]) r2
            X.5rK r0 = r4.A03
            if (r0 != 0) goto L_0x0231
            X.0vb r1 = r4.A08
            X.5rK r0 = new X.5rK
            r0.<init>(r1, r2)
            r4.A03 = r0
            r4.A06(r0)
            return
        L_0x0231:
            X.C18070vi.A0d(r2, r8)
            X.C114605rK.A01(r0, r2)
            r0.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6CG.<init>(android.app.Activity, android.view.ViewGroup, X.1tW, X.1KB, X.11S, X.0vb, X.0ve, X.1BI, X.73V, X.6ue, X.6vK, X.67t, X.1Sw, X.1SB, X.722, com.whatsapp.stickers.stickerpack.StickerPackDownloader, X.10I):void");
    }
}
