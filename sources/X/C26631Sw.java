package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Sw  reason: invalid class name and case insensitive filesystem */
public class C26631Sw {
    public C121966Me A00;
    public final C218617r A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass11C A03;
    public final C18030ve A04;
    public final WamediaManager A05;
    public final C26641Sx A06;
    public final C26611Su A07;
    public final C26661Sz A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final ConcurrentHashMap A0E = new ConcurrentHashMap();
    public final ConcurrentHashMap A0F = new ConcurrentHashMap();
    public final AnonymousClass11P A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;

    public C26631Sw(C218617r r17, AnonymousClass1KB r18, AnonymousClass11C r19, AnonymousClass11P r20, C18030ve r21, WamediaManager wamediaManager, C26611Su r23, C26621Sv r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31) {
        AnonymousClass11P r12 = r20;
        C18070vi.A0d(r12, 1);
        C18030ve r11 = r21;
        C18070vi.A0d(r11, 2);
        AnonymousClass1KB r13 = r18;
        C18070vi.A0d(r13, 3);
        WamediaManager wamediaManager2 = wamediaManager;
        C18070vi.A0d(wamediaManager2, 4);
        C218617r r15 = r17;
        C18070vi.A0d(r15, 5);
        AnonymousClass11C r14 = r19;
        C18070vi.A0d(r14, 6);
        AnonymousClass00H r7 = r25;
        C18070vi.A0d(r7, 7);
        C26611Su r9 = r23;
        C18070vi.A0d(r9, 8);
        AnonymousClass00H r6 = r26;
        C18070vi.A0d(r6, 9);
        C26621Sv r8 = r24;
        C18070vi.A0d(r8, 10);
        AnonymousClass00H r5 = r27;
        C18070vi.A0d(r5, 11);
        AnonymousClass00H r4 = r28;
        C18070vi.A0d(r4, 12);
        AnonymousClass00H r3 = r29;
        C18070vi.A0d(r3, 13);
        AnonymousClass00H r2 = r30;
        C18070vi.A0d(r2, 14);
        AnonymousClass00H r0 = r31;
        C18070vi.A0d(r0, 15);
        this.A0G = r12;
        this.A04 = r11;
        this.A02 = r13;
        this.A05 = wamediaManager2;
        this.A01 = r15;
        this.A03 = r14;
        this.A0C = r7;
        this.A07 = r9;
        this.A0H = r6;
        this.A09 = r5;
        this.A0I = r4;
        this.A0A = r3;
        this.A0B = r2;
        this.A0D = r0;
        this.A06 = new C26641Sx(r11);
        this.A08 = new C26661Sz(r13, r11, r8);
    }

    public final void A05(Context context, C1418377d r12, AnonymousClass3LH r13, int i, int i2) {
        C18070vi.A0d(r12, 1);
        Context context2 = context;
        AnonymousClass3LH r3 = r13;
        A03((AnonymousClass1KB) null, this.A03, this.A05, this, new C49012Ov(context2, r12, r3, C60582oG.A00(r12, i, i2, false), i, i2), (Map) null);
    }

