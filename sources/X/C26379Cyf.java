package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.camera.litecamera.LiteCameraView;
import java.util.List;

/* renamed from: X.Cyf  reason: case insensitive filesystem */
public class C26379Cyf implements Handler.Callback {
    public static volatile Handler A00;

    public static void A01(Bitmap bitmap, E7R e7r, C24851CMu cMu) {
        if (!A0A()) {
            Handler A002 = A00();
            Object[] A1a = BE6.A1a();
            C17900vP.A0O(e7r, bitmap, cMu, (Object) null, A1a);
            C108955ca.A1F(A002, A1a, 5);
        } else if (e7r instanceof DAV) {
            DAV dav = (DAV) e7r;
            LiteCameraView liteCameraView = dav.A01;
            if (C18020vd.A05(C18040vf.A02, liteCameraView.A07, 12769)) {
                liteCameraView.A09.CGN(new C21434Ak1(dav, bitmap, dav.A00, 35));
            } else {
                LiteCameraView.A02(bitmap, dav.A00);
            }
        } else if (e7r instanceof DAW) {
            ((DAW) e7r).A00(bitmap, cMu);
        } else {
            throw AnonymousClass8BR.A0w("Callback instance must be either PhotoBitmapCallback or PhotoBitmapInfoCallback");
        }
    }

