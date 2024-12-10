package X;

import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;
import com.whatsapp.location.PlaceInfo;

/* renamed from: X.Bto  reason: case insensitive filesystem */
public class C24002Bto extends AnonymousClass75M {
    public Object A00;
    public final int A01 = 1;
    public final Object A02;

    public int A0G() {
        if (this.A01 != 0) {
            CLr cLr = ((LocationPicker2) this.A02).A0T;
            if (cLr == null) {
                return 0;
            }
            C25284Ccm ccm = cLr.A00;
            Location A0D = AnonymousClass8BX.A0D(ccm.A02().A03, "");
            C23164BcK A022 = ccm.A00().A02();
            Location location = new Location("");
            LatLng latLng = A022.A02;
            double d = latLng.A00;
            LatLng latLng2 = A022.A03;
            location.setLatitude((d + latLng2.A00) / 2.0d);
            location.setLongitude((latLng.A01 + latLng2.A01) / 2.0d);
            A0D.distanceTo(location);
            return 0;
        }
        Location A0H = A0H();
        DAE dae = ((LocationPicker) this.A02).A03;
        if (dae == null || A0H == null) {
            return 0;
        }
        C25216CbC A06 = dae.A0R.A06();
        Location location2 = new Location("");
        C20269AEc aEc = A06.A02;
        double d2 = aEc.A00;
        C20269AEc aEc2 = A06.A03;
        location2.setLatitude((d2 + aEc2.A00) / 2.0d);
        location2.setLongitude((aEc.A01 + aEc2.A01) / 2.0d);
        return (int) A0H.distanceTo(location2);
    }

    public Location A0H() {
        int i = this.A01;
        Object obj = this.A02;
        if (i != 0) {
            CLr cLr = ((LocationPicker2) obj).A0T;
            if (cLr != null) {
                return AnonymousClass8BX.A0D(cLr.A00.A02().A03, "");
            }
            return null;
        }
        DAE dae = ((LocationPicker) obj).A03;
        if (dae == null) {
            return null;
        }
        C20269AEc aEc = dae.A02().A03;
        Location location = new Location("");
        location.setLatitude(aEc.A00);
        location.setLongitude(aEc.A01);
        return location;
    }

