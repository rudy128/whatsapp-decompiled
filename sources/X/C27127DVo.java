package X;

import android.hardware.Camera;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DVo  reason: case insensitive filesystem */
public class C27127DVo implements Callable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C27127DVo(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A04 = obj3;
        this.A02 = i;
        this.A05 = obj2;
        this.A01 = i2;
    }

    public final Object call() {
        if (this.A00 != 0) {
            C26175Cts.A01((Object) null, 11, 0);
            C26809DEr dEr = (C26809DEr) this.A03;
            if (!(dEr.A0o == null || dEr.A0o == ((C25119CYs) this.A04).A02)) {
                EAW eaw = dEr.A0o;
                dEr.A0o.Ba1();
                eaw.CEN();
            }
            C25119CYs cYs = (C25119CYs) this.A04;
            EAW eaw2 = cYs.A02;
            dEr.A0o = eaw2;
            EB1 eb1 = (EB1) eaw2.BVm(EB1.A00);
            dEr.A0D = eb1;
            if (eb1 == null) {
                dEr.A0D = EB1.A01;
            }
            dEr.A0G = cYs;
            EBS ebs = (EBS) this.A05;
            dEr.A0B = ebs;
            Map map = (Map) ebs.BMB(EBS.A02);
            if (!map.isEmpty()) {
                C26221CvA cvA = dEr.A0S;
                if (!map.isEmpty()) {
                    cvA.A00 = map;
                    if (cvA.A01.A09()) {
                        C26221CvA.A03(cvA);
                    }
                }
            }
            dEr.A02 = this.A01;
            dEr.A0K = BE9.A1S(EBS.A0K, ebs);
            C26221CvA cvA2 = dEr.A0S;
            int i = this.A02;
            if (cvA2.A01.A09()) {
                C26221CvA.A02(cvA2);
                int i2 = 1;
                if (i == 1) {
                    i2 = 0;
                }
                if (!cvA2.A08(i2)) {
                    if (cvA2.A05 == null) {
                        throw AnonymousClass8BR.A0w("Logical cameras not initialised!");
                    } else if (cvA2.A05.length == 0) {
                        throw new C22894BUf();
                    } else if (i != 0 || !cvA2.A08(0)) {
                        if (i != 1 || !cvA2.A08(1)) {
                            StringBuilder A0u = BE6.A0u("Camera 2 API - Could not get CameraInfo for CameraFacing id: ");
                            A0u.append(i);
                            A0u.append(" Number Of Cameras: ");
                            A0u.append(C26221CvA.A06);
                            A0u.append(" BACK: ");
                            boolean z = C26221CvA.A07;
                            A0u.append(z);
                            A0u.append(" FRONT: ");
                            A0u.append(z);
                            CPY[] cpyArr = cvA2.A05;
                            if (cpyArr != null) {
                                A0u.append(" Camera Info size: ");
                                A0u.append(r1);
                                A0u.append(" Camera lenses: ");
                                for (CPY cpy : cpyArr) {
                                    A0u.append(cpy.A01);
                                    BE6.A1J(A0u);
                                }
                            } else {
                                A0u.append(" Camera Info NULL");
                            }
                            throw BE8.A0f(A0u);
                        }
                        C26175Cts.A03("CameraInventory", "Requested front camera doesn't exist, using back instead");
                        i = 0;
                    } else {
                        C26175Cts.A03("CameraInventory", "Requested back camera doesn't exist, using front instead");
                        i = 1;
                    }
                }
                dEr.A08 = new C26223CvD();
                String A07 = cvA2.A07(i);
                try {
                    C26809DEr.A04(dEr, A07);
                    dEr.A0B(A07);
                    C26809DEr.A02(dEr);
                    C26809DEr.A03(dEr, (Float) null, A07);
                    C25556Chu A002 = C25556Chu.A00(dEr);
                    C26175Cts.A01(A002, 12, dEr.A00);
                    return A002;
                } catch (Exception e) {
                    C26175Cts.A01(e, 13, 0);
                    dEr.BIp((C6E) null);
                    throw e;
                }
            } else {
                throw AnonymousClass8BR.A0w("Cannot resolve camera facing, not on the Optic thread");
            }
        } else {
            C26810DEs dEs = (C26810DEs) this.A03;
            C25119CYs cYs2 = (C25119CYs) this.A04;
            int i3 = this.A02;
            EBS ebs2 = (EBS) this.A05;
            int i4 = this.A01;
            try {
                C26175Cts.A01((Object) null, 11, 0);
                if (!(dEs.A0c == null || dEs.A0c == cYs2.A02)) {
                    EAW eaw3 = dEs.A0c;
                    dEs.A0c.Ba1();
                    eaw3.CEN();
                    dEs.A0c = null;
                }
                C26194CuP cuP = dEs.A0I;
                C25850CnB cnB = cuP.A00;
                if (cnB.A09()) {
                    if (C26194CuP.A00(cuP, i3) == -1) {
                        int i5 = C26194CuP.A03;
                        if (i5 == -1) {
                            if (C26194CuP.A03(cuP)) {
                                i5 = C26194CuP.A03;
                            } else {
                                cnB.A06("Number of cameras must be loaded on background thread.");
                                i5 = Camera.getNumberOfCameras();
                                C26194CuP.A03 = i5;
                            }
                        }
                        if (i5 > 0) {
                            if (i3 == 0) {
                                if (cuP.A06(1)) {
                                    C26175Cts.A03("CameraInventory", "Requested back camera doesn't exist, using front instead");
                                    i3 = 1;
                                }
                            } else if (i3 == 1 && cuP.A06(0)) {
                                C26175Cts.A03("CameraInventory", "Requested front camera doesn't exist, using back instead");
                                i3 = 0;
                            }
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("found ");
                            A10.append(C26194CuP.A03);
                            throw BE9.A0n(" cameras with bad facing constants", A10);
                        }
                        throw new C22894BUf();
                    }
                    C26810DEs.A07(dEs, i3);
                    C25556Chu A022 = C26810DEs.A02(dEs, ebs2, cYs2, i4);
                    C26175Cts.A01(A022, 12, dEs.A00);
                    return A022;
                }
                throw AnonymousClass8BR.A0w("Cannot resolve camera facing, not on the Optic thread");
            } catch (Exception e2) {
                C26175Cts.A01(e2, 13, 0);
                CV9 cv9 = dEs.A0M;
                AtomicReference atomicReference = cv9.A00;
                BE9.A1M(atomicReference);
                BE9.A1M(atomicReference);
                cv9.A00(0);
                CWY cwy = dEs.A0K;
                cwy.A01.A00();
                cwy.A02.A00();
                dEs.CIz((C28500E4g) null);
                dEs.A0N.A06.A00();
                dEs.A0Q.A00();
                dEs.A09();
                throw e2;
            }
        }
    }
}