    public static void A02(E7R e7r, C24851CMu cMu, byte[] bArr) {
        if (!A0A()) {
            Handler A002 = A00();
            Object[] A1a = BE6.A1a();
            C17900vP.A0O(e7r, bArr, cMu, (Object) null, A1a);
            C108955ca.A1F(A002, A1a, 6);
        } else if (e7r instanceof C28654ECo) {
            ((C28654ECo) e7r).C0X(bArr);
        } else {
            throw AnonymousClass8BR.A0w("Callback instance must be either PhotoJpegCallback or PhotoJpegInfoCallback");
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Handler$Callback, java.lang.Object] */
    public static synchronized Handler A00() {
        Handler handler;
        synchronized (C26379Cyf.class) {
            if (A00 == null) {
                A00 = new Handler(Looper.getMainLooper(), new Object());
            }
            handler = A00;
        }
        return handler;
    }

    public static Object[] A0B(Message message) {
        Object obj = message.obj;
        C26159CtX.A01(obj);
        return (Object[]) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        X.C108955ca.A1F(r3, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01a4, code lost:
        X.C108955ca.A1F(r3, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a7, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r7 = 3
            r6 = 2
            r4 = 1
            r9 = 0
            switch(r0) {
                case 1: goto L_0x0183;
                case 2: goto L_0x017b;
                case 3: goto L_0x016b;
                case 4: goto L_0x0153;
                case 5: goto L_0x013f;
                case 6: goto L_0x012b;
                case 7: goto L_0x0111;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00da;
                case 10: goto L_0x00b3;
                case 11: goto L_0x00a3;
                case 12: goto L_0x0093;
                case 13: goto L_0x004e;
                case 14: goto L_0x0074;
                case 15: goto L_0x0038;
                case 16: goto L_0x0021;
                case 17: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            return r9
        L_0x000a:
            java.lang.Object[] r0 = A0B(r11)
            r1 = r0[r9]
            boolean r0 = A0A()
            if (r0 != 0) goto L_0x0009
            android.os.Handler r3 = A00()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r9] = r1
            r0 = 17
            goto L_0x0070
        L_0x0021:
            java.lang.Object[] r0 = A0B(r11)
            r1 = r0[r9]
            boolean r0 = A0A()
            if (r0 != 0) goto L_0x0009
            android.os.Handler r3 = A00()
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r9] = r1
            r0 = 16
            goto L_0x0070
        L_0x0038:
            java.lang.Object[] r0 = A0B(r11)
            r2 = 0
            r1 = r0[r4]
            boolean r0 = A0A()
            if (r0 == 0) goto L_0x018b
            if (r1 == 0) goto L_0x0009
            java.lang.String r0 = "onPostViewReady"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x004e:
            java.lang.Object[] r0 = A0B(r11)
            r1 = r0[r9]
            r0 = r0[r4]
            double r7 = X.AnonymousClass8BR.A00(r0)
            boolean r0 = A0A()
            if (r0 != 0) goto L_0x0009
            android.os.Handler r3 = A00()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r9] = r1
            java.lang.Double r0 = java.lang.Double.valueOf(r7)
            r2[r4] = r0
            r0 = 13
        L_0x0070:
            X.C108955ca.A1F(r3, r2, r0)
            return r9
        L_0x0074:
            java.lang.Object[] r0 = A0B(r11)
            r5 = 0
            r1 = r0[r4]
            r2 = r0[r6]
            boolean r0 = A0A()
            if (r0 == 0) goto L_0x0198
            if (r2 != 0) goto L_0x008c
            java.lang.String r0 = "onFileReady"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x008c:
            java.lang.String r0 = "onFileError"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0093:
            java.lang.Object[] r0 = A0B(r11)
            r1 = r0[r9]
            X.CY3 r1 = (X.CY3) r1
            r0 = r0[r4]
            java.lang.Exception r0 = (java.lang.Exception) r0
            A06(r1, r0)
            return r9
        L_0x00a3:
            java.lang.Object[] r0 = A0B(r11)
            r1 = r0[r9]
            X.CY3 r1 = (X.CY3) r1
            r0 = r0[r4]
            X.CZ9 r0 = (X.CZ9) r0
            A04(r0, r1)
            return r9
        L_0x00b3:
            java.lang.Object[] r0 = A0B(r11)
            r5 = r0[r9]
            X.CY3 r5 = (X.CY3) r5
            r3 = r0[r4]
            X.CZ9 r3 = (X.CZ9) r3
            boolean r0 = A0A()
            if (r0 == 0) goto L_0x00c9
            r5.A00()
            return r9
        L_0x00c9:
            android.os.Handler r2 = A00()
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            X.AnonymousClass001.A1Q(r5, r3, r1)
            r0 = 10
            X.C108955ca.A1F(r2, r1, r0)
            return r9
        L_0x00da:
            java.lang.Object[] r0 = A0B(r11)
            r1 = r0[r9]
            X.E7R r1 = (X.E7R) r1
            r0 = r0[r4]
            java.lang.Exception r0 = (java.lang.Exception) r0
            A03(r1, r0)
            return r9
        L_0x00ea:
            java.lang.Object[] r0 = A0B(r11)
            r5 = r0[r9]
            X.E7R r5 = (X.E7R) r5
            r3 = r0[r4]
            java.lang.Exception r3 = (java.lang.Exception) r3
            boolean r0 = A0A()
            if (r0 == 0) goto L_0x0100
            r5.Bnt()
            return r9
        L_0x0100:
            android.os.Handler r2 = A00()
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()
            X.AnonymousClass001.A1Q(r5, r3, r1)
            r0 = 8
            X.C108955ca.A1F(r2, r1, r0)
            return r9
        L_0x0111:
            java.lang.Object r2 = r11.obj
            X.ECo r2 = (X.C28654ECo) r2
            boolean r0 = A0A()
            if (r0 == 0) goto L_0x0122
            X.C26159CtX.A01(r2)
            r2.Bny()
            return r9
        L_0x0122:
            android.os.Handler r1 = A00()
            r0 = 7
            X.C108955ca.A1F(r1, r2, r0)
            return r9
        L_0x012b:
            java.lang.Object[] r0 = A0B(r11)
            r2 = r0[r9]
            X.E7R r2 = (X.E7R) r2
            r1 = r0[r4]
            byte[] r1 = (byte[]) r1
            r0 = r0[r6]
            X.CMu r0 = (X.C24851CMu) r0
            A02(r2, r0, r1)
            return r9
        L_0x013f:
            java.lang.Object[] r0 = A0B(r11)
            r2 = r0[r9]
            X.E7R r2 = (X.E7R) r2
            r1 = r0[r4]
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r0 = r0[r6]
            X.CMu r0 = (X.C24851CMu) r0
            A01(r1, r2, r0)
            return r9
        L_0x0153:
            java.lang.Object[] r0 = A0B(r11)
            r3 = r0[r9]
            java.util.List r3 = (java.util.List) r3
            r2 = r0[r4]
            java.lang.String r2 = (java.lang.String) r2
            r1 = r0[r6]
            java.lang.String r1 = (java.lang.String) r1
            r0 = r0[r7]
            X.EAf r0 = (X.C28611EAf) r0
            A05(r0, r2, r1, r3)
            return r9
        L_0x016b:
            java.lang.Object[] r0 = A0B(r11)
            r1 = r0[r9]
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0 = r0[r4]
            java.util.List r0 = (java.util.List) r0
            A07(r1, r0)
            return r9
        L_0x017b:
            java.lang.Object r0 = r11.obj
            java.util.List r0 = (java.util.List) r0
            A09(r0)
            return r9
        L_0x0183:
            java.lang.Object r0 = r11.obj
            java.util.List r0 = (java.util.List) r0
            A08(r0)
            return r9
        L_0x018b:
            android.os.Handler r3 = A00()
            java.lang.Object[] r1 = X.C108945cZ.A1a(r2, r1, r7, r4)
            r1[r6] = r2
            r0 = 15
            goto L_0x01a4
        L_0x0198:
            android.os.Handler r3 = A00()
            java.lang.Object[] r1 = X.C108945cZ.A1a(r5, r1, r7, r4)
            r1[r6] = r2
            r0 = 14
        L_0x01a4:
            X.C108955ca.A1F(r3, r1, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26379Cyf.handleMessage(android.os.Message):boolean");
    }

    public static void A03(E7R e7r, Exception exc) {
        if (A0A()) {
            e7r.Bnv(exc);
            return;
        }
        Handler A002 = A00();
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass001.A1Q(e7r, exc, A1b);
        C108955ca.A1F(A002, A1b, 9);
    }

    public static void A04(CZ9 cz9, CY3 cy3) {
        if (A0A()) {
            C28598E9p e9p = cy3.A00.A06;
            if (e9p != null) {
                e9p.C9w();
                return;
            }
            return;
        }
        Handler A002 = A00();
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass001.A1Q(cy3, cz9, A1b);
        C108955ca.A1F(A002, A1b, 11);
    }

    public static void A05(C28611EAf eAf, String str, String str2, List list) {
        if (!A0A()) {
            Handler A002 = A00();
            Object[] objArr = new Object[4];
            AnonymousClass8BS.A1B(list, str, objArr);
            AnonymousClass001.A1R(str2, eAf, objArr);
            C108955ca.A1F(A002, objArr, 4);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            ((E93) list.get(i)).Bna(str, str2);
        }
        if (eAf != null) {
            eAf.BnU(str, str2);
        }
    }

    public static void A06(CY3 cy3, Exception exc) {
        if (A0A()) {
            cy3.A01(exc);
            return;
        }
        Handler A002 = A00();
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass001.A1Q(cy3, exc, A1b);
        C108955ca.A1F(A002, A1b, 12);
    }

    public static void A07(Exception exc, List list) {
        if (!A0A()) {
            Handler A002 = A00();
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass8BS.A1B(exc, list, A1b);
            C108955ca.A1F(A002, A1b, 3);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            ((E93) list.get(i)).BnS(exc);
        }
    }

    public static void A08(List list) {
        if (A0A()) {
            C26159CtX.A01(list);
            for (int i = 0; i < list.size(); i++) {
                ((E93) list.get(i)).BnZ();
            }
            return;
        }
        C108955ca.A1F(A00(), list, 1);
    }

    public static void A09(List list) {
        if (A0A()) {
            C26159CtX.A01(list);
            for (int i = 0; i < list.size(); i++) {
                ((E93) list.get(i)).Bni();
            }
            return;
        }
        C108955ca.A1F(A00(), list, 2);
    }

    public static boolean A0A() {
        return AnonymousClass000.A1Z(BE8.A0k(), Thread.currentThread());
    }
}