    public static final Drawable A00(C1418377d r3, C26631Sw r4, String str) {
        Drawable drawable;
        Reference reference = (Reference) r4.A0F.get(str);
        if (reference == null || (drawable = (Drawable) reference.get()) == null) {
            return r4.A02(r3, str);
        }
        if (!(drawable instanceof C38631rd)) {
            return drawable;
        }
        C39801tf r0 = ((C38631rd) drawable).A0G;
        C18070vi.A0X(r0);
        return ((AnonymousClass72L) r4.A0C.get()).A03(r0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.drawable.Drawable A01(X.C26631Sw r18, X.C59832mx r19, java.lang.String r20, byte[] r21) {
        /*
            r6 = r18
            java.util.concurrent.ConcurrentHashMap r5 = r6.A0E
            r12 = r19
            java.lang.String r4 = r12.A06
            java.lang.Object r0 = r5.get(r4)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0025
            java.lang.Object r3 = r0.get()
            X.6zD r3 = (X.C139646zD) r3
            if (r3 == 0) goto L_0x0022
            X.11P r2 = r6.A0G
            X.0ve r0 = r6.A04
            X.5dZ r1 = new X.5dZ
            r1.<init>(r2, r0, r3)
            return r1
        L_0x0022:
            r5.remove(r4)
        L_0x0025:
            r8 = r21
            com.facebook.animated.webp.WebPImage r7 = X.C26611Su.A02(r8)
            r10 = 0
            if (r7 == 0) goto L_0x017e
            java.lang.Integer r2 = r12.A05
            r16 = 0
            r1 = 1
            if (r2 == 0) goto L_0x0054
            X.77d r0 = r12.A04
            boolean r0 = r0.A0N
            if (r0 == 0) goto L_0x0054
            int r0 = r7.getFrameCount()
            r9 = 0
            if (r0 <= r1) goto L_0x0043
            r9 = 1
        L_0x0043:
            X.00H r0 = r6.A09
            java.lang.Object r3 = r0.get()
            X.70I r3 = (X.AnonymousClass70I) r3
            int r2 = r2.intValue()
            X.2Lv r0 = X.C48272Lv.A00
            r3.A05(r0, r2, r9)
        L_0x0054:
            X.0ve r3 = r6.A04
            r0 = 295(0x127, float:4.13E-43)
            X.0vf r14 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r14, r3, r0)
            if (r0 == 0) goto L_0x014b
            X.77d r11 = r12.A04
            X.73B r0 = r11.A04
            java.lang.String r9 = r11.A0B
            if (r0 != 0) goto L_0x007c
            if (r9 == 0) goto L_0x014b
            X.00H r0 = r6.A0H
            java.lang.Object r2 = r0.get()
            X.70H r2 = (X.AnonymousClass70H) r2
            java.lang.Integer r0 = r11.A01()
            X.73B r0 = r2.A03(r0, r9)
            if (r0 == 0) goto L_0x014b
        L_0x007c:
            boolean r0 = r0.A03
            r2 = r0 ^ 1
        L_0x0080:
            int r0 = r7.getFrameCount()
            r11 = r20
            if (r0 == r1) goto L_0x014e
            if (r2 != 0) goto L_0x014e
            int r13 = r7.getWidth()
            int r9 = r7.getHeight()
            r0 = 0
            if (r13 == 0) goto L_0x0096
            r0 = 1
        L_0x0096:
            X.C17960vV.A0C(r0)
            r0 = 0
            if (r9 == 0) goto L_0x009d
            r0 = 1
        L_0x009d:
            X.C17960vV.A0C(r0)
            r0 = 3
            int[] r15 = new int[r0]
            r15[r16] = r9
            r0 = 512(0x200, float:7.175E-43)
            r15[r1] = r0
            r1 = 2
            int r0 = r12.A03
            r15[r1] = r0
            r2 = r13
            r8 = 3
            r1 = 0
        L_0x00b1:
            r0 = r15[r1]
            int r2 = java.lang.Math.min(r2, r0)
            int r1 = r1 + 1
            if (r1 < r8) goto L_0x00b1
            r8 = r2
            r0 = 11141(0x2b85, float:1.5612E-41)
            boolean r0 = X.C18020vd.A05(r14, r3, r0)
            if (r0 != 0) goto L_0x013e
            int r8 = java.lang.Math.min(r2, r13)
            int r1 = java.lang.Math.min(r2, r9)
        L_0x00cc:
            X.6rY r0 = new X.6rY
            r0.<init>(r8, r1)
            int r9 = r0.A01
            int r8 = r0.A00
            boolean r0 = r12.A09
            if (r0 == 0) goto L_0x00e4
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = (float) r9
            float r0 = r0 / r1
            int r9 = (int) r0
            float r0 = (float) r8
            float r0 = r0 / r1
            int r8 = (int) r0
            float r0 = (float) r2
            float r0 = r0 / r1
            int r2 = (int) r0
        L_0x00e4:
            X.1Su r1 = r6.A07
            java.lang.String r0 = X.C26611Su.A04(r9, r8, r4)
            android.graphics.Bitmap r12 = X.C26611Su.A01(r1, r0)
            if (r12 != 0) goto L_0x00f6
            android.graphics.Bitmap r12 = X.C26611Su.A00(r7, r1, r0, r9, r8)
            if (r12 == 0) goto L_0x017e
        L_0x00f6:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r1 = 47
            r0 = 45
            java.lang.String r0 = r11.replace(r1, r0)
            r10.append(r0)
            r0 = 95
            r10.append(r0)
            r10.append(r9)
            r10.append(r0)
            r10.append(r8)
            java.lang.String r17 = r10.toString()
            X.1KB r1 = r6.A02
            X.1Sz r0 = r6.A08
            X.6zD r11 = new X.6zD
            r21 = r2
            r18 = r9
            r19 = r8
            r20 = r2
            r14 = r1
            r15 = r3
            r16 = r0
            r13 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r11)
            r5.put(r4, r0)
            X.11P r0 = r6.A0G
            X.5dZ r1 = new X.5dZ
            r1.<init>(r0, r3, r11)
            return r1
        L_0x013e:
            float r1 = (float) r13
            float r0 = (float) r9
            float r1 = r1 / r0
            float r0 = (float) r2
            if (r13 <= r9) goto L_0x0147
            float r0 = r0 / r1
            int r1 = (int) r0
            goto L_0x00cc
        L_0x0147:
            float r0 = r0 * r1
            int r8 = (int) r0
            r1 = r2
            goto L_0x00cc
        L_0x014b:
            r2 = 0
            goto L_0x0080
        L_0x014e:
            X.1Su r2 = r6.A07
            int r1 = r12.A03
            int r0 = r12.A00
            android.graphics.Bitmap r0 = r2.A07(r11, r8, r1, r0)
            if (r0 == 0) goto L_0x016a
            android.graphics.drawable.BitmapDrawable r10 = new android.graphics.drawable.BitmapDrawable
            r10.<init>(r0)
            java.util.concurrent.ConcurrentHashMap r1 = r6.A0F
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r10)
            r1.put(r4, r0)
            return r10
        L_0x016a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "StickerImageLoader/loadAnimatedSticker failed to create drawable, hash: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x017e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26631Sw.A01(X.1Sw, X.2mx, java.lang.String, byte[]):android.graphics.drawable.Drawable");
    }

    private final C109515dZ A02(C1418377d r5, String str) {
        if (r5.A0F != null) {
            ConcurrentHashMap concurrentHashMap = this.A0E;
            Reference reference = (Reference) concurrentHashMap.get(str);
            if (reference != null) {
                C139646zD r3 = (C139646zD) reference.get();
                if (r3 != null) {
                    return new C109515dZ(this.A0G, this.A04, r3);
                }
                concurrentHashMap.remove(str);
            }
        }
        return null;
    }

    public final void A04() {
        C121966Me r1 = this.A00;
        if (r1 != null) {
            r1.A01 = true;
            r1.interrupt();
        }
        this.A00 = null;
        C26641Sx r12 = this.A06;
        synchronized (r12) {
            r12.A00.clear();
        }
        C26661Sz r13 = this.A08;
        C121976Mf r0 = r13.A00;
        if (r0 != null) {
            r0.A00();
            r13.A00 = null;
        }
    }

    public final void A06(C59842my r27) {
        Integer num;
        PriorityQueue priorityQueue;
        Drawable A022;
        C59842my r0 = r27;
        C1418377d r15 = r0.A05;
        if (r15.A0N) {
            AnonymousClass00H r2 = this.A09;
            int A012 = ((AnonymousClass70I) r2.get()).A01();
            num = Integer.valueOf(A012);
            ((AnonymousClass70I) r2.get()).A03(A012, "start_sticker_loading");
        } else {
            num = null;
        }
        int i = r0.A03;
        int i2 = r0.A00;
        boolean z = r0.A07;
        String A002 = C60582oG.A00(r15, i, i2, z);
        ImageView imageView = r0.A04;
        if (!C18070vi.A18(A002, imageView.getTag()) || imageView.getDrawable() == null) {
            imageView.setTag(A002);
            C26641Sx r5 = this.A06;
            synchronized (r5) {
                priorityQueue = r5.A00;
                Iterator it = priorityQueue.iterator();
                C18070vi.A0X(it);
                while (it.hasNext()) {
                    if (((AnonymousClass6H4) it.next()).A00 == imageView) {
                        it.remove();
                    }
                }
            }
            Drawable drawable = imageView.getDrawable();
            Reference reference = (Reference) this.A0F.get(A002);
            if (reference == null || (A022 = (Drawable) reference.get()) == null || (A022 instanceof C38631rd)) {
                A022 = A02(r15, A002);
            }
            if (drawable != null && drawable.equals(A022)) {
                AnonymousClass889 r02 = r0.A06;
                if (r02 != null) {
                    r02.C6q(true);
                }
                if (num != null) {
                    AnonymousClass00H r1 = this.A09;
                    int intValue = num.intValue();
                    ((AnonymousClass70I) r1.get()).A03(intValue, "in_memory_cache_hit");
                    ((AnonymousClass70I) r1.get()).A02(intValue, AnonymousClass00R.A00);
                    return;
                }
                return;
            } else if (A022 != null) {
                if (num != null) {
                    AnonymousClass00H r4 = this.A09;
                    int intValue2 = num.intValue();
                    ((AnonymousClass70I) r4.get()).A03(intValue2, "in_memory_cache_hit");
                    ((AnonymousClass70I) r4.get()).A02(intValue2, AnonymousClass00R.A00);
                }
                imageView.setImageDrawable(A022);
            } else {
                imageView.setImageResource(2131233045);
                if (num != null) {
                    ((AnonymousClass70I) this.A09.get()).A03(num.intValue(), "sticker_load_enqueued");
                }
                int i3 = r0.A02;
                boolean z2 = r0.A09;
                AnonymousClass889 r22 = r0.A06;
                Object obj = this.A09.get();
                C18070vi.A0X(obj);
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                String str = A002;
                AnonymousClass889 r16 = r22;
                AnonymousClass6H4 r12 = new AnonymousClass6H4(imageView, (AnonymousClass70I) obj, r15, r16, num, str, i4, i5, i6, r0.A01, z, z2, r0.A08);
                synchronized (r5) {
                    priorityQueue.add(r12);
                    r5.notifyAll();
                }
                if (this.A00 == null) {
                    C121966Me r03 = new C121966Me(this, r5);
                    this.A00 = r03;
                    r03.start();
                    return;
                }
                return;
            }
        }
        AnonymousClass889 r04 = r0.A06;
        if (r04 != null) {
            r04.C6q(true);
        }
    }

    public static final void A03(AnonymousClass1KB r7, AnonymousClass11C r8, WamediaManager wamediaManager, C26631Sw r10, C59832mx r11, Map map) {
        Reference reference;
        if (r11.A02()) {
            Drawable drawable = null;
            if (map == null || (reference = (Reference) map.get(r11.A06)) == null || (drawable = (Drawable) reference.get()) == null) {
                C1418377d r6 = r11.A04;
                byte[] A012 = C60582oG.A01(r10.A01, r8, wamediaManager, r6);
                if (A012 != null) {
                    if (r6.A02()) {
                        String str = r11.A06;
                        Bitmap A022 = ((AnonymousClass72L) r10.A0C.get()).A02(r6.A0F, A012, r11.A03, r11.A00);
                        if (A022 != null) {
                            drawable = new BitmapDrawable(r11.A00().getResources(), A022);
                            r10.A0F.put(str, new SoftReference(drawable));
                        }
                    } else if (r11.A07) {
                        String str2 = r6.A0F;
                        C17960vV.A07(str2);
                        C18070vi.A0X(str2);
                        drawable = A01(r10, r11, str2, A012);
                    } else {
                        Bitmap A072 = r10.A07.A07(r11.A06, A012, Math.min(r11.A03, r6.A03), Math.min(r11.A00, r6.A02));
                        if (A072 != null) {
                            drawable = new BitmapDrawable(A072);
                        }
                    }
                    drawable = null;
                }
                if (map != null) {
                    if (drawable != null) {
                        map.put(r11.A06, new SoftReference(drawable));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("StickerImageLoader/loadSticker failed to create drawable: ");
                        sb.append(r11.A06);
                        Log.e(sb.toString());
                    }
                }
            }
            r11.A01(drawable, r7);
        }
    }
}
