package X;

import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager;
import com.whatsapp.camera.overlays.ShutterOverlay;
import com.whatsapp.util.Log;

/* renamed from: X.7DW  reason: invalid class name */
public final class AnonymousClass7DW implements E8C {
    public final /* synthetic */ AnonymousClass7DY A00;

    public AnonymousClass7DW(AnonymousClass7DY r1) {
        this.A00 = r1;
    }

    public void C0c(byte[] bArr, boolean z) {
        int i;
        AnonymousClass77X r4;
        String str;
        AnonymousClass7DY r3 = this.A00;
        if (r3.A0H != null) {
            C133796pV r0 = r3.A0S;
            if (r0 == null) {
                str = "overlaysController";
            } else {
                ShutterOverlay shutterOverlay = r0.A02;
                shutterOverlay.A02 = true;
                shutterOverlay.invalidate();
                shutterOverlay.postDelayed(new AnonymousClass7R9((Object) shutterOverlay, 32), 50);
                Log.i("CameraUi/onPictureTaken");
                byte[] bArr2 = bArr;
                boolean A1X = AnonymousClass000.A1X(bArr2);
                if (AnonymousClass7DY.A0g(r3)) {
                    AnonymousClass00H r5 = r3.A1R;
                    AnonymousClass3MY.A1P((AnonymousClass1BI) null, (C25771Po) r5.get(), 37, true);
                    C75603ho r02 = r3.A0O;
                    if (r02 != null && r02.A0m()) {
                        AnonymousClass3MY.A1P((AnonymousClass1BI) null, (C25771Po) r5.get(), 34, true);
                    }
                }
                C1408973m r11 = r3.A19;
                C160978Av r03 = r3.A0K;
                if (r03 != null) {
                    Integer valueOf = Integer.valueOf(r03.getCameraApi());
                    C160978Av r04 = r3.A0K;
                    if (r04 != null) {
                        int cameraType = r04.getCameraType();
                        boolean z2 = !r04.Beu();
                        C160978Av r05 = r3.A0K;
                        if (r05 != null) {
                            String flashMode = r05.getFlashMode();
                            String valueOf2 = String.valueOf(r05.getPictureResolution());
                            if (!flashMode.equals("on")) {
                                i = 2;
                                if (!flashMode.equals("auto")) {
                                    i = 0;
                                }
                            } else {
                                i = 1;
                            }
                            long elapsedRealtime = SystemClock.elapsedRealtime() - r11.A00;
                            AnonymousClass63V r1 = new AnonymousClass63V();
                            r1.A02 = Integer.valueOf(cameraType);
                            r1.A00 = valueOf;
                            r1.A01 = Integer.valueOf(z2 ? 1 : 0);
                            r1.A03 = Integer.valueOf(i);
                            r1.A05 = valueOf2;
                            r1.A04 = Long.valueOf(elapsedRealtime);
                            r11.A06.CC7(r1);
                            if (r11.A08) {
                                C1408973m.A01(r11, valueOf, 554240366, cameraType);
                                C1408973m.A00(r11, 554240366, z2);
                                AnonymousClass19T r12 = r11.A07;
                                r12.markerAnnotate(554240366, "flash_mode", flashMode);
                                r12.markerAnnotate(554240366, "requested_photo_resolution", valueOf2);
                                short s = 2;
                                if (A1X) {
                                    s = 87;
                                }
                                r12.markerEnd(554240366, s);
                            }
                            AnonymousClass731 r13 = r3.A18;
                            C160978Av r06 = r3.A0K;
                            if (r06 != null) {
                                boolean Beu = r06.Beu();
                                C160978Av r07 = r3.A0K;
                                if (r07 != null) {
                                    int zoomLevel = r07.getZoomLevel();
                                    C160978Av r08 = r3.A0K;
                                    if (r08 != null) {
                                        AnonymousClass731.A01(r13, r08.getFlashMode(), zoomLevel, 1, 0, Beu, r3.A0j);
                                        AnonymousClass741 r14 = r3.A0M;
                                        if (r14 == null) {
                                            str = "cameraActionsController";
                                        } else {
                                            Window window = AnonymousClass7DY.A04(r3).getWindow();
                                            C18070vi.A0X(window);
                                            WindowManager.LayoutParams attributes = window.getAttributes();
                                            r14.A0G.setVisibility(4);
                                            attributes.screenBrightness = -1.0f;
                                            window.setAttributes(attributes);
                                            AnonymousClass7DY.A0K(r3);
                                            if (A1X) {
                                                r3.A0y.A08(2131887876, 1);
                                                if (r3.A0f) {
                                                    AnonymousClass7DY.A0X(r3, false);
                                                }
                                                AnonymousClass7DY.A0O(r3);
                                                r3.A1Y.BnQ();
                                                return;
                                            }
                                            if (r3.A0H != null) {
                                                if (C24191Jf.A01(r3.A1B, r3.A1I) < 2013) {
                                                    AnonymousClass7DY.A03(r3, 2131434795).setVisibility(0);
                                                }
                                            }
                                            C1425379v r112 = new C1425379v(r3);
                                            if (bArr != null) {
                                                C75603ho r09 = r3.A0O;
                                                if (r09 != null) {
                                                    r4 = r09.A0l();
                                                } else {
                                                    r4 = new AnonymousClass77X(false, false, false, false, false);
                                                }
                                                r3.A1N.CGM(new C121896Lx(r112, AnonymousClass7DY.A04(r3), new C125726ba(r3), r3.A1B, r4, bArr2, z), new Void[0]);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C18070vi.A11("camera");
                throw null;
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public void onShutter() {
        AnonymousClass7DY r3 = this.A00;
        C1408973m r1 = r3.A19;
        if (r1.A08) {
            r1.A07.markerPoint(554240366, "on_shutter");
        }
        r3.A0y.A0J(new AnonymousClass7R9((Object) r3, 20));
    }
}
