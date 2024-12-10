package X;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.Btg  reason: case insensitive filesystem */
public class C23999Btg extends C143087By {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23999Btg(AnonymousClass1L9 r2, AnonymousClass195 r3, AnonymousClass1RB r4, AnonymousClass1KB r5, AnonymousClass11S r6, C23651Hc r7, AnonymousClass1VW r8, AnonymousClass1M9 r9, C24671Lf r10, C24921Me r11, C27201Vd r12, C27191Vc r13, C29831cw r14, AnonymousClass11P r15, C219217x r16, C18000vb r17, AnonymousClass1Q1 r18, C24681Lg r19, C18030ve r20, C25191Ng r21, AnonymousClass1LU r22, C27131Uv r23, AnonymousClass689 r24, C27101Us r25, AnonymousClass10I r26, Object obj, int i) {
        super(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.C6N, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v3, types: [X.C6N, java.lang.Object] */
    public C6N A0L() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            C25284Ccm ccm = ((GroupChatLiveLocationsActivity2) obj).A06;
            if (ccm == null) {
                return null;
            }
            C25134CZk A002 = ccm.A00();
            ? obj2 = new Object();
            obj2.A01 = A002;
            A002.A00(new LatLng(0.0d, 0.0d));
            return obj2;
        }
        DAE dae = ((GroupChatLiveLocationsActivity) obj).A05;
        if (dae == null) {
            return null;
        }
        C26152CtJ ctJ = dae.A0R;
        C18070vi.A0d(ctJ, 1);
        ? obj3 = new Object();
        obj3.A00 = ctJ;
        ctJ.A04(new C20269AEc(0.0d, 0.0d));
        return obj3;
    }

    public void A0N() {
        int i = this.A00;
        super.A0N();
        if (i != 0) {
            GroupChatLiveLocationsActivity2.A0c((GroupChatLiveLocationsActivity2) this.A01);
        } else {
            GroupChatLiveLocationsActivity.A0c((GroupChatLiveLocationsActivity) this.A01);
        }
    }

