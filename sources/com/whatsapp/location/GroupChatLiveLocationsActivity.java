package com.whatsapp.location;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass195;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1FY;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1Q1;
import X.AnonymousClass1RB;
import X.AnonymousClass1VP;
import X.AnonymousClass1VW;
import X.AnonymousClass689;
import X.AnonymousClass78K;
import X.AnonymousClass8BU;
import X.BE9;
import X.BEB;
import X.BIS;
import X.BPT;
import X.C000200d;
import X.C010105w;
import X.C108955ca;
import X.C108985cd;
import X.C109005cf;
import X.C109015cg;
import X.C110885hR;
import X.C139086yC;
import X.C143087By;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C19620yd;
import X.C20269AEc;
import X.C20278AEl;
import X.C219217x;
import X.C23651Hc;
import X.C23997Bte;
import X.C23999Btg;
import X.C24000Bth;
import X.C24671Lf;
import X.C24681Lg;
import X.C24921Me;
import X.C25007CTh;
import X.C25181Nf;
import X.C25191Ng;
import X.C25216CbC;
import X.C25306CdA;
import X.C27101Us;
import X.C27131Uv;
import X.C27191Vc;
import X.C27201Vd;
import X.C29831cw;
import X.C43251zV;
import X.C60072nL;
import X.C72043Kk;
import X.C91044f3;
import X.CXL;
import X.CZ0;
import X.D44;
import X.D59;
import X.DA4;
import X.DAB;
import X.DAE;
import X.DJ0;
import X.DUQ;
import X.E46;
import X.E7P;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupChatLiveLocationsActivity extends AnonymousClass1FY {
    public float A00;
    public int A01;
    public Bundle A02;
    public ImageView A03;
    public E7P A04;
    public DAE A05;
    public AnonymousClass195 A06;
    public AnonymousClass1RB A07;
    public C72043Kk A08;
    public C23651Hc A09;
    public AnonymousClass1VP A0A;
    public AnonymousClass1VW A0B;
    public AnonymousClass1M9 A0C;
    public C24671Lf A0D;
    public C24921Me A0E;
    public C27201Vd A0F;
    public C27191Vc A0G;
    public C219217x A0H;
    public C25181Nf A0I;
    public AnonymousClass1MZ A0J;
    public C24681Lg A0K;
    public AnonymousClass1LU A0L;
    public C24000Bth A0M;
    public C143087By A0N;
    public C27131Uv A0O;
    public AnonymousClass689 A0P;
    public C27101Us A0Q;
    public C18010vc A0R;
    public AnonymousClass00H A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public Map A0V;
    public Set A0W;
    public boolean A0X;
    public final E46 A0Y;
    public volatile boolean A0Z;
    public volatile boolean A0a;

    public static float A03(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, float f, float f2) {
        if (f <= 0.0f) {
            return f2;
        }
        DAE dae = groupChatLiveLocationsActivity.A05;
        C17960vV.A07(dae);
        C25216CbC A062 = dae.A0R.A06();
        Location location = new Location("");
        C20269AEc aEc = A062.A02;
        location.setLatitude(aEc.A00);
        location.setLongitude(aEc.A01);
        Location location2 = new Location("");
        C20269AEc aEc2 = A062.A03;
        location2.setLatitude(aEc2.A00);
        location2.setLongitude(aEc2.A01);
        double distanceTo = (double) location2.distanceTo(location);
        if (distanceTo <= 0.0d) {
            return f2;
        }
        float log = (float) (((double) groupChatLiveLocationsActivity.A05.A02().A02) + (Math.log((distanceTo / ((double) f)) / 30.0d) / Math.log(2.0d)));
        if (log > 16.0f) {
            return 16.0f;
        }
        return log;
    }

    private void A0V(CZ0 cz0, boolean z) {
        CXL cxl;
        C17960vV.A07(this.A05);
        C20278AEl A002 = cz0.A00();
        C20269AEc A003 = A002.A00();
        int width = this.A0M.getWidth();
        int height = this.A0M.getHeight();
        C20269AEc aEc = A002.A01;
        LatLng latLng = new LatLng(aEc.A00, aEc.A01);
        C20269AEc aEc2 = A002.A00;
        LatLngBounds latLngBounds = new LatLngBounds(latLng, new LatLng(aEc2.A00, aEc2.A01));
        LatLng latLng2 = latLngBounds.A00;
        double A004 = C143087By.A00(latLng2.A00);
        LatLng latLng3 = latLngBounds.A01;
        double A005 = (A004 - C143087By.A00(latLng3.A00)) / 3.141592653589793d;
        double d = latLng2.A01 - latLng3.A01;
        if (d < 0.0d) {
            d += 360.0d;
        }
        float min = (float) Math.min(Math.log((((double) height) / 256.0d) / A005) / 0.6931471805599453d, Math.log((((double) width) / 256.0d) / (d / 360.0d)) / 0.6931471805599453d);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166944);
        int i = dimensionPixelSize * 2;
        if (this.A0M.getHeight() > i && this.A0M.getWidth() > i) {
            if (z) {
                this.A0Z = true;
                int i2 = (min > 21.0f ? 1 : (min == 21.0f ? 0 : -1));
                DAE dae = this.A05;
                if (i2 > 0) {
                    cxl = C25306CdA.A01(A003, 19.0f);
                } else {
                    cxl = new CXL();
                    cxl.A07 = A002;
                    cxl.A05 = dimensionPixelSize;
                }
                dae.A0A(cxl, this.A04, 1500);
                return;
            }
            this.A05.A09(C25306CdA.A01(A003, Math.min(19.0f, min)));
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.C6N, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0c(com.whatsapp.location.GroupChatLiveLocationsActivity r15) {
        /*
            X.DAE r2 = r15.A05
            if (r2 == 0) goto L_0x0196
            X.7By r1 = r15.A0N
            X.2nL r0 = r1.A0P
            r4 = 0
            r6 = 1
            if (r0 != 0) goto L_0x016f
            X.2nL r0 = r1.A0O
            if (r0 != 0) goto L_0x016f
            X.17x r0 = r15.A0H
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x001d
            X.DAE r0 = r15.A05
            r0.A0D(r6)
        L_0x001d:
            X.Bth r0 = r15.A0M
            int r1 = r0.getWidth()
            X.Bth r0 = r15.A0M
            int r0 = r0.getHeight()
            if (r1 == 0) goto L_0x0196
            if (r0 == 0) goto L_0x0196
            java.util.Set r3 = r15.A0W
            java.util.ArrayList r14 = X.C17880vN.A10(r3)
            r3.clear()
            X.DAE r0 = r15.A05
            X.CtJ r5 = r0.A0R
            X.7By r8 = r15.A0N
            r0.A02()
            X.C18070vi.A0d(r5, r6)
            X.C6N r7 = new X.C6N
            r7.<init>()
            r7.A00 = r5
            r0 = 0
            X.AEc r2 = new X.AEc
            r2.<init>(r0, r0)
            r5.A04(r2)
            r8.A0Y(r7)
            X.7By r0 = r15.A0N
            java.util.List r0 = r0.A1B
            java.util.Iterator r13 = r0.iterator()
        L_0x005e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0174
            java.lang.Object r8 = r13.next()
            X.6yC r8 = (X.C139086yC) r8
            java.util.Map r11 = r15.A0V
            java.lang.String r10 = r8.A03
            java.lang.Object r7 = r11.get(r10)
            X.BPT r7 = (X.BPT) r7
            com.google.android.gms.maps.model.LatLng r0 = r8.A00()
            X.AEc r2 = X.DJ0.A05(r0)
            if (r7 == 0) goto L_0x0109
            java.lang.Object r9 = r7.A0F
            boolean r0 = r9 instanceof X.C139086yC
            if (r0 == 0) goto L_0x0109
            boolean r0 = r7.A04
            if (r0 != 0) goto L_0x008b
            r7.A05(r6)
        L_0x008b:
            r7.A0B(r2)
            X.6yC r9 = (X.C139086yC) r9
            int r1 = r9.A00
            int r0 = r8.A00
            if (r1 != r0) goto L_0x009c
            int r1 = r9.A01
            int r0 = r8.A01
            if (r1 == r0) goto L_0x00b4
        L_0x009c:
            X.7By r0 = r15.A0N
            android.graphics.Bitmap r0 = r0.A0G(r8)
            X.CgX r0 = X.C25478CgX.A00(r0)
            r7.A0C(r0)
            X.7By r0 = r15.A0N
            java.lang.String r0 = r0.A0M(r8)
            r7.A0G = r0
            X.BPT.A01(r7)
        L_0x00b4:
            int r0 = r8.A00
            if (r0 != r6) goto L_0x00fc
            r1 = 1120403456(0x42c80000, float:100.0)
        L_0x00ba:
            X.DAE r0 = r7.A07
            r0.A0C(r7)
            r7.A02 = r1
            r0.A0B(r7)
            r7.A0F = r8
            android.graphics.Point r2 = r5.A04(r2)
            X.2nL r1 = r8.A02
            X.7By r0 = r15.A0N
            X.2nL r0 = r0.A0Q
            if (r1 == r0) goto L_0x00f0
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x00f8
            int r1 = r2.x
            if (r1 < 0) goto L_0x00f8
            X.Bth r0 = r15.A0M
            int r0 = r0.getWidth()
            if (r1 > r0) goto L_0x00f8
            int r1 = r2.y
            if (r1 < 0) goto L_0x00f8
            X.Bth r0 = r15.A0M
            int r0 = r0.getHeight()
            if (r1 > r0) goto L_0x00f8
        L_0x00f0:
            r7.A0A()
        L_0x00f3:
            r3.add(r7)
            goto L_0x005e
        L_0x00f8:
            r7.A09()
            goto L_0x00f3
        L_0x00fc:
            java.util.List r0 = r8.A04
            int r0 = r0.size()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= r6) goto L_0x00ba
            r1 = 1112014848(0x42480000, float:50.0)
            goto L_0x00ba
        L_0x0109:
            X.DAE r0 = r15.A05
            X.C17960vV.A07(r0)
            com.google.android.gms.maps.model.LatLng r0 = r8.A00()
            X.AEc r7 = X.DJ0.A05(r0)
            X.7By r0 = r15.A0N
            android.graphics.Bitmap r0 = r0.A0G(r8)
            X.Cis r9 = new X.Cis
            r9.<init>()
            X.CgX r0 = X.C25478CgX.A00(r0)
            r9.A01 = r0
            X.7By r0 = r15.A0N
            java.lang.String r0 = r0.A0M(r8)
            r9.A03 = r0
            r12 = 1063172178(0x3f5eb852, float:0.87)
            r1 = 1056964608(0x3f000000, float:0.5)
            float[] r0 = r9.A06
            r0[r4] = r1
            r0[r6] = r12
            X.11S r12 = r15.A02
            X.2nL r0 = r8.A02
            com.whatsapp.jid.UserJid r1 = r0.A06
            boolean r0 = r12.A0O(r1)
            if (r0 == 0) goto L_0x0162
            r0 = 2131891085(0x7f12138d, float:1.941688E38)
            java.lang.String r0 = r15.getString(r0)
        L_0x014d:
            r9.A03 = r0
            X.DAE r0 = r15.A05
            r9.A00 = r7
            X.BPT r7 = new X.BPT
            r7.<init>(r0, r9)
            r0.A0B(r7)
            r7.A0D = r0
            r11.put(r10, r7)
            goto L_0x00b4
        L_0x0162:
            X.1M9 r0 = r15.A0C
            X.1E7 r1 = r0.A0H(r1)
            X.1Me r0 = r15.A0E
            java.lang.String r0 = r0.A0I(r1)
            goto L_0x014d
        L_0x016f:
            r2.A0D(r4)
            goto L_0x001d
        L_0x0174:
            java.util.Iterator r2 = r14.iterator()
        L_0x0178:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0196
            java.lang.Object r1 = r2.next()
            X.BPT r1 = (X.BPT) r1
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x0178
            java.lang.Object r0 = r1.A0F
            if (r0 == 0) goto L_0x0178
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0178
            r1.A05(r4)
            goto L_0x0178
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity.A0c(com.whatsapp.location.GroupChatLiveLocationsActivity):void");
    }

    public static void A0d(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, List list, boolean z) {
        C17960vV.A07(groupChatLiveLocationsActivity.A05);
        if (list.size() != 1) {
            CZ0 cz0 = new CZ0();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C60072nL r0 = (C60072nL) it.next();
                cz0.A01(new C20269AEc(r0.A00, r0.A01));
            }
            groupChatLiveLocationsActivity.A0V(cz0, z);
        } else if (z) {
            groupChatLiveLocationsActivity.A0Z = true;
            groupChatLiveLocationsActivity.A05.A08(C25306CdA.A01(new C20269AEc(((C60072nL) list.get(0)).A00, ((C60072nL) list.get(0)).A01), 16.0f));
        } else {
            groupChatLiveLocationsActivity.A05.A09(C25306CdA.A01(new C20269AEc(((C60072nL) list.get(0)).A00, ((C60072nL) list.get(0)).A01), 16.0f));
        }
    }

    public static void A0q(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity, boolean z) {
        if (groupChatLiveLocationsActivity.A05 != null && !groupChatLiveLocationsActivity.A0N.A0W) {
            Set set = groupChatLiveLocationsActivity.A0W;
            if (set.isEmpty()) {
                return;
            }
            if (groupChatLiveLocationsActivity.A0M.getWidth() <= 0 || groupChatLiveLocationsActivity.A0M.getHeight() <= 0) {
                groupChatLiveLocationsActivity.A0M.getViewTreeObserver().addOnGlobalLayoutListener(new D59(groupChatLiveLocationsActivity, 1));
            } else if (!z || !groupChatLiveLocationsActivity.A0Z) {
                ArrayList A10 = C17880vN.A10(set);
                C17960vV.A07(groupChatLiveLocationsActivity.A05);
                if (groupChatLiveLocationsActivity.A0N.A0I() != null) {
                    C20269AEc A052 = DJ0.A05(groupChatLiveLocationsActivity.A0N.A0I());
                    Collections.sort(A10, new DUQ(A052.A00, A052.A01, 0));
                }
                CZ0 cz0 = new CZ0();
                CZ0 cz02 = new CZ0();
                int i = 0;
                while (i < A10.size()) {
                    BPT bpt = (BPT) A10.get(i);
                    cz02.A01(bpt.A0E);
                    C20278AEl A002 = cz02.A00();
                    C20269AEc aEc = A002.A01;
                    LatLng latLng = new LatLng(aEc.A00, aEc.A01);
                    C20269AEc aEc2 = A002.A00;
                    if (!C143087By.A0F(new LatLngBounds(latLng, new LatLng(aEc2.A00, aEc2.A01)))) {
                        break;
                    }
                    cz0.A01(bpt.A0E);
                    i++;
                }
                if (i == 1) {
                    A0d(groupChatLiveLocationsActivity, ((C139086yC) ((BPT) A10.get(0)).A0F).A04, z);
                } else {
                    groupChatLiveLocationsActivity.A0V(cz0, z);
                }
            } else {
                groupChatLiveLocationsActivity.A0a = true;
            }
        }
    }

    public void A2y() {
        if (!this.A0X) {
            this.A0X = true;
            AnonymousClass10E A0A2 = C109005cf.A0A(C108955ca.A0K(this), this);
            BEB.A10(A0A2, this);
            AnonymousClass10G r2 = A0A2.A00;
            BEB.A0x(A0A2, r2, this);
            C109015cg.A03(A0A2, r2, this, r2.A5A);
            this.A0L = BE9.A0a(A0A2);
            this.A0A = (AnonymousClass1VP) A0A2.A1l.get();
            this.A0F = BE9.A0Y(A0A2);
            this.A0P = (AnonymousClass689) A0A2.A5q.get();
            this.A0B = BE9.A0W(A0A2);
            this.A0C = AnonymousClass10E.A50(A0A2);
            this.A0E = C108985cd.A0R(A0A2);
            this.A0D = (C24671Lf) A0A2.A2g.get();
            this.A0K = (C24681Lg) A0A2.A6Y.get();
            this.A09 = (C23651Hc) A0A2.ACD.get();
            this.A0S = C000200d.A00(A0A2.A2A);
            this.A0H = (C219217x) A0A2.ABj.get();
            this.A07 = (AnonymousClass1RB) A0A2.AUE.get();
            this.A0U = C000200d.A00(A0A2.A9c);
            this.A0O = (C27131Uv) A0A2.A5p.get();
            this.A0J = (AnonymousClass1MZ) A0A2.A4t.get();
            this.A0R = (C18010vc) A0A2.A9s.get();
            this.A06 = (AnonymousClass195) A0A2.A0L.get();
            this.A0I = (C25181Nf) A0A2.A2o.get();
            this.A0G = (C27191Vc) A0A2.A2i.get();
            this.A0T = C000200d.A00(A0A2.A4u);
            this.A08 = (C72043Kk) r2.A1j.get();
            this.A0Q = (C27101Us) A0A2.A5r.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.A0N.A0b(i, i2)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        AnonymousClass11P r27 = this.A05;
        C18030ve r26 = this.A0E;
        AnonymousClass1KB r25 = this.A05;
        AnonymousClass11S r22 = this.A02;
        AnonymousClass1LU r19 = this.A0L;
        AnonymousClass10I r18 = this.A05;
        AnonymousClass1L9 r41 = this.A01;
        C27201Vd r24 = this.A0F;
        AnonymousClass689 r17 = this.A0P;
        AnonymousClass1VW r20 = this.A0B;
        AnonymousClass1M9 r21 = this.A0C;
        C24921Me r23 = this.A0E;
        C18000vb r16 = this.A00;
        C24671Lf r15 = this.A0D;
        C24681Lg r14 = this.A0K;
        C23651Hc r13 = this.A09;
        C219217x r12 = this.A0H;
        AnonymousClass1RB r11 = this.A07;
        C27131Uv r8 = this.A0O;
        AnonymousClass195 r7 = this.A06;
        AnonymousClass1L9 r142 = r41;
        AnonymousClass195 r152 = r7;
        this.A0N = new C23999Btg(r142, r152, r11, r25, r22, r13, r20, r21, r15, r23, r24, this.A0G, (C29831cw) this.A0U.get(), r27, r12, r16, (AnonymousClass1Q1) this.A0S.get(), r14, r26, (C25191Ng) this.A0T.get(), r19, r8, r17, this.A0Q, r18, this, 0);
        getSupportActionBar().A0W(true);
        setContentView(2131625535);
        C25181Nf r4 = this.A0I;
        AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(getIntent().getStringExtra("jid"));
        C17960vV.A07(A022);
        AnonymousClass1E7 A012 = r4.A01(A022);
        getSupportActionBar().A0S(C43251zV.A05(this, this.A0D, this.A0E.A0P(A012)));
        this.A0N.A0U(this, bundle2);
        this.A0P.A05(this);
        C25007CTh cTh = new C25007CTh();
        cTh.A00 = 1;
        cTh.A08 = true;
        cTh.A05 = true;
        cTh.A04 = "whatsapp_group_chat";
        this.A0M = new C23997Bte(this, cTh, this, 0);
        ((ViewGroup) C110885hR.A0A(this, 2131432278)).addView(this.A0M);
        this.A0M.A0F(bundle2);
        ImageView imageView = (ImageView) C110885hR.A0A(this, 2131432893);
        this.A03 = imageView;
        AnonymousClass78K.A00(imageView, this, 5);
        this.A02 = bundle2;
        A0Q();
    }

    public Dialog onCreateDialog(int i) {
        C010105w A0H2 = this.A0N.A0H(i);
        if (A0H2 == null) {
            return super.onCreateDialog(i);
        }
        return A0H2;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C17960vV.A07(this.A05);
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        DAE dae = this.A05;
        if (dae != null) {
            D44 A022 = dae.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            C20269AEc aEc = A022.A03;
            bundle.putDouble("camera_lat", aEc.A00);
            bundle.putDouble("camera_lng", aEc.A01);
            bundle.putInt("map_location_mode", this.A0M.A02);
        }
        this.A0M.A0G(bundle);
        this.A0N.A0V(bundle);
        super.onSaveInstanceState(bundle);
    }

    public GroupChatLiveLocationsActivity(int i) {
        this.A0X = false;
        C91044f3.A00(this, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r3.A0H.A06() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0Q() {
        /*
            r3 = this;
            X.C17960vV.A02()
            X.DAE r0 = r3.A05
            if (r0 != 0) goto L_0x0011
            X.Bth r1 = r3.A0M
            X.E46 r0 = r3.A0Y
            X.DAE r0 = r1.A0J(r0)
            r3.A05 = r0
        L_0x0011:
            android.widget.ImageView r2 = r3.A03
            X.7By r0 = r3.A0N
            X.2nL r0 = r0.A0O
            if (r0 != 0) goto L_0x0022
            X.17x r0 = r3.A0H
            boolean r1 = r0.A06()
            r0 = 0
            if (r1 != 0) goto L_0x0024
        L_0x0022:
            r0 = 8
        L_0x0024:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity.A0Q():void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131820568, menu);
        menu.removeGroup(2131432280);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        double d = BIS.A0n;
        this.A0N.A0O();
        if (this.A05 != null) {
            SharedPreferences.Editor A082 = AnonymousClass8BU.A08(this.A0R, C19620yd.A09);
            D44 A022 = this.A05.A02();
            C20269AEc aEc = A022.A03;
            A082.putFloat("live_location_lat", (float) aEc.A00);
            A082.putFloat("live_location_lng", (float) aEc.A01);
            A082.putFloat("live_location_zoom", A022.A02);
            A082.apply();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0M.A0C();
    }

    public void onPause() {
        super.onPause();
        double d = BIS.A0n;
        C24000Bth bth = this.A0M;
        SensorManager sensorManager = bth.A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(bth.A0E);
        }
        this.A0N.A0P();
    }

    public void onResume() {
        super.onResume();
        double d = BIS.A0n;
        this.A0M.A0K();
        this.A0N.A0Q();
        A0Q();
    }

    public GroupChatLiveLocationsActivity() {
        this(0);
        this.A0W = C17880vN.A12();
        this.A0V = C17880vN.A11();
        this.A01 = 0;
        this.A0Y = new DAB(this, 2);
        this.A00 = -1.0f;
        this.A0a = false;
        this.A04 = new DA4(this, 2);
    }
}
