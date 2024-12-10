package X;

import android.content.Context;
import android.view.OrientationEventListener;
import com.facebook.smartcapture.camera.CameraFragment;
import com.facebook.smartcapture.docauth.DocAuthManager;
import java.util.List;

/* renamed from: X.BUm  reason: case insensitive filesystem */
public class C22901BUm extends C6E {
    public final int A00;
    public final Object A01;

    public C22901BUm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void A01(Object obj) {
        CY3 cy3;
        CY3 cy32;
        DAU dau;
        List list;
        int i;
        C28614EAk eAk;
        C28555E7g e7g;
        DocAuthManager docAuthManager;
        OrientationEventListener orientationEventListener;
        switch (this.A00) {
            case 0:
                DAU dau2 = (DAU) this.A01;
                synchronized (dau2.A0S) {
                    if (dau2.A0b && (cy3 = dau2.A0a) != null) {
                        Object[] A1b = AnonymousClass3MW.A1b();
                        AnonymousClass001.A1Q(cy3, obj, A1b);
                        C108955ca.A1F(dau2.A0I, A1b, 8);
                    }
                }
                return;
            case 1:
                ((DAU) this.A01).A0D = null;
                return;
            case 2:
                Object[] A1a = BE6.A1a();
                DAU dau3 = (DAU) this.A01;
                A1a[0] = dau3;
                A1a[1] = dau3.A0D;
                AnonymousClass3Ma.A1S(A1a, dau3.A08);
                C17890vO.A1G(A1a, dau3.A06);
                C108955ca.A1F(dau3.A0I, A1a, 15);
                return;
            case 3:
                C25556Chu chu = (C25556Chu) obj;
                dau = (DAU) this.A01;
                dau.A0D = chu;
                if (!dau.A0H) {
                    DAU.A02(dau, chu);
                    DAU.A03(dau, chu);
                    C28614EAk eAk2 = dau.A0Q;
                    eAk2.CJh(dau.A0L);
                    if (dau.A0A != null) {
                        eAk2.BBU(dau.A0M);
                    }
                    list = dau.A0P.A00;
                    i = 1;
                    break;
                } else {
                    return;
                }
            case 4:
                C25556Chu chu2 = (C25556Chu) obj;
                dau = (DAU) this.A01;
                dau.A0D = chu2;
                if (!dau.A0H) {
                    DAU.A02(dau, chu2);
                    C28614EAk eAk3 = dau.A0Q;
                    if (eAk3 != null && eAk3.isConnected()) {
                        dau.A00 = C25866CnZ.A00(eAk3.getCameraFacing());
                        DAU.A03(dau, chu2);
                        list = dau.A0P.A00;
                        i = 2;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 5:
                ((C22808BPw) this.A01).A0S = null;
                return;
            case 6:
                C22808BPw bPw = (C22808BPw) this.A01;
                C22808BPw.A04(bPw, (C25556Chu) obj, bPw.A07, bPw.A05);
                return;
            case 7:
                C25556Chu chu3 = (C25556Chu) obj;
                C22808BPw bPw2 = (C22808BPw) this.A01;
                bPw2.A0S = chu3;
                CJP cjp = bPw2.A0E;
                if (cjp != null) {
                    bPw2.A0i.BBB(cjp);
                }
                if (!bPw2.A0b && bPw2.A0a) {
                    C22808BPw.A05(bPw2, "camera_connect_callback_started");
                    bPw2.A00 = C25866CnZ.A00(chu3.A00);
                    C22808BPw.A03(bPw2, chu3);
                    C28614EAk eAk4 = bPw2.A0i;
                    AnonymousClass86M r1 = bPw2.A0M;
                    if (r1 == null) {
                        r1 = new DEL(bPw2, 1);
                        bPw2.A0M = r1;
                    }
                    eAk4.CJh(r1);
                    if (bPw2.A0B != null) {
                        try {
                            E4h e4h = bPw2.A0N;
                            if (e4h == null) {
                                e4h = new DEM(bPw2, 1);
                                bPw2.A0N = e4h;
                            }
                            eAk4.BBU(e4h);
                        } catch (C27206DZg unused) {
                        }
                    }
                    Float f = bPw2.A0X;
                    if (f != null) {
                        bPw2.A0G(f.floatValue());
                    }
                    C26379Cyf.A08(bPw2.A0g.A00);
                    C22808BPw.A05(bPw2, "camera_connect_callback_finished");
                    return;
                }
                return;
            case 8:
                C25556Chu chu4 = (C25556Chu) obj;
                C22808BPw bPw3 = (C22808BPw) this.A01;
                bPw3.A0S = chu4;
                if (!bPw3.A0b && (eAk = bPw3.A0i) != null && eAk.isConnected()) {
                    bPw3.A00 = C25866CnZ.A00(chu4.A00);
                    C22808BPw.A03(bPw3, chu4);
                    Float f2 = bPw3.A0X;
                    if (f2 != null) {
                        bPw3.A0G(f2.floatValue());
                    }
                    C25132CZh cZh = bPw3.A0g;
                    C26379Cyf.A09(cZh.A00);
                    C26379Cyf.A08(cZh.A00);
                    return;
                }
                return;
            case 9:
                C25815CmS cmS = (C25815CmS) obj;
                BQ0 bq0 = (BQ0) this.A01;
                synchronized (bq0.A03) {
                    if (bq0.A05 == AnonymousClass00R.A01 && (cy32 = bq0.A04) != null) {
                        C26379Cyf.A04(C25866CnZ.A02(cmS), cy32);
                    }
                }
                return;
            case 10:
                ((BUG) this.A01).A02 = false;
                return;
            case 14:
                CameraFragment cameraFragment = (CameraFragment) this.A01;
                BHG bhg = cameraFragment.A01;
                if (bhg != null) {
                    C26132Csv csv = (C26132Csv) CameraFragment.A00(C25971Cpe.A0q, cameraFragment);
                    if (!(csv == null || (docAuthManager = (DocAuthManager) cameraFragment.A08.BbC()) == null)) {
                        docAuthManager.A00 = C25450Cg1.A00(bhg.getWidth(), bhg.getHeight(), csv.A02, csv.A01);
                        docAuthManager.A02.getResources().getDisplayMetrics();
                    }
                    if (cameraFragment.A04) {
                        bhg.A0Q.BBU(cameraFragment);
                    }
                    C25556Chu chu5 = cameraFragment.A00;
                    if (chu5 != null && (e7g = (C28555E7g) cameraFragment.A09.BbC()) != null) {
                        e7g.Bvy(chu5);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                C25556Chu chu6 = (C25556Chu) obj;
                C18070vi.A0d(chu6, 0);
                BHG bhg2 = (BHG) this.A01;
                bhg2.A06 = chu6;
                bhg2.setCameraDeviceRotation(chu6);
                Context A04 = AnonymousClass3MY.A04(bhg2);
                OrientationEventListener orientationEventListener2 = bhg2.A02;
                if (orientationEventListener2 == null) {
                    orientationEventListener2 = new BH8(A04, bhg2, 1);
                    bhg2.A02 = orientationEventListener2;
                }
                if (orientationEventListener2.canDetectOrientation() && (orientationEventListener = bhg2.A02) != null) {
                    orientationEventListener.enable();
                }
                C28555E7g e7g2 = bhg2.A08;
                if (e7g2 != null) {
                    e7g2.Bvy(chu6);
                    return;
                }
                return;
            case 17:
                ((BHG) this.A01).A06 = null;
                return;
            case 18:
                C25556Chu chu7 = (C25556Chu) obj;
                C18070vi.A0d(chu7, 0);
                BHG bhg3 = (BHG) this.A01;
                BHG.A01(chu7, bhg3, bhg3.getWidth(), bhg3.getHeight());
                return;
            default:
                return;
        }
        C108955ca.A1F(dau.A0I, list, i);
    }
}
