package X;

import android.os.SystemClock;
import com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingCameraFragment;
import java.util.Arrays;

/* renamed from: X.7DT  reason: invalid class name */
public class AnonymousClass7DT implements C28598E9p {
    public final int A00;
    public final Object A01;

    public AnonymousClass7DT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.7DT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.7DY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.7DT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.7DT} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Blw(float r5, float r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 1: goto L_0x000f;
                case 2: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r3 = r4
            java.lang.Object r0 = r4.A01
            X.74G r0 = (X.AnonymousClass74G) r0
            X.1KB r2 = r0.A0W
            r1 = 2
            goto L_0x0016
        L_0x000f:
            java.lang.Object r3 = r4.A01
            X.7DY r3 = (X.AnonymousClass7DY) r3
            X.1KB r2 = r3.A0y
            r1 = 0
        L_0x0016:
            X.7Pn r0 = new X.7Pn
            r0.<init>(r3, r5, r6, r1)
            r2.A0J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7DT.Blw(float, float):void");
    }

    public void Blx(boolean z) {
        AnonymousClass1KB r2;
        Runnable runnable;
        switch (this.A00) {
            case 1:
                AnonymousClass7DY r3 = (AnonymousClass7DY) this.A01;
                r2 = r3.A0y;
                runnable = new AnonymousClass7RK(25, (Object) r3, z);
                break;
            case 2:
                r2 = ((AnonymousClass74G) this.A01).A0W;
                runnable = new C70813Cp(29, (Object) this, z);
                break;
            default:
                return;
        }
        r2.A0J(runnable);
    }

    public void BnT(Exception exc, int i) {
        String str;
        switch (this.A00) {
            case 1:
                AnonymousClass7DY r6 = (AnonymousClass7DY) this.A01;
                r6.A0y.A0J(new AnonymousClass7RP(r6, i, 35));
                C1408973m r5 = r6.A19;
                boolean A03 = r6.A12.A03();
                if (r5.A08) {
                    AnonymousClass19T r1 = r5.A07;
                    if (A03) {
                        str = "in_call";
                    } else if (i == 2) {
                        str = "evicted";
                    } else if (i == 3) {
                        str = "photo";
                    } else if (i != 4) {
                        str = "unknown";
                    } else {
                        str = "video";
                    }
                    r1.markerAnnotate(554251647, "error_message", str);
                }
                r5.A05(4);
                if (exc != null) {
                    AnonymousClass731 r3 = r6.A18;
                    if (AnonymousClass731.A02(r3)) {
                        AnonymousClass64M r2 = new AnonymousClass64M();
                        r2.A09 = C17880vN.A0i();
                        C138896xs.A00(r3, r2);
                        r2.A0E = C17880vN.A0n(i);
                        StringBuilder A0f = C17890vO.A0f(exc);
                        A0f.append(" at ");
                        r2.A0H = AnonymousClass000.A0y(Arrays.toString(exc.getStackTrace()), A0f);
                        r3.A00.CC4(r2);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((AnonymousClass74G) this.A01).A0W.CGP(new C70863Cu(this, i, 37, exc));
                return;
            case 3:
                C110515g2 r12 = (C110515g2) this.A01;
                if (r12.A06 != null) {
                    r12.A09.post(new AnonymousClass7RM((Object) this, i, 34));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void C1j() {
        long j;
        switch (this.A00) {
            case 0:
                C72453Mb.A1D(((ImagineMeOnboardingCameraFragment) this.A01).A02);
                return;
            case 1:
                AnonymousClass7DY r4 = (AnonymousClass7DY) this.A01;
                C1408973m r3 = r4.A19;
                C160978Av r0 = r4.A0K;
                if (r0 != null) {
                    int cameraType = r0.getCameraType();
                    boolean z = !r0.Beu();
                    C160978Av r02 = r4.A0K;
                    if (r02 != null) {
                        Integer valueOf = Integer.valueOf(r02.getCameraApi());
                        C160978Av r03 = r4.A0K;
                        if (r03 != null) {
                            String flashMode = r03.getFlashMode();
                            boolean z2 = r3.A08;
                            if (z2) {
                                C1408973m.A03(r3, "onPreviewReady", 554251647);
                                C1408973m.A01(r3, valueOf, 554251647, cameraType);
                                C1408973m.A00(r3, 554251647, z ? 1 : 0);
                                r3.A07.markerAnnotate(554251647, "flash_mode", flashMode);
                            }
                            if (r4.A0k) {
                                C160978Av r04 = r4.A0K;
                                if (r04 != null) {
                                    Integer valueOf2 = Integer.valueOf(r04.getCameraApi());
                                    C160978Av r05 = r4.A0K;
                                    if (r05 != null) {
                                        int cameraType2 = r05.getCameraType();
                                        C1180762b r1 = new C1180762b();
                                        r1.A02 = Long.valueOf(SystemClock.elapsedRealtime() - r3.A03);
                                        r1.A01 = Integer.valueOf(cameraType2);
                                        r1.A00 = valueOf2;
                                        r3.A06.CC7(r1);
                                        if (z2) {
                                            C1408973m.A01(r3, valueOf2, 554250848, cameraType2);
                                            r3.A07.markerEnd(554250848, 2);
                                        }
                                        AnonymousClass741 r2 = r4.A0M;
                                        if (r2 == null) {
                                            C18070vi.A11("cameraActionsController");
                                            throw null;
                                        }
                                        C160978Av r06 = r4.A0K;
                                        if (r06 != null) {
                                            C123656Vh.A00(r2.A0U, r06.Beu());
                                            C75603ho r22 = r4.A0O;
                                            if (r22 != null) {
                                                C160978Av r07 = r4.A0K;
                                                if (r07 != null) {
                                                    AnonymousClass3MY.A1Y(((C85624Oc) r22.A0I.getValue()).A04, r07.Beu());
                                                }
                                            }
                                            r4.A0k = false;
                                        }
                                    }
                                }
                            } else {
                                C136246tV r7 = r4.A1J;
                                if (r7.A00 == -1) {
                                    r7.A00 = System.currentTimeMillis() - r4.A02;
                                }
                                boolean z3 = r4.A0i;
                                C160978Av r08 = r4.A0K;
                                if (r08 != null) {
                                    Integer valueOf3 = Integer.valueOf(r08.getCameraApi());
                                    C160978Av r09 = r4.A0K;
                                    if (r09 != null) {
                                        int cameraType3 = r09.getCameraType();
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        if (z3) {
                                            j = r3.A01;
                                        } else {
                                            j = r3.A02;
                                        }
                                        r3.A01 = 0;
                                        r3.A02 = 0;
                                        if (j != 0) {
                                            C1182762v r12 = new C1182762v();
                                            r12.A02 = Integer.valueOf(z3 ^ true ? 1 : 0);
                                            r12.A03 = Long.valueOf(elapsedRealtime - j);
                                            r12.A01 = Integer.valueOf(cameraType3);
                                            r12.A00 = valueOf3;
                                            r3.A06.CC7(r12);
                                        }
                                    }
                                }
                            }
                            r4.A0i = false;
                            r4.A0y.A0J(new AnonymousClass7R9((Object) r4, 19));
                            C1408973m.A02(r3, "onPreviewReady", 554251647);
                            r3.A05(2);
                            return;
                        }
                    }
                }
                C18070vi.A11("camera");
                throw null;
            case 2:
                AnonymousClass74G r32 = (AnonymousClass74G) this.A01;
                r32.A0G = false;
                if (r32.A13) {
                    r32.A03.A00 = 1.0f;
                    return;
                } else {
                    r32.A0W.CGP(new AnonymousClass7RB((Object) r32, 5));
                    return;
                }
            case 3:
                C110515g2 r13 = (C110515g2) this.A01;
                if (r13.A06 != null) {
                    AnonymousClass7RB.A00(r13.A09, this, 32);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void C2G(C25124CYx cYx) {
        switch (this.A00) {
            case 1:
                String str = cYx.A02;
                AnonymousClass7DY r3 = (AnonymousClass7DY) this.A01;
                r3.A0y.A0J(new C21452AkJ(46, str, r3));
                return;
            case 3:
                C110515g2 r1 = (C110515g2) this.A01;
                if (r1.A06 != null) {
                    r1.A09.post(new C146517Pk(this, cYx, 22));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void C9w() {
        if (1 - this.A00 == 0) {
            C1408973m r4 = ((AnonymousClass7DY) this.A01).A19;
            r4.A04 = SystemClock.elapsedRealtime() - r4.A05;
            if (r4.A08) {
                C1408973m.A02(r4, "start_video_capture", 554249147);
                C1408973m.A03(r4, "video_record", 554249147);
            }
        }
    }
}
