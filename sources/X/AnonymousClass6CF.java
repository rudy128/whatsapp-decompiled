package X;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6CF  reason: invalid class name */
public class AnonymousClass6CF extends C136866uX implements AnonymousClass8AV {
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public View A04;
    public AnonymousClass1BI A05;
    public C114605rK A06;
    public AnonymousClass7MX A07;
    public AnonymousClass88B A08;
    public C121116Hu A09;
    public C121156Hy A0A;
    public C121146Hx A0B;
    public C145227Kl A0C;
    public String A0D;
    public List A0E;
    public boolean A0F = false;
    public C121126Hv A0G;
    public C121126Hv A0H;
    public C121126Hv A0I;
    public C121126Hv A0J;
    public HashMap A0K;
    public List A0L;
    public boolean A0M = false;
    public final int A0N;
    public final int A0O;
    public final LayoutInflater A0P;
    public final ViewTreeObserver.OnGlobalLayoutListener A0Q = new AnonymousClass793(this, 23);
    public final AnonymousClass190 A0R;
    public final AnonymousClass11S A0S;
    public final C18030ve A0T;
    public final AnonymousClass18K A0U;
    public final C25271No A0V;
    public final C26631Sw A0W;
    public final AnonymousClass714 A0X;
    public final AnonymousClass1SB A0Y;
    public final AnonymousClass88B A0Z = new AnonymousClass7MW(this, 7);
    public final C111185ii A0a;
    public final C145247Kn A0b;
    public final AnonymousClass722 A0c;
    public final C19830z4 A0d;
    public final AnonymousClass2LK A0e;
    public final AnonymousClass6pA A0f;
    public final StickerPackDownloader A0g;
    public final AnonymousClass00H A0h;

    public static void A01(AnonymousClass6CF r3) {
        C145227Kl[] r2 = (C145227Kl[]) r3.A0E.toArray(new C145227Kl[0]);
        r3.A0b.A00(r2);
        C114605rK r1 = r3.A06;
        if (r1 != null) {
            C18070vi.A0d(r2, 0);
            C114605rK.A01(r1, r2);
            r1.A04();
            r3.A06.A04();
        }
    }

