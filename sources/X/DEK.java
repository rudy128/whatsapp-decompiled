package X;

import android.graphics.Point;
import com.whatsapp.camera.litecamera.LiteCameraView;

public class DEK implements C28500E4g {
    public final int A00;
    public final Object A01;

    public DEK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bun(Point point, Integer num) {
        Object[] objArr;
        int i;
        int i2;
        C28598E9p e9p;
        C28598E9p e9p2;
        boolean z;
        long j;
        switch (this.A00) {
            case 0:
                DAU dau = (DAU) this.A01;
                C24819CLm cLm = dau.A0E;
                if (cLm != null) {
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        if (intValue != 3) {
                            if (intValue == 4 || intValue == 5) {
                                i2 = 13;
                            } else if (intValue == 1) {
                                i2 = 14;
                            } else {
                                return;
                            }
                            C108955ca.A1F(dau.A0I, cLm, i2);
                            return;
                        } else if (point != null) {
                            objArr = C108945cZ.A1a(cLm, point, 2, 1);
                            i = 12;
                        } else {
                            return;
                        }
                    } else if (point != null) {
                        objArr = C108945cZ.A1a(cLm, point, 2, 1);
                        i = 11;
                    } else {
                        return;
                    }
                    C108955ca.A1F(dau.A0I, objArr, i);
                    return;
                }
                return;
            case 1:
                C24819CLm cLm2 = ((C22808BPw) this.A01).A0U;
                if (cLm2 != null) {
                    switch (num.intValue()) {
                        case 0:
                            if (point != null && (e9p = cLm2.A00.A06) != null) {
                                e9p.Blw((float) point.x, (float) point.y);
                                return;
                            }
                            return;
                        case 1:
                        case 4:
                        case 5:
                            LiteCameraView liteCameraView = cLm2.A00;
                            liteCameraView.A0R.CJ0((C24819CLm) null);
                            e9p2 = liteCameraView.A06;
                            if (e9p2 != null) {
                                z = false;
                                break;
                            } else {
                                return;
                            }
                        case 3:
                            if (point != null) {
                                LiteCameraView liteCameraView2 = cLm2.A00;
                                liteCameraView2.A0R.CJ0((C24819CLm) null);
                                e9p2 = liteCameraView2.A06;
                                if (e9p2 != null) {
                                    z = true;
                                    break;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        default:
                            return;
                    }
                    e9p2.Blx(z);
                    return;
                }
                return;
            default:
                C26810DEs dEs = (C26810DEs) this.A01;
                if (!dEs.A0e) {
                    if (dEs.A0D) {
                        j = 4000;
                    } else {
                        j = 2000;
                    }
                    synchronized (dEs) {
                        C26810DEs.A06(dEs);
                        dEs.A0d = dEs.A0S.A02("reset_focus", new C27132DVt((Object) dEs, 2), j);
                    }
                    return;
                }
                return;
        }
    }
}
