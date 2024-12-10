package X;

import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import java.util.HashMap;

/* renamed from: X.7JW  reason: invalid class name */
public final class AnonymousClass7JW implements AnonymousClass8AR {
    public final /* synthetic */ CatalogMediaViewFragment A00;

    public /* bridge */ /* synthetic */ int BXK(Object obj) {
        C18070vi.A0d(obj, 0);
        CatalogMediaViewFragment catalogMediaViewFragment = this.A00;
        C20287AEv aEv = catalogMediaViewFragment.A04;
        if (aEv != null) {
            int A08 = C108945cZ.A08(aEv);
            C20287AEv aEv2 = catalogMediaViewFragment.A04;
            if (aEv2 != null) {
                int A0A = C108945cZ.A0A(aEv2.A0B, A08);
                int i = 0;
                while (i < A0A) {
                    C20287AEv aEv3 = catalogMediaViewFragment.A04;
                    if (aEv3 != null) {
                        if (C18070vi.A18(A1M.A00(aEv3.A0H, i), obj)) {
                            return i;
                        }
                        i++;
                    }
                }
                return 0;
            }
        }
        C18070vi.A11("product");
        throw null;
    }

    public void Bue() {
    }

    public AnonymousClass7JW(CatalogMediaViewFragment catalogMediaViewFragment) {
        this.A00 = catalogMediaViewFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C19760yx BHw(int r35) {
        /*
            r34 = this;
            r0 = r34
            com.whatsapp.biz.catalog.CatalogMediaViewFragment r10 = r0.A00
            boolean r12 = r10.A0H
            r9 = 0
            r10.A0H = r9
            X.AEv r0 = r10.A04
            java.lang.String r21 = "product"
            r3 = 0
            if (r0 == 0) goto L_0x024a
            int r0 = X.C108945cZ.A08(r0)
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup"
            r11 = r35
            if (r11 < r0) goto L_0x015d
            X.AEv r0 = r10.A04
            if (r0 == 0) goto L_0x024a
            int r1 = X.C108945cZ.A08(r0)
            X.AEv r0 = r10.A04
            if (r0 == 0) goto L_0x024a
            java.util.List r0 = r0.A0B
            int r0 = X.C108945cZ.A0A(r0, r1)
            if (r11 >= r0) goto L_0x015d
            X.AEv r0 = r10.A04
            if (r0 == 0) goto L_0x024a
            int r0 = X.C108945cZ.A08(r0)
            int r1 = r35 - r0
            X.AEv r0 = r10.A04
            if (r0 == 0) goto L_0x024a
            java.util.List r0 = r0.A0B
            java.lang.Object r2 = r0.get(r1)
            X.773 r2 = (X.AnonymousClass773) r2
            android.view.LayoutInflater r1 = r10.A16()
            r0 = 2131625988(0x7f0e0804, float:1.88792E38)
            android.view.View r0 = r1.inflate(r0, r3)
            X.C18070vi.A0z(r0, r4)
            r1 = 2131436135(0x7f0b2267, float:1.8494132E38)
            android.view.View r8 = X.AnonymousClass3MX.A0C(r0, r1)
            com.whatsapp.mediaview.PhotoView r8 = (com.whatsapp.mediaview.PhotoView) r8
            r1 = 2131429540(0x7f0b08a4, float:1.8480756E38)
            android.view.View r7 = r0.findViewById(r1)
            X.6Mj r7 = (X.C121996Mj) r7
            r1 = 2131430949(0x7f0b0e25, float:1.8483613E38)
            android.view.View r6 = X.AnonymousClass3MX.A0C(r7, r1)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r8.A0J = r3
            X.A2v r4 = r10.A06
            if (r4 == 0) goto L_0x0157
            X.7CV r1 = new X.7CV
            r1.<init>(r10, r8, r11, r12)
            r31 = 0
            r17 = r3
            r14 = r8
            r15 = r2
            r16 = r3
            r18 = r1
            r13 = r4
            r13.A05(r14, r15, r16, r17, r18)
            X.4rF r5 = X.C98494rF.A00()
            java.util.HashMap r1 = r10.A0G
            java.lang.String r20 = "videoPlayers"
            if (r1 != 0) goto L_0x0094
            X.C18070vi.A11(r20)
            throw r3
        L_0x0094:
            java.lang.String r4 = r2.A02
            java.lang.Object r1 = r1.get(r4)
            r5.element = r1
            if (r1 != 0) goto L_0x01c5
            r1 = 2131436771(0x7f0b24e3, float:1.8495422E38)
            android.view.View r3 = X.AnonymousClass3MX.A0C(r0, r1)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r1 = 2131436136(0x7f0b2268, float:1.8494134E38)
            android.view.View r19 = r0.findViewById(r1)
            java.lang.String r2 = r2.A00
            if (r2 != 0) goto L_0x00b4
            java.lang.String r2 = ""
        L_0x00b4:
            X.190 r1 = r10.A02
            r18 = r1
            if (r1 == 0) goto L_0x014e
            X.1KB r1 = r10.A03
            r17 = r1
            if (r1 == 0) goto L_0x014b
            X.11C r1 = r10.A07
            r16 = r1
            if (r1 == 0) goto L_0x0148
            X.1FL r23 = r10.A1D()
            X.118 r15 = r10.A08
            if (r15 == 0) goto L_0x0145
            android.net.Uri r14 = android.net.Uri.parse(r2)
            X.0ve r28 = r10.A26()
            X.10I r13 = r10.A0C
            if (r13 == 0) goto L_0x0151
            X.00H r1 = r10.A0E
            if (r1 == 0) goto L_0x0142
            java.lang.Object r2 = r1.get()
            X.6gC r2 = (X.AnonymousClass6gC) r2
            X.6Mr r1 = new X.6Mr
            r33 = r9
            r25 = r17
            r26 = r16
            r27 = r15
            r29 = r2
            r30 = r13
            r32 = r9
            r22 = r1
            r24 = r18
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r1.A04 = r14
            r1.A0D = r4
            r1.A0D = r9
            r5.element = r1
            r1.A0U(r7)
            java.lang.Object r1 = r5.element
            X.6Mr r1 = (X.C122076Mr) r1
            X.6Mw r1 = r1.A0a
            X.C108995ce.A0w(r1, r3)
            java.lang.Object r13 = r5.element
            X.6Mr r13 = (X.C122076Mr) r13
            X.7O1 r2 = new X.7O1
            r1 = r19
            r2.<init>(r1, r10, r8)
            r13.A0A = r2
            r1 = 2
            X.C108955ca.A1K(r3, r7, r1)
            r2 = 24
            X.9Aa r1 = new X.9Aa
            r1.<init>(r7, r2)
            r3.setOnClickListener(r1)
            r8.A0K = r1
            android.widget.ImageView r2 = r7.A0H
            r1 = 8
            r2.setVisibility(r1)
            X.7O6 r1 = new X.7O6
            r1.<init>(r10, r5, r9)
            r7.A07 = r1
            java.util.HashMap r2 = r10.A0G
            if (r2 != 0) goto L_0x01b5
            X.C18070vi.A11(r20)
            throw r31
        L_0x0142:
            java.lang.String r0 = "heroSettingProvider"
            goto L_0x0153
        L_0x0145:
            java.lang.String r0 = "waContext"
            goto L_0x0153
        L_0x0148:
            java.lang.String r0 = "systemServices"
            goto L_0x0153
        L_0x014b:
            java.lang.String r0 = "globalUI"
            goto L_0x0153
        L_0x014e:
            java.lang.String r0 = "crashLogs"
            goto L_0x0153
        L_0x0151:
            java.lang.String r0 = "waWorkers"
        L_0x0153:
            X.C18070vi.A11(r0)
            throw r31
        L_0x0157:
            java.lang.String r0 = "loadSession"
            X.C18070vi.A11(r0)
            throw r3
        L_0x015d:
            android.view.LayoutInflater r1 = r10.A16()
            r0 = 2131625989(0x7f0e0805, float:1.8879202E38)
            android.view.View r0 = r1.inflate(r0, r3)
            X.C18070vi.A0z(r0, r4)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 2131430949(0x7f0b0e25, float:1.8483613E38)
            android.view.View r6 = X.AnonymousClass3MX.A0C(r0, r1)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.content.Context r1 = r10.A14()
            X.6AB r8 = new X.6AB
            r8.<init>(r1, r10, r9)
            r2 = 23
            X.9Aa r1 = new X.9Aa
            r1.<init>(r10, r2)
            r8.A0K = r1
            r0.addView(r8, r9)
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r8.A01 = r1
            r4 = 1
            r8.A0P = r4
            X.A2v r12 = r10.A06
            if (r12 == 0) goto L_0x0244
            X.AEv r1 = r10.A04
            if (r1 == 0) goto L_0x0246
            java.util.List r1 = r1.A0A
            java.lang.Object r2 = r1.get(r11)
            X.AEI r2 = (X.AEI) r2
            if (r2 == 0) goto L_0x01c5
            X.7CV r1 = new X.7CV
            r1.<init>(r10, r8, r11)
            r13 = r8
            r14 = r2
            r15 = r3
            r16 = r1
            r17 = r4
            r12.A04(r13, r14, r15, r16, r17)
            goto L_0x01c5
        L_0x01b5:
            java.lang.Object r1 = r5.element
            r2.put(r4, r1)
            if (r12 == 0) goto L_0x01c5
            java.lang.Object r1 = r5.element
            X.6Mr r1 = (X.C122076Mr) r1
            r10.A0D = r1
            r7.setVisibility(r9)
        L_0x01c5:
            int r1 = r10.A00
            if (r11 != r1) goto L_0x01e0
            X.AEv r1 = r10.A04
            if (r1 == 0) goto L_0x023f
            java.lang.String r1 = r1.A0H
            java.lang.String r3 = X.A1M.A00(r1, r11)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "thumb-transition-"
            java.lang.String r1 = X.AnonymousClass001.A1H(r1, r3, r2)
            X.AnonymousClass1Xr.A04(r8, r1)
        L_0x01e0:
            X.AEv r1 = r10.A04
            if (r1 == 0) goto L_0x023f
            java.lang.String r1 = r1.A0E
            if (r1 == 0) goto L_0x0226
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0226
            android.view.LayoutInflater r2 = r10.A16()
            r1 = 2131625982(0x7f0e07fe, float:1.8879187E38)
            r4 = 0
            android.view.View r2 = r2.inflate(r1, r4)
            r1 = 2131428830(0x7f0b05de, float:1.8479316E38)
            android.view.View r3 = X.C18070vi.A05(r2, r1)
            com.whatsapp.ui.media.MediaCaptionTextView r3 = (com.whatsapp.ui.media.MediaCaptionTextView) r3
            r6.addView(r2, r9)
            android.content.Context r2 = r10.A14()
            r1 = 2131101852(0x7f06089c, float:1.7816125E38)
            int r2 = X.C19740yt.A00(r2, r1)
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r2)
            r6.setBackground(r1)
            X.AEv r1 = r10.A04
            if (r1 != 0) goto L_0x0221
            X.C18070vi.A11(r21)
            throw r4
        L_0x0221:
            java.lang.String r1 = r1.A0E
            r3.setCaptionText(r1)
        L_0x0226:
            boolean r1 = r10.A0I
            if (r1 != 0) goto L_0x022c
            r9 = 8
        L_0x022c:
            r6.setVisibility(r9)
            X.AEv r1 = r10.A04
            if (r1 == 0) goto L_0x023f
            java.lang.String r1 = r1.A0H
            java.lang.String r2 = X.A1M.A00(r1, r11)
            X.0yx r1 = new X.0yx
            r1.<init>(r0, r2)
            return r1
        L_0x023f:
            X.C18070vi.A11(r21)
            r0 = 0
            throw r0
        L_0x0244:
            java.lang.String r21 = "loadSession"
        L_0x0246:
            X.C18070vi.A11(r21)
            throw r3
        L_0x024a:
            X.C18070vi.A11(r21)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7JW.BHw(int):X.0yx");
    }

    public void BIX(int i) {
        CatalogMediaViewFragment catalogMediaViewFragment = this.A00;
        C20287AEv aEv = catalogMediaViewFragment.A04;
        if (aEv != null) {
            if (i >= C108945cZ.A08(aEv)) {
                C20287AEv aEv2 = catalogMediaViewFragment.A04;
                if (aEv2 != null) {
                    int A08 = C108945cZ.A08(aEv2);
                    C20287AEv aEv3 = catalogMediaViewFragment.A04;
                    if (aEv3 != null) {
                        if (i < C108945cZ.A0A(aEv3.A0B, A08)) {
                            C20287AEv aEv4 = catalogMediaViewFragment.A04;
                            if (aEv4 != null) {
                                int A082 = i - C108945cZ.A08(aEv4);
                                C20287AEv aEv5 = catalogMediaViewFragment.A04;
                                if (aEv5 != null) {
                                    AnonymousClass773 r0 = (AnonymousClass773) aEv5.A0B.get(A082);
                                    HashMap hashMap = catalogMediaViewFragment.A0G;
                                    if (hashMap == null) {
                                        C18070vi.A11("videoPlayers");
                                        throw null;
                                    }
                                    AnonymousClass70X r02 = (AnonymousClass70X) hashMap.remove(r0.A02);
                                    if (r02 != null) {
                                        r02.A0F();
                                        return;
                                    }
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                }
            } else {
                return;
            }
        }
        C18070vi.A11("product");
        throw null;
    }

    public int getCount() {
        CatalogMediaViewFragment catalogMediaViewFragment = this.A00;
        boolean A05 = C18020vd.A05(C18040vf.A02, catalogMediaViewFragment.A26(), 10691);
        C20287AEv aEv = catalogMediaViewFragment.A04;
        if (A05) {
            if (aEv != null) {
                int A08 = C108945cZ.A08(aEv);
                C20287AEv aEv2 = catalogMediaViewFragment.A04;
                if (aEv2 != null) {
                    return C108945cZ.A0A(aEv2.A0B, A08);
                }
            }
        } else if (aEv != null) {
            return C108945cZ.A08(aEv);
        }
        C18070vi.A11("product");
        throw null;
    }
}
