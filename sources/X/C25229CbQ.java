package X;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.CbQ  reason: case insensitive filesystem */
public class C25229CbQ {
    public int A00 = 0;
    public C26132Csv A01 = new C26132Csv(0, 0);
    public boolean A02;
    public final C25132CZh A03 = new C25132CZh();
    public final ArrayList A04 = AnonymousClass000.A13();
    public final HashMap A05 = C17880vN.A11();
    public final Camera.PreviewCallback A06 = new C26350CyC(this, 0);
    public final Camera.PreviewCallback A07 = new C26350CyC(this, 1);

    public synchronized void A00() {
        synchronized (this) {
            this.A03.A00();
            this.A05.clear();
            this.A04.clear();
        }
    }

    public synchronized void A01(Camera camera) {
        if (!AnonymousClass000.A1Z(BE8.A0k(), Thread.currentThread())) {
            camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
            camera.setPreviewCallback((Camera.PreviewCallback) null);
            this.A02 = false;
        } else {
            throw AnonymousClass8BR.A0w("Cannot disable listeners on the UI thread");
        }
    }

    public synchronized void A02(Camera camera, C26132Csv csv, int i) {
        RuntimeException th;
        int i2;
        synchronized (this) {
            if (AnonymousClass000.A1Z(BE8.A0k(), Thread.currentThread())) {
                th = AnonymousClass8BR.A0w("Cannot enable listeners on the UI thread");
                throw th;
            } else if (!this.A02) {
                this.A00 = i;
                if (csv == null) {
                    csv = new C26132Csv(0, 0);
                }
                this.A01 = csv;
                C28111Yx.A02(camera);
                HashMap hashMap = this.A05;
                if (!hashMap.isEmpty()) {
                    camera.setPreviewCallback((Camera.PreviewCallback) null);
                    C26132Csv csv2 = this.A01;
                    try {
                        Iterator A0j = C17890vO.A0j(hashMap);
                        int i3 = 0;
                        int i4 = 0;
                        while (A0j.hasNext()) {
                            int A0F = BE6.A0F(A0j.next());
                            if (A0F > i4) {
                                i4 = A0F;
                            }
                        }
                        if (i != 842094169) {
                            i2 = ImageFormat.getBitsPerPixel(i) * csv2.A02 * csv2.A01;
                            if (i2 % 8 != 0) {
                                throw AnonymousClass000.A0n("Total bits for Frame should be a multiple of 8");
                            }
                        } else {
                            int A032 = BE7.A03((double) csv2.A02, 16.0d) * 16;
                            int A033 = BE7.A03((double) (A032 / 2), 16.0d) * 16;
                            int i5 = csv2.A01;
                            i2 = (A032 * i5) + (((A033 * i5) / 2) * 2);
                        }
                        int i6 = i2 / 8;
                        ArrayList arrayList = this.A04;
                        if (!arrayList.isEmpty()) {
                            if (((byte[]) arrayList.get(0)).length != i6) {
                                arrayList.clear();
                            }
                            int size = arrayList.size();
                            if (i4 > size) {
                                int i7 = i4 - size;
                                while (i3 < i7) {
                                    arrayList.add(new byte[i6]);
                                    i3++;
                                }
                            } else if (i4 < size) {
                                ArrayList A0z = C17880vN.A0z(i4);
                                while (i3 < i4) {
                                    A0z.add((byte[]) arrayList.get(i3));
                                    i3++;
                                }
                                arrayList.clear();
                                arrayList.addAll(A0z);
                            }
                        } else {
                            while (i3 < i4) {
                                arrayList.add(new byte[i6]);
                                i3++;
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            camera.addCallbackBuffer((byte[]) it.next());
                        }
                        camera.setPreviewCallbackWithBuffer(this.A07);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    camera.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                    camera.setPreviewCallback(this.A06);
                }
                this.A02 = true;
            }
        }
    }
}