    public static boolean A02(AnonymousClass6CF r1) {
        C111185ii r0;
        AnonymousClass6pA r02 = r1.A0f;
        if (!(r02 == null || !r02.A01() || (r0 = r1.A0a) == null)) {
            AnonymousClass1DT r12 = r0.A02;
            if (r12.A06() == null || AnonymousClass3MW.A10(r12).isEmpty()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A07() {
        if (this.A04.getVisibility() == 0) {
            C19830z4 r8 = this.A0d;
            long A052 = C17890vO.A05(C17890vO.A0B(r8), "sticker_store_update_hidden_time");
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - A052 >= 604800000) {
                C17880vN.A1D(C19830z4.A00(r8), "sticker_store_update_hidden_time", currentTimeMillis);
            }
        }
        AnonymousClass7KX.A00(this.A0e, 33);
        Context context = this.A05;
        Intent A0A2 = C17880vN.A0A();
        A0A2.setClassName(context.getPackageName(), "com.whatsapp.stickers.store.StickerStoreActivity");
        context.startActivity(A0A2);
        this.A0U.CC7(new C1179861s());
    }

    public void Bu2(boolean z, boolean z2) {
        C121146Hx r0 = this.A0B;
        if (r0 != null) {
            r0.A01();
            if (this.A0F && z && !z2) {
                this.A0D = "starred";
                C145227Kl A002 = A00("starred", this.A0E);
                if (A002 != null) {
                    A05(this.A0E.indexOf(A002), true);
                    this.A0D = null;
                }
            }
        }
    }

    public void C2h() {
        C121156Hy r0 = this.A0A;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void C6r(String str, HashMap hashMap, HashMap hashMap2, HashSet hashSet, List list, int i) {
        if (!this.A0K.containsKey(str)) {
            CKs((String) null, hashMap, hashMap2, hashSet, list);
            return;
        }
        C121136Hw r0 = (C121136Hw) this.A0K.get(str);
        r0.A00 = i;
        r0.A05();
    }

    public void C6v(AnonymousClass725 r3) {
        C121136Hw r0 = (C121136Hw) this.A0K.get(r3.A0H);
        if (r0 != null) {
            r0.A06(r3);
            r0.A01();
        }
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [X.6oW, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04a0, code lost:
        if (r9 == false) goto L_0x04a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x051e, code lost:
        if (r32 != null) goto L_0x0520;
     */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x04d8 A[LOOP:10: B:162:0x04d2->B:164:0x04d8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x051e  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0548  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CKs(java.lang.String r32, java.util.HashMap r33, java.util.HashMap r34, java.util.HashSet r35, java.util.List r36) {
        /*
            r31 = this;
            r8 = r31
            java.util.List r0 = r8.A0L
            boolean r17 = X.AnonymousClass000.A1W(r0)
            r29 = r36
            r0 = r29
            r8.A0L = r0
            java.util.Iterator r2 = r29.iterator()
        L_0x0012:
            boolean r0 = r2.hasNext()
            r5 = 8
            if (r0 == 0) goto L_0x0093
            X.725 r1 = X.C108945cZ.A0y(r2)
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0012
            boolean r0 = r1.A0S
            if (r0 != 0) goto L_0x0012
            X.0z4 r0 = r8.A0d
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "sticker_store_update_hidden_time"
            long r0 = X.C17890vO.A05(r1, r0)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1Q(r0)
            android.view.View r0 = r8.A04
            if (r1 == 0) goto L_0x0047
            r5 = 0
        L_0x0047:
            r0.setVisibility(r5)
            int r14 = r29.size()
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r29.iterator()
        L_0x0066:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0096
            X.725 r1 = X.C108945cZ.A0y(r4)
            boolean r0 = r1.A0S
            if (r0 != 0) goto L_0x0066
            java.util.List r0 = r1.A07
            java.util.Iterator r2 = r0.iterator()
        L_0x007a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0066
            X.77d r1 = X.C108945cZ.A0x(r2)
            X.73B r0 = r1.A04
            if (r0 == 0) goto L_0x007a
            X.737[] r0 = r0.A0H
            if (r0 == 0) goto L_0x007a
            int r0 = r0.length
            if (r0 <= 0) goto L_0x007a
            r3.add(r1)
            goto L_0x007a
        L_0x0093:
            android.view.View r0 = r8.A04
            goto L_0x0047
        L_0x0096:
            int r0 = r3.size()
            r15 = 1
            if (r0 <= 0) goto L_0x00f8
            r15 = 0
            java.util.Iterator r13 = r3.iterator()
        L_0x00a2:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00ea
            X.77d r3 = X.C108945cZ.A0x(r13)
            X.714 r12 = r8.A0X
            X.73B r0 = r3.A04
            r7 = 0
            if (r0 == 0) goto L_0x00a2
            X.737[] r5 = r0.A0H
            if (r5 == 0) goto L_0x00a2
            int r4 = r5.length
            r2 = 0
        L_0x00b9:
            if (r7 >= r4) goto L_0x00cd
            r1 = r5[r7]
            java.util.HashMap r0 = r12.A00
            java.lang.Number r0 = X.C108945cZ.A1D(r1, r0)
            if (r0 == 0) goto L_0x00ca
            int r0 = r0.intValue()
            r2 = r2 | r0
        L_0x00ca:
            int r7 = r7 + 1
            goto L_0x00b9
        L_0x00cd:
            r0 = r2 & 1
            if (r0 == 0) goto L_0x00d4
            r11.add(r3)
        L_0x00d4:
            r0 = r2 & 8
            if (r0 == 0) goto L_0x00db
            r6.add(r3)
        L_0x00db:
            r0 = r2 & 4
            if (r0 == 0) goto L_0x00e2
            r9.add(r3)
        L_0x00e2:
            r0 = r2 & 2
            if (r0 == 0) goto L_0x00a2
            r10.add(r3)
            goto L_0x00a2
        L_0x00ea:
            r0 = 45
            X.C147027Rn.A01(r0, r11)
            X.C147027Rn.A01(r0, r6)
            X.C147027Rn.A01(r0, r9)
            X.C147027Rn.A01(r0, r10)
        L_0x00f8:
            java.util.ArrayList r7 = X.C17880vN.A0z(r14)
            boolean r0 = A02(r8)
            if (r0 == 0) goto L_0x013b
            X.6Hu r13 = r8.A09
            if (r13 != 0) goto L_0x012f
            X.0ve r14 = r8.A0T
            android.content.Context r12 = r8.A05
            android.view.LayoutInflater r5 = r8.A0P
            X.1Sw r4 = r8.A0W
            X.88B r3 = r8.A0Z
            X.5ii r2 = r8.A0a
            int r1 = r8.A0O
            int r0 = r8.A0N
            X.6Hu r13 = new X.6Hu
            r19 = r12
            r20 = r5
            r21 = r14
            r22 = r4
            r23 = r3
            r24 = r2
            r25 = r1
            r26 = r0
            r18 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r8.A09 = r13
        L_0x012f:
            androidx.recyclerview.widget.RecyclerView r0 = r13.A04
            if (r0 == 0) goto L_0x0136
            r13.A01()
        L_0x0136:
            X.6Hu r0 = r8.A09
            r7.add(r0)
        L_0x013b:
            X.6Hy r13 = r8.A0A
            if (r13 != 0) goto L_0x0170
            X.0ve r14 = r8.A0T
            android.content.Context r12 = r8.A05
            X.11S r5 = r8.A0S
            android.view.LayoutInflater r4 = r8.A0P
            X.00H r0 = r8.A0h
            X.67t r24 = X.C108945cZ.A0w(r0)
            X.1Sw r3 = r8.A0W
            X.88B r2 = r8.A0Z
            int r1 = r8.A0O
            int r0 = r8.A0N
            X.6Hy r13 = new X.6Hy
            r19 = r12
            r20 = r4
            r21 = r5
            r22 = r14
            r23 = r8
            r25 = r3
            r26 = r2
            r27 = r1
            r28 = r0
            r18 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r8.A0A = r13
        L_0x0170:
            int r0 = r29.size()
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r13.A07 = r0
            X.6Hy r0 = r8.A0A
            r7.add(r0)
            X.6Hx r13 = r8.A0B
            if (r13 != 0) goto L_0x01ae
            X.0ve r14 = r8.A0T
            android.content.Context r12 = r8.A05
            X.1SB r5 = r8.A0Y
            android.view.LayoutInflater r4 = r8.A0P
            X.1Sw r3 = r8.A0W
            X.88B r2 = r8.A0Z
            int r1 = r8.A0O
            int r0 = r8.A0N
            r27 = 0
            X.6Hx r13 = new X.6Hx
            r19 = r12
            r20 = r4
            r21 = r14
            r22 = r3
            r23 = r5
            r24 = r2
            r25 = r1
            r26 = r0
            r18 = r13
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r8.A0B = r13
        L_0x01ae:
            r7.add(r13)
            if (r15 != 0) goto L_0x0297
            X.6Hv r13 = r8.A0G
            if (r13 != 0) goto L_0x01de
            X.0ve r12 = r8.A0T
            android.content.Context r5 = r8.A05
            android.view.LayoutInflater r4 = r8.A0P
            X.1Sw r3 = r8.A0W
            X.88B r2 = r8.A0Z
            int r1 = r8.A0O
            int r0 = r8.A0N
            r24 = 1
            X.6Hv r13 = new X.6Hv
            r18 = r13
            r19 = r5
            r20 = r4
            r21 = r12
            r22 = r3
            r23 = r2
            r25 = r1
            r26 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r8.A0G = r13
        L_0x01de:
            r13.A01 = r11
            X.5l4 r0 = r13.A00()
            r0.A0U(r11)
            X.6Hv r0 = r8.A0G
            r7.add(r0)
            X.6Hv r12 = r8.A0H
            if (r12 != 0) goto L_0x0217
            X.0ve r11 = r8.A0T
            android.content.Context r5 = r8.A05
            android.view.LayoutInflater r4 = r8.A0P
            X.1Sw r3 = r8.A0W
            X.88B r2 = r8.A0Z
            int r1 = r8.A0O
            int r0 = r8.A0N
            r24 = 2
            X.6Hv r12 = new X.6Hv
            r18 = r12
            r19 = r5
            r20 = r4
            r21 = r11
            r22 = r3
            r23 = r2
            r25 = r1
            r26 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r8.A0H = r12
        L_0x0217:
            r12.A01 = r10
            X.5l4 r0 = r12.A00()
            r0.A0U(r10)
            X.6Hv r0 = r8.A0H
            r7.add(r0)
            X.6Hv r11 = r8.A0I
            if (r11 != 0) goto L_0x0250
            X.0ve r10 = r8.A0T
            android.content.Context r5 = r8.A05
            android.view.LayoutInflater r4 = r8.A0P
            X.1Sw r3 = r8.A0W
            X.88B r2 = r8.A0Z
            int r1 = r8.A0O
            int r0 = r8.A0N
            r24 = 4
            X.6Hv r11 = new X.6Hv
            r18 = r11
            r19 = r5
            r20 = r4
            r21 = r10
            r22 = r3
            r23 = r2
            r25 = r1
            r26 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r8.A0I = r11
        L_0x0250:
            r11.A01 = r9
            X.5l4 r0 = r11.A00()
            r0.A0U(r9)
            X.6Hv r0 = r8.A0I
            r7.add(r0)
            X.6Hv r10 = r8.A0J
            if (r10 != 0) goto L_0x0289
            X.0ve r9 = r8.A0T
            android.content.Context r5 = r8.A05
            android.view.LayoutInflater r4 = r8.A0P
            X.1Sw r3 = r8.A0W
            X.88B r2 = r8.A0Z
            int r1 = r8.A0O
            int r0 = r8.A0N
            r24 = 8
            X.6Hv r10 = new X.6Hv
            r18 = r10
            r19 = r5
            r20 = r4
            r21 = r9
            r22 = r3
            r23 = r2
            r25 = r1
            r26 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r8.A0J = r10
        L_0x0289:
            r10.A01 = r6
            X.5l4 r0 = r10.A00()
            r0.A0U(r6)
            X.6Hv r0 = r8.A0J
            r7.add(r0)
        L_0x0297:
            int r0 = r29.size()
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>(r0)
            java.util.Iterator r1 = r29.iterator()
        L_0x02a4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02b4
            X.725 r0 = X.C108945cZ.A0y(r1)
            java.lang.String r0 = r0.A0H
            r14.add(r0)
            goto L_0x02a4
        L_0x02b4:
            java.util.HashMap r13 = X.C17880vN.A11()
            r12 = 0
        L_0x02b9:
            int r0 = r29.size()
            if (r12 >= r0) goto L_0x0361
            r0 = r29
            java.lang.Object r11 = r0.get(r12)
            X.725 r11 = (X.AnonymousClass725) r11
            java.util.HashMap r1 = r8.A0K
            java.lang.String r0 = r11.A0H
            java.lang.Object r10 = r1.get(r0)
            X.6Hw r10 = (X.C121136Hw) r10
            boolean r0 = r11.A0S
            if (r0 != 0) goto L_0x0319
            r9 = r35
            if (r10 != 0) goto L_0x034a
            boolean r0 = r11.A0W
            if (r0 == 0) goto L_0x031c
            X.0ve r0 = r8.A0T
            r16 = r0
            android.content.Context r15 = r8.A05
            android.view.LayoutInflater r6 = r8.A0P
            X.1SB r5 = r8.A0Y
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r4 = r8.A0g
            X.1Sw r3 = r8.A0W
            X.88B r2 = r8.A0Z
            int r1 = r8.A0O
            int r0 = r8.A0N
            X.6Ht r10 = new X.6Ht
            r27 = r1
            r28 = r0
            r18 = r10
            r19 = r15
            r20 = r6
            r21 = r16
            r22 = r3
            r23 = r11
            r24 = r5
            r25 = r2
            r26 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.String r0 = r11.A0H
            boolean r0 = r9.contains(r0)
            r10.A02 = r0
        L_0x0314:
            java.lang.String r0 = r11.A0H
            r13.put(r0, r10)
        L_0x0319:
            int r12 = r12 + 1
            goto L_0x02b9
        L_0x031c:
            X.0ve r15 = r8.A0T
            android.content.Context r9 = r8.A05
            android.view.LayoutInflater r6 = r8.A0P
            X.1SB r5 = r8.A0Y
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r4 = r8.A0g
            X.1Sw r3 = r8.A0W
            X.88B r2 = r8.A0Z
            int r1 = r8.A0O
            int r0 = r8.A0N
            X.6Hw r10 = new X.6Hw
            r27 = r1
            r28 = r0
            r18 = r10
            r19 = r9
            r20 = r6
            r21 = r15
            r22 = r3
            r23 = r11
            r24 = r5
            r25 = r2
            r26 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0314
        L_0x034a:
            r10.A06(r11)
            boolean r0 = r11.A0W
            if (r0 == 0) goto L_0x0314
            boolean r0 = r10 instanceof X.C121106Ht
            if (r0 == 0) goto L_0x0314
            r1 = r10
            X.6Ht r1 = (X.C121106Ht) r1
            java.lang.String r0 = r11.A0H
            boolean r0 = r9.contains(r0)
            r1.A02 = r0
            goto L_0x0314
        L_0x0361:
            r30 = r34
            java.util.Set r0 = r30.keySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x036b:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x03f4
            java.lang.String r12 = X.C17880vN.A0v(r16)
            r0 = r33
            java.lang.Object r11 = r0.get(r12)
            X.725 r11 = (X.AnonymousClass725) r11
            if (r11 != 0) goto L_0x03a4
            X.6oW r1 = new X.6oW
            r1.<init>()
            r1.A0E = r12
            java.lang.String r0 = ""
            r1.A0G = r0
            r1.A0I = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.A0O = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.A0N = r0
            r0 = 1
            r1.A0Z = r0
            r1.A0V = r0
            X.725 r11 = new X.725
            r11.<init>(r1)
        L_0x03a4:
            boolean r0 = r13.containsKey(r12)
            if (r0 == 0) goto L_0x03c3
            java.lang.Object r10 = r13.get(r12)
            X.6Hw r10 = (X.C121136Hw) r10
            r10.A06(r11)
        L_0x03b3:
            r0 = r30
            java.lang.Object r0 = r0.get(r12)
            int r0 = X.AnonymousClass000.A0M(r0)
            r10.A00 = r0
            r10.A05()
            goto L_0x036b
        L_0x03c3:
            X.0ve r15 = r8.A0T
            android.content.Context r9 = r8.A05
            android.view.LayoutInflater r6 = r8.A0P
            X.1SB r5 = r8.A0Y
            com.whatsapp.stickers.stickerpack.StickerPackDownloader r4 = r8.A0g
            X.1Sw r3 = r8.A0W
            X.88B r2 = r8.A0Z
            int r1 = r8.A0O
            int r0 = r8.A0N
            X.6Hw r10 = new X.6Hw
            r26 = r4
            r27 = r1
            r28 = r0
            r18 = r10
            r19 = r9
            r20 = r6
            r21 = r15
            r22 = r3
            r23 = r11
            r24 = r5
            r25 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r13.put(r12, r10)
            goto L_0x03b3
        L_0x03f4:
            java.util.Set r0 = r30.keySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x03fc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0414
            java.lang.Object r1 = r2.next()
            boolean r0 = r14.contains(r1)
            if (r0 != 0) goto L_0x03fc
            java.lang.Object r0 = r13.get(r1)
            r7.add(r0)
            goto L_0x03fc
        L_0x0414:
            java.util.Iterator r3 = r29.iterator()
        L_0x0418:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0437
            X.725 r2 = X.C108945cZ.A0y(r3)
            java.lang.String r0 = r2.A0H
            java.lang.Object r1 = r13.get(r0)
            X.7Kl r1 = (X.C145227Kl) r1
            if (r1 == 0) goto L_0x0418
            boolean r0 = r2.A0S
            if (r0 != 0) goto L_0x0418
            r1.A01()
            r7.add(r1)
            goto L_0x0418
        L_0x0437:
            r8.A0K = r13
            int r1 = r8.A03()
            if (r1 >= 0) goto L_0x0527
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()
            java.util.List r0 = r8.A0E
            int r0 = r0.size()
            boolean r5 = X.C72453Mb.A1b(r1, r0)
            java.lang.String r0 = "StickerPicker/setStickerPacks/getCurrentPageIndex < 0, stickerPages.size(): %d"
            X.C108955ca.A1X(r0, r2, r1)
            r1 = 0
        L_0x0455:
            java.lang.String r11 = r8.A0D
            r4 = 0
            if (r11 != 0) goto L_0x04b1
            java.util.List r0 = r8.A0E
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0464
            if (r32 != 0) goto L_0x0520
        L_0x0464:
            java.util.List r0 = r8.A0E
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x04f8
            java.util.List r0 = r8.A0E
            java.lang.Object r0 = r0.get(r1)
        L_0x0472:
            X.7Kl r0 = (X.C145227Kl) r0
            java.lang.String r3 = r0.getId()
            X.6Hy r0 = r8.A0A
            r10 = 1
            if (r0 == 0) goto L_0x04f3
            X.67t r0 = r0.A0A
            int r0 = r0.A03()
        L_0x0483:
            boolean r9 = X.AnonymousClass000.A1P(r0)
            X.6Hx r0 = r8.A0B
            if (r0 == 0) goto L_0x04ee
            X.5l4 r0 = r0.A00()
            int r0 = r0.A0Q()
        L_0x0493:
            boolean r6 = X.AnonymousClass000.A1P(r0)
            java.lang.String r2 = "recents"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x04a2
            r1 = 1
            if (r9 != 0) goto L_0x04a3
        L_0x04a2:
            r1 = 0
        L_0x04a3:
            java.lang.String r11 = "starred"
            boolean r0 = r11.equals(r3)
            if (r0 == 0) goto L_0x04ec
            if (r6 == 0) goto L_0x04ec
        L_0x04ad:
            if (r1 == 0) goto L_0x04e6
            if (r6 != 0) goto L_0x04e6
        L_0x04b1:
            X.7Kl r0 = A00(r11, r7)
            if (r0 == 0) goto L_0x0525
            int r3 = r7.indexOf(r0)
            r8.A0D = r4
        L_0x04bd:
            r8.A0E = r7
            X.7Kl[] r0 = new X.C145227Kl[r5]
            java.lang.Object[] r5 = r7.toArray(r0)
            X.7Kl[] r5 = (X.C145227Kl[]) r5
            X.7Kn r0 = r8.A0b
            r0.A00(r5)
            java.util.List r0 = r8.A0E
            java.util.Iterator r4 = r0.iterator()
        L_0x04d2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x052a
            java.lang.Object r2 = r4.next()
            X.7Kl r2 = (X.C145227Kl) r2
            int r1 = r8.A01
            int r0 = r8.A00
            r2.A02(r1, r0)
            goto L_0x04d2
        L_0x04e6:
            if (r10 == 0) goto L_0x04fe
            if (r9 != 0) goto L_0x04fe
            r11 = r2
            goto L_0x04b1
        L_0x04ec:
            r10 = 0
            goto L_0x04ad
        L_0x04ee:
            X.722 r0 = r8.A0c
            boolean r0 = r0.A06
            goto L_0x0493
        L_0x04f3:
            X.722 r0 = r8.A0c
            boolean r0 = r0.A05
            goto L_0x0483
        L_0x04f8:
            java.lang.Object r0 = r7.get(r5)
            goto L_0x0472
        L_0x04fe:
            if (r1 != 0) goto L_0x0502
            if (r10 == 0) goto L_0x0523
        L_0x0502:
            int r0 = r29.size()
            if (r0 <= 0) goto L_0x0523
            java.util.Iterator r2 = r29.iterator()
        L_0x050c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0523
            X.725 r1 = X.C108945cZ.A0y(r2)
            boolean r0 = r1.A0S
            if (r0 != 0) goto L_0x050c
            java.lang.String r11 = r1.A0H
        L_0x051c:
            if (r11 != 0) goto L_0x04b1
            if (r32 == 0) goto L_0x0525
        L_0x0520:
            r11 = r32
            goto L_0x04b1
        L_0x0523:
            r11 = r3
            goto L_0x051c
        L_0x0525:
            r3 = 0
            goto L_0x04bd
        L_0x0527:
            r5 = 0
            goto L_0x0455
        L_0x052a:
            r2 = r5[r3]
            X.1BI r1 = r8.A05
            r0 = 1
            r2.A04(r1, r0)
            X.5rK r0 = r8.A06
            if (r0 != 0) goto L_0x0548
            X.0vb r1 = r8.A08
            X.5rK r0 = new X.5rK
            r0.<init>(r1, r5)
            r8.A06 = r0
            r8.A06(r0)
        L_0x0542:
            r0 = r17
            r8.A05(r3, r0)
            return
        L_0x0548:
            X.C114605rK.A01(r0, r5)
            r0.A04()
            goto L_0x0542
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6CF.CKs(java.lang.String, java.util.HashMap, java.util.HashMap, java.util.HashSet, java.util.List):void");
    }

    public static C145227Kl A00(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C145227Kl r1 = (C145227Kl) it.next();
            if (str.equals(r1.getId())) {
                return r1;
            }
        }
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6CF(android.app.Activity r17, android.view.ViewGroup r18, X.C39711tW r19, X.AnonymousClass190 r20, X.AnonymousClass11S r21, X.C19830z4 r22, X.C18000vb r23, X.C18030ve r24, X.AnonymousClass18K r25, X.AnonymousClass1BI r26, X.AnonymousClass7MX r27, X.C25271No r28, X.C26631Sw r29, X.AnonymousClass2LK r30, X.AnonymousClass1SB r31, X.AnonymousClass6pA r32, X.C111185ii r33, X.AnonymousClass722 r34, com.whatsapp.stickers.stickerpack.StickerPackDownloader r35, X.AnonymousClass10I r36, X.AnonymousClass00H r37, boolean r38) {
        /*
            r16 = this;
            r3 = r34
            r11 = r17
            r1 = 0
            r15 = 2131435753(0x7f0b20e9, float:1.8493357E38)
            r10 = r16
            r14 = r23
            r13 = r19
            r12 = r18
            r10.<init>(r11, r12, r13, r14, r15)
            r10.A0F = r1
            r10.A0M = r1
            r2 = 7
            X.7MW r0 = new X.7MW
            r0.<init>(r10, r2)
            r10.A0Z = r0
            r2 = 23
            X.793 r0 = new X.793
            r0.<init>(r10, r2)
            r10.A0Q = r0
            r0 = r24
            r10.A0T = r0
            r0 = r20
            r10.A0R = r0
            r0 = r21
            r10.A0S = r0
            r0 = r25
            r10.A0U = r0
            r5 = r30
            r10.A0e = r5
            r6 = r31
            r10.A0Y = r6
            r4 = r22
            r10.A0d = r4
            r0 = r35
            r10.A0g = r0
            r0 = r28
            r10.A0V = r0
            r0 = r29
            r10.A0W = r0
            r0 = r27
            r10.A07 = r0
            r9 = r37
            r10.A0h = r9
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r11)
            r10.A0P = r0
            r0 = r38
            r10.A0M = r0
            r0 = r26
            r10.A05 = r0
            r2 = 2130969438(0x7f04035e, float:1.7547558E38)
            r0 = 2131100423(0x7f060307, float:1.7813227E38)
            int r0 = X.AnonymousClass3Ma.A00(r11, r2, r0)
            r10.A0N = r0
            androidx.viewpager.widget.ViewPager r0 = r10.A07
            android.content.res.Resources r2 = X.AnonymousClass000.A0Y(r0)
            r0 = 2131168921(0x7f070e99, float:1.7952157E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r10.A0O = r0
            X.714 r0 = new X.714
            r0.<init>()
            r10.A0X = r0
            r7 = r32
            r10.A0f = r7
            if (r34 != 0) goto L_0x0095
            X.722 r3 = new X.722
            r8 = r36
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x0095:
            r10.A0c = r3
            r2 = r33
            r10.A0a = r2
            X.11S r0 = r10.A0S
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x012b
            X.0ve r4 = r10.A0T
            r3 = 1396(0x574, float:1.956E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r3)
            if (r0 == 0) goto L_0x012b
            r0 = 2131435835(0x7f0b213b, float:1.8493523E38)
            X.C108975cc.A0t(r12, r0)
            r0 = 2131435834(0x7f0b213a, float:1.8493521E38)
            X.AnonymousClass3MY.A1B(r12, r0, r1)
            r0 = 2131435833(0x7f0b2139, float:1.849352E38)
            android.view.View r0 = r12.findViewById(r0)
            r10.A03 = r0
            r0 = 2131435832(0x7f0b2138, float:1.8493517E38)
        L_0x00c7:
            android.view.View r0 = r12.findViewById(r0)
            r10.A04 = r0
            android.content.res.Resources r3 = r11.getResources()
            r0 = 2131168918(0x7f070e96, float:1.7952151E38)
            int r3 = r3.getDimensionPixelSize(r0)
            int r0 = r12.getWidth()
            r10.A01 = r0
            int r0 = r12.getHeight()
            int r0 = r0 - r3
            r10.A00 = r0
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r10.A0E = r0
            java.util.HashMap r0 = X.C17880vN.A11()
            r10.A0K = r0
            X.7Kl[] r1 = new X.C145227Kl[r1]
            X.5rK r0 = new X.5rK
            r0.<init>(r14, r1)
            r10.A06 = r0
            r10.A06(r0)
            android.content.Context r0 = r10.A05
            X.7Kn r3 = new X.7Kn
            r3.<init>(r0, r12, r14)
            r10.A0b = r3
            if (r33 == 0) goto L_0x0116
            X.1DT r2 = r2.A02
            X.1F9 r11 = (X.AnonymousClass1F9) r11
            r1 = 20
            X.7AP r0 = new X.7AP
            r0.<init>(r10, r1)
            r2.A0A(r11, r0)
        L_0x0116:
            android.view.View r1 = r10.A03
            r0 = 28
            X.AnonymousClass6LG.A00(r1, r10, r0)
            X.89w r1 = r10.A04
            if (r1 == 0) goto L_0x0125
            r0 = 0
            r1.CIW(r0)
        L_0x0125:
            r10.A04 = r3
            r3.CIW(r10)
            return
        L_0x012b:
            r0 = 2131435834(0x7f0b213a, float:1.8493521E38)
            X.C108975cc.A0t(r12, r0)
            r0 = 2131435835(0x7f0b213b, float:1.8493523E38)
            X.AnonymousClass3MY.A1B(r12, r0, r1)
            r0 = 2131435769(0x7f0b20f9, float:1.849339E38)
            android.view.View r0 = r12.findViewById(r0)
            r10.A03 = r0
            r0 = 2131435768(0x7f0b20f8, float:1.8493387E38)
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6CF.<init>(android.app.Activity, android.view.ViewGroup, X.1tW, X.190, X.11S, X.0z4, X.0vb, X.0ve, X.18K, X.1BI, X.7MX, X.1No, X.1Sw, X.2LK, X.1SB, X.6pA, X.5ii, X.722, com.whatsapp.stickers.stickerpack.StickerPackDownloader, X.10I, X.00H, boolean):void");
    }
}