    public void A0L() {
        int i = this.A01;
        Object obj = this.A02;
        if (i != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) obj;
            C25284Ccm ccm = locationPicker2.A02;
            if (ccm != null) {
                locationPicker2.A05 = null;
                try {
                    C26399Cyz.A03((C26399Cyz) ccm.A01, 14);
                } catch (RemoteException e) {
                    throw C27226Da5.A00(e);
                }
            }
        } else {
            LocationPicker locationPicker = (LocationPicker) obj;
            DAE dae = locationPicker.A03;
            if (dae != null) {
                locationPicker.A04 = null;
                dae.A05();
            }
        }
    }

    public void A0M() {
        PlaceInfo placeInfo;
        Object obj;
        PlaceInfo placeInfo2;
        Object obj2;
        int i = this.A01;
        Object obj3 = this.A02;
        if (i != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) obj3;
            if (locationPicker2.A02 != null && (placeInfo2 = locationPicker2.A0V.A0U) != null && (obj2 = placeInfo2.A0D) != null) {
                C25280Ccd ccd = (C25280Ccd) obj2;
                ccd.A04(locationPicker2.A04);
                ccd.A02();
                return;
            }
            return;
        }
        LocationPicker locationPicker = (LocationPicker) obj3;
        if (locationPicker.A03 != null && (placeInfo = locationPicker.A0O.A0U) != null && (obj = placeInfo.A0D) != null) {
            BPT bpt = (BPT) obj;
            bpt.A0C(locationPicker.A06);
            bpt.A09();
        }
    }

    public void A0N() {
        C20283AEr aEr;
        C20283AEr aEr2;
        if (this.A01 != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) this.A02;
            if (locationPicker2.A02 != null) {
                if (!this.A0i && locationPicker2.A05 == null) {
                    A0L();
                }
                if (!this.A0i && (aEr2 = this.A0V) != null) {
                    for (PlaceInfo placeInfo : aEr2.A0D) {
                        C23100BbF bbF = new C23100BbF();
                        bbF.A08 = new LatLng(placeInfo.A01, placeInfo.A02);
                        if (!TextUtils.isEmpty(placeInfo.A06)) {
                            bbF.A09 = placeInfo.A06;
                        }
                        if (!TextUtils.isEmpty(placeInfo.A09)) {
                            bbF.A0A = placeInfo.A09;
                        }
                        bbF.A07 = locationPicker2.A03;
                        bbF.A00 = 0.5f;
                        bbF.A01 = 0.5f;
                        C25280Ccd A03 = locationPicker2.A02.A03(bbF);
                        A03.A06(placeInfo);
                        placeInfo.A0D = A03;
                    }
                    return;
                }
                return;
            }
            return;
        }
        LocationPicker locationPicker = (LocationPicker) this.A02;
        if (locationPicker.A03 != null) {
            if (!this.A0i && locationPicker.A04 == null) {
                A0L();
            }
            if (!this.A0i && (aEr = this.A0V) != null) {
                for (PlaceInfo placeInfo2 : aEr.A0D) {
                    C25612Cis cis = new C25612Cis();
                    cis.A00 = new C20269AEc(placeInfo2.A01, placeInfo2.A02);
                    if (!TextUtils.isEmpty(placeInfo2.A06)) {
                        cis.A03 = placeInfo2.A06;
                    }
                    if (!TextUtils.isEmpty(placeInfo2.A09)) {
                        cis.A02 = placeInfo2.A09;
                    }
                    cis.A01 = locationPicker.A05;
                    float[] fArr = cis.A06;
                    fArr[0] = 0.5f;
                    fArr[1] = 0.5f;
                    DAE dae = locationPicker.A03;
                    BPT bpt = new BPT(dae, cis);
                    dae.A0B(bpt);
                    bpt.A0D = dae;
                    bpt.A0F = placeInfo2;
                    placeInfo2.A0D = bpt;
                }
            }
        }
    }

    public void A0O() {
        int i = this.A01;
        Object obj = this.A02;
        if (i != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) obj;
            if (locationPicker2.A02 != null && locationPicker2.A0M.A06()) {
                locationPicker2.A02.A0K(true);
                return;
            }
            return;
        }
        LocationPicker locationPicker = (LocationPicker) obj;
        if (locationPicker.A03 != null && locationPicker.A0H.A06()) {
            locationPicker.A03.A0D(true);
        }
    }

    public void A0P() {
        PlaceInfo placeInfo;
        Object obj;
        PlaceInfo placeInfo2;
        Object obj2;
        int i = this.A01;
        Object obj3 = this.A02;
        if (i != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) obj3;
            if (locationPicker2.A02 != null && (placeInfo2 = locationPicker2.A0V.A0U) != null && (obj2 = placeInfo2.A0D) != null) {
                C25280Ccd ccd = (C25280Ccd) obj2;
                ccd.A04(locationPicker2.A04);
                ccd.A03();
                return;
            }
            return;
        }
        LocationPicker locationPicker = (LocationPicker) obj3;
        if (locationPicker.A03 != null && (placeInfo = locationPicker.A0O.A0U) != null && (obj = placeInfo.A0D) != null) {
            BPT bpt = (BPT) obj;
            bpt.A0C(locationPicker.A06);
            bpt.A0A();
        }
    }

    public void A0R(int i) {
        int i2 = this.A01;
        Object obj = this.A02;
        if (i2 != 0) {
            C25284Ccm ccm = ((LocationPicker2) obj).A02;
            if (ccm != null) {
                ccm.A07(0, 0, 0, i);
                return;
            }
            return;
        }
        DAE dae = ((LocationPicker) obj).A03;
        if (dae != null) {
            dae.A07(0, 0, i);
        }
    }

    public void A0T(Location location, Float f, int i, boolean z) {
        float floatValue;
        float floatValue2;
        if (this.A01 != 0) {
            CLr cLr = ((LocationPicker2) this.A02).A0T;
            if (cLr != null) {
                Integer valueOf = Integer.valueOf(i);
                E2G e2g = (E2G) this.A00;
                if (location != null) {
                    LatLng A0C = DJ0.A0C(location);
                    C25284Ccm ccm = cLr.A00;
                    float f2 = ccm.A02().A02;
                    if (f == null) {
                        floatValue2 = 0.0f;
                    } else {
                        floatValue2 = f.floatValue();
                    }
                    float f3 = f2 + floatValue2;
                    if (valueOf != null) {
                        ccm.A07(0, 0, 0, valueOf.intValue());
                    }
                    CLK A022 = C26080Crv.A02(A0C, f3);
                    if (z) {
                        ccm.A0B(A022, e2g);
                    } else {
                        ccm.A09(A022);
                    }
                }
            }
        } else {
            LocationPicker locationPicker = (LocationPicker) this.A02;
            if (locationPicker.A03 != null && location != null) {
                C20269AEc A0T = BEA.A0T(location);
                float f4 = locationPicker.A03.A02().A02;
                if (f == null) {
                    floatValue = 0.0f;
                } else {
                    floatValue = f.floatValue();
                }
                locationPicker.A03.A07(0, 0, i);
                CXL A012 = C25306CdA.A01(A0T, f4 + floatValue);
                DAE dae = locationPicker.A03;
                if (z) {
                    dae.A0A(A012, (E7P) this.A00, 400);
                } else {
                    dae.A09(A012);
                }
            }
        }
    }

    public void A0W(LatLngBounds latLngBounds, boolean z) {
        CXL cxl;
        if (this.A01 != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) this.A02;
            CLr cLr = locationPicker2.A0T;
            if (cLr != null) {
                Context context = locationPicker2.A00.getContext();
                if (z) {
                    C25284Ccm ccm = cLr.A00;
                    LatLng latLng = latLngBounds.A01;
                    double d = latLng.A00;
                    LatLng latLng2 = latLngBounds.A00;
                    double d2 = (d + latLng2.A00) / 2.0d;
                    double d3 = latLng2.A01;
                    double d4 = latLng.A01;
                    if (d4 > d3) {
                        d3 += 360.0d;
                    }
                    ccm.A08(C26080Crv.A02(new LatLng(d2, (d3 + d4) / 2.0d), 15.0f));
                    return;
                }
                cLr.A00.A08(C26080Crv.A03(latLngBounds, context.getResources().getDimensionPixelSize(2131166923)));
                return;
            }
            return;
        }
        LocationPicker locationPicker = (LocationPicker) this.A02;
        if (locationPicker.A03 != null) {
            C20278AEl aEl = new C20278AEl(DJ0.A05(latLngBounds.A01), DJ0.A05(latLngBounds.A00));
            DAE dae = locationPicker.A03;
            if (z) {
                cxl = C25306CdA.A01(aEl.A00(), 15.0f);
            } else {
                int dimensionPixelSize = locationPicker.getResources().getDimensionPixelSize(2131167320);
                cxl = new CXL();
                cxl.A07 = aEl;
                cxl.A05 = dimensionPixelSize;
            }
            dae.A08(cxl);
        }
    }

    public void A0b(boolean z) {
        if (this.A01 != 0) {
            LocationPicker2 locationPicker2 = (LocationPicker2) this.A02;
            if (locationPicker2.A02 != null) {
                if (locationPicker2.A05 == null) {
                    A0L();
                }
                Location location = this.A05;
                if (location != null) {
                    LatLng latLng = new LatLng(location.getLatitude(), this.A05.getLongitude());
                    LocationPicker2.A0V(latLng, locationPicker2);
                    locationPicker2.A02.A0K(false);
                    CameraPosition cameraPosition = new CameraPosition(latLng, 15.0f, 0.0f, 0.0f);
                    C25284Ccm ccm = locationPicker2.A02;
                    CLK A002 = C26080Crv.A00(cameraPosition);
                    if (z) {
                        ccm.A0B(A002, (E2G) this.A00);
                    } else {
                        ccm.A09(A002);
                    }
                }
            }
        } else {
            LocationPicker locationPicker = (LocationPicker) this.A02;
            if (locationPicker.A03 != null) {
                if (locationPicker.A04 == null) {
                    A0L();
                }
                Location location2 = this.A05;
                if (location2 != null) {
                    C20269AEc aEc = new C20269AEc(location2.getLatitude(), this.A05.getLongitude());
                    LocationPicker.A0Q(aEc, locationPicker);
                    locationPicker.A03.A0D(false);
                    D44 d44 = new D44(aEc, 15.0f, Float.MIN_VALUE, 0.0f);
                    DAE dae = locationPicker.A03;
                    CXL A003 = C25306CdA.A00(d44);
                    if (z) {
                        dae.A0A(A003, (E7P) this.A00, 400);
                    } else {
                        dae.A09(A003);
                    }
                }
            }
        }
    }

    public boolean A0d() {
        Object obj;
        int i = this.A01;
        Object obj2 = this.A02;
        if (i != 0) {
            obj = ((LocationPicker2) obj2).A02;
        } else {
            obj = ((LocationPicker) obj2).A03;
        }
        return AnonymousClass000.A1W(obj);
    }

    public void onLocationChanged(Location location) {
        DAE dae;
        C25284Ccm ccm;
        if (this.A01 != 0) {
            if (location != null) {
                LocationPicker2 locationPicker2 = (LocationPicker2) this.A02;
                if (locationPicker2.A0V.A05 == null && (ccm = locationPicker2.A02) != null) {
                    ccm.A09(C26080Crv.A01(DJ0.A0C(location)));
                }
                if (locationPicker2.A0V.A0i && locationPicker2.A02 != null) {
                    if (locationPicker2.A05 == null) {
                        A0L();
                    }
                    LocationPicker2.A0V(DJ0.A0C(location), locationPicker2);
                }
                if (locationPicker2.A0V.A0h && locationPicker2.A02 != null) {
                    locationPicker2.A02.A08(C26080Crv.A01(DJ0.A0C(location)));
                }
                locationPicker2.A0U.A06 = location;
            } else {
                return;
            }
        } else if (location != null) {
            LocationPicker locationPicker = (LocationPicker) this.A02;
            if (locationPicker.A0O.A05 == null && (dae = locationPicker.A03) != null) {
                C20269AEc A0T = BEA.A0T(location);
                CXL cxl = new CXL();
                cxl.A06 = A0T;
                dae.A09(cxl);
            }
            if (locationPicker.A0O.A0i && locationPicker.A03 != null) {
                if (locationPicker.A04 == null) {
                    A0L();
                }
                LocationPicker.A0Q(BEA.A0T(location), locationPicker);
            }
            if (locationPicker.A0O.A0h && locationPicker.A03 != null) {
                C20269AEc A0T2 = BEA.A0T(location);
                DAE dae2 = locationPicker.A03;
                CXL cxl2 = new CXL();
                cxl2.A06 = A0T2;
                dae2.A08(cxl2);
            }
        } else {
            return;
        }
        super.onLocationChanged(location);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24002Bto(X.C19880zA r42, X.AnonymousClass1L9 r43, X.AnonymousClass195 r44, X.AnonymousClass190 r45, X.AnonymousClass1RB r46, X.AnonymousClass1KB r47, X.AnonymousClass11S r48, X.AnonymousClass181 r49, X.C33251iW r50, X.AnonymousClass1VW r51, X.AnonymousClass1PM r52, X.C25491Ok r53, X.C27191Vc r54, X.C88184Yq r55, X.AnonymousClass11C r56, X.AnonymousClass11P r57, X.AnonymousClass118 r58, X.C219217x r59, X.C19830z4 r60, X.C18000vb r61, X.AnonymousClass1CJ r62, X.AnonymousClass1L2 r63, X.A59 r64, X.C1193267r r65, X.AnonymousClass1KW r66, com.whatsapp.emoji.search.EmojiSearchProvider r67, X.C18030ve r68, X.AnonymousClass1D9 r69, X.AnonymousClass1LU r70, com.whatsapp.location.LocationPicker2 r71, X.C27131Uv r72, X.AnonymousClass689 r73, X.C198679yj r74, com.whatsapp.nativelibloader.WhatsAppLibLoader r75, X.C18010vc r76, X.AnonymousClass1W6 r77, X.AnonymousClass129 r78, X.AnonymousClass1L4 r79, X.AnonymousClass10I r80) {
        /*
            r41 = this;
            r0 = 1
            r2 = r41
            r2.A01 = r0
            r0 = r71
            r2.A02 = r0
            r30 = r69
            r29 = r68
            r28 = r67
            r27 = r66
            r26 = r65
            r25 = r64
            r24 = r63
            r23 = r62
            r22 = r61
            r21 = r60
            r20 = r59
            r31 = r70
            r3 = r42
            r32 = r72
            r4 = r43
            r33 = r73
            r5 = r44
            r34 = r74
            r6 = r45
            r35 = r75
            r7 = r46
            r36 = r76
            r8 = r47
            r37 = r77
            r9 = r48
            r13 = r52
            r38 = r78
            r10 = r49
            r14 = r53
            r39 = r79
            r11 = r50
            r40 = r80
            r12 = r51
            r15 = r54
            r16 = r55
            r17 = r56
            r18 = r57
            r19 = r58
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r1 = 2
            X.DKI r0 = new X.DKI
            r0.<init>(r2, r1)
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24002Bto.<init>(X.0zA, X.1L9, X.195, X.190, X.1RB, X.1KB, X.11S, X.181, X.1iW, X.1VW, X.1PM, X.1Ok, X.1Vc, X.4Yq, X.11C, X.11P, X.118, X.17x, X.0z4, X.0vb, X.1CJ, X.1L2, X.A59, X.67r, X.1KW, com.whatsapp.emoji.search.EmojiSearchProvider, X.0ve, X.1D9, X.1LU, com.whatsapp.location.LocationPicker2, X.1Uv, X.689, X.9yj, com.whatsapp.nativelibloader.WhatsAppLibLoader, X.0vc, X.1W6, X.129, X.1L4, X.10I):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24002Bto(X.C19880zA r42, X.AnonymousClass1L9 r43, X.AnonymousClass195 r44, X.AnonymousClass190 r45, X.AnonymousClass1RB r46, X.AnonymousClass1KB r47, X.AnonymousClass11S r48, X.AnonymousClass181 r49, X.C33251iW r50, X.AnonymousClass1VW r51, X.AnonymousClass1PM r52, X.C25491Ok r53, X.C27191Vc r54, X.C88184Yq r55, X.AnonymousClass11C r56, X.AnonymousClass11P r57, X.AnonymousClass118 r58, X.C219217x r59, X.C19830z4 r60, X.C18000vb r61, X.AnonymousClass1CJ r62, X.AnonymousClass1L2 r63, X.A59 r64, X.C1193267r r65, X.AnonymousClass1KW r66, com.whatsapp.emoji.search.EmojiSearchProvider r67, X.C18030ve r68, X.AnonymousClass1D9 r69, X.AnonymousClass1LU r70, com.whatsapp.location.LocationPicker r71, X.C27131Uv r72, X.AnonymousClass689 r73, X.C198679yj r74, com.whatsapp.nativelibloader.WhatsAppLibLoader r75, X.C18010vc r76, X.AnonymousClass1W6 r77, X.AnonymousClass129 r78, X.AnonymousClass1L4 r79, X.AnonymousClass10I r80) {
        /*
            r41 = this;
            r0 = 0
            r2 = r41
            r2.A01 = r0
            r0 = r71
            r2.A02 = r0
            r30 = r69
            r29 = r68
            r28 = r67
            r27 = r66
            r26 = r65
            r25 = r64
            r24 = r63
            r23 = r62
            r22 = r61
            r21 = r60
            r20 = r59
            r31 = r70
            r3 = r42
            r32 = r72
            r4 = r43
            r33 = r73
            r5 = r44
            r34 = r74
            r6 = r45
            r35 = r75
            r7 = r46
            r36 = r76
            r8 = r47
            r37 = r77
            r9 = r48
            r13 = r52
            r38 = r78
            r10 = r49
            r14 = r53
            r39 = r79
            r11 = r50
            r40 = r80
            r12 = r51
            r15 = r54
            r16 = r55
            r17 = r56
            r18 = r57
            r19 = r58
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r1 = 3
            X.DA4 r0 = new X.DA4
            r0.<init>(r2, r1)
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24002Bto.<init>(X.0zA, X.1L9, X.195, X.190, X.1RB, X.1KB, X.11S, X.181, X.1iW, X.1VW, X.1PM, X.1Ok, X.1Vc, X.4Yq, X.11C, X.11P, X.118, X.17x, X.0z4, X.0vb, X.1CJ, X.1L2, X.A59, X.67r, X.1KW, com.whatsapp.emoji.search.EmojiSearchProvider, X.0ve, X.1D9, X.1LU, com.whatsapp.location.LocationPicker, X.1Uv, X.689, X.9yj, com.whatsapp.nativelibloader.WhatsAppLibLoader, X.0vc, X.1W6, X.129, X.1L4, X.10I):void");
    }
}
