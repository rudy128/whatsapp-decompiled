package com.whatsapp.companiondevice.sync;

import X.AnonymousClass000;
import X.AnonymousClass0DT;
import X.AnonymousClass10E;
import X.AnonymousClass10I;
import X.AnonymousClass112;
import X.AnonymousClass11P;
import X.AnonymousClass1TI;
import X.AnonymousClass348;
import X.C000100c;
import X.C108945cZ;
import X.C114465qs;
import X.C133516ot;
import X.C1409673t;
import X.C162178Jk;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import X.C194159rG;
import X.C20001A2q;
import X.C217217d;
import X.C26551So;
import X.C34821l8;
import X.C34841lA;
import X.C36181nT;
import X.C56152gz;
import X.C57132ia;
import X.C63822tk;
import X.C64062u9;
import X.EEC;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public final class HistorySyncCompanionWorker extends C20001A2q {
    public final C114465qs A00 = new Object();
    public final C34841lA A01;
    public final AnonymousClass10I A02;
    public final C63822tk A03;
    public final C133516ot A04;
    public final C34821l8 A05;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r10v1, types: [X.2ee, java.lang.Object] */
    public static final void A00(HistorySyncCompanionWorker historySyncCompanionWorker) {
        byte[] bArr;
        InflaterInputStream inflaterInputStream;
        HistorySyncCompanionWorker historySyncCompanionWorker2 = historySyncCompanionWorker;
        C56152gz A022 = historySyncCompanionWorker2.A05.A02();
        if (A022 == null) {
            historySyncCompanionWorker2.A04.A00();
            historySyncCompanionWorker2.A00.A03(new C162178Jk());
            return;
        }
        C57132ia r9 = new C57132ia(historySyncCompanionWorker2, A022);
        C63822tk r11 = historySyncCompanionWorker2.A03;
        byte[] bArr2 = A022.A0A;
        if (bArr2 != null) {
            int i = A022.A01;
            long j = A022.A03;
            int i2 = A022.A00;
            Inflater inflater = new Inflater(false);
            try {
                inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr2), inflater);
                ByteArrayOutputStream A15 = C108945cZ.A15();
                C64062u9.A00(inflaterInputStream, A15);
                bArr = A15.toByteArray();
                inflaterInputStream.close();
                inflater.end();
            } catch (IOException e) {
                try {
                    C17900vP.A0X(e, "HistorySyncUtils/inflateData fails e=", AnonymousClass000.A10());
                    inflater.end();
                    Log.e("HistorySyncUtils/inflateData error no result");
                    bArr = new byte[0];
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
            C18070vi.A0X(bArr);
            ? obj = new Object();
            obj.A02 = j;
            obj.A01 = AnonymousClass11P.A01(r11.A08);
            obj.A03 = (long) bArr.length;
            C63822tk.A02(r9, obj, r11, (File) null, bArr, i, i2);
            return;
        }
        String str = A022.A06;
        if (str == null || str.length() == 0) {
            C36181nT r6 = r11.A0O;
            C26551So r8 = C26551So.A0O;
            String str2 = A022.A08;
            if (str2 != null) {
                String str3 = A022.A07;
                if (str3 != null) {
                    String str4 = A022.A04;
                    if (str4 != null) {
                        byte[] bArr3 = A022.A0B;
                        if (bArr3 != null) {
                            byte[] bArr4 = bArr3;
                            r6.A0A(new AnonymousClass348(r9, r11, A022, 1), r8, (AnonymousClass1TI) null, (AnonymousClass1TI) null, (String) null, str2, str3, (String) null, str4, (String) null, bArr4, 4, 21, 11, 0, A022.A02);
                            return;
                        }
                        throw AnonymousClass000.A0n("Required value was null.");
                    }
                    throw AnonymousClass000.A0n("Required value was null.");
                }
                throw AnonymousClass000.A0n("Required value was null.");
            }
            throw AnonymousClass000.A0n("Required value was null.");
        }
        C63822tk.A03(r9, r11, A022, C108945cZ.A17(str));
        return;
        throw th;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.EEC, X.Bly, java.lang.Object] */
    public EEC A07() {
        Context context = this.A00;
        String A0F = C18070vi.A0F(context, 2131893067);
        C1409673t A032 = C217217d.A03(context);
        A032.A0M = "other_notifications@1";
        A032.A0D(A0F);
        A032.A0F(A0F);
        A032.A03 = -1;
        C17880vN.A1G(A032);
        ? obj = new Object();
        obj.A03(new C194159rG(242478061, A032.A05(), AnonymousClass112.A06() ? 1 : 0));
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.5qs] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HistorySyncCompanionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C18070vi.A0j(context, workerParameters);
        C000100c A0H = C17890vO.A0H(context);
        this.A02 = A0H.CRy();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A01 = (C34841lA) r1.A9O.get();
        this.A03 = (C63822tk) r1.Ao8.A00.A2Y.get();
        this.A05 = (C34821l8) r1.A4z.get();
        this.A04 = (C133516ot) r1.A6Z.get();
    }
}