    public void A0R() {
        DAE dae;
        CXL cxl;
        LatLng latLng;
        C25284Ccm ccm;
        CLK A012;
        if (this.A00 != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A01;
            if (!(!groupChatLiveLocationsActivity2.A0H) && groupChatLiveLocationsActivity2.A06 != null && !groupChatLiveLocationsActivity2.A0a) {
                C143087By r1 = groupChatLiveLocationsActivity2.A0O;
                if (r1.A0Q == null || this.A0V) {
                    C139086yC r0 = r1.A0N;
                    if (r0 != null) {
                        latLng = r0.A00();
                        if (!groupChatLiveLocationsActivity2.A06.A00().A02().A04.A00(latLng)) {
                            C143087By r12 = groupChatLiveLocationsActivity2.A0O;
                            if (!r12.A0V) {
                                groupChatLiveLocationsActivity2.A0a = true;
                                ccm = groupChatLiveLocationsActivity2.A06;
                                A012 = C26080Crv.A01(latLng);
                            } else if (GroupChatLiveLocationsActivity2.A0r(r12.A0N.A00(), groupChatLiveLocationsActivity2)) {
                                groupChatLiveLocationsActivity2.A0O.A0N();
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!r1.A0W) {
                        GroupChatLiveLocationsActivity2.A0q(groupChatLiveLocationsActivity2, true);
                        return;
                    } else {
                        return;
                    }
                } else {
                    groupChatLiveLocationsActivity2.A0a = true;
                    C60072nL r2 = groupChatLiveLocationsActivity2.A0O.A0Q;
                    latLng = new LatLng(r2.A00, r2.A01);
                    float A03 = GroupChatLiveLocationsActivity2.A03(groupChatLiveLocationsActivity2, r2.A02, -1.0f);
                    if (A03 <= groupChatLiveLocationsActivity2.A06.A02().A02 && A03 != -1.0f) {
                        ccm = groupChatLiveLocationsActivity2.A06;
                        A012 = C26080Crv.A02(latLng, A03);
                    }
                    ccm = groupChatLiveLocationsActivity2.A06;
                    A012 = C26080Crv.A01(latLng);
                }
                ccm.A0A(A012, groupChatLiveLocationsActivity2.A05);
                return;
            }
            return;
        }
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A01;
        if (!(!groupChatLiveLocationsActivity.A0H) && groupChatLiveLocationsActivity.A05 != null) {
            if (groupChatLiveLocationsActivity.A0N.A0Q != null && !groupChatLiveLocationsActivity.A0Z) {
                groupChatLiveLocationsActivity.A0Z = true;
                C60072nL r6 = groupChatLiveLocationsActivity.A0N.A0Q;
                C20269AEc aEc = new C20269AEc(r6.A00, r6.A01);
                float A032 = GroupChatLiveLocationsActivity.A03(groupChatLiveLocationsActivity, r6.A02, -1.0f);
                if (A032 > groupChatLiveLocationsActivity.A05.A02().A02 || A032 == -1.0f) {
                    dae = groupChatLiveLocationsActivity.A05;
                    cxl = new CXL();
                    cxl.A06 = aEc;
                } else {
                    dae = groupChatLiveLocationsActivity.A05;
                    cxl = C25306CdA.A01(aEc, A032);
                }
                dae.A0A(cxl, groupChatLiveLocationsActivity.A04, 1500);
            } else if (!groupChatLiveLocationsActivity.A0N.A0W) {
                GroupChatLiveLocationsActivity.A0q(groupChatLiveLocationsActivity, true);
            }
        }
    }

    public void A0S() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) obj;
            if (!(!groupChatLiveLocationsActivity2.A0H)) {
                GroupChatLiveLocationsActivity2.A0c(groupChatLiveLocationsActivity2);
                A0R();
                if (!groupChatLiveLocationsActivity2.A0O.A0W) {
                    groupChatLiveLocationsActivity2.A0N.setLocationMode(2);
                    return;
                }
                return;
            }
            return;
        }
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) obj;
        if (!(!groupChatLiveLocationsActivity.A0H)) {
            GroupChatLiveLocationsActivity.A0c(groupChatLiveLocationsActivity);
            A0R();
            if (!groupChatLiveLocationsActivity.A0N.A0W) {
                groupChatLiveLocationsActivity.A0M.setLocationMode(2);
            }
        }
    }

    public void A0T(float f, boolean z) {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) obj;
            int i2 = (int) f;
            groupChatLiveLocationsActivity2.A01 = i2;
            C25284Ccm ccm = groupChatLiveLocationsActivity2.A06;
            if (ccm != null) {
                ccm.A07(0, 0, 0, i2);
            }
        } else {
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) obj;
            int i3 = (int) f;
            groupChatLiveLocationsActivity.A01 = i3;
            DAE dae = groupChatLiveLocationsActivity.A05;
            if (dae != null) {
                dae.A07(0, 0, i3);
            }
        }
        if (z) {
            A0R();
        }
    }

    public void A0W(C139086yC r6) {
        if (this.A00 != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A01;
            C25280Ccd ccd = (C25280Ccd) groupChatLiveLocationsActivity2.A0W.get(r6.A03);
            if (ccd != null) {
                if (!ccd.A09()) {
                    ccd.A08(true);
                }
                ccd.A05(r6.A00());
                Object A012 = ccd.A01();
                if (A012 instanceof C139086yC) {
                    C139086yC r2 = (C139086yC) A012;
                    if (r2.A00 != r6.A00 || r2.A01 != r6.A01) {
                        ccd.A04(CFF.A00(groupChatLiveLocationsActivity2.A0O.A0G(r6)));
                        ccd.A07(groupChatLiveLocationsActivity2.A0O.A0M(r6));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        BPT bpt = (BPT) ((GroupChatLiveLocationsActivity) this.A01).A0V.get(r6.A03);
        if (bpt != null) {
            if (!bpt.A04) {
                bpt.A05(true);
            }
            bpt.A0B(DJ0.A05(r6.A00()));
            A0R();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        r2 = r3.A06.A00().A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        r2 = r4.A05.A0R.A04(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Z(X.C60072nL r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            if (r0 == 0) goto L_0x009a
            java.lang.Object r3 = r8.A01
            com.whatsapp.location.GroupChatLiveLocationsActivity2 r3 = (com.whatsapp.location.GroupChatLiveLocationsActivity2) r3
            X.Ccm r0 = r3.A06
            if (r0 == 0) goto L_0x0099
            com.google.android.gms.maps.internal.IGoogleMapDelegate r1 = r0.A01     // Catch:{ RemoteException -> 0x0093 }
            X.Cyz r1 = (X.C26399Cyz) r1     // Catch:{ RemoteException -> 0x0093 }
            r0 = 8
            X.C26399Cyz.A03(r1, r0)     // Catch:{ RemoteException -> 0x0093 }
            r4 = 1
            r8.A0W = r4
            android.view.View r2 = r8.A0C
            X.7By r0 = r3.A0O
            X.2nL r1 = r0.A0O
            r0 = 8
            if (r1 != 0) goto L_0x0023
            r0 = 0
        L_0x0023:
            r2.setVisibility(r0)
            X.Bti r1 = r3.A0N
            r0 = 2
            r1.setLocationMode(r0)
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x0088
            r3.A0a = r4
            double r4 = r9.A00
            double r0 = r9.A01
            com.google.android.gms.maps.model.LatLng r6 = new com.google.android.gms.maps.model.LatLng
            r6.<init>(r4, r0)
            float r1 = r9.A02
            r0 = 1098907648(0x41800000, float:16.0)
            float r4 = com.whatsapp.location.GroupChatLiveLocationsActivity2.A03(r3, r1, r0)
            X.Ccm r0 = r3.A06
            r0.A05()
            X.Ccm r0 = r3.A06
            com.google.android.gms.maps.model.CameraPosition r0 = r0.A02()
            float r0 = r0.A02
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x008c
            X.Ccm r0 = r3.A06
            X.CZk r0 = r0.A00()
            android.graphics.Point r2 = r0.A00(r6)
            int r1 = r2.x
            if (r1 <= 0) goto L_0x008c
            int r0 = r2.y
            if (r0 <= 0) goto L_0x008c
            X.Bti r0 = r3.A0N
            int r0 = r0.getWidth()
            if (r1 >= r0) goto L_0x008c
            int r1 = r2.y
            X.Bti r0 = r3.A0N
            int r0 = r0.getHeight()
            if (r1 >= r0) goto L_0x008c
            X.Ccm r0 = r3.A06
            r0.A05()
            X.Ccm r2 = r3.A06
            X.CLK r1 = X.C26080Crv.A02(r6, r4)
        L_0x0083:
            X.E2G r0 = r3.A05
            r2.A0A(r1, r0)
        L_0x0088:
            com.whatsapp.location.GroupChatLiveLocationsActivity2.A0c(r3)
            return
        L_0x008c:
            X.Ccm r2 = r3.A06
            X.CLK r1 = X.C26080Crv.A01(r6)
            goto L_0x0083
        L_0x0093:
            r0 = move-exception
            X.Da5 r0 = X.C27226Da5.A00(r0)
            throw r0
        L_0x0099:
            return
        L_0x009a:
            java.lang.Object r4 = r8.A01
            com.whatsapp.location.GroupChatLiveLocationsActivity r4 = (com.whatsapp.location.GroupChatLiveLocationsActivity) r4
            X.DAE r0 = r4.A05
            X.C17960vV.A07(r0)
            r0.A06()
            r7 = 1
            r8.A0W = r7
            android.view.View r2 = r8.A0C
            X.7By r0 = r4.A0N
            X.2nL r1 = r0.A0O
            r0 = 8
            if (r1 != 0) goto L_0x00b4
            r0 = 0
        L_0x00b4:
            r2.setVisibility(r0)
            X.Bth r1 = r4.A0M
            r0 = 2
            r1.setLocationMode(r0)
            double r2 = r9.A00
            double r0 = r9.A01
            X.AEc r5 = new X.AEc
            r5.<init>(r2, r0)
            float r1 = r9.A02
            r0 = 1098907648(0x41800000, float:16.0)
            float r6 = com.whatsapp.location.GroupChatLiveLocationsActivity.A03(r4, r1, r0)
            r4.A0Z = r7
            X.DAE r0 = r4.A05
            X.D44 r0 = r0.A02()
            float r0 = r0.A02
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x010f
            X.DAE r0 = r4.A05
            X.CtJ r0 = r0.A0R
            android.graphics.Point r2 = r0.A04(r5)
            int r1 = r2.x
            if (r1 <= 0) goto L_0x010f
            int r0 = r2.y
            if (r0 <= 0) goto L_0x010f
            X.Bth r0 = r4.A0M
            int r0 = r0.getWidth()
            if (r1 >= r0) goto L_0x010f
            int r1 = r2.y
            X.Bth r0 = r4.A0M
            int r0 = r0.getHeight()
            if (r1 >= r0) goto L_0x010f
            X.DAE r3 = r4.A05
            X.CXL r2 = X.C25306CdA.A01(r5, r6)
        L_0x0104:
            X.E7P r1 = r4.A04
            r0 = 1500(0x5dc, float:2.102E-42)
            r3.A0A(r2, r1, r0)
            com.whatsapp.location.GroupChatLiveLocationsActivity.A0c(r4)
            return
        L_0x010f:
            X.DAE r3 = r4.A05
            X.CXL r2 = new X.CXL
            r2.<init>()
            r2.A06 = r5
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23999Btg.A0Z(X.2nL):void");
    }

    public void onLocationChanged(Location location) {
        int i = this.A00;
        super.onLocationChanged(location);
        if (i != 0) {
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A01;
            if (groupChatLiveLocationsActivity2.A0O.A0U && location != null) {
                C17960vV.A07(groupChatLiveLocationsActivity2.A06);
                groupChatLiveLocationsActivity2.A06.A0A(C26080Crv.A01(DJ0.A0C(location)), groupChatLiveLocationsActivity2.A05);
            }
            groupChatLiveLocationsActivity2.A0N.A06 = location;
            return;
        }
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A01;
        if (groupChatLiveLocationsActivity.A0N.A0U && location != null) {
            C17960vV.A07(groupChatLiveLocationsActivity.A05);
            C20269AEc A0T = BEA.A0T(location);
            DAE dae = groupChatLiveLocationsActivity.A05;
            CXL cxl = new CXL();
            cxl.A06 = A0T;
            dae.A08(cxl);
        }
    }
}
